/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bb
 *  Bpa
 *  Ega
 *  HA
 *  Mda
 *  Vua
 *  bea
 *  jRa
 *  kea
 *  nea
 *  vPa
 *  vRa
 *  wra
 */
public final class bea_3
extends Ega {
    private int J;
    private HA A;
    private final sEa I;

    public void f(Bb bb2) {
        bea_3 a2;
        bea_3 b2 = bb2;
        bea_3 bea_32 = a2 = this;
        bea_3 bea_33 = b2;
        super.f((Bb)bea_33);
        bea_33.J(bea_32, a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        bea_3 a2 = this;
        a2.A.J((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        bea_3 bea_32 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)bea_32.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            bea_3 bea_33;
            bea_3 c2 = sEa2.J();
            mda2 = c2.J();
            if ((a2 < 0 || a2 > uqa.g) && a2 != yRa.d) {
                if (!bea_32.I.J() && bea_32.I.J((Mda)c2) ? !bea_32.J((Mda)c2, yRa.d, AQa.P, uSa.E != 0) : (Tda.f(mda2) ? !bea_32.J((Mda)c2, uSa.E, yRa.d, uSa.E != 0) : (a2 >= AQa.P && a2 < tua.U ? !bea_32.J((Mda)c2, tua.U, wra.P, uSa.E != 0) : (a2 >= tua.U && a2 < wra.P ? !bea_32.J((Mda)c2, AQa.P, tua.U, uSa.E != 0) : !bea_32.J((Mda)c2, AQa.P, wra.P, uSa.E != 0))))) {
                    return null;
                }
            } else {
                if (!bea_32.J((Mda)c2, AQa.P, wra.P, vRa.d != 0)) {
                    return null;
                }
                sEa2.J((Mda)c2, mda2);
            }
            sEa sEa3 = sEa2;
            if (((Mda)c2).E == 0) {
                sEa3.J((Mda)null);
                bea_33 = c2;
            } else {
                sEa3.J();
                bea_33 = c2;
            }
            if (((Mda)bea_33).E == mda2.E) {
                return null;
            }
            sEa2.J((Sx)b2, (Mda)c2);
        }
        return mda2;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        bea_3 a2 = this;
        return a2.A.J((Sx)((Object)b2));
    }

    public void J() {
        int a2;
        bea_3 bea_32 = this;
        super.J();
        int n2 = a2 = uSa.E;
        while (n2 < bea_32.I.size()) {
            Bb bb2 = (Bb)bea_32.I.get(a2);
            bea_3 bea_33 = bea_32;
            if (bea_33.J != bea_33.A.J(uSa.E)) {
                bea_3 bea_34 = bea_32;
                bb2.J((Ega)bea_34, uSa.E, bea_34.A.J(uSa.E));
            }
            n2 = ++a2;
        }
        bea_32.J = bea_32.A.J(uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public bea_3(kea kea2, HA hA2) {
        void b2;
        bea_3 a2;
        bea_3 c22 = hA2;
        bea_3 bea_32 = a2 = this;
        bea_32.A = c22;
        bea_3 bea_33 = a2;
        bea_32.J(new Tda(b2.k, (HA)c22, uSa.E, Upa.D, Bpa.Ha));
        a2.J(new Tda(b2.k, (HA)c22, vRa.d, vPa.Ka, Bpa.Z));
        a2.J(new Tda(b2.k, (HA)c22, uqa.g, jRa.v, Bpa.Ha));
        bea_3 bea_34 = a2;
        bea_34.I = bea_34.J((sEa)new nea((bea)bea_34, (HA)c22, yRa.d, vPa.Ka, yta.Ka));
        int c22 = uSa.E;
        int n2 = c22;
        while (n2 < yRa.d) {
            int n3 = uSa.E;
            while (n3 < WOa.fa) {
                int n4;
                int n5 = n4 + c22 * WOa.fa + WOa.fa;
                int n6 = Yqa.i + n4 * yOa.B;
                a2.J(new sEa((HA)b2, n5, n6, Vua.J + c22 * yOa.B));
                n3 = ++n4;
            }
            n2 = ++c22;
        }
        int n7 = c22 = uSa.E;
        while (n7 < WOa.fa) {
            int n8 = c22++;
            a2.J(new sEa((HA)b2, n8, Yqa.i + n8 * yOa.B, Fsa.D));
            n7 = c22;
        }
    }
}

