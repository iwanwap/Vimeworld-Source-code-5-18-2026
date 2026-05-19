/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QFa
 *  eAa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockObsidian
extends Block {
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockObsidian a2 = this;
        return eAa.J((Block)QFa.X);
    }

    public BlockObsidian() {
        BlockObsidian a2;
        BlockObsidian blockObsidian = a2;
        super(Material.rock);
        blockObsidian.J(yGa.A);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockObsidian a2 = this;
        return MapColor.blackColor;
    }
}

