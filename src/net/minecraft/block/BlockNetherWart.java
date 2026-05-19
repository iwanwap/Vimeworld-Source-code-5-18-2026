/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  Mda
 *  NTa
 *  QFa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockNetherWart
extends BlockBush {
    public static final PropertyInteger AGE = PropertyInteger.J(tSa.v, uSa.E, yRa.d);

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockNetherWart a2 = this;
        return Gea.qA;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockNetherWart a2 = this;
        return b2.J(AGE);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        void d2;
        void a2;
        Object e2 = iBlockState;
        BlockNetherWart b2 = this;
        int n2 = e2.J(AGE);
        if (n2 < yRa.d && a2.nextInt(NTa.C) == 0) {
            e2 = e2.J(AGE, n2 + vRa.d);
            d2.J((XF)c2, (IBlockState)e2, uqa.g);
        }
        super.f((Gg)d2, (XF)c2, (IBlockState)e2, (Random)a2);
    }

    @Override
    public BlockState J() {
        BlockNetherWart a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = AGE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockNetherWart a2 = this;
        return a2.J().J(AGE, b2);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockNetherWart a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        XF d2 = xF2;
        BlockNetherWart b2 = this;
        return b2.f(c2.J(d2.down()).J());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        void e2;
        float f3 = f2;
        BlockNetherWart b2 = this;
        if (!e2.e) {
            void c2;
            int f4 = vRa.d;
            if (c2.J(AGE) >= yRa.d) {
                void a2;
                f4 = uqa.g + e2.v.nextInt(yRa.d);
                if (a2 > 0) {
                    f4 += e2.v.nextInt((int)(a2 + vRa.d));
                }
            }
            int n3 = c2 = uSa.E;
            while (n3 < f4) {
                void d2;
                BlockNetherWart.J((Gg)e2, (XF)d2, new Mda(Gea.qA));
                n3 = ++c2;
            }
        }
    }

    public BlockNetherWart() {
        BlockNetherWart blockNetherWart;
        BlockNetherWart blockNetherWart2 = blockNetherWart = this;
        super(Material.plants, MapColor.redColor);
        blockNetherWart2.J(blockNetherWart2.blockState.J().J(AGE, uSa.E));
        blockNetherWart2.J(vRa.d != 0);
        float a2 = MQa.L;
        blockNetherWart.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, rta.o, MQa.L + a2);
        blockNetherWart2.J((yGa)null);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockNetherWart a2 = this;
        return null;
    }

    @Override
    public boolean f(Block block) {
        Block b2 = block;
        BlockNetherWart a2 = this;
        if (b2 == QFa.VC) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

