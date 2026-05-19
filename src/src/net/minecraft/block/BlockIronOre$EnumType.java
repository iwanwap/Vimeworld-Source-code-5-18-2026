/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Pb
 *  Ssa
 *  XTa
 *  pqa
 *  vQa
 *  vRa
 *  wOa
 */
package net.minecraft.block;

public final class BlockIronOre$EnumType
extends Enum<BlockIronOre$EnumType>
implements Pb {
    public static final /* enum */ BlockIronOre$EnumType COPPER;
    public static final /* enum */ BlockIronOre$EnumType PLATINUM;
    private static final BlockIronOre$EnumType[] META_LOOKUP;
    private static final /* synthetic */ BlockIronOre$EnumType[] $VALUES;
    public static final /* enum */ BlockIronOre$EnumType BLACK_IRON;
    public static final /* enum */ BlockIronOre$EnumType IRON;
    public static final /* enum */ BlockIronOre$EnumType SILVER;
    private final String name;
    public static final /* enum */ BlockIronOre$EnumType TITANIUM;
    public static final /* enum */ BlockIronOre$EnumType STONE_QUARTZ;
    public static final /* enum */ BlockIronOre$EnumType AMETHYST;
    private final int meta;

    public String toString() {
        BlockIronOre$EnumType a2;
        return a2.name;
    }

    public static BlockIronOre$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockIronOre$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockIronOre$EnumType.class, a2);
    }

    public int getMeta() {
        BlockIronOre$EnumType a2;
        return a2.meta;
    }

    static {
        int n2;
        IRON = new BlockIronOre$EnumType(uSa.E, MTa.p);
        AMETHYST = new BlockIronOre$EnumType(vRa.d, pqa.T);
        COPPER = new BlockIronOre$EnumType(uqa.g, Fpa.g);
        PLATINUM = new BlockIronOre$EnumType(yRa.d, vQa.X);
        SILVER = new BlockIronOre$EnumType(AQa.P, Ssa.Q);
        STONE_QUARTZ = new BlockIronOre$EnumType(tTa.h, Hra.E);
        TITANIUM = new BlockIronOre$EnumType(uua.p, nqa.u);
        BLACK_IRON = new BlockIronOre$EnumType(XTa.W, wOa.K);
        BlockIronOre$EnumType[] blockIronOre$EnumTypeArray = new BlockIronOre$EnumType[Yqa.i];
        blockIronOre$EnumTypeArray[uSa.E] = IRON;
        blockIronOre$EnumTypeArray[vRa.d] = AMETHYST;
        blockIronOre$EnumTypeArray[uqa.g] = COPPER;
        blockIronOre$EnumTypeArray[yRa.d] = PLATINUM;
        blockIronOre$EnumTypeArray[AQa.P] = SILVER;
        blockIronOre$EnumTypeArray[tTa.h] = STONE_QUARTZ;
        blockIronOre$EnumTypeArray[uua.p] = TITANIUM;
        blockIronOre$EnumTypeArray[XTa.W] = BLACK_IRON;
        $VALUES = blockIronOre$EnumTypeArray;
        META_LOOKUP = new BlockIronOre$EnumType[BlockIronOre$EnumType.values().length];
        BlockIronOre$EnumType[] blockIronOre$EnumTypeArray2 = BlockIronOre$EnumType.values();
        int n3 = blockIronOre$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockIronOre$EnumType blockIronOre$EnumType;
            BlockIronOre$EnumType.META_LOOKUP[blockIronOre$EnumType.getMeta()] = blockIronOre$EnumType = blockIronOre$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private BlockIronOre$EnumType(int n3, String string2) {
        Object c2;
        void b2;
        BlockIronOre$EnumType a2;
        BlockIronOre$EnumType blockIronOre$EnumType = object;
        Object object = string2;
        BlockIronOre$EnumType blockIronOre$EnumType2 = a2 = blockIronOre$EnumType;
        blockIronOre$EnumType2.meta = b2;
        blockIronOre$EnumType2.name = c2;
    }

    public static BlockIronOre$EnumType[] values() {
        return (BlockIronOre$EnumType[])$VALUES.clone();
    }

    public String getName() {
        BlockIronOre$EnumType a2;
        return a2.name;
    }
}

