/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  Pb
 *  Qta
 *  uQa
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.CaseFormat;
import net.minecraft.block.material.MapColor;

public final class BlockFroglight$EnumVariant
extends Enum<BlockFroglight$EnumVariant>
implements Pb {
    private final String name;
    public static final /* enum */ BlockFroglight$EnumVariant OCHRE;
    private final String unlocalizedName;
    public static final /* enum */ BlockFroglight$EnumVariant VERDANT;
    private final int meta;
    private static final /* synthetic */ BlockFroglight$EnumVariant[] $VALUES;
    private static final BlockFroglight$EnumVariant[] META_LOOKUP;
    public static final /* enum */ BlockFroglight$EnumVariant PEARLESCENT;
    private final MapColor color;

    public int getMeta() {
        BlockFroglight$EnumVariant a2;
        return a2.meta;
    }

    public String toString() {
        BlockFroglight$EnumVariant a2;
        return a2.name;
    }

    public static BlockFroglight$EnumVariant byMeta(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    /*
     * WARNING - void declaration
     */
    private BlockFroglight$EnumVariant(int n3, MapColor mapColor, String string2) {
        void b2;
        Object d2;
        void c2;
        BlockFroglight$EnumVariant a2;
        BlockFroglight$EnumVariant blockFroglight$EnumVariant = object;
        Object object = string2;
        BlockFroglight$EnumVariant blockFroglight$EnumVariant2 = a2 = blockFroglight$EnumVariant;
        a2.meta = c2;
        blockFroglight$EnumVariant2.name = d2;
        blockFroglight$EnumVariant2.unlocalizedName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, (String)d2);
        blockFroglight$EnumVariant2.color = b2;
    }

    public static BlockFroglight$EnumVariant[] values() {
        return (BlockFroglight$EnumVariant[])$VALUES.clone();
    }

    public MapColor getColor() {
        BlockFroglight$EnumVariant a2;
        return a2.color;
    }

    public String getUnlocalizedName() {
        BlockFroglight$EnumVariant a2;
        return a2.unlocalizedName;
    }

    public String getName() {
        BlockFroglight$EnumVariant a2;
        return a2.name;
    }

    public static BlockFroglight$EnumVariant valueOf(String a2) {
        return Enum.valueOf(BlockFroglight$EnumVariant.class, a2);
    }

    static {
        int n2;
        PEARLESCENT = new BlockFroglight$EnumVariant(uSa.E, MapColor.pinkColor, Qta.m);
        VERDANT = new BlockFroglight$EnumVariant(vRa.d, MapColor.glowLichenColor, ISa.ga);
        OCHRE = new BlockFroglight$EnumVariant(uqa.g, MapColor.sandColor, uQa.r);
        BlockFroglight$EnumVariant[] blockFroglight$EnumVariantArray = new BlockFroglight$EnumVariant[yRa.d];
        blockFroglight$EnumVariantArray[uSa.E] = PEARLESCENT;
        blockFroglight$EnumVariantArray[vRa.d] = VERDANT;
        blockFroglight$EnumVariantArray[uqa.g] = OCHRE;
        $VALUES = blockFroglight$EnumVariantArray;
        META_LOOKUP = new BlockFroglight$EnumVariant[BlockFroglight$EnumVariant.values().length];
        BlockFroglight$EnumVariant[] blockFroglight$EnumVariantArray2 = BlockFroglight$EnumVariant.values();
        int n3 = blockFroglight$EnumVariantArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockFroglight$EnumVariant blockFroglight$EnumVariant;
            BlockFroglight$EnumVariant.META_LOOKUP[blockFroglight$EnumVariant.getMeta()] = blockFroglight$EnumVariant = blockFroglight$EnumVariantArray2[n2];
            n4 = ++n2;
        }
    }
}

