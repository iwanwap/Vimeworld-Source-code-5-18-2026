/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Mda
 *  NTa
 *  QFa
 *  UZ
 *  Ypa
 *  ZOa
 *  aSa
 *  eAa
 *  ez
 *  kX
 *  psa
 *  pua
 *  vRa
 *  wi
 *  wra
 *  zX
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockLeaves
extends BlockLeavesBase {
    public static final PropertyBool CHECK_DECAY;
    public int[] surroundings;
    public static final PropertyBool DECAYABLE;
    public boolean isTransparent;
    public int iconIndex;

    @Override
    public boolean e() {
        return uSa.E != 0;
    }

    public void J(boolean bl) {
        BlockLeaves a2;
        boolean b2 = bl;
        BlockLeaves blockLeaves = a2 = this;
        blockLeaves.fancyGraphics = a2.isTransparent = b2;
        blockLeaves.iconIndex = b2 ? uSa.E : vRa.d;
    }

    public void f(Gg gg2, XF xF, IBlockState iBlockState, int n2) {
        int n3 = n2;
        BlockLeaves a2 = this;
    }

    public BlockLeaves() {
        BlockLeaves a2;
        BlockLeaves blockLeaves = a2;
        super(Material.leaves, uSa.E != 0);
        blockLeaves.J(vRa.d != 0);
        a2.J(yGa.a);
        a2.J(psa.N);
        a2.J(vRa.d);
        a2.J(soundTypeGrass);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockLeaves a2 = this;
        return eAa.J((Block)QFa.Y);
    }

    public int d(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLeaves a2 = this;
        return kTa.j;
    }

    static {
        DECAYABLE = PropertyBool.J(sOa.n);
        CHECK_DECAY = PropertyBool.J(DPa.O);
    }

    @Override
    public int J() {
        return wi.f((int)zX.J((double)kTa.B, (double)oua.i));
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockLeaves a2 = this;
        void v0 = b2;
        Object object = c2;
        a2.J((Gg)v0, (XF)((Object)object), b2.J((XF)((Object)object)), uSa.E);
        v0.G((XF)((Object)c2));
    }

    @Override
    public ez J() {
        BlockLeaves a2;
        if (a2.isTransparent) {
            return ez.CUTOUT_MIPPED;
        }
        return ez.SOLID;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        Random e2;
        void c2;
        void d2;
        BlockLeaves blockLeaves = random2;
        Random random2 = random;
        BlockLeaves a2 = blockLeaves;
        if (d2.i(c2.up()) && !Gg.J((I)d2, (XF)c2.down()) && e2.nextInt(Ypa.A) == vRa.d) {
            void v1 = c2;
            double d3 = (float)v1.getX() + e2.nextFloat();
            double d4 = (double)v1.getY() - fPa.ca;
            double d5 = (float)v1.getZ() + e2.nextFloat();
            d2.J(UZ.DRIP_WATER, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        void b2;
        void d2;
        BlockLeaves blockLeaves = this;
        if (!d2.e && b2.J(CHECK_DECAY).booleanValue() && b2.J(DECAYABLE).booleanValue()) {
            void c2;
            int a2 = AQa.P;
            int n2 = a2 + vRa.d;
            void v0 = c2;
            int n3 = v0.getX();
            int n4 = v0.getY();
            int n5 = v0.getZ();
            int n6 = fPa.i;
            int n7 = n6 * n6;
            int e2 = n6 / uqa.g;
            if (blockLeaves.surroundings == null) {
                int n8 = n6;
                blockLeaves.surroundings = new int[n8 * n8 * n6];
            }
            if (d2.J(new XF(n3 - n2, n4 - n2, n5 - n2), new XF(n3 + n2, n4 + n2, n5 + n2))) {
                int n9;
                int n10;
                int n11;
                zz zz2 = new zz();
                int n12 = n11 = -a2;
                while (n12 <= a2) {
                    int n13 = -a2;
                    while (n13 <= a2) {
                        int n14 = -a2;
                        while (n14 <= a2) {
                            Block block = d2.J((XF)zz2.func_181079_c(n3 + n11, n4 + n10, n5 + n9)).J();
                            blockLeaves.surroundings[(n11 + e2) * n7 + (n10 + e2) * n6 + n9 + e2] = block != QFa.UA && block != QFa.hf && block != QFa.nE ? (block.J() == Material.leaves ? rQa.p : pua.o) : uSa.E;
                            n14 = ++n9;
                        }
                        n13 = ++n10;
                    }
                    n12 = ++n11;
                }
                int n15 = n11 = vRa.d;
                while (n15 <= AQa.P) {
                    int n16 = -a2;
                    while (n16 <= a2) {
                        int n17 = -a2;
                        while (n17 <= a2) {
                            int n18 = -a2;
                            while (n18 <= a2) {
                                int n19;
                                if (blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2) * n6 + n19 + e2] == n11 - vRa.d) {
                                    if (blockLeaves.surroundings[(n10 + e2 - vRa.d) * n7 + (n9 + e2) * n6 + n19 + e2] == rQa.p) {
                                        blockLeaves.surroundings[(n10 + e2 - vRa.d) * n7 + (n9 + e2) * n6 + n19 + e2] = n11;
                                    }
                                    if (blockLeaves.surroundings[(n10 + e2 + vRa.d) * n7 + (n9 + e2) * n6 + n19 + e2] == rQa.p) {
                                        blockLeaves.surroundings[(n10 + e2 + vRa.d) * n7 + (n9 + e2) * n6 + n19 + e2] = n11;
                                    }
                                    if (blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2 - vRa.d) * n6 + n19 + e2] == rQa.p) {
                                        blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2 - vRa.d) * n6 + n19 + e2] = n11;
                                    }
                                    if (blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2 + vRa.d) * n6 + n19 + e2] == rQa.p) {
                                        blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2 + vRa.d) * n6 + n19 + e2] = n11;
                                    }
                                    if (blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2) * n6 + (n19 + e2 - vRa.d)] == rQa.p) {
                                        blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2) * n6 + (n19 + e2 - vRa.d)] = n11;
                                    }
                                    if (blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2) * n6 + n19 + e2 + vRa.d] == rQa.p) {
                                        blockLeaves.surroundings[(n10 + e2) * n7 + (n9 + e2) * n6 + n19 + e2 + vRa.d] = n11;
                                    }
                                }
                                n18 = ++n19;
                            }
                            n17 = ++n9;
                        }
                        n16 = ++n10;
                    }
                    n15 = ++n11;
                }
            }
            if ((n2 = blockLeaves.surroundings[e2 * n7 + e2 * n6 + e2]) >= 0) {
                d2.J((XF)c2, b2.J(CHECK_DECAY, uSa.E != 0), AQa.P);
                return;
            }
            blockLeaves.f((Gg)d2, (XF)c2);
        }
    }

    @Override
    public int J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLeaves a2 = this;
        return wi.f((int)zX.f());
    }

    @Override
    public boolean g() {
        BlockLeaves a2;
        if (!a2.fancyGraphics) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract BlockPlanks$EnumType J(int var1);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, float f2, int n2) {
        void e2;
        float f3 = f2;
        BlockLeaves b2 = this;
        if (!e2.e) {
            void d2;
            void a2;
            void c2;
            int f4 = b2.d((IBlockState)c2);
            if (a2 > 0 && (f4 -= uqa.g << a2) < NTa.C) {
                f4 = NTa.C;
            }
            if (e2.v.nextInt(f4) == 0) {
                eAa eAa2 = b2.J((IBlockState)c2, e2.v, (int)a2);
                BlockLeaves.J((Gg)e2, (XF)d2, new Mda(eAa2, vRa.d, b2.C((IBlockState)c2)));
            }
            f4 = ZOa.x;
            if (a2 > 0 && (f4 -= NTa.C << a2) < wra.P) {
                f4 = wra.P;
            }
            b2.f((Gg)e2, (XF)d2, (IBlockState)c2, f4);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState) {
        void c2;
        void b2;
        BlockLeaves blockLeaves = this;
        int a2 = vRa.d;
        int d2 = a2 + vRa.d;
        void v0 = b2;
        int n2 = v0.getX();
        int n3 = v0.getY();
        int n4 = v0.getZ();
        if (c2.J(new XF(n2 - d2, n3 - d2, n4 - d2), new XF(n2 + d2, n3 + d2, n4 + d2))) {
            int n5 = d2 = -a2;
            while (n5 <= a2) {
                int n6 = -a2;
                while (n6 <= a2) {
                    int n7 = -a2;
                    while (n7 <= a2) {
                        XF xF2 = b2.add(d2, n2, n3);
                        IBlockState iBlockState2 = c2.J(xF2);
                        if (iBlockState2.J().J() == Material.leaves && !iBlockState2.J(CHECK_DECAY).booleanValue()) {
                            c2.J(xF2, iBlockState2.J(CHECK_DECAY, vRa.d != 0), AQa.P);
                        }
                        n7 = ++n3;
                    }
                    n6 = ++n2;
                }
                n5 = ++d2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF, int n2) {
        void c2;
        Object d2 = xF;
        BlockLeaves b2 = this;
        return wi.f((int)kX.l((I)c2, (XF)((Object)d2)));
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockLeaves a2 = this;
        if (b2.nextInt(kTa.j) == 0) {
            return vRa.d;
        }
        return uSa.E;
    }
}

