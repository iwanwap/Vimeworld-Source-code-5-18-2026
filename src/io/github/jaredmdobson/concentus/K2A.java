/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;

class K2A {
    K2A() {
    }

    static void silk_k2a(int[] A_Q24, short[] rc_Q15, int order) {
        int[] Atmp = new int[16];
        for (int k2 = 0; k2 < order; ++k2) {
            int n2;
            for (n2 = 0; n2 < k2; ++n2) {
                Atmp[n2] = A_Q24[n2];
            }
            for (n2 = 0; n2 < k2; ++n2) {
                A_Q24[n2] = Inlines.silk_SMLAWB(A_Q24[n2], Inlines.silk_LSHIFT(Atmp[k2 - n2 - 1], 1), rc_Q15[k2]);
            }
            A_Q24[k2] = 0 - Inlines.silk_LSHIFT(rc_Q15[k2], 9);
        }
    }

    static void silk_k2a_Q16(int[] A_Q24, int[] rc_Q16, int order) {
        int[] Atmp = new int[16];
        for (int k2 = 0; k2 < order; ++k2) {
            int n2;
            for (n2 = 0; n2 < k2; ++n2) {
                Atmp[n2] = A_Q24[n2];
            }
            for (n2 = 0; n2 < k2; ++n2) {
                A_Q24[n2] = Inlines.silk_SMLAWW(A_Q24[n2], Atmp[k2 - n2 - 1], rc_Q16[k2]);
            }
            A_Q24[k2] = 0 - Inlines.silk_LSHIFT(rc_Q16[k2], 8);
        }
    }
}

