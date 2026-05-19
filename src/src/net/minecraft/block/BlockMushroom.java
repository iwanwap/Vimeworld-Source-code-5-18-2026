/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  QFa
 *  Qqa
 *  hra
 *  kta
 *  psa
 *  pua
 *  qv
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockMushroom
extends BlockBush
implements IGrowable {
    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        BlockMushroom a2 = this;
        Object c2 = xF2;
        if (super.J((Gg)b2, (XF)((Object)c2))) {
            BlockMushroom blockMushroom = a2;
            if (blockMushroom.J((Gg)b2, (XF)((Object)c2), blockMushroom.J())) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    @Override
    public boolean f(Block block) {
        Block b2 = block;
        BlockMushroom a2 = this;
        return b2.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        Object d2 = iBlockState;
        BlockMushroom a2 = this;
        if (b2.getY() >= 0 && b2.getY() < hra.Ja) {
            void c2;
            d2 = c2.J(b2.down());
            if (d2.J() == QFa.uB) {
                return vRa.d != 0;
            }
            if (d2.J() == QFa.Bc && d2.J(BlockDirt.VARIANT) == BlockDirt$DirtType.PODZOL) {
                return vRa.d != 0;
            }
            if (c2.f((XF)b2) < uua.s && a2.f(d2.J())) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        void c2;
        IBlockState e2;
        void b2;
        void d2;
        BlockMushroom blockMushroom = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockMushroom a2 = blockMushroom;
        a2.J((Gg)d2, (XF)b2, e2, (Random)c2);
    }

    @Override
    public boolean J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        Random e2 = random;
        BlockMushroom c2 = this;
        if ((double)e2.nextFloat() < Qqa.b) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void a2;
        BlockMushroom blockMushroom = this;
        if (a2.nextInt(kTa.g) == 0) {
            int n2;
            void d2;
            Object c2;
            int b2 = tTa.h;
            for (XF xF3 : XF.getAllInBoxMutable(((XF)((Object)c2)).add(pta.a, pua.o, pta.a), ((XF)((Object)c2)).add(AQa.P, vRa.d, AQa.P))) {
                if (d2.J(xF3).J() != blockMushroom || --b2 > 0) continue;
                return;
            }
            Object e2 = ((XF)((Object)c2)).add(a2.nextInt(yRa.d) - vRa.d, a2.nextInt(uqa.g) - a2.nextInt(uqa.g), a2.nextInt(yRa.d) - vRa.d);
            int n3 = n2 = uSa.E;
            while (n3 < AQa.P) {
                void var6_9;
                if (d2.J((XF)((Object)e2))) {
                    BlockMushroom blockMushroom2 = blockMushroom;
                    if (blockMushroom2.J((Gg)d2, (XF)((Object)e2), blockMushroom2.J())) {
                        c2 = e2;
                    }
                }
                e2 = ((XF)((Object)c2)).add(a2.nextInt(yRa.d) - vRa.d, a2.nextInt(uqa.g) - a2.nextInt(uqa.g), a2.nextInt(yRa.d) - vRa.d);
                n3 = ++var6_9;
            }
            if (d2.J((XF)((Object)e2))) {
                BlockMushroom blockMushroom3 = blockMushroom;
                if (blockMushroom3.J((Gg)d2, (XF)((Object)e2), blockMushroom3.J())) {
                    d2.J((XF)((Object)e2), blockMushroom.J(), uqa.g);
                }
            }
        }
    }

    public BlockMushroom() {
        BlockMushroom blockMushroom;
        BlockMushroom blockMushroom2 = blockMushroom = this;
        float a2 = psa.N;
        blockMushroom2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, a2 * kta.v, MQa.L + a2);
        blockMushroom2.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void b2;
        void a2;
        BlockMushroom blockMushroom;
        void c2;
        void d2;
        BlockMushroom blockMushroom2 = this;
        d2.G((XF)c2);
        BlockMushroom e2 = null;
        if (blockMushroom2 == QFa.vc) {
            blockMushroom = e2 = new qv(QFa.ma);
        } else {
            if (blockMushroom2 == QFa.TC) {
                e2 = new qv(QFa.BF);
            }
            blockMushroom = e2;
        }
        if (blockMushroom != null && e2.J((Gg)d2, (Random)a2, (XF)c2)) {
            return vRa.d != 0;
        }
        d2.J((XF)c2, (IBlockState)b2, yRa.d);
        return uSa.E != 0;
    }

    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl) {
        boolean bl2 = bl;
        BlockMushroom a2 = this;
        return vRa.d != 0;
    }
}

