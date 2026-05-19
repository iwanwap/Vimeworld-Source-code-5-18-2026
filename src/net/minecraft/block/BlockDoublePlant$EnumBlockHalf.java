/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  XSa
 *  vRa
 */
package net.minecraft.block;

public final class BlockDoublePlant$EnumBlockHalf
extends Enum<BlockDoublePlant$EnumBlockHalf>
implements Pb {
    public static final /* enum */ BlockDoublePlant$EnumBlockHalf UPPER = new BlockDoublePlant$EnumBlockHalf();
    public static final /* enum */ BlockDoublePlant$EnumBlockHalf LOWER = new BlockDoublePlant$EnumBlockHalf();
    private static final /* synthetic */ BlockDoublePlant$EnumBlockHalf[] $VALUES;

    static {
        BlockDoublePlant$EnumBlockHalf[] blockDoublePlant$EnumBlockHalfArray = new BlockDoublePlant$EnumBlockHalf[uqa.g];
        blockDoublePlant$EnumBlockHalfArray[uSa.E] = UPPER;
        blockDoublePlant$EnumBlockHalfArray[vRa.d] = LOWER;
        $VALUES = blockDoublePlant$EnumBlockHalfArray;
    }

    public static BlockDoublePlant$EnumBlockHalf[] values() {
        return (BlockDoublePlant$EnumBlockHalf[])$VALUES.clone();
    }

    public String getName() {
        BlockDoublePlant$EnumBlockHalf a2;
        if (a2 == UPPER) {
            return XSa.y;
        }
        return Mqa.s;
    }

    public String toString() {
        BlockDoublePlant$EnumBlockHalf a2;
        return a2.getName();
    }

    public static BlockDoublePlant$EnumBlockHalf valueOf(String a2) {
        return Enum.valueOf(BlockDoublePlant$EnumBlockHalf.class, a2);
    }

    private BlockDoublePlant$EnumBlockHalf() {
        int a2 = n2;
        BlockDoublePlant$EnumBlockHalf blockDoublePlant$EnumBlockHalf = this;
    }
}

