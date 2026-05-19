/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.Inlines;

class Kernels {
    Kernels() {
    }

    static void celt_fir(short[] x2, int x_ptr, short[] num, short[] y2, int y_ptr, int N2, int ord, short[] mem) {
        int i2;
        short[] rnum = new short[ord];
        short[] local_x = new short[N2 + ord];
        for (i2 = 0; i2 < ord; ++i2) {
            rnum[i2] = num[ord - i2 - 1];
        }
        for (i2 = 0; i2 < ord; ++i2) {
            local_x[i2] = mem[ord - i2 - 1];
        }
        for (i2 = 0; i2 < N2; ++i2) {
            local_x[i2 + ord] = x2[x_ptr + i2];
        }
        for (i2 = 0; i2 < ord; ++i2) {
            mem[i2] = x2[x_ptr + N2 - i2 - 1];
        }
        BoxedValueInt sum0 = new BoxedValueInt(0);
        BoxedValueInt sum1 = new BoxedValueInt(0);
        BoxedValueInt sum2 = new BoxedValueInt(0);
        BoxedValueInt sum3 = new BoxedValueInt(0);
        for (i2 = 0; i2 < N2 - 3; i2 += 4) {
            sum0.Val = 0;
            sum1.Val = 0;
            sum2.Val = 0;
            sum3.Val = 0;
            Kernels.xcorr_kernel(rnum, 0, local_x, i2, sum0, sum1, sum2, sum3, ord);
            y2[y_ptr + i2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2]), Inlines.PSHR32(sum0.Val, 12)));
            y2[y_ptr + i2 + 1] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2 + 1]), Inlines.PSHR32(sum1.Val, 12)));
            y2[y_ptr + i2 + 2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2 + 2]), Inlines.PSHR32(sum2.Val, 12)));
            y2[y_ptr + i2 + 3] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2 + 3]), Inlines.PSHR32(sum3.Val, 12)));
        }
        while (i2 < N2) {
            int sum = 0;
            for (int j2 = 0; j2 < ord; ++j2) {
                sum = Inlines.MAC16_16(sum, rnum[j2], local_x[i2 + j2]);
            }
            y2[y_ptr + i2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2]), Inlines.PSHR32(sum, 12)));
            ++i2;
        }
    }

    static void celt_fir(int[] x2, int x_ptr, int[] num, int num_ptr, int[] y2, int y_ptr, int N2, int ord, int[] mem) {
        int i2;
        int[] rnum = new int[ord];
        int[] local_x = new int[N2 + ord];
        for (i2 = 0; i2 < ord; ++i2) {
            rnum[i2] = num[num_ptr + ord - i2 - 1];
        }
        for (i2 = 0; i2 < ord; ++i2) {
            local_x[i2] = mem[ord - i2 - 1];
        }
        for (i2 = 0; i2 < N2; ++i2) {
            local_x[i2 + ord] = x2[x_ptr + i2];
        }
        for (i2 = 0; i2 < ord; ++i2) {
            mem[i2] = x2[x_ptr + N2 - i2 - 1];
        }
        BoxedValueInt sum0 = new BoxedValueInt(0);
        BoxedValueInt sum1 = new BoxedValueInt(0);
        BoxedValueInt sum2 = new BoxedValueInt(0);
        BoxedValueInt sum3 = new BoxedValueInt(0);
        for (i2 = 0; i2 < N2 - 3; i2 += 4) {
            sum0.Val = 0;
            sum1.Val = 0;
            sum2.Val = 0;
            sum3.Val = 0;
            Kernels.xcorr_kernel(rnum, local_x, i2, sum0, sum1, sum2, sum3, ord);
            y2[y_ptr + i2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2]), Inlines.PSHR32(sum0.Val, 12)));
            y2[y_ptr + i2 + 1] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2 + 1]), Inlines.PSHR32(sum1.Val, 12)));
            y2[y_ptr + i2 + 2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2 + 2]), Inlines.PSHR32(sum2.Val, 12)));
            y2[y_ptr + i2 + 3] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2 + 3]), Inlines.PSHR32(sum3.Val, 12)));
        }
        while (i2 < N2) {
            int sum = 0;
            for (int j2 = 0; j2 < ord; ++j2) {
                sum = Inlines.MAC16_16(sum, rnum[j2], local_x[i2 + j2]);
            }
            y2[y_ptr + i2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(x2[x_ptr + i2]), Inlines.PSHR32(sum, 12)));
            ++i2;
        }
    }

    static void xcorr_kernel(short[] x2, int x_ptr, short[] y2, int y_ptr, BoxedValueInt _sum0, BoxedValueInt _sum1, BoxedValueInt _sum2, BoxedValueInt _sum3, int len) {
        short tmp;
        int j2;
        int sum0 = _sum0.Val;
        int sum1 = _sum1.Val;
        int sum2 = _sum2.Val;
        int sum3 = _sum3.Val;
        Inlines.OpusAssert(len >= 3);
        short y_3 = 0;
        short y_0 = y2[y_ptr++];
        short y_12 = y2[y_ptr++];
        short y_2 = y2[y_ptr++];
        for (j2 = 0; j2 < len - 3; j2 += 4) {
            tmp = x2[x_ptr++];
            y_3 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_0);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_12);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_2);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_3);
            tmp = x2[x_ptr++];
            y_0 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_12);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_2);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_3);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_0);
            tmp = x2[x_ptr++];
            y_12 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_2);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_3);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_0);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_12);
            tmp = x2[x_ptr++];
            y_2 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_3);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_0);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_12);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_2);
        }
        if (j2++ < len) {
            tmp = x2[x_ptr++];
            y_3 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_0);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_12);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_2);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_3);
        }
        if (j2++ < len) {
            tmp = x2[x_ptr++];
            y_0 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_12);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_2);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_3);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_0);
        }
        if (j2 < len) {
            tmp = x2[x_ptr++];
            y_12 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_2);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_3);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_0);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_12);
        }
        _sum0.Val = sum0;
        _sum1.Val = sum1;
        _sum2.Val = sum2;
        _sum3.Val = sum3;
    }

    static void xcorr_kernel(int[] x2, int[] y2, int y_ptr, BoxedValueInt _sum0, BoxedValueInt _sum1, BoxedValueInt _sum2, BoxedValueInt _sum3, int len) {
        int tmp;
        int j2;
        int sum0 = _sum0.Val;
        int sum1 = _sum1.Val;
        int sum2 = _sum2.Val;
        int sum3 = _sum3.Val;
        int x_ptr = 0;
        Inlines.OpusAssert(len >= 3);
        int y_3 = 0;
        int y_0 = y2[y_ptr++];
        int y_12 = y2[y_ptr++];
        int y_2 = y2[y_ptr++];
        for (j2 = 0; j2 < len - 3; j2 += 4) {
            tmp = x2[x_ptr++];
            y_3 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_0);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_12);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_2);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_3);
            tmp = x2[x_ptr++];
            y_0 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_12);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_2);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_3);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_0);
            tmp = x2[x_ptr++];
            y_12 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_2);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_3);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_0);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_12);
            tmp = x2[x_ptr++];
            y_2 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_3);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_0);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_12);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_2);
        }
        if (j2++ < len) {
            tmp = x2[x_ptr++];
            y_3 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_0);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_12);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_2);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_3);
        }
        if (j2++ < len) {
            tmp = x2[x_ptr++];
            y_0 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_12);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_2);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_3);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_0);
        }
        if (j2 < len) {
            tmp = x2[x_ptr++];
            y_12 = y2[y_ptr++];
            sum0 = Inlines.MAC16_16(sum0, tmp, y_2);
            sum1 = Inlines.MAC16_16(sum1, tmp, y_3);
            sum2 = Inlines.MAC16_16(sum2, tmp, y_0);
            sum3 = Inlines.MAC16_16(sum3, tmp, y_12);
        }
        _sum0.Val = sum0;
        _sum1.Val = sum1;
        _sum2.Val = sum2;
        _sum3.Val = sum3;
    }

    static int celt_inner_prod(short[] x2, int x_ptr, short[] y2, int y_ptr, int N2) {
        int xy2 = 0;
        for (int i2 = 0; i2 < N2; ++i2) {
            xy2 = Inlines.MAC16_16(xy2, x2[x_ptr + i2], y2[y_ptr + i2]);
        }
        return xy2;
    }

    static int celt_inner_prod(short[] x2, short[] y2, int y_ptr, int N2) {
        int xy2 = 0;
        for (int i2 = 0; i2 < N2; ++i2) {
            xy2 = Inlines.MAC16_16(xy2, x2[i2], y2[y_ptr + i2]);
        }
        return xy2;
    }

    static int celt_inner_prod(int[] x2, int x_ptr, int[] y2, int y_ptr, int N2) {
        int xy2 = 0;
        for (int i2 = 0; i2 < N2; ++i2) {
            xy2 = Inlines.MAC16_16(xy2, x2[x_ptr + i2], y2[y_ptr + i2]);
        }
        return xy2;
    }

    static void dual_inner_prod(int[] x2, int x_ptr, int[] y01, int y01_ptr, int[] y02, int y02_ptr, int N2, BoxedValueInt xy1, BoxedValueInt xy2) {
        int xy01 = 0;
        int xy02 = 0;
        for (int i2 = 0; i2 < N2; ++i2) {
            xy01 = Inlines.MAC16_16(xy01, x2[x_ptr + i2], y01[y01_ptr + i2]);
            xy02 = Inlines.MAC16_16(xy02, x2[x_ptr + i2], y02[y02_ptr + i2]);
        }
        xy1.Val = xy01;
        xy2.Val = xy02;
    }
}

