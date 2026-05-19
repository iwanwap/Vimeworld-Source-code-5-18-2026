/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 *  Ypa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockCompressedPowered
extends Block {
    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    @Override
    public int J(I i2, XF xF, IBlockState iBlockState, DZ dZ) {
        BlockCompressedPowered blockCompressedPowered = object;
        Object object = dZ;
        BlockCompressedPowered a2 = blockCompressedPowered;
        return Ypa.A;
    }

    /*
     * WARNING - void declaration
     */
    public BlockCompressedPowered(Material material, MapColor mapColor) {
        void b2;
        MapColor c2 = mapColor;
        BlockCompressedPowered a2 = this;
        super((Material)b2, c2);
    }
}

