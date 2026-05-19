/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Hs
 *  dT
 *  pqa
 *  uKa
 *  vRa
 */
public final class gS_1
extends Hs {
    public void J(dT dT2) {
        gS_1 b2 = dT2;
        gS_1 a2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)uKa.G.J);
    }

    public gS_1() {
        gS_1 a2;
    }

    public void f(dT dT2) {
        Object b2 = dT2;
        gS_1 a2 = this;
        float[] fArray = Qt.I[(int)(((dT)b2).time * BRa.k) % uSa.i];
        b2 = fArray;
        uKa.f((float)fArray[uSa.E], (float)b2[vRa.d], (float)b2[uqa.g], (float)uKa.G.J);
    }
}

