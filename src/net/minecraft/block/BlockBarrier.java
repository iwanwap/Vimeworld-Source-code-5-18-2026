/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  hy
 *  pqa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockBarrier
extends Block {
    @Override
    public float J() {
        return pqa.r;
    }

    @Override
    public hy J() {
        return hy.INVISIBLE;
    }

    public BlockBarrier() {
        BlockBarrier a2;
        BlockBarrier blockBarrier = a2;
        super(Material.barrier);
        blockBarrier.J();
        a2.l(lTa.Ga);
        a2.f();
        a2.translucent = vRa.d;
    }

    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, float f2, int n2) {
        int n3 = n2;
        BlockBarrier a2 = this;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

