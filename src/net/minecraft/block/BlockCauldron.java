/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Mda
 *  Oz
 *  Tfa
 *  Tz
 *  VEa
 *  Yra
 *  bFa
 *  eAa
 *  hra
 *  jFa
 *  lqa
 *  ofa
 *  pqa
 *  tZ
 *  vL
 *  vRa
 *  wPa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockCauldron
extends Block {
    public static final PropertyInteger LEVEL = PropertyInteger.J(hra.x, uSa.E, yRa.d);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        BlockCauldron f2;
        BlockCauldron g22 = gg2;
        BlockCauldron blockCauldron = f2 = this;
        BlockCauldron blockCauldron2 = f2;
        BlockCauldron blockCauldron3 = f2;
        BlockCauldron blockCauldron4 = g22;
        BlockCauldron blockCauldron5 = f2;
        blockCauldron5.J(JPa.N, JPa.N, JPa.N, pqa.r, wPa.F, pqa.r);
        super.J((Gg)g22, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        float g22 = Mqa.N;
        blockCauldron5.J(JPa.N, JPa.N, JPa.N, g22, pqa.r, pqa.r);
        super.J((Gg)blockCauldron4, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockCauldron3.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, g22);
        super.J((Gg)blockCauldron4, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockCauldron2.J(pqa.r - g22, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        super.J((Gg)g22, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockCauldron.J(JPa.N, JPa.N, pqa.r - g22, pqa.r, pqa.r, pqa.r);
        super.J((Gg)g22, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockCauldron.f();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockCauldron a2 = this;
        return b2.J((XF)((Object)c2)).J(LEVEL);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx, DZ dZ, float f2, float f3, float f4) {
        VEa a22;
        void g;
        void f5;
        Sx i2;
        void h;
        BlockCauldron blockCauldron = sx2;
        Sx sx2 = sx;
        BlockCauldron e2 = blockCauldron;
        if (h.e) {
            return vRa.d != 0;
        }
        Mda d2 = i2.K.f();
        if (d2 == null) {
            return vRa.d != 0;
        }
        int c2 = f5.J(LEVEL);
        eAa b2 = d2.J();
        if (b2 == Gea.Ba) {
            if (c2 < yRa.d) {
                if (!i2.h.f()) {
                    Sx sx3 = i2;
                    sx3.K.J(sx3.K.J, new Mda(Gea.Ca));
                }
                i2.J(Tz.E);
                e2.f((Gg)h, (XF)g, (IBlockState)f5, yRa.d);
            }
            return vRa.d != 0;
        }
        if (b2 == Gea.J) {
            if (c2 > 0) {
                if (!i2.h.f()) {
                    Sx sx4;
                    Mda a22 = new Mda((eAa)Gea.aa, vRa.d, uSa.E);
                    if (!i2.K.f(a22)) {
                        sx4 = i2;
                        void v3 = h;
                        void v4 = h;
                        v4.f((vL)new jFa((Gg)v4, (double)g.getX() + kTa.B, (double)g.getY() + Bta.c, (double)g.getZ() + kTa.B, a22));
                    } else {
                        if (i2 instanceof bFa) {
                            ((bFa)i2).J(i2.x);
                        }
                        sx4 = i2;
                    }
                    sx4.J(Tz.F);
                    Mda mda2 = d2;
                    mda2.E -= vRa.d;
                    if (mda2.E <= 0) {
                        Sx sx5 = i2;
                        sx5.K.J(sx5.K.J, (Mda)null);
                    }
                }
                e2.f((Gg)h, (XF)g, (IBlockState)f5, c2 - vRa.d);
            }
            return vRa.d != 0;
        }
        if (c2 > 0 && b2 instanceof VEa && (a22 = (VEa)b2).J() == Tfa.LEATHER && a22.C(d2)) {
            a22.J(d2);
            e2.f((Gg)h, (XF)g, (IBlockState)f5, c2 - vRa.d);
            i2.J(Tz.b);
            return vRa.d != 0;
        }
        if (c2 > 0 && b2 instanceof ofa && tZ.f((Mda)d2) > 0) {
            Sx sx6;
            Mda mda3 = d2;
            Mda a22 = mda3.J();
            a22.E = vRa.d;
            tZ.f((Mda)a22);
            if (mda3.E <= vRa.d && !i2.h.f()) {
                Sx sx7 = i2;
                sx6 = sx7;
                i2.K.J(sx7.K.J, a22);
            } else {
                Sx sx8;
                if (!i2.K.f(a22)) {
                    sx8 = i2;
                    void v11 = h;
                    v11.f((vL)new jFa((Gg)v11, (double)g.getX() + kTa.B, (double)g.getY() + Bta.c, (double)g.getZ() + kTa.B, a22));
                } else {
                    if (i2 instanceof bFa) {
                        ((bFa)i2).J(i2.x);
                    }
                    sx8 = i2;
                }
                sx8.J(Tz.D);
                if (!i2.h.f()) {
                    d2.E -= vRa.d;
                }
                sx6 = i2;
            }
            if (!sx6.h.f()) {
                e2.f((Gg)h, (XF)g, (IBlockState)f5, c2 - vRa.d);
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockCauldron a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = LEVEL;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF) {
        void a2;
        IBlockState iBlockState;
        BlockCauldron c2 = gg2;
        BlockCauldron b2 = this;
        if (((Gg)c2).v.nextInt(kTa.j) == vRa.d && (iBlockState = c2.J((XF)a2)).J(LEVEL) < yRa.d) {
            c2.J((XF)a2, iBlockState.J(LEVEL), uqa.g);
        }
    }

    @Override
    public void f() {
        BlockCauldron a2;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockCauldron a2 = this;
        return Gea.Ab;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    public BlockCauldron() {
        BlockCauldron a2;
        BlockCauldron blockCauldron = a2;
        super(Material.iron, MapColor.stoneColor);
        blockCauldron.J(blockCauldron.blockState.J().J(LEVEL, uSa.E));
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockCauldron a2 = this;
        return Gea.Ab;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCauldron a2 = this;
        return b2.J(LEVEL);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, vL vL2) {
        void a2;
        void d2;
        void c2;
        void b2;
        BlockCauldron blockCauldron = this;
        int e2 = b2.J(LEVEL);
        float f2 = (float)c2.getY() + (lqa.ga + (float)(yRa.d * e2)) / Yra.i;
        if (!d2.e && a2.o() && e2 > 0 && a2.J().j <= (double)f2) {
            a2.I();
            blockCauldron.f((Gg)d2, (XF)c2, (IBlockState)b2, e2 - vRa.d);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, XF xF, IBlockState iBlockState, int n2) {
        void a2;
        void b2;
        void d2;
        Object e2 = xF;
        BlockCauldron c2 = this;
        d2.J((XF)((Object)e2), b2.J(LEVEL, Oz.f((int)a2, (int)uSa.E, (int)yRa.d)), uqa.g);
        d2.J((XF)((Object)e2), (Block)c2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCauldron a2 = this;
        return a2.J().J(LEVEL, b2);
    }
}

