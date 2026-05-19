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
 *  lqa
 *  pPa
 *  pua
 *  rU
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;

public final class rU_3
extends fV {
    public rU_3() {
        rU_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        int n2;
        int n3;
        void c2;
        rU_3 d2 = xv2;
        rU_3 a2 = this;
        if (a2.field_143015_k < 0) {
            rU_3 rU_32 = a2;
            rU_32.field_143015_k = rU_32.J((Gg)c2, (Xv)d2);
            if (rU_32.field_143015_k < 0) {
                return vRa.d != 0;
            }
            rU_3 rU_33 = a2;
            a2.boundingBox.J(uSa.E, rU_33.field_143015_k - rU_33.boundingBox.maxY + XTa.W - vRa.d, uSa.E);
        }
        rU_3 rU_34 = a2;
        rU_3 rU_35 = a2;
        void v4 = c2;
        rU_3 rU_36 = a2;
        void v6 = c2;
        rU_3 rU_37 = d2;
        rU_3 rU_38 = a2;
        void v9 = c2;
        rU_3 rU_39 = d2;
        rU_3 rU_310 = a2;
        void v12 = c2;
        rU_3 rU_311 = d2;
        rU_3 rU_312 = a2;
        void v15 = c2;
        rU_3 rU_313 = d2;
        a2.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, vRa.d, XTa.W, AQa.P, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)rU_313, uqa.g, vRa.d, uua.p, Yqa.i, AQa.P, NTa.C, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)v15, (Xv)rU_313, uqa.g, uSa.E, tTa.h, Yqa.i, uSa.E, NTa.C, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        rU_312.J((Gg)v15, (Xv)d2, vRa.d, uSa.E, vRa.d, XTa.W, uSa.E, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        rU_312.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, uSa.E, yRa.d, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)rU_311, Yqa.i, uSa.E, uSa.E, Yqa.i, yRa.d, NTa.C, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v12, (Xv)rU_311, vRa.d, uSa.E, uSa.E, XTa.W, uqa.g, uSa.E, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        rU_310.J((Gg)v12, (Xv)d2, vRa.d, uSa.E, tTa.h, uqa.g, vRa.d, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        rU_310.J((Gg)c2, (Xv)d2, uqa.g, uSa.E, uua.p, uqa.g, yRa.d, NTa.C, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)rU_39, yRa.d, uSa.E, NTa.C, XTa.W, yRa.d, NTa.C, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v9, (Xv)rU_39, vRa.d, uqa.g, uSa.E, XTa.W, yRa.d, uSa.E, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        rU_38.J((Gg)v9, (Xv)d2, vRa.d, uqa.g, tTa.h, uqa.g, yRa.d, tTa.h, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        rU_38.J((Gg)c2, (Xv)d2, uSa.E, AQa.P, vRa.d, Yqa.i, AQa.P, vRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)rU_37, uSa.E, AQa.P, AQa.P, yRa.d, AQa.P, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)v6, (Xv)rU_37, uSa.E, tTa.h, uqa.g, Yqa.i, tTa.h, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        rU_36.f((Gg)v6, QFa.L.J(), uSa.E, AQa.P, uqa.g, (Xv)d2);
        rU_36.f((Gg)c2, QFa.L.J(), uSa.E, AQa.P, yRa.d, (Xv)d2);
        a2.f((Gg)v4, QFa.L.J(), Yqa.i, AQa.P, uqa.g, (Xv)d2);
        rU_35.f((Gg)v4, QFa.L.J(), Yqa.i, AQa.P, yRa.d, (Xv)d2);
        rU_34.f((Gg)c2, QFa.L.J(), Yqa.i, AQa.P, AQa.P, (Xv)d2);
        int n4 = rU_35.J(QFa.WA, yRa.d);
        int n5 = rU_34.J(QFa.WA, uqa.g);
        int n6 = n3 = pua.o;
        while (n6 <= uqa.g) {
            int n7 = uSa.E;
            while (n7 <= Yqa.i) {
                a2.f((Gg)c2, QFa.WA.J(n4), n2, AQa.P + n3, n3, (Xv)d2);
                if (!(n3 <= pua.o && n2 > vRa.d || n3 <= 0 && n2 > yRa.d || n3 <= vRa.d && n2 > AQa.P && n2 < uua.p)) {
                    a2.f((Gg)c2, QFa.WA.J(n5), n2, AQa.P + n3, tTa.h - n3, (Xv)d2);
                }
                n7 = ++n2;
            }
            n6 = ++n3;
        }
        rU_3 rU_314 = a2;
        void v20 = c2;
        rU_3 rU_315 = d2;
        a2.J((Gg)c2, (Xv)d2, yRa.d, AQa.P, tTa.h, yRa.d, AQa.P, NTa.C, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)rU_315, XTa.W, AQa.P, uqa.g, XTa.W, AQa.P, NTa.C, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)v20, (Xv)rU_315, AQa.P, tTa.h, AQa.P, AQa.P, tTa.h, NTa.C, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        rU_314.J((Gg)v20, (Xv)d2, uua.p, tTa.h, AQa.P, uua.p, tTa.h, NTa.C, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        rU_314.J((Gg)c2, (Xv)d2, tTa.h, uua.p, yRa.d, tTa.h, uua.p, NTa.C, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        n3 = a2.J(QFa.WA, uSa.E);
        int n8 = n2 = AQa.P;
        while (n8 >= vRa.d) {
            int n9 = n2;
            a2.f((Gg)c2, QFa.L.J(), n9, uqa.g + n2, XTa.W - n9, (Xv)d2);
            int n10 = Yqa.i - n2;
            while (n10 <= NTa.C) {
                int n11 = n2;
                a2.f((Gg)c2, QFa.WA.J(n3), n11, uqa.g + n11, n4++, (Xv)d2);
                n10 = n4;
            }
            n8 = --n2;
        }
        rU_3 rU_316 = a2;
        void v27 = c2;
        rU_3 rU_317 = a2;
        n2 = rU_317.J(QFa.WA, vRa.d);
        rU_317.f((Gg)c2, QFa.L.J(), uua.p, uua.p, yRa.d, (Xv)d2);
        rU_316.f((Gg)v27, QFa.L.J(), XTa.W, tTa.h, AQa.P, (Xv)d2);
        rU_316.f((Gg)v27, QFa.WA.J(n2), uua.p, uua.p, AQa.P, (Xv)d2);
        int n12 = n4 = uua.p;
        while (n12 <= Yqa.i) {
            int n13 = tTa.h;
            while (n13 <= NTa.C) {
                int n14 = n4;
                a2.f((Gg)c2, QFa.WA.J(n2), n14, lqa.s - n14, n5++, (Xv)d2);
                n13 = n5;
            }
            n12 = ++n4;
        }
        rU_3 rU_318 = a2;
        void v33 = c2;
        rU_3 rU_319 = d2;
        rU_3 rU_320 = a2;
        void v36 = c2;
        rU_3 rU_321 = a2;
        void v38 = c2;
        rU_3 rU_322 = a2;
        void v40 = c2;
        rU_3 rU_323 = a2;
        void v42 = c2;
        rU_3 rU_324 = a2;
        void v44 = c2;
        rU_3 rU_325 = a2;
        void v46 = c2;
        rU_3 rU_326 = a2;
        void v48 = c2;
        rU_3 rU_327 = a2;
        void v50 = c2;
        rU_3 rU_328 = a2;
        void v52 = c2;
        a2.f((Gg)v52, QFa.UA.J(), uSa.E, uqa.g, vRa.d, (Xv)d2);
        rU_328.f((Gg)v52, QFa.UA.J(), uSa.E, uqa.g, AQa.P, (Xv)d2);
        rU_328.f((Gg)c2, QFa.JB.J(), uSa.E, uqa.g, uqa.g, (Xv)d2);
        a2.f((Gg)v50, QFa.JB.J(), uSa.E, uqa.g, yRa.d, (Xv)d2);
        rU_327.f((Gg)v50, QFa.UA.J(), AQa.P, uqa.g, uSa.E, (Xv)d2);
        rU_327.f((Gg)c2, QFa.JB.J(), tTa.h, uqa.g, uSa.E, (Xv)d2);
        a2.f((Gg)v48, QFa.UA.J(), uua.p, uqa.g, uSa.E, (Xv)d2);
        rU_326.f((Gg)v48, QFa.UA.J(), Yqa.i, uqa.g, vRa.d, (Xv)d2);
        rU_326.f((Gg)c2, QFa.JB.J(), Yqa.i, uqa.g, uqa.g, (Xv)d2);
        a2.f((Gg)v46, QFa.JB.J(), Yqa.i, uqa.g, yRa.d, (Xv)d2);
        rU_325.f((Gg)v46, QFa.UA.J(), Yqa.i, uqa.g, AQa.P, (Xv)d2);
        rU_325.f((Gg)c2, QFa.L.J(), Yqa.i, uqa.g, tTa.h, (Xv)d2);
        a2.f((Gg)v44, QFa.UA.J(), Yqa.i, uqa.g, uua.p, (Xv)d2);
        rU_324.f((Gg)v44, QFa.JB.J(), Yqa.i, uqa.g, XTa.W, (Xv)d2);
        rU_324.f((Gg)c2, QFa.JB.J(), Yqa.i, uqa.g, Yqa.i, (Xv)d2);
        a2.f((Gg)v42, QFa.UA.J(), Yqa.i, uqa.g, WOa.fa, (Xv)d2);
        rU_323.f((Gg)v42, QFa.UA.J(), uqa.g, uqa.g, uua.p, (Xv)d2);
        rU_323.f((Gg)c2, QFa.JB.J(), uqa.g, uqa.g, XTa.W, (Xv)d2);
        a2.f((Gg)v40, QFa.JB.J(), uqa.g, uqa.g, Yqa.i, (Xv)d2);
        rU_322.f((Gg)v40, QFa.UA.J(), uqa.g, uqa.g, WOa.fa, (Xv)d2);
        rU_322.f((Gg)c2, QFa.UA.J(), AQa.P, AQa.P, NTa.C, (Xv)d2);
        a2.f((Gg)v38, QFa.JB.J(), tTa.h, AQa.P, NTa.C, (Xv)d2);
        rU_321.f((Gg)v38, QFa.UA.J(), uua.p, AQa.P, NTa.C, (Xv)d2);
        rU_321.f((Gg)c2, QFa.L.J(), tTa.h, tTa.h, NTa.C, (Xv)d2);
        a2.f((Gg)v36, QFa.HF.J(), uqa.g, vRa.d, uSa.E, (Xv)d2);
        rU_320.f((Gg)v36, QFa.HF.J(), uqa.g, uqa.g, uSa.E, (Xv)d2);
        rU_320.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode), uqa.g, yRa.d, vRa.d, (Xv)d2);
        a2.J((Gg)c2, (Xv)rU_319, (Random)b2, uqa.g, vRa.d, uSa.E, DZ.getHorizontal(a2.J(QFa.UB, vRa.d)));
        rU_318.J((Gg)v33, (Xv)rU_319, vRa.d, uSa.E, pua.o, yRa.d, uqa.g, pua.o, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        if (rU_318.J((Gg)v33, uqa.g, uSa.E, pua.o, (Xv)d2).J().J() == Material.air && a2.J((Gg)c2, uqa.g, pua.o, pua.o, (Xv)d2).J().J() != Material.air) {
            rU_3 rU_329 = a2;
            rU_329.f((Gg)c2, QFa.We.J(rU_329.J(QFa.We, yRa.d)), uqa.g, uSa.E, pua.o, (Xv)d2);
        }
        int n15 = n4 = uSa.E;
        while (n15 < tTa.h) {
            int n16 = uSa.E;
            while (n16 < WOa.fa) {
                rU_3 rU_330 = a2;
                rU_330.J((Gg)c2, n5, XTa.W, n4, (Xv)d2);
                rU_330.J((Gg)c2, QFa.yB.J(), n5++, pua.o, n4, (Xv)d2);
                n16 = n5;
            }
            n15 = ++n4;
        }
        int n17 = n4 = tTa.h;
        while (n17 < pPa.f) {
            int n18 = uqa.g;
            while (n18 < WOa.fa) {
                rU_3 rU_331 = a2;
                rU_331.J((Gg)c2, n5, XTa.W, n4, (Xv)d2);
                rU_331.J((Gg)c2, QFa.yB.J(), n5++, pua.o, n4, (Xv)d2);
                n18 = n5;
            }
            n17 = ++n4;
        }
        a2.J((Gg)c2, (Xv)d2, AQa.P, vRa.d, uqa.g, uqa.g);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public rU_3(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object f2;
        void d2;
        void e2;
        rU_3 a2;
        rU_3 rU_32 = object;
        Object object = dZ2;
        rU_3 rU_33 = a2 = rU_32;
        super((Uw)e2, (int)d2);
        rU_33.coordBaseMode = f2;
        rU_33.boundingBox = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static rU J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)WOa.fa, (int)XTa.W, (int)lqa.s, (DZ)b2);
        if (rU_3.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new rU_3(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }
}

