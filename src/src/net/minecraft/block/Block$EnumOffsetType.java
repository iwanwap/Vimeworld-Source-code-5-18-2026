/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

public final class Block$EnumOffsetType
extends Enum<Block$EnumOffsetType> {
    public static final /* enum */ Block$EnumOffsetType NONE = new Block$EnumOffsetType();
    public static final /* enum */ Block$EnumOffsetType XYZ;
    public static final /* enum */ Block$EnumOffsetType XZ;
    private static final /* synthetic */ Block$EnumOffsetType[] $VALUES;

    public static Block$EnumOffsetType[] values() {
        return (Block$EnumOffsetType[])$VALUES.clone();
    }

    private Block$EnumOffsetType() {
        int a2 = n2;
        Block$EnumOffsetType block$EnumOffsetType = this;
    }

    static {
        XZ = new Block$EnumOffsetType();
        XYZ = new Block$EnumOffsetType();
        Block$EnumOffsetType[] block$EnumOffsetTypeArray = new Block$EnumOffsetType[yRa.d];
        block$EnumOffsetTypeArray[uSa.E] = NONE;
        block$EnumOffsetTypeArray[vRa.d] = XZ;
        block$EnumOffsetTypeArray[uqa.g] = XYZ;
        $VALUES = block$EnumOffsetTypeArray;
    }

    public static Block$EnumOffsetType valueOf(String a2) {
        return Enum.valueOf(Block$EnumOffsetType.class, a2);
    }
}

