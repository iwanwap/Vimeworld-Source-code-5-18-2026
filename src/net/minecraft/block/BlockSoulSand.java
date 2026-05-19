/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Qqa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockSoulSand
extends Block {
    public BlockSoulSand() {
        BlockSoulSand a2;
        BlockSoulSand blockSoulSand = a2;
        super(Material.sand, MapColor.brownColor);
        blockSoulSand.J(yGa.A);
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        Object d2 = xF2;
        BlockSoulSand b2 = this;
        float c2 = Mqa.N;
        return new xy((double)d2.getX(), (double)d2.getY(), (double)d2.getZ(), (double)(d2.getX() + vRa.d), (double)((float)(d2.getY() + vRa.d) - c2), (double)(d2.getZ() + vRa.d));
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        BlockSoulSand e2;
        BlockSoulSand blockSoulSand = blockSoulSand2;
        BlockSoulSand blockSoulSand2 = vL2;
        BlockSoulSand a2 = blockSoulSand;
        BlockSoulSand blockSoulSand3 = e2;
        blockSoulSand3.f(((vL)blockSoulSand3).i * Qqa.b);
        blockSoulSand3.l(((vL)blockSoulSand3).f * Qqa.b);
    }
}

