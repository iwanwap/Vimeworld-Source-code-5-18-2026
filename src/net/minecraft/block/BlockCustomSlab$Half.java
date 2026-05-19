/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomSlab;
import net.minecraft.block.state.IBlockState;

public final class BlockCustomSlab$Half
extends BlockCustomSlab {
    public BlockCustomSlab$Half(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCustomSlab$Half a2 = this;
        super(b2.J(), null);
    }

    public BlockCustomSlab$Half(Block block) {
        Block b2 = block;
        BlockCustomSlab$Half a2 = this;
        super(b2, null);
    }

    @Override
    public boolean b() {
        return uSa.E != 0;
    }
}

