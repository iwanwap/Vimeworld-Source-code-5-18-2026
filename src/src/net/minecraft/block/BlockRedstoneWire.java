/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  QFa
 *  UZ
 *  Ypa
 *  Zpa
 *  bpa
 *  eAa
 *  ez
 *  hTa
 *  pqa
 *  qta
 *  vRa
 *  xy
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneWire$EnumAttachPosition;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockRedstoneWire
extends Block {
    private final Set<XF> blocksNeedingUpdate;
    private boolean canProvidePower;
    public static final PropertyInteger POWER;
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> SOUTH;
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> NORTH;
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> WEST;
    public static final PropertyEnum<BlockRedstoneWire$EnumAttachPosition> EAST;

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF, IBlockState iBlockState, DZ dZ) {
        void a2;
        void b22;
        BlockRedstoneWire blockRedstoneWire = this;
        if (!blockRedstoneWire.canProvidePower) {
            return uSa.E;
        }
        int b22 = b22.J(POWER);
        if (b22 == 0) {
            return uSa.E;
        }
        if (a2 == DZ.UP) {
            return b22;
        }
        EnumSet<DZ> e2 = EnumSet.noneOf(DZ.class);
        for (DZ dZ2 : LX.HORIZONTAL) {
            void c2;
            void d2;
            if (!blockRedstoneWire.l((I)d2, (XF)c2, dZ2)) continue;
            e2.add(dZ2);
        }
        if (a2.getAxis().isHorizontal() && e2.isEmpty()) {
            return b22;
        }
        if (e2.contains(a2) && !e2.contains((Object)a2.rotateYCCW()) && !e2.contains((Object)a2.rotateY())) {
            return b22;
        }
        return uSa.E;
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    public static boolean f(I i2, XF xF) {
        Object b2 = xF;
        I a2 = i2;
        return BlockRedstoneWire.J(a2.J((XF)((Object)b2)));
    }

    public static boolean J(IBlockState a2) {
        return BlockRedstoneWire.J(a2, (DZ)null);
    }

    public BlockRedstoneWire() {
        BlockRedstoneWire a2;
        BlockRedstoneWire blockRedstoneWire = a2;
        super(Material.circuits);
        blockRedstoneWire.canProvidePower = vRa.d;
        blockRedstoneWire.blocksNeedingUpdate = Sets.newHashSet();
        blockRedstoneWire.J(blockRedstoneWire.blockState.J().J(NORTH, BlockRedstoneWire$EnumAttachPosition.NONE).J(EAST, BlockRedstoneWire$EnumAttachPosition.NONE).J(SOUTH, BlockRedstoneWire$EnumAttachPosition.NONE).J(WEST, BlockRedstoneWire$EnumAttachPosition.NONE).J(POWER, uSa.E));
        blockRedstoneWire.J(JPa.N, JPa.N, JPa.N, pqa.r, rRa.T, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(I i2, XF xF, DZ dZ) {
        void c2;
        void a2;
        XF d22 = xF;
        BlockRedstoneWire b2 = this;
        XF xF2 = d22.offset((DZ)a2);
        void v0 = c2;
        IBlockState iBlockState = v0.J(xF2);
        Block block = iBlockState.J();
        boolean d22 = block.A();
        if (!v0.J(d22.up()).J().A() && d22 && BlockRedstoneWire.f((I)c2, xF2.up())) {
            return vRa.d != 0;
        }
        if (BlockRedstoneWire.J(iBlockState, (DZ)a2)) {
            return vRa.d != 0;
        }
        if (block == QFa.cB && iBlockState.J(BlockRedstoneDiode.FACING) == a2) {
            return vRa.d != 0;
        }
        if (!d22 && BlockRedstoneWire.f((I)c2, xF2.down())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        void b222;
        BlockRedstoneWire e22 = gg2;
        BlockRedstoneWire d2 = this;
        int b222 = b222.J(POWER);
        if (b222 != 0) {
            void a2;
            void c22;
            void v0 = c22;
            double d3 = (double)v0.getX() + kTa.B + ((double)a2.nextFloat() - kTa.B) * iSa.P;
            double d4 = (float)v0.getY() + rRa.T;
            double d5 = (double)v0.getZ() + kTa.B + ((double)a2.nextFloat() - kTa.B) * iSa.P;
            float e22 = (float)b222 / qta.D;
            float c22 = e22 * Ora.D + Xpa.R;
            float f2 = e22;
            float b222 = Math.max(JPa.N, f2 * f2 * ZSa.q - MQa.L);
            float f3 = e22;
            e22 = Math.max(JPa.N, f3 * f3 * Ora.D - ZSa.q);
            e22.J(UZ.REDSTONE, d3, d4, d5, c22, b222, e22, new int[uSa.E]);
        }
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneWire a2 = this;
        return b2.J(POWER);
    }

    /*
     * WARNING - void declaration
     */
    private IBlockState J(Gg gg2, XF xF, IBlockState iBlockState) {
        IBlockState a2;
        void c2;
        BlockRedstoneWire b2;
        Object d2 = xF;
        BlockRedstoneWire blockRedstoneWire = b2 = this;
        Object object = d2;
        a2 = blockRedstoneWire.J((Gg)c2, (XF)((Object)object), (XF)((Object)object), a2);
        d2 = Lists.newArrayList(blockRedstoneWire.blocksNeedingUpdate);
        blockRedstoneWire.blocksNeedingUpdate.clear();
        d2 = d2.iterator();
        Object object2 = d2;
        while (object2.hasNext()) {
            XF xF2 = (XF)((Object)d2.next());
            object2 = d2;
            c2.f(xF2, (Block)b2);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        DZ[] dZArray = this;
        void v0 = c2;
        super.l((Gg)v0, (XF)b2, (IBlockState)a2);
        if (!v0.e) {
            int n2;
            Object d2 = DZ.values();
            int n3 = ((DZ[])d2).length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                DZ dZ = d2[n2];
                c2.f(b2.offset(dZ), (Block)dZArray);
                n4 = ++n2;
            }
            super.J((Gg)c2, (XF)b2, (IBlockState)a2);
            d2 = LX.HORIZONTAL.iterator();
            Object object = d2;
            while (object.hasNext()) {
                Object e2 = d2.next();
                super.f((Gg)c2, b2.offset((DZ)((Object)e2)));
                object = d2;
            }
            for (Object e3 : LX.HORIZONTAL) {
                XF xF2 = b2.offset((DZ)((Object)e3));
                DZ[] dZArray2 = dZArray;
                if (c2.J(xF2).J().A()) {
                    super.f((Gg)c2, xF2.up());
                    continue;
                }
                super.f((Gg)c2, xF2.down());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF) {
        void a2;
        void b2;
        BlockRedstoneWire blockRedstoneWire = this;
        if (b2.J((XF)a2).J() == blockRedstoneWire) {
            int c2;
            b2.f((XF)a2, (Block)blockRedstoneWire);
            DZ[] dZArray = DZ.values();
            int n2 = dZArray.length;
            int n3 = c2 = uSa.E;
            while (n3 < n2) {
                DZ dZ = dZArray[c2];
                b2.f(a2.offset(dZ), (Block)blockRedstoneWire);
                n3 = ++c2;
            }
        }
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockRedstoneWire a2 = this;
        return a2.J().J(POWER, b2);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockRedstoneWire a2 = this;
        return Gea.zc;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        void a2;
        void b2;
        Object d2 = iBlockState;
        BlockRedstoneWire c2 = this;
        d2 = d2.J(WEST, c2.J((I)b2, (XF)a2, DZ.WEST));
        d2 = d2.J(EAST, c2.J((I)b2, (XF)a2, DZ.EAST));
        d2 = d2.J(NORTH, c2.J((I)b2, (XF)a2, DZ.NORTH));
        d2 = d2.J(SOUTH, c2.J((I)b2, (XF)a2, DZ.SOUTH));
        return d2;
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockRedstoneWire a2 = this;
        return Gea.zc;
    }

    @Override
    public BlockState J() {
        BlockRedstoneWire a2;
        IProperty[] iPropertyArray = new IProperty[tTa.h];
        iPropertyArray[uSa.E] = NORTH;
        iPropertyArray[vRa.d] = EAST;
        iPropertyArray[uqa.g] = SOUTH;
        iPropertyArray[yRa.d] = WEST;
        iPropertyArray[AQa.P] = POWER;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF) {
        void b2;
        XF c2 = xF;
        BlockRedstoneWire a2 = this;
        if (Gg.J((I)b2, (XF)c2.down()) || b2.J(c2.down()).J() == QFa.rc) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF, int n2) {
        void b2;
        void c2;
        BlockRedstoneWire blockRedstoneWire = this;
        IBlockState d2 = c2.J((XF)b2);
        if (d2.J() != blockRedstoneWire) {
            void a2;
            return super.J((I)c2, (XF)b2, (int)a2);
        }
        return blockRedstoneWire.J(d2.J(POWER));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState) {
        void c2;
        Iterator<DZ> d2 = iBlockState;
        BlockRedstoneWire a2 = this;
        if (!c2.e) {
            DZ dZ;
            DZ dZ2;
            void b2;
            a2.J((Gg)c2, (XF)b2, (IBlockState)((Object)d2));
            d2 = LX.VERTICAL.iterator();
            Iterator<DZ> iterator = d2;
            while (iterator.hasNext()) {
                dZ2 = d2.next();
                c2.f(b2.offset(dZ2), (Block)a2);
                iterator = d2;
            }
            Iterator<DZ> iterator2 = d2 = LX.HORIZONTAL.iterator();
            while (iterator2.hasNext()) {
                dZ = dZ2 = d2.next();
                iterator2 = d2;
                a2.f((Gg)c2, b2.offset(dZ));
            }
            d2 = LX.HORIZONTAL.iterator();
            while (d2.hasNext()) {
                dZ = dZ2 = d2.next();
                XF xF2 = b2.offset(dZ);
                BlockRedstoneWire blockRedstoneWire = a2;
                if (c2.J(xF2).J().A()) {
                    blockRedstoneWire.f((Gg)c2, xF2.up());
                    continue;
                }
                blockRedstoneWire.f((Gg)c2, xF2.down());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        BlockRedstoneWire e2 = gg2;
        BlockRedstoneWire d2 = this;
        if (!((Gg)e2).e) {
            void b2;
            void c2;
            if (d2.J((Gg)e2, (XF)c2)) {
                d2.J((Gg)e2, (XF)c2, (IBlockState)b2);
                return;
            }
            d2.J((Gg)e2, (XF)c2, (IBlockState)b2, uSa.E);
            e2.G((XF)c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private int J(Gg gg2, XF xF, int n2) {
        void a2;
        void b2;
        BlockRedstoneWire d22 = gg2;
        BlockRedstoneWire c2 = this;
        if (d22.J((XF)b2).J() != c2) {
            return (int)a2;
        }
        int d22 = d22.J((XF)b2).J(POWER);
        if (d22 > a2) {
            return d22;
        }
        return (int)a2;
    }

    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockRedstoneWire a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2) {
        void a322;
        BlockRedstoneWire blockRedstoneWire = this;
        float b22 = (float)a322 / qta.D;
        float f2 = b22 * Ora.D + Xpa.R;
        if (a322 == false) {
            f2 = bpa.K;
        }
        float f3 = b22;
        float a322 = f3 * f3 * ZSa.q - MQa.L;
        float f4 = b22;
        b22 = f4 * f4 * Ora.D - ZSa.q;
        if (a322 < JPa.N) {
            a322 = JPa.N;
        }
        if (b22 < JPa.N) {
            b22 = JPa.N;
        }
        int n3 = Oz.f((int)((int)(f2 * NQa.Y)), (int)uSa.E, (int)osa.Ja);
        int a322 = Oz.f((int)((int)(a322 * NQa.Y)), (int)uSa.E, (int)osa.Ja);
        int b22 = Oz.f((int)((int)(b22 * NQa.Y)), (int)uSa.E, (int)osa.Ja);
        return gsa.X | n3 << ERa.C | a322 << Yqa.i | b22;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF, IBlockState iBlockState, DZ dZ) {
        Object e2;
        void b2;
        void c2;
        void d2;
        BlockRedstoneWire blockRedstoneWire = object;
        Object object = dZ;
        BlockRedstoneWire a2 = blockRedstoneWire;
        if (!a2.canProvidePower) {
            return uSa.E;
        }
        return a2.J((I)d2, (XF)c2, (IBlockState)b2, (DZ)((Object)e2));
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private IBlockState J(Gg gg2, XF xF, XF xF2, IBlockState iBlockState) {
        int n2;
        void c2;
        void b2;
        void d2;
        IBlockState a2;
        BlockRedstoneWire blockRedstoneWire = this;
        void var5_7 = a2;
        int n3 = var5_7.J(POWER);
        int e2 = uSa.E;
        e2 = blockRedstoneWire.J((Gg)d2, (XF)b2, e2);
        blockRedstoneWire.canProvidePower = uSa.E;
        int n4 = d2.l((XF)c2);
        blockRedstoneWire.canProvidePower = vRa.d;
        if (n4 > 0 && n4 > e2 - vRa.d) {
            e2 = n4;
        }
        int n5 = uSa.E;
        for (DZ dZ : LX.HORIZONTAL) {
            int n6;
            XF xF3 = c2.offset(dZ);
            int n7 = n6 = xF3.getX() != b2.getX() || xF3.getZ() != b2.getZ() ? vRa.d : uSa.E;
            if (n6 != 0) {
                n5 = blockRedstoneWire.J((Gg)d2, xF3, n5);
            }
            if (d2.J(xF3).J().A() && !d2.J(c2.up()).J().A()) {
                if (n6 == 0 || c2.getY() < b2.getY()) continue;
                n5 = blockRedstoneWire.J((Gg)d2, xF3.up(), n5);
                continue;
            }
            if (d2.J(xF3).J().A() || n6 == 0 || c2.getY() > b2.getY()) continue;
            n5 = blockRedstoneWire.J((Gg)d2, xF3.down(), n5);
        }
        if (n5 > e2) {
            e2 = n5 - vRa.d;
            n2 = n4;
        } else if (e2 > 0) {
            n2 = n4;
            --e2;
        } else {
            e2 = uSa.E;
            n2 = n4;
        }
        if (n2 > e2 - vRa.d) {
            e2 = n4;
        }
        if (n3 != e2) {
            int n8;
            a2 = a2.J(POWER, e2);
            if (d2.J((XF)c2) == var5_7) {
                d2.J((XF)c2, a2, uqa.g);
            }
            blockRedstoneWire.blocksNeedingUpdate.add((XF)c2);
            DZ[] dZArray = DZ.values();
            int n9 = dZArray.length;
            int n10 = n8 = uSa.E;
            while (n10 < n9) {
                DZ dZ = dZArray[n8];
                blockRedstoneWire.blocksNeedingUpdate.add(c2.offset(dZ));
                n10 = ++n8;
            }
        }
        return a2;
    }

    static {
        NORTH = PropertyEnum.J(hTa.d, BlockRedstoneWire$EnumAttachPosition.class);
        EAST = PropertyEnum.J(Zpa.D, BlockRedstoneWire$EnumAttachPosition.class);
        SOUTH = PropertyEnum.J(vsa.k, BlockRedstoneWire$EnumAttachPosition.class);
        WEST = PropertyEnum.J(NTa.U, BlockRedstoneWire$EnumAttachPosition.class);
        POWER = PropertyInteger.J(APa.S, uSa.E, Ypa.A);
    }

    @Override
    public boolean C() {
        BlockRedstoneWire a2;
        return a2.canProvidePower;
    }

    /*
     * WARNING - void declaration
     */
    private BlockRedstoneWire$EnumAttachPosition J(I i2, XF xF, DZ dZ) {
        void c2;
        void a2;
        void b2;
        BlockRedstoneWire blockRedstoneWire = this;
        XF d2 = b2.offset((DZ)a2);
        void v0 = c2;
        Block block = v0.J(b2.offset((DZ)a2)).J();
        if (!(BlockRedstoneWire.J(v0.J(d2), (DZ)a2) || !block.d() && BlockRedstoneWire.J(c2.J(d2.down())))) {
            if (!c2.J(b2.up()).J().d() && block.d() && BlockRedstoneWire.J(c2.J(d2.up()))) {
                return BlockRedstoneWire$EnumAttachPosition.UP;
            }
            return BlockRedstoneWire$EnumAttachPosition.NONE;
        }
        return BlockRedstoneWire$EnumAttachPosition.SIDE;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(IBlockState iBlockState, DZ dZ) {
        void a2;
        IBlockState iBlockState2 = iBlockState;
        Block b2 = iBlockState2.J();
        if (b2 == QFa.pa) {
            return vRa.d != 0;
        }
        if (QFa.t.C(b2)) {
            DZ dZ2 = iBlockState2.J(BlockRedstoneRepeater.FACING);
            if (dZ2 == a2 || dZ2.getOpposite() == a2) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2.C() && a2 != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

