/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cga
 *  gFa
 *  vL
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bEa
extends gFa {
    private cga A;
    private int I;

    public boolean f() {
        bEa bEa2 = this;
        bEa a2 = bEa2.A.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (!a2.K()) {
            return uSa.E != 0;
        }
        if (!(a2 instanceof Sx) || !((Sx)((Object)a2)).h.M) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        bEa a2;
        bEa bEa2 = a2;
        a2.A.J((vL)bEa2.A.C(), FRa.Ga, FRa.Ga);
        ((wea)bEa2.A.J()).J(a2.A.X, a2.A.X());
    }

    public bEa(cga cga2) {
        bEa a2;
        bEa b2 = cga2;
        bEa bEa2 = a2 = this;
        bEa2.A = b2;
        bEa2.J(uqa.g);
    }

    public boolean l() {
        bEa bEa2 = this;
        bEa a2 = bEa2.A.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (!a2.K()) {
            return uSa.E != 0;
        }
        if (a2 instanceof Sx && ((Sx)((Object)a2)).h.M) {
            return uSa.E != 0;
        }
        if ((bEa2.I -= vRa.d) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        bEa a2;
        a2.I = vpa.Ja;
        super.l();
    }
}

