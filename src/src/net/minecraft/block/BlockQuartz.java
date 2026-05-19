/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz$1;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockQuartz
extends Block {
    public static final PropertyEnum<BlockQuartz$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockQuartz$EnumType.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda J(IBlockState iBlockState) {
        void a2;
        BlockQuartz blockQuartz = this;
        Object b2 = a2.J(VARIANT);
        if (b2 != BlockQuartz$EnumType.LINES_X && b2 != BlockQuartz$EnumType.LINES_Z) {
            return super.J((IBlockState)a2);
        }
        return new Mda(eAa.J((Block)blockQuartz), vRa.d, BlockQuartz$EnumType.LINES_Y.getMetadata());
    }

    @Override
    public int C(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockQuartz a2 = this;
        if ((b2 = b2.J(VARIANT)) != BlockQuartz$EnumType.LINES_X && b2 != BlockQuartz$EnumType.LINES_Z) {
            return ((BlockQuartz$EnumType)((Object)b2)).getMetadata();
        }
        return BlockQuartz$EnumType.LINES_Y.getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockQuartz a2 = this;
        return a2.J().J(VARIANT, BlockQuartz$EnumType.byMetadata(b2));
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockQuartz a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public BlockState J() {
        BlockQuartz a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockQuartz a2 = this;
        return MapColor.quartzColor;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void i2;
        int n3 = n2;
        BlockQuartz b2 = this;
        if (i2 == BlockQuartz$EnumType.LINES_Y.getMetadata()) {
            void f5;
            switch (BlockQuartz$1.$SwitchMap$net$minecraft$util$EnumFacing$Axis[f5.getAxis().ordinal()]) {
                case 1: {
                    return b2.J().J(VARIANT, BlockQuartz$EnumType.LINES_Z);
                }
                case 2: {
                    return b2.J().J(VARIANT, BlockQuartz$EnumType.LINES_X);
                }
            }
            return b2.J().J(VARIANT, BlockQuartz$EnumType.LINES_Y);
        }
        if (i2 == BlockQuartz$EnumType.CHISELED.getMetadata()) {
            return b2.J().J(VARIANT, BlockQuartz$EnumType.CHISELED);
        }
        return b2.J().J(VARIANT, BlockQuartz$EnumType.DEFAULT);
    }

    public BlockQuartz() {
        BlockQuartz a2;
        BlockQuartz blockQuartz = a2;
        super(Material.rock);
        blockQuartz.J(blockQuartz.blockState.J().J(VARIANT, BlockQuartz$EnumType.DEFAULT));
        blockQuartz.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        BlockQuartz a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, BlockQuartz$EnumType.DEFAULT.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockQuartz$EnumType.CHISELED.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockQuartz$EnumType.LINES_Y.getMetadata()));
    }
}

