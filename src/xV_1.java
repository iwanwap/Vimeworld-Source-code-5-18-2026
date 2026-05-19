/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  NTa
 *  QFa
 *  UW
 *  Waa
 *  XTa
 *  Xv
 *  Ypa
 *  av
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  ww
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockTripWireHook;

public final class xV_1
extends UW {
    private boolean field_74945_j;
    private boolean field_74947_h;
    private boolean field_74948_i;
    private static final List<baa> field_175816_i;
    private static av junglePyramidsRandomScatteredStones;
    private static final List<baa> field_175815_j;
    private boolean field_74946_k;

    public void f(Waa waa2) {
        xV_1 b2 = waa2;
        xV_1 a2 = this;
        xV_1 xV_12 = b2;
        super.f((Waa)xV_12);
        xV_1 xV_13 = b2;
        xV_13.J(vRa.S, a2.field_74947_h);
        xV_13.J(tTa.u, a2.field_74948_i);
        xV_12.J(zOa.O, a2.field_74945_j);
        xV_12.J(ppa.m, a2.field_74946_k);
    }

    public void J(Waa waa2) {
        xV_1 a2;
        xV_1 b2 = waa2;
        xV_1 xV_12 = a2 = this;
        xV_1 xV_13 = b2;
        super.J((Waa)b2);
        a2.field_74947_h = b2.f(vRa.S);
        a2.field_74948_i = xV_13.f(tTa.u);
        xV_12.field_74945_j = xV_13.f(zOa.O);
        xV_12.field_74946_k = b2.f(ppa.m);
    }

    public xV_1() {
        xV_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public xV_1(Random random, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        xV_1 a2 = this;
        super((Random)c2, (int)b2, ysa.s, d2, lqa.s, NTa.C, Ypa.A);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        void b2;
        void c2;
        xV_1 a2 = this;
        xV_1 d2 = xv2;
        if (!a2.J((Gg)c2, (Xv)d2, uSa.E)) {
            return uSa.E != 0;
        }
        xV_1 xV_12 = a2;
        void v1 = c2;
        xV_1 xV_13 = a2;
        void v3 = c2;
        xV_1 xV_14 = a2;
        void v5 = c2;
        xV_1 xV_15 = a2;
        void v7 = c2;
        xV_1 xV_16 = a2;
        void v9 = c2;
        xV_1 xV_17 = a2;
        void v11 = c2;
        xV_1 xV_18 = a2;
        void v13 = c2;
        xV_1 xV_19 = a2;
        void v15 = c2;
        xV_1 xV_110 = a2;
        void v17 = c2;
        xV_1 xV_111 = a2;
        int n3 = xV_111.J(QFa.We, yRa.d);
        int n4 = xV_111.J(QFa.We, uqa.g);
        int n5 = xV_111.J(QFa.We, uSa.E);
        int n6 = xV_111.J(QFa.We, vRa.d);
        a2.J((Gg)v17, (Xv)d2, uSa.E, pta.a, uSa.E, a2.scatteredFeatureSizeX - vRa.d, uSa.E, a2.scatteredFeatureSizeZ - vRa.d, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_110.J((Gg)v17, (Xv)d2, uqa.g, vRa.d, uqa.g, WOa.fa, uqa.g, uqa.g, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_110.J((Gg)c2, (Xv)d2, uqa.g, vRa.d, lqa.s, WOa.fa, uqa.g, lqa.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v15, (Xv)d2, uqa.g, vRa.d, yRa.d, uqa.g, uqa.g, pPa.f, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_19.J((Gg)v15, (Xv)d2, WOa.fa, vRa.d, yRa.d, WOa.fa, uqa.g, pPa.f, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_19.J((Gg)c2, (Xv)d2, vRa.d, yRa.d, vRa.d, NTa.C, uua.p, vRa.d, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v13, (Xv)d2, vRa.d, yRa.d, uua.s, NTa.C, uua.p, uua.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_18.J((Gg)v13, (Xv)d2, vRa.d, yRa.d, uqa.g, vRa.d, uua.p, lqa.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_18.J((Gg)c2, (Xv)d2, NTa.C, yRa.d, uqa.g, NTa.C, uua.p, lqa.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v11, (Xv)d2, uqa.g, yRa.d, uqa.g, WOa.fa, yRa.d, lqa.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_17.J((Gg)v11, (Xv)d2, uqa.g, uua.p, uqa.g, WOa.fa, uua.p, lqa.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_17.J((Gg)c2, (Xv)d2, yRa.d, XTa.W, yRa.d, Yqa.i, XTa.W, pPa.f, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v9, (Xv)d2, AQa.P, Yqa.i, AQa.P, XTa.W, Yqa.i, NTa.C, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_16.J((Gg)v9, (Xv)d2, yRa.d, vRa.d, yRa.d, Yqa.i, uqa.g, pPa.f);
        xV_16.J((Gg)c2, (Xv)d2, AQa.P, yRa.d, uua.p, XTa.W, yRa.d, WOa.fa);
        a2.J((Gg)v7, (Xv)d2, uqa.g, AQa.P, uqa.g, WOa.fa, tTa.h, lqa.s);
        xV_15.J((Gg)v7, (Xv)d2, AQa.P, uua.p, tTa.h, XTa.W, uua.p, WOa.fa);
        xV_15.J((Gg)c2, (Xv)d2, tTa.h, XTa.W, uua.p, uua.p, XTa.W, Yqa.i);
        a2.J((Gg)v5, (Xv)d2, tTa.h, vRa.d, uqa.g, uua.p, uqa.g, uqa.g);
        xV_14.J((Gg)v5, (Xv)d2, tTa.h, uqa.g, lqa.s, uua.p, uqa.g, lqa.s);
        xV_14.J((Gg)c2, (Xv)d2, tTa.h, tTa.h, vRa.d, uua.p, tTa.h, vRa.d);
        a2.J((Gg)v3, (Xv)d2, tTa.h, tTa.h, uua.s, uua.p, tTa.h, uua.s);
        xV_13.f((Gg)v3, QFa.HF.J(), vRa.d, tTa.h, tTa.h, (Xv)d2);
        xV_13.f((Gg)c2, QFa.HF.J(), NTa.C, tTa.h, tTa.h, (Xv)d2);
        xV_12.f((Gg)v1, QFa.HF.J(), vRa.d, tTa.h, WOa.fa, (Xv)d2);
        xV_12.f((Gg)v1, QFa.HF.J(), NTa.C, tTa.h, WOa.fa, (Xv)d2);
        int n7 = n2 = uSa.E;
        while (n7 <= hpa.Z) {
            xV_1 xV_112 = a2;
            void v21 = c2;
            xV_1 xV_113 = d2;
            int n8 = n2;
            a2.J((Gg)c2, (Xv)xV_113, uqa.g, AQa.P, n8, uqa.g, tTa.h, n8, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            int n9 = n2;
            a2.J((Gg)v21, (Xv)xV_113, AQa.P, AQa.P, n9, AQa.P, tTa.h, n9, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            int n10 = n2;
            xV_112.J((Gg)v21, (Xv)d2, XTa.W, AQa.P, n10, XTa.W, tTa.h, n10, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            int n11 = n2;
            xV_112.J((Gg)c2, (Xv)d2, WOa.fa, AQa.P, n11, WOa.fa, tTa.h, n11, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            n7 = n2 += 14;
        }
        a2.J((Gg)c2, (Xv)d2, tTa.h, uua.p, uSa.E, uua.p, uua.p, uSa.E, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        int n12 = n2 = uSa.E;
        while (n12 <= pPa.f) {
            int n13 = uqa.g;
            while (n13 <= lqa.s) {
                int n14;
                int n15 = n2;
                a2.J((Gg)c2, (Xv)d2, n15, AQa.P, n14 += 2, n15, tTa.h, n14, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
                n13 = n14;
            }
            void v30 = c2;
            int n16 = n2;
            a2.J((Gg)v30, (Xv)d2, n16, uua.p, tTa.h, n16, uua.p, tTa.h, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            int n17 = n2;
            a2.J((Gg)v30, (Xv)d2, n17, uua.p, WOa.fa, n17, uua.p, WOa.fa, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            n12 = n2 += 11;
        }
        xV_1 xV_114 = a2;
        void v34 = c2;
        xV_1 xV_115 = a2;
        void v36 = c2;
        xV_1 xV_116 = d2;
        xV_1 xV_117 = a2;
        void v39 = c2;
        xV_1 xV_118 = a2;
        void v41 = c2;
        xV_1 xV_119 = a2;
        void v43 = c2;
        xV_1 xV_120 = a2;
        void v45 = c2;
        xV_1 xV_121 = a2;
        void v47 = c2;
        xV_1 xV_122 = d2;
        xV_1 xV_123 = a2;
        void v50 = c2;
        xV_1 xV_124 = d2;
        xV_1 xV_125 = a2;
        void v53 = c2;
        a2.J((Gg)v53, (Xv)d2, uqa.g, XTa.W, uqa.g, uqa.g, WOa.fa, uqa.g, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_125.J((Gg)v53, (Xv)d2, WOa.fa, XTa.W, uqa.g, WOa.fa, WOa.fa, uqa.g, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_125.J((Gg)c2, (Xv)d2, uqa.g, XTa.W, lqa.s, uqa.g, WOa.fa, lqa.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)c2, (Xv)xV_124, WOa.fa, XTa.W, lqa.s, WOa.fa, WOa.fa, lqa.s, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v50, (Xv)xV_124, AQa.P, WOa.fa, AQa.P, AQa.P, WOa.fa, AQa.P, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_123.J((Gg)v50, (Xv)d2, XTa.W, WOa.fa, AQa.P, XTa.W, WOa.fa, AQa.P, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_123.J((Gg)c2, (Xv)d2, AQa.P, WOa.fa, NTa.C, AQa.P, WOa.fa, NTa.C, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)c2, (Xv)xV_122, XTa.W, WOa.fa, NTa.C, XTa.W, WOa.fa, NTa.C, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v47, (Xv)xV_122, tTa.h, WOa.fa, XTa.W, uua.p, WOa.fa, XTa.W, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_121.f((Gg)v47, QFa.We.J(n3), tTa.h, WOa.fa, uua.p, (Xv)d2);
        xV_121.f((Gg)c2, QFa.We.J(n3), uua.p, WOa.fa, uua.p, (Xv)d2);
        a2.f((Gg)v45, QFa.We.J(n4), tTa.h, WOa.fa, Yqa.i, (Xv)d2);
        xV_120.f((Gg)v45, QFa.We.J(n4), uua.p, WOa.fa, Yqa.i, (Xv)d2);
        xV_120.f((Gg)c2, QFa.We.J(n3), AQa.P, uSa.E, uSa.E, (Xv)d2);
        a2.f((Gg)v43, QFa.We.J(n3), tTa.h, uSa.E, uSa.E, (Xv)d2);
        xV_119.f((Gg)v43, QFa.We.J(n3), uua.p, uSa.E, uSa.E, (Xv)d2);
        xV_119.f((Gg)c2, QFa.We.J(n3), XTa.W, uSa.E, uSa.E, (Xv)d2);
        a2.f((Gg)v41, QFa.We.J(n3), AQa.P, vRa.d, Yqa.i, (Xv)d2);
        xV_118.f((Gg)v41, QFa.We.J(n3), AQa.P, uqa.g, WOa.fa, (Xv)d2);
        xV_118.f((Gg)c2, QFa.We.J(n3), AQa.P, yRa.d, NTa.C, (Xv)d2);
        a2.f((Gg)v39, QFa.We.J(n3), XTa.W, vRa.d, Yqa.i, (Xv)d2);
        xV_117.f((Gg)v39, QFa.We.J(n3), XTa.W, uqa.g, WOa.fa, (Xv)d2);
        xV_117.f((Gg)c2, QFa.We.J(n3), XTa.W, yRa.d, NTa.C, (Xv)d2);
        a2.J((Gg)c2, (Xv)xV_116, AQa.P, vRa.d, WOa.fa, AQa.P, vRa.d, WOa.fa, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v36, (Xv)xV_116, XTa.W, vRa.d, WOa.fa, XTa.W, vRa.d, WOa.fa, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_115.J((Gg)v36, (Xv)d2, AQa.P, vRa.d, NTa.C, XTa.W, uqa.g, NTa.C, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_115.J((Gg)c2, (Xv)d2, tTa.h, AQa.P, tTa.h, uua.p, AQa.P, tTa.h, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_114.f((Gg)v34, QFa.We.J(n5), AQa.P, AQa.P, tTa.h, (Xv)d2);
        xV_114.f((Gg)v34, QFa.We.J(n6), XTa.W, AQa.P, tTa.h, (Xv)d2);
        int n18 = n2 = uSa.E;
        while (n18 < AQa.P) {
            xV_1 xV_126 = a2;
            void v56 = c2;
            a2.f((Gg)v56, QFa.We.J(n4), tTa.h, uSa.E - n2, uua.p + n2, (Xv)d2);
            xV_126.f((Gg)v56, QFa.We.J(n4), uua.p, uSa.E - n2, uua.p + n2, (Xv)d2);
            xV_126.J((Gg)c2, (Xv)d2, tTa.h, uSa.E - n2, XTa.W + n2, uua.p, uSa.E - n2, WOa.fa + n2++);
            n18 = n2;
        }
        void v57 = c2;
        xV_1 xV_127 = d2;
        a2.J((Gg)c2, (Xv)xV_127, vRa.d, ERa.Ka, lqa.s, NTa.C, pua.o, uua.s);
        a2.J((Gg)v57, (Xv)xV_127, vRa.d, ERa.Ka, vRa.d, yRa.d, pua.o, uua.s);
        a2.J((Gg)v57, (Xv)d2, vRa.d, ERa.Ka, vRa.d, WOa.fa, pua.o, tTa.h);
        int n19 = n2 = vRa.d;
        while (n19 <= uua.s) {
            int n20 = n2;
            a2.J((Gg)c2, (Xv)d2, vRa.d, ERa.Ka, n20, vRa.d, rQa.p, n20, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            n19 = n2 += 2;
        }
        int n21 = n2 = uqa.g;
        while (n21 <= lqa.s) {
            int n22 = n2;
            a2.J((Gg)c2, (Xv)d2, vRa.d, pua.o, n22, yRa.d, pua.o, n22, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
            n21 = n2 += 2;
        }
        xV_1 xV_128 = a2;
        void v64 = c2;
        xV_1 xV_129 = a2;
        void v66 = c2;
        xV_1 xV_130 = a2;
        void v68 = c2;
        xV_1 xV_131 = a2;
        void v70 = c2;
        void v71 = c2;
        xV_1 xV_132 = a2;
        void v73 = c2;
        xV_1 xV_133 = d2;
        a2.J((Gg)c2, (Xv)xV_133, uqa.g, rQa.p, vRa.d, tTa.h, rQa.p, vRa.d, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v73, (Xv)xV_133, XTa.W, rQa.p, vRa.d, WOa.fa, rQa.p, vRa.d, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_132.J((Gg)v73, (Xv)d2, uua.p, ERa.Ka, vRa.d, uua.p, ERa.Ka, vRa.d, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_132.J((Gg)v71, (Xv)d2, uua.p, pua.o, vRa.d, uua.p, pua.o, vRa.d, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_1 xV_134 = a2;
        xV_134.f((Gg)v71, QFa.r.J(xV_134.J(QFa.r, DZ.EAST.getHorizontalIndex())).J(BlockTripWireHook.ATTACHED, vRa.d != 0), vRa.d, ERa.Ka, Yqa.i, (Xv)d2);
        a2.f((Gg)v70, QFa.r.J(a2.J(QFa.r, DZ.WEST.getHorizontalIndex())).J(BlockTripWireHook.ATTACHED, vRa.d != 0), AQa.P, ERa.Ka, Yqa.i, (Xv)d2);
        xV_131.f((Gg)v70, QFa.Qa.J().J(BlockTripWire.ATTACHED, vRa.d != 0), uqa.g, ERa.Ka, Yqa.i, (Xv)d2);
        xV_131.f((Gg)c2, QFa.Qa.J().J(BlockTripWire.ATTACHED, vRa.d != 0), yRa.d, ERa.Ka, Yqa.i, (Xv)d2);
        a2.f((Gg)v68, QFa.pa.J(), tTa.h, ERa.Ka, XTa.W, (Xv)d2);
        xV_130.f((Gg)v68, QFa.pa.J(), tTa.h, ERa.Ka, uua.p, (Xv)d2);
        xV_130.f((Gg)c2, QFa.pa.J(), tTa.h, ERa.Ka, tTa.h, (Xv)d2);
        a2.f((Gg)v66, QFa.pa.J(), tTa.h, ERa.Ka, AQa.P, (Xv)d2);
        xV_129.f((Gg)v66, QFa.pa.J(), tTa.h, ERa.Ka, yRa.d, (Xv)d2);
        xV_129.f((Gg)c2, QFa.pa.J(), tTa.h, ERa.Ka, uqa.g, (Xv)d2);
        a2.f((Gg)v64, QFa.pa.J(), tTa.h, ERa.Ka, vRa.d, (Xv)d2);
        xV_128.f((Gg)v64, QFa.pa.J(), AQa.P, ERa.Ka, vRa.d, (Xv)d2);
        xV_128.f((Gg)c2, QFa.h.J(), yRa.d, ERa.Ka, vRa.d, (Xv)d2);
        if (!a2.field_74945_j) {
            a2.field_74945_j = a2.J((Gg)c2, (Xv)d2, (Random)b2, yRa.d, rQa.p, vRa.d, DZ.NORTH.getIndex(), field_175815_j, uqa.g);
        }
        xV_1 xV_135 = a2;
        void v77 = c2;
        xV_1 xV_136 = a2;
        void v79 = c2;
        xV_1 xV_137 = a2;
        void v81 = c2;
        void v82 = c2;
        a2.f((Gg)v82, QFa.vC.J(Ypa.A), yRa.d, rQa.p, uqa.g, (Xv)d2);
        xV_1 xV_138 = a2;
        xV_138.f((Gg)v82, QFa.r.J(xV_138.J(QFa.r, DZ.NORTH.getHorizontalIndex())).J(BlockTripWireHook.ATTACHED, vRa.d != 0), XTa.W, ERa.Ka, vRa.d, (Xv)d2);
        a2.f((Gg)v81, QFa.r.J(a2.J(QFa.r, DZ.SOUTH.getHorizontalIndex())).J(BlockTripWireHook.ATTACHED, vRa.d != 0), XTa.W, ERa.Ka, tTa.h, (Xv)d2);
        xV_137.f((Gg)v81, QFa.Qa.J().J(BlockTripWire.ATTACHED, vRa.d != 0), XTa.W, ERa.Ka, uqa.g, (Xv)d2);
        xV_137.f((Gg)c2, QFa.Qa.J().J(BlockTripWire.ATTACHED, vRa.d != 0), XTa.W, ERa.Ka, yRa.d, (Xv)d2);
        a2.f((Gg)v79, QFa.Qa.J().J(BlockTripWire.ATTACHED, vRa.d != 0), XTa.W, ERa.Ka, AQa.P, (Xv)d2);
        xV_136.f((Gg)v79, QFa.pa.J(), Yqa.i, ERa.Ka, uua.p, (Xv)d2);
        xV_136.f((Gg)c2, QFa.pa.J(), WOa.fa, ERa.Ka, uua.p, (Xv)d2);
        a2.f((Gg)v77, QFa.pa.J(), WOa.fa, ERa.Ka, tTa.h, (Xv)d2);
        xV_135.f((Gg)v77, QFa.h.J(), WOa.fa, ERa.Ka, AQa.P, (Xv)d2);
        xV_135.f((Gg)c2, QFa.pa.J(), WOa.fa, rQa.p, AQa.P, (Xv)d2);
        if (!a2.field_74946_k) {
            a2.field_74946_k = a2.J((Gg)c2, (Xv)d2, (Random)b2, WOa.fa, rQa.p, yRa.d, DZ.WEST.getIndex(), field_175815_j, uqa.g);
        }
        xV_1 xV_139 = a2;
        xV_139.f((Gg)c2, QFa.vC.J(Ypa.A), Yqa.i, pua.o, yRa.d, (Xv)d2);
        xV_139.f((Gg)c2, QFa.vC.J(Ypa.A), Yqa.i, rQa.p, yRa.d, (Xv)d2);
        if (!a2.field_74947_h) {
            baa[] baaArray = new baa[vRa.d];
            baaArray[uSa.E] = Gea.ha.J((Random)b2);
            a2.field_74947_h = a2.J((Gg)c2, (Xv)d2, (Random)b2, Yqa.i, ERa.Ka, yRa.d, baa.J(field_175816_i, baaArray), uqa.g + b2.nextInt(tTa.h));
        }
        void v86 = c2;
        xV_1 xV_140 = a2;
        void v88 = c2;
        xV_1 xV_141 = a2;
        void v90 = c2;
        xV_1 xV_142 = d2;
        void v92 = c2;
        xV_1 xV_143 = a2;
        void v94 = c2;
        xV_1 xV_144 = a2;
        void v96 = c2;
        xV_1 xV_145 = a2;
        void v98 = c2;
        xV_1 xV_146 = a2;
        void v100 = c2;
        xV_1 xV_147 = a2;
        xV_147.f((Gg)c2, QFa.h.J(), WOa.fa, ERa.Ka, uqa.g, (Xv)d2);
        xV_147.f((Gg)c2, QFa.h.J(), Yqa.i, ERa.Ka, vRa.d, (Xv)d2);
        a2.f((Gg)v100, QFa.h.J(), AQa.P, ERa.Ka, tTa.h, (Xv)d2);
        xV_146.f((Gg)v100, QFa.h.J(), tTa.h, rQa.p, tTa.h, (Xv)d2);
        xV_146.f((Gg)c2, QFa.h.J(), tTa.h, pua.o, tTa.h, (Xv)d2);
        a2.f((Gg)v98, QFa.h.J(), uua.p, ERa.Ka, tTa.h, (Xv)d2);
        xV_145.f((Gg)v98, QFa.h.J(), XTa.W, rQa.p, tTa.h, (Xv)d2);
        xV_145.f((Gg)c2, QFa.h.J(), XTa.W, pua.o, tTa.h, (Xv)d2);
        a2.f((Gg)v96, QFa.h.J(), Yqa.i, ERa.Ka, tTa.h, (Xv)d2);
        xV_144.J((Gg)v96, (Xv)d2, WOa.fa, pua.o, vRa.d, WOa.fa, pua.o, tTa.h, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_144.J((Gg)c2, (Xv)d2, Yqa.i, ERa.Ka, Yqa.i, NTa.C, pua.o, NTa.C);
        a2.f((Gg)v94, QFa.v.J(BlockStoneBrick.CHISELED_META), Yqa.i, rQa.p, pPa.f, (Xv)d2);
        xV_143.f((Gg)v94, QFa.v.J(BlockStoneBrick.CHISELED_META), WOa.fa, rQa.p, pPa.f, (Xv)d2);
        xV_143.f((Gg)v92, QFa.v.J(BlockStoneBrick.CHISELED_META), NTa.C, rQa.p, pPa.f, (Xv)d2);
        xV_1 xV_148 = a2;
        xV_148.f((Gg)v92, QFa.ib.J(BlockLever.J(DZ.getFront(xV_148.J(QFa.ib, DZ.NORTH.getIndex())))), Yqa.i, rQa.p, lqa.s, (Xv)d2);
        xV_1 xV_149 = a2;
        xV_149.f((Gg)v92, QFa.ib.J(BlockLever.J(DZ.getFront(xV_149.J(QFa.ib, DZ.NORTH.getIndex())))), WOa.fa, rQa.p, lqa.s, (Xv)d2);
        xV_1 xV_150 = a2;
        xV_150.f((Gg)v92, QFa.ib.J(BlockLever.J(DZ.getFront(xV_150.J(QFa.ib, DZ.NORTH.getIndex())))), NTa.C, rQa.p, lqa.s, (Xv)d2);
        a2.J((Gg)c2, (Xv)xV_142, Yqa.i, ERa.Ka, Yqa.i, Yqa.i, ERa.Ka, NTa.C, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        a2.J((Gg)v90, (Xv)xV_142, NTa.C, ERa.Ka, Yqa.i, NTa.C, ERa.Ka, NTa.C, uSa.E != 0, (Random)b2, (ww)junglePyramidsRandomScatteredStones);
        xV_141.f((Gg)v90, QFa.h.J(), NTa.C, rQa.p, WOa.fa, (Xv)d2);
        xV_141.f((Gg)c2, QFa.pa.J(), Yqa.i, rQa.p, WOa.fa, (Xv)d2);
        a2.f((Gg)v88, QFa.pa.J(), Yqa.i, rQa.p, NTa.C, (Xv)d2);
        xV_140.f((Gg)v88, QFa.pa.J(), NTa.C, pua.o, WOa.fa, (Xv)d2);
        xV_140.f((Gg)v86, QFa.bF.J(DZ.UP.getIndex()), WOa.fa, rQa.p, Yqa.i, (Xv)d2);
        xV_1 xV_151 = a2;
        xV_151.f((Gg)v86, QFa.bF.J(xV_151.J(QFa.bF, DZ.WEST.getIndex())), NTa.C, rQa.p, Yqa.i, (Xv)d2);
        xV_1 xV_152 = a2;
        xV_152.f((Gg)v86, QFa.bF.J(xV_152.J(QFa.bF, DZ.WEST.getIndex())), NTa.C, pua.o, Yqa.i, (Xv)d2);
        xV_1 xV_153 = a2;
        xV_153.f((Gg)v86, QFa.t.J(xV_153.J(QFa.t, DZ.NORTH.getHorizontalIndex())), NTa.C, rQa.p, NTa.C, (Xv)d2);
        if (!a2.field_74948_i) {
            baa[] baaArray = new baa[vRa.d];
            baaArray[uSa.E] = Gea.ha.J((Random)b2);
            a2.field_74948_i = a2.J((Gg)c2, (Xv)d2, (Random)b2, WOa.fa, ERa.Ka, NTa.C, baa.J(field_175816_i, baaArray), uqa.g + b2.nextInt(tTa.h));
        }
        return vRa.d != 0;
    }

    static {
        baa[] baaArray = new baa[NTa.C];
        baaArray[uSa.E] = new baa(Gea.b, uSa.E, vRa.d, yRa.d, yRa.d);
        baaArray[vRa.d] = new baa(Gea.GA, uSa.E, vRa.d, tTa.h, NTa.C);
        baaArray[uqa.g] = new baa(Gea.Bb, uSa.E, uqa.g, XTa.W, Ypa.A);
        baaArray[yRa.d] = new baa(Gea.kc, uSa.E, vRa.d, yRa.d, uqa.g);
        baaArray[AQa.P] = new baa(Gea.Ya, uSa.E, AQa.P, uua.p, kTa.j);
        baaArray[tTa.h] = new baa(Gea.qa, uSa.E, yRa.d, XTa.W, ERa.C);
        baaArray[uua.p] = new baa(Gea.NA, uSa.E, vRa.d, vRa.d, yRa.d);
        baaArray[XTa.W] = new baa(Gea.La, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[Yqa.i] = new baa(Gea.Yc, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[WOa.fa] = new baa(Gea.sd, uSa.E, vRa.d, vRa.d, vRa.d);
        field_175816_i = Lists.newArrayList(baaArray);
        baa[] baaArray2 = new baa[vRa.d];
        baaArray2[uSa.E] = new baa(Gea.Ma, uSa.E, uqa.g, XTa.W, Fsa.d);
        field_175815_j = Lists.newArrayList(baaArray2);
        junglePyramidsRandomScatteredStones = new av(null);
    }
}

