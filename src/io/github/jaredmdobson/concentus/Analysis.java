/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.AnalysisInfo;
import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.Downmix;
import io.github.jaredmdobson.concentus.FFTState;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.KissFFT;
import io.github.jaredmdobson.concentus.MultiLayerPerceptron;
import io.github.jaredmdobson.concentus.OpusTables;
import io.github.jaredmdobson.concentus.TonalityAnalysisState;

class Analysis {
    private static final double M_PI = 3.141592653;
    private static final float cA = 0.43157974f;
    private static final float cB = 0.678484f;
    private static final float cC = 0.08595542f;
    private static final float cE = 1.5707964f;
    private static final int NB_TONAL_SKIP_BANDS = 9;

    Analysis() {
    }

    static float fast_atan2f(float y2, float x2) {
        float y22;
        float x22;
        if (Inlines.ABS16(x2) + Inlines.ABS16(y2) < 1.0E-9f) {
            x2 *= 1.0E12f;
            y2 *= 1.0E12f;
        }
        if ((x22 = x2 * x2) < (y22 = y2 * y2)) {
            float den = (y22 + 0.678484f * x22) * (y22 + 0.08595542f * x22);
            if (den != 0.0f) {
                return -x2 * y2 * (y22 + 0.43157974f * x22) / den + (y2 < 0.0f ? -1.5707964f : 1.5707964f);
            }
            return y2 < 0.0f ? -1.5707964f : 1.5707964f;
        }
        float den = (x22 + 0.678484f * y22) * (x22 + 0.08595542f * y22);
        if (den != 0.0f) {
            return x2 * y2 * (x22 + 0.43157974f * y22) / den + (y2 < 0.0f ? -1.5707964f : 1.5707964f) - (x2 * y2 < 0.0f ? -1.5707964f : 1.5707964f);
        }
        return (y2 < 0.0f ? -1.5707964f : 1.5707964f) - (x2 * y2 < 0.0f ? -1.5707964f : 1.5707964f);
    }

    static void tonality_analysis_init(TonalityAnalysisState tonal) {
        tonal.Reset();
    }

    static void tonality_get_info(TonalityAnalysisState tonal, AnalysisInfo info_out, int len) {
        int i2;
        int pos = tonal.read_pos;
        int curr_lookahead = tonal.write_pos - tonal.read_pos;
        if (curr_lookahead < 0) {
            curr_lookahead += 200;
        }
        if (len > 480 && pos != tonal.write_pos && ++pos == 200) {
            pos = 0;
        }
        if (pos == tonal.write_pos) {
            --pos;
        }
        if (pos < 0) {
            pos = 199;
        }
        info_out.Assign(tonal.info[pos]);
        tonal.read_subframe += len / 120;
        while (tonal.read_subframe >= 4) {
            tonal.read_subframe -= 4;
            ++tonal.read_pos;
        }
        if (tonal.read_pos >= 200) {
            tonal.read_pos -= 200;
        }
        curr_lookahead = Inlines.IMAX(curr_lookahead - 10, 0);
        float psum = 0.0f;
        for (i2 = 0; i2 < 200 - curr_lookahead; ++i2) {
            psum += tonal.pmusic[i2];
        }
        while (i2 < 200) {
            psum += tonal.pspeech[i2];
            ++i2;
        }
        info_out.music_prob = psum = psum * tonal.music_confidence + (1.0f - psum) * tonal.speech_confidence;
    }

    static void tonality_analysis(TonalityAnalysisState tonal, CeltMode celt_mode, short[] x2, int x_ptr, int len, int offset, int c1, int c2, int C2, int lsb_depth) {
        float E2;
        int b2;
        int i2;
        int N2 = 480;
        int N22 = 240;
        float[] A2 = tonal.angle;
        float[] dA = tonal.d_angle;
        float[] d2A = tonal.d2_angle;
        float[] band_tonality = new float[18];
        float[] logE = new float[18];
        float[] BFCC = new float[8];
        float[] features = new float[25];
        float pi4 = 97.40909f;
        float slope = 0.0f;
        float[] frame_probs = new float[2];
        int bandwidth = 0;
        float maxE = 0.0f;
        ++tonal.last_transition;
        float alpha = 1.0f / (float)Inlines.IMIN(20, 1 + tonal.count);
        float alphaE = 1.0f / (float)Inlines.IMIN(50, 1 + tonal.count);
        float alphaE2 = 1.0f / (float)Inlines.IMIN(1000, 1 + tonal.count);
        if (tonal.count < 4) {
            tonal.music_prob = 0.5f;
        }
        FFTState kfft = celt_mode.mdct.kfft[0];
        if (tonal.count == 0) {
            tonal.mem_fill = 240;
        }
        Downmix.downmix_int(x2, x_ptr, tonal.inmem, tonal.mem_fill, Inlines.IMIN(len, 720 - tonal.mem_fill), offset, c1, c2, C2);
        if (tonal.mem_fill + len < 720) {
            tonal.mem_fill += len;
            return;
        }
        AnalysisInfo info = tonal.info[tonal.write_pos++];
        if (tonal.write_pos >= 200) {
            tonal.write_pos -= 200;
        }
        int[] input = new int[960];
        int[] output = new int[960];
        float[] tonality = new float[240];
        float[] noisiness = new float[240];
        for (i2 = 0; i2 < N22; ++i2) {
            float w2 = OpusTables.analysis_window[i2];
            input[2 * i2] = (int)(w2 * (float)tonal.inmem[i2]);
            input[2 * i2 + 1] = (int)(w2 * (float)tonal.inmem[N22 + i2]);
            input[2 * (N2 - i2 - 1)] = (int)(w2 * (float)tonal.inmem[N2 - i2 - 1]);
            input[2 * (N2 - i2 - 1) + 1] = (int)(w2 * (float)tonal.inmem[N2 + N22 - i2 - 1]);
        }
        Arrays.MemMove(tonal.inmem, 480, 0, 240);
        int remaining = len - (720 - tonal.mem_fill);
        Downmix.downmix_int(x2, x_ptr, tonal.inmem, 240, remaining, offset + 720 - tonal.mem_fill, c1, c2, C2);
        tonal.mem_fill = 240 + remaining;
        KissFFT.opus_fft(kfft, input, output);
        for (i2 = 1; i2 < N22; ++i2) {
            float X1r = (float)output[2 * i2] + (float)output[2 * (N2 - i2)];
            float X1i = (float)output[2 * i2 + 1] - (float)output[2 * (N2 - i2) + 1];
            float X2r = (float)output[2 * i2 + 1] + (float)output[2 * (N2 - i2) + 1];
            float X2i = (float)output[2 * (N2 - i2)] - (float)output[2 * i2];
            float angle = 0.15915494f * Analysis.fast_atan2f(X1i, X1r);
            float d_angle = angle - A2[i2];
            float d2_angle = d_angle - dA[i2];
            float angle2 = 0.15915494f * Analysis.fast_atan2f(X2i, X2r);
            float d_angle2 = angle2 - angle;
            float d2_angle2 = d_angle2 - d_angle;
            float mod1 = d2_angle - (float)Math.floor(0.5f + d2_angle);
            noisiness[i2] = Inlines.ABS16(mod1);
            mod1 *= mod1;
            mod1 *= mod1;
            float mod2 = d2_angle2 - (float)Math.floor(0.5f + d2_angle2);
            int n2 = i2;
            noisiness[n2] = noisiness[n2] + Inlines.ABS16(mod2);
            mod2 *= mod2;
            mod2 *= mod2;
            float avg_mod = 0.25f * (d2A[i2] + 2.0f * mod1 + mod2);
            tonality[i2] = 1.0f / (1.0f + 640.0f * pi4 * avg_mod) - 0.015f;
            A2[i2] = angle2;
            dA[i2] = d_angle2;
            d2A[i2] = mod2;
        }
        float frame_tonality = 0.0f;
        float max_frame_tonality = 0.0f;
        info.activity = 0.0f;
        float frame_noisiness = 0.0f;
        float frame_stationarity = 0.0f;
        if (tonal.count == 0) {
            for (b2 = 0; b2 < 18; ++b2) {
                tonal.lowE[b2] = 1.0E10f;
                tonal.highE[b2] = -1.0E10f;
            }
        }
        float relativeE = 0.0f;
        float frame_loudness = 0.0f;
        for (b2 = 0; b2 < 18; ++b2) {
            E2 = 0.0f;
            float tE2 = 0.0f;
            float nE = 0.0f;
            for (i2 = OpusTables.tbands[b2]; i2 < OpusTables.tbands[b2 + 1]; ++i2) {
                float binE = (float)output[2 * i2] * (float)output[2 * i2] + (float)output[2 * (N2 - i2)] * (float)output[2 * (N2 - i2)] + (float)output[2 * i2 + 1] * (float)output[2 * i2 + 1] + (float)output[2 * (N2 - i2) + 1] * (float)output[2 * (N2 - i2) + 1];
                E2 += (binE *= 5.55E-17f);
                tE2 += binE * tonality[i2];
                nE += binE * 2.0f * (0.5f - noisiness[i2]);
            }
            tonal.E[tonal.E_count][b2] = E2;
            frame_noisiness += nE / (1.0E-15f + E2);
            frame_loudness += (float)Math.sqrt(E2 + 1.0E-10f);
            logE[b2] = (float)Math.log(E2 + 1.0E-10f);
            tonal.lowE[b2] = Inlines.MIN32(logE[b2], tonal.lowE[b2] + 0.01f);
            tonal.highE[b2] = Inlines.MAX32(logE[b2], tonal.highE[b2] - 0.1f);
            if (tonal.highE[b2] < tonal.lowE[b2] + 1.0f) {
                int n3 = b2;
                tonal.highE[n3] = tonal.highE[n3] + 0.5f;
                int n4 = b2;
                tonal.lowE[n4] = tonal.lowE[n4] - 0.5f;
            }
            relativeE += (logE[b2] - tonal.lowE[b2]) / (1.0E-15f + tonal.highE[b2] - tonal.lowE[b2]);
            float L2 = 0.0f;
            float L1 = 0.0f;
            for (i2 = 0; i2 < 8; ++i2) {
                L1 += (float)Math.sqrt(tonal.E[i2][b2]);
                L2 += tonal.E[i2][b2];
            }
            float stationarity = Inlines.MIN16(0.99f, L1 / (float)Math.sqrt(1.0E-15 + (double)(8.0f * L2)));
            stationarity *= stationarity;
            stationarity *= stationarity;
            frame_stationarity += stationarity;
            band_tonality[b2] = Inlines.MAX16(tE2 / (1.0E-15f + E2), stationarity * tonal.prev_band_tonality[b2]);
            frame_tonality += band_tonality[b2];
            if (b2 >= 9) {
                frame_tonality -= band_tonality[b2 - 18 + 9];
            }
            max_frame_tonality = Inlines.MAX16(max_frame_tonality, (1.0f + 0.03f * (float)(b2 - 18)) * frame_tonality);
            slope += band_tonality[b2] * (float)(b2 - 8);
            tonal.prev_band_tonality[b2] = band_tonality[b2];
        }
        float bandwidth_mask = 0.0f;
        bandwidth = 0;
        maxE = 0.0f;
        float noise_floor = 5.7E-4f / (float)(1 << Inlines.IMAX(0, lsb_depth - 8));
        noise_floor *= 1.3421773E8f;
        noise_floor *= noise_floor;
        for (b2 = 0; b2 < 21; ++b2) {
            E2 = 0.0f;
            int band_start = OpusTables.extra_bands[b2];
            int band_end = OpusTables.extra_bands[b2 + 1];
            for (i2 = band_start; i2 < band_end; ++i2) {
                float binE = (float)output[2 * i2] * (float)output[2 * i2] + (float)output[2 * (N2 - i2)] * (float)output[2 * (N2 - i2)] + (float)output[2 * i2 + 1] * (float)output[2 * i2 + 1] + (float)output[2 * (N2 - i2) + 1] * (float)output[2 * (N2 - i2) + 1];
                E2 += binE;
            }
            maxE = Inlines.MAX32(maxE, E2);
            tonal.meanE[b2] = Inlines.MAX32((1.0f - alphaE2) * tonal.meanE[b2], E2);
            if (!((double)(E2 = Inlines.MAX32(E2, tonal.meanE[b2])) > 0.1 * (double)(bandwidth_mask = Inlines.MAX32(0.05f * bandwidth_mask, E2))) || !(E2 * 1.0E9f > maxE) || !(E2 > noise_floor * (float)(band_end - band_start))) continue;
            bandwidth = b2;
        }
        if (tonal.count <= 2) {
            bandwidth = 20;
        }
        frame_loudness = 20.0f * (float)Math.log10(frame_loudness);
        tonal.Etracker = Inlines.MAX32(tonal.Etracker - 0.03f, frame_loudness);
        tonal.lowECount *= 1.0f - alphaE;
        if (frame_loudness < tonal.Etracker - 30.0f) {
            tonal.lowECount += alphaE;
        }
        for (i2 = 0; i2 < 8; ++i2) {
            float sum = 0.0f;
            for (b2 = 0; b2 < 16; ++b2) {
                sum += OpusTables.dct_table[i2 * 16 + b2] * logE[b2];
            }
            BFCC[i2] = sum;
        }
        frame_stationarity /= 18.0f;
        relativeE /= 18.0f;
        if (tonal.count < 10) {
            relativeE = 0.5f;
        }
        info.activity = (frame_noisiness /= 18.0f) + (1.0f - frame_noisiness) * relativeE;
        frame_tonality = max_frame_tonality / 9.0f;
        tonal.prev_tonality = frame_tonality = Inlines.MAX16(frame_tonality, tonal.prev_tonality * 0.8f);
        info.tonality_slope = slope /= 64.0f;
        tonal.E_count = (tonal.E_count + 1) % 8;
        ++tonal.count;
        info.tonality = frame_tonality;
        for (i2 = 0; i2 < 4; ++i2) {
            features[i2] = -0.12299f * (BFCC[i2] + tonal.mem[i2 + 24]) + 0.49195f * (tonal.mem[i2] + tonal.mem[i2 + 16]) + 0.69693f * tonal.mem[i2 + 8] - 1.4349f * tonal.cmean[i2];
        }
        for (i2 = 0; i2 < 4; ++i2) {
            tonal.cmean[i2] = (1.0f - alpha) * tonal.cmean[i2] + alpha * BFCC[i2];
        }
        for (i2 = 0; i2 < 4; ++i2) {
            features[4 + i2] = 0.63246f * (BFCC[i2] - tonal.mem[i2 + 24]) + 0.31623f * (tonal.mem[i2] - tonal.mem[i2 + 16]);
        }
        for (i2 = 0; i2 < 3; ++i2) {
            features[8 + i2] = 0.53452f * (BFCC[i2] + tonal.mem[i2 + 24]) - 0.26726f * (tonal.mem[i2] + tonal.mem[i2 + 16]) - 0.53452f * tonal.mem[i2 + 8];
        }
        if (tonal.count > 5) {
            for (i2 = 0; i2 < 9; ++i2) {
                tonal.std[i2] = (1.0f - alpha) * tonal.std[i2] + alpha * features[i2] * features[i2];
            }
        }
        for (i2 = 0; i2 < 8; ++i2) {
            tonal.mem[i2 + 24] = tonal.mem[i2 + 16];
            tonal.mem[i2 + 16] = tonal.mem[i2 + 8];
            tonal.mem[i2 + 8] = tonal.mem[i2];
            tonal.mem[i2] = BFCC[i2];
        }
        for (i2 = 0; i2 < 9; ++i2) {
            features[11 + i2] = (float)Math.sqrt(tonal.std[i2]);
        }
        features[20] = info.tonality;
        features[21] = info.activity;
        features[22] = frame_stationarity;
        features[23] = info.tonality_slope;
        features[24] = tonal.lowECount;
        if (info.enabled) {
            MultiLayerPerceptron.mlp_process(OpusTables.net, features, frame_probs);
            frame_probs[0] = 0.5f * (frame_probs[0] + 1.0f);
            frame_probs[0] = 0.01f + 1.21f * frame_probs[0] * frame_probs[0] - 0.23f * (float)Math.pow(frame_probs[0], 10.0);
            frame_probs[1] = 0.5f * frame_probs[1] + 0.5f;
            frame_probs[0] = frame_probs[1] * frame_probs[0] + (1.0f - frame_probs[1]) * 0.5f;
            float tau = 5.0E-5f * frame_probs[1];
            float beta = 0.05f;
            float p2 = Inlines.MAX16(0.05f, Inlines.MIN16(0.95f, frame_probs[0]));
            float q2 = Inlines.MAX16(0.05f, Inlines.MIN16(0.95f, tonal.music_prob));
            beta = 0.01f + 0.05f * Inlines.ABS16(p2 - q2) / (p2 * (1.0f - q2) + q2 * (1.0f - p2));
            float p0 = (1.0f - tonal.music_prob) * (1.0f - tau) + tonal.music_prob * tau;
            float p1 = tonal.music_prob * (1.0f - tau) + (1.0f - tonal.music_prob) * tau;
            info.music_prob = tonal.music_prob = (p1 *= (float)Math.pow(frame_probs[0], beta)) / ((p0 *= (float)Math.pow(1.0f - frame_probs[0], beta)) + p1);
            float psum = 1.0E-20f;
            float speech0 = (float)Math.pow(1.0f - frame_probs[0], beta);
            float music0 = (float)Math.pow(frame_probs[0], beta);
            if (tonal.count == 1) {
                tonal.pspeech[0] = 0.5f;
                tonal.pmusic[0] = 0.5f;
            }
            float s0 = tonal.pspeech[0] + tonal.pspeech[1];
            float m0 = tonal.pmusic[0] + tonal.pmusic[1];
            tonal.pspeech[0] = s0 * (1.0f - tau) * speech0;
            tonal.pmusic[0] = m0 * (1.0f - tau) * music0;
            for (i2 = 1; i2 < 199; ++i2) {
                tonal.pspeech[i2] = tonal.pspeech[i2 + 1] * speech0;
                tonal.pmusic[i2] = tonal.pmusic[i2 + 1] * music0;
            }
            tonal.pspeech[199] = m0 * tau * speech0;
            tonal.pmusic[199] = s0 * tau * music0;
            for (i2 = 0; i2 < 200; ++i2) {
                psum += tonal.pspeech[i2] + tonal.pmusic[i2];
            }
            psum = 1.0f / psum;
            i2 = 0;
            while (i2 < 200) {
                int n5 = i2;
                tonal.pspeech[n5] = tonal.pspeech[n5] * psum;
                int n6 = i2++;
                tonal.pmusic[n6] = tonal.pmusic[n6] * psum;
            }
            psum = tonal.pmusic[0];
            for (i2 = 1; i2 < 200; ++i2) {
                psum += tonal.pspeech[i2];
            }
            if ((double)frame_probs[1] > 0.75) {
                float adapt;
                if ((double)tonal.music_prob > 0.9) {
                    adapt = 1.0f / (float)(++tonal.music_confidence_count);
                    tonal.music_confidence_count = Inlines.IMIN(tonal.music_confidence_count, 500);
                    tonal.music_confidence += adapt * Inlines.MAX16(-0.2f, frame_probs[0] - tonal.music_confidence);
                }
                if ((double)tonal.music_prob < 0.1) {
                    adapt = 1.0f / (float)(++tonal.speech_confidence_count);
                    tonal.speech_confidence_count = Inlines.IMIN(tonal.speech_confidence_count, 500);
                    tonal.speech_confidence += adapt * Inlines.MIN16(0.2f, frame_probs[0] - tonal.speech_confidence);
                }
            } else {
                if (tonal.music_confidence_count == 0) {
                    tonal.music_confidence = 0.9f;
                }
                if (tonal.speech_confidence_count == 0) {
                    tonal.speech_confidence = 0.1f;
                }
            }
            if (tonal.last_music != (tonal.music_prob > 0.5f ? 1 : 0)) {
                tonal.last_transition = 0;
            }
            tonal.last_music = tonal.music_prob > 0.5f ? 1 : 0;
        } else {
            info.music_prob = 0.0f;
        }
        info.bandwidth = bandwidth;
        info.noisiness = frame_noisiness;
        info.valid = 1;
    }

    static void run_analysis(TonalityAnalysisState analysis, CeltMode celt_mode, short[] analysis_pcm, int analysis_pcm_ptr, int analysis_frame_size, int frame_size, int c1, int c2, int C2, int Fs2, int lsb_depth, AnalysisInfo analysis_info) {
        if (analysis_pcm != null) {
            analysis_frame_size = Inlines.IMIN(195 * Fs2 / 100, analysis_frame_size);
            int pcm_len = analysis_frame_size - analysis.analysis_offset;
            int offset = analysis.analysis_offset;
            do {
                Analysis.tonality_analysis(analysis, celt_mode, analysis_pcm, analysis_pcm_ptr, Inlines.IMIN(480, pcm_len), offset, c1, c2, C2, lsb_depth);
                offset += 480;
            } while ((pcm_len -= 480) > 0);
            analysis.analysis_offset = analysis_frame_size;
            analysis.analysis_offset -= frame_size;
        }
        analysis_info.valid = 0;
        Analysis.tonality_get_info(analysis, analysis_info, frame_size);
    }
}

