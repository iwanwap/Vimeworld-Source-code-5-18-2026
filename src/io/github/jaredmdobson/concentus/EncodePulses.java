/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.CodeSigns;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.ShellCoder;
import io.github.jaredmdobson.concentus.SilkTables;

class EncodePulses {
    EncodePulses() {
    }

    static int combine_and_check(int[] pulses_comb, int pulses_comb_ptr, int[] pulses_in, int pulses_in_ptr, int max_pulses, int len) {
        for (int k2 = 0; k2 < len; ++k2) {
            int k2p = 2 * k2 + pulses_in_ptr;
            int sum = pulses_in[k2p] + pulses_in[k2p + 1];
            if (sum > max_pulses) {
                return 1;
            }
            pulses_comb[pulses_comb_ptr + k2] = sum;
        }
        return 0;
    }

    static int combine_and_check(int[] pulses_comb, int[] pulses_in, int max_pulses, int len) {
        for (int k2 = 0; k2 < len; ++k2) {
            int sum = pulses_in[2 * k2] + pulses_in[2 * k2 + 1];
            if (sum > max_pulses) {
                return 1;
            }
            pulses_comb[k2] = sum;
        }
        return 0;
    }

    static void silk_encode_pulses(EntropyCoder psRangeEnc, int signalType, int quantOffsetType, byte[] pulses, int frame_length) {
        int k2;
        int i2;
        int RateLevelIndex = 0;
        int[] pulses_comb = new int[8];
        Arrays.MemSet(pulses_comb, 0, 8);
        Inlines.OpusAssert(true);
        int iter = Inlines.silk_RSHIFT(frame_length, 4);
        if (iter * 16 < frame_length) {
            Inlines.OpusAssert(frame_length == 120);
            ++iter;
            Arrays.MemSetWithOffset(pulses, (byte)0, frame_length, 16);
        }
        int[] abs_pulses = new int[iter * 16];
        Inlines.OpusAssert(true);
        for (i2 = 0; i2 < iter * 16; i2 += 4) {
            abs_pulses[i2 + 0] = Inlines.silk_abs(pulses[i2 + 0]);
            abs_pulses[i2 + 1] = Inlines.silk_abs(pulses[i2 + 1]);
            abs_pulses[i2 + 2] = Inlines.silk_abs(pulses[i2 + 2]);
            abs_pulses[i2 + 3] = Inlines.silk_abs(pulses[i2 + 3]);
        }
        int[] sum_pulses = new int[iter];
        int[] nRshifts = new int[iter];
        int abs_pulses_ptr = 0;
        for (i2 = 0; i2 < iter; ++i2) {
            nRshifts[i2] = 0;
            block2: while (true) {
                int scale_down = EncodePulses.combine_and_check(pulses_comb, 0, abs_pulses, abs_pulses_ptr, SilkTables.silk_max_pulses_table[0], 8);
                scale_down += EncodePulses.combine_and_check(pulses_comb, pulses_comb, SilkTables.silk_max_pulses_table[1], 4);
                scale_down += EncodePulses.combine_and_check(pulses_comb, pulses_comb, SilkTables.silk_max_pulses_table[2], 2);
                if ((scale_down += EncodePulses.combine_and_check(sum_pulses, i2, pulses_comb, 0, SilkTables.silk_max_pulses_table[3], 1)) == 0) break;
                int n2 = i2;
                nRshifts[n2] = nRshifts[n2] + 1;
                k2 = abs_pulses_ptr;
                while (true) {
                    if (k2 >= abs_pulses_ptr + 16) continue block2;
                    abs_pulses[k2] = Inlines.silk_RSHIFT(abs_pulses[k2], 1);
                    ++k2;
                }
                break;
            }
            abs_pulses_ptr += 16;
        }
        int minSumBits_Q5 = Integer.MAX_VALUE;
        for (k2 = 0; k2 < 9; ++k2) {
            short[] nBits_ptr = SilkTables.silk_pulses_per_block_BITS_Q5[k2];
            int sumBits_Q5 = SilkTables.silk_rate_levels_BITS_Q5[signalType >> 1][k2];
            for (i2 = 0; i2 < iter; ++i2) {
                if (nRshifts[i2] > 0) {
                    sumBits_Q5 += nBits_ptr[17];
                    continue;
                }
                sumBits_Q5 += nBits_ptr[sum_pulses[i2]];
            }
            if (sumBits_Q5 >= minSumBits_Q5) continue;
            minSumBits_Q5 = sumBits_Q5;
            RateLevelIndex = k2;
        }
        psRangeEnc.enc_icdf(RateLevelIndex, SilkTables.silk_rate_levels_iCDF[signalType >> 1], 8);
        for (i2 = 0; i2 < iter; ++i2) {
            if (nRshifts[i2] == 0) {
                psRangeEnc.enc_icdf(sum_pulses[i2], SilkTables.silk_pulses_per_block_iCDF[RateLevelIndex], 8);
                continue;
            }
            psRangeEnc.enc_icdf(17, SilkTables.silk_pulses_per_block_iCDF[RateLevelIndex], 8);
            for (k2 = 0; k2 < nRshifts[i2] - 1; ++k2) {
                psRangeEnc.enc_icdf(17, SilkTables.silk_pulses_per_block_iCDF[9], 8);
            }
            psRangeEnc.enc_icdf(sum_pulses[i2], SilkTables.silk_pulses_per_block_iCDF[9], 8);
        }
        for (i2 = 0; i2 < iter; ++i2) {
            if (sum_pulses[i2] <= 0) continue;
            ShellCoder.silk_shell_encoder(psRangeEnc, abs_pulses, i2 * 16);
        }
        for (i2 = 0; i2 < iter; ++i2) {
            if (nRshifts[i2] <= 0) continue;
            int pulses_ptr = i2 * 16;
            int nLS = nRshifts[i2] - 1;
            for (k2 = 0; k2 < 16; ++k2) {
                int bit;
                byte abs_q = (byte)Inlines.silk_abs(pulses[pulses_ptr + k2]);
                for (int j2 = nLS; j2 > 0; --j2) {
                    bit = Inlines.silk_RSHIFT(abs_q, j2) & 1;
                    psRangeEnc.enc_icdf(bit, SilkTables.silk_lsb_iCDF, 8);
                }
                bit = abs_q & 1;
                psRangeEnc.enc_icdf(bit, SilkTables.silk_lsb_iCDF, 8);
            }
        }
        CodeSigns.silk_encode_signs(psRangeEnc, pulses, frame_length, signalType, quantOffsetType, sum_pulses);
    }
}

