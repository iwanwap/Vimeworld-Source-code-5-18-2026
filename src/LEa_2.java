/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  NCa
 *  NTa
 *  OU
 *  PTa
 *  Waa
 *  Yw
 *  cra
 *  psa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class LEa_2 {
    public final OU i;
    public boolean M;
    public final OU k;
    public final OU j;
    public boolean J;
    public final Yw A;
    public final Yw I;

    public void f(float f2) {
        float b2 = f2;
        LEa_2 a2 = this;
        a2.A.J(b2);
    }

    public boolean l() {
        LEa_2 a2;
        return a2.j.J();
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        LEa_2 a2 = this;
        a2.i.J(b2);
    }

    public void J(float f2) {
        float b2 = f2;
        LEa_2 a2 = this;
        a2.I.J(b2);
    }

    public float f() {
        LEa_2 a2;
        return a2.A.J();
    }

    public LEa_2() {
        LEa_2 a2;
        LEa_2 lEa_2 = a2;
        a2.k = new OU(uSa.E != 0, vRa.d);
        lEa_2.j = new OU(uSa.E != 0, vRa.d);
        a2.i = new OU(uSa.E != 0, vRa.d);
        a2.J = vRa.d;
        a2.I = new Yw(Yqa.C, vRa.d);
        a2.A = new Yw(Nra.e, vRa.d);
    }

    public boolean f() {
        LEa_2 a2;
        return a2.i.J();
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        LEa_2 a2 = this;
        a2.k.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        void a2;
        LEa_2 b2;
        LEa_2 lEa_2 = this;
        LEa_2 lEa_22 = b2 = new Waa();
        lEa_22.J(Jsa.z, lEa_2.M);
        lEa_22.J(Fpa.T, lEa_2.J());
        lEa_22.J(EPa.s, lEa_2.l());
        lEa_22.J(wua.M, lEa_2.f());
        lEa_22.J(tTa.i, lEa_2.J);
        lEa_22.J(cra.P, lEa_2.I.J());
        lEa_22.J(psa.ja, lEa_2.A.J());
        a2.J(PTa.L, (NCa)b2);
    }

    public void J(Waa waa2) {
        LEa_2 b2 = waa2;
        LEa_2 a2 = this;
        if (b2.J(PTa.L, NTa.C)) {
            LEa_2 lEa_2 = b2 = b2.J(PTa.L);
            LEa_2 lEa_22 = a2;
            LEa_2 lEa_23 = b2;
            a2.M = lEa_23.f(Jsa.z);
            lEa_22.f(lEa_23.f(Fpa.T));
            lEa_22.J(b2.f(EPa.s));
            a2.l(lEa_2.f(wua.M));
            if (lEa_2.J(cra.P, zOa.v)) {
                LEa_2 lEa_24 = a2;
                lEa_24.I.J(b2.J(cra.P));
                lEa_24.A.J(b2.J(psa.ja));
            }
            if (b2.J(tTa.i, vRa.d)) {
                a2.J = b2.f(tTa.i);
            }
        }
    }

    public boolean J() {
        LEa_2 a2;
        return a2.k.J();
    }

    public float J() {
        LEa_2 a2;
        return a2.I.J();
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        LEa_2 a2 = this;
        a2.j.J(b2);
    }
}

