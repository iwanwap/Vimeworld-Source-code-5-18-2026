/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  NTa
 *  XTa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom$1;
import net.minecraft.block.BlockHugeMushroom$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockHugeMushroom
extends Block {
    public static final PropertyEnum<BlockHugeMushroom$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockHugeMushroom$EnumType.class);
    private final Block smallBlock;

    @Override
    public BlockState J() {
        BlockHugeMushroom a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockHugeMushroom a2 = this;
        return eAa.J((Block)a2.smallBlock);
    }

    /*
     * WARNING - void declaration
     */
    public BlockHugeMushroom(Material material, MapColor mapColor, Block block) {
        void b2;
        void c2;
        BlockHugeMushroom a2;
        Block d2 = block;
        BlockHugeMushroom blockHugeMushroom = a2 = this;
        super((Material)c2, (MapColor)b2);
        blockHugeMushroom.J(blockHugeMushroom.blockState.J().J(VARIANT, BlockHugeMushroom$EnumType.ALL_OUTSIDE));
        blockHugeMushroom.smallBlock = d2;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockHugeMushroom a2 = this;
        return Math.max(uSa.E, b2.nextInt(NTa.C) - XTa.W);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockHugeMushroom a2 = this;
        switch (BlockHugeMushroom$1.$SwitchMap$net$minecraft$block$BlockHugeMushroom$EnumType[b2.J(VARIANT).ordinal()]) {
            case 1: {
                return MapColor.clothColor;
            }
            case 2: {
                return MapColor.sandColor;
            }
            case 3: {
                return MapColor.sandColor;
            }
        }
        return super.J(b2);
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockHugeMushroom blockHugeMushroom = blockHugeMushroom2;
        BlockHugeMushroom blockHugeMushroom2 = gl2;
        BlockHugeMushroom a2 = blockHugeMushroom;
        return a2.J();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockHugeMushroom a2 = this;
        return a2.J().J(VARIANT, BlockHugeMushroom$EnumType.byMetadata(b2));
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockHugeMushroom a2 = this;
        return eAa.J((Block)a2.smallBlock);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockHugeMushroom a2 = this;
        return b2.J(VARIANT).getMetadata();
    }
}

