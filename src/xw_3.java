/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  NTa
 *  XTa
 *  Ypa
 *  aSa
 *  cQa
 *  hra
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  pua
 *  vRa
 */
import java.util.Random;

public final class xw_3
extends eV {
    private static final double[] m;
    private static final double[] C;
    public double i;
    private static final double[] M;
    public double k;
    private static final double[] j;
    private static final double[] J;
    public double A;
    private int[] I;

    public xw_3() {
        a2(new Random());
        xw_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public final double J(int n2, double d2, double d3) {
        void a2;
        void b2;
        int d4 = n2;
        xw_3 c2 = this;
        return m[d4 &= Ypa.A] * b2 + j[d4] * a2;
    }

    /*
     * WARNING - void declaration
     */
    public final double J(int n2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        int e2 = n2;
        xw_3 d5 = this;
        return C[e2 &= Ypa.A] * c2 + J[e2] * b2 + M[e2] * a2;
    }

    static {
        double[] dArray = new double[ERa.C];
        dArray[uSa.E] = oua.i;
        dArray[vRa.d] = pqa.q;
        dArray[uqa.g] = oua.i;
        dArray[yRa.d] = pqa.q;
        dArray[AQa.P] = oua.i;
        dArray[tTa.h] = pqa.q;
        dArray[uua.p] = oua.i;
        dArray[XTa.W] = pqa.q;
        dArray[Yqa.i] = aSa.V;
        dArray[WOa.fa] = aSa.V;
        dArray[NTa.C] = aSa.V;
        dArray[pPa.f] = aSa.V;
        dArray[lqa.s] = oua.i;
        dArray[uua.s] = aSa.V;
        dArray[hpa.Z] = pqa.q;
        dArray[Ypa.A] = aSa.V;
        C = dArray;
        double[] dArray2 = new double[ERa.C];
        dArray2[uSa.E] = oua.i;
        dArray2[vRa.d] = oua.i;
        dArray2[uqa.g] = pqa.q;
        dArray2[yRa.d] = pqa.q;
        dArray2[AQa.P] = aSa.V;
        dArray2[tTa.h] = aSa.V;
        dArray2[uua.p] = aSa.V;
        dArray2[XTa.W] = aSa.V;
        dArray2[Yqa.i] = oua.i;
        dArray2[WOa.fa] = pqa.q;
        dArray2[NTa.C] = oua.i;
        dArray2[pPa.f] = pqa.q;
        dArray2[lqa.s] = oua.i;
        dArray2[uua.s] = pqa.q;
        dArray2[hpa.Z] = oua.i;
        dArray2[Ypa.A] = pqa.q;
        J = dArray2;
        double[] dArray3 = new double[ERa.C];
        dArray3[uSa.E] = aSa.V;
        dArray3[vRa.d] = aSa.V;
        dArray3[uqa.g] = aSa.V;
        dArray3[yRa.d] = aSa.V;
        dArray3[AQa.P] = oua.i;
        dArray3[tTa.h] = oua.i;
        dArray3[uua.p] = pqa.q;
        dArray3[XTa.W] = pqa.q;
        dArray3[Yqa.i] = oua.i;
        dArray3[WOa.fa] = oua.i;
        dArray3[NTa.C] = pqa.q;
        dArray3[pPa.f] = pqa.q;
        dArray3[lqa.s] = aSa.V;
        dArray3[uua.s] = oua.i;
        dArray3[hpa.Z] = aSa.V;
        dArray3[Ypa.A] = pqa.q;
        M = dArray3;
        double[] dArray4 = new double[ERa.C];
        dArray4[uSa.E] = oua.i;
        dArray4[vRa.d] = pqa.q;
        dArray4[uqa.g] = oua.i;
        dArray4[yRa.d] = pqa.q;
        dArray4[AQa.P] = oua.i;
        dArray4[tTa.h] = pqa.q;
        dArray4[uua.p] = oua.i;
        dArray4[XTa.W] = pqa.q;
        dArray4[Yqa.i] = aSa.V;
        dArray4[WOa.fa] = aSa.V;
        dArray4[NTa.C] = aSa.V;
        dArray4[pPa.f] = aSa.V;
        dArray4[lqa.s] = oua.i;
        dArray4[uua.s] = aSa.V;
        dArray4[hpa.Z] = pqa.q;
        dArray4[Ypa.A] = aSa.V;
        m = dArray4;
        double[] dArray5 = new double[ERa.C];
        dArray5[uSa.E] = aSa.V;
        dArray5[vRa.d] = aSa.V;
        dArray5[uqa.g] = aSa.V;
        dArray5[yRa.d] = aSa.V;
        dArray5[AQa.P] = oua.i;
        dArray5[tTa.h] = oua.i;
        dArray5[uua.p] = pqa.q;
        dArray5[XTa.W] = pqa.q;
        dArray5[Yqa.i] = oua.i;
        dArray5[WOa.fa] = oua.i;
        dArray5[NTa.C] = pqa.q;
        dArray5[pPa.f] = pqa.q;
        dArray5[lqa.s] = aSa.V;
        dArray5[uua.s] = oua.i;
        dArray5[hpa.Z] = aSa.V;
        dArray5[Ypa.A] = pqa.q;
        j = dArray5;
    }

    /*
     * WARNING - void declaration
     */
    public xw_3(Random random) {
        int b2;
        void a2;
        xw_3 xw_32;
        xw_3 xw_33 = xw_32 = this;
        void v1 = a2;
        xw_32.I = new int[cQa.z];
        xw_32.k = v1.nextDouble() * ZSa.o;
        xw_33.i = v1.nextDouble() * ZSa.o;
        xw_33.A = a2.nextDouble() * ZSa.o;
        int n2 = b2 = uSa.E;
        while (n2 < hra.Ja) {
            int n3 = b2++;
            xw_32.I[n3] = n3;
            n2 = b2;
        }
        int n4 = b2 = uSa.E;
        while (n4 < hra.Ja) {
            int n5 = a2.nextInt(hra.Ja - b2) + b2;
            xw_3 xw_34 = xw_32;
            int n6 = xw_34.I[b2];
            xw_34.I[b2] = xw_32.I[n5];
            xw_34.I[n5] = n6;
            int n7 = b2 + hra.Ja;
            int n8 = xw_32.I[b2];
            xw_34.I[n7] = n8;
            n4 = ++b2;
        }
    }

    public final double J(double c2, double b2, double a2) {
        return b2 + c2 * (a2 - b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(double[] dArray, double d2, double d3, double d4, int n2, int n3, int n4, double d5, double d6, double d7, double d8) {
        void k2;
        void b2;
        void h2;
        void e2;
        void d9;
        void j2;
        void g2;
        void a2;
        void f2;
        xw_3 xw_32 = this;
        if (f2 == vRa.d) {
            int n5;
            int n6 = uSa.E;
            int n7 = uSa.E;
            int n8 = uSa.E;
            int n9 = uSa.E;
            double d10 = aSa.V;
            double d11 = aSa.V;
            int n10 = uSa.E;
            double d12 = oua.i / a2;
            int n11 = n5 = uSa.E;
            while (n11 < g2) {
                void var31_30 = j2 + (double)n5 * d9 + xw_32.k;
                int n12 = (int)var31_30;
                if (var31_30 < (double)n12) {
                    --n12;
                }
                int n13 = n12 & osa.Ja;
                void v1 = var31_30 -= (double)n12;
                void var35_35 = var31_30 * var31_30 * var31_30 * (v1 * (v1 * lPa.K - zOa.X) + Wqa.m);
                int n14 = uSa.E;
                while (n14 < e2) {
                    int n15;
                    void var38_39 = h2 + (double)n15 * b2 + xw_32.A;
                    int n16 = (int)var38_39;
                    if (var38_39 < (double)n16) {
                        --n16;
                    }
                    int n17 = n16 & osa.Ja;
                    void v3 = var38_39 -= (double)n16;
                    void var42_45 = var38_39 * var38_39 * var38_39 * (v3 * (v3 * lPa.K - zOa.X) + Wqa.m);
                    void v4 = k2;
                    xw_3 xw_33 = xw_32;
                    n6 = xw_33.I[n13] + uSa.E;
                    n7 = xw_33.I[n6] + n17;
                    n8 = xw_33.I[n13 + vRa.d] + uSa.E;
                    n9 = xw_33.I[n8] + n17;
                    xw_3 xw_34 = xw_32;
                    xw_3 xw_35 = xw_32;
                    d10 = xw_33.J((double)var35_35, xw_34.J(xw_34.I[n7], (double)var31_30, (double)var38_39), xw_35.J(xw_35.I[n9], (double)(var31_30 - oua.i), aSa.V, (double)var38_39));
                    xw_3 xw_36 = xw_32;
                    xw_3 xw_37 = xw_32;
                    d11 = xw_33.J((double)var35_35, xw_36.J(xw_36.I[n7 + vRa.d], (double)var31_30, aSa.V, (double)(var38_39 - oua.i)), xw_37.J(xw_37.I[n9 + vRa.d], (double)(var31_30 - oua.i), aSa.V, (double)(var38_39 - oua.i)));
                    double d13 = xw_33.J((double)var42_45, d10, d11);
                    int n18 = n10++;
                    v4[n18] = v4[n18] + d13 * d12;
                    n14 = ++n15;
                }
                n11 = ++n5;
            }
        } else {
            int n19;
            int n20 = uSa.E;
            double d14 = oua.i / a2;
            int n21 = pua.o;
            int n22 = uSa.E;
            int n23 = uSa.E;
            int n24 = uSa.E;
            int n25 = uSa.E;
            int n26 = uSa.E;
            int n27 = uSa.E;
            double d15 = aSa.V;
            double d16 = aSa.V;
            double d17 = aSa.V;
            double d18 = aSa.V;
            int n28 = n19 = uSa.E;
            while (n28 < g2) {
                void var38_40 = j2 + (double)n19 * d9 + xw_32.k;
                int n29 = (int)var38_40;
                if (var38_40 < (double)n29) {
                    --n29;
                }
                int n30 = n29 & osa.Ja;
                void v12 = var38_40 -= (double)n29;
                void var42_46 = var38_40 * var38_40 * var38_40 * (v12 * (v12 * lPa.K - zOa.X) + Wqa.m);
                int n31 = uSa.E;
                while (n31 < e2) {
                    int n32;
                    void var45_52 = h2 + (double)n32 * b2 + xw_32.A;
                    int l2 = (int)var45_52;
                    if (var45_52 < (double)l2) {
                        --l2;
                    }
                    int n33 = l2 & osa.Ja;
                    void v14 = var45_52 -= (double)l2;
                    a2 = var45_52 * var45_52 * var45_52 * (v14 * (v14 * lPa.K - zOa.X) + Wqa.m);
                    int n34 = l2 = uSa.E;
                    while (n34 < f2) {
                        void c2;
                        void i2;
                        double d19 = i2 + (double)l2 * c2 + xw_32.i;
                        int n35 = (int)d19;
                        if (d19 < (double)n35) {
                            --n35;
                        }
                        int n36 = n35 & osa.Ja;
                        void v16 = d19 -= (double)n35;
                        double d20 = d19 * d19 * d19 * (v16 * (v16 * lPa.K - zOa.X) + Wqa.m);
                        if (l2 == 0 || n36 != n21) {
                            n21 = n36;
                            xw_3 xw_38 = xw_32;
                            n22 = xw_38.I[n30] + n36;
                            n23 = xw_38.I[n22] + n33;
                            n24 = xw_38.I[n22 + vRa.d] + n33;
                            n25 = xw_38.I[n30 + vRa.d] + n36;
                            n26 = xw_38.I[n25] + n33;
                            n27 = xw_38.I[n25 + vRa.d] + n33;
                            xw_3 xw_39 = xw_32;
                            xw_3 xw_310 = xw_32;
                            d15 = xw_38.J((double)var42_46, xw_39.J(xw_39.I[n23], (double)var38_40, d19, (double)var45_52), xw_310.J(xw_310.I[n26], (double)(var38_40 - oua.i), d19, (double)var45_52));
                            xw_3 xw_311 = xw_32;
                            xw_3 xw_312 = xw_32;
                            d16 = xw_38.J((double)var42_46, xw_311.J(xw_311.I[n24], (double)var38_40, d19 - oua.i, (double)var45_52), xw_312.J(xw_312.I[n27], (double)(var38_40 - oua.i), d19 - oua.i, (double)var45_52));
                            xw_3 xw_313 = xw_32;
                            xw_3 xw_314 = xw_32;
                            d17 = xw_38.J((double)var42_46, xw_313.J(xw_313.I[n23 + vRa.d], (double)var38_40, d19, (double)(var45_52 - oua.i)), xw_314.J(xw_314.I[n26 + vRa.d], (double)(var38_40 - oua.i), d19, (double)(var45_52 - oua.i)));
                            xw_3 xw_315 = xw_32;
                            xw_3 xw_316 = xw_32;
                            d18 = xw_38.J((double)var42_46, xw_315.J(xw_315.I[n24 + vRa.d], (double)var38_40, d19 - oua.i, (double)(var45_52 - oua.i)), xw_316.J(xw_316.I[n27 + vRa.d], (double)(var38_40 - oua.i), d19 - oua.i, (double)(var45_52 - oua.i)));
                        }
                        xw_3 xw_317 = xw_32;
                        d19 = xw_317.J(d20, d15, d16);
                        d20 = xw_317.J(d20, d17, d18);
                        d19 = xw_317.J((double)a2, d19, d20);
                        n35 = n20++;
                        void v27 = k2;
                        int n37 = n35;
                        v27[n37] = v27[n37] + d19 * d14;
                        n34 = ++l2;
                    }
                    n31 = ++n32;
                }
                n28 = ++n19;
            }
        }
    }
}

