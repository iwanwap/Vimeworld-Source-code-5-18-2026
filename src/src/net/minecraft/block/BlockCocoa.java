/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  Mda
 *  QFa
 *  Qsa
 *  Ypa
 *  Yra
 *  eAa
 *  ez
 *  iea
 *  kta
 *  pqa
 *  qta
 *  vRa
 *  wOa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa$1;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockCocoa
extends BlockDirectional
implements IGrowable {
    public static final PropertyInteger AGE = PropertyInteger.J(tSa.v, uSa.E, uqa.g);

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        int a2;
        void c2;
        void d2;
        Object b2 = this;
        IBlockState e2 = iBlockState;
        if (!((BlockCocoa)b2).J((Gg)d2, (XF)c2, e2)) {
            ((BlockCocoa)b2).C((Gg)d2, (XF)c2, e2);
            return;
        }
        if (d2.v.nextInt(tTa.h) == 0 && (a2 = e2.J(AGE).intValue()) < uqa.g) {
            d2.J((XF)c2, e2.J(AGE, a2 + vRa.d), uqa.g);
        }
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF) {
        void b2;
        BlockCocoa a2;
        Object c2 = xF;
        BlockCocoa blockCocoa = a2 = this;
        blockCocoa.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCocoa a2 = this;
        return a2.J().J(FACING, DZ.getHorizontal(b2)).J(AGE, (b2 & Ypa.A) >> uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, float f2, int n2) {
        IBlockState f222 = iBlockState;
        BlockCocoa c2 = this;
        int f222 = f222.J(AGE);
        int b2 = vRa.d;
        if (f222 >= uqa.g) {
            b2 = yRa.d;
        }
        int n3 = f222 = uSa.E;
        while (n3 < b2) {
            void d2;
            void e2;
            BlockCocoa.J((Gg)e2, (XF)d2, new Mda(Gea.Q, vRa.d, iea.BROWN.getDyeDamage()));
            n3 = ++f222;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        Object b2 = this;
        IBlockState e2 = iBlockState;
        if (!((BlockCocoa)b2).J((Gg)d2, (XF)c2, e2)) {
            ((BlockCocoa)b2).C((Gg)d2, (XF)c2, e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        IBlockState c2;
        Object d2 = xF;
        BlockCocoa b2 = this;
        if ((c2 = c2.J((XF)((Object)(d2 = ((XF)((Object)d2)).offset(a2.J(FACING)))))).J() == QFa.UA && c2.J(BlockPlanks.VARIANT) == BlockPlanks$EnumType.JUNGLE) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockCocoa a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = AGE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockCocoa a2 = this;
        return iea.BROWN.getDyeDamage();
    }

    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ, float f2, float f3, float f4, int n2, Gl gl2) {
        Object i2 = dZ;
        BlockCocoa f5 = this;
        if (!((DZ)((Object)i2)).getAxis().isHorizontal()) {
            i2 = DZ.NORTH;
        }
        return f5.J().J(FACING, ((DZ)((Object)i2)).getOpposite()).J(AGE, uSa.E);
    }

    public BlockCocoa() {
        BlockCocoa a2;
        BlockCocoa blockCocoa = a2;
        super(Material.plants);
        blockCocoa.J(blockCocoa.blockState.J().J(FACING, DZ.NORTH).J(AGE, uSa.E));
        blockCocoa.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockCocoa b2;
        Object d2 = xF;
        BlockCocoa blockCocoa = b2 = this;
        blockCocoa.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    @Override
    public boolean J(Gg gg2, Random random, XF xF, IBlockState iBlockState) {
        BlockCocoa blockCocoa = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockCocoa a2 = blockCocoa;
        return vRa.d != 0;
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockCocoa a2 = this;
        return Gea.Q;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(I i2, XF xF) {
        DZ a2;
        Object c22 = i2;
        BlockCocoa b2 = this;
        c22 = c22.J((XF)((Object)a2));
        a2 = c22.J(FACING);
        int c22 = c22.J(AGE);
        int n2 = AQa.P + c22 * uqa.g;
        c22 = tTa.h + c22 * uqa.g;
        float f2 = (float)n2 / kta.v;
        switch (BlockCocoa$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                b2.J((Qsa.k - f2) / Yra.i, (Fua.Y - (float)c22) / Yra.i, (qta.D - (float)n2) / Yra.i, (Qsa.k + f2) / Yra.i, wOa.w, pqa.Ha);
                return;
            }
            case 2: {
                b2.J((Qsa.k - f2) / Yra.i, (Fua.Y - (float)c22) / Yra.i, rRa.T, (Qsa.k + f2) / Yra.i, wOa.w, (pqa.r + (float)n2) / Yra.i);
                return;
            }
            case 3: {
                b2.J(rRa.T, (Fua.Y - (float)c22) / Yra.i, (Qsa.k - f2) / Yra.i, (pqa.r + (float)n2) / Yra.i, wOa.w, (Qsa.k + f2) / Yra.i);
                return;
            }
            case 4: {
                b2.J((qta.D - (float)n2) / Yra.i, (Fua.Y - (float)c22) / Yra.i, (Qsa.k - f2) / Yra.i, pqa.Ha, wOa.w, (Qsa.k + f2) / Yra.i);
                return;
            }
        }
    }

    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, boolean bl) {
        IBlockState e2 = iBlockState;
        BlockCocoa b2 = this;
        if (e2.J(AGE) < uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void c2;
        void d2;
        void e2;
        Object f2;
        BlockCocoa blockCocoa = object;
        Object object = gl2;
        BlockCocoa b2 = blockCocoa;
        f2 = DZ.fromAngle(((Gl)f2).X);
        e2.J((XF)d2, c2.J(FACING, f2), uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF;
        BlockCocoa b2 = this;
        c2.J((XF)((Object)d2), QFa.HF.J(), yRa.d);
        b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF, IBlockState iBlockState) {
        void b2;
        void d2;
        IBlockState e2;
        BlockCocoa blockCocoa = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockCocoa a2 = blockCocoa;
        IBlockState iBlockState3 = e2;
        d2.J((XF)b2, iBlockState3.J(AGE, iBlockState3.J(AGE) + vRa.d), uqa.g);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCocoa a2 = this;
        return uSa.E | b2.J(FACING).getHorizontalIndex() | b2.J(AGE) << uqa.g;
    }
}

