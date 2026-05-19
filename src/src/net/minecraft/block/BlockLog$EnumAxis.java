/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  TPa
 *  uOa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockLog$1;

public final class BlockLog$EnumAxis
extends Enum<BlockLog$EnumAxis>
implements Pb {
    private final String name;
    public static final /* enum */ BlockLog$EnumAxis Z;
    public static final /* enum */ BlockLog$EnumAxis NONE;
    public static final /* enum */ BlockLog$EnumAxis Y;
    public static final /* enum */ BlockLog$EnumAxis X;
    private static final /* synthetic */ BlockLog$EnumAxis[] $VALUES;

    static {
        X = new BlockLog$EnumAxis(rRa.X);
        Y = new BlockLog$EnumAxis(uOa.Ja);
        Z = new BlockLog$EnumAxis(oua.v);
        NONE = new BlockLog$EnumAxis(TPa.n);
        BlockLog$EnumAxis[] blockLog$EnumAxisArray = new BlockLog$EnumAxis[AQa.P];
        blockLog$EnumAxisArray[uSa.E] = X;
        blockLog$EnumAxisArray[vRa.d] = Y;
        blockLog$EnumAxisArray[uqa.g] = Z;
        blockLog$EnumAxisArray[yRa.d] = NONE;
        $VALUES = blockLog$EnumAxisArray;
    }

    private BlockLog$EnumAxis(String string2) {
        Object b2 = string2;
        BlockLog$EnumAxis a2 = this;
        a2.name = b2;
    }

    public String toString() {
        BlockLog$EnumAxis a2;
        return a2.name;
    }

    public static BlockLog$EnumAxis[] values() {
        return (BlockLog$EnumAxis[])$VALUES.clone();
    }

    public static BlockLog$EnumAxis valueOf(String a2) {
        return Enum.valueOf(BlockLog$EnumAxis.class, a2);
    }

    public String getName() {
        BlockLog$EnumAxis a2;
        return a2.name;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static BlockLog$EnumAxis fromFacingAxis(RX a2) {
        switch (BlockLog$1.$SwitchMap$net$minecraft$util$EnumFacing$Axis[a2.ordinal()]) {
            case 1: {
                return X;
            }
            case 2: {
                return Y;
            }
            case 3: {
                return Z;
            }
        }
        return NONE;
    }
}

