/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Autocorrelation;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltLPC;
import io.github.jaredmdobson.concentus.CeltPitchXCorr;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;

class Pitch {
    private static final int[] second_check = new int[]{0, 0, 3, 2, 3, 2, 5, 2, 3, 2, 3, 2, 5, 2, 3, 2};

    Pitch() {
    }

    static void find_best_pitch(int[] xcorr, int[] y2, int len, int max_pitch, int[] best_pitch, int yshift, int maxcorr) {
        int Syy = 1;
        int xshift = Inlines.celt_ilog2(maxcorr) - 14;
        int best_num_0 = -1;
        int best_num_1 = -1;
        int best_den_0 = 0;
        int best_den_1 = 0;
        best_pitch[0] = 0;
        best_pitch[1] = 1;
        for (int j2 = 0; j2 < len; ++j2) {
            Syy = Inlines.ADD32(Syy, Inlines.SHR32(Inlines.MULT16_16(y2[j2], y2[j2]), yshift));
        }
        for (int i2 = 0; i2 < max_pitch; ++i2) {
            short xcorr16;
            int num;
            if (xcorr[i2] > 0 && Inlines.MULT16_32_Q15(num = Inlines.MULT16_16_Q15((int)(xcorr16 = Inlines.EXTRACT16(Inlines.VSHR32(xcorr[i2], xshift))), (int)xcorr16), best_den_1) > Inlines.MULT16_32_Q15(best_num_1, Syy)) {
                if (Inlines.MULT16_32_Q15(num, best_den_0) > Inlines.MULT16_32_Q15(best_num_0, Syy)) {
                    best_num_1 = best_num_0;
                    best_den_1 = best_den_0;
                    best_pitch[1] = best_pitch[0];
                    best_num_0 = num;
                    best_den_0 = Syy;
                    best_pitch[0] = i2;
                } else {
                    best_num_1 = num;
                    best_den_1 = Syy;
                    best_pitch[1] = i2;
                }
            }
            Syy += Inlines.SHR32(Inlines.MULT16_16(y2[i2 + len], y2[i2 + len]), yshift) - Inlines.SHR32(Inlines.MULT16_16(y2[i2], y2[i2]), yshift);
            Syy = Inlines.MAX32(1, Syy);
        }
    }

    static void celt_fir5(int[] x2, int[] num, int[] y2, int N2, int[] mem) {
        int num0 = num[0];
        int num1 = num[1];
        int num2 = num[2];
        int num3 = num[3];
        int num4 = num[4];
        int mem0 = mem[0];
        int mem1 = mem[1];
        int mem2 = mem[2];
        int mem3 = mem[3];
        int mem4 = mem[4];
        for (int i2 = 0; i2 < N2; ++i2) {
            int sum = Inlines.SHL32(Inlines.EXTEND32(x2[i2]), 12);
            sum = Inlines.MAC16_16(sum, num0, mem0);
            sum = Inlines.MAC16_16(sum, num1, mem1);
            sum = Inlines.MAC16_16(sum, num2, mem2);
            sum = Inlines.MAC16_16(sum, num3, mem3);
            sum = Inlines.MAC16_16(sum, num4, mem4);
            mem4 = mem3;
            mem3 = mem2;
            mem2 = mem1;
            mem1 = mem0;
            mem0 = x2[i2];
            y2[i2] = Inlines.ROUND16(sum, 12);
        }
        mem[0] = mem0;
        mem[1] = mem1;
        mem[2] = mem2;
        mem[3] = mem3;
        mem[4] = mem4;
    }

    static void pitch_downsample(int[][] x2, int[] x_lp, int len, int C2) {
        int i2;
        int shift;
        int[] ac2 = new int[5];
        int tmp = Short.MAX_VALUE;
        int[] lpc = new int[4];
        int[] mem = new int[]{0, 0, 0, 0, 0};
        int[] lpc2 = new int[5];
        int c1 = 26214;
        int maxabs = Inlines.celt_maxabs32(x2[0], 0, len);
        if (C2 == 2) {
            int maxabs_1 = Inlines.celt_maxabs32(x2[1], 0, len);
            maxabs = Inlines.MAX32(maxabs, maxabs_1);
        }
        if (maxabs < 1) {
            maxabs = 1;
        }
        if ((shift = Inlines.celt_ilog2(maxabs) - 10) < 0) {
            shift = 0;
        }
        if (C2 == 2) {
            ++shift;
        }
        int halflen = len >> 1;
        for (i2 = 1; i2 < halflen; ++i2) {
            x_lp[i2] = Inlines.SHR32(Inlines.HALF32(Inlines.HALF32(x2[0][2 * i2 - 1] + x2[0][2 * i2 + 1]) + x2[0][2 * i2]), shift);
        }
        x_lp[0] = Inlines.SHR32(Inlines.HALF32(Inlines.HALF32(x2[0][1]) + x2[0][0]), shift);
        if (C2 == 2) {
            for (i2 = 1; i2 < halflen; ++i2) {
                int n2 = i2;
                x_lp[n2] = x_lp[n2] + Inlines.SHR32(Inlines.HALF32(Inlines.HALF32(x2[1][2 * i2 - 1] + x2[1][2 * i2 + 1]) + x2[1][2 * i2]), shift);
            }
            x_lp[0] = x_lp[0] + Inlines.SHR32(Inlines.HALF32(Inlines.HALF32(x2[1][1]) + x2[1][0]), shift);
        }
        Autocorrelation._celt_autocorr(x_lp, ac2, null, 0, 4, halflen);
        ac2[0] = ac2[0] + Inlines.SHR32(ac2[0], 13);
        for (i2 = 1; i2 <= 4; ++i2) {
            int n3 = i2;
            ac2[n3] = ac2[n3] - Inlines.MULT16_32_Q15(2 * i2 * i2, ac2[i2]);
        }
        CeltLPC.celt_lpc(lpc, ac2, 4);
        for (i2 = 0; i2 < 4; ++i2) {
            tmp = Inlines.MULT16_16_Q15(29491, tmp);
            lpc[i2] = Inlines.MULT16_16_Q15(lpc[i2], tmp);
        }
        lpc2[0] = lpc[0] + 3277;
        lpc2[1] = lpc[1] + Inlines.MULT16_16_Q15(c1, lpc[0]);
        lpc2[2] = lpc[2] + Inlines.MULT16_16_Q15(c1, lpc[1]);
        lpc2[3] = lpc[3] + Inlines.MULT16_16_Q15(c1, lpc[2]);
        lpc2[4] = Inlines.MULT16_16_Q15(c1, lpc[3]);
        Pitch.celt_fir5(x_lp, lpc2, x_lp, halflen, mem);
    }

    static void pitch_search(int[] x_lp, int x_lp_ptr, int[] y2, int len, int max_pitch, BoxedValueInt pitch) {
        int b2;
        int a2;
        int c2;
        int ymax;
        int j2;
        int[] best_pitch = new int[]{0, 0};
        int shift = 0;
        Inlines.OpusAssert(len > 0);
        Inlines.OpusAssert(max_pitch > 0);
        int lag = len + max_pitch;
        int[] x_lp4 = new int[len >> 2];
        int[] y_lp4 = new int[lag >> 2];
        int[] xcorr = new int[max_pitch >> 1];
        for (j2 = 0; j2 < len >> 2; ++j2) {
            x_lp4[j2] = x_lp[x_lp_ptr + 2 * j2];
        }
        for (j2 = 0; j2 < lag >> 2; ++j2) {
            y_lp4[j2] = y2[2 * j2];
        }
        int xmax = Inlines.celt_maxabs32(x_lp4, 0, len >> 2);
        shift = Inlines.celt_ilog2(Inlines.MAX32(1, Inlines.MAX32(xmax, ymax = Inlines.celt_maxabs32(y_lp4, 0, lag >> 2)))) - 11;
        if (shift > 0) {
            for (j2 = 0; j2 < len >> 2; ++j2) {
                x_lp4[j2] = Inlines.SHR16(x_lp4[j2], shift);
            }
            for (j2 = 0; j2 < lag >> 2; ++j2) {
                y_lp4[j2] = Inlines.SHR16(y_lp4[j2], shift);
            }
            shift *= 2;
        } else {
            shift = 0;
        }
        int maxcorr = CeltPitchXCorr.pitch_xcorr(x_lp4, y_lp4, xcorr, len >> 2, max_pitch >> 2);
        Pitch.find_best_pitch(xcorr, y_lp4, len >> 2, max_pitch >> 2, best_pitch, 0, maxcorr);
        maxcorr = 1;
        for (int i2 = 0; i2 < max_pitch >> 1; ++i2) {
            xcorr[i2] = 0;
            if (Inlines.abs(i2 - 2 * best_pitch[0]) > 2 && Inlines.abs(i2 - 2 * best_pitch[1]) > 2) continue;
            int sum = 0;
            for (j2 = 0; j2 < len >> 1; ++j2) {
                sum += Inlines.SHR32(Inlines.MULT16_16(x_lp[x_lp_ptr + j2], y2[i2 + j2]), shift);
            }
            xcorr[i2] = Inlines.MAX32(-1, sum);
            maxcorr = Inlines.MAX32(maxcorr, sum);
        }
        Pitch.find_best_pitch(xcorr, y2, len >> 1, max_pitch >> 1, best_pitch, shift + 1, maxcorr);
        int offset = best_pitch[0] > 0 && best_pitch[0] < (max_pitch >> 1) - 1 ? ((c2 = xcorr[best_pitch[0] + 1]) - (a2 = xcorr[best_pitch[0] - 1]) > Inlines.MULT16_32_Q15((short)22938, (b2 = xcorr[best_pitch[0]]) - a2) ? 1 : (a2 - c2 > Inlines.MULT16_32_Q15((short)22938, b2 - c2) ? -1 : 0)) : 0;
        pitch.Val = 2 * best_pitch[0] - offset;
    }

    static int remove_doubling(int[] x2, int maxperiod, int minperiod, int N2, BoxedValueInt T0_, int prev_period, int prev_gain) {
        int k2;
        int g2;
        int T0;
        int[] xcorr = new int[3];
        int minperiod0 = minperiod;
        minperiod /= 2;
        T0_.Val /= 2;
        prev_period /= 2;
        N2 /= 2;
        int x_ptr = maxperiod /= 2;
        if (T0_.Val >= maxperiod) {
            T0_.Val = maxperiod - 1;
        }
        int T2 = T0 = T0_.Val;
        int[] yy_lookup = new int[maxperiod + 1];
        BoxedValueInt boxed_xx = new BoxedValueInt(0);
        BoxedValueInt boxed_xy = new BoxedValueInt(0);
        BoxedValueInt boxed_xy2 = new BoxedValueInt(0);
        Kernels.dual_inner_prod(x2, x_ptr, x2, x_ptr, x2, x_ptr - T0, N2, boxed_xx, boxed_xy);
        int xx2 = boxed_xx.Val;
        int xy2 = boxed_xy.Val;
        yy_lookup[0] = xx2;
        int yy2 = xx2;
        for (int i2 = 1; i2 <= maxperiod; ++i2) {
            int xi2 = x_ptr - i2;
            yy2 = yy2 + Inlines.MULT16_16(x2[xi2], x2[xi2]) - Inlines.MULT16_16(x2[xi2 + N2], x2[xi2 + N2]);
            yy_lookup[i2] = Inlines.MAX32(0, yy2);
        }
        yy2 = yy_lookup[T0];
        int best_xy = xy2;
        int best_yy = yy2;
        int x2y2 = 1 + Inlines.HALF32(Inlines.MULT32_32_Q31(xx2, yy2));
        int sh2 = Inlines.celt_ilog2(x2y2) >> 1;
        int t2 = Inlines.VSHR32(x2y2, 2 * (sh2 - 7));
        int g0 = g2 = Inlines.VSHR32(Inlines.MULT16_32_Q15(Inlines.celt_rsqrt_norm(t2), xy2), sh2 + 1);
        for (k2 = 2; k2 <= 15; ++k2) {
            int cont = 0;
            int T1 = Inlines.celt_udiv(2 * T0 + k2, 2 * k2);
            if (T1 < minperiod) break;
            int T1b = k2 == 2 ? (T1 + T0 > maxperiod ? T0 : T0 + T1) : Inlines.celt_udiv(2 * second_check[k2] * T0 + k2, 2 * k2);
            Kernels.dual_inner_prod(x2, x_ptr, x2, x_ptr - T1, x2, x_ptr - T1b, N2, boxed_xy, boxed_xy2);
            xy2 = boxed_xy.Val;
            int xy22 = boxed_xy2.Val;
            yy2 = yy_lookup[T1] + yy_lookup[T1b];
            int x2y22 = 1 + Inlines.MULT32_32_Q31(xx2, yy2);
            int sh3 = Inlines.celt_ilog2(x2y22) >> 1;
            int t3 = Inlines.VSHR32(x2y22, 2 * (sh3 - 7));
            int g1 = Inlines.VSHR32(Inlines.MULT16_32_Q15(Inlines.celt_rsqrt_norm(t3), xy2 += xy22), sh3 + 1);
            cont = Inlines.abs(T1 - prev_period) <= 1 ? prev_gain : (Inlines.abs(T1 - prev_period) <= 2 && 5 * k2 * k2 < T0 ? Inlines.HALF16(prev_gain) : 0);
            int thresh = Inlines.MAX16(9830, Inlines.MULT16_16_Q15(22938, g0) - cont);
            if (T1 < 3 * minperiod) {
                thresh = Inlines.MAX16(13107, Inlines.MULT16_16_Q15(27853, g0) - cont);
            } else if (T1 < 2 * minperiod) {
                thresh = Inlines.MAX16(16384, Inlines.MULT16_16_Q15(29491, g0) - cont);
            }
            if (g1 <= thresh) continue;
            best_xy = xy2;
            best_yy = yy2;
            T2 = T1;
            g2 = g1;
        }
        int pg2 = best_yy <= (best_xy = Inlines.MAX32(0, best_xy)) ? Short.MAX_VALUE : Inlines.SHR32(Inlines.frac_div32(best_xy, best_yy + 1), 16);
        for (k2 = 0; k2 < 3; ++k2) {
            xcorr[k2] = Kernels.celt_inner_prod(x2, x_ptr, x2, x_ptr - (T2 + k2 - 1), N2);
        }
        int offset = xcorr[2] - xcorr[0] > Inlines.MULT16_32_Q15((short)22938, xcorr[1] - xcorr[0]) ? 1 : (xcorr[0] - xcorr[2] > Inlines.MULT16_32_Q15((short)22938, xcorr[1] - xcorr[2]) ? -1 : 0);
        if (pg2 > g2) {
            pg2 = g2;
        }
        T0_.Val = 2 * T2 + offset;
        if (T0_.Val < minperiod0) {
            T0_.Val = minperiod0;
        }
        return pg2;
    }
}

