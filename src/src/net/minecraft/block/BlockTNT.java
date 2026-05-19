/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  MQa
 *  Uta
 *  eAa
 *  jea
 *  pqa
 *  vL
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockTNT
extends Block {
    public static final PropertyBool EXPLODE = PropertyBool.J(Uta.t);

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2) {
        void b2;
        void d2;
        Object e2 = xF2;
        BlockTNT c2 = this;
        if (!d2.e && b2.J(EXPLODE).booleanValue()) {
            void a2;
            e2 = new vFa((Gg)d2, (float)e2.getX() + MQa.L, e2.getY(), (float)e2.getZ() + MQa.L, (Gl)a2);
            d2.f((vL)e2);
            d2.J((vL)e2, Jpa.m, pqa.r, pqa.r);
        }
    }

    public BlockTNT() {
        BlockTNT a2;
        BlockTNT blockTNT = a2;
        super(Material.tnt);
        blockTNT.J(blockTNT.blockState.J().J(EXPLODE, uSa.E != 0));
        blockTNT.J(yGa.I);
    }

    @Override
    public boolean J(NZ nZ2) {
        NZ b2 = nZ2;
        BlockTNT a2 = this;
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockTNT a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = EXPLODE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockTNT a2 = this;
        if (b2.J(EXPLODE).booleanValue()) {
            return vRa.d;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        Object e2 = xF2;
        BlockTNT c2 = this;
        if (d2.k((XF)((Object)e2))) {
            void b2;
            void v0 = d2;
            c2.J((Gg)v0, (XF)((Object)e2), b2.J(EXPLODE, vRa.d != 0));
            v0.G((XF)((Object)e2));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockTNT a2 = this;
        a2.J((Gg)c2, (XF)b2, d2, (Gl)null);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockTNT a2 = this;
        return a2.J().J(EXPLODE, ((b2 & vRa.d) > 0 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, NZ nZ2) {
        void c2;
        Object d2 = xF2;
        BlockTNT b2 = this;
        if (!c2.e) {
            void a2;
            d2 = new vFa((Gg)c2, (float)d2.getX() + MQa.L, d2.getY(), (float)d2.getZ() + MQa.L, a2.J());
            void v0 = c2;
            ((vFa)((Object)d2)).A = v0.v.nextInt(((vFa)((Object)d2)).A / AQa.P) + ((vFa)((Object)d2)).A / Yqa.i;
            v0.f((vL)d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF2;
        BlockTNT b2 = this;
        void v0 = c2;
        super.f((Gg)v0, (XF)((Object)d2), (IBlockState)a2);
        if (v0.k((XF)((Object)d2))) {
            void v1 = c2;
            b2.J((Gg)v1, (XF)((Object)d2), a2.J(EXPLODE, vRa.d != 0));
            v1.G((XF)((Object)d2));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        void a2;
        void d2;
        Object e2 = iBlockState;
        BlockTNT b2 = this;
        if (!d2.e && a2 instanceof jea && (e2 = (jea)a2).o()) {
            void c2;
            void v0 = d2;
            b2.J((Gg)v0, (XF)c2, v0.J((XF)c2).J(EXPLODE, vRa.d != 0), ((jea)e2).f instanceof Gl ? (Gl)((jea)e2).f : null);
            d2.G((XF)c2);
        }
    }

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
        void h2;
        eAa eAa2;
        Sx i2;
        BlockTNT blockTNT = sx3;
        Sx sx3 = sx2;
        BlockTNT e2 = blockTNT;
        if (i2.f() != null && ((eAa2 = i2.f().J()) == Gea.S || eAa2 == Gea.j)) {
            e2.J((Gg)h2, (XF)g2, f5.J(EXPLODE, vRa.d != 0), (Gl)i2);
            h2.G((XF)g2);
            if (eAa2 == Gea.S) {
                i2.f().J(vRa.d, (Gl)i2);
            } else if (!i2.h.f()) {
                i2.f().E -= vRa.d;
            }
            return vRa.d != 0;
        }
        return super.J((Gg)h2, (XF)g2, (IBlockState)f5, i2, (DZ)d2, (float)c2, (float)b2, (float)a2);
    }
}

