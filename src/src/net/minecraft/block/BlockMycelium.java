/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  NTa
 *  QFa
 *  UZ
 *  aSa
 *  eAa
 *  isa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockMycelium
extends Block {
    public static final PropertyBool SNOWY = PropertyBool.J(sra.c);

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        BlockMycelium e2 = gg2;
        BlockMycelium d2 = this;
        if (!((Gg)e2).e) {
            void c2;
            if (e2.C(c2.up()) < AQa.P && e2.J(c2.up()).J().C() > uqa.g) {
                e2.J((XF)c2, QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.DIRT));
                return;
            }
            if (e2.C(c2.up()) >= WOa.fa) {
                int b2;
                int n2 = b2 = uSa.E;
                while (n2 < AQa.P) {
                    void a2;
                    XF xF2 = c2.add(a2.nextInt(yRa.d) - vRa.d, a2.nextInt(tTa.h) - yRa.d, a2.nextInt(yRa.d) - vRa.d);
                    BlockMycelium blockMycelium = e2;
                    IBlockState iBlockState2 = blockMycelium.J(xF2);
                    Block block = blockMycelium.J(xF2.up()).J();
                    if (iBlockState2.J() == QFa.Bc && iBlockState2.J(BlockDirt.VARIANT) == BlockDirt$DirtType.DIRT && e2.C(xF2.up()) >= AQa.P && block.C() <= uqa.g) {
                        e2.J(xF2, d2.J());
                    }
                    n2 = ++b2;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        void b2;
        int d2 = n2;
        BlockMycelium a2 = this;
        return QFa.Bc.J(QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.DIRT), (Random)b2, d2);
    }

    @Override
    public BlockState J() {
        BlockMycelium a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = SNOWY;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        Random e2;
        void b2;
        void c2;
        void d2;
        BlockMycelium blockMycelium = random2;
        Random random2 = random;
        BlockMycelium a2 = blockMycelium;
        super.l((Gg)d2, (XF)c2, (IBlockState)b2, e2);
        if (e2.nextInt(NTa.C) == 0) {
            d2.J(UZ.TOWN_AURA, (double)((float)c2.getX() + e2.nextFloat()), (double)((float)c2.getY() + isa.W), (double)((float)c2.getZ() + e2.nextFloat()), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    public BlockMycelium() {
        BlockMycelium a2;
        BlockMycelium blockMycelium = a2;
        super(Material.grass, MapColor.purpleColor);
        blockMycelium.J(blockMycelium.blockState.J().J(SNOWY, uSa.E != 0));
        blockMycelium.J(vRa.d != 0);
        a2.J(yGa.A);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockMycelium a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        void a2;
        void c2;
        Block d2 = i2;
        BlockMycelium b2 = this;
        return c2.J(SNOWY, ((d2 = d2.J(a2.up()).J()) == QFa.mb || d2 == QFa.gC ? vRa.d : uSa.E) != 0);
    }
}

