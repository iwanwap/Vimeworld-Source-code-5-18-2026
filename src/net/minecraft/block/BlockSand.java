/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockSand
extends BlockFalling {
    public static final PropertyEnum<BlockSand$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockSand$EnumType.class);

    @Override
    public BlockState J() {
        BlockSand a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockSand a2 = this;
        return a2.J().J(VARIANT, BlockSand$EnumType.byMetadata(b2));
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSand a2 = this;
        return b2.J(VARIANT).getMapColor();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSand a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    public BlockSand() {
        BlockSand a2;
        BlockSand blockSand = a2;
        blockSand.J(blockSand.blockState.J().J(VARIANT, BlockSand$EnumType.SAND));
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSand a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockSand blockSand = this;
        BlockSand$EnumType[] b2 = BlockSand$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockSand$EnumType blockSand$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockSand$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }
}

