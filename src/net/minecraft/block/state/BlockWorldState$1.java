/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block.state;

import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockWorldState;

public final class BlockWorldState$1
implements Predicate<BlockWorldState> {
    public final /* synthetic */ Predicate val$p_177510_0_;

    public boolean J(BlockWorldState blockWorldState) {
        BlockWorldState b2 = blockWorldState;
        BlockWorldState$1 a2 = this;
        if (b2 != null && a2.val$p_177510_0_.apply(b2.J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockWorldState$1(Predicate predicate) {
        Predicate<BlockWorldState> a2 = predicate;
        predicate = this;
        ((BlockWorldState$1)predicate).val$p_177510_0_ = a2;
    }
}

