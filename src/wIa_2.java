/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  Gl
 *  Lz
 *  OEa
 *  gFa
 *  hra
 *  lPa
 *  mFa
 *  uRa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wIa_2
extends gFa {
    private double j;
    private Gl J;
    private int A;
    private mFa I;

    public void f() {
        wIa_2 wIa_22;
        wIa_2 wIa_23 = wIa_22 = this;
        wIa_23.A -= vRa.d;
        if (wIa_23.J != null) {
            wIa_2 wIa_24 = wIa_22;
            if (wIa_24.I.J((vL)wIa_24.J) > FPa.T) {
                wIa_2 wIa_25 = wIa_22;
                wIa_22.I.J().J((vL)wIa_25.J, wIa_25.j);
                return;
            }
        } else if (wIa_22.I.J().f()) {
            wIa_2 a2 = OEa.J((bga)wIa_22.I, (int)ERa.C, (int)yRa.d);
            if (a2 == null) {
                return;
            }
            wIa_22.I.J().J(((Lz)a2).A, ((Lz)a2).j, ((Lz)a2).J, wIa_22.j);
        }
    }

    public void J() {
        wIa_2 a2;
        a2.I.I(uSa.E != 0);
        a2.J = null;
    }

    public boolean f() {
        wIa_2 wIa_22 = this;
        if (wIa_22.I.I() >= 0) {
            return uSa.E != 0;
        }
        if (wIa_22.I.J().nextInt(hra.i) != 0) {
            return uSa.E != 0;
        }
        Object a2 = wIa_22.I.j.J(mFa.class, wIa_22.I.J().f(lPa.K, uRa.I, lPa.K));
        double d2 = Bra.o;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            double d3;
            mFa mFa2 = (mFa)a2.next();
            if (mFa2 == wIa_22.I || mFa2.ka() || mFa2.I() >= 0) continue;
            double d4 = mFa2.J((vL)wIa_22.I);
            if (!(d3 <= d2)) continue;
            d2 = d4;
            wIa_22.J = mFa2;
        }
        if (wIa_22.J == null && (a2 = OEa.J((bga)wIa_22.I, (int)ERa.C, (int)yRa.d)) == null) {
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public wIa_2(mFa mFa2, double d2) {
        void a2;
        wIa_2 c2 = mFa2;
        wIa_2 b2 = this;
        b2.I = c2;
        b2.j = a2;
        b2.J(vRa.d);
    }

    public boolean l() {
        wIa_2 a2;
        if (a2.A > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        wIa_2 a2;
        if (a2.J != null) {
            a2.I.I(vRa.d != 0);
        }
        a2.A = PRa.U;
    }
}

