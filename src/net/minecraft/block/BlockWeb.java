/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  eAa
 *  ez
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockWeb
extends Block {
    public BlockWeb() {
        BlockWeb a2;
        BlockWeb blockWeb = a2;
        super(Material.web);
        blockWeb.J(yGa.a);
    }

    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockWeb a2 = this;
        return null;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockWeb a2 = this;
        return Gea.gd;
    }

    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, vL vL2) {
        BlockWeb e2;
        BlockWeb blockWeb = blockWeb2;
        BlockWeb blockWeb2 = vL2;
        BlockWeb a2 = blockWeb;
        e2.a();
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public boolean G() {
        return vRa.d != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

