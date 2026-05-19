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

class DecodePulses {
    DecodePulses() {
    }

    static void silk_decode_pulses(EntropyCoder psRangeDec, short[] pulses, int signalType, int quantOffsetType, int frame_length) {
        int i2;
        int[] sum_pulses = new int[20];
        int[] nLshifts = new int[20];
        int RateLevelIndex = psRangeDec.dec_icdf(SilkTables.silk_rate_levels_iCDF[signalType >> 1], 8);
        Inlines.OpusAssert(true);
        int iter = Inlines.silk_RSHIFT(frame_length, 4);
        if (iter * 16 < frame_length) {
            Inlines.OpusAssert(frame_length == 120);
            ++iter;
        }
        for (i2 = 0; i2 < iter; ++i2) {
            nLshifts[i2] = 0;
            sum_pulses[i2] = psRangeDec.dec_icdf(SilkTables.silk_pulses_per_block_iCDF[RateLevelIndex], 8);
            while (sum_pulses[i2] == 17) {
                int n2 = i2;
                nLshifts[n2] = nLshifts[n2] + 1;
                sum_pulses[i2] = psRangeDec.dec_icdf(SilkTables.silk_pulses_per_block_iCDF[9], nLshifts[i2] == 10 ? 1 : 0, 8);
            }
        }
        for (i2 = 0; i2 < iter; ++i2) {
            if (sum_pulses[i2] > 0) {
                ShellCoder.silk_shell_decoder(pulses, Inlines.silk_SMULBB(i2, 16), psRangeDec, sum_pulses[i2]);
                continue;
            }
            Arrays.MemSetWithOffset(pulses, (short)0, Inlines.silk_SMULBB(i2, 16), 16);
        }
        for (i2 = 0; i2 < iter; ++i2) {
            if (nLshifts[i2] <= 0) continue;
            int nLS = nLshifts[i2];
            int pulses_ptr = Inlines.silk_SMULBB(i2, 16);
            for (int k2 = 0; k2 < 16; ++k2) {
                int abs_q = pulses[pulses_ptr + k2];
                for (int j2 = 0; j2 < nLS; ++j2) {
                    abs_q = Inlines.silk_LSHIFT(abs_q, 1);
                    abs_q += psRangeDec.dec_icdf(SilkTables.silk_lsb_iCDF, 8);
                }
                pulses[pulses_ptr + k2] = (short)abs_q;
            }
            int n3 = i2;
            sum_pulses[n3] = sum_pulses[n3] | nLS << 5;
        }
        CodeSigns.silk_decode_signs(psRangeDec, pulses, frame_length, signalType, quantOffsetType, sum_pulses);
    }
}

