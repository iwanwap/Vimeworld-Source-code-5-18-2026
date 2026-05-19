/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  ERa
 *  Faa
 *  Gg
 *  Jy
 *  Lqa
 *  NTa
 *  Oz
 *  QFa
 *  Qsa
 *  RQa
 *  aSa
 *  cRa
 *  gc
 *  hd
 *  jsa
 *  nQa
 *  pqa
 *  pua
 *  vRa
 *  ysa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GZ_1
implements hd {
    public double[] f;
    private MV F;
    public double[] g;
    private Gg L;
    private Jy[] E;
    private double[] m;
    public double[] C;
    private MV i;
    public double[] M;
    public MV k;
    public MV j;
    public double[] J;
    private MV A;
    private Random I;

    public void J(Faa faa2, int n2, int n3) {
        int d2 = n3;
        GZ_1 gZ_1 = this;
    }

    /*
     * WARNING - void declaration
     */
    public List<AZ> J(VIa vIa, XF xF) {
        void b2;
        Object c2 = xF;
        GZ_1 a2 = this;
        return a2.L.J((XF)((Object)c2)).J((VIa)b2);
    }

    public int J() {
        return uSa.E;
    }

    public boolean f() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, oz oz2) {
        int b2;
        int c2;
        GZ_1 gZ_1 = this;
        int n4 = uqa.g;
        int d2 = n4 + vRa.d;
        int n5 = Zqa.G;
        int n6 = n4 + vRa.d;
        GZ_1 gZ_12 = gZ_1;
        gZ_12.m = gZ_12.J(gZ_12.m, (int)(c2 * n4), uSa.E, (int)(b2 * n4), d2, n5, n6);
        int n7 = c2 = uSa.E;
        while (n7 < n4) {
            int n8 = uSa.E;
            while (n8 < n4) {
                int n9 = uSa.E;
                while (n9 < fPa.i) {
                    double d3 = VPa.W;
                    GZ_1 gZ_13 = gZ_1;
                    double d4 = gZ_13.m[((c2 + uSa.E) * n6 + b2 + uSa.E) * n5 + d2 + uSa.E];
                    double d5 = gZ_13.m[((c2 + uSa.E) * n6 + b2 + vRa.d) * n5 + d2 + uSa.E];
                    double d6 = gZ_13.m[((c2 + vRa.d) * n6 + b2 + uSa.E) * n5 + d2 + uSa.E];
                    double d7 = gZ_13.m[((c2 + vRa.d) * n6 + b2 + vRa.d) * n5 + d2 + uSa.E];
                    double d8 = (gZ_13.m[((c2 + uSa.E) * n6 + b2 + uSa.E) * n5 + d2 + vRa.d] - d4) * d3;
                    double d9 = (gZ_13.m[((c2 + uSa.E) * n6 + b2 + vRa.d) * n5 + d2 + vRa.d] - d5) * d3;
                    double d10 = (gZ_13.m[((c2 + vRa.d) * n6 + b2 + uSa.E) * n5 + d2 + vRa.d] - d6) * d3;
                    d3 = (gZ_13.m[((c2 + vRa.d) * n6 + b2 + vRa.d) * n5 + d2 + vRa.d] - d7) * d3;
                    int n10 = uSa.E;
                    while (n10 < AQa.P) {
                        int n11;
                        double d11 = fqa.ca;
                        double d12 = d4;
                        double d13 = d5;
                        double d14 = (d6 - d4) * d11;
                        d11 = (d7 - d5) * d11;
                        int n12 = uSa.E;
                        while (n12 < Yqa.i) {
                            int n13;
                            double d15 = fqa.ca;
                            double d16 = d12;
                            d15 = (d13 - d12) * d15;
                            int n14 = uSa.E;
                            while (n14 < Yqa.i) {
                                void a2;
                                int n15;
                                IBlockState iBlockState = null;
                                if (d16 > aSa.V) {
                                    iBlockState = QFa.hd.J();
                                }
                                int n16 = n13 + c2 * Yqa.i;
                                int n17 = n11 + d2 * AQa.P;
                                int n18 = n15 + b2 * Yqa.i;
                                a2.J(n16, n17, n18, iBlockState);
                                d16 += d15;
                                n14 = ++n15;
                            }
                            d12 += d14;
                            d13 += d11;
                            n12 = ++n13;
                        }
                        d4 += d8;
                        d5 += d9;
                        d6 += d10;
                        d7 += d3;
                        n10 = ++n11;
                    }
                    n9 = ++d2;
                }
                n8 = ++b2;
            }
            n7 = ++c2;
        }
    }

    public boolean J(boolean bl, gc gc2) {
        GZ_1 c2 = gc2;
        GZ_1 a2 = this;
        return vRa.d != 0;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        GZ_1 a2 = this;
        return vRa.d != 0;
    }

    public void J() {
    }

    public XF J(Gg gg2, String string, XF xF) {
        Object d2 = xF;
        GZ_1 a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(hd hd2, int n2, int n3) {
        void a2;
        void b2;
        Object d2 = hd2;
        GZ_1 c2 = this;
        BlockFalling.fallInstantly = vRa.d;
        d2 = new XF((int)(b2 * ERa.C), uSa.E, (int)(a2 * ERa.C));
        GZ_1 gZ_1 = c2;
        c2.L.J(((XF)((Object)d2)).add(ERa.C, uSa.E, ERa.C)).J(gZ_1.L, gZ_1.L.v, (XF)((Object)d2));
        BlockFalling.fallInstantly = uSa.E;
    }

    public String J() {
        return Zqa.A;
    }

    /*
     * WARNING - void declaration
     */
    public GZ_1(Gg gg2, long l2) {
        void a2;
        GZ_1 b2;
        GZ_1 c2 = gg2;
        GZ_1 gZ_1 = b2 = this;
        b2.L = c2;
        GZ_1 gZ_12 = b2;
        gZ_1.I = new Random((long)a2);
        gZ_12.i = new MV(b2.I, ERa.C);
        gZ_1.A = new MV(b2.I, ERa.C);
        gZ_1.F = new MV(b2.I, Yqa.i);
        gZ_1.k = new MV(b2.I, NTa.C);
        gZ_1.j = new MV(b2.I, ERa.C);
    }

    /*
     * WARNING - void declaration
     */
    public void J(oz oz2) {
        int n2;
        GZ_1 gZ_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ERa.C) {
            int n4 = uSa.E;
            while (n4 < ERa.C) {
                int n5;
                int n6 = vRa.d;
                int n7 = pua.o;
                IBlockState iBlockState = QFa.hd.J();
                IBlockState iBlockState2 = QFa.hd.J();
                int n8 = cRa.h;
                while (n8 >= 0) {
                    int b2;
                    void a2;
                    IBlockState iBlockState3 = a2.J(n2, b2, n5);
                    if (iBlockState3.J().J() == Material.air) {
                        n7 = pua.o;
                    } else if (iBlockState3.J() == QFa.Gd) {
                        if (n7 == pua.o) {
                            if (n6 <= 0) {
                                iBlockState = QFa.HF.J();
                                iBlockState2 = QFa.hd.J();
                            }
                            n7 = n6;
                            if (b2 >= 0) {
                                a2.J(n2, b2, n5, iBlockState);
                            } else {
                                a2.J(n2, b2, n5, iBlockState2);
                            }
                        } else if (n7 > 0) {
                            --n7;
                            a2.J(n2, b2, n5, iBlockState2);
                        }
                    }
                    n8 = --b2;
                }
                n4 = ++n5;
            }
            n3 = ++n2;
        }
    }

    public Faa J(XF xF) {
        Object b2 = xF;
        GZ_1 a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }

    public boolean J(hd hd2, Faa faa2, int n2, int n3) {
        int n4 = n3;
        GZ_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private double[] J(double[] dArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int e2;
        void d2;
        void f2;
        void a2;
        void b2;
        void c2;
        double[] g2;
        GZ_1 gZ_1 = this;
        if (g2 == null) {
            g2 = new double[c2 * b2 * a2];
        }
        double d3 = RQa.k;
        double d4 = RQa.k;
        GZ_1 gZ_12 = gZ_1;
        gZ_1.f = gZ_1.k.J(gZ_12.f, (int)f2, (int)d2, (int)c2, (int)a2, Lqa.F, Lqa.F, kTa.B);
        gZ_1.M = gZ_12.j.J(gZ_1.M, (int)f2, (int)d2, (int)c2, (int)a2, jsa.Ka, jsa.Ka, kTa.B);
        GZ_1 gZ_13 = gZ_1;
        gZ_1.J = gZ_1.F.J(gZ_13.J, (int)f2, e2, (int)d2, (int)c2, (int)b2, (int)a2, (d3 *= KPa.y) / ERa.t, d4 / nQa.g, d3 / ERa.t);
        double d5 = d3;
        gZ_1.g = gZ_13.i.J(gZ_1.g, (int)f2, e2, (int)d2, (int)c2, (int)b2, (int)a2, d5, d4, d5);
        double d6 = d3;
        gZ_1.C = gZ_1.A.J(gZ_1.C, (int)f2, e2, (int)d2, (int)c2, (int)b2, (int)a2, d6, d4, d6);
        e2 = uSa.E;
        int n9 = n8 = uSa.E;
        while (n9 < c2) {
            int n10 = uSa.E;
            while (n10 < a2) {
                float f3;
                int n11;
                float f4 = (float)(n8 + f2) / pqa.r;
                float h2 = (float)(n11 + d2) / pqa.r;
                float f5 = f4;
                float f6 = h2;
                f4 = QTa.G - Oz.J((float)(f5 * f5 + f6 * f6)) * Qsa.k;
                if (f3 > KSa.z) {
                    f4 = KSa.z;
                }
                if (f4 < pua.Ja) {
                    f4 = pua.Ja;
                }
                int n12 = uSa.E;
                while (n12 < b2) {
                    double d7;
                    d3 = aSa.V;
                    GZ_1 gZ_14 = gZ_1;
                    d4 = gZ_14.g[e2] / PRa.Y;
                    double d8 = gZ_14.C[e2] / PRa.Y;
                    double d9 = (gZ_14.J[e2] / Wqa.m + oua.i) / KPa.y;
                    d3 = (d7 < aSa.V ? (d3 = d4) : (d9 > oua.i ? (d3 = d8) : (d3 = d4 + (d8 - d4) * d9))) - Wqa.Z;
                    d3 += (double)f4;
                    int n13 = uqa.g;
                    if (h2 > b2 / uqa.g - n13) {
                        d4 = (float)(h2 - (b2 / uqa.g - n13)) / EPa.r;
                        d4 = Oz.J((double)d4, (double)aSa.V, (double)oua.i);
                        d3 = d3 * (oua.i - d4) + Fsa.z * d4;
                    }
                    if (h2 < (n13 = Yqa.i)) {
                        d4 = (float)(n13 - h2) / ((float)n13 - pqa.r);
                        d3 = d3 * (oua.i - d4) + tTa.c * d4;
                    }
                    g2[e2++] = d3;
                    n12 = ++h2;
                }
                n10 = ++n11;
            }
            n9 = ++n8;
        }
        return g2;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        void a22;
        void b22;
        GZ_1 gZ_1;
        GZ_1 gZ_12 = gZ_1 = this;
        gZ_12.I.setSeed((long)b22 * ysa.f + (long)a22 * Iqa.a);
        oz c2 = new oz();
        gZ_1.E = gZ_12.L.J().J(gZ_1.E, (int)(b22 * ERa.C), (int)(a22 * ERa.C), ERa.C, ERa.C);
        gZ_12.J((int)b22, (int)a22, c2);
        gZ_12.J(c2);
        Faa b22 = new Faa(gZ_1.L, c2, (int)b22, (int)a22);
        byte[] a22 = b22.J();
        int n4 = c2 = uSa.E;
        while (n4 < a22.length) {
            int n5 = c2++;
            a22[n5] = (byte)gZ_1.E[n5].Ka;
            n4 = c2;
        }
        Faa faa2 = b22;
        faa2.d();
        return faa2;
    }
}

