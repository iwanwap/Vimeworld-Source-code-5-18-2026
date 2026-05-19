/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  OEa
 *  Rea
 *  XTa
 *  gFa
 *  vL
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rga
extends gFa {
    private double k;
    private double j;
    private Rea J;
    private double A;
    private double I;

    public void f() {
        Rga rga = this;
        if (rga.J.J().nextInt(vpa.o) == 0) {
            if (rga.J.Aa instanceof Sx) {
                Rga rga2 = rga;
                int n2 = rga2.J.g();
                int a2 = rga2.J.b();
                if (a2 > 0 && rga.J.J().nextInt(a2) < n2) {
                    Rga rga3 = rga;
                    rga3.J.C((Sx)rga3.J.Aa);
                    rga.J.j.J((vL)rga.J, (byte)XTa.W);
                    return;
                }
                rga.J.f(tTa.h);
            }
            rga.J.Aa.l((vL)null);
            Rga rga4 = rga;
            rga4.J.Aa = null;
            rga4.J.ia();
            rga4.J.j.J((vL)rga.J, (byte)uua.p);
        }
    }

    public void l() {
        Rga a2;
        a2.J.J().J(a2.k, a2.j, a2.A, a2.I);
    }

    public boolean l() {
        Rga a2;
        if (!a2.J.J().f() && a2.J.Aa != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        Rga rga = this;
        if (!rga.J.ja() && rga.J.Aa != null) {
            Rga a2 = OEa.J((bga)rga.J, (int)tTa.h, (int)AQa.P);
            if (a2 == null) {
                return uSa.E != 0;
            }
            Rga rga2 = rga;
            Rga rga3 = a2;
            rga.k = ((Lz)a2).A;
            rga2.j = ((Lz)rga3).j;
            rga2.A = ((Lz)rga3).J;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Rga(Rea rea2, double d2) {
        void a2;
        Rga c2 = rea2;
        Rga b2 = this;
        b2.J = c2;
        b2.I = a2;
        b2.J(vRa.d);
    }
}

