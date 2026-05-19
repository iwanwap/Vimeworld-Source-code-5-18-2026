/*
 * Decompiled with CFR 0.152.
 */
package org.joml.sampling;

import org.joml.Random;
import org.joml.sampling.Callback2d;

public class StratifiedSampling {
    private final Random rnd;

    public StratifiedSampling(long seed) {
        this.rnd = new Random(seed);
    }

    public void generateRandom(int n2, Callback2d callback) {
        float invN = 1.0f / (float)n2;
        for (int y2 = 0; y2 < n2; ++y2) {
            for (int x2 = 0; x2 < n2; ++x2) {
                float sampleX = (this.rnd.nextFloat() * invN + (float)x2 * invN) * 2.0f - 1.0f;
                float sampleY = (this.rnd.nextFloat() * invN + (float)y2 * invN) * 2.0f - 1.0f;
                callback.onNewSample(sampleX, sampleY);
            }
        }
    }

    public void generateCentered(int n2, float centering, Callback2d callback) {
        float start = centering * 0.5f;
        float end = 1.0f - centering;
        float invN = 1.0f / (float)n2;
        for (int y2 = 0; y2 < n2; ++y2) {
            for (int x2 = 0; x2 < n2; ++x2) {
                float sampleX = ((start + this.rnd.nextFloat() * end) * invN + (float)x2 * invN) * 2.0f - 1.0f;
                float sampleY = ((start + this.rnd.nextFloat() * end) * invN + (float)y2 * invN) * 2.0f - 1.0f;
                callback.onNewSample(sampleX, sampleY);
            }
        }
    }
}

