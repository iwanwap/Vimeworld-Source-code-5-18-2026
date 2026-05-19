/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aPa
 *  cga
 *  gFa
 *  vRa
 *  wra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ufa_3
extends gFa {
    private int J;
    private float A;
    private cga I;

    public boolean f() {
        Ufa_3 a2;
        if (a2.I.C() == null && (a2.I.ha || a2.I.L() || a2.I.H())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        Ufa_3 a2;
        if ((a2.J -= vRa.d) <= 0) {
            Ufa_3 ufa_3 = a2;
            Ufa_3 ufa_32 = a2;
            ufa_3.J = wra.P + ufa_32.I.J().nextInt(Psa.M);
            ufa_3.A = ufa_32.I.J().nextInt(aPa.Y);
        }
        ((wea)a2.I.J()).J(a2.A, uSa.E != 0);
    }

    public Ufa_3(cga cga2) {
        Ufa_3 a2;
        Ufa_3 b2 = cga2;
        Ufa_3 ufa_3 = a2 = this;
        ufa_3.I = b2;
        ufa_3.J(uqa.g);
    }
}

