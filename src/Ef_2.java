/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  aSa
 *  pPa
 *  pqa
 *  uRa
 *  vRa
 */
public final class Ef_2
implements K {
    private final double g;
    private final double[] L;
    private final double E;
    private static final double m = 1.0E-7;
    private final double C;
    private static final int i = 4;
    private final double M;
    private final double k;
    private final double j;
    private final double J;
    private static final int A = 11;
    private final double I;

    private double f(double b2, double a2) {
        Ef_2 c2;
        if (b2 < aSa.V) {
            return aSa.V + c2.E * b2;
        }
        if (b2 > oua.i) {
            return oua.i + c2.j * (b2 - oua.i);
        }
        Ef_2 ef_2 = c2;
        return ef_2.f(ef_2.J(b2, a2));
    }

    private double l(double a2) {
        Ef_2 b2;
        return (uRa.I * b2.I * a2 + KPa.y * b2.C) * a2 + b2.M;
    }

    private double f(double a2) {
        Ef_2 b2;
        return ((b2.J * a2 + b2.k) * a2 + b2.g) * a2;
    }

    @Override
    public float J(float f2) {
        float b2 = f2;
        Ef_2 a2 = this;
        return (float)a2.f(b2, Ira.K);
    }

    private double J(double a2) {
        Ef_2 b2;
        return ((b2.I * a2 + b2.C) * a2 + b2.M) * a2;
    }

    /*
     * WARNING - void declaration
     */
    public Ef_2(float f2, float f3, float f4, float f5) {
        void v0;
        void a2;
        void c2;
        void b2;
        float e2 = f2;
        Ef_2 d2 = this;
        d2.L = new double[pPa.f];
        d2.M = uRa.I * (double)e2;
        d2.C = uRa.I * (double)(b2 - e2) - d2.M;
        d2.I = oua.i - d2.M - d2.C;
        d2.g = uRa.I * (double)c2;
        d2.k = uRa.I * (double)(a2 - c2) - d2.g;
        d2.J = oua.i - d2.g - d2.k;
        if (e2 > JPa.N) {
            v0 = b2;
            d2.E = (double)(c2 / e2);
        } else if (c2 == JPa.N && b2 > JPa.N) {
            void v1 = b2;
            v0 = v1;
            d2.E = (double)(a2 / v1);
        } else if (c2 == JPa.N && a2 == JPa.N) {
            v0 = b2;
            d2.E = oua.i;
        } else {
            d2.E = aSa.V;
            v0 = b2;
        }
        d2.j = v0 < pqa.r ? (double)((a2 - pqa.r) / (b2 - pqa.r)) : (a2 == pqa.r && e2 < pqa.r ? (double)((c2 - pqa.r) / (e2 - pqa.r)) : (a2 == pqa.r && c2 == pqa.r ? oua.i : aSa.V));
        double d3 = tpa.k;
        int n2 = e2 = uSa.E;
        while (n2 < pPa.f) {
            int n3 = e2++;
            d2.L[n3] = d2.J((double)n3 * d3);
            n2 = e2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private double J(double d2, double d3) {
        double d4;
        void a2;
        double d5;
        double d6;
        void b2;
        double d7;
        double d8;
        Ef_2 ef_2;
        block10: {
            ef_2 = this;
            d8 = aSa.V;
            d7 = aSa.V;
            d6 = b2;
            d5 = aSa.V;
            double d9 = aSa.V;
            int c2 = uSa.E;
            double d10 = tpa.k;
            int n2 = c2 = vRa.d;
            while (n2 < pPa.f) {
                if (b2 <= ef_2.L[c2]) {
                    d7 = d10 * (double)c2;
                    double d11 = d8 = d7 - d10;
                    d6 = d11 + (d7 - d11) * (b2 - ef_2.L[c2 - vRa.d]) / (ef_2.L[c2] - ef_2.L[c2 - vRa.d]);
                    break;
                }
                n2 = ++c2;
            }
            d10 = Math.min(qQa.P, (double)a2);
            int n3 = c2 = uSa.E;
            while (n3 < AQa.P) {
                double d12;
                double d13;
                d5 = ef_2.J(d6) - b2;
                if (Math.abs(d13) < d10) {
                    return d6;
                }
                d9 = ef_2.l(d6);
                if (Math.abs(d12) < qQa.P) {
                    d4 = d5;
                    break block10;
                }
                d6 -= d5 / d9;
                n3 = ++c2;
            }
            d4 = d5;
        }
        if (Math.abs(d4) < a2) {
            return d6;
        }
        double d14 = d8;
        while (d14 < d7) {
            double d15;
            double d16;
            d5 = ef_2.J(d6);
            if (Math.abs(d16 - b2) < a2) {
                return d6;
            }
            if (b2 > d5) {
                d8 = d6;
                d15 = d7;
            } else {
                d15 = d6;
            }
            d6 = (d15 + d8) * kTa.B;
            d14 = d8;
        }
        return d6;
    }
}

