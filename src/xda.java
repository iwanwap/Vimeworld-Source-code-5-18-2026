/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bb
 *  Ega
 *  HA
 *  Jea
 *  LQa
 *  Mda
 *  Qsa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xda
extends Ega {
    private final Jea A;
    private HA I;

    public void J(Sx sx) {
        Sx b2 = sx;
        xda a2 = this;
        Sx sx2 = b2;
        super.J(sx2);
        if (sx2 != null && !b2.j.e) {
            xda xda2 = a2;
            Mda mda2 = xda2.A.J(xda2.A.J());
            if (mda2 != null) {
                b2.J(mda2, uSa.E != 0);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public xda(HA hA2, HA hA3) {
        void b2;
        void a22;
        xda xda2 = this;
        xda2.I = a22;
        xda2.A = new Jea(xda2, (HA)a22, uSa.E, PRa.D, Iqa.M);
        xda2.J((sEa)xda2.A);
        int a22 = Qsa.Ha;
        int n2 = ATa.L;
        int c2 = uSa.E;
        int n3 = c2;
        while (n3 < yRa.d) {
            int n4 = uSa.E;
            while (n4 < WOa.fa) {
                int n5;
                int n6 = n5 + c2 * WOa.fa + WOa.fa;
                int n7 = a22 + n5 * yOa.B;
                xda2.J(new sEa((HA)b2, n6, n7, n2 + c2 * yOa.B));
                n4 = ++n5;
            }
            n3 = ++c2;
        }
        int n8 = c2 = uSa.E;
        while (n8 < WOa.fa) {
            int n9 = c2++;
            xda2.J(new sEa((HA)b2, n9, a22 + n9 * yOa.B, lQa.R + n2));
            n8 = c2;
        }
    }

    public HA J() {
        xda a2;
        return a2.I;
    }

    public boolean J(Sx sx) {
        Object b2 = sx;
        xda a2 = this;
        return a2.I.J((Sx)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx, int n2) {
        void a2;
        xda xda2 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)xda2.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            xda xda3;
            xda xda4;
            xda c2 = sEa2.J();
            mda2 = c2.J();
            if (a2 == false) {
                if (!xda2.J((Mda)c2, vRa.d, LQa.c, vRa.d != 0)) {
                    return null;
                }
                sEa2.J((Mda)c2, mda2);
                xda4 = c2;
            } else {
                if (!xda2.A.J() && xda2.A.J((Mda)c2) && ((Mda)c2).E == vRa.d ? !xda2.J((Mda)c2, uSa.E, vRa.d, uSa.E != 0) : (a2 >= vRa.d && a2 < EPa.O ? !xda2.J((Mda)c2, EPa.O, LQa.c, uSa.E != 0) : (a2 >= EPa.O && a2 < LQa.c ? !xda2.J((Mda)c2, vRa.d, EPa.O, uSa.E != 0) : !xda2.J((Mda)c2, vRa.d, LQa.c, uSa.E != 0)))) {
                    return null;
                }
                xda4 = c2;
            }
            sEa sEa3 = sEa2;
            if (((Mda)xda4).E == 0) {
                sEa3.J((Mda)null);
                xda3 = c2;
            } else {
                sEa3.J();
                xda3 = c2;
            }
            if (((Mda)xda3).E == mda2.E) {
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
        xda a2 = this;
        a2.I.J((int)b2, c2);
    }

    public void f(Bb bb2) {
        xda a2;
        xda b2 = bb2;
        xda xda2 = a2 = this;
        xda xda3 = b2;
        super.f((Bb)xda3);
        xda3.J(xda2, a2.I);
    }
}

