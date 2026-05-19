/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Downmix;
import io.github.jaredmdobson.concentus.Filters;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.OpusBandwidth;
import io.github.jaredmdobson.concentus.OpusBandwidthHelpers;
import io.github.jaredmdobson.concentus.OpusFramesize;
import io.github.jaredmdobson.concentus.OpusFramesizeHelpers;
import io.github.jaredmdobson.concentus.OpusMode;
import io.github.jaredmdobson.concentus.StereoWidthState;

public class CodecHelpers {
    private static final int MAX_DYNAMIC_FRAMESIZE = 24;

    static byte gen_toc(OpusMode mode, int framerate, OpusBandwidth bandwidth, int channels) {
        int toc;
        int period = 0;
        while (framerate < 400) {
            framerate <<= 1;
            ++period;
        }
        if (mode == OpusMode.MODE_SILK_ONLY) {
            toc = (short)(OpusBandwidthHelpers.GetOrdinal(bandwidth) - OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND) << 5);
            toc = (short)(toc | (short)(period - 2 << 3));
        } else if (mode == OpusMode.MODE_CELT_ONLY) {
            int tmp = OpusBandwidthHelpers.GetOrdinal(bandwidth) - OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND);
            if (tmp < 0) {
                tmp = 0;
            }
            toc = 128;
            toc = (short)(toc | (short)(tmp << 5));
            toc = (short)(toc | (short)(period << 3));
        } else {
            toc = 96;
            toc = (short)(toc | (short)(OpusBandwidthHelpers.GetOrdinal(bandwidth) - OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND) << 4));
            toc = (short)(toc | (short)(period - 2 << 3));
        }
        toc = (short)(toc | (short)((channels == 2 ? 1 : 0) << 2));
        return (byte)(0xFF & toc);
    }

    static void hp_cutoff(short[] input, int input_ptr, int cutoff_Hz, short[] output, int output_ptr, int[] hp_mem, int len, int channels, int Fs2) {
        int r_Q28;
        int[] B_Q28 = new int[3];
        int[] A_Q28 = new int[2];
        Inlines.OpusAssert(cutoff_Hz <= 869074);
        int Fc_Q19 = Inlines.silk_DIV32_16(Inlines.silk_SMULBB(2471, cutoff_Hz), Fs2 / 1000);
        Inlines.OpusAssert(Fc_Q19 > 0 && Fc_Q19 < 32768);
        B_Q28[0] = r_Q28 = 0x10000000 - Inlines.silk_MUL(471, Fc_Q19);
        B_Q28[1] = Inlines.silk_LSHIFT(-r_Q28, 1);
        B_Q28[2] = r_Q28;
        int r_Q22 = Inlines.silk_RSHIFT(r_Q28, 6);
        A_Q28[0] = Inlines.silk_SMULWW(r_Q22, Inlines.silk_SMULWW(Fc_Q19, Fc_Q19) - 0x800000);
        A_Q28[1] = Inlines.silk_SMULWW(r_Q22, r_Q22);
        Filters.silk_biquad_alt(input, input_ptr, B_Q28, A_Q28, hp_mem, 0, output, output_ptr, len, channels);
        if (channels == 2) {
            Filters.silk_biquad_alt(input, input_ptr + 1, B_Q28, A_Q28, hp_mem, 2, output, output_ptr + 1, len, channels);
        }
    }

    static void dc_reject(short[] input, int input_ptr, int cutoff_Hz, short[] output, int output_ptr, int[] hp_mem, int len, int channels, int Fs2) {
        int shift = Inlines.celt_ilog2(Fs2 / (cutoff_Hz * 3));
        for (int c2 = 0; c2 < channels; ++c2) {
            for (int i2 = 0; i2 < len; ++i2) {
                int x2 = Inlines.SHL32(Inlines.EXTEND32(input[channels * i2 + c2 + input_ptr]), 15);
                int tmp = x2 - hp_mem[2 * c2];
                hp_mem[2 * c2] = hp_mem[2 * c2] + Inlines.PSHR32(x2 - hp_mem[2 * c2], shift);
                int y2 = tmp - hp_mem[2 * c2 + 1];
                hp_mem[2 * c2 + 1] = hp_mem[2 * c2 + 1] + Inlines.PSHR32(tmp - hp_mem[2 * c2 + 1], shift);
                output[channels * i2 + c2 + output_ptr] = Inlines.EXTRACT16(Inlines.SATURATE(Inlines.PSHR32(y2, 15), Short.MAX_VALUE));
            }
        }
    }

    static void stereo_fade(short[] pcm_buf, int g1, int g2, int overlap48, int frame_size, int channels, int[] window, int Fs2) {
        int diff;
        int i2;
        int inc = 48000 / Fs2;
        int overlap = overlap48 / inc;
        g1 = Short.MAX_VALUE - g1;
        g2 = Short.MAX_VALUE - g2;
        for (i2 = 0; i2 < overlap; ++i2) {
            int w2 = Inlines.MULT16_16_Q15(window[i2 * inc], window[i2 * inc]);
            int g3 = Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(w2, g2), Short.MAX_VALUE - w2, g1), 15);
            diff = Inlines.EXTRACT16(Inlines.HALF32(pcm_buf[i2 * channels] - pcm_buf[i2 * channels + 1]));
            diff = Inlines.MULT16_16_Q15(g3, diff);
            pcm_buf[i2 * channels] = (short)(pcm_buf[i2 * channels] - diff);
            pcm_buf[i2 * channels + 1] = (short)(pcm_buf[i2 * channels + 1] + diff);
        }
        while (i2 < frame_size) {
            diff = Inlines.EXTRACT16(Inlines.HALF32(pcm_buf[i2 * channels] - pcm_buf[i2 * channels + 1]));
            diff = Inlines.MULT16_16_Q15(g2, diff);
            pcm_buf[i2 * channels] = (short)(pcm_buf[i2 * channels] - diff);
            pcm_buf[i2 * channels + 1] = (short)(pcm_buf[i2 * channels + 1] + diff);
            ++i2;
        }
    }

    static void gain_fade(short[] buffer, int buf_ptr, int g1, int g2, int overlap48, int frame_size, int channels, int[] window, int Fs2) {
        int g3;
        int w2;
        int i2;
        int inc = 48000 / Fs2;
        int overlap = overlap48 / inc;
        if (channels == 1) {
            for (i2 = 0; i2 < overlap; ++i2) {
                w2 = Inlines.MULT16_16_Q15(window[i2 * inc], window[i2 * inc]);
                g3 = Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(w2, g2), Short.MAX_VALUE - w2, g1), 15);
                buffer[buf_ptr + i2] = (short)Inlines.MULT16_16_Q15(g3, (int)buffer[buf_ptr + i2]);
            }
        } else {
            for (i2 = 0; i2 < overlap; ++i2) {
                w2 = Inlines.MULT16_16_Q15(window[i2 * inc], window[i2 * inc]);
                g3 = Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(w2, g2), Short.MAX_VALUE - w2, g1), 15);
                buffer[buf_ptr + i2 * 2] = (short)Inlines.MULT16_16_Q15(g3, (int)buffer[buf_ptr + i2 * 2]);
                buffer[buf_ptr + i2 * 2 + 1] = (short)Inlines.MULT16_16_Q15(g3, (int)buffer[buf_ptr + i2 * 2 + 1]);
            }
        }
        int c2 = 0;
        do {
            for (i2 = overlap; i2 < frame_size; ++i2) {
                buffer[buf_ptr + i2 * channels + c2] = (short)Inlines.MULT16_16_Q15(g2, (int)buffer[buf_ptr + i2 * channels + c2]);
            }
        } while (++c2 < channels);
    }

    static float transient_boost(float[] E2, int E_ptr, float[] E_12, int LM2, int maxM) {
        float sumE = 0.0f;
        float sumE_1 = 0.0f;
        int M2 = Inlines.IMIN(maxM, (1 << LM2) + 1);
        for (int i2 = E_ptr; i2 < M2 + E_ptr; ++i2) {
            sumE += E2[i2];
            sumE_1 += E_12[i2];
        }
        float metric = sumE * sumE_1 / (float)(M2 * M2);
        return Inlines.MIN16(1.0f, (float)Math.sqrt(Inlines.MAX16(0.0f, 0.05f * (metric - 2.0f))));
    }

    static int transient_viterbi(float[] E2, float[] E_12, int N2, int frame_cost, int rate) {
        int i2;
        float[][] cost = Arrays.InitTwoDimensionalArrayFloat(24, 16);
        int[][] states = Arrays.InitTwoDimensionalArrayInt(24, 16);
        float factor = rate < 80 ? 0.0f : (rate > 160 ? 1.0f : ((float)rate - 80.0f) / 80.0f);
        for (i2 = 0; i2 < 16; ++i2) {
            states[0][i2] = -1;
            cost[0][i2] = 1.0E10f;
        }
        for (i2 = 0; i2 < 4; ++i2) {
            cost[0][1 << i2] = (float)(frame_cost + rate * (1 << i2)) * (1.0f + factor * CodecHelpers.transient_boost(E2, 0, E_12, i2, N2 + 1));
            states[0][1 << i2] = i2;
        }
        for (i2 = 1; i2 < N2; ++i2) {
            int j2;
            for (j2 = 2; j2 < 16; ++j2) {
                cost[i2][j2] = cost[i2 - 1][j2 - 1];
                states[i2][j2] = j2 - 1;
            }
            for (j2 = 0; j2 < 4; ++j2) {
                states[i2][1 << j2] = 1;
                float min_cost = cost[i2 - 1][1];
                for (int k2 = 1; k2 < 4; ++k2) {
                    float tmp = cost[i2 - 1][(1 << k2 + 1) - 1];
                    if (!(tmp < min_cost)) continue;
                    states[i2][1 << j2] = (1 << k2 + 1) - 1;
                    min_cost = tmp;
                }
                float curr_cost = (float)(frame_cost + rate * (1 << j2)) * (1.0f + factor * CodecHelpers.transient_boost(E2, i2, E_12, j2, N2 - i2 + 1));
                cost[i2][1 << j2] = min_cost;
                if (N2 - i2 < 1 << j2) {
                    float[] fArray = cost[i2];
                    int n2 = 1 << j2;
                    fArray[n2] = fArray[n2] + curr_cost * (float)(N2 - i2) / (float)(1 << j2);
                    continue;
                }
                float[] fArray = cost[i2];
                int n3 = 1 << j2;
                fArray[n3] = fArray[n3] + curr_cost;
            }
        }
        int best_state = 1;
        float best_cost = cost[N2 - 1][1];
        for (i2 = 2; i2 < 16; ++i2) {
            if (!(cost[N2 - 1][i2] < best_cost)) continue;
            best_cost = cost[N2 - 1][i2];
            best_state = i2;
        }
        for (i2 = N2 - 1; i2 >= 0; --i2) {
            best_state = states[i2][best_state];
        }
        return best_state;
    }

    static int optimize_framesize(short[] x2, int x_ptr, int len, int C2, int Fs2, int bitrate, int tonality, float[] mem, int buffering) {
        int i2;
        int pos;
        int offset;
        float[] e2 = new float[28];
        float[] e_1 = new float[27];
        int bestLM = 0;
        int subframe = Fs2 / 400;
        int[] sub = new int[subframe];
        e2[0] = mem[0];
        e_1[0] = 1.0f / (1.0f + mem[0]);
        if (buffering != 0) {
            offset = 2 * subframe - buffering;
            Inlines.OpusAssert(offset >= 0 && offset <= subframe);
            len -= offset;
            e2[1] = mem[1];
            e_1[1] = 1.0f / (1.0f + mem[1]);
            e2[2] = mem[2];
            e_1[2] = 1.0f / (1.0f + mem[2]);
            pos = 3;
        } else {
            pos = 1;
            offset = 0;
        }
        int N2 = Inlines.IMIN(len / subframe, 24);
        int memx = 0;
        for (i2 = 0; i2 < N2; ++i2) {
            float tmp = 1.0f;
            Downmix.downmix_int(x2, x_ptr, sub, 0, subframe, i2 * subframe + offset, 0, -2, C2);
            if (i2 == 0) {
                memx = sub[0];
            }
            for (int j2 = 0; j2 < subframe; ++j2) {
                int tmpx = sub[j2];
                tmp += (float)(tmpx - memx) * (float)(tmpx - memx);
                memx = tmpx;
            }
            e2[i2 + pos] = tmp;
            e_1[i2 + pos] = 1.0f / tmp;
        }
        e2[i2 + pos] = e2[i2 + pos - 1];
        if (buffering != 0) {
            N2 = Inlines.IMIN(24, N2 + 2);
        }
        bestLM = CodecHelpers.transient_viterbi(e2, e_1, N2, (int)((1.0f + 0.5f * (float)tonality) * (float)(60 * C2 + 40)), bitrate / 400);
        mem[0] = e2[1 << bestLM];
        if (buffering != 0) {
            mem[1] = e2[(1 << bestLM) + 1];
            mem[2] = e2[(1 << bestLM) + 2];
        }
        return bestLM;
    }

    static int frame_size_select(int frame_size, OpusFramesize variable_duration, int Fs2) {
        int new_size;
        if (frame_size < Fs2 / 400) {
            return -1;
        }
        if (variable_duration == OpusFramesize.OPUS_FRAMESIZE_ARG) {
            new_size = frame_size;
        } else if (variable_duration == OpusFramesize.OPUS_FRAMESIZE_VARIABLE) {
            new_size = Fs2 / 50;
        } else if (OpusFramesizeHelpers.GetOrdinal(variable_duration) >= OpusFramesizeHelpers.GetOrdinal(OpusFramesize.OPUS_FRAMESIZE_2_5_MS) && OpusFramesizeHelpers.GetOrdinal(variable_duration) <= OpusFramesizeHelpers.GetOrdinal(OpusFramesize.OPUS_FRAMESIZE_60_MS)) {
            new_size = Inlines.IMIN(3 * Fs2 / 50, Fs2 / 400 << OpusFramesizeHelpers.GetOrdinal(variable_duration) - OpusFramesizeHelpers.GetOrdinal(OpusFramesize.OPUS_FRAMESIZE_2_5_MS));
        } else {
            return -1;
        }
        if (new_size > frame_size) {
            return -1;
        }
        if (400 * new_size != Fs2 && 200 * new_size != Fs2 && 100 * new_size != Fs2 && 50 * new_size != Fs2 && 25 * new_size != Fs2 && 50 * new_size != 3 * Fs2) {
            return -1;
        }
        return new_size;
    }

    static int compute_frame_size(short[] analysis_pcm, int analysis_pcm_ptr, int frame_size, OpusFramesize variable_duration, int C2, int Fs2, int bitrate_bps, int delay_compensation, float[] subframe_mem, boolean analysis_enabled) {
        if (analysis_enabled && variable_duration == OpusFramesize.OPUS_FRAMESIZE_VARIABLE && frame_size >= Fs2 / 200) {
            int LM2 = 3;
            LM2 = CodecHelpers.optimize_framesize(analysis_pcm, analysis_pcm_ptr, frame_size, C2, Fs2, bitrate_bps, 0, subframe_mem, delay_compensation);
            while (Fs2 / 400 << LM2 > frame_size) {
                --LM2;
            }
            frame_size = Fs2 / 400 << LM2;
        } else {
            frame_size = CodecHelpers.frame_size_select(frame_size, variable_duration, Fs2);
        }
        if (frame_size < 0) {
            return -1;
        }
        return frame_size;
    }

    static int compute_stereo_width(short[] pcm, int pcm_ptr, int frame_size, int Fs2, StereoWidthState mem) {
        int frame_rate = Fs2 / frame_size;
        int short_alpha = Short.MAX_VALUE - 819175 / Inlines.IMAX(50, frame_rate);
        int yy2 = 0;
        int xy2 = 0;
        int xx2 = 0;
        for (int i2 = 0; i2 < frame_size - 3; i2 += 4) {
            int pxx = 0;
            int pxy = 0;
            int pyy = 0;
            int p2i = pcm_ptr + 2 * i2;
            short x2 = pcm[p2i];
            short y2 = pcm[p2i + 1];
            pxx = Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)x2), 2);
            pxy = Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)y2), 2);
            pyy = Inlines.SHR32(Inlines.MULT16_16((int)y2, (int)y2), 2);
            x2 = pcm[p2i + 2];
            y2 = pcm[p2i + 3];
            pxx += Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)x2), 2);
            pxy += Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)y2), 2);
            pyy += Inlines.SHR32(Inlines.MULT16_16((int)y2, (int)y2), 2);
            x2 = pcm[p2i + 4];
            y2 = pcm[p2i + 5];
            pxx += Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)x2), 2);
            pxy += Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)y2), 2);
            pyy += Inlines.SHR32(Inlines.MULT16_16((int)y2, (int)y2), 2);
            x2 = pcm[p2i + 6];
            y2 = pcm[p2i + 7];
            xx2 += Inlines.SHR32(pxx += Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)x2), 2), 10);
            xy2 += Inlines.SHR32(pxy += Inlines.SHR32(Inlines.MULT16_16((int)x2, (int)y2), 2), 10);
            yy2 += Inlines.SHR32(pyy += Inlines.SHR32(Inlines.MULT16_16((int)y2, (int)y2), 2), 10);
        }
        mem.XX += Inlines.MULT16_32_Q15(short_alpha, xx2 - mem.XX);
        mem.XY += Inlines.MULT16_32_Q15(short_alpha, xy2 - mem.XY);
        mem.YY += Inlines.MULT16_32_Q15(short_alpha, yy2 - mem.YY);
        mem.XX = Inlines.MAX32(0, mem.XX);
        mem.XY = Inlines.MAX32(0, mem.XY);
        mem.YY = Inlines.MAX32(0, mem.YY);
        if (Inlines.MAX32(mem.XX, mem.YY) > 210) {
            int sqrt_xx = Inlines.celt_sqrt(mem.XX);
            int sqrt_yy = Inlines.celt_sqrt(mem.YY);
            int qrrt_xx = Inlines.celt_sqrt(sqrt_xx);
            int qrrt_yy = Inlines.celt_sqrt(sqrt_yy);
            mem.XY = Inlines.MIN32(mem.XY, sqrt_xx * sqrt_yy);
            int corr = Inlines.SHR32(Inlines.frac_div32(mem.XY, 1 + Inlines.MULT16_16(sqrt_xx, sqrt_yy)), 16);
            int ldiff = Short.MAX_VALUE * Inlines.ABS16(qrrt_xx - qrrt_yy) / (1 + qrrt_xx + qrrt_yy);
            int width = Inlines.MULT16_16_Q15(Inlines.celt_sqrt(0x40000000 - Inlines.MULT16_16(corr, corr)), ldiff);
            mem.smoothed_width += (width - mem.smoothed_width) / frame_rate;
            mem.max_follower = Inlines.MAX16(mem.max_follower - 655 / frame_rate, mem.smoothed_width);
        } else {
            boolean width = false;
            int corr = Short.MAX_VALUE;
            boolean ldiff = false;
        }
        return Inlines.EXTRACT16(Inlines.MIN32(Short.MAX_VALUE, 20 * mem.max_follower));
    }

    static void smooth_fade(short[] in1, int in1_ptr, short[] in2, int in2_ptr, short[] output, int output_ptr, int overlap, int channels, int[] window, int Fs2) {
        int inc = 48000 / Fs2;
        for (int c2 = 0; c2 < channels; ++c2) {
            for (int i2 = 0; i2 < overlap; ++i2) {
                int w2 = Inlines.MULT16_16_Q15(window[i2 * inc], window[i2 * inc]);
                output[output_ptr + i2 * channels + c2] = (short)Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(w2, (int)in2[in2_ptr + i2 * channels + c2]), Short.MAX_VALUE - w2, (int)in1[in1_ptr + i2 * channels + c2]), 15);
            }
        }
    }

    public static String opus_strerror(int error) {
        String[] error_strings = new String[]{"success", "invalid argument", "buffer too small", "error", "corrupted stream", "request not implemented", "invalid state", "memory allocation failed"};
        if (error > 0 || error < -7) {
            return "unknown error";
        }
        return error_strings[-error];
    }

    public static String GetVersionString() {
        return "concentus 1.0a-java-fixed";
    }
}

