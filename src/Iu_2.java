/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  Js
 *  Oz
 *  dT
 */
public final class Iu_2
extends Hs {
    private Js F2;
    private Js F1;
    private Js F3;

    public void J() {
        Iu_2 a2;
        Iu_2 iu_2 = a2;
        iu_2.F1 = iu_2.model.J(vsa.M);
        iu_2.F2 = iu_2.model.J(AQa.m);
        iu_2.F3 = iu_2.model.J(uua.Q);
    }

    public void f(dT dT2) {
        Iu_2 a2;
        Iu_2 b2 = dT2;
        Iu_2 iu_2 = a2 = this;
        iu_2.F3.rotationZ = Oz.C((float)(((dT)b2).time * kTa.J)) * iSa.fa - WRa.e;
        iu_2.F2.rotationZ = Oz.d((float)(((dT)b2).time * Yqa.C)) * Bta.G - Jpa.B;
        iu_2.F1.rotationZ = Oz.d((float)(((dT)b2).time * kTa.J)) * WRa.e - Bta.G;
    }

    public Iu_2() {
        Iu_2 a2;
    }
}

