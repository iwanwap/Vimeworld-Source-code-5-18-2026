/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;

class TOCStruct {
    int VADFlag = 0;
    final int[] VADFlags = new int[3];
    int inbandFECFlag = 0;

    TOCStruct() {
    }

    void Reset() {
        this.VADFlag = 0;
        Arrays.MemSet(this.VADFlags, 0, 3);
        this.inbandFECFlag = 0;
    }
}

