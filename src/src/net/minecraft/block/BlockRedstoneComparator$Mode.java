/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  vRa
 *  yra
 */
package net.minecraft.block;

public final class BlockRedstoneComparator$Mode
extends Enum<BlockRedstoneComparator$Mode>
implements Pb {
    public static final /* enum */ BlockRedstoneComparator$Mode SUBTRACT;
    public static final /* enum */ BlockRedstoneComparator$Mode COMPARE;
    private static final /* synthetic */ BlockRedstoneComparator$Mode[] $VALUES;
    private final String name;

    public String toString() {
        BlockRedstoneComparator$Mode a2;
        return a2.name;
    }

    private BlockRedstoneComparator$Mode(String string2) {
        Object b2 = string2;
        BlockRedstoneComparator$Mode a2 = this;
        a2.name = b2;
    }

    static {
        COMPARE = new BlockRedstoneComparator$Mode(yra.x);
        SUBTRACT = new BlockRedstoneComparator$Mode(yOa.u);
        BlockRedstoneComparator$Mode[] blockRedstoneComparator$ModeArray = new BlockRedstoneComparator$Mode[uqa.g];
        blockRedstoneComparator$ModeArray[uSa.E] = COMPARE;
        blockRedstoneComparator$ModeArray[vRa.d] = SUBTRACT;
        $VALUES = blockRedstoneComparator$ModeArray;
    }

    public static BlockRedstoneComparator$Mode valueOf(String a2) {
        return Enum.valueOf(BlockRedstoneComparator$Mode.class, a2);
    }

    public String getName() {
        BlockRedstoneComparator$Mode a2;
        return a2.name;
    }

    public static BlockRedstoneComparator$Mode[] values() {
        return (BlockRedstoneComparator$Mode[])$VALUES.clone();
    }
}

