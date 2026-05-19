/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  Mda
 *  Oz
 *  QFa
 *  XTa
 *  YSa
 *  Ypa
 *  eAa
 *  kta
 *  pqa
 *  pua
 *  vQa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockCrops
extends BlockBush
implements IGrowable {
    public static final PropertyInteger AGE = PropertyInteger.J(tSa.v, uSa.E, XTa.W);

    /*
     * WARNING - void declaration
     */
    public void d(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        void a2;
        BlockCrops blockCrops = this;
        int d2 = a2.J(AGE) + Oz.J((Random)c2.v, (int)uqa.g, (int)tTa.h);
        if (d2 > XTa.W) {
            d2 = XTa.W;
        }
        c2.J((XF)b2, a2.J(AGE, d2), uqa.g);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCrops a2 = this;
        return a2.J().J(AGE, b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        IBlockState e2;
        void b2;
        void d2;
        BlockCrops blockCrops = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockCrops a2 = blockCrops;
        a2.d((Gg)d2, (XF)b2, e2);
    }

    @Override
    public boolean J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        BlockCrops blockCrops = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockCrops a2 = blockCrops;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(Block block, Gg gg2, XF xF2) {
        int n2;
        Object object;
        void b2;
        int n3;
        void a22;
        Block block2 = block;
        float f2 = pqa.r;
        XF xF3 = a22.down();
        int n4 = n3 = pua.o;
        while (n4 <= vRa.d) {
            int n5 = pua.o;
            while (n5 <= vRa.d) {
                int n6;
                float c2 = JPa.N;
                object = b2.J(xF3.add(n3, uSa.E, n6));
                if (object.J() == QFa.rd) {
                    c2 = pqa.r;
                    if (object.J(BlockFarmland.MOISTURE) > 0) {
                        c2 = vQa.q;
                    }
                }
                if (n3 != 0 || n6 != 0) {
                    c2 /= YSa.G;
                }
                f2 += c2;
                n5 = ++n6;
            }
            n4 = ++n3;
        }
        void v2 = a22;
        XF xF4 = v2.north();
        XF xF5 = v2.south();
        XF c2 = v2.west();
        object = v2.east();
        int a22 = block2 == b2.J(c2).J() || block2 == b2.J((XF)((Object)object)).J() ? vRa.d : uSa.E;
        int n7 = n2 = block2 == b2.J(xF4).J() || block2 == b2.J(xF5).J() ? vRa.d : uSa.E;
        if (a22 != 0 && n2 != 0) {
            return f2 /= kta.v;
        }
        int n8 = a22 = block2 == b2.J(c2.north()).J() || block2 == b2.J(((XF)((Object)object)).north()).J() || block2 == b2.J(((XF)((Object)object)).south()).J() || block2 == b2.J(c2.south()).J() ? vRa.d : uSa.E;
        if (a22 != 0) {
            f2 /= kta.v;
        }
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        int n2;
        Random e2;
        void b2;
        void c2;
        void d2;
        BlockCrops blockCrops = random2;
        Random random2 = random;
        BlockCrops a2 = blockCrops;
        void v1 = d2;
        super.f((Gg)v1, (XF)c2, (IBlockState)b2, e2);
        if (v1.C(c2.up()) >= WOa.fa && (n2 = b2.J(AGE).intValue()) < XTa.W && e2.nextInt((int)(sSa.E / (e2 = BlockCrops.J(a2, (Gg)d2, (XF)c2))) + vRa.d) == 0) {
            d2.J((XF)c2, b2.J(AGE, n2 + vRa.d), uqa.g);
        }
    }

    @Override
    public boolean f(Block block) {
        Block b2 = block;
        BlockCrops a2 = this;
        if (b2 == QFa.rd) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        IBlockState d2 = iBlockState;
        BlockCrops c2 = this;
        if (d2.J(AGE) == XTa.W) {
            return c2.J();
        }
        return c2.f();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        XF d2 = xF2;
        BlockCrops b2 = this;
        if ((c2.f(d2) >= Yqa.i || c2.j(d2)) && b2.f(c2.J(d2.down()).J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCrops a2 = this;
        return b2.J(AGE);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockCrops a2 = this;
        return a2.f();
    }

    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl2) {
        IBlockState e2 = iBlockState;
        BlockCrops b2 = this;
        if (e2.J(AGE) < XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eAa f() {
        return Gea.o;
    }

    public BlockCrops() {
        BlockCrops blockCrops;
        BlockCrops blockCrops2 = blockCrops = this;
        blockCrops2.J(blockCrops2.blockState.J().J(AGE, uSa.E));
        blockCrops2.J(vRa.d != 0);
        float a2 = MQa.L;
        blockCrops.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, rta.o, MQa.L + a2);
        blockCrops2.J((yGa)null);
        blockCrops.J(JPa.N);
        blockCrops.J(soundTypeGrass);
        blockCrops.f();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        void b22;
        void d2;
        void e2;
        IBlockState f3 = iBlockState;
        BlockCrops c2 = this;
        void v0 = e2;
        super.J((Gg)v0, (XF)d2, f3, (float)b22, uSa.E);
        if (!v0.e && (f3 = f3.J(AGE).intValue()) >= XTa.W) {
            int a2;
            int b22 = yRa.d + a2;
            int n3 = a2 = uSa.E;
            while (n3 < b22) {
                if (e2.v.nextInt(Ypa.A) <= f3) {
                    BlockCrops.J((Gg)e2, (XF)d2, new Mda(c2.f(), vRa.d, uSa.E));
                }
                n3 = ++a2;
            }
        }
    }

    public eAa J() {
        return Gea.DC;
    }

    @Override
    public BlockState J() {
        BlockCrops a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = AGE;
        return new BlockState(a2, iPropertyArray);
    }
}

