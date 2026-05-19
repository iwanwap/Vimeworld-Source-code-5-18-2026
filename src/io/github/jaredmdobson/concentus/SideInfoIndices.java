/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.Arrays;

class SideInfoIndices {
    final byte[] GainsIndices = new byte[4];
    final byte[] LTPIndex = new byte[4];
    final byte[] NLSFIndices = new byte[17];
    short lagIndex = 0;
    byte contourIndex = 0;
    byte signalType = 0;
    byte quantOffsetType = 0;
    byte NLSFInterpCoef_Q2 = 0;
    byte PERIndex = 0;
    byte LTP_scaleIndex = 0;
    byte Seed = 0;

    SideInfoIndices() {
    }

    void Reset() {
        Arrays.MemSet(this.GainsIndices, (byte)0, 4);
        Arrays.MemSet(this.LTPIndex, (byte)0, 4);
        Arrays.MemSet(this.NLSFIndices, (byte)0, 17);
        this.lagIndex = 0;
        this.contourIndex = 0;
        this.signalType = 0;
        this.quantOffsetType = 0;
        this.NLSFInterpCoef_Q2 = 0;
        this.PERIndex = 0;
        this.LTP_scaleIndex = 0;
        this.Seed = 0;
    }

    void Assign(SideInfoIndices other) {
        System.arraycopy(other.GainsIndices, 0, this.GainsIndices, 0, 4);
        System.arraycopy(other.LTPIndex, 0, this.LTPIndex, 0, 4);
        System.arraycopy(other.NLSFIndices, 0, this.NLSFIndices, 0, 17);
        this.lagIndex = other.lagIndex;
        this.contourIndex = other.contourIndex;
        this.signalType = other.signalType;
        this.quantOffsetType = other.quantOffsetType;
        this.NLSFInterpCoef_Q2 = other.NLSFInterpCoef_Q2;
        this.PERIndex = other.PERIndex;
        this.LTP_scaleIndex = other.LTP_scaleIndex;
        this.Seed = other.Seed;
    }
}

