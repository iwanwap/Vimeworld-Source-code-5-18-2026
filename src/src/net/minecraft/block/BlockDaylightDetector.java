/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Iy
 *  JPa
 *  Mda
 *  Mz
 *  Oz
 *  QFa
 *  Ypa
 *  aQa
 *  eAa
 *  hy
 *  pqa
 *  psa
 *  pua
 *  uY
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockDaylightDetector
extends BlockContainer {
    private final boolean inverted;
    public static final PropertyInteger POWER = PropertyInteger.J(APa.S, uSa.E, Ypa.A);

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f5;
        void g2;
        void e2;
        BlockDaylightDetector i2 = gg2;
        BlockDaylightDetector h2 = this;
        if (e2.w()) {
            if (((Gg)i2).e) {
                return vRa.d != 0;
            }
            if (h2.inverted) {
                i2.J((XF)g2, QFa.Bd.J().J(POWER, f5.J(POWER)), AQa.P);
                QFa.Bd.f((Gg)i2, (XF)g2);
            } else {
                i2.J((XF)g2, QFa.Ub.J().J(POWER, f5.J(POWER)), AQa.P);
                QFa.Ub.f((Gg)i2, (XF)g2);
            }
            return vRa.d != 0;
        }
        return super.J((Gg)i2, (XF)g2, (IBlockState)f5, (Sx)e2, (DZ)d2, (float)c2, (float)b2, (float)a2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockDaylightDetector a2 = this;
        return a2.J().J(POWER, b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        List<Mda> d2 = list;
        BlockDaylightDetector a2 = this;
        if (!a2.inverted) {
            void b2;
            void c2;
            super.J((eAa)c2, (yGa)b2, d2);
        }
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockDaylightDetector a2 = this;
        return eAa.J((Block)QFa.Bd);
    }

    @Override
    public BlockState J() {
        BlockDaylightDetector a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = POWER;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public void J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockDaylightDetector a2 = this;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, MRa.K, pqa.r);
    }

    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        IBlockState e2 = iBlockState;
        BlockDaylightDetector b2 = this;
        return e2.J(POWER);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockDaylightDetector a2 = this;
        return eAa.J((Block)QFa.Bd);
    }

    public BlockDaylightDetector(boolean bl) {
        BlockDaylightDetector a2;
        boolean b2 = bl;
        BlockDaylightDetector blockDaylightDetector = a2 = this;
        BlockDaylightDetector blockDaylightDetector2 = a2;
        super(Material.wood);
        blockDaylightDetector.inverted = b2;
        blockDaylightDetector.J(blockDaylightDetector2.blockState.J().J(POWER, uSa.E));
        blockDaylightDetector.J(JPa.N, JPa.N, JPa.N, pqa.r, MRa.K, pqa.r);
        blockDaylightDetector.J(yGa.I);
        a2.J(psa.N);
        a2.J(soundTypeWood);
        a2.f(aQa.z);
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, XF xF2) {
        void b2;
        BlockDaylightDetector blockDaylightDetector = this;
        if (!b2.F.f()) {
            float f2;
            void a2;
            void v0 = b2;
            IBlockState iBlockState = v0.J((XF)a2);
            void v1 = b2;
            int c2 = v0.J(Mz.SKY, (XF)a2) - v1.J();
            float f3 = v1.d(pqa.r);
            float f4 = f2 < pua.j ? JPa.N : Ypa.Ha;
            float f5 = f3;
            f3 = f5 + (f4 - f5) * psa.N;
            c2 = Math.round((float)c2 * Oz.C((float)f3));
            c2 = Oz.f((int)c2, (int)uSa.E, (int)Ypa.A);
            if (blockDaylightDetector.inverted) {
                c2 = Ypa.A - c2;
            }
            if (iBlockState.J(POWER) != c2) {
                b2.J((XF)a2, iBlockState.J(POWER, c2), yRa.d);
            }
        }
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockDaylightDetector a2 = this;
        return b2.J(POWER);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockDaylightDetector a2 = this;
        return new Iy();
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }
}

