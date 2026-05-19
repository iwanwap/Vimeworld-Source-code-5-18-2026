/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  vRa
 */
package net.minecraft.block;

public final class BlockPurpurSlab$Variant
extends Enum<BlockPurpurSlab$Variant>
implements Pb {
    public static final /* enum */ BlockPurpurSlab$Variant DEFAULT = new BlockPurpurSlab$Variant();
    private static final /* synthetic */ BlockPurpurSlab$Variant[] $VALUES;

    static {
        BlockPurpurSlab$Variant[] blockPurpurSlab$VariantArray = new BlockPurpurSlab$Variant[vRa.d];
        blockPurpurSlab$VariantArray[uSa.E] = DEFAULT;
        $VALUES = blockPurpurSlab$VariantArray;
    }

    private BlockPurpurSlab$Variant() {
        int a2 = n2;
        BlockPurpurSlab$Variant blockPurpurSlab$Variant = this;
    }

    public String getName() {
        return BQa.la;
    }

    public static BlockPurpurSlab$Variant valueOf(String a2) {
        return Enum.valueOf(BlockPurpurSlab$Variant.class, a2);
    }

    public static BlockPurpurSlab$Variant[] values() {
        return (BlockPurpurSlab$Variant[])$VALUES.clone();
    }
}

