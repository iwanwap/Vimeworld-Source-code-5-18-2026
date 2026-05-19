/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block.state.pattern;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class BlockHelper
implements Predicate<IBlockState> {
    private final Block block;

    public static BlockHelper J(Block a2) {
        return new BlockHelper(a2);
    }

    public boolean J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockHelper a2 = this;
        if (b2 != null && b2.J() == a2.block) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private BlockHelper(Block block) {
        Block b2 = block;
        BlockHelper a2 = this;
        a2.block = b2;
    }
}

