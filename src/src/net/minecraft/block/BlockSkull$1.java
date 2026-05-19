/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QFa
 *  fy
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockWorldState;

public final class BlockSkull$1
implements Predicate<BlockWorldState> {
    public BlockSkull$1() {
        BlockSkull$1 a2;
    }

    public boolean J(BlockWorldState blockWorldState) {
        BlockWorldState b2 = blockWorldState;
        BlockSkull$1 a2 = this;
        if (b2.J() != null && b2.J().J() == QFa.kC && b2.J() instanceof fy && ((fy)b2.J()).f() == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

