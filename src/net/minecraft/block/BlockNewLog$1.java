/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockPlanks$EnumType;

public final class BlockNewLog$1
implements Predicate<BlockPlanks$EnumType> {
    public BlockNewLog$1() {
        BlockNewLog$1 a2;
    }

    public boolean J(BlockPlanks$EnumType blockPlanks$EnumType) {
        BlockPlanks$EnumType b2 = blockPlanks$EnumType;
        BlockNewLog$1 a2 = this;
        if (b2.getMetadata() >= AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

