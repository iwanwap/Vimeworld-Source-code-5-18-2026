/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Mda
 *  QFa
 *  VQa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockStone
extends Block {
    public static final PropertyEnum<BlockStone$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockStone$EnumType.class);

    public BlockStone() {
        BlockStone a2;
        BlockStone blockStone = a2;
        super(Material.rock);
        blockStone.J(blockStone.blockState.J().J(VARIANT, BlockStone$EnumType.STONE));
        blockStone.J(yGa.A);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockStone a2 = this;
        return a2.J().J(VARIANT, BlockStone$EnumType.byMetadata(b2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockStone blockStone = this;
        BlockStone$EnumType[] b2 = BlockStone$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockStone$EnumType blockStone$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockStone$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStone a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStone a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStone a2 = this;
        return b2.J(VARIANT).func_181072_c();
    }

    @Override
    public BlockState J() {
        BlockStone a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public String f() {
        BlockStone a2;
        return Ey.f((String)new StringBuilder().insert(3 >> 2, a2.J()).append(VQa.ja).append(BlockStone$EnumType.STONE.getUnlocalizedName()).append(tpa.N).toString());
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        IBlockState d2 = iBlockState;
        BlockStone c2 = this;
        if (d2.J(VARIANT) == BlockStone$EnumType.STONE) {
            return eAa.J((Block)QFa.yB);
        }
        return eAa.J((Block)QFa.Gd);
    }
}

