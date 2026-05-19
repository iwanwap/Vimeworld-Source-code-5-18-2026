/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  LQa
 *  Lz
 *  MQa
 *  QFa
 *  UZ
 *  aSa
 *  ez
 *  kta
 *  pqa
 *  psa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockTorch$1;
import net.minecraft.block.BlockTorch$2;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockTorch
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, new BlockTorch$1());

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockTorch b2 = this;
        b2.f((Gg)d2, (XF)c2, e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public RY J(Gg gg2, XF xF2, Lz lz2, Lz lz3) {
        void a2;
        void b2;
        BlockTorch blockTorch;
        void c2;
        void d2;
        BlockTorch blockTorch2 = this;
        DZ dZ2 = d2.J((XF)c2).J(FACING);
        float e2 = VPa.i;
        if (dZ2 == DZ.EAST) {
            BlockTorch blockTorch3 = blockTorch2;
            blockTorch = blockTorch3;
            blockTorch3.J(JPa.N, psa.N, MQa.L - e2, e2 * kta.v, xSa.la, MQa.L + e2);
        } else if (dZ2 == DZ.WEST) {
            BlockTorch blockTorch4 = blockTorch2;
            blockTorch = blockTorch4;
            blockTorch4.J(pqa.r - e2 * kta.v, psa.N, MQa.L - e2, pqa.r, xSa.la, MQa.L + e2);
        } else if (dZ2 == DZ.SOUTH) {
            BlockTorch blockTorch5 = blockTorch2;
            blockTorch = blockTorch5;
            blockTorch5.J(MQa.L - e2, psa.N, JPa.N, MQa.L + e2, xSa.la, e2 * kta.v);
        } else if (dZ2 == DZ.NORTH) {
            BlockTorch blockTorch6 = blockTorch2;
            blockTorch = blockTorch6;
            blockTorch6.J(MQa.L - e2, psa.N, pqa.r - e2 * kta.v, MQa.L + e2, xSa.la, pqa.r);
        } else {
            e2 = Nra.e;
            BlockTorch blockTorch7 = blockTorch2;
            blockTorch = blockTorch7;
            blockTorch7.J(MQa.L - e2, JPa.N, MQa.L - e2, MQa.L + e2, Ora.D, MQa.L + e2);
        }
        return super.J((Gg)d2, (XF)c2, (Lz)b2, (Lz)a2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public IBlockState J(int n2) {
        void a2;
        BlockTorch blockTorch = this;
        IBlockState b2 = blockTorch.J();
        switch (a2) {
            case 1: {
                return b2.J(FACING, DZ.EAST);
            }
            case 2: {
                return b2.J(FACING, DZ.WEST);
            }
            case 3: {
                return b2.J(FACING, DZ.SOUTH);
            }
            case 4: {
                return b2.J(FACING, DZ.NORTH);
            }
        }
        return b2.J(FACING, DZ.UP);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        BlockTorch blockTorch = this;
        for (DZ dZ2 : FACING.J()) {
            void a2;
            void b2;
            if (!blockTorch.f((Gg)b2, (XF)a2, dZ2)) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockTorch a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockTorch a2 = this;
        a2.J((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void g2;
        void h2;
        BlockTorch f5 = this;
        Object i2 = dZ2;
        if (f5.f((Gg)h2, (XF)g2, (DZ)((Object)i2))) {
            return f5.J().J(FACING, i2);
        }
        for (DZ e2 : LX.HORIZONTAL) {
            if (!h2.J(g2.offset(e2.getOpposite()), vRa.d != 0)) continue;
            return f5.J().J(FACING, e2);
        }
        return f5.J();
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(Gg gg2, XF xF2, IBlockState iBlockState) {
        int n2;
        void a2;
        void c2;
        BlockTorch b2 = this;
        Object d2 = xF2;
        if (!b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2)) {
            return vRa.d != 0;
        }
        DZ dZ2 = a2.J(FACING);
        RX rX = dZ2.getAxis();
        DZ dZ3 = dZ2.getOpposite();
        int n3 = uSa.E;
        if (rX.isHorizontal() && !c2.J(((XF)((Object)d2)).offset(dZ3), vRa.d != 0)) {
            n2 = n3 = vRa.d;
        } else {
            if (rX.isVertical() && !b2.l((Gg)c2, ((XF)((Object)d2)).offset(dZ3))) {
                n3 = vRa.d;
            }
            n2 = n3;
        }
        if (n2 != 0) {
            void v2 = c2;
            b2.J((Gg)v2, (XF)((Object)d2), (IBlockState)a2, uSa.E);
            v2.G((XF)((Object)d2));
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        void a2;
        Object d2 = xF2;
        BlockTorch b2 = this;
        if (a2.J() == b2 && b2.f((Gg)c2, (XF)((Object)d2), a2.J(FACING))) {
            return vRa.d != 0;
        }
        if (c2.J((XF)((Object)d2)).J() == b2) {
            void v0 = c2;
            b2.J((Gg)v0, (XF)((Object)d2), (IBlockState)a2, uSa.E);
            v0.G((XF)((Object)d2));
        }
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockTorch a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        DZ b2;
        Object e2 = xF2;
        BlockTorch c2 = this;
        b2 = b2.J(FACING);
        Object object = e2;
        double d3 = (double)object.getX() + kTa.B;
        double d4 = (double)object.getY() + LQa.E;
        double d5 = (double)object.getZ() + kTa.B;
        double d6 = Ora.z;
        double d7 = aSa.Z;
        if (b2.getAxis().isHorizontal()) {
            e2 = b2.getOpposite();
            void v1 = d2;
            v1.J(UZ.SMOKE_NORMAL, d3 + d7 * (double)((DZ)((Object)e2)).getFrontOffsetX(), d4 + d6, d5 + d7 * (double)((DZ)((Object)e2)).getFrontOffsetZ(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            v1.J(UZ.FLAME, d3 + d7 * (double)((DZ)((Object)e2)).getFrontOffsetX(), d4 + d6, d5 + d7 * (double)((DZ)((Object)e2)).getFrontOffsetZ(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            return;
        }
        void v2 = d2;
        v2.J(UZ.SMOKE_NORMAL, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        v2.J(UZ.FLAME, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
    }

    public BlockTorch() {
        BlockTorch a2;
        BlockTorch blockTorch = a2;
        super(Material.circuits);
        blockTorch.J(blockTorch.blockState.J().J(FACING, DZ.UP));
        blockTorch.J(vRa.d != 0);
        a2.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF2) {
        void a2;
        Block c2 = gg2;
        BlockTorch b2 = this;
        if (Gg.J((I)c2, (XF)a2)) {
            return vRa.d != 0;
        }
        if ((c2 = c2.J((XF)a2).J()) instanceof BlockFence || c2 == QFa.ye || BlockCustomWall.WALL_BLOCKS.contains(c2) || c2 == QFa.VA) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(Gg gg2, XF xF2, DZ dZ2) {
        void c2;
        void a2;
        Object d2 = xF2;
        BlockTorch b2 = this;
        d2 = ((XF)((Object)d2)).offset(a2.getOpposite());
        if (a2.getAxis().isHorizontal() && c2.J((XF)((Object)d2), vRa.d != 0) || a2.equals((Object)DZ.UP) && b2.l((Gg)c2, (XF)((Object)d2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockTorch blockTorch = this;
        int b2 = uSa.E;
        switch (BlockTorch$2.$SwitchMap$net$minecraft$util$EnumFacing[a2.J(FACING).ordinal()]) {
            case 1: {
                return b2 |= vRa.d;
            }
            case 2: {
                return b2 |= uqa.g;
            }
            case 3: {
                return b2 |= yRa.d;
            }
            case 4: {
                return b2 |= AQa.P;
            }
        }
        return b2 |= tTa.h;
    }
}

