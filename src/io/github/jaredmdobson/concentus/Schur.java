/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Inlines;

class Schur {
    Schur() {
    }

    static int silk_schur(short[] rc_Q15, int[] c2, int order) {
        int k2;
        int[][] C2 = Arrays.InitTwoDimensionalArrayInt(17, 2);
        Inlines.OpusAssert(order == 6 || order == 8 || order == 10 || order == 12 || order == 14 || order == 16);
        int lz2 = Inlines.silk_CLZ32(c2[0]);
        if (lz2 < 2) {
            for (k2 = 0; k2 < order + 1; ++k2) {
                int n2 = Inlines.silk_RSHIFT(c2[k2], 1);
                C2[k2][1] = n2;
                C2[k2][0] = n2;
            }
        } else if (lz2 > 2) {
            lz2 -= 2;
            for (k2 = 0; k2 < order + 1; ++k2) {
                int n3 = Inlines.silk_LSHIFT(c2[k2], lz2);
                C2[k2][1] = n3;
                C2[k2][0] = n3;
            }
        } else {
            for (k2 = 0; k2 < order + 1; ++k2) {
                int n4 = c2[k2];
                C2[k2][1] = n4;
                C2[k2][0] = n4;
            }
        }
        for (k2 = 0; k2 < order; ++k2) {
            if (Inlines.silk_abs_int32(C2[k2 + 1][0]) >= C2[0][1]) {
                rc_Q15[k2] = C2[k2 + 1][0] > 0 ? -32440 : 32440;
                ++k2;
                break;
            }
            int rc_tmp_Q15 = 0 - Inlines.silk_DIV32_16(C2[k2 + 1][0], Inlines.silk_max_32(Inlines.silk_RSHIFT(C2[0][1], 15), 1));
            rc_tmp_Q15 = Inlines.silk_SAT16(rc_tmp_Q15);
            rc_Q15[k2] = (short)rc_tmp_Q15;
            for (int n5 = 0; n5 < order - k2; ++n5) {
                int Ctmp1 = C2[n5 + k2 + 1][0];
                int Ctmp2 = C2[n5][1];
                C2[n5 + k2 + 1][0] = Inlines.silk_SMLAWB(Ctmp1, Inlines.silk_LSHIFT(Ctmp2, 1), rc_tmp_Q15);
                C2[n5][1] = Inlines.silk_SMLAWB(Ctmp2, Inlines.silk_LSHIFT(Ctmp1, 1), rc_tmp_Q15);
            }
        }
        while (k2 < order) {
            rc_Q15[k2] = 0;
            ++k2;
        }
        return Inlines.silk_max_32(1, C2[0][1]);
    }

    static int silk_schur64(int[] rc_Q16, int[] c2, int order) {
        int k2;
        int[][] C2 = Arrays.InitTwoDimensionalArrayInt(17, 2);
        Inlines.OpusAssert(order == 6 || order == 8 || order == 10 || order == 12 || order == 14 || order == 16);
        if (c2[0] <= 0) {
            Arrays.MemSet(rc_Q16, 0, order);
            return 0;
        }
        for (k2 = 0; k2 < order + 1; ++k2) {
            int n2 = c2[k2];
            C2[k2][1] = n2;
            C2[k2][0] = n2;
        }
        for (k2 = 0; k2 < order; ++k2) {
            if (Inlines.silk_abs_int32(C2[k2 + 1][0]) >= C2[0][1]) {
                rc_Q16[k2] = C2[k2 + 1][0] > 0 ? -64881 : 64881;
                ++k2;
                break;
            }
            int rc_tmp_Q31 = Inlines.silk_DIV32_varQ(-C2[k2 + 1][0], C2[0][1], 31);
            rc_Q16[k2] = Inlines.silk_RSHIFT_ROUND(rc_tmp_Q31, 15);
            for (int n3 = 0; n3 < order - k2; ++n3) {
                int Ctmp1_Q30 = C2[n3 + k2 + 1][0];
                int Ctmp2_Q30 = C2[n3][1];
                C2[n3 + k2 + 1][0] = Ctmp1_Q30 + Inlines.silk_SMMUL(Inlines.silk_LSHIFT(Ctmp2_Q30, 1), rc_tmp_Q31);
                C2[n3][1] = Ctmp2_Q30 + Inlines.silk_SMMUL(Inlines.silk_LSHIFT(Ctmp1_Q30, 1), rc_tmp_Q31);
            }
        }
        while (k2 < order) {
            rc_Q16[k2] = 0;
            ++k2;
        }
        return Inlines.silk_max_32(1, C2[0][1]);
    }
}

