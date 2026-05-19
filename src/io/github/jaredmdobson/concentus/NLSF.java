/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Filters;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.NLSFCodebook;
import io.github.jaredmdobson.concentus.SilkChannelEncoder;
import io.github.jaredmdobson.concentus.SilkTables;
import io.github.jaredmdobson.concentus.Sort;

class NLSF {
    private static final int MAX_STABILIZE_LOOPS = 20;
    private static final int QA = 16;
    private static final int BIN_DIV_STEPS_A2NLSF = 3;
    private static final int MAX_ITERATIONS_A2NLSF = 30;
    private static final byte[] ordering16 = new byte[]{0, 15, 8, 7, 4, 11, 12, 3, 2, 13, 10, 5, 6, 9, 14, 1};
    private static final byte[] ordering10 = new byte[]{0, 9, 6, 3, 4, 5, 8, 1, 2, 7};

    NLSF() {
    }

    static void silk_NLSF_VQ(int[] err_Q26, short[] in_Q15, short[] pCB_Q8, int K2, int LPC_order) {
        int pCB_idx = 0;
        Inlines.OpusAssert(err_Q26 != null);
        Inlines.OpusAssert(LPC_order <= 16);
        Inlines.OpusAssert((LPC_order & 1) == 0);
        for (int i2 = 0; i2 < K2; ++i2) {
            int sum_error_Q26 = 0;
            for (int m2 = 0; m2 < LPC_order; m2 += 2) {
                int diff_Q15 = Inlines.silk_SUB_LSHIFT32(in_Q15[m2], pCB_Q8[pCB_idx++], 7);
                int sum_error_Q30 = Inlines.silk_SMULBB(diff_Q15, diff_Q15);
                Inlines.OpusAssert((sum_error_Q26 = Inlines.silk_ADD_RSHIFT32(sum_error_Q26, sum_error_Q30 = Inlines.silk_SMLABB(sum_error_Q30, diff_Q15 = Inlines.silk_SUB_LSHIFT32(in_Q15[m2 + 1], pCB_Q8[pCB_idx++], 7), diff_Q15), 4)) >= 0);
                Inlines.OpusAssert(sum_error_Q30 >= 0);
            }
            err_Q26[i2] = sum_error_Q26;
        }
    }

    static void silk_NLSF_VQ_weights_laroia(short[] pNLSFW_Q_OUT, short[] pNLSF_Q15, int D2) {
        Inlines.OpusAssert(pNLSFW_Q_OUT != null);
        Inlines.OpusAssert(D2 > 0);
        Inlines.OpusAssert((D2 & 1) == 0);
        int tmp1_int = Inlines.silk_max_int(pNLSF_Q15[0], 1);
        tmp1_int = Inlines.silk_DIV32(131072, tmp1_int);
        int tmp2_int = Inlines.silk_max_int(pNLSF_Q15[1] - pNLSF_Q15[0], 1);
        tmp2_int = Inlines.silk_DIV32(131072, tmp2_int);
        pNLSFW_Q_OUT[0] = (short)Inlines.silk_min_int(tmp1_int + tmp2_int, Short.MAX_VALUE);
        Inlines.OpusAssert(pNLSFW_Q_OUT[0] > 0);
        for (int k2 = 1; k2 < D2 - 1; k2 += 2) {
            tmp1_int = Inlines.silk_max_int(pNLSF_Q15[k2 + 1] - pNLSF_Q15[k2], 1);
            tmp1_int = Inlines.silk_DIV32(131072, tmp1_int);
            pNLSFW_Q_OUT[k2] = (short)Inlines.silk_min_int(tmp1_int + tmp2_int, Short.MAX_VALUE);
            Inlines.OpusAssert(pNLSFW_Q_OUT[k2] > 0);
            tmp2_int = Inlines.silk_max_int(pNLSF_Q15[k2 + 2] - pNLSF_Q15[k2 + 1], 1);
            tmp2_int = Inlines.silk_DIV32(131072, tmp2_int);
            pNLSFW_Q_OUT[k2 + 1] = (short)Inlines.silk_min_int(tmp1_int + tmp2_int, Short.MAX_VALUE);
            Inlines.OpusAssert(pNLSFW_Q_OUT[k2 + 1] > 0);
        }
        tmp1_int = Inlines.silk_max_int(32768 - pNLSF_Q15[D2 - 1], 1);
        tmp1_int = Inlines.silk_DIV32(131072, tmp1_int);
        pNLSFW_Q_OUT[D2 - 1] = (short)Inlines.silk_min_int(tmp1_int + tmp2_int, Short.MAX_VALUE);
        Inlines.OpusAssert(pNLSFW_Q_OUT[D2 - 1] > 0);
    }

    static void silk_NLSF_residual_dequant(short[] x_Q10, byte[] indices, int indices_ptr, short[] pred_coef_Q8, int quant_step_size_Q16, short order) {
        short out_Q10 = 0;
        for (int i2 = order - 1; i2 >= 0; --i2) {
            int pred_Q10 = Inlines.silk_RSHIFT(Inlines.silk_SMULBB(out_Q10, pred_coef_Q8[i2]), 8);
            out_Q10 = Inlines.silk_LSHIFT16(indices[indices_ptr + i2], 10);
            if (out_Q10 > 0) {
                out_Q10 = Inlines.silk_SUB16(out_Q10, (short)102);
            } else if (out_Q10 < 0) {
                out_Q10 = Inlines.silk_ADD16(out_Q10, (short)102);
            }
            x_Q10[i2] = out_Q10 = (short)Inlines.silk_SMLAWB(pred_Q10, out_Q10, quant_step_size_Q16);
        }
    }

    static void silk_NLSF_unpack(short[] ec_ix, short[] pred_Q8, NLSFCodebook psNLSF_CB, int CB1_index) {
        short[] ec_sel = psNLSF_CB.ec_sel;
        int ec_sel_ptr = CB1_index * psNLSF_CB.order / 2;
        for (int i2 = 0; i2 < psNLSF_CB.order; i2 += 2) {
            short entry = ec_sel[ec_sel_ptr];
            ++ec_sel_ptr;
            ec_ix[i2] = (short)Inlines.silk_SMULBB(Inlines.silk_RSHIFT(entry, 1) & 7, 9);
            pred_Q8[i2] = psNLSF_CB.pred_Q8[i2 + (entry & 1) * (psNLSF_CB.order - 1)];
            ec_ix[i2 + 1] = (short)Inlines.silk_SMULBB(Inlines.silk_RSHIFT(entry, 5) & 7, 9);
            pred_Q8[i2 + 1] = psNLSF_CB.pred_Q8[i2 + (Inlines.silk_RSHIFT(entry, 4) & 1) * (psNLSF_CB.order - 1) + 1];
        }
    }

    static void silk_NLSF_stabilize(short[] NLSF_Q15, short[] NDeltaMin_Q15, int L2) {
        int i2;
        int loops;
        int I2 = 0;
        Inlines.OpusAssert(NDeltaMin_Q15[L2] >= 1);
        for (loops = 0; loops < 20; ++loops) {
            int k2;
            int diff_Q15;
            int min_diff_Q15 = NLSF_Q15[0] - NDeltaMin_Q15[0];
            I2 = 0;
            for (i2 = 1; i2 <= L2 - 1; ++i2) {
                diff_Q15 = NLSF_Q15[i2] - (NLSF_Q15[i2 - 1] + NDeltaMin_Q15[i2]);
                if (diff_Q15 >= min_diff_Q15) continue;
                min_diff_Q15 = diff_Q15;
                I2 = i2;
            }
            diff_Q15 = 32768 - (NLSF_Q15[L2 - 1] + NDeltaMin_Q15[L2]);
            if (diff_Q15 < min_diff_Q15) {
                min_diff_Q15 = diff_Q15;
                I2 = L2;
            }
            if (min_diff_Q15 >= 0) {
                return;
            }
            if (I2 == 0) {
                NLSF_Q15[0] = NDeltaMin_Q15[0];
                continue;
            }
            if (I2 == L2) {
                NLSF_Q15[L2 - 1] = (short)(32768 - NDeltaMin_Q15[L2]);
                continue;
            }
            int min_center_Q15 = 0;
            for (k2 = 0; k2 < I2; ++k2) {
                min_center_Q15 += NDeltaMin_Q15[k2];
            }
            min_center_Q15 += Inlines.silk_RSHIFT(NDeltaMin_Q15[I2], 1);
            int max_center_Q15 = 32768;
            for (k2 = L2; k2 > I2; --k2) {
                max_center_Q15 -= NDeltaMin_Q15[k2];
            }
            short center_freq_Q15 = (short)Inlines.silk_LIMIT_32(Inlines.silk_RSHIFT_ROUND(NLSF_Q15[I2 - 1] + NLSF_Q15[I2], 1), min_center_Q15, max_center_Q15 -= Inlines.silk_RSHIFT(NDeltaMin_Q15[I2], 1));
            NLSF_Q15[I2 - 1] = (short)(center_freq_Q15 - Inlines.silk_RSHIFT(NDeltaMin_Q15[I2], 1));
            NLSF_Q15[I2] = (short)(NLSF_Q15[I2 - 1] + NDeltaMin_Q15[I2]);
        }
        if (loops == 20) {
            Sort.silk_insertion_sort_increasing_all_values_int16(NLSF_Q15, L2);
            NLSF_Q15[0] = (short)Inlines.silk_max_int(NLSF_Q15[0], NDeltaMin_Q15[0]);
            for (i2 = 1; i2 < L2; ++i2) {
                NLSF_Q15[i2] = (short)Inlines.silk_max_int(NLSF_Q15[i2], NLSF_Q15[i2 - 1] + NDeltaMin_Q15[i2]);
            }
            NLSF_Q15[L2 - 1] = (short)Inlines.silk_min_int(NLSF_Q15[L2 - 1], 32768 - NDeltaMin_Q15[L2]);
            for (i2 = L2 - 2; i2 >= 0; --i2) {
                NLSF_Q15[i2] = (short)Inlines.silk_min_int(NLSF_Q15[i2], NLSF_Q15[i2 + 1] - NDeltaMin_Q15[i2 + 1]);
            }
        }
    }

    static void silk_NLSF_decode(short[] pNLSF_Q15, byte[] NLSFIndices, NLSFCodebook psNLSF_CB) {
        int i2;
        short[] pred_Q8 = new short[psNLSF_CB.order];
        short[] ec_ix = new short[psNLSF_CB.order];
        short[] res_Q10 = new short[psNLSF_CB.order];
        short[] W_tmp_QW = new short[psNLSF_CB.order];
        short[] pCB = psNLSF_CB.CB1_NLSF_Q8;
        int pCB_element = NLSFIndices[0] * psNLSF_CB.order;
        for (i2 = 0; i2 < psNLSF_CB.order; ++i2) {
            pNLSF_Q15[i2] = Inlines.silk_LSHIFT16(pCB[pCB_element + i2], 7);
        }
        NLSF.silk_NLSF_unpack(ec_ix, pred_Q8, psNLSF_CB, NLSFIndices[0]);
        NLSF.silk_NLSF_residual_dequant(res_Q10, NLSFIndices, 1, pred_Q8, psNLSF_CB.quantStepSize_Q16, psNLSF_CB.order);
        NLSF.silk_NLSF_VQ_weights_laroia(W_tmp_QW, pNLSF_Q15, psNLSF_CB.order);
        for (i2 = 0; i2 < psNLSF_CB.order; ++i2) {
            int W_tmp_Q9 = Inlines.silk_SQRT_APPROX(Inlines.silk_LSHIFT(W_tmp_QW[i2], 16));
            int NLSF_Q15_tmp = Inlines.silk_ADD32(pNLSF_Q15[i2], Inlines.silk_DIV32_16(Inlines.silk_LSHIFT(res_Q10[i2], 14), (short)W_tmp_Q9));
            pNLSF_Q15[i2] = (short)Inlines.silk_LIMIT(NLSF_Q15_tmp, 0, Short.MAX_VALUE);
        }
        NLSF.silk_NLSF_stabilize(pNLSF_Q15, psNLSF_CB.deltaMin_Q15, psNLSF_CB.order);
    }

    static int silk_NLSF_del_dec_quant(byte[] indices, short[] x_Q10, short[] w_Q5, short[] pred_coef_Q8, short[] ec_ix, short[] ec_rates_Q5, int quant_step_size_Q16, short inv_quant_step_size_Q6, int mu_Q20, short order) {
        int ind_tmp;
        int j2;
        int out1_Q10;
        int out0_Q10;
        int i2;
        int[] ind_sort = new int[4];
        byte[][] ind = new byte[4][];
        for (i2 = 0; i2 < 4; ++i2) {
            ind[i2] = new byte[16];
        }
        short[] prev_out_Q10 = new short[8];
        int[] RD_Q25 = new int[8];
        int[] RD_min_Q25 = new int[4];
        int[] RD_max_Q25 = new int[4];
        int[] out0_Q10_table = new int[20];
        int[] out1_Q10_table = new int[20];
        for (i2 = -10; i2 <= 9; ++i2) {
            out0_Q10 = Inlines.silk_LSHIFT(i2, 10);
            out1_Q10 = Inlines.silk_ADD16((short)out0_Q10, (short)1024);
            if (i2 > 0) {
                out0_Q10 = Inlines.silk_SUB16((short)out0_Q10, (short)102);
                out1_Q10 = Inlines.silk_SUB16((short)out1_Q10, (short)102);
            } else if (i2 == 0) {
                out1_Q10 = Inlines.silk_SUB16((short)out1_Q10, (short)102);
            } else if (i2 == -1) {
                out0_Q10 = Inlines.silk_ADD16((short)out0_Q10, (short)102);
            } else {
                out0_Q10 = Inlines.silk_ADD16((short)out0_Q10, (short)102);
                out1_Q10 = Inlines.silk_ADD16((short)out1_Q10, (short)102);
            }
            out0_Q10_table[i2 + 10] = Inlines.silk_SMULWB(out0_Q10, quant_step_size_Q16);
            out1_Q10_table[i2 + 10] = Inlines.silk_SMULWB(out1_Q10, quant_step_size_Q16);
        }
        Inlines.OpusAssert(true);
        int nStates = 1;
        RD_Q25[0] = 0;
        prev_out_Q10[0] = 0;
        i2 = order - 1;
        while (true) {
            int pred_coef_Q16 = Inlines.silk_LSHIFT(pred_coef_Q8[i2], 8);
            short in_Q10 = x_Q10[i2];
            for (j2 = 0; j2 < nStates; ++j2) {
                int rate1_Q5;
                int rate0_Q5;
                int pred_Q10 = Inlines.silk_SMULWB(pred_coef_Q16, prev_out_Q10[j2]);
                short res_Q10 = Inlines.silk_SUB16(in_Q10, (short)pred_Q10);
                ind_tmp = Inlines.silk_SMULWB(inv_quant_step_size_Q6, res_Q10);
                ind_tmp = Inlines.silk_LIMIT(ind_tmp, -10, 9);
                ind[j2][i2] = (byte)ind_tmp;
                int rates_Q5 = ec_ix[i2] + ind_tmp;
                out0_Q10 = out0_Q10_table[ind_tmp + 10];
                out1_Q10 = out1_Q10_table[ind_tmp + 10];
                out0_Q10 = Inlines.silk_ADD16((short)out0_Q10, (short)pred_Q10);
                out1_Q10 = Inlines.silk_ADD16((short)out1_Q10, (short)pred_Q10);
                prev_out_Q10[j2] = (short)out0_Q10;
                prev_out_Q10[j2 + nStates] = (short)out1_Q10;
                if (ind_tmp + 1 >= 4) {
                    if (ind_tmp + 1 == 4) {
                        rate0_Q5 = ec_rates_Q5[rates_Q5 + 4];
                        rate1_Q5 = 280;
                    } else {
                        rate0_Q5 = Inlines.silk_SMLABB(108, 43, ind_tmp);
                        rate1_Q5 = Inlines.silk_ADD16((short)rate0_Q5, (short)43);
                    }
                } else if (ind_tmp <= -4) {
                    if (ind_tmp == -4) {
                        rate0_Q5 = 280;
                        rate1_Q5 = ec_rates_Q5[rates_Q5 + 1 + 4];
                    } else {
                        rate0_Q5 = Inlines.silk_SMLABB(108, -43, ind_tmp);
                        rate1_Q5 = Inlines.silk_SUB16((short)rate0_Q5, (short)43);
                    }
                } else {
                    rate0_Q5 = ec_rates_Q5[rates_Q5 + 4];
                    rate1_Q5 = ec_rates_Q5[rates_Q5 + 1 + 4];
                }
                int RD_tmp_Q25 = RD_Q25[j2];
                short diff_Q10 = Inlines.silk_SUB16(in_Q10, (short)out0_Q10);
                RD_Q25[j2] = Inlines.silk_SMLABB(Inlines.silk_MLA(RD_tmp_Q25, Inlines.silk_SMULBB(diff_Q10, diff_Q10), w_Q5[i2]), mu_Q20, rate0_Q5);
                diff_Q10 = Inlines.silk_SUB16(in_Q10, (short)out1_Q10);
                RD_Q25[j2 + nStates] = Inlines.silk_SMLABB(Inlines.silk_MLA(RD_tmp_Q25, Inlines.silk_SMULBB(diff_Q10, diff_Q10), w_Q5[i2]), mu_Q20, rate1_Q5);
            }
            if (nStates <= 2) {
                for (j2 = 0; j2 < nStates; ++j2) {
                    ind[j2 + nStates][i2] = (byte)(ind[j2][i2] + 1);
                }
                for (j2 = nStates = Inlines.silk_LSHIFT(nStates, 1); j2 < 4; ++j2) {
                    ind[j2][i2] = ind[j2 - nStates][i2];
                }
            } else {
                if (i2 <= 0) break;
                for (j2 = 0; j2 < 4; ++j2) {
                    if (RD_Q25[j2] > RD_Q25[j2 + 4]) {
                        RD_max_Q25[j2] = RD_Q25[j2];
                        RD_min_Q25[j2] = RD_Q25[j2 + 4];
                        RD_Q25[j2] = RD_min_Q25[j2];
                        RD_Q25[j2 + 4] = RD_max_Q25[j2];
                        out0_Q10 = prev_out_Q10[j2];
                        prev_out_Q10[j2] = prev_out_Q10[j2 + 4];
                        prev_out_Q10[j2 + 4] = (short)out0_Q10;
                        ind_sort[j2] = j2 + 4;
                        continue;
                    }
                    RD_min_Q25[j2] = RD_Q25[j2];
                    RD_max_Q25[j2] = RD_Q25[j2 + 4];
                    ind_sort[j2] = j2;
                }
                while (true) {
                    int min_max_Q25 = Integer.MAX_VALUE;
                    int max_min_Q25 = 0;
                    int ind_min_max = 0;
                    int ind_max_min = 0;
                    for (j2 = 0; j2 < 4; ++j2) {
                        if (min_max_Q25 > RD_max_Q25[j2]) {
                            min_max_Q25 = RD_max_Q25[j2];
                            ind_min_max = j2;
                        }
                        if (max_min_Q25 >= RD_min_Q25[j2]) continue;
                        max_min_Q25 = RD_min_Q25[j2];
                        ind_max_min = j2;
                    }
                    if (min_max_Q25 >= max_min_Q25) break;
                    ind_sort[ind_max_min] = ind_sort[ind_min_max] ^ 4;
                    RD_Q25[ind_max_min] = RD_Q25[ind_min_max + 4];
                    prev_out_Q10[ind_max_min] = prev_out_Q10[ind_min_max + 4];
                    RD_min_Q25[ind_max_min] = 0;
                    RD_max_Q25[ind_min_max] = Integer.MAX_VALUE;
                    System.arraycopy(ind[ind_min_max], 0, ind[ind_max_min], 0, order);
                }
                for (j2 = 0; j2 < 4; ++j2) {
                    byte x2 = (byte)Inlines.silk_RSHIFT(ind_sort[j2], 2);
                    byte[] byArray = ind[j2];
                    int n2 = i2;
                    byArray[n2] = (byte)(byArray[n2] + x2);
                }
            }
            --i2;
        }
        ind_tmp = 0;
        int min_Q25 = Integer.MAX_VALUE;
        for (j2 = 0; j2 < 8; ++j2) {
            if (min_Q25 <= RD_Q25[j2]) continue;
            min_Q25 = RD_Q25[j2];
            ind_tmp = j2;
        }
        for (j2 = 0; j2 < order; ++j2) {
            indices[j2] = ind[ind_tmp & 3][j2];
            Inlines.OpusAssert(indices[j2] >= -10);
            Inlines.OpusAssert(indices[j2] <= 10);
        }
        indices[0] = (byte)(indices[0] + Inlines.silk_RSHIFT(ind_tmp, 2));
        Inlines.OpusAssert(indices[0] <= 10);
        Inlines.OpusAssert(min_Q25 >= 0);
        return min_Q25;
    }

    static int silk_NLSF_encode(byte[] NLSFIndices, short[] pNLSF_Q15, NLSFCodebook psNLSF_CB, short[] pW_QW, int NLSF_mu_Q20, int nSurvivors, int signalType) {
        short[] res_Q15 = new short[psNLSF_CB.order];
        short[] res_Q10 = new short[psNLSF_CB.order];
        short[] NLSF_tmp_Q15 = new short[psNLSF_CB.order];
        short[] W_tmp_QW = new short[psNLSF_CB.order];
        short[] W_adj_Q5 = new short[psNLSF_CB.order];
        short[] pred_Q8 = new short[psNLSF_CB.order];
        short[] ec_ix = new short[psNLSF_CB.order];
        short[] pCB = psNLSF_CB.CB1_NLSF_Q8;
        Inlines.OpusAssert(nSurvivors <= 32);
        Inlines.OpusAssert(signalType >= 0 && signalType <= 2);
        Inlines.OpusAssert(NLSF_mu_Q20 <= Short.MAX_VALUE && NLSF_mu_Q20 >= 0);
        NLSF.silk_NLSF_stabilize(pNLSF_Q15, psNLSF_CB.deltaMin_Q15, psNLSF_CB.order);
        int[] err_Q26 = new int[psNLSF_CB.nVectors];
        NLSF.silk_NLSF_VQ(err_Q26, pNLSF_Q15, psNLSF_CB.CB1_NLSF_Q8, psNLSF_CB.nVectors, psNLSF_CB.order);
        int[] tempIndices1 = new int[nSurvivors];
        Sort.silk_insertion_sort_increasing(err_Q26, tempIndices1, psNLSF_CB.nVectors, nSurvivors);
        int[] RD_Q25 = new int[nSurvivors];
        byte[][] tempIndices2 = Arrays.InitTwoDimensionalArrayByte(nSurvivors, 16);
        for (int s2 = 0; s2 < nSurvivors; ++s2) {
            int i2;
            int ind1 = tempIndices1[s2];
            int pCB_element = ind1 * psNLSF_CB.order;
            for (i2 = 0; i2 < psNLSF_CB.order; ++i2) {
                NLSF_tmp_Q15[i2] = Inlines.silk_LSHIFT16(pCB[pCB_element + i2], 7);
                res_Q15[i2] = (short)(pNLSF_Q15[i2] - NLSF_tmp_Q15[i2]);
            }
            NLSF.silk_NLSF_VQ_weights_laroia(W_tmp_QW, NLSF_tmp_Q15, psNLSF_CB.order);
            for (i2 = 0; i2 < psNLSF_CB.order; ++i2) {
                int W_tmp_Q9 = Inlines.silk_SQRT_APPROX(Inlines.silk_LSHIFT(W_tmp_QW[i2], 16));
                res_Q10[i2] = (short)Inlines.silk_RSHIFT(Inlines.silk_SMULBB(res_Q15[i2], W_tmp_Q9), 14);
            }
            for (i2 = 0; i2 < psNLSF_CB.order; ++i2) {
                W_adj_Q5[i2] = (short)Inlines.silk_DIV32_16(Inlines.silk_LSHIFT(pW_QW[i2], 5), W_tmp_QW[i2]);
            }
            NLSF.silk_NLSF_unpack(ec_ix, pred_Q8, psNLSF_CB, ind1);
            RD_Q25[s2] = NLSF.silk_NLSF_del_dec_quant(tempIndices2[s2], res_Q10, W_adj_Q5, pred_Q8, ec_ix, psNLSF_CB.ec_Rates_Q5, psNLSF_CB.quantStepSize_Q16, psNLSF_CB.invQuantStepSize_Q6, NLSF_mu_Q20, psNLSF_CB.order);
            int iCDF_ptr = (signalType >> 1) * psNLSF_CB.nVectors;
            int prob_Q8 = ind1 == 0 ? 256 - psNLSF_CB.CB1_iCDF[iCDF_ptr + ind1] : psNLSF_CB.CB1_iCDF[iCDF_ptr + ind1 - 1] - psNLSF_CB.CB1_iCDF[iCDF_ptr + ind1];
            int bits_q7 = 1024 - Inlines.silk_lin2log(prob_Q8);
            RD_Q25[s2] = Inlines.silk_SMLABB(RD_Q25[s2], bits_q7, Inlines.silk_RSHIFT(NLSF_mu_Q20, 2));
        }
        int[] bestIndex = new int[1];
        Sort.silk_insertion_sort_increasing(RD_Q25, bestIndex, nSurvivors, 1);
        NLSFIndices[0] = (byte)tempIndices1[bestIndex[0]];
        System.arraycopy(tempIndices2[bestIndex[0]], 0, NLSFIndices, 1, psNLSF_CB.order);
        NLSF.silk_NLSF_decode(pNLSF_Q15, NLSFIndices, psNLSF_CB);
        return RD_Q25[0];
    }

    static void silk_NLSF2A_find_poly(int[] o2, int[] cLSF, int cLSF_ptr, int dd2) {
        o2[0] = Inlines.silk_LSHIFT(1, 16);
        o2[1] = 0 - cLSF[cLSF_ptr];
        for (int k2 = 1; k2 < dd2; ++k2) {
            int ftmp = cLSF[cLSF_ptr + 2 * k2];
            o2[k2 + 1] = Inlines.silk_LSHIFT(o2[k2 - 1], 1) - (int)Inlines.silk_RSHIFT_ROUND64(Inlines.silk_SMULL(ftmp, o2[k2]), 16);
            for (int n2 = k2; n2 > 1; --n2) {
                int n3 = n2;
                o2[n3] = o2[n3] + (o2[n2 - 2] - (int)Inlines.silk_RSHIFT_ROUND64(Inlines.silk_SMULL(ftmp, o2[n2 - 1]), 16));
            }
            o2[1] = o2[1] - ftmp;
        }
    }

    static void silk_NLSF2A(short[] a_Q12, short[] NLSF2, int d2) {
        int i2;
        int k2;
        int[] cos_LSF_QA = new int[d2];
        int[] P2 = new int[d2 / 2 + 1];
        int[] Q2 = new int[d2 / 2 + 1];
        int[] a32_QA1 = new int[d2];
        int idx = 0;
        Inlines.OpusAssert(true);
        Inlines.OpusAssert(d2 == 10 || d2 == 16);
        byte[] ordering = d2 == 16 ? ordering16 : ordering10;
        for (k2 = 0; k2 < d2; ++k2) {
            Inlines.OpusAssert(NLSF2[k2] >= 0);
            int f_int = Inlines.silk_RSHIFT(NLSF2[k2], 8);
            int f_frac = NLSF2[k2] - Inlines.silk_LSHIFT(f_int, 8);
            Inlines.OpusAssert(f_int >= 0);
            Inlines.OpusAssert(f_int < 128);
            short cos_val = SilkTables.silk_LSFCosTab_Q12[f_int];
            int delta = SilkTables.silk_LSFCosTab_Q12[f_int + 1] - cos_val;
            cos_LSF_QA[ordering[k2]] = Inlines.silk_RSHIFT_ROUND(Inlines.silk_LSHIFT(cos_val, 8) + Inlines.silk_MUL(delta, f_frac), 4);
        }
        int dd2 = Inlines.silk_RSHIFT(d2, 1);
        NLSF.silk_NLSF2A_find_poly(P2, cos_LSF_QA, 0, dd2);
        NLSF.silk_NLSF2A_find_poly(Q2, cos_LSF_QA, 1, dd2);
        for (k2 = 0; k2 < dd2; ++k2) {
            int Ptmp = P2[k2 + 1] + P2[k2];
            int Qtmp = Q2[k2 + 1] - Q2[k2];
            a32_QA1[k2] = -Qtmp - Ptmp;
            a32_QA1[d2 - k2 - 1] = Qtmp - Ptmp;
        }
        for (i2 = 0; i2 < 10; ++i2) {
            int maxabs = 0;
            for (k2 = 0; k2 < d2; ++k2) {
                int absval = Inlines.silk_abs(a32_QA1[k2]);
                if (absval <= maxabs) continue;
                maxabs = absval;
                idx = k2;
            }
            if ((maxabs = Inlines.silk_RSHIFT_ROUND(maxabs, 5)) <= Short.MAX_VALUE) break;
            maxabs = Inlines.silk_min(maxabs, 163838);
            int sc_Q16 = 65470 - Inlines.silk_DIV32(Inlines.silk_LSHIFT(maxabs - Short.MAX_VALUE, 14), Inlines.silk_RSHIFT32(Inlines.silk_MUL(maxabs, idx + 1), 2));
            Filters.silk_bwexpander_32(a32_QA1, d2, sc_Q16);
        }
        if (i2 == 10) {
            for (k2 = 0; k2 < d2; ++k2) {
                a_Q12[k2] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(a32_QA1[k2], 5));
                a32_QA1[k2] = Inlines.silk_LSHIFT(a_Q12[k2], 5);
            }
        } else {
            for (k2 = 0; k2 < d2; ++k2) {
                a_Q12[k2] = (short)Inlines.silk_RSHIFT_ROUND(a32_QA1[k2], 5);
            }
        }
        for (i2 = 0; i2 < 16 && Filters.silk_LPC_inverse_pred_gain(a_Q12, d2) < 107374; ++i2) {
            Filters.silk_bwexpander_32(a32_QA1, d2, 65536 - Inlines.silk_LSHIFT(2, i2));
            for (k2 = 0; k2 < d2; ++k2) {
                a_Q12[k2] = (short)Inlines.silk_RSHIFT_ROUND(a32_QA1[k2], 5);
            }
        }
    }

    static void silk_A2NLSF_trans_poly(int[] p2, int dd2) {
        for (int k2 = 2; k2 <= dd2; ++k2) {
            for (int n2 = dd2; n2 > k2; --n2) {
                int n3 = n2 - 2;
                p2[n3] = p2[n3] - p2[n2];
            }
            int n4 = k2 - 2;
            p2[n4] = p2[n4] - Inlines.silk_LSHIFT(p2[k2], 1);
        }
    }

    static int silk_A2NLSF_eval_poly(int[] p2, int x2, int dd2) {
        int y32 = p2[dd2];
        int x_Q16 = Inlines.silk_LSHIFT(x2, 4);
        if (8 == dd2) {
            y32 = Inlines.silk_SMLAWW(p2[7], y32, x_Q16);
            y32 = Inlines.silk_SMLAWW(p2[6], y32, x_Q16);
            y32 = Inlines.silk_SMLAWW(p2[5], y32, x_Q16);
            y32 = Inlines.silk_SMLAWW(p2[4], y32, x_Q16);
            y32 = Inlines.silk_SMLAWW(p2[3], y32, x_Q16);
            y32 = Inlines.silk_SMLAWW(p2[2], y32, x_Q16);
            y32 = Inlines.silk_SMLAWW(p2[1], y32, x_Q16);
            y32 = Inlines.silk_SMLAWW(p2[0], y32, x_Q16);
        } else {
            for (int n2 = dd2 - 1; n2 >= 0; --n2) {
                y32 = Inlines.silk_SMLAWW(p2[n2], y32, x_Q16);
            }
        }
        return y32;
    }

    static void silk_A2NLSF_init(int[] a_Q16, int[] P2, int[] Q2, int dd2) {
        int k2;
        P2[dd2] = Inlines.silk_LSHIFT(1, 16);
        Q2[dd2] = Inlines.silk_LSHIFT(1, 16);
        for (k2 = 0; k2 < dd2; ++k2) {
            P2[k2] = -a_Q16[dd2 - k2 - 1] - a_Q16[dd2 + k2];
            Q2[k2] = -a_Q16[dd2 - k2 - 1] + a_Q16[dd2 + k2];
        }
        for (k2 = dd2; k2 > 0; --k2) {
            int n2 = k2 - 1;
            P2[n2] = P2[n2] - P2[k2];
            int n3 = k2 - 1;
            Q2[n3] = Q2[n3] + Q2[k2];
        }
        NLSF.silk_A2NLSF_trans_poly(P2, dd2);
        NLSF.silk_A2NLSF_trans_poly(Q2, dd2);
    }

    static void silk_A2NLSF(short[] NLSF2, int[] a_Q16, int d2) {
        int root_ix;
        int[] P2 = new int[9];
        int[] Q2 = new int[9];
        int[][] PQ2 = new int[][]{P2, Q2};
        int dd2 = Inlines.silk_RSHIFT(d2, 1);
        NLSF.silk_A2NLSF_init(a_Q16, P2, Q2, dd2);
        int[] p2 = P2;
        int xlo = SilkTables.silk_LSFCosTab_Q12[0];
        int ylo = NLSF.silk_A2NLSF_eval_poly(p2, xlo, dd2);
        if (ylo < 0) {
            NLSF2[0] = 0;
            p2 = Q2;
            ylo = NLSF.silk_A2NLSF_eval_poly(p2, xlo, dd2);
            root_ix = 1;
        } else {
            root_ix = 0;
        }
        int k2 = 1;
        int i2 = 0;
        int thr = 0;
        while (true) {
            int xhi = SilkTables.silk_LSFCosTab_Q12[k2];
            int yhi = NLSF.silk_A2NLSF_eval_poly(p2, xhi, dd2);
            if (ylo <= 0 && yhi >= thr || ylo >= 0 && yhi <= -thr) {
                thr = yhi == 0 ? 1 : 0;
                int ffrac = -256;
                for (int m2 = 0; m2 < 3; ++m2) {
                    int xmid = Inlines.silk_RSHIFT_ROUND(xlo + xhi, 1);
                    int ymid = NLSF.silk_A2NLSF_eval_poly(p2, xmid, dd2);
                    if (ylo <= 0 && ymid >= 0 || ylo >= 0 && ymid <= 0) {
                        xhi = xmid;
                        yhi = ymid;
                        continue;
                    }
                    xlo = xmid;
                    ylo = ymid;
                    ffrac = Inlines.silk_ADD_RSHIFT(ffrac, 128, m2);
                }
                if (Inlines.silk_abs(ylo) < 65536) {
                    int den = ylo - yhi;
                    int nom = Inlines.silk_LSHIFT(ylo, 5) + Inlines.silk_RSHIFT(den, 1);
                    if (den != 0) {
                        ffrac += Inlines.silk_DIV32(nom, den);
                    }
                } else {
                    ffrac += Inlines.silk_DIV32(ylo, Inlines.silk_RSHIFT(ylo - yhi, 5));
                }
                NLSF2[root_ix] = (short)Inlines.silk_min_32(Inlines.silk_LSHIFT(k2, 8) + ffrac, Short.MAX_VALUE);
                Inlines.OpusAssert(NLSF2[root_ix] >= 0);
                if (++root_ix >= d2) break;
                p2 = PQ2[root_ix & 1];
                xlo = SilkTables.silk_LSFCosTab_Q12[k2 - 1];
                ylo = Inlines.silk_LSHIFT(1 - (root_ix & 2), 12);
                continue;
            }
            xlo = xhi;
            ylo = yhi;
            thr = 0;
            if (++k2 <= 128) continue;
            if (++i2 > 30) {
                NLSF2[0] = (short)Inlines.silk_DIV32_16(32768, (short)(d2 + 1));
                for (k2 = 1; k2 < d2; ++k2) {
                    NLSF2[k2] = (short)Inlines.silk_SMULBB(k2 + 1, NLSF2[0]);
                }
                return;
            }
            Filters.silk_bwexpander_32(a_Q16, d2, 65536 - Inlines.silk_SMULBB(10 + i2, i2));
            NLSF.silk_A2NLSF_init(a_Q16, P2, Q2, dd2);
            p2 = P2;
            xlo = SilkTables.silk_LSFCosTab_Q12[0];
            ylo = NLSF.silk_A2NLSF_eval_poly(p2, xlo, dd2);
            if (ylo < 0) {
                NLSF2[0] = 0;
                p2 = Q2;
                ylo = NLSF.silk_A2NLSF_eval_poly(p2, xlo, dd2);
                root_ix = 1;
            } else {
                root_ix = 0;
            }
            k2 = 1;
        }
    }

    static void silk_process_NLSFs(SilkChannelEncoder psEncC, short[][] PredCoef_Q12, short[] pNLSF_Q15, short[] prev_NLSFq_Q15) {
        boolean doInterpolate;
        short[] pNLSF0_temp_Q15 = new short[16];
        short[] pNLSFW_QW = new short[16];
        short[] pNLSFW0_temp_QW = new short[16];
        Inlines.OpusAssert(psEncC.speech_activity_Q8 >= 0);
        Inlines.OpusAssert(psEncC.speech_activity_Q8 <= 256);
        Inlines.OpusAssert(psEncC.useInterpolatedNLSFs == 1 || psEncC.indices.NLSFInterpCoef_Q2 == 4);
        int NLSF_mu_Q20 = Inlines.silk_SMLAWB(3146, -268434, psEncC.speech_activity_Q8);
        if (psEncC.nb_subfr == 2) {
            NLSF_mu_Q20 = Inlines.silk_ADD_RSHIFT(NLSF_mu_Q20, NLSF_mu_Q20, 1);
        }
        Inlines.OpusAssert(NLSF_mu_Q20 > 0);
        Inlines.OpusAssert(NLSF_mu_Q20 <= 5243);
        NLSF.silk_NLSF_VQ_weights_laroia(pNLSFW_QW, pNLSF_Q15, psEncC.predictLPCOrder);
        boolean bl2 = doInterpolate = psEncC.useInterpolatedNLSFs == 1 && psEncC.indices.NLSFInterpCoef_Q2 < 4;
        if (doInterpolate) {
            Inlines.silk_interpolate(pNLSF0_temp_Q15, prev_NLSFq_Q15, pNLSF_Q15, psEncC.indices.NLSFInterpCoef_Q2, psEncC.predictLPCOrder);
            NLSF.silk_NLSF_VQ_weights_laroia(pNLSFW0_temp_QW, pNLSF0_temp_Q15, psEncC.predictLPCOrder);
            int i_sqr_Q15 = Inlines.silk_LSHIFT(Inlines.silk_SMULBB(psEncC.indices.NLSFInterpCoef_Q2, psEncC.indices.NLSFInterpCoef_Q2), 11);
            for (int i2 = 0; i2 < psEncC.predictLPCOrder; ++i2) {
                pNLSFW_QW[i2] = (short)Inlines.silk_SMLAWB(Inlines.silk_RSHIFT(pNLSFW_QW[i2], 1), pNLSFW0_temp_QW[i2], i_sqr_Q15);
                Inlines.OpusAssert(pNLSFW_QW[i2] >= 1);
            }
        }
        NLSF.silk_NLSF_encode(psEncC.indices.NLSFIndices, pNLSF_Q15, psEncC.psNLSF_CB, pNLSFW_QW, NLSF_mu_Q20, psEncC.NLSF_MSVQ_Survivors, psEncC.indices.signalType);
        NLSF.silk_NLSF2A(PredCoef_Q12[1], pNLSF_Q15, psEncC.predictLPCOrder);
        if (doInterpolate) {
            Inlines.silk_interpolate(pNLSF0_temp_Q15, prev_NLSFq_Q15, pNLSF_Q15, psEncC.indices.NLSFInterpCoef_Q2, psEncC.predictLPCOrder);
            NLSF.silk_NLSF2A(PredCoef_Q12[0], pNLSF0_temp_Q15, psEncC.predictLPCOrder);
        } else {
            System.arraycopy(PredCoef_Q12[1], 0, PredCoef_Q12[0], 0, psEncC.predictLPCOrder);
        }
    }
}

