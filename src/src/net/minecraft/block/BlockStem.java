/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  Mda
 *  Oz
 *  QFa
 *  XTa
 *  Ypa
 *  Yra
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockStem$1;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockStem
extends BlockBush
implements IGrowable {
    public static final PropertyInteger AGE = PropertyInteger.J(tSa.v, uSa.E, XTa.W);
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, new BlockStem$1());
    private final Block crop;

    @Override
    public int J(IBlockState iBlockState) {
        IBlockState b22 = iBlockState;
        BlockStem a2 = this;
        if (b22.J() != a2) {
            return super.J(b22);
        }
        int b22 = b22.J(AGE);
        int n2 = b22 * fPa.i;
        int n3 = osa.Ja - b22 * Yqa.i;
        return n2 << ERa.C | n3 << Yqa.i | (b22 *= AQa.P);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        IBlockState e2;
        void b2;
        void d2;
        BlockStem blockStem = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockStem a2 = blockStem;
        a2.d((Gg)d2, (XF)b2, e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        int a2;
        void b2;
        void d2;
        void e2;
        IBlockState f32 = iBlockState;
        BlockStem c2 = this;
        void v0 = e2;
        super.J((Gg)v0, (XF)d2, f32, (float)b2, a2);
        if (!v0.e && (b2 = c2.J()) != null) {
            int f32 = f32.J(AGE);
            int n3 = a2 = uSa.E;
            while (n3 < yRa.d) {
                if (e2.v.nextInt(Ypa.A) <= f32) {
                    BlockStem.J((Gg)e2, (XF)d2, new Mda(b2));
                }
                n3 = ++a2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        float f2;
        void a2;
        XF c2;
        void d2;
        Object e2 = iBlockState;
        BlockStem b2 = this;
        void v0 = d2;
        super.f((Gg)v0, c2, (IBlockState)e2, (Random)a2);
        if (v0.C(c2.up()) >= WOa.fa && a2.nextInt((int)(sSa.E / (f2 = BlockCrops.J(b2, (Gg)d2, c2))) + vRa.d) == 0) {
            int n2 = e2.J(AGE);
            if (n2 < XTa.W) {
                e2 = e2.J(AGE, n2 + vRa.d);
                d2.J(c2, (IBlockState)e2, uqa.g);
                return;
            }
            for (DZ dZ2 : LX.HORIZONTAL) {
                if (d2.J(c2.offset(dZ2)).J() != b2.crop) continue;
                return;
            }
            c2 = c2.offset(LX.HORIZONTAL.random((Random)a2));
            void v1 = d2;
            e2 = v1.J(c2.down()).J();
            if (v1.J((XF)c2).J().blockMaterial == Material.air && (e2 == QFa.rd || e2 == QFa.Bc || e2 == QFa.lf)) {
                d2.J(c2, b2.crop.J());
            }
        }
    }

    @Override
    public BlockState J() {
        BlockStem a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = AGE;
        iPropertyArray[vRa.d] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockStem a2 = this;
        return null;
    }

    @Override
    public void f() {
        BlockStem blockStem = this;
        float a2 = Mqa.N;
        blockStem.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, rta.o, MQa.L + a2);
    }

    @Override
    public boolean J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        BlockStem blockStem = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockStem a2 = blockStem;
        return vRa.d != 0;
    }

    public BlockStem(Block block) {
        BlockStem a2;
        Block b22 = block;
        BlockStem blockStem = a2 = this;
        blockStem.J(blockStem.blockState.J().J(AGE, uSa.E).J(FACING, DZ.UP));
        blockStem.crop = b22;
        float b22 = Mqa.N;
        BlockStem blockStem2 = a2;
        blockStem.J(vRa.d != 0);
        blockStem2.J(MQa.L - b22, JPa.N, MQa.L - b22, MQa.L + b22, rta.o, MQa.L + b22);
        blockStem2.J((yGa)null);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockStem a2 = this;
        return a2.J().J(AGE, b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, int n2) {
        void c2;
        Object d2 = xF2;
        BlockStem b2 = this;
        return b2.J(c2.J((XF)((Object)d2)));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        Object d2 = iBlockState;
        BlockStem c2 = this;
        d2 = d2.J(FACING, DZ.UP);
        for (DZ dZ2 : LX.HORIZONTAL) {
            void a2;
            void b2;
            if (b2.J(a2.offset(dZ2)).J() != c2.crop) continue;
            d2 = d2.J(FACING, dZ2);
            return d2;
        }
        return d2;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStem a2 = this;
        return b2.J(AGE);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        BlockStem c22 = i2;
        BlockStem b2 = this;
        b2.maxY = (float)(c22.J((XF)a2).J(AGE) * uqa.g + uqa.g) / Yra.i;
        float c22 = Mqa.N;
        b2.J(MQa.L - c22, JPa.N, MQa.L - c22, MQa.L + c22, (float)b2.maxY, MQa.L + c22);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        BlockStem c2 = gg2;
        BlockStem b2 = this;
        c2 = b2.J();
        if (c2 != null) {
            return c2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void d(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        void a2;
        BlockStem blockStem = this;
        int d2 = a2.J(AGE) + Oz.J((Random)c2.v, (int)uqa.g, (int)tTa.h);
        c2.J((XF)b2, a2.J(AGE, Math.min(XTa.W, d2)), uqa.g);
    }

    public eAa J() {
        BlockStem a2;
        if (a2.crop == QFa.s) {
            return Gea.tb;
        }
        if (a2.crop == QFa.HC) {
            return Gea.wc;
        }
        return null;
    }

    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl) {
        IBlockState e2 = iBlockState;
        BlockStem b2 = this;
        if (e2.J(AGE) != XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean f(Block block) {
        Block b2 = block;
        BlockStem a2 = this;
        if (b2 == QFa.rd) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

