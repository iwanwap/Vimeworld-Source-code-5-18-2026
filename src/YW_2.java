/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Gg
 *  Oz
 *  QFa
 *  Uw
 *  Waa
 *  XTa
 *  Xv
 *  YW
 *  fV
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public final class YW_2
extends fV {
    private Block cropTypeA;
    private Block cropTypeB;

    public void f(Waa waa2) {
        YW_2 b2 = waa2;
        YW_2 a2 = this;
        YW_2 yW_2 = b2;
        super.f((Waa)yW_2);
        yW_2.J(Zra.q, (int)Block.blockRegistry.J((ResourceLocation)((Object)a2.cropTypeA)));
        yW_2.J(Ata.t, (int)Block.blockRegistry.J((ResourceLocation)((Object)a2.cropTypeB)));
    }

    /*
     * WARNING - void declaration
     */
    public YW_2(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void a2;
        void d2;
        void e2;
        Object f2 = random;
        YW_2 c2 = this;
        super((Uw)e2, (int)d2);
        c2.coordBaseMode = a2;
        c2.boundingBox = b2;
        c2.cropTypeA = c2.J((Random)f2);
        c2.cropTypeB = c2.J((Random)f2);
    }

    public void J(Waa waa2) {
        YW_2 a2;
        YW_2 b2 = waa2;
        YW_2 yW_2 = a2 = this;
        YW_2 yW_22 = b2;
        super.J((Waa)yW_22);
        yW_2.cropTypeA = Block.f(yW_22.J(Zra.q));
        yW_2.cropTypeB = Block.f(b2.J(Ata.t));
    }

    public YW_2() {
        YW_2 a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Block J(Random random) {
        Random b2 = random;
        YW_2 a2 = this;
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

    /*
     * WARNING - void declaration
     */
    public static YW J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)XTa.W, (int)AQa.P, (int)WOa.fa, (DZ)b2);
        if (YW_2.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new YW_2(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        void c2;
        YW_2 d2 = xv2;
        YW_2 a2 = this;
        if (a2.field_143015_k < 0) {
            YW_2 yW_2 = a2;
            yW_2.field_143015_k = yW_2.J((Gg)c2, (Xv)d2);
            if (yW_2.field_143015_k < 0) {
                return vRa.d != 0;
            }
            YW_2 yW_22 = a2;
            a2.boundingBox.J(uSa.E, yW_22.field_143015_k - yW_22.boundingBox.maxY + AQa.P - vRa.d, uSa.E);
        }
        void v2 = c2;
        YW_2 yW_2 = d2;
        YW_2 yW_23 = a2;
        void v5 = c2;
        YW_2 yW_24 = d2;
        a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, uSa.E, uua.p, AQa.P, Yqa.i, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)yW_24, vRa.d, uSa.E, vRa.d, uqa.g, uSa.E, XTa.W, QFa.rd.J(), QFa.rd.J(), uSa.E != 0);
        a2.J((Gg)v5, (Xv)yW_24, AQa.P, uSa.E, vRa.d, tTa.h, uSa.E, XTa.W, QFa.rd.J(), QFa.rd.J(), uSa.E != 0);
        yW_23.J((Gg)v5, (Xv)d2, uSa.E, uSa.E, uSa.E, uSa.E, uSa.E, Yqa.i, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        yW_23.J((Gg)c2, (Xv)d2, uua.p, uSa.E, uSa.E, uua.p, uSa.E, Yqa.i, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)yW_2, vRa.d, uSa.E, uSa.E, tTa.h, uSa.E, uSa.E, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)v2, (Xv)yW_2, vRa.d, uSa.E, Yqa.i, tTa.h, uSa.E, Yqa.i, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)v2, (Xv)d2, yRa.d, uSa.E, vRa.d, yRa.d, uSa.E, XTa.W, QFa.sc.J(), QFa.sc.J(), uSa.E != 0);
        int n3 = n2 = vRa.d;
        while (n3 <= XTa.W) {
            void b2;
            YW_2 yW_25 = a2;
            YW_2 yW_26 = a2;
            void v10 = c2;
            YW_2 yW_27 = a2;
            yW_27.f((Gg)c2, yW_27.cropTypeA.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), vRa.d, vRa.d, n2, (Xv)d2);
            yW_26.f((Gg)v10, yW_27.cropTypeA.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), uqa.g, vRa.d, n2, (Xv)d2);
            yW_25.f((Gg)v10, yW_26.cropTypeB.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), AQa.P, vRa.d, n2, (Xv)d2);
            yW_25.f((Gg)c2, yW_25.cropTypeB.J(Oz.J((Random)b2, (int)uqa.g, (int)XTa.W)), tTa.h, vRa.d, n2++, (Xv)d2);
            n3 = n2;
        }
        int n4 = n2 = uSa.E;
        while (n4 < WOa.fa) {
            int n5 = uSa.E;
            while (n5 < XTa.W) {
                int b2;
                YW_2 yW_28 = a2;
                yW_28.J((Gg)c2, b2, AQa.P, n2, (Xv)d2);
                yW_28.J((Gg)c2, QFa.Bc.J(), b2++, pua.o, n2, (Xv)d2);
                n5 = b2;
            }
            n4 = ++n2;
        }
        return vRa.d != 0;
    }
}

