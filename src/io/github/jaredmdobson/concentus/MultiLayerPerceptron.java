/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.MLPState;
import io.github.jaredmdobson.concentus.OpusTables;

class MultiLayerPerceptron {
    private static final int MAX_NEURONS = 100;

    MultiLayerPerceptron() {
    }

    static float tansig_approx(float x2) {
        float sign = 1.0f;
        if (!(x2 < 8.0f)) {
            return 1.0f;
        }
        if (!(x2 > -8.0f)) {
            return -1.0f;
        }
        if (x2 < 0.0f) {
            x2 = -x2;
            sign = -1.0f;
        }
        int i2 = (int)Math.floor(0.5f + 25.0f * x2);
        float y2 = OpusTables.tansig_table[i2];
        float dy2 = 1.0f - y2 * y2;
        y2 += (x2 -= 0.04f * (float)i2) * dy2 * (1.0f - y2 * x2);
        return sign * y2;
    }

    static void mlp_process(MLPState m2, float[] input, float[] output) {
        int k2;
        float sum;
        int j2;
        float[] hidden = new float[100];
        float[] W2 = m2.weights;
        int W_ptr = 0;
        for (j2 = 0; j2 < m2.topo[1]; ++j2) {
            sum = W2[W_ptr];
            ++W_ptr;
            for (k2 = 0; k2 < m2.topo[0]; ++k2) {
                sum += input[k2] * W2[W_ptr];
                ++W_ptr;
            }
            hidden[j2] = MultiLayerPerceptron.tansig_approx(sum);
        }
        for (j2 = 0; j2 < m2.topo[2]; ++j2) {
            sum = W2[W_ptr];
            ++W_ptr;
            for (k2 = 0; k2 < m2.topo[1]; ++k2) {
                sum += hidden[k2] * W2[W_ptr];
                ++W_ptr;
            }
            output[j2] = MultiLayerPerceptron.tansig_approx(sum);
        }
    }
}

