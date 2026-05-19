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

public final class BlockBuddingAmethyst
extends Block {
    public BlockBuddingAmethyst() {
        super(Material.amethyst, Material.amethyst.J());
        BlockBuddingAmethyst a2;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockBuddingAmethyst a2 = this;
        return uSa.E;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockBuddingAmethyst a2 = this;
        return null;
    }
}

