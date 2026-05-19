/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.SilkTables;

class CodeSigns {
    CodeSigns() {
    }

    private static int silk_enc_map(int a2) {
        return Inlines.silk_RSHIFT(a2, 15) + 1;
    }

    private static int silk_dec_map(int a2) {
        return Inlines.silk_LSHIFT(a2, 1) - 1;
    }

    static void silk_encode_signs(EntropyCoder psRangeEnc, byte[] pulses, int length, int signalType, int quantOffsetType, int[] sum_pulses) {
        int i2;
        short[] icdf = new short[2];
        short[] sign_icdf = SilkTables.silk_sign_iCDF;
        icdf[1] = 0;
        int q_ptr = 0;
        int icdf_ptr = i2 = Inlines.silk_SMULBB(7, Inlines.silk_ADD_LSHIFT(quantOffsetType, signalType, 1));
        length = Inlines.silk_RSHIFT(length + 8, 4);
        for (i2 = 0; i2 < length; ++i2) {
            int p2 = sum_pulses[i2];
            if (p2 > 0) {
                icdf[0] = sign_icdf[icdf_ptr + Inlines.silk_min(p2 & 0x1F, 6)];
                for (int j2 = q_ptr; j2 < q_ptr + 16; ++j2) {
                    if (pulses[j2] == 0) continue;
                    psRangeEnc.enc_icdf(CodeSigns.silk_enc_map(pulses[j2]), icdf, 8);
                }
            }
            q_ptr += 16;
        }
    }

    static void silk_decode_signs(EntropyCoder psRangeDec, short[] pulses, int length, int signalType, int quantOffsetType, int[] sum_pulses) {
        int i2;
        short[] icdf = new short[2];
        short[] icdf_table = SilkTables.silk_sign_iCDF;
        icdf[1] = 0;
        int q_ptr = 0;
        int icdf_ptr = i2 = Inlines.silk_SMULBB(7, Inlines.silk_ADD_LSHIFT(quantOffsetType, signalType, 1));
        length = Inlines.silk_RSHIFT(length + 8, 4);
        for (i2 = 0; i2 < length; ++i2) {
            int p2 = sum_pulses[i2];
            if (p2 > 0) {
                icdf[0] = icdf_table[icdf_ptr + Inlines.silk_min(p2 & 0x1F, 6)];
                for (int j2 = 0; j2 < 16; ++j2) {
                    if (pulses[q_ptr + j2] <= 0) continue;
                    int n2 = q_ptr + j2;
                    pulses[n2] = (short)(pulses[n2] * (short)CodeSigns.silk_dec_map(psRangeDec.dec_icdf(icdf, 8)));
                }
            }
            q_ptr += 16;
        }
    }
}

