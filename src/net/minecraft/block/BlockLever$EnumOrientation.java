/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Pb
 *  QSa
 *  XTa
 *  Zpa
 *  hTa
 *  vRa
 *  wPa
 *  ysa
 */
package net.minecraft.block;

import net.minecraft.block.BlockLever$1;

public final class BlockLever$EnumOrientation
extends Enum<BlockLever$EnumOrientation>
implements Pb {
    public static final /* enum */ BlockLever$EnumOrientation NORTH;
    public static final /* enum */ BlockLever$EnumOrientation DOWN_Z;
    public static final /* enum */ BlockLever$EnumOrientation DOWN_X;
    private static final /* synthetic */ BlockLever$EnumOrientation[] $VALUES;
    private static final BlockLever$EnumOrientation[] META_LOOKUP;
    public static final /* enum */ BlockLever$EnumOrientation EAST;
    public static final /* enum */ BlockLever$EnumOrientation UP_X;
    private final int meta;
    public static final /* enum */ BlockLever$EnumOrientation SOUTH;
    public static final /* enum */ BlockLever$EnumOrientation WEST;
    private final String name;
    public static final /* enum */ BlockLever$EnumOrientation UP_Z;
    private final DZ facing;

    public int getMetadata() {
        BlockLever$EnumOrientation a2;
        return a2.meta;
    }

    public static BlockLever$EnumOrientation byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockLever$EnumOrientation valueOf(String a2) {
        return Enum.valueOf(BlockLever$EnumOrientation.class, a2);
    }

    public DZ getFacing() {
        BlockLever$EnumOrientation a2;
        return a2.facing;
    }

    /*
     * WARNING - void declaration
     */
    private BlockLever$EnumOrientation(int n3, String string2, DZ dZ2) {
        Enum d2;
        void b2;
        void c2;
        BlockLever$EnumOrientation a2;
        BlockLever$EnumOrientation blockLever$EnumOrientation = enum_;
        Enum enum_ = dZ2;
        BlockLever$EnumOrientation blockLever$EnumOrientation2 = a2 = blockLever$EnumOrientation;
        a2.meta = c2;
        blockLever$EnumOrientation2.name = b2;
        blockLever$EnumOrientation2.facing = d2;
    }

    static {
        int n2;
        DOWN_X = new BlockLever$EnumOrientation(uSa.E, xTa.ja, DZ.DOWN);
        EAST = new BlockLever$EnumOrientation(vRa.d, Zpa.D, DZ.EAST);
        WEST = new BlockLever$EnumOrientation(uqa.g, NTa.U, DZ.WEST);
        SOUTH = new BlockLever$EnumOrientation(yRa.d, vsa.k, DZ.SOUTH);
        NORTH = new BlockLever$EnumOrientation(AQa.P, hTa.d, DZ.NORTH);
        UP_Z = new BlockLever$EnumOrientation(tTa.h, wPa.B, DZ.UP);
        UP_X = new BlockLever$EnumOrientation(uua.p, hTa.k, DZ.UP);
        DOWN_Z = new BlockLever$EnumOrientation(XTa.W, xTa.W, DZ.DOWN);
        BlockLever$EnumOrientation[] blockLever$EnumOrientationArray = new BlockLever$EnumOrientation[Yqa.i];
        blockLever$EnumOrientationArray[uSa.E] = DOWN_X;
        blockLever$EnumOrientationArray[vRa.d] = EAST;
        blockLever$EnumOrientationArray[uqa.g] = WEST;
        blockLever$EnumOrientationArray[yRa.d] = SOUTH;
        blockLever$EnumOrientationArray[AQa.P] = NORTH;
        blockLever$EnumOrientationArray[tTa.h] = UP_Z;
        blockLever$EnumOrientationArray[uua.p] = UP_X;
        blockLever$EnumOrientationArray[XTa.W] = DOWN_Z;
        $VALUES = blockLever$EnumOrientationArray;
        META_LOOKUP = new BlockLever$EnumOrientation[BlockLever$EnumOrientation.values().length];
        BlockLever$EnumOrientation[] blockLever$EnumOrientationArray2 = BlockLever$EnumOrientation.values();
        int n3 = blockLever$EnumOrientationArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockLever$EnumOrientation blockLever$EnumOrientation;
            BlockLever$EnumOrientation.META_LOOKUP[blockLever$EnumOrientation.getMetadata()] = blockLever$EnumOrientation = blockLever$EnumOrientationArray2[n2];
            n4 = ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static BlockLever$EnumOrientation forFacings(DZ dZ2, DZ dZ3) {
        DZ b2 = dZ3;
        DZ a2 = dZ2;
        switch (BlockLever$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                switch (BlockLever$1.$SwitchMap$net$minecraft$util$EnumFacing$Axis[b2.getAxis().ordinal()]) {
                    case 1: {
                        return DOWN_X;
                    }
                    case 2: {
                        return DOWN_Z;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, ysa.C).append((Object)b2).append(Pua.Ha).append((Object)a2).toString());
            }
            case 2: {
                switch (BlockLever$1.$SwitchMap$net$minecraft$util$EnumFacing$Axis[b2.getAxis().ordinal()]) {
                    case 1: {
                        return UP_X;
                    }
                    case 2: {
                        return UP_Z;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, ysa.C).append((Object)b2).append(Pua.Ha).append((Object)a2).toString());
            }
            case 3: {
                return NORTH;
            }
            case 4: {
                return SOUTH;
            }
            case 5: {
                return WEST;
            }
            case 6: {
                return EAST;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, QSa.y).append((Object)a2).toString());
    }

    public static BlockLever$EnumOrientation[] values() {
        return (BlockLever$EnumOrientation[])$VALUES.clone();
    }

    public String getName() {
        BlockLever$EnumOrientation a2;
        return a2.name;
    }

    public String toString() {
        BlockLever$EnumOrientation a2;
        return a2.name;
    }
}

