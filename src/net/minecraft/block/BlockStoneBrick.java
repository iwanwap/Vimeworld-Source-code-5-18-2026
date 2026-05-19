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
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockStoneBrick
extends Block {
    public static final int DEFAULT_META;
    public static final int MOSSY_META;
    public static final int CRACKED_META;
    public static final int CHISELED_META;
    public static final PropertyEnum<BlockStoneBrick$EnumType> VARIANT;

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStoneBrick a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockStoneBrick blockStoneBrick = this;
        BlockStoneBrick$EnumType[] b2 = BlockStoneBrick$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockStoneBrick$EnumType blockStoneBrick$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockStoneBrick$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }

    @Override
    public BlockState J() {
        BlockStoneBrick a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    public BlockStoneBrick() {
        BlockStoneBrick a2;
        BlockStoneBrick blockStoneBrick = a2;
        super(Material.rock);
        blockStoneBrick.J(blockStoneBrick.blockState.J().J(VARIANT, BlockStoneBrick$EnumType.DEFAULT));
        blockStoneBrick.J(yGa.A);
    }

    static {
        VARIANT = PropertyEnum.J(Xpa.Ka, BlockStoneBrick$EnumType.class);
        DEFAULT_META = BlockStoneBrick$EnumType.DEFAULT.getMetadata();
        MOSSY_META = BlockStoneBrick$EnumType.MOSSY.getMetadata();
        CRACKED_META = BlockStoneBrick$EnumType.CRACKED.getMetadata();
        CHISELED_META = BlockStoneBrick$EnumType.CHISELED.getMetadata();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStoneBrick a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockStoneBrick a2 = this;
        return a2.J().J(VARIANT, BlockStoneBrick$EnumType.byMetadata(b2));
    }
}

