/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  SOa
 *  Xsa
 *  aSa
 *  vRa
 */
package net.minecraft.block;

public final class BlockPrismarine$EnumType
extends Enum<BlockPrismarine$EnumType>
implements Pb {
    public static final /* enum */ BlockPrismarine$EnumType DARK;
    private final String name;
    private final int meta;
    private static final BlockPrismarine$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockPrismarine$EnumType BRICKS;
    public static final /* enum */ BlockPrismarine$EnumType ROUGH;
    private static final /* synthetic */ BlockPrismarine$EnumType[] $VALUES;
    private final String unlocalizedName;

    public int getMetadata() {
        BlockPrismarine$EnumType a2;
        return a2.meta;
    }

    public String getUnlocalizedName() {
        BlockPrismarine$EnumType a2;
        return a2.unlocalizedName;
    }

    public String getName() {
        BlockPrismarine$EnumType a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private BlockPrismarine$EnumType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockPrismarine$EnumType a2;
        BlockPrismarine$EnumType blockPrismarine$EnumType = object;
        Object object = string3;
        BlockPrismarine$EnumType blockPrismarine$EnumType2 = a2 = blockPrismarine$EnumType;
        a2.meta = c2;
        blockPrismarine$EnumType2.name = b2;
        blockPrismarine$EnumType2.unlocalizedName = d2;
    }

    public String toString() {
        BlockPrismarine$EnumType a2;
        return a2.name;
    }

    static {
        int n2;
        ROUGH = new BlockPrismarine$EnumType(uSa.E, Era.X, Qpa.e);
        BRICKS = new BlockPrismarine$EnumType(vRa.d, XOa.W, Xsa.H);
        DARK = new BlockPrismarine$EnumType(uqa.g, SOa.Y, aSa.F);
        BlockPrismarine$EnumType[] blockPrismarine$EnumTypeArray = new BlockPrismarine$EnumType[yRa.d];
        blockPrismarine$EnumTypeArray[uSa.E] = ROUGH;
        blockPrismarine$EnumTypeArray[vRa.d] = BRICKS;
        blockPrismarine$EnumTypeArray[uqa.g] = DARK;
        $VALUES = blockPrismarine$EnumTypeArray;
        META_LOOKUP = new BlockPrismarine$EnumType[BlockPrismarine$EnumType.values().length];
        BlockPrismarine$EnumType[] blockPrismarine$EnumTypeArray2 = BlockPrismarine$EnumType.values();
        int n3 = blockPrismarine$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockPrismarine$EnumType blockPrismarine$EnumType;
            BlockPrismarine$EnumType.META_LOOKUP[blockPrismarine$EnumType.getMetadata()] = blockPrismarine$EnumType = blockPrismarine$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public static BlockPrismarine$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockPrismarine$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockPrismarine$EnumType.class, a2);
    }

    public static BlockPrismarine$EnumType[] values() {
        return (BlockPrismarine$EnumType[])$VALUES.clone();
    }
}

