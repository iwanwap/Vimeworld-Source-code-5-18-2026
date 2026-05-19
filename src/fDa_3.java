/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Ega
 *  Gg
 *  HA
 *  LDa
 *  LQa
 *  Mda
 *  NTa
 *  QFa
 *  TQa
 *  Vua
 *  Xea
 *  bAa
 *  kea
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fDa_3
extends Ega {
    private boolean k;
    private XF j;
    public HA J;
    private Gg A;
    public xFa I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        fDa_3 a2 = this;
        if (b2 == false) {
            a2.k = c2 == vRa.d ? vRa.d : uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2) {
        void a2;
        fDa_3 fDa_32;
        fDa_3 fDa_33 = fDa_32 = this;
        super.J((Sx)a2);
        if (!fDa_33.A.e) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < WOa.fa) {
                Mda mda2 = fDa_32.I.f(b2);
                if (mda2 != null) {
                    a2.J(mda2, uSa.E != 0);
                }
                n2 = ++b2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public fDa_3(kea kea2, Gg gg2, XF xF2) {
        void c2;
        void a2;
        fDa_3 d22 = gg2;
        fDa_3 b2 = this;
        fDa_3 fDa_32 = b2;
        b2.I = new xFa(b2, yRa.d, yRa.d);
        fDa_32.J = new Xea();
        b2.A = d22;
        b2.j = a2;
        fDa_3 fDa_33 = b2;
        b2.J((sEa)new LDa(c2.k, fDa_33.I, fDa_33.J, uSa.E, cPa.Ea, TQa.ca));
        int d22 = uSa.E;
        int n2 = d22;
        while (n2 < yRa.d) {
            int n3 = uSa.E;
            while (n3 < yRa.d) {
                fDa_3 fDa_34 = b2;
                int n4 = a2 + d22 * yRa.d;
                int n5 = Fsa.d + a2 * yOa.B;
                fDa_34.J(new sEa(fDa_34.I, n4, n5, yta.Ka + d22 * yOa.B));
                n3 = ++a2;
            }
            n2 = ++d22;
        }
        int n6 = d22 = uSa.E;
        while (n6 < yRa.d) {
            int n7 = uSa.E;
            while (n7 < WOa.fa) {
                int n8 = a2 + d22 * WOa.fa + WOa.fa;
                int n9 = Yqa.i + a2 * yOa.B;
                b2.J(new sEa((HA)c2, n8, n9, Vua.J + d22 * yOa.B));
                n7 = ++a2;
            }
            n6 = ++d22;
        }
        int n10 = d22 = uSa.E;
        while (n10 < WOa.fa) {
            int n11 = d22++;
            b2.J(new sEa((HA)c2, n11, Yqa.i + n11 * yOa.B, Fsa.D));
            n10 = d22;
        }
        fDa_3 fDa_35 = b2;
        fDa_35.J(fDa_35.I);
    }

    public void J(HA hA2) {
        fDa_3 b2 = hA2;
        fDa_3 a2 = this;
        if (a2.k) {
            return;
        }
        fDa_3 fDa_32 = a2;
        a2.J.J(uSa.E, bAa.J().J(fDa_32.I, fDa_32.A));
    }

    public boolean J(Sx sx2) {
        fDa_3 a2;
        Object b2 = sx2;
        fDa_3 fDa_32 = a2 = this;
        if (fDa_32.A.J(fDa_32.j).J() != QFa.IE) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.j.getX() + kTa.B, (double)a2.j.getY() + kTa.B, (double)a2.j.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        fDa_3 fDa_32 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)fDa_32.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            fDa_3 fDa_33;
            fDa_3 fDa_34;
            fDa_3 c2 = sEa2.J();
            mda2 = c2.J();
            if (a2 == false) {
                if (!fDa_32.J((Mda)c2, NTa.C, Bpa.Ha, vRa.d != 0)) {
                    return null;
                }
                sEa2.J((Mda)c2, mda2);
                fDa_34 = c2;
            } else {
                if (a2 >= NTa.C && a2 < LQa.c ? !fDa_32.J((Mda)c2, LQa.c, Bpa.Ha, uSa.E != 0) : (a2 >= LQa.c && a2 < Bpa.Ha ? !fDa_32.J((Mda)c2, NTa.C, LQa.c, uSa.E != 0) : !fDa_32.J((Mda)c2, NTa.C, Bpa.Ha, uSa.E != 0))) {
                    return null;
                }
                fDa_34 = c2;
            }
            sEa sEa3 = sEa2;
            if (((Mda)fDa_34).E == 0) {
                sEa3.J((Mda)null);
                fDa_33 = c2;
            } else {
                sEa3.J();
                fDa_33 = c2;
            }
            if (((Mda)fDa_33).E == mda2.E) {
                return null;
            }
            sEa2.J((Sx)b2, (Mda)c2);
        }
        return mda2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, sEa sEa2) {
        void b2;
        Object c2 = sEa2;
        fDa_3 a2 = this;
        if (((sEa)c2).J != a2.J && super.J((Mda)b2, (sEa)c2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

