/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltPitchXCorr;
import io.github.jaredmdobson.concentus.Inlines;

class BurgModified {
    private static final int MAX_FRAME_SIZE = 384;
    private static final int QA = 25;
    private static final int N_BITS_HEAD_ROOM = 2;
    private static final int MIN_RSHIFTS = -16;
    private static final int MAX_RSHIFTS = 7;

    BurgModified() {
    }

    static void silk_burg_modified(BoxedValueInt res_nrg, BoxedValueInt res_nrg_Q, int[] A_Q16, short[] x2, int x_ptr, int minInvGain_Q30, int subfr_length, int nb_subfr, int D2) {
        int nrg;
        int Atmp1;
        int k2;
        int tmp1;
        int n2;
        int x_offset;
        int s2;
        int[] C_first_row = new int[16];
        int[] C_last_row = new int[16];
        int[] Af_QA = new int[16];
        int[] CAf = new int[17];
        int[] CAb = new int[17];
        int[] xcorr = new int[16];
        Inlines.OpusAssert(subfr_length * nb_subfr <= 384);
        long C0_64 = Inlines.silk_inner_prod16_aligned_64(x2, x_ptr, x2, x_ptr, subfr_length * nb_subfr);
        int lz2 = Inlines.silk_CLZ64(C0_64);
        int rshifts = 35 - lz2;
        if (rshifts > 7) {
            rshifts = 7;
        }
        if (rshifts < -16) {
            rshifts = -16;
        }
        int C0 = rshifts > 0 ? (int)Inlines.silk_RSHIFT64(C0_64, rshifts) : Inlines.silk_LSHIFT32((int)C0_64, -rshifts);
        CAb[0] = CAf[0] = C0 + Inlines.silk_SMMUL(42950, C0) + 1;
        Arrays.MemSet(C_first_row, 0, 16);
        if (rshifts > 0) {
            for (s2 = 0; s2 < nb_subfr; ++s2) {
                x_offset = x_ptr + s2 * subfr_length;
                for (n2 = 1; n2 < D2 + 1; ++n2) {
                    int n3 = n2 - 1;
                    C_first_row[n3] = C_first_row[n3] + (int)Inlines.silk_RSHIFT64(Inlines.silk_inner_prod16_aligned_64(x2, x_offset, x2, x_offset + n2, subfr_length - n2), rshifts);
                }
            }
        } else {
            for (s2 = 0; s2 < nb_subfr; ++s2) {
                x_offset = x_ptr + s2 * subfr_length;
                CeltPitchXCorr.pitch_xcorr(x2, x_offset, x2, x_offset + 1, xcorr, subfr_length - D2, D2);
                for (n2 = 1; n2 < D2 + 1; ++n2) {
                    int d2 = 0;
                    for (int i2 = n2 + subfr_length - D2; i2 < subfr_length; ++i2) {
                        d2 = Inlines.MAC16_16(d2, x2[x_offset + i2], x2[x_offset + i2 - n2]);
                    }
                    int n4 = n2 - 1;
                    xcorr[n4] = xcorr[n4] + d2;
                }
                for (n2 = 1; n2 < D2 + 1; ++n2) {
                    int n5 = n2 - 1;
                    C_first_row[n5] = C_first_row[n5] + Inlines.silk_LSHIFT32(xcorr[n2 - 1], -rshifts);
                }
            }
        }
        System.arraycopy(C_first_row, 0, C_last_row, 0, 16);
        CAb[0] = CAf[0] = C0 + Inlines.silk_SMMUL(42950, C0) + 1;
        int invGain_Q30 = 0x40000000;
        boolean reached_max_gain = false;
        for (n2 = 0; n2 < D2; ++n2) {
            int Atmp_QA;
            int tmp2;
            int x22;
            int x1;
            if (rshifts > -2) {
                for (s2 = 0; s2 < nb_subfr; ++s2) {
                    x_offset = x_ptr + s2 * subfr_length;
                    x1 = -Inlines.silk_LSHIFT32(x2[x_offset + n2], 16 - rshifts);
                    x22 = -Inlines.silk_LSHIFT32(x2[x_offset + subfr_length - n2 - 1], 16 - rshifts);
                    tmp1 = Inlines.silk_LSHIFT32(x2[x_offset + n2], 9);
                    tmp2 = Inlines.silk_LSHIFT32(x2[x_offset + subfr_length - n2 - 1], 9);
                    for (k2 = 0; k2 < n2; ++k2) {
                        C_first_row[k2] = Inlines.silk_SMLAWB(C_first_row[k2], x1, x2[x_offset + n2 - k2 - 1]);
                        C_last_row[k2] = Inlines.silk_SMLAWB(C_last_row[k2], x22, x2[x_offset + subfr_length - n2 + k2]);
                        Atmp_QA = Af_QA[k2];
                        tmp1 = Inlines.silk_SMLAWB(tmp1, Atmp_QA, x2[x_offset + n2 - k2 - 1]);
                        tmp2 = Inlines.silk_SMLAWB(tmp2, Atmp_QA, x2[x_offset + subfr_length - n2 + k2]);
                    }
                    tmp1 = Inlines.silk_LSHIFT32(-tmp1, 7 - rshifts);
                    tmp2 = Inlines.silk_LSHIFT32(-tmp2, 7 - rshifts);
                    for (k2 = 0; k2 <= n2; ++k2) {
                        CAf[k2] = Inlines.silk_SMLAWB(CAf[k2], tmp1, x2[x_offset + n2 - k2]);
                        CAb[k2] = Inlines.silk_SMLAWB(CAb[k2], tmp2, x2[x_offset + subfr_length - n2 + k2 - 1]);
                    }
                }
            } else {
                for (s2 = 0; s2 < nb_subfr; ++s2) {
                    x_offset = x_ptr + s2 * subfr_length;
                    x1 = -Inlines.silk_LSHIFT32(x2[x_offset + n2], -rshifts);
                    x22 = -Inlines.silk_LSHIFT32(x2[x_offset + subfr_length - n2 - 1], -rshifts);
                    tmp1 = Inlines.silk_LSHIFT32(x2[x_offset + n2], 17);
                    tmp2 = Inlines.silk_LSHIFT32(x2[x_offset + subfr_length - n2 - 1], 17);
                    for (k2 = 0; k2 < n2; ++k2) {
                        C_first_row[k2] = Inlines.silk_MLA(C_first_row[k2], x1, x2[x_offset + n2 - k2 - 1]);
                        C_last_row[k2] = Inlines.silk_MLA(C_last_row[k2], x22, x2[x_offset + subfr_length - n2 + k2]);
                        Atmp1 = Inlines.silk_RSHIFT_ROUND(Af_QA[k2], 8);
                        tmp1 = Inlines.silk_MLA(tmp1, x2[x_offset + n2 - k2 - 1], Atmp1);
                        tmp2 = Inlines.silk_MLA(tmp2, x2[x_offset + subfr_length - n2 + k2], Atmp1);
                    }
                    tmp1 = -tmp1;
                    tmp2 = -tmp2;
                    for (k2 = 0; k2 <= n2; ++k2) {
                        CAf[k2] = Inlines.silk_SMLAWW(CAf[k2], tmp1, Inlines.silk_LSHIFT32(x2[x_offset + n2 - k2], -rshifts - 1));
                        CAb[k2] = Inlines.silk_SMLAWW(CAb[k2], tmp2, Inlines.silk_LSHIFT32(x2[x_offset + subfr_length - n2 + k2 - 1], -rshifts - 1));
                    }
                }
            }
            tmp1 = C_first_row[n2];
            tmp2 = C_last_row[n2];
            int num = 0;
            nrg = Inlines.silk_ADD32(CAb[0], CAf[0]);
            for (k2 = 0; k2 < n2; ++k2) {
                Atmp_QA = Af_QA[k2];
                lz2 = Inlines.silk_CLZ32(Inlines.silk_abs(Atmp_QA)) - 1;
                lz2 = Inlines.silk_min(7, lz2);
                Atmp1 = Inlines.silk_LSHIFT32(Atmp_QA, lz2);
                tmp1 = Inlines.silk_ADD_LSHIFT32(tmp1, Inlines.silk_SMMUL(C_last_row[n2 - k2 - 1], Atmp1), 7 - lz2);
                tmp2 = Inlines.silk_ADD_LSHIFT32(tmp2, Inlines.silk_SMMUL(C_first_row[n2 - k2 - 1], Atmp1), 7 - lz2);
                num = Inlines.silk_ADD_LSHIFT32(num, Inlines.silk_SMMUL(CAb[n2 - k2], Atmp1), 7 - lz2);
                nrg = Inlines.silk_ADD_LSHIFT32(nrg, Inlines.silk_SMMUL(Inlines.silk_ADD32(CAb[k2 + 1], CAf[k2 + 1]), Atmp1), 7 - lz2);
            }
            CAf[n2 + 1] = tmp1;
            CAb[n2 + 1] = tmp2;
            num = Inlines.silk_ADD32(num, tmp2);
            int rc_Q31 = Inlines.silk_abs(num = Inlines.silk_LSHIFT32(-num, 1)) < nrg ? Inlines.silk_DIV32_varQ(num, nrg, 31) : (num > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            tmp1 = 0x40000000 - Inlines.silk_SMMUL(rc_Q31, rc_Q31);
            if ((tmp1 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(invGain_Q30, tmp1), 2)) <= minInvGain_Q30) {
                tmp2 = 0x40000000 - Inlines.silk_DIV32_varQ(minInvGain_Q30, invGain_Q30, 30);
                rc_Q31 = Inlines.silk_SQRT_APPROX(tmp2);
                rc_Q31 = Inlines.silk_RSHIFT32(rc_Q31 + Inlines.silk_DIV32(tmp2, rc_Q31), 1);
                rc_Q31 = Inlines.silk_LSHIFT32(rc_Q31, 16);
                if (num < 0) {
                    rc_Q31 = -rc_Q31;
                }
                invGain_Q30 = minInvGain_Q30;
                reached_max_gain = true;
            } else {
                invGain_Q30 = tmp1;
            }
            for (k2 = 0; k2 < n2 + 1 >> 1; ++k2) {
                tmp1 = Af_QA[k2];
                tmp2 = Af_QA[n2 - k2 - 1];
                Af_QA[k2] = Inlines.silk_ADD_LSHIFT32(tmp1, Inlines.silk_SMMUL(tmp2, rc_Q31), 1);
                Af_QA[n2 - k2 - 1] = Inlines.silk_ADD_LSHIFT32(tmp2, Inlines.silk_SMMUL(tmp1, rc_Q31), 1);
            }
            Af_QA[n2] = Inlines.silk_RSHIFT32(rc_Q31, 6);
            if (reached_max_gain) {
                for (k2 = n2 + 1; k2 < D2; ++k2) {
                    Af_QA[k2] = 0;
                }
                break;
            }
            for (k2 = 0; k2 <= n2 + 1; ++k2) {
                tmp1 = CAf[k2];
                tmp2 = CAb[n2 - k2 + 1];
                CAf[k2] = Inlines.silk_ADD_LSHIFT32(tmp1, Inlines.silk_SMMUL(tmp2, rc_Q31), 1);
                CAb[n2 - k2 + 1] = Inlines.silk_ADD_LSHIFT32(tmp2, Inlines.silk_SMMUL(tmp1, rc_Q31), 1);
            }
        }
        if (reached_max_gain) {
            for (k2 = 0; k2 < D2; ++k2) {
                A_Q16[k2] = -Inlines.silk_RSHIFT_ROUND(Af_QA[k2], 9);
            }
            if (rshifts > 0) {
                for (s2 = 0; s2 < nb_subfr; ++s2) {
                    x_offset = x_ptr + s2 * subfr_length;
                    C0 -= (int)Inlines.silk_RSHIFT64(Inlines.silk_inner_prod16_aligned_64(x2, x_offset, x2, x_offset, D2), rshifts);
                }
            } else {
                for (s2 = 0; s2 < nb_subfr; ++s2) {
                    x_offset = x_ptr + s2 * subfr_length;
                    C0 -= Inlines.silk_LSHIFT32(Inlines.silk_inner_prod_self(x2, x_offset, D2), -rshifts);
                }
            }
            res_nrg.Val = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(invGain_Q30, C0), 2);
            res_nrg_Q.Val = 0 - rshifts;
        } else {
            nrg = CAf[0];
            tmp1 = 65536;
            for (k2 = 0; k2 < D2; ++k2) {
                Atmp1 = Inlines.silk_RSHIFT_ROUND(Af_QA[k2], 9);
                nrg = Inlines.silk_SMLAWW(nrg, CAf[k2 + 1], Atmp1);
                tmp1 = Inlines.silk_SMLAWW(tmp1, Atmp1, Atmp1);
                A_Q16[k2] = -Atmp1;
            }
            res_nrg.Val = Inlines.silk_SMLAWW(nrg, Inlines.silk_SMMUL(42950, C0), -tmp1);
            res_nrg_Q.Val = -rshifts;
        }
    }
}

