/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockNetherBrick
extends Block {
    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockNetherBrick a2 = this;
        return MapColor.netherrackColor;
    }

    public BlockNetherBrick() {
        BlockNetherBrick a2;
        BlockNetherBrick blockNetherBrick = a2;
        super(Material.rock);
        blockNetherBrick.J(yGa.A);
    }
}

