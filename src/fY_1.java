/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ev
 *  Gg
 *  JPa
 *  Jy
 *  Kz
 *  Pqa
 *  QFa
 *  SOa
 *  Ssa
 *  Ypa
 *  ZRa
 *  aSa
 *  cRa
 *  iea
 *  kta
 *  nQa
 *  pua
 *  uQa
 *  uRa
 *  vRa
 *  ysa
 */
import java.util.Arrays;
import java.util.Random;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class fY_1
extends Jy {
    private boolean i;
    private long M;
    private Ev k;
    private Ev j;
    private Ev J;
    private IBlockState[] A;
    private boolean I;

    public Jy f(int n2) {
        fY_1 fY_12;
        int b22 = n2;
        fY_1 a2 = this;
        int n3 = a2.Ka == Jy.X.Ka ? vRa.d : uSa.E;
        fY_1 b22 = new fY_1(b22, n3 != 0, a2.i);
        if (n3 == 0) {
            fY_1 fY_13 = b22;
            b22.J((Kz)j);
            fY_12 = fY_13;
            fY_1 fY_14 = b22;
            fY_13.J(a2.Ma + nQa.r);
        } else {
            fY_1 fY_15 = b22;
            fY_12 = fY_15;
            fY_15.J(new StringBuilder().insert(3 >> 2, a2.Ma).append(uQa.I).toString());
        }
        fY_12.J(a2.s, vRa.d != 0);
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        void b2;
        void c2;
        Object d2 = xF2;
        fY_1 a2 = this;
        super.J((Gg)c2, (Random)b2, (XF)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    private void J(long l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        void a22;
        fY_1 fY_12 = this;
        fY_12.A = new IBlockState[ysa.s];
        Arrays.fill(fY_12.A, QFa.MB.J());
        Random a22 = new Random((long)a22);
        fY_1 fY_13 = fY_12;
        fY_13.k = new Ev(a22, vRa.d);
        int n7 = n6 = uSa.E;
        while (n7 < ysa.s) {
            if ((n6 += a22.nextInt(tTa.h) + vRa.d) < ysa.s) {
                fY_12.A[n6] = QFa.za.J().J(BlockColored.COLOR, iea.ORANGE);
            }
            n7 = ++n6;
        }
        n6 = a22.nextInt(AQa.P) + uqa.g;
        int n8 = n5 = uSa.E;
        while (n8 < n6) {
            Random random = a22;
            n4 = random.nextInt(yRa.d) + vRa.d;
            n3 = random.nextInt(ysa.s);
            int n9 = n3;
            for (int b2 = uSa.E; n9 + b2 < ysa.s && b2 < n4; ++b2) {
                int n10 = n3 + b2;
                fY_12.A[n10] = QFa.za.J().J(BlockColored.COLOR, iea.YELLOW);
                n9 = n3;
            }
            n8 = ++n5;
        }
        n5 = a22.nextInt(AQa.P) + uqa.g;
        int n11 = n4 = uSa.E;
        while (n11 < n5) {
            Random random = a22;
            n3 = random.nextInt(yRa.d) + uqa.g;
            int b2 = random.nextInt(ysa.s);
            int n12 = b2;
            for (n2 = uSa.E; n12 + n2 < ysa.s && n2 < n3; ++n2) {
                int n13 = b2 + n2;
                fY_12.A[n13] = QFa.za.J().J(BlockColored.COLOR, iea.BROWN);
                n12 = b2;
            }
            n11 = ++n4;
        }
        n4 = a22.nextInt(AQa.P) + uqa.g;
        int n14 = n3 = uSa.E;
        while (n14 < n4) {
            Random random = a22;
            int b2 = random.nextInt(yRa.d) + vRa.d;
            n2 = random.nextInt(ysa.s);
            int n15 = n2;
            for (n5 = uSa.E; n15 + n5 < ysa.s && n5 < b2; ++n5) {
                int n16 = n2 + n5;
                fY_12.A[n16] = QFa.za.J().J(BlockColored.COLOR, iea.RED);
                n15 = n2;
            }
            n14 = ++n3;
        }
        n3 = a22.nextInt(yRa.d) + yRa.d;
        int b2 = uSa.E;
        int n17 = n2 = uSa.E;
        while (n17 < n3) {
            n5 = vRa.d;
            int n18 = b2 += a22.nextInt(ERa.C) + AQa.P;
            for (n4 = uSa.E; n18 + n4 < ysa.s && n4 < n5; ++n4) {
                int n19 = b2;
                fY_12.A[n19 + n4] = QFa.za.J().J(BlockColored.COLOR, iea.WHITE);
                if (n19 + n4 > vRa.d && a22.nextBoolean()) {
                    fY_12.A[b2 + n4 - vRa.d] = QFa.za.J().J(BlockColored.COLOR, iea.SILVER);
                }
                if (b2 + n4 < Ssa.u && a22.nextBoolean()) {
                    fY_12.A[b2 + n4 + vRa.d] = QFa.za.J().J(BlockColored.COLOR, iea.SILVER);
                }
                n18 = b2;
            }
            n17 = ++n2;
        }
    }

    public bV J(Random random) {
        Object b2 = random;
        fY_1 a2 = this;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    private IBlockState J(int n2, int n3, int n4) {
        void b2;
        fY_1 c2;
        int d2 = n2;
        fY_1 fY_12 = c2 = this;
        d2 = (int)Math.round(fY_12.k.J((double)d2 * oua.i / PRa.Y, (double)d2 * oua.i / PRa.Y) * KPa.y);
        return fY_12.A[(b2 + d2 + ysa.s) % ysa.s];
    }

    public int J(XF xF2) {
        Object b2 = xF2;
        fY_1 a2 = this;
        return Pqa.a;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, oz oz2, int n2, int n3, double d2) {
        int n4;
        void e2;
        void a2;
        int n5;
        void b2;
        void c2;
        IBlockState f2;
        fY_1 fY_12 = this;
        if (fY_12.A == null || fY_12.M != f2.J()) {
            fY_12.J(f2.J());
        }
        if (fY_12.J == null || fY_12.j == null || fY_12.M != f2.J()) {
            Random random2 = new Random(fY_12.M);
            fY_1 fY_13 = fY_12;
            fY_13.J = new Ev(random2, AQa.P);
            fY_13.j = new Ev(random2, vRa.d);
        }
        fY_12.M = f2.J();
        double d3 = aSa.V;
        if (fY_12.I) {
            double d4;
            n5 = (c2 & nQa.u) + (b2 & Ypa.A);
            int g2 = (b2 & nQa.u) + (c2 & Ypa.A);
            double d5 = Math.min(Math.abs((double)a2), fY_12.J.J((double)n5 * VPa.W, (double)g2 * VPa.W));
            if (d4 > aSa.V) {
                double d6 = aSa.r;
                double d7 = Math.abs(fY_12.j.J((double)n5 * d6, (double)g2 * d6));
                double d8 = d5;
                d3 = d8 * d8 * vqa.c;
                double d9 = Math.ceil(d7 * ZRa.r) + SOa.w;
                if (d3 > d9) {
                    d3 = d9;
                }
                d3 += ypa.X;
            }
        }
        n5 = c2 & Ypa.A;
        int g2 = b2 & Ypa.A;
        int n6 = f2.M();
        IBlockState iBlockState = QFa.za.J();
        IBlockState iBlockState2 = fY_12.G;
        int n7 = (int)(a2 / uRa.I + uRa.I + e2.nextDouble() * VPa.W);
        int n8 = Math.cos((double)(a2 / uRa.I * lQa.f)) > aSa.V ? vRa.d : uSa.E;
        int n9 = pua.o;
        int n10 = uSa.E;
        int n11 = n4 = osa.Ja;
        while (n11 >= 0) {
            void d10;
            if (d10.J(g2, n4, n5).J().J() == Material.air && n4 < (int)d3) {
                d10.J(g2, n4, n5, QFa.Gd.J());
            }
            if (n4 <= e2.nextInt(tTa.h)) {
                d10.J(g2, n4, n5, QFa.bg.J());
            } else {
                f2 = d10.J(g2, n4, n5);
                if (f2.J().J() == Material.air) {
                    n9 = pua.o;
                } else if (f2.J() == QFa.Gd) {
                    if (n9 == pua.o) {
                        int n12;
                        n10 = uSa.E;
                        if (n7 <= 0) {
                            iBlockState = null;
                            iBlockState2 = QFa.Gd.J();
                            n12 = n4;
                        } else {
                            if (n4 >= n6 - AQa.P && n4 <= n6 + vRa.d) {
                                iBlockState = QFa.za.J();
                                iBlockState2 = fY_12.G;
                            }
                            n12 = n4;
                        }
                        if (n12 < n6 && (iBlockState == null || iBlockState.J().J() == Material.air)) {
                            iBlockState = QFa.sc.J();
                        }
                        n9 = n7 + Math.max(uSa.E, n4 - n6);
                        if (n4 < n6 - vRa.d) {
                            d10.J(g2, n4, n5, iBlockState2);
                            if (iBlockState2.J() == QFa.za) {
                                d10.J(g2, n4, n5, iBlockState2.J().J().J(BlockColored.COLOR, iea.ORANGE));
                            }
                        } else if (fY_12.i && n4 > Bra.C + n7 * uqa.g) {
                            void v5 = d10;
                            if (n8 != 0) {
                                v5.J(g2, n4, n5, QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.COARSE_DIRT));
                            } else {
                                v5.J(g2, n4, n5, QFa.lf.J());
                            }
                        } else if (n4 <= n6 + yRa.d + n7) {
                            d10.J(g2, n4, n5, (IBlockState)fY_12.M);
                            n10 = vRa.d;
                        } else {
                            void v6;
                            if (n4 >= ysa.s && n4 <= cRa.h) {
                                if (n8 != 0) {
                                    f2 = QFa.MB.J();
                                    v6 = d10;
                                } else {
                                    f2 = fY_12.J((int)c2, n4, (int)b2);
                                    v6 = d10;
                                }
                            } else {
                                f2 = QFa.za.J().J(BlockColored.COLOR, iea.ORANGE);
                                v6 = d10;
                            }
                            v6.J(g2, n4, n5, f2);
                        }
                    } else if (n9 > 0) {
                        --n9;
                        if (n10 != 0) {
                            d10.J(g2, n4, n5, QFa.za.J().J(BlockColored.COLOR, iea.ORANGE));
                        } else {
                            f2 = fY_12.J((int)c2, n4, (int)b2);
                            d10.J(g2, n4, n5, f2);
                        }
                    }
                }
            }
            n11 = --n4;
        }
    }

    /*
     * WARNING - void declaration
     */
    public fY_1(int n2, boolean bl2, boolean bl3) {
        void b2;
        void c2;
        boolean d2 = bl3;
        fY_1 a2 = this;
        super((int)c2);
        a2.I = b2;
        a2.i = d2;
        a2.l();
        a2.J(kta.v, JPa.N);
        fY_1 fY_12 = a2;
        fY_12.q.clear();
        fY_12.M = (long)QFa.R.J().J(BlockSand.VARIANT, BlockSand$EnumType.RED_SAND);
        fY_12.G = QFa.za.J();
        fY_12.A.h = rta.n;
        fY_12.A.W = kTa.j;
        fY_12.A.H = yRa.d;
        fY_12.A.A = tTa.h;
        fY_12.A.C = uSa.E;
        fY_12.q.clear();
        if (a2.i) {
            a2.A.h = tTa.h;
        }
    }

    public int f(XF xF2) {
        Object b2 = xF2;
        fY_1 a2 = this;
        return rua.R;
    }
}

