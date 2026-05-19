/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Tz
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench$InterfaceCraftingTable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockWorkbench
extends Block {
    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        void e2;
        BlockWorkbench i2 = gg2;
        BlockWorkbench h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        void v0 = e2;
        v0.J(new BlockWorkbench$InterfaceCraftingTable((Gg)i2, (XF)g2));
        v0.J(Tz.s);
        return vRa.d != 0;
    }

    public BlockWorkbench() {
        BlockWorkbench a2;
        BlockWorkbench blockWorkbench = a2;
        super(Material.wood);
        blockWorkbench.J(yGa.a);
    }
}

