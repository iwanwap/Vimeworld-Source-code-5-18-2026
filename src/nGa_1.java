/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Zta
 *  gFa
 *  mFa
 *  vL
 */
public final class nGa_1
extends gFa {
    private mFa I;

    public boolean f() {
        nGa_1 nGa_12 = this;
        if (!nGa_12.I.K()) {
            return uSa.E != 0;
        }
        if (nGa_12.I.L()) {
            return uSa.E != 0;
        }
        if (!nGa_12.I.ha) {
            return uSa.E != 0;
        }
        if (nGa_12.I.a) {
            return uSa.E != 0;
        }
        Object a2 = nGa_12.I.J();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (nGa_12.I.J((vL)a2) > Zta.ba) {
            return uSa.E != 0;
        }
        return ((Sx)((Object)a2)).G instanceof Ega;
    }

    public nGa_1(mFa mFa2) {
        nGa_1 a2;
        nGa_1 b2 = mFa2;
        nGa_1 nGa_12 = a2 = this;
        nGa_12.I = b2;
        nGa_12.J(tTa.h);
    }

    public void l() {
        nGa_1 a2;
        a2.I.J().f();
    }

    public void J() {
        nGa_1 a2;
        a2.I.l((Sx)null);
    }
}

