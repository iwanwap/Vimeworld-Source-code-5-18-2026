/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cw
 *  Gg
 *  NTa
 *  QFa
 *  Uw
 *  XTa
 *  Xv
 *  fV
 *  pPa
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;

public final class Cw_1
extends fV {
    /*
     * WARNING - void declaration
     */
    public Cw_1(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object f2;
        void d2;
        void e2;
        Cw_1 a2;
        Cw_1 cw_1 = object;
        Object object = dZ2;
        Cw_1 cw_12 = a2 = cw_1;
        super((Uw)e2, (int)d2);
        cw_12.coordBaseMode = f2;
        cw_12.boundingBox = b2;
    }

    public Cw_1() {
        Cw_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public int l(int n2, int n3) {
        void a2;
        int c2 = n2;
        Cw_1 b2 = this;
        if (c2 == 0) {
            return AQa.P;
        }
        return super.l(c2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static Cw J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)WOa.fa, (int)XTa.W, (int)pPa.f, (DZ)b2);
        if (Cw_1.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new Cw_1(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        int n2;
        int n3;
        void c2;
        Cw_1 d2 = xv2;
        Cw_1 a2 = this;
        if (a2.field_143015_k < 0) {
            Cw_1 cw_1 = a2;
            cw_1.field_143015_k = cw_1.J((Gg)c2, (Xv)d2);
            if (cw_1.field_143015_k < 0) {
                return vRa.d != 0;
            }
            Cw_1 cw_12 = a2;
            a2.boundingBox.J(uSa.E, cw_12.field_143015_k - cw_12.boundingBox.maxY + XTa.W - vRa.d, uSa.E);
        }
        Cw_1 cw_1 = a2;
        Cw_1 cw_13 = a2;
        void v4 = c2;
        Cw_1 cw_14 = a2;
        void v6 = c2;
        Cw_1 cw_15 = d2;
        Cw_1 cw_16 = a2;
        void v9 = c2;
        Cw_1 cw_17 = d2;
        Cw_1 cw_18 = a2;
        void v12 = c2;
        Cw_1 cw_19 = d2;
        Cw_1 cw_110 = a2;
        void v15 = c2;
        Cw_1 cw_111 = a2;
        void v17 = c2;
        a2.J((Gg)v17, (Xv)d2, vRa.d, vRa.d, vRa.d, XTa.W, AQa.P, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        cw_111.J((Gg)v17, (Xv)d2, uqa.g, vRa.d, uua.p, Yqa.i, AQa.P, NTa.C, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        cw_111.J((Gg)c2, (Xv)d2, uqa.g, uSa.E, uua.p, Yqa.i, uSa.E, NTa.C, QFa.Bc.J(), QFa.Bc.J(), uSa.E != 0);
        a2.f((Gg)v15, QFa.yB.J(), uua.p, uSa.E, uua.p, (Xv)d2);
        cw_110.J((Gg)v15, (Xv)d2, uqa.g, vRa.d, uua.p, uqa.g, vRa.d, NTa.C, QFa.U.J(), QFa.U.J(), uSa.E != 0);
        cw_110.J((Gg)c2, (Xv)d2, Yqa.i, vRa.d, uua.p, Yqa.i, vRa.d, NTa.C, QFa.U.J(), QFa.U.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)cw_19, yRa.d, vRa.d, NTa.C, XTa.W, vRa.d, NTa.C, QFa.U.J(), QFa.U.J(), uSa.E != 0);
        a2.J((Gg)v12, (Xv)cw_19, vRa.d, uSa.E, vRa.d, XTa.W, uSa.E, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        cw_18.J((Gg)v12, (Xv)d2, uSa.E, uSa.E, uSa.E, uSa.E, yRa.d, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        cw_18.J((Gg)c2, (Xv)d2, Yqa.i, uSa.E, uSa.E, Yqa.i, yRa.d, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)cw_17, vRa.d, uSa.E, uSa.E, XTa.W, vRa.d, uSa.E, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v9, (Xv)cw_17, vRa.d, uSa.E, tTa.h, XTa.W, vRa.d, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        cw_16.J((Gg)v9, (Xv)d2, vRa.d, uqa.g, uSa.E, XTa.W, yRa.d, uSa.E, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        cw_16.J((Gg)c2, (Xv)d2, vRa.d, uqa.g, tTa.h, XTa.W, yRa.d, tTa.h, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)cw_15, uSa.E, AQa.P, vRa.d, Yqa.i, AQa.P, vRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)v6, (Xv)cw_15, uSa.E, AQa.P, AQa.P, Yqa.i, AQa.P, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        cw_14.J((Gg)v6, (Xv)d2, uSa.E, tTa.h, uqa.g, Yqa.i, tTa.h, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        cw_14.f((Gg)c2, QFa.L.J(), uSa.E, AQa.P, uqa.g, (Xv)d2);
        a2.f((Gg)v4, QFa.L.J(), uSa.E, AQa.P, yRa.d, (Xv)d2);
        cw_13.f((Gg)v4, QFa.L.J(), Yqa.i, AQa.P, uqa.g, (Xv)d2);
        cw_1.f((Gg)c2, QFa.L.J(), Yqa.i, AQa.P, yRa.d, (Xv)d2);
        int n4 = cw_13.J(QFa.WA, yRa.d);
        int n5 = cw_1.J(QFa.WA, uqa.g);
        int n6 = n3 = pua.o;
        while (n6 <= uqa.g) {
            int n7 = uSa.E;
            while (n7 <= Yqa.i) {
                Cw_1 cw_112 = a2;
                cw_112.f((Gg)c2, QFa.WA.J(n4), n2, AQa.P + n3, n3, (Xv)d2);
                cw_112.f((Gg)c2, QFa.WA.J(n5), n2++, AQa.P + n3, tTa.h - n3, (Xv)d2);
                n7 = n2;
            }
            n6 = ++n3;
        }
        Cw_1 cw_113 = a2;
        void v22 = c2;
        Cw_1 cw_114 = a2;
        void v24 = c2;
        Cw_1 cw_115 = a2;
        void v26 = c2;
        void v27 = c2;
        Cw_1 cw_116 = a2;
        void v29 = c2;
        Cw_1 cw_117 = a2;
        void v31 = c2;
        Cw_1 cw_118 = a2;
        void v33 = c2;
        Cw_1 cw_119 = a2;
        void v35 = c2;
        Cw_1 cw_120 = a2;
        void v37 = c2;
        a2.f((Gg)v37, QFa.UA.J(), uSa.E, uqa.g, vRa.d, (Xv)d2);
        cw_120.f((Gg)v37, QFa.UA.J(), uSa.E, uqa.g, AQa.P, (Xv)d2);
        cw_120.f((Gg)c2, QFa.UA.J(), Yqa.i, uqa.g, vRa.d, (Xv)d2);
        a2.f((Gg)v35, QFa.UA.J(), Yqa.i, uqa.g, AQa.P, (Xv)d2);
        cw_119.f((Gg)v35, QFa.JB.J(), uSa.E, uqa.g, uqa.g, (Xv)d2);
        cw_119.f((Gg)c2, QFa.JB.J(), uSa.E, uqa.g, yRa.d, (Xv)d2);
        a2.f((Gg)v33, QFa.JB.J(), Yqa.i, uqa.g, uqa.g, (Xv)d2);
        cw_118.f((Gg)v33, QFa.JB.J(), Yqa.i, uqa.g, yRa.d, (Xv)d2);
        cw_118.f((Gg)c2, QFa.JB.J(), uqa.g, uqa.g, tTa.h, (Xv)d2);
        a2.f((Gg)v31, QFa.JB.J(), yRa.d, uqa.g, tTa.h, (Xv)d2);
        cw_117.f((Gg)v31, QFa.JB.J(), tTa.h, uqa.g, uSa.E, (Xv)d2);
        cw_117.f((Gg)c2, QFa.JB.J(), uua.p, uqa.g, tTa.h, (Xv)d2);
        a2.f((Gg)v29, QFa.U.J(), uqa.g, vRa.d, yRa.d, (Xv)d2);
        cw_116.f((Gg)v29, QFa.Te.J(), uqa.g, uqa.g, yRa.d, (Xv)d2);
        cw_116.f((Gg)v27, QFa.L.J(), vRa.d, vRa.d, AQa.P, (Xv)d2);
        Cw_1 cw_121 = a2;
        cw_121.f((Gg)v27, QFa.WA.J(cw_121.J(QFa.WA, yRa.d)), uqa.g, vRa.d, AQa.P, (Xv)d2);
        Cw_1 cw_122 = a2;
        cw_122.f((Gg)v27, QFa.WA.J(cw_122.J(QFa.WA, vRa.d)), vRa.d, vRa.d, yRa.d, (Xv)d2);
        a2.J((Gg)v26, (Xv)d2, tTa.h, uSa.E, vRa.d, XTa.W, uSa.E, yRa.d, QFa.Rd.J(), QFa.Rd.J(), uSa.E != 0);
        cw_115.f((Gg)v26, QFa.Rd.J(), uua.p, vRa.d, vRa.d, (Xv)d2);
        cw_115.f((Gg)c2, QFa.Rd.J(), uua.p, vRa.d, uqa.g, (Xv)d2);
        a2.f((Gg)v24, QFa.HF.J(), uqa.g, vRa.d, uSa.E, (Xv)d2);
        cw_114.f((Gg)v24, QFa.HF.J(), uqa.g, uqa.g, uSa.E, (Xv)d2);
        cw_114.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode), uqa.g, yRa.d, vRa.d, (Xv)d2);
        cw_113.J((Gg)v22, (Xv)d2, (Random)b2, uqa.g, vRa.d, uSa.E, DZ.getHorizontal(a2.J(QFa.UB, vRa.d)));
        if (cw_113.J((Gg)v22, uqa.g, uSa.E, pua.o, (Xv)d2).J().J() == Material.air && a2.J((Gg)c2, uqa.g, pua.o, pua.o, (Xv)d2).J().J() != Material.air) {
            Cw_1 cw_123 = a2;
            cw_123.f((Gg)c2, QFa.We.J(cw_123.J(QFa.We, yRa.d)), uqa.g, uSa.E, pua.o, (Xv)d2);
        }
        void v41 = c2;
        Cw_1 cw_124 = a2;
        cw_124.f((Gg)c2, QFa.HF.J(), uua.p, vRa.d, tTa.h, (Xv)d2);
        cw_124.f((Gg)c2, QFa.HF.J(), uua.p, uqa.g, tTa.h, (Xv)d2);
        a2.f((Gg)v41, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode.getOpposite()), uua.p, yRa.d, AQa.P, (Xv)d2);
        a2.J((Gg)v41, (Xv)d2, (Random)b2, uua.p, vRa.d, tTa.h, DZ.getHorizontal(a2.J(QFa.UB, vRa.d)));
        int n8 = n3 = uSa.E;
        while (n8 < tTa.h) {
            int n9 = uSa.E;
            while (n9 < WOa.fa) {
                Cw_1 cw_125 = a2;
                cw_125.J((Gg)c2, n2, XTa.W, n3, (Xv)d2);
                cw_125.J((Gg)c2, QFa.yB.J(), n2++, pua.o, n3, (Xv)d2);
                n9 = n2;
            }
            n8 = ++n3;
        }
        a2.J((Gg)c2, (Xv)d2, AQa.P, vRa.d, uqa.g, uqa.g);
        return vRa.d != 0;
    }
}

