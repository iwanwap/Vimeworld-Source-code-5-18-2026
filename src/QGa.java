/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Yfa
 *  ZOa
 *  Zta
 *  gFa
 *  kta
 *  nQa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QGa
extends gFa {
    public Gg j;
    public Yfa J;
    public Gl A;
    public int I;

    public void J() {
        QGa a2;
        a2.A = null;
        a2.J.J().f();
    }

    public boolean l() {
        QGa a2;
        if (!a2.A.K()) {
            return uSa.E != 0;
        }
        QGa qGa = a2;
        if (qGa.J.J((vL)qGa.A) > nQa.K) {
            return uSa.E != 0;
        }
        if (!a2.J.J().f() || a2.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        QGa qGa = this;
        QGa a2 = qGa.J.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        qGa.A = a2;
        return vRa.d != 0;
    }

    public QGa(Yfa yfa) {
        QGa b2 = yfa;
        QGa a2 = this;
        a2.J = b2;
        a2.j = ((Yfa)b2).j;
        a2.J(yRa.d);
    }

    public void f() {
        QGa qGa;
        QGa a2;
        QGa qGa2 = a2;
        QGa qGa3 = a2;
        qGa2.J.J().J((vL)qGa3.A, NSa.B, NSa.B);
        double d2 = qGa2.J.F * kta.v * a2.J.F * kta.v;
        double d3 = qGa3.J.f(a2.A.la, a2.A.J().j, a2.A.A);
        double d4 = Jra.A;
        if (d3 > d2 && d3 < Zta.ba) {
            d4 = ZOa.n;
            qGa = a2;
        } else {
            if (d3 < nQa.K) {
                d4 = oQa.fa;
            }
            qGa = a2;
        }
        qGa.J.J().J((vL)a2.A, d4);
        a2.I = Math.max(a2.I - vRa.d, uSa.E);
        if (d3 <= d2 && a2.I <= 0) {
            a2.I = kTa.j;
            a2.J.C((vL)a2.A);
        }
    }
}

