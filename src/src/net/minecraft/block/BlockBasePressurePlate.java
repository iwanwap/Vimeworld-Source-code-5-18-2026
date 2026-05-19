/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  bpa
 *  kqa
 *  pqa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockBasePressurePlate
extends Block {
    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public int J(Gg gg2) {
        BlockBasePressurePlate b2 = gg2;
        BlockBasePressurePlate a2 = this;
        return kTa.j;
    }

    @Override
    public boolean J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockBasePressurePlate a2 = this;
        return vRa.d != 0;
    }

    public xy J(XF xF2) {
        Object b2 = xF2;
        BlockBasePressurePlate a2 = this;
        return new xy((double)((float)b2.getX() + Mqa.N), (double)b2.getY(), (double)((float)b2.getZ() + Mqa.N), (double)((float)(b2.getX() + vRa.d) - Mqa.N), (double)b2.getY() + VPa.W, (double)((float)(b2.getZ() + vRa.d) - Mqa.N));
    }

    @Override
    public boolean f() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockBasePressurePlate a2 = this;
        void v0 = b2;
        v0.f(c2, (Block)a2);
        v0.f(c2.down(), (Block)a2);
    }

    public abstract int l(Gg var1, XF var2);

    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        IBlockState e2 = iBlockState;
        BlockBasePressurePlate b2 = this;
        return b2.d(e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        BlockBasePressurePlate c2 = this;
        Object e2 = xF2;
        if (!c2.l((Gg)d2, ((XF)((Object)e2)).down())) {
            void b2;
            void v0 = d2;
            c2.J((Gg)v0, (XF)((Object)e2), (IBlockState)b2, uSa.E);
            v0.G((XF)((Object)e2));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockBasePressurePlate a2 = this;
        return a2.l((Gg)b2, c2.down());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object a2 = this;
        IBlockState d2 = iBlockState;
        if (((BlockBasePressurePlate)a2).d(d2) > 0) {
            ((BlockBasePressurePlate)a2).f((Gg)c2, (XF)b2);
        }
        super.l((Gg)c2, (XF)b2, d2);
    }

    public abstract int d(IBlockState var1);

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockBasePressurePlate a2 = this;
        if (Gg.J((I)b2, (XF)((Object)c2)) || b2.J((XF)((Object)c2)).J() instanceof BlockFence) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        void b2;
        int e2;
        void d2;
        BlockBasePressurePlate blockBasePressurePlate = blockBasePressurePlate2;
        BlockBasePressurePlate blockBasePressurePlate2 = vL2;
        BlockBasePressurePlate a2 = blockBasePressurePlate;
        if (!d2.e && (e2 = a2.d((IBlockState)b2)) == 0) {
            void c2;
            a2.f((Gg)d2, (XF)c2, (IBlockState)b2, e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public BlockBasePressurePlate(Material material, MapColor mapColor) {
        void b2;
        BlockBasePressurePlate a2;
        MapColor c2 = mapColor;
        BlockBasePressurePlate blockBasePressurePlate = a2 = this;
        super((Material)b2, c2);
        blockBasePressurePlate.J(yGa.I);
        a2.J(vRa.d != 0);
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockBasePressurePlate a2 = this;
        return null;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    public void f(IBlockState iBlockState) {
        Object a2 = this;
        IBlockState b22 = iBlockState;
        int b22 = ((BlockBasePressurePlate)a2).d(b22) > 0 ? vRa.d : uSa.E;
        if (b22 != 0) {
            ((Block)a2).J(rRa.T, JPa.N, rRa.T, pqa.Ha, ZSa.w, pqa.Ha);
            return;
        }
        ((Block)a2).J(rRa.T, JPa.N, rRa.T, pqa.Ha, rRa.T, pqa.Ha);
    }

    public BlockBasePressurePlate(Material material) {
        Material b2 = material;
        BlockBasePressurePlate a2 = this;
        Object object = b2;
        a2((Material)object, ((Material)object).J());
    }

    @Override
    public void f() {
        BlockBasePressurePlate a2;
        a2.J(JPa.N, MRa.K, JPa.N, pqa.r, Jpa.y, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockBasePressurePlate a2 = this;
        a2.f(b2.J((XF)((Object)c2)));
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, int n2) {
        int n3;
        int n4;
        void a2;
        void d2;
        Object e2 = xF2;
        BlockBasePressurePlate c2 = this;
        int n5 = c2.l((Gg)d2, (XF)((Object)e2));
        int n6 = a2 > 0 ? vRa.d : uSa.E;
        int n7 = n4 = n5 > 0 ? vRa.d : uSa.E;
        if (a2 != n5) {
            IBlockState b2;
            b2 = c2.J(b2, n5);
            d2.J((XF)((Object)e2), b2, uqa.g);
            void v1 = d2;
            c2.f((Gg)v1, (XF)((Object)e2));
            v1.J((XF)((Object)e2), (XF)((Object)e2));
        }
        if (n4 == 0 && n6 != 0) {
            n3 = n4;
            d2.J((double)e2.getX() + kTa.B, (double)e2.getY() + tpa.k, (double)e2.getZ() + kTa.B, kqa.B, bpa.K, MQa.L);
        } else {
            if (n4 != 0 && n6 == 0) {
                d2.J((double)e2.getX() + kTa.B, (double)e2.getY() + tpa.k, (double)e2.getZ() + kTa.B, kqa.B, bpa.K, Ora.D);
            }
            n3 = n4;
        }
        if (n3 != 0) {
            BlockBasePressurePlate blockBasePressurePlate = c2;
            d2.J((XF)((Object)e2), (Block)blockBasePressurePlate, blockBasePressurePlate.J((Gg)d2));
        }
    }

    public abstract IBlockState J(IBlockState var1, int var2);

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void b2;
        int e2;
        void d2;
        BlockBasePressurePlate blockBasePressurePlate = random2;
        Random random2 = random;
        BlockBasePressurePlate a2 = blockBasePressurePlate;
        if (!d2.e && (e2 = a2.d((IBlockState)b2)) > 0) {
            void c2;
            a2.f((Gg)d2, (XF)c2, (IBlockState)b2, e2);
        }
    }

    @Override
    public int l() {
        return vRa.d;
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        Object e2;
        BlockBasePressurePlate blockBasePressurePlate = object;
        Object object = dZ2;
        BlockBasePressurePlate a2 = blockBasePressurePlate;
        if (e2 == DZ.UP) {
            void b2;
            return a2.d((IBlockState)b2);
        }
        return uSa.E;
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockBasePressurePlate blockBasePressurePlate = random2;
        Random random2 = random;
        BlockBasePressurePlate a2 = blockBasePressurePlate;
    }
}

