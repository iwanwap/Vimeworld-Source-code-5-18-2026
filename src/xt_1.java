/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  Js
 *  Usa
 *  dT
 *  pqa
 *  uKa
 *  vRa
 */
public final class xt_1
extends Hs {
    private Js Shape2;

    public void f(dT dT2) {
        xt_1 b2 = dT2;
        xt_1 a2 = this;
        if (((dT)b2).view == gt.OUTFIT && b2.d()) {
            uKa.l((float)Usa.X, (float)Usa.X, (float)ATa.r);
        }
        if (((dT)b2).view == gt.GUI) {
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)xSa.la);
        }
        a2.Shape2.isHidden = ((dT)b2).time % NSa.B > FRa.Ga ? vRa.d : uSa.E;
    }

    public void J() {
        xt_1 a2;
        a2.Shape2 = a2.model.J(kua.j);
    }

    public xt_1() {
        xt_1 a2;
    }
}

