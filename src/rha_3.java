/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  FPa
 *  cQa
 *  gFa
 *  lPa
 *  mFa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rha_3
extends gFa {
    private boolean j;
    private int J;
    private DDa A;
    private mFa I;

    public boolean l() {
        rha_3 a2;
        if (a2.A.I() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        rha_3 rha_32;
        block5: {
            rha_3 rha_33 = this;
            if (rha_33.I.I() >= 0) {
                return uSa.E != 0;
            }
            if (!rha_33.I.j.e()) {
                return uSa.E != 0;
            }
            Object a2 = rha_33.I.j.J(DDa.class, rha_33.I.J().f(lPa.K, KPa.y, lPa.K));
            if (a2.isEmpty()) {
                return uSa.E != 0;
            }
            a2 = a2.iterator();
            while (a2.hasNext()) {
                DDa dDa2 = (DDa)a2.next();
                if (dDa2.I() <= 0) continue;
                rha_32 = rha_33;
                rha_33.A = dDa2;
                break block5;
            }
            rha_32 = rha_33;
        }
        if (rha_32.A != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        rha_3 a2;
        rha_3 rha_32 = a2;
        rha_32.J = rha_32.I.J().nextInt(cQa.Z);
        rha_32.j = uSa.E;
        rha_32.A.J().f();
    }

    public void f() {
        rha_3 a2;
        rha_3 rha_32 = a2;
        a2.I.J().J((vL)rha_32.A, NSa.B, NSa.B);
        if (rha_32.A.I() == a2.J) {
            a2.I.J().J((vL)a2.A, kTa.B);
            a2.j = vRa.d;
        }
        if (a2.j) {
            rha_3 rha_33 = a2;
            if (rha_33.I.J((vL)rha_33.A) < FPa.T) {
                rha_3 rha_34 = a2;
                rha_34.A.F(uSa.E != 0);
                rha_34.I.J().f();
            }
        }
    }

    public void J() {
        rha_3 a2;
        a2.A = null;
        a2.I.J().f();
    }

    public rha_3(mFa mFa2) {
        rha_3 a2;
        rha_3 b2 = mFa2;
        rha_3 rha_32 = a2 = this;
        rha_32.I = b2;
        rha_32.J(yRa.d);
    }
}

