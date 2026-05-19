/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  Baa
 *  ERa
 *  Ev
 *  FPa
 *  Faa
 *  Gg
 *  JPa
 *  Jy
 *  KU
 *  NTa
 *  Naa
 *  Oz
 *  PU
 *  QFa
 *  Qsa
 *  Uqa
 *  YSa
 *  YY
 *  Zta
 *  aQa
 *  aSa
 *  bw
 *  dQa
 *  gc
 *  hd
 *  hra
 *  kpa
 *  kta
 *  oV
 *  ov
 *  pqa
 *  psa
 *  sV
 *  uRa
 *  vQa
 *  vRa
 *  xW
 *  xv
 *  ysa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wz_1
implements hd {
    public double[] v;
    private MV o;
    private Random h;
    private PU K;
    private xv H;
    public MV c;
    private Gg B;
    public double[] d;
    private Fy a;
    private xW b;
    private ov l;
    public MV e;
    public double[] G;
    private final boolean D;
    private Naa f;
    private double[] F;
    private final float[] g;
    private KU L;
    private Jy[] E;
    private KU m;
    public double[] C;
    public MV i;
    private Block M;
    private MV k;
    private Ev j;
    private sV J;
    private final double[] A;
    private MV I;

    public boolean J() {
        return uSa.E != 0;
    }

    public boolean J(boolean bl, gc gc2) {
        wz_1 c2 = gc2;
        wz_1 a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        int n4;
        void b22;
        wz_1 a2;
        int c22 = n3;
        wz_1 wz_12 = a2 = this;
        wz_12.h.setSeed((long)b22 * ysa.f + (long)c22 * Iqa.a);
        oz oz2 = new oz();
        wz_12.J((int)b22, c22, oz2);
        wz_12.E = wz_12.B.J().J(a2.E, (int)(b22 * ERa.C), c22 * ERa.C, ERa.C, ERa.C);
        wz_12.J((int)b22, c22, oz2, a2.E);
        if (wz_12.f.useCaves) {
            wz_1 wz_13 = a2;
            a2.L.J((hd)wz_13, wz_13.B, (int)b22, c22, oz2);
        }
        if (a2.f.useRavines) {
            wz_1 wz_14 = a2;
            a2.m.J((hd)wz_14, wz_14.B, (int)b22, c22, oz2);
        }
        if (a2.f.useMineShafts && a2.D) {
            wz_1 wz_15 = a2;
            a2.l.J((hd)wz_15, wz_15.B, (int)b22, c22, oz2);
        }
        if (a2.f.useVillages && a2.D) {
            wz_1 wz_16 = a2;
            a2.b.J((hd)wz_16, wz_16.B, (int)b22, c22, oz2);
        }
        if (a2.f.useStrongholds && a2.D) {
            wz_1 wz_17 = a2;
            a2.K.J((hd)wz_17, wz_17.B, (int)b22, c22, oz2);
        }
        if (a2.f.useTemples && a2.D) {
            wz_1 wz_18 = a2;
            a2.H.J((hd)wz_18, wz_18.B, (int)b22, c22, oz2);
        }
        if (a2.f.useMonuments && a2.D) {
            wz_1 wz_19 = a2;
            a2.J.J((hd)wz_19, wz_19.B, (int)b22, c22, oz2);
        }
        Faa b22 = new Faa(a2.B, oz2, (int)b22, c22);
        byte[] c22 = b22.J();
        int n5 = n4 = uSa.E;
        while (n5 < c22.length) {
            int n6 = n4++;
            c22[n6] = (byte)a2.E[n6].Ka;
            n5 = n4;
        }
        Faa faa2 = b22;
        faa2.d();
        return faa2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Faa faa2, int n2, int n3) {
        void b2;
        int d2 = n3;
        wz_1 a2 = this;
        if (a2.f.useMineShafts && a2.D) {
            wz_1 wz_12 = a2;
            a2.l.J((hd)wz_12, wz_12.B, (int)b2, d2, (oz)null);
        }
        if (a2.f.useVillages && a2.D) {
            wz_1 wz_13 = a2;
            a2.b.J((hd)wz_13, wz_13.B, (int)b2, d2, (oz)null);
        }
        if (a2.f.useStrongholds && a2.D) {
            wz_1 wz_14 = a2;
            a2.K.J((hd)wz_14, wz_14.B, (int)b2, d2, (oz)null);
        }
        if (a2.f.useTemples && a2.D) {
            wz_1 wz_15 = a2;
            a2.H.J((hd)wz_15, wz_15.B, (int)b2, d2, (oz)null);
        }
        if (a2.f.useMonuments && a2.D) {
            wz_1 wz_16 = a2;
            a2.J.J((hd)wz_16, wz_16.B, (int)b2, d2, (oz)null);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, oz oz2) {
        int b2;
        int c2;
        wz_1 wz_12;
        wz_1 wz_13 = wz_12 = this;
        wz_13.E = wz_13.B.J().f(wz_12.E, (int)(c2 * AQa.P - uqa.g), (int)(b2 * AQa.P - uqa.g), NTa.C, NTa.C);
        wz_13.J((int)(c2 * AQa.P), uSa.E, (int)(b2 * AQa.P));
        int n4 = c2 = uSa.E;
        while (n4 < AQa.P) {
            b2 = c2 * tTa.h;
            int n5 = (c2 + vRa.d) * tTa.h;
            int n6 = uSa.E;
            while (n6 < AQa.P) {
                int n7;
                int n8 = (b2 + n7) * Zqa.G;
                int n9 = (b2 + n7 + vRa.d) * Zqa.G;
                int n10 = (n5 + n7) * Zqa.G;
                int n11 = (n5 + n7 + vRa.d) * Zqa.G;
                int n12 = uSa.E;
                while (n12 < fPa.i) {
                    int d2;
                    double d3 = fqa.ca;
                    wz_1 wz_14 = wz_12;
                    double d4 = wz_14.A[n8 + d2];
                    double d5 = wz_14.A[n9 + d2];
                    double d6 = wz_14.A[n10 + d2];
                    double d7 = wz_14.A[n11 + d2];
                    double d8 = (wz_14.A[n8 + d2 + vRa.d] - d4) * d3;
                    double d9 = (wz_14.A[n9 + d2 + vRa.d] - d5) * d3;
                    double d10 = (wz_14.A[n10 + d2 + vRa.d] - d6) * d3;
                    d3 = (wz_14.A[n11 + d2 + vRa.d] - d7) * d3;
                    int n13 = uSa.E;
                    while (n13 < Yqa.i) {
                        int n14;
                        double d11 = VPa.W;
                        double d12 = d4;
                        double d13 = d5;
                        double d14 = (d6 - d4) * d11;
                        d11 = (d7 - d5) * d11;
                        int n15 = uSa.E;
                        while (n15 < AQa.P) {
                            int n16;
                            double d15 = VPa.W;
                            d15 = (d13 - d12) * d15;
                            double d16 = d12 - d15;
                            int n17 = uSa.E;
                            while (n17 < AQa.P) {
                                int n18;
                                void a2;
                                double d17;
                                d16 += d15;
                                if (d17 > aSa.V) {
                                    a2.J(c2 * AQa.P + n16, d2 * Yqa.i + n14, n7 * AQa.P + n18, QFa.Gd.J());
                                } else if (d2 * Yqa.i + n14 < wz_12.f.seaLevel) {
                                    a2.J(c2 * AQa.P + n16, d2 * Yqa.i + n14, n7 * AQa.P + n18, wz_12.M.J());
                                }
                                n17 = ++n18;
                            }
                            d12 += d14;
                            d13 += d11;
                            n15 = ++n16;
                        }
                        d4 += d8;
                        d5 += d9;
                        d6 += d10;
                        d7 += d3;
                        n13 = ++n14;
                    }
                    n12 = ++d2;
                }
                n6 = ++n7;
            }
            n4 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public List<AZ> J(VIa vIa, XF xF) {
        void b2;
        wz_1 a2;
        Object c2 = xF;
        wz_1 wz_12 = a2 = this;
        Jy jy = wz_12.B.J((XF)((Object)c2));
        if (wz_12.D) {
            if (b2 == VIa.MONSTER && a2.H.f((XF)((Object)c2))) {
                return a2.H.f();
            }
            if (b2 == VIa.MONSTER && a2.f.useMonuments) {
                wz_1 wz_13 = a2;
                if (wz_13.J.J(wz_13.B, (XF)((Object)c2))) {
                    return a2.J.f();
                }
            }
        }
        return jy.J((VIa)b2);
    }

    private void J(int n2, int n3, int n4) {
        int b2;
        int a2;
        int c2;
        wz_1 wz_12;
        wz_1 wz_13 = wz_12 = this;
        wz_1 wz_14 = wz_12;
        wz_13.d = wz_13.e.J(wz_14.d, c2, a2, tTa.h, tTa.h, wz_12.f.depthNoiseScaleX, wz_12.f.depthNoiseScaleZ, wz_12.f.depthNoiseScaleExponent);
        float f2 = wz_14.f.coordinateScale;
        float d2 = wz_13.f.heightScale;
        wz_13.C = wz_13.o.J(wz_12.C, c2, b2, a2, tTa.h, Zqa.G, tTa.h, f2 / wz_12.f.mainNoiseScaleX, d2 / wz_12.f.mainNoiseScaleY, f2 / wz_12.f.mainNoiseScaleZ);
        wz_13.v = wz_13.k.J(wz_12.v, c2, b2, a2, tTa.h, Zqa.G, tTa.h, f2, d2, f2);
        wz_13.G = wz_13.I.J(wz_12.G, c2, b2, a2, tTa.h, Zqa.G, tTa.h, f2, d2, f2);
        a2 = uSa.E;
        c2 = uSa.E;
        c2 = uSa.E;
        b2 = uSa.E;
        int n5 = a2 = uSa.E;
        while (n5 < tTa.h) {
            int n6 = uSa.E;
            while (n6 < tTa.h) {
                double d3;
                double d4;
                int n7;
                d2 = JPa.N;
                float f3 = JPa.N;
                float f4 = JPa.N;
                int n8 = uqa.g;
                Jy jy = wz_12.E[a2 + uqa.g + (n7 + uqa.g) * NTa.C];
                int n9 = -n8;
                while (n9 <= n8) {
                    int n10;
                    int n11 = -n8;
                    while (n11 <= n8) {
                        int n12;
                        wz_1 wz_15 = wz_12;
                        Jy jy2 = wz_15.E[a2 + n10 + uqa.g + (n7 + n12 + uqa.g) * NTa.C];
                        wz_1 wz_16 = wz_12;
                        float f5 = wz_15.f.biomeDepthOffSet + jy2.Ca * wz_16.f.biomeDepthWeight;
                        float f6 = wz_16.f.biomeScaleOffset + jy2.k * wz_12.f.biomeScaleWeight;
                        if (wz_15.a == Fy.J && f5 > JPa.N) {
                            f5 = pqa.r + f5 * kta.v;
                            f6 = pqa.r + f6 * YSa.G;
                        }
                        float f7 = wz_12.g[n10 + uqa.g + (n12 + uqa.g) * tTa.h] / (f5 + kta.v);
                        if (jy2.Ca > jy.Ca) {
                            f7 /= kta.v;
                        }
                        d2 += f6 * f7;
                        f3 += f5 * f7;
                        f4 += f7;
                        n11 = ++n12;
                    }
                    n9 = ++n10;
                }
                d2 /= f4;
                f3 /= f4;
                d2 = d2 * ATa.r + Nra.e;
                f3 = (f3 * YSa.G - pqa.r) / Qsa.k;
                double d5 = wz_12.d[b2] / Zta.C;
                if (d4 < aSa.V) {
                    d5 = -d5 * aQa.r;
                }
                d5 = d5 * uRa.I - KPa.y;
                if (d3 < aSa.V) {
                    double d6;
                    d5 /= KPa.y;
                    if (d6 < pqa.q) {
                        d5 = pqa.q;
                    }
                    d5 /= qQa.V;
                    d5 /= KPa.y;
                } else {
                    if (d5 > oua.i) {
                        d5 = oua.i;
                    }
                    d5 /= Wqa.Z;
                }
                ++b2;
                double d7 = f3;
                double d8 = d2;
                d7 += d5 * iSa.P;
                d7 = d7 * (double)wz_12.f.baseSize / Wqa.Z;
                d5 = (double)wz_12.f.baseSize + d7 * FPa.T;
                int n13 = uSa.E;
                while (n13 < Zqa.G) {
                    double d9;
                    d7 = ((double)d2 - d5) * (double)wz_12.f.stretchY * kpa.t / ZSa.o / d8;
                    if (d9 < aSa.V) {
                        d7 *= FPa.T;
                    }
                    wz_1 wz_17 = wz_12;
                    wz_1 wz_18 = wz_12;
                    double d10 = wz_17.v[c2] / (double)wz_18.f.lowerLimitScale;
                    double d11 = wz_18.G[c2] / (double)wz_12.f.upperLimitScale;
                    double d12 = (wz_17.C[c2] / Wqa.m + oua.i) / KPa.y;
                    d7 = Oz.l((double)d10, (double)d11, (double)d12) - d7;
                    if (d2 > ITa.A) {
                        d10 = (float)(d2 - ITa.A) / vQa.q;
                        d7 = d7 * (oua.i - d10) + dsa.Ka * d10;
                    }
                    wz_12.A[c2++] = d7;
                    n13 = ++d2;
                }
                n6 = ++n7;
            }
            n5 = ++a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(hd hd2, int n2, int n3) {
        int d22222;
        int n4;
        Jy jy;
        XF xF;
        void var4_12;
        int a2;
        int c2;
        wz_1 b2;
        block16: {
            int d22222;
            block17: {
                int d22222 = n2;
                b2 = this;
                BlockFalling.fallInstantly = vRa.d;
                c2 = d22222 * ERa.C;
                var4_12 = a2 * ERa.C;
                xF = new XF(c2, uSa.E, (int)var4_12);
                wz_1 wz_12 = b2;
                jy = wz_12.B.J(xF.add(ERa.C, uSa.E, ERa.C));
                wz_1 wz_13 = b2;
                wz_12.h.setSeed(wz_13.B.J());
                long l2 = wz_13.h.nextLong() / kra.G * kra.G + dQa.Ga;
                long l3 = wz_12.h.nextLong() / kra.G * kra.G + dQa.Ga;
                wz_12.h.setSeed((long)d22222 * l2 + (long)a2 * l3 ^ b2.B.J());
                int n5 = uSa.E;
                Baa d22222 = new Baa(d22222, a2);
                if (wz_12.f.useMineShafts && b2.D) {
                    wz_1 wz_14 = b2;
                    wz_14.l.J(wz_14.B, b2.h, d22222);
                }
                if (b2.f.useVillages && b2.D) {
                    wz_1 wz_15 = b2;
                    n5 = wz_15.b.J(wz_15.B, b2.h, d22222) ? 1 : 0;
                }
                if (b2.f.useStrongholds && b2.D) {
                    wz_1 wz_16 = b2;
                    wz_16.K.J(wz_16.B, b2.h, d22222);
                }
                if (b2.f.useTemples && b2.D) {
                    wz_1 wz_17 = b2;
                    wz_17.H.J(wz_17.B, b2.h, d22222);
                }
                if (b2.f.useMonuments && b2.D) {
                    wz_1 wz_18 = b2;
                    wz_18.J.J(wz_18.B, b2.h, d22222);
                }
                if (jy != Jy.ea && jy != Jy.Ga && b2.f.useWaterLakes && n5 == 0) {
                    wz_1 wz_19 = b2;
                    if (wz_19.h.nextInt(wz_19.f.waterLakeChance) == 0) {
                        wz_1 wz_110 = b2;
                        int d22222 = wz_110.h.nextInt(ERa.C) + Yqa.i;
                        a2 = wz_110.h.nextInt(hra.Ja);
                        n4 = wz_110.h.nextInt(ERa.C) + Yqa.i;
                        wz_1 wz_111 = b2;
                        new Bw(QFa.sc).J(wz_111.B, wz_111.h, xF.add(d22222, a2, n4));
                    }
                }
                if (n5 != 0) break block16;
                wz_1 wz_112 = b2;
                if (wz_112.h.nextInt(wz_112.f.lavaLakeChance / NTa.C) != 0 || !b2.f.useLavaLakes) break block16;
                wz_1 wz_113 = b2;
                d22222 = wz_113.h.nextInt(ERa.C) + Yqa.i;
                wz_1 wz_114 = b2;
                a2 = wz_113.h.nextInt(wz_114.h.nextInt(Lsa.L) + Yqa.i);
                n4 = wz_114.h.nextInt(ERa.C) + Yqa.i;
                if (a2 < b2.B.M()) break block17;
                wz_1 wz_115 = b2;
                if (wz_115.h.nextInt(wz_115.f.lavaLakeChance / Yqa.i) != 0) break block16;
            }
            wz_1 wz_116 = b2;
            new Bw(QFa.bb).J(wz_116.B, wz_116.h, xF.add(d22222, a2, n4));
        }
        if (b2.f.useDungeons) {
            int d22222;
            int n6 = d22222 = uSa.E;
            while (n6 < b2.f.dungeonChance) {
                wz_1 wz_117 = b2;
                a2 = wz_117.h.nextInt(ERa.C) + Yqa.i;
                n4 = wz_117.h.nextInt(hra.Ja);
                int n7 = wz_117.h.nextInt(ERa.C) + Yqa.i;
                wz_1 wz_118 = b2;
                new VV().J(wz_118.B, wz_118.h, xF.add(a2, n4, n7));
                n6 = ++d22222;
            }
        }
        wz_1 wz_119 = b2;
        jy.J(wz_119.B, wz_119.h, new XF(c2, uSa.E, (int)var4_12));
        Qz.J(b2.B, jy, c2 + Yqa.i, (int)(var4_12 + Yqa.i), ERa.C, ERa.C, b2.h);
        xF = xF.add(Yqa.i, uSa.E, Yqa.i);
        int n8 = d22222 = uSa.E;
        while (n8 < ERa.C) {
            int n9 = uSa.E;
            while (n9 < ERa.C) {
                wz_1 wz_120 = b2;
                XF xF2 = wz_120.B.J(xF.add(d22222, uSa.E, a2));
                XF xF3 = xF2.down();
                if (wz_120.B.d(xF3)) {
                    b2.B.J(xF3, QFa.Ta.J(), uqa.g);
                }
                if (b2.B.C(xF2, vRa.d != 0)) {
                    b2.B.J(xF2, QFa.gC.J(), uqa.g);
                }
                n9 = ++a2;
            }
            n8 = ++d22222;
        }
        BlockFalling.fallInstantly = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public wz_1(Gg gg2, long l2, boolean bl, String string) {
        void a2;
        void c2;
        int e2;
        void d2;
        wz_1 b2;
        boolean bl2 = bl;
        wz_1 wz_12 = b2 = this;
        wz_1 wz_13 = b2;
        wz_1 wz_14 = b2;
        b2.M = QFa.sc;
        b2.F = new double[hra.Ja];
        wz_1 wz_15 = b2;
        b2.L = new bw();
        b2.K = new PU();
        b2.b = new xW();
        b2.l = new ov();
        b2.H = new xv();
        wz_14.m = new oV();
        wz_14.J = new sV();
        wz_14.B = d2;
        wz_13.D = e2;
        wz_13.a = d2.J().J();
        wz_12.h = new Random((long)c2);
        b2.k = new MV(b2.h, ERa.C);
        wz_12.I = new MV(b2.h, ERa.C);
        wz_12.o = new MV(b2.h, Yqa.i);
        wz_12.j = new Ev(b2.h, AQa.P);
        wz_12.i = new MV(b2.h, NTa.C);
        wz_12.e = new MV(b2.h, ERa.C);
        wz_12.c = new MV(b2.h, Yqa.i);
        wz_12.A = new double[Uqa.ca];
        wz_12.g = new float[kTa.g];
        int n2 = e2 = rQa.p;
        while (n2 <= uqa.g) {
            int n3 = rQa.p;
            while (n3 <= uqa.g) {
                int n4 = e2;
                int n5 = c2;
                float f2 = FRa.Ga / Oz.J((float)((float)(n4 * n4 + n5 * n5) + psa.N));
                int n6 = e2 + uqa.g + (c2 + uqa.g) * tTa.h;
                b2.g[n6] = f2;
                n3 = ++c2;
            }
            n2 = ++e2;
        }
        if (a2 != null) {
            b2.f = YY.J((String)a2).J();
            b2.M = b2.f.useLavaOceans ? QFa.bb : QFa.sc;
            d2.J(b2.f.seaLevel);
        }
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(hd hd2, Faa faa2, int n2, int n3) {
        void c2;
        void var1_4;
        void e232 = var1_4;
        wz_1 d2 = this;
        int e232 = uSa.E;
        if (d2.f.useMonuments && d2.D && c2.J() < kra.J) {
            void a2;
            void b2;
            wz_1 wz_12 = d2;
            e232 = e232 | wz_12.J.J(wz_12.B, d2.h, new Baa((int)b2, (int)a2));
        }
        return e232 != 0;
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        wz_1 a2 = this;
        return vRa.d != 0;
    }

    public int J() {
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, oz oz2, Jy[] jyArray) {
        int n4;
        void d2;
        int e2 = n3;
        wz_1 c2 = this;
        double d3 = vQa.e;
        c2.F = c2.j.J(c2.F, (double)(d2 * ERa.C), (double)(e2 * ERa.C), ERa.C, ERa.C, d3 * KPa.y, d3 * KPa.y, oua.i);
        int n5 = n4 = uSa.E;
        while (n5 < ERa.C) {
            int n6 = uSa.E;
            while (n6 < ERa.C) {
                void b2;
                int n7;
                void a2;
                void v2 = a2[n7 + n4 * ERa.C];
                wz_1 wz_12 = c2;
                int n8 = e2 * ERa.C + n7;
                int n9 = n7 + n4 * ERa.C;
                v2.J(wz_12.B, wz_12.h, (oz)b2, (int)(d2 * ERa.C + n4), n8, c2.F[n9]);
                n6 = ++n7;
            }
            n5 = ++n4;
        }
    }

    public Faa J(XF xF) {
        Object b2 = xF;
        wz_1 a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }

    public String J() {
        return Zqa.A;
    }

    /*
     * WARNING - void declaration
     */
    public XF J(Gg gg2, String string, XF xF) {
        void b2;
        Object d2 = xF;
        wz_1 a2 = this;
        if (zpa.d.equals(b2) && a2.K != null) {
            void c2;
            return a2.K.J((Gg)c2, (XF)((Object)d2));
        }
        return null;
    }
}

