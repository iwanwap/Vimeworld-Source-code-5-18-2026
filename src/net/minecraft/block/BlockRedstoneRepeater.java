/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  I
 *  JTa
 *  MQa
 *  QFa
 *  Spa
 *  UZ
 *  Ypa
 *  Yra
 *  aSa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockRedstoneRepeater
extends BlockRedstoneDiode {
    public static final PropertyBool LOCKED = PropertyBool.J(JTa.Q);
    public static final PropertyInteger DELAY = PropertyInteger.J(Ypa.Da, vRa.d, AQa.P);

    @Override
    public IBlockState f(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockRedstoneRepeater a2 = this;
        Integer n2 = b2.J(DELAY);
        Boolean bl = b2.J(LOCKED);
        b2 = b2.J(FACING);
        return QFa.cB.J().J(FACING, b2).J(DELAY, n2).J(LOCKED, bl);
    }

    @Override
    public String f() {
        return Ey.f((String)Spa.z);
    }

    @Override
    public IBlockState l(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockRedstoneRepeater a2 = this;
        Integer n2 = b2.J(DELAY);
        Boolean bl = b2.J(LOCKED);
        b2 = b2.J(FACING);
        return QFa.t.J().J(FACING, b2).J(DELAY, n2).J(LOCKED, bl);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void g2;
        void h2;
        Object i2;
        BlockRedstoneRepeater blockRedstoneRepeater = object;
        Object object = sx2;
        BlockRedstoneRepeater e2 = blockRedstoneRepeater;
        if (!((Sx)((Object)i2)).h.J) {
            return uSa.E != 0;
        }
        h2.J((XF)g2, f5.J(DELAY), yRa.d);
        return vRa.d != 0;
    }

    @Override
    public BlockState J() {
        BlockRedstoneRepeater a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = DELAY;
        iPropertyArray[uqa.g] = LOCKED;
        return new BlockState(a2, iPropertyArray);
    }

    public BlockRedstoneRepeater(boolean bl) {
        BlockRedstoneRepeater a2;
        boolean b2 = bl;
        BlockRedstoneRepeater blockRedstoneRepeater = a2 = this;
        super(b2);
        blockRedstoneRepeater.J(blockRedstoneRepeater.blockState.J().J(FACING, DZ.NORTH).J(DELAY, vRa.d).J(LOCKED, uSa.E != 0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object a2 = this;
        IBlockState d2 = iBlockState;
        if (((BlockRedstoneDiode)a2).f((I)c2, (XF)b2, d2) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void a2;
        void b2;
        IBlockState d2 = iBlockState;
        BlockRedstoneRepeater c2 = this;
        return d2.J(LOCKED, c2.J((I)b2, (XF)a2, d2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Object e22 = xF2;
        BlockRedstoneRepeater c2 = this;
        if (c2.isRepeaterPowered) {
            void d2;
            void a2;
            void b2;
            DZ dZ2 = b2.J(FACING);
            Object object = e22;
            double d3 = (double)((float)object.getX() + MQa.L) + (double)(a2.nextFloat() - MQa.L) * iSa.P;
            double d4 = (double)((float)object.getY() + Xpa.R) + (double)(a2.nextFloat() - MQa.L) * iSa.P;
            void v1 = a2;
            double d5 = (double)((float)object.getZ() + MQa.L) + (double)(v1.nextFloat() - MQa.L) * iSa.P;
            float e22 = CRa.M;
            if (v1.nextBoolean()) {
                e22 = b2.J(DELAY) * uqa.g - vRa.d;
            }
            double d6 = (e22 /= Yra.i) * (float)dZ2.getFrontOffsetX();
            double d7 = e22 * (float)dZ2.getFrontOffsetZ();
            d2.J(UZ.REDSTONE, d3 + d6, d4, d5 + d7, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        BlockRedstoneRepeater a2;
        IBlockState d2 = iBlockState;
        BlockRedstoneRepeater blockRedstoneRepeater = a2 = this;
        super.l((Gg)c2, (XF)b2, d2);
        blockRedstoneRepeater.d((Gg)c2, (XF)b2, d2);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneRepeater a2 = this;
        return uSa.E | b2.J(FACING).getHorizontalIndex() | b2.J(DELAY) - vRa.d << uqa.g;
    }

    @Override
    public boolean l(Block block) {
        Block b2 = block;
        BlockRedstoneRepeater a2 = this;
        return BlockRedstoneRepeater.f(b2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockRedstoneRepeater a2 = this;
        return a2.J().J(FACING, DZ.getHorizontal(b2)).J(LOCKED, uSa.E != 0).J(DELAY, vRa.d + (b2 >> uqa.g));
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockRedstoneRepeater a2 = this;
        return Gea.tA;
    }

    @Override
    public int e(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneRepeater a2 = this;
        return b2.J(DELAY) * uqa.g;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockRedstoneRepeater a2 = this;
        return Gea.tA;
    }
}

