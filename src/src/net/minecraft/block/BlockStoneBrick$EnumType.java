/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  Rua
 *  XSa
 *  psa
 *  vRa
 *  zsa
 */
package net.minecraft.block;

public final class BlockStoneBrick$EnumType
extends Enum<BlockStoneBrick$EnumType>
implements Pb {
    private static final BlockStoneBrick$EnumType[] META_LOOKUP;
    private final int meta;
    public static final /* enum */ BlockStoneBrick$EnumType DEFAULT;
    private static final /* synthetic */ BlockStoneBrick$EnumType[] $VALUES;
    public static final /* enum */ BlockStoneBrick$EnumType MOSSY;
    private final String name;
    private final String unlocalizedName;
    public static final /* enum */ BlockStoneBrick$EnumType CRACKED;
    public static final /* enum */ BlockStoneBrick$EnumType CHISELED;

    public String getName() {
        BlockStoneBrick$EnumType a2;
        return a2.name;
    }

    public String getUnlocalizedName() {
        BlockStoneBrick$EnumType a2;
        return a2.unlocalizedName;
    }

    public static BlockStoneBrick$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public String toString() {
        BlockStoneBrick$EnumType a2;
        return a2.name;
    }

    public static BlockStoneBrick$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockStoneBrick$EnumType.class, a2);
    }

    public static BlockStoneBrick$EnumType[] values() {
        return (BlockStoneBrick$EnumType[])$VALUES.clone();
    }

    static {
        int n2;
        DEFAULT = new BlockStoneBrick$EnumType(uSa.E, csa.S, BQa.la);
        MOSSY = new BlockStoneBrick$EnumType(vRa.d, Rua.B, zsa.i);
        CRACKED = new BlockStoneBrick$EnumType(uqa.g, psa.Fa, Ora.k);
        CHISELED = new BlockStoneBrick$EnumType(yRa.d, XSa.A, Jpa.w);
        BlockStoneBrick$EnumType[] blockStoneBrick$EnumTypeArray = new BlockStoneBrick$EnumType[AQa.P];
        blockStoneBrick$EnumTypeArray[uSa.E] = DEFAULT;
        blockStoneBrick$EnumTypeArray[vRa.d] = MOSSY;
        blockStoneBrick$EnumTypeArray[uqa.g] = CRACKED;
        blockStoneBrick$EnumTypeArray[yRa.d] = CHISELED;
        $VALUES = blockStoneBrick$EnumTypeArray;
        META_LOOKUP = new BlockStoneBrick$EnumType[BlockStoneBrick$EnumType.values().length];
        BlockStoneBrick$EnumType[] blockStoneBrick$EnumTypeArray2 = BlockStoneBrick$EnumType.values();
        int n3 = blockStoneBrick$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockStoneBrick$EnumType blockStoneBrick$EnumType;
            BlockStoneBrick$EnumType.META_LOOKUP[blockStoneBrick$EnumType.getMetadata()] = blockStoneBrick$EnumType = blockStoneBrick$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public int getMetadata() {
        BlockStoneBrick$EnumType a2;
        return a2.meta;
    }

    /*
     * WARNING - void declaration
     */
    private BlockStoneBrick$EnumType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockStoneBrick$EnumType a2;
        BlockStoneBrick$EnumType blockStoneBrick$EnumType = object;
        Object object = string3;
        BlockStoneBrick$EnumType blockStoneBrick$EnumType2 = a2 = blockStoneBrick$EnumType;
        a2.meta = c2;
        blockStoneBrick$EnumType2.name = b2;
        blockStoneBrick$EnumType2.unlocalizedName = d2;
    }
}

