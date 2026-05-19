/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  MQa
 *  Mda
 *  eAa
 *  pqa
 *  vL
 *  vRa
 *  zda
 */
public final class kAa_2
extends eAa {
    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gl gl2) {
        void a2;
        Object d2 = sx2;
        kAa_2 b2 = this;
        if (a2 instanceof zda) {
            d2 = (zda)a2;
            if (!d2.v() && !d2.Y()) {
                Object object = d2;
                object.F(vRa.d != 0);
                ((zda)object).j.J((vL)d2, Bta.w, MQa.L, pqa.r);
                c.E -= vRa.d;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public kAa_2() {
        kAa_2 a2;
        kAa_2 kAa_22 = a2;
        kAa_22.i = vRa.d;
        kAa_22.J(yGa.f);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Gl gl2, Gl gl3) {
        void c2;
        kAa_2 d2 = gl2;
        kAa_2 b2 = this;
        b2.J((Mda)c2, (Sx)null, (Gl)d2);
        return vRa.d != 0;
    }
}

