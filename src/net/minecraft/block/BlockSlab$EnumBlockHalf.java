/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  Pb
 *  vRa
 */
package net.minecraft.block;

public final class BlockSlab$EnumBlockHalf
extends Enum<BlockSlab$EnumBlockHalf>
implements Pb {
    private static final /* synthetic */ BlockSlab$EnumBlockHalf[] $VALUES;
    public static final /* enum */ BlockSlab$EnumBlockHalf BOTTOM;
    public static final /* enum */ BlockSlab$EnumBlockHalf TOP;
    private final String name;

    private BlockSlab$EnumBlockHalf(String string2) {
        Object b2 = string2;
        BlockSlab$EnumBlockHalf a2 = this;
        a2.name = b2;
    }

    public String getName() {
        BlockSlab$EnumBlockHalf a2;
        return a2.name;
    }

    public String toString() {
        BlockSlab$EnumBlockHalf a2;
        return a2.name;
    }

    static {
        TOP = new BlockSlab$EnumBlockHalf(JSa.z);
        BOTTOM = new BlockSlab$EnumBlockHalf(vsa.Ha);
        BlockSlab$EnumBlockHalf[] blockSlab$EnumBlockHalfArray = new BlockSlab$EnumBlockHalf[uqa.g];
        blockSlab$EnumBlockHalfArray[uSa.E] = TOP;
        blockSlab$EnumBlockHalfArray[vRa.d] = BOTTOM;
        $VALUES = blockSlab$EnumBlockHalfArray;
    }

    public static BlockSlab$EnumBlockHalf[] values() {
        return (BlockSlab$EnumBlockHalf[])$VALUES.clone();
    }

    public static BlockSlab$EnumBlockHalf valueOf(String a2) {
        return Enum.valueOf(BlockSlab$EnumBlockHalf.class, a2);
    }
}

