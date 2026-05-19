/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  JOa
 *  JTa
 *  Kpa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Qqa
 *  SMa
 *  SOa
 *  Ssa
 *  Uqa
 *  Vda
 *  WSa
 *  Waa
 *  XTa
 *  Ypa
 *  aKa
 *  aSa
 *  bRa
 *  bpa
 *  fsa
 *  hTa
 *  iPa
 *  kPa
 *  lqa
 *  pPa
 *  pqa
 *  pua
 *  qta
 *  ska
 *  vL
 *  vRa
 *  waa
 *  yLa
 */
public final class DNa_1
extends ska {
    private waa k;
    public boolean j;
    private int J;
    private final SMa I;

    /*
     * WARNING - void declaration
     */
    private void J(double d2, double d3, double d4, double d5, double d6, double d7, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        void c2;
        void d8;
        void a2;
        int k2;
        void e2;
        void f2;
        void g2;
        void h2;
        void i2;
        yLa j2;
        boolean bl3 = bl;
        DNa_1 b2 = this;
        yLa yLa2 = j2 = new yLa((Gg)b2.j, (double)j2, (double)i2, (double)h2, (double)g2, (double)f2, (double)e2, b2.I);
        j2.l(KPa.w);
        yLa2.D(k2 != 0);
        yLa2.A((boolean)a2);
        k2 = b2.R.nextInt(((void)d8).length);
        j2.A((int)d8[k2]);
        if (c2 != null && ((void)c2).length > 0) {
            void v1 = c2;
            j2.i((int)v1[b2.R.nextInt(((void)v1).length)]);
        }
        b2.I.J((ska)j2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(double d2, int n2, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        int n3;
        DNa_1 e2;
        int g2 = n2;
        DNa_1 dNa_1 = e2 = this;
        double d3 = dNa_1.la;
        double d4 = dNa_1.Z;
        double d5 = dNa_1.A;
        int n4 = n3 = -g2;
        while (n4 <= g2) {
            int n5 = -g2;
            while (n5 <= g2) {
                int n6;
                int n7 = -g2;
                while (n7 <= g2) {
                    void a2;
                    void b2;
                    void c2;
                    void d6;
                    void f2;
                    int n8;
                    double d7 = (double)n6 + (e2.R.nextDouble() - e2.R.nextDouble()) * kTa.B;
                    double d8 = (double)n3 + (e2.R.nextDouble() - e2.R.nextDouble()) * kTa.B;
                    double d9 = (double)n8 + (e2.R.nextDouble() - e2.R.nextDouble()) * kTa.B;
                    double d10 = d7;
                    double d11 = d8;
                    double d12 = d9;
                    double d13 = (double)Oz.J((double)(d10 * d10 + d11 * d11 + d12 * d12)) / f2 + e2.R.nextGaussian() * fPa.ca;
                    e2.J(d3, d4, d5, d7 / d13, d8 / d13, d9 / d13, (int[])d6, (int[])c2, (boolean)b2, (boolean)a2);
                    if (n3 != -g2 && n3 != g2 && n6 != -g2 && n6 != g2) {
                        n8 += g2 * uqa.g - vRa.d;
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        int e2;
        DNa_1 dNa_1;
        DNa_1 dNa_12 = dNa_1 = this;
        double d2 = dNa_12.R.nextGaussian() * fPa.ca;
        double d3 = dNa_12.R.nextGaussian() * fPa.ca;
        int n2 = e2 = uSa.E;
        while (n2 < NPa.e) {
            void a2;
            void b2;
            void c2;
            void d4;
            DNa_1 dNa_13 = dNa_1;
            double d5 = dNa_13.i * kTa.B + dNa_1.R.nextGaussian() * uSa.W + d2;
            DNa_1 dNa_14 = dNa_1;
            double d6 = dNa_13.f * kTa.B + dNa_14.R.nextGaussian() * uSa.W + d3;
            double d7 = dNa_14.Ea * kTa.B + dNa_1.R.nextDouble() * kTa.B;
            dNa_13.J(dNa_13.la, dNa_1.Z, dNa_1.A, d5, d7, d6, (int[])d4, (int[])c2, (boolean)b2, (boolean)a2);
            n2 = ++e2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(double d2, double[][] dArray, int[] nArray, int[] nArray2, boolean bl, boolean bl2, boolean bl3) {
        int a2;
        void b2;
        void c2;
        void d3;
        void e2;
        void g2;
        void f2;
        DNa_1 dNa_1 = this;
        void v0 = f2;
        void var9_10 = v0[uSa.E][uSa.E];
        void var11_11 = v0[uSa.E][vRa.d];
        DNa_1 dNa_12 = dNa_1;
        dNa_12.J(dNa_12.la, dNa_1.Z, dNa_1.A, (double)(var9_10 * g2), (double)(var11_11 * g2), aSa.V, (int[])e2, (int[])d3, (boolean)c2, (boolean)b2);
        float f3 = dNa_12.R.nextFloat() * pua.j;
        double d4 = a2 != 0 ? Qqa.V : qQa.N;
        int n2 = a2 = uSa.E;
        while (n2 < yRa.d) {
            double d5 = (double)f3 + (double)((float)a2 * pua.j) * d4;
            void var18_17 = var9_10;
            void var20_18 = var11_11;
            int n3 = vRa.d;
            while (n3 < ((void)f2).length) {
                int h2;
                void v4 = f2;
                void var23_19 = v4[h2][uSa.E];
                void var25_20 = v4[h2][vRa.d];
                double d6 = VPa.W;
                while (d6 <= oua.i) {
                    double d7;
                    void v6 = var18_17;
                    void var29_22 = (v6 + (var23_19 - v6) * d7) * g2;
                    void v7 = var20_18;
                    void var31_23 = (v7 + (var25_20 - v7) * d7) * g2;
                    void var33_14 = var29_22 * Math.sin(d5);
                    var29_22 *= Math.cos(d5);
                    double d8 = pqa.q;
                    while (d8 <= oua.i) {
                        double d9;
                        DNa_1 dNa_13 = dNa_1;
                        dNa_13.J(dNa_1.la, dNa_13.Z, dNa_1.A, (double)(var29_22 * d9), (double)var31_23, (double)(var33_14 * d9), (int[])e2, (int[])d3, (boolean)c2, (boolean)b2);
                        d8 = d9 + KPa.y;
                    }
                    d6 = d7 + VPa.W;
                }
                var18_17 = var23_19;
                var20_18 = var25_20;
                n3 = ++h2;
            }
            n2 = ++a2;
        }
    }

    public int J() {
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public DNa_1(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7, SMa sMa2, Waa waa2) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        void h2;
        DNa_1 i2;
        DNa_1 j2 = gg2;
        DNa_1 dNa_1 = i2 = this;
        super((Gg)j2, (double)h2, (double)g2, (double)f2, aSa.V, aSa.V, aSa.V);
        dNa_1.f((double)e2);
        dNa_1.J((double)d8);
        i2.l((double)c2);
        i2.I = b2;
        i2.A = Yqa.i;
        if (a2 != null) {
            i2.k = a2.J(qta.v, NTa.C);
            if (i2.k.J() == 0) {
                i2.k = null;
                return;
            }
            i2.A = i2.k.J() * uqa.g - vRa.d;
            int n2 = j2 = uSa.E;
            while (n2 < i2.k.J()) {
                if (i2.k.J(j2).f(bRa.C)) {
                    i2.j = vRa.d;
                    i2.A += Ypa.A;
                    return;
                }
                n2 = ++j2;
            }
        }
    }

    private boolean l() {
        DNa_1 dNa_1 = this;
        DNa_1 a2 = Kpa.J();
        if (a2 == null || a2.J() == null || a2.J().f(dNa_1.la, dNa_1.Z, dNa_1.A) >= ZSa.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void d() {
        int n2;
        DNa_1 dNa_1 = this;
        if (dNa_1.J == 0 && dNa_1.k != null) {
            DNa_1 dNa_12 = dNa_1;
            n2 = dNa_12.l();
            int n3 = uSa.E;
            if (dNa_12.k.J() >= yRa.d) {
                n3 = vRa.d;
            } else {
                int a22;
                int n4 = a22 = uSa.E;
                while (n4 < dNa_1.k.J()) {
                    Waa waa2 = dNa_1.k.J(a22);
                    if (waa2.J(JTa.Ga) == vRa.d) {
                        n3 = vRa.d;
                        break;
                    }
                    n4 = ++a22;
                }
            }
            Object a22 = new StringBuilder().insert(3 ^ 3, aua.W).append(n3 != 0 ? bpa.c : vTa.s).append(n2 != 0 ? opa.V : Mqa.y).toString();
            DNa_1 dNa_13 = dNa_1;
            dNa_13.j.J(dNa_13.la, dNa_1.Z, dNa_1.A, (String)a22, eta.e, fsa.Ia + dNa_1.R.nextFloat() * Nra.e, vRa.d != 0);
        }
        if (dNa_1.J % uqa.g == 0 && dNa_1.k != null && dNa_1.J / uqa.g < dNa_1.k.J()) {
            int[] nArray;
            DNa_1 dNa_14 = dNa_1;
            n2 = dNa_14.J / uqa.g;
            Waa waa3 = dNa_14.k.J(n2);
            int a22 = waa3.J(JTa.Ga);
            boolean bl = waa3.f(kPa.ja);
            boolean bl2 = waa3.f(bRa.C);
            Object object = waa3.J(Iqa.s);
            int[] nArray2 = waa3.J(WSa.E);
            if (((int[])object).length == 0) {
                int[] nArray3 = new int[vRa.d];
                nArray3[uSa.E] = Vda.I[uSa.E];
                object = nArray3;
            }
            if (a22 == vRa.d) {
                nArray = object;
                dNa_1.J(kTa.B, AQa.P, (int[])object, nArray2, bl, bl2);
            } else if (a22 == uqa.g) {
                double[][] dArrayArray = new double[uua.p][];
                double[] dArray = new double[uqa.g];
                dArray[uSa.E] = aSa.V;
                dArray[vRa.d] = oua.i;
                dArrayArray[uSa.E] = dArray;
                double[] dArray2 = new double[uqa.g];
                dArray2[uSa.E] = Uqa.x;
                dArray2[vRa.d] = iPa.V;
                dArrayArray[vRa.d] = dArray2;
                double[] dArray3 = new double[uqa.g];
                dArray3[uSa.E] = SOa.N;
                dArray3[vRa.d] = iPa.V;
                dArrayArray[uqa.g] = dArray3;
                double[] dArray4 = new double[uqa.g];
                dArray4[uSa.E] = kua.Ga;
                dArray4[vRa.d] = xTa.o;
                dArrayArray[yRa.d] = dArray4;
                double[] dArray5 = new double[uqa.g];
                dArray5[uSa.E] = LPa.b;
                dArray5[vRa.d] = aSa.p;
                dArrayArray[AQa.P] = dArray5;
                double[] dArray6 = new double[uqa.g];
                dArray6[uSa.E] = aSa.V;
                dArray6[vRa.d] = eta.D;
                dArrayArray[tTa.h] = dArray6;
                dNa_1.J(kTa.B, dArrayArray, (int[])object, nArray2, bl, bl2, uSa.E != 0);
                nArray = object;
            } else if (a22 == yRa.d) {
                double[][] dArrayArray = new double[lqa.s][];
                double[] dArray = new double[uqa.g];
                dArray[uSa.E] = aSa.V;
                dArray[vRa.d] = iSa.P;
                dArrayArray[uSa.E] = dArray;
                double[] dArray7 = new double[uqa.g];
                dArray7[uSa.E] = iSa.P;
                dArray7[vRa.d] = iSa.P;
                dArrayArray[vRa.d] = dArray7;
                double[] dArray8 = new double[uqa.g];
                dArray8[uSa.E] = iSa.P;
                dArray8[vRa.d] = oQa.fa;
                dArrayArray[uqa.g] = dArray8;
                double[] dArray9 = new double[uqa.g];
                dArray9[uSa.E] = oQa.fa;
                dArray9[vRa.d] = oQa.fa;
                dArrayArray[yRa.d] = dArray9;
                double[] dArray10 = new double[uqa.g];
                dArray10[uSa.E] = oQa.fa;
                dArray10[vRa.d] = iSa.P;
                dArrayArray[AQa.P] = dArray10;
                double[] dArray11 = new double[uqa.g];
                dArray11[uSa.E] = iSa.P;
                dArray11[vRa.d] = iSa.P;
                dArrayArray[tTa.h] = dArray11;
                double[] dArray12 = new double[uqa.g];
                dArray12[uSa.E] = iSa.P;
                dArray12[vRa.d] = aSa.V;
                dArrayArray[uua.p] = dArray12;
                double[] dArray13 = new double[uqa.g];
                dArray13[uSa.E] = Qqa.b;
                dArray13[vRa.d] = aSa.V;
                dArrayArray[XTa.W] = dArray13;
                double[] dArray14 = new double[uqa.g];
                dArray14[uSa.E] = Qqa.b;
                dArray14[vRa.d] = tTa.Q;
                dArrayArray[Yqa.i] = dArray14;
                double[] dArray15 = new double[uqa.g];
                dArray15[uSa.E] = iSa.P;
                dArray15[vRa.d] = tTa.Q;
                dArrayArray[WOa.fa] = dArray15;
                double[] dArray16 = new double[uqa.g];
                dArray16[uSa.E] = iSa.P;
                dArray16[vRa.d] = Ssa.fa;
                dArrayArray[NTa.C] = dArray16;
                double[] dArray17 = new double[uqa.g];
                dArray17[uSa.E] = aSa.V;
                dArray17[vRa.d] = Ssa.fa;
                dArrayArray[pPa.f] = dArray17;
                dNa_1.J(kTa.B, dArrayArray, (int[])object, nArray2, bl, bl2, vRa.d != 0);
                nArray = object;
            } else if (a22 == AQa.P) {
                nArray = object;
                dNa_1.J((int[])object, nArray2, bl, bl2);
            } else {
                dNa_1.J(VPa.W, uqa.g, (int[])object, nArray2, bl, bl2);
                nArray = object;
            }
            a22 = nArray[uSa.E];
            float f2 = (float)((a22 & Zqa.E) >> ERa.C) / NQa.Y;
            float f3 = (float)((a22 & Uqa.Q) >> Yqa.i) / NQa.Y;
            float a22 = (float)((a22 & osa.Ja) >> uSa.E) / NQa.Y;
            DNa_1 dNa_15 = dNa_1;
            object = new JOa((Gg)dNa_15.j, dNa_15.la, dNa_1.Z, dNa_1.A);
            object.f(f2, f3, a22);
            dNa_1.I.J((ska)object);
        }
        DNa_1 dNa_16 = dNa_1;
        dNa_16.J += vRa.d;
        if (dNa_16.J > dNa_1.A) {
            if (dNa_1.j) {
                n2 = dNa_1.l() ? 1 : 0;
                String string = new StringBuilder().insert(2 & 5, aua.W).append(n2 != 0 ? BQa.ha : hTa.D).toString();
                DNa_1 dNa_17 = dNa_1;
                dNa_17.j.J(dNa_17.la, dNa_1.Z, dNa_1.A, string, eta.e, ATa.r + dNa_1.R.nextFloat() * VPa.i, vRa.d != 0);
            }
            dNa_1.k();
        }
    }

    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f7;
        DNa_1 a2 = this;
    }
}

