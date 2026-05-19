/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

class Downmix {
    Downmix() {
    }

    static void downmix_int(short[] x2, int x_ptr, int[] sub, int sub_ptr, int subframe, int offset, int c1, int c2, int C2) {
        int j2;
        for (j2 = 0; j2 < subframe; ++j2) {
            sub[j2 + sub_ptr] = x2[(j2 + offset) * C2 + c1];
        }
        if (c2 > -1) {
            for (j2 = 0; j2 < subframe; ++j2) {
                int n2 = j2 + sub_ptr;
                sub[n2] = sub[n2] + x2[(j2 + offset) * C2 + c2];
            }
        } else if (c2 == -2) {
            for (int c3 = 1; c3 < C2; ++c3) {
                for (j2 = 0; j2 < subframe; ++j2) {
                    int n3 = j2 + sub_ptr;
                    sub[n3] = sub[n3] + x2[(j2 + offset) * C2 + c3];
                }
            }
        }
        int scale = 4096;
        scale = C2 == -2 ? (scale /= C2) : (scale /= 2);
        for (j2 = 0; j2 < subframe; ++j2) {
            int n4 = j2 + sub_ptr;
            sub[n4] = sub[n4] * scale;
        }
    }
}

