/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  eAa
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockCustomPillar
extends BlockRotatedPillar {
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
        BlockCustomPillar f5 = this;
        return super.J((Gg)h2, (XF)g2, i2, (float)e2, (float)d2, (float)c2, (int)b2, (Gl)a2).J(AXIS, i2.getAxis());
    }

    @Override
    public int f(IBlockState iBlockState) {
        RX a2;
        BlockCustomPillar blockCustomPillar = this;
        int b2 = uSa.E;
        if ((a2 = (RX)a2.J(AXIS)) == RX.X) {
            return b2 |= AQa.P;
        }
        if (a2 == RX.Z) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCustomPillar a2 = this;
        return new Mda(eAa.J((Block)a2), vRa.d, uSa.E);
    }

    @Override
    public IBlockState J(int n2) {
        BlockCustomPillar blockCustomPillar;
        BlockCustomPillar blockCustomPillar2 = this;
        Object b2 = RX.Y;
        if ((a2 &= lqa.s) == AQa.P) {
            b2 = RX.X;
            blockCustomPillar = blockCustomPillar2;
        } else {
            int a2;
            if (a2 == Yqa.i) {
                b2 = RX.Z;
            }
            blockCustomPillar = blockCustomPillar2;
        }
        return blockCustomPillar.J().J(AXIS, b2);
    }

    public BlockCustomPillar(Material material) {
        BlockCustomPillar a2;
        Material b2 = material;
        BlockCustomPillar blockCustomPillar = a2 = this;
        super(b2);
        blockCustomPillar.J(blockCustomPillar.blockState.J().J(AXIS, RX.Y));
        blockCustomPillar.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     */
    public BlockCustomPillar(Material material, MapColor mapColor) {
        void b2;
        BlockCustomPillar a2;
        MapColor c2 = mapColor;
        BlockCustomPillar blockCustomPillar = a2 = this;
        super((Material)b2, c2);
        blockCustomPillar.J(blockCustomPillar.blockState.J().J(AXIS, RX.Y));
        blockCustomPillar.J(yGa.A);
    }

    @Override
    public BlockState J() {
        BlockCustomPillar a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = AXIS;
        return new BlockState(a2, iPropertyArray);
    }
}

