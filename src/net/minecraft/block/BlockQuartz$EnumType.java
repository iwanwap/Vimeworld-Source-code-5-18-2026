/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  XSa
 *  vRa
 */
package net.minecraft.block;

public final class BlockQuartz$EnumType
extends Enum<BlockQuartz$EnumType>
implements Pb {
    public static final /* enum */ BlockQuartz$EnumType DEFAULT;
    private final String field_176805_h;
    private static final BlockQuartz$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockQuartz$EnumType LINES_X;
    public static final /* enum */ BlockQuartz$EnumType LINES_Y;
    private final int meta;
    public static final /* enum */ BlockQuartz$EnumType CHISELED;
    private static final /* synthetic */ BlockQuartz$EnumType[] $VALUES;
    private final String unlocalizedName;
    public static final /* enum */ BlockQuartz$EnumType LINES_Z;

    public String getName() {
        BlockQuartz$EnumType a2;
        return a2.field_176805_h;
    }

    /*
     * WARNING - void declaration
     */
    private BlockQuartz$EnumType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockQuartz$EnumType a2;
        BlockQuartz$EnumType blockQuartz$EnumType = object;
        Object object = string3;
        BlockQuartz$EnumType blockQuartz$EnumType2 = a2 = blockQuartz$EnumType;
        a2.meta = c2;
        blockQuartz$EnumType2.field_176805_h = b2;
        blockQuartz$EnumType2.unlocalizedName = d2;
    }

    public String toString() {
        BlockQuartz$EnumType a2;
        return a2.unlocalizedName;
    }

    public static BlockQuartz$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockQuartz$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockQuartz$EnumType.class, a2);
    }

    public static BlockQuartz$EnumType[] values() {
        return (BlockQuartz$EnumType[])$VALUES.clone();
    }

    public int getMetadata() {
        BlockQuartz$EnumType a2;
        return a2.meta;
    }

    static {
        int n2;
        DEFAULT = new BlockQuartz$EnumType(uSa.E, BQa.la, BQa.la);
        CHISELED = new BlockQuartz$EnumType(vRa.d, Jpa.w, Jpa.w);
        LINES_Y = new BlockQuartz$EnumType(uqa.g, XSa.T, QTa.Z);
        LINES_X = new BlockQuartz$EnumType(yRa.d, Upa.v, QTa.Z);
        LINES_Z = new BlockQuartz$EnumType(AQa.P, UTa.H, QTa.Z);
        BlockQuartz$EnumType[] blockQuartz$EnumTypeArray = new BlockQuartz$EnumType[tTa.h];
        blockQuartz$EnumTypeArray[uSa.E] = DEFAULT;
        blockQuartz$EnumTypeArray[vRa.d] = CHISELED;
        blockQuartz$EnumTypeArray[uqa.g] = LINES_Y;
        blockQuartz$EnumTypeArray[yRa.d] = LINES_X;
        blockQuartz$EnumTypeArray[AQa.P] = LINES_Z;
        $VALUES = blockQuartz$EnumTypeArray;
        META_LOOKUP = new BlockQuartz$EnumType[BlockQuartz$EnumType.values().length];
        BlockQuartz$EnumType[] blockQuartz$EnumTypeArray2 = BlockQuartz$EnumType.values();
        int n3 = blockQuartz$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockQuartz$EnumType blockQuartz$EnumType;
            BlockQuartz$EnumType.META_LOOKUP[blockQuartz$EnumType.getMetadata()] = blockQuartz$EnumType = blockQuartz$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }
}

