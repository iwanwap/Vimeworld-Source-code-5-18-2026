/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  Js
 *  Oz
 *  YSa
 *  dT
 *  kta
 */
public final class xs_2
extends Hs {
    private Js Piece3;
    private Js Piece2;

    public void f(dT dT2) {
        xs_2 b22 = dT2;
        xs_2 a2 = this;
        xs_2 xs_22 = b22;
        float b22 = Oz.d((float)(((dT)xs_22).time * TOa.r)) * WRa.e;
        float f2 = Oz.d((float)(((dT)xs_22).time * Nra.e)) * Yqa.C;
        a2.Piece2.offsetY = -b22 / YSa.G;
        a2.Piece3.offsetY = -f2 / kta.v;
    }

    public void J() {
        xs_2 a2;
        xs_2 xs_22 = a2;
        xs_22.Piece2 = xs_22.model.J(Mqa.n);
        xs_22.Piece3 = xs_22.model.J(dqa.e);
    }

    public xs_2() {
        xs_2 a2;
    }
}

