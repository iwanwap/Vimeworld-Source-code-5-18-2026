/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AW
 *  Gg
 *  QFa
 *  Uw
 *  XTa
 *  Xv
 *  fV
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;

public final class AW_2
extends fV {
    /*
     * WARNING - void declaration
     */
    public AW_2(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object f2;
        void d2;
        void e2;
        AW_2 a2;
        AW_2 aW_2 = object;
        Object object = dZ2;
        AW_2 aW_22 = a2 = aW_2;
        super((Uw)e2, (int)d2);
        aW_22.coordBaseMode = f2;
        aW_22.boundingBox = b2;
    }

    public AW_2() {
        AW_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        int n2;
        int n3;
        void c2;
        AW_2 d2 = xv2;
        AW_2 a2 = this;
        if (a2.field_143015_k < 0) {
            AW_2 aW_2 = a2;
            aW_2.field_143015_k = aW_2.J((Gg)c2, (Xv)d2);
            if (aW_2.field_143015_k < 0) {
                return vRa.d != 0;
            }
            AW_2 aW_22 = a2;
            a2.boundingBox.J(uSa.E, aW_22.field_143015_k - aW_22.boundingBox.maxY + WOa.fa - vRa.d, uSa.E);
        }
        AW_2 aW_2 = a2;
        AW_2 aW_23 = a2;
        void v4 = c2;
        AW_2 aW_24 = d2;
        a2.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, vRa.d, XTa.W, tTa.h, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)aW_24, uSa.E, uSa.E, uSa.E, Yqa.i, uSa.E, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v4, (Xv)aW_24, uSa.E, tTa.h, uSa.E, Yqa.i, tTa.h, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        aW_23.J((Gg)v4, (Xv)d2, uSa.E, uua.p, vRa.d, Yqa.i, uua.p, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        aW_23.J((Gg)c2, (Xv)d2, uSa.E, XTa.W, uqa.g, Yqa.i, XTa.W, yRa.d, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        int n4 = aW_2.J(QFa.WA, yRa.d);
        int n5 = aW_2.J(QFa.WA, uqa.g);
        int n6 = n3 = pua.o;
        while (n6 <= uqa.g) {
            int n7 = uSa.E;
            while (n7 <= Yqa.i) {
                AW_2 aW_25 = a2;
                aW_25.f((Gg)c2, QFa.WA.J(n4), n2, uua.p + n3, n3, (Xv)d2);
                aW_25.f((Gg)c2, QFa.WA.J(n5), n2++, uua.p + n3, tTa.h - n3, (Xv)d2);
                n7 = n2;
            }
            n6 = ++n3;
        }
        AW_2 aW_26 = a2;
        void v10 = c2;
        AW_2 aW_27 = a2;
        void v12 = c2;
        AW_2 aW_28 = a2;
        void v14 = c2;
        AW_2 aW_29 = a2;
        void v16 = c2;
        AW_2 aW_210 = a2;
        AW_2 aW_211 = a2;
        void v19 = c2;
        AW_2 aW_212 = a2;
        void v21 = c2;
        AW_2 aW_213 = d2;
        AW_2 aW_214 = a2;
        void v24 = c2;
        AW_2 aW_215 = a2;
        void v26 = c2;
        AW_2 aW_216 = a2;
        void v28 = c2;
        AW_2 aW_217 = a2;
        void v30 = c2;
        AW_2 aW_218 = a2;
        void v32 = c2;
        AW_2 aW_219 = a2;
        void v34 = c2;
        AW_2 aW_220 = a2;
        void v36 = c2;
        AW_2 aW_221 = d2;
        AW_2 aW_222 = a2;
        void v39 = c2;
        AW_2 aW_223 = d2;
        AW_2 aW_224 = a2;
        void v42 = c2;
        AW_2 aW_225 = d2;
        a2.J((Gg)c2, (Xv)aW_225, uSa.E, vRa.d, uSa.E, uSa.E, vRa.d, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v42, (Xv)aW_225, vRa.d, vRa.d, tTa.h, Yqa.i, vRa.d, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        aW_224.J((Gg)v42, (Xv)d2, Yqa.i, vRa.d, uSa.E, Yqa.i, vRa.d, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        aW_224.J((Gg)c2, (Xv)d2, uqa.g, vRa.d, uSa.E, XTa.W, vRa.d, uSa.E, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)aW_223, uSa.E, uqa.g, uSa.E, uSa.E, AQa.P, uSa.E, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v39, (Xv)aW_223, uSa.E, uqa.g, tTa.h, uSa.E, AQa.P, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        aW_222.J((Gg)v39, (Xv)d2, Yqa.i, uqa.g, tTa.h, Yqa.i, AQa.P, tTa.h, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        aW_222.J((Gg)c2, (Xv)d2, Yqa.i, uqa.g, uSa.E, Yqa.i, AQa.P, uSa.E, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)aW_221, uSa.E, uqa.g, vRa.d, uSa.E, AQa.P, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)v36, (Xv)aW_221, vRa.d, uqa.g, tTa.h, XTa.W, AQa.P, tTa.h, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        aW_220.J((Gg)v36, (Xv)d2, Yqa.i, uqa.g, vRa.d, Yqa.i, AQa.P, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        aW_220.J((Gg)c2, (Xv)d2, vRa.d, uqa.g, uSa.E, XTa.W, AQa.P, uSa.E, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.f((Gg)v34, QFa.JB.J(), AQa.P, uqa.g, uSa.E, (Xv)d2);
        aW_219.f((Gg)v34, QFa.JB.J(), tTa.h, uqa.g, uSa.E, (Xv)d2);
        aW_219.f((Gg)c2, QFa.JB.J(), uua.p, uqa.g, uSa.E, (Xv)d2);
        a2.f((Gg)v32, QFa.JB.J(), AQa.P, yRa.d, uSa.E, (Xv)d2);
        aW_218.f((Gg)v32, QFa.JB.J(), tTa.h, yRa.d, uSa.E, (Xv)d2);
        aW_218.f((Gg)c2, QFa.JB.J(), uua.p, yRa.d, uSa.E, (Xv)d2);
        a2.f((Gg)v30, QFa.JB.J(), uSa.E, uqa.g, uqa.g, (Xv)d2);
        aW_217.f((Gg)v30, QFa.JB.J(), uSa.E, uqa.g, yRa.d, (Xv)d2);
        aW_217.f((Gg)c2, QFa.JB.J(), uSa.E, yRa.d, uqa.g, (Xv)d2);
        a2.f((Gg)v28, QFa.JB.J(), uSa.E, yRa.d, yRa.d, (Xv)d2);
        aW_216.f((Gg)v28, QFa.JB.J(), Yqa.i, uqa.g, uqa.g, (Xv)d2);
        aW_216.f((Gg)c2, QFa.JB.J(), Yqa.i, uqa.g, yRa.d, (Xv)d2);
        a2.f((Gg)v26, QFa.JB.J(), Yqa.i, yRa.d, uqa.g, (Xv)d2);
        aW_215.f((Gg)v26, QFa.JB.J(), Yqa.i, yRa.d, yRa.d, (Xv)d2);
        aW_215.f((Gg)c2, QFa.JB.J(), uqa.g, uqa.g, tTa.h, (Xv)d2);
        a2.f((Gg)v24, QFa.JB.J(), yRa.d, uqa.g, tTa.h, (Xv)d2);
        aW_214.f((Gg)v24, QFa.JB.J(), tTa.h, uqa.g, tTa.h, (Xv)d2);
        aW_214.f((Gg)c2, QFa.JB.J(), uua.p, uqa.g, tTa.h, (Xv)d2);
        a2.J((Gg)c2, (Xv)aW_213, vRa.d, AQa.P, vRa.d, XTa.W, AQa.P, vRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)v21, (Xv)aW_213, vRa.d, AQa.P, AQa.P, XTa.W, AQa.P, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        aW_212.J((Gg)v21, (Xv)d2, vRa.d, yRa.d, AQa.P, XTa.W, yRa.d, AQa.P, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
        aW_212.f((Gg)c2, QFa.L.J(), XTa.W, vRa.d, AQa.P, (Xv)d2);
        aW_211.f((Gg)v19, QFa.WA.J(a2.J(QFa.WA, uSa.E)), XTa.W, vRa.d, yRa.d, (Xv)d2);
        n3 = aW_211.J(QFa.WA, yRa.d);
        aW_210.f((Gg)v19, QFa.WA.J(n3), uua.p, vRa.d, AQa.P, (Xv)d2);
        aW_210.f((Gg)c2, QFa.WA.J(n3), tTa.h, vRa.d, AQa.P, (Xv)d2);
        a2.f((Gg)v16, QFa.WA.J(n3), AQa.P, vRa.d, AQa.P, (Xv)d2);
        aW_29.f((Gg)v16, QFa.WA.J(n3), yRa.d, vRa.d, AQa.P, (Xv)d2);
        aW_29.f((Gg)c2, QFa.U.J(), uua.p, vRa.d, yRa.d, (Xv)d2);
        a2.f((Gg)v14, QFa.Te.J(), uua.p, uqa.g, yRa.d, (Xv)d2);
        aW_28.f((Gg)v14, QFa.U.J(), AQa.P, vRa.d, yRa.d, (Xv)d2);
        aW_28.f((Gg)c2, QFa.Te.J(), AQa.P, uqa.g, yRa.d, (Xv)d2);
        a2.f((Gg)v12, QFa.IE.J(), XTa.W, vRa.d, vRa.d, (Xv)d2);
        aW_27.f((Gg)v12, QFa.HF.J(), vRa.d, vRa.d, uSa.E, (Xv)d2);
        aW_27.f((Gg)c2, QFa.HF.J(), vRa.d, uqa.g, uSa.E, (Xv)d2);
        aW_26.J((Gg)v10, (Xv)d2, (Random)b2, vRa.d, vRa.d, uSa.E, DZ.getHorizontal(a2.J(QFa.UB, vRa.d)));
        if (aW_26.J((Gg)v10, vRa.d, uSa.E, pua.o, (Xv)d2).J().J() == Material.air && a2.J((Gg)c2, vRa.d, pua.o, pua.o, (Xv)d2).J().J() != Material.air) {
            AW_2 aW_226 = a2;
            aW_226.f((Gg)c2, QFa.We.J(aW_226.J(QFa.We, yRa.d)), vRa.d, uSa.E, pua.o, (Xv)d2);
        }
        int n8 = n2 = uSa.E;
        while (n8 < uua.p) {
            int n9 = uSa.E;
            while (n9 < WOa.fa) {
                AW_2 aW_227 = a2;
                aW_227.J((Gg)c2, b2, WOa.fa, n2, (Xv)d2);
                aW_227.J((Gg)c2, QFa.yB.J(), b2++, pua.o, n2, (Xv)d2);
                n9 = b2;
            }
            n8 = ++n2;
        }
        a2.J((Gg)c2, (Xv)d2, uqa.g, vRa.d, uqa.g, vRa.d);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static AW J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)WOa.fa, (int)WOa.fa, (int)uua.p, (DZ)b2);
        if (AW_2.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new AW_2(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }

    public int l(int n2, int n3) {
        int c2 = n3;
        AW_2 a2 = this;
        return vRa.d;
    }
}

