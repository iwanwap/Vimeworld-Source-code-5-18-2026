/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  TPa
 *  dQa
 *  vRa
 */
package net.minecraft.block;

public final class BlockRedstoneWire$EnumAttachPosition
extends Enum<BlockRedstoneWire$EnumAttachPosition>
implements Pb {
    private final String name;
    public static final /* enum */ BlockRedstoneWire$EnumAttachPosition SIDE;
    public static final /* enum */ BlockRedstoneWire$EnumAttachPosition UP;
    private static final /* synthetic */ BlockRedstoneWire$EnumAttachPosition[] $VALUES;
    public static final /* enum */ BlockRedstoneWire$EnumAttachPosition NONE;

    public String getName() {
        BlockRedstoneWire$EnumAttachPosition a2;
        return a2.name;
    }

    public static BlockRedstoneWire$EnumAttachPosition[] values() {
        return (BlockRedstoneWire$EnumAttachPosition[])$VALUES.clone();
    }

    static {
        UP = new BlockRedstoneWire$EnumAttachPosition(dsa.a);
        SIDE = new BlockRedstoneWire$EnumAttachPosition(dQa.y);
        NONE = new BlockRedstoneWire$EnumAttachPosition(TPa.n);
        BlockRedstoneWire$EnumAttachPosition[] blockRedstoneWire$EnumAttachPositionArray = new BlockRedstoneWire$EnumAttachPosition[yRa.d];
        blockRedstoneWire$EnumAttachPositionArray[uSa.E] = UP;
        blockRedstoneWire$EnumAttachPositionArray[vRa.d] = SIDE;
        blockRedstoneWire$EnumAttachPositionArray[uqa.g] = NONE;
        $VALUES = blockRedstoneWire$EnumAttachPositionArray;
    }

    private BlockRedstoneWire$EnumAttachPosition(String string2) {
        Object b2 = string2;
        BlockRedstoneWire$EnumAttachPosition a2 = this;
        a2.name = b2;
    }

    public static BlockRedstoneWire$EnumAttachPosition valueOf(String a2) {
        return Enum.valueOf(BlockRedstoneWire$EnumAttachPosition.class, a2);
    }

    public String toString() {
        BlockRedstoneWire$EnumAttachPosition a2;
        return a2.getName();
    }
}

