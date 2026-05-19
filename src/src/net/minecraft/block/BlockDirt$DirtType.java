/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Pb
 *  XTa
 *  aSa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;

public final class BlockDirt$DirtType
extends Enum<BlockDirt$DirtType>
implements Pb {
    public static final /* enum */ BlockDirt$DirtType COARSE_DIRT;
    private final int metadata;
    private final String name;
    public static final /* enum */ BlockDirt$DirtType DIRT;
    private final String unlocalizedName;
    private final MapColor field_181067_h;
    private static final BlockDirt$DirtType[] METADATA_LOOKUP;
    private static final /* synthetic */ BlockDirt$DirtType[] $VALUES;
    public static final /* enum */ BlockDirt$DirtType PODZOL;

    /*
     * WARNING - void declaration
     */
    private BlockDirt$DirtType(int n3, String string2, MapColor mapColor) {
        Object d2;
        void c2;
        void b2;
        BlockDirt$DirtType blockDirt$DirtType = object;
        Object object = mapColor;
        BlockDirt$DirtType a2 = blockDirt$DirtType;
        void v1 = b2;
        a2((int)c2, (String)v1, (String)v1, (MapColor)d2);
    }

    public String toString() {
        BlockDirt$DirtType a2;
        return a2.name;
    }

    public static BlockDirt$DirtType byMetadata(int a2) {
        if (a2 < 0 || a2 >= METADATA_LOOKUP.length) {
            a2 = uSa.E;
        }
        return METADATA_LOOKUP[a2];
    }

    /*
     * WARNING - void declaration
     */
    private BlockDirt$DirtType(int n3, String string2, String string3, MapColor mapColor) {
        Object e2;
        void b2;
        void c2;
        void d2;
        BlockDirt$DirtType a2;
        BlockDirt$DirtType blockDirt$DirtType = object;
        Object object = mapColor;
        BlockDirt$DirtType blockDirt$DirtType2 = a2 = blockDirt$DirtType;
        BlockDirt$DirtType blockDirt$DirtType3 = a2;
        blockDirt$DirtType3.metadata = d2;
        blockDirt$DirtType3.name = c2;
        blockDirt$DirtType2.unlocalizedName = b2;
        blockDirt$DirtType2.field_181067_h = e2;
    }

    public MapColor func_181066_d() {
        BlockDirt$DirtType a2;
        return a2.field_181067_h;
    }

    public int getMetadata() {
        BlockDirt$DirtType a2;
        return a2.metadata;
    }

    public String getName() {
        BlockDirt$DirtType a2;
        return a2.name;
    }

    public static BlockDirt$DirtType[] values() {
        return (BlockDirt$DirtType[])$VALUES.clone();
    }

    public String getUnlocalizedName() {
        BlockDirt$DirtType a2;
        return a2.unlocalizedName;
    }

    public static BlockDirt$DirtType valueOf(String a2) {
        return Enum.valueOf(BlockDirt$DirtType.class, a2);
    }

    static {
        int n2;
        DIRT = new BlockDirt$DirtType(uSa.E, aSa.P, BQa.la, MapColor.dirtColor);
        COARSE_DIRT = new BlockDirt$DirtType(vRa.d, XTa.R, Bpa.y, MapColor.dirtColor);
        PODZOL = new BlockDirt$DirtType(uqa.g, WRa.B, MapColor.obsidianColor);
        BlockDirt$DirtType[] blockDirt$DirtTypeArray = new BlockDirt$DirtType[yRa.d];
        blockDirt$DirtTypeArray[uSa.E] = DIRT;
        blockDirt$DirtTypeArray[vRa.d] = COARSE_DIRT;
        blockDirt$DirtTypeArray[uqa.g] = PODZOL;
        $VALUES = blockDirt$DirtTypeArray;
        METADATA_LOOKUP = new BlockDirt$DirtType[BlockDirt$DirtType.values().length];
        BlockDirt$DirtType[] blockDirt$DirtTypeArray2 = BlockDirt$DirtType.values();
        int n3 = blockDirt$DirtTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockDirt$DirtType blockDirt$DirtType;
            BlockDirt$DirtType.METADATA_LOOKUP[blockDirt$DirtType.getMetadata()] = blockDirt$DirtType = blockDirt$DirtTypeArray2[n2];
            n4 = ++n2;
        }
    }
}

