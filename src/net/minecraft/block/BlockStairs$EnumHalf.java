/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  Pb
 *  vRa
 */
package net.minecraft.block;

public final class BlockStairs$EnumHalf
extends Enum<BlockStairs$EnumHalf>
implements Pb {
    public static final /* enum */ BlockStairs$EnumHalf TOP = new BlockStairs$EnumHalf(JSa.z);
    public static final /* enum */ BlockStairs$EnumHalf BOTTOM = new BlockStairs$EnumHalf(vsa.Ha);
    private static final /* synthetic */ BlockStairs$EnumHalf[] $VALUES;
    private final String name;

    private BlockStairs$EnumHalf(String string2) {
        Object b2 = string2;
        BlockStairs$EnumHalf a2 = this;
        a2.name = b2;
    }

    static {
        BlockStairs$EnumHalf[] blockStairs$EnumHalfArray = new BlockStairs$EnumHalf[uqa.g];
        blockStairs$EnumHalfArray[uSa.E] = TOP;
        blockStairs$EnumHalfArray[vRa.d] = BOTTOM;
        $VALUES = blockStairs$EnumHalfArray;
    }

    public String getName() {
        BlockStairs$EnumHalf a2;
        return a2.name;
    }

    public static BlockStairs$EnumHalf[] values() {
        return (BlockStairs$EnumHalf[])$VALUES.clone();
    }

    public static BlockStairs$EnumHalf valueOf(String a2) {
        return Enum.valueOf(BlockStairs$EnumHalf.class, a2);
    }

    public String toString() {
        BlockStairs$EnumHalf a2;
        return a2.name;
    }
}

