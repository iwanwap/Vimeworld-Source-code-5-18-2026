/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockPlanks$EnumType;

public final class BlockPlanks$1
implements Predicate<BlockPlanks$EnumType> {
    public boolean J(BlockPlanks$EnumType blockPlanks$EnumType) {
        BlockPlanks$EnumType b2 = blockPlanks$EnumType;
        BlockPlanks$1 a2 = this;
        if (b2.getMetadata() < lqa.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockPlanks$1() {
        BlockPlanks$1 a2;
    }
}

