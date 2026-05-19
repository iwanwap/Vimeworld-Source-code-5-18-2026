/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  Mda
 *  Mz
 *  QFa
 *  Qsa
 *  Tz
 *  XTa
 *  eAa
 *  pPa
 *  pqa
 *  uY
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
public final class BlockSnow
extends Block {
    public static final PropertyInteger LAYERS = PropertyInteger.J(Wqa.Q, vRa.d, Yqa.i);

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockSnow a2 = this;
        if (b2.J((XF)((Object)c2)).J(LAYERS) < tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    public void J(int n2) {
        int b2 = n2;
        BlockSnow a2 = this;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, (float)b2 / Qsa.k, pqa.r);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockSnow a2 = this;
        return a2.J().J(LAYERS, (b2 & XTa.W) + vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        Object e2 = xF2;
        BlockSnow c2 = this;
        if (d2.J(Mz.BLOCK, (XF)((Object)e2)) > pPa.f) {
            void v0 = d2;
            Object object = e2;
            c2.J((Gg)v0, (XF)((Object)object), d2.J((XF)((Object)object)), uSa.E);
            v0.G((XF)((Object)e2));
        }
    }

    @Override
    public BlockState J() {
        BlockSnow a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = LAYERS;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockSnow a2 = this;
        return Gea.Pd;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        BlockSnow b2 = this;
        Object d2 = xF2;
        if (!b2.J((Gg)c2, (XF)((Object)d2))) {
            void a2;
            void v0 = c2;
            b2.J((Gg)v0, (XF)((Object)d2), (IBlockState)a2, uSa.E);
            v0.G((XF)((Object)d2));
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSnow a2 = this;
        return b2.J(LAYERS) - vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        Object d2 = dZ2;
        BlockSnow a2 = this;
        if (d2 == DZ.UP) {
            return vRa.d != 0;
        }
        return super.J((I)c2, (XF)b2, (DZ)((Object)d2));
    }

    @Override
    public boolean J(Gg gg2, XF xF2) {
        IBlockState b2;
        Object c2 = xF2;
        BlockSnow a2 = this;
        if ((c2 = (b2 = b2.J(((XF)((Object)c2)).down())).J()) != QFa.Ta && c2 != QFa.C) {
            if (((Block)c2).J() == Material.leaves) {
                return vRa.d != 0;
            }
            if (c2 == a2 && b2.J(LAYERS) >= XTa.W) {
                return vRa.d != 0;
            }
            if (((Block)c2).g() && ((Block)c2).blockMaterial.f()) {
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
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a22;
        Object d2 = xF2;
        BlockSnow b2 = this;
        int c2 = a22.J(LAYERS) - vRa.d;
        float a22 = Mqa.N;
        return new xy((double)d2.getX() + b2.minX, (double)d2.getY() + b2.minY, (double)d2.getZ() + b2.minZ, (double)d2.getX() + b2.maxX, (double)((float)d2.getY() + (float)c2 * a22), (double)d2.getZ() + b2.maxZ);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Sx sx2, XF xF2, IBlockState iBlockState, uY uY2) {
        void d2;
        void b2;
        void e2;
        Object f2 = xF2;
        BlockSnow c2 = this;
        BlockSnow.J((Gg)e2, (XF)((Object)f2), new Mda(Gea.Pd, b2.J(LAYERS) + vRa.d, uSa.E));
        e2.G((XF)((Object)f2));
        d2.J(Tz.a[Block.J(c2)]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockSnow b2 = this;
        b2.J((Gg)d2, (XF)c2, e2);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        Object c2 = i2;
        BlockSnow b2 = this;
        c2 = c2.J((XF)a2);
        b2.J(c2.J(LAYERS));
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockSnow a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockSnow a2 = this;
        if (b2.J((XF)((Object)c2)).J(LAYERS) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void f() {
        BlockSnow a2;
        a2.J(uSa.E);
    }

    public BlockSnow() {
        BlockSnow a2;
        BlockSnow blockSnow = a2;
        super(Material.snow);
        blockSnow.J(blockSnow.blockState.J().J(LAYERS, vRa.d));
        blockSnow.J(JPa.N, JPa.N, JPa.N, pqa.r, Mqa.N, pqa.r);
        blockSnow.J(vRa.d != 0);
        a2.J(yGa.a);
        a2.f();
    }
}

