/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  kta
 *  pQa
 *  vRa
 */
package net.minecraft.block;

public final class BlockDoor$EnumHingePosition
extends Enum<BlockDoor$EnumHingePosition>
implements Pb {
    private static final /* synthetic */ BlockDoor$EnumHingePosition[] $VALUES;
    public static final /* enum */ BlockDoor$EnumHingePosition LEFT = new BlockDoor$EnumHingePosition();
    public static final /* enum */ BlockDoor$EnumHingePosition RIGHT = new BlockDoor$EnumHingePosition();

    public String toString() {
        BlockDoor$EnumHingePosition a2;
        return a2.getName();
    }

    public String getName() {
        BlockDoor$EnumHingePosition a2;
        if (a2 == LEFT) {
            return pQa.i;
        }
        return kta.Aa;
    }

    public static BlockDoor$EnumHingePosition[] values() {
        return (BlockDoor$EnumHingePosition[])$VALUES.clone();
    }

    public static BlockDoor$EnumHingePosition valueOf(String a2) {
        return Enum.valueOf(BlockDoor$EnumHingePosition.class, a2);
    }

    private BlockDoor$EnumHingePosition() {
        int a2 = n2;
        BlockDoor$EnumHingePosition blockDoor$EnumHingePosition = this;
    }

    static {
        BlockDoor$EnumHingePosition[] blockDoor$EnumHingePositionArray = new BlockDoor$EnumHingePosition[uqa.g];
        blockDoor$EnumHingePositionArray[uSa.E] = LEFT;
        blockDoor$EnumHingePositionArray[vRa.d] = RIGHT;
        $VALUES = blockDoor$EnumHingePositionArray;
    }
}

