/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QFa
 */
package net.minecraft.block;

import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.state.IBlockState;

public final class BlockSilverfish$EnumType$1
extends BlockSilverfish$EnumType {
    /*
     * WARNING - void declaration
     */
    public BlockSilverfish$EnumType$1(int n3, String string2) {
        Object c2;
        void b2;
        BlockSilverfish$EnumType$1 blockSilverfish$EnumType$1 = object;
        Object object = string2;
        BlockSilverfish$EnumType$1 a2 = blockSilverfish$EnumType$1;
    }

    @Override
    public IBlockState getModelBlock() {
        return QFa.Gd.J().J(BlockStone.VARIANT, BlockStone$EnumType.STONE);
    }
}

