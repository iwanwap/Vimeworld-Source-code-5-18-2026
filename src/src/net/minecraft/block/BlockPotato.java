/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  XTa
 *  eAa
 *  vpa
 */
package net.minecraft.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;

public final class BlockPotato
extends BlockCrops {
    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockPotato f3 = gg2;
        BlockPotato e2 = this;
        BlockPotato blockPotato = f3;
        super.J((Gg)blockPotato, (XF)d2, (IBlockState)c2, (float)b2, (int)a2);
        if (!((Gg)blockPotato).e && c2.J(AGE) >= XTa.W && ((Gg)f3).v.nextInt(vpa.o) == 0) {
            BlockPotato.J((Gg)f3, (XF)d2, new Mda(Gea.Qd));
        }
    }

    @Override
    public eAa f() {
        return Gea.cA;
    }

    public BlockPotato() {
        BlockPotato a2;
    }

    @Override
    public eAa J() {
        return Gea.cA;
    }
}

