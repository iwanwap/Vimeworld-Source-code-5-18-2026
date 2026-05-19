/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  XSa
 *  vRa
 */
package net.minecraft.block;

public final class BlockDoor$EnumDoorHalf
extends Enum<BlockDoor$EnumDoorHalf>
implements Pb {
    public static final /* enum */ BlockDoor$EnumDoorHalf UPPER = new BlockDoor$EnumDoorHalf();
    private static final /* synthetic */ BlockDoor$EnumDoorHalf[] $VALUES;
    public static final /* enum */ BlockDoor$EnumDoorHalf LOWER = new BlockDoor$EnumDoorHalf();

    static {
        BlockDoor$EnumDoorHalf[] blockDoor$EnumDoorHalfArray = new BlockDoor$EnumDoorHalf[uqa.g];
        blockDoor$EnumDoorHalfArray[uSa.E] = UPPER;
        blockDoor$EnumDoorHalfArray[vRa.d] = LOWER;
        $VALUES = blockDoor$EnumDoorHalfArray;
    }

    public String toString() {
        BlockDoor$EnumDoorHalf a2;
        return a2.getName();
    }

    public static BlockDoor$EnumDoorHalf[] values() {
        return (BlockDoor$EnumDoorHalf[])$VALUES.clone();
    }

    public String getName() {
        BlockDoor$EnumDoorHalf a2;
        if (a2 == UPPER) {
            return XSa.y;
        }
        return Mqa.s;
    }

    private BlockDoor$EnumDoorHalf() {
        int a2 = n2;
        BlockDoor$EnumDoorHalf blockDoor$EnumDoorHalf = this;
    }

    public static BlockDoor$EnumDoorHalf valueOf(String a2) {
        return Enum.valueOf(BlockDoor$EnumDoorHalf.class, a2);
    }
}

