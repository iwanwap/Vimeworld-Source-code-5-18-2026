/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  SRa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.MapColor;

public final class BlockStoneSlabNew$EnumType
extends Enum<BlockStoneSlabNew$EnumType>
implements Pb {
    private static final /* synthetic */ BlockStoneSlabNew$EnumType[] $VALUES;
    private static final BlockStoneSlabNew$EnumType[] META_LOOKUP;
    private final MapColor field_181069_e;
    public static final /* enum */ BlockStoneSlabNew$EnumType RED_SANDSTONE;
    private final int meta;
    private final String name;

    public static BlockStoneSlabNew$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockStoneSlabNew$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockStoneSlabNew$EnumType.class, a2);
    }

    public String getUnlocalizedName() {
        BlockStoneSlabNew$EnumType a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private BlockStoneSlabNew$EnumType(int n3, String string2, MapColor mapColor) {
        Object d2;
        void b2;
        void c2;
        BlockStoneSlabNew$EnumType a2;
        BlockStoneSlabNew$EnumType blockStoneSlabNew$EnumType = object;
        Object object = mapColor;
        BlockStoneSlabNew$EnumType blockStoneSlabNew$EnumType2 = a2 = blockStoneSlabNew$EnumType;
        a2.meta = c2;
        blockStoneSlabNew$EnumType2.name = b2;
        blockStoneSlabNew$EnumType2.field_181069_e = d2;
    }

    public int getMetadata() {
        BlockStoneSlabNew$EnumType a2;
        return a2.meta;
    }

    static {
        int n2;
        RED_SANDSTONE = new BlockStoneSlabNew$EnumType(uSa.E, SRa.M, BlockSand$EnumType.RED_SAND.getMapColor());
        BlockStoneSlabNew$EnumType[] blockStoneSlabNew$EnumTypeArray = new BlockStoneSlabNew$EnumType[vRa.d];
        blockStoneSlabNew$EnumTypeArray[uSa.E] = RED_SANDSTONE;
        $VALUES = blockStoneSlabNew$EnumTypeArray;
        META_LOOKUP = new BlockStoneSlabNew$EnumType[BlockStoneSlabNew$EnumType.values().length];
        BlockStoneSlabNew$EnumType[] blockStoneSlabNew$EnumTypeArray2 = BlockStoneSlabNew$EnumType.values();
        int n3 = blockStoneSlabNew$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockStoneSlabNew$EnumType blockStoneSlabNew$EnumType;
            BlockStoneSlabNew$EnumType.META_LOOKUP[blockStoneSlabNew$EnumType.getMetadata()] = blockStoneSlabNew$EnumType = blockStoneSlabNew$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public MapColor func_181068_c() {
        BlockStoneSlabNew$EnumType a2;
        return a2.field_181069_e;
    }

    public static BlockStoneSlabNew$EnumType[] values() {
        return (BlockStoneSlabNew$EnumType[])$VALUES.clone();
    }

    public String getName() {
        BlockStoneSlabNew$EnumType a2;
        return a2.name;
    }

    public String toString() {
        BlockStoneSlabNew$EnumType a2;
        return a2.name;
    }
}

