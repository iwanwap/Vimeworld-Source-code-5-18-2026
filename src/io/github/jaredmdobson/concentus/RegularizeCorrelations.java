/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Inlines;

class RegularizeCorrelations {
    RegularizeCorrelations() {
    }

    static void silk_regularize_correlations(int[] XX2, int XX_ptr, int[] xx2, int xx_ptr, int noise, int D2) {
        for (int i2 = 0; i2 < D2; ++i2) {
            Inlines.MatrixSet(XX2, XX_ptr, i2, i2, D2, Inlines.silk_ADD32(Inlines.MatrixGet(XX2, XX_ptr, i2, i2, D2), noise));
        }
        int n2 = xx_ptr;
        xx2[n2] = xx2[n2] + noise;
    }
}

