/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  Mda
 *  Ypa
 *  aga
 *  eAa
 *  pqa
 *  vRa
 *  xOa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockAnvil$Anvil;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockAnvil
extends BlockFalling {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
    public static final PropertyInteger DAMAGE = PropertyInteger.J(lQa.I, uSa.E, uqa.g);

    @Override
    public BlockState J() {
        BlockAnvil a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = DAMAGE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockAnvil a2 = this;
        return uSa.E | b2.J(FACING).getHorizontalIndex() | b2.J(DAMAGE) << uqa.g;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockAnvil a2 = this;
        return a2.J().J(FACING, DZ.getHorizontal(b2 & yRa.d)).J(DAMAGE, (b2 & Ypa.A) >> uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx, DZ dZ, float f2, float f3, float f4) {
        BlockAnvil i2 = gg2;
        BlockAnvil h = this;
        if (!((Gg)i2).e) {
            void g;
            void e2;
            e2.J(new BlockAnvil$Anvil((Gg)i2, (XF)g));
        }
        return vRa.d != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockAnvil b2;
        Object d2 = xF;
        BlockAnvil blockAnvil = b2 = this;
        blockAnvil.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockAnvil a2 = this;
        b2.f(qsa.x, (XF)((Object)c2), uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ, float f2, float f3, float f4, int n2, Gl gl2) {
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void g;
        void h;
        void a2;
        BlockAnvil blockAnvil = this;
        Object i2 = a2.J().rotateY();
        return super.J((Gg)h, (XF)g, (DZ)f5, (float)e2, (float)d2, (float)c2, (int)b2, (Gl)a2).J(FACING, i2).J(DAMAGE, (int)(b2 >> uqa.g));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF) {
        void a2;
        Object c2 = i2;
        BlockAnvil b2 = this;
        if ((c2 = c2.J((XF)a2)).J() != b2) {
            b2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
            return;
        }
        if (c2.J(FACING).getAxis() == RX.X) {
            b2.J(JPa.N, JPa.N, Mqa.N, pqa.r, pqa.r, xOa.B);
            return;
        }
        b2.J(Mqa.N, JPa.N, JPa.N, xOa.B, pqa.r, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        BlockAnvil a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, uSa.E));
        d2.add(new Mda((eAa)c2, vRa.d, vRa.d));
        d2.add(new Mda((eAa)c2, vRa.d, uqa.g));
    }

    @Override
    public void J(aga aga2) {
        BlockAnvil b2 = aga2;
        BlockAnvil a2 = this;
        b2.A(vRa.d != 0);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public boolean J(I i2, XF xF, DZ dZ) {
        Object d2 = dZ;
        BlockAnvil a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF) {
        void b2;
        BlockAnvil a2;
        Object c2 = xF;
        BlockAnvil blockAnvil = a2 = this;
        blockAnvil.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    @Override
    public IBlockState J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockAnvil a2 = this;
        return a2.J().J(FACING, DZ.SOUTH);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockAnvil a2 = this;
        return b2.J(DAMAGE);
    }

    public BlockAnvil() {
        BlockAnvil a2;
        BlockAnvil blockAnvil = a2;
        super(Material.anvil);
        blockAnvil.J(blockAnvil.blockState.J().J(FACING, DZ.NORTH).J(DAMAGE, uSa.E));
        blockAnvil.J(uSa.E);
        a2.J(yGa.a);
    }
}

