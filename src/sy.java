/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  Baa
 *  ERa
 *  FPa
 *  Faa
 *  GU
 *  Gg
 *  Jy
 *  KU
 *  Kx
 *  NTa
 *  Oz
 *  PW
 *  QFa
 *  RQa
 *  SV
 *  Ssa
 *  Zta
 *  aSa
 *  cRa
 *  gc
 *  hd
 *  hra
 *  jW
 *  lPa
 *  pua
 *  uRa
 *  vQa
 *  vRa
 *  ysa
 */
import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sy
implements hd {
    private final MV x;
    public double[] v;
    private final SV o;
    public double[] h;
    private final Gg K;
    private final MV H;
    public double[] c;
    private final iV B;
    private final Random d;
    private final Kx a;
    private final KU b;
    private double[] l;
    private final yU e;
    private final boolean G;
    public double[] D;
    private double[] f;
    private final XV F;
    private final MV g;
    public double[] L;
    private final Kx E;
    private double[] m;
    private double[] C;
    public final MV i;
    public final MV M;
    private final jW k;
    private final MV j;
    private final sv J;
    private final XV A;
    private final MV I;

    /*
     * WARNING - void declaration
     */
    public sy(Gg gg2, boolean bl, long l2) {
        void a2;
        void b2;
        sy c2;
        sy d2 = gg2;
        sy sy2 = c2 = this;
        sy sy3 = c2;
        c2.l = new double[hra.Ja];
        c2.m = new double[hra.Ja];
        c2.f = new double[hra.Ja];
        sy sy4 = c2;
        c2.J = new sv();
        c2.o = new SV();
        c2.B = new iV();
        c2.k = new PW(QFa.Lb.J(), hpa.Z, (Predicate)BlockHelper.J(QFa.GA));
        c2.E = new Kx((Block)QFa.fA, vRa.d != 0);
        c2.a = new Kx((Block)QFa.fA, uSa.E != 0);
        c2.F = new XV(QFa.vc);
        c2.A = new XV(QFa.TC);
        c2.e = new yU();
        c2.b = new GU();
        sy3.K = d2;
        sy3.G = b2;
        sy2.d = new Random((long)a2);
        c2.g = new MV(c2.d, ERa.C);
        sy2.j = new MV(c2.d, ERa.C);
        sy2.I = new MV(c2.d, Yqa.i);
        sy2.H = new MV(c2.d, AQa.P);
        sy2.x = new MV(c2.d, AQa.P);
        sy2.M = new MV(c2.d, NTa.C);
        sy2.i = new MV(c2.d, ERa.C);
        d2.J(Ssa.u);
    }

    /*
     * WARNING - void declaration
     */
    public List<AZ> J(VIa vIa, XF xF) {
        void b2;
        XF c2 = xF;
        sy a2 = this;
        if (b2 == VIa.MONSTER) {
            if (a2.e.J(c2)) {
                return a2.e.f();
            }
            sy sy2 = a2;
            if (sy2.e.J(sy2.K, c2) && a2.K.J(c2.down()).J() == QFa.Cf) {
                return a2.e.f();
            }
        }
        return a2.K.J(c2).J((VIa)b2);
    }

    public void J() {
    }

    public boolean J(hd hd2, Faa faa2, int n2, int n3) {
        int n4 = n3;
        sy a2 = this;
        return uSa.E != 0;
    }

    public boolean J(boolean bl, gc gc2) {
        sy c2 = gc2;
        sy a2 = this;
        return vRa.d != 0;
    }

    public Faa J(XF xF) {
        Object b2 = xF;
        sy a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }

    public int J() {
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Faa faa2, int n2, int n3) {
        void b2;
        sy a2;
        int d2 = n3;
        sy sy2 = a2 = this;
        a2.e.J(sy2, sy2.K, (int)b2, d2, null);
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        int n4;
        void b22;
        sy a2;
        int c22 = n3;
        sy sy2 = a2 = this;
        sy2.d.setSeed((long)b22 * ysa.f + (long)c22 * Iqa.a);
        oz oz2 = new oz();
        sy2.f((int)b22, c22, oz2);
        sy2.J((int)b22, c22, oz2);
        sy sy3 = a2;
        sy2.b.J((hd)sy3, sy3.K, (int)b22, c22, oz2);
        if (sy2.G) {
            sy sy4 = a2;
            a2.e.J(sy4, sy4.K, (int)b22, c22, oz2);
        }
        oz2 = new Faa(a2.K, oz2, (int)b22, c22);
        Jy[] b22 = a2.K.J().J((Jy[])null, (int)(b22 * ERa.C), c22 * ERa.C, ERa.C, ERa.C);
        byte[] c22 = oz2.J();
        int n5 = n4 = uSa.E;
        while (n5 < c22.length) {
            int n6 = n4++;
            c22[n6] = (byte)b22[n6].Ka;
            n5 = n4;
        }
        oz oz3 = oz2;
        oz3.i();
        return oz3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(hd hd2, int n2, int n3) {
        void a2;
        int d322 = n2;
        sy b2 = this;
        BlockFalling.fallInstantly = vRa.d;
        XF c2 = new XF(d322 * ERa.C, uSa.E, (int)(a2 * ERa.C));
        Baa d322 = new Baa(d322, (int)a2);
        sy sy2 = b2;
        sy2.e.J(sy2.K, b2.d, d322);
        int d322 = uSa.E;
        int n4 = d322;
        while (n4 < Yqa.i) {
            sy sy3 = b2;
            sy3.a.J(sy3.K, b2.d, c2.add(b2.d.nextInt(ERa.C) + Yqa.i, b2.d.nextInt(sOa.D) + AQa.P, b2.d.nextInt(ERa.C) + Yqa.i));
            n4 = ++d322;
        }
        int n5 = d322 = uSa.E;
        while (true) {
            sy sy4 = b2;
            if (n5 >= sy4.d.nextInt(sy4.d.nextInt(NTa.C) + vRa.d) + vRa.d) break;
            sy sy5 = b2;
            sy5.J.J(sy5.K, b2.d, c2.add(b2.d.nextInt(ERa.C) + Yqa.i, b2.d.nextInt(sOa.D) + AQa.P, b2.d.nextInt(ERa.C) + Yqa.i));
            n5 = ++d322;
        }
        int n6 = d322 = uSa.E;
        while (true) {
            sy sy6 = b2;
            if (n6 >= sy6.d.nextInt(sy6.d.nextInt(NTa.C) + vRa.d)) break;
            sy sy7 = b2;
            sy7.o.J(sy7.K, b2.d, c2.add(b2.d.nextInt(ERa.C) + Yqa.i, b2.d.nextInt(sOa.D) + AQa.P, b2.d.nextInt(ERa.C) + Yqa.i));
            n6 = ++d322;
        }
        int n7 = d322 = uSa.E;
        while (n7 < NTa.C) {
            sy sy8 = b2;
            sy8.B.J(sy8.K, b2.d, c2.add(b2.d.nextInt(ERa.C) + Yqa.i, b2.d.nextInt(XOa.h), b2.d.nextInt(ERa.C) + Yqa.i));
            n7 = ++d322;
        }
        if (b2.d.nextBoolean()) {
            sy sy9 = b2;
            sy9.F.J(sy9.K, b2.d, c2.add(b2.d.nextInt(ERa.C) + Yqa.i, b2.d.nextInt(XOa.h), b2.d.nextInt(ERa.C) + Yqa.i));
        }
        if (b2.d.nextBoolean()) {
            sy sy10 = b2;
            sy10.A.J(sy10.K, b2.d, c2.add(b2.d.nextInt(ERa.C) + Yqa.i, b2.d.nextInt(XOa.h), b2.d.nextInt(ERa.C) + Yqa.i));
        }
        int n8 = d322 = uSa.E;
        while (n8 < ERa.C) {
            sy sy11 = b2;
            sy11.k.J(sy11.K, b2.d, c2.add(b2.d.nextInt(ERa.C), b2.d.nextInt(Jra.o) + NTa.C, b2.d.nextInt(ERa.C)));
            n8 = ++d322;
        }
        int n9 = d322 = uSa.E;
        while (n9 < ERa.C) {
            sy sy12 = b2;
            sy12.E.J(sy12.K, b2.d, c2.add(b2.d.nextInt(ERa.C), b2.d.nextInt(Jra.o) + NTa.C, b2.d.nextInt(ERa.C)));
            n9 = ++d322;
        }
        BlockFalling.fallInstantly = uSa.E;
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public XF J(Gg gg2, String string, XF xF) {
        Object d2 = xF;
        sy a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private double[] J(double[] dArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        int h2;
        void e22;
        int f2;
        void a2;
        void b2;
        void c2;
        double[] g2;
        int n8 = n4;
        sy d2 = this;
        if (g2 == null) {
            g2 = new double[c2 * b2 * a2];
        }
        double d3 = RQa.k;
        double d4 = Jra.la;
        sy sy2 = d2;
        sy sy3 = d2;
        sy2.c = sy2.M.J(sy3.c, f2, (int)e22, h2, (int)c2, vRa.d, (int)a2, oua.i, aSa.V, oua.i);
        sy2.D = sy3.i.J(d2.D, f2, (int)e22, h2, (int)c2, vRa.d, (int)a2, fqa.W, aSa.V, fqa.W);
        sy2.L = sy2.I.J(d2.L, f2, (int)e22, h2, (int)c2, (int)b2, (int)a2, d3 / ERa.t, d4 / Zta.l, d3 / ERa.t);
        double d5 = d3;
        sy2.v = sy2.g.J(d2.v, f2, (int)e22, h2, (int)c2, (int)b2, (int)a2, d5, d4, d5);
        double d6 = d3;
        sy2.h = sy2.j.J(d2.h, f2, (int)e22, h2, (int)c2, (int)b2, (int)a2, d6, d4, d6);
        f2 = uSa.E;
        double[] e22 = new double[b2];
        int n9 = h2 = uSa.E;
        while (n9 < b2) {
            int n10 = h2;
            e22[n10] = Math.cos((double)n10 * lQa.f * lPa.K / (double)b2) * KPa.y;
            d3 = n10;
            if (h2 > b2 / uqa.g) {
                d3 = (double)(b2 - vRa.d - h2);
            }
            if (d3 < FPa.T) {
                d3 = FPa.T - d3;
                int n11 = h2;
                double d7 = d3;
                e22[n11] = e22[n11] - d7 * d7 * d3 * Wqa.m;
            }
            n9 = ++h2;
        }
        int n12 = h2 = uSa.E;
        while (n12 < c2) {
            int n13 = uSa.E;
            while (n13 < a2) {
                int n14;
                double d8 = aSa.V;
                int n15 = uSa.E;
                while (n15 < b2) {
                    double d9;
                    int n16;
                    d4 = aSa.V;
                    double d10 = e22[n16];
                    sy sy4 = d2;
                    double d11 = sy4.v[f2] / PRa.Y;
                    double d12 = sy4.h[f2] / PRa.Y;
                    double d13 = (sy4.L[f2] / Wqa.m + oua.i) / KPa.y;
                    d4 = (d9 < aSa.V ? (d4 = d11) : (d13 > oua.i ? (d4 = d12) : (d4 = d11 + (d12 - d11) * d13))) - d10;
                    if (n16 > b2 - AQa.P) {
                        d10 = (float)(n16 - (b2 - AQa.P)) / vQa.q;
                        d4 = d4 * (oua.i - d10) + dsa.Ka * d10;
                    }
                    if ((double)n16 < d8) {
                        d10 = (d8 - (double)n16) / FPa.T;
                        d10 = Oz.J((double)d10, (double)aSa.V, (double)oua.i);
                        d4 = d4 * (oua.i - d10) + dsa.Ka * d10;
                    }
                    g2[f2++] = d4;
                    n15 = ++n16;
                }
                n13 = ++n14;
            }
            n12 = ++h2;
        }
        return g2;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        sy a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, oz oz2) {
        int b2;
        int c2;
        sy sy2 = this;
        int n4 = AQa.P;
        sy sy3 = sy2;
        int n5 = sy3.K.M() / uqa.g + vRa.d;
        int d2 = n4 + vRa.d;
        int n6 = yta.Ka;
        int n7 = n4 + vRa.d;
        sy3.C = sy3.J(sy3.C, (int)(c2 * n4), uSa.E, (int)(b2 * n4), d2, n6, n7);
        int n8 = c2 = uSa.E;
        while (n8 < n4) {
            int n9 = uSa.E;
            while (n9 < n4) {
                int n10 = uSa.E;
                while (n10 < ERa.C) {
                    double d3 = fqa.ca;
                    sy sy4 = sy2;
                    double d4 = sy4.C[((c2 + uSa.E) * n7 + b2 + uSa.E) * n6 + d2 + uSa.E];
                    double d5 = sy4.C[((c2 + uSa.E) * n7 + b2 + vRa.d) * n6 + d2 + uSa.E];
                    double d6 = sy4.C[((c2 + vRa.d) * n7 + b2 + uSa.E) * n6 + d2 + uSa.E];
                    double d7 = sy4.C[((c2 + vRa.d) * n7 + b2 + vRa.d) * n6 + d2 + uSa.E];
                    double d8 = (sy4.C[((c2 + uSa.E) * n7 + b2 + uSa.E) * n6 + d2 + vRa.d] - d4) * d3;
                    double d9 = (sy4.C[((c2 + uSa.E) * n7 + b2 + vRa.d) * n6 + d2 + vRa.d] - d5) * d3;
                    double d10 = (sy4.C[((c2 + vRa.d) * n7 + b2 + uSa.E) * n6 + d2 + vRa.d] - d6) * d3;
                    d3 = (sy4.C[((c2 + vRa.d) * n7 + b2 + vRa.d) * n6 + d2 + vRa.d] - d7) * d3;
                    int n11 = uSa.E;
                    while (n11 < Yqa.i) {
                        int n12;
                        double d11 = VPa.W;
                        double d12 = d4;
                        double d13 = d5;
                        double d14 = (d6 - d4) * d11;
                        d11 = (d7 - d5) * d11;
                        int n13 = uSa.E;
                        while (n13 < AQa.P) {
                            int n14;
                            double d15 = VPa.W;
                            double d16 = d12;
                            d15 = (d13 - d12) * d15;
                            int n15 = uSa.E;
                            while (n15 < AQa.P) {
                                void a2;
                                int n16;
                                IBlockState iBlockState = null;
                                if (d2 * Yqa.i + n12 < n5) {
                                    iBlockState = QFa.bb.J();
                                }
                                if (d16 > aSa.V) {
                                    iBlockState = QFa.GA.J();
                                }
                                int n17 = n14 + c2 * AQa.P;
                                int n18 = n12 + d2 * Yqa.i;
                                int n19 = n16 + b2 * AQa.P;
                                a2.J(n17, n18, n19, iBlockState);
                                d16 += d15;
                                n15 = ++n16;
                            }
                            d12 += d14;
                            d13 += d11;
                            n13 = ++n14;
                        }
                        d4 += d8;
                        d5 += d9;
                        d6 += d10;
                        d7 += d3;
                        n11 = ++n12;
                    }
                    n10 = ++d2;
                }
                n9 = ++b2;
            }
            n8 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, oz oz2) {
        int b2;
        int c2;
        double d2;
        sy sy2;
        sy sy3 = sy2 = this;
        int n4 = sy3.K.M() + vRa.d;
        double d3 = d2 = vQa.e;
        sy2.l = sy3.H.J(sy2.l, (int)(c2 * ERa.C), (int)(b2 * ERa.C), uSa.E, ERa.C, ERa.C, vRa.d, d3, d3, oua.i);
        double d4 = d2;
        sy3.m = sy3.H.J(sy2.m, (int)(c2 * ERa.C), rSa.i, (int)(b2 * ERa.C), ERa.C, vRa.d, ERa.C, d4, oua.i, d4);
        sy3.f = sy3.x.J(sy2.f, (int)(c2 * ERa.C), (int)(b2 * ERa.C), uSa.E, ERa.C, ERa.C, vRa.d, d2 * KPa.y, d2 * KPa.y, d2 * KPa.y);
        int n5 = c2 = uSa.E;
        while (n5 < ERa.C) {
            int n6 = uSa.E;
            while (n6 < ERa.C) {
                int n7 = sy2.l[c2 + b2 * ERa.C] + sy2.d.nextDouble() * iSa.P > aSa.V ? vRa.d : uSa.E;
                int n8 = sy2.m[c2 + b2 * ERa.C] + sy2.d.nextDouble() * iSa.P > aSa.V ? vRa.d : uSa.E;
                int n9 = (int)(sy2.f[c2 + b2 * ERa.C] / uRa.I + uRa.I + sy2.d.nextDouble() * VPa.W);
                int n10 = pua.o;
                IBlockState iBlockState = QFa.GA.J();
                IBlockState iBlockState2 = QFa.GA.J();
                int n11 = cRa.h;
                while (n11 >= 0) {
                    void a2;
                    int d5;
                    if (d5 < cRa.h - sy2.d.nextInt(tTa.h) && d5 > sy2.d.nextInt(tTa.h)) {
                        IBlockState iBlockState3 = a2.J(b2, d5, c2);
                        if (iBlockState3.J() != null && iBlockState3.J().J() != Material.air) {
                            if (iBlockState3.J() == QFa.GA) {
                                if (n10 == pua.o) {
                                    int n12;
                                    if (n9 <= 0) {
                                        iBlockState = null;
                                        iBlockState2 = QFa.GA.J();
                                        n12 = d5;
                                    } else {
                                        if (d5 >= n4 - AQa.P && d5 <= n4 + vRa.d) {
                                            iBlockState = QFa.GA.J();
                                            iBlockState2 = QFa.GA.J();
                                            if (n8 != 0) {
                                                iBlockState = QFa.Q.J();
                                                iBlockState2 = QFa.GA.J();
                                            }
                                            if (n7 != 0) {
                                                iBlockState = QFa.VC.J();
                                                iBlockState2 = QFa.VC.J();
                                            }
                                        }
                                        n12 = d5;
                                    }
                                    if (n12 < n4 && (iBlockState == null || iBlockState.J().J() == Material.air)) {
                                        iBlockState = QFa.bb.J();
                                    }
                                    n10 = n9;
                                    if (d5 >= n4 - vRa.d) {
                                        a2.J(b2, d5, c2, iBlockState);
                                    } else {
                                        a2.J(b2, d5, c2, iBlockState2);
                                    }
                                } else if (n10 > 0) {
                                    --n10;
                                    a2.J(b2, d5, c2, iBlockState2);
                                }
                            }
                        } else {
                            n10 = pua.o;
                        }
                    } else {
                        a2.J(b2, d5, c2, QFa.bg.J());
                    }
                    n11 = --d5;
                }
                n6 = ++b2;
            }
            n5 = ++c2;
        }
    }

    public String J() {
        return gQa.g;
    }
}

