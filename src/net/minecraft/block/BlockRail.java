/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailBase$Rail;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockRail
extends BlockRailBase {
    public static final PropertyEnum<BlockRailBase$EnumRailDirection> SHAPE = PropertyEnum.J(TOa.S, BlockRailBase$EnumRailDirection.class);

    @Override
    public IProperty<BlockRailBase$EnumRailDirection> J() {
        return SHAPE;
    }

    @Override
    public BlockState J() {
        BlockRail a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = SHAPE;
        return new BlockState(a2, iPropertyArray);
    }

    public BlockRail() {
        BlockRail a2;
        BlockRail blockRail = a2;
        super(uSa.E != 0);
        blockRail.J(blockRail.blockState.J().J(SHAPE, BlockRailBase$EnumRailDirection.NORTH_SOUTH));
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRail a2 = this;
        return b2.J(SHAPE).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockRail a2 = this;
        return a2.J().J(SHAPE, BlockRailBase$EnumRailDirection.byMetadata(b2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        void a2;
        IBlockState e2 = iBlockState;
        BlockRail b2 = this;
        if (a2.C() && new BlockRailBase$Rail(b2, (Gg)d2, (XF)c2, e2).J() == yRa.d) {
            b2.J((Gg)d2, (XF)c2, e2, uSa.E != 0);
        }
    }
}

