/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Mda
 *  QFa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockDirt
extends Block {
    public static final PropertyEnum<BlockDirt$DirtType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockDirt$DirtType.class);
    public static final PropertyBool SNOWY = PropertyBool.J(sra.c);

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        IBlockState c2;
        Block d2 = i2;
        BlockDirt b2 = this;
        if (c2.J(VARIANT) == BlockDirt$DirtType.PODZOL) {
            void a2;
            c2 = c2.J(SNOWY, ((d2 = d2.J(a2.up()).J()) == QFa.mb || d2 == QFa.gC ? vRa.d : uSa.E) != 0);
        }
        return c2;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockDirt a2 = this;
        return b2.J(VARIANT).func_181066_d();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockDirt a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public int C(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockDirt a2 = this;
        if ((b2 = b2.J(VARIANT)) == BlockDirt$DirtType.PODZOL) {
            b2 = BlockDirt$DirtType.DIRT;
        }
        return ((BlockDirt$DirtType)((Object)b2)).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockDirt a2 = this;
        return a2.J().J(VARIANT, BlockDirt$DirtType.byMetadata(b2));
    }

    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        List<Mda> d2 = list;
        BlockDirt a2 = this;
        d2.add(new Mda((Block)a2, vRa.d, BlockDirt$DirtType.DIRT.getMetadata()));
        d2.add(new Mda((Block)a2, vRa.d, BlockDirt$DirtType.COARSE_DIRT.getMetadata()));
        d2.add(new Mda((Block)a2, vRa.d, BlockDirt$DirtType.PODZOL.getMetadata()));
    }

    @Override
    public BlockState J() {
        BlockDirt a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = VARIANT;
        iPropertyArray[vRa.d] = SNOWY;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF) {
        void a2;
        Object c2 = gg2;
        BlockDirt b2 = this;
        if ((c2 = c2.J((XF)a2)).J() != b2) {
            return uSa.E;
        }
        return c2.J(VARIANT).getMetadata();
    }

    public BlockDirt() {
        BlockDirt a2;
        BlockDirt blockDirt = a2;
        super(Material.ground);
        blockDirt.J(blockDirt.blockState.J().J(VARIANT, BlockDirt$DirtType.DIRT).J(SNOWY, uSa.E != 0));
        blockDirt.J(yGa.A);
    }
}

