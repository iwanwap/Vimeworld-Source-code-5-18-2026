/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltPitchXCorr;
import io.github.jaredmdobson.concentus.Inlines;

class Autocorrelation {
    private static final int QC = 10;
    private static final int QS = 14;

    Autocorrelation() {
    }

    static void silk_autocorr(int[] results, BoxedValueInt scale, short[] inputData, int inputDataSize, int correlationCount) {
        int corrCount = Inlines.silk_min_int(inputDataSize, correlationCount);
        scale.Val = Autocorrelation._celt_autocorr(inputData, results, corrCount - 1, inputDataSize);
    }

    static int _celt_autocorr(short[] x2, int[] ac2, int lag, int n2) {
        int shift2;
        int i2;
        int fastN = n2 - lag;
        short[] xx2 = new short[n2];
        Inlines.OpusAssert(n2 > 0);
        short[] xptr = x2;
        int shift = 0;
        int ac0 = 1 + (n2 << 7);
        if ((n2 & 1) != 0) {
            ac0 += Inlines.SHR32(Inlines.MULT16_16(xptr[0], xptr[0]), 9);
        }
        for (i2 = n2 & 1; i2 < n2; i2 += 2) {
            ac0 += Inlines.SHR32(Inlines.MULT16_16(xptr[i2], xptr[i2]), 9);
            ac0 += Inlines.SHR32(Inlines.MULT16_16(xptr[i2 + 1], xptr[i2 + 1]), 9);
        }
        shift = Inlines.celt_ilog2(ac0) - 30 + 10;
        if ((shift /= 2) > 0) {
            for (i2 = 0; i2 < n2; ++i2) {
                xx2[i2] = (short)Inlines.PSHR32(xptr[i2], shift);
            }
            xptr = xx2;
        } else {
            shift = 0;
        }
        CeltPitchXCorr.pitch_xcorr(xptr, xptr, ac2, fastN, lag + 1);
        int k2 = 0;
        while (k2 <= lag) {
            int d2 = 0;
            for (i2 = k2 + fastN; i2 < n2; ++i2) {
                d2 = Inlines.MAC16_16(d2, xptr[i2], xptr[i2 - k2]);
            }
            int n3 = k2++;
            ac2[n3] = ac2[n3] + d2;
        }
        if ((shift = 2 * shift) <= 0) {
            ac2[0] = ac2[0] + Inlines.SHL32(1, -shift);
        }
        if (ac2[0] < 0x10000000) {
            shift2 = 29 - Inlines.EC_ILOG(ac2[0]);
            for (i2 = 0; i2 <= lag; ++i2) {
                ac2[i2] = Inlines.SHL32(ac2[i2], shift2);
            }
            shift -= shift2;
        } else if (ac2[0] >= 0x20000000) {
            shift2 = 1;
            if (ac2[0] >= 0x40000000) {
                ++shift2;
            }
            for (i2 = 0; i2 <= lag; ++i2) {
                ac2[i2] = Inlines.SHR32(ac2[i2], shift2);
            }
            shift += shift2;
        }
        return shift;
    }

    static int _celt_autocorr(int[] x2, int[] ac2, int[] window, int overlap, int lag, int n2) {
        int i2;
        int[] xptr;
        int fastN = n2 - lag;
        int[] xx2 = new int[n2];
        Inlines.OpusAssert(n2 > 0);
        Inlines.OpusAssert(overlap >= 0);
        if (overlap == 0) {
            xptr = x2;
        } else {
            for (i2 = 0; i2 < n2; ++i2) {
                xx2[i2] = x2[i2];
            }
            for (i2 = 0; i2 < overlap; ++i2) {
                xx2[i2] = Inlines.MULT16_16_Q15(x2[i2], window[i2]);
                xx2[n2 - i2 - 1] = Inlines.MULT16_16_Q15(x2[n2 - i2 - 1], window[i2]);
            }
            xptr = xx2;
        }
        int shift = 0;
        int ac0 = 1 + (n2 << 7);
        if ((n2 & 1) != 0) {
            ac0 += Inlines.SHR32(Inlines.MULT16_16(xptr[0], xptr[0]), 9);
        }
        for (i2 = n2 & 1; i2 < n2; i2 += 2) {
            ac0 += Inlines.SHR32(Inlines.MULT16_16(xptr[i2], xptr[i2]), 9);
            ac0 += Inlines.SHR32(Inlines.MULT16_16(xptr[i2 + 1], xptr[i2 + 1]), 9);
        }
        shift = Inlines.celt_ilog2(ac0) - 30 + 10;
        if ((shift /= 2) > 0) {
            for (i2 = 0; i2 < n2; ++i2) {
                xx2[i2] = Inlines.PSHR32(xptr[i2], shift);
            }
            xptr = xx2;
        } else {
            shift = 0;
        }
        CeltPitchXCorr.pitch_xcorr(xptr, xptr, ac2, fastN, lag + 1);
        int k2 = 0;
        while (k2 <= lag) {
            int d2 = 0;
            for (i2 = k2 + fastN; i2 < n2; ++i2) {
                d2 = Inlines.MAC16_16(d2, xptr[i2], xptr[i2 - k2]);
            }
            int n3 = k2++;
            ac2[n3] = ac2[n3] + d2;
        }
        if ((shift = 2 * shift) <= 0) {
            ac2[0] = ac2[0] + Inlines.SHL32(1, -shift);
        }
        if (ac2[0] < 0x10000000) {
            int shift2 = 29 - Inlines.EC_ILOG(ac2[0]);
            for (i2 = 0; i2 <= lag; ++i2) {
                ac2[i2] = Inlines.SHL32(ac2[i2], shift2);
            }
            shift -= shift2;
        } else if (ac2[0] >= 0x20000000) {
            int shift2 = 1;
            if (ac2[0] >= 0x40000000) {
                ++shift2;
            }
            for (i2 = 0; i2 <= lag; ++i2) {
                ac2[i2] = Inlines.SHR32(ac2[i2], shift2);
            }
            shift += shift2;
        }
        return shift;
    }

    static void silk_warped_autocorrelation(int[] corr, BoxedValueInt scale, short[] input, int warping_Q16, int length, int order) {
        int i2;
        int[] state_QS = new int[17];
        long[] corr_QC = new long[17];
        Inlines.OpusAssert((order & 1) == 0);
        Inlines.OpusAssert(true);
        for (int n2 = 0; n2 < length; ++n2) {
            int tmp1_QS = Inlines.silk_LSHIFT32(input[n2], 14);
            for (i2 = 0; i2 < order; i2 += 2) {
                int tmp2_QS = Inlines.silk_SMLAWB(state_QS[i2], state_QS[i2 + 1] - tmp1_QS, warping_Q16);
                state_QS[i2] = tmp1_QS;
                int n3 = i2;
                corr_QC[n3] = corr_QC[n3] + Inlines.silk_RSHIFT64(Inlines.silk_SMULL(tmp1_QS, state_QS[0]), 18);
                tmp1_QS = Inlines.silk_SMLAWB(state_QS[i2 + 1], state_QS[i2 + 2] - tmp2_QS, warping_Q16);
                state_QS[i2 + 1] = tmp2_QS;
                int n4 = i2 + 1;
                corr_QC[n4] = corr_QC[n4] + Inlines.silk_RSHIFT64(Inlines.silk_SMULL(tmp2_QS, state_QS[0]), 18);
            }
            state_QS[order] = tmp1_QS;
            int n5 = order;
            corr_QC[n5] = corr_QC[n5] + Inlines.silk_RSHIFT64(Inlines.silk_SMULL(tmp1_QS, state_QS[0]), 18);
        }
        int lsh = Inlines.silk_CLZ64(corr_QC[0]) - 35;
        lsh = Inlines.silk_LIMIT(lsh, -22, 20);
        scale.Val = -(10 + lsh);
        Inlines.OpusAssert(scale.Val >= -30 && scale.Val <= 12);
        if (lsh >= 0) {
            for (i2 = 0; i2 < order + 1; ++i2) {
                corr[i2] = (int)Inlines.silk_LSHIFT64(corr_QC[i2], lsh);
            }
        } else {
            for (i2 = 0; i2 < order + 1; ++i2) {
                corr[i2] = (int)Inlines.silk_RSHIFT64(corr_QC[i2], -lsh);
            }
        }
        Inlines.OpusAssert(corr_QC[0] >= 0L);
    }
}

