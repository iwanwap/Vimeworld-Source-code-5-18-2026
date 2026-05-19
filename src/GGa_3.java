/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  gFa
 *  pua
 *  vL
 *  vRa
 *  zfa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GGa_3
extends gFa {
    public zfa A;
    public Gl I;

    public void l() {
        GGa_3 a2;
        GGa_3 gGa_3 = a2;
        gGa_3.A.J().f();
        gGa_3.I = gGa_3.A.C();
    }

    public GGa_3(zfa zfa2) {
        GGa_3 a2;
        GGa_3 b2 = zfa2;
        GGa_3 gGa_3 = a2 = this;
        gGa_3.A = b2;
        gGa_3.J(vRa.d);
    }

    public boolean f() {
        GGa_3 gGa_3;
        GGa_3 gGa_32 = gGa_3 = this;
        GGa_3 a2 = gGa_32.A.C();
        if (gGa_32.A.I() > 0 || a2 != null && gGa_3.A.J((vL)a2) < KSa.F) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        GGa_3 a2;
        if (a2.I == null) {
            a2.A.D(pua.o);
            return;
        }
        GGa_3 gGa_3 = a2;
        if (gGa_3.A.J((vL)gGa_3.I) > vRa.K) {
            a2.A.D(pua.o);
            return;
        }
        GGa_3 gGa_32 = a2;
        if (!a2.A.J().J((vL)a2.I)) {
            gGa_32.A.D(pua.o);
            return;
        }
        gGa_32.A.D(vRa.d);
    }

    public void J() {
        a.I = null;
    }
}

