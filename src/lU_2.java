/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  Uw
 *  XTa
 *  Xv
 *  fV
 *  lU
 *  lqa
 *  pPa
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;

public final class lU_2
extends fV {
    /*
     * WARNING - void declaration
     */
    public lU_2(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object f2;
        void d2;
        void e2;
        lU_2 a2;
        lU_2 lU_22 = object;
        Object object = dZ2;
        lU_2 lU_23 = a2 = lU_22;
        super((Uw)e2, (int)d2);
        lU_23.coordBaseMode = f2;
        lU_23.boundingBox = b2;
    }

    public lU_2() {
        lU_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static lU J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)tTa.h, (int)lqa.s, (int)WOa.fa, (DZ)b2);
        if (lU_2.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new lU_2(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        int n2;
        void c2;
        lU_2 d2 = xv2;
        lU_2 a2 = this;
        if (a2.field_143015_k < 0) {
            lU_2 lU_22 = a2;
            lU_22.field_143015_k = lU_22.J((Gg)c2, (Xv)d2);
            if (lU_22.field_143015_k < 0) {
                return vRa.d != 0;
            }
            lU_2 lU_23 = a2;
            a2.boundingBox.J(uSa.E, lU_23.field_143015_k - lU_23.boundingBox.maxY + lqa.s - vRa.d, uSa.E);
        }
        lU_2 lU_24 = a2;
        void v3 = c2;
        lU_2 lU_25 = a2;
        void v5 = c2;
        lU_2 lU_26 = a2;
        void v7 = c2;
        lU_2 lU_27 = a2;
        void v9 = c2;
        lU_2 lU_28 = a2;
        void v11 = c2;
        lU_2 lU_29 = a2;
        void v13 = c2;
        lU_2 lU_210 = a2;
        void v15 = c2;
        void v16 = c2;
        lU_2 lU_211 = a2;
        void v18 = c2;
        lU_2 lU_212 = a2;
        void v20 = c2;
        lU_2 lU_213 = a2;
        void v22 = c2;
        lU_2 lU_214 = a2;
        void v24 = c2;
        lU_2 lU_215 = d2;
        lU_2 lU_216 = a2;
        void v27 = c2;
        lU_2 lU_217 = d2;
        lU_2 lU_218 = a2;
        void v30 = c2;
        lU_2 lU_219 = d2;
        a2.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, vRa.d, yRa.d, yRa.d, XTa.W, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)lU_219, vRa.d, tTa.h, vRa.d, yRa.d, WOa.fa, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)v30, (Xv)lU_219, vRa.d, uSa.E, uSa.E, yRa.d, uSa.E, Yqa.i, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        lU_218.J((Gg)v30, (Xv)d2, vRa.d, vRa.d, uSa.E, yRa.d, NTa.C, uSa.E, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        lU_218.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, NTa.C, yRa.d, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)lU_217, AQa.P, vRa.d, vRa.d, AQa.P, NTa.C, yRa.d, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v27, (Xv)lU_217, uSa.E, uSa.E, AQa.P, uSa.E, AQa.P, XTa.W, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        lU_216.J((Gg)v27, (Xv)d2, AQa.P, uSa.E, AQa.P, AQa.P, AQa.P, XTa.W, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        lU_216.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, Yqa.i, yRa.d, AQa.P, Yqa.i, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)lU_215, vRa.d, tTa.h, AQa.P, yRa.d, NTa.C, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v24, (Xv)lU_215, vRa.d, tTa.h, tTa.h, yRa.d, tTa.h, XTa.W, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        lU_214.J((Gg)v24, (Xv)d2, uSa.E, WOa.fa, uSa.E, AQa.P, WOa.fa, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        lU_214.J((Gg)c2, (Xv)d2, uSa.E, AQa.P, uSa.E, AQa.P, AQa.P, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.f((Gg)v22, QFa.yB.J(), uSa.E, pPa.f, uqa.g, (Xv)d2);
        lU_213.f((Gg)v22, QFa.yB.J(), AQa.P, pPa.f, uqa.g, (Xv)d2);
        lU_213.f((Gg)c2, QFa.yB.J(), uqa.g, pPa.f, uSa.E, (Xv)d2);
        a2.f((Gg)v20, QFa.yB.J(), uqa.g, pPa.f, AQa.P, (Xv)d2);
        lU_212.f((Gg)v20, QFa.yB.J(), vRa.d, vRa.d, uua.p, (Xv)d2);
        lU_212.f((Gg)c2, QFa.yB.J(), vRa.d, vRa.d, XTa.W, (Xv)d2);
        a2.f((Gg)v18, QFa.yB.J(), uqa.g, vRa.d, XTa.W, (Xv)d2);
        lU_211.f((Gg)v18, QFa.yB.J(), yRa.d, vRa.d, uua.p, (Xv)d2);
        lU_211.f((Gg)v16, QFa.yB.J(), yRa.d, vRa.d, XTa.W, (Xv)d2);
        lU_2 lU_220 = a2;
        lU_220.f((Gg)v16, QFa.We.J(lU_220.J(QFa.We, yRa.d)), vRa.d, vRa.d, tTa.h, (Xv)d2);
        lU_2 lU_221 = a2;
        lU_221.f((Gg)v16, QFa.We.J(lU_221.J(QFa.We, yRa.d)), uqa.g, vRa.d, uua.p, (Xv)d2);
        lU_2 lU_222 = a2;
        lU_222.f((Gg)v16, QFa.We.J(lU_222.J(QFa.We, yRa.d)), yRa.d, vRa.d, tTa.h, (Xv)d2);
        a2.f((Gg)v15, QFa.We.J(a2.J(QFa.We, vRa.d)), vRa.d, uqa.g, XTa.W, (Xv)d2);
        lU_210.f((Gg)v15, QFa.We.J(a2.J(QFa.We, uSa.E)), yRa.d, uqa.g, XTa.W, (Xv)d2);
        lU_210.f((Gg)c2, QFa.JB.J(), uSa.E, uqa.g, uqa.g, (Xv)d2);
        a2.f((Gg)v13, QFa.JB.J(), uSa.E, yRa.d, uqa.g, (Xv)d2);
        lU_29.f((Gg)v13, QFa.JB.J(), AQa.P, uqa.g, uqa.g, (Xv)d2);
        lU_29.f((Gg)c2, QFa.JB.J(), AQa.P, yRa.d, uqa.g, (Xv)d2);
        a2.f((Gg)v11, QFa.JB.J(), uSa.E, uua.p, uqa.g, (Xv)d2);
        lU_28.f((Gg)v11, QFa.JB.J(), uSa.E, XTa.W, uqa.g, (Xv)d2);
        lU_28.f((Gg)c2, QFa.JB.J(), AQa.P, uua.p, uqa.g, (Xv)d2);
        a2.f((Gg)v9, QFa.JB.J(), AQa.P, XTa.W, uqa.g, (Xv)d2);
        lU_27.f((Gg)v9, QFa.JB.J(), uqa.g, uua.p, uSa.E, (Xv)d2);
        lU_27.f((Gg)c2, QFa.JB.J(), uqa.g, XTa.W, uSa.E, (Xv)d2);
        a2.f((Gg)v7, QFa.JB.J(), uqa.g, uua.p, AQa.P, (Xv)d2);
        lU_26.f((Gg)v7, QFa.JB.J(), uqa.g, XTa.W, AQa.P, (Xv)d2);
        lU_26.f((Gg)c2, QFa.JB.J(), uSa.E, yRa.d, uua.p, (Xv)d2);
        a2.f((Gg)v5, QFa.JB.J(), AQa.P, yRa.d, uua.p, (Xv)d2);
        lU_25.f((Gg)v5, QFa.JB.J(), uqa.g, yRa.d, Yqa.i, (Xv)d2);
        lU_25.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode.getOpposite()), uqa.g, AQa.P, XTa.W, (Xv)d2);
        a2.f((Gg)v3, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode.rotateY()), vRa.d, AQa.P, uua.p, (Xv)d2);
        lU_24.f((Gg)v3, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode.rotateYCCW()), yRa.d, AQa.P, uua.p, (Xv)d2);
        lU_24.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode), uqa.g, AQa.P, tTa.h, (Xv)d2);
        int n3 = a2.J(QFa.z, AQa.P);
        int n4 = n2 = vRa.d;
        while (n4 <= WOa.fa) {
            a2.f((Gg)c2, QFa.z.J(n3), yRa.d, n2++, yRa.d, (Xv)d2);
            n4 = n2;
        }
        lU_2 lU_223 = a2;
        void v37 = c2;
        lU_2 lU_224 = a2;
        lU_224.f((Gg)c2, QFa.HF.J(), uqa.g, vRa.d, uSa.E, (Xv)d2);
        lU_224.f((Gg)c2, QFa.HF.J(), uqa.g, uqa.g, uSa.E, (Xv)d2);
        lU_223.J((Gg)v37, (Xv)d2, (Random)b2, uqa.g, vRa.d, uSa.E, DZ.getHorizontal(a2.J(QFa.UB, vRa.d)));
        if (lU_223.J((Gg)v37, uqa.g, uSa.E, pua.o, (Xv)d2).J().J() == Material.air && a2.J((Gg)c2, uqa.g, pua.o, pua.o, (Xv)d2).J().J() != Material.air) {
            lU_2 lU_225 = a2;
            lU_225.f((Gg)c2, QFa.We.J(lU_225.J(QFa.We, yRa.d)), uqa.g, uSa.E, pua.o, (Xv)d2);
        }
        int n5 = n2 = uSa.E;
        while (n5 < WOa.fa) {
            int n6 = uSa.E;
            while (n6 < tTa.h) {
                lU_2 lU_226 = a2;
                lU_226.J((Gg)c2, b2, lqa.s, n2, (Xv)d2);
                lU_226.J((Gg)c2, QFa.yB.J(), b2++, pua.o, n2, (Xv)d2);
                n6 = b2;
            }
            n5 = ++n2;
        }
        a2.J((Gg)c2, (Xv)d2, uqa.g, vRa.d, uqa.g, vRa.d);
        return vRa.d != 0;
    }

    public int l(int n2, int n3) {
        int c2 = n3;
        lU_2 a2 = this;
        return uqa.g;
    }
}

