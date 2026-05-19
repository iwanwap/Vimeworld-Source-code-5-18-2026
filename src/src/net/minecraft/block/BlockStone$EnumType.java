/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FTa
 *  Pb
 *  XTa
 *  Yra
 *  fpa
 *  pqa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;

public final class BlockStone$EnumType
extends Enum<BlockStone$EnumType>
implements Pb {
    private final int meta;
    private static final BlockStone$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockStone$EnumType GRANITE_SMOOTH;
    public static final /* enum */ BlockStone$EnumType ANDESITE_SMOOTH;
    public static final /* enum */ BlockStone$EnumType GRANITE;
    public static final /* enum */ BlockStone$EnumType DIORITE;
    private final MapColor field_181073_l;
    public static final /* enum */ BlockStone$EnumType DIORITE_SMOOTH;
    public static final /* enum */ BlockStone$EnumType ANDESITE;
    private final String unlocalizedName;
    private final String name;
    private static final /* synthetic */ BlockStone$EnumType[] $VALUES;
    public static final /* enum */ BlockStone$EnumType STONE;

    public MapColor func_181072_c() {
        BlockStone$EnumType a2;
        return a2.field_181073_l;
    }

    public static BlockStone$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockStone$EnumType[] values() {
        return (BlockStone$EnumType[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private BlockStone$EnumType(int n3, MapColor mapColor, String string2) {
        void b2;
        void c2;
        Object d2;
        BlockStone$EnumType blockStone$EnumType = object;
        Object object = string2;
        BlockStone$EnumType a2 = blockStone$EnumType;
        Object object2 = d2;
        a2((int)c2, (MapColor)b2, (String)object2, (String)object2);
    }

    /*
     * WARNING - void declaration
     */
    private BlockStone$EnumType(int n3, MapColor mapColor, String string2, String string3) {
        void c2;
        Object e2;
        void b2;
        void d2;
        BlockStone$EnumType a2;
        BlockStone$EnumType blockStone$EnumType = object;
        Object object = string3;
        BlockStone$EnumType blockStone$EnumType2 = a2 = blockStone$EnumType;
        BlockStone$EnumType blockStone$EnumType3 = a2;
        blockStone$EnumType3.meta = d2;
        blockStone$EnumType3.name = b2;
        blockStone$EnumType2.unlocalizedName = e2;
        blockStone$EnumType2.field_181073_l = c2;
    }

    public String getName() {
        BlockStone$EnumType a2;
        return a2.name;
    }

    public static BlockStone$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockStone$EnumType.class, a2);
    }

    public int getMetadata() {
        BlockStone$EnumType a2;
        return a2.meta;
    }

    public String getUnlocalizedName() {
        BlockStone$EnumType a2;
        return a2.unlocalizedName;
    }

    static {
        int n2;
        STONE = new BlockStone$EnumType(uSa.E, MapColor.stoneColor, fpa.F);
        GRANITE = new BlockStone$EnumType(vRa.d, MapColor.dirtColor, kra.Aa);
        GRANITE_SMOOTH = new BlockStone$EnumType(uqa.g, MapColor.dirtColor, ypa.S, Ura.Ja);
        DIORITE = new BlockStone$EnumType(yRa.d, MapColor.quartzColor, pqa.K);
        DIORITE_SMOOTH = new BlockStone$EnumType(AQa.P, MapColor.quartzColor, Jpa.a, Fua.G);
        ANDESITE = new BlockStone$EnumType(tTa.h, MapColor.stoneColor, BPa.F);
        ANDESITE_SMOOTH = new BlockStone$EnumType(uua.p, MapColor.stoneColor, FTa.i, Yra.h);
        BlockStone$EnumType[] blockStone$EnumTypeArray = new BlockStone$EnumType[XTa.W];
        blockStone$EnumTypeArray[uSa.E] = STONE;
        blockStone$EnumTypeArray[vRa.d] = GRANITE;
        blockStone$EnumTypeArray[uqa.g] = GRANITE_SMOOTH;
        blockStone$EnumTypeArray[yRa.d] = DIORITE;
        blockStone$EnumTypeArray[AQa.P] = DIORITE_SMOOTH;
        blockStone$EnumTypeArray[tTa.h] = ANDESITE;
        blockStone$EnumTypeArray[uua.p] = ANDESITE_SMOOTH;
        $VALUES = blockStone$EnumTypeArray;
        META_LOOKUP = new BlockStone$EnumType[BlockStone$EnumType.values().length];
        BlockStone$EnumType[] blockStone$EnumTypeArray2 = BlockStone$EnumType.values();
        int n3 = blockStone$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockStone$EnumType blockStone$EnumType;
            BlockStone$EnumType.META_LOOKUP[blockStone$EnumType.getMetadata()] = blockStone$EnumType = blockStone$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public String toString() {
        BlockStone$EnumType a2;
        return a2.name;
    }
}

