/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fpa
 *  gFa
 *  vL
 *  vRa
 *  vfa
 */
public final class lga
extends gFa {
    private vfa A;
    private boolean I;

    public boolean f() {
        lga lga2 = this;
        if (!lga2.A.ba()) {
            return uSa.E != 0;
        }
        if (lga2.A.L()) {
            return uSa.E != 0;
        }
        if (!lga2.A.ha) {
            return uSa.E != 0;
        }
        lga a2 = lga2.A.d();
        if (a2 == null) {
            return vRa.d != 0;
        }
        if (lga2.A.J((vL)a2) < fpa.a && a2.f() != null) {
            return uSa.E != 0;
        }
        return lga2.I;
    }

    public void J() {
        lga a2;
        a2.A.I(uSa.E != 0);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        lga a2 = this;
        a2.I = b2;
    }

    public lga(vfa vfa2) {
        lga a2;
        lga b2 = vfa2;
        lga lga2 = a2 = this;
        lga2.A = b2;
        lga2.J(tTa.h);
    }

    public void l() {
        lga a2;
        lga lga2 = a2;
        lga2.A.J().f();
        lga2.A.I(vRa.d != 0);
    }
}

