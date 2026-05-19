/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JSa
 *  QFa
 *  Uw
 *  Waa
 *  Xv
 *  fV
 *  pua
 *  tW
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;

public final class tW_1
extends fV {
    private boolean isRoofAccessible;

    public tW_1() {
        tW_1 a2;
    }

    public void f(Waa waa2) {
        tW_1 b2 = waa2;
        tW_1 a2 = this;
        tW_1 tW_12 = b2;
        super.f((Waa)tW_12);
        tW_12.J(JSa.e, a2.isRoofAccessible);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int b22;
        void c2;
        tW_1 d2 = xv2;
        tW_1 a2 = this;
        if (a2.field_143015_k < 0) {
            tW_1 tW_12 = a2;
            tW_12.field_143015_k = tW_12.J((Gg)c2, (Xv)d2);
            if (tW_12.field_143015_k < 0) {
                return vRa.d != 0;
            }
            tW_1 tW_13 = a2;
            a2.boundingBox.J(uSa.E, tW_13.field_143015_k - tW_13.boundingBox.maxY + uua.p - vRa.d, uSa.E);
        }
        tW_1 tW_14 = a2;
        void v3 = c2;
        tW_1 tW_15 = a2;
        void v5 = c2;
        tW_1 tW_16 = a2;
        void v7 = c2;
        tW_1 tW_17 = a2;
        void v9 = c2;
        tW_1 tW_18 = a2;
        void v11 = c2;
        tW_1 tW_19 = a2;
        void v13 = c2;
        tW_1 tW_110 = a2;
        void v15 = c2;
        tW_1 tW_111 = a2;
        void v17 = c2;
        tW_1 tW_112 = a2;
        void v19 = c2;
        tW_1 tW_113 = a2;
        void v21 = c2;
        a2.J((Gg)v21, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, uSa.E, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        tW_113.J((Gg)v21, (Xv)d2, uSa.E, AQa.P, uSa.E, AQa.P, AQa.P, AQa.P, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        tW_113.J((Gg)c2, (Xv)d2, vRa.d, AQa.P, vRa.d, yRa.d, AQa.P, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.f((Gg)v19, QFa.yB.J(), uSa.E, vRa.d, uSa.E, (Xv)d2);
        tW_112.f((Gg)v19, QFa.yB.J(), uSa.E, uqa.g, uSa.E, (Xv)d2);
        tW_112.f((Gg)c2, QFa.yB.J(), uSa.E, yRa.d, uSa.E, (Xv)d2);
        a2.f((Gg)v17, QFa.yB.J(), AQa.P, vRa.d, uSa.E, (Xv)d2);
        tW_111.f((Gg)v17, QFa.yB.J(), AQa.P, uqa.g, uSa.E, (Xv)d2);
        tW_111.f((Gg)c2, QFa.yB.J(), AQa.P, yRa.d, uSa.E, (Xv)d2);
        a2.f((Gg)v15, QFa.yB.J(), uSa.E, vRa.d, AQa.P, (Xv)d2);
        tW_110.f((Gg)v15, QFa.yB.J(), uSa.E, uqa.g, AQa.P, (Xv)d2);
        tW_110.f((Gg)c2, QFa.yB.J(), uSa.E, yRa.d, AQa.P, (Xv)d2);
        a2.f((Gg)v13, QFa.yB.J(), AQa.P, vRa.d, AQa.P, (Xv)d2);
        tW_19.f((Gg)v13, QFa.yB.J(), AQa.P, uqa.g, AQa.P, (Xv)d2);
        tW_19.f((Gg)c2, QFa.yB.J(), AQa.P, yRa.d, AQa.P, (Xv)d2);
        a2.J((Gg)v11, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, yRa.d, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        tW_18.J((Gg)v11, (Xv)d2, AQa.P, vRa.d, vRa.d, AQa.P, yRa.d, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        tW_18.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, AQa.P, yRa.d, yRa.d, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.f((Gg)v9, QFa.JB.J(), uSa.E, uqa.g, uqa.g, (Xv)d2);
        tW_17.f((Gg)v9, QFa.JB.J(), uqa.g, uqa.g, AQa.P, (Xv)d2);
        tW_17.f((Gg)c2, QFa.JB.J(), AQa.P, uqa.g, uqa.g, (Xv)d2);
        a2.f((Gg)v7, QFa.L.J(), vRa.d, vRa.d, uSa.E, (Xv)d2);
        tW_16.f((Gg)v7, QFa.L.J(), vRa.d, uqa.g, uSa.E, (Xv)d2);
        tW_16.f((Gg)c2, QFa.L.J(), vRa.d, yRa.d, uSa.E, (Xv)d2);
        a2.f((Gg)v5, QFa.L.J(), uqa.g, yRa.d, uSa.E, (Xv)d2);
        tW_15.f((Gg)v5, QFa.L.J(), yRa.d, yRa.d, uSa.E, (Xv)d2);
        tW_15.f((Gg)c2, QFa.L.J(), yRa.d, uqa.g, uSa.E, (Xv)d2);
        tW_14.f((Gg)v3, QFa.L.J(), yRa.d, vRa.d, uSa.E, (Xv)d2);
        if (tW_14.J((Gg)v3, uqa.g, uSa.E, pua.o, (Xv)d2).J().J() == Material.air && a2.J((Gg)c2, uqa.g, pua.o, pua.o, (Xv)d2).J().J() != Material.air) {
            tW_1 tW_114 = a2;
            tW_114.f((Gg)c2, QFa.We.J(tW_114.J(QFa.We, yRa.d)), uqa.g, uSa.E, pua.o, (Xv)d2);
        }
        tW_1 tW_115 = a2;
        tW_115.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, vRa.d, yRa.d, yRa.d, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        if (tW_115.isRoofAccessible) {
            tW_1 tW_116 = a2;
            void v25 = c2;
            tW_1 tW_117 = a2;
            void v27 = c2;
            tW_1 tW_118 = a2;
            void v29 = c2;
            tW_1 tW_119 = a2;
            void v31 = c2;
            tW_1 tW_120 = a2;
            void v33 = c2;
            a2.f((Gg)c2, QFa.U.J(), uSa.E, tTa.h, uSa.E, (Xv)d2);
            a2.f((Gg)v33, QFa.U.J(), vRa.d, tTa.h, uSa.E, (Xv)d2);
            tW_120.f((Gg)v33, QFa.U.J(), uqa.g, tTa.h, uSa.E, (Xv)d2);
            tW_120.f((Gg)c2, QFa.U.J(), yRa.d, tTa.h, uSa.E, (Xv)d2);
            a2.f((Gg)v31, QFa.U.J(), AQa.P, tTa.h, uSa.E, (Xv)d2);
            tW_119.f((Gg)v31, QFa.U.J(), uSa.E, tTa.h, AQa.P, (Xv)d2);
            tW_119.f((Gg)c2, QFa.U.J(), vRa.d, tTa.h, AQa.P, (Xv)d2);
            a2.f((Gg)v29, QFa.U.J(), uqa.g, tTa.h, AQa.P, (Xv)d2);
            tW_118.f((Gg)v29, QFa.U.J(), yRa.d, tTa.h, AQa.P, (Xv)d2);
            tW_118.f((Gg)c2, QFa.U.J(), AQa.P, tTa.h, AQa.P, (Xv)d2);
            a2.f((Gg)v27, QFa.U.J(), AQa.P, tTa.h, vRa.d, (Xv)d2);
            tW_117.f((Gg)v27, QFa.U.J(), AQa.P, tTa.h, uqa.g, (Xv)d2);
            tW_117.f((Gg)c2, QFa.U.J(), AQa.P, tTa.h, yRa.d, (Xv)d2);
            a2.f((Gg)v25, QFa.U.J(), uSa.E, tTa.h, vRa.d, (Xv)d2);
            tW_116.f((Gg)v25, QFa.U.J(), uSa.E, tTa.h, uqa.g, (Xv)d2);
            tW_116.f((Gg)c2, QFa.U.J(), uSa.E, tTa.h, yRa.d, (Xv)d2);
        }
        if (a2.isRoofAccessible) {
            tW_1 tW_121 = a2;
            void v35 = c2;
            tW_1 tW_122 = a2;
            int b22 = tW_122.J(QFa.z, yRa.d);
            tW_122.f((Gg)c2, QFa.z.J(b22), yRa.d, vRa.d, yRa.d, (Xv)d2);
            a2.f((Gg)v35, QFa.z.J(b22), yRa.d, uqa.g, yRa.d, (Xv)d2);
            tW_121.f((Gg)v35, QFa.z.J(b22), yRa.d, yRa.d, yRa.d, (Xv)d2);
            tW_121.f((Gg)c2, QFa.z.J(b22), yRa.d, AQa.P, yRa.d, (Xv)d2);
        }
        a2.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode), uqa.g, yRa.d, vRa.d, (Xv)d2);
        int n2 = b22 = uSa.E;
        while (n2 < tTa.h) {
            int n3 = uSa.E;
            while (n3 < tTa.h) {
                int n4;
                tW_1 tW_123 = a2;
                tW_123.J((Gg)c2, n4, uua.p, b22, (Xv)d2);
                tW_123.J((Gg)c2, QFa.yB.J(), n4++, pua.o, b22, (Xv)d2);
                n3 = n4;
            }
            n2 = ++b22;
        }
        a2.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, uqa.g, vRa.d);
        return vRa.d != 0;
    }

    public void J(Waa waa2) {
        tW_1 b2 = waa2;
        tW_1 a2 = this;
        super.J((Waa)b2);
        a2.isRoofAccessible = b2.f(JSa.e);
    }

    /*
     * WARNING - void declaration
     */
    public tW_1(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void c2;
        void b2;
        Object f2;
        void d2;
        void e2;
        tW_1 a2;
        tW_1 tW_12 = object;
        Object object = dZ2;
        tW_1 tW_13 = a2 = tW_12;
        super((Uw)e2, (int)d2);
        a2.coordBaseMode = f2;
        tW_13.boundingBox = b2;
        tW_13.isRoofAccessible = c2.nextBoolean();
    }

    /*
     * WARNING - void declaration
     */
    public static tW J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void f2;
        void a2;
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)tTa.h, (int)uua.p, (int)tTa.h, (DZ)b2);
        if (uU.J((List<uU>)g2, h22) != null) {
            return null;
        }
        return new tW_1(e2, (int)a2, (Random)f2, h22, (DZ)b2);
    }
}

