/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  hy
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockAir
extends Block {
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        int n3 = n2;
        BlockAir a2 = this;
    }

    @Override
    public boolean J(IBlockState iBlockState, boolean bl2) {
        boolean c2 = bl2;
        BlockAir a2 = this;
        return uSa.E != 0;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockAir a2 = this;
        return null;
    }

    public BlockAir() {
        super(Material.air);
        BlockAir a2;
    }

    @Override
    public boolean f(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockAir a2 = this;
        return vRa.d != 0;
    }

    @Override
    public hy J() {
        return hy.INVISIBLE;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

