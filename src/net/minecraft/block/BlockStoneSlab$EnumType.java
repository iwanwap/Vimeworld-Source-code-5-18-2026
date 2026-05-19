/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  Pb
 *  SRa
 *  Wsa
 *  XTa
 *  fTa
 *  fpa
 *  vRa
 *  zTa
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;

public final class BlockStoneSlab$EnumType
extends Enum<BlockStoneSlab$EnumType>
implements Pb {
    private static final BlockStoneSlab$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockStoneSlab$EnumType COBBLESTONE;
    private final MapColor field_181075_k;
    public static final /* enum */ BlockStoneSlab$EnumType STONE;
    private final String name;
    private static final /* synthetic */ BlockStoneSlab$EnumType[] $VALUES;
    public static final /* enum */ BlockStoneSlab$EnumType NETHERBRICK;
    public static final /* enum */ BlockStoneSlab$EnumType BRICK;
    public static final /* enum */ BlockStoneSlab$EnumType SMOOTHBRICK;
    public static final /* enum */ BlockStoneSlab$EnumType QUARTZ;
    public static final /* enum */ BlockStoneSlab$EnumType WOOD;
    public static final /* enum */ BlockStoneSlab$EnumType SAND;
    private final int meta;
    private final String unlocalizedName;

    public MapColor func_181074_c() {
        BlockStoneSlab$EnumType a2;
        return a2.field_181075_k;
    }

    /*
     * WARNING - void declaration
     */
    private BlockStoneSlab$EnumType(int n3, MapColor mapColor, String string2, String string3) {
        Object e2;
        void b2;
        void c2;
        void d2;
        BlockStoneSlab$EnumType a2;
        BlockStoneSlab$EnumType blockStoneSlab$EnumType = object;
        Object object = string3;
        BlockStoneSlab$EnumType blockStoneSlab$EnumType2 = a2 = blockStoneSlab$EnumType;
        BlockStoneSlab$EnumType blockStoneSlab$EnumType3 = a2;
        blockStoneSlab$EnumType3.meta = d2;
        blockStoneSlab$EnumType3.field_181075_k = c2;
        blockStoneSlab$EnumType2.name = b2;
        blockStoneSlab$EnumType2.unlocalizedName = e2;
    }

    public static BlockStoneSlab$EnumType[] values() {
        return (BlockStoneSlab$EnumType[])$VALUES.clone();
    }

    public String toString() {
        BlockStoneSlab$EnumType a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private BlockStoneSlab$EnumType(int n3, MapColor mapColor, String string2) {
        void b2;
        void c2;
        Object d2;
        BlockStoneSlab$EnumType blockStoneSlab$EnumType = object;
        Object object = string2;
        BlockStoneSlab$EnumType a2 = blockStoneSlab$EnumType;
        Object object2 = d2;
        a2((int)c2, (MapColor)b2, (String)object2, (String)object2);
    }

    public String getUnlocalizedName() {
        BlockStoneSlab$EnumType a2;
        return a2.unlocalizedName;
    }

    public String getName() {
        BlockStoneSlab$EnumType a2;
        return a2.name;
    }

    static {
        int n2;
        STONE = new BlockStoneSlab$EnumType(uSa.E, MapColor.stoneColor, fpa.F);
        SAND = new BlockStoneSlab$EnumType(vRa.d, MapColor.sandColor, zTa.M, dqa.la);
        WOOD = new BlockStoneSlab$EnumType(uqa.g, MapColor.woodColor, WOa.R, yRa.Ja);
        COBBLESTONE = new BlockStoneSlab$EnumType(yRa.d, MapColor.stoneColor, ATa.ga, Epa.L);
        BRICK = new BlockStoneSlab$EnumType(AQa.P, MapColor.redColor, Wsa.f);
        SMOOTHBRICK = new BlockStoneSlab$EnumType(tTa.h, MapColor.stoneColor, vua.j, Qpa.I);
        NETHERBRICK = new BlockStoneSlab$EnumType(uua.p, MapColor.netherrackColor, fTa.c, fqa.l);
        QUARTZ = new BlockStoneSlab$EnumType(XTa.W, MapColor.quartzColor, SRa.u);
        BlockStoneSlab$EnumType[] blockStoneSlab$EnumTypeArray = new BlockStoneSlab$EnumType[Yqa.i];
        blockStoneSlab$EnumTypeArray[uSa.E] = STONE;
        blockStoneSlab$EnumTypeArray[vRa.d] = SAND;
        blockStoneSlab$EnumTypeArray[uqa.g] = WOOD;
        blockStoneSlab$EnumTypeArray[yRa.d] = COBBLESTONE;
        blockStoneSlab$EnumTypeArray[AQa.P] = BRICK;
        blockStoneSlab$EnumTypeArray[tTa.h] = SMOOTHBRICK;
        blockStoneSlab$EnumTypeArray[uua.p] = NETHERBRICK;
        blockStoneSlab$EnumTypeArray[XTa.W] = QUARTZ;
        $VALUES = blockStoneSlab$EnumTypeArray;
        META_LOOKUP = new BlockStoneSlab$EnumType[BlockStoneSlab$EnumType.values().length];
        BlockStoneSlab$EnumType[] blockStoneSlab$EnumTypeArray2 = BlockStoneSlab$EnumType.values();
        int n3 = blockStoneSlab$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockStoneSlab$EnumType blockStoneSlab$EnumType;
            BlockStoneSlab$EnumType.META_LOOKUP[blockStoneSlab$EnumType.getMetadata()] = blockStoneSlab$EnumType = blockStoneSlab$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public int getMetadata() {
        BlockStoneSlab$EnumType a2;
        return a2.meta;
    }

    public static BlockStoneSlab$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockStoneSlab$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockStoneSlab$EnumType.class, a2);
    }
}

