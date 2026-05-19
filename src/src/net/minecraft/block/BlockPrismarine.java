/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Mda
 *  VQa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPrismarine$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockPrismarine
extends Block {
    public static final int DARK_META;
    public static final PropertyEnum<BlockPrismarine$EnumType> VARIANT;
    public static final int BRICKS_META;
    public static final int ROUGH_META;

    public BlockPrismarine() {
        BlockPrismarine a2;
        BlockPrismarine blockPrismarine = a2;
        super(Material.rock);
        blockPrismarine.J(blockPrismarine.blockState.J().J(VARIANT, BlockPrismarine$EnumType.ROUGH));
        blockPrismarine.J(yGa.A);
    }

    static {
        VARIANT = PropertyEnum.J(Xpa.Ka, BlockPrismarine$EnumType.class);
        ROUGH_META = BlockPrismarine$EnumType.ROUGH.getMetadata();
        BRICKS_META = BlockPrismarine$EnumType.BRICKS.getMetadata();
        DARK_META = BlockPrismarine$EnumType.DARK.getMetadata();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPrismarine a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public String f() {
        BlockPrismarine a2;
        return Ey.f((String)new StringBuilder().insert(2 & 5, a2.J()).append(VQa.ja).append(BlockPrismarine$EnumType.ROUGH.getUnlocalizedName()).append(tpa.N).toString());
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPrismarine a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPrismarine a2 = this;
        return a2.J().J(VARIANT, BlockPrismarine$EnumType.byMetadata(b2));
    }

    @Override
    public BlockState J() {
        BlockPrismarine a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPrismarine a2 = this;
        if (b2.J(VARIANT) == BlockPrismarine$EnumType.ROUGH) {
            return MapColor.cyanColor;
        }
        return MapColor.diamondColor;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        BlockPrismarine a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, ROUGH_META));
        d2.add(new Mda((eAa)c2, vRa.d, BRICKS_META));
        d2.add(new Mda((eAa)c2, vRa.d, DARK_META));
    }
}

