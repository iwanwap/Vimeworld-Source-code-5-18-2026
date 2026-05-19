/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  gFa
 *  hra
 *  lPa
 *  mFa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tIa_1
extends gFa {
    private mFa J;
    private DDa A;
    private int I;

    public void l() {
        tIa_1 a2;
        a2.I = hra.i;
        a2.A.F(vRa.d != 0);
    }

    public boolean l() {
        tIa_1 a2;
        if (a2.I > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        tIa_1 a2;
        a2.A.F(uSa.E != 0);
        a2.J = null;
    }

    public void f() {
        tIa_1 a2;
        tIa_1 tIa_12 = a2;
        a2.A.J().J((vL)tIa_12.J, NSa.B, NSa.B);
        tIa_12.I -= vRa.d;
    }

    public tIa_1(DDa dDa2) {
        tIa_1 a2;
        tIa_1 b2 = dDa2;
        tIa_1 tIa_12 = a2 = this;
        tIa_12.A = b2;
        tIa_12.J(yRa.d);
    }

    public boolean f() {
        tIa_1 a2;
        if (!a2.A.j.e()) {
            return uSa.E != 0;
        }
        if (a2.A.J().nextInt(CRa.C) != 0) {
            return uSa.E != 0;
        }
        a2.J = (mFa)a2.A.j.J(mFa.class, a2.A.J().f(lPa.K, KPa.y, lPa.K), (vL)a2.A);
        if (a2.J != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

