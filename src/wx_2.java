/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  TV
 *  Waa
 *  Wv
 *  XTa
 *  Xv
 *  aPa
 *  bqa
 *  jpa
 *  lW
 *  pPa
 *  pua
 *  vRa
 *  ww
 *  wx
 *  ysa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockStoneSlab$EnumType;

public class wx_2
extends Wv {
    private boolean field_75024_a;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public wx_2(int n2, Random random, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        wx_2 a2 = this;
        super((int)d2);
        a2.field_75024_a = vRa.d;
        a2.coordBaseMode = LX.HORIZONTAL.random((Random)c2);
        a2.field_143013_d = nw.OPENING;
        switch (TV.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
            case 1: 
            case 4: {
                void v0 = b2;
                a2.boundingBox = new Xv((int)v0, ysa.s, (int)e2, (int)(v0 + tTa.h - vRa.d), bqa.Ga, (int)(e2 + tTa.h - vRa.d));
                return;
            }
        }
        void v1 = b2;
        a2.boundingBox = new Xv((int)v1, ysa.s, (int)e2, (int)(v1 + tTa.h - vRa.d), bqa.Ga, (int)(e2 + tTa.h - vRa.d));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        wx_2 a2 = this;
        wx_2 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        wx_2 wx_22 = a2;
        void v1 = c2;
        wx_2 wx_23 = a2;
        void v3 = c2;
        wx_2 wx_24 = a2;
        void v5 = c2;
        wx_2 wx_25 = a2;
        void v7 = c2;
        wx_2 wx_26 = a2;
        void v9 = c2;
        wx_2 wx_27 = a2;
        void v11 = c2;
        wx_2 wx_28 = a2;
        void v13 = c2;
        a2.J((Gg)v13, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, NTa.C, AQa.P, vRa.d != 0, (Random)b2, (ww)LV.J());
        wx_28.J((Gg)v13, (Random)b2, (Xv)d2, a2.field_143013_d, vRa.d, XTa.W, uSa.E);
        wx_28.J((Gg)c2, (Random)b2, (Xv)d2, nw.OPENING, vRa.d, vRa.d, AQa.P);
        a2.f((Gg)v11, QFa.v.J(), uqa.g, uua.p, vRa.d, (Xv)d2);
        wx_27.f((Gg)v11, QFa.v.J(), vRa.d, tTa.h, vRa.d, (Xv)d2);
        wx_27.f((Gg)c2, QFa.Ib.J(BlockStoneSlab$EnumType.STONE.getMetadata()), vRa.d, uua.p, vRa.d, (Xv)d2);
        a2.f((Gg)v9, QFa.v.J(), vRa.d, tTa.h, uqa.g, (Xv)d2);
        wx_26.f((Gg)v9, QFa.v.J(), vRa.d, AQa.P, yRa.d, (Xv)d2);
        wx_26.f((Gg)c2, QFa.Ib.J(BlockStoneSlab$EnumType.STONE.getMetadata()), vRa.d, tTa.h, yRa.d, (Xv)d2);
        a2.f((Gg)v7, QFa.v.J(), uqa.g, AQa.P, yRa.d, (Xv)d2);
        wx_25.f((Gg)v7, QFa.v.J(), yRa.d, yRa.d, yRa.d, (Xv)d2);
        wx_25.f((Gg)c2, QFa.Ib.J(BlockStoneSlab$EnumType.STONE.getMetadata()), yRa.d, AQa.P, yRa.d, (Xv)d2);
        a2.f((Gg)v5, QFa.v.J(), yRa.d, yRa.d, uqa.g, (Xv)d2);
        wx_24.f((Gg)v5, QFa.v.J(), yRa.d, uqa.g, vRa.d, (Xv)d2);
        wx_24.f((Gg)c2, QFa.Ib.J(BlockStoneSlab$EnumType.STONE.getMetadata()), yRa.d, yRa.d, vRa.d, (Xv)d2);
        a2.f((Gg)v3, QFa.v.J(), uqa.g, uqa.g, vRa.d, (Xv)d2);
        wx_23.f((Gg)v3, QFa.v.J(), vRa.d, vRa.d, vRa.d, (Xv)d2);
        wx_23.f((Gg)c2, QFa.Ib.J(BlockStoneSlab$EnumType.STONE.getMetadata()), vRa.d, uqa.g, vRa.d, (Xv)d2);
        wx_22.f((Gg)v1, QFa.v.J(), vRa.d, vRa.d, uqa.g, (Xv)d2);
        wx_22.f((Gg)v1, QFa.Ib.J(BlockStoneSlab$EnumType.STONE.getMetadata()), vRa.d, vRa.d, yRa.d, (Xv)d2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static wx J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)jpa.r, (int)uSa.E, (int)tTa.h, (int)pPa.f, (int)tTa.h, (DZ)b2);
        if (wx_2.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new wx_2((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        wx_2 a2 = this;
        if (a2.field_75024_a) {
            LV.J(Yv.class);
        }
        a2.f((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
    }

    public void f(Waa waa2) {
        wx_2 b2 = waa2;
        wx_2 a2 = this;
        wx_2 wx_22 = b2;
        super.f((Waa)wx_22);
        wx_22.J(aPa.J, a2.field_75024_a);
    }

    /*
     * WARNING - void declaration
     */
    public wx_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void c2;
        Object e2;
        void d2;
        wx_2 wx_22 = object;
        Object object = dZ2;
        wx_2 a2 = wx_22;
        super((int)d2);
        a2.field_75024_a = uSa.E;
        a2.coordBaseMode = e2;
        a2.field_143013_d = a2.J((Random)c2);
        a2.boundingBox = b2;
    }

    public void J(Waa waa2) {
        wx_2 b2 = waa2;
        wx_2 a2 = this;
        super.J((Waa)b2);
        a2.field_75024_a = b2.f(aPa.J);
    }

    public wx_2() {
        wx_2 a2;
    }
}

