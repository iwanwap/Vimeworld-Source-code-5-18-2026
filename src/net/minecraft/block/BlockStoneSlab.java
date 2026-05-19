/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  QFa
 *  VQa
 *  XTa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockStoneSlab$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockStoneSlab
extends BlockSlab {
    public static final PropertyBool SEAMLESS = PropertyBool.J(Npa.h);
    public static final PropertyEnum<BlockStoneSlab$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockStoneSlab$EnumType.class);

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStoneSlab a2 = this;
        return b2.J(VARIANT).func_181074_c();
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStoneSlab a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public IProperty<?> J() {
        return VARIANT;
    }

    @Override
    public String J(int n2) {
        int b2 = n2;
        BlockStoneSlab a2 = this;
        return new StringBuilder().insert(5 >> 3, super.J()).append(VQa.ja).append(BlockStoneSlab$EnumType.byMetadata(b2).getUnlocalizedName()).toString();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockStoneSlab blockStoneSlab = this;
        int b2 = uSa.E;
        b2 |= a2.J(VARIANT).getMetadata();
        if (blockStoneSlab.b()) {
            if (a2.J(SEAMLESS).booleanValue()) {
                return b2 |= Yqa.i;
            }
        } else if (a2.J(HALF) == BlockSlab$EnumBlockHalf.TOP) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public BlockState J() {
        BlockStoneSlab a2;
        if (a2.b()) {
            IProperty[] iPropertyArray = new IProperty[uqa.g];
            iPropertyArray[uSa.E] = SEAMLESS;
            iPropertyArray[vRa.d] = VARIANT;
            return new BlockState(a2, iPropertyArray);
        }
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = HALF;
        iPropertyArray[vRa.d] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        BlockStoneSlab blockStoneSlab = this;
        if (c2 != eAa.J((Block)QFa.Rd)) {
            int d2;
            BlockStoneSlab$EnumType[] b2 = BlockStoneSlab$EnumType.values();
            int n2 = b2.length;
            int n3 = d2 = uSa.E;
            while (n3 < n2) {
                BlockStoneSlab$EnumType blockStoneSlab$EnumType = b2[d2];
                if (blockStoneSlab$EnumType != BlockStoneSlab$EnumType.WOOD) {
                    void a2;
                    a2.add(new Mda((eAa)c2, vRa.d, blockStoneSlab$EnumType.getMetadata()));
                }
                n3 = ++d2;
            }
        }
    }

    @Override
    public Object J(Mda mda2) {
        BlockStoneSlab b2 = mda2;
        BlockStoneSlab a2 = this;
        return BlockStoneSlab$EnumType.byMetadata(b2.J() & XTa.W);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockStoneSlab a2 = this;
        return eAa.J((Block)QFa.Ib);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockStoneSlab a2 = this;
        return eAa.J((Block)QFa.Ib);
    }

    public BlockStoneSlab() {
        BlockStoneSlab blockStoneSlab;
        BlockStoneSlab blockStoneSlab2;
        BlockStoneSlab blockStoneSlab3 = blockStoneSlab2 = this;
        super(Material.rock);
        Object a2 = blockStoneSlab3.blockState.J();
        if (blockStoneSlab3.b()) {
            a2 = a2.J(SEAMLESS, uSa.E != 0);
            blockStoneSlab = blockStoneSlab2;
        } else {
            a2 = a2.J(HALF, BlockSlab$EnumBlockHalf.BOTTOM);
            blockStoneSlab = blockStoneSlab2;
        }
        blockStoneSlab.J(a2.J(VARIANT, BlockStoneSlab$EnumType.STONE));
        blockStoneSlab2.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(int n2) {
        void a2;
        BlockStoneSlab blockStoneSlab;
        BlockStoneSlab blockStoneSlab2 = blockStoneSlab = this;
        Object b2 = blockStoneSlab2.J().J(VARIANT, BlockStoneSlab$EnumType.byMetadata(a2 & XTa.W));
        if (blockStoneSlab2.b()) {
            b2 = b2.J(SEAMLESS, ((a2 & Yqa.i) != 0 ? vRa.d : uSa.E) != 0);
            return b2;
        }
        b2 = b2.J(HALF, (a2 & Yqa.i) == 0 ? BlockSlab$EnumBlockHalf.BOTTOM : BlockSlab$EnumBlockHalf.TOP);
        return b2;
    }
}

