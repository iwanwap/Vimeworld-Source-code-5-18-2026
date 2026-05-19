/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  gZ
 *  pqa
 *  psa
 *  vL
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockMagma
extends Block {
    public BlockMagma() {
        BlockMagma a2;
        BlockMagma blockMagma = a2;
        super(Material.rock);
        blockMagma.J(yGa.A);
        a2.f(psa.N);
        a2.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, vL vL2) {
        void b2;
        void c2;
        BlockMagma d2 = vL2;
        BlockMagma a2 = this;
        if (!d2.k() && d2 instanceof Gl && !d2.q()) {
            d2.J(gZ.j, pqa.r);
        }
        super.J((Gg)c2, (XF)b2, (vL)d2);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockMagma a2 = this;
        return MapColor.netherrackColor;
    }
}

