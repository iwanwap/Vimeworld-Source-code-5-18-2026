/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.CWRS;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;

class VQ {
    private static int[] SPREAD_FACTOR = new int[]{15, 10, 5};

    VQ() {
    }

    static void exp_rotation1(int[] X2, int X_ptr, int len, int stride, int c2, int s2) {
        int x2;
        int x1;
        int i2;
        int Xptr = X_ptr;
        int ms2 = Inlines.NEG16(s2);
        for (i2 = 0; i2 < len - stride; ++i2) {
            x1 = X2[Xptr];
            x2 = X2[Xptr + stride];
            X2[Xptr + stride] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MAC16_16(Inlines.MULT16_16(c2, x2), s2, x1), 15));
            X2[Xptr] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MAC16_16(Inlines.MULT16_16(c2, x1), ms2, x2), 15));
            ++Xptr;
        }
        Xptr = X_ptr + (len - 2 * stride - 1);
        for (i2 = len - 2 * stride - 1; i2 >= 0; --i2) {
            x1 = X2[Xptr];
            x2 = X2[Xptr + stride];
            X2[Xptr + stride] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MAC16_16(Inlines.MULT16_16(c2, x2), s2, x1), 15));
            X2[Xptr] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MAC16_16(Inlines.MULT16_16(c2, x1), ms2, x2), 15));
            --Xptr;
        }
    }

    static void exp_rotation(int[] X2, int X_ptr, int len, int dir, int stride, int K2, int spread) {
        int stride2 = 0;
        if (2 * K2 >= len || spread == 0) {
            return;
        }
        int factor = SPREAD_FACTOR[spread - 1];
        int gain = Inlines.celt_div(Inlines.MULT16_16(Short.MAX_VALUE, len), len + factor * K2);
        int theta = Inlines.HALF16(Inlines.MULT16_16_Q15(gain, gain));
        int c2 = Inlines.celt_cos_norm(Inlines.EXTEND32(theta));
        int s2 = Inlines.celt_cos_norm(Inlines.EXTEND32(Inlines.SUB16(Short.MAX_VALUE, theta)));
        if (len >= 8 * stride) {
            stride2 = 1;
            while ((stride2 * stride2 + stride2) * stride + (stride >> 2) < len) {
                ++stride2;
            }
        }
        len = Inlines.celt_udiv(len, stride);
        for (int i2 = 0; i2 < stride; ++i2) {
            if (dir < 0) {
                if (stride2 != 0) {
                    VQ.exp_rotation1(X2, X_ptr + i2 * len, len, stride2, s2, c2);
                }
                VQ.exp_rotation1(X2, X_ptr + i2 * len, len, 1, c2, s2);
                continue;
            }
            VQ.exp_rotation1(X2, X_ptr + i2 * len, len, 1, c2, (short)(0 - s2));
            if (stride2 == 0) continue;
            VQ.exp_rotation1(X2, X_ptr + i2 * len, len, stride2, s2, (short)(0 - c2));
        }
    }

    static void normalise_residual(int[] iy2, int[] X2, int X_ptr, int N2, int Ryy, int gain) {
        int k2 = Inlines.celt_ilog2(Ryy) >> 1;
        int t2 = Inlines.VSHR32(Ryy, 2 * (k2 - 7));
        int g2 = Inlines.MULT16_16_P15(Inlines.celt_rsqrt_norm(t2), gain);
        int i2 = 0;
        do {
            X2[X_ptr + i2] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MULT16_16(g2, iy2[i2]), k2 + 1));
        } while (++i2 < N2);
    }

    static int extract_collapse_mask(int[] iy2, int N2, int B2) {
        if (B2 <= 1) {
            return 1;
        }
        int N0 = Inlines.celt_udiv(N2, B2);
        int collapse_mask = 0;
        int i2 = 0;
        do {
            int tmp = 0;
            int j2 = 0;
            do {
                tmp |= iy2[i2 * N0 + j2];
            } while (++j2 < N0);
            collapse_mask |= (tmp != 0 ? 1 : 0) << i2;
        } while (++i2 < B2);
        return collapse_mask;
    }

    static int alg_quant(int[] X2, int X_ptr, int N2, int K2, int spread, int B2, EntropyCoder enc) {
        int[] y2 = new int[N2];
        int[] iy2 = new int[N2];
        int[] signx = new int[N2];
        Inlines.OpusAssert(K2 > 0, "alg_quant() needs at least one pulse");
        Inlines.OpusAssert(N2 > 1, "alg_quant() needs at least two dimensions");
        VQ.exp_rotation(X2, X_ptr, N2, 1, B2, K2, spread);
        int sum = 0;
        int j2 = 0;
        do {
            if (X2[X_ptr + j2] > 0) {
                signx[j2] = 1;
            } else {
                signx[j2] = -1;
                X2[X_ptr + j2] = 0 - X2[X_ptr + j2];
            }
            iy2[j2] = 0;
            y2[j2] = 0;
        } while (++j2 < N2);
        int yy2 = 0;
        int xy2 = 0;
        int pulsesLeft = K2;
        if (K2 > N2 >> 1) {
            j2 = 0;
            do {
                sum += X2[X_ptr + j2];
            } while (++j2 < N2);
            if (sum <= K2) {
                X2[X_ptr] = 16384;
                j2 = X_ptr + 1;
                do {
                    X2[j2] = 0;
                } while (++j2 < N2 + X_ptr);
                sum = 16384;
            }
            short rcp = Inlines.EXTRACT16(Inlines.MULT16_32_Q16(K2 - 1, Inlines.celt_rcp(sum)));
            j2 = 0;
            do {
                iy2[j2] = Inlines.MULT16_16_Q15(X2[X_ptr + j2], (int)rcp);
                y2[j2] = iy2[j2];
                yy2 = Inlines.MAC16_16(yy2, y2[j2], y2[j2]);
                xy2 = Inlines.MAC16_16(xy2, X2[X_ptr + j2], y2[j2]);
                int n2 = j2;
                y2[n2] = y2[n2] * 2;
                pulsesLeft -= iy2[j2];
            } while (++j2 < N2);
        }
        Inlines.OpusAssert(pulsesLeft >= 1, "Allocated too many pulses in the quick pass");
        if (pulsesLeft > N2 + 3) {
            int tmp = pulsesLeft;
            yy2 = Inlines.MAC16_16(yy2, tmp, tmp);
            yy2 = Inlines.MAC16_16(yy2, tmp, y2[0]);
            iy2[0] = iy2[0] + pulsesLeft;
            pulsesLeft = 0;
        }
        int s2 = 1;
        for (int i2 = 0; i2 < pulsesLeft; ++i2) {
            int best_num = -32767;
            int best_den = 0;
            int rshift = 1 + Inlines.celt_ilog2(K2 - pulsesLeft + i2 + 1);
            int best_id = 0;
            yy2 = Inlines.ADD16(yy2, 1);
            j2 = 0;
            do {
                int Rxy = Inlines.EXTRACT16(Inlines.SHR32(Inlines.ADD32(xy2, Inlines.EXTEND32(X2[X_ptr + j2])), rshift));
                int Ryy = Inlines.ADD16(yy2, y2[j2]);
                if (Inlines.MULT16_16(best_den, Rxy = Inlines.MULT16_16_Q15(Rxy, Rxy)) <= Inlines.MULT16_16(Ryy, best_num)) continue;
                best_den = Ryy;
                best_num = Rxy;
                best_id = j2;
            } while (++j2 < N2);
            xy2 = Inlines.ADD32(xy2, Inlines.EXTEND32(X2[X_ptr + best_id]));
            yy2 = Inlines.ADD16(yy2, y2[best_id]);
            y2[best_id] = y2[best_id] + 2 * s2;
            int n3 = best_id;
            iy2[n3] = iy2[n3] + 1;
        }
        j2 = 0;
        do {
            X2[X_ptr + j2] = Inlines.MULT16_16(signx[j2], X2[X_ptr + j2]);
            if (signx[j2] >= 0) continue;
            iy2[j2] = -iy2[j2];
        } while (++j2 < N2);
        CWRS.encode_pulses(iy2, N2, K2, enc);
        int collapse_mask = VQ.extract_collapse_mask(iy2, N2, B2);
        return collapse_mask;
    }

    static int alg_unquant(int[] X2, int X_ptr, int N2, int K2, int spread, int B2, EntropyCoder dec, int gain) {
        int[] iy2 = new int[N2];
        Inlines.OpusAssert(K2 > 0, "alg_unquant() needs at least one pulse");
        Inlines.OpusAssert(N2 > 1, "alg_unquant() needs at least two dimensions");
        int Ryy = CWRS.decode_pulses(iy2, N2, K2, dec);
        VQ.normalise_residual(iy2, X2, X_ptr, N2, Ryy, gain);
        VQ.exp_rotation(X2, X_ptr, N2, -1, B2, K2, spread);
        int collapse_mask = VQ.extract_collapse_mask(iy2, N2, B2);
        return collapse_mask;
    }

    static void renormalise_vector(int[] X2, int X_ptr, int N2, int gain) {
        int E2 = 1 + Kernels.celt_inner_prod(X2, X_ptr, X2, X_ptr, N2);
        int k2 = Inlines.celt_ilog2(E2) >> 1;
        int t2 = Inlines.VSHR32(E2, 2 * (k2 - 7));
        int g2 = Inlines.MULT16_16_P15(Inlines.celt_rsqrt_norm(t2), gain);
        int xptr = X_ptr;
        for (int i2 = 0; i2 < N2; ++i2) {
            X2[xptr] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MULT16_16(g2, X2[xptr]), k2 + 1));
            ++xptr;
        }
    }

    static int stereo_itheta(int[] X2, int X_ptr, int[] Y2, int Y_ptr, int stereo, int N2) {
        int Eside = 1;
        int Emid = 1;
        if (stereo != 0) {
            for (int i2 = 0; i2 < N2; ++i2) {
                int m2 = Inlines.ADD16(Inlines.SHR16(X2[X_ptr + i2], 1), Inlines.SHR16(Y2[Y_ptr + i2], 1));
                int s2 = Inlines.SUB16(Inlines.SHR16(X2[X_ptr + i2], 1), Inlines.SHR16(Y2[Y_ptr + i2], 1));
                Emid = Inlines.MAC16_16(Emid, m2, m2);
                Eside = Inlines.MAC16_16(Eside, s2, s2);
            }
        } else {
            Emid += Kernels.celt_inner_prod(X2, X_ptr, X2, X_ptr, N2);
            Eside += Kernels.celt_inner_prod(Y2, Y_ptr, Y2, Y_ptr, N2);
        }
        int mid = Inlines.celt_sqrt(Emid);
        int side = Inlines.celt_sqrt(Eside);
        int itheta = Inlines.MULT16_16_Q15(20861, Inlines.celt_atan2p(side, mid));
        return itheta;
    }
}

