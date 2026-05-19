/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;

class CeltPitchXCorr {
    CeltPitchXCorr() {
    }

    static int pitch_xcorr(int[] _x, int[] _y, int[] xcorr, int len, int max_pitch) {
        int i2;
        int maxcorr = 1;
        Inlines.OpusAssert(max_pitch > 0);
        BoxedValueInt sum0 = new BoxedValueInt(0);
        BoxedValueInt sum1 = new BoxedValueInt(0);
        BoxedValueInt sum2 = new BoxedValueInt(0);
        BoxedValueInt sum3 = new BoxedValueInt(0);
        for (i2 = 0; i2 < max_pitch - 3; i2 += 4) {
            sum0.Val = 0;
            sum1.Val = 0;
            sum2.Val = 0;
            sum3.Val = 0;
            Kernels.xcorr_kernel(_x, _y, i2, sum0, sum1, sum2, sum3, len);
            xcorr[i2] = sum0.Val;
            xcorr[i2 + 1] = sum1.Val;
            xcorr[i2 + 2] = sum2.Val;
            xcorr[i2 + 3] = sum3.Val;
            sum0.Val = Inlines.MAX32(sum0.Val, sum1.Val);
            sum2.Val = Inlines.MAX32(sum2.Val, sum3.Val);
            sum0.Val = Inlines.MAX32(sum0.Val, sum2.Val);
            maxcorr = Inlines.MAX32(maxcorr, sum0.Val);
        }
        while (i2 < max_pitch) {
            int inner_sum;
            xcorr[i2] = inner_sum = Kernels.celt_inner_prod(_x, 0, _y, i2, len);
            maxcorr = Inlines.MAX32(maxcorr, inner_sum);
            ++i2;
        }
        return maxcorr;
    }

    static int pitch_xcorr(short[] _x, int _x_ptr, short[] _y, int _y_ptr, int[] xcorr, int len, int max_pitch) {
        int i2;
        int maxcorr = 1;
        Inlines.OpusAssert(max_pitch > 0);
        BoxedValueInt sum0 = new BoxedValueInt(0);
        BoxedValueInt sum1 = new BoxedValueInt(0);
        BoxedValueInt sum2 = new BoxedValueInt(0);
        BoxedValueInt sum3 = new BoxedValueInt(0);
        for (i2 = 0; i2 < max_pitch - 3; i2 += 4) {
            sum0.Val = 0;
            sum1.Val = 0;
            sum2.Val = 0;
            sum3.Val = 0;
            Kernels.xcorr_kernel(_x, _x_ptr, _y, _y_ptr + i2, sum0, sum1, sum2, sum3, len);
            xcorr[i2] = sum0.Val;
            xcorr[i2 + 1] = sum1.Val;
            xcorr[i2 + 2] = sum2.Val;
            xcorr[i2 + 3] = sum3.Val;
            sum0.Val = Inlines.MAX32(sum0.Val, sum1.Val);
            sum2.Val = Inlines.MAX32(sum2.Val, sum3.Val);
            sum0.Val = Inlines.MAX32(sum0.Val, sum2.Val);
            maxcorr = Inlines.MAX32(maxcorr, sum0.Val);
        }
        while (i2 < max_pitch) {
            int inner_sum;
            xcorr[i2] = inner_sum = Kernels.celt_inner_prod(_x, _x_ptr, _y, _y_ptr + i2, len);
            maxcorr = Inlines.MAX32(maxcorr, inner_sum);
            ++i2;
        }
        return maxcorr;
    }

    static int pitch_xcorr(short[] _x, short[] _y, int[] xcorr, int len, int max_pitch) {
        int i2;
        int maxcorr = 1;
        Inlines.OpusAssert(max_pitch > 0);
        BoxedValueInt sum0 = new BoxedValueInt(0);
        BoxedValueInt sum1 = new BoxedValueInt(0);
        BoxedValueInt sum2 = new BoxedValueInt(0);
        BoxedValueInt sum3 = new BoxedValueInt(0);
        for (i2 = 0; i2 < max_pitch - 3; i2 += 4) {
            sum0.Val = 0;
            sum1.Val = 0;
            sum2.Val = 0;
            sum3.Val = 0;
            Kernels.xcorr_kernel(_x, 0, _y, i2, sum0, sum1, sum2, sum3, len);
            xcorr[i2] = sum0.Val;
            xcorr[i2 + 1] = sum1.Val;
            xcorr[i2 + 2] = sum2.Val;
            xcorr[i2 + 3] = sum3.Val;
            sum0.Val = Inlines.MAX32(sum0.Val, sum1.Val);
            sum2.Val = Inlines.MAX32(sum2.Val, sum3.Val);
            sum0.Val = Inlines.MAX32(sum0.Val, sum2.Val);
            maxcorr = Inlines.MAX32(maxcorr, sum0.Val);
        }
        while (i2 < max_pitch) {
            int inner_sum;
            xcorr[i2] = inner_sum = Kernels.celt_inner_prod(_x, _y, i2, len);
            maxcorr = Inlines.MAX32(maxcorr, inner_sum);
            ++i2;
        }
        return maxcorr;
    }
}

