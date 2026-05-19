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

public final class BlockBookshelf
extends Block {
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockBookshelf a2 = this;
        return Gea.Qa;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockBookshelf a2 = this;
        return yRa.d;
    }

    public BlockBookshelf() {
        BlockBookshelf a2;
        BlockBookshelf blockBookshelf = a2;
        super(Material.wood);
        blockBookshelf.J(yGa.A);
    }
}

