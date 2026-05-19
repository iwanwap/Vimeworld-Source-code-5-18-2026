/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Pb
 *  WSa
 *  vRa
 *  zTa
 */
package net.minecraft.block;

public final class BlockSandStone$EnumType
extends Enum<BlockSandStone$EnumType>
implements Pb {
    private final int metadata;
    private static final /* synthetic */ BlockSandStone$EnumType[] $VALUES;
    private final String name;
    private final String unlocalizedName;
    public static final /* enum */ BlockSandStone$EnumType DEFAULT;
    private static final BlockSandStone$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockSandStone$EnumType CHISELED;
    public static final /* enum */ BlockSandStone$EnumType SMOOTH;

    /*
     * WARNING - void declaration
     */
    private BlockSandStone$EnumType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockSandStone$EnumType a2;
        BlockSandStone$EnumType blockSandStone$EnumType = object;
        Object object = string3;
        BlockSandStone$EnumType blockSandStone$EnumType2 = a2 = blockSandStone$EnumType;
        a2.metadata = c2;
        blockSandStone$EnumType2.name = b2;
        blockSandStone$EnumType2.unlocalizedName = d2;
    }

    public String toString() {
        BlockSandStone$EnumType a2;
        return a2.name;
    }

    public String getUnlocalizedName() {
        BlockSandStone$EnumType a2;
        return a2.unlocalizedName;
    }

    public static BlockSandStone$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockSandStone$EnumType.class, a2);
    }

    public int getMetadata() {
        BlockSandStone$EnumType a2;
        return a2.metadata;
    }

    static {
        int n2;
        DEFAULT = new BlockSandStone$EnumType(uSa.E, zTa.M, BQa.la);
        CHISELED = new BlockSandStone$EnumType(vRa.d, cPa.N, Jpa.w);
        SMOOTH = new BlockSandStone$EnumType(uqa.g, BRa.N, WSa.l);
        BlockSandStone$EnumType[] blockSandStone$EnumTypeArray = new BlockSandStone$EnumType[yRa.d];
        blockSandStone$EnumTypeArray[uSa.E] = DEFAULT;
        blockSandStone$EnumTypeArray[vRa.d] = CHISELED;
        blockSandStone$EnumTypeArray[uqa.g] = SMOOTH;
        $VALUES = blockSandStone$EnumTypeArray;
        META_LOOKUP = new BlockSandStone$EnumType[BlockSandStone$EnumType.values().length];
        BlockSandStone$EnumType[] blockSandStone$EnumTypeArray2 = BlockSandStone$EnumType.values();
        int n3 = blockSandStone$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockSandStone$EnumType blockSandStone$EnumType;
            BlockSandStone$EnumType.META_LOOKUP[blockSandStone$EnumType.getMetadata()] = blockSandStone$EnumType = blockSandStone$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public static BlockSandStone$EnumType[] values() {
        return (BlockSandStone$EnumType[])$VALUES.clone();
    }

    public String getName() {
        BlockSandStone$EnumType a2;
        return a2.name;
    }

    public static BlockSandStone$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }
}

