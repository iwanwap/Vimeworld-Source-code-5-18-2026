/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  Tz
 *  XTa
 *  eAa
 *  vRa
 *  zda
 */
public final class Wfa_3
extends eAa {
    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        zda b2;
        Sx d2 = sx2;
        Wfa_3 a2 = this;
        if (d2.B() && d2.ja instanceof zda && (b2 = (zda)d2.ja).J().d() && c2.l() - c2.J() >= XTa.W) {
            void v0 = c2;
            b2.J().C();
            v0.J(XTa.W, (Gl)d2);
            if (v0.E == 0) {
                Mda mda3 = new Mda((eAa)Gea.DA);
                mda3.J(c2.J());
                return mda3;
            }
        }
        d2.J(Tz.H[eAa.J((eAa)a2)]);
        return c2;
    }

    public boolean d() {
        return vRa.d != 0;
    }

    public Wfa_3() {
        Wfa_3 a2;
        Wfa_3 wfa_3 = a2;
        wfa_3.J(yGa.f);
        a2.J(vRa.d);
        a2.f(kTa.g);
    }

    public boolean i() {
        return vRa.d != 0;
    }
}

