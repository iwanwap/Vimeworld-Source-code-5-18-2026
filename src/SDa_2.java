/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bb
 *  Bpa
 *  Ega
 *  HA
 *  Mda
 *  TQa
 *  Taa
 *  Vua
 *  Zda
 *  kea
 *  vRa
 */
public final class SDa_2
extends Ega {
    private final HA k;
    private int j;
    private int J;
    private int A;
    private int I;

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        SDa_2 a2 = this;
        return a2.k.J((Sx)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        SDa_2 sDa_2 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)sDa_2.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            SDa_2 sDa_22;
            SDa_2 sDa_23;
            SDa_2 c2 = sEa2.J();
            mda2 = c2.J();
            if (a2 == uqa.g) {
                if (!sDa_2.J((Mda)c2, yRa.d, CRa.L, vRa.d != 0)) {
                    return null;
                }
                sEa2.J((Mda)c2, mda2);
                sDa_23 = c2;
            } else {
                if (a2 != vRa.d && a2 != false ? (Taa.J().J((Mda)c2) != null ? !sDa_2.J((Mda)c2, uSa.E, vRa.d, uSa.E != 0) : (jX.J((Mda)c2) ? !sDa_2.J((Mda)c2, vRa.d, uqa.g, uSa.E != 0) : (a2 >= yRa.d && a2 < Fsa.d ? !sDa_2.J((Mda)c2, Fsa.d, CRa.L, uSa.E != 0) : a2 >= Fsa.d && a2 < CRa.L && !sDa_2.J((Mda)c2, yRa.d, Fsa.d, uSa.E != 0)))) : !sDa_2.J((Mda)c2, yRa.d, CRa.L, uSa.E != 0)) {
                    return null;
                }
                sDa_23 = c2;
            }
            sEa sEa3 = sEa2;
            if (((Mda)sDa_23).E == 0) {
                sEa3.J((Mda)null);
                sDa_22 = c2;
            } else {
                sEa3.J();
                sDa_22 = c2;
            }
            if (((Mda)sDa_22).E == mda2.E) {
                return null;
            }
            sEa2.J((Sx)b2, (Mda)c2);
        }
        return mda2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        SDa_2 a2 = this;
        a2.k.J((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public SDa_2(kea kea2, HA hA2) {
        void b2;
        SDa_2 a2;
        SDa_2 c22 = hA2;
        SDa_2 sDa_2 = a2 = this;
        sDa_2.k = c22;
        SDa_2 sDa_22 = a2;
        sDa_2.J(new sEa((HA)c22, uSa.E, Upa.D, yta.Ka));
        a2.J(new lDa((HA)c22, vRa.d, Upa.D, Bpa.Z));
        a2.J((sEa)new Zda(b2.k, (HA)c22, uqa.g, rQa.s, TQa.ca));
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

    public void J() {
        int n2;
        SDa_2 sDa_2 = this;
        super.J();
        int n3 = n2 = uSa.E;
        while (n3 < sDa_2.I.size()) {
            SDa_2 a2 = (Bb)sDa_2.I.get(n2);
            SDa_2 sDa_22 = sDa_2;
            if (sDa_22.j != sDa_22.k.J(uqa.g)) {
                SDa_2 sDa_23 = sDa_2;
                a2.J(sDa_23, uqa.g, sDa_23.k.J(uqa.g));
            }
            SDa_2 sDa_24 = sDa_2;
            if (sDa_24.I != sDa_24.k.J(uSa.E)) {
                SDa_2 sDa_25 = sDa_2;
                a2.J(sDa_25, uSa.E, sDa_25.k.J(uSa.E));
            }
            SDa_2 sDa_26 = sDa_2;
            if (sDa_26.A != sDa_26.k.J(vRa.d)) {
                SDa_2 sDa_27 = sDa_2;
                a2.J(sDa_27, vRa.d, sDa_27.k.J(vRa.d));
            }
            SDa_2 sDa_28 = sDa_2;
            if (sDa_28.J != sDa_28.k.J(yRa.d)) {
                SDa_2 sDa_29 = sDa_2;
                a2.J(sDa_29, yRa.d, sDa_29.k.J(yRa.d));
            }
            n3 = ++n2;
        }
        SDa_2 sDa_210 = sDa_2;
        sDa_210.j = sDa_210.k.J(uqa.g);
        sDa_210.I = sDa_210.k.J(uSa.E);
        sDa_210.A = sDa_210.k.J(vRa.d);
        sDa_210.J = sDa_210.k.J(yRa.d);
    }

    public void f(Bb bb2) {
        SDa_2 a2;
        SDa_2 b2 = bb2;
        SDa_2 sDa_2 = a2 = this;
        SDa_2 sDa_22 = b2;
        super.f((Bb)sDa_22);
        sDa_22.J(sDa_2, a2.k);
    }
}

