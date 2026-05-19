/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  NTa
 *  Pb
 *  Ssa
 *  XTa
 *  Ypa
 *  Yra
 *  Zpa
 *  hTa
 *  lqa
 *  pPa
 *  qta
 *  vRa
 */
package net.minecraft.block;

public final class BlockHugeMushroom$EnumType
extends Enum<BlockHugeMushroom$EnumType>
implements Pb {
    public static final /* enum */ BlockHugeMushroom$EnumType ALL_OUTSIDE;
    private final int meta;
    public static final /* enum */ BlockHugeMushroom$EnumType SOUTH_EAST;
    public static final /* enum */ BlockHugeMushroom$EnumType SOUTH;
    private static final /* synthetic */ BlockHugeMushroom$EnumType[] $VALUES;
    public static final /* enum */ BlockHugeMushroom$EnumType SOUTH_WEST;
    public static final /* enum */ BlockHugeMushroom$EnumType NORTH_EAST;
    private static final BlockHugeMushroom$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockHugeMushroom$EnumType CENTER;
    public static final /* enum */ BlockHugeMushroom$EnumType STEM;
    public static final /* enum */ BlockHugeMushroom$EnumType WEST;
    public static final /* enum */ BlockHugeMushroom$EnumType EAST;
    public static final /* enum */ BlockHugeMushroom$EnumType ALL_INSIDE;
    public static final /* enum */ BlockHugeMushroom$EnumType ALL_STEM;
    public static final /* enum */ BlockHugeMushroom$EnumType NORTH;
    private final String name;
    public static final /* enum */ BlockHugeMushroom$EnumType NORTH_WEST;

    public static BlockHugeMushroom$EnumType byMetadata(int n2) {
        BlockHugeMushroom$EnumType a2;
        int n3 = n2;
        if (n3 < 0 || n3 >= META_LOOKUP.length) {
            n3 = uSa.E;
        }
        if ((a2 = META_LOOKUP[n3]) == null) {
            return META_LOOKUP[uSa.E];
        }
        return a2;
    }

    public static BlockHugeMushroom$EnumType[] values() {
        return (BlockHugeMushroom$EnumType[])$VALUES.clone();
    }

    static {
        int n2;
        NORTH_WEST = new BlockHugeMushroom$EnumType(vRa.d, Ssa.j);
        NORTH = new BlockHugeMushroom$EnumType(uqa.g, hTa.d);
        NORTH_EAST = new BlockHugeMushroom$EnumType(yRa.d, qta.I);
        WEST = new BlockHugeMushroom$EnumType(AQa.P, NTa.U);
        CENTER = new BlockHugeMushroom$EnumType(tTa.h, ITa.F);
        EAST = new BlockHugeMushroom$EnumType(uua.p, Zpa.D);
        SOUTH_WEST = new BlockHugeMushroom$EnumType(XTa.W, vTa.g);
        SOUTH = new BlockHugeMushroom$EnumType(Yqa.i, vsa.k);
        SOUTH_EAST = new BlockHugeMushroom$EnumType(WOa.fa, Yra.ca);
        STEM = new BlockHugeMushroom$EnumType(NTa.C, zOa.N);
        ALL_INSIDE = new BlockHugeMushroom$EnumType(uSa.E, rSa.n);
        ALL_OUTSIDE = new BlockHugeMushroom$EnumType(hpa.Z, NTa.y);
        ALL_STEM = new BlockHugeMushroom$EnumType(Ypa.A, ZSa.Ja);
        BlockHugeMushroom$EnumType[] blockHugeMushroom$EnumTypeArray = new BlockHugeMushroom$EnumType[uua.s];
        blockHugeMushroom$EnumTypeArray[uSa.E] = NORTH_WEST;
        blockHugeMushroom$EnumTypeArray[vRa.d] = NORTH;
        blockHugeMushroom$EnumTypeArray[uqa.g] = NORTH_EAST;
        blockHugeMushroom$EnumTypeArray[yRa.d] = WEST;
        blockHugeMushroom$EnumTypeArray[AQa.P] = CENTER;
        blockHugeMushroom$EnumTypeArray[tTa.h] = EAST;
        blockHugeMushroom$EnumTypeArray[uua.p] = SOUTH_WEST;
        blockHugeMushroom$EnumTypeArray[XTa.W] = SOUTH;
        blockHugeMushroom$EnumTypeArray[Yqa.i] = SOUTH_EAST;
        blockHugeMushroom$EnumTypeArray[WOa.fa] = STEM;
        blockHugeMushroom$EnumTypeArray[NTa.C] = ALL_INSIDE;
        blockHugeMushroom$EnumTypeArray[pPa.f] = ALL_OUTSIDE;
        blockHugeMushroom$EnumTypeArray[lqa.s] = ALL_STEM;
        $VALUES = blockHugeMushroom$EnumTypeArray;
        META_LOOKUP = new BlockHugeMushroom$EnumType[ERa.C];
        BlockHugeMushroom$EnumType[] blockHugeMushroom$EnumTypeArray2 = BlockHugeMushroom$EnumType.values();
        int n3 = blockHugeMushroom$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockHugeMushroom$EnumType blockHugeMushroom$EnumType;
            BlockHugeMushroom$EnumType.META_LOOKUP[blockHugeMushroom$EnumType.getMetadata()] = blockHugeMushroom$EnumType = blockHugeMushroom$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public String getName() {
        BlockHugeMushroom$EnumType a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private BlockHugeMushroom$EnumType(int n3, String string2) {
        Object c2;
        void b2;
        BlockHugeMushroom$EnumType a2;
        BlockHugeMushroom$EnumType blockHugeMushroom$EnumType = object;
        Object object = string2;
        BlockHugeMushroom$EnumType blockHugeMushroom$EnumType2 = a2 = blockHugeMushroom$EnumType;
        blockHugeMushroom$EnumType2.meta = b2;
        blockHugeMushroom$EnumType2.name = c2;
    }

    public String toString() {
        BlockHugeMushroom$EnumType a2;
        return a2.name;
    }

    public static BlockHugeMushroom$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockHugeMushroom$EnumType.class, a2);
    }

    public int getMetadata() {
        BlockHugeMushroom$EnumType a2;
        return a2.meta;
    }
}

