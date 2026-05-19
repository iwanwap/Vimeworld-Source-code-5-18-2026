/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BW
 *  ERa
 *  Gg
 *  NTa
 *  QFa
 *  Waa
 *  Wv
 *  XTa
 *  Xv
 *  Ypa
 *  eAa
 *  lW
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  wPa
 *  ww
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockStoneSlab$EnumType;

public final class BW_3
extends Wv {
    private boolean hasMadeChest;
    private static final List<baa> strongholdChestContents;

    public void f(Waa waa2) {
        BW_3 b2 = waa2;
        BW_3 a2 = this;
        BW_3 bW_3 = b2;
        super.f((Waa)bW_3);
        bW_3.J(wPa.fa, a2.hasMadeChest);
    }

    public void J(Waa waa2) {
        BW_3 b2 = waa2;
        BW_3 a2 = this;
        super.J((Waa)b2);
        a2.hasMadeChest = b2.f(wPa.fa);
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        BW_3 a2 = this;
        a2.f((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public BW_3(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void c2;
        Object e2;
        void d2;
        BW_3 bW_3 = object;
        Object object = dZ2;
        BW_3 a2 = bW_3;
        super((int)d2);
        a2.coordBaseMode = e2;
        a2.field_143013_d = a2.J((Random)c2);
        a2.boundingBox = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static BW J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)pua.o, (int)uSa.E, (int)tTa.h, (int)tTa.h, (int)XTa.W, (DZ)b2);
        if (BW_3.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new BW_3((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        void b2;
        void c2;
        BW_3 a2 = this;
        BW_3 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        BW_3 bW_3 = a2;
        void v1 = c2;
        BW_3 bW_32 = a2;
        void v3 = c2;
        BW_3 bW_33 = a2;
        void v5 = c2;
        a2.J((Gg)v5, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, AQa.P, uua.p, vRa.d != 0, (Random)b2, (ww)LV.J());
        bW_33.J((Gg)v5, (Random)b2, (Xv)d2, a2.field_143013_d, vRa.d, vRa.d, uSa.E);
        bW_33.J((Gg)c2, (Random)b2, (Xv)d2, nw.OPENING, vRa.d, vRa.d, uua.p);
        a2.J((Gg)v3, (Xv)d2, yRa.d, vRa.d, uqa.g, yRa.d, vRa.d, AQa.P, QFa.v.J(), QFa.v.J(), uSa.E != 0);
        bW_32.f((Gg)v3, QFa.Ib.J(BlockStoneSlab$EnumType.SMOOTHBRICK.getMetadata()), yRa.d, vRa.d, vRa.d, (Xv)d2);
        bW_32.f((Gg)c2, QFa.Ib.J(BlockStoneSlab$EnumType.SMOOTHBRICK.getMetadata()), yRa.d, vRa.d, tTa.h, (Xv)d2);
        bW_3.f((Gg)v1, QFa.Ib.J(BlockStoneSlab$EnumType.SMOOTHBRICK.getMetadata()), yRa.d, uqa.g, uqa.g, (Xv)d2);
        bW_3.f((Gg)v1, QFa.Ib.J(BlockStoneSlab$EnumType.SMOOTHBRICK.getMetadata()), yRa.d, uqa.g, AQa.P, (Xv)d2);
        int n3 = n2 = uqa.g;
        while (n3 <= AQa.P) {
            a2.f((Gg)c2, QFa.Ib.J(BlockStoneSlab$EnumType.SMOOTHBRICK.getMetadata()), uqa.g, vRa.d, n2++, (Xv)d2);
            n3 = n2;
        }
        if (!a2.hasMadeChest) {
            if (d2.J(new XF(a2.J(yRa.d, yRa.d), a2.J(uqa.g), a2.f(yRa.d, yRa.d)))) {
                a2.hasMadeChest = vRa.d;
                baa[] baaArray = new baa[vRa.d];
                baaArray[uSa.E] = Gea.ha.J((Random)b2);
                a2.J((Gg)c2, (Xv)d2, (Random)b2, yRa.d, uqa.g, yRa.d, baa.J(strongholdChestContents, baaArray), uqa.g + b2.nextInt(uqa.g));
            }
        }
        return vRa.d != 0;
    }

    static {
        baa[] baaArray = new baa[yOa.B];
        baaArray[uSa.E] = new baa(Gea.Uc, uSa.E, vRa.d, vRa.d, NTa.C);
        baaArray[vRa.d] = new baa(Gea.b, uSa.E, vRa.d, yRa.d, yRa.d);
        baaArray[uqa.g] = new baa(Gea.GA, uSa.E, vRa.d, tTa.h, NTa.C);
        baaArray[yRa.d] = new baa(Gea.Bb, uSa.E, vRa.d, yRa.d, tTa.h);
        baaArray[AQa.P] = new baa(Gea.zc, uSa.E, AQa.P, WOa.fa, tTa.h);
        baaArray[tTa.h] = new baa(Gea.Ra, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[uua.p] = new baa(Gea.Mb, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[XTa.W] = new baa(Gea.gB, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[Yqa.i] = new baa(Gea.LA, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[WOa.fa] = new baa((eAa)Gea.x, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[NTa.C] = new baa((eAa)Gea.G, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[pPa.f] = new baa((eAa)Gea.H, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[lqa.s] = new baa((eAa)Gea.XC, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[uua.s] = new baa(Gea.pb, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[hpa.Z] = new baa(Gea.NA, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[Ypa.A] = new baa(Gea.La, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[ERa.C] = new baa(Gea.Yc, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[yta.Ka] = new baa(Gea.sd, uSa.E, vRa.d, vRa.d, vRa.d);
        strongholdChestContents = Lists.newArrayList(baaArray);
    }

    public BW_3() {
        BW_3 a2;
    }
}

