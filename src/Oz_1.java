/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  JTa
 *  LQa
 *  Lra
 *  MD
 *  MQa
 *  NQa
 *  NTa
 *  Uqa
 *  Vua
 *  XTa
 *  YSa
 *  Ypa
 *  ZOa
 *  aPa
 *  aSa
 *  bqa
 *  cQa
 *  dQa
 *  fTa
 *  hra
 *  jpa
 *  kta
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  pua
 *  uRa
 *  ura
 *  vPa
 *  vRa
 *  wOa
 *  wPa
 *  yQa
 *  yra
 */
import java.util.Random;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Oz_1 {
    private static final double[] a;
    private static final float[] b;
    public static final float l = (float)Math.PI * 2;
    private static final int e = 4095;
    private static final String G = "CL_00001496";
    private static final float D = 360.0f;
    private static final double f;
    public static final float F;
    private static final int[] g;
    public static final float L = 1.5707964f;
    private static final float[] E;
    private static final int m = 12;
    public static final float C = (float)Math.PI;
    private static final float i = (float)Math.PI * 2;
    public static boolean M;
    private static final float k = 651.8986f;
    private static final int j = 4096;
    private static final double[] J;
    private static final float A = 11.377778f;
    public static final float I = (float)Math.PI / 180;

    public static int f(float f2) {
        float f3 = f2;
        int a2 = (int)f3;
        if (f3 > (float)a2) {
            return a2 + vRa.d;
        }
        return a2;
    }

    public static int C(int a2) {
        int n2 = a2 - vRa.d;
        int n3 = n2 | n2 >> vRa.d;
        int n4 = n3 | n3 >> uqa.g;
        int n5 = n4 | n4 >> AQa.P;
        int n6 = n5 | n5 >> Yqa.i;
        return (n6 | n6 >> ERa.C) + vRa.d;
    }

    public static int C(double a2) {
        return (int)(a2 + yra.Y) - ura.V;
    }

    public static int C(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return (a2 % b2 + b2) % b2;
    }

    public static float d(float a2) {
        if (M) {
            return b[(int)(a2 * Jta.U) & qQa.Fa];
        }
        return E[(int)(a2 * AQa.J) & yQa.j];
    }

    public static int l(double a2) {
        return (int)(a2 >= aSa.V ? a2 : -a2 + oua.i);
    }

    public static int f(double a2) {
        int n2 = (int)a2;
        if (a2 < (double)n2) {
            return n2 - vRa.d;
        }
        return n2;
    }

    private static boolean J(int a2) {
        if (a2 != 0) {
            int n2 = a2;
            if ((n2 & n2 - vRa.d) == 0) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public static double l(double a2) {
        double d2 = a2;
        return d2 - Math.floor(d2);
    }

    public static int J(String string, int n2) {
        int b2 = n2;
        String a2 = string;
        try {
            return Integer.parseInt(a2);
        }
        catch (Throwable throwable) {
            return b2;
        }
    }

    public static double f(double b2, double a2) {
        int n2;
        int n3;
        int n4;
        double d2 = a2;
        double d3 = b2;
        double d4 = d2 * d2 + d3 * d3;
        if (Double.isNaN(d4)) {
            return Jta.u;
        }
        int n5 = n4 = b2 < aSa.V ? vRa.d : uSa.E;
        if (n4 != 0) {
            b2 = -b2;
        }
        int n6 = n3 = a2 < aSa.V ? vRa.d : uSa.E;
        if (n3 != 0) {
            a2 = -a2;
        }
        int n7 = n2 = b2 > a2 ? vRa.d : uSa.E;
        if (n2 != 0) {
            double d5 = a2;
            a2 = b2;
            b2 = d5;
        }
        d4 = Oz_1.f(d4);
        a2 *= d4;
        b2 *= d4;
        d4 = f + b2;
        int n8 = (int)Double.doubleToRawLongBits(d4);
        double d6 = a[n8];
        double d7 = J[n8];
        double d8 = a2 = b2 * d7 - a2 * (d4 -= f);
        a2 = (lPa.K + d8 * d8) * a2 * JTa.n;
        a2 = d6 + a2;
        if (n2 != 0) {
            a2 = fTa.o - a2;
        }
        if (n3 != 0) {
            a2 = lQa.f - a2;
        }
        if (n4 != 0) {
            a2 = -a2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        if (a2 < b2) {
            return (float)b2;
        }
        if (a2 > c2) {
            return c2;
        }
        return a2;
    }

    private static int l(int a2) {
        a2 = Oz_1.J(a2) ? a2 : Oz_1.C(a2);
        return g[(int)((long)a2 * Lsa.G >> Lra.e) & tua.U];
    }

    public static double J(String b2, double a2) {
        try {
            return Double.parseDouble(b2);
        }
        catch (Throwable throwable) {
            return a2;
        }
    }

    public static float C(float a2) {
        if (M) {
            return b[(int)((a2 + jpa.f) * Jta.U) & qQa.Fa];
        }
        return E[(int)(a2 * AQa.J + wPa.b) & yQa.j];
    }

    /*
     * WARNING - void declaration
     */
    public static int f(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        if (a2 < b2) {
            return (int)b2;
        }
        if (a2 > c2) {
            return c2;
        }
        return a2;
    }

    public static int f(int a2) {
        if (a2 >= 0) {
            return a2;
        }
        return -a2;
    }

    public static int J(double a2) {
        int n2 = (int)a2;
        if (a2 > (double)n2) {
            return n2 + vRa.d;
        }
        return n2;
    }

    public static long J(double a2) {
        long l2 = (long)a2;
        if (a2 < (double)l2) {
            return l2 - dQa.Ga;
        }
        return l2;
    }

    public static int J(float f2) {
        float f3 = f2;
        int a2 = (int)f3;
        if (f3 < (float)a2) {
            return a2 - vRa.d;
        }
        return a2;
    }

    public static long J(MD a2) {
        return Oz_1.J(a2.getX(), a2.getY(), a2.getZ());
    }

    public static double J(long[] lArray) {
        int a2;
        long[] lArray2 = lArray;
        long l2 = nqa.i;
        long[] lArray3 = lArray2;
        int n2 = lArray2.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            long l3 = lArray3[a2];
            l2 += l3;
            n3 = ++a2;
        }
        return (double)l2 / (double)lArray2.length;
    }

    public Oz_1() {
        Oz_1 a2;
    }

    public static double l(double c2, double b2, double a2) {
        if (a2 < aSa.V) {
            return c2;
        }
        if (a2 > oua.i) {
            return b2;
        }
        return c2 + (b2 - c2) * a2;
    }

    public static int l(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (a2 < 0) {
            return -((-a2 - vRa.d) / b2) - vRa.d;
        }
        return a2 / b2;
    }

    /*
     * WARNING - void declaration
     */
    public static long J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        long l2 = (long)(a2 * pta.w) ^ (long)c2 * uRa.b ^ (long)b2;
        l2 = l2 * l2 * fta.z + l2 * Jsa.S;
        return l2;
    }

    public static boolean J(float f2, float f3) {
        float b2 = f3;
        float a2 = f2;
        if (Oz_1.l(b2 - a2) < BPa.n) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static float l(float a2) {
        if (a2 >= JPa.N) {
            return a2;
        }
        return -a2;
    }

    public static int f(int n2, int n3) {
        int n4;
        int b2 = n3;
        int a2 = n2;
        if (b2 == 0) {
            return uSa.E;
        }
        if (a2 == 0) {
            return b2;
        }
        if (a2 < 0) {
            b2 *= pua.o;
        }
        if ((n4 = a2 % b2) == 0) {
            return a2;
        }
        return a2 + b2 - n4;
    }

    public static float J(double a2) {
        return (float)Math.sqrt(a2);
    }

    public static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        int n4 = (a2 & Zqa.E) >> ERa.C;
        int n5 = (b2 & Zqa.E) >> ERa.C;
        int n6 = (a2 & Uqa.Q) >> Yqa.i;
        int n7 = (b2 & Uqa.Q) >> Yqa.i;
        int n8 = (a2 & osa.Ja) >> uSa.E;
        b2 = (b2 & osa.Ja) >> uSa.E;
        n4 = (int)((float)n4 * (float)n5 / NQa.Y);
        n5 = (int)((float)n6 * (float)n7 / NQa.Y);
        b2 = (int)((float)n8 * (float)b2 / NQa.Y);
        return a2 & gsa.X | n4 << ERa.C | n5 << Yqa.i | b2;
    }

    public static double f(double c2, double b2, double a2) {
        return (c2 - b2) / (a2 - b2);
    }

    public static int J(int a2) {
        return Oz_1.l(a2) - (Oz_1.J(a2) ? uSa.E : vRa.d);
    }

    public static float f(float a2) {
        float f2;
        a2 %= CRa.ja;
        if (f2 >= Hra.Ga) {
            a2 -= CRa.ja;
        }
        if (a2 < xua.V) {
            a2 += CRa.ja;
        }
        return a2;
    }

    public static double J(Random c2, double b2, double a2) {
        if (b2 >= a2) {
            return b2;
        }
        return c2.nextDouble() * (a2 - b2) + b2;
    }

    public static float J(float a2) {
        return (float)Math.sqrt(a2);
    }

    public static double J(String c2, double b2, double a2) {
        return Math.max(a2, Oz_1.J(c2, b2));
    }

    public static double f(double a2) {
        double d2 = kTa.B * a2;
        long l2 = Double.doubleToRawLongBits(a2);
        l2 = lPa.s - (l2 >> vRa.d);
        a2 = Double.longBitsToDouble(l2);
        a2 *= Bta.c - d2 * a2 * a2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        return ((a2 << Yqa.i) + b2 << Yqa.i) + c2;
    }

    public static double J(double a2) {
        double d2;
        a2 %= ZOa.Ja;
        if (d2 >= kta.Da) {
            a2 -= ZOa.Ja;
        }
        if (a2 < bqa.H) {
            a2 += ZOa.Ja;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(Random random, float f2, float f3) {
        void a2;
        float c2 = f2;
        Random b2 = random;
        if (c2 >= a2) {
            return c2;
        }
        return b2.nextFloat() * (a2 - c2) + c2;
    }

    public static double J(double c2, double b2, double a2) {
        if (c2 < b2) {
            return b2;
        }
        if (c2 > a2) {
            return a2;
        }
        return c2;
    }

    public static double J(double b2, double a2) {
        if (b2 < aSa.V) {
            b2 = -b2;
        }
        if (a2 < aSa.V) {
            a2 = -a2;
        }
        if (b2 > a2) {
            return b2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static int f(float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        void b22;
        void a22;
        float f8 = f2;
        int c22 = (int)(f8 * lqa.ga) % uua.p;
        float f9 = f8 * lqa.ga - (float)c22;
        void var5_10 = a22 * (pqa.r - b22);
        void var6_11 = a22 * (pqa.r - f9 * b22);
        f9 = a22 * (pqa.r - (pqa.r - f9) * b22);
        switch (c22) {
            case 0: {
                float c22 = a22;
                f7 = f9;
                f6 = var5_10;
                f5 = c22;
                break;
            }
            case 1: {
                float c22 = var6_11;
                f7 = a22;
                f6 = var5_10;
                f5 = c22;
                break;
            }
            case 2: {
                float c22 = var5_10;
                f7 = a22;
                f6 = f9;
                f5 = c22;
                break;
            }
            case 3: {
                float c22 = var5_10;
                f7 = var6_11;
                f6 = a22;
                f5 = c22;
                break;
            }
            case 4: {
                float c22 = f9;
                f7 = var5_10;
                f6 = a22;
                f5 = c22;
                break;
            }
            case 5: {
                float c22 = a22;
                f7 = var5_10;
                f6 = var6_11;
                f5 = c22;
                break;
            }
            default: {
                throw new RuntimeException(new StringBuilder().insert(3 ^ 3, hra.k).append(f8).append(TOa.n).append((float)b22).append(TOa.n).append((float)a22).toString());
            }
        }
        int b22 = Oz_1.f((int)(f5 * NQa.Y), uSa.E, osa.Ja);
        int a22 = Oz_1.f((int)(f7 * NQa.Y), uSa.E, osa.Ja);
        int c22 = Oz_1.f((int)(f6 * NQa.Y), uSa.E, osa.Ja);
        return b22 << ERa.C | a22 << Yqa.i | c22;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(String string, int n2, int n3) {
        void b2;
        int c2 = n3;
        String a2 = string;
        return Math.max(c2, Oz_1.J(a2, (int)b2));
    }

    /*
     * WARNING - void declaration
     */
    public static int J(Random random, int n2, int n3) {
        void a2;
        int c2 = n2;
        Random b2 = random;
        if (c2 >= a2) {
            return c2;
        }
        return b2.nextInt((int)(a2 - c2 + vRa.d)) + c2;
    }

    public static UUID J(Random a2) {
        Random random = a2;
        long l2 = random.nextLong() & Ira.X | YSa.n;
        long l3 = random.nextLong() & vsa.Ka | LQa.ha;
        return new UUID(l2, l3);
    }

    static {
        int n2;
        F = Oz_1.J(kta.v);
        b = new float[mPa.H];
        M = uSa.E;
        E = new float[opa.w];
        int n3 = n2 = uSa.E;
        while (n3 < opa.w) {
            int n4 = n2++;
            Oz_1.E[n4] = (float)Math.sin((double)n4 * lQa.f * KPa.y / ura.n);
            n3 = n2;
        }
        int n5 = n2 = uSa.E;
        while (n5 < mPa.H) {
            int n6 = n2++;
            Oz_1.b[n6] = (float)Math.sin(((float)n6 + MQa.L) / fPa.ea * Ypa.Ha);
            n5 = n2;
        }
        int n7 = n2 = uSa.E;
        while (n7 < aPa.Y) {
            int n8 = (int)((float)n2 * jpa.w) & qQa.Fa;
            float f2 = (float)Math.sin((float)n2 * Bua.ga);
            Oz_1.b[n8] = f2;
            n7 = n2 += 90;
        }
        int[] nArray = new int[fPa.i];
        nArray[uSa.E] = uSa.E;
        nArray[vRa.d] = vRa.d;
        nArray[uqa.g] = EPa.O;
        nArray[yRa.d] = uqa.g;
        nArray[AQa.P] = ITa.A;
        nArray[tTa.h] = hpa.Z;
        nArray[uua.p] = osa.c;
        nArray[XTa.W] = yRa.d;
        nArray[Yqa.i] = Fsa.d;
        nArray[WOa.fa] = cQa.o;
        nArray[NTa.C] = kTa.j;
        nArray[pPa.f] = Ypa.A;
        nArray[lqa.s] = kTa.g;
        nArray[uua.s] = yta.Ka;
        nArray[hpa.Z] = AQa.P;
        nArray[Ypa.A] = Yqa.i;
        nArray[ERa.C] = tua.U;
        nArray[yta.Ka] = Lra.e;
        nArray[yOa.B] = uua.s;
        nArray[wOa.t] = AQa.ba;
        nArray[kTa.j] = wOa.h;
        nArray[wOa.h] = wOa.t;
        nArray[cQa.o] = ERa.C;
        nArray[AQa.ba] = XTa.W;
        nArray[osa.c] = ITa.E;
        nArray[kTa.g] = lqa.s;
        nArray[ITa.E] = yOa.B;
        nArray[Lra.e] = uua.p;
        nArray[EPa.O] = pPa.f;
        nArray[ITa.A] = tTa.h;
        nArray[Fsa.d] = NTa.C;
        nArray[tua.U] = WOa.fa;
        g = nArray;
        f = Double.longBitsToDouble(Vua.h);
        a = new double[vPa.S];
        J = new double[vPa.S];
        int n9 = n2 = uSa.E;
        while (n9 < vPa.S) {
            double d2 = Math.asin((double)n2 / ZSa.o);
            Oz_1.J[n2] = Math.cos(d2);
            Oz_1.a[n2++] = d2;
            n9 = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int J(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        return Oz_1.J(Oz_1.J(a2 * NQa.Y), Oz_1.J((float)(b2 * NQa.Y)), Oz_1.J(c2 * NQa.Y));
    }
}

