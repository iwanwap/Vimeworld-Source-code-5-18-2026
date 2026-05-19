/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  HA
 *  Mda
 *  kea
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sda_1
extends Ega {
    private final HA I;

    /*
     * WARNING - void declaration
     */
    public sda_1(kea kea2, HA hA2, Sx sx2) {
        void c2;
        int d2;
        void a22;
        void b2;
        sda_1 sda_12 = this;
        sda_12.I = b2;
        sda_12.I.f((Sx)a22);
        int a22 = cPa.Q;
        int n2 = d2 = uSa.E;
        while (n2 < b2.f()) {
            int n3 = d2++;
            sda_12.J(new sEa((HA)b2, n3, Yqa.D + n3 * yOa.B, kTa.j));
            n2 = d2;
        }
        int n4 = d2 = uSa.E;
        while (n4 < yRa.d) {
            int n5 = uSa.E;
            while (n5 < WOa.fa) {
                int n6 = b2 + d2 * WOa.fa + WOa.fa;
                int n7 = Yqa.i + b2 * yOa.B;
                sda_12.J(new sEa((HA)c2, n6, n7, d2 * yOa.B + a22));
                n5 = ++b2;
            }
            n4 = ++d2;
        }
        int n8 = d2 = uSa.E;
        while (n8 < WOa.fa) {
            int n9 = d2++;
            sda_12.J(new sEa((HA)c2, n9, Yqa.i + n9 * yOa.B, lQa.R + a22));
            n8 = d2;
        }
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        sda_1 a2 = this;
        return a2.I.J((Sx)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        sda_1 sda_12 = this;
        Mda b2 = null;
        sEa sEa2 = (sEa)sda_12.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            sda_1 c2 = sEa2.J();
            b2 = c2.J();
            if (a2 < sda_12.I.f()) {
                sda_1 sda_13 = sda_12;
                if (!sda_13.J((Mda)c2, sda_12.I.f(), sda_13.A.size(), vRa.d != 0)) {
                    return null;
                }
            } else if (!sda_12.J((Mda)c2, uSa.E, sda_12.I.f(), uSa.E != 0)) {
                return null;
            }
            sEa sEa3 = sEa2;
            if (((Mda)c2).E == 0) {
                sEa3.J((Mda)null);
                return b2;
            }
            sEa3.J();
        }
        return b2;
    }

    public void J(Sx sx2) {
        sda_1 a2;
        Object b2 = sx2;
        sda_1 sda_12 = a2 = this;
        super.J((Sx)((Object)b2));
        sda_12.I.J((Sx)((Object)b2));
    }
}

