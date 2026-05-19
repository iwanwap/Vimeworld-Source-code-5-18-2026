/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  HA
 *  JPa
 *  Mda
 *  Paa
 *  QFa
 *  Tz
 *  UZ
 *  eAa
 *  hy
 *  pqa
 *  uY
 *  vRa
 *  xOa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockEnderChest
extends BlockContainer {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockEnderChest a2 = this;
        return b2.J(FACING).getIndex();
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockEnderChest a2 = this;
        return eAa.J((Block)QFa.X);
    }

    @Override
    public hy J() {
        return hy.ENTITYBLOCK_ANIMATED;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        int b2;
        BlockEnderChest blockEnderChest = random2;
        Random random2 = random;
        BlockEnderChest a2 = blockEnderChest;
        int n2 = b2 = uSa.E;
        while (n2 < yRa.d) {
            void d2;
            void c2;
            Random e2;
            Object object = e2;
            Random random3 = e2;
            int n3 = e2.nextInt(uqa.g) * uqa.g - vRa.d;
            int n4 = random3.nextInt(uqa.g) * uqa.g - vRa.d;
            void v4 = c2;
            double d3 = (double)v4.getX() + kTa.B + VPa.W * (double)n3;
            double d4 = (float)v4.getY() + e2.nextFloat();
            double d5 = (double)c2.getZ() + kTa.B + VPa.W * (double)n4;
            double d6 = ((Random)object).nextFloat() * (float)n3;
            double d7 = ((double)random3.nextFloat() - kTa.B) * fqa.ca;
            double d8 = ((Random)object).nextFloat() * (float)n4;
            int n5 = 4 ^ 5;
            d2.J(UZ.PORTAL, d3, d4, d5, d6, d7, d8, new int[uSa.E]);
            n2 = ++b2;
        }
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockEnderChest i2;
        BlockEnderChest blockEnderChest = blockEnderChest2;
        BlockEnderChest blockEnderChest2 = gl2;
        BlockEnderChest a2 = blockEnderChest;
        return a2.J().J(FACING, i2.J().getOpposite());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        BlockEnderChest f2;
        void c2;
        void d2;
        void e2;
        BlockEnderChest blockEnderChest = blockEnderChest2;
        BlockEnderChest blockEnderChest2 = gl2;
        BlockEnderChest b2 = blockEnderChest;
        e2.J((XF)d2, c2.J(FACING, f2.J().getOpposite()), uqa.g);
    }

    @Override
    public BlockState J() {
        BlockEnderChest a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockEnderChest a2 = this;
        return Yqa.i;
    }

    public BlockEnderChest() {
        BlockEnderChest a2;
        BlockEnderChest blockEnderChest = a2;
        super(Material.rock);
        blockEnderChest.J(blockEnderChest.blockState.J().J(FACING, DZ.NORTH));
        blockEnderChest.J(yGa.a);
        a2.J(rRa.T, JPa.N, rRa.T, pqa.Ha, xOa.B, pqa.Ha);
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockEnderChest a2 = this;
        return new Paa();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        void h2;
        void e2;
        Object i2 = iBlockState;
        BlockEnderChest f5 = this;
        i2 = e2.J();
        uY d2 = h2.J((XF)g2);
        if (i2 != null && d2 instanceof Paa) {
            if (h2.J(g2.up()).J().A()) {
                return vRa.d != 0;
            }
            if (h2.e) {
                return vRa.d != 0;
            }
            i2.J((Paa)d2);
            void v0 = e2;
            v0.J((HA)i2);
            v0.J(Tz.u);
            return vRa.d != 0;
        }
        return vRa.d != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public boolean G() {
        return vRa.d != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockEnderChest a2 = this;
        DZ b22 = DZ.getFront(b22);
        if (b22.getAxis() == RX.Y) {
            b22 = DZ.NORTH;
        }
        return a2.J().J(FACING, b22);
    }
}

