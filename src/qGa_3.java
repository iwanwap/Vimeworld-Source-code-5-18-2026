/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gl
 *  Lz
 *  OEa
 *  XTa
 *  gFa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qGa_3
extends gFa {
    private double i;
    private double M;
    private float k;
    private Gl j;
    private double J;
    private bga A;
    private double I;

    public void l() {
        qGa_3 a2;
        a2.A.J().J(a2.I, a2.i, a2.J, a2.M);
    }

    public boolean f() {
        qGa_3 qGa_32;
        qGa_3 qGa_33 = qGa_32 = this;
        qGa_33.j = qGa_33.A.C();
        if (qGa_33.j == null) {
            return uSa.E != 0;
        }
        qGa_3 qGa_34 = qGa_32;
        qGa_3 qGa_35 = qGa_32;
        if (qGa_34.j.J((vL)qGa_34.A) > (double)(qGa_35.k * qGa_35.k)) {
            return uSa.E != 0;
        }
        qGa_3 a2 = OEa.l((bga)qGa_32.A, (int)ERa.C, (int)XTa.W, (Lz)new Lz(qGa_32.j.la, qGa_32.j.Z, qGa_32.j.A));
        if (a2 == null) {
            return uSa.E != 0;
        }
        qGa_3 qGa_36 = qGa_32;
        qGa_3 qGa_37 = a2;
        qGa_32.I = ((Lz)a2).A;
        qGa_36.i = ((Lz)qGa_37).j;
        qGa_36.J = ((Lz)qGa_37).J;
        return vRa.d != 0;
    }

    public void J() {
        a.j = null;
    }

    /*
     * WARNING - void declaration
     */
    public qGa_3(bga bga2, double d2, float f2) {
        void d3;
        void b2;
        void c2;
        float f3 = f2;
        qGa_3 a2 = this;
        a2.A = c2;
        a2.M = b2;
        a2.k = d3;
        a2.J(vRa.d);
    }

    public boolean l() {
        qGa_3 a2;
        if (!a2.A.J().f() && a2.j.K()) {
            qGa_3 qGa_32 = a2;
            qGa_3 qGa_33 = a2;
            if (qGa_32.j.J((vL)qGa_32.A) < (double)(qGa_33.k * qGa_33.k)) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }
}

