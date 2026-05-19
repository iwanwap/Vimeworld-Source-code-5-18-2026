/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  ez
 *  kPa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockCross
extends Block {
    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockCross a2 = this;
        return null;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    public BlockCross(Material material) {
        Material b2 = material;
        BlockCross a2 = this;
        Object object = b2;
        a2((Material)object, ((Material)object).J());
    }

    /*
     * WARNING - void declaration
     */
    public BlockCross(Material material, MapColor mapColor) {
        void a2;
        BlockCross b2;
        Material c22 = material;
        BlockCross blockCross = b2 = this;
        super(c22, (MapColor)a2);
        float c22 = kPa.W;
        blockCross.J(MQa.L - c22, JPa.N, MQa.L - c22, MQa.L + c22, MQa.L + c22, MQa.L + c22);
        blockCross.J(yGa.a);
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }
}

