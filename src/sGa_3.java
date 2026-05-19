/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  gFa
 *  vL
 *  vRa
 *  wra
 *  xfa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sGa_3
extends gFa {
    private xfa k;
    private float j;
    private Gg J;
    private int A;
    private Sx I;

    public void l() {
        sGa_3 a2;
        a2.k.g(vRa.d != 0);
        a2.A = wra.P + a2.k.J().nextInt(wra.P);
    }

    public void f() {
        sGa_3 a2;
        sGa_3 sGa_32 = a2;
        a2.k.J().J(sGa_32.I.la, (double)(a2.I.Z + (double)a2.I.l()), (double)a2.I.A, FRa.Ga, (float)a2.k.F());
        sGa_32.A -= vRa.d;
    }

    public boolean l() {
        sGa_3 a2;
        if (!a2.I.K()) {
            return uSa.E != 0;
        }
        sGa_3 sGa_32 = a2;
        sGa_3 sGa_33 = a2;
        if (sGa_32.k.J((vL)sGa_32.I) > (double)(sGa_33.j * sGa_33.j)) {
            return uSa.E != 0;
        }
        if (a2.A > 0) {
            sGa_3 sGa_34 = a2;
            if (sGa_34.J(sGa_34.I)) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    private boolean J(Sx sx2) {
        Object b2 = sx2;
        sGa_3 a2 = this;
        b2 = ((Sx)((Object)b2)).K.f();
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (!a2.k.ba() && b2.J() == Gea.Ya) {
            return vRa.d != 0;
        }
        return a2.k.f((Mda)b2);
    }

    public boolean f() {
        sGa_3 a2;
        sGa_3 sGa_32 = a2;
        a2.I = a2.J.J((vL)sGa_32.k, (double)a2.j);
        if (sGa_32.I == null) {
            return uSa.E != 0;
        }
        sGa_3 sGa_33 = a2;
        return sGa_33.J(sGa_33.I);
    }

    public void J() {
        sGa_3 a2;
        a2.k.g(uSa.E != 0);
        a2.I = null;
    }

    /*
     * WARNING - void declaration
     */
    public sGa_3(xfa xfa2, float f2) {
        void b2;
        float c2 = f2;
        sGa_3 a2 = this;
        a2.k = b2;
        a2.J = a2.k.j;
        a2.j = c2;
        a2.J(uqa.g);
    }
}

