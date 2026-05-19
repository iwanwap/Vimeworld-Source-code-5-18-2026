/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yfa
 *  gFa
 *  uRa
 *  vL
 *  vRa
 *  wra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class nHa_3
extends gFa {
    public vL M;
    public float k;
    private float j;
    public Yfa J;
    public Class<? extends vL> A;
    private int I;

    public void J() {
        a.M = null;
    }

    public boolean f() {
        nHa_3 nHa_32;
        nHa_3 a2;
        if (a2.J.J().nextFloat() >= a2.j) {
            return uSa.E != 0;
        }
        if (a2.J.C() != null) {
            a2.M = a2.J.C();
        }
        if (a2.A == Sx.class) {
            nHa_3 nHa_33 = a2;
            nHa_32 = nHa_33;
            a2.M = a2.J.j.J((vL)nHa_33.J, (double)a2.k);
        } else {
            nHa_3 nHa_34 = a2;
            nHa_32 = nHa_34;
            a2.M = nHa_34.J.j.J(a2.A, a2.J.J().f((double)a2.k, uRa.I, (double)a2.k), (vL)a2.J);
        }
        if (nHa_32.M != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        nHa_3 a2;
        a2.I = wra.P + a2.J.J().nextInt(wra.P);
    }

    /*
     * WARNING - void declaration
     */
    public nHa_3(Yfa yfa, Class<? extends vL> clazz, float f2, float f3) {
        void e2;
        void b2;
        void c2;
        void d2;
        nHa_3 a2;
        float f4 = f3;
        nHa_3 nHa_32 = a2 = this;
        nHa_32.J = d2;
        nHa_32.A = c2;
        a2.k = b2;
        a2.j = e2;
        a2.J(uqa.g);
    }

    public boolean l() {
        nHa_3 a2;
        if (!a2.M.K()) {
            return uSa.E != 0;
        }
        nHa_3 nHa_32 = a2;
        nHa_3 nHa_33 = a2;
        if (nHa_32.J.J(nHa_32.M) > (double)(nHa_33.k * nHa_33.k)) {
            return uSa.E != 0;
        }
        if (a2.I > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public nHa_3(Yfa yfa, Class<? extends vL> clazz, float f2) {
        void b2;
        void c2;
        nHa_3 a2;
        float d2 = f2;
        nHa_3 nHa_32 = a2 = this;
        a2.J = c2;
        nHa_32.A = b2;
        a2.k = d2;
        nHa_32.j = WRa.e;
        a2.J(uqa.g);
    }

    public void f() {
        nHa_3 a2;
        nHa_3 nHa_32 = a2;
        a2.J.J().J(nHa_32.M.la, a2.M.Z + (double)a2.M.l(), a2.M.A, FRa.Ga, (float)a2.J.F());
        nHa_32.I -= vRa.d;
    }
}

