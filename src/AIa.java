/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  NTa
 *  fEa
 *  gFa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class AIa
extends gFa {
    public fEa j;
    public double J;
    public fEa A;
    private int I;

    public boolean f() {
        AIa aIa = this;
        if (aIa.A.I() >= 0) {
            return uSa.E != 0;
        }
        Object a2 = aIa.A.j.J(aIa.A.getClass(), aIa.A.J().f(Wqa.Z, FPa.T, Wqa.Z));
        fEa fEa2 = null;
        double d2 = Bra.o;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            double d3;
            fEa fEa3 = (fEa)a2.next();
            if (fEa3.I() < 0) continue;
            double d4 = aIa.A.J((vL)fEa3);
            if (!(d3 <= d2)) continue;
            d2 = d4;
            fEa2 = fEa3;
        }
        if (fEa2 == null) {
            return uSa.E != 0;
        }
        if (d2 < KSa.F) {
            return uSa.E != 0;
        }
        aIa.j = fEa2;
        return vRa.d != 0;
    }

    public void l() {
        a.I = uSa.E;
    }

    public void f() {
        if ((a2.I -= vRa.d) <= 0) {
            AIa a2;
            a2.I = NTa.C;
            AIa aIa = a2;
            a2.A.J().J((vL)aIa.j, aIa.J);
        }
    }

    public boolean l() {
        double d2;
        AIa a2;
        if (a2.A.I() >= 0) {
            return uSa.E != 0;
        }
        if (!a2.j.K()) {
            return uSa.E != 0;
        }
        AIa aIa = a2;
        double d3 = aIa.A.J((vL)aIa.j);
        if (d2 >= KSa.F && d3 <= ZSa.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        a.j = null;
    }

    /*
     * WARNING - void declaration
     */
    public AIa(fEa fEa2, double d2) {
        void a2;
        AIa b2;
        AIa c2 = fEa2;
        AIa aIa = b2 = this;
        aIa.A = c2;
        aIa.J = a2;
    }
}

