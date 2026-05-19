/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.FFTState;

class MDCTLookup {
    int n = 0;
    int maxshift = 0;
    FFTState[] kfft = new FFTState[4];
    short[] trig = null;

    MDCTLookup() {
    }
}

