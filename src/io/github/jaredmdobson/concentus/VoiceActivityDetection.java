/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Filters;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Sigmoid;
import io.github.jaredmdobson.concentus.SilkChannelEncoder;
import io.github.jaredmdobson.concentus.SilkVADState;

class VoiceActivityDetection {
    private static final int[] tiltWeights = new int[]{30000, 6000, -12000, -12000};

    VoiceActivityDetection() {
    }

    static int silk_VAD_Init(SilkVADState psSilk_VAD) {
        int b2;
        int ret = 0;
        psSilk_VAD.Reset();
        for (b2 = 0; b2 < 4; ++b2) {
            psSilk_VAD.NoiseLevelBias[b2] = Inlines.silk_max_32(Inlines.silk_DIV32_16(50, (short)(b2 + 1)), 1);
        }
        for (b2 = 0; b2 < 4; ++b2) {
            psSilk_VAD.NL[b2] = Inlines.silk_MUL(100, psSilk_VAD.NoiseLevelBias[b2]);
            psSilk_VAD.inv_NL[b2] = Inlines.silk_DIV32(Integer.MAX_VALUE, psSilk_VAD.NL[b2]);
        }
        psSilk_VAD.counter = 15;
        for (b2 = 0; b2 < 4; ++b2) {
            psSilk_VAD.NrgRatioSmth_Q8[b2] = 25600;
        }
        return ret;
    }

    static int silk_VAD_GetSA_Q8(SilkChannelEncoder psEncC, short[] pIn, int pIn_ptr) {
        int SNR_Q7;
        int speech_nrg;
        int b2;
        int i2;
        int sumSquared = 0;
        int[] Xnrg = new int[4];
        int[] NrgToNoiseRatio_Q8 = new int[4];
        int[] X_offset = new int[4];
        int ret = 0;
        SilkVADState psSilk_VAD = psEncC.sVAD;
        Inlines.OpusAssert(true);
        Inlines.OpusAssert(320 >= psEncC.frame_length);
        Inlines.OpusAssert(psEncC.frame_length <= 512);
        Inlines.OpusAssert(psEncC.frame_length == 8 * Inlines.silk_RSHIFT(psEncC.frame_length, 3));
        int decimated_framelength1 = Inlines.silk_RSHIFT(psEncC.frame_length, 1);
        int decimated_framelength2 = Inlines.silk_RSHIFT(psEncC.frame_length, 2);
        int decimated_framelength = Inlines.silk_RSHIFT(psEncC.frame_length, 3);
        X_offset[0] = 0;
        X_offset[1] = decimated_framelength + decimated_framelength2;
        X_offset[2] = X_offset[1] + decimated_framelength;
        X_offset[3] = X_offset[2] + decimated_framelength2;
        short[] X2 = new short[X_offset[3] + decimated_framelength1];
        Filters.silk_ana_filt_bank_1(pIn, pIn_ptr, psSilk_VAD.AnaState, X2, X2, X_offset[3], psEncC.frame_length);
        Filters.silk_ana_filt_bank_1(X2, 0, psSilk_VAD.AnaState1, X2, X2, X_offset[2], decimated_framelength1);
        Filters.silk_ana_filt_bank_1(X2, 0, psSilk_VAD.AnaState2, X2, X2, X_offset[1], decimated_framelength2);
        X2[decimated_framelength - 1] = (short)Inlines.silk_RSHIFT(X2[decimated_framelength - 1], 1);
        short HPstateTmp = X2[decimated_framelength - 1];
        for (i2 = decimated_framelength - 1; i2 > 0; --i2) {
            X2[i2 - 1] = (short)Inlines.silk_RSHIFT(X2[i2 - 1], 1);
            int n2 = i2;
            X2[n2] = (short)(X2[n2] - X2[i2 - 1]);
        }
        X2[0] = (short)(X2[0] - psSilk_VAD.HPstate);
        psSilk_VAD.HPstate = HPstateTmp;
        for (b2 = 0; b2 < 4; ++b2) {
            decimated_framelength = Inlines.silk_RSHIFT(psEncC.frame_length, Inlines.silk_min_int(4 - b2, 3));
            int dec_subframe_length = Inlines.silk_RSHIFT(decimated_framelength, 2);
            int dec_subframe_offset = 0;
            Xnrg[b2] = psSilk_VAD.XnrgSubfr[b2];
            for (int s2 = 0; s2 < 4; ++s2) {
                sumSquared = 0;
                for (i2 = 0; i2 < dec_subframe_length; ++i2) {
                    int x_tmp = Inlines.silk_RSHIFT(X2[X_offset[b2] + i2 + dec_subframe_offset], 3);
                    Inlines.OpusAssert((sumSquared = Inlines.silk_SMLABB(sumSquared, x_tmp, x_tmp)) >= 0);
                }
                Xnrg[b2] = s2 < 3 ? Inlines.silk_ADD_POS_SAT32(Xnrg[b2], sumSquared) : Inlines.silk_ADD_POS_SAT32(Xnrg[b2], Inlines.silk_RSHIFT(sumSquared, 1));
                dec_subframe_offset += dec_subframe_length;
            }
            psSilk_VAD.XnrgSubfr[b2] = sumSquared;
        }
        VoiceActivityDetection.silk_VAD_GetNoiseLevels(Xnrg, psSilk_VAD);
        sumSquared = 0;
        int input_tilt = 0;
        for (b2 = 0; b2 < 4; ++b2) {
            speech_nrg = Xnrg[b2] - psSilk_VAD.NL[b2];
            if (speech_nrg > 0) {
                NrgToNoiseRatio_Q8[b2] = (Xnrg[b2] & 0xFF800000) == 0 ? Inlines.silk_DIV32(Inlines.silk_LSHIFT(Xnrg[b2], 8), psSilk_VAD.NL[b2] + 1) : Inlines.silk_DIV32(Xnrg[b2], Inlines.silk_RSHIFT(psSilk_VAD.NL[b2], 8) + 1);
                SNR_Q7 = Inlines.silk_lin2log(NrgToNoiseRatio_Q8[b2]) - 1024;
                sumSquared = Inlines.silk_SMLABB(sumSquared, SNR_Q7, SNR_Q7);
                if (speech_nrg < 0x100000) {
                    SNR_Q7 = Inlines.silk_SMULWB(Inlines.silk_LSHIFT(Inlines.silk_SQRT_APPROX(speech_nrg), 6), SNR_Q7);
                }
                input_tilt = Inlines.silk_SMLAWB(input_tilt, tiltWeights[b2], SNR_Q7);
                continue;
            }
            NrgToNoiseRatio_Q8[b2] = 256;
        }
        sumSquared = Inlines.silk_DIV32_16(sumSquared, 4);
        short pSNR_dB_Q7 = (short)(3 * Inlines.silk_SQRT_APPROX(sumSquared));
        int SA_Q15 = Sigmoid.silk_sigm_Q15(Inlines.silk_SMULWB(45000, pSNR_dB_Q7) - 128);
        psEncC.input_tilt_Q15 = Inlines.silk_LSHIFT(Sigmoid.silk_sigm_Q15(input_tilt) - 16384, 1);
        speech_nrg = 0;
        for (b2 = 0; b2 < 4; ++b2) {
            speech_nrg += (b2 + 1) * Inlines.silk_RSHIFT(Xnrg[b2] - psSilk_VAD.NL[b2], 4);
        }
        if (speech_nrg <= 0) {
            SA_Q15 = Inlines.silk_RSHIFT(SA_Q15, 1);
        } else if (speech_nrg < 32768) {
            speech_nrg = psEncC.frame_length == 10 * psEncC.fs_kHz ? Inlines.silk_LSHIFT_SAT32(speech_nrg, 16) : Inlines.silk_LSHIFT_SAT32(speech_nrg, 15);
            speech_nrg = Inlines.silk_SQRT_APPROX(speech_nrg);
            SA_Q15 = Inlines.silk_SMULWB(32768 + speech_nrg, SA_Q15);
        }
        psEncC.speech_activity_Q8 = Inlines.silk_min_int(Inlines.silk_RSHIFT(SA_Q15, 7), 255);
        int smooth_coef_Q16 = Inlines.silk_SMULWB(4096, Inlines.silk_SMULWB(SA_Q15, SA_Q15));
        if (psEncC.frame_length == 10 * psEncC.fs_kHz) {
            smooth_coef_Q16 >>= 1;
        }
        for (b2 = 0; b2 < 4; ++b2) {
            psSilk_VAD.NrgRatioSmth_Q8[b2] = Inlines.silk_SMLAWB(psSilk_VAD.NrgRatioSmth_Q8[b2], NrgToNoiseRatio_Q8[b2] - psSilk_VAD.NrgRatioSmth_Q8[b2], smooth_coef_Q16);
            SNR_Q7 = 3 * (Inlines.silk_lin2log(psSilk_VAD.NrgRatioSmth_Q8[b2]) - 1024);
            psEncC.input_quality_bands_Q15[b2] = Sigmoid.silk_sigm_Q15(Inlines.silk_RSHIFT(SNR_Q7 - 2048, 4));
        }
        return ret;
    }

    static void silk_VAD_GetNoiseLevels(int[] pX2, SilkVADState psSilk_VAD) {
        int min_coef = psSilk_VAD.counter < 1000 ? Inlines.silk_DIV32_16(Short.MAX_VALUE, (short)(Inlines.silk_RSHIFT(psSilk_VAD.counter, 4) + 1)) : 0;
        for (int k2 = 0; k2 < 4; ++k2) {
            int nl2 = psSilk_VAD.NL[k2];
            Inlines.OpusAssert(nl2 >= 0);
            int nrg = Inlines.silk_ADD_POS_SAT32(pX2[k2], psSilk_VAD.NoiseLevelBias[k2]);
            Inlines.OpusAssert(nrg > 0);
            int inv_nrg = Inlines.silk_DIV32(Integer.MAX_VALUE, nrg);
            Inlines.OpusAssert(inv_nrg >= 0);
            int coef = nrg > Inlines.silk_LSHIFT(nl2, 3) ? 128 : (nrg < nl2 ? 1024 : Inlines.silk_SMULWB(Inlines.silk_SMULWW(inv_nrg, nl2), 2048));
            coef = Inlines.silk_max_int(coef, min_coef);
            psSilk_VAD.inv_NL[k2] = Inlines.silk_SMLAWB(psSilk_VAD.inv_NL[k2], inv_nrg - psSilk_VAD.inv_NL[k2], coef);
            Inlines.OpusAssert(psSilk_VAD.inv_NL[k2] >= 0);
            nl2 = Inlines.silk_DIV32(Integer.MAX_VALUE, psSilk_VAD.inv_NL[k2]);
            Inlines.OpusAssert(nl2 >= 0);
            psSilk_VAD.NL[k2] = nl2 = Inlines.silk_min(nl2, 0xFFFFFF);
        }
        ++psSilk_VAD.counter;
    }
}

