/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eAa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockClay
extends Block {
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockClay a2 = this;
        return Gea.c;
    }

    public BlockClay() {
        BlockClay a2;
        BlockClay blockClay = a2;
        super(Material.clay);
        blockClay.J(yGa.A);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockClay a2 = this;
        return AQa.P;
    }
}

