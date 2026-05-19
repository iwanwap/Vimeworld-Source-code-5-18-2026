/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  ERa
 *  Gg
 *  JPa
 *  KU
 *  MQa
 *  NTa
 *  Oz
 *  QFa
 *  Qsa
 *  YSa
 *  Yra
 *  Zta
 *  hra
 *  kta
 *  lPa
 *  pqa
 *  pua
 *  uRa
 *  ura
 *  vRa
 *  vpa
 *  wra
 */
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public final class oV_1
extends KU {
    private float[] I = new float[ura.V];

    public oV_1() {
        oV_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, int n2, int n3, int n4, int n5, oz oz2) {
        int g22 = n3;
        oV_1 d2 = this;
        if (d2.rand.nextInt(vpa.o) == 0) {
            int e2;
            double d3 = (double)(e2 * ERa.C + d2.rand.nextInt(ERa.C));
            oV_1 oV_12 = d2;
            double d4 = oV_12.rand.nextInt(oV_12.rand.nextInt(wra.P) + Yqa.i) + kTa.j;
            double d5 = g22 * ERa.C + d2.rand.nextInt(ERa.C);
            int f2 = vRa.d;
            int n6 = e2 = uSa.E;
            while (n6 < f2) {
                void a2;
                void b2;
                void c2;
                oV_1 oV_13 = d2;
                float g22 = oV_13.rand.nextFloat() * pua.j * kta.v;
                float f3 = (oV_13.rand.nextFloat() - MQa.L) * kta.v / Qsa.k;
                float f4 = (oV_13.rand.nextFloat() * kta.v + d2.rand.nextFloat()) * kta.v;
                oV_13.J(oV_13.rand.nextLong(), (int)c2, (int)b2, (oz)a2, d3, d4, d5, f4, g22, f3, uSa.E, uSa.E, uRa.I);
                n6 = ++e2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2, int n2, int n3, oz oz2, double d2, double d3, double d4, float f2, float f3, float f4, int n4, int n5, double d5) {
        int n6;
        void c2;
        int n7;
        int b2;
        void k2;
        void l3;
        void m22;
        oV_1 oV_12 = this;
        Random random = new Random((long)m22);
        double m22 = (double)(l3 * ERa.C + Yqa.i);
        double d6 = (double)(k2 * ERa.C + Yqa.i);
        float f5 = JPa.N;
        float f6 = JPa.N;
        if (b2 <= 0) {
            int n8 = n7 = oV_12.range * ERa.C - ERa.C;
            b2 = n8 - random.nextInt(n8 / AQa.P);
        }
        n7 = uSa.E;
        if (c2 == pua.o) {
            c2 = b2 / uqa.g;
            n7 = vRa.d;
        }
        float n92 = pqa.r;
        int n10 = n6 = uSa.E;
        while (n10 < hra.Ja) {
            if (n6 == 0 || random.nextInt(yRa.d) == 0) {
                n92 = pqa.r + random.nextFloat() * random.nextFloat() * pqa.r;
            }
            float f7 = n92;
            oV_12.I[n6++] = f7 * f7;
            n10 = n6;
        }
        void v3 = c2;
        while (v3 < b2) {
            void e2;
            void d7;
            void a2;
            void f8;
            double d8 = Bta.c + (double)(Oz.d((float)((float)c2 * pua.j / (float)b2)) * f8 * pqa.r);
            double d9 = d8 * a2;
            d8 *= (double)random.nextFloat() * VPa.W + Bsa.x;
            d9 *= (double)random.nextFloat() * VPa.W + Bsa.x;
            n92 = Oz.C((float)d7);
            float f9 = Oz.d((float)d7);
            i2 += (double)(Oz.C((float)e2) * n92);
            h2 += (double)f9;
            g2 += (double)(Oz.d((float)e2) * n92);
            d7 *= ZSa.q;
            d7 += f6 * Yqa.C;
            e2 += f5 * Yqa.C;
            f6 *= xSa.la;
            f5 *= MQa.L;
            f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * kta.v;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * YSa.G;
            if (n7 != 0 || random.nextInt(AQa.P) != 0) {
                void g2;
                void i2;
                double d10 = i2 - m22;
                double d11 = g2 - d6;
                double d12 = b2 - c2;
                double d13 = (double)(f8 + kta.v + Yra.i);
                void v4 = d10;
                void v5 = d11;
                double d14 = d12;
                double d15 = d13;
                if (v4 * v4 + v5 * v5 - d14 * d14 > d15 * d15) {
                    return;
                }
                if (i2 >= m22 - Zta.ba - d8 * KPa.y && g2 >= d6 - Zta.ba - d8 * KPa.y && i2 <= m22 + Zta.ba + d8 * KPa.y && g2 <= d6 + Zta.ba + d8 * KPa.y) {
                    void j2;
                    int n11;
                    void h2;
                    int n92 = Oz.f((double)(i2 - d8)) - l3 * ERa.C - vRa.d;
                    int n12 = Oz.f((double)(i2 + d8)) - l3 * ERa.C + vRa.d;
                    int n13 = Oz.f((double)(h2 - d9)) - vRa.d;
                    int n14 = Oz.f((double)(h2 + d9)) + vRa.d;
                    int n15 = Oz.f((double)(g2 - d8)) - k2 * ERa.C - vRa.d;
                    int n16 = Oz.f((double)(g2 + d8)) - k2 * ERa.C + vRa.d;
                    if (n92 < 0) {
                        n92 = uSa.E;
                    }
                    if (n12 > ERa.C) {
                        n12 = ERa.C;
                    }
                    if (n13 < vRa.d) {
                        n13 = vRa.d;
                    }
                    if (n14 > Lsa.L) {
                        n14 = Lsa.L;
                    }
                    if (n15 < 0) {
                        n15 = uSa.E;
                    }
                    if (n16 > ERa.C) {
                        n16 = ERa.C;
                    }
                    int n17 = uSa.E;
                    int n18 = n17;
                    for (int i3 = n92; n18 == 0 && i3 < n12; ++i3) {
                        int n19 = n17;
                        for (n11 = n15; n19 == 0 && n11 < n16; ++n11) {
                            int n20 = n17;
                            for (int i4 = n14 + vRa.d; n20 == 0 && i4 >= n13 - vRa.d; --i4) {
                                if (i4 >= 0 && i4 < hra.Ja) {
                                    IBlockState iBlockState = j2.J(i3, i4, n11);
                                    if (iBlockState.J() == QFa.jd || iBlockState.J() == QFa.sc) {
                                        n17 = vRa.d;
                                    }
                                    if (i4 != n13 - vRa.d && i3 != n92 && i3 != n12 - vRa.d && n11 != n15 && n11 != n16 - vRa.d) {
                                        i4 = n13;
                                    }
                                }
                                n20 = n17;
                            }
                            n19 = n17;
                        }
                        n18 = n17;
                    }
                    if (n17 == 0) {
                        zz zz2 = new zz();
                        int n21 = n92;
                        while (n21 < n12) {
                            d10 = ((double)(n11 + l3 * ERa.C) + kTa.B - i2) / d8;
                            int n22 = n15;
                            while (n22 < n16) {
                                d11 = ((double)(n92 + k2 * ERa.C) + kTa.B - g2) / d8;
                                n17 = uSa.E;
                                double d16 = d10;
                                double d17 = d11;
                                if (d16 * d16 + d17 * d17 < oua.i) {
                                    int n23 = n14;
                                    while (n23 > n13) {
                                        int n24;
                                        d12 = ((double)(n24 - vRa.d) + kTa.B - h2) / d9;
                                        double d18 = d10;
                                        double d19 = d11;
                                        double d20 = d12;
                                        if ((d18 * d18 + d19 * d19) * (double)oV_12.I[n24 - vRa.d] + d20 * d20 / lPa.K < oua.i) {
                                            IBlockState iBlockState = j2.J(n11, n24, n92);
                                            if (iBlockState.J() == QFa.lf) {
                                                n17 = vRa.d;
                                            }
                                            if (iBlockState.J() == QFa.Gd || iBlockState.J() == QFa.Bc || iBlockState.J() == QFa.lf) {
                                                if (n24 - vRa.d < NTa.C) {
                                                    j2.J(n11, n24, n92, QFa.fA.J());
                                                } else {
                                                    j2.J(n11, n24, n92, QFa.HF.J());
                                                    if (n17 != 0 && j2.J(n11, n24 - vRa.d, n92).J() == QFa.Bc) {
                                                        zz2.func_181079_c(n11 + l3 * ERa.C, uSa.E, n92 + k2 * ERa.C);
                                                        j2.J(n11, n24 - vRa.d, n92, oV_12.worldObj.J((XF)zz2).M);
                                                    }
                                                }
                                            }
                                        }
                                        n23 = --n24;
                                    }
                                }
                                n22 = ++n92;
                            }
                            n21 = ++n11;
                        }
                        if (n7 != 0) {
                            return;
                        }
                    }
                }
            }
            v3 = ++c2;
        }
    }
}

