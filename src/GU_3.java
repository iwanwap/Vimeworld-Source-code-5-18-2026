/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  jpa
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  vQa
 *  vRa
 *  wOa
 */
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public final class GU_3
extends KU {
    public GU_3() {
        GU_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2, int n2, int n3, oz oz2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Object h2;
        void e2;
        void f2;
        void g2;
        GU_3 gU_3 = object;
        Object object = oz2;
        GU_3 d5 = gU_3;
        d5.J((long)g2, (int)f2, (int)e2, (oz)h2, (double)c2, (double)b2, (double)a2, pqa.r + d5.rand.nextFloat() * lqa.ga, JPa.N, JPa.N, pua.o, pua.o, kTa.B);
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2, int n2, int n3, oz oz2, double d2, double d3, double d4, float f2, float f3, float f4, int n4, int n5, double d5) {
        void c2;
        int n6;
        int b2;
        void m22;
        void k2;
        void l3;
        GU_3 gU_3 = this;
        double d6 = (double)(l3 * ERa.C + Yqa.i);
        double d7 = (double)(k2 * ERa.C + Yqa.i);
        float f5 = JPa.N;
        float f6 = JPa.N;
        Random random = new Random((long)m22);
        if (b2 <= 0) {
            int n7 = n6 = gU_3.range * ERa.C - ERa.C;
            b2 = n7 - random.nextInt(n7 / AQa.P);
        }
        n6 = uSa.E;
        if (c2 == pua.o) {
            c2 = b2 / uqa.g;
            n6 = vRa.d;
        }
        Random random2 = random;
        int n8 = random2.nextInt((int)(b2 / uqa.g)) + b2 / AQa.P;
        int n9 = random2.nextInt(uua.p) == 0 ? vRa.d : uSa.E;
        void v2 = c2;
        while (v2 < b2) {
            void g2;
            void h2;
            void i2;
            void j2;
            void e2;
            void d8;
            void a2;
            void f7;
            double m22 = Bta.c + (double)(Oz.d((float)((float)c2 * pua.j / (float)b2)) * f7 * pqa.r);
            double d9 = m22 * a2;
            float n102 = Oz.C((float)d8);
            float f8 = Oz.d((float)d8);
            i2 += (double)(Oz.C((float)e2) * n102);
            h2 += (double)f8;
            g2 += (double)(Oz.d((float)e2) * n102);
            d8 = (n9 != 0 ? (d8 = d8 * LRa.d) : (d8 = d8 * ZSa.q)) + f6 * Nra.e;
            e2 += f5 * Nra.e;
            f6 *= ATa.r;
            f5 *= wOa.w;
            f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * kta.v;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * YSa.G;
            if (n6 == 0 && c2 == n8 && f7 > pqa.r) {
                GU_3 gU_32 = gU_3;
                gU_32.J(random.nextLong(), (int)l3, (int)k2, (oz)j2, (double)i2, (double)h2, (double)g2, random.nextFloat() * MQa.L + MQa.L, (float)(e2 - jpa.f), (float)(d8 / vQa.q), (int)c2, b2, oua.i);
                gU_32.J(random.nextLong(), (int)l3, (int)k2, (oz)j2, (double)i2, (double)h2, (double)g2, random.nextFloat() * MQa.L + MQa.L, (float)(e2 + jpa.f), (float)(d8 / vQa.q), (int)c2, b2, oua.i);
                return;
            }
            if (n6 != 0 || random.nextInt(AQa.P) != 0) {
                double d10 = i2 - d6;
                double d11 = g2 - d7;
                double d12 = b2 - c2;
                double d13 = (double)(f7 + kta.v + Yra.i);
                void v4 = d10;
                void v5 = d11;
                double d14 = d12;
                double d15 = d13;
                if (v4 * v4 + v5 * v5 - d14 * d14 > d15 * d15) {
                    return;
                }
                if (i2 >= d6 - Zta.ba - m22 * KPa.y && g2 >= d7 - Zta.ba - m22 * KPa.y && i2 <= d6 + Zta.ba + m22 * KPa.y && g2 <= d7 + Zta.ba + m22 * KPa.y) {
                    int n11;
                    int n102 = Oz.f((double)(i2 - m22)) - l3 * ERa.C - vRa.d;
                    int n12 = Oz.f((double)(i2 + m22)) - l3 * ERa.C + vRa.d;
                    int n13 = Oz.f((double)(h2 - d9)) - vRa.d;
                    int n14 = Oz.f((double)(h2 + d9)) + vRa.d;
                    int n15 = Oz.f((double)(g2 - m22)) - k2 * ERa.C - vRa.d;
                    int n16 = Oz.f((double)(g2 + m22)) - k2 * ERa.C + vRa.d;
                    if (n102 < 0) {
                        n102 = uSa.E;
                    }
                    if (n12 > ERa.C) {
                        n12 = ERa.C;
                    }
                    if (n13 < vRa.d) {
                        n13 = vRa.d;
                    }
                    if (n14 > sOa.D) {
                        n14 = sOa.D;
                    }
                    if (n15 < 0) {
                        n15 = uSa.E;
                    }
                    if (n16 > ERa.C) {
                        n16 = ERa.C;
                    }
                    int n17 = uSa.E;
                    int n18 = n17;
                    for (n11 = n102; n18 == 0 && n11 < n12; ++n11) {
                        int n19 = n17;
                        for (int i3 = n15; n19 == 0 && i3 < n16; ++i3) {
                            int n20 = n17;
                            for (int i4 = n14 + vRa.d; n20 == 0 && i4 >= n13 - vRa.d; --i4) {
                                if (i4 >= 0 && i4 < XOa.h) {
                                    IBlockState iBlockState = j2.J(n11, i4, i3);
                                    if (iBlockState.J() == QFa.fA || iBlockState.J() == QFa.bb) {
                                        n17 = vRa.d;
                                    }
                                    if (i4 != n13 - vRa.d && n11 != n102 && n11 != n12 - vRa.d && i3 != n15 && i3 != n16 - vRa.d) {
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
                        int n21 = n11 = n102;
                        while (n21 < n12) {
                            d10 = ((double)(n11 + l3 * ERa.C) + kTa.B - i2) / m22;
                            int n22 = n15;
                            while (n22 < n16) {
                                int n23;
                                d11 = ((double)(n23 + k2 * ERa.C) + kTa.B - g2) / m22;
                                int n24 = n14;
                                while (n24 > n13) {
                                    double d16;
                                    d12 = ((double)(n102 - vRa.d) + kTa.B - h2) / d9;
                                    if (d16 > NTa.Ea) {
                                        IBlockState iBlockState;
                                        double d17 = d10;
                                        double d18 = d12;
                                        double d19 = d11;
                                        if (d17 * d17 + d18 * d18 + d19 * d19 < oua.i && ((iBlockState = j2.J(n11, n102, n23)).J() == QFa.GA || iBlockState.J() == QFa.Bc || iBlockState.J() == QFa.lf)) {
                                            j2.J(n11, n102, n23, QFa.HF.J());
                                        }
                                    }
                                    n24 = --n102;
                                }
                                n22 = ++n23;
                            }
                            n21 = ++n11;
                        }
                        if (n6 != 0) {
                            return;
                        }
                    }
                }
            }
            v2 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, int n2, int n3, int n4, int n5, oz oz2) {
        int n6;
        GU_3 gU_3;
        GU_3 gU_32 = gU_3 = this;
        GU_3 gU_33 = gU_3;
        int f2 = gU_32.rand.nextInt(gU_32.rand.nextInt(gU_33.rand.nextInt(NTa.C) + vRa.d) + vRa.d);
        if (gU_33.rand.nextInt(tTa.h) != 0) {
            f2 = uSa.E;
        }
        int n7 = n6 = uSa.E;
        while (n7 < f2) {
            void a2;
            void b2;
            void c2;
            void d2;
            void e2;
            double d3 = (double)(e2 * ERa.C + gU_3.rand.nextInt(ERa.C));
            double d4 = gU_3.rand.nextInt(XOa.h);
            GU_3 gU_34 = gU_3;
            double d5 = (double)(d2 * ERa.C + gU_34.rand.nextInt(ERa.C));
            int g2 = vRa.d;
            if (gU_34.rand.nextInt(AQa.P) == 0) {
                GU_3 gU_35 = gU_3;
                gU_35.J(gU_35.rand.nextLong(), (int)c2, (int)b2, (oz)a2, d3, d4, d5);
                g2 += gU_3.rand.nextInt(AQa.P);
            }
            int n8 = uSa.E;
            while (n8 < g2) {
                int n9;
                GU_3 gU_36 = gU_3;
                float f3 = gU_36.rand.nextFloat() * pua.j * kta.v;
                float f4 = (gU_36.rand.nextFloat() - MQa.L) * kta.v / Qsa.k;
                float f5 = gU_36.rand.nextFloat() * kta.v + gU_3.rand.nextFloat();
                gU_36.J(gU_36.rand.nextLong(), (int)c2, (int)b2, (oz)a2, d3, d4, d5, f5 * kta.v, f3, f4, uSa.E, uSa.E, kTa.B);
                n8 = ++n9;
            }
            n7 = ++n6;
        }
    }
}

