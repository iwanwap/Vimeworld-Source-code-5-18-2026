/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  Ypa
 *  ez
 *  gZ
 *  pqa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockCactus
extends Block {
    public static final PropertyInteger AGE = PropertyInteger.J(tSa.v, uSa.E, Ypa.A);

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCactus a2 = this;
        return b2.J(AGE);
    }

    @Override
    public xy J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockCactus a2 = this;
        float b2 = rRa.T;
        return new xy((double)((float)c2.getX() + b2), (double)c2.getY(), (double)((float)c2.getZ() + b2), (double)((float)(c2.getX() + vRa.d) - b2), (double)(c2.getY() + vRa.d), (double)((float)(c2.getZ() + vRa.d) - b2));
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCactus a2 = this;
        return a2.J().J(AGE, b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF) {
        void a2;
        void b2;
        BlockCactus blockCactus = this;
        for (DZ dZ2 : LX.HORIZONTAL) {
            if (!b2.J(a2.offset(dZ2)).J().J().i()) continue;
            return uSa.E != 0;
        }
        Block c2 = b2.J(a2.down()).J();
        if (c2 == QFa.dd || c2 == QFa.R) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockCactus() {
        BlockCactus a2;
        BlockCactus blockCactus = a2;
        super(Material.cactus);
        blockCactus.J(blockCactus.blockState.J().J(AGE, uSa.E));
        blockCactus.J(vRa.d != 0);
        a2.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF) {
        void b2;
        BlockCactus a2 = this;
        Object c2 = xF;
        if (super.J((Gg)b2, (XF)((Object)c2))) {
            return a2.l((Gg)b2, (XF)((Object)c2));
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        void c2;
        BlockCactus e2 = gg2;
        BlockCactus d2 = this;
        XF a2 = c2.up();
        if (e2.J(a2)) {
            int n2 = vRa.d;
            BlockCactus blockCactus = e2;
            while (blockCactus.J(c2.down(n2)).J() == d2) {
                blockCactus = e2;
                ++n2;
            }
            if (n2 < yRa.d) {
                void b2;
                n2 = b2.J(AGE);
                if (n2 == Ypa.A) {
                    e2.J(a2, d2.J());
                    IBlockState iBlockState2 = b2.J(AGE, uSa.E);
                    e2.J((XF)c2, iBlockState2, AQa.P);
                    d2.J((Gg)e2, a2, iBlockState2, d2);
                    return;
                }
                e2.J((XF)c2, b2.J(AGE, n2 + vRa.d), AQa.P);
            }
        }
    }

    @Override
    public BlockState J() {
        BlockCactus a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = AGE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, vL vL2) {
        BlockCactus e2;
        BlockCactus blockCactus = blockCactus2;
        BlockCactus blockCactus2 = vL2;
        BlockCactus a2 = blockCactus;
        e2.J(gZ.C, pqa.r);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void d2;
        BlockCactus c2 = this;
        Object e2 = xF;
        if (!c2.l((Gg)d2, (XF)((Object)e2))) {
            d2.f((XF)((Object)e2), vRa.d != 0);
        }
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        Object d2 = xF;
        BlockCactus b2 = this;
        float c2 = rRa.T;
        return new xy((double)((float)d2.getX() + c2), (double)d2.getY(), (double)((float)d2.getZ() + c2), (double)((float)(d2.getX() + vRa.d) - c2), (double)((float)(d2.getY() + vRa.d) - c2), (double)((float)(d2.getZ() + vRa.d) - c2));
    }
}

