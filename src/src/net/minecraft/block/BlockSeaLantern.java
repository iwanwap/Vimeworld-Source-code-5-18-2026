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

public final class BlockSeaLantern
extends Block {
    public BlockSeaLantern(Material material) {
        BlockSeaLantern a2;
        Material b2 = material;
        BlockSeaLantern blockSeaLantern = a2 = this;
        super(b2);
        blockSeaLantern.J(yGa.A);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockSeaLantern a2 = this;
        return uqa.g + b2.nextInt(uqa.g);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockSeaLantern a2 = this;
        return Gea.QA;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSeaLantern a2 = this;
        return MapColor.quartzColor;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(int n2, Random random) {
        void b2;
        Random c2 = random;
        BlockSeaLantern a2 = this;
        return Oz.f((int)(a2.J(c2) + c2.nextInt((int)(b2 + vRa.d))), (int)vRa.d, (int)tTa.h);
    }

    @Override
    public boolean G() {
        return vRa.d != 0;
    }
}

