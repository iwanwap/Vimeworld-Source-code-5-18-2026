/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBanner;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockBanner$BlockBannerStanding
extends BlockBanner {
    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockBanner$BlockBannerStanding a2 = this;
        return a2.J().J(ROTATION, b2);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockBanner$BlockBannerStanding a2 = this;
        return b2.J(ROTATION);
    }

    public BlockBanner$BlockBannerStanding() {
        BlockBanner$BlockBannerStanding a2;
        BlockBanner$BlockBannerStanding blockBanner$BlockBannerStanding = a2;
        blockBanner$BlockBannerStanding.J(blockBanner$BlockBannerStanding.blockState.J().J(ROTATION, uSa.E));
    }

    @Override
    public BlockState J() {
        BlockBanner$BlockBannerStanding a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = ROTATION;
        return new BlockState(a2, iPropertyArray);
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
        BlockBanner$BlockBannerStanding c2 = this;
        if (!d2.J(e2.down()).J().J().i()) {
            void v0 = d2;
            c2.J((Gg)v0, e2, (IBlockState)b2, uSa.E);
            v0.G(e2);
        }
        super.J((Gg)d2, e2, (IBlockState)b2, (Block)a2);
    }
}

