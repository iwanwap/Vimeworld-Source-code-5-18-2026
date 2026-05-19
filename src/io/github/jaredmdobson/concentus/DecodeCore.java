/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Filters;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.SilkChannelDecoder;
import io.github.jaredmdobson.concentus.SilkDecoderControl;
import io.github.jaredmdobson.concentus.SilkTables;

class DecodeCore {
    DecodeCore() {
    }

    static void silk_decode_core(SilkChannelDecoder psDec, SilkDecoderControl psDecCtrl, short[] xq2, int xq_ptr, short[] pulses) {
        int i2;
        int lag = 0;
        short[] B_Q14 = psDecCtrl.LTPCoef_Q14;
        Inlines.OpusAssert(psDec.prev_gain_Q16 != 0);
        short[] sLTP = new short[psDec.ltp_mem_length];
        int[] sLTP_Q15 = new int[psDec.ltp_mem_length + psDec.frame_length];
        int[] res_Q14 = new int[psDec.subfr_length];
        int[] sLPC_Q14 = new int[psDec.subfr_length + 16];
        short offset_Q10 = SilkTables.silk_Quantization_Offsets_Q10[psDec.indices.signalType >> 1][psDec.indices.quantOffsetType];
        boolean NLSF_interpolation_flag = psDec.indices.NLSFInterpCoef_Q2 < 4;
        int rand_seed = psDec.indices.Seed;
        for (i2 = 0; i2 < psDec.frame_length; ++i2) {
            rand_seed = Inlines.silk_RAND(rand_seed);
            psDec.exc_Q14[i2] = Inlines.silk_LSHIFT(pulses[i2], 14);
            if (psDec.exc_Q14[i2] > 0) {
                int n2 = i2;
                psDec.exc_Q14[n2] = psDec.exc_Q14[n2] - 1280;
            } else if (psDec.exc_Q14[i2] < 0) {
                int n3 = i2;
                psDec.exc_Q14[n3] = psDec.exc_Q14[n3] + 1280;
            }
            int n4 = i2;
            psDec.exc_Q14[n4] = psDec.exc_Q14[n4] + (offset_Q10 << 4);
            if (rand_seed < 0) {
                psDec.exc_Q14[i2] = -psDec.exc_Q14[i2];
            }
            rand_seed = Inlines.silk_ADD32_ovflw(rand_seed, pulses[i2]);
        }
        System.arraycopy(psDec.sLPC_Q14_buf, 0, sLPC_Q14, 0, 16);
        int pexc_Q14 = 0;
        int pxq = xq_ptr;
        int sLTP_buf_idx = psDec.ltp_mem_length;
        for (int k2 = 0; k2 < psDec.nb_subfr; ++k2) {
            int gain_adj_Q16;
            int[] pres_Q14 = res_Q14;
            int pres_Q14_ptr = 0;
            short[] A_Q12 = psDecCtrl.PredCoef_Q12[k2 >> 1];
            int B_Q14_ptr = k2 * 5;
            int signalType = psDec.indices.signalType;
            int Gain_Q10 = Inlines.silk_RSHIFT(psDecCtrl.Gains_Q16[k2], 6);
            int inv_gain_Q31 = Inlines.silk_INVERSE32_varQ(psDecCtrl.Gains_Q16[k2], 47);
            if (psDecCtrl.Gains_Q16[k2] != psDec.prev_gain_Q16) {
                gain_adj_Q16 = Inlines.silk_DIV32_varQ(psDec.prev_gain_Q16, psDecCtrl.Gains_Q16[k2], 16);
                for (i2 = 0; i2 < 16; ++i2) {
                    sLPC_Q14[i2] = Inlines.silk_SMULWW(gain_adj_Q16, sLPC_Q14[i2]);
                }
            } else {
                gain_adj_Q16 = 65536;
            }
            Inlines.OpusAssert(inv_gain_Q31 != 0);
            psDec.prev_gain_Q16 = psDecCtrl.Gains_Q16[k2];
            if (psDec.lossCnt != 0 && psDec.prevSignalType == 2 && psDec.indices.signalType != 2 && k2 < 2) {
                Arrays.MemSetWithOffset(B_Q14, (short)0, B_Q14_ptr, 5);
                B_Q14[B_Q14_ptr + 2] = 4096;
                signalType = 2;
                psDecCtrl.pitchL[k2] = psDec.lagPrev;
            }
            if (signalType == 2) {
                lag = psDecCtrl.pitchL[k2];
                if (k2 == 0 || k2 == 2 && NLSF_interpolation_flag) {
                    int start_idx = psDec.ltp_mem_length - lag - psDec.LPC_order - 2;
                    Inlines.OpusAssert(start_idx > 0);
                    if (k2 == 2) {
                        System.arraycopy(xq2, xq_ptr, psDec.outBuf, psDec.ltp_mem_length, 2 * psDec.subfr_length);
                    }
                    Filters.silk_LPC_analysis_filter(sLTP, start_idx, psDec.outBuf, start_idx + k2 * psDec.subfr_length, A_Q12, 0, psDec.ltp_mem_length - start_idx, psDec.LPC_order);
                    if (k2 == 0) {
                        inv_gain_Q31 = Inlines.silk_LSHIFT(Inlines.silk_SMULWB(inv_gain_Q31, psDecCtrl.LTP_scale_Q14), 2);
                    }
                    for (i2 = 0; i2 < lag + 2; ++i2) {
                        sLTP_Q15[sLTP_buf_idx - i2 - 1] = Inlines.silk_SMULWB(inv_gain_Q31, sLTP[psDec.ltp_mem_length - i2 - 1]);
                    }
                } else if (gain_adj_Q16 != 65536) {
                    for (i2 = 0; i2 < lag + 2; ++i2) {
                        sLTP_Q15[sLTP_buf_idx - i2 - 1] = Inlines.silk_SMULWW(gain_adj_Q16, sLTP_Q15[sLTP_buf_idx - i2 - 1]);
                    }
                }
            }
            if (signalType == 2) {
                int pred_lag_ptr = sLTP_buf_idx - lag + 2;
                for (i2 = 0; i2 < psDec.subfr_length; ++i2) {
                    int LTP_pred_Q13 = 2;
                    LTP_pred_Q13 = Inlines.silk_SMLAWB(LTP_pred_Q13, sLTP_Q15[pred_lag_ptr], B_Q14[B_Q14_ptr]);
                    LTP_pred_Q13 = Inlines.silk_SMLAWB(LTP_pred_Q13, sLTP_Q15[pred_lag_ptr - 1], B_Q14[B_Q14_ptr + 1]);
                    LTP_pred_Q13 = Inlines.silk_SMLAWB(LTP_pred_Q13, sLTP_Q15[pred_lag_ptr - 2], B_Q14[B_Q14_ptr + 2]);
                    LTP_pred_Q13 = Inlines.silk_SMLAWB(LTP_pred_Q13, sLTP_Q15[pred_lag_ptr - 3], B_Q14[B_Q14_ptr + 3]);
                    LTP_pred_Q13 = Inlines.silk_SMLAWB(LTP_pred_Q13, sLTP_Q15[pred_lag_ptr - 4], B_Q14[B_Q14_ptr + 4]);
                    ++pred_lag_ptr;
                    pres_Q14[pres_Q14_ptr + i2] = Inlines.silk_ADD_LSHIFT32(psDec.exc_Q14[pexc_Q14 + i2], LTP_pred_Q13, 1);
                    sLTP_Q15[sLTP_buf_idx] = Inlines.silk_LSHIFT(pres_Q14[pres_Q14_ptr + i2], 1);
                    ++sLTP_buf_idx;
                }
            } else {
                pres_Q14 = psDec.exc_Q14;
                pres_Q14_ptr = pexc_Q14;
            }
            for (i2 = 0; i2 < psDec.subfr_length; ++i2) {
                Inlines.OpusAssert(psDec.LPC_order == 10 || psDec.LPC_order == 16);
                int LPC_pred_Q10 = Inlines.silk_RSHIFT(psDec.LPC_order, 1);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 1], A_Q12[0]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 2], A_Q12[1]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 3], A_Q12[2]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 4], A_Q12[3]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 5], A_Q12[4]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 6], A_Q12[5]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 7], A_Q12[6]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 8], A_Q12[7]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 9], A_Q12[8]);
                LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 10], A_Q12[9]);
                if (psDec.LPC_order == 16) {
                    LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 11], A_Q12[10]);
                    LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 12], A_Q12[11]);
                    LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 13], A_Q12[12]);
                    LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 14], A_Q12[13]);
                    LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 15], A_Q12[14]);
                    LPC_pred_Q10 = Inlines.silk_SMLAWB(LPC_pred_Q10, sLPC_Q14[16 + i2 - 16], A_Q12[15]);
                }
                sLPC_Q14[16 + i2] = Inlines.silk_ADD_LSHIFT32(pres_Q14[pres_Q14_ptr + i2], LPC_pred_Q10, 4);
                xq2[pxq + i2] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWW(sLPC_Q14[16 + i2], Gain_Q10), 8));
            }
            System.arraycopy(sLPC_Q14, psDec.subfr_length, sLPC_Q14, 0, 16);
            pexc_Q14 += psDec.subfr_length;
            pxq += psDec.subfr_length;
        }
        System.arraycopy(sLPC_Q14, 0, psDec.sLPC_Q14_buf, 0, 16);
    }
}

