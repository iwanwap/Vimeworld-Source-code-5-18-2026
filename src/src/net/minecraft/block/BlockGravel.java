/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  eAa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;

public final class BlockGravel
extends BlockFalling {
    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        void b2;
        int d2 = n2;
        BlockGravel a2 = this;
        if (d2 > yRa.d) {
            d2 = yRa.d;
        }
        if (b2.nextInt(NTa.C - d2 * yRa.d) == 0) {
            return Gea.M;
        }
        return eAa.J((Block)a2);
    }

    public BlockGravel() {
        BlockGravel a2;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockGravel a2 = this;
        return MapColor.stoneColor;
    }
}

