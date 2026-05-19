/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Ey
 *  Fpa
 *  Gg
 *  Gl
 *  HA
 *  JPa
 *  Mda
 *  Mfa
 *  NTa
 *  Qsa
 *  Tz
 *  UZ
 *  Xz
 *  aSa
 *  asa
 *  bpa
 *  eAa
 *  ez
 *  hy
 *  pqa
 *  psa
 *  uY
 *  vL
 *  vRa
 *  xOa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockBrewingStand
extends BlockContainer {
    public static final PropertyBool[] HAS_BOTTLE;

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        Random e2;
        void c2;
        BlockBrewingStand blockBrewingStand = random2;
        Random random2 = random;
        BlockBrewingStand a2 = blockBrewingStand;
        void v1 = c2;
        double d3 = (float)v1.getX() + Xpa.R + e2.nextFloat() * psa.N;
        double d4 = (float)v1.getY() + ZSa.q + e2.nextFloat() * bpa.K;
        double d5 = (float)v1.getZ() + Xpa.R + e2.nextFloat() * psa.N;
        d2.J(UZ.SMOKE_NORMAL, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockBrewingStand a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = HAS_BOTTLE[uSa.E];
        iPropertyArray[vRa.d] = HAS_BOTTLE[vRa.d];
        iPropertyArray[uqa.g] = HAS_BOTTLE[uqa.g];
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        BlockBrewingStand g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        BlockBrewingStand a2;
        BlockBrewingStand blockBrewingStand = blockBrewingStand2;
        BlockBrewingStand blockBrewingStand2 = vL2;
        BlockBrewingStand blockBrewingStand3 = a2 = blockBrewingStand;
        BlockBrewingStand blockBrewingStand4 = a2;
        blockBrewingStand4.J(asa.t, JPa.N, asa.t, NTa.c, xOa.B, NTa.c);
        super.J((Gg)f2, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)g2);
        blockBrewingStand3.f();
        super.J((Gg)f2, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)g2);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockBrewingStand a2 = this;
        return Gea.ub;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF2;
        BlockBrewingStand b2 = this;
        uY uY2 = c2.J((XF)((Object)d2));
        if (uY2 instanceof Xz) {
            Mfa.J((Gg)c2, (XF)((Object)d2), (HA)((Xz)uY2));
        }
        super.l((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        int b2;
        BlockBrewingStand blockBrewingStand = this;
        int n2 = uSa.E;
        int n3 = b2 = uSa.E;
        while (n3 < yRa.d) {
            void a2;
            if (a2.J(HAS_BOTTLE[b2]).booleanValue()) {
                n2 |= vRa.d << b2;
            }
            n3 = ++b2;
        }
        return n2;
    }

    public BlockBrewingStand() {
        BlockBrewingStand a2;
        BlockBrewingStand blockBrewingStand = a2;
        super(Material.iron);
        blockBrewingStand.J(blockBrewingStand.blockState.J().J(HAS_BOTTLE[uSa.E], uSa.E != 0).J(HAS_BOTTLE[vRa.d], uSa.E != 0).J(HAS_BOTTLE[uqa.g], uSa.E != 0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(int n2) {
        int b2;
        BlockBrewingStand blockBrewingStand = this;
        IBlockState iBlockState = blockBrewingStand.J();
        int n3 = b2 = uSa.E;
        while (n3 < yRa.d) {
            void a2;
            iBlockState = iBlockState.J(HAS_BOTTLE[b2], ((a2 & vRa.d << b2) > 0 ? vRa.d : uSa.E) != 0);
            n3 = ++b2;
        }
        return iBlockState;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockBrewingStand a2 = this;
        return new Xz();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockBrewingStand i2 = gg2;
        BlockBrewingStand h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = i2.J((XF)g2)) instanceof Xz) {
            void e2;
            e2.J((HA)((Xz)i2));
            e2.J(Tz.n);
        }
        return vRa.d != 0;
    }

    @Override
    public void f() {
        BlockBrewingStand a2;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, Mqa.N, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void d2;
        void a2;
        BlockBrewingStand f2 = gg2;
        BlockBrewingStand e2 = this;
        if (a2.l() && (f2 = f2.J((XF)d2)) instanceof Xz) {
            ((Xz)f2).J(a2.J());
        }
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
    public String f() {
        return Ey.f((String)KPa.q);
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    static {
        PropertyBool[] propertyBoolArray = new PropertyBool[yRa.d];
        propertyBoolArray[uSa.E] = PropertyBool.J(Qsa.Fa);
        propertyBoolArray[vRa.d] = PropertyBool.J(xua.d);
        propertyBoolArray[uqa.g] = PropertyBool.J(Fpa.x);
        HAS_BOTTLE = propertyBoolArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockBrewingStand a2 = this;
        return Ega.J((uY)b2.J((XF)((Object)c2)));
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockBrewingStand a2 = this;
        return Gea.ub;
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }
}

