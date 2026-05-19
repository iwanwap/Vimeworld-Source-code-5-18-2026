/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Gg
 *  Gl
 *  Lra
 *  MQa
 *  Mda
 *  Tz
 *  bpa
 *  eAa
 *  jea
 *  kGa
 *  kta
 *  pPa
 *  pqa
 *  qta
 *  vL
 *  vQa
 *  vRa
 *  wga
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Aea_2
extends eAa {
    public static final String[] I;

    public int J(Mda mda2) {
        Aea_2 b2 = mda2;
        Aea_2 a2 = this;
        return Tqa.c;
    }

    static {
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = bpa.f;
        stringArray[vRa.d] = Lra.Ja;
        stringArray[uqa.g] = fPa.Ca;
        I = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        Sx d2 = sx2;
        Aea_2 a2 = this;
        if (d2.h.f() || d2.K.f(Gea.Ma)) {
            void v0 = c2;
            d2.f((Mda)v0, a2.J((Mda)v0));
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Gg gg2, Sx sx2, int n2) {
        void d2;
        void b2;
        int n3;
        int n4 = n2;
        Aea_2 a2 = this;
        int n5 = n3 = b2.h.f() || kGa.J((int)wga.L.I, (Mda)d2) > 0 ? vRa.d : uSa.E;
        if (n3 != 0 || b2.K.f(Gea.Ma)) {
            void v3;
            int n6;
            void c2;
            float f2;
            void e22;
            float e22 = (float)(a2.J((Mda)d2) - e22) / eta.e;
            e22 = (e22 * e22 + e22 * kta.v) / vQa.q;
            if ((double)f2 < tpa.k) {
                return;
            }
            if (e22 > pqa.r) {
                e22 = pqa.r;
            }
            jea jea2 = new jea((Gg)c2, (Gl)b2, e22 * kta.v);
            if (e22 == pqa.r) {
                jea2.A(vRa.d != 0);
            }
            if ((n6 = kGa.J((int)wga.M.I, (Mda)d2)) > 0) {
                jea jea3 = jea2;
                jea3.C(jea3.J() + (double)n6 * kTa.B + kTa.B);
            }
            if ((n6 = kGa.J((int)wga.i.I, (Mda)d2)) > 0) {
                jea2.M(n6);
            }
            if (kGa.J((int)wga.j.I, (Mda)d2) > 0) {
                jea2.J(ySa.T);
            }
            d2.J(vRa.d, (Gl)b2);
            c2.J((vL)b2, EQa.R, pqa.r, pqa.r / (M.nextFloat() * Xpa.R + pPa.c) + e22 * MQa.L);
            if (n3 != 0) {
                v3 = b2;
                jea2.D = uqa.g;
            } else {
                void v4 = b2;
                v3 = v4;
                v4.K.J(Gea.Ma);
            }
            v3.J(Tz.H[eAa.J((eAa)a2)]);
            if (!c2.e) {
                c2.f((vL)jea2);
            }
        }
    }

    public YFa J(Mda mda2) {
        Aea_2 b2 = mda2;
        Aea_2 a2 = this;
        return YFa.BOW;
    }

    public Aea_2() {
        Aea_2 a2;
        Aea_2 aea_2 = a2;
        aea_2.i = vRa.d;
        aea_2.f(qta.N);
        a2.J(yGa.m);
    }

    public Mda f(Mda mda2, Gg gg2, Sx sx2) {
        Aea_2 d2 = mda2;
        Aea_2 c2 = this;
        return d2;
    }

    public int J() {
        return vRa.d;
    }
}

