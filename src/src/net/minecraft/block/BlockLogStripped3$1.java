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

public final class BlockLogStripped3$1
implements Predicate<BlockPlanks$EnumType> {
    public BlockLogStripped3$1() {
        BlockLogStripped3$1 a2;
    }

    public boolean J(BlockPlanks$EnumType blockPlanks$EnumType) {
        BlockPlanks$EnumType b2 = blockPlanks$EnumType;
        BlockLogStripped3$1 a2 = this;
        if (b2.getMetadata() >= Yqa.i && b2.getMetadata() < lqa.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

