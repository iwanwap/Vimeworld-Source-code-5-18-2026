/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;

class BWExpander {
    BWExpander() {
    }

    static void silk_bwexpander_32(int[] ar2, int d2, int chirp_Q16) {
        int chirp_minus_one_Q16 = chirp_Q16 - 65536;
        for (int i2 = 0; i2 < d2 - 1; ++i2) {
            ar2[i2] = Inlines.silk_SMULWW(chirp_Q16, ar2[i2]);
            chirp_Q16 += Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(chirp_Q16, chirp_minus_one_Q16), 16);
        }
        ar2[d2 - 1] = Inlines.silk_SMULWW(chirp_Q16, ar2[d2 - 1]);
    }

    static void silk_bwexpander(short[] ar2, int d2, int chirp_Q16) {
        int chirp_minus_one_Q16 = chirp_Q16 - 65536;
        for (int i2 = 0; i2 < d2 - 1; ++i2) {
            ar2[i2] = (short)Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(chirp_Q16, ar2[i2]), 16);
            chirp_Q16 += Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(chirp_Q16, chirp_minus_one_Q16), 16);
        }
        ar2[d2 - 1] = (short)Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(chirp_Q16, ar2[d2 - 1]), 16);
    }
}

