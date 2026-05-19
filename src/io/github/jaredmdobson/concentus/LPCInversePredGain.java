/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Inlines;

class LPCInversePredGain {
    private static final int QA = 24;
    private static final int A_LIMIT = 0xFFEF9E;

    LPCInversePredGain() {
    }

    static int LPC_inverse_pred_gain_QA(int[][] A_QA, int order) {
        int rc_mult1_Q30;
        int rc_Q31;
        int[] Anew_QA = A_QA[order & 1];
        int invGain_Q30 = 0x40000000;
        for (int k2 = order - 1; k2 > 0; --k2) {
            if (Anew_QA[k2] > 0xFFEF9E || Anew_QA[k2] < -16773022) {
                return 0;
            }
            rc_Q31 = 0 - Inlines.silk_LSHIFT(Anew_QA[k2], 7);
            rc_mult1_Q30 = 0x40000000 - Inlines.silk_SMMUL(rc_Q31, rc_Q31);
            Inlines.OpusAssert(rc_mult1_Q30 > 32768);
            Inlines.OpusAssert(rc_mult1_Q30 <= 0x40000000);
            int mult2Q = 32 - Inlines.silk_CLZ32(Inlines.silk_abs(rc_mult1_Q30));
            int rc_mult2 = Inlines.silk_INVERSE32_varQ(rc_mult1_Q30, mult2Q + 30);
            invGain_Q30 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(invGain_Q30, rc_mult1_Q30), 2);
            Inlines.OpusAssert(invGain_Q30 >= 0);
            Inlines.OpusAssert(invGain_Q30 <= 0x40000000);
            int[] Aold_QA = Anew_QA;
            Anew_QA = A_QA[k2 & 1];
            for (int n2 = 0; n2 < k2; ++n2) {
                int tmp_QA = Aold_QA[n2] - Inlines.MUL32_FRAC_Q(Aold_QA[k2 - n2 - 1], rc_Q31, 31);
                Anew_QA[n2] = Inlines.MUL32_FRAC_Q(tmp_QA, rc_mult2, mult2Q);
            }
        }
        if (Anew_QA[0] > 0xFFEF9E || Anew_QA[0] < -16773022) {
            return 0;
        }
        rc_Q31 = 0 - Inlines.silk_LSHIFT(Anew_QA[0], 7);
        rc_mult1_Q30 = 0x40000000 - Inlines.silk_SMMUL(rc_Q31, rc_Q31);
        Inlines.OpusAssert((invGain_Q30 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(invGain_Q30, rc_mult1_Q30), 2)) >= 0);
        Inlines.OpusAssert(invGain_Q30 <= 0x40000000);
        return invGain_Q30;
    }

    static int silk_LPC_inverse_pred_gain(short[] A_Q12, int order) {
        int[][] Atmp_QA = Arrays.InitTwoDimensionalArrayInt(2, 16);
        int DC_resp = 0;
        int[] Anew_QA = Atmp_QA[order & 1];
        for (int k2 = 0; k2 < order; ++k2) {
            DC_resp += A_Q12[k2];
            Anew_QA[k2] = Inlines.silk_LSHIFT32(A_Q12[k2], 12);
        }
        if (DC_resp >= 4096) {
            return 0;
        }
        return LPCInversePredGain.LPC_inverse_pred_gain_QA(Atmp_QA, order);
    }

    static int silk_LPC_inverse_pred_gain_Q24(int[] A_Q24, int order) {
        int[][] Atmp_QA = Arrays.InitTwoDimensionalArrayInt(2, 16);
        int[] Anew_QA = Atmp_QA[order & 1];
        for (int k2 = 0; k2 < order; ++k2) {
            Anew_QA[k2] = Inlines.silk_RSHIFT32(A_Q24[k2], 0);
        }
        return LPCInversePredGain.LPC_inverse_pred_gain_QA(Atmp_QA, order);
    }
}

