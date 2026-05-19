/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  MD
 *  Oz
 *  aSa
 *  pPa
 *  pqa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Lz_2 {
    public final double j;
    public final double J;
    public final double A;
    public static final Lz I = new Lz_2(aSa.V, aSa.V, aSa.V);

    public Lz l(double c2, double b2, double a2) {
        Lz_2 d2;
        return d2.f(-c2, -b2, -a2);
    }

    public Lz d(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        return a2.l(b2.A, b2.j, b2.J);
    }

    public Lz f(float f2) {
        float b2 = f2;
        Lz_2 a2 = this;
        float f3 = Oz.C((float)b2);
        b2 = Oz.d((float)b2);
        Lz_2 lz_2 = a2;
        double d2 = lz_2.A;
        Lz_2 lz_22 = a2;
        double d3 = lz_2.j * (double)f3 + lz_22.J * (double)b2;
        double d4 = lz_22.J * (double)f3 - a2.j * (double)b2;
        return new Lz_2(d2, d3, d4);
    }

    public Lz_2(MD mD2) {
        Lz_2 b2 = mD2;
        Lz_2 a2 = this;
        a2(b2.getX(), b2.getY(), b2.getZ());
    }

    /*
     * WARNING - void declaration
     */
    public Lz l(Lz lz2, double d2) {
        void v2;
        void a2;
        Lz_2 c2 = lz2;
        Lz_2 b2 = this;
        Lz_2 lz_2 = c2;
        double d3 = lz_2.A - b2.A;
        double d4 = lz_2.j - b2.j;
        double d5 = lz_2.J - b2.J;
        double d6 = d3;
        if (d6 * d6 < BQa.N) {
            return null;
        }
        a2 = (a2 - b2.A) / d3;
        if (v2 >= aSa.V && a2 <= oua.i) {
            return new Lz_2(b2.A + d3 * a2, b2.j + d4 * a2, b2.J + d5 * a2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Lz f(Lz lz2, double d2) {
        void v2;
        void a2;
        Lz_2 c2 = lz2;
        Lz_2 b2 = this;
        Lz_2 lz_2 = c2;
        double d3 = lz_2.A - b2.A;
        double d4 = lz_2.j - b2.j;
        double d5 = lz_2.J - b2.J;
        double d6 = d4;
        if (d6 * d6 < BQa.N) {
            return null;
        }
        a2 = (a2 - b2.j) / d4;
        if (v2 >= aSa.V && a2 <= oua.i) {
            return new Lz_2(b2.A + d3 * a2, b2.j + d4 * a2, b2.J + d5 * a2);
        }
        return null;
    }

    public Lz f(double c2, double b2, double a2) {
        Lz_2 d2;
        return new Lz_2(d2.A + c2, d2.j + b2, d2.J + a2);
    }

    public double l(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        Lz_2 lz_2 = b2;
        double d2 = lz_2.A - a2.A;
        double d3 = lz_2.j - a2.j;
        double d4 = lz_2.J - a2.J;
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public Lz f() {
        Lz_2 a2;
        return a2.J(pqa.q);
    }

    public Lz_2(double c2, double b2, double a2) {
        Lz_2 d2;
        if (c2 == ITa.P) {
            c2 = aSa.V;
        }
        if (b2 == ITa.P) {
            b2 = aSa.V;
        }
        if (a2 == ITa.P) {
            a2 = aSa.V;
        }
        Lz_2 lz_2 = d2;
        lz_2.A = c2;
        lz_2.j = b2;
        d2.J = a2;
    }

    public Lz J(double c2, double b2, double a2) {
        Lz_2 d2;
        return new Lz_2(d2.A * c2, d2.j * b2, d2.J * a2);
    }

    public Lz C(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        return new Lz_2(a2.j * b2.J - a2.J * b2.j, a2.J * b2.A - a2.A * b2.J, a2.A * b2.j - a2.j * b2.A);
    }

    public String toString() {
        Lz_2 a2;
        return new StringBuilder().insert(3 ^ 3, pPa.k).append(a2.A).append(TOa.n).append(a2.j).append(TOa.n).append(a2.J).append(hpa.b).toString();
    }

    public double J() {
        Lz_2 a2;
        return Oz.J((double)(a2.A * a2.A + a2.j * a2.j + a2.J * a2.J));
    }

    public Lz l(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        return a2.J(b2.A, b2.j, b2.J);
    }

    public Lz f(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        return new Lz_2(b2.A - a2.A, b2.j - a2.j, b2.J - a2.J);
    }

    public double f(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        return a2.A * b2.A + a2.j * b2.j + a2.J * b2.J;
    }

    public double J(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        Lz_2 lz_2 = b2;
        double d2 = lz_2.A - a2.A;
        double d3 = lz_2.j - a2.j;
        double d4 = lz_2.J - a2.J;
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        return Oz.J((double)(d5 * d5 + d6 * d6 + d7 * d7));
    }

    public Lz J(double a2) {
        Lz_2 b2;
        double d2 = a2;
        return b2.J(d2, d2, d2);
    }

    public Lz J(float f2) {
        float b2 = f2;
        Lz_2 a2 = this;
        float f3 = Oz.C((float)b2);
        b2 = Oz.d((float)b2);
        Lz_2 lz_2 = a2;
        Lz_2 lz_22 = a2;
        double d2 = lz_2.A * (double)f3 + lz_22.J * (double)b2;
        double d3 = lz_22.j;
        double d4 = lz_2.J * (double)f3 - a2.A * (double)b2;
        return new Lz_2(d2, d3, d4);
    }

    public Lz J(Lz lz2) {
        Lz_2 b2 = lz2;
        Lz_2 a2 = this;
        return a2.f(b2.A, b2.j, b2.J);
    }

    /*
     * WARNING - void declaration
     */
    public Lz J(Lz lz2, double d2) {
        void v2;
        void a2;
        double d3;
        Lz_2 c2 = lz2;
        Lz_2 b2 = this;
        Lz_2 lz_2 = c2;
        double d4 = lz_2.A - b2.A;
        double d5 = lz_2.j - b2.j;
        double d6 = lz_2.J - b2.J;
        if (d3 * d3 < BQa.N) {
            return null;
        }
        a2 = (a2 - b2.J) / d6;
        if (v2 >= aSa.V && a2 <= oua.i) {
            return new Lz_2(b2.A + d4 * a2, b2.j + d5 * a2, b2.J + d6 * a2);
        }
        return null;
    }

    public Lz J() {
        double d2;
        Lz_2 a2;
        double d3 = Oz.J((double)(a2.A * a2.A + a2.j * a2.j + a2.J * a2.J));
        if (d2 < oQa.Ka) {
            return new Lz_2(aSa.V, aSa.V, aSa.V);
        }
        return new Lz_2(a2.A / d3, a2.j / d3, a2.J / d3);
    }
}

