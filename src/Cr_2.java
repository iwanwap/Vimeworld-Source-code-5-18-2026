/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  Xr
 *  kta
 *  vQa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cr_2 {
    public static int J(double a2) {
        int n2 = (int)a2;
        if (a2 < (double)n2) {
            return n2 - vRa.d;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public static float C(float f2, float f3, float f4) {
        int n2;
        float f5 = f2;
        f5 = Oz.J((float)f5, (float)JPa.N, (float)wta.q);
        float c2 = JPa.N;
        int n3 = n2 = uSa.E;
        while ((float)n3 < f5) {
            void a2;
            void b2;
            c2 += Xr.J((float)b2, (float)a2);
            n3 = ++n2;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public static float l(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        float f5 = a2 = f2;
        return f5 + (b2 - f5) * c2;
    }

    public static int J(float f2) {
        float f3 = f2;
        int a2 = (int)f3;
        if (f3 < (float)a2) {
            return a2 - vRa.d;
        }
        return a2;
    }

    public static double J(double a2) {
        double d2 = a2;
        return d2 * d2;
    }

    public static float d(float a2) {
        return (float)Math.toRadians(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static float f(float f2, float f3, float f4) {
        void a2;
        float f5;
        float c2 = f3;
        float b2 = f2;
        float f6 = Cr_2.C(b2);
        if (f6 > (c2 = Cr_2.C(c2))) {
            float f7 = f6;
            f6 = c2;
            c2 = f7;
        }
        float f8 = c2 - f6;
        if (f5 > Hra.Ga) {
            return Cr_2.C(c2 + a2 * (CRa.ja - f8));
        }
        return f6 + a2 * f8;
    }

    public static float C(float a2) {
        return ((a2 + Hra.Ga) % CRa.ja + Hra.Ga) % CRa.ja;
    }

    private Cr_2() {
        Cr_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4) {
        int n2;
        void a22;
        void b22;
        float f5 = f2;
        int b22 = Oz.J((float)b22);
        int a22 = Oz.f((float)a22);
        f5 = Oz.J((float)f5, (float)JPa.N, (float)wta.q);
        int c2 = uSa.E;
        int n3 = n2 = uSa.E;
        while ((float)n3 < f5) {
            c2 += Xr.J((int)b22, (int)a22);
            n3 = ++n2;
        }
        return c2;
    }

    public static float l(float a2) {
        float f2 = a2;
        return f2 * f2 * (vQa.q - kta.v * a2);
    }

    public static float f(float a2) {
        float f2 = a2;
        return f2 * f2;
    }

    public static float J(float a2) {
        return (float)Math.toDegrees(a2);
    }
}

