/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockSculk
extends Block {
    public BlockSculk() {
        super(Material.sculk, Material.sculk.J());
        BlockSculk a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        void a2;
        void b2;
        void c2;
        void e2;
        BlockSculk d2;
        Object f3 = xF2;
        BlockSculk blockSculk = d2 = this;
        super.J((Gg)e2, (XF)((Object)f3), (IBlockState)c2, (float)b2, (int)a2);
        blockSculk.J((Gg)e2, (XF)((Object)f3), vRa.d);
    }
}

