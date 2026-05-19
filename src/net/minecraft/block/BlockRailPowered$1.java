/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockRailBase$EnumRailDirection;

public final class BlockRailPowered$1
implements Predicate<BlockRailBase$EnumRailDirection> {
    public BlockRailPowered$1() {
        BlockRailPowered$1 a2;
    }

    public boolean J(BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection) {
        Object b2 = blockRailBase$EnumRailDirection;
        BlockRailPowered$1 a2 = this;
        if (b2 != BlockRailBase$EnumRailDirection.NORTH_EAST && b2 != BlockRailBase$EnumRailDirection.NORTH_WEST && b2 != BlockRailBase$EnumRailDirection.SOUTH_EAST && b2 != BlockRailBase$EnumRailDirection.SOUTH_WEST) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

