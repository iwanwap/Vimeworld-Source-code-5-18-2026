/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  Mda
 *  NCa
 *  NQa
 *  Waa
 *  Ypa
 *  bua
 *  eAa
 *  pqa
 *  tZ
 *  uOa
 *  uY
 *  vRa
 *  waa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockBanner
extends BlockContainer {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
    public static final PropertyInteger ROTATION = PropertyInteger.J(NQa.ja, uSa.E, Ypa.A);

    @Override
    public boolean f() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Sx sx2, XF xF, IBlockState iBlockState, uY uY2) {
        void b2;
        void d2;
        void c2;
        void e2;
        BlockBanner f2;
        BlockBanner blockBanner = blockBanner2;
        BlockBanner blockBanner2 = uY2;
        BlockBanner a2 = blockBanner;
        if (f2 instanceof tZ) {
            tZ tZ2 = (tZ)f2;
            f2 = new Mda(Gea.gC, vRa.d, ((tZ)f2).J());
            Waa waa2 = new Waa();
            tZ.J((Waa)waa2, (int)tZ2.J(), (waa)tZ2.J());
            f2.J(uua.M, (NCa)waa2);
            BlockBanner.J((Gg)e2, (XF)c2, (Mda)f2);
            return;
        }
        super.J((Gg)e2, (Sx)d2, (XF)c2, (IBlockState)b2, (uY)null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF) {
        void b2;
        BlockBanner a2;
        Object c2 = xF;
        BlockBanner blockBanner = a2 = this;
        blockBanner.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockBanner a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF) {
        void b2;
        BlockBanner a2 = this;
        Object c2 = xF;
        if (!a2.l((Gg)b2, (XF)((Object)c2)) && super.J((Gg)b2, (XF)((Object)c2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, float f2, int n2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        BlockBanner blockBanner = this;
        uY uY2 = e2.J((XF)d2);
        if (uY2 instanceof tZ) {
            BlockBanner f3;
            Mda mda2 = new Mda(Gea.gC, vRa.d, ((tZ)uY2).J());
            BlockBanner blockBanner2 = f3 = new Waa();
            uY2.J((Waa)blockBanner2);
            BlockBanner blockBanner3 = f3;
            blockBanner3.J(rRa.X);
            blockBanner3.J(uOa.Ja);
            blockBanner2.J(oua.v);
            blockBanner2.J(QTa.O);
            mda2.J(uua.M, (NCa)f3);
            BlockBanner.J((Gg)e2, (XF)d2, mda2);
            return;
        }
        super.J((Gg)e2, (XF)d2, (IBlockState)c2, (float)b2, (int)a2);
    }

    @Override
    public boolean J(I i2, XF xF) {
        Object c2 = xF;
        BlockBanner a2 = this;
        return vRa.d != 0;
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockBanner a2 = this;
        return Gea.gC;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockBanner a2 = this;
        return new tZ();
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public String f() {
        return Ey.f((String)bua.q);
    }

    public BlockBanner() {
        BlockBanner blockBanner;
        BlockBanner blockBanner2 = blockBanner = this;
        super(Material.wood);
        float a2 = rta.o;
        float f2 = pqa.r;
        blockBanner2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, f2, MQa.L + a2);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockBanner a2 = this;
        return Gea.gC;
    }
}

