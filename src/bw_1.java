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
 *  XTa
 *  YSa
 *  Ypa
 *  Yra
 *  Zta
 *  hra
 *  jpa
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  vQa
 *  vRa
 *  wOa
 */
import com.google.common.base.Objects;
import java.util.Random;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class bw_1
extends KU {
    public bw_1() {
        bw_1 a2;
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
        bw_1 bw_12 = object;
        Object object = oz2;
        bw_1 d5 = bw_12;
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
        bw_1 bw_12 = this;
        double d6 = (double)(l3 * ERa.C + Yqa.i);
        double d7 = (double)(k2 * ERa.C + Yqa.i);
        float f5 = JPa.N;
        float f6 = JPa.N;
        Random random = new Random((long)m22);
        if (b2 <= 0) {
            int n7 = n6 = bw_12.range * ERa.C - ERa.C;
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
            if (n6 == 0 && c2 == n8 && f7 > pqa.r && b2 > 0) {
                bw_1 bw_13 = bw_12;
                bw_13.J(random.nextLong(), (int)l3, (int)k2, (oz)j2, (double)i2, (double)h2, (double)g2, random.nextFloat() * MQa.L + MQa.L, (float)(e2 - jpa.f), (float)(d8 / vQa.q), (int)c2, b2, oua.i);
                bw_13.J(random.nextLong(), (int)l3, (int)k2, (oz)j2, (double)i2, (double)h2, (double)g2, random.nextFloat() * MQa.L + MQa.L, (float)(e2 + jpa.f), (float)(d8 / vQa.q), (int)c2, b2, oua.i);
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
                    for (int i3 = n102; n18 == 0 && i3 < n12; ++i3) {
                        int n19 = n17;
                        for (n11 = n15; n19 == 0 && n11 < n16; ++n11) {
                            int n20 = n17;
                            for (int i4 = n14 + vRa.d; n20 == 0 && i4 >= n13 - vRa.d; --i4) {
                                if (i4 >= 0 && i4 < hra.Ja) {
                                    IBlockState iBlockState = j2.J(i3, i4, n11);
                                    if (iBlockState.J() == QFa.jd || iBlockState.J() == QFa.sc) {
                                        n17 = vRa.d;
                                    }
                                    if (i4 != n13 - vRa.d && i3 != n102 && i3 != n12 - vRa.d && n11 != n15 && n11 != n16 - vRa.d) {
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
                        int n21 = n102;
                        while (n21 < n12) {
                            d10 = ((double)(n11 + l3 * ERa.C) + kTa.B - i2) / m22;
                            int n22 = n15;
                            while (n22 < n16) {
                                d11 = ((double)(n102 + k2 * ERa.C) + kTa.B - g2) / m22;
                                n17 = uSa.E;
                                double d16 = d10;
                                double d17 = d11;
                                if (d16 * d16 + d17 * d17 < oua.i) {
                                    int n23 = n14;
                                    while (n23 > n13) {
                                        double d18;
                                        int n24;
                                        d12 = ((double)(n24 - vRa.d) + kTa.B - h2) / d9;
                                        if (d18 > NTa.Ea) {
                                            double d19 = d10;
                                            double d20 = d12;
                                            double d21 = d11;
                                            if (d19 * d19 + d20 * d20 + d21 * d21 < oua.i) {
                                                void v20 = j2;
                                                IBlockState iBlockState = v20.J(n11, n24, n102);
                                                IBlockState iBlockState2 = Objects.firstNonNull(v20.J(n11, n24 + vRa.d, n102), QFa.HF.J());
                                                if (iBlockState.J() == QFa.lf || iBlockState.J() == QFa.uB) {
                                                    n17 = vRa.d;
                                                }
                                                if (bw_12.J(iBlockState, iBlockState2)) {
                                                    if (n24 - vRa.d < NTa.C) {
                                                        j2.J(n11, n24, n102, QFa.bb.J());
                                                    } else {
                                                        j2.J(n11, n24, n102, QFa.HF.J());
                                                        if (iBlockState2.J() == QFa.R) {
                                                            j2.J(n11, n24 + vRa.d, n102, iBlockState2.J(BlockSand.VARIANT) == BlockSand$EnumType.RED_SAND ? QFa.ec.J() : QFa.qC.J());
                                                        }
                                                        if (n17 != 0 && j2.J(n11, n24 - vRa.d, n102).J() == QFa.Bc) {
                                                            zz2.func_181079_c(n11 + l3 * ERa.C, uSa.E, n102 + k2 * ERa.C);
                                                            j2.J(n11, n24 - vRa.d, n102, bw_12.worldObj.J((XF)zz2).M.J().J());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        n23 = --n24;
                                    }
                                }
                                n22 = ++n102;
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
    public boolean J(IBlockState iBlockState, IBlockState iBlockState2) {
        void a2;
        IBlockState c2 = iBlockState;
        bw_1 b2 = this;
        if (c2.J() == QFa.Gd) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.Bc) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.lf) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.MB) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.za) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.qC) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.ec) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.uB) {
            return vRa.d != 0;
        }
        if (c2.J() == QFa.gC) {
            return vRa.d != 0;
        }
        if ((c2.J() == QFa.R || c2.J() == QFa.Q) && a2.J().J() != Material.water) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, int n2, int n3, int n4, int n5, oz oz2) {
        int n6;
        bw_1 bw_12;
        bw_1 bw_13 = bw_12 = this;
        bw_1 bw_14 = bw_12;
        int f2 = bw_13.rand.nextInt(bw_13.rand.nextInt(bw_14.rand.nextInt(Ypa.A) + vRa.d) + vRa.d);
        if (bw_14.rand.nextInt(XTa.W) != 0) {
            f2 = uSa.E;
        }
        int n7 = n6 = uSa.E;
        while (n7 < f2) {
            void a2;
            void b2;
            void c2;
            void d2;
            void e2;
            double d3 = (double)(e2 * ERa.C + bw_12.rand.nextInt(ERa.C));
            bw_1 bw_15 = bw_12;
            double d4 = bw_15.rand.nextInt(bw_15.rand.nextInt(sOa.D) + Yqa.i);
            bw_1 bw_16 = bw_12;
            double d5 = (double)(d2 * ERa.C + bw_16.rand.nextInt(ERa.C));
            int n8 = vRa.d;
            if (bw_16.rand.nextInt(AQa.P) == 0) {
                bw_1 bw_17 = bw_12;
                bw_17.J(bw_17.rand.nextLong(), (int)c2, (int)b2, (oz)a2, d3, d4, d5);
                n8 += bw_12.rand.nextInt(AQa.P);
            }
            int n9 = uSa.E;
            while (n9 < n8) {
                int n10;
                bw_1 bw_18 = bw_12;
                float f3 = bw_18.rand.nextFloat() * pua.j * kta.v;
                float f4 = (bw_18.rand.nextFloat() - MQa.L) * kta.v / Qsa.k;
                float g2 = bw_18.rand.nextFloat() * kta.v + bw_12.rand.nextFloat();
                if (bw_18.rand.nextInt(NTa.C) == 0) {
                    g2 *= bw_12.rand.nextFloat() * bw_12.rand.nextFloat() * vQa.q + pqa.r;
                }
                bw_1 bw_19 = bw_12;
                bw_19.J(bw_19.rand.nextLong(), (int)c2, (int)b2, (oz)a2, d3, d4, d5, g2, f3, f4, uSa.E, uSa.E, oua.i);
                n9 = ++n10;
            }
            n7 = ++n6;
        }
    }
}

