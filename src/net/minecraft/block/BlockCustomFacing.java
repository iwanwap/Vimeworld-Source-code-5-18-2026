/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockCustomFacing
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);

    @Override
    public BlockState J() {
        BlockCustomFacing a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    public BlockCustomFacing(Material material, MapColor mapColor) {
        void b2;
        BlockCustomFacing a2;
        MapColor c2 = mapColor;
        BlockCustomFacing blockCustomFacing = a2 = this;
        super((Material)b2, c2);
        blockCustomFacing.J(soundTypeWood);
        a2.J(yGa.a);
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockCustomFacing i2;
        BlockCustomFacing blockCustomFacing = blockCustomFacing2;
        BlockCustomFacing blockCustomFacing2 = gl2;
        BlockCustomFacing a2 = blockCustomFacing;
        return a2.J().J(FACING, i2.J().getOpposite());
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockCustomFacing a2 = this;
        DZ b22 = DZ.getFront(b22);
        if (b22.getAxis() == RX.Y) {
            b22 = DZ.NORTH;
        }
        return a2.J().J(FACING, b22);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCustomFacing a2 = this;
        return b2.J(FACING).getIndex();
    }
}

