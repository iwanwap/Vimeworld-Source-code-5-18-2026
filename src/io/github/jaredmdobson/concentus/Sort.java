/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;

class Sort {
    Sort() {
    }

    static void silk_insertion_sort_increasing(int[] a2, int[] idx, int L2, int K2) {
        int j2;
        int value;
        int i2;
        Inlines.OpusAssert(K2 > 0);
        Inlines.OpusAssert(L2 > 0);
        Inlines.OpusAssert(L2 >= K2);
        for (i2 = 0; i2 < K2; ++i2) {
            idx[i2] = i2;
        }
        i2 = 1;
        while (i2 < K2) {
            value = a2[i2];
            for (j2 = i2 - 1; j2 >= 0 && value < a2[j2]; --j2) {
                a2[j2 + 1] = a2[j2];
                idx[j2 + 1] = idx[j2];
            }
            a2[j2 + 1] = value;
            idx[j2 + 1] = i2++;
        }
        for (i2 = K2; i2 < L2; ++i2) {
            value = a2[i2];
            if (value >= a2[K2 - 1]) continue;
            for (j2 = K2 - 2; j2 >= 0 && value < a2[j2]; --j2) {
                a2[j2 + 1] = a2[j2];
                idx[j2 + 1] = idx[j2];
            }
            a2[j2 + 1] = value;
            idx[j2 + 1] = i2;
        }
    }

    static void silk_insertion_sort_increasing_all_values_int16(short[] a2, int L2) {
        Inlines.OpusAssert(L2 > 0);
        for (int i2 = 1; i2 < L2; ++i2) {
            short value = a2[i2];
            for (int j2 = i2 - 1; j2 >= 0 && value < a2[j2]; --j2) {
                a2[j2 + 1] = a2[j2];
            }
            a2[j2 + 1] = value;
        }
    }

    static void silk_insertion_sort_decreasing_int16(short[] a2, int[] idx, int L2, int K2) {
        int j2;
        short value;
        int i2;
        Inlines.OpusAssert(K2 > 0);
        Inlines.OpusAssert(L2 > 0);
        Inlines.OpusAssert(L2 >= K2);
        for (i2 = 0; i2 < K2; ++i2) {
            idx[i2] = i2;
        }
        i2 = 1;
        while (i2 < K2) {
            value = a2[i2];
            for (j2 = i2 - 1; j2 >= 0 && value > a2[j2]; --j2) {
                a2[j2 + 1] = a2[j2];
                idx[j2 + 1] = idx[j2];
            }
            a2[j2 + 1] = value;
            idx[j2 + 1] = i2++;
        }
        for (i2 = K2; i2 < L2; ++i2) {
            value = a2[i2];
            if (value <= a2[K2 - 1]) continue;
            for (j2 = K2 - 2; j2 >= 0 && value > a2[j2]; --j2) {
                a2[j2 + 1] = a2[j2];
                idx[j2 + 1] = idx[j2];
            }
            a2[j2 + 1] = value;
            idx[j2 + 1] = i2;
        }
    }
}

