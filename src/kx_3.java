/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Qta
 *  XTa
 *  aSa
 *  cQa
 *  hra
 *  lPa
 *  lqa
 *  pPa
 *  pua
 *  uRa
 *  vRa
 */
import java.util.Random;

public final class kx_3 {
    public double C;
    public double i;
    public static final double M;
    private static int[][] k;
    public double j;
    private static final double J;
    private static final double A;
    private int[] I;

    /*
     * WARNING - void declaration
     */
    public void J(double[] dArray, double d2, double d3, int n2, int n3, double d4, double d5, double d6) {
        void d7;
        int n4;
        kx_3 kx_32 = this;
        int n5 = uSa.E;
        int n6 = n4 = uSa.E;
        while (n6 < d7) {
            void e2;
            void b2;
            void f2;
            void var16_13 = (f2 + (double)n4) * b2 + kx_32.i;
            int n7 = uSa.E;
            while (n7 < e2) {
                void a2;
                void h2;
                int n8;
                double d8;
                double d9;
                double d10;
                double d11;
                void v2;
                int n9;
                int n10;
                void c2;
                int n11;
                void g2;
                double d12 = (g2 + (double)n11) * c2 + kx_32.j;
                double d13 = (d12 + var16_13) * A;
                int i2 = kx_3.J((double)(d12 + d13));
                int n12 = kx_3.J((double)(var16_13 + d13));
                d13 = (double)(i2 + n12) * J;
                double d14 = (double)i2 - d13;
                d13 = (double)n12 - d13;
                if ((d12 -= d14) > (d13 = var16_13 - d13)) {
                    n10 = vRa.d;
                    n9 = uSa.E;
                    v2 = d12;
                } else {
                    n10 = uSa.E;
                    n9 = vRa.d;
                    v2 = d12;
                }
                d14 = v2 - (double)n10 + J;
                double d15 = d13 - (double)n9 + J;
                void var32_23 = d12 - oua.i + KPa.y * J;
                double d16 = d13 - oua.i + KPa.y * J;
                kx_3 kx_33 = kx_32;
                int n13 = kx_33.I[(i2 &= osa.Ja) + kx_32.I[n12 &= osa.Ja]] % lqa.s;
                kx_3 kx_34 = kx_32;
                int n14 = kx_33.I[i2 + n10 + kx_34.I[n12 + n9]] % lqa.s;
                i2 = kx_34.I[i2 + vRa.d + kx_32.I[n12 + vRa.d]] % lqa.s;
                void v5 = d12;
                double d17 = d13;
                double d18 = kTa.B - v5 * v5 - d17 * d17;
                if (d11 < aSa.V) {
                    d10 = aSa.V;
                } else {
                    double d19 = d18;
                    d18 = d19 * d19;
                    d10 = d18 * d18 * kx_3.J(k[n13], d12, d13);
                }
                double d20 = d14;
                double d21 = d15;
                d12 = kTa.B - d20 * d20 - d21 * d21;
                if (d9 < aSa.V) {
                    d13 = aSa.V;
                } else {
                    double d22 = d12;
                    d12 = d22 * d22;
                    d13 = d12 * d12 * kx_3.J(k[n14], d14, d15);
                }
                void v13 = var32_23;
                double d23 = d16;
                d12 = kTa.B - v13 * v13 - d23 * d23;
                if (d8 < aSa.V) {
                    d14 = aSa.V;
                    n8 = n5;
                } else {
                    double d24 = d12;
                    d12 = d24 * d24;
                    d14 = d12 * d12 * kx_3.J(k[i2], (double)var32_23, d16);
                    n8 = n5;
                }
                ++n5;
                i2 = n8;
                void v18 = h2;
                int n15 = i2;
                v18[n15] = v18[n15] + Qta.h * (d10 + d13 + d14) * a2;
                n7 = ++n11;
            }
            n6 = ++n4;
        }
    }

    /*
     * WARNING - void declaration
     */
    public double J(double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        void v0;
        int n2;
        int n3;
        double a2;
        double b2;
        kx_3 kx_32 = this;
        double d8 = kTa.B * (M - oua.i);
        d8 = (b2 + a2) * d8;
        int c2 = kx_3.J((double)(b2 + d8));
        int n4 = kx_3.J((double)(a2 + d8));
        d8 = (uRa.I - M) / lPa.K;
        double d9 = (double)(c2 + n4) * d8;
        double d10 = (double)c2 - d9;
        if ((b2 -= d10) > (a2 -= (d9 = (double)n4 - d9))) {
            n3 = vRa.d;
            n2 = uSa.E;
            v0 = b2;
        } else {
            n3 = uSa.E;
            n2 = vRa.d;
            v0 = b2;
        }
        d9 = v0 - (double)n3 + d8;
        d10 = a2 - (double)n2 + d8;
        void var18_11 = b2 - oua.i + KPa.y * d8;
        d8 = a2 - oua.i + KPa.y * d8;
        int n5 = n4 & osa.Ja;
        kx_3 kx_33 = kx_32;
        int n6 = kx_33.I[(c2 &= osa.Ja) + kx_32.I[n5]] % lqa.s;
        kx_3 kx_34 = kx_32;
        int n7 = kx_33.I[c2 + n3 + kx_34.I[n5 + n2]] % lqa.s;
        c2 = kx_34.I[c2 + vRa.d + kx_32.I[n5 + vRa.d]] % lqa.s;
        void v3 = b2;
        void v4 = a2;
        double d11 = kTa.B - v3 * v3 - v4 * v4;
        if (d7 < aSa.V) {
            d6 = aSa.V;
        } else {
            double d12 = d11;
            d11 = d12 * d12;
            d6 = d11 * d11 * kx_3.J(k[n6], b2, a2);
        }
        double d13 = d9;
        double d14 = d10;
        b2 = kTa.B - d13 * d13 - d14 * d14;
        if (d5 < aSa.V) {
            a2 = aSa.V;
        } else {
            double d15 = b2;
            b2 = d15 * d15;
            a2 = b2 * b2 * kx_3.J(k[n7], d9, d10);
        }
        void v11 = var18_11;
        double d16 = d8;
        b2 = kTa.B - v11 * v11 - d16 * d16;
        if (d4 < aSa.V) {
            d9 = aSa.V;
        } else {
            double d17 = b2;
            b2 = d17 * d17;
            d9 = b2 * b2 * kx_3.J(k[c2], (double)var18_11, d8);
        }
        return Qta.h * (d6 + a2 + d9);
    }

    static {
        int[][] nArrayArray = new int[lqa.s][];
        int[] nArray = new int[yRa.d];
        nArray[uSa.E] = vRa.d;
        nArray[vRa.d] = vRa.d;
        nArray[uqa.g] = uSa.E;
        nArrayArray[uSa.E] = nArray;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = pua.o;
        nArray2[vRa.d] = vRa.d;
        nArray2[uqa.g] = uSa.E;
        nArrayArray[vRa.d] = nArray2;
        int[] nArray3 = new int[yRa.d];
        nArray3[uSa.E] = vRa.d;
        nArray3[vRa.d] = pua.o;
        nArray3[uqa.g] = uSa.E;
        nArrayArray[uqa.g] = nArray3;
        int[] nArray4 = new int[yRa.d];
        nArray4[uSa.E] = pua.o;
        nArray4[vRa.d] = pua.o;
        nArray4[uqa.g] = uSa.E;
        nArrayArray[yRa.d] = nArray4;
        int[] nArray5 = new int[yRa.d];
        nArray5[uSa.E] = vRa.d;
        nArray5[vRa.d] = uSa.E;
        nArray5[uqa.g] = vRa.d;
        nArrayArray[AQa.P] = nArray5;
        int[] nArray6 = new int[yRa.d];
        nArray6[uSa.E] = pua.o;
        nArray6[vRa.d] = uSa.E;
        nArray6[uqa.g] = vRa.d;
        nArrayArray[tTa.h] = nArray6;
        int[] nArray7 = new int[yRa.d];
        nArray7[uSa.E] = vRa.d;
        nArray7[vRa.d] = uSa.E;
        nArray7[uqa.g] = pua.o;
        nArrayArray[uua.p] = nArray7;
        int[] nArray8 = new int[yRa.d];
        nArray8[uSa.E] = pua.o;
        nArray8[vRa.d] = uSa.E;
        nArray8[uqa.g] = pua.o;
        nArrayArray[XTa.W] = nArray8;
        int[] nArray9 = new int[yRa.d];
        nArray9[uSa.E] = uSa.E;
        nArray9[vRa.d] = vRa.d;
        nArray9[uqa.g] = vRa.d;
        nArrayArray[Yqa.i] = nArray9;
        int[] nArray10 = new int[yRa.d];
        nArray10[uSa.E] = uSa.E;
        nArray10[vRa.d] = pua.o;
        nArray10[uqa.g] = vRa.d;
        nArrayArray[WOa.fa] = nArray10;
        int[] nArray11 = new int[yRa.d];
        nArray11[uSa.E] = uSa.E;
        nArray11[vRa.d] = vRa.d;
        nArray11[uqa.g] = pua.o;
        nArrayArray[NTa.C] = nArray11;
        int[] nArray12 = new int[yRa.d];
        nArray12[uSa.E] = uSa.E;
        nArray12[vRa.d] = pua.o;
        nArray12[uqa.g] = pua.o;
        nArrayArray[pPa.f] = nArray12;
        k = nArrayArray;
        M = Math.sqrt(uRa.I);
        A = kTa.B * (M - oua.i);
        J = (uRa.I - M) / lPa.K;
    }

    /*
     * WARNING - void declaration
     */
    public kx_3(Random random) {
        int b2;
        void a2;
        kx_3 kx_32;
        kx_3 kx_33 = kx_32 = this;
        void v1 = a2;
        kx_32.I = new int[cQa.z];
        kx_32.j = v1.nextDouble() * ZSa.o;
        kx_33.i = v1.nextDouble() * ZSa.o;
        kx_33.C = a2.nextDouble() * ZSa.o;
        int n2 = b2 = uSa.E;
        while (n2 < hra.Ja) {
            int n3 = b2++;
            kx_32.I[n3] = n3;
            n2 = b2;
        }
        int n4 = b2 = uSa.E;
        while (n4 < hra.Ja) {
            int n5 = a2.nextInt(hra.Ja - b2) + b2;
            kx_3 kx_34 = kx_32;
            int n6 = kx_34.I[b2];
            kx_34.I[b2] = kx_32.I[n5];
            kx_34.I[n5] = n6;
            int n7 = b2 + hra.Ja;
            int n8 = kx_32.I[b2];
            kx_34.I[n7] = n8;
            n4 = ++b2;
        }
    }

    private static int J(double a2) {
        if (a2 > aSa.V) {
            return (int)a2;
        }
        return (int)a2 - vRa.d;
    }

    private static double J(int[] c2, double b2, double a2) {
        return (double)c2[uSa.E] * b2 + (double)c2[vRa.d] * a2;
    }

    public kx_3() {
        a2(new Random());
        kx_3 a2;
    }
}

