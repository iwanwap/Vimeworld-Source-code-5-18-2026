/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  UZ
 *  aSa
 *  eAa
 *  pqa
 *  uY
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockEndPortal
extends BlockContainer {
    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        Random e2;
        void c2;
        BlockEndPortal blockEndPortal = random2;
        Random random2 = random;
        BlockEndPortal a2 = blockEndPortal;
        void v1 = c2;
        double d3 = (float)v1.getX() + e2.nextFloat();
        double d4 = (float)v1.getY() + xSa.la;
        double d5 = (float)v1.getZ() + e2.nextFloat();
        double d6 = aSa.V;
        double d7 = aSa.V;
        double d8 = aSa.V;
        d2.J(UZ.SMOKE_NORMAL, d3, d4, d5, d6, d7, d8, new int[uSa.E]);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockEndPortal a2 = this;
        return uSa.E;
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        BlockEndPortal blockEndPortal = blockEndPortal2;
        BlockEndPortal blockEndPortal2 = vL2;
        BlockEndPortal a2 = blockEndPortal;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        Object d2 = dZ2;
        BlockEndPortal a2 = this;
        if (d2 == DZ.DOWN) {
            void b2;
            void c2;
            return super.J((I)c2, (XF)b2, (DZ)((Object)d2));
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        void d2;
        BlockEndPortal e2;
        BlockEndPortal blockEndPortal = blockEndPortal2;
        BlockEndPortal blockEndPortal2 = vL2;
        BlockEndPortal a2 = blockEndPortal;
        if (((vL)e2).ja == null && ((vL)e2).Aa == null && !d2.e) {
            e2.f(vRa.d);
        }
    }

    @Override
    public void J(I i2, XF xF2) {
        BlockEndPortal c22 = i2;
        BlockEndPortal b2 = this;
        float c22 = rRa.T;
        b2.J(JPa.N, JPa.N, JPa.N, pqa.r, c22, pqa.r);
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockEndPortal a2 = this;
        return new jY();
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockEndPortal a2 = this;
        return null;
    }

    public BlockEndPortal(Material material) {
        BlockEndPortal a2;
        Material b2 = material;
        BlockEndPortal blockEndPortal = a2 = this;
        super(b2);
        blockEndPortal.f(pqa.r);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockEndPortal a2 = this;
        return MapColor.blackColor;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }
}

