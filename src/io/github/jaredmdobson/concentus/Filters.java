/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;
import io.github.jaredmdobson.concentus.SilkChannelEncoder;
import io.github.jaredmdobson.concentus.SilkEncoderControl;
import io.github.jaredmdobson.concentus.SilkPrefilterState;
import io.github.jaredmdobson.concentus.SilkTables;

class Filters {
    private static final short A_fb1_20 = 10788;
    private static final short A_fb1_21 = -24290;
    private static final int QA = 24;
    private static final int A_LIMIT = 0xFFEF9E;

    Filters() {
    }

    static void silk_warped_LPC_analysis_filter(int[] state, int[] res_Q2, short[] coef_Q13, int coef_Q13_ptr, short[] input, int input_ptr, short lambda_Q16, int length, int order) {
        Inlines.OpusAssert((order & 1) == 0);
        for (int n2 = 0; n2 < length; ++n2) {
            int tmp2 = Inlines.silk_SMLAWB(state[0], state[1], lambda_Q16);
            state[0] = Inlines.silk_LSHIFT(input[input_ptr + n2], 14);
            int tmp1 = Inlines.silk_SMLAWB(state[1], state[2] - tmp2, lambda_Q16);
            state[1] = tmp2;
            int acc_Q11 = Inlines.silk_RSHIFT(order, 1);
            acc_Q11 = Inlines.silk_SMLAWB(acc_Q11, tmp2, coef_Q13[coef_Q13_ptr]);
            for (int i2 = 2; i2 < order; i2 += 2) {
                tmp2 = Inlines.silk_SMLAWB(state[i2], state[i2 + 1] - tmp1, lambda_Q16);
                state[i2] = tmp1;
                acc_Q11 = Inlines.silk_SMLAWB(acc_Q11, tmp1, coef_Q13[coef_Q13_ptr + i2 - 1]);
                tmp1 = Inlines.silk_SMLAWB(state[i2 + 1], state[i2 + 2] - tmp2, lambda_Q16);
                state[i2 + 1] = tmp2;
                acc_Q11 = Inlines.silk_SMLAWB(acc_Q11, tmp2, coef_Q13[coef_Q13_ptr + i2]);
            }
            state[order] = tmp1;
            acc_Q11 = Inlines.silk_SMLAWB(acc_Q11, tmp1, coef_Q13[coef_Q13_ptr + order - 1]);
            res_Q2[n2] = Inlines.silk_LSHIFT(input[input_ptr + n2], 2) - Inlines.silk_RSHIFT_ROUND(acc_Q11, 9);
        }
    }

    static void silk_prefilter(SilkChannelEncoder psEnc, SilkEncoderControl psEncCtrl, int[] xw_Q3, short[] x2, int x_ptr) {
        SilkPrefilterState P2 = psEnc.sPrefilt;
        short[] B_Q10 = new short[2];
        int px2 = x_ptr;
        int pxw_Q3 = 0;
        int lag = P2.lagPrev;
        int[] x_filt_Q12 = new int[psEnc.subfr_length];
        int[] st_res_Q2 = new int[psEnc.subfr_length];
        for (int k2 = 0; k2 < psEnc.nb_subfr; ++k2) {
            int HarmShapeGain_Q12;
            if (psEnc.indices.signalType == 2) {
                lag = psEncCtrl.pitchL[k2];
            }
            Inlines.OpusAssert((HarmShapeGain_Q12 = Inlines.silk_SMULWB(psEncCtrl.HarmShapeGain_Q14[k2], 16384 - psEncCtrl.HarmBoost_Q14[k2])) >= 0);
            int HarmShapeFIRPacked_Q12 = Inlines.silk_RSHIFT(HarmShapeGain_Q12, 2);
            HarmShapeFIRPacked_Q12 |= Inlines.silk_LSHIFT(Inlines.silk_RSHIFT(HarmShapeGain_Q12, 1), 16);
            int Tilt_Q14 = psEncCtrl.Tilt_Q14[k2];
            int LF_shp_Q14 = psEncCtrl.LF_shp_Q14[k2];
            int AR1_shp_Q13 = k2 * 16;
            Filters.silk_warped_LPC_analysis_filter(P2.sAR_shp, st_res_Q2, psEncCtrl.AR1_Q13, AR1_shp_Q13, x2, px2, (short)psEnc.warping_Q16, psEnc.subfr_length, psEnc.shapingLPCOrder);
            B_Q10[0] = (short)Inlines.silk_RSHIFT_ROUND(psEncCtrl.GainsPre_Q14[k2], 4);
            int tmp_32 = Inlines.silk_SMLABB(0x333333, psEncCtrl.HarmBoost_Q14[k2], HarmShapeGain_Q12);
            tmp_32 = Inlines.silk_SMLABB(tmp_32, psEncCtrl.coding_quality_Q14, 410);
            tmp_32 = Inlines.silk_SMULWB(tmp_32, -psEncCtrl.GainsPre_Q14[k2]);
            tmp_32 = Inlines.silk_RSHIFT_ROUND(tmp_32, 14);
            B_Q10[1] = (short)Inlines.silk_SAT16(tmp_32);
            x_filt_Q12[0] = Inlines.silk_MLA(Inlines.silk_MUL(st_res_Q2[0], B_Q10[0]), P2.sHarmHP_Q2, B_Q10[1]);
            for (int j2 = 1; j2 < psEnc.subfr_length; ++j2) {
                x_filt_Q12[j2] = Inlines.silk_MLA(Inlines.silk_MUL(st_res_Q2[j2], B_Q10[0]), st_res_Q2[j2 - 1], B_Q10[1]);
            }
            P2.sHarmHP_Q2 = st_res_Q2[psEnc.subfr_length - 1];
            Filters.silk_prefilt(P2, x_filt_Q12, xw_Q3, pxw_Q3, HarmShapeFIRPacked_Q12, Tilt_Q14, LF_shp_Q14, lag, psEnc.subfr_length);
            px2 += psEnc.subfr_length;
            pxw_Q3 += psEnc.subfr_length;
        }
        P2.lagPrev = psEncCtrl.pitchL[psEnc.nb_subfr - 1];
    }

    static void silk_prefilt(SilkPrefilterState P2, int[] st_res_Q12, int[] xw_Q3, int xw_Q3_ptr, int HarmShapeFIRPacked_Q12, int Tilt_Q14, int LF_shp_Q14, int lag, int length) {
        short[] LTP_shp_buf = P2.sLTP_shp;
        int LTP_shp_buf_idx = P2.sLTP_shp_buf_idx;
        int sLF_AR_shp_Q12 = P2.sLF_AR_shp_Q12;
        int sLF_MA_shp_Q12 = P2.sLF_MA_shp_Q12;
        for (int i2 = 0; i2 < length; ++i2) {
            int n_LTP_Q12;
            if (lag > 0) {
                Inlines.OpusAssert(true);
                int idx = lag + LTP_shp_buf_idx;
                n_LTP_Q12 = Inlines.silk_SMULBB(LTP_shp_buf[idx - 1 - 1 & 0x1FF], HarmShapeFIRPacked_Q12);
                n_LTP_Q12 = Inlines.silk_SMLABT(n_LTP_Q12, LTP_shp_buf[idx - 1 & 0x1FF], HarmShapeFIRPacked_Q12);
                n_LTP_Q12 = Inlines.silk_SMLABB(n_LTP_Q12, LTP_shp_buf[idx - 1 + 1 & 0x1FF], HarmShapeFIRPacked_Q12);
            } else {
                n_LTP_Q12 = 0;
            }
            int n_Tilt_Q10 = Inlines.silk_SMULWB(sLF_AR_shp_Q12, Tilt_Q14);
            int n_LF_Q10 = Inlines.silk_SMLAWB(Inlines.silk_SMULWT(sLF_AR_shp_Q12, LF_shp_Q14), sLF_MA_shp_Q12, LF_shp_Q14);
            sLF_AR_shp_Q12 = Inlines.silk_SUB32(st_res_Q12[i2], Inlines.silk_LSHIFT(n_Tilt_Q10, 2));
            sLF_MA_shp_Q12 = Inlines.silk_SUB32(sLF_AR_shp_Q12, Inlines.silk_LSHIFT(n_LF_Q10, 2));
            LTP_shp_buf_idx = LTP_shp_buf_idx - 1 & 0x1FF;
            LTP_shp_buf[LTP_shp_buf_idx] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(sLF_MA_shp_Q12, 12));
            xw_Q3[xw_Q3_ptr + i2] = Inlines.silk_RSHIFT_ROUND(Inlines.silk_SUB32(sLF_MA_shp_Q12, n_LTP_Q12), 9);
        }
        P2.sLF_AR_shp_Q12 = sLF_AR_shp_Q12;
        P2.sLF_MA_shp_Q12 = sLF_MA_shp_Q12;
        P2.sLTP_shp_buf_idx = LTP_shp_buf_idx;
    }

    static void silk_biquad_alt(short[] input, int input_ptr, int[] B_Q28, int[] A_Q28, int[] S2, short[] output, int output_ptr, int len, int stride) {
        int A0_L_Q28 = -A_Q28[0] & 0x3FFF;
        int A0_U_Q28 = Inlines.silk_RSHIFT(-A_Q28[0], 14);
        int A1_L_Q28 = -A_Q28[1] & 0x3FFF;
        int A1_U_Q28 = Inlines.silk_RSHIFT(-A_Q28[1], 14);
        for (int k2 = 0; k2 < len; ++k2) {
            short inval = input[input_ptr + k2 * stride];
            int out32_Q14 = Inlines.silk_LSHIFT(Inlines.silk_SMLAWB(S2[0], B_Q28[0], inval), 2);
            S2[0] = S2[1] + Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(out32_Q14, A0_L_Q28), 14);
            S2[0] = Inlines.silk_SMLAWB(S2[0], out32_Q14, A0_U_Q28);
            S2[0] = Inlines.silk_SMLAWB(S2[0], B_Q28[1], inval);
            S2[1] = Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(out32_Q14, A1_L_Q28), 14);
            S2[1] = Inlines.silk_SMLAWB(S2[1], out32_Q14, A1_U_Q28);
            S2[1] = Inlines.silk_SMLAWB(S2[1], B_Q28[2], inval);
            output[output_ptr + k2 * stride] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT(out32_Q14 + 16384 - 1, 14));
        }
    }

    static void silk_biquad_alt(short[] input, int input_ptr, int[] B_Q28, int[] A_Q28, int[] S2, int S_ptr, short[] output, int output_ptr, int len, int stride) {
        int A0_L_Q28 = -A_Q28[0] & 0x3FFF;
        int A0_U_Q28 = Inlines.silk_RSHIFT(-A_Q28[0], 14);
        int A1_L_Q28 = -A_Q28[1] & 0x3FFF;
        int A1_U_Q28 = Inlines.silk_RSHIFT(-A_Q28[1], 14);
        for (int k2 = 0; k2 < len; ++k2) {
            int s1 = S_ptr + 1;
            short inval = input[input_ptr + k2 * stride];
            int out32_Q14 = Inlines.silk_LSHIFT(Inlines.silk_SMLAWB(S2[S_ptr], B_Q28[0], inval), 2);
            S2[S_ptr] = S2[s1] + Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(out32_Q14, A0_L_Q28), 14);
            S2[S_ptr] = Inlines.silk_SMLAWB(S2[S_ptr], out32_Q14, A0_U_Q28);
            S2[S_ptr] = Inlines.silk_SMLAWB(S2[S_ptr], B_Q28[1], inval);
            S2[s1] = Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(out32_Q14, A1_L_Q28), 14);
            S2[s1] = Inlines.silk_SMLAWB(S2[s1], out32_Q14, A1_U_Q28);
            S2[s1] = Inlines.silk_SMLAWB(S2[s1], B_Q28[2], inval);
            output[output_ptr + k2 * stride] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT(out32_Q14 + 16384 - 1, 14));
        }
    }

    static void silk_ana_filt_bank_1(short[] input, int input_ptr, int[] S2, short[] outL, short[] outH, int outH_ptr, int N2) {
        int N22 = Inlines.silk_RSHIFT(N2, 1);
        for (int k2 = 0; k2 < N22; ++k2) {
            int in32 = Inlines.silk_LSHIFT(input[input_ptr + 2 * k2], 10);
            int Y2 = Inlines.silk_SUB32(in32, S2[0]);
            int X2 = Inlines.silk_SMLAWB(Y2, Y2, -24290);
            int out_1 = Inlines.silk_ADD32(S2[0], X2);
            S2[0] = Inlines.silk_ADD32(in32, X2);
            in32 = Inlines.silk_LSHIFT(input[input_ptr + 2 * k2 + 1], 10);
            Y2 = Inlines.silk_SUB32(in32, S2[1]);
            X2 = Inlines.silk_SMULWB(Y2, 10788);
            int out_2 = Inlines.silk_ADD32(S2[1], X2);
            S2[1] = Inlines.silk_ADD32(in32, X2);
            outL[k2] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(Inlines.silk_ADD32(out_2, out_1), 11));
            outH[outH_ptr + k2] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(Inlines.silk_SUB32(out_2, out_1), 11));
        }
    }

    static void silk_bwexpander_32(int[] ar2, int d2, int chirp_Q16) {
        int chirp_minus_one_Q16 = chirp_Q16 - 65536;
        for (int i2 = 0; i2 < d2 - 1; ++i2) {
            ar2[i2] = Inlines.silk_SMULWW(chirp_Q16, ar2[i2]);
            chirp_Q16 += Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(chirp_Q16, chirp_minus_one_Q16), 16);
        }
        ar2[d2 - 1] = Inlines.silk_SMULWW(chirp_Q16, ar2[d2 - 1]);
    }

    static void silk_LP_interpolate_filter_taps(int[] B_Q28, int[] A_Q28, int ind, int fac_Q16) {
        if (ind < 4) {
            if (fac_Q16 > 0) {
                if (fac_Q16 < 32768) {
                    for (int nb2 = 0; nb2 < 3; ++nb2) {
                        B_Q28[nb2] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_B_Q28[ind][nb2], SilkTables.silk_Transition_LP_B_Q28[ind + 1][nb2] - SilkTables.silk_Transition_LP_B_Q28[ind][nb2], fac_Q16);
                    }
                    for (int na2 = 0; na2 < 2; ++na2) {
                        A_Q28[na2] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_A_Q28[ind][na2], SilkTables.silk_Transition_LP_A_Q28[ind + 1][na2] - SilkTables.silk_Transition_LP_A_Q28[ind][na2], fac_Q16);
                    }
                } else {
                    Inlines.OpusAssert(fac_Q16 - 65536 == Inlines.silk_SAT16(fac_Q16 - 65536));
                    for (int nb3 = 0; nb3 < 3; ++nb3) {
                        B_Q28[nb3] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_B_Q28[ind + 1][nb3], SilkTables.silk_Transition_LP_B_Q28[ind + 1][nb3] - SilkTables.silk_Transition_LP_B_Q28[ind][nb3], fac_Q16 - 65536);
                    }
                    for (int na3 = 0; na3 < 2; ++na3) {
                        A_Q28[na3] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_A_Q28[ind + 1][na3], SilkTables.silk_Transition_LP_A_Q28[ind + 1][na3] - SilkTables.silk_Transition_LP_A_Q28[ind][na3], fac_Q16 - 65536);
                    }
                }
            } else {
                System.arraycopy(SilkTables.silk_Transition_LP_B_Q28[ind], 0, B_Q28, 0, 3);
                System.arraycopy(SilkTables.silk_Transition_LP_A_Q28[ind], 0, A_Q28, 0, 2);
            }
        } else {
            System.arraycopy(SilkTables.silk_Transition_LP_B_Q28[4], 0, B_Q28, 0, 3);
            System.arraycopy(SilkTables.silk_Transition_LP_A_Q28[4], 0, A_Q28, 0, 2);
        }
    }

    static void silk_LPC_analysis_filter(short[] output, int output_ptr, short[] input, int input_ptr, short[] B2, int B_ptr, int len, int d2) {
        int j2;
        short[] mem = new short[16];
        short[] num = new short[16];
        Inlines.OpusAssert(d2 >= 6);
        Inlines.OpusAssert((d2 & 1) == 0);
        Inlines.OpusAssert(d2 <= len);
        Inlines.OpusAssert(d2 <= 16);
        for (j2 = 0; j2 < d2; ++j2) {
            num[j2] = (short)(0 - B2[B_ptr + j2]);
        }
        for (j2 = 0; j2 < d2; ++j2) {
            mem[j2] = input[input_ptr + d2 - j2 - 1];
        }
        Kernels.celt_fir(input, input_ptr + d2, num, output, output_ptr + d2, len - d2, d2, mem);
        for (j2 = output_ptr; j2 < output_ptr + d2; ++j2) {
            output[j2] = 0;
        }
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
        int[][] Atmp_QA = new int[][]{new int[order], new int[order]};
        int DC_resp = 0;
        int[] Anew_QA = Atmp_QA[order & 1];
        for (int k2 = 0; k2 < order; ++k2) {
            DC_resp += A_Q12[k2];
            Anew_QA[k2] = Inlines.silk_LSHIFT32(A_Q12[k2], 12);
        }
        if (DC_resp >= 4096) {
            return 0;
        }
        return Filters.LPC_inverse_pred_gain_QA(Atmp_QA, order);
    }
}

