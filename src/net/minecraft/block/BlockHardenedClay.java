/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockHardenedClay
extends Block {
    public BlockHardenedClay() {
        BlockHardenedClay a2;
        BlockHardenedClay blockHardenedClay = a2;
        super(Material.rock);
        blockHardenedClay.J(yGa.A);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockHardenedClay a2 = this;
        return MapColor.adobeColor;
    }
}

