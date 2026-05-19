/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  eAa
 *  kta
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockBone
extends BlockRotatedPillar {
    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockBone a2 = this;
        return new Mda(eAa.J((Block)a2), vRa.d, uSa.E);
    }

    public BlockBone() {
        BlockBone a2;
        BlockBone blockBone = a2;
        super(Material.rock);
        blockBone.J(yGa.A);
        a2.J(kta.v);
    }

    @Override
    public IBlockState J(int n2) {
        BlockBone blockBone;
        BlockBone blockBone2 = this;
        Object b2 = RX.Y;
        if ((a2 &= lqa.s) == AQa.P) {
            b2 = RX.X;
            blockBone = blockBone2;
        } else {
            int a2;
            if (a2 == Yqa.i) {
                b2 = RX.Z;
            }
            blockBone = blockBone2;
        }
        return blockBone.J().J(AXIS, b2);
    }

    @Override
    public BlockState J() {
        BlockBone a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = AXIS;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        void h2;
        DZ i2 = dZ2;
        BlockBone f5 = this;
        return super.J((Gg)h2, (XF)g2, i2, (float)e2, (float)d2, (float)c2, (int)b2, (Gl)a2).J(AXIS, i2.getAxis());
    }

    @Override
    public int f(IBlockState iBlockState) {
        RX a2;
        BlockBone blockBone = this;
        int b2 = uSa.E;
        if ((a2 = (RX)a2.J(AXIS)) == RX.X) {
            return b2 |= AQa.P;
        }
        if (a2 == RX.Z) {
            b2 |= Yqa.i;
        }
        return b2;
    }
}

