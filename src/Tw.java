/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  JQa
 *  LQa
 *  NTa
 *  QFa
 *  Qqa
 *  UW
 *  WSa
 *  Waa
 *  XTa
 *  Xv
 *  Ypa
 *  Ysa
 *  iea
 *  kpa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  wOa
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockStoneSlab$EnumType;

public final class Tw
extends UW {
    private static final List<baa> itemsToGenerateInTemple;
    private boolean[] field_74940_h;

    public void J(Waa waa2) {
        Tw a2;
        Tw b2 = waa2;
        Tw tw2 = a2 = this;
        super.J((Waa)b2);
        tw2.field_74940_h[uSa.E] = b2.f(LQa.la);
        tw2.field_74940_h[vRa.d] = b2.f(Ysa.L);
        tw2.field_74940_h[uqa.g] = b2.f(LQa.ea);
        tw2.field_74940_h[yRa.d] = b2.f(Eqa.k);
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
        itemsToGenerateInTemple = Lists.newArrayList(baaArray);
    }

    public void f(Waa waa2) {
        Tw b2 = waa2;
        Tw a2 = this;
        Tw tw2 = b2;
        super.f((Waa)tw2);
        Tw tw3 = b2;
        tw3.J(LQa.la, a2.field_74940_h[uSa.E]);
        tw3.J(Ysa.L, a2.field_74940_h[vRa.d]);
        tw2.J(LQa.ea, a2.field_74940_h[uqa.g]);
        tw2.J(Eqa.k, a2.field_74940_h[yRa.d]);
    }

    /*
     * WARNING - void declaration
     */
    public Tw(Random random, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Tw a2 = this;
        super((Random)c2, (int)b2, ysa.s, d2, wOa.h, Ypa.A, wOa.h);
        a2.field_74940_h = new boolean[AQa.P];
    }

    public Tw() {
        Tw a2;
        a2.field_74940_h = new boolean[AQa.P];
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv) {
        int n2;
        int n3;
        int n4;
        void c2;
        Tw d2 = xv;
        Tw a2 = this;
        a2.J((Gg)c2, (Xv)d2, uSa.E, pta.a, uSa.E, a2.scatteredFeatureSizeX - vRa.d, uSa.E, a2.scatteredFeatureSizeZ - vRa.d, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        int n5 = n4 = vRa.d;
        while (n5 <= WOa.fa) {
            Tw tw2 = a2;
            int n6 = n4;
            int n7 = n4;
            int n8 = n4;
            tw2.J((Gg)c2, (Xv)d2, n6, n7, n6, a2.scatteredFeatureSizeX - vRa.d - n7, n8, a2.scatteredFeatureSizeZ - vRa.d - n8, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
            int n9 = n4 + vRa.d;
            int n10 = n4;
            int n11 = n4++;
            tw2.J((Gg)c2, (Xv)d2, n9, n10, n4 + vRa.d, a2.scatteredFeatureSizeX - uqa.g - n10, n11, a2.scatteredFeatureSizeZ - uqa.g - n11, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            n5 = n4;
        }
        int n12 = n4 = uSa.E;
        while (n12 < a2.scatteredFeatureSizeX) {
            int n13 = uSa.E;
            while (n13 < a2.scatteredFeatureSizeZ) {
                n3 = kpa.w;
                a2.J((Gg)c2, QFa.qC.J(), n4, n3, n2++, (Xv)d2);
                n13 = n2;
            }
            n12 = ++n4;
        }
        Tw tw3 = a2;
        void v11 = c2;
        Tw tw4 = a2;
        void v13 = c2;
        Tw tw5 = a2;
        void v15 = c2;
        Tw tw6 = a2;
        void v17 = c2;
        void v18 = c2;
        Tw tw7 = a2;
        void v20 = c2;
        void v21 = c2;
        Tw tw8 = a2;
        void v23 = c2;
        void v24 = c2;
        Tw tw9 = a2;
        void v26 = c2;
        Tw tw10 = a2;
        void v28 = c2;
        Tw tw11 = a2;
        void v30 = c2;
        Tw tw12 = a2;
        void v32 = c2;
        Tw tw13 = a2;
        void v34 = c2;
        Tw tw14 = a2;
        void v36 = c2;
        Tw tw15 = a2;
        void v38 = c2;
        void v39 = c2;
        Tw tw16 = a2;
        void v41 = c2;
        Tw tw17 = a2;
        void v43 = c2;
        Tw tw18 = a2;
        n4 = tw18.J(QFa.oa, yRa.d);
        n2 = tw18.J(QFa.oa, uqa.g);
        n3 = tw18.J(QFa.oa, uSa.E);
        int n14 = tw18.J(QFa.oa, vRa.d);
        int n15 = (iea.ORANGE.getDyeDamage() ^ pua.o) & Ypa.A;
        int n16 = (iea.BLUE.getDyeDamage() ^ pua.o) & Ypa.A;
        a2.J((Gg)v43, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, WOa.fa, AQa.P, QFa.qC.J(), QFa.HF.J(), uSa.E != 0);
        tw17.J((Gg)v43, (Xv)d2, vRa.d, NTa.C, vRa.d, yRa.d, NTa.C, yRa.d, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        tw17.f((Gg)c2, QFa.oa.J(n4), uqa.g, NTa.C, uSa.E, (Xv)d2);
        a2.f((Gg)v41, QFa.oa.J(n2), uqa.g, NTa.C, AQa.P, (Xv)d2);
        tw16.f((Gg)v41, QFa.oa.J(n3), uSa.E, NTa.C, uqa.g, (Xv)d2);
        tw16.f((Gg)v39, QFa.oa.J(n14), AQa.P, NTa.C, uqa.g, (Xv)d2);
        Tw tw19 = a2;
        tw19.J((Gg)v39, (Xv)d2, tw19.scatteredFeatureSizeX - tTa.h, uSa.E, uSa.E, a2.scatteredFeatureSizeX - vRa.d, WOa.fa, AQa.P, QFa.qC.J(), QFa.HF.J(), uSa.E != 0);
        Tw tw20 = a2;
        tw20.J((Gg)v39, (Xv)d2, tw20.scatteredFeatureSizeX - AQa.P, NTa.C, vRa.d, a2.scatteredFeatureSizeX - uqa.g, NTa.C, yRa.d, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        Tw tw21 = a2;
        tw21.f((Gg)v39, QFa.oa.J(n4), tw21.scatteredFeatureSizeX - yRa.d, NTa.C, uSa.E, (Xv)d2);
        Tw tw22 = a2;
        tw22.f((Gg)v39, QFa.oa.J(n2), tw22.scatteredFeatureSizeX - yRa.d, NTa.C, AQa.P, (Xv)d2);
        Tw tw23 = a2;
        tw23.f((Gg)v39, QFa.oa.J(n3), tw23.scatteredFeatureSizeX - tTa.h, NTa.C, uqa.g, (Xv)d2);
        a2.f((Gg)v38, QFa.oa.J(n14), a2.scatteredFeatureSizeX - vRa.d, NTa.C, uqa.g, (Xv)d2);
        tw15.J((Gg)v38, (Xv)d2, Yqa.i, uSa.E, uSa.E, lqa.s, AQa.P, AQa.P, QFa.qC.J(), QFa.HF.J(), uSa.E != 0);
        tw15.J((Gg)c2, (Xv)d2, WOa.fa, vRa.d, uSa.E, pPa.f, yRa.d, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.f((Gg)v36, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), WOa.fa, vRa.d, vRa.d, (Xv)d2);
        tw14.f((Gg)v36, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), WOa.fa, uqa.g, vRa.d, (Xv)d2);
        tw14.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), WOa.fa, yRa.d, vRa.d, (Xv)d2);
        a2.f((Gg)v34, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), NTa.C, yRa.d, vRa.d, (Xv)d2);
        tw13.f((Gg)v34, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), pPa.f, yRa.d, vRa.d, (Xv)d2);
        tw13.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), pPa.f, uqa.g, vRa.d, (Xv)d2);
        a2.f((Gg)v32, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), pPa.f, vRa.d, vRa.d, (Xv)d2);
        tw12.J((Gg)v32, (Xv)d2, AQa.P, vRa.d, vRa.d, Yqa.i, yRa.d, yRa.d, QFa.qC.J(), QFa.HF.J(), uSa.E != 0);
        tw12.J((Gg)c2, (Xv)d2, AQa.P, vRa.d, uqa.g, Yqa.i, uqa.g, uqa.g, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)v30, (Xv)d2, lqa.s, vRa.d, vRa.d, ERa.C, yRa.d, yRa.d, QFa.qC.J(), QFa.HF.J(), uSa.E != 0);
        tw11.J((Gg)v30, (Xv)d2, lqa.s, vRa.d, uqa.g, ERa.C, uqa.g, uqa.g, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        tw11.J((Gg)c2, (Xv)d2, tTa.h, AQa.P, tTa.h, a2.scatteredFeatureSizeX - uua.p, AQa.P, a2.scatteredFeatureSizeZ - uua.p, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        a2.J((Gg)v28, (Xv)d2, WOa.fa, AQa.P, WOa.fa, pPa.f, AQa.P, pPa.f, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        tw10.J((Gg)v28, (Xv)d2, Yqa.i, vRa.d, Yqa.i, Yqa.i, yRa.d, Yqa.i, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        tw10.J((Gg)c2, (Xv)d2, lqa.s, vRa.d, Yqa.i, lqa.s, yRa.d, Yqa.i, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        a2.J((Gg)v26, (Xv)d2, Yqa.i, vRa.d, lqa.s, Yqa.i, yRa.d, lqa.s, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        tw9.J((Gg)v26, (Xv)d2, lqa.s, vRa.d, lqa.s, lqa.s, yRa.d, lqa.s, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        tw9.J((Gg)v24, (Xv)d2, vRa.d, vRa.d, tTa.h, AQa.P, AQa.P, pPa.f, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        Tw tw24 = a2;
        tw24.J((Gg)v24, (Xv)d2, tw24.scatteredFeatureSizeX - tTa.h, vRa.d, tTa.h, a2.scatteredFeatureSizeX - uqa.g, AQa.P, pPa.f, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        a2.J((Gg)v23, (Xv)d2, uua.p, XTa.W, WOa.fa, uua.p, XTa.W, pPa.f, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        tw8.J((Gg)v23, (Xv)d2, a2.scatteredFeatureSizeX - XTa.W, XTa.W, WOa.fa, a2.scatteredFeatureSizeX - XTa.W, XTa.W, pPa.f, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        tw8.J((Gg)v21, (Xv)d2, tTa.h, tTa.h, WOa.fa, tTa.h, XTa.W, pPa.f, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        Tw tw25 = a2;
        tw25.J((Gg)v21, (Xv)d2, tw25.scatteredFeatureSizeX - uua.p, tTa.h, WOa.fa, a2.scatteredFeatureSizeX - uua.p, XTa.W, pPa.f, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        a2.f((Gg)v20, QFa.HF.J(), tTa.h, tTa.h, NTa.C, (Xv)d2);
        tw7.f((Gg)v20, QFa.HF.J(), tTa.h, uua.p, NTa.C, (Xv)d2);
        tw7.f((Gg)v18, QFa.HF.J(), uua.p, uua.p, NTa.C, (Xv)d2);
        Tw tw26 = a2;
        tw26.f((Gg)v18, QFa.HF.J(), tw26.scatteredFeatureSizeX - uua.p, tTa.h, NTa.C, (Xv)d2);
        a2.f((Gg)v17, QFa.HF.J(), a2.scatteredFeatureSizeX - uua.p, uua.p, NTa.C, (Xv)d2);
        tw6.f((Gg)v17, QFa.HF.J(), a2.scatteredFeatureSizeX - XTa.W, uua.p, NTa.C, (Xv)d2);
        tw6.J((Gg)c2, (Xv)d2, uqa.g, AQa.P, AQa.P, uqa.g, uua.p, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)v15, (Xv)d2, a2.scatteredFeatureSizeX - yRa.d, AQa.P, AQa.P, a2.scatteredFeatureSizeX - yRa.d, uua.p, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        tw5.f((Gg)v15, QFa.oa.J(n4), uqa.g, AQa.P, tTa.h, (Xv)d2);
        tw5.f((Gg)c2, QFa.oa.J(n4), uqa.g, yRa.d, AQa.P, (Xv)d2);
        a2.f((Gg)v13, QFa.oa.J(n4), a2.scatteredFeatureSizeX - yRa.d, AQa.P, tTa.h, (Xv)d2);
        tw4.f((Gg)v13, QFa.oa.J(n4), a2.scatteredFeatureSizeX - yRa.d, yRa.d, AQa.P, (Xv)d2);
        tw4.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, yRa.d, uqa.g, uqa.g, yRa.d, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        tw3.J((Gg)v11, (Xv)d2, a2.scatteredFeatureSizeX - yRa.d, vRa.d, yRa.d, a2.scatteredFeatureSizeX - uqa.g, uqa.g, yRa.d, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        tw3.f((Gg)v11, QFa.oa.J(), vRa.d, vRa.d, uqa.g, (Xv)d2);
        Tw tw27 = a2;
        void v54 = c2;
        Tw tw28 = d2;
        void v56 = c2;
        Tw tw29 = a2;
        void v58 = c2;
        Tw tw30 = a2;
        tw30.f((Gg)c2, QFa.oa.J(), tw30.scatteredFeatureSizeX - uqa.g, vRa.d, uqa.g, (Xv)d2);
        a2.f((Gg)v58, QFa.Ib.J(BlockStoneSlab$EnumType.SAND.getMetadata()), vRa.d, uqa.g, uqa.g, (Xv)d2);
        tw29.f((Gg)v58, QFa.Ib.J(BlockStoneSlab$EnumType.SAND.getMetadata()), a2.scatteredFeatureSizeX - uqa.g, uqa.g, uqa.g, (Xv)d2);
        tw29.f((Gg)v56, QFa.oa.J(n14), uqa.g, vRa.d, uqa.g, (Xv)d2);
        Tw tw31 = a2;
        tw31.f((Gg)v56, QFa.oa.J(n3), tw31.scatteredFeatureSizeX - yRa.d, vRa.d, uqa.g, (Xv)d2);
        a2.J((Gg)c2, (Xv)tw28, AQa.P, yRa.d, tTa.h, AQa.P, yRa.d, yOa.B, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        a2.J((Gg)v54, (Xv)tw28, a2.scatteredFeatureSizeX - tTa.h, yRa.d, tTa.h, a2.scatteredFeatureSizeX - tTa.h, yRa.d, yta.Ka, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        tw27.J((Gg)v54, (Xv)d2, yRa.d, vRa.d, tTa.h, AQa.P, uqa.g, ERa.C, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        tw27.J((Gg)c2, (Xv)d2, a2.scatteredFeatureSizeX - uua.p, vRa.d, tTa.h, a2.scatteredFeatureSizeX - tTa.h, uqa.g, ERa.C, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        int n17 = n4 = tTa.h;
        while (n17 <= yta.Ka) {
            void v62 = c2;
            Tw tw32 = a2;
            tw32.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), AQa.P, vRa.d, n4, (Xv)d2);
            tw32.f((Gg)v62, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), AQa.P, uqa.g, n4, (Xv)d2);
            Tw tw33 = a2;
            tw33.f((Gg)v62, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), tw33.scatteredFeatureSizeX - tTa.h, vRa.d, n4, (Xv)d2);
            Tw tw34 = a2;
            int n18 = n4;
            tw34.f((Gg)v62, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), tw34.scatteredFeatureSizeX - tTa.h, uqa.g, n18, (Xv)d2);
            n17 = n4 += 2;
        }
        Tw tw35 = a2;
        void v68 = c2;
        Tw tw36 = a2;
        void v70 = c2;
        Tw tw37 = a2;
        void v72 = c2;
        Tw tw38 = a2;
        void v74 = c2;
        Tw tw39 = a2;
        tw39.f((Gg)c2, QFa.za.J(n15), NTa.C, uSa.E, XTa.W, (Xv)d2);
        tw39.f((Gg)c2, QFa.za.J(n15), NTa.C, uSa.E, Yqa.i, (Xv)d2);
        a2.f((Gg)v74, QFa.za.J(n15), WOa.fa, uSa.E, WOa.fa, (Xv)d2);
        tw38.f((Gg)v74, QFa.za.J(n15), pPa.f, uSa.E, WOa.fa, (Xv)d2);
        tw38.f((Gg)c2, QFa.za.J(n15), Yqa.i, uSa.E, NTa.C, (Xv)d2);
        a2.f((Gg)v72, QFa.za.J(n15), lqa.s, uSa.E, NTa.C, (Xv)d2);
        tw37.f((Gg)v72, QFa.za.J(n15), XTa.W, uSa.E, NTa.C, (Xv)d2);
        tw37.f((Gg)c2, QFa.za.J(n15), uua.s, uSa.E, NTa.C, (Xv)d2);
        a2.f((Gg)v70, QFa.za.J(n15), WOa.fa, uSa.E, pPa.f, (Xv)d2);
        tw36.f((Gg)v70, QFa.za.J(n15), pPa.f, uSa.E, pPa.f, (Xv)d2);
        tw36.f((Gg)c2, QFa.za.J(n15), NTa.C, uSa.E, lqa.s, (Xv)d2);
        tw35.f((Gg)v68, QFa.za.J(n15), NTa.C, uSa.E, uua.s, (Xv)d2);
        tw35.f((Gg)v68, QFa.za.J(n16), NTa.C, uSa.E, NTa.C, (Xv)d2);
        int n19 = n4 = uSa.E;
        while (n19 <= a2.scatteredFeatureSizeX - vRa.d) {
            Tw tw40 = a2;
            void v78 = c2;
            Tw tw41 = a2;
            void v80 = c2;
            Tw tw42 = a2;
            void v82 = c2;
            Tw tw43 = a2;
            void v84 = c2;
            Tw tw44 = a2;
            void v86 = c2;
            Tw tw45 = a2;
            void v88 = c2;
            Tw tw46 = a2;
            void v90 = c2;
            a2.f((Gg)v90, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, uqa.g, vRa.d, (Xv)d2);
            tw46.f((Gg)v90, QFa.za.J(n15), n4, uqa.g, uqa.g, (Xv)d2);
            tw46.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, uqa.g, yRa.d, (Xv)d2);
            a2.f((Gg)v88, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, yRa.d, vRa.d, (Xv)d2);
            tw45.f((Gg)v88, QFa.za.J(n15), n4, yRa.d, uqa.g, (Xv)d2);
            tw45.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, yRa.d, yRa.d, (Xv)d2);
            a2.f((Gg)v86, QFa.za.J(n15), n4, AQa.P, vRa.d, (Xv)d2);
            tw44.f((Gg)v86, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), n4, AQa.P, uqa.g, (Xv)d2);
            tw44.f((Gg)c2, QFa.za.J(n15), n4, AQa.P, yRa.d, (Xv)d2);
            a2.f((Gg)v84, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, tTa.h, vRa.d, (Xv)d2);
            tw43.f((Gg)v84, QFa.za.J(n15), n4, tTa.h, uqa.g, (Xv)d2);
            tw43.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, tTa.h, yRa.d, (Xv)d2);
            a2.f((Gg)v82, QFa.za.J(n15), n4, uua.p, vRa.d, (Xv)d2);
            tw42.f((Gg)v82, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), n4, uua.p, uqa.g, (Xv)d2);
            tw42.f((Gg)c2, QFa.za.J(n15), n4, uua.p, yRa.d, (Xv)d2);
            a2.f((Gg)v80, QFa.za.J(n15), n4, XTa.W, vRa.d, (Xv)d2);
            tw41.f((Gg)v80, QFa.za.J(n15), n4, XTa.W, uqa.g, (Xv)d2);
            tw41.f((Gg)c2, QFa.za.J(n15), n4, XTa.W, yRa.d, (Xv)d2);
            a2.f((Gg)v78, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, Yqa.i, vRa.d, (Xv)d2);
            tw40.f((Gg)v78, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, Yqa.i, uqa.g, (Xv)d2);
            tw40.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, Yqa.i, yRa.d, (Xv)d2);
            n19 = n4 + (a2.scatteredFeatureSizeX - vRa.d);
        }
        int n20 = n4 = uqa.g;
        while (n20 <= a2.scatteredFeatureSizeX - yRa.d) {
            Tw tw47 = a2;
            void v93 = c2;
            Tw tw48 = a2;
            void v95 = c2;
            Tw tw49 = a2;
            void v97 = c2;
            Tw tw50 = a2;
            void v99 = c2;
            Tw tw51 = a2;
            void v101 = c2;
            Tw tw52 = a2;
            void v103 = c2;
            Tw tw53 = a2;
            void v105 = c2;
            a2.f((Gg)v105, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 - vRa.d, uqa.g, uSa.E, (Xv)d2);
            tw53.f((Gg)v105, QFa.za.J(n15), n4, uqa.g, uSa.E, (Xv)d2);
            tw53.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 + vRa.d, uqa.g, uSa.E, (Xv)d2);
            a2.f((Gg)v103, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 - vRa.d, yRa.d, uSa.E, (Xv)d2);
            tw52.f((Gg)v103, QFa.za.J(n15), n4, yRa.d, uSa.E, (Xv)d2);
            tw52.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 + vRa.d, yRa.d, uSa.E, (Xv)d2);
            a2.f((Gg)v101, QFa.za.J(n15), n4 - vRa.d, AQa.P, uSa.E, (Xv)d2);
            tw51.f((Gg)v101, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), n4, AQa.P, uSa.E, (Xv)d2);
            tw51.f((Gg)c2, QFa.za.J(n15), n4 + vRa.d, AQa.P, uSa.E, (Xv)d2);
            a2.f((Gg)v99, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 - vRa.d, tTa.h, uSa.E, (Xv)d2);
            tw50.f((Gg)v99, QFa.za.J(n15), n4, tTa.h, uSa.E, (Xv)d2);
            tw50.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 + vRa.d, tTa.h, uSa.E, (Xv)d2);
            a2.f((Gg)v97, QFa.za.J(n15), n4 - vRa.d, uua.p, uSa.E, (Xv)d2);
            tw49.f((Gg)v97, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), n4, uua.p, uSa.E, (Xv)d2);
            tw49.f((Gg)c2, QFa.za.J(n15), n4 + vRa.d, uua.p, uSa.E, (Xv)d2);
            a2.f((Gg)v95, QFa.za.J(n15), n4 - vRa.d, XTa.W, uSa.E, (Xv)d2);
            tw48.f((Gg)v95, QFa.za.J(n15), n4, XTa.W, uSa.E, (Xv)d2);
            tw48.f((Gg)c2, QFa.za.J(n15), n4 + vRa.d, XTa.W, uSa.E, (Xv)d2);
            a2.f((Gg)v93, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 - vRa.d, Yqa.i, uSa.E, (Xv)d2);
            tw47.f((Gg)v93, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4, Yqa.i, uSa.E, (Xv)d2);
            tw47.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), n4 + vRa.d, Yqa.i, uSa.E, (Xv)d2);
            n20 = n4 + (a2.scatteredFeatureSizeX - yRa.d - uqa.g);
        }
        Tw tw54 = a2;
        void v107 = c2;
        Tw tw55 = a2;
        void v109 = c2;
        Tw tw56 = a2;
        void v111 = c2;
        Tw tw57 = a2;
        void v113 = c2;
        Tw tw58 = a2;
        void v115 = c2;
        Tw tw59 = a2;
        void v117 = c2;
        Tw tw60 = a2;
        void v119 = c2;
        Tw tw61 = d2;
        Tw tw62 = a2;
        void v122 = c2;
        Tw tw63 = a2;
        void v124 = c2;
        Tw tw64 = a2;
        tw64.J((Gg)c2, (Xv)d2, Yqa.i, AQa.P, uSa.E, lqa.s, uua.p, uSa.E, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        tw64.f((Gg)c2, QFa.HF.J(), Yqa.i, uua.p, uSa.E, (Xv)d2);
        a2.f((Gg)v124, QFa.HF.J(), lqa.s, uua.p, uSa.E, (Xv)d2);
        tw63.f((Gg)v124, QFa.za.J(n15), WOa.fa, tTa.h, uSa.E, (Xv)d2);
        tw63.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), NTa.C, tTa.h, uSa.E, (Xv)d2);
        a2.f((Gg)v122, QFa.za.J(n15), pPa.f, tTa.h, uSa.E, (Xv)d2);
        tw62.J((Gg)v122, (Xv)d2, Yqa.i, yRa.i, Yqa.i, lqa.s, WSa.w, lqa.s, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        tw62.J((Gg)c2, (Xv)d2, Yqa.i, ypa.y, Yqa.i, lqa.s, ypa.y, lqa.s, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), uSa.E != 0);
        a2.J((Gg)c2, (Xv)tw61, Yqa.i, Jra.Fa, Yqa.i, lqa.s, Jra.Fa, lqa.s, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uSa.E != 0);
        a2.J((Gg)v119, (Xv)tw61, Yqa.i, Qqa.i, Yqa.i, lqa.s, pua.o, lqa.s, QFa.qC.J(), QFa.qC.J(), uSa.E != 0);
        tw60.J((Gg)v119, (Xv)d2, WOa.fa, WSa.w, WOa.fa, pPa.f, pua.o, pPa.f, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        tw60.f((Gg)c2, QFa.BC.J(), NTa.C, WSa.w, NTa.C, (Xv)d2);
        a2.J((Gg)v117, (Xv)d2, WOa.fa, JQa.z, WOa.fa, pPa.f, JQa.z, pPa.f, QFa.Lc.J(), QFa.HF.J(), uSa.E != 0);
        tw59.f((Gg)v117, QFa.HF.J(), Yqa.i, WSa.w, NTa.C, (Xv)d2);
        tw59.f((Gg)c2, QFa.HF.J(), Yqa.i, ypa.y, NTa.C, (Xv)d2);
        a2.f((Gg)v115, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), XTa.W, ypa.y, NTa.C, (Xv)d2);
        tw58.f((Gg)v115, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), XTa.W, WSa.w, NTa.C, (Xv)d2);
        tw58.f((Gg)c2, QFa.HF.J(), lqa.s, WSa.w, NTa.C, (Xv)d2);
        a2.f((Gg)v113, QFa.HF.J(), lqa.s, ypa.y, NTa.C, (Xv)d2);
        tw57.f((Gg)v113, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), uua.s, ypa.y, NTa.C, (Xv)d2);
        tw57.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), uua.s, WSa.w, NTa.C, (Xv)d2);
        a2.f((Gg)v111, QFa.HF.J(), NTa.C, WSa.w, Yqa.i, (Xv)d2);
        tw56.f((Gg)v111, QFa.HF.J(), NTa.C, ypa.y, Yqa.i, (Xv)d2);
        tw56.f((Gg)c2, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), NTa.C, ypa.y, XTa.W, (Xv)d2);
        a2.f((Gg)v109, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), NTa.C, WSa.w, XTa.W, (Xv)d2);
        tw55.f((Gg)v109, QFa.HF.J(), NTa.C, WSa.w, lqa.s, (Xv)d2);
        tw55.f((Gg)c2, QFa.HF.J(), NTa.C, ypa.y, lqa.s, (Xv)d2);
        tw54.f((Gg)v107, QFa.qC.J(BlockSandStone$EnumType.CHISELED.getMetadata()), NTa.C, ypa.y, uua.s, (Xv)d2);
        tw54.f((Gg)v107, QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata()), NTa.C, WSa.w, uua.s, (Xv)d2);
        for (DZ dZ2 : LX.HORIZONTAL) {
            void b2;
            if (a2.field_74940_h[dZ2.getHorizontalIndex()]) continue;
            DZ dZ3 = dZ2;
            n3 = dZ3.getFrontOffsetX() * uqa.g;
            n14 = dZ3.getFrontOffsetZ() * uqa.g;
            baa[] baaArray = new baa[vRa.d];
            baaArray[uSa.E] = Gea.ha.J((Random)b2);
            a2.field_74940_h[dZ2.getHorizontalIndex()] = a2.J((Gg)c2, (Xv)d2, (Random)b2, NTa.C + n3, WSa.w, NTa.C + n14, baa.J(itemsToGenerateInTemple, baaArray), uqa.g + b2.nextInt(tTa.h));
        }
        return vRa.d != 0;
    }
}

