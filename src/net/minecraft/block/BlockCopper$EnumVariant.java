/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  XTa
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.CaseFormat;
import net.minecraft.block.material.MapColor;

public final class BlockCopper$EnumVariant
extends Enum<BlockCopper$EnumVariant>
implements Pb {
    private static final /* synthetic */ BlockCopper$EnumVariant[] $VALUES;
    public static final /* enum */ BlockCopper$EnumVariant OXIDIZED_CUT_COPPER;
    public static final /* enum */ BlockCopper$EnumVariant CUT_COPPER;
    private final String name;
    public static final /* enum */ BlockCopper$EnumVariant WEATHERED_COPPER;
    private final MapColor color;
    public static final /* enum */ BlockCopper$EnumVariant OXIDIZED_COPPER;
    private final String unlocalizedName;
    public static final /* enum */ BlockCopper$EnumVariant COPPER;
    private final int meta;
    public static final /* enum */ BlockCopper$EnumVariant WEATHERED_CUT_COPPER;
    private static final BlockCopper$EnumVariant[] META_LOOKUP;
    public static final /* enum */ BlockCopper$EnumVariant EXPOSED_CUT_COPPER;
    public static final /* enum */ BlockCopper$EnumVariant EXPOSED_COPPER;

    public static BlockCopper$EnumVariant valueOf(String a2) {
        return Enum.valueOf(BlockCopper$EnumVariant.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    private BlockCopper$EnumVariant(int n3, BlockCopper$EnumVariant blockCopper$EnumVariant) {
        BlockCopper$EnumVariant c2;
        void b2;
        BlockCopper$EnumVariant blockCopper$EnumVariant2 = blockCopper$EnumVariant3;
        BlockCopper$EnumVariant blockCopper$EnumVariant3 = blockCopper$EnumVariant;
        BlockCopper$EnumVariant a2 = blockCopper$EnumVariant2;
        a2((int)b2, c2.color);
    }

    public String getName() {
        BlockCopper$EnumVariant a2;
        return a2.name;
    }

    public static BlockCopper$EnumVariant byMeta(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    /*
     * WARNING - void declaration
     */
    private BlockCopper$EnumVariant(int n3, MapColor mapColor) {
        Object c2;
        void b2;
        BlockCopper$EnumVariant a2;
        BlockCopper$EnumVariant blockCopper$EnumVariant = object;
        Object object = mapColor;
        BlockCopper$EnumVariant blockCopper$EnumVariant2 = a2 = blockCopper$EnumVariant;
        BlockCopper$EnumVariant blockCopper$EnumVariant3 = a2;
        blockCopper$EnumVariant3.meta = b2;
        blockCopper$EnumVariant2.name = blockCopper$EnumVariant3.name().toLowerCase();
        blockCopper$EnumVariant2.unlocalizedName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, a2.name);
        blockCopper$EnumVariant2.color = c2;
    }

    public MapColor getColor() {
        BlockCopper$EnumVariant a2;
        return a2.color;
    }

    static {
        int n2;
        COPPER = new BlockCopper$EnumVariant(uSa.E, MapColor.adobeColor);
        EXPOSED_COPPER = new BlockCopper$EnumVariant(vRa.d, MapColor.terracottaLightGrayColor);
        WEATHERED_COPPER = new BlockCopper$EnumVariant(uqa.g, MapColor.warpedStemColor);
        OXIDIZED_COPPER = new BlockCopper$EnumVariant(yRa.d, MapColor.warpedNyliumColor);
        CUT_COPPER = new BlockCopper$EnumVariant(AQa.P, COPPER);
        EXPOSED_CUT_COPPER = new BlockCopper$EnumVariant(tTa.h, EXPOSED_COPPER);
        WEATHERED_CUT_COPPER = new BlockCopper$EnumVariant(uua.p, WEATHERED_COPPER);
        OXIDIZED_CUT_COPPER = new BlockCopper$EnumVariant(XTa.W, OXIDIZED_COPPER);
        BlockCopper$EnumVariant[] blockCopper$EnumVariantArray = new BlockCopper$EnumVariant[Yqa.i];
        blockCopper$EnumVariantArray[uSa.E] = COPPER;
        blockCopper$EnumVariantArray[vRa.d] = EXPOSED_COPPER;
        blockCopper$EnumVariantArray[uqa.g] = WEATHERED_COPPER;
        blockCopper$EnumVariantArray[yRa.d] = OXIDIZED_COPPER;
        blockCopper$EnumVariantArray[AQa.P] = CUT_COPPER;
        blockCopper$EnumVariantArray[tTa.h] = EXPOSED_CUT_COPPER;
        blockCopper$EnumVariantArray[uua.p] = WEATHERED_CUT_COPPER;
        blockCopper$EnumVariantArray[XTa.W] = OXIDIZED_CUT_COPPER;
        $VALUES = blockCopper$EnumVariantArray;
        META_LOOKUP = new BlockCopper$EnumVariant[BlockCopper$EnumVariant.values().length];
        BlockCopper$EnumVariant[] blockCopper$EnumVariantArray2 = BlockCopper$EnumVariant.values();
        int n3 = blockCopper$EnumVariantArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockCopper$EnumVariant blockCopper$EnumVariant;
            BlockCopper$EnumVariant.META_LOOKUP[blockCopper$EnumVariant.getMeta()] = blockCopper$EnumVariant = blockCopper$EnumVariantArray2[n2];
            n4 = ++n2;
        }
    }

    public String toString() {
        BlockCopper$EnumVariant a2;
        return a2.name;
    }

    public int getMeta() {
        BlockCopper$EnumVariant a2;
        return a2.meta;
    }

    public static BlockCopper$EnumVariant[] values() {
        return (BlockCopper$EnumVariant[])$VALUES.clone();
    }

    public String getUnlocalizedName() {
        BlockCopper$EnumVariant a2;
        return a2.unlocalizedName;
    }
}

