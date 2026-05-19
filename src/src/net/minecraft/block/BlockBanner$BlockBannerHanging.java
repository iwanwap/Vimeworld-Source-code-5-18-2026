/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  pqa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBanner;
import net.minecraft.block.BlockBanner$1;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockBanner$BlockBannerHanging
extends BlockBanner {
    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void a2;
        void d2;
        void b2;
        XF e2 = xF2;
        BlockBanner$BlockBannerHanging c2 = this;
        DZ dZ2 = b2.J(FACING);
        if (!d2.J(e2.offset(dZ2.getOpposite())).J().J().i()) {
            void v0 = d2;
            c2.J((Gg)v0, e2, (IBlockState)b2, uSa.E);
            v0.G(e2);
        }
        super.J((Gg)d2, e2, (IBlockState)b2, (Block)a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(I i2, XF xF2) {
        DZ b2;
        Object c22 = xF2;
        BlockBanner$BlockBannerHanging a2 = this;
        b2 = b2.J((XF)((Object)c22)).J(FACING);
        float c22 = JPa.N;
        float f2 = mSa.U;
        float f3 = JPa.N;
        float f4 = pqa.r;
        float f5 = Mqa.N;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        switch (BlockBanner$1.$SwitchMap$net$minecraft$util$EnumFacing[b2.ordinal()]) {
            default: {
                a2.J(f3, c22, pqa.r - f5, f4, f2, pqa.r);
                return;
            }
            case 2: {
                a2.J(f3, c22, JPa.N, f4, f2, f5);
                return;
            }
            case 3: {
                a2.J(pqa.r - f5, c22, f3, pqa.r, f2, f4);
                return;
            }
            case 4: 
        }
        a2.J(JPa.N, c22, f3, f5, f2, f4);
    }

    public BlockBanner$BlockBannerHanging() {
        BlockBanner$BlockBannerHanging a2;
        BlockBanner$BlockBannerHanging blockBanner$BlockBannerHanging = a2;
        blockBanner$BlockBannerHanging.J(blockBanner$BlockBannerHanging.blockState.J().J(FACING, DZ.NORTH));
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockBanner$BlockBannerHanging a2 = this;
        DZ b22 = DZ.getFront(b22);
        if (b22.getAxis() == RX.Y) {
            b22 = DZ.NORTH;
        }
        return a2.J().J(FACING, b22);
    }

    @Override
    public BlockState J() {
        BlockBanner$BlockBannerHanging a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockBanner$BlockBannerHanging a2 = this;
        return b2.J(FACING).getIndex();
    }
}

