/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  aAa
 *  pqa
 *  vL
 *  vRa
 *  yCa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yCa_2 {
    private final aAa[] J;
    private int A;
    private int I;

    public aAa J(int n2) {
        int b2 = n2;
        yCa_2 a2 = this;
        return a2.J[b2];
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Lz lz2) {
        void a2;
        yCa_2 yCa_22 = this;
        yCa_2 b2 = yCa_22.J();
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (((aAa)b2).I == (int)a2.A && ((aAa)b2).k == (int)a2.J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        a.I += vRa.d;
    }

    public void f(int n2) {
        int b2 = n2;
        yCa_2 a2 = this;
        a2.A = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        yCa_2 a2 = this;
        a2.I = b2;
    }

    public yCa_2(aAa[] aAaArray) {
        aAa[] b2 = aAaArray;
        aAa[] a2 = this;
        a2.J = b2;
        a2.A = b2.length;
    }

    public int f() {
        yCa_2 a2;
        return a2.I;
    }

    public aAa J() {
        yCa_2 a2;
        if (a2.A > 0) {
            yCa_2 yCa_22 = a2;
            return yCa_22.J[yCa_22.A - vRa.d];
        }
        return null;
    }

    public boolean J() {
        yCa_2 a2;
        yCa_2 yCa_22 = a2;
        if (yCa_22.I >= yCa_22.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(yCa yCa2) {
        int b2;
        void a2;
        yCa_2 yCa_22 = this;
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (a2.J.length != yCa_22.J.length) {
            return uSa.E != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < yCa_22.J.length) {
            if (yCa_22.J[b2].I != a2.J[b2].I || yCa_22.J[b2].C != a2.J[b2].C || yCa_22.J[b2].k != a2.J[b2].k) {
                return uSa.E != 0;
            }
            n2 = ++b2;
        }
        return vRa.d != 0;
    }

    public Lz J(vL vL2) {
        yCa_2 a2;
        yCa_2 b2 = vL2;
        yCa_2 yCa_22 = a2 = this;
        return yCa_22.J((vL)b2, yCa_22.I);
    }

    public int J() {
        yCa_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public Lz J(vL vL2, int n2) {
        void b2;
        yCa_2 a2;
        int c2 = n2;
        yCa_2 yCa_22 = a2 = this;
        double d2 = (double)yCa_22.J[c2].I + (double)((int)(b2.F + pqa.r)) * kTa.B;
        double d3 = yCa_22.J[c2].C;
        double d4 = (double)yCa_22.J[c2].k + (double)((int)(b2.F + pqa.r)) * kTa.B;
        return new Lz(d2, d3, d4);
    }
}

