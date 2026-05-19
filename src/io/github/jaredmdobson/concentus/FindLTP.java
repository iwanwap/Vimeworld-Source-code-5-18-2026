/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CorrelateMatrix;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.LinearAlgebra;
import io.github.jaredmdobson.concentus.RegularizeCorrelations;
import io.github.jaredmdobson.concentus.ResidualEnergy;
import io.github.jaredmdobson.concentus.SumSqrShift;

class FindLTP {
    private static final int LTP_CORRS_HEAD_ROOM = 2;

    FindLTP() {
    }

    static void silk_find_LTP(short[] b_Q14, int[] WLTP, BoxedValueInt LTPredCodGain_Q7, short[] r_lpc, int[] lag, int[] Wght_Q15, int subfr_length, int nb_subfr, int mem_offset, int[] corr_rshifts) {
        int i2;
        int temp32;
        int extra_shifts;
        int k2;
        int[] b_Q16 = new int[5];
        int[] delta_b_Q14 = new int[5];
        int[] d_Q14 = new int[4];
        int[] nrg = new int[4];
        int[] w2 = new int[4];
        int[] Rr2 = new int[5];
        int[] rr2 = new int[4];
        int b_Q14_ptr = 0;
        int WLTP_ptr = 0;
        int r_ptr = mem_offset;
        for (k2 = 0; k2 < nb_subfr; ++k2) {
            int lag_ptr = r_ptr - (lag[k2] + 2);
            BoxedValueInt boxed_rr = new BoxedValueInt(0);
            BoxedValueInt boxed_rr_shift = new BoxedValueInt(0);
            SumSqrShift.silk_sum_sqr_shift(boxed_rr, boxed_rr_shift, r_lpc, r_ptr, subfr_length);
            rr2[k2] = boxed_rr.Val;
            int rr_shifts = boxed_rr_shift.Val;
            int LZs = Inlines.silk_CLZ32(rr2[k2]);
            if (LZs < 2) {
                rr2[k2] = Inlines.silk_RSHIFT_ROUND(rr2[k2], 2 - LZs);
                rr_shifts += 2 - LZs;
            }
            corr_rshifts[k2] = rr_shifts;
            BoxedValueInt boxed_shifts = new BoxedValueInt(corr_rshifts[k2]);
            CorrelateMatrix.silk_corrMatrix(r_lpc, lag_ptr, subfr_length, 5, 2, WLTP, WLTP_ptr, boxed_shifts);
            corr_rshifts[k2] = boxed_shifts.Val;
            CorrelateMatrix.silk_corrVector(r_lpc, lag_ptr, r_lpc, r_ptr, subfr_length, 5, Rr2, corr_rshifts[k2]);
            if (corr_rshifts[k2] > rr_shifts) {
                rr2[k2] = Inlines.silk_RSHIFT(rr2[k2], corr_rshifts[k2] - rr_shifts);
            }
            Inlines.OpusAssert(rr2[k2] >= 0);
            int regu = 1;
            regu = Inlines.silk_SMLAWB(regu, rr2[k2], 1092);
            regu = Inlines.silk_SMLAWB(regu, Inlines.MatrixGet(WLTP, WLTP_ptr, 0, 0, 5), 1092);
            regu = Inlines.silk_SMLAWB(regu, Inlines.MatrixGet(WLTP, WLTP_ptr, 4, 4, 5), 1092);
            RegularizeCorrelations.silk_regularize_correlations(WLTP, WLTP_ptr, rr2, k2, regu, 5);
            LinearAlgebra.silk_solve_LDL(WLTP, WLTP_ptr, 5, Rr2, b_Q16);
            FindLTP.silk_fit_LTP(b_Q16, b_Q14, b_Q14_ptr);
            nrg[k2] = ResidualEnergy.silk_residual_energy16_covar(b_Q14, b_Q14_ptr, WLTP, WLTP_ptr, Rr2, rr2[k2], 5, 14);
            extra_shifts = Inlines.silk_min_int(corr_rshifts[k2], 2);
            int denom32 = Inlines.silk_LSHIFT_SAT32(Inlines.silk_SMULWB(nrg[k2], Wght_Q15[k2]), 1 + extra_shifts) + Inlines.silk_RSHIFT(Inlines.silk_SMULWB(subfr_length, 655), corr_rshifts[k2] - extra_shifts);
            denom32 = Inlines.silk_max(denom32, 1);
            Inlines.OpusAssert((long)Wght_Q15[k2] << 16 < Integer.MAX_VALUE);
            temp32 = Inlines.silk_DIV32(Inlines.silk_LSHIFT(Wght_Q15[k2], 16), denom32);
            temp32 = Inlines.silk_RSHIFT(temp32, 31 + corr_rshifts[k2] - extra_shifts - 26);
            int WLTP_max = 0;
            for (i2 = WLTP_ptr; i2 < WLTP_ptr + 25; ++i2) {
                WLTP_max = Inlines.silk_max(WLTP[i2], WLTP_max);
            }
            int lshift = Inlines.silk_CLZ32(WLTP_max) - 1 - 3;
            Inlines.OpusAssert(8 + lshift >= 0);
            if (8 + lshift < 31) {
                temp32 = Inlines.silk_min_32(temp32, Inlines.silk_LSHIFT(1, 8 + lshift));
            }
            Inlines.silk_scale_vector32_Q26_lshift_18(WLTP, WLTP_ptr, temp32, 25);
            w2[k2] = Inlines.MatrixGet(WLTP, WLTP_ptr, 2, 2, 5);
            Inlines.OpusAssert(w2[k2] >= 0);
            r_ptr += subfr_length;
            b_Q14_ptr += 5;
            WLTP_ptr += 25;
        }
        int maxRshifts = 0;
        for (k2 = 0; k2 < nb_subfr; ++k2) {
            maxRshifts = Inlines.silk_max_int(corr_rshifts[k2], maxRshifts);
        }
        if (LTPredCodGain_Q7 != null) {
            int LPC_LTP_res_nrg = 0;
            int LPC_res_nrg = 0;
            Inlines.OpusAssert(true);
            for (k2 = 0; k2 < nb_subfr; ++k2) {
                LPC_res_nrg = Inlines.silk_ADD32(LPC_res_nrg, Inlines.silk_RSHIFT(Inlines.silk_ADD32(Inlines.silk_SMULWB(rr2[k2], Wght_Q15[k2]), 1), 1 + (maxRshifts - corr_rshifts[k2])));
                LPC_LTP_res_nrg = Inlines.silk_ADD32(LPC_LTP_res_nrg, Inlines.silk_RSHIFT(Inlines.silk_ADD32(Inlines.silk_SMULWB(nrg[k2], Wght_Q15[k2]), 1), 1 + (maxRshifts - corr_rshifts[k2])));
            }
            LPC_LTP_res_nrg = Inlines.silk_max(LPC_LTP_res_nrg, 1);
            int div_Q16 = Inlines.silk_DIV32_varQ(LPC_res_nrg, LPC_LTP_res_nrg, 16);
            LTPredCodGain_Q7.Val = Inlines.silk_SMULBB(3, Inlines.silk_lin2log(div_Q16) - 2048);
            Inlines.OpusAssert(LTPredCodGain_Q7.Val == Inlines.silk_SAT16(Inlines.silk_MUL(3, Inlines.silk_lin2log(div_Q16) - 2048)));
        }
        b_Q14_ptr = 0;
        for (k2 = 0; k2 < nb_subfr; ++k2) {
            d_Q14[k2] = 0;
            for (i2 = b_Q14_ptr; i2 < b_Q14_ptr + 5; ++i2) {
                int n2 = k2;
                d_Q14[n2] = d_Q14[n2] + b_Q14[i2];
            }
            b_Q14_ptr += 5;
        }
        int max_abs_d_Q14 = 0;
        int max_w_bits = 0;
        for (k2 = 0; k2 < nb_subfr; ++k2) {
            max_abs_d_Q14 = Inlines.silk_max_32(max_abs_d_Q14, Inlines.silk_abs(d_Q14[k2]));
            max_w_bits = Inlines.silk_max_32(max_w_bits, 32 - Inlines.silk_CLZ32(w2[k2]) + corr_rshifts[k2] - maxRshifts);
        }
        Inlines.OpusAssert(max_abs_d_Q14 <= 163840);
        extra_shifts = max_w_bits + 32 - Inlines.silk_CLZ32(max_abs_d_Q14) - 14;
        extra_shifts -= 29 + maxRshifts;
        extra_shifts = Inlines.silk_max_int(extra_shifts, 0);
        int maxRshifts_wxtra = maxRshifts + extra_shifts;
        temp32 = Inlines.silk_RSHIFT(262, maxRshifts + extra_shifts) + 1;
        int wd2 = 0;
        for (k2 = 0; k2 < nb_subfr; ++k2) {
            temp32 = Inlines.silk_ADD32(temp32, Inlines.silk_RSHIFT(w2[k2], maxRshifts_wxtra - corr_rshifts[k2]));
            wd2 = Inlines.silk_ADD32(wd2, Inlines.silk_LSHIFT(Inlines.silk_SMULWW(Inlines.silk_RSHIFT(w2[k2], maxRshifts_wxtra - corr_rshifts[k2]), d_Q14[k2]), 2));
        }
        int m_Q12 = Inlines.silk_DIV32_varQ(wd2, temp32, 12);
        b_Q14_ptr = 0;
        for (k2 = 0; k2 < nb_subfr; ++k2) {
            temp32 = 2 - corr_rshifts[k2] > 0 ? Inlines.silk_RSHIFT(w2[k2], 2 - corr_rshifts[k2]) : Inlines.silk_LSHIFT_SAT32(w2[k2], corr_rshifts[k2] - 2);
            int g_Q26 = Inlines.silk_MUL(Inlines.silk_DIV32(0x666667, Inlines.silk_RSHIFT(0x666667, 10) + temp32), Inlines.silk_LSHIFT_SAT32(Inlines.silk_SUB_SAT32(m_Q12, Inlines.silk_RSHIFT(d_Q14[k2], 2)), 4));
            temp32 = 0;
            for (i2 = 0; i2 < 5; ++i2) {
                delta_b_Q14[i2] = Inlines.silk_max_16(b_Q14[b_Q14_ptr + i2], (short)1638);
                temp32 += delta_b_Q14[i2];
            }
            temp32 = Inlines.silk_DIV32(g_Q26, temp32);
            for (i2 = 0; i2 < 5; ++i2) {
                b_Q14[b_Q14_ptr + i2] = (short)Inlines.silk_LIMIT_32(b_Q14[b_Q14_ptr + i2] + Inlines.silk_SMULWB(Inlines.silk_LSHIFT_SAT32(temp32, 4), delta_b_Q14[i2]), -16000, 28000);
            }
            b_Q14_ptr += 5;
        }
    }

    static void silk_fit_LTP(int[] LTP_coefs_Q16, short[] LTP_coefs_Q14, int LTP_coefs_Q14_ptr) {
        for (int i2 = 0; i2 < 5; ++i2) {
            LTP_coefs_Q14[LTP_coefs_Q14_ptr + i2] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(LTP_coefs_Q16[i2], 2));
        }
    }
}

