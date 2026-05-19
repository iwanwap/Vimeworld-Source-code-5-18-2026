/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockMelon
extends Block {
    /*
     * WARNING - void declaration
     */
    @Override
    public int J(int n2, Random random) {
        void b2;
        Random c2 = random;
        BlockMelon a2 = this;
        return Math.min(WOa.fa, a2.J(c2) + c2.nextInt(vRa.d + b2));
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockMelon a2 = this;
        return Gea.fA;
    }

    public BlockMelon() {
        BlockMelon a2;
        BlockMelon blockMelon = a2;
        super(Material.gourd, MapColor.limeColor);
        blockMelon.J(yGa.A);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockMelon a2 = this;
        return yRa.d + b2.nextInt(tTa.h);
    }
}

