/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  JPa
 *  UZ
 *  aSa
 *  bFa
 *  gZ
 *  nEa
 *  uQa
 *  uda
 *  vL
 *  vRa
 */
public final class Dfa_3
extends nEa {
    private Gl I;

    public Dfa_3(Gg gg2) {
        Dfa_3 b2 = gg2;
        Dfa_3 a2 = this;
        super((Gg)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(RY rY2) {
        void a22;
        Dfa_3 dfa_3 = this;
        Dfa_3 b2 = dfa_3.J();
        if (a22.J != null) {
            if (a22.J == dfa_3.I) {
                return;
            }
            a22.J.J(gZ.J((vL)dfa_3, (vL)b2), JPa.N);
        }
        int n2 = a22 = uSa.E;
        while (n2 < fPa.i) {
            int n3 = 3 & 5;
            dfa_3.j.J(UZ.PORTAL, dfa_3.la, dfa_3.Z + dfa_3.R.nextDouble() * KPa.y, dfa_3.A, dfa_3.R.nextGaussian(), aSa.V, dfa_3.R.nextGaussian(), new int[uSa.E]);
            n2 = ++a22;
        }
        if (!dfa_3.j.e) {
            if (b2 instanceof bFa) {
                bFa a22 = (bFa)b2;
                if (a22.I.J().J() && a22.j == dfa_3.j && !a22.p()) {
                    if (dfa_3.R.nextFloat() < Yqa.C && dfa_3.j.J().f(uQa.Ga)) {
                        bFa bFa2 = a22 = new uda(dfa_3.j);
                        bFa2.k(vRa.d != 0);
                        Dfa_3 dfa_32 = b2;
                        bFa2.f(((Gl)b2).la, ((Gl)b2).Z, ((Gl)b2).A, ((Gl)dfa_32).X, ((Gl)dfa_32).d);
                        dfa_3.j.f((vL)a22);
                    }
                    if (b2.B()) {
                        b2.l(null);
                    }
                    Dfa_3 dfa_33 = b2;
                    dfa_33.C(dfa_3.la, dfa_3.Z, dfa_3.A);
                    ((Gl)dfa_33).O = JPa.N;
                    dfa_33.J(gZ.B, eua.C);
                }
            } else if (b2 != null) {
                b2.C(dfa_3.la, dfa_3.Z, dfa_3.A);
                ((Gl)b2).O = JPa.N;
            }
            dfa_3.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dfa_3(Gg gg2, Gl gl2) {
        void b2;
        Dfa_3 c2 = gl2;
        Dfa_3 a2 = this;
        super((Gg)b2, (Gl)c2);
        a2.I = c2;
    }

    /*
     * WARNING - void declaration
     */
    public Dfa_3(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Dfa_3 e2 = gg2;
        Dfa_3 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
    }

    public void d() {
        Dfa_3 dfa_3 = this;
        Dfa_3 a2 = dfa_3.J();
        if (a2 != null && a2 instanceof Sx && !a2.K()) {
            dfa_3.k();
            return;
        }
        super.d();
    }
}

