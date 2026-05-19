/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  Gl
 *  HA
 *  I
 *  JPa
 *  Mda
 *  Mfa
 *  Tz
 *  Uta
 *  XTa
 *  ez
 *  hy
 *  pqa
 *  qX
 *  uY
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHopper$1;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockHopper
extends BlockContainer {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, new BlockHopper$1());
    public static final PropertyBool ENABLED = PropertyBool.J(Uta.p);

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    public BlockHopper() {
        BlockHopper a2;
        BlockHopper blockHopper = a2;
        super(Material.iron, MapColor.stoneColor);
        blockHopper.J(blockHopper.blockState.J().J(FACING, DZ.DOWN).J(ENABLED, vRa.d != 0));
        blockHopper.J(yGa.I);
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        Object d2 = dZ2;
        BlockHopper a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockHopper blockHopper = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getIndex();
        if (!a2.J(ENABLED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockHopper a2 = this;
        return a2.J().J(FACING, BlockHopper.J(b2)).J(ENABLED, BlockHopper.J(b2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockHopper f2 = gg2;
        BlockHopper e2 = this;
        super.J((Gg)f2, (XF)d2, (IBlockState)c2, (Gl)b2, (Mda)a2);
        if (a2.l() && (f2 = f2.J((XF)d2)) instanceof qX) {
            ((qX)f2).J(a2.J());
        }
    }

    @Override
    public BlockState J() {
        BlockHopper a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = ENABLED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        int d2;
        BlockHopper blockHopper = this;
        int n2 = d2 = !c2.k((XF)b2) ? vRa.d : uSa.E;
        if (d2 != a2.J(ENABLED)) {
            c2.J((XF)b2, a2.J(ENABLED, d2 != 0), AQa.P);
        }
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    public static DZ J(int a2) {
        return DZ.getFront(a2 & XTa.W);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockHopper a2 = this;
        a2.C((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF2;
        BlockHopper b2 = this;
        uY uY2 = c2.J((XF)((Object)d2));
        if (uY2 instanceof qX) {
            Mfa.J((Gg)c2, (XF)((Object)d2), (HA)((qX)uY2));
            c2.J((XF)((Object)d2), (Block)b2);
        }
        super.l((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    @Override
    public ez J() {
        return ez.CUTOUT_MIPPED;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockHopper a2 = this;
        return Ega.J((uY)b2.J((XF)((Object)c2)));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void f5;
        Object i2 = gg2;
        BlockHopper h2 = this;
        i2 = f5.getOpposite();
        if (i2 == DZ.UP) {
            i2 = DZ.DOWN;
        }
        return h2.J().J(FACING, i2).J(ENABLED, vRa.d != 0);
    }

    public static boolean J(int a2) {
        if ((a2 & Yqa.i) != Yqa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockHopper a2 = this;
        return new qX();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockHopper i2 = gg2;
        BlockHopper h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = i2.J((XF)g2)) instanceof qX) {
            void e2;
            e2.J((HA)((qX)i2));
            e2.J(Tz.B);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockHopper b2 = this;
        b2.C((Gg)d2, (XF)c2, e2);
    }

    @Override
    public void J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockHopper a2 = this;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        BlockHopper f2;
        BlockHopper g22 = gg2;
        BlockHopper blockHopper = f2 = this;
        BlockHopper blockHopper2 = f2;
        BlockHopper blockHopper3 = f2;
        BlockHopper blockHopper4 = g22;
        BlockHopper blockHopper5 = f2;
        blockHopper5.J(JPa.N, JPa.N, JPa.N, pqa.r, Jpa.y, pqa.r);
        super.J((Gg)g22, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        float g22 = Mqa.N;
        blockHopper5.J(JPa.N, JPa.N, JPa.N, g22, pqa.r, pqa.r);
        super.J((Gg)blockHopper4, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockHopper3.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, g22);
        super.J((Gg)blockHopper4, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockHopper2.J(pqa.r - g22, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        super.J((Gg)g22, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockHopper.J(JPa.N, JPa.N, pqa.r - g22, pqa.r, pqa.r, pqa.r);
        super.J((Gg)g22, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockHopper.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

