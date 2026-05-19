/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  ERa
 *  Gg
 *  Lra
 *  NTa
 *  Oz
 *  QFa
 *  Uw
 *  Waa
 *  XTa
 *  Xv
 *  fV
 *  hW
 *  lqa
 *  pPa
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public final class hW_1
extends fV {
    private Block cropTypeC;
    private Block cropTypeA;
    private Block cropTypeB;
    private Block cropTypeD;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        void c2;
        hW_1 d2 = xv2;
        hW_1 a2 = this;
        if (a2.field_143015_k < 0) {
            hW_1 hW_12 = a2;
            hW_12.field_143015_k = hW_12.J((Gg)c2, (Xv)d2);
            if (hW_12.field_143015_k < 0) {
                return vRa.d != 0;
            }
            hW_1 hW_13 = a2;
            a2.boundingBox.J(uSa.E, hW_13.field_143015_k - hW_13.boundingBox.maxY + AQa.P - vRa.d, uSa.E);
        }
        void v2 = c2;
        hW_1 hW_14 = d2;
        hW_1 hW_15 = a2;
        void v5 = c2;
        hW_1 hW_16 = d2;
        hW_1 hW_17 = a2;
        void v8 = c2;
        hW_1 hW_18 = d2;
        a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, uSa.E, lqa.s, AQa.P, Yqa.i, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)hW_18, vRa.d, uSa.E, vRa.d, uqa.g, uSa.E, XTa.W, QFa.rd.J(), QFa.rd.J(), uSa.E != 0);
        a2.J((Gg)v8, (Xv)hW_18, AQa.P, uSa.E, vRa.d, tTa.h, uSa.E, XTa.W, QFa.rd.J(), QFa.rd.J(), uSa.E != 0);
        hW_17.J((Gg)v8, (Xv)d2, XTa.W, uSa.E, vRa.d, Yqa.i, uSa.E, XTa.W, QFa.rd.J(), QFa.rd.J(), uSa.E != 0);
        hW_17.J((Gg)c2, (Xv)d2, NTa.C, uSa.E, vRa.d, pPa.f, uSa.E, XTa.W, QFa.rd.J(), QFa.rd.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)hW_16, uSa.E, uSa.E, uSa.E, uSa.E, uSa.E, Yqa.i, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)v5, (Xv)hW_16, uua.p, uSa.E, uSa.E, uua.p, uSa.E, Yqa.i, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        hW_15.J((Gg)v5, (Xv)d2, lqa.s, uSa.E, uSa.E, lqa.s, uSa.E, Yqa.i, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        hW_15.J((Gg)c2, (Xv)d2, vRa.d, uSa.E, uSa.E, pPa.f, uSa.E, uSa.E, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)hW_14, vRa.d, uSa.E, Yqa.i, pPa.f, uSa.E, Yqa.i, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)v2, (Xv)hW_14, yRa.d, uSa.E, vRa.d, yRa.d, uSa.E, XTa.W, QFa.sc.J(), QFa.sc.J(), uSa.E != 0);
        a2.J((Gg)v2, (Xv)d2, WOa.fa, uSa.E, vRa.d, WOa.fa, uSa.E, XTa.W, QFa.sc.J(), QFa.sc.J(), uSa.E != 0);
        int n3 = n2 = vRa.d;
        while (n3 <= XTa.W) {
            void b2;
            hW_1 hW_19 = a2;
            hW_1 hW_110 = a2;
            void v13 = c2;
            hW_1 hW_111 = a2;
            hW_1 hW_112 = a2;
            hW_1 hW_113 = a2;
            void v17 = c2;
            hW_1 hW_114 = a2;
            hW_114.f((Gg)c2, hW_114.cropTypeA.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), vRa.d, vRa.d, n2, (Xv)d2);
            hW_113.f((Gg)v17, hW_114.cropTypeA.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), uqa.g, vRa.d, n2, (Xv)d2);
            hW_112.f((Gg)v17, hW_113.cropTypeB.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), AQa.P, vRa.d, n2, (Xv)d2);
            hW_112.f((Gg)c2, hW_112.cropTypeB.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), tTa.h, vRa.d, n2, (Xv)d2);
            hW_111.f((Gg)c2, hW_111.cropTypeC.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), XTa.W, vRa.d, n2, (Xv)d2);
            hW_110.f((Gg)v13, hW_111.cropTypeC.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), Yqa.i, vRa.d, n2, (Xv)d2);
            hW_19.f((Gg)v13, hW_110.cropTypeD.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), NTa.C, vRa.d, n2, (Xv)d2);
            hW_19.f((Gg)c2, hW_19.cropTypeD.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), pPa.f, vRa.d, n2++, (Xv)d2);
            n3 = n2;
        }
        int n4 = n2 = uSa.E;
        while (n4 < WOa.fa) {
            int n5 = uSa.E;
            while (n5 < uua.s) {
                int b2;
                hW_1 hW_115 = a2;
                hW_115.J((Gg)c2, b2, AQa.P, n2, (Xv)d2);
                hW_115.J((Gg)c2, QFa.Bc.J(), b2++, pua.o, n2, (Xv)d2);
                n5 = b2;
            }
            n4 = ++n2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public hW_1(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void a2;
        void d2;
        void e2;
        hW_1 c2;
        Object f2 = random;
        hW_1 hW_12 = c2 = this;
        Object object = f2;
        hW_1 hW_13 = c2;
        super((Uw)e2, (int)d2);
        hW_13.coordBaseMode = a2;
        hW_13.boundingBox = b2;
        c2.cropTypeA = c2.J((Random)object);
        hW_12.cropTypeB = hW_12.J((Random)object);
        c2.cropTypeC = hW_12.J((Random)f2);
        c2.cropTypeD = c2.J((Random)f2);
    }

    /*
     * WARNING - void declaration
     */
    public static hW J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)uua.s, (int)AQa.P, (int)WOa.fa, (DZ)b2);
        if (hW_1.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new hW_1(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }

    public hW_1() {
        hW_1 a2;
    }

    public void f(Waa waa2) {
        hW_1 b2 = waa2;
        hW_1 a2 = this;
        hW_1 hW_12 = b2;
        super.f((Waa)hW_12);
        hW_1 hW_13 = b2;
        hW_13.J(Zra.q, (int)Block.blockRegistry.J((ResourceLocation)((Object)a2.cropTypeA)));
        hW_13.J(Ata.t, (int)Block.blockRegistry.J((ResourceLocation)((Object)a2.cropTypeB)));
        hW_12.J(Lra.w, (int)Block.blockRegistry.J((ResourceLocation)((Object)a2.cropTypeC)));
        hW_12.J(ERa.W, (int)Block.blockRegistry.J((ResourceLocation)((Object)a2.cropTypeD)));
    }

    public void J(Waa waa2) {
        hW_1 a2;
        hW_1 b2 = waa2;
        hW_1 hW_12 = a2 = this;
        hW_1 hW_13 = b2;
        super.J((Waa)b2);
        a2.cropTypeA = Block.f(b2.J(Zra.q));
        a2.cropTypeB = Block.f(hW_13.J(Ata.t));
        hW_12.cropTypeC = Block.f(hW_13.J(Lra.w));
        hW_12.cropTypeD = Block.f(b2.J(ERa.W));
    }

    /*
     * Enabled aggressive block sorting
     */
    private Block J(Random random) {
        Random b2 = random;
        hW_1 a2 = this;
        switch (b2.nextInt(tTa.h)) {
            case 0: {
                return QFa.FE;
            }
            case 1: {
                return QFa.LF;
            }
        }
        return QFa.Aa;
    }
}

