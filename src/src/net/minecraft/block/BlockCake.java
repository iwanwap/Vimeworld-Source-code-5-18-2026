/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  Tz
 *  XTa
 *  Yra
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
public final class BlockCake
extends Block {
    public static final PropertyInteger BITES = PropertyInteger.J(aua.Da, uSa.E, uua.p);

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockCake a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        Object i2;
        void f5;
        void g2;
        void h2;
        BlockCake blockCake = object;
        Object object = sx2;
        BlockCake e2 = blockCake;
        e2.f((Gg)h2, (XF)g2, (IBlockState)f5, (Sx)((Object)i2));
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        BlockCake c2 = this;
        Object e2 = xF2;
        if (!c2.l((Gg)d2, (XF)((Object)e2))) {
            d2.G((XF)((Object)e2));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void a22;
        void b22;
        BlockCake blockCake = this;
        float c2 = rRa.T;
        float b22 = (float)(vRa.d + b22.J((XF)a22).J(BITES) * uqa.g) / Yra.i;
        float a22 = MQa.L;
        float f2 = c2;
        blockCake.J(b22, JPa.N, f2, pqa.r - f2, a22, pqa.r - c2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockCake a2 = this;
        return b2.J(c2.down()).J().J().i();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCake a2 = this;
        return b2.J(BITES);
    }

    public BlockCake() {
        BlockCake a2;
        BlockCake blockCake = a2;
        super(Material.cake);
        blockCake.J(blockCake.blockState.J().J(BITES, uSa.E));
        blockCake.J(vRa.d != 0);
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCake a2 = this;
        return a2.J().J(BITES, b2);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockCake a2 = this;
        return (XTa.W - b2.J((XF)((Object)c2)).J(BITES)) * uqa.g;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockCake a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2) {
        Sx e22;
        BlockCake blockCake = sx3;
        Sx sx3 = sx2;
        BlockCake a2 = blockCake;
        if (e22.J(uSa.E != 0)) {
            void c2;
            void d2;
            void b2;
            Sx sx4 = e22;
            sx4.J(Tz.f);
            sx4.J().J(uqa.g, Nra.e);
            int e22 = b2.J(BITES);
            if (e22 < uua.p) {
                d2.J((XF)c2, b2.J(BITES, e22 + vRa.d), yRa.d);
                return;
            }
            d2.G((XF)c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        BlockCake a2 = this;
        Object c2 = xF2;
        if (super.J((Gg)b2, (XF)((Object)c2))) {
            return a2.l((Gg)b2, (XF)((Object)c2));
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
        BlockCake b2 = this;
        float c2 = rRa.T;
        float a22 = (float)(vRa.d + a22.J(BITES) * uqa.g) / Yra.i;
        float f2 = MQa.L;
        return new xy((double)((float)d2.getX() + a22), (double)d2.getY(), (double)((float)d2.getZ() + c2), (double)((float)(d2.getX() + vRa.d) - c2), (double)((float)d2.getY() + f2), (double)((float)(d2.getZ() + vRa.d) - c2));
    }

    @Override
    public BlockState J() {
        BlockCake a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = BITES;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockCake a2 = this;
        return Gea.Da;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockCake a2 = this;
        void v0 = b2;
        return a2.J((Gg)v0, (XF)((Object)c2), v0.J((XF)((Object)c2)));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, Sx sx2) {
        void a2;
        void c2;
        Object d2 = xF2;
        BlockCake b2 = this;
        void v0 = c2;
        b2.f((Gg)v0, (XF)((Object)d2), v0.J((XF)((Object)d2)), (Sx)a2);
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public void f() {
        BlockCake blockCake = this;
        float a2 = rRa.T;
        float f2 = MQa.L;
        float f3 = a2;
        blockCake.J(f3, JPa.N, f3, pqa.r - a2, f2, pqa.r - a2);
    }
}

