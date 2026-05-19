/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  ERa
 *  FTa
 *  NTa
 *  Pb
 *  Rua
 *  SOa
 *  Uta
 *  XTa
 *  Ypa
 *  bSa
 *  cQa
 *  lqa
 *  pPa
 *  psa
 *  vRa
 *  vpa
 *  wOa
 */
package net.minecraft.block;

public final class BlockFlowerPot$EnumFlowerType
extends Enum<BlockFlowerPot$EnumFlowerType>
implements Pb {
    public static final /* enum */ BlockFlowerPot$EnumFlowerType ALLIUM;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType DEAD_BUSH;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType DARK_OAK_SAPLING;
    private static final /* synthetic */ BlockFlowerPot$EnumFlowerType[] $VALUES;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType OAK_SAPLING;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType BIRCH_SAPLING;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType DANDELION;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType FERN;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType BLUE_ORCHID;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType JUNGLE_SAPLING;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType SPRUCE_SAPLING;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType HOUSTONIA;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType WHITE_TULIP;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType POPPY;
    private final String name;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType ACACIA_SAPLING;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType RED_TULIP;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType ORANGE_TULIP;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType MUSHROOM_RED;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType PINK_TULIP;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType MUSHROOM_BROWN;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType CACTUS;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType OXEYE_DAISY;
    public static final /* enum */ BlockFlowerPot$EnumFlowerType EMPTY;

    public static BlockFlowerPot$EnumFlowerType[] values() {
        return (BlockFlowerPot$EnumFlowerType[])$VALUES.clone();
    }

    public static BlockFlowerPot$EnumFlowerType valueOf(String a2) {
        return Enum.valueOf(BlockFlowerPot$EnumFlowerType.class, a2);
    }

    public String toString() {
        BlockFlowerPot$EnumFlowerType a2;
        return a2.name;
    }

    private BlockFlowerPot$EnumFlowerType(String string2) {
        Object b2 = string2;
        BlockFlowerPot$EnumFlowerType a2 = this;
        a2.name = b2;
    }

    public String getName() {
        BlockFlowerPot$EnumFlowerType a2;
        return a2.name;
    }

    static {
        EMPTY = new BlockFlowerPot$EnumFlowerType(uqa.Ga);
        POPPY = new BlockFlowerPot$EnumFlowerType(NSa.t);
        BLUE_ORCHID = new BlockFlowerPot$EnumFlowerType(opa.P);
        ALLIUM = new BlockFlowerPot$EnumFlowerType(Rua.D);
        HOUSTONIA = new BlockFlowerPot$EnumFlowerType(vpa.k);
        RED_TULIP = new BlockFlowerPot$EnumFlowerType(FTa.fa);
        ORANGE_TULIP = new BlockFlowerPot$EnumFlowerType(Ora.x);
        WHITE_TULIP = new BlockFlowerPot$EnumFlowerType(pPa.B);
        PINK_TULIP = new BlockFlowerPot$EnumFlowerType(zta.ja);
        OXEYE_DAISY = new BlockFlowerPot$EnumFlowerType(xTa.X);
        DANDELION = new BlockFlowerPot$EnumFlowerType(Era.M);
        OAK_SAPLING = new BlockFlowerPot$EnumFlowerType(mPa.g);
        SPRUCE_SAPLING = new BlockFlowerPot$EnumFlowerType(FTa.E);
        BIRCH_SAPLING = new BlockFlowerPot$EnumFlowerType(wOa.Da);
        JUNGLE_SAPLING = new BlockFlowerPot$EnumFlowerType(Uta.m);
        ACACIA_SAPLING = new BlockFlowerPot$EnumFlowerType(VPa.j);
        DARK_OAK_SAPLING = new BlockFlowerPot$EnumFlowerType(SOa.R);
        MUSHROOM_RED = new BlockFlowerPot$EnumFlowerType(psa.Ia);
        MUSHROOM_BROWN = new BlockFlowerPot$EnumFlowerType(bSa.M);
        DEAD_BUSH = new BlockFlowerPot$EnumFlowerType(BRa.o);
        FERN = new BlockFlowerPot$EnumFlowerType(kua.ga);
        CACTUS = new BlockFlowerPot$EnumFlowerType(Qra.Ha);
        BlockFlowerPot$EnumFlowerType[] blockFlowerPot$EnumFlowerTypeArray = new BlockFlowerPot$EnumFlowerType[cQa.o];
        blockFlowerPot$EnumFlowerTypeArray[uSa.E] = EMPTY;
        blockFlowerPot$EnumFlowerTypeArray[vRa.d] = POPPY;
        blockFlowerPot$EnumFlowerTypeArray[uqa.g] = BLUE_ORCHID;
        blockFlowerPot$EnumFlowerTypeArray[yRa.d] = ALLIUM;
        blockFlowerPot$EnumFlowerTypeArray[AQa.P] = HOUSTONIA;
        blockFlowerPot$EnumFlowerTypeArray[tTa.h] = RED_TULIP;
        blockFlowerPot$EnumFlowerTypeArray[uua.p] = ORANGE_TULIP;
        blockFlowerPot$EnumFlowerTypeArray[XTa.W] = WHITE_TULIP;
        blockFlowerPot$EnumFlowerTypeArray[Yqa.i] = PINK_TULIP;
        blockFlowerPot$EnumFlowerTypeArray[WOa.fa] = OXEYE_DAISY;
        blockFlowerPot$EnumFlowerTypeArray[NTa.C] = DANDELION;
        blockFlowerPot$EnumFlowerTypeArray[pPa.f] = OAK_SAPLING;
        blockFlowerPot$EnumFlowerTypeArray[lqa.s] = SPRUCE_SAPLING;
        blockFlowerPot$EnumFlowerTypeArray[uua.s] = BIRCH_SAPLING;
        blockFlowerPot$EnumFlowerTypeArray[hpa.Z] = JUNGLE_SAPLING;
        blockFlowerPot$EnumFlowerTypeArray[Ypa.A] = ACACIA_SAPLING;
        blockFlowerPot$EnumFlowerTypeArray[ERa.C] = DARK_OAK_SAPLING;
        blockFlowerPot$EnumFlowerTypeArray[yta.Ka] = MUSHROOM_RED;
        blockFlowerPot$EnumFlowerTypeArray[yOa.B] = MUSHROOM_BROWN;
        blockFlowerPot$EnumFlowerTypeArray[wOa.t] = DEAD_BUSH;
        blockFlowerPot$EnumFlowerTypeArray[kTa.j] = FERN;
        blockFlowerPot$EnumFlowerTypeArray[wOa.h] = CACTUS;
        $VALUES = blockFlowerPot$EnumFlowerTypeArray;
    }
}

