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
import net.minecraft.block.BlockRedSandstone$EnumType;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockRedSandstone
extends Block {
    public static final PropertyEnum<BlockRedSandstone$EnumType> TYPE = PropertyEnum.J(Zpa.x, BlockRedSandstone$EnumType.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockRedSandstone blockRedSandstone = this;
        BlockRedSandstone$EnumType[] b2 = BlockRedSandstone$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockRedSandstone$EnumType blockRedSandstone$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockRedSandstone$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }

    public BlockRedSandstone() {
        BlockRedSandstone a2;
        BlockRedSandstone blockRedSandstone = a2;
        super(Material.rock, BlockSand$EnumType.RED_SAND.getMapColor());
        blockRedSandstone.J(blockRedSandstone.blockState.J().J(TYPE, BlockRedSandstone$EnumType.DEFAULT));
        blockRedSandstone.J(yGa.A);
    }

    @Override
    public BlockState J() {
        BlockRedSandstone a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = TYPE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedSandstone a2 = this;
        return b2.J(TYPE).getMetadata();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedSandstone a2 = this;
        return b2.J(TYPE).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockRedSandstone a2 = this;
        return a2.J().J(TYPE, BlockRedSandstone$EnumType.byMetadata(b2));
    }
}

