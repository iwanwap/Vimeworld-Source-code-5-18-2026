/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.CeltTables;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;
import io.github.jaredmdobson.concentus.Rate;
import io.github.jaredmdobson.concentus.VQ;

class Bands {
    private static final byte[] bit_interleave_table = new byte[]{0, 1, 1, 1, 2, 3, 3, 3, 2, 3, 3, 3, 2, 3, 3, 3};
    private static final short[] bit_deinterleave_table = new short[]{0, 3, 12, 15, 48, 51, 60, 63, 192, 195, 204, 207, 240, 243, 252, 255};

    Bands() {
    }

    static int hysteresis_decision(int val, int[] thresholds, int[] hysteresis, int N2, int prev) {
        int i2;
        for (i2 = 0; i2 < N2 && val >= thresholds[i2]; ++i2) {
        }
        if (i2 > prev && val < thresholds[prev] + hysteresis[prev]) {
            i2 = prev;
        }
        if (i2 < prev && val > thresholds[prev - 1] - hysteresis[prev - 1]) {
            i2 = prev;
        }
        return i2;
    }

    static int celt_lcg_rand(int seed) {
        return 1664525 * seed + 1013904223;
    }

    static int bitexact_cos(int x2) {
        int tmp = 4096 + x2 * x2 >> 13;
        Inlines.OpusAssert(tmp <= Short.MAX_VALUE);
        int x22 = tmp;
        x22 = Short.MAX_VALUE - x22 + Inlines.FRAC_MUL16(x22, -7651 + Inlines.FRAC_MUL16(x22, 8277 + Inlines.FRAC_MUL16(-626, x22)));
        Inlines.OpusAssert(x22 <= 32766);
        return 1 + x22;
    }

    static int bitexact_log2tan(int isin, int icos) {
        int lc2 = Inlines.EC_ILOG(icos);
        int ls2 = Inlines.EC_ILOG(isin);
        return (ls2 - lc2) * 2048 + Inlines.FRAC_MUL16(isin <<= 15 - ls2, Inlines.FRAC_MUL16(isin, -2597) + 7932) - Inlines.FRAC_MUL16(icos <<= 15 - lc2, Inlines.FRAC_MUL16(icos, -2597) + 7932);
    }

    static void compute_band_energies(CeltMode m2, int[][] X2, int[][] bandE, int end, int C2, int LM2) {
        short[] eBands = m2.eBands;
        int N2 = m2.shortMdctSize << LM2;
        int c2 = 0;
        do {
            for (int i2 = 0; i2 < end; ++i2) {
                int maxval = 0;
                int sum = 0;
                maxval = Inlines.celt_maxabs32(X2[c2], eBands[i2] << LM2, eBands[i2 + 1] - eBands[i2] << LM2);
                if (maxval > 0) {
                    int shift = Inlines.celt_ilog2(maxval) - 14 + ((m2.logN[i2] >> 3) + LM2 + 1 >> 1);
                    int j2 = eBands[i2] << LM2;
                    if (shift > 0) {
                        do {
                            sum = Inlines.MAC16_16(sum, Inlines.EXTRACT16(Inlines.SHR32(X2[c2][j2], shift)), Inlines.EXTRACT16(Inlines.SHR32(X2[c2][j2], shift)));
                        } while (++j2 < eBands[i2 + 1] << LM2);
                    } else {
                        do {
                            sum = Inlines.MAC16_16(sum, Inlines.EXTRACT16(Inlines.SHL32(X2[c2][j2], -shift)), Inlines.EXTRACT16(Inlines.SHL32(X2[c2][j2], -shift)));
                        } while (++j2 < eBands[i2 + 1] << LM2);
                    }
                    bandE[c2][i2] = 1 + Inlines.VSHR32(Inlines.celt_sqrt(sum), -shift);
                    continue;
                }
                bandE[c2][i2] = 1;
            }
        } while (++c2 < C2);
    }

    static void normalise_bands(CeltMode m2, int[][] freq, int[][] X2, int[][] bandE, int end, int C2, int M2) {
        short[] eBands = m2.eBands;
        int c2 = 0;
        do {
            int i2 = 0;
            do {
                int shift = Inlines.celt_zlog2(bandE[c2][i2]) - 13;
                int E2 = Inlines.VSHR32(bandE[c2][i2], shift);
                short g2 = Inlines.EXTRACT16(Inlines.celt_rcp(Inlines.SHL32(E2, 3)));
                int j2 = M2 * eBands[i2];
                do {
                    X2[c2][j2] = Inlines.MULT16_16_Q15(Inlines.VSHR32(freq[c2][j2], shift - 1), (int)g2);
                } while (++j2 < M2 * eBands[i2 + 1]);
            } while (++i2 < end);
        } while (++c2 < C2);
    }

    static void denormalise_bands(CeltMode m2, int[] X2, int[] freq, int freq_ptr, int[] bandLogE, int bandLogE_ptr, int start, int end, int M2, int downsample, int silence) {
        int i2;
        short[] eBands = m2.eBands;
        int N2 = M2 * m2.shortMdctSize;
        int bound = M2 * eBands[end];
        if (downsample != 1) {
            bound = Inlines.IMIN(bound, N2 / downsample);
        }
        if (silence != 0) {
            bound = 0;
            end = 0;
            start = 0;
        }
        int f2 = freq_ptr;
        int x2 = M2 * eBands[start];
        for (i2 = 0; i2 < M2 * eBands[start]; ++i2) {
            freq[f2++] = 0;
        }
        for (i2 = start; i2 < end; ++i2) {
            int g2;
            int j2 = M2 * eBands[i2];
            int band_end = M2 * eBands[i2 + 1];
            int lg2 = Inlines.ADD16(bandLogE[bandLogE_ptr + i2], (int)Inlines.SHL16(CeltTables.eMeans[i2], 6));
            int shift = 16 - (lg2 >> 10);
            if (shift > 31) {
                shift = 0;
                g2 = 0;
            } else {
                g2 = Inlines.celt_exp2_frac(lg2 & 0x3FF);
            }
            if (shift < 0) {
                if (shift < -2) {
                    g2 = Short.MAX_VALUE;
                    shift = -2;
                }
                do {
                    freq[f2] = Inlines.SHR32(Inlines.MULT16_16(X2[x2], g2), -shift);
                } while (++j2 < band_end);
                continue;
            }
            do {
                freq[f2++] = Inlines.SHR32(Inlines.MULT16_16(X2[x2++], g2), shift);
            } while (++j2 < band_end);
        }
        Inlines.OpusAssert(start <= end);
        Arrays.MemSetWithOffset(freq, 0, freq_ptr + bound, N2 - bound);
    }

    static void anti_collapse(CeltMode m2, int[][] X_, short[] collapse_masks, int LM2, int C2, int size, int start, int end, int[] logE, int[] prev1logE, int[] prev2logE, int[] pulses, int seed) {
        for (int i2 = start; i2 < end; ++i2) {
            int N0 = m2.eBands[i2 + 1] - m2.eBands[i2];
            Inlines.OpusAssert(pulses[i2] >= 0);
            int depth = Inlines.celt_udiv(1 + pulses[i2], m2.eBands[i2 + 1] - m2.eBands[i2]) >> LM2;
            int thresh32 = Inlines.SHR32(Inlines.celt_exp2(0 - Inlines.SHL16(depth, 7)), 1);
            int thresh = Inlines.MULT16_32_Q15((short)16384, Inlines.MIN32(Short.MAX_VALUE, thresh32));
            int t2 = N0 << LM2;
            int shift = Inlines.celt_ilog2(t2) >> 1;
            t2 = Inlines.SHL32(t2, 7 - shift << 1);
            int sqrt_1 = Inlines.celt_rsqrt_norm(t2);
            int c2 = 0;
            do {
                int r2;
                boolean renormalize = false;
                int prev1 = prev1logE[c2 * m2.nbEBands + i2];
                int prev2 = prev2logE[c2 * m2.nbEBands + i2];
                if (C2 == 1) {
                    prev1 = Inlines.MAX16(prev1, prev1logE[m2.nbEBands + i2]);
                    prev2 = Inlines.MAX16(prev2, prev2logE[m2.nbEBands + i2]);
                }
                int Ediff = Inlines.EXTEND32(logE[c2 * m2.nbEBands + i2]) - Inlines.EXTEND32(Inlines.MIN16(prev1, prev2));
                if ((Ediff = Inlines.MAX32(0, Ediff)) < 16384) {
                    int r32 = Inlines.SHR32(Inlines.celt_exp2((short)(0 - Inlines.EXTRACT16(Ediff))), 1);
                    r2 = 2 * Inlines.MIN16(16383, r32);
                } else {
                    r2 = 0;
                }
                if (LM2 == 3) {
                    r2 = Inlines.MULT16_16_Q14(23170, Inlines.MIN32(23169, r2));
                }
                r2 = Inlines.SHR16(Inlines.MIN16(thresh, r2), 1);
                r2 = Inlines.SHR32(Inlines.MULT16_16_Q15(sqrt_1, r2), shift);
                int X2 = m2.eBands[i2] << LM2;
                for (int k2 = 0; k2 < 1 << LM2; ++k2) {
                    if ((collapse_masks[i2 * C2 + c2] & 1 << k2) != 0) continue;
                    int Xk2 = X2 + k2;
                    for (int j2 = 0; j2 < N0; ++j2) {
                        seed = Bands.celt_lcg_rand(seed);
                        X_[c2][Xk2 + (j2 << LM2)] = (seed & 0x8000) != 0 ? r2 : 0 - r2;
                    }
                    renormalize = true;
                }
                if (!renormalize) continue;
                VQ.renormalise_vector(X_[c2], X2, N0 << LM2, Short.MAX_VALUE);
            } while (++c2 < C2);
        }
    }

    static void intensity_stereo(CeltMode m2, int[] X2, int X_ptr, int[] Y2, int Y_ptr, int[][] bandE, int bandID, int N2) {
        int i2 = bandID;
        int shift = Inlines.celt_zlog2(Inlines.MAX32(bandE[0][i2], bandE[1][i2])) - 13;
        int left = Inlines.VSHR32(bandE[0][i2], shift);
        int right = Inlines.VSHR32(bandE[1][i2], shift);
        int norm = 1 + Inlines.celt_sqrt(1 + Inlines.MULT16_16(left, left) + Inlines.MULT16_16(right, right));
        int a1 = Inlines.DIV32_16(Inlines.SHL32(left, 14), norm);
        int a2 = Inlines.DIV32_16(Inlines.SHL32(right, 14), norm);
        for (int j2 = 0; j2 < N2; ++j2) {
            int l2 = X2[X_ptr + j2];
            int r2 = Y2[Y_ptr + j2];
            X2[X_ptr + j2] = Inlines.EXTRACT16(Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(a1, l2), a2, r2), 14));
        }
    }

    static void stereo_split(int[] X2, int X_ptr, int[] Y2, int Y_ptr, int N2) {
        for (int j2 = 0; j2 < N2; ++j2) {
            int l2 = Inlines.MULT16_16(23170, X2[X_ptr + j2]);
            int r2 = Inlines.MULT16_16(23170, Y2[Y_ptr + j2]);
            X2[X_ptr + j2] = Inlines.EXTRACT16(Inlines.SHR32(Inlines.ADD32(l2, r2), 15));
            Y2[Y_ptr + j2] = Inlines.EXTRACT16(Inlines.SHR32(Inlines.SUB32(r2, l2), 15));
        }
    }

    static void stereo_merge(int[] X2, int X_ptr, int[] Y2, int Y_ptr, int mid, int N2) {
        BoxedValueInt xp2 = new BoxedValueInt(0);
        BoxedValueInt side = new BoxedValueInt(0);
        Kernels.dual_inner_prod(Y2, Y_ptr, X2, X_ptr, Y2, Y_ptr, N2, xp2, side);
        xp2.Val = Inlines.MULT16_32_Q15(mid, xp2.Val);
        int mid2 = Inlines.SHR16(mid, 1);
        int El2 = Inlines.MULT16_16(mid2, mid2) + side.Val - 2 * xp2.Val;
        int Er2 = Inlines.MULT16_16(mid2, mid2) + side.Val + 2 * xp2.Val;
        if (Er2 < 161061 || El2 < 161061) {
            System.arraycopy(X2, X_ptr, Y2, Y_ptr, N2);
            return;
        }
        int kl2 = Inlines.celt_ilog2(El2) >> 1;
        int kr2 = Inlines.celt_ilog2(Er2) >> 1;
        int t2 = Inlines.VSHR32(El2, kl2 - 7 << 1);
        int lgain = Inlines.celt_rsqrt_norm(t2);
        t2 = Inlines.VSHR32(Er2, kr2 - 7 << 1);
        int rgain = Inlines.celt_rsqrt_norm(t2);
        if (kl2 < 7) {
            kl2 = 7;
        }
        if (kr2 < 7) {
            kr2 = 7;
        }
        for (int j2 = 0; j2 < N2; ++j2) {
            int l2 = Inlines.MULT16_16_P15(mid, X2[X_ptr + j2]);
            int r2 = Y2[Y_ptr + j2];
            X2[X_ptr + j2] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MULT16_16(lgain, Inlines.SUB16(l2, r2)), kl2 + 1));
            Y2[Y_ptr + j2] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MULT16_16(rgain, Inlines.ADD16(l2, r2)), kr2 + 1));
        }
    }

    static int spreading_decision(CeltMode m2, int[][] X2, BoxedValueInt average, int last_decision, BoxedValueInt hf_average, BoxedValueInt tapset_decision, int update_hf, int end, int C2, int M2) {
        int sum = 0;
        int nbBands = 0;
        short[] eBands = m2.eBands;
        int hf_sum = 0;
        Inlines.OpusAssert(end > 0);
        if (M2 * (eBands[end] - eBands[end - 1]) <= 8) {
            return 0;
        }
        int c2 = 0;
        do {
            for (int i2 = 0; i2 < end; ++i2) {
                int tmp = 0;
                int[] tcount = new int[]{0, 0, 0};
                int[] x2 = X2[c2];
                int x_ptr = M2 * eBands[i2];
                int N2 = M2 * (eBands[i2 + 1] - eBands[i2]);
                if (N2 <= 8) continue;
                for (int j2 = x_ptr; j2 < N2 + x_ptr; ++j2) {
                    int x2N = Inlines.MULT16_16(Inlines.MULT16_16_Q15(x2[j2], x2[j2]), N2);
                    if (x2N < 2048) {
                        tcount[0] = tcount[0] + 1;
                    }
                    if (x2N < 512) {
                        tcount[1] = tcount[1] + 1;
                    }
                    if (x2N >= 128) continue;
                    tcount[2] = tcount[2] + 1;
                }
                if (i2 > m2.nbEBands - 4) {
                    hf_sum += Inlines.celt_udiv(32 * (tcount[1] + tcount[0]), N2);
                }
                tmp = (2 * tcount[2] >= N2 ? 1 : 0) + (2 * tcount[1] >= N2 ? 1 : 0) + (2 * tcount[0] >= N2 ? 1 : 0);
                sum += tmp * 256;
                ++nbBands;
            }
        } while (++c2 < C2);
        if (update_hf != 0) {
            if (hf_sum != 0) {
                hf_sum = Inlines.celt_udiv(hf_sum, C2 * (4 - m2.nbEBands + end));
            }
            hf_sum = hf_average.Val = hf_average.Val + hf_sum >> 1;
            if (tapset_decision.Val == 2) {
                hf_sum += 4;
            } else if (tapset_decision.Val == 0) {
                hf_sum -= 4;
            }
            tapset_decision.Val = hf_sum > 22 ? 2 : (hf_sum > 18 ? 1 : 0);
        }
        Inlines.OpusAssert(nbBands > 0);
        Inlines.OpusAssert(sum >= 0);
        sum = Inlines.celt_udiv(sum, nbBands);
        average.Val = sum = sum + average.Val >> 1;
        sum = 3 * sum + ((3 - last_decision << 7) + 64) + 2 >> 2;
        int decision = sum < 80 ? 3 : (sum < 256 ? 2 : (sum < 384 ? 1 : 0));
        return decision;
    }

    static void deinterleave_hadamard(int[] X2, int X_ptr, int N0, int stride, int hadamard) {
        int N2 = N0 * stride;
        int[] tmp = new int[N2];
        Inlines.OpusAssert(stride > 0);
        if (hadamard != 0) {
            int ordery = stride - 2;
            for (int i2 = 0; i2 < stride; ++i2) {
                for (int j2 = 0; j2 < N0; ++j2) {
                    tmp[CeltTables.ordery_table[ordery + i2] * N0 + j2] = X2[j2 * stride + i2 + X_ptr];
                }
            }
        } else {
            for (int i3 = 0; i3 < stride; ++i3) {
                for (int j3 = 0; j3 < N0; ++j3) {
                    tmp[i3 * N0 + j3] = X2[j3 * stride + i3 + X_ptr];
                }
            }
        }
        System.arraycopy(tmp, 0, X2, X_ptr, N2);
    }

    static void interleave_hadamard(int[] X2, int X_ptr, int N0, int stride, int hadamard) {
        int N2 = N0 * stride;
        int[] tmp = new int[N2];
        if (hadamard != 0) {
            int ordery = stride - 2;
            for (int i2 = 0; i2 < stride; ++i2) {
                for (int j2 = 0; j2 < N0; ++j2) {
                    tmp[j2 * stride + i2] = X2[CeltTables.ordery_table[ordery + i2] * N0 + j2 + X_ptr];
                }
            }
        } else {
            for (int i3 = 0; i3 < stride; ++i3) {
                for (int j3 = 0; j3 < N0; ++j3) {
                    tmp[j3 * stride + i3] = X2[i3 * N0 + j3 + X_ptr];
                }
            }
        }
        System.arraycopy(tmp, 0, X2, X_ptr, N2);
    }

    static void haar1(int[] X2, int X_ptr, int N0, int stride) {
        N0 >>= 1;
        for (int i2 = 0; i2 < stride; ++i2) {
            for (int j2 = 0; j2 < N0; ++j2) {
                int tmpidx = X_ptr + i2 + stride * 2 * j2;
                int tmp1 = Inlines.MULT16_16(23170, X2[tmpidx]);
                int tmp2 = Inlines.MULT16_16(23170, X2[tmpidx + stride]);
                X2[tmpidx] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.ADD32(tmp1, tmp2), 15));
                X2[tmpidx + stride] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.SUB32(tmp1, tmp2), 15));
            }
        }
    }

    static void haar1ZeroOffset(int[] X2, int N0, int stride) {
        N0 >>= 1;
        for (int i2 = 0; i2 < stride; ++i2) {
            for (int j2 = 0; j2 < N0; ++j2) {
                int tmpidx = i2 + stride * 2 * j2;
                int tmp1 = Inlines.MULT16_16(23170, X2[tmpidx]);
                int tmp2 = Inlines.MULT16_16(23170, X2[tmpidx + stride]);
                X2[tmpidx] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.ADD32(tmp1, tmp2), 15));
                X2[tmpidx + stride] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.SUB32(tmp1, tmp2), 15));
            }
        }
    }

    static int compute_qn(int N2, int b2, int offset, int pulse_cap, int stereo) {
        int qn2;
        short[] exp2_table8 = new short[]{16384, 17866, 19483, 21247, 23170, 25267, 27554, 30048};
        int N22 = 2 * N2 - 1;
        if (stereo != 0 && N2 == 2) {
            --N22;
        }
        int qb2 = Inlines.celt_sudiv(b2 + N22 * offset, N22);
        qb2 = Inlines.IMIN(b2 - pulse_cap - 32, qb2);
        if ((qb2 = Inlines.IMIN(64, qb2)) < 4) {
            qn2 = 1;
        } else {
            qn2 = exp2_table8[qb2 & 7] >> 14 - (qb2 >> 3);
            qn2 = qn2 + 1 >> 1 << 1;
        }
        Inlines.OpusAssert(qn2 <= 256);
        return qn2;
    }

    static void compute_theta(band_ctx ctx, split_ctx sctx, int[] X2, int X_ptr, int[] Y2, int Y_ptr, int N2, BoxedValueInt b2, int B2, int B0, int LM2, int stereo, BoxedValueInt fill) {
        int delta;
        int iside;
        int imid;
        int itheta = 0;
        int inv = 0;
        int encode = ctx.encode;
        CeltMode m2 = ctx.m;
        int i2 = ctx.i;
        int intensity = ctx.intensity;
        EntropyCoder ec2 = ctx.ec;
        int[][] bandE = ctx.bandE;
        int pulse_cap = m2.logN[i2] + LM2 * 8;
        int offset = (pulse_cap >> 1) - (stereo != 0 && N2 == 2 ? 16 : 4);
        int qn2 = Bands.compute_qn(N2, b2.Val, offset, pulse_cap, stereo);
        if (stereo != 0 && i2 >= intensity) {
            qn2 = 1;
        }
        if (encode != 0) {
            itheta = VQ.stereo_itheta(X2, X_ptr, Y2, Y_ptr, stereo, N2);
        }
        int tell = ec2.tell_frac();
        if (qn2 != 1) {
            if (encode != 0) {
                itheta = itheta * qn2 + 8192 >> 14;
            }
            if (stereo != 0 && N2 > 2) {
                int p0 = 3;
                int x2 = itheta;
                int x0 = qn2 / 2;
                long ft2 = Inlines.CapToUInt32(p0 * (x0 + 1) + x0);
                if (encode != 0) {
                    ec2.encode(x2 <= x0 ? p0 * x2 : x2 - 1 - x0 + (x0 + 1) * p0, x2 <= x0 ? p0 * (x2 + 1) : x2 - x0 + (x0 + 1) * p0, ft2);
                } else {
                    int fs2 = (int)ec2.decode(ft2);
                    x2 = fs2 < (x0 + 1) * p0 ? fs2 / p0 : x0 + 1 + (fs2 - (x0 + 1) * p0);
                    ec2.dec_update(x2 <= x0 ? p0 * x2 : x2 - 1 - x0 + (x0 + 1) * p0, x2 <= x0 ? p0 * (x2 + 1) : x2 - x0 + (x0 + 1) * p0, ft2);
                    itheta = x2;
                }
            } else if (B0 > 1 || stereo != 0) {
                if (encode != 0) {
                    ec2.enc_uint(itheta, qn2 + 1);
                } else {
                    itheta = (int)ec2.dec_uint(qn2 + 1);
                }
            } else {
                int fs3 = 1;
                int ft3 = ((qn2 >> 1) + 1) * ((qn2 >> 1) + 1);
                if (encode != 0) {
                    fs3 = itheta <= qn2 >> 1 ? itheta + 1 : qn2 + 1 - itheta;
                    int fl2 = itheta <= qn2 >> 1 ? itheta * (itheta + 1) >> 1 : ft3 - ((qn2 + 1 - itheta) * (qn2 + 2 - itheta) >> 1);
                    ec2.encode(fl2, fl2 + fs3, ft3);
                } else {
                    int fl3 = 0;
                    int fm2 = (int)ec2.decode(ft3);
                    if (fm2 < (qn2 >> 1) * ((qn2 >> 1) + 1) >> 1) {
                        itheta = Inlines.isqrt32(8 * fm2 + 1) - 1 >> 1;
                        fs3 = itheta + 1;
                        fl3 = itheta * (itheta + 1) >> 1;
                    } else {
                        itheta = 2 * (qn2 + 1) - Inlines.isqrt32(8 * (ft3 - fm2 - 1) + 1) >> 1;
                        fs3 = qn2 + 1 - itheta;
                        fl3 = ft3 - ((qn2 + 1 - itheta) * (qn2 + 2 - itheta) >> 1);
                    }
                    ec2.dec_update(fl3, fl3 + fs3, ft3);
                }
            }
            Inlines.OpusAssert(itheta >= 0);
            itheta = Inlines.celt_udiv(itheta * 16384, qn2);
            if (encode != 0 && stereo != 0) {
                if (itheta == 0) {
                    Bands.intensity_stereo(m2, X2, X_ptr, Y2, Y_ptr, bandE, i2, N2);
                } else {
                    Bands.stereo_split(X2, X_ptr, Y2, Y_ptr, N2);
                }
            }
        } else if (stereo != 0) {
            if (encode != 0) {
                int n2 = inv = itheta > 8192 ? 1 : 0;
                if (inv != 0) {
                    for (int j2 = 0; j2 < N2; ++j2) {
                        Y2[Y_ptr + j2] = 0 - Y2[Y_ptr + j2];
                    }
                }
                Bands.intensity_stereo(m2, X2, X_ptr, Y2, Y_ptr, bandE, i2, N2);
            }
            if (b2.Val > 16 && ctx.remaining_bits > 16) {
                if (encode != 0) {
                    ec2.enc_bit_logp(inv, 2);
                } else {
                    inv = ec2.dec_bit_logp(2L);
                }
            } else {
                inv = 0;
            }
            itheta = 0;
        }
        int qalloc = ec2.tell_frac() - tell;
        b2.Val -= qalloc;
        if (itheta == 0) {
            imid = Short.MAX_VALUE;
            iside = 0;
            fill.Val &= (1 << B2) - 1;
            delta = -16384;
        } else if (itheta == 16384) {
            imid = 0;
            iside = Short.MAX_VALUE;
            fill.Val &= (1 << B2) - 1 << B2;
            delta = 16384;
        } else {
            imid = Bands.bitexact_cos((short)itheta);
            iside = Bands.bitexact_cos((short)(16384 - itheta));
            delta = Inlines.FRAC_MUL16(N2 - 1 << 7, Bands.bitexact_log2tan(iside, imid));
        }
        sctx.inv = inv;
        sctx.imid = imid;
        sctx.iside = iside;
        sctx.delta = delta;
        sctx.itheta = itheta;
        sctx.qalloc = qalloc;
    }

    static int quant_band_n1(band_ctx ctx, int[] X2, int X_ptr, int[] Y2, int Y_ptr, int b2, int[] lowband_out, int lowband_out_ptr) {
        boolean resynth = ctx.encode == 0;
        int[] x2 = X2;
        int x_ptr = X_ptr;
        int encode = ctx.encode;
        EntropyCoder ec2 = ctx.ec;
        int stereo = Y2 != null ? 1 : 0;
        int c2 = 0;
        do {
            int sign = 0;
            if (ctx.remaining_bits >= 8) {
                if (encode != 0) {
                    sign = x2[x_ptr] < 0 ? 1 : 0;
                    ec2.enc_bits(sign, 1);
                } else {
                    sign = ec2.dec_bits(1);
                }
                ctx.remaining_bits -= 8;
                b2 -= 8;
            }
            if (resynth) {
                x2[x_ptr] = sign != 0 ? -16384 : 16384;
            }
            x2 = Y2;
            x_ptr = Y_ptr;
        } while (++c2 < 1 + stereo);
        if (lowband_out != null) {
            lowband_out[lowband_out_ptr] = Inlines.SHR16(X2[X_ptr], 4);
        }
        return 1;
    }

    static int quant_partition(band_ctx ctx, int[] X2, int X_ptr, int N2, int b2, int B2, int[] lowband, int lowband_ptr, int LM2, int gain, int fill) {
        int imid = 0;
        int iside = 0;
        int B0 = B2;
        int mid = 0;
        int side = 0;
        int cm2 = 0;
        boolean resynth = ctx.encode == 0;
        int Y2 = 0;
        int encode = ctx.encode;
        CeltMode m2 = ctx.m;
        int i2 = ctx.i;
        int spread = ctx.spread;
        EntropyCoder ec2 = ctx.ec;
        short[] cache = m2.cache.bits;
        short cache_ptr = m2.cache.index[(LM2 + 1) * m2.nbEBands + i2];
        if (LM2 != -1 && b2 > cache[cache_ptr + cache[cache_ptr]] + 12 && N2 > 2) {
            split_ctx sctx = new split_ctx();
            int next_lowband2 = 0;
            Y2 = X_ptr + (N2 >>= 1);
            --LM2;
            if (B2 == 1) {
                fill = fill & 1 | fill << 1;
            }
            B2 = B2 + 1 >> 1;
            BoxedValueInt boxed_b = new BoxedValueInt(b2);
            BoxedValueInt boxed_fill = new BoxedValueInt(fill);
            Bands.compute_theta(ctx, sctx, X2, X_ptr, X2, Y2, N2, boxed_b, B2, B0, LM2, 0, boxed_fill);
            b2 = boxed_b.Val;
            fill = boxed_fill.Val;
            imid = sctx.imid;
            iside = sctx.iside;
            int delta = sctx.delta;
            int itheta = sctx.itheta;
            int qalloc = sctx.qalloc;
            mid = imid;
            side = iside;
            if (B0 > 1 && (itheta & 0x3FFF) != 0) {
                delta = itheta > 8192 ? (delta -= delta >> 4 - LM2) : Inlines.IMIN(0, delta + (N2 << 3 >> 5 - LM2));
            }
            int mbits = Inlines.IMAX(0, Inlines.IMIN(b2, (b2 - delta) / 2));
            int sbits = b2 - mbits;
            ctx.remaining_bits -= qalloc;
            if (lowband != null) {
                next_lowband2 = lowband_ptr + N2;
            }
            int rebalance = ctx.remaining_bits;
            if (mbits >= sbits) {
                cm2 = Bands.quant_partition(ctx, X2, X_ptr, N2, mbits, B2, lowband, lowband_ptr, LM2, Inlines.MULT16_16_P15(gain, mid), fill);
                if ((rebalance = mbits - (rebalance - ctx.remaining_bits)) > 24 && itheta != 0) {
                    sbits += rebalance - 24;
                }
                cm2 |= Bands.quant_partition(ctx, X2, Y2, N2, sbits, B2, lowband, next_lowband2, LM2, Inlines.MULT16_16_P15(gain, side), fill >> B2) << (B0 >> 1);
            } else {
                cm2 = Bands.quant_partition(ctx, X2, Y2, N2, sbits, B2, lowband, next_lowband2, LM2, Inlines.MULT16_16_P15(gain, side), fill >> B2) << (B0 >> 1);
                if ((rebalance = sbits - (rebalance - ctx.remaining_bits)) > 24 && itheta != 16384) {
                    mbits += rebalance - 24;
                }
                cm2 |= Bands.quant_partition(ctx, X2, X_ptr, N2, mbits, B2, lowband, lowband_ptr, LM2, Inlines.MULT16_16_P15(gain, mid), fill);
            }
        } else {
            int q2 = Rate.bits2pulses(m2, i2, LM2, b2);
            int curr_bits = Rate.pulses2bits(m2, i2, LM2, q2);
            ctx.remaining_bits -= curr_bits;
            while (ctx.remaining_bits < 0 && q2 > 0) {
                ctx.remaining_bits += curr_bits;
                curr_bits = Rate.pulses2bits(m2, i2, LM2, --q2);
                ctx.remaining_bits -= curr_bits;
            }
            if (q2 != 0) {
                int K2 = Rate.get_pulses(q2);
                cm2 = encode != 0 ? VQ.alg_quant(X2, X_ptr, N2, K2, spread, B2, ec2) : VQ.alg_unquant(X2, X_ptr, N2, K2, spread, B2, ec2, gain);
            } else if (resynth) {
                int cm_mask = (1 << B2) - 1;
                if ((fill &= cm_mask) == 0) {
                    Arrays.MemSetWithOffset(X2, 0, X_ptr, N2);
                } else {
                    if (lowband == null) {
                        for (int j2 = 0; j2 < N2; ++j2) {
                            ctx.seed = Bands.celt_lcg_rand(ctx.seed);
                            X2[X_ptr + j2] = ctx.seed >> 20;
                        }
                        cm2 = cm_mask;
                    } else {
                        for (int j3 = 0; j3 < N2; ++j3) {
                            ctx.seed = Bands.celt_lcg_rand(ctx.seed);
                            int tmp = 4;
                            tmp = (ctx.seed & 0x8000) != 0 ? tmp : 0 - tmp;
                            X2[X_ptr + j3] = lowband[lowband_ptr + j3] + tmp;
                        }
                        cm2 = fill;
                    }
                    VQ.renormalise_vector(X2, X_ptr, N2, gain);
                }
            }
        }
        return cm2;
    }

    static int quant_band(band_ctx ctx, int[] X2, int X_ptr, int N2, int b2, int B2, int[] lowband, int lowband_ptr, int LM2, int[] lowband_out, int lowband_out_ptr, int gain, int[] lowband_scratch, int lowband_scratch_ptr, int fill) {
        int k2;
        int N0 = N2;
        int N_B = N2;
        int B0 = B2;
        int time_divide = 0;
        int recombine = 0;
        int cm2 = 0;
        boolean resynth = ctx.encode == 0;
        int encode = ctx.encode;
        int tf_change = ctx.tf_change;
        int longBlocks = B0 == 1 ? 1 : 0;
        N_B = Inlines.celt_udiv(N_B, B2);
        if (N2 == 1) {
            return Bands.quant_band_n1(ctx, X2, X_ptr, null, 0, b2, lowband_out, lowband_out_ptr);
        }
        if (tf_change > 0) {
            recombine = tf_change;
        }
        if (lowband_scratch != null && lowband != null && (recombine != 0 || (N_B & 1) == 0 && tf_change < 0 || B0 > 1)) {
            System.arraycopy(lowband, lowband_ptr, lowband_scratch, lowband_scratch_ptr, N2);
            lowband = lowband_scratch;
            lowband_ptr = lowband_scratch_ptr;
        }
        for (k2 = 0; k2 < recombine; ++k2) {
            if (encode != 0) {
                Bands.haar1(X2, X_ptr, N2 >> k2, 1 << k2);
            }
            if (lowband != null) {
                Bands.haar1(lowband, lowband_ptr, N2 >> k2, 1 << k2);
            }
            int idx1 = fill & 0xF;
            int idx2 = fill >> 4;
            if (idx1 < 0) {
                System.out.println("e");
            }
            if (idx2 < 0) {
                System.out.println("e");
            }
            fill = bit_interleave_table[fill & 0xF] | bit_interleave_table[fill >> 4] << 2;
        }
        B2 >>= recombine;
        N_B <<= recombine;
        while ((N_B & 1) == 0 && tf_change < 0) {
            if (encode != 0) {
                Bands.haar1(X2, X_ptr, N_B, B2);
            }
            if (lowband != null) {
                Bands.haar1(lowband, lowband_ptr, N_B, B2);
            }
            fill |= fill << B2;
            B2 <<= 1;
            N_B >>= 1;
            ++time_divide;
            ++tf_change;
        }
        B0 = B2;
        int N_B0 = N_B;
        if (B0 > 1) {
            if (encode != 0) {
                Bands.deinterleave_hadamard(X2, X_ptr, N_B >> recombine, B0 << recombine, longBlocks);
            }
            if (lowband != null) {
                Bands.deinterleave_hadamard(lowband, lowband_ptr, N_B >> recombine, B0 << recombine, longBlocks);
            }
        }
        cm2 = Bands.quant_partition(ctx, X2, X_ptr, N2, b2, B2, lowband, lowband_ptr, LM2, gain, fill);
        if (resynth) {
            if (B0 > 1) {
                Bands.interleave_hadamard(X2, X_ptr, N_B >> recombine, B0 << recombine, longBlocks);
            }
            N_B = N_B0;
            B2 = B0;
            for (k2 = 0; k2 < time_divide; ++k2) {
                cm2 |= cm2 >> (B2 >>= 1);
                Bands.haar1(X2, X_ptr, N_B <<= 1, B2);
            }
            for (k2 = 0; k2 < recombine; ++k2) {
                cm2 = bit_deinterleave_table[cm2];
                Bands.haar1(X2, X_ptr, N0 >> k2, 1 << k2);
            }
            B2 <<= recombine;
            if (lowband_out != null) {
                int n2 = Inlines.celt_sqrt(Inlines.SHL32(N0, 22));
                for (int j2 = 0; j2 < N0; ++j2) {
                    lowband_out[lowband_out_ptr + j2] = Inlines.MULT16_16_Q15(n2, X2[X_ptr + j2]);
                }
            }
            cm2 &= (1 << B2) - 1;
        }
        return cm2;
    }

    static int quant_band_stereo(band_ctx ctx, int[] X2, int X_ptr, int[] Y2, int Y_ptr, int N2, int b2, int B2, int[] lowband, int lowband_ptr, int LM2, int[] lowband_out, int lowband_out_ptr, int[] lowband_scratch, int lowband_scratch_ptr, int fill) {
        int sbits;
        int mbits;
        int imid = 0;
        int iside = 0;
        int inv = 0;
        int mid = 0;
        int side = 0;
        int cm2 = 0;
        boolean resynth = ctx.encode == 0;
        split_ctx sctx = new split_ctx();
        int encode = ctx.encode;
        EntropyCoder ec2 = ctx.ec;
        if (N2 == 1) {
            return Bands.quant_band_n1(ctx, X2, X_ptr, Y2, Y_ptr, b2, lowband_out, lowband_out_ptr);
        }
        int orig_fill = fill;
        BoxedValueInt boxed_b = new BoxedValueInt(b2);
        BoxedValueInt boxed_fill = new BoxedValueInt(fill);
        Bands.compute_theta(ctx, sctx, X2, X_ptr, Y2, Y_ptr, N2, boxed_b, B2, B2, LM2, 1, boxed_fill);
        b2 = boxed_b.Val;
        fill = boxed_fill.Val;
        inv = sctx.inv;
        imid = sctx.imid;
        iside = sctx.iside;
        int delta = sctx.delta;
        int itheta = sctx.itheta;
        int qalloc = sctx.qalloc;
        mid = imid;
        side = iside;
        if (N2 == 2) {
            int y2_ptr;
            int[] y2;
            int x2_ptr;
            int[] x2;
            int sign = 0;
            mbits = b2;
            sbits = 0;
            if (itheta != 0 && itheta != 16384) {
                sbits = 8;
            }
            mbits -= sbits;
            boolean c2 = itheta > 8192;
            ctx.remaining_bits -= qalloc + sbits;
            if (c2) {
                x2 = Y2;
                x2_ptr = Y_ptr;
                y2 = X2;
                y2_ptr = X_ptr;
            } else {
                x2 = X2;
                x2_ptr = X_ptr;
                y2 = Y2;
                y2_ptr = Y_ptr;
            }
            if (sbits != 0) {
                if (encode != 0) {
                    sign = x2[x2_ptr] * y2[Y_ptr + 1] - x2[x2_ptr + 1] * y2[Y_ptr] < 0 ? 1 : 0;
                    ec2.enc_bits(sign, 1);
                } else {
                    sign = ec2.dec_bits(1);
                }
            }
            sign = 1 - 2 * sign;
            cm2 = Bands.quant_band(ctx, x2, x2_ptr, N2, mbits, B2, lowband, lowband_ptr, LM2, lowband_out, lowband_out_ptr, Short.MAX_VALUE, lowband_scratch, lowband_scratch_ptr, orig_fill);
            y2[Y_ptr] = (0 - sign) * x2[x2_ptr + 1];
            y2[Y_ptr + 1] = sign * x2[x2_ptr];
            if (resynth) {
                X2[X_ptr] = Inlines.MULT16_16_Q15(mid, X2[X_ptr]);
                X2[X_ptr + 1] = Inlines.MULT16_16_Q15(mid, X2[X_ptr + 1]);
                Y2[Y_ptr] = Inlines.MULT16_16_Q15(side, Y2[Y_ptr]);
                Y2[Y_ptr + 1] = Inlines.MULT16_16_Q15(side, Y2[Y_ptr + 1]);
                int tmp = X2[X_ptr];
                X2[X_ptr] = Inlines.SUB16(tmp, Y2[Y_ptr]);
                Y2[Y_ptr] = Inlines.ADD16(tmp, Y2[Y_ptr]);
                tmp = X2[X_ptr + 1];
                X2[X_ptr + 1] = Inlines.SUB16(tmp, Y2[Y_ptr + 1]);
                Y2[Y_ptr + 1] = Inlines.ADD16(tmp, Y2[Y_ptr + 1]);
            }
        } else {
            mbits = Inlines.IMAX(0, Inlines.IMIN(b2, (b2 - delta) / 2));
            sbits = b2 - mbits;
            ctx.remaining_bits -= qalloc;
            int rebalance = ctx.remaining_bits;
            if (mbits >= sbits) {
                cm2 = Bands.quant_band(ctx, X2, X_ptr, N2, mbits, B2, lowband, lowband_ptr, LM2, lowband_out, lowband_out_ptr, Short.MAX_VALUE, lowband_scratch, lowband_scratch_ptr, fill);
                if ((rebalance = mbits - (rebalance - ctx.remaining_bits)) > 24 && itheta != 0) {
                    sbits += rebalance - 24;
                }
                cm2 |= Bands.quant_band(ctx, Y2, Y_ptr, N2, sbits, B2, null, 0, LM2, null, 0, side, null, 0, fill >> B2);
            } else {
                cm2 = Bands.quant_band(ctx, Y2, Y_ptr, N2, sbits, B2, null, 0, LM2, null, 0, side, null, 0, fill >> B2);
                if ((rebalance = sbits - (rebalance - ctx.remaining_bits)) > 24 && itheta != 16384) {
                    mbits += rebalance - 24;
                }
                cm2 |= Bands.quant_band(ctx, X2, X_ptr, N2, mbits, B2, lowband, lowband_ptr, LM2, lowband_out, lowband_out_ptr, Short.MAX_VALUE, lowband_scratch, lowband_scratch_ptr, fill);
            }
        }
        if (resynth) {
            if (N2 != 2) {
                Bands.stereo_merge(X2, X_ptr, Y2, Y_ptr, mid, N2);
            }
            if (inv != 0) {
                for (int j2 = Y_ptr; j2 < N2 + Y_ptr; ++j2) {
                    Y2[j2] = (short)(0 - Y2[j2]);
                }
            }
        }
        return cm2;
    }

    static void quant_all_bands(int encode, CeltMode m2, int start, int end, int[] X_, int[] Y_, short[] collapse_masks, int[][] bandE, int[] pulses, int shortBlocks, int spread, int dual_stereo, int intensity, int[] tf_res, int total_bits, int balance, EntropyCoder ec2, int LM2, int codedBands, BoxedValueInt seed) {
        short[] eBands = m2.eBands;
        boolean update_lowband = true;
        int C2 = Y_ != null ? 2 : 1;
        boolean resynth = encode == 0;
        band_ctx ctx = new band_ctx();
        int M2 = 1 << LM2;
        int B2 = shortBlocks != 0 ? M2 : 1;
        int norm_offset = M2 * eBands[start];
        int[] norm = new int[C2 * (M2 * eBands[m2.nbEBands - 1] - norm_offset)];
        int norm2 = M2 * eBands[m2.nbEBands - 1] - norm_offset;
        int[] lowband_scratch = X_;
        int lowband_scratch_ptr = M2 * eBands[m2.nbEBands - 1];
        int lowband_offset = 0;
        ctx.bandE = bandE;
        ctx.ec = ec2;
        ctx.encode = encode;
        ctx.intensity = intensity;
        ctx.m = m2;
        ctx.seed = seed.Val;
        ctx.spread = spread;
        for (int i2 = start; i2 < end; ++i2) {
            long x_cm;
            long y_cm;
            int b2;
            int remaining_bits;
            int[] Y2;
            int effective_lowband = -1;
            int Y_ptr = 0;
            int tf_change = 0;
            ctx.i = i2;
            boolean last = i2 == end - 1;
            int[] X2 = X_;
            int X_ptr = M2 * eBands[i2];
            if (Y_ != null) {
                Y2 = Y_;
                Y_ptr = M2 * eBands[i2];
            } else {
                Y2 = null;
            }
            int N2 = M2 * eBands[i2 + 1] - M2 * eBands[i2];
            int tell = ec2.tell_frac();
            if (i2 != start) {
                balance -= tell;
            }
            ctx.remaining_bits = remaining_bits = total_bits - tell - 1;
            if (i2 <= codedBands - 1) {
                int curr_balance = Inlines.celt_sudiv(balance, Inlines.IMIN(3, codedBands - i2));
                b2 = Inlines.IMAX(0, Inlines.IMIN(16383, Inlines.IMIN(remaining_bits + 1, pulses[i2] + curr_balance)));
            } else {
                b2 = 0;
            }
            if (resynth && M2 * eBands[i2] - N2 >= M2 * eBands[start] && (update_lowband || lowband_offset == 0)) {
                lowband_offset = i2;
            }
            ctx.tf_change = tf_change = tf_res[i2];
            if (i2 >= m2.effEBands) {
                X2 = norm;
                X_ptr = 0;
                if (Y_ != null) {
                    Y2 = norm;
                    Y_ptr = 0;
                }
                lowband_scratch = null;
            }
            if (i2 == end - 1) {
                lowband_scratch = null;
            }
            if (lowband_offset != 0 && (spread != 3 || B2 > 1 || tf_change < 0)) {
                effective_lowband = Inlines.IMAX(0, M2 * eBands[lowband_offset] - norm_offset - N2);
                int fold_start = lowband_offset;
                while (M2 * eBands[--fold_start] > effective_lowband + norm_offset) {
                }
                int fold_end = lowband_offset - 1;
                while (M2 * eBands[++fold_end] < effective_lowband + norm_offset + N2) {
                }
                y_cm = 0L;
                x_cm = 0L;
                int fold_i = fold_start;
                do {
                    x_cm |= (long)collapse_masks[fold_i * C2 + 0];
                    y_cm |= (long)collapse_masks[fold_i * C2 + C2 - 1];
                } while (++fold_i < fold_end);
            } else {
                x_cm = y_cm = (long)((1 << B2) - 1);
            }
            if (dual_stereo != 0 && i2 == intensity) {
                dual_stereo = 0;
                if (resynth) {
                    for (int j2 = 0; j2 < M2 * eBands[i2] - norm_offset; ++j2) {
                        norm[j2] = Inlines.HALF32(norm[j2] + norm[norm2 + j2]);
                    }
                }
            }
            if (dual_stereo != 0) {
                x_cm = Bands.quant_band(ctx, X2, X_ptr, N2, b2 / 2, B2, (int[])(effective_lowband != -1 ? norm : null), effective_lowband, LM2, last ? null : norm, M2 * eBands[i2] - norm_offset, Short.MAX_VALUE, lowband_scratch, lowband_scratch_ptr, (int)x_cm);
                y_cm = Bands.quant_band(ctx, Y2, Y_ptr, N2, b2 / 2, B2, (int[])(effective_lowband != -1 ? norm : null), norm2 + effective_lowband, LM2, last ? null : norm, norm2 + (M2 * eBands[i2] - norm_offset), Short.MAX_VALUE, lowband_scratch, lowband_scratch_ptr, (int)y_cm);
            } else {
                x_cm = Y2 != null ? (long)Bands.quant_band_stereo(ctx, X2, X_ptr, Y2, Y_ptr, N2, b2, B2, (int[])(effective_lowband != -1 ? norm : null), effective_lowband, LM2, last ? null : norm, M2 * eBands[i2] - norm_offset, lowband_scratch, lowband_scratch_ptr, (int)(x_cm | y_cm)) : (long)Bands.quant_band(ctx, X2, X_ptr, N2, b2, B2, (int[])(effective_lowband != -1 ? norm : null), effective_lowband, LM2, last ? null : norm, M2 * eBands[i2] - norm_offset, Short.MAX_VALUE, lowband_scratch, lowband_scratch_ptr, (int)(x_cm | y_cm));
                y_cm = x_cm;
            }
            collapse_masks[i2 * C2 + 0] = (short)(x_cm & 0xFFL);
            collapse_masks[i2 * C2 + C2 - 1] = (short)(y_cm & 0xFFL);
            balance += pulses[i2] + tell;
            update_lowband = b2 > N2 << 3;
        }
        seed.Val = ctx.seed;
    }

    public static class split_ctx {
        public int inv;
        public int imid;
        public int iside;
        public int delta;
        public int itheta;
        public int qalloc;
    }

    public static class band_ctx {
        public int encode;
        public CeltMode m;
        public int i;
        public int intensity;
        public int spread;
        public int tf_change;
        public EntropyCoder ec;
        public int remaining_bits;
        public int[][] bandE;
        public int seed;
    }
}

