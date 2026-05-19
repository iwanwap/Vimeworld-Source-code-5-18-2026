/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;

public final class BlockSand$EnumType
extends Enum<BlockSand$EnumType>
implements Pb {
    private final String name;
    private static final BlockSand$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockSand$EnumType SAND;
    private final int meta;
    public static final /* enum */ BlockSand$EnumType RED_SAND;
    private final MapColor mapColor;
    private static final /* synthetic */ BlockSand$EnumType[] $VALUES;
    private final String unlocalizedName;

    public static BlockSand$EnumType[] values() {
        return (BlockSand$EnumType[])$VALUES.clone();
    }

    public String toString() {
        BlockSand$EnumType a2;
        return a2.name;
    }

    public int getMetadata() {
        BlockSand$EnumType a2;
        return a2.meta;
    }

    public String getUnlocalizedName() {
        BlockSand$EnumType a2;
        return a2.unlocalizedName;
    }

    public static BlockSand$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockSand$EnumType.class, a2);
    }

    static {
        int n2;
        SAND = new BlockSand$EnumType(uSa.E, dqa.la, BQa.la, MapColor.sandColor);
        RED_SAND = new BlockSand$EnumType(vRa.d, Qpa.V, rQa.Y, MapColor.adobeColor);
        BlockSand$EnumType[] blockSand$EnumTypeArray = new BlockSand$EnumType[uqa.g];
        blockSand$EnumTypeArray[uSa.E] = SAND;
        blockSand$EnumTypeArray[vRa.d] = RED_SAND;
        $VALUES = blockSand$EnumTypeArray;
        META_LOOKUP = new BlockSand$EnumType[BlockSand$EnumType.values().length];
        BlockSand$EnumType[] blockSand$EnumTypeArray2 = BlockSand$EnumType.values();
        int n3 = blockSand$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockSand$EnumType blockSand$EnumType;
            BlockSand$EnumType.META_LOOKUP[blockSand$EnumType.getMetadata()] = blockSand$EnumType = blockSand$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public String getName() {
        BlockSand$EnumType a2;
        return a2.name;
    }

    public MapColor getMapColor() {
        BlockSand$EnumType a2;
        return a2.mapColor;
    }

    /*
     * WARNING - void declaration
     */
    private BlockSand$EnumType(int n3, String string2, String string3, MapColor mapColor) {
        void b2;
        Object e2;
        void c2;
        void d2;
        BlockSand$EnumType a2;
        BlockSand$EnumType blockSand$EnumType = object;
        Object object = mapColor;
        BlockSand$EnumType blockSand$EnumType2 = a2 = blockSand$EnumType;
        BlockSand$EnumType blockSand$EnumType3 = a2;
        blockSand$EnumType3.meta = d2;
        blockSand$EnumType3.name = c2;
        blockSand$EnumType2.mapColor = e2;
        blockSand$EnumType2.unlocalizedName = b2;
    }

    public static BlockSand$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }
}

