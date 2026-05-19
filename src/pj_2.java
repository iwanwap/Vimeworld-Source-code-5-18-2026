/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  ZOa
 *  aSa
 *  bqa
 *  kta
 *  pqa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pj_2 {
    public static double d(double e2, double d2, double c2, double b2, double a2) {
        double d3 = KPa.I * e2 + Bta.c * d2 - Bta.c * c2 + kTa.B * b2;
        b2 = e2 - vqa.c * d2 + KPa.y * c2 - kTa.B * b2;
        c2 = KPa.I * e2 + kTa.B * c2;
        return ((d3 * a2 + b2) * a2 + c2) * a2 + d2;
    }

    public static double C(double e2, double d2, double c2, double b2, double a2) {
        b2 = b2 - c2 - e2 + d2;
        double d3 = e2 - d2 - b2;
        return ((b2 * a2 + d3) * a2 + (c2 -= e2)) * a2 + d2;
    }

    public static double l(double c2, double b2, double a2) {
        c2 = Oz.J((double)c2);
        b2 = Oz.J((double)b2);
        double d2 = c2;
        return pj_2.J(d2, pj_2.J(d2, b2), a2);
    }

    /*
     * WARNING - void declaration
     */
    public static float C(float f2, float f3, float f4, float f5, float f6) {
        float b2;
        float c2;
        void a2;
        float e2 = f3;
        float d2 = f2;
        float f7 = pj_2.C(d2, e2, (float)a2);
        e2 = pj_2.C(e2, c2, (float)a2);
        c2 = pj_2.C(c2, b2, (float)a2);
        b2 = pj_2.C(f7, e2, (float)a2);
        e2 = pj_2.C(e2, c2, (float)a2);
        return pj_2.C(b2, e2, (float)a2);
    }

    public static double J(double b2, double a2) {
        double d2 = b2 - a2;
        if (d2 > kta.Da || d2 < bqa.H) {
            d2 = Math.copySign(ZOa.Ja - Math.abs(d2), d2);
            return b2 + d2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static double J(float f2, float f3, float f4, float f5, float f6) {
        void a2;
        float c2;
        float d2;
        float e2 = f5;
        float b2 = f2;
        b2 = Oz.f((float)b2);
        d2 = Oz.f((float)d2);
        c2 = Oz.f((float)c2);
        e2 = Oz.f((float)e2);
        d2 = pj_2.J(b2, d2);
        c2 = pj_2.J(d2, c2);
        e2 = pj_2.J(c2, e2);
        return pj_2.d(b2, d2, c2, e2, (double)a2);
    }

    public static double l(double e2, double d2, double c2, double b2, double a2) {
        if (e2 < d2 || e2 > a2) {
            return aSa.V;
        }
        if (e2 < c2) {
            return (e2 - d2) / (c2 - d2);
        }
        if (e2 > b2) {
            return oua.i - (e2 - b2) / (a2 - b2);
        }
        return oua.i;
    }

    /*
     * WARNING - void declaration
     */
    public static float C(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        float f5 = a2 = f2;
        return f5 + (b2 - f5) * c2;
    }

    public static double J(double d2, double c2, double b2, double a2) {
        double d3 = b2;
        double d4 = pj_2.f(aSa.V, d2, c2, oua.i, b2);
        double d5 = Math.copySign(Tqa.Ia, b2 - d4);
        while (Math.abs(b2 - d4) > a2) {
            double d6 = d5;
            d4 = pj_2.f(aSa.V, d2, c2, oua.i, d3 += d5);
            if (Math.copySign(d5, b2 - d4) == d6) continue;
            d5 *= Nta.a;
        }
        return d3;
    }

    public static double f(double e2, double d2, double c2, double b2, double a2) {
        double d3 = pj_2.J(e2, d2, a2);
        d2 = pj_2.J(d2, c2, a2);
        c2 = pj_2.J(c2, b2, a2);
        b2 = pj_2.J(d3, d2, a2);
        d2 = pj_2.J(d2, c2, a2);
        return pj_2.J(b2, d2, a2);
    }

    public static double J(double e2, double d2, double c2, double b2, double a2) {
        e2 = Oz.J((double)e2);
        d2 = Oz.J((double)d2);
        c2 = Oz.J((double)c2);
        b2 = Oz.J((double)b2);
        d2 = pj_2.J(e2, d2);
        c2 = pj_2.J(d2, c2);
        b2 = pj_2.J(c2, b2);
        return pj_2.C(e2, d2, c2, b2, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4, float f5) {
        void a2;
        void c2;
        void b2;
        float f6 = f2;
        void var4_5 = b2;
        float f7 = pj_2.C(JPa.N, f6, (float)c2, pqa.r, (float)b2);
        float d2 = Math.copySign(Nra.e, (float)(b2 - f7));
        while (Math.abs((float)(b2 - f7)) > a2) {
            float f8 = d2;
            f7 = pj_2.C(JPa.N, f6, (float)c2, pqa.r, (float)(var4_5 += d2));
            if (Math.copySign(d2, (float)(b2 - f7)) == f8) continue;
            d2 *= lTa.Z;
        }
        return (float)var4_5;
    }

    public static double J(double c2, double b2, float a2) {
        return pj_2.J(c2, b2, (double)a2, Npa.Y);
    }

    /*
     * WARNING - void declaration
     */
    public static float l(float f2, float f3, float f4, float f5, float f6) {
        void a2;
        void d2;
        void c2;
        float e2 = f5;
        float b2 = f2;
        e2 = e2 - c2 - b2 + d2;
        float f7 = b2 - d2 - e2;
        return ((e2 * a2 + f7) * a2 + (c2 -= b2)) * a2 + d2;
    }

    /*
     * WARNING - void declaration
     */
    public static float l(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        return pj_2.J(a2, (float)b2, c2, AQa.f);
    }

    public pj_2() {
        pj_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3) {
        void a2;
        float f4 = f2;
        float b2 = f4 - a2;
        if (b2 > Hra.Ga || b2 < xua.V) {
            b2 = Math.copySign(CRa.ja - Math.abs(b2), b2);
            return f4 + b2;
        }
        return (float)a2;
    }

    /*
     * WARNING - void declaration
     */
    public static float f(float f2, float f3, float f4) {
        void a2;
        float c2 = f3;
        float b2 = f2;
        b2 = Oz.f((float)b2);
        c2 = Oz.f((float)c2);
        float f5 = b2;
        return pj_2.C(f5, pj_2.J(f5, c2), (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static float f(float f2, float f3, float f4, float f5, float f6) {
        void a2;
        float c2;
        float d2;
        float e2 = f5;
        float b2 = f2;
        b2 = Oz.f((float)b2);
        d2 = Oz.f((float)d2);
        c2 = Oz.f((float)c2);
        e2 = Oz.f((float)e2);
        d2 = pj_2.J(b2, d2);
        c2 = pj_2.J(d2, c2);
        e2 = pj_2.J(c2, e2);
        return pj_2.l(b2, d2, c2, e2, (float)a2);
    }

    public static double f(double c2, double b2, double a2) {
        double d2 = a2;
        return pj_2.l(c2, aSa.V, d2, b2 - d2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4, float f5, float f6) {
        void c2;
        void a2;
        void d2;
        float e2 = f5;
        float b2 = f2;
        if (b2 < d2 || b2 > a2) {
            return JPa.N;
        }
        if (b2 < c2) {
            return (b2 - d2) / (c2 - d2);
        }
        if (b2 > e2) {
            return pqa.r - (b2 - e2) / (a2 - e2);
        }
        return pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4) {
        void a2;
        float c2 = f3;
        float b2 = f2;
        void v0 = a2;
        return pj_2.J(b2, JPa.N, (float)v0, c2 - v0, c2);
    }

    public static double J(double c2, double b2, double a2) {
        double d2 = c2;
        return d2 + (b2 - d2) * a2;
    }
}

