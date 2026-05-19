/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockPlanks$EnumType;

public final class BlockSapling$1
implements Predicate<BlockPlanks$EnumType> {
    public boolean J(BlockPlanks$EnumType blockPlanks$EnumType) {
        BlockPlanks$EnumType b2 = blockPlanks$EnumType;
        BlockSapling$1 a2 = this;
        if (b2.getMetadata() <= tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockSapling$1() {
        BlockSapling$1 a2;
    }
}

