/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  MQa
 *  NTa
 *  QFa
 *  UZ
 *  XSa
 *  XTa
 *  Ypa
 *  Zpa
 *  Zta
 *  aSa
 *  bRa
 *  bpa
 *  ez
 *  hTa
 *  hz
 *  pqa
 *  pua
 *  vRa
 *  vpa
 *  wra
 *  xOa
 *  xy
 */
package net.minecraft.block;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.CustomBlock;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockFire
extends Block {
    public static final PropertyBool NORTH;
    public static final PropertyBool SOUTH;
    public static final PropertyBool FLIP;
    public static final PropertyBool WEST;
    private final Map<Block, Integer> encouragements;
    public static final PropertyBool EAST;
    public static final PropertyBool ALT;
    private final Map<Block, Integer> flammabilities;
    public static final PropertyInteger AGE;
    public static final PropertyInteger UPPER;

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, XF xF2, int n2, Random random, int n3) {
        void c22;
        Random f22;
        void d2;
        void e2;
        BlockFire blockFire = random2;
        Random random2 = random;
        BlockFire b2 = blockFire;
        int n4 = b2.f(e2.J((XF)d2).J());
        if (f22.nextInt((int)c22) < n4) {
            IBlockState iBlockState;
            void a2;
            IBlockState c22 = e2.J((XF)d2);
            if (f22.nextInt((int)(a2 + NTa.C)) < tTa.h && !e2.i((XF)d2)) {
                int f22 = a2 + f22.nextInt(tTa.h) / AQa.P;
                if (f22 > Ypa.A) {
                    f22 = Ypa.A;
                }
                e2.J((XF)d2, b2.J().J(AGE, f22), yRa.d);
                iBlockState = c22;
            } else {
                e2.G((XF)d2);
                iBlockState = c22;
            }
            if (iBlockState.J() == QFa.Lc) {
                QFa.Lc.J((Gg)e2, (XF)d2, c22.J(BlockTNT.EXPLODE, vRa.d != 0));
            }
        }
    }

    @Override
    public BlockState J() {
        BlockFire a2;
        IProperty[] iPropertyArray = new IProperty[Yqa.i];
        iPropertyArray[uSa.E] = AGE;
        iPropertyArray[vRa.d] = NORTH;
        iPropertyArray[uqa.g] = EAST;
        iPropertyArray[yRa.d] = SOUTH;
        iPropertyArray[AQa.P] = WEST;
        iPropertyArray[tTa.h] = UPPER;
        iPropertyArray[uua.p] = FLIP;
        iPropertyArray[XTa.W] = ALT;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        XF e2 = xF2;
        BlockFire c2 = this;
        if (!Gg.J((I)d2, (XF)e2.down()) && !c2.C((Gg)d2, e2)) {
            d2.G(e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockFire e2 = gg2;
        BlockFire d2 = this;
        if (e2.J().f(bpa.Da)) {
            void a2;
            IBlockState b2;
            Block block;
            int n2;
            void c2;
            if (!d2.J((Gg)e2, (XF)c2)) {
                e2.G((XF)c2);
            }
            int n3 = n2 = (block = e2.J(c2.down()).J()) == QFa.GA ? vRa.d : uSa.E;
            if (((Gg)e2).F instanceof hz && block == QFa.bg) {
                n2 = vRa.d;
            }
            if (n2 == 0 && e2.l() && d2.l((Gg)e2, (XF)c2)) {
                e2.G((XF)c2);
                return;
            }
            int n4 = b2.J(AGE);
            if (n4 < Ypa.A) {
                b2 = b2.J(AGE, n4 + a2.nextInt(yRa.d) / uqa.g);
                e2.J((XF)c2, b2, AQa.P);
            }
            BlockFire blockFire = d2;
            e2.J((XF)c2, blockFire, blockFire.J((Gg)e2) + a2.nextInt(NTa.C));
            if (n2 == 0) {
                if (!d2.C((Gg)e2, (XF)c2)) {
                    if (!Gg.J((I)e2, (XF)c2.down()) || n4 > yRa.d) {
                        e2.G((XF)c2);
                    }
                    return;
                }
                if (!d2.f((I)e2, c2.down()) && n4 == Ypa.A && a2.nextInt(AQa.P) == 0) {
                    e2.G((XF)c2);
                    return;
                }
            }
            n2 = e2.A((XF)c2) ? 1 : 0;
            int n5 = uSa.E;
            if (n2 != 0) {
                n5 = bRa.L;
            }
            BlockFire blockFire2 = e2;
            void v3 = c2;
            BlockFire blockFire3 = d2;
            BlockFire blockFire4 = e2;
            d2.J((Gg)blockFire4, c2.east(), vpa.Ja + n5, (Random)a2, n4);
            blockFire3.J((Gg)blockFire4, c2.west(), vpa.Ja + n5, (Random)a2, n4);
            blockFire3.J((Gg)e2, c2.down(), Zta.w + n5, (Random)a2, n4);
            d2.J((Gg)e2, v3.up(), Zta.w + n5, (Random)a2, n4);
            d2.J((Gg)blockFire2, v3.north(), vpa.Ja + n5, (Random)a2, n4);
            d2.J((Gg)blockFire2, c2.south(), vpa.Ja + n5, (Random)a2, n4);
            int n6 = n5 = pua.o;
            while (n6 <= vRa.d) {
                int n7 = pua.o;
                while (n7 <= vRa.d) {
                    int n8;
                    int n9 = pua.o;
                    while (n9 <= AQa.P) {
                        int n10;
                        if (n5 != 0 || n10 != 0 || n8 != 0) {
                            XF xF3;
                            int n11;
                            int n12 = ySa.T;
                            if (n10 > vRa.d) {
                                n12 += (n10 - vRa.d) * ySa.T;
                            }
                            if ((n11 = d2.l((Gg)e2, xF3 = c2.add(n5, n10, n8))) > 0) {
                                n11 = (n11 + wra.P + e2.J().getDifficultyId() * XTa.W) / (n4 + Fsa.d);
                                if (n2 != 0) {
                                    n11 /= uqa.g;
                                }
                                if (!(n11 <= 0 || a2.nextInt(n12) > n11 || e2.l() && d2.l((Gg)e2, xF3))) {
                                    n12 = n4 + a2.nextInt(tTa.h) / AQa.P;
                                    if (n12 > Ypa.A) {
                                        n12 = Ypa.A;
                                    }
                                    e2.J(xF3, b2.J(AGE, n12), yRa.d);
                                }
                            }
                        }
                        n9 = ++n10;
                    }
                    n7 = ++n8;
                }
                n6 = ++n5;
            }
        }
    }

    public BlockFire() {
        BlockFire a2;
        BlockFire blockFire = a2;
        super(Material.fire);
        blockFire.encouragements = Maps.newIdentityHashMap();
        blockFire.flammabilities = Maps.newIdentityHashMap();
        blockFire.J(blockFire.blockState.J().J(AGE, uSa.E).J(FLIP, uSa.E != 0).J(ALT, uSa.E != 0).J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0).J(UPPER, uSa.E));
        blockFire.J(vRa.d != 0);
    }

    private int l(Block block) {
        Object b2 = block;
        BlockFire a2 = this;
        if ((b2 = a2.encouragements.get(b2)) == null) {
            return uSa.E;
        }
        return (Integer)b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        BlockFire d2 = gg2;
        BlockFire c2 = this;
        if (((Gg)d2).F.J() > 0 || !QFa.rF.l((Gg)d2, (XF)b2)) {
            if (!Gg.J((I)d2, (XF)b2.down()) && !c2.C((Gg)d2, (XF)b2)) {
                d2.G((XF)b2);
                return;
            }
            BlockFire blockFire = c2;
            d2.J((XF)b2, blockFire, blockFire.J((Gg)d2) + ((Gg)d2).v.nextInt(NTa.C));
        }
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFire a2 = this;
        return MapColor.tntColor;
    }

    private int f(Block block) {
        Object b2 = block;
        BlockFire a2 = this;
        if ((b2 = a2.flammabilities.get(b2)) == null) {
            return uSa.E;
        }
        return (Integer)b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Block block, int n2, int n3) {
        void a2;
        void b2;
        Block d2 = block;
        BlockFire c2 = this;
        c2.encouragements.put(d2, (int)b2);
        c2.flammabilities.put(d2, (int)a2);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFire a2 = this;
        return b2.J(AGE);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockFire a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockFire a2 = this;
        if (Gg.J((I)b2, (XF)c2.down()) || a2.C((Gg)b2, c2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public int J(Gg gg2) {
        BlockFire b2 = gg2;
        BlockFire a2 = this;
        return Fsa.d;
    }

    @Override
    public boolean j() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean C(Gg gg2, XF xF2) {
        int c2;
        BlockFire blockFire = this;
        DZ[] dZArray = DZ.values();
        int n2 = dZArray.length;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            void a2;
            void b2;
            DZ dZ2 = dZArray[c2];
            if (blockFire.f((I)b2, a2.offset(dZ2))) {
                return vRa.d != 0;
            }
            n3 = ++c2;
        }
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockFire a2 = this;
        return a2.J().J(AGE, b2);
    }

    static {
        AGE = PropertyInteger.J(tSa.v, uSa.E, Ypa.A);
        FLIP = PropertyBool.J(xOa.A);
        ALT = PropertyBool.J(gua.Z);
        NORTH = PropertyBool.J(hTa.d);
        EAST = PropertyBool.J(Zpa.D);
        SOUTH = PropertyBool.J(vsa.k);
        WEST = PropertyBool.J(NTa.U);
        UPPER = PropertyInteger.J(XSa.y, uSa.E, uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void b2;
        XF d2 = xF2;
        BlockFire a2 = this;
        XF xF3 = d2;
        int n2 = xF3.getX();
        int n3 = xF3.getY();
        int n4 = xF3.getZ();
        if (!Gg.J((I)b2, (XF)d2.down()) && !QFa.ic.f((I)b2, d2.down())) {
            void c2;
            int n5 = (n2 + n3 + n4 & vRa.d) == vRa.d ? vRa.d : uSa.E;
            n2 = (n2 / uqa.g + n3 / uqa.g + n4 / uqa.g & vRa.d) == vRa.d ? vRa.d : uSa.E;
            n3 = uSa.E;
            if (a2.f((I)b2, d2.up())) {
                n3 = n5 != 0 ? vRa.d : uqa.g;
            }
            return c2.J(NORTH, a2.f((I)b2, d2.north())).J(EAST, a2.f((I)b2, d2.east())).J(SOUTH, a2.f((I)b2, d2.south())).J(WEST, a2.f((I)b2, d2.west())).J(UPPER, n3).J(FLIP, n2 != 0).J(ALT, n5 != 0);
        }
        return a2.J();
    }

    public static void l() {
        QFa.ic.J(QFa.L, tTa.h, kTa.j);
        QFa.ic.J(QFa.EC, tTa.h, kTa.j);
        QFa.ic.J(QFa.eb, tTa.h, kTa.j);
        QFa.ic.J(QFa.Ad, tTa.h, kTa.j);
        QFa.ic.J(QFa.yA, tTa.h, kTa.j);
        QFa.ic.J(QFa.hb, tTa.h, kTa.j);
        QFa.ic.J(QFa.tC, tTa.h, kTa.j);
        QFa.ic.J(QFa.na, tTa.h, kTa.j);
        QFa.ic.J(QFa.Cb, tTa.h, kTa.j);
        QFa.ic.J(QFa.U, tTa.h, kTa.j);
        QFa.ic.J(QFa.Qb, tTa.h, kTa.j);
        QFa.ic.J(QFa.OA, tTa.h, kTa.j);
        QFa.ic.J(QFa.md, tTa.h, kTa.j);
        QFa.ic.J(QFa.Fc, tTa.h, kTa.j);
        QFa.ic.J(QFa.IF, tTa.h, kTa.j);
        QFa.ic.J(QFa.WA, tTa.h, kTa.j);
        QFa.ic.J(QFa.ef, tTa.h, kTa.j);
        QFa.ic.J(QFa.Uc, tTa.h, kTa.j);
        QFa.ic.J(QFa.IB, tTa.h, kTa.j);
        QFa.ic.J(QFa.UA, tTa.h, tTa.h);
        QFa.ic.J(QFa.hf, tTa.h, tTa.h);
        QFa.ic.J(QFa.nE, tTa.h, tTa.h);
        QFa.ic.J(QFa.vd, Fsa.d, Psa.M);
        QFa.ic.J(QFa.Z, Fsa.d, Psa.M);
        QFa.ic.J(QFa.gA, Fsa.d, kTa.j);
        QFa.ic.J(QFa.Lc, Ypa.A, ySa.T);
        QFa.ic.J(QFa.y, Psa.M, ySa.T);
        QFa.ic.J(QFa.Ia, Psa.M, ySa.T);
        QFa.ic.J(QFa.zc, Psa.M, ySa.T);
        QFa.ic.J(QFa.l, Psa.M, ySa.T);
        QFa.ic.J(QFa.BB, Psa.M, ySa.T);
        QFa.ic.J(QFa.cd, Fsa.d, Psa.M);
        QFa.ic.J(QFa.vC, Ypa.A, ySa.T);
        QFa.ic.J(QFa.Ea, tTa.h, tTa.h);
        QFa.ic.J(QFa.uA, Psa.M, kTa.j);
        QFa.ic.J(QFa.XE, Psa.M, kTa.j);
        QFa.ic.J(QFa.Yb, tTa.h, kTa.j);
        QFa.ic.J(QFa.Vc, tTa.h, kTa.j);
        QFa.ic.J(QFa.zd, tTa.h, tTa.h);
        QFa.ic.J(QFa.Hc, tTa.h, tTa.h);
        QFa.ic.J(QFa.Nf, tTa.h, tTa.h);
        QFa.ic.J(QFa.mB, Fsa.d, kTa.j);
        QFa.ic.J(QFa.J, tTa.h, kTa.j);
        QFa.ic.J(QFa.DA, tTa.h, kTa.j);
        QFa.ic.J(QFa.OC, tTa.h, tTa.h);
        QFa.ic.J(QFa.fc, tTa.h, tTa.h);
        QFa.ic.J(QFa.Fa, tTa.h, kTa.j);
        QFa.ic.J(QFa.a, tTa.h, kTa.j);
        QFa.ic.J(QFa.Wb, tTa.h, kTa.j);
        QFa.ic.J(QFa.ob, tTa.h, kTa.j);
        QFa.ic.J(QFa.kd, tTa.h, kTa.j);
        QFa.ic.J(QFa.ra, tTa.h, kTa.j);
        QFa.ic.J(QFa.Rb, tTa.h, kTa.j);
        QFa.ic.J(QFa.bB, tTa.h, kTa.j);
        QFa.ic.J(QFa.ua, tTa.h, kTa.j);
        QFa.ic.J(QFa.aC, tTa.h, kTa.j);
        QFa.ic.J(QFa.gF, tTa.h, kTa.j);
        QFa.ic.J(QFa.j, tTa.h, kTa.j);
        QFa.ic.J(QFa.RB, tTa.h, kTa.j);
        QFa.ic.J(QFa.Ga, tTa.h, kTa.j);
        QFa.ic.J(QFa.Mb, tTa.h, kTa.j);
        QFa.ic.J(QFa.zB, tTa.h, kTa.j);
        QFa.ic.J(QFa.AE, tTa.h, kTa.j);
        QFa.ic.J(QFa.WD, tTa.h, kTa.j);
        QFa.ic.J(QFa.ha, tTa.h, kTa.j);
        QFa.ic.J(QFa.Wc, tTa.h, kTa.j);
        QFa.ic.J(QFa.Ve, tTa.h, kTa.j);
        QFa.ic.J(QFa.f, tTa.h, kTa.j);
        QFa.ic.J(QFa.ZB, tTa.h, kTa.j);
        Iterator iterator = Block.blockRegistry.iterator();
        while (iterator.hasNext()) {
            Block block = (Block)iterator.next();
            CustomBlock customBlock = block.J();
            if (customBlock == null || customBlock.J() == 0) continue;
            QFa.ic.J(block, customBlock.J(), customBlock.C());
        }
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockFire a2 = this;
        if (b2.i(c2) || b2.i(c2.west()) || b2.i(c2.east()) || b2.i(c2.north()) || b2.i(c2.south())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(I i2, XF xF2) {
        void b2;
        BlockFire a2 = this;
        Object c2 = xF2;
        if (a2.l(b2.J((XF)((Object)c2)).J()) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        block12: {
            int b222;
            void c2;
            void d2;
            Random e2;
            block11: {
                int b222;
                double d3;
                double d4;
                double d5;
                BlockFire blockFire = random2;
                Random random2 = random;
                BlockFire a2 = blockFire;
                if (e2.nextInt(osa.c) == 0) {
                    d2.J((double)((float)c2.getX() + MQa.L), (double)((float)c2.getY() + MQa.L), (double)((float)c2.getZ() + MQa.L), KSa.Ka, pqa.r + e2.nextFloat(), e2.nextFloat() * ZSa.q + bpa.K, uSa.E != 0);
                }
                if (Gg.J((I)d2, (XF)c2.down()) || QFa.ic.f((I)d2, c2.down())) break block11;
                if (QFa.ic.f((I)d2, c2.west())) {
                    int b222;
                    int n2 = b222 = uSa.E;
                    while (n2 < uqa.g) {
                        void v2 = c2;
                        d5 = (double)v2.getX() + e2.nextDouble() * Tqa.Ia;
                        d4 = (double)v2.getY() + e2.nextDouble();
                        d3 = (double)v2.getZ() + e2.nextDouble();
                        int n3 = --1;
                        d2.J(UZ.SMOKE_LARGE, d5, d4, d3, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                        n2 = ++b222;
                    }
                }
                if (QFa.ic.f((I)d2, c2.east())) {
                    int b222;
                    int n4 = b222 = uSa.E;
                    while (n4 < uqa.g) {
                        void v5 = c2;
                        d5 = (double)(v5.getX() + vRa.d) - e2.nextDouble() * Tqa.Ia;
                        d4 = (double)v5.getY() + e2.nextDouble();
                        d3 = (double)v5.getZ() + e2.nextDouble();
                        int n5 = 3 >> 1;
                        d2.J(UZ.SMOKE_LARGE, d5, d4, d3, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                        n4 = ++b222;
                    }
                }
                if (QFa.ic.f((I)d2, c2.north())) {
                    int b222;
                    int n6 = b222 = uSa.E;
                    while (n6 < uqa.g) {
                        void v8 = c2;
                        d5 = (double)v8.getX() + e2.nextDouble();
                        d4 = (double)v8.getY() + e2.nextDouble();
                        d3 = (double)v8.getZ() + e2.nextDouble() * Tqa.Ia;
                        int n7 = --1;
                        d2.J(UZ.SMOKE_LARGE, d5, d4, d3, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                        n6 = ++b222;
                    }
                }
                if (QFa.ic.f((I)d2, c2.south())) {
                    int b222;
                    int n8 = b222 = uSa.E;
                    while (n8 < uqa.g) {
                        void v11 = c2;
                        d5 = (double)v11.getX() + e2.nextDouble();
                        d4 = (double)v11.getY() + e2.nextDouble();
                        d3 = (double)(v11.getZ() + vRa.d) - e2.nextDouble() * Tqa.Ia;
                        int n9 = 4 ^ 5;
                        d2.J(UZ.SMOKE_LARGE, d5, d4, d3, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                        n8 = ++b222;
                    }
                }
                if (!QFa.ic.f((I)d2, c2.up())) break block12;
                int n10 = b222 = uSa.E;
                while (n10 < uqa.g) {
                    void v14 = c2;
                    d5 = (double)v14.getX() + e2.nextDouble();
                    d4 = (double)(v14.getY() + vRa.d) - e2.nextDouble() * Tqa.Ia;
                    d3 = (double)v14.getZ() + e2.nextDouble();
                    int n11 = 5 >> 2;
                    d2.J(UZ.SMOKE_LARGE, d5, d4, d3, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    n10 = ++b222;
                }
                break block12;
            }
            int n12 = b222 = uSa.E;
            while (n12 < yRa.d) {
                void v17 = c2;
                double d6 = (double)v17.getX() + e2.nextDouble();
                double d7 = (double)v17.getY() + e2.nextDouble() * kTa.B + kTa.B;
                double d8 = (double)v17.getZ() + e2.nextDouble();
                int n13 = --1;
                d2.J(UZ.SMOKE_LARGE, d6, d7, d8, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                n12 = ++b222;
            }
        }
    }

    @Override
    public boolean k() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int l(Gg gg2, XF xF2) {
        int n2;
        void a2;
        void b2;
        BlockFire blockFire = this;
        if (!b2.J((XF)a2)) {
            return uSa.E;
        }
        int c2 = uSa.E;
        DZ[] dZArray = DZ.values();
        int n3 = dZArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            DZ dZ2 = dZArray[n2];
            c2 = Math.max(blockFire.l(b2.J(a2.offset(dZ2)).J()), c2);
            n4 = ++n2;
        }
        return c2;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockFire a2 = this;
        return null;
    }
}

