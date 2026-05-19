/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  JPa
 *  Ypa
 *  eAa
 *  mra
 *  pqa
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
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockEndPortalFrame
extends Block {
    public static final PropertyBool EYE;
    public static final PropertyDirection FACING;

    public BlockEndPortalFrame() {
        BlockEndPortalFrame a2;
        BlockEndPortalFrame blockEndPortalFrame = a2;
        super(Material.rock, MapColor.greenColor);
        blockEndPortalFrame.J(blockEndPortalFrame.blockState.J().J(FACING, DZ.NORTH).J(EYE, uSa.E != 0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockEndPortalFrame a2 = this;
        if (b2.J((XF)((Object)c2)).J(EYE).booleanValue()) {
            return Ypa.A;
        }
        return uSa.E;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockEndPortalFrame a2 = this;
        return a2.J().J(EYE, ((b2 & AQa.P) != 0 ? vRa.d : uSa.E) != 0).J(FACING, DZ.getHorizontal(b2 & yRa.d));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockEndPortalFrame blockEndPortalFrame = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getHorizontalIndex();
        if (a2.J(EYE).booleanValue()) {
            b2 |= AQa.P;
        }
        return b2;
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    static {
        FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
        EYE = PropertyBool.J(mra.O);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        Object g2 = xF;
        BlockEndPortalFrame e2 = this;
        void v0 = f2;
        e2.J(JPa.N, JPa.N, JPa.N, pqa.r, rta.R, pqa.r);
        super.J((Gg)v0, (XF)((Object)g2), (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        if (v0.J((XF)((Object)g2)).J(EYE).booleanValue()) {
            BlockEndPortalFrame blockEndPortalFrame = e2;
            blockEndPortalFrame.J(wPa.F, rta.R, wPa.F, sOa.Ka, pqa.r, sOa.Ka);
            super.J((Gg)f2, (XF)((Object)g2), (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        }
        e2.f();
    }

    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockEndPortalFrame i2;
        BlockEndPortalFrame blockEndPortalFrame = blockEndPortalFrame2;
        BlockEndPortalFrame blockEndPortalFrame2 = gl2;
        BlockEndPortalFrame a2 = blockEndPortalFrame;
        return a2.J().J(FACING, i2.J().getOpposite()).J(EYE, uSa.E != 0);
    }

    @Override
    public void f() {
        BlockEndPortalFrame a2;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, rta.R, pqa.r);
    }

    @Override
    public BlockState J() {
        BlockEndPortalFrame a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = EYE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockEndPortalFrame a2 = this;
        return null;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

