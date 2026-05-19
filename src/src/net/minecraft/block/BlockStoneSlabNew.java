/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
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
import net.minecraft.block.BlockStoneSlabNew$EnumType;
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
public abstract class BlockStoneSlabNew
extends BlockSlab {
    public static final PropertyBool SEAMLESS = PropertyBool.J(Npa.h);
    public static final PropertyEnum<BlockStoneSlabNew$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockStoneSlabNew$EnumType.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        BlockStoneSlabNew blockStoneSlabNew = this;
        if (c2 != eAa.J((Block)QFa.wC)) {
            int d2;
            BlockStoneSlabNew$EnumType[] b2 = BlockStoneSlabNew$EnumType.values();
            int n2 = b2.length;
            int n3 = d2 = uSa.E;
            while (n3 < n2) {
                void a2;
                BlockStoneSlabNew$EnumType blockStoneSlabNew$EnumType = b2[d2];
                a2.add(new Mda((eAa)c2, vRa.d, blockStoneSlabNew$EnumType.getMetadata()));
                n3 = ++d2;
            }
        }
    }

    @Override
    public IProperty<?> J() {
        return VARIANT;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStoneSlabNew a2 = this;
        return b2.J(VARIANT).func_181068_c();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockStoneSlabNew blockStoneSlabNew = this;
        int b2 = uSa.E;
        b2 |= a2.J(VARIANT).getMetadata();
        if (blockStoneSlabNew.b()) {
            if (a2.J(SEAMLESS).booleanValue()) {
                return b2 |= Yqa.i;
            }
        } else if (a2.J(HALF) == BlockSlab$EnumBlockHalf.TOP) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockStoneSlabNew a2 = this;
        return eAa.J((Block)QFa.F);
    }

    @Override
    public String f() {
        BlockStoneSlabNew a2;
        return Ey.f((String)new StringBuilder().insert(3 ^ 3, a2.J()).append(LPa.X).toString());
    }

    @Override
    public Object J(Mda mda2) {
        BlockStoneSlabNew b2 = mda2;
        BlockStoneSlabNew a2 = this;
        return BlockStoneSlabNew$EnumType.byMetadata(b2.J() & XTa.W);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStoneSlabNew a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public String J(int n2) {
        int b2 = n2;
        BlockStoneSlabNew a2 = this;
        return new StringBuilder().insert(2 & 5, super.J()).append(VQa.ja).append(BlockStoneSlabNew$EnumType.byMetadata(b2).getUnlocalizedName()).toString();
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockStoneSlabNew a2 = this;
        return eAa.J((Block)QFa.F);
    }

    @Override
    public BlockState J() {
        BlockStoneSlabNew a2;
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
    public IBlockState J(int n2) {
        void a2;
        BlockStoneSlabNew blockStoneSlabNew;
        BlockStoneSlabNew blockStoneSlabNew2 = blockStoneSlabNew = this;
        Object b2 = blockStoneSlabNew2.J().J(VARIANT, BlockStoneSlabNew$EnumType.byMetadata(a2 & XTa.W));
        if (blockStoneSlabNew2.b()) {
            b2 = b2.J(SEAMLESS, ((a2 & Yqa.i) != 0 ? vRa.d : uSa.E) != 0);
            return b2;
        }
        b2 = b2.J(HALF, (a2 & Yqa.i) == 0 ? BlockSlab$EnumBlockHalf.BOTTOM : BlockSlab$EnumBlockHalf.TOP);
        return b2;
    }

    public BlockStoneSlabNew() {
        BlockStoneSlabNew blockStoneSlabNew;
        BlockStoneSlabNew blockStoneSlabNew2;
        BlockStoneSlabNew blockStoneSlabNew3 = blockStoneSlabNew2 = this;
        super(Material.rock);
        Object a2 = blockStoneSlabNew3.blockState.J();
        if (blockStoneSlabNew3.b()) {
            a2 = a2.J(SEAMLESS, uSa.E != 0);
            blockStoneSlabNew = blockStoneSlabNew2;
        } else {
            a2 = a2.J(HALF, BlockSlab$EnumBlockHalf.BOTTOM);
            blockStoneSlabNew = blockStoneSlabNew2;
        }
        blockStoneSlabNew.J(a2.J(VARIANT, BlockStoneSlabNew$EnumType.RED_SANDSTONE));
        blockStoneSlabNew2.J(yGa.A);
    }
}

