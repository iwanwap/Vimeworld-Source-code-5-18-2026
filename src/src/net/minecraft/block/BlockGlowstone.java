/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockGlowstone
extends Block {
    /*
     * WARNING - void declaration
     */
    @Override
    public int J(int n2, Random random) {
        void b2;
        Random c2 = random;
        BlockGlowstone a2 = this;
        return Oz.f((int)(a2.J(c2) + c2.nextInt((int)(b2 + vRa.d))), (int)vRa.d, (int)AQa.P);
    }

    public BlockGlowstone(Material material) {
        BlockGlowstone a2;
        Material b2 = material;
        BlockGlowstone blockGlowstone = a2 = this;
        super(b2);
        blockGlowstone.J(yGa.A);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockGlowstone a2 = this;
        return MapColor.sandColor;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockGlowstone a2 = this;
        return uqa.g + b2.nextInt(yRa.d);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockGlowstone a2 = this;
        return Gea.Sa;
    }
}

