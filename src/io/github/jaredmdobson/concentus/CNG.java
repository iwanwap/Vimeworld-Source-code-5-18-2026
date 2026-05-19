/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CNGState;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.NLSF;
import io.github.jaredmdobson.concentus.SilkChannelDecoder;
import io.github.jaredmdobson.concentus.SilkDecoderControl;

class CNG {
    CNG() {
    }

    static void silk_CNG_exc(int[] exc_Q10, int exc_Q10_ptr, int[] exc_buf_Q14, int Gain_Q16, int length, BoxedValueInt rand_seed) {
        int exc_mask = 255;
        while (exc_mask > length) {
            exc_mask = Inlines.silk_RSHIFT(exc_mask, 1);
        }
        int seed = rand_seed.Val;
        for (int i2 = exc_Q10_ptr; i2 < exc_Q10_ptr + length; ++i2) {
            int idx = Inlines.silk_RSHIFT(seed = Inlines.silk_RAND(seed), 24) & exc_mask;
            Inlines.OpusAssert(idx >= 0);
            Inlines.OpusAssert(idx <= 255);
            exc_Q10[i2] = (short)Inlines.silk_SAT16(Inlines.silk_SMULWW(exc_buf_Q14[idx], Gain_Q16 >> 4));
        }
        rand_seed.Val = seed;
    }

    static void silk_CNG_Reset(SilkChannelDecoder psDec) {
        int NLSF_step_Q15 = Inlines.silk_DIV32_16(Short.MAX_VALUE, (short)(psDec.LPC_order + 1));
        int NLSF_acc_Q15 = 0;
        for (int i2 = 0; i2 < psDec.LPC_order; ++i2) {
            psDec.sCNG.CNG_smth_NLSF_Q15[i2] = (short)(NLSF_acc_Q15 += NLSF_step_Q15);
        }
        psDec.sCNG.CNG_smth_Gain_Q16 = 0;
        psDec.sCNG.rand_seed = 3176576;
    }

    static void silk_CNG(SilkChannelDecoder psDec, SilkDecoderControl psDecCtrl, short[] frame, int frame_ptr, int length) {
        int i2;
        short[] A_Q12 = new short[psDec.LPC_order];
        CNGState psCNG = psDec.sCNG;
        if (psDec.fs_kHz != psCNG.fs_kHz) {
            CNG.silk_CNG_Reset(psDec);
            psCNG.fs_kHz = psDec.fs_kHz;
        }
        if (psDec.lossCnt == 0 && psDec.prevSignalType == 0) {
            for (i2 = 0; i2 < psDec.LPC_order; ++i2) {
                int n2 = i2;
                psCNG.CNG_smth_NLSF_Q15[n2] = (short)(psCNG.CNG_smth_NLSF_Q15[n2] + (short)Inlines.silk_SMULWB(psDec.prevNLSF_Q15[i2] - psCNG.CNG_smth_NLSF_Q15[i2], 16348));
            }
            int max_Gain_Q16 = 0;
            int subfr = 0;
            for (i2 = 0; i2 < psDec.nb_subfr; ++i2) {
                if (psDecCtrl.Gains_Q16[i2] <= max_Gain_Q16) continue;
                max_Gain_Q16 = psDecCtrl.Gains_Q16[i2];
                subfr = i2;
            }
            Arrays.MemMove(psCNG.CNG_exc_buf_Q14, 0, psDec.subfr_length, (psDec.nb_subfr - 1) * psDec.subfr_length);
            for (i2 = 0; i2 < psDec.nb_subfr; ++i2) {
                psCNG.CNG_smth_Gain_Q16 += Inlines.silk_SMULWB(psDecCtrl.Gains_Q16[i2] - psCNG.CNG_smth_Gain_Q16, 4634);
            }
        }
        if (psDec.lossCnt != 0) {
            int[] CNG_sig_Q10 = new int[length + 16];
            int gain_Q16 = Inlines.silk_SMULWW(psDec.sPLC.randScale_Q14, psDec.sPLC.prevGain_Q16[1]);
            if (gain_Q16 >= 0x200000 || psCNG.CNG_smth_Gain_Q16 > 0x800000) {
                gain_Q16 = Inlines.silk_SMULTT(gain_Q16, gain_Q16);
                gain_Q16 = Inlines.silk_SUB_LSHIFT32(Inlines.silk_SMULTT(psCNG.CNG_smth_Gain_Q16, psCNG.CNG_smth_Gain_Q16), gain_Q16, 5);
                gain_Q16 = Inlines.silk_LSHIFT32(Inlines.silk_SQRT_APPROX(gain_Q16), 16);
            } else {
                gain_Q16 = Inlines.silk_SMULWW(gain_Q16, gain_Q16);
                gain_Q16 = Inlines.silk_SUB_LSHIFT32(Inlines.silk_SMULWW(psCNG.CNG_smth_Gain_Q16, psCNG.CNG_smth_Gain_Q16), gain_Q16, 5);
                gain_Q16 = Inlines.silk_LSHIFT32(Inlines.silk_SQRT_APPROX(gain_Q16), 8);
            }
            BoxedValueInt boxed_rand_seed = new BoxedValueInt(psCNG.rand_seed);
            CNG.silk_CNG_exc(CNG_sig_Q10, 16, psCNG.CNG_exc_buf_Q14, gain_Q16, length, boxed_rand_seed);
            psCNG.rand_seed = boxed_rand_seed.Val;
            NLSF.silk_NLSF2A(A_Q12, psCNG.CNG_smth_NLSF_Q15, psDec.LPC_order);
            System.arraycopy(psCNG.CNG_synth_state, 0, CNG_sig_Q10, 0, 16);
            for (i2 = 0; i2 < length; ++i2) {
                int lpci = 16 + i2;
                Inlines.OpusAssert(psDec.LPC_order == 10 || psDec.LPC_order == 16);
                int sum_Q6 = Inlines.silk_RSHIFT(psDec.LPC_order, 1);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 1], A_Q12[0]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 2], A_Q12[1]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 3], A_Q12[2]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 4], A_Q12[3]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 5], A_Q12[4]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 6], A_Q12[5]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 7], A_Q12[6]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 8], A_Q12[7]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 9], A_Q12[8]);
                sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 10], A_Q12[9]);
                if (psDec.LPC_order == 16) {
                    sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 11], A_Q12[10]);
                    sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 12], A_Q12[11]);
                    sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 13], A_Q12[12]);
                    sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 14], A_Q12[13]);
                    sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 15], A_Q12[14]);
                    sum_Q6 = Inlines.silk_SMLAWB(sum_Q6, CNG_sig_Q10[lpci - 16], A_Q12[15]);
                }
                CNG_sig_Q10[lpci] = Inlines.silk_ADD_LSHIFT(CNG_sig_Q10[lpci], sum_Q6, 4);
                frame[frame_ptr + i2] = Inlines.silk_ADD_SAT16(frame[frame_ptr + i2], (short)Inlines.silk_RSHIFT_ROUND(CNG_sig_Q10[lpci], 10));
            }
            System.arraycopy(CNG_sig_Q10, length, psCNG.CNG_synth_state, 0, 16);
        } else {
            Arrays.MemSet(psCNG.CNG_synth_state, 0, psDec.LPC_order);
        }
    }
}

