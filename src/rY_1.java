/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  ERa
 *  Gg
 *  JW
 *  Jy
 *  NTa
 *  NV
 *  Naa
 *  PW
 *  QFa
 *  Ww
 *  XTa
 *  YSa
 *  YY
 *  fw
 *  iw
 *  jW
 *  qv
 *  sw
 *  vRa
 *  vpa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.material.Material;

public class rY_1 {
    public jW Q;
    public XF N;
    public int T;
    public jW p;
    public Naa n;
    public jW s;
    public jW w;
    public int W;
    public int q;
    public jW x;
    public Gg v;
    public jW o;
    public int h;
    public jW K;
    public int H;
    public int c;
    public int B;
    public int d;
    public jW a;
    public boolean b;
    public jW l;
    public jW e;
    public jW G;
    public Ww D;
    public jW f;
    public int F;
    public jW g;
    public Random L;
    public jW E;
    public int m;
    public int C;
    public jW i;
    public jW M;
    public jW k;
    public jW j;
    public jW J;
    public int A;
    public jW I;

    public rY_1() {
        rY_1 a2;
        rY_1 rY_12 = a2;
        a2.a = new sw(AQa.P);
        rY_12.k = new NV((Block)QFa.R, XTa.W);
        a2.f = new NV(QFa.Q, uua.p);
        a2.D = new Ww(QFa.zc, BlockFlower$EnumFlowerType.DANDELION);
        a2.G = new XV(QFa.vc);
        a2.E = new XV(QFa.TC);
        a2.M = new qv();
        a2.I = new JW();
        a2.Q = new HV();
        a2.s = new pV();
        a2.C = uqa.g;
        a2.T = vRa.d;
        a2.m = vRa.d;
        a2.c = yRa.d;
        a2.B = vRa.d;
        a2.b = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, jW jW2, int n3, int n4) {
        void d2;
        int n5;
        int a2;
        int e2 = n3;
        rY_1 b2 = this;
        if (a2 < e2) {
            int n6 = e2;
            e2 = a2;
            a2 = n6;
        } else if (a2 == e2) {
            if (e2 < osa.Ja) {
                ++a2;
            } else {
                --e2;
            }
        }
        int n7 = n5 = uSa.E;
        while (n7 < d2) {
            void c2;
            rY_1 rY_12 = b2;
            XF xF2 = rY_12.N.add(rY_12.L.nextInt(ERa.C), b2.L.nextInt(a2 - e2) + e2, b2.L.nextInt(ERa.C));
            rY_1 rY_13 = b2;
            c2.J(rY_13.v, rY_13.L, xF2);
            n7 = ++n5;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, jW jW2, int n3, int n4) {
        void d2;
        int n5;
        int n6 = n4;
        rY_1 a2 = this;
        int n7 = n5 = uSa.E;
        while (n7 < d2) {
            void c2;
            void b2;
            void e2;
            rY_1 rY_12 = a2;
            XF xF2 = rY_12.N.add(rY_12.L.nextInt(ERa.C), a2.L.nextInt((int)e2) + a2.L.nextInt((int)e2) + b2 - e2, a2.L.nextInt(ERa.C));
            rY_1 rY_13 = a2;
            c2.J(rY_13.v, rY_13.L, xF2);
            n7 = ++n5;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, Jy jy2, XF xF2) {
        void b2;
        void a2;
        void c2;
        rY_1 rY_12;
        Object e2 = gg2;
        rY_1 d2 = this;
        if (d2.v != null) {
            throw new RuntimeException(Ata.r);
        }
        d2.v = e2;
        if ((e2 = e2.J().J()) != null) {
            rY_12 = d2;
            d2.n = YY.J((String)e2).J();
        } else {
            rY_12 = d2;
            d2.n = YY.J((String)Mqa.y).J();
        }
        rY_12.L = c2;
        rY_1 rY_13 = d2;
        rY_1 rY_14 = d2;
        rY_14.N = a2;
        rY_1 rY_15 = d2;
        rY_14.x = new PW(QFa.Bc.J(), d2.n.dirtSize);
        rY_15.i = new PW(QFa.Q.J(), d2.n.gravelSize);
        rY_14.g = new PW(QFa.Gd.J().J(BlockStone.VARIANT, BlockStone$EnumType.GRANITE), d2.n.graniteSize);
        rY_14.j = new PW(QFa.Gd.J().J(BlockStone.VARIANT, BlockStone$EnumType.DIORITE), d2.n.dioriteSize);
        rY_14.l = new PW(QFa.Gd.J().J(BlockStone.VARIANT, BlockStone$EnumType.ANDESITE), d2.n.andesiteSize);
        rY_14.K = new PW(QFa.Za.J(), d2.n.coalSize);
        rY_14.o = new PW(QFa.b.J(), d2.n.ironSize);
        rY_14.p = new PW(QFa.zE.J(), d2.n.goldSize);
        rY_14.J = new PW(QFa.M.J(), d2.n.redstoneSize);
        d2.e = new PW(QFa.Ic.J(), d2.n.diamondSize);
        d2.w = new PW(QFa.xC.J(), d2.n.lapisSize);
        d2.J((Jy)b2);
        rY_13.v = null;
        rY_13.L = null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Jy jy2) {
        Object object;
        void a2;
        int n2;
        int n3;
        int n4;
        rY_1 rY_12 = this;
        rY_12.J();
        int n5 = n4 = uSa.E;
        while (n5 < rY_12.c) {
            rY_1 rY_13 = rY_12;
            n3 = rY_13.L.nextInt(ERa.C) + Yqa.i;
            int b2 = rY_13.L.nextInt(ERa.C) + Yqa.i;
            rY_1 rY_14 = rY_12;
            rY_1 rY_15 = rY_12;
            rY_13.k.J(rY_14.v, rY_14.L, rY_15.v.f(rY_15.N.add(n3, uSa.E, b2)));
            n5 = ++n4;
        }
        int n6 = n4 = uSa.E;
        while (n6 < rY_12.B) {
            rY_1 rY_16 = rY_12;
            n3 = rY_16.L.nextInt(ERa.C) + Yqa.i;
            int b2 = rY_16.L.nextInt(ERa.C) + Yqa.i;
            rY_1 rY_17 = rY_12;
            rY_1 rY_18 = rY_12;
            rY_16.a.J(rY_17.v, rY_17.L, rY_18.v.f(rY_18.N.add(n3, uSa.E, b2)));
            n6 = ++n4;
        }
        int n7 = n4 = uSa.E;
        while (n7 < rY_12.m) {
            rY_1 rY_19 = rY_12;
            n3 = rY_19.L.nextInt(ERa.C) + Yqa.i;
            int b2 = rY_19.L.nextInt(ERa.C) + Yqa.i;
            rY_1 rY_110 = rY_12;
            rY_1 rY_111 = rY_12;
            rY_19.f.J(rY_110.v, rY_110.L, rY_111.v.f(rY_111.N.add(n3, uSa.E, b2)));
            n7 = ++n4;
        }
        rY_1 rY_112 = rY_12;
        n4 = rY_112.h;
        if (rY_112.L.nextInt(NTa.C) == 0) {
            ++n4;
        }
        int n8 = n3 = uSa.E;
        while (n8 < n4) {
            rY_1 rY_113 = rY_12;
            int b2 = rY_113.L.nextInt(ERa.C) + Yqa.i;
            n2 = rY_113.L.nextInt(ERa.C) + Yqa.i;
            bV bV2 = a2.J(rY_12.L);
            bV2.J();
            XF xF2 = rY_113.v.l(rY_12.N.add(b2, uSa.E, n2));
            rY_1 rY_114 = rY_12;
            if (bV2.J(rY_114.v, rY_114.L, xF2)) {
                rY_1 rY_115 = rY_12;
                bV2.J(rY_115.v, rY_115.L, xF2);
            }
            n8 = ++n3;
        }
        int n9 = n3 = uSa.E;
        while (n9 < rY_12.q) {
            rY_1 rY_116 = rY_12;
            int b2 = rY_116.L.nextInt(ERa.C) + Yqa.i;
            n2 = rY_116.L.nextInt(ERa.C) + Yqa.i;
            rY_1 rY_117 = rY_12;
            rY_1 rY_118 = rY_12;
            rY_116.M.J(rY_117.v, rY_117.L, rY_118.v.l(rY_118.N.add(b2, uSa.E, n2)));
            n9 = ++n3;
        }
        int n10 = n3 = uSa.E;
        while (n10 < rY_12.C) {
            rY_1 rY_119 = rY_12;
            int b2 = rY_119.L.nextInt(ERa.C) + Yqa.i;
            int n11 = rY_119.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_119.L.nextInt(ERa.C) + Yqa.i)).getY() + fPa.i;
            if (n11 > 0) {
                rY_1 rY_120 = rY_12;
                int n12 = rY_120.L.nextInt(n11);
                XF xF3 = rY_120.N.add(b2, n12, n2);
                object = a2.J(rY_12.L, xF3);
                BlockFlower blockFlower = object.getBlockType().getBlock();
                if (blockFlower.J() != Material.air) {
                    rY_1 rY_121 = rY_12;
                    rY_121.D.J(blockFlower, object);
                    rY_1 rY_122 = rY_12;
                    rY_121.D.J(rY_122.v, rY_122.L, xF3);
                }
            }
            n10 = ++n3;
        }
        int n13 = n3 = uSa.E;
        while (n13 < rY_12.T) {
            rY_1 rY_123 = rY_12;
            int b2 = rY_123.L.nextInt(ERa.C) + Yqa.i;
            int n14 = rY_123.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_123.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n14 > 0) {
                int n15 = rY_12.L.nextInt(n14);
                rY_1 rY_124 = rY_12;
                a2.J(rY_12.L).J(rY_124.v, rY_124.L, rY_12.N.add(b2, n15, n2));
            }
            n13 = ++n3;
        }
        int n16 = n3 = uSa.E;
        while (n16 < rY_12.W) {
            rY_1 rY_125 = rY_12;
            int b2 = rY_125.L.nextInt(ERa.C) + Yqa.i;
            int n17 = rY_125.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_125.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n17 > 0) {
                int n18 = rY_12.L.nextInt(n17);
                rY_1 rY_126 = rY_12;
                new yW().J(rY_126.v, rY_126.L, rY_12.N.add(b2, n18, n2));
            }
            n16 = ++n3;
        }
        int n19 = n3 = uSa.E;
        while (n19 < rY_12.F) {
            rY_1 rY_127 = rY_12;
            int b2 = rY_127.L.nextInt(ERa.C) + Yqa.i;
            int n20 = rY_127.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_127.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n20 > 0) {
                rY_1 rY_128;
                Object object2;
                block38: {
                    rY_1 rY_129 = rY_12;
                    int n21 = rY_129.L.nextInt(n20);
                    Object object3 = rY_129.N.add(b2, n21, n2);
                    while (object3.getY() > 0) {
                        object = object2.down();
                        if (!rY_12.v.J((XF)((Object)object))) {
                            rY_128 = rY_12;
                            break block38;
                        }
                        object3 = object;
                    }
                    rY_128 = rY_12;
                }
                rY_1 rY_130 = rY_12;
                rY_128.s.J(rY_130.v, rY_130.L, object2);
            }
            n19 = ++n3;
        }
        int n22 = n3 = uSa.E;
        while (n22 < rY_12.d) {
            if (rY_12.L.nextInt(AQa.P) == 0) {
                rY_1 rY_131 = rY_12;
                int b2 = rY_131.L.nextInt(ERa.C) + Yqa.i;
                n2 = rY_131.L.nextInt(ERa.C) + Yqa.i;
                XF xF4 = rY_131.v.l(rY_12.N.add(b2, uSa.E, n2));
                rY_1 rY_132 = rY_12;
                rY_131.G.J(rY_132.v, rY_132.L, xF4);
            }
            if (rY_12.L.nextInt(Yqa.i) == 0) {
                rY_1 rY_133 = rY_12;
                int b2 = rY_133.L.nextInt(ERa.C) + Yqa.i;
                int n23 = rY_133.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_133.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
                if (n23 > 0) {
                    rY_1 rY_134 = rY_12;
                    int n24 = rY_134.L.nextInt(n23);
                    XF xF5 = rY_134.N.add(b2, n24, n2);
                    rY_1 rY_135 = rY_12;
                    rY_134.E.J(rY_135.v, rY_135.L, xF5);
                }
            }
            n22 = ++n3;
        }
        if (rY_12.L.nextInt(AQa.P) == 0) {
            int b2;
            rY_1 rY_136 = rY_12;
            n3 = rY_136.L.nextInt(ERa.C) + Yqa.i;
            n2 = rY_136.v.l(rY_12.N.add(n3, uSa.E, b2 = rY_136.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n2 > 0) {
                rY_1 rY_137 = rY_12;
                int n25 = rY_137.L.nextInt(n2);
                rY_1 rY_138 = rY_12;
                rY_137.G.J(rY_138.v, rY_138.L, rY_12.N.add(n3, n25, b2));
            }
        }
        if (rY_12.L.nextInt(Yqa.i) == 0) {
            int b2;
            rY_1 rY_139 = rY_12;
            n3 = rY_139.L.nextInt(ERa.C) + Yqa.i;
            n2 = rY_139.v.l(rY_12.N.add(n3, uSa.E, b2 = rY_139.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n2 > 0) {
                rY_1 rY_140 = rY_12;
                int n26 = rY_140.L.nextInt(n2);
                rY_1 rY_141 = rY_12;
                rY_140.E.J(rY_141.v, rY_141.L, rY_12.N.add(n3, n26, b2));
            }
        }
        int n27 = n3 = uSa.E;
        while (n27 < rY_12.H) {
            rY_1 rY_142 = rY_12;
            int b2 = rY_142.L.nextInt(ERa.C) + Yqa.i;
            int n28 = rY_142.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_142.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n28 > 0) {
                rY_1 rY_143 = rY_12;
                int n29 = rY_143.L.nextInt(n28);
                rY_1 rY_144 = rY_12;
                rY_143.I.J(rY_144.v, rY_144.L, rY_12.N.add(b2, n29, n2));
            }
            n27 = ++n3;
        }
        int n30 = n3 = uSa.E;
        while (n30 < NTa.C) {
            rY_1 rY_145 = rY_12;
            int b2 = rY_145.L.nextInt(ERa.C) + Yqa.i;
            int n31 = rY_145.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_145.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n31 > 0) {
                rY_1 rY_146 = rY_12;
                int n32 = rY_146.L.nextInt(n31);
                rY_1 rY_147 = rY_12;
                rY_146.I.J(rY_147.v, rY_147.L, rY_12.N.add(b2, n32, n2));
            }
            n30 = ++n3;
        }
        if (rY_12.L.nextInt(fPa.i) == 0) {
            int b2;
            rY_1 rY_148 = rY_12;
            n3 = rY_148.L.nextInt(ERa.C) + Yqa.i;
            n2 = rY_148.v.l(rY_12.N.add(n3, uSa.E, b2 = rY_148.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n2 > 0) {
                int n33 = rY_12.L.nextInt(n2);
                rY_1 rY_149 = rY_12;
                new iw().J(rY_149.v, rY_149.L, rY_12.N.add(n3, n33, b2));
            }
        }
        int n34 = n3 = uSa.E;
        while (n34 < rY_12.A) {
            rY_1 rY_150 = rY_12;
            int b2 = rY_150.L.nextInt(ERa.C) + Yqa.i;
            int n35 = rY_150.v.l(rY_12.N.add(b2, uSa.E, n2 = rY_150.L.nextInt(ERa.C) + Yqa.i)).getY() * uqa.g;
            if (n35 > 0) {
                rY_1 rY_151 = rY_12;
                int n36 = rY_151.L.nextInt(n35);
                rY_1 rY_152 = rY_12;
                rY_151.Q.J(rY_152.v, rY_152.L, rY_12.N.add(b2, n36, n2));
            }
            n34 = ++n3;
        }
        if (rY_12.b) {
            int n37 = n3 = uSa.E;
            while (n37 < vpa.o) {
                rY_1 rY_153 = rY_12;
                int b2 = rY_153.L.nextInt(ERa.C) + Yqa.i;
                n2 = rY_153.L.nextInt(ERa.C) + Yqa.i;
                int n38 = rY_153.L.nextInt(Lsa.L) + Yqa.i;
                if (n38 > 0) {
                    rY_1 rY_154 = rY_12;
                    int n39 = rY_154.L.nextInt(n38);
                    XF xF6 = rY_154.N.add(b2, n39, n2);
                    rY_1 rY_155 = rY_12;
                    new fw((Block)QFa.jd).J(rY_155.v, rY_155.L, xF6);
                }
                n37 = ++n3;
            }
            int n40 = n3 = uSa.E;
            while (n40 < kTa.j) {
                rY_1 rY_156 = rY_12;
                int b2 = rY_156.L.nextInt(ERa.C) + Yqa.i;
                n2 = rY_156.L.nextInt(ERa.C) + Yqa.i;
                rY_1 rY_157 = rY_12;
                int n41 = rY_156.L.nextInt(rY_157.L.nextInt(rY_157.L.nextInt(YSa.c) + Yqa.i) + Yqa.i);
                XF xF7 = rY_156.N.add(b2, n41, n2);
                rY_1 rY_158 = rY_12;
                new fw((Block)QFa.fA).J(rY_158.v, rY_158.L, xF7);
                n40 = ++n3;
            }
        }
    }

    public void J() {
        rY_1 a2;
        rY_1 rY_12 = a2;
        rY_1 rY_13 = a2;
        rY_12.f(rY_12.n.dirtCount, rY_13.x, a2.n.dirtMinHeight, a2.n.dirtMaxHeight);
        rY_1 rY_14 = a2;
        rY_12.f(rY_13.n.gravelCount, rY_14.i, rY_14.n.gravelMinHeight, a2.n.gravelMaxHeight);
        rY_1 rY_15 = a2;
        rY_12.f(rY_12.n.dioriteCount, rY_15.j, rY_15.n.dioriteMinHeight, a2.n.dioriteMaxHeight);
        rY_1 rY_16 = a2;
        rY_12.f(rY_12.n.graniteCount, rY_16.g, rY_16.n.graniteMinHeight, a2.n.graniteMaxHeight);
        rY_1 rY_17 = a2;
        rY_12.f(rY_12.n.andesiteCount, rY_17.l, rY_17.n.andesiteMinHeight, a2.n.andesiteMaxHeight);
        rY_1 rY_18 = a2;
        rY_12.f(rY_12.n.coalCount, rY_18.K, rY_18.n.coalMinHeight, a2.n.coalMaxHeight);
        rY_1 rY_19 = a2;
        rY_12.f(rY_12.n.ironCount, rY_19.o, rY_19.n.ironMinHeight, a2.n.ironMaxHeight);
        rY_1 rY_110 = a2;
        rY_12.f(rY_12.n.goldCount, rY_110.p, rY_110.n.goldMinHeight, a2.n.goldMaxHeight);
        rY_1 rY_111 = a2;
        rY_12.f(rY_12.n.redstoneCount, rY_111.J, rY_111.n.redstoneMinHeight, a2.n.redstoneMaxHeight);
        rY_1 rY_112 = a2;
        rY_12.f(rY_12.n.diamondCount, rY_112.e, rY_112.n.diamondMinHeight, a2.n.diamondMaxHeight);
        rY_1 rY_113 = a2;
        rY_12.J(rY_12.n.lapisCount, rY_113.w, rY_113.n.lapisCenterHeight, a2.n.lapisSpread);
    }
}

