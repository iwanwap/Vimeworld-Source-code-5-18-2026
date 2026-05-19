/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  FTa
 *  Gg
 *  HA
 *  IEa
 *  LDa
 *  Mda
 *  Qsa
 *  VEa
 *  Vua
 *  Xea
 *  ZRa
 *  bAa
 *  kea
 *  tda
 *  vRa
 *  wra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tda_2
extends Ega {
    private final Sx j;
    public HA J;
    public xFa A;
    public boolean I;

    public void J(HA hA2) {
        tda_2 a2;
        tda_2 b2 = hA2;
        tda_2 tda_22 = a2 = this;
        a2.J.J(uSa.E, bAa.J().J(tda_22.A, (Gg)tda_22.j.j));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, sEa sEa2) {
        void b2;
        Object c2 = sEa2;
        tda_2 a2 = this;
        if (((sEa)c2).J != a2.J && super.J((Mda)b2, (sEa)c2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public tda_2(kea kea2, boolean n2, Sx sx2) {
        void c2;
        void a22;
        int d2 = n2;
        tda_2 b2 = this;
        tda_2 tda_22 = b2;
        b2.A = new xFa(b2, uqa.g, uqa.g);
        tda_22.J = new Xea();
        b2.I = d2;
        b2.j = a22;
        tda_2 tda_23 = b2;
        b2.J((sEa)new LDa(c2.k, tda_23.A, tda_23.J, uSa.E, FTa.A, Qsa.Ha));
        d2 = uSa.E;
        int n3 = d2;
        while (n3 < uqa.g) {
            int n4 = uSa.E;
            while (n4 < uqa.g) {
                tda_2 tda_24 = b2;
                int n5 = a22 + d2 * uqa.g;
                int n6 = ZRa.D + a22 * yOa.B;
                tda_24.J(new sEa(tda_24.A, n5, n6, ITa.E + d2 * yOa.B));
                n4 = ++a22;
            }
            n3 = ++d2;
        }
        int n7 = d2 = uSa.E;
        while (n7 < AQa.P) {
            int a22 = d2;
            tda_2 tda_25 = b2;
            void v9 = c2;
            int n8 = v9.f() - vRa.d - d2;
            int n9 = Yqa.i + d2 * yOa.B;
            tda_25.J((sEa)new IEa((tda)tda_25, (HA)v9, n8, Yqa.i, n9, a22));
            n7 = ++d2;
        }
        int n10 = d2 = uSa.E;
        while (n10 < yRa.d) {
            int n11 = uSa.E;
            while (n11 < WOa.fa) {
                int a22;
                int n12 = a22 + (d2 + vRa.d) * WOa.fa;
                int n13 = Yqa.i + a22 * yOa.B;
                b2.J(new sEa((HA)c2, n12, n13, Vua.J + d2 * yOa.B));
                n11 = ++a22;
            }
            n10 = ++d2;
        }
        int n14 = d2 = uSa.E;
        while (n14 < WOa.fa) {
            int n15 = d2++;
            b2.J(new sEa((HA)c2, n15, Yqa.i + n15 * yOa.B, Fsa.D));
            n14 = d2;
        }
        tda_2 tda_26 = b2;
        tda_26.J(tda_26.A);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2) {
        int b2;
        void a2;
        tda_2 tda_22 = this;
        super.J((Sx)a2);
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            Mda mda2 = tda_22.A.f(b2);
            if (mda2 != null) {
                a2.J(mda2, uSa.E != 0);
            }
            n2 = ++b2;
        }
        tda_22.J.J(uSa.E, (Mda)null);
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        tda_2 a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        tda_2 tda_22 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)tda_22.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            tda_2 tda_23;
            tda_2 tda_24;
            tda_2 c2 = sEa2.J();
            mda2 = c2.J();
            if (a2 == false) {
                if (!tda_22.J((Mda)c2, WOa.fa, wra.e, vRa.d != 0)) {
                    return null;
                }
                sEa2.J((Mda)c2, mda2);
                tda_24 = c2;
            } else {
                if (a2 >= vRa.d && a2 < tTa.h) {
                    if (!tda_22.J((Mda)c2, WOa.fa, wra.e, uSa.E != 0)) {
                        return null;
                    }
                } else if (a2 >= tTa.h && a2 < WOa.fa) {
                    if (!tda_22.J((Mda)c2, WOa.fa, wra.e, uSa.E != 0)) {
                        return null;
                    }
                } else if (mda2.J() instanceof VEa && !((sEa)tda_22.A.get(tTa.h + ((VEa)mda2.J()).j)).J()) {
                    int n3;
                    int n4 = n3 = tTa.h + ((VEa)mda2.J()).j;
                    if (!tda_22.J((Mda)c2, n4, n4 + vRa.d, uSa.E != 0)) {
                        return null;
                    }
                } else if (a2 >= WOa.fa && a2 < Qsa.Ha ? !tda_22.J((Mda)c2, Qsa.Ha, wra.e, uSa.E != 0) : (a2 >= Qsa.Ha && a2 < wra.e ? !tda_22.J((Mda)c2, WOa.fa, Qsa.Ha, uSa.E != 0) : !tda_22.J((Mda)c2, WOa.fa, wra.e, uSa.E != 0))) {
                    return null;
                }
                tda_24 = c2;
            }
            sEa sEa3 = sEa2;
            if (((Mda)tda_24).E == 0) {
                sEa3.J((Mda)null);
                tda_23 = c2;
            } else {
                sEa3.J();
                tda_23 = c2;
            }
            if (((Mda)tda_23).E == mda2.E) {
                return null;
            }
            sEa2.J((Sx)b2, (Mda)c2);
        }
        return mda2;
    }
}

