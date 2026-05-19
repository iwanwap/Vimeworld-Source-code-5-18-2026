/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  Gg
 *  JPa
 *  QSa
 *  TQa
 *  fpa
 *  gFa
 *  lqa
 *  mFa
 *  uRa
 *  vL
 *  vRa
 *  vpa
 *  wEa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sia_2
extends gFa {
    private Gg k;
    public Aaa j;
    private mFa J;
    private mFa A;
    private int I;

    public void l() {
        Sia_2 a2;
        a2.I = vpa.Ja;
        a2.J.F(vRa.d != 0);
    }

    public boolean l() {
        Sia_2 a2;
        if (a2.I >= 0 && a2.C() && a2.J.I() == 0 && a2.J.J(uSa.E != 0)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        Sia_2 a2;
        a2.j = null;
        a2.A = null;
        a2.J.F(uSa.E != 0);
    }

    private boolean C() {
        Sia_2 sia_2 = this;
        if (!sia_2.j.J()) {
            return uSa.E != 0;
        }
        Sia_2 sia_22 = sia_2;
        int a2 = (int)((double)sia_22.j.C() * LPa.e);
        if (sia_22.j.J() < a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        Sia_2 sia_2;
        Sia_2 a2;
        Sia_2 sia_22 = a2;
        sia_22.I -= vRa.d;
        Sia_2 sia_23 = a2;
        sia_22.J.J().J((vL)sia_23.A, FRa.Ga, NSa.B);
        if (sia_23.J.J((vL)a2.A) > fpa.o) {
            Sia_2 sia_24 = a2;
            sia_2 = sia_24;
            a2.J.J().J((vL)sia_24.A, VPa.W);
        } else {
            if (a2.I == 0 && a2.A.v()) {
                a2.C();
            }
            sia_2 = a2;
        }
        if (sia_2.J.J().nextInt(TQa.ca) == 0) {
            Sia_2 sia_25 = a2;
            sia_25.k.J((vL)sia_25.J, (byte)lqa.s);
        }
    }

    private void C() {
        Sia_2 sia_2;
        Sia_2 sia_22 = sia_2 = this;
        Sia_2 sia_23 = sia_2;
        Sia_2 a2 = sia_22.J.J((wEa)sia_23.A);
        sia_22.A.D(MTa.g);
        sia_23.J.D(MTa.g);
        sia_22.A.j(uSa.E != 0);
        sia_22.J.j(uSa.E != 0);
        Sia_2 sia_24 = a2;
        sia_24.D(QSa.e);
        sia_24.f(sia_2.J.la, sia_2.J.Z, sia_2.J.A, JPa.N, JPa.N);
        sia_22.k.f((vL)a2);
        sia_2.k.J((vL)a2, (byte)lqa.s);
    }

    public boolean f() {
        Sia_2 sia_2 = this;
        if (sia_2.J.I() != 0) {
            return uSa.E != 0;
        }
        if (sia_2.J.J().nextInt(dsa.f) != 0) {
            return uSa.E != 0;
        }
        Sia_2 sia_22 = sia_2;
        sia_22.j = sia_22.k.J().J(new XF((vL)sia_2.J), uSa.E);
        if (sia_22.j == null) {
            return uSa.E != 0;
        }
        if (sia_2.C() && sia_2.J.J(vRa.d != 0)) {
            Sia_2 a2 = sia_2.k.J(mFa.class, sia_2.J.J().f(Wqa.Z, uRa.I, Wqa.Z), (vL)sia_2.J);
            if (a2 == null) {
                return uSa.E != 0;
            }
            sia_2.A = (mFa)a2;
            if (sia_2.A.I() == 0 && sia_2.A.J(vRa.d != 0)) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public Sia_2(mFa mFa2) {
        Sia_2 b2 = mFa2;
        Sia_2 a2 = this;
        a2.J = b2;
        a2.k = ((mFa)b2).j;
        a2.J(yRa.d);
    }
}

