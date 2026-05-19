/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.Inlines;
import io.github.jaredmdobson.concentus.Kernels;

class CeltLPC {
    CeltLPC() {
    }

    static void celt_lpc(int[] _lpc, int[] ac2, int p2) {
        int i2;
        int error = ac2[0];
        int[] lpc = new int[p2];
        if (ac2[0] != 0) {
            for (i2 = 0; i2 < p2; ++i2) {
                int j2;
                int rr2 = 0;
                for (j2 = 0; j2 < i2; ++j2) {
                    rr2 += Inlines.MULT32_32_Q31(lpc[j2], ac2[i2 - j2]);
                }
                int r2 = 0 - Inlines.frac_div32(Inlines.SHL32(rr2 += Inlines.SHR32(ac2[i2 + 1], 3), 3), error);
                lpc[i2] = Inlines.SHR32(r2, 3);
                for (j2 = 0; j2 < i2 + 1 >> 1; ++j2) {
                    int tmp1 = lpc[j2];
                    int tmp2 = lpc[i2 - 1 - j2];
                    lpc[j2] = tmp1 + Inlines.MULT32_32_Q31(r2, tmp2);
                    lpc[i2 - 1 - j2] = tmp2 + Inlines.MULT32_32_Q31(r2, tmp1);
                }
                if ((error -= Inlines.MULT32_32_Q31(Inlines.MULT32_32_Q31(r2, r2), error)) < Inlines.SHR32(ac2[0], 10)) break;
            }
        }
        for (i2 = 0; i2 < p2; ++i2) {
            _lpc[i2] = Inlines.ROUND16(lpc[i2], 16);
        }
    }

    static void celt_iir(int[] _x, int _x_ptr, int[] den, int[] _y, int _y_ptr, int N2, int ord, int[] mem) {
        int i2;
        int[] rden = new int[ord];
        int[] y2 = new int[N2 + ord];
        Inlines.OpusAssert((ord & 3) == 0);
        BoxedValueInt _sum0 = new BoxedValueInt(0);
        BoxedValueInt _sum1 = new BoxedValueInt(0);
        BoxedValueInt _sum2 = new BoxedValueInt(0);
        BoxedValueInt _sum3 = new BoxedValueInt(0);
        for (i2 = 0; i2 < ord; ++i2) {
            rden[i2] = den[ord - i2 - 1];
        }
        for (i2 = 0; i2 < ord; ++i2) {
            y2[i2] = 0 - mem[ord - i2 - 1];
        }
        while (i2 < N2 + ord) {
            y2[i2] = 0;
            ++i2;
        }
        for (i2 = 0; i2 < N2 - 3; i2 += 4) {
            _sum0.Val = _x[_x_ptr + i2];
            _sum1.Val = _x[_x_ptr + i2 + 1];
            _sum2.Val = _x[_x_ptr + i2 + 2];
            _sum3.Val = _x[_x_ptr + i2 + 3];
            Kernels.xcorr_kernel(rden, y2, i2, _sum0, _sum1, _sum2, _sum3, ord);
            int sum0 = _sum0.Val;
            int sum1 = _sum1.Val;
            int sum2 = _sum2.Val;
            int sum3 = _sum3.Val;
            y2[i2 + ord] = 0 - Inlines.ROUND16(sum0, 12);
            _y[_y_ptr + i2] = sum0;
            sum1 = Inlines.MAC16_16(sum1, y2[i2 + ord], den[0]);
            y2[i2 + ord + 1] = 0 - Inlines.ROUND16(sum1, 12);
            _y[_y_ptr + i2 + 1] = sum1;
            sum2 = Inlines.MAC16_16(sum2, y2[i2 + ord + 1], den[0]);
            sum2 = Inlines.MAC16_16(sum2, y2[i2 + ord], den[1]);
            y2[i2 + ord + 2] = 0 - Inlines.ROUND16(sum2, 12);
            _y[_y_ptr + i2 + 2] = sum2;
            sum3 = Inlines.MAC16_16(sum3, y2[i2 + ord + 2], den[0]);
            sum3 = Inlines.MAC16_16(sum3, y2[i2 + ord + 1], den[1]);
            sum3 = Inlines.MAC16_16(sum3, y2[i2 + ord], den[2]);
            y2[i2 + ord + 3] = 0 - Inlines.ROUND16(sum3, 12);
            _y[_y_ptr + i2 + 3] = sum3;
        }
        while (i2 < N2) {
            int sum = _x[_x_ptr + i2];
            for (int j2 = 0; j2 < ord; ++j2) {
                sum -= Inlines.MULT16_16(rden[j2], y2[i2 + j2]);
            }
            y2[i2 + ord] = Inlines.ROUND16(sum, 12);
            _y[_y_ptr + i2] = sum;
            ++i2;
        }
        for (i2 = 0; i2 < ord; ++i2) {
            mem[i2] = _y[_y_ptr + N2 - i2 - 1];
        }
    }
}

