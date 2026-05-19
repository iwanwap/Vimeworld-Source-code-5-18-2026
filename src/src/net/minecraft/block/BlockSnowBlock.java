/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mz
 *  eAa
 *  pPa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockSnowBlock
extends Block {
    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockSnowBlock a2 = this;
        return AQa.P;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockSnowBlock a2 = this;
        return Gea.Pd;
    }

    public BlockSnowBlock() {
        BlockSnowBlock a2;
        BlockSnowBlock blockSnowBlock = a2;
        super(Material.craftedSnow);
        blockSnowBlock.J(vRa.d != 0);
        a2.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        void d2;
        Object e2 = xF;
        BlockSnowBlock c2 = this;
        if (d2.J(Mz.BLOCK, (XF)((Object)e2)) > pPa.f) {
            void v0 = d2;
            Object object = e2;
            c2.J((Gg)v0, (XF)((Object)object), d2.J((XF)((Object)object)), uSa.E);
            v0.G((XF)((Object)e2));
        }
    }
}

