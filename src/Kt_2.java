/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  JPa
 *  Js
 *  Zpa
 *  dT
 */
public final class Kt_2
extends Hs {
    private Js nose;
    private Js bone2;

    public void f(dT dT2) {
        Kt_2 b2 = dT2;
        Kt_2 a2 = this;
        Kt_2 kt_2 = b2;
        a2.bone2.rotationY = ((dT)kt_2).time * Xpa.R;
        if (((dT)kt_2).view == gt.OUTFIT && b2.d()) {
            a2.nose.offsetX = Yqa.C;
            return;
        }
        a2.nose.offsetX = JPa.N;
    }

    public void J() {
        Kt_2 a2;
        Kt_2 kt_2 = a2;
        kt_2.bone2 = kt_2.model.J(dsa.la);
        kt_2.nose = kt_2.model.J(Zpa.S);
    }

    public Kt_2() {
        Kt_2 a2;
    }
}

