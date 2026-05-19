/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  MQa
 *  QFa
 *  XTa
 *  eAa
 *  kqa
 *  pqa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockFarmland$1;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockFarmland
extends Block {
    public static final PropertyInteger MOISTURE = PropertyInteger.J(lQa.K, uSa.E, XTa.W);

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockFarmland a2 = this;
        return a2.J().J(MOISTURE, b2 & XTa.W);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void a2;
        void b2;
        void d2;
        XF e2 = xF;
        BlockFarmland c2 = this;
        void v0 = d2;
        super.J((Gg)v0, e2, (IBlockState)b2, (Block)a2);
        if (v0.J(e2.up()).J().J().i()) {
            d2.J(e2, QFa.Bc.J());
        }
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFarmland a2 = this;
        return b2.J(MOISTURE);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        void b2;
        int d2 = n2;
        BlockFarmland a2 = this;
        return QFa.Bc.J(QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.DIRT), (Random)b2, d2);
    }

    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        Object d2 = xF;
        BlockFarmland b2 = this;
        return new xy((double)d2.getX(), (double)d2.getY(), (double)d2.getZ(), (double)(d2.getX() + vRa.d), (double)(d2.getY() + vRa.d), (double)(d2.getZ() + vRa.d));
    }

    /*
     * WARNING - void declaration
     */
    private boolean C(Gg gg2, XF xF) {
        XF c2 = xF;
        BlockFarmland a2 = this;
        for (zz zz2 : XF.getAllInBoxMutable(c2.add(pta.a, uSa.E, pta.a), c2.add(AQa.P, vRa.d, AQa.P))) {
            void b2;
            if (b2.J((XF)zz2).J().J() != Material.water) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public boolean J(I i2, XF xF, DZ dZ) {
        void b2;
        void c2;
        void a2;
        BlockFarmland blockFarmland = this;
        switch (BlockFarmland$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                return vRa.d != 0;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                Block d2 = c2.J((XF)b2).J();
                if (!d2.g() && d2 != QFa.rd) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
        }
        return super.J((I)c2, (XF)b2, (DZ)a2);
    }

    public BlockFarmland() {
        BlockFarmland a2;
        BlockFarmland blockFarmland = a2;
        super(Material.ground);
        blockFarmland.J(blockFarmland.blockState.J().J(MOISTURE, uSa.E));
        blockFarmland.J(vRa.d != 0);
        BlockFarmland blockFarmland2 = a2;
        blockFarmland2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.Ha, pqa.r);
        blockFarmland2.J(osa.Ja);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        void d2;
        void b2;
        XF e2 = xF;
        BlockFarmland c2 = this;
        int a2 = b2.J(MOISTURE);
        if (!c2.C((Gg)d2, e2) && !d2.i(e2.up())) {
            if (a2 > 0) {
                d2.J(e2, b2.J(MOISTURE, a2 - vRa.d), uqa.g);
                return;
            }
            if (!c2.l((Gg)d2, e2)) {
                d2.J(e2, QFa.Bc.J());
                return;
            }
        } else if (a2 < XTa.W) {
            d2.J(e2, b2.J(MOISTURE, XTa.W), uqa.g);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF) {
        void a2;
        Block c2 = gg2;
        BlockFarmland b2 = this;
        if ((c2 = c2.J(a2.up()).J()) instanceof BlockCrops || c2 instanceof BlockStem) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockFarmland a2 = this;
        return eAa.J((Block)QFa.Bc);
    }

    @Override
    public BlockState J() {
        BlockFarmland a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = MOISTURE;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, vL vL2, float f2) {
        void b2;
        BlockFarmland e2 = gg2;
        BlockFarmland d2 = this;
        if (b2 instanceof Gl) {
            void c2;
            void a2;
            if (!((Gg)e2).e && ((Gg)e2).v.nextFloat() < a2 - MQa.L) {
                if (!(b2 instanceof Sx) && !e2.J().f(kqa.N)) {
                    return;
                }
                e2.J((XF)c2, QFa.Bc.J());
            }
            super.J((Gg)e2, (XF)c2, (vL)b2, (float)a2);
        }
    }
}

