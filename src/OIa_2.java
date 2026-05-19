/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Hba
 *  eAa
 *  gFa
 *  pua
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class OIa_2
extends gFa {
    private double F;
    private double g;
    private eAa L;
    private boolean E;
    private boolean m;
    private int C;
    private bga i;
    private double M;
    private boolean k;
    private Sx j;
    private double J;
    private double A;
    private double I;

    public void f() {
        OIa_2 a2;
        OIa_2 oIa_2 = a2;
        a2.i.J().J((vL)oIa_2.j, NSa.B, (float)a2.i.F());
        if (oIa_2.i.J((vL)a2.j) < pua.ia) {
            a2.i.J().f();
            return;
        }
        OIa_2 oIa_22 = a2;
        a2.i.J().J((vL)oIa_22.j, oIa_22.g);
    }

    /*
     * WARNING - void declaration
     */
    public OIa_2(bga bga2, double d2, eAa eAa2, boolean bl) {
        void a2;
        void b2;
        void c2;
        OIa_2 d3;
        Object e2 = bga2;
        OIa_2 oIa_2 = d3 = this;
        oIa_2.i = e2;
        oIa_2.g = c2;
        d3.L = b2;
        d3.k = a2;
        d3.J(yRa.d);
        if (!(e2.J() instanceof Hba)) {
            throw new IllegalArgumentException(Xpa.I);
        }
    }

    public boolean l() {
        OIa_2 a2;
        if (a2.k) {
            OIa_2 oIa_2 = a2;
            if (oIa_2.i.J((vL)oIa_2.j) < Qra.l) {
                OIa_2 oIa_22 = a2;
                if (oIa_22.j.f(oIa_22.M, a2.F, a2.I) > rQa.P) {
                    return uSa.E != 0;
                }
                if (Math.abs((double)a2.j.d - a2.A) > DQa.S || Math.abs((double)a2.j.X - a2.J) > DQa.S) {
                    return uSa.E != 0;
                }
            } else {
                OIa_2 oIa_23 = a2;
                oIa_23.M = oIa_23.j.la;
                oIa_23.F = oIa_23.j.Z;
                oIa_23.I = oIa_23.j.A;
            }
            OIa_2 oIa_24 = a2;
            oIa_24.A = oIa_24.j.d;
            oIa_24.J = oIa_24.j.X;
        }
        return a2.f();
    }

    public void J() {
        OIa_2 a2;
        OIa_2 oIa_2 = a2;
        oIa_2.j = null;
        oIa_2.i.J().f();
        oIa_2.C = ySa.T;
        oIa_2.m = uSa.E;
        ((Hba)oIa_2.i.J()).J(a2.E);
    }

    public void l() {
        OIa_2 a2;
        OIa_2 oIa_2 = a2;
        oIa_2.M = oIa_2.j.la;
        oIa_2.F = oIa_2.j.Z;
        oIa_2.I = oIa_2.j.A;
        oIa_2.m = vRa.d;
        oIa_2.E = ((Hba)oIa_2.i.J()).C();
        ((Hba)a2.i.J()).J(uSa.E != 0);
    }

    public boolean f() {
        OIa_2 oIa_2 = this;
        if (oIa_2.C > 0) {
            oIa_2.C -= vRa.d;
            return uSa.E != 0;
        }
        OIa_2 oIa_22 = oIa_2;
        oIa_2.j = oIa_22.i.j.J((vL)oIa_2.i, Wqa.m);
        if (oIa_22.j == null) {
            return uSa.E != 0;
        }
        OIa_2 a2 = oIa_2.j.f();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (a2.J() == oIa_2.L) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean C() {
        OIa_2 a2;
        return a2.m;
    }
}

