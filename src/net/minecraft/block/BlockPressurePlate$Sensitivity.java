/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

public final class BlockPressurePlate$Sensitivity
extends Enum<BlockPressurePlate$Sensitivity> {
    public static final /* enum */ BlockPressurePlate$Sensitivity EVERYTHING = new BlockPressurePlate$Sensitivity();
    public static final /* enum */ BlockPressurePlate$Sensitivity MOBS = new BlockPressurePlate$Sensitivity();
    private static final /* synthetic */ BlockPressurePlate$Sensitivity[] $VALUES;

    public static BlockPressurePlate$Sensitivity valueOf(String a2) {
        return Enum.valueOf(BlockPressurePlate$Sensitivity.class, a2);
    }

    public static BlockPressurePlate$Sensitivity[] values() {
        return (BlockPressurePlate$Sensitivity[])$VALUES.clone();
    }

    private BlockPressurePlate$Sensitivity() {
        int a2 = n2;
        BlockPressurePlate$Sensitivity blockPressurePlate$Sensitivity = this;
    }

    static {
        BlockPressurePlate$Sensitivity[] blockPressurePlate$SensitivityArray = new BlockPressurePlate$Sensitivity[uqa.g];
        blockPressurePlate$SensitivityArray[uSa.E] = EVERYTHING;
        blockPressurePlate$SensitivityArray[vRa.d] = MOBS;
        $VALUES = blockPressurePlate$SensitivityArray;
    }
}

