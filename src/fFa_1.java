/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  HA
 *  Mda
 *  Vua
 *  vRa
 *  wra
 */
public final class fFa_1
extends Ega {
    private HA I;

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        fFa_1 a2 = this;
        return a2.I.J((Sx)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        fFa_1 fFa_12 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)fFa_12.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            fFa_1 fFa_13;
            fFa_1 c2 = sEa2.J();
            mda2 = c2.J();
            if (a2 < WOa.fa ? !fFa_12.J((Mda)c2, WOa.fa, wra.e, vRa.d != 0) : !fFa_12.J((Mda)c2, uSa.E, WOa.fa, uSa.E != 0)) {
                return null;
            }
            sEa sEa3 = sEa2;
            if (((Mda)c2).E == 0) {
                sEa3.J((Mda)null);
                fFa_13 = c2;
            } else {
                sEa3.J();
                fFa_13 = c2;
            }
            if (((Mda)fFa_13).E == mda2.E) {
                return null;
            }
            sEa2.J((Sx)b2, (Mda)c2);
        }
        return mda2;
    }

    /*
     * WARNING - void declaration
     */
    public fFa_1(HA hA2, HA hA3) {
        void b2;
        int n2;
        int c2;
        void a2;
        fFa_1 fFa_12 = this;
        fFa_12.I = a2;
        int n3 = c2 = uSa.E;
        while (n3 < yRa.d) {
            int n4 = uSa.E;
            while (n4 < yRa.d) {
                int n5 = n2 + c2 * yRa.d;
                int n6 = ITa.V + n2 * yOa.B;
                fFa_12.J(new sEa((HA)a2, n5, n6, yta.Ka + c2 * yOa.B));
                n4 = ++n2;
            }
            n3 = ++c2;
        }
        int n7 = c2 = uSa.E;
        while (n7 < yRa.d) {
            int n8 = uSa.E;
            while (n8 < WOa.fa) {
                int n9 = n2 + c2 * WOa.fa + WOa.fa;
                int n10 = Yqa.i + n2 * yOa.B;
                fFa_12.J(new sEa((HA)b2, n9, n10, Vua.J + c2 * yOa.B));
                n8 = ++n2;
            }
            n7 = ++c2;
        }
        int n11 = c2 = uSa.E;
        while (n11 < WOa.fa) {
            int n12 = c2++;
            fFa_12.J(new sEa((HA)b2, n12, Yqa.i + n12 * yOa.B, Fsa.D));
            n11 = c2;
        }
    }
}

