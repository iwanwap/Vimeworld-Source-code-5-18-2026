/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  Pb
 *  vRa
 */
package net.minecraft.block;

public final class BlockTrapDoor$DoorHalf
extends Enum<BlockTrapDoor$DoorHalf>
implements Pb {
    private static final /* synthetic */ BlockTrapDoor$DoorHalf[] $VALUES;
    public static final /* enum */ BlockTrapDoor$DoorHalf BOTTOM;
    public static final /* enum */ BlockTrapDoor$DoorHalf TOP;
    private final String name;

    public static BlockTrapDoor$DoorHalf valueOf(String a2) {
        return Enum.valueOf(BlockTrapDoor$DoorHalf.class, a2);
    }

    private BlockTrapDoor$DoorHalf(String string2) {
        Object b2 = string2;
        BlockTrapDoor$DoorHalf a2 = this;
        a2.name = b2;
    }

    public String getName() {
        BlockTrapDoor$DoorHalf a2;
        return a2.name;
    }

    static {
        TOP = new BlockTrapDoor$DoorHalf(JSa.z);
        BOTTOM = new BlockTrapDoor$DoorHalf(vsa.Ha);
        BlockTrapDoor$DoorHalf[] blockTrapDoor$DoorHalfArray = new BlockTrapDoor$DoorHalf[uqa.g];
        blockTrapDoor$DoorHalfArray[uSa.E] = TOP;
        blockTrapDoor$DoorHalfArray[vRa.d] = BOTTOM;
        $VALUES = blockTrapDoor$DoorHalfArray;
    }

    public static BlockTrapDoor$DoorHalf[] values() {
        return (BlockTrapDoor$DoorHalf[])$VALUES.clone();
    }

    public String toString() {
        BlockTrapDoor$DoorHalf a2;
        return a2.name;
    }
}

