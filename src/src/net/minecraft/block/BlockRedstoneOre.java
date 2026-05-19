/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  QFa
 *  UZ
 *  aSa
 *  eAa
 *  vL
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockRedstoneOre
extends Block {
    private final boolean isOn;

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        Object e2 = xF;
        BlockRedstoneOre c2 = this;
        if (c2 == QFa.Oc) {
            void d2;
            d2.J((XF)((Object)e2), QFa.M.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    private void l(Gg gg2, XF xF) {
        int n2;
        void b2;
        XF c2 = xF;
        BlockRedstoneOre a2 = this;
        Random random = b2.v;
        double d2 = BQa.R;
        int n3 = n2 = uSa.E;
        while (n3 < uua.p) {
            XF xF2 = c2;
            double d3 = (float)xF2.getX() + random.nextFloat();
            double d4 = (float)xF2.getY() + random.nextFloat();
            double d5 = (float)xF2.getZ() + random.nextFloat();
            if (n2 == 0 && !b2.J(c2.up()).J().g()) {
                d4 = (double)c2.getY() + d2 + oua.i;
            }
            if (n2 == vRa.d && !b2.J(c2.down()).J().g()) {
                d4 = (double)c2.getY() - d2;
            }
            if (n2 == uqa.g && !b2.J(c2.south()).J().g()) {
                d5 = (double)c2.getZ() + d2 + oua.i;
            }
            if (n2 == yRa.d && !b2.J(c2.north()).J().g()) {
                d5 = (double)c2.getZ() - d2;
            }
            if (n2 == AQa.P && !b2.J(c2.east()).J().g()) {
                d3 = (double)c2.getX() + d2 + oua.i;
            }
            if (n2 == tTa.h && !b2.J(c2.west()).J().g()) {
                d3 = (double)c2.getX() - d2;
            }
            if (d3 < (double)c2.getX() || d3 > (double)(c2.getX() + vRa.d) || d4 < aSa.V || d4 > (double)(c2.getY() + vRa.d) || d5 < (double)c2.getZ() || d5 > (double)(c2.getZ() + vRa.d)) {
                b2.J(UZ.REDSTONE, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        Object e2 = xF;
        BlockRedstoneOre c2 = this;
        if (c2.isOn) {
            void d2;
            c2.l((Gg)d2, (XF)((Object)e2));
        }
    }

    public BlockRedstoneOre(boolean bl) {
        boolean b2 = bl;
        BlockRedstoneOre a2 = this;
        super(Material.rock);
        if (b2) {
            a2.J(vRa.d != 0);
        }
        a2.isOn = b2;
    }

    @Override
    public int J(Gg gg2) {
        BlockRedstoneOre b2 = gg2;
        BlockRedstoneOre a2 = this;
        return Fsa.d;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF) {
        void b2;
        BlockRedstoneOre a2;
        Object c2 = xF;
        BlockRedstoneOre blockRedstoneOre = a2 = this;
        blockRedstoneOre.l((Gg)b2, (XF)((Object)c2));
        if (blockRedstoneOre == QFa.M) {
            b2.J((XF)((Object)c2), QFa.Oc.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(int n2, Random random) {
        void b2;
        Random c2 = random;
        BlockRedstoneOre a2 = this;
        return a2.J(c2) + c2.nextInt((int)(b2 + vRa.d));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, Sx sx) {
        void a2;
        void c2;
        BlockRedstoneOre b2;
        Object d2 = xF;
        BlockRedstoneOre blockRedstoneOre = b2 = this;
        blockRedstoneOre.f((Gg)c2, (XF)((Object)d2));
        super.J((Gg)c2, (XF)((Object)d2), (Sx)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, vL vL2) {
        void a2;
        void c2;
        BlockRedstoneOre b2;
        Object d2 = xF;
        BlockRedstoneOre blockRedstoneOre = b2 = this;
        blockRedstoneOre.f((Gg)c2, (XF)((Object)d2));
        super.J((Gg)c2, (XF)((Object)d2), (vL)a2);
    }

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneOre a2 = this;
        return new Mda(QFa.M);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx, DZ dZ, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void h;
        BlockRedstoneOre g;
        Object i2 = xF;
        BlockRedstoneOre blockRedstoneOre = g = this;
        blockRedstoneOre.f((Gg)h, (XF)((Object)i2));
        return super.J((Gg)h, (XF)((Object)i2), (IBlockState)f5, (Sx)e2, (DZ)d2, (float)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, float f2, int n2) {
        void a2;
        void b2;
        void d2;
        void e2;
        BlockRedstoneOre c2;
        IBlockState f32 = iBlockState;
        BlockRedstoneOre blockRedstoneOre = c2 = this;
        super.J((Gg)e2, (XF)d2, f32, (float)b2, (int)a2);
        if (blockRedstoneOre.J(f32, e2.v, (int)a2) != eAa.J((Block)c2)) {
            int f32 = vRa.d + e2.v.nextInt(tTa.h);
            c2.J((Gg)e2, (XF)d2, f32);
        }
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockRedstoneOre a2 = this;
        return Gea.zc;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockRedstoneOre a2 = this;
        return AQa.P + b2.nextInt(uqa.g);
    }
}

