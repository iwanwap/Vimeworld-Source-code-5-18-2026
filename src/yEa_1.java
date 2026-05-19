/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bb
 *  Bpa
 *  Dc
 *  Ega
 *  Gg
 *  HA
 *  Mda
 *  Qsa
 *  Vua
 *  kea
 *  lfa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yEa_1
extends Ega {
    private Dc J;
    private lfa A;
    private final Gg I;

    public void J(int n2, int n3) {
        int c2 = n3;
        yEa_1 yEa_12 = this;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        yEa_1 a2 = this;
        if (a2.J.J() == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(HA hA2) {
        yEa_1 a2;
        yEa_1 b2 = hA2;
        yEa_1 yEa_12 = a2 = this;
        yEa_12.A.J();
        super.J((HA)b2);
    }

    public lfa J() {
        yEa_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2) {
        void a2;
        yEa_1 yEa_12;
        yEa_1 yEa_13 = yEa_12 = this;
        super.J((Sx)a2);
        yEa_13.J.l((Sx)null);
        yEa_1 yEa_14 = yEa_12;
        super.J((Sx)a2);
        if (!yEa_14.I.e) {
            yEa_1 b2 = yEa_12.A.f(uSa.E);
            if (b2 != null) {
                a2.J((Mda)b2, uSa.E != 0);
            }
            if ((b2 = yEa_12.A.f(vRa.d)) != null) {
                a2.J((Mda)b2, uSa.E != 0);
            }
        }
    }

    public void f(Bb bb2) {
        yEa_1 b2 = bb2;
        yEa_1 a2 = this;
        super.f((Bb)b2);
    }

    public void J(int n2) {
        int b2 = n2;
        yEa_1 a2 = this;
        a2.A.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        yEa_1 yEa_12 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)yEa_12.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            yEa_1 yEa_13;
            yEa_1 yEa_14;
            yEa_1 c2 = sEa2.J();
            mda2 = c2.J();
            if (a2 == uqa.g) {
                if (!yEa_12.J((Mda)c2, yRa.d, CRa.L, vRa.d != 0)) {
                    return null;
                }
                sEa2.J((Mda)c2, mda2);
                yEa_14 = c2;
            } else {
                if (a2 != false && a2 != vRa.d ? (a2 >= yRa.d && a2 < Fsa.d ? !yEa_12.J((Mda)c2, Fsa.d, CRa.L, uSa.E != 0) : a2 >= Fsa.d && a2 < CRa.L && !yEa_12.J((Mda)c2, yRa.d, Fsa.d, uSa.E != 0)) : !yEa_12.J((Mda)c2, yRa.d, CRa.L, uSa.E != 0)) {
                    return null;
                }
                yEa_14 = c2;
            }
            sEa sEa3 = sEa2;
            if (((Mda)yEa_14).E == 0) {
                sEa3.J((Mda)null);
                yEa_13 = c2;
            } else {
                sEa3.J();
                yEa_13 = c2;
            }
            if (((Mda)yEa_13).E == mda2.E) {
                return null;
            }
            sEa2.J((Sx)b2, (Mda)c2);
        }
        return mda2;
    }

    public void J() {
        yEa_1 a2;
        super.J();
    }

    /*
     * WARNING - void declaration
     */
    public yEa_1(kea kea2, Dc dc2, Gg gg2) {
        void c2;
        void a2;
        yEa_1 b2;
        yEa_1 d22 = dc2;
        yEa_1 yEa_12 = b2 = this;
        yEa_12.J = d22;
        yEa_12.I = a2;
        yEa_12.A = new lfa(c2.k, (Dc)d22);
        b2.J(new sEa((HA)b2.A, uSa.E, Qsa.Ha, Bpa.Z));
        yEa_1 yEa_13 = b2;
        yEa_13.J(new sEa((HA)yEa_13.A, vRa.d, ITa.V, Bpa.Z));
        b2.J(new Nea(c2.k, (Dc)d22, b2.A, uqa.g, sOa.D, Bpa.Z));
        int d22 = uSa.E;
        int n2 = d22;
        while (n2 < yRa.d) {
            int n3 = uSa.E;
            while (n3 < WOa.fa) {
                int n4 = a2 + d22 * WOa.fa + WOa.fa;
                int n5 = Yqa.i + a2 * yOa.B;
                b2.J(new sEa((HA)c2, n4, n5, Vua.J + d22 * yOa.B));
                n3 = ++a2;
            }
            n2 = ++d22;
        }
        int n6 = d22 = uSa.E;
        while (n6 < WOa.fa) {
            int n7 = d22++;
            b2.J(new sEa((HA)c2, n7, Yqa.i + n7 * yOa.B, Fsa.D));
            n6 = d22;
        }
    }
}

