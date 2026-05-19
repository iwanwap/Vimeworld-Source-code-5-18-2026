/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  vRa
 */
package net.minecraft.block;

public final class BlockCustomSlab$Variant
extends Enum<BlockCustomSlab$Variant>
implements Pb {
    public static final /* enum */ BlockCustomSlab$Variant DEFAULT = new BlockCustomSlab$Variant();
    private static final /* synthetic */ BlockCustomSlab$Variant[] $VALUES;

    private BlockCustomSlab$Variant() {
        int a2 = n2;
        BlockCustomSlab$Variant blockCustomSlab$Variant = this;
    }

    static {
        BlockCustomSlab$Variant[] blockCustomSlab$VariantArray = new BlockCustomSlab$Variant[vRa.d];
        blockCustomSlab$VariantArray[uSa.E] = DEFAULT;
        $VALUES = blockCustomSlab$VariantArray;
    }

    public String getName() {
        return BQa.la;
    }

    public static BlockCustomSlab$Variant[] values() {
        return (BlockCustomSlab$Variant[])$VALUES.clone();
    }

    public static BlockCustomSlab$Variant valueOf(String a2) {
        return Enum.valueOf(BlockCustomSlab$Variant.class, a2);
    }
}

