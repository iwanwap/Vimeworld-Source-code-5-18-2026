/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Ega
 *  HA
 *  Mda
 *  QSa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qea_2
extends Ega {
    private int A;
    private HA I;

    /*
     * WARNING - void declaration
     */
    public Qea_2(HA hA2, HA hA3, Sx sx2) {
        void c2;
        int n2;
        int d2;
        void a22;
        void b2;
        Qea_2 qea_2 = this;
        qea_2.I = b2;
        qea_2.A = qea_2.I.f() / WOa.fa;
        b2.f((Sx)a22);
        int a22 = (qea_2.A - AQa.P) * yOa.B;
        int n3 = d2 = uSa.E;
        while (n3 < qea_2.A) {
            int n4 = uSa.E;
            while (n4 < WOa.fa) {
                int n5 = n2 + d2 * WOa.fa;
                int n6 = Yqa.i + n2 * yOa.B;
                qea_2.J(new sEa((HA)b2, n5, n6, yOa.B + d2 * yOa.B));
                n4 = ++n2;
            }
            n3 = ++d2;
        }
        int n7 = d2 = uSa.E;
        while (n7 < yRa.d) {
            int n8 = uSa.E;
            while (n8 < WOa.fa) {
                int n9 = n2 + d2 * WOa.fa + WOa.fa;
                int n10 = Yqa.i + n2 * yOa.B;
                qea_2.J(new sEa((HA)c2, n9, n10, Bsa.E + d2 * yOa.B + a22));
                n8 = ++n2;
            }
            n7 = ++d2;
        }
        int n11 = d2 = uSa.E;
        while (n11 < WOa.fa) {
            int n12 = d2++;
            qea_2.J(new sEa((HA)c2, n12, Yqa.i + n12 * yOa.B, QSa.R + a22));
            n11 = d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        Qea_2 qea_2 = this;
        Mda b2 = null;
        sEa sEa2 = (sEa)qea_2.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            Qea_2 c2 = sEa2.J();
            b2 = c2.J();
            if (a2 < qea_2.A * WOa.fa) {
                Qea_2 qea_22 = qea_2;
                if (!qea_22.J((Mda)c2, qea_2.A * WOa.fa, qea_22.A.size(), vRa.d != 0)) {
                    return null;
                }
            } else if (!qea_2.J((Mda)c2, uSa.E, qea_2.A * WOa.fa, uSa.E != 0)) {
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

    public HA J() {
        Qea_2 a2;
        return a2.I;
    }

    public void J(Sx sx2) {
        Qea_2 a2;
        Object b2 = sx2;
        Qea_2 qea_2 = a2 = this;
        super.J((Sx)((Object)b2));
        qea_2.I.J((Sx)((Object)b2));
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        Qea_2 a2 = this;
        return a2.I.J((Sx)((Object)b2));
    }
}

