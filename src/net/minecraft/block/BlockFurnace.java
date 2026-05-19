/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  Gl
 *  HA
 *  Mda
 *  Mfa
 *  QFa
 *  Tz
 *  UZ
 *  Zta
 *  aQa
 *  aSa
 *  eAa
 *  hy
 *  lPa
 *  uY
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFurnace$1;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockFurnace
extends BlockContainer {
    private static boolean keepInventory;
    public static final PropertyDirection FACING;
    private final boolean isBurning;

    @Override
    public BlockState J() {
        BlockFurnace a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockFurnace a2 = this;
        DZ b22 = DZ.getFront(b22);
        if (b22.getAxis() == RX.Y) {
            b22 = DZ.NORTH;
        }
        return a2.J().J(FACING, b22);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockFurnace a2 = this;
        return eAa.J((Block)QFa.Xb);
    }

    @Override
    public IBlockState J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFurnace a2 = this;
        return a2.J().J(FACING, DZ.SOUTH);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockFurnace a2 = this;
        return Ega.J((uY)b2.J((XF)((Object)c2)));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockFurnace a2 = this;
        a2.C((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        BlockFurnace blockFurnace = this;
        if (!c2.e) {
            void v1;
            void a2;
            void b2;
            void v0 = c2;
            Block block = v0.J(b2.north()).J();
            Block block2 = v0.J(b2.south()).J();
            Block block3 = v0.J(b2.west()).J();
            Block block4 = v0.J(b2.east()).J();
            Object d2 = a2.J(FACING);
            if (d2 == DZ.NORTH && block.J() && !block2.J()) {
                d2 = DZ.SOUTH;
                v1 = c2;
            } else if (d2 == DZ.SOUTH && block2.J() && !block.J()) {
                d2 = DZ.NORTH;
                v1 = c2;
            } else if (d2 == DZ.WEST && block3.J() && !block4.J()) {
                d2 = DZ.EAST;
                v1 = c2;
            } else {
                if (d2 == DZ.EAST && block4.J() && !block3.J()) {
                    d2 = DZ.WEST;
                }
                v1 = c2;
            }
            v1.J((XF)b2, a2.J(FACING, d2), uqa.g);
        }
    }

    public BlockFurnace(boolean bl) {
        BlockFurnace a2;
        boolean b2 = bl;
        BlockFurnace blockFurnace = a2 = this;
        super(Material.rock);
        blockFurnace.J(blockFurnace.blockState.J().J(FACING, DZ.NORTH));
        blockFurnace.isBurning = b2;
    }

    static {
        FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockFurnace a2 = this;
        return new jX();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockFurnace e2 = gg2;
        BlockFurnace d2 = this;
        if (d2.isBurning) {
            void a2;
            void c2;
            DZ b2;
            b2 = b2.J(FACING);
            void v0 = c2;
            double d3 = (double)v0.getX() + kTa.B;
            double d4 = (double)v0.getY() + a2.nextDouble() * lPa.K / Zta.ba;
            double d5 = (double)v0.getZ() + kTa.B;
            double d6 = kTa.v;
            double d7 = a2.nextDouble() * oQa.fa - aQa.r;
            switch (BlockFurnace$1.$SwitchMap$net$minecraft$util$EnumFacing[b2.ordinal()]) {
                case 1: {
                    BlockFurnace blockFurnace = e2;
                    while (false) {
                    }
                    blockFurnace.J(UZ.SMOKE_NORMAL, d3 - d6, d4, d5 + d7, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    blockFurnace.J(UZ.FLAME, d3 - d6, d4, d5 + d7, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    return;
                }
                case 2: {
                    BlockFurnace blockFurnace = e2;
                    blockFurnace.J(UZ.SMOKE_NORMAL, d3 + d6, d4, d5 + d7, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    blockFurnace.J(UZ.FLAME, d3 + d6, d4, d5 + d7, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    return;
                }
                case 3: {
                    BlockFurnace blockFurnace = e2;
                    blockFurnace.J(UZ.SMOKE_NORMAL, d3 + d7, d4, d5 - d6, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    blockFurnace.J(UZ.FLAME, d3 + d7, d4, d5 - d6, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    return;
                }
                case 4: {
                    BlockFurnace blockFurnace = e2;
                    blockFurnace.J(UZ.SMOKE_NORMAL, d3 + d7, d4, d5 + d6, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    blockFurnace.J(UZ.FLAME, d3 + d7, d4, d5 + d6, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(boolean bl, Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        boolean a2 = bl;
        void v0 = b2;
        IBlockState iBlockState = v0.J(c2);
        uY uY2 = v0.J(c2);
        keepInventory = vRa.d;
        if (a2) {
            b2.J(c2, QFa.CB.J().J(FACING, iBlockState.J(FACING)), yRa.d);
            b2.J(c2, QFa.CB.J().J(FACING, iBlockState.J(FACING)), yRa.d);
        } else {
            b2.J(c2, QFa.Xb.J().J(FACING, iBlockState.J(FACING)), yRa.d);
            b2.J(c2, QFa.Xb.J().J(FACING, iBlockState.J(FACING)), yRa.d);
        }
        keepInventory = uSa.E;
        if (uY2 != null) {
            uY2.C();
            b2.f(c2, uY2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        uY uY2;
        Object d2 = xF2;
        BlockFurnace b2 = this;
        if (!keepInventory && (uY2 = c2.J((XF)((Object)d2))) instanceof jX) {
            Mfa.J((Gg)c2, (XF)((Object)d2), (HA)((jX)uY2));
            c2.J((XF)((Object)d2), (Block)b2);
        }
        super.l((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFurnace a2 = this;
        return b2.J(FACING).getIndex();
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockFurnace a2 = this;
        return eAa.J((Block)QFa.Xb);
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockFurnace i2;
        BlockFurnace blockFurnace = blockFurnace2;
        BlockFurnace blockFurnace2 = gl2;
        BlockFurnace a2 = blockFurnace;
        return a2.J().J(FACING, i2.J().getOpposite());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockFurnace i2 = gg2;
        BlockFurnace h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = i2.J((XF)g2)) instanceof jX) {
            void e2;
            e2.J((HA)((jX)((Object)i2)));
            e2.J(Tz.d);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockFurnace f2 = gg2;
        BlockFurnace e2 = this;
        f2.J((XF)d2, c2.J(FACING, b2.J().getOpposite()), uqa.g);
        if (a2.l() && (f2 = f2.J((XF)d2)) instanceof jX) {
            ((jX)((Object)f2)).J(a2.J());
        }
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }
}

