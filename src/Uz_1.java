/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  NCa
 *  NTa
 *  Sqa
 *  Waa
 *  XTa
 *  asa
 *  eAa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Uz_1 {
    private Mda M;
    private Mda k;
    private int j;
    private boolean J;
    private Mda A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public Uz_1(Mda mda2, Mda mda3) {
        void b2;
        Uz_1 c2 = mda3;
        Uz_1 a2 = this;
        a2((Mda)b2, null, (Mda)c2);
    }

    public boolean l() {
        Uz_1 a2;
        Uz_1 uz_1 = a2;
        if (uz_1.I >= uz_1.j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Uz_1(Mda mda2, eAa eAa2) {
        void b2;
        Uz_1 c2 = eAa2;
        Uz_1 a2 = this;
        a2((Mda)b2, new Mda((eAa)c2));
    }

    public boolean f() {
        Uz_1 a2;
        return a2.J;
    }

    public int f() {
        Uz_1 a2;
        return a2.I;
    }

    public Waa J() {
        Uz_1 uz_1 = this;
        Uz_1 a2 = new Waa();
        a2.J(vRa.y, (NCa)uz_1.A.J(new Waa()));
        Uz_1 uz_12 = uz_1;
        a2.J(asa.E, (NCa)uz_12.k.J(new Waa()));
        if (uz_12.M != null) {
            a2.J(vua.z, (NCa)uz_1.M.J(new Waa()));
        }
        Uz_1 uz_13 = a2;
        uz_13.J(nua.x, uz_1.I);
        uz_13.J(Sqa.S, uz_1.j);
        uz_13.J(Psa.Ha, uz_1.J);
        return uz_13;
    }

    public void J(Waa waa2) {
        Uz_1 uz_1;
        Uz_1 b2 = waa2;
        Uz_1 a2 = this;
        Uz_1 uz_12 = b2;
        Waa waa3 = uz_12.J(vRa.y);
        a2.A = Mda.J((Waa)waa3);
        waa3 = uz_12.J(asa.E);
        a2.k = Mda.J((Waa)waa3);
        if (uz_12.J(vua.z, NTa.C)) {
            a2.M = Mda.J((Waa)b2.J(vua.z));
        }
        if (b2.J(nua.x, zOa.v)) {
            a2.I = b2.J(nua.x);
        }
        if (b2.J(Sqa.S, zOa.v)) {
            Uz_1 uz_13 = b2;
            uz_1 = uz_13;
            a2.j = uz_13.J(Sqa.S);
        } else {
            a2.j = XTa.W;
            uz_1 = b2;
        }
        if (uz_1.J(Psa.Ha, vRa.d)) {
            a2.J = b2.f(Psa.Ha);
            return;
        }
        a2.J = vRa.d;
    }

    public void f() {
        a.I += vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public Uz_1(Mda mda2, Mda mda3, Mda mda4, int n2, int n3) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        Uz_1 a2;
        int n4 = n3;
        Uz_1 uz_1 = a2 = this;
        Uz_1 uz_12 = a2;
        a2.A = e2;
        uz_12.M = d2;
        uz_12.k = c2;
        uz_1.I = b2;
        uz_1.j = f2;
        uz_1.J = vRa.d;
    }

    public void J(int n2) {
        int b2 = n2;
        Uz_1 a2 = this;
        a2.j += b2;
    }

    public Mda l() {
        Uz_1 a2;
        return a2.k;
    }

    public Mda f() {
        Uz_1 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public Uz_1(Mda mda2, Mda mda3, Mda mda4) {
        void b2;
        void c2;
        Uz_1 d2 = mda4;
        Uz_1 a2 = this;
        a2((Mda)c2, (Mda)b2, (Mda)d2, uSa.E, XTa.W);
    }

    public Uz_1(Waa waa2) {
        Uz_1 a2;
        Uz_1 b2 = waa2;
        Uz_1 uz_1 = a2 = this;
        uz_1.J((Waa)b2);
    }

    public boolean J() {
        Uz_1 a2;
        if (a2.M != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J() {
        Uz_1 a2;
        return a2.j;
    }

    public void J() {
        Uz_1 a2;
        a2.I = a2.j;
    }

    public Mda J() {
        Uz_1 a2;
        return a2.A;
    }
}

