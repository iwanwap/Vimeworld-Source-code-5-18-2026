/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  eAa
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks$1;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockPlanks
extends Block {
    public static final PropertyEnum<BlockPlanks$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockPlanks$EnumType.class, new BlockPlanks$1());

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPlanks a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public BlockState J() {
        BlockPlanks a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPlanks a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int n2;
        BlockPlanks blockPlanks = this;
        BlockPlanks$EnumType[] b2 = BlockPlanks$EnumType.values();
        int n3 = b2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object d2 = b2[n2];
            if (d2 != BlockPlanks$EnumType.IRON && ((BlockPlanks$EnumType)((Object)d2)).getMetadata() < lqa.s) {
                void c2;
                void a2;
                a2.add(new Mda((eAa)c2, vRa.d, ((BlockPlanks$EnumType)((Object)d2)).getMetadata()));
            }
            n4 = ++n2;
        }
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPlanks a2 = this;
        return b2.J(VARIANT).func_181070_c();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPlanks a2 = this;
        return a2.J().J(VARIANT, BlockPlanks$EnumType.byMetadata(b2));
    }

    public BlockPlanks() {
        BlockPlanks a2;
        BlockPlanks blockPlanks = a2;
        super(Material.wood);
        blockPlanks.J(blockPlanks.blockState.J().J(VARIANT, BlockPlanks$EnumType.OAK));
        blockPlanks.J(yGa.A);
    }
}

