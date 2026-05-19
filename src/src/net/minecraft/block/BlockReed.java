/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  QFa
 *  Ypa
 *  eAa
 *  ez
 *  pqa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockReed
extends Block {
    public static final PropertyInteger AGE = PropertyInteger.J(tSa.v, uSa.E, Ypa.A);

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockReed b2 = this;
        b2.J((Gg)d2, (XF)c2, e2);
    }

    public BlockReed() {
        BlockReed blockReed;
        BlockReed blockReed2 = blockReed = this;
        super(Material.plants);
        blockReed2.J(blockReed2.blockState.J().J(AGE, uSa.E));
        float a2 = MRa.K;
        blockReed2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, pqa.r, MQa.L + a2);
        blockReed2.J(vRa.d != 0);
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockReed a2 = this;
        return Gea.D;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF) {
        void a2;
        void b2;
        BlockReed blockReed = this;
        Block c2 = b2.J(a2.down()).J();
        if (c2 == blockReed) {
            return vRa.d != 0;
        }
        if (c2 != QFa.lf && c2 != QFa.Bc && c2 != QFa.R) {
            return uSa.E != 0;
        }
        for (Object e2 : LX.HORIZONTAL) {
            if (b2.J(a2.offset((DZ)((Object)e2)).down()).J().J() != Material.water) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockReed b2 = this;
        Object d2 = xF;
        if (b2.l((Gg)c2, (XF)((Object)d2))) {
            return vRa.d != 0;
        }
        b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2, uSa.E);
        c2.G((XF)((Object)d2));
        return uSa.E != 0;
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockReed a2 = this;
        return a2.J().J(AGE, b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        void b2;
        void c2;
        BlockReed e2 = gg2;
        BlockReed d2 = this;
        if ((e2.J(c2.down()).J() == QFa.ka || d2.J((Gg)e2, (XF)c2, (IBlockState)b2)) && e2.J(c2.up())) {
            int a2 = vRa.d;
            BlockReed blockReed = e2;
            while (blockReed.J(c2.down(a2)).J() == d2) {
                blockReed = e2;
                ++a2;
            }
            if (a2 < yRa.d) {
                a2 = b2.J(AGE);
                if (a2 == Ypa.A) {
                    e2.J(c2.up(), d2.J());
                    e2.J((XF)c2, b2.J(AGE, uSa.E), AQa.P);
                    return;
                }
                e2.J((XF)c2, b2.J(AGE, a2 + vRa.d), AQa.P);
            }
        }
    }

    @Override
    public BlockState J() {
        BlockReed a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = AGE;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF, int n2) {
        void c2;
        Object d2 = xF;
        BlockReed b2 = this;
        return c2.J((XF)((Object)d2)).f((XF)((Object)d2));
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockReed a2 = this;
        return Gea.D;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockReed a2 = this;
        return b2.J(AGE);
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockReed a2 = this;
        return a2.J((Gg)b2, (XF)((Object)c2));
    }

    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockReed a2 = this;
        return null;
    }
}

