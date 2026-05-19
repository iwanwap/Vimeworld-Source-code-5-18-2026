/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NQa
 *  Ypa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockStandingSign
extends BlockSign {
    public static final PropertyInteger ROTATION = PropertyInteger.J(NQa.ja, uSa.E, Ypa.A);

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockStandingSign a2 = this;
        return a2.J().J(ROTATION, b2);
    }

    public BlockStandingSign() {
        BlockStandingSign a2;
        BlockStandingSign blockStandingSign = a2;
        blockStandingSign.J(blockStandingSign.blockState.J().J(ROTATION, uSa.E));
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStandingSign a2 = this;
        return b2.J(ROTATION);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void a2;
        void b2;
        void d2;
        XF e2 = xF;
        BlockStandingSign c2 = this;
        if (!d2.J(e2.down()).J().J().i()) {
            void v0 = d2;
            c2.J((Gg)v0, e2, (IBlockState)b2, uSa.E);
            v0.G(e2);
        }
        super.J((Gg)d2, e2, (IBlockState)b2, (Block)a2);
    }

    @Override
    public BlockState J() {
        BlockStandingSign a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = ROTATION;
        return new BlockState(a2, iPropertyArray);
    }
}

