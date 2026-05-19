/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockNewLeaf$2;
import net.minecraft.block.BlockPlanks$EnumType;

public final class BlockNewLeaf$1
implements Predicate<BlockPlanks$EnumType> {
    /*
     * Enabled aggressive block sorting
     */
    public boolean J(BlockPlanks$EnumType blockPlanks$EnumType) {
        BlockPlanks$EnumType b2 = blockPlanks$EnumType;
        BlockNewLeaf$1 a2 = this;
        switch (BlockNewLeaf$2.$SwitchMap$net$minecraft$block$BlockPlanks$EnumType[b2.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public BlockNewLeaf$1() {
        BlockNewLeaf$1 a2;
    }
}

