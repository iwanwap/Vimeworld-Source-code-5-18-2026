/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Zpa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockSandStone
extends Block {
    public static final PropertyEnum<BlockSandStone$EnumType> TYPE = PropertyEnum.J(Zpa.x, BlockSandStone$EnumType.class);

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSandStone a2 = this;
        return MapColor.sandColor;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockSandStone blockSandStone = this;
        BlockSandStone$EnumType[] b2 = BlockSandStone$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockSandStone$EnumType blockSandStone$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockSandStone$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSandStone a2 = this;
        return b2.J(TYPE).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockSandStone a2 = this;
        return a2.J().J(TYPE, BlockSandStone$EnumType.byMetadata(b2));
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSandStone a2 = this;
        return b2.J(TYPE).getMetadata();
    }

    public BlockSandStone() {
        BlockSandStone a2;
        BlockSandStone blockSandStone = a2;
        super(Material.rock);
        blockSandStone.J(blockSandStone.blockState.J().J(TYPE, BlockSandStone$EnumType.DEFAULT));
        blockSandStone.J(yGa.A);
    }

    @Override
    public BlockState J() {
        BlockSandStone a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = TYPE;
        return new BlockState(a2, iPropertyArray);
    }
}

