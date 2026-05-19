/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  DQa
 *  ERa
 *  Gg
 *  I
 *  JPa
 *  Lz
 *  MQa
 *  NTa
 *  Oz
 *  QFa
 *  UZ
 *  Wsa
 *  Ypa
 *  ZOa
 *  Zpa
 *  aSa
 *  bRa
 *  bua
 *  eAa
 *  ez
 *  fTa
 *  hra
 *  hy
 *  kPa
 *  kX
 *  lqa
 *  pqa
 *  psa
 *  pua
 *  vL
 *  vRa
 *  wOa
 *  xy
 *  ysa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockLiquid
extends Block {
    public static final PropertyInteger LEVEL = PropertyInteger.J(hra.x, uSa.E, Ypa.A);

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, XF xF2) {
        void a2;
        BlockLiquid c2 = gg2;
        BlockLiquid b2 = this;
        void v0 = a2;
        double d2 = v0.getX();
        double d3 = v0.getY();
        double d4 = v0.getZ();
        c2.J(d2 + kTa.B, d3 + kTa.B, d4 + kTa.B, bRa.T, MQa.L, Zpa.o + (((Gg)c2).v.nextFloat() - ((Gg)c2).v.nextFloat()) * xSa.la);
        int n2 = a2 = uSa.E;
        while (n2 < Yqa.i) {
            int n3 = 3 >> 1;
            c2.J(UZ.SMOKE_LARGE, d2 + Math.random(), d3 + JPa.ja, d4 + Math.random(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            n2 = ++a2;
        }
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLiquid a2 = this;
        return b2.J(LEVEL);
    }

    @Override
    public boolean J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockLiquid a2 = this;
        if (a2.blockMaterial != Material.lava) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(IBlockState iBlockState, boolean bl) {
        void b2;
        boolean c2 = bl;
        BlockLiquid a2 = this;
        if (c2 && b2.J(LEVEL) == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockLiquid a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        Object d2 = dZ2;
        BlockLiquid a2 = this;
        if (c2.J((XF)b2).J().J() == a2.blockMaterial) {
            return uSa.E != 0;
        }
        if (d2 == DZ.UP) {
            return vRa.d != 0;
        }
        return super.J((I)c2, (XF)b2, (DZ)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, XF xF2) {
        int n2;
        BlockLiquid blockLiquid = this;
        int n3 = n2 = pua.o;
        while (n3 <= vRa.d) {
            int n4 = pua.o;
            while (n4 <= vRa.d) {
                int c2;
                void a2;
                void b2;
                Block block = b2.J(a2.add(n2, uSa.E, c2)).J();
                if (block.J() != blockLiquid.blockMaterial && !block.J()) {
                    return vRa.d != 0;
                }
                n4 = ++c2;
            }
            n3 = ++n2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockLiquid a2 = this;
        a2.J((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Lz J(Gg gg2, XF xF2, vL vL2, Lz lz2) {
        void c2;
        void d2;
        BlockLiquid e2;
        BlockLiquid blockLiquid = blockLiquid2;
        BlockLiquid blockLiquid2 = lz2;
        BlockLiquid a2 = blockLiquid;
        return e2.J(a2.J((I)d2, (XF)c2));
    }

    public static BlockStaticLiquid J(Material a2) {
        if (a2 == Material.water) {
            return QFa.sc;
        }
        if (a2 == Material.lava) {
            return QFa.bb;
        }
        throw new IllegalArgumentException(Cta.x);
    }

    public static BlockDynamicLiquid J(Material a2) {
        if (a2 == Material.water) {
            return QFa.jd;
        }
        if (a2 == Material.lava) {
            return QFa.fA;
        }
        throw new IllegalArgumentException(Cta.x);
    }

    /*
     * WARNING - void declaration
     */
    public int C(I i2, XF xF2) {
        void a2;
        Object c2 = i2;
        BlockLiquid b2 = this;
        if ((c2 = c2.J((XF)a2)).J().J() == b2.blockMaterial) {
            return c2.J(LEVEL);
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public int l(I i2, XF xF2) {
        void a2;
        BlockLiquid b2 = this;
        BlockLiquid c22 = i2;
        int c22 = b2.C((I)c22, (XF)a2);
        if (c22 >= Yqa.i) {
            return uSa.E;
        }
        return c22;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(I i2, XF xF2, DZ dZ2) {
        void a2;
        void b2;
        void c2;
        BlockLiquid blockLiquid = this;
        Material d2 = c2.J((XF)b2).J().J();
        if (d2 == blockLiquid.blockMaterial) {
            return uSa.E != 0;
        }
        if (a2 == DZ.UP) {
            return vRa.d != 0;
        }
        if (d2 == Material.ice) {
            return uSa.E != 0;
        }
        return super.f((I)c2, (XF)b2, (DZ)a2);
    }

    public static float J(int a2) {
        if (a2 >= Yqa.i) {
            a2 = uSa.E;
        }
        return (float)(a2 + vRa.d) / kPa.S;
    }

    @Override
    public BlockState J() {
        BlockLiquid a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = LEVEL;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockLiquid a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static double J(I i2, XF xF2, Material material) {
        void a2;
        Object c2 = xF2;
        I b2 = i2;
        c2 = BlockLiquid.J((Material)a2).J(b2, (XF)((Object)c2));
        if (c2.A == aSa.V && c2.J == aSa.V) {
            return bua.g;
        }
        return Oz.f((double)c2.J, (double)c2.A) - fTa.o;
    }

    public BlockLiquid(Material material) {
        BlockLiquid a2;
        Material b2 = material;
        BlockLiquid blockLiquid = a2 = this;
        super(b2);
        blockLiquid.J(blockLiquid.blockState.J().J(LEVEL, uSa.E));
        blockLiquid.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        blockLiquid.J(vRa.d != 0);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public int J(Gg gg2) {
        BlockLiquid b2 = gg2;
        BlockLiquid a2 = this;
        if (a2.blockMaterial == Material.water) {
            return tTa.h;
        }
        if (a2.blockMaterial == Material.lava) {
            if (((Gg)b2).F.f()) {
                return NTa.C;
            }
            return Fsa.d;
        }
        return uSa.E;
    }

    @Override
    public ez J() {
        BlockLiquid a2;
        if (a2.blockMaterial == Material.water) {
            return ez.TRANSLUCENT;
        }
        return ez.SOLID;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Material material;
        void d2;
        BlockLiquid blockLiquid;
        Random e2;
        double d3;
        double d4;
        double d5;
        void c2;
        BlockLiquid a2;
        block8: {
            block6: {
                block7: {
                    void b2;
                    BlockLiquid blockLiquid2 = random2;
                    Random random2 = random;
                    a2 = blockLiquid2;
                    void v1 = c2;
                    d5 = v1.getX();
                    d4 = v1.getY();
                    d3 = v1.getZ();
                    if (a2.blockMaterial != Material.water) break block6;
                    int n2 = b2.J(LEVEL);
                    if (n2 <= 0 || n2 >= Yqa.i) break block7;
                    if (e2.nextInt(ysa.s) != 0) break block6;
                    blockLiquid = a2;
                    d2.J(d5 + kTa.B, d4 + kTa.B, d3 + kTa.B, DQa.w, e2.nextFloat() * rta.o + wOa.w, e2.nextFloat() * pqa.r + MQa.L, uSa.E != 0);
                    break block8;
                }
                if (e2.nextInt(NTa.C) == 0) {
                    d2.J(UZ.SUSPENDED, d5 + (double)e2.nextFloat(), d4 + (double)e2.nextFloat(), d3 + (double)e2.nextFloat(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                }
            }
            blockLiquid = a2;
        }
        if (blockLiquid.blockMaterial == Material.lava && d2.J(c2.up()).J().J() == Material.air && !d2.J(c2.up()).J().g()) {
            if (e2.nextInt(ySa.T) == 0) {
                double d6 = d5 + (double)e2.nextFloat();
                double d7 = d4 + a2.maxY;
                double d8 = d3 + (double)e2.nextFloat();
                void v3 = d2;
                v3.J(UZ.LAVA, d6, d7, d8, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                v3.J(d6, d7, d8, Ura.G, psa.N + e2.nextFloat() * psa.N, ATa.r + e2.nextFloat() * VPa.i, uSa.E != 0);
            }
            if (e2.nextInt(ZOa.x) == 0) {
                d2.J(d5, d4, d3, sra.Da, psa.N + e2.nextFloat() * psa.N, ATa.r + e2.nextFloat() * VPa.i, uSa.E != 0);
            }
        }
        if (e2.nextInt(NTa.C) == 0 && Gg.J((I)d2, (XF)c2.down()) && !(material = d2.J(c2.down(uqa.g)).J().J()).f() && !material.l()) {
            double d9 = d5 + (double)e2.nextFloat();
            double d10 = d4 - rRa.l;
            double d11 = d3 + (double)e2.nextFloat();
            if (a2.blockMaterial == Material.water) {
                d2.J(UZ.DRIP_WATER, d9, d10, d11, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                return;
            }
            d2.J(UZ.DRIP_LAVA, d9, d10, d11, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2) {
        int n2;
        int n3;
        void b22;
        XF c22 = xF2;
        BlockLiquid a2 = this;
        void v0 = b22;
        int b22 = v0.J(c22, uSa.E);
        int c22 = v0.J(c22.up(), uSa.E);
        int n4 = b22 & osa.Ja;
        int n5 = c22 & osa.Ja;
        b22 = b22 >> ERa.C & osa.Ja;
        c22 = c22 >> ERa.C & osa.Ja;
        if (n4 > n5) {
            n3 = n4;
            n2 = b22;
        } else {
            n3 = n5;
            n2 = b22;
        }
        return n3 | (n2 > c22 ? b22 : c22) << ERa.C;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, int n2) {
        Object d2 = xF2;
        BlockLiquid b2 = this;
        if (b2.blockMaterial == Material.water) {
            void c2;
            return kX.f((I)c2, (XF)((Object)d2));
        }
        return Wsa.K;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        XF d2 = xF2;
        BlockLiquid b2 = this;
        if (b2.blockMaterial == Material.lava) {
            int n2;
            void c2;
            Object object;
            block6: {
                int n3;
                int n4 = uSa.E;
                object = DZ.VALUES;
                int n5 = DZ.VALUES.length;
                int n6 = n3 = uSa.E;
                while (n6 < n5) {
                    DZ dZ2 = object[n3];
                    if (dZ2 != DZ.DOWN && c2.J(d2.offset(dZ2)).J().J() == Material.water) {
                        n2 = n4 = vRa.d;
                        break block6;
                    }
                    n6 = ++n3;
                }
                n2 = n4;
            }
            if (n2 != 0) {
                void a2;
                object = a2.J(LEVEL);
                if ((Integer)object == 0) {
                    c2.J(d2, QFa.X.J());
                    b2.f((Gg)c2, d2);
                    return vRa.d != 0;
                }
                if ((Integer)object <= AQa.P) {
                    c2.J(d2, QFa.yB.J());
                    b2.f((Gg)c2, d2);
                    return vRa.d != 0;
                }
            }
        }
        return uSa.E != 0;
    }

    @Override
    public hy J() {
        return hy.LIQUID;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockLiquid b2 = this;
        b2.J((Gg)d2, (XF)c2, e2);
    }

    /*
     * WARNING - void declaration
     */
    public Lz J(I i2, XF xF2) {
        Lz lz2;
        Object c2;
        void a2;
        void b2;
        BlockLiquid blockLiquid = this;
        Lz lz3 = new Lz(aSa.V, aSa.V, aSa.V);
        int n2 = blockLiquid.l((I)b2, (XF)a2);
        for (DZ dZ2 : LX.HORIZONTAL) {
            int n3;
            c2 = a2.offset(dZ2);
            int n4 = blockLiquid.l((I)b2, (XF)((Object)c2));
            if (n4 < 0) {
                if (b2.J((XF)((Object)c2)).J().J().f() || (n4 = blockLiquid.l((I)b2, ((XF)((Object)c2)).down())) < 0) continue;
                n3 = n4 - (n2 - Yqa.i);
                lz3 = lz3.f((double)((c2.getX() - a2.getX()) * n3), (double)((c2.getY() - a2.getY()) * n3), (double)((c2.getZ() - a2.getZ()) * n3));
                continue;
            }
            if (n4 < 0) continue;
            n3 = n4 - n2;
            lz3 = lz3.f((double)((c2.getX() - a2.getX()) * n3), (double)((c2.getY() - a2.getY()) * n3), (double)((c2.getZ() - a2.getZ()) * n3));
        }
        if (b2.J((XF)a2).J(LEVEL) >= Yqa.i) {
            for (DZ dZ2 : LX.HORIZONTAL) {
                c2 = a2.offset(dZ2);
                if (!blockLiquid.f((I)b2, (XF)((Object)c2), dZ2) && !blockLiquid.f((I)b2, ((XF)((Object)c2)).up(), dZ2)) continue;
                lz2 = lz3 = lz3.J().f(aSa.V, lqa.ca, aSa.V);
                break;
            }
        } else {
            lz2 = lz3;
        }
        return lz2.J();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockLiquid a2 = this;
        return a2.J().J(LEVEL, b2);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockLiquid a2 = this;
        return uSa.E;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

