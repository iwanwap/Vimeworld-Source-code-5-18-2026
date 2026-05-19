/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  ERa
 *  Mda
 *  QFa
 *  TQa
 *  XTa
 *  Ypa
 *  ZRa
 *  Zua
 *  bAa
 *  eAa
 *  iea
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;

public final class cda_3 {
    public cda_3() {
        cda_3 a2;
    }

    public void J(bAa bAa2) {
        int n2;
        cda_3 b2 = bAa2;
        cda_3 a2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ERa.C) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = new Mda(Gea.Q, vRa.d, Ypa.A - n2);
            objectArray[vRa.d] = new Mda(eAa.J((Block)QFa.cd), vRa.d, uSa.E);
            b2.J(new Mda(QFa.cd, vRa.d, n2), objectArray);
            Object[] objectArray2 = new Object[XTa.W];
            objectArray2[uSa.E] = Qpa.t;
            objectArray2[vRa.d] = Zua.la;
            objectArray2[uqa.g] = Qpa.t;
            objectArray2[yRa.d] = Character.valueOf((char)TQa.ca);
            objectArray2[AQa.P] = new Mda(QFa.MB);
            objectArray2[tTa.h] = Character.valueOf((char)ZRa.D);
            objectArray2[uua.p] = new Mda(Gea.Q, vRa.d, n2);
            b2.J(new Mda(QFa.za, Yqa.i, Ypa.A - n2), objectArray2);
            Object[] objectArray3 = new Object[XTa.W];
            objectArray3[uSa.E] = Qpa.t;
            objectArray3[vRa.d] = Zua.la;
            objectArray3[uqa.g] = Qpa.t;
            objectArray3[yRa.d] = Character.valueOf((char)TQa.ca);
            objectArray3[AQa.P] = new Mda(QFa.ye);
            objectArray3[tTa.h] = Character.valueOf((char)ZRa.D);
            objectArray3[uua.p] = new Mda(Gea.Q, vRa.d, n2);
            b2.J(new Mda((Block)QFa.VA, Yqa.i, Ypa.A - n2), objectArray3);
            Mda mda2 = new Mda((Block)QFa.KC, ERa.C, n2);
            Object[] objectArray4 = new Object[AQa.P];
            objectArray4[uSa.E] = Qpa.t;
            objectArray4[vRa.d] = Qpa.t;
            objectArray4[uqa.g] = Character.valueOf((char)TQa.ca);
            Mda mda3 = new Mda((Block)QFa.VA, vRa.d, n2);
            objectArray4[yRa.d] = mda3;
            b2.J(mda2, objectArray4);
            n3 = ++n2;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = new Mda((Block)QFa.zc, vRa.d, BlockFlower$EnumFlowerType.DANDELION.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.YELLOW.getDyeDamage()), objectArray);
        Object[] objectArray5 = new Object[vRa.d];
        objectArray5[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.POPPY.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage()), objectArray5);
        Object[] objectArray6 = new Object[vRa.d];
        objectArray6[uSa.E] = Gea.Ya;
        b2.J(new Mda(Gea.Q, yRa.d, iea.WHITE.getDyeDamage()), objectArray6);
        Object[] objectArray7 = new Object[uqa.g];
        objectArray7[uSa.E] = new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage());
        objectArray7[vRa.d] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.PINK.getDyeDamage()), objectArray7);
        Object[] objectArray8 = new Object[uqa.g];
        objectArray8[uSa.E] = new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage());
        objectArray8[vRa.d] = new Mda(Gea.Q, vRa.d, iea.YELLOW.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.ORANGE.getDyeDamage()), objectArray8);
        Object[] objectArray9 = new Object[uqa.g];
        objectArray9[uSa.E] = new Mda(Gea.Q, vRa.d, iea.GREEN.getDyeDamage());
        objectArray9[vRa.d] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.LIME.getDyeDamage()), objectArray9);
        Object[] objectArray10 = new Object[uqa.g];
        objectArray10[uSa.E] = new Mda(Gea.Q, vRa.d, iea.BLACK.getDyeDamage());
        objectArray10[vRa.d] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.GRAY.getDyeDamage()), objectArray10);
        Object[] objectArray11 = new Object[uqa.g];
        objectArray11[uSa.E] = new Mda(Gea.Q, vRa.d, iea.GRAY.getDyeDamage());
        objectArray11[vRa.d] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.SILVER.getDyeDamage()), objectArray11);
        Object[] objectArray12 = new Object[yRa.d];
        objectArray12[uSa.E] = new Mda(Gea.Q, vRa.d, iea.BLACK.getDyeDamage());
        objectArray12[vRa.d] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        objectArray12[uqa.g] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        b2.J(new Mda(Gea.Q, yRa.d, iea.SILVER.getDyeDamage()), objectArray12);
        Object[] objectArray13 = new Object[uqa.g];
        objectArray13[uSa.E] = new Mda(Gea.Q, vRa.d, iea.BLUE.getDyeDamage());
        objectArray13[vRa.d] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.LIGHT_BLUE.getDyeDamage()), objectArray13);
        Object[] objectArray14 = new Object[uqa.g];
        objectArray14[uSa.E] = new Mda(Gea.Q, vRa.d, iea.BLUE.getDyeDamage());
        objectArray14[vRa.d] = new Mda(Gea.Q, vRa.d, iea.GREEN.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.CYAN.getDyeDamage()), objectArray14);
        Object[] objectArray15 = new Object[uqa.g];
        objectArray15[uSa.E] = new Mda(Gea.Q, vRa.d, iea.BLUE.getDyeDamage());
        objectArray15[vRa.d] = new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.PURPLE.getDyeDamage()), objectArray15);
        Object[] objectArray16 = new Object[uqa.g];
        objectArray16[uSa.E] = new Mda(Gea.Q, vRa.d, iea.PURPLE.getDyeDamage());
        objectArray16[vRa.d] = new Mda(Gea.Q, vRa.d, iea.PINK.getDyeDamage());
        b2.J(new Mda(Gea.Q, uqa.g, iea.MAGENTA.getDyeDamage()), objectArray16);
        Object[] objectArray17 = new Object[yRa.d];
        objectArray17[uSa.E] = new Mda(Gea.Q, vRa.d, iea.BLUE.getDyeDamage());
        objectArray17[vRa.d] = new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage());
        objectArray17[uqa.g] = new Mda(Gea.Q, vRa.d, iea.PINK.getDyeDamage());
        b2.J(new Mda(Gea.Q, yRa.d, iea.MAGENTA.getDyeDamage()), objectArray17);
        Object[] objectArray18 = new Object[AQa.P];
        objectArray18[uSa.E] = new Mda(Gea.Q, vRa.d, iea.BLUE.getDyeDamage());
        objectArray18[vRa.d] = new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage());
        objectArray18[uqa.g] = new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage());
        objectArray18[yRa.d] = new Mda(Gea.Q, vRa.d, iea.WHITE.getDyeDamage());
        b2.J(new Mda(Gea.Q, AQa.P, iea.MAGENTA.getDyeDamage()), objectArray18);
        Object[] objectArray19 = new Object[vRa.d];
        objectArray19[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.BLUE_ORCHID.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.LIGHT_BLUE.getDyeDamage()), objectArray19);
        Object[] objectArray20 = new Object[vRa.d];
        objectArray20[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.ALLIUM.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.MAGENTA.getDyeDamage()), objectArray20);
        Object[] objectArray21 = new Object[vRa.d];
        objectArray21[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.HOUSTONIA.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.SILVER.getDyeDamage()), objectArray21);
        Object[] objectArray22 = new Object[vRa.d];
        objectArray22[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.RED_TULIP.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.RED.getDyeDamage()), objectArray22);
        Object[] objectArray23 = new Object[vRa.d];
        objectArray23[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.ORANGE_TULIP.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.ORANGE.getDyeDamage()), objectArray23);
        Object[] objectArray24 = new Object[vRa.d];
        objectArray24[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.WHITE_TULIP.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.SILVER.getDyeDamage()), objectArray24);
        Object[] objectArray25 = new Object[vRa.d];
        objectArray25[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.PINK_TULIP.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.PINK.getDyeDamage()), objectArray25);
        Object[] objectArray26 = new Object[vRa.d];
        objectArray26[uSa.E] = new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.OXEYE_DAISY.getMeta());
        b2.J(new Mda(Gea.Q, vRa.d, iea.SILVER.getDyeDamage()), objectArray26);
        Object[] objectArray27 = new Object[vRa.d];
        objectArray27[uSa.E] = new Mda((Block)QFa.Ia, vRa.d, BlockDoublePlant$EnumPlantType.SUNFLOWER.getMeta());
        b2.J(new Mda(Gea.Q, uqa.g, iea.YELLOW.getDyeDamage()), objectArray27);
        Object[] objectArray28 = new Object[vRa.d];
        objectArray28[uSa.E] = new Mda((Block)QFa.Ia, vRa.d, BlockDoublePlant$EnumPlantType.SYRINGA.getMeta());
        b2.J(new Mda(Gea.Q, uqa.g, iea.MAGENTA.getDyeDamage()), objectArray28);
        Object[] objectArray29 = new Object[vRa.d];
        objectArray29[uSa.E] = new Mda((Block)QFa.Ia, vRa.d, BlockDoublePlant$EnumPlantType.ROSE.getMeta());
        b2.J(new Mda(Gea.Q, uqa.g, iea.RED.getDyeDamage()), objectArray29);
        Object[] objectArray30 = new Object[vRa.d];
        objectArray30[uSa.E] = new Mda((Block)QFa.Ia, vRa.d, BlockDoublePlant$EnumPlantType.PAEONIA.getMeta());
        b2.J(new Mda(Gea.Q, uqa.g, iea.PINK.getDyeDamage()), objectArray30);
        int n4 = n2 = uSa.E;
        while (n4 < ERa.C) {
            Mda mda4 = new Mda(QFa.XE, yRa.d, n2);
            Object[] objectArray31 = new Object[yRa.d];
            objectArray31[uSa.E] = DQa.j;
            objectArray31[vRa.d] = Character.valueOf((char)TQa.ca);
            Mda mda5 = new Mda(QFa.cd, vRa.d, n2);
            objectArray31[uqa.g] = mda5;
            b2.J(mda4, objectArray31);
            n4 = ++n2;
        }
    }
}

