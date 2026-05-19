/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockNetherrack
extends Block {
    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockNetherrack a2 = this;
        return MapColor.netherrackColor;
    }

    public BlockNetherrack() {
        BlockNetherrack a2;
        BlockNetherrack blockNetherrack = a2;
        super(Material.rock);
        blockNetherrack.J(yGa.A);
    }
}

