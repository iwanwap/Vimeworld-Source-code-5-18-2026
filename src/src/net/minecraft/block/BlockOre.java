/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Oz
 *  QFa
 *  XTa
 *  eAa
 *  iea
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockOre
extends Block {
    @Override
    public int f(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockOre a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        void a2;
        void b2;
        void d2;
        void e2;
        BlockOre c2;
        IBlockState f32 = iBlockState;
        BlockOre blockOre = c2 = this;
        super.J((Gg)e2, (XF)d2, f32, (float)b2, (int)a2);
        if (blockOre.J(f32, e2.v, (int)a2) != eAa.J((Block)c2)) {
            BlockOre blockOre2;
            int f32 = uSa.E;
            if (c2 == QFa.Za) {
                blockOre2 = c2;
                f32 = Oz.J((Random)e2.v, (int)uSa.E, (int)uqa.g);
            } else if (c2 == QFa.Ic) {
                blockOre2 = c2;
                f32 = Oz.J((Random)e2.v, (int)yRa.d, (int)XTa.W);
            } else if (c2 == QFa.c) {
                blockOre2 = c2;
                f32 = Oz.J((Random)e2.v, (int)yRa.d, (int)XTa.W);
            } else if (c2 == QFa.xC) {
                blockOre2 = c2;
                f32 = Oz.J((Random)e2.v, (int)uqa.g, (int)tTa.h);
            } else {
                if (c2 == QFa.Lb) {
                    f32 = Oz.J((Random)e2.v, (int)uqa.g, (int)tTa.h);
                }
                blockOre2 = c2;
            }
            blockOre2.J((Gg)e2, (XF)d2, f32);
        }
    }

    public BlockOre() {
        a2(Material.rock.J());
        BlockOre a2;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        Object a2 = this;
        if (a2 == QFa.xC) {
            return AQa.P + b2.nextInt(tTa.h);
        }
        return vRa.d;
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        Object a2 = this;
        if (a2 == QFa.xC) {
            return iea.BLUE.getDyeDamage();
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(int n2, Random random) {
        void a2;
        int c2 = n2;
        BlockOre b2 = this;
        if (c2 > 0) {
            BlockOre blockOre = b2;
            if (eAa.J((Block)b2) != blockOre.J((IBlockState)blockOre.f().J().iterator().next(), (Random)a2, c2)) {
                if ((c2 = a2.nextInt(c2 + uqa.g) - vRa.d) < 0) {
                    c2 = uSa.E;
                }
                return b2.J((Random)a2) * (c2 + vRa.d);
            }
        }
        return b2.J((Random)a2);
    }

    public BlockOre(MapColor mapColor) {
        BlockOre a2;
        MapColor b2 = mapColor;
        BlockOre blockOre = a2 = this;
        super(Material.rock, b2);
        blockOre.J(yGa.A);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockOre a2 = this;
        if (a2 == QFa.Za) {
            return Gea.qc;
        }
        if (a2 == QFa.Ic) {
            return Gea.b;
        }
        if (a2 == QFa.xC) {
            return Gea.Q;
        }
        if (a2 == QFa.c) {
            return Gea.kc;
        }
        if (a2 == QFa.Lb) {
            return Gea.wA;
        }
        return eAa.J((Block)a2);
    }
}

