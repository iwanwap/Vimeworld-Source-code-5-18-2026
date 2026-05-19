/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DX
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  Pba
 *  QFa
 *  UZ
 *  Ypa
 *  Yra
 *  Ysa
 *  aSa
 *  eAa
 *  ez
 *  kta
 *  pqa
 *  uQa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import com.google.common.cache.LoadingCache;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockPortal$Size;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockPortal
extends BlockBreakable {
    public static final PropertyEnum<RX> AXIS;

    @Override
    public BlockState J() {
        BlockPortal a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = AXIS;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPortal a2 = this;
        return BlockPortal.J(b2.J(AXIS));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void a2;
        void c22;
        vL d2;
        Object e2 = iBlockState;
        BlockPortal b2 = this;
        void v0 = d2;
        super.f((Gg)v0, (XF)c22, (IBlockState)e2, (Random)a2);
        if (v0.F.J() && d2.J().f(uQa.Ga) && a2.nextInt(aSa.k) < d2.J().getDifficultyId()) {
            void v1 = c22;
            int c22 = v1.getY();
            e2 = v1;
            void v2 = d2;
            while (!Gg.J((I)v2, (XF)((Object)e2)) && e2.getY() > 0) {
                e2 = ((XF)((Object)e2)).down();
                v2 = d2;
            }
            if (c22 > 0 && !d2.J(((XF)((Object)e2)).up()).J().A() && (d2 = Pba.J((Gg)d2, (int)KSa.x, (double)((double)e2.getX() + kTa.B), (double)((double)e2.getY() + Yra.f), (double)((double)e2.getZ() + kTa.B))) != null) {
                d2.U = d2.C();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        int b2;
        void c2;
        void d2;
        Random e2;
        BlockPortal blockPortal = random2;
        Random random2 = random;
        BlockPortal a2 = blockPortal;
        if (e2.nextInt(ySa.T) == 0) {
            d2.J((double)c2.getX() + kTa.B, (double)c2.getY() + kTa.B, (double)c2.getZ() + kTa.B, Ysa.A, MQa.L, e2.nextFloat() * Xpa.R + xSa.la, uSa.E != 0);
        }
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            void v5;
            void v2 = c2;
            double d3 = (float)v2.getX() + e2.nextFloat();
            Random random3 = e2;
            double d4 = (float)v2.getY() + random3.nextFloat();
            double d5 = (float)v2.getZ() + e2.nextFloat();
            Object object = e2;
            double d6 = ((double)((Random)object).nextFloat() - kTa.B) * kTa.B;
            double d7 = ((double)((Random)object).nextFloat() - kTa.B) * kTa.B;
            double d8 = ((double)((Random)object).nextFloat() - kTa.B) * kTa.B;
            int n3 = random3.nextInt(uqa.g) * uqa.g - vRa.d;
            if (d2.J(c2.west()).J() != a2 && d2.J(c2.east()).J() != a2) {
                v5 = d2;
                d3 = (double)c2.getX() + kTa.B + VPa.W * (double)n3;
                d6 = e2.nextFloat() * kta.v * (float)n3;
            } else {
                d5 = (double)c2.getZ() + kTa.B + VPa.W * (double)n3;
                v5 = d2;
                d8 = e2.nextFloat() * kta.v * (float)n3;
            }
            int n4 = --1;
            v5.J(UZ.PORTAL, d3, d4, d5, d6, d7, d8, new int[uSa.E]);
            n2 = ++b2;
        }
    }

    @Override
    public ez J() {
        return ez.TRANSLUCENT;
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockPortal a2 = this;
        return null;
    }

    @Override
    public void J(I i2, XF xF2) {
        RX b2;
        Object c22 = xF2;
        BlockPortal a2 = this;
        b2 = b2.J((XF)((Object)c22)).J(AXIS);
        float c22 = Mqa.N;
        float f2 = Mqa.N;
        if (b2 == RX.X) {
            c22 = MQa.L;
        }
        if (b2 == RX.Z) {
            f2 = MQa.L;
        }
        a2.J(MQa.L - c22, JPa.N, MQa.L - f2, MQa.L + c22, pqa.r, MQa.L + f2);
    }

    public BlockPortal() {
        BlockPortal a2;
        BlockPortal blockPortal = a2;
        super(Material.portal, uSa.E != 0);
        blockPortal.J(blockPortal.blockState.J().J(AXIS, RX.X));
        blockPortal.J(vRa.d != 0);
    }

    static {
        Enum[] enumArray = new RX[uqa.g];
        enumArray[uSa.E] = RX.X;
        enumArray[vRa.d] = RX.Z;
        AXIS = PropertyEnum.J((String)Ypa.V, RX.class, (Enum[])enumArray);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockPortal a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF2) {
        void a2;
        Object c2 = gg2;
        BlockPortal b2 = this;
        BlockPortal$Size blockPortal$Size = new BlockPortal$Size((Gg)c2, (XF)a2, RX.X);
        if (blockPortal$Size.J() && BlockPortal$Size.J(blockPortal$Size) == 0) {
            blockPortal$Size.J();
            return vRa.d != 0;
        }
        if (((BlockPortal$Size)(c2 = new BlockPortal$Size((Gg)c2, (XF)a2, RX.Z))).J() && BlockPortal$Size.J((BlockPortal$Size)c2) == 0) {
            ((BlockPortal$Size)c2).J();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        BlockPortal e2;
        BlockPortal blockPortal = blockPortal2;
        BlockPortal blockPortal2 = vL2;
        BlockPortal a2 = blockPortal;
        if (((vL)e2).ja == null && ((vL)e2).Aa == null) {
            void c2;
            e2.J((XF)c2);
        }
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPortal a2 = this;
        return a2.J().J(AXIS, (b2 & yRa.d) == uqa.g ? RX.Z : RX.X);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    public BlockPattern$PatternHelper J(Gg gg2, XF xF2) {
        DX dX2;
        XF xF3;
        int n2;
        Object object;
        int n3;
        DZ a2;
        int[] b2;
        BlockPortal blockPortal = this;
        RX rX2 = RX.Z;
        Object c2 = new BlockPortal$Size((Gg)b2, (XF)((Object)a2), RX.X);
        LoadingCache<XF, BlockWorldState> loadingCache = BlockPattern.J((Gg)b2, vRa.d != 0);
        if (!((BlockPortal$Size)c2).J()) {
            rX2 = RX.X;
            c2 = new BlockPortal$Size((Gg)b2, (XF)((Object)a2), RX.Z);
        }
        if (!((BlockPortal$Size)c2).J()) {
            return new BlockPattern$PatternHelper((XF)((Object)a2), DZ.NORTH, DZ.UP, loadingCache, vRa.d, vRa.d, vRa.d);
        }
        b2 = new int[DX.values().length];
        Object object2 = c2;
        a2 = BlockPortal$Size.J((BlockPortal$Size)object2).rotateYCCW();
        XF xF4 = BlockPortal$Size.J((BlockPortal$Size)object2).up(((BlockPortal$Size)c2).f() - vRa.d);
        DX dX3 = DX.values();
        int n4 = ((DX[])dX3).length;
        int n5 = n3 = uSa.E;
        while (n5 < n4) {
            DX dX4;
            XF xF5;
            DX dX5 = dX3[n3];
            if (a2.getAxisDirection() == dX5) {
                xF5 = xF4;
                dX4 = dX5;
            } else {
                xF5 = xF4.offset(BlockPortal$Size.J((BlockPortal$Size)c2), ((BlockPortal$Size)c2).l() - vRa.d);
                dX4 = dX5;
            }
            object = new BlockPattern$PatternHelper(xF5, DZ.func_181076_a(dX4, rX2), DZ.UP, loadingCache, ((BlockPortal$Size)c2).l(), ((BlockPortal$Size)c2).f(), vRa.d);
            int n6 = uSa.E;
            while (n6 < ((BlockPortal$Size)c2).l()) {
                int n7;
                int n8 = uSa.E;
                while (n8 < ((BlockPortal$Size)c2).f()) {
                    int n9;
                    BlockWorldState blockWorldState = ((BlockPattern$PatternHelper)object).J(n7, n9, vRa.d);
                    if (blockWorldState.J() != null && blockWorldState.J().J().J() != Material.air) {
                        int n10 = dX5.ordinal();
                        b2[n10] = b2[n10] + vRa.d;
                    }
                    n8 = ++n9;
                }
                n6 = ++n7;
            }
            n5 = ++n3;
        }
        dX3 = DX.POSITIVE;
        DX[] dXArray = DX.values();
        n3 = dXArray.length;
        int n11 = n2 = uSa.E;
        while (n11 < n3) {
            object = dXArray[n2];
            if (b2[object.ordinal()] < b2[dX3.ordinal()]) {
                dX3 = object;
            }
            n11 = ++n2;
        }
        if (a2.getAxisDirection() == dX3) {
            xF3 = xF4;
            dX2 = dX3;
        } else {
            xF3 = xF4.offset(BlockPortal$Size.J((BlockPortal$Size)c2), ((BlockPortal$Size)c2).l() - vRa.d);
            dX2 = dX3;
        }
        return new BlockPattern$PatternHelper(xF3, DZ.func_181076_a(dX2, rX2), DZ.UP, loadingCache, ((BlockPortal$Size)c2).l(), ((BlockPortal$Size)c2).f(), vRa.d);
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockPortal a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void a2;
        void c22;
        XF d2 = xF2;
        BlockPortal b2 = this;
        RX rX2 = null;
        void v0 = c22;
        IBlockState iBlockState = v0.J(d2);
        if (v0.J(d2).J() == b2) {
            rX2 = iBlockState.J(AXIS);
            if (rX2 == null) {
                return uSa.E != 0;
            }
            if (rX2 == RX.Z && a2 != DZ.EAST && a2 != DZ.WEST) {
                return uSa.E != 0;
            }
            if (rX2 == RX.X && a2 != DZ.SOUTH && a2 != DZ.NORTH) {
                return uSa.E != 0;
            }
        }
        int n2 = c22.J(d2.west()).J() == b2 && c22.J(d2.west(uqa.g)).J() != b2 ? vRa.d : uSa.E;
        int n3 = c22.J(d2.east()).J() == b2 && c22.J(d2.east(uqa.g)).J() != b2 ? vRa.d : uSa.E;
        int n4 = c22.J(d2.north()).J() == b2 && c22.J(d2.north(uqa.g)).J() != b2 ? vRa.d : uSa.E;
        int n5 = c22.J(d2.south()).J() == b2 && c22.J(d2.south(uqa.g)).J() != b2 ? vRa.d : uSa.E;
        int c22 = n2 != 0 || n3 != 0 || rX2 == RX.X ? vRa.d : uSa.E;
        int n6 = d2 = n4 != 0 || n5 != 0 || rX2 == RX.Z ? vRa.d : uSa.E;
        if (c22 != 0 && a2 == DZ.WEST) {
            return vRa.d != 0;
        }
        if (c22 != 0 && a2 == DZ.EAST) {
            return vRa.d != 0;
        }
        if (d2 != 0 && a2 == DZ.NORTH) {
            return vRa.d != 0;
        }
        if (d2 != 0 && a2 == DZ.SOUTH) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        Block e2;
        void c2;
        void d2;
        RX b2;
        BlockPortal blockPortal = block2;
        Block block2 = block;
        BlockPortal a2 = blockPortal;
        if ((b2 = b2.J(AXIS)) == RX.X) {
            e2 = new BlockPortal$Size((Gg)d2, (XF)c2, RX.X);
            if (!((BlockPortal$Size)((Object)e2)).J() || BlockPortal$Size.J((BlockPortal$Size)((Object)e2)) < BlockPortal$Size.f((BlockPortal$Size)((Object)e2)) * BlockPortal$Size.l((BlockPortal$Size)((Object)e2))) {
                d2.J((XF)c2, QFa.HF.J());
                return;
            }
        } else if (!(b2 != RX.Z || ((BlockPortal$Size)((Object)(e2 = new BlockPortal$Size((Gg)d2, (XF)c2, RX.Z)))).J() && BlockPortal$Size.J((BlockPortal$Size)((Object)e2)) >= BlockPortal$Size.f((BlockPortal$Size)((Object)e2)) * BlockPortal$Size.l((BlockPortal$Size)((Object)e2)))) {
            d2.J((XF)c2, QFa.HF.J());
        }
    }

    public static int J(RX a2) {
        if (a2 == RX.X) {
            return vRa.d;
        }
        if (a2 == RX.Z) {
            return uqa.g;
        }
        return uSa.E;
    }
}

