/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NQa
 *  Pb
 *  vRa
 */
package net.minecraft.block;

public final class BlockPistonExtension$EnumPistonType
extends Enum<BlockPistonExtension$EnumPistonType>
implements Pb {
    private final String VARIANT;
    public static final /* enum */ BlockPistonExtension$EnumPistonType STICKY;
    private static final /* synthetic */ BlockPistonExtension$EnumPistonType[] $VALUES;
    public static final /* enum */ BlockPistonExtension$EnumPistonType DEFAULT;

    public static BlockPistonExtension$EnumPistonType[] values() {
        return (BlockPistonExtension$EnumPistonType[])$VALUES.clone();
    }

    public String toString() {
        BlockPistonExtension$EnumPistonType a2;
        return a2.VARIANT;
    }

    private BlockPistonExtension$EnumPistonType(String string2) {
        Object b2 = string2;
        BlockPistonExtension$EnumPistonType a2 = this;
        a2.VARIANT = b2;
    }

    public static BlockPistonExtension$EnumPistonType valueOf(String a2) {
        return Enum.valueOf(BlockPistonExtension$EnumPistonType.class, a2);
    }

    public String getName() {
        BlockPistonExtension$EnumPistonType a2;
        return a2.VARIANT;
    }

    static {
        DEFAULT = new BlockPistonExtension$EnumPistonType(AQa.t);
        STICKY = new BlockPistonExtension$EnumPistonType(NQa.q);
        BlockPistonExtension$EnumPistonType[] blockPistonExtension$EnumPistonTypeArray = new BlockPistonExtension$EnumPistonType[uqa.g];
        blockPistonExtension$EnumPistonTypeArray[uSa.E] = DEFAULT;
        blockPistonExtension$EnumPistonTypeArray[vRa.d] = STICKY;
        $VALUES = blockPistonExtension$EnumPistonTypeArray;
    }
}

