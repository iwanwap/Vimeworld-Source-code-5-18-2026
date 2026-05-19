/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  pqa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockMud
extends Block {
    public BlockMud() {
        BlockMud a2;
        BlockMud blockMud = a2;
        super(Material.ground, MapColor.terracottaCyanColor);
        blockMud.J(soundTypeGravel);
        a2.J(yGa.A);
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        Object d2 = xF2;
        BlockMud b2 = this;
        return new xy((double)d2.getX(), (double)d2.getY(), (double)d2.getZ(), (double)((float)d2.getX() + pqa.r), (double)((float)d2.getY() + pqa.r - Mqa.N), (double)((float)d2.getZ() + pqa.r));
    }

    public static boolean J(IBlockState a2) {
        if (a2.J() == QFa.Bc && a2.J(BlockDirt.VARIANT) == BlockDirt$DirtType.DIRT) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

