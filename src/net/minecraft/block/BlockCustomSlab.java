/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomSlab$Variant;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockCustomSlab
extends BlockSlab {
    private final Block blockHalf;
    public static final PropertyEnum<BlockCustomSlab$Variant> VARIANT = PropertyEnum.J(Xpa.Ka, BlockCustomSlab$Variant.class);

    @Override
    public BlockState J() {
        BlockCustomSlab a2;
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

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(int n2) {
        BlockCustomSlab blockCustomSlab;
        BlockCustomSlab blockCustomSlab2 = blockCustomSlab = this;
        Object b2 = blockCustomSlab2.J().J(VARIANT, BlockCustomSlab$Variant.DEFAULT);
        if (!blockCustomSlab2.b()) {
            void a2;
            b2 = b2.J(HALF, (a2 & Yqa.i) == 0 ? BlockSlab$EnumBlockHalf.BOTTOM : BlockSlab$EnumBlockHalf.TOP);
        }
        return b2;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockCustomSlab a2 = this;
        return eAa.J((Block)a2.blockHalf);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockCustomSlab blockCustomSlab = this;
        int b2 = uSa.E;
        if (!blockCustomSlab.b() && a2.J(HALF) == BlockSlab$EnumBlockHalf.TOP) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public Object J(Mda mda2) {
        BlockCustomSlab b2 = mda2;
        BlockCustomSlab a2 = this;
        return BlockCustomSlab$Variant.DEFAULT;
    }

    public Mda J(Gg gg2, XF xF, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockCustomSlab a2 = this;
        return new Mda(a2.blockHalf);
    }

    /*
     * WARNING - void declaration
     */
    public BlockCustomSlab(Block block, Block block2) {
        void a2;
        Object c2 = block;
        BlockCustomSlab b2 = this;
        super(((Block)c2).blockMaterial);
        b2.blockHalf = a2 == null ? b2 : a2;
        BlockCustomSlab blockCustomSlab = b2;
        c2 = blockCustomSlab.blockState.J();
        if (!blockCustomSlab.b()) {
            c2 = c2.J(HALF, BlockSlab$EnumBlockHalf.BOTTOM);
        }
        BlockCustomSlab blockCustomSlab2 = b2;
        blockCustomSlab2.J(c2.J(VARIANT, BlockCustomSlab$Variant.DEFAULT));
        blockCustomSlab2.J(yGa.A);
    }

    @Override
    public IProperty<?> J() {
        return VARIANT;
    }

    @Override
    public String J(int n2) {
        int b2 = n2;
        BlockCustomSlab a2 = this;
        return super.J();
    }
}

