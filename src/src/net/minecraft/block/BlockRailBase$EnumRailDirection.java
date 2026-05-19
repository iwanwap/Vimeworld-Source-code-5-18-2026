/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Pb
 *  Qsa
 *  Rua
 *  Ssa
 *  XTa
 *  Yra
 *  mra
 *  qta
 *  vRa
 */
package net.minecraft.block;

public final class BlockRailBase$EnumRailDirection
extends Enum<BlockRailBase$EnumRailDirection>
implements Pb {
    public static final /* enum */ BlockRailBase$EnumRailDirection NORTH_SOUTH;
    public static final /* enum */ BlockRailBase$EnumRailDirection SOUTH_EAST;
    private static final /* synthetic */ BlockRailBase$EnumRailDirection[] $VALUES;
    public static final /* enum */ BlockRailBase$EnumRailDirection ASCENDING_SOUTH;
    public static final /* enum */ BlockRailBase$EnumRailDirection NORTH_EAST;
    public static final /* enum */ BlockRailBase$EnumRailDirection NORTH_WEST;
    public static final /* enum */ BlockRailBase$EnumRailDirection EAST_WEST;
    public static final /* enum */ BlockRailBase$EnumRailDirection SOUTH_WEST;
    private final String name;
    public static final /* enum */ BlockRailBase$EnumRailDirection ASCENDING_WEST;
    public static final /* enum */ BlockRailBase$EnumRailDirection ASCENDING_NORTH;
    private static final BlockRailBase$EnumRailDirection[] META_LOOKUP;
    public static final /* enum */ BlockRailBase$EnumRailDirection ASCENDING_EAST;
    private final int meta;

    public static BlockRailBase$EnumRailDirection valueOf(String a2) {
        return Enum.valueOf(BlockRailBase$EnumRailDirection.class, a2);
    }

    public int getMetadata() {
        BlockRailBase$EnumRailDirection a2;
        return a2.meta;
    }

    /*
     * WARNING - void declaration
     */
    private BlockRailBase$EnumRailDirection(int n3, String string2) {
        Object c2;
        void b2;
        BlockRailBase$EnumRailDirection a2;
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = object;
        Object object = string2;
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection2 = a2 = blockRailBase$EnumRailDirection;
        blockRailBase$EnumRailDirection2.meta = b2;
        blockRailBase$EnumRailDirection2.name = c2;
    }

    public boolean isAscending() {
        BlockRailBase$EnumRailDirection a2;
        if (a2 == ASCENDING_NORTH || a2 == ASCENDING_EAST || a2 == ASCENDING_SOUTH || a2 == ASCENDING_WEST) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        int n2;
        NORTH_SOUTH = new BlockRailBase$EnumRailDirection(uSa.E, rpa.K);
        EAST_WEST = new BlockRailBase$EnumRailDirection(vRa.d, Qsa.Y);
        ASCENDING_EAST = new BlockRailBase$EnumRailDirection(uqa.g, Ora.M);
        ASCENDING_WEST = new BlockRailBase$EnumRailDirection(yRa.d, Rua.h);
        ASCENDING_NORTH = new BlockRailBase$EnumRailDirection(AQa.P, mra.fa);
        ASCENDING_SOUTH = new BlockRailBase$EnumRailDirection(tTa.h, tSa.Q);
        SOUTH_EAST = new BlockRailBase$EnumRailDirection(uua.p, Yra.ca);
        SOUTH_WEST = new BlockRailBase$EnumRailDirection(XTa.W, vTa.g);
        NORTH_WEST = new BlockRailBase$EnumRailDirection(Yqa.i, Ssa.j);
        NORTH_EAST = new BlockRailBase$EnumRailDirection(WOa.fa, qta.I);
        BlockRailBase$EnumRailDirection[] blockRailBase$EnumRailDirectionArray = new BlockRailBase$EnumRailDirection[NTa.C];
        blockRailBase$EnumRailDirectionArray[uSa.E] = NORTH_SOUTH;
        blockRailBase$EnumRailDirectionArray[vRa.d] = EAST_WEST;
        blockRailBase$EnumRailDirectionArray[uqa.g] = ASCENDING_EAST;
        blockRailBase$EnumRailDirectionArray[yRa.d] = ASCENDING_WEST;
        blockRailBase$EnumRailDirectionArray[AQa.P] = ASCENDING_NORTH;
        blockRailBase$EnumRailDirectionArray[tTa.h] = ASCENDING_SOUTH;
        blockRailBase$EnumRailDirectionArray[uua.p] = SOUTH_EAST;
        blockRailBase$EnumRailDirectionArray[XTa.W] = SOUTH_WEST;
        blockRailBase$EnumRailDirectionArray[Yqa.i] = NORTH_WEST;
        blockRailBase$EnumRailDirectionArray[WOa.fa] = NORTH_EAST;
        $VALUES = blockRailBase$EnumRailDirectionArray;
        META_LOOKUP = new BlockRailBase$EnumRailDirection[BlockRailBase$EnumRailDirection.values().length];
        BlockRailBase$EnumRailDirection[] blockRailBase$EnumRailDirectionArray2 = BlockRailBase$EnumRailDirection.values();
        int n3 = blockRailBase$EnumRailDirectionArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection;
            BlockRailBase$EnumRailDirection.META_LOOKUP[blockRailBase$EnumRailDirection.getMetadata()] = blockRailBase$EnumRailDirection = blockRailBase$EnumRailDirectionArray2[n2];
            n4 = ++n2;
        }
    }

    public static BlockRailBase$EnumRailDirection byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public String toString() {
        BlockRailBase$EnumRailDirection a2;
        return a2.name;
    }

    public String getName() {
        BlockRailBase$EnumRailDirection a2;
        return a2.name;
    }

    public static BlockRailBase$EnumRailDirection[] values() {
        return (BlockRailBase$EnumRailDirection[])$VALUES.clone();
    }
}

