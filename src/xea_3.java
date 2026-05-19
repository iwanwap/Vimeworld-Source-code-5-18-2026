/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Gg
 *  Gl
 *  MQa
 *  Mda
 *  Tz
 *  eAa
 *  vL
 *  vRa
 *  ysa
 */
public final class xea_3
extends eAa {
    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void b2;
        void c2;
        Sx d2 = sx2;
        xea_3 a2 = this;
        if (d2.E != null) {
            void v0 = c2;
            v0.J(d2.E.J(), (Gl)d2);
            d2.u();
            return v0;
        }
        void v1 = b2;
        v1.J((vL)d2, EQa.R, MQa.L, Xpa.R / (M.nextFloat() * Xpa.R + xSa.la));
        if (!v1.e) {
            void v2 = b2;
            void v3 = b2;
            v3.f((vL)new Fga((Gg)v3, d2));
        }
        Sx sx3 = d2;
        sx3.u();
        sx3.J(Tz.H[eAa.J((eAa)a2)]);
        return c2;
    }

    public boolean i() {
        return vRa.d != 0;
    }

    public int J() {
        return vRa.d;
    }

    public boolean J(Mda mda2) {
        xea_3 b2 = mda2;
        xea_3 a2 = this;
        return super.J((Mda)b2);
    }

    public xea_3() {
        xea_3 a2;
        xea_3 xea_32 = a2;
        xea_32.f(ysa.s);
        a2.J(vRa.d);
        a2.J(yGa.J);
    }

    public boolean d() {
        return vRa.d != 0;
    }
}

