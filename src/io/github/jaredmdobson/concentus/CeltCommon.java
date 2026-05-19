/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.AnalysisInfo;
import io.github.jaredmdobson.concentus.Arrays;
import io.github.jaredmdobson.concentus.Bands;
import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.CeltTables;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;
import io.github.jaredmdobson.concentus.MDCT;
import io.github.jaredmdobson.concentus.OpusFramesize;
import io.github.jaredmdobson.concentus.Pitch;

class CeltCommon {
    private static final short[] inv_table = new short[]{255, 255, 156, 110, 86, 70, 59, 51, 45, 40, 37, 33, 31, 28, 26, 25, 23, 22, 21, 20, 19, 18, 17, 16, 16, 15, 15, 14, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 9, 9, 8, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2};
    private static final short[][] gains = new short[][]{{10048, 7112, 4248}, {15200, 8784, 0}, {26208, 3280, 0}};
    private static final byte[][] tf_select_table = new byte[][]{{0, -1, 0, -1, 0, -1, 0, -1}, {0, -1, 0, -2, 1, 0, 1, -1}, {0, -2, 0, -3, 2, 0, 1, -1}, {0, -2, 0, -3, 3, 0, 1, -1}};

    CeltCommon() {
    }

    static int compute_vbr(CeltMode mode, AnalysisInfo analysis, int base_target, int LM2, int bitrate, int lastCodedBands, int C2, int intensity, int constrained_vbr, int stereo_saving, int tot_boost, int tf_estimate, int pitch_change, int maxDepth, OpusFramesize variable_duration, int lfe, int has_surround_mask, int surround_masking, int temporal_vbr) {
        int nbEBands = mode.nbEBands;
        short[] eBands = mode.eBands;
        int coded_bands = lastCodedBands != 0 ? lastCodedBands : nbEBands;
        int coded_bins = eBands[coded_bands] << LM2;
        if (C2 == 2) {
            coded_bins += eBands[Inlines.IMIN(intensity, coded_bands)] << LM2;
        }
        int target = base_target;
        if (analysis.enabled && analysis.valid != 0 && (double)analysis.activity < 0.4) {
            target -= (int)((float)(coded_bins << 3) * (0.4f - analysis.activity));
        }
        if (C2 == 2) {
            int coded_stereo_bands = Inlines.IMIN(intensity, coded_bands);
            int coded_stereo_dof = (eBands[coded_stereo_bands] << LM2) - coded_stereo_bands;
            int max_frac = Inlines.DIV32_16(Inlines.MULT16_16(26214, coded_stereo_dof), coded_bins);
            stereo_saving = Inlines.MIN16(stereo_saving, 256);
            target -= Inlines.MIN32(Inlines.MULT16_32_Q15(max_frac, target), Inlines.SHR32(Inlines.MULT16_16(stereo_saving - 26, coded_stereo_dof << 3), 8));
        }
        target += tot_boost - (16 << LM2);
        int tf_calibration = variable_duration == OpusFramesize.OPUS_FRAMESIZE_VARIABLE ? 328 : 655;
        target += Inlines.SHL32(Inlines.MULT16_32_Q15(tf_estimate - tf_calibration, target), 1);
        if (analysis.enabled && analysis.valid != 0 && lfe == 0) {
            float tonal = Inlines.MAX16(0.0f, analysis.tonality - 0.15f) - 0.09f;
            int tonal_target = target + (int)((float)(coded_bins << 3) * 1.2f * tonal);
            if (pitch_change != 0) {
                tonal_target += (int)((float)(coded_bins << 3) * 0.8f);
            }
            target = tonal_target;
        }
        if (has_surround_mask != 0 && lfe == 0) {
            int surround_target = target + Inlines.SHR32(Inlines.MULT16_16(surround_masking, coded_bins << 3), 10);
            target = Inlines.IMAX(target / 4, surround_target);
        }
        int bins = eBands[nbEBands - 2] << LM2;
        int floor_depth = Inlines.SHR32(Inlines.MULT16_16(C2 * bins << 3, maxDepth), 10);
        floor_depth = Inlines.IMAX(floor_depth, target >> 2);
        target = Inlines.IMIN(target, floor_depth);
        if (!(has_surround_mask != 0 && lfe == 0 || constrained_vbr == 0 && bitrate >= 64000)) {
            int rate_factor = Inlines.MAX16(0, bitrate - 32000);
            if (constrained_vbr != 0) {
                rate_factor = Inlines.MIN16(rate_factor, 21955);
            }
            target = base_target + Inlines.MULT16_32_Q15(rate_factor, target - base_target);
        }
        if (has_surround_mask == 0 && tf_estimate < 3277) {
            int amount = Inlines.MULT16_16_Q15(3329, Inlines.IMAX(0, Inlines.IMIN(32000, 96000 - bitrate)));
            int tvbr_factor = Inlines.SHR32(Inlines.MULT16_16(temporal_vbr, amount), 10);
            target += Inlines.MULT16_32_Q15(tvbr_factor, target);
        }
        target = Inlines.IMIN(2 * base_target, target);
        return target;
    }

    static int transient_analysis(int[][] input, int len, int C2, BoxedValueInt tf_estimate, BoxedValueInt tf_chan) {
        int is_transient = 0;
        int mask_metric = 0;
        tf_chan.Val = 0;
        int[] tmp = new int[len];
        int len2 = len / 2;
        for (int c2 = 0; c2 < C2; ++c2) {
            int i2;
            int unmask = 0;
            int mem0 = 0;
            int mem1 = 0;
            for (i2 = 0; i2 < len; ++i2) {
                int x2 = Inlines.SHR32(input[c2][i2], 12);
                int y2 = Inlines.ADD32(mem0, x2);
                mem0 = mem1 + y2 - Inlines.SHL32(x2, 1);
                mem1 = x2 - Inlines.SHR32(y2, 1);
                tmp[i2] = Inlines.EXTRACT16(Inlines.SHR32(y2, 2));
            }
            Arrays.MemSet(tmp, 0, 12);
            int shift = 0;
            shift = 14 - Inlines.celt_ilog2(1 + Inlines.celt_maxabs32(tmp, 0, len));
            if (shift != 0) {
                for (i2 = 0; i2 < len; ++i2) {
                    tmp[i2] = Inlines.SHL16(tmp[i2], shift);
                }
            }
            int mean = 0;
            mem0 = 0;
            for (i2 = 0; i2 < len2; ++i2) {
                int x2 = Inlines.PSHR32(Inlines.MULT16_16(tmp[2 * i2], tmp[2 * i2]) + Inlines.MULT16_16(tmp[2 * i2 + 1], tmp[2 * i2 + 1]), 16);
                mean += x2;
                tmp[i2] = mem0 + Inlines.PSHR32(x2 - mem0, 4);
                mem0 = tmp[i2];
            }
            mem0 = 0;
            int maxE = 0;
            for (i2 = len2 - 1; i2 >= 0; --i2) {
                tmp[i2] = mem0 + Inlines.PSHR32(tmp[i2] - mem0, 3);
                mem0 = tmp[i2];
                maxE = Inlines.MAX16(maxE, mem0);
            }
            mean = Inlines.MULT16_16(Inlines.celt_sqrt(mean), Inlines.celt_sqrt(Inlines.MULT16_16(maxE, len2 >> 1)));
            int norm = Inlines.SHL32(len2, 20) / Inlines.ADD32(1, Inlines.SHR32(mean, 1));
            unmask = 0;
            for (i2 = 12; i2 < len2 - 5; i2 += 4) {
                int id2 = Inlines.MAX32(0, Inlines.MIN32(127, Inlines.MULT16_32_Q15(tmp[i2] + 1, norm)));
                unmask += inv_table[id2];
            }
            if ((unmask = 64 * unmask * 4 / (6 * (len2 - 17))) <= mask_metric) continue;
            tf_chan.Val = c2;
            mask_metric = unmask;
        }
        is_transient = mask_metric > 200 ? 1 : 0;
        int tf_max = Inlines.MAX16(0, Inlines.celt_sqrt(27 * mask_metric) - 42);
        tf_estimate.Val = Inlines.celt_sqrt(Inlines.MAX32(0, Inlines.SHL32(Inlines.MULT16_16(113, Inlines.MIN16(163, tf_max)), 14) - 37312528));
        return is_transient;
    }

    static int patch_transient_decision(int[][] newE, int[][] oldE, int nbEBands, int start, int end, int C2) {
        int i2;
        int mean_diff = 0;
        int[] spread_old = new int[26];
        if (C2 == 1) {
            spread_old[start] = oldE[0][start];
            for (i2 = start + 1; i2 < end; ++i2) {
                spread_old[i2] = Inlines.MAX16(spread_old[i2 - 1] - 1024, oldE[0][i2]);
            }
        } else {
            spread_old[start] = Inlines.MAX16(oldE[0][start], oldE[1][start]);
            for (i2 = start + 1; i2 < end; ++i2) {
                spread_old[i2] = Inlines.MAX16(spread_old[i2 - 1] - 1024, Inlines.MAX16(oldE[0][i2], oldE[1][i2]));
            }
        }
        for (i2 = end - 2; i2 >= start; --i2) {
            spread_old[i2] = Inlines.MAX16(spread_old[i2], spread_old[i2 + 1] - 1024);
        }
        int c2 = 0;
        do {
            for (i2 = Inlines.IMAX(2, start); i2 < end - 1; ++i2) {
                int x1 = Inlines.MAX16(0, newE[c2][i2]);
                int x2 = Inlines.MAX16(0, spread_old[i2]);
                mean_diff = Inlines.ADD32(mean_diff, Inlines.MAX16(0, Inlines.SUB16(x1, x2)));
            }
        } while (++c2 < C2);
        return (mean_diff = Inlines.DIV32(mean_diff, C2 * (end - 1 - Inlines.IMAX(2, start)))) > 1024 ? 1 : 0;
    }

    static void compute_mdcts(CeltMode mode, int shortBlocks, int[][] input, int[][] output, int C2, int CC2, int LM2, int upsample) {
        int i2;
        int shift;
        int N2;
        int B2;
        int overlap = mode.overlap;
        if (shortBlocks != 0) {
            B2 = shortBlocks;
            N2 = mode.shortMdctSize;
            shift = mode.maxLM;
        } else {
            B2 = 1;
            N2 = mode.shortMdctSize << LM2;
            shift = mode.maxLM - LM2;
        }
        int c2 = 0;
        do {
            for (int b2 = 0; b2 < B2; ++b2) {
                MDCT.clt_mdct_forward(mode.mdct, input[c2], b2 * N2, output[c2], b2, mode.window, overlap, shift, B2);
            }
        } while (++c2 < CC2);
        if (CC2 == 2 && C2 == 1) {
            for (i2 = 0; i2 < B2 * N2; ++i2) {
                output[0][i2] = Inlines.ADD32(Inlines.HALF32(output[0][i2]), Inlines.HALF32(output[1][i2]));
            }
        }
        if (upsample != 1) {
            c2 = 0;
            do {
                int bound = B2 * N2 / upsample;
                i2 = 0;
                while (i2 < bound) {
                    int[] nArray = output[c2];
                    int n2 = i2++;
                    nArray[n2] = nArray[n2] * upsample;
                }
                Arrays.MemSetWithOffset(output[c2], 0, bound, B2 * N2 - bound);
            } while (++c2 < C2);
        }
    }

    static void celt_preemphasis(short[] pcmp, int pcmp_ptr, int[] inp, int inp_ptr, int N2, int CC2, int upsample, int[] coef, BoxedValueInt mem, int clip) {
        int i2;
        int coef0 = coef[0];
        int m2 = mem.Val;
        if (coef[1] == 0 && upsample == 1 && clip == 0) {
            for (int i3 = 0; i3 < N2; ++i3) {
                short x2 = pcmp[pcmp_ptr + CC2 * i3];
                inp[inp_ptr + i3] = Inlines.SHL32(x2, 12) - m2;
                m2 = Inlines.SHR32(Inlines.MULT16_16(coef0, (int)x2), 3);
            }
            mem.Val = m2;
            return;
        }
        int Nu2 = N2 / upsample;
        if (upsample != 1) {
            Arrays.MemSetWithOffset(inp, 0, inp_ptr, N2);
        }
        for (i2 = 0; i2 < Nu2; ++i2) {
            inp[inp_ptr + i2 * upsample] = pcmp[pcmp_ptr + CC2 * i2];
        }
        for (i2 = 0; i2 < N2; ++i2) {
            int x3 = inp[inp_ptr + i2];
            inp[inp_ptr + i2] = Inlines.SHL32(x3, 12) - m2;
            m2 = Inlines.SHR32(Inlines.MULT16_16(coef0, x3), 3);
        }
        mem.Val = m2;
    }

    static void celt_preemphasis(short[] pcmp, int[] inp, int inp_ptr, int N2, int CC2, int upsample, int[] coef, BoxedValueInt mem, int clip) {
        int i2;
        int coef0 = coef[0];
        int m2 = mem.Val;
        if (coef[1] == 0 && upsample == 1 && clip == 0) {
            for (int i3 = 0; i3 < N2; ++i3) {
                short x2 = pcmp[CC2 * i3];
                inp[inp_ptr + i3] = Inlines.SHL32(x2, 12) - m2;
                m2 = Inlines.SHR32(Inlines.MULT16_16(coef0, (int)x2), 3);
            }
            mem.Val = m2;
            return;
        }
        int Nu2 = N2 / upsample;
        if (upsample != 1) {
            Arrays.MemSetWithOffset(inp, 0, inp_ptr, N2);
        }
        for (i2 = 0; i2 < Nu2; ++i2) {
            inp[inp_ptr + i2 * upsample] = pcmp[CC2 * i2];
        }
        for (i2 = 0; i2 < N2; ++i2) {
            int x3 = inp[inp_ptr + i2];
            inp[inp_ptr + i2] = Inlines.SHL32(x3, 12) - m2;
            m2 = Inlines.SHR32(Inlines.MULT16_16(coef0, x3), 3);
        }
        mem.Val = m2;
    }

    static int l1_metric(int[] tmp, int N2, int LM2, int bias) {
        int L1 = 0;
        for (int i2 = 0; i2 < N2; ++i2) {
            L1 += Inlines.EXTEND32(Inlines.ABS32(tmp[i2]));
        }
        L1 = Inlines.MAC16_32_Q15(L1, LM2 * bias, L1);
        return L1;
    }

    static int tf_analysis(CeltMode m2, int len, int isTransient, int[] tf_res, int lambda, int[][] X2, int N0, int LM2, BoxedValueInt tf_sum, int tf_estimate, int tf_chan) {
        int curr1;
        int curr0;
        int cost1;
        int cost0;
        int i2;
        int[] selcost = new int[2];
        int tf_select = 0;
        int bias = Inlines.MULT16_16_Q14(1311, Inlines.MAX16(-4096, 8192 - tf_estimate));
        int[] metric = new int[len];
        int[] tmp = new int[m2.eBands[len] - m2.eBands[len - 1] << LM2];
        int[] tmp_1 = new int[m2.eBands[len] - m2.eBands[len - 1] << LM2];
        int[] path0 = new int[len];
        int[] path1 = new int[len];
        tf_sum.Val = 0;
        for (i2 = 0; i2 < len; ++i2) {
            int L1;
            int best_level = 0;
            int N2 = m2.eBands[i2 + 1] - m2.eBands[i2] << LM2;
            boolean narrow = m2.eBands[i2 + 1] - m2.eBands[i2] == 1;
            System.arraycopy(X2[tf_chan], m2.eBands[i2] << LM2, tmp, 0, N2);
            int best_L1 = L1 = CeltCommon.l1_metric(tmp, N2, isTransient != 0 ? LM2 : 0, bias);
            if (isTransient != 0 && !narrow) {
                System.arraycopy(tmp, 0, tmp_1, 0, N2);
                Bands.haar1ZeroOffset(tmp_1, N2 >> LM2, 1 << LM2);
                L1 = CeltCommon.l1_metric(tmp_1, N2, LM2 + 1, bias);
                if (L1 < best_L1) {
                    best_L1 = L1;
                    best_level = -1;
                }
            }
            for (int k2 = 0; k2 < LM2 + (isTransient == 0 && !narrow ? 1 : 0); ++k2) {
                int B2 = isTransient != 0 ? LM2 - k2 - 1 : k2 + 1;
                Bands.haar1ZeroOffset(tmp, N2 >> k2, 1 << k2);
                L1 = CeltCommon.l1_metric(tmp, N2, B2, bias);
                if (L1 >= best_L1) continue;
                best_L1 = L1;
                best_level = k2 + 1;
            }
            metric[i2] = isTransient != 0 ? 2 * best_level : -2 * best_level;
            tf_sum.Val = tf_sum.Val + ((isTransient != 0 ? LM2 : 0) - metric[i2] / 2);
            if (!narrow || metric[i2] != 0 && metric[i2] != -2 * LM2) continue;
            int n2 = i2;
            metric[n2] = metric[n2] - 1;
        }
        tf_select = 0;
        for (int sel = 0; sel < 2; ++sel) {
            cost0 = 0;
            cost1 = isTransient != 0 ? 0 : lambda;
            for (i2 = 1; i2 < len; ++i2) {
                curr0 = Inlines.IMIN(cost0, cost1 + lambda);
                curr1 = Inlines.IMIN(cost0 + lambda, cost1);
                cost0 = curr0 + Inlines.abs(metric[i2] - 2 * CeltTables.tf_select_table[LM2][4 * isTransient + 2 * sel + 0]);
                cost1 = curr1 + Inlines.abs(metric[i2] - 2 * CeltTables.tf_select_table[LM2][4 * isTransient + 2 * sel + 1]);
            }
            selcost[sel] = cost0 = Inlines.IMIN(cost0, cost1);
        }
        if (selcost[1] < selcost[0] && isTransient != 0) {
            tf_select = 1;
        }
        cost0 = 0;
        cost1 = isTransient != 0 ? 0 : lambda;
        for (i2 = 1; i2 < len; ++i2) {
            int from0 = cost0;
            int from1 = cost1 + lambda;
            if (from0 < from1) {
                curr0 = from0;
                path0[i2] = 0;
            } else {
                curr0 = from1;
                path0[i2] = 1;
            }
            from0 = cost0 + lambda;
            from1 = cost1;
            if (from0 < from1) {
                curr1 = from0;
                path1[i2] = 0;
            } else {
                curr1 = from1;
                path1[i2] = 1;
            }
            cost0 = curr0 + Inlines.abs(metric[i2] - 2 * CeltTables.tf_select_table[LM2][4 * isTransient + 2 * tf_select + 0]);
            cost1 = curr1 + Inlines.abs(metric[i2] - 2 * CeltTables.tf_select_table[LM2][4 * isTransient + 2 * tf_select + 1]);
        }
        tf_res[len - 1] = cost0 < cost1 ? 0 : 1;
        for (i2 = len - 2; i2 >= 0; --i2) {
            tf_res[i2] = tf_res[i2 + 1] == 1 ? path1[i2 + 1] : path0[i2 + 1];
        }
        return tf_select;
    }

    static void tf_encode(int start, int end, int isTransient, int[] tf_res, int LM2, int tf_select, EntropyCoder enc) {
        int i2;
        int budget = enc.storage * 8;
        int tell = enc.tell();
        int logp = isTransient != 0 ? 2 : 4;
        int tf_select_rsv = LM2 > 0 && tell + logp + 1 <= budget ? 1 : 0;
        budget -= tf_select_rsv;
        int tf_changed = 0;
        int curr = 0;
        for (i2 = start; i2 < end; ++i2) {
            if (tell + logp <= budget) {
                enc.enc_bit_logp(tf_res[i2] ^ curr, logp);
                tell = enc.tell();
                curr = tf_res[i2];
                tf_changed |= curr;
            } else {
                tf_res[i2] = curr;
            }
            logp = isTransient != 0 ? 4 : 5;
        }
        if (tf_select_rsv != 0 && CeltTables.tf_select_table[LM2][4 * isTransient + 0 + tf_changed] != CeltTables.tf_select_table[LM2][4 * isTransient + 2 + tf_changed]) {
            enc.enc_bit_logp(tf_select, 1);
        } else {
            tf_select = 0;
        }
        for (i2 = start; i2 < end; ++i2) {
            tf_res[i2] = CeltTables.tf_select_table[LM2][4 * isTransient + 2 * tf_select + tf_res[i2]];
        }
    }

    static int alloc_trim_analysis(CeltMode m2, int[][] X2, int[][] bandLogE, int end, int LM2, int C2, AnalysisInfo analysis, BoxedValueInt stereo_saving, int tf_estimate, int intensity, int surround_trim) {
        int i2;
        int diff = 0;
        int trim = 1280;
        if (C2 == 2) {
            int partial;
            int sum = 0;
            for (i2 = 0; i2 < 8; ++i2) {
                partial = Kernels.celt_inner_prod(X2[0], m2.eBands[i2] << LM2, X2[1], m2.eBands[i2] << LM2, m2.eBands[i2 + 1] - m2.eBands[i2] << LM2);
                sum = Inlines.ADD16(sum, (int)Inlines.EXTRACT16(Inlines.SHR32(partial, 18)));
            }
            sum = Inlines.MULT16_16_Q15(4096, sum);
            int minXC = sum = Inlines.MIN16(1024, Inlines.ABS32(sum));
            for (i2 = 8; i2 < intensity; ++i2) {
                partial = Kernels.celt_inner_prod(X2[0], m2.eBands[i2] << LM2, X2[1], m2.eBands[i2] << LM2, m2.eBands[i2 + 1] - m2.eBands[i2] << LM2);
                minXC = Inlines.MIN16(minXC, (int)Inlines.ABS16(Inlines.EXTRACT16(Inlines.SHR32(partial, 18))));
            }
            minXC = Inlines.MIN16(1024, Inlines.ABS32(minXC));
            int logXC = Inlines.celt_log2(1049625 - Inlines.MULT16_16(sum, sum));
            int logXC2 = Inlines.MAX16(Inlines.HALF16(logXC), Inlines.celt_log2(1049625 - Inlines.MULT16_16(minXC, minXC)));
            logXC = Inlines.PSHR32(logXC - 6144, 2);
            logXC2 = Inlines.PSHR32(logXC2 - 6144, 2);
            trim += Inlines.MAX16(-1024, Inlines.MULT16_16_Q15(24576, logXC));
            stereo_saving.Val = Inlines.MIN16(stereo_saving.Val + 64, 0 - Inlines.HALF16(logXC2));
        }
        int c2 = 0;
        do {
            for (i2 = 0; i2 < end - 1; ++i2) {
                diff += bandLogE[c2][i2] * (2 + 2 * i2 - end);
            }
        } while (++c2 < C2);
        trim -= Inlines.MAX16((int)Inlines.NEG16((short)512), Inlines.MIN16(512, Inlines.SHR16((diff /= C2 * (end - 1)) + 1024, 2) / 6));
        trim -= Inlines.SHR16(surround_trim, 2);
        trim -= 2 * Inlines.SHR16(tf_estimate, 6);
        if (analysis.enabled && analysis.valid != 0) {
            trim -= Inlines.MAX16(-512, Inlines.MIN16(512, (int)(512.0f * (analysis.tonality_slope + 0.05f))));
        }
        int trim_index = Inlines.PSHR32(trim, 8);
        trim_index = Inlines.IMAX(0, Inlines.IMIN(10, trim_index));
        return trim_index;
    }

    static int stereo_analysis(CeltMode m2, int[][] X2, int LM2) {
        int sumLR = 1;
        int sumMS = 1;
        for (int i2 = 0; i2 < 13; ++i2) {
            for (int j2 = m2.eBands[i2] << LM2; j2 < m2.eBands[i2 + 1] << LM2; ++j2) {
                int L2 = Inlines.EXTEND32(X2[0][j2]);
                int R6 = Inlines.EXTEND32(X2[1][j2]);
                int M2 = Inlines.ADD32(L2, R6);
                int S2 = Inlines.SUB32(L2, R6);
                sumLR = Inlines.ADD32(sumLR, Inlines.ADD32(Inlines.ABS32(L2), Inlines.ABS32(R6)));
                sumMS = Inlines.ADD32(sumMS, Inlines.ADD32(Inlines.ABS32(M2), Inlines.ABS32(S2)));
            }
        }
        sumMS = Inlines.MULT16_32_Q15((short)23170, sumMS);
        int thetas = 13;
        if (LM2 <= 1) {
            thetas -= 8;
        }
        return Inlines.MULT16_32_Q15((m2.eBands[13] << LM2 + 1) + thetas, sumMS) > Inlines.MULT16_32_Q15(m2.eBands[13] << LM2 + 1, sumLR) ? 1 : 0;
    }

    static int median_of_5(int[] x2, int x_ptr) {
        int t4;
        int t3;
        int t1;
        int t0;
        int t2 = x2[x_ptr + 2];
        if (x2[x_ptr] > x2[x_ptr + 1]) {
            t0 = x2[x_ptr + 1];
            t1 = x2[x_ptr];
        } else {
            t0 = x2[x_ptr];
            t1 = x2[x_ptr + 1];
        }
        if (x2[x_ptr + 3] > x2[x_ptr + 4]) {
            t3 = x2[x_ptr + 4];
            t4 = x2[x_ptr + 3];
        } else {
            t3 = x2[x_ptr + 3];
            t4 = x2[x_ptr + 4];
        }
        if (t0 > t3) {
            int tmp = t3;
            t3 = t0;
            t0 = tmp;
            tmp = t4;
            t4 = t1;
            t1 = tmp;
        }
        if (t2 > t1) {
            if (t1 < t3) {
                return Inlines.MIN16(t2, t3);
            }
            return Inlines.MIN16(t4, t1);
        }
        if (t2 < t3) {
            return Inlines.MIN16(t1, t3);
        }
        return Inlines.MIN16(t2, t4);
    }

    static int median_of_3(int[] x2, int x_ptr) {
        int t1;
        int t0;
        if (x2[x_ptr] > x2[x_ptr + 1]) {
            t0 = x2[x_ptr + 1];
            t1 = x2[x_ptr];
        } else {
            t0 = x2[x_ptr];
            t1 = x2[x_ptr + 1];
        }
        int t2 = x2[x_ptr + 2];
        if (t1 < t2) {
            return t1;
        }
        if (t0 < t2) {
            return t2;
        }
        return t0;
    }

    static int dynalloc_analysis(int[][] bandLogE, int[][] bandLogE2, int nbEBands, int start, int end, int C2, int[] offsets, int lsb_depth, short[] logN, int isTransient, int vbr, int constrained_vbr, short[] eBands, int LM2, int effectiveBytes, BoxedValueInt tot_boost_, int lfe, int[] surround_dynalloc) {
        int i2;
        int tot_boost = 0;
        int[][] follower = Arrays.InitTwoDimensionalArrayInt(2, nbEBands);
        int[] noise_floor = new int[C2 * nbEBands];
        Arrays.MemSet(offsets, 0, nbEBands);
        int maxDepth = -32666;
        for (i2 = 0; i2 < end; ++i2) {
            noise_floor[i2] = Inlines.MULT16_16((short)64, logN[i2]) + 512 + Inlines.SHL16(9 - lsb_depth, 10) - Inlines.SHL16(CeltTables.eMeans[i2], 6) + Inlines.MULT16_16(6, (i2 + 5) * (i2 + 5));
        }
        int c2 = 0;
        do {
            for (i2 = 0; i2 < end; ++i2) {
                maxDepth = Inlines.MAX16(maxDepth, bandLogE[c2][i2] - noise_floor[i2]);
            }
        } while (++c2 < C2);
        if (effectiveBytes > 50 && LM2 >= 1 && lfe == 0) {
            int last = 0;
            c2 = 0;
            do {
                int[] f2 = follower[c2];
                f2[0] = bandLogE2[c2][0];
                for (i2 = 1; i2 < end; ++i2) {
                    if (bandLogE2[c2][i2] > bandLogE2[c2][i2 - 1] + 512) {
                        last = i2;
                    }
                    f2[i2] = Inlines.MIN16(f2[i2 - 1] + 1536, bandLogE2[c2][i2]);
                }
                for (i2 = last - 1; i2 >= 0; --i2) {
                    f2[i2] = Inlines.MIN16(f2[i2], Inlines.MIN16(f2[i2 + 1] + 2048, bandLogE2[c2][i2]));
                }
                int offset = 1024;
                for (i2 = 2; i2 < end - 2; ++i2) {
                    f2[i2] = Inlines.MAX16(f2[i2], CeltCommon.median_of_5(bandLogE2[c2], i2 - 2) - offset);
                }
                int tmp = CeltCommon.median_of_3(bandLogE2[c2], 0) - offset;
                f2[0] = Inlines.MAX16(f2[0], tmp);
                f2[1] = Inlines.MAX16(f2[1], tmp);
                tmp = CeltCommon.median_of_3(bandLogE2[c2], end - 3) - offset;
                f2[end - 2] = Inlines.MAX16(f2[end - 2], tmp);
                f2[end - 1] = Inlines.MAX16(f2[end - 1], tmp);
                for (i2 = 0; i2 < end; ++i2) {
                    f2[i2] = Inlines.MAX16(f2[i2], noise_floor[i2]);
                }
            } while (++c2 < C2);
            if (C2 == 2) {
                for (i2 = start; i2 < end; ++i2) {
                    follower[1][i2] = Inlines.MAX16(follower[1][i2], follower[0][i2] - 4096);
                    follower[0][i2] = Inlines.MAX16(follower[0][i2], follower[1][i2] - 4096);
                    follower[0][i2] = Inlines.HALF16(Inlines.MAX16(0, bandLogE[0][i2] - follower[0][i2]) + Inlines.MAX16(0, bandLogE[1][i2] - follower[1][i2]));
                }
            } else {
                for (i2 = start; i2 < end; ++i2) {
                    follower[0][i2] = Inlines.MAX16(0, bandLogE[0][i2] - follower[0][i2]);
                }
            }
            for (i2 = start; i2 < end; ++i2) {
                follower[0][i2] = Inlines.MAX16(follower[0][i2], surround_dynalloc[i2]);
            }
            if ((vbr == 0 || constrained_vbr != 0) && isTransient == 0) {
                for (i2 = start; i2 < end; ++i2) {
                    follower[0][i2] = Inlines.HALF16(follower[0][i2]);
                }
            }
            for (i2 = start; i2 < end; ++i2) {
                int boost_bits;
                int boost;
                if (i2 < 8) {
                    int[] nArray = follower[0];
                    int n2 = i2;
                    nArray[n2] = nArray[n2] * 2;
                }
                if (i2 >= 12) {
                    follower[0][i2] = Inlines.HALF16(follower[0][i2]);
                }
                follower[0][i2] = Inlines.MIN16(follower[0][i2], 4096);
                int width = C2 * (eBands[i2 + 1] - eBands[i2]) << LM2;
                if (width < 6) {
                    boost = Inlines.SHR32(follower[0][i2], 10);
                    boost_bits = boost * width << 3;
                } else if (width > 48) {
                    boost = Inlines.SHR32(follower[0][i2] * 8, 10);
                    boost_bits = (boost * width << 3) / 8;
                } else {
                    boost = Inlines.SHR32(follower[0][i2] * width / 6, 10);
                    boost_bits = boost * 6 << 3;
                }
                if ((vbr == 0 || constrained_vbr != 0 && isTransient == 0) && tot_boost + boost_bits >> 3 >> 3 > effectiveBytes / 4) {
                    int cap = effectiveBytes / 4 << 3 << 3;
                    offsets[i2] = cap - tot_boost;
                    tot_boost = cap;
                    break;
                }
                offsets[i2] = boost;
                tot_boost += boost_bits;
            }
        }
        tot_boost_.Val = tot_boost;
        return maxDepth;
    }

    static void deemphasis(int[][] input, int[] input_ptrs, short[] pcm, int pcm_ptr, int N2, int C2, int downsample, int[] coef, int[] mem, int accum) {
        boolean apply_downsampling = false;
        int[] scratch = new int[N2];
        int coef0 = coef[0];
        int Nd2 = N2 / downsample;
        int c2 = 0;
        do {
            int tmp;
            int j2;
            int m2 = mem[c2];
            int[] x2 = input[c2];
            int x_ptr = input_ptrs[c2];
            int y2 = pcm_ptr + c2;
            if (downsample > 1) {
                for (j2 = 0; j2 < N2; ++j2) {
                    tmp = x2[x_ptr + j2] + m2 + 0;
                    m2 = Inlines.MULT16_32_Q15(coef0, tmp);
                    scratch[j2] = tmp;
                }
                apply_downsampling = true;
            } else if (accum != 0) {
                for (j2 = 0; j2 < N2; ++j2) {
                    tmp = x2[x_ptr + j2] + m2 + 0;
                    m2 = Inlines.MULT16_32_Q15(coef0, tmp);
                    pcm[y2 + j2 * C2] = Inlines.SAT16(Inlines.ADD32(pcm[y2 + j2 * C2], Inlines.SIG2WORD16(tmp)));
                }
            } else {
                for (j2 = 0; j2 < N2; ++j2) {
                    tmp = x2[x_ptr + j2] + m2 + 0;
                    if (x2[x_ptr + j2] > 0 && m2 > 0 && tmp < 0) {
                        tmp = Integer.MAX_VALUE;
                        m2 = Integer.MAX_VALUE;
                    } else {
                        m2 = Inlines.MULT16_32_Q15(coef0, tmp);
                    }
                    pcm[y2 + j2 * C2] = Inlines.SIG2WORD16(tmp);
                }
            }
            mem[c2] = m2;
            if (!apply_downsampling) continue;
            for (j2 = 0; j2 < Nd2; ++j2) {
                pcm[y2 + j2 * C2] = Inlines.SIG2WORD16(scratch[j2 * downsample]);
            }
        } while (++c2 < C2);
    }

    static void celt_synthesis(CeltMode mode, int[][] X2, int[][] out_syn, int[] out_syn_ptrs, int[] oldBandE, int start, int effEnd, int C2, int CC2, int isTransient, int LM2, int downsample, int silence) {
        int shift;
        int NB2;
        int B2;
        int overlap = mode.overlap;
        int nbEBands = mode.nbEBands;
        int N2 = mode.shortMdctSize << LM2;
        int[] freq = new int[N2];
        int M2 = 1 << LM2;
        if (isTransient != 0) {
            B2 = M2;
            NB2 = mode.shortMdctSize;
            shift = mode.maxLM;
        } else {
            B2 = 1;
            NB2 = mode.shortMdctSize << LM2;
            shift = mode.maxLM - LM2;
        }
        if (CC2 == 2 && C2 == 1) {
            int b2;
            Bands.denormalise_bands(mode, X2[0], freq, 0, oldBandE, 0, start, effEnd, M2, downsample, silence);
            int freq2 = out_syn_ptrs[1] + overlap / 2;
            System.arraycopy(freq, 0, out_syn[1], freq2, N2);
            for (b2 = 0; b2 < B2; ++b2) {
                MDCT.clt_mdct_backward(mode.mdct, out_syn[1], freq2 + b2, out_syn[0], out_syn_ptrs[0] + NB2 * b2, mode.window, overlap, shift, B2);
            }
            for (b2 = 0; b2 < B2; ++b2) {
                MDCT.clt_mdct_backward(mode.mdct, freq, b2, out_syn[1], out_syn_ptrs[1] + NB2 * b2, mode.window, overlap, shift, B2);
            }
        } else if (CC2 == 1 && C2 == 2) {
            int freq2 = out_syn_ptrs[0] + overlap / 2;
            Bands.denormalise_bands(mode, X2[0], freq, 0, oldBandE, 0, start, effEnd, M2, downsample, silence);
            Bands.denormalise_bands(mode, X2[1], out_syn[0], freq2, oldBandE, nbEBands, start, effEnd, M2, downsample, silence);
            for (int i2 = 0; i2 < N2; ++i2) {
                freq[i2] = Inlines.HALF32(Inlines.ADD32(freq[i2], out_syn[0][freq2 + i2]));
            }
            for (int b3 = 0; b3 < B2; ++b3) {
                MDCT.clt_mdct_backward(mode.mdct, freq, b3, out_syn[0], out_syn_ptrs[0] + NB2 * b3, mode.window, overlap, shift, B2);
            }
        } else {
            int c2 = 0;
            do {
                Bands.denormalise_bands(mode, X2[c2], freq, 0, oldBandE, c2 * nbEBands, start, effEnd, M2, downsample, silence);
                for (int b4 = 0; b4 < B2; ++b4) {
                    MDCT.clt_mdct_backward(mode.mdct, freq, b4, out_syn[c2], out_syn_ptrs[c2] + NB2 * b4, mode.window, overlap, shift, B2);
                }
            } while (++c2 < CC2);
        }
    }

    static void tf_decode(int start, int end, int isTransient, int[] tf_res, int LM2, EntropyCoder dec) {
        int i2;
        int budget = dec.storage * 8;
        int tell = dec.tell();
        int logp = isTransient != 0 ? 2 : 4;
        int tf_select_rsv = LM2 > 0 && tell + logp + 1 <= budget ? 1 : 0;
        budget -= tf_select_rsv;
        int curr = 0;
        int tf_changed = 0;
        for (i2 = start; i2 < end; ++i2) {
            if (tell + logp <= budget) {
                tell = dec.tell();
                tf_changed |= (curr ^= dec.dec_bit_logp(logp));
            }
            tf_res[i2] = curr;
            logp = isTransient != 0 ? 4 : 5;
        }
        int tf_select = 0;
        if (tf_select_rsv != 0 && CeltTables.tf_select_table[LM2][4 * isTransient + 0 + tf_changed] != CeltTables.tf_select_table[LM2][4 * isTransient + 2 + tf_changed]) {
            tf_select = dec.dec_bit_logp(1L);
        }
        for (i2 = start; i2 < end; ++i2) {
            tf_res[i2] = CeltTables.tf_select_table[LM2][4 * isTransient + 2 * tf_select + tf_res[i2]];
        }
    }

    static int celt_plc_pitch_search(int[][] decode_mem, int C2) {
        BoxedValueInt pitch_index = new BoxedValueInt(0);
        int[] lp_pitch_buf = new int[1024];
        Pitch.pitch_downsample(decode_mem, lp_pitch_buf, 2048, C2);
        Pitch.pitch_search(lp_pitch_buf, 360, lp_pitch_buf, 1328, 620, pitch_index);
        pitch_index.Val = 720 - pitch_index.Val;
        return pitch_index.Val;
    }

    static int resampling_factor(int rate) {
        int ret;
        switch (rate) {
            case 48000: {
                ret = 1;
                break;
            }
            case 24000: {
                ret = 2;
                break;
            }
            case 16000: {
                ret = 3;
                break;
            }
            case 12000: {
                ret = 4;
                break;
            }
            case 8000: {
                ret = 6;
                break;
            }
            default: {
                Inlines.OpusAssert(false);
                ret = 0;
            }
        }
        return ret;
    }

    static void comb_filter_const(int[] y2, int y_ptr, int[] x2, int x_ptr, int T2, int N2, int g10, int g11, int g12) {
        int xpt = x_ptr - T2;
        int x4 = x2[xpt - 2];
        int x3 = x2[xpt - 1];
        int x22 = x2[xpt];
        int x1 = x2[xpt + 1];
        for (int i2 = 0; i2 < N2; ++i2) {
            int x0 = x2[xpt + i2 + 2];
            y2[y_ptr + i2] = x2[x_ptr + i2] + Inlines.MULT16_32_Q15(g10, x22) + Inlines.MULT16_32_Q15(g11, Inlines.ADD32(x1, x3)) + Inlines.MULT16_32_Q15(g12, Inlines.ADD32(x0, x4));
            x4 = x3;
            x3 = x22;
            x22 = x1;
            x1 = x0;
        }
    }

    static void comb_filter(int[] y2, int y_ptr, int[] x2, int x_ptr, int T0, int T1, int N2, int g0, int g1, int tapset0, int tapset1, int[] window, int overlap) {
        int i2;
        if (g0 == 0 && g1 == 0) {
            if (x_ptr != y_ptr) {
                // empty if block
            }
            return;
        }
        int g00 = Inlines.MULT16_16_P15(g0, (int)gains[tapset0][0]);
        int g01 = Inlines.MULT16_16_P15(g0, (int)gains[tapset0][1]);
        int g02 = Inlines.MULT16_16_P15(g0, (int)gains[tapset0][2]);
        int g10 = Inlines.MULT16_16_P15(g1, (int)gains[tapset1][0]);
        int g11 = Inlines.MULT16_16_P15(g1, (int)gains[tapset1][1]);
        int g12 = Inlines.MULT16_16_P15(g1, (int)gains[tapset1][2]);
        int x1 = x2[x_ptr - T1 + 1];
        int x22 = x2[x_ptr - T1];
        int x3 = x2[x_ptr - T1 - 1];
        int x4 = x2[x_ptr - T1 - 2];
        if (g0 == g1 && T0 == T1 && tapset0 == tapset1) {
            overlap = 0;
        }
        for (i2 = 0; i2 < overlap; ++i2) {
            int x0 = x2[x_ptr + i2 - T1 + 2];
            int f2 = Inlines.MULT16_16_Q15(window[i2], window[i2]);
            y2[y_ptr + i2] = x2[x_ptr + i2] + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15((int)((short)(Short.MAX_VALUE - f2)), g00), x2[x_ptr + i2 - T0]) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15((int)((short)(Short.MAX_VALUE - f2)), g01), Inlines.ADD32(x2[x_ptr + i2 - T0 + 1], x2[x_ptr + i2 - T0 - 1])) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15((int)((short)(Short.MAX_VALUE - f2)), g02), Inlines.ADD32(x2[x_ptr + i2 - T0 + 2], x2[x_ptr + i2 - T0 - 2])) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15(f2, g10), x22) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15(f2, g11), Inlines.ADD32(x1, x3)) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15(f2, g12), Inlines.ADD32(x0, x4));
            x4 = x3;
            x3 = x22;
            x22 = x1;
            x1 = x0;
        }
        if (g1 == 0) {
            if (x_ptr != y_ptr) {
                // empty if block
            }
            return;
        }
        CeltCommon.comb_filter_const(y2, y_ptr + i2, x2, x_ptr + i2, T1, N2 - i2, g10, g11, g12);
    }

    static void init_caps(CeltMode m2, int[] cap, int LM2, int C2) {
        for (int i2 = 0; i2 < m2.nbEBands; ++i2) {
            int N2 = m2.eBands[i2 + 1] - m2.eBands[i2] << LM2;
            cap[i2] = (m2.cache.caps[m2.nbEBands * (2 * LM2 + C2 - 1) + i2] + 64) * C2 * N2 >> 2;
        }
    }
}

