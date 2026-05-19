/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  QFa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPurpurSlab$Variant;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockPurpurSlab
extends BlockSlab {
    public static final PropertyEnum<BlockPurpurSlab$Variant> VARIANT = PropertyEnum.J(Xpa.Ka, BlockPurpurSlab$Variant.class);

    public BlockPurpurSlab() {
        BlockPurpurSlab blockPurpurSlab;
        BlockPurpurSlab blockPurpurSlab2 = blockPurpurSlab = this;
        super(Material.rock);
        Object a2 = blockPurpurSlab2.blockState.J();
        if (!blockPurpurSlab2.b()) {
            a2 = a2.J(HALF, BlockSlab$EnumBlockHalf.BOTTOM);
        }
        BlockPurpurSlab blockPurpurSlab3 = blockPurpurSlab;
        blockPurpurSlab3.J(a2.J(VARIANT, BlockPurpurSlab$Variant.DEFAULT));
        blockPurpurSlab3.J(yGa.A);
    }

    @Override
    public String J(int n2) {
        int b2 = n2;
        BlockPurpurSlab a2 = this;
        return super.J();
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockPurpurSlab a2 = this;
        return eAa.J((Block)QFa.Wf);
    }

    @Override
    public Object J(Mda mda2) {
        BlockPurpurSlab b2 = mda2;
        BlockPurpurSlab a2 = this;
        return BlockPurpurSlab$Variant.DEFAULT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockPurpurSlab blockPurpurSlab = this;
        int b2 = uSa.E;
        if (!blockPurpurSlab.b() && a2.J(HALF) == BlockSlab$EnumBlockHalf.TOP) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(int n2) {
        BlockPurpurSlab blockPurpurSlab;
        BlockPurpurSlab blockPurpurSlab2 = blockPurpurSlab = this;
        Object b2 = blockPurpurSlab2.J().J(VARIANT, BlockPurpurSlab$Variant.DEFAULT);
        if (!blockPurpurSlab2.b()) {
            void a2;
            b2 = b2.J(HALF, (a2 & Yqa.i) == 0 ? BlockSlab$EnumBlockHalf.BOTTOM : BlockSlab$EnumBlockHalf.TOP);
        }
        return b2;
    }

    @Override
    public IProperty<?> J() {
        return VARIANT;
    }

    public Mda J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockPurpurSlab a2 = this;
        return new Mda((Block)QFa.Wf);
    }

    @Override
    public BlockState J() {
        BlockPurpurSlab a2;
        if (a2.b()) {
            IProperty[] iPropertyArray = new IProperty[vRa.d];
            iPropertyArray[uSa.E] = VARIANT;
            return new BlockState(a2, iPropertyArray);
        }
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = HALF;
        iPropertyArray[vRa.d] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }
}

