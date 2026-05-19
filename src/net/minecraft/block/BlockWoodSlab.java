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
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockWoodSlab$1;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockWoodSlab
extends BlockSlab {
    public static final PropertyEnum<BlockPlanks$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockPlanks$EnumType.class, new BlockWoodSlab$1());

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockWoodSlab blockWoodSlab = this;
        int b2 = uSa.E;
        b2 |= a2.J(VARIANT).getMetadata();
        if (!blockWoodSlab.b() && a2.J(HALF) == BlockSlab$EnumBlockHalf.TOP) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockWoodSlab a2 = this;
        return b2.J(VARIANT).func_181070_c();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(int n2) {
        void a2;
        BlockWoodSlab blockWoodSlab;
        BlockWoodSlab blockWoodSlab2 = blockWoodSlab = this;
        Object b2 = blockWoodSlab2.J().J(VARIANT, BlockPlanks$EnumType.byMetadata(a2 & XTa.W));
        if (!blockWoodSlab2.b()) {
            b2 = b2.J(HALF, (a2 & Yqa.i) == 0 ? BlockSlab$EnumBlockHalf.BOTTOM : BlockSlab$EnumBlockHalf.TOP);
        }
        return b2;
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockWoodSlab a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    public BlockWoodSlab() {
        BlockWoodSlab blockWoodSlab;
        BlockWoodSlab blockWoodSlab2 = blockWoodSlab = this;
        super(Material.wood);
        Object a2 = blockWoodSlab2.blockState.J();
        if (!blockWoodSlab2.b()) {
            a2 = a2.J(HALF, BlockSlab$EnumBlockHalf.BOTTOM);
        }
        BlockWoodSlab blockWoodSlab3 = blockWoodSlab;
        blockWoodSlab3.J(a2.J(VARIANT, BlockPlanks$EnumType.OAK));
        blockWoodSlab3.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        BlockWoodSlab blockWoodSlab = this;
        if (c2 != eAa.J((Block)QFa.EC)) {
            int d2;
            BlockPlanks$EnumType[] b2 = BlockPlanks$EnumType.values();
            int n2 = b2.length;
            int n3 = d2 = uSa.E;
            while (n3 < n2) {
                BlockPlanks$EnumType blockPlanks$EnumType = b2[d2];
                if (blockPlanks$EnumType.getMetadata() < Yqa.i) {
                    void a2;
                    a2.add(new Mda((eAa)c2, vRa.d, blockPlanks$EnumType.getMetadata()));
                }
                n3 = ++d2;
            }
        }
    }

    @Override
    public IProperty<?> J() {
        return VARIANT;
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockWoodSlab a2 = this;
        return eAa.J((Block)QFa.eb);
    }

    @Override
    public Object J(Mda mda2) {
        BlockWoodSlab b2 = mda2;
        BlockWoodSlab a2 = this;
        return BlockPlanks$EnumType.byMetadata(b2.J() & XTa.W);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockWoodSlab a2 = this;
        return eAa.J((Block)QFa.eb);
    }

    @Override
    public String J(int n2) {
        int b2 = n2;
        BlockWoodSlab a2 = this;
        return new StringBuilder().insert(3 ^ 3, super.J()).append(VQa.ja).append(BlockPlanks$EnumType.byMetadata(b2).getUnlocalizedName()).toString();
    }

    @Override
    public BlockState J() {
        BlockWoodSlab a2;
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

