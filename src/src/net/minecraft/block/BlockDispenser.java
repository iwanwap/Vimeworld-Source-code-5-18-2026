/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  Gl
 *  HA
 *  LQa
 *  Mda
 *  Mfa
 *  Ny
 *  QSa
 *  Tz
 *  XTa
 *  Yca
 *  bb
 *  dz
 *  eAa
 *  hy
 *  uC
 *  uY
 *  vRa
 *  xia
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockDispenser
extends BlockContainer {
    public Random rand;
    public static final PropertyBool TRIGGERED;
    public static final PropertyDirection FACING;
    public static final CX<eAa, bb> dispenseBehaviorRegistry;

    @Override
    public hy J() {
        return hy.MODEL;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        void c2;
        BlockDispenser a2;
        IBlockState d2 = iBlockState;
        BlockDispenser blockDispenser = a2 = this;
        super.f((Gg)c2, (XF)b2, d2);
        blockDispenser.C((Gg)c2, (XF)b2, d2);
    }

    public static uC J(dc dc2) {
        dc dc3;
        dc dc4 = dc3 = dc2;
        DZ a2 = BlockDispenser.J(dc4.J());
        double d2 = dc4.l() + LQa.E * (double)a2.getFrontOffsetX();
        double d3 = dc4.J() + LQa.E * (double)a2.getFrontOffsetY();
        double d4 = dc4.f() + LQa.E * (double)a2.getFrontOffsetZ();
        return new xia(d2, d3, d4);
    }

    static {
        FACING = PropertyDirection.J(oua.ja);
        TRIGGERED = PropertyBool.J(QSa.Ma);
        dispenseBehaviorRegistry = new CX(new Yca());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        BlockDispenser e2 = gg2;
        BlockDispenser d2 = this;
        if (!((Gg)e2).e) {
            void c2;
            d2.f((Gg)e2, (XF)c2);
        }
    }

    @Override
    public int J(Gg gg2) {
        BlockDispenser b2 = gg2;
        BlockDispenser a2 = this;
        return AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF, IBlockState iBlockState) {
        void c2;
        BlockDispenser blockDispenser = this;
        if (!c2.e) {
            void v1;
            void b2;
            void a2;
            Object d2 = a2.J(FACING);
            void v0 = c2;
            boolean bl = v0.J(b2.north()).J().J();
            boolean bl2 = v0.J(b2.south()).J().J();
            if (d2 == DZ.NORTH && bl && !bl2) {
                d2 = DZ.SOUTH;
                v1 = c2;
            } else if (d2 == DZ.SOUTH && bl2 && !bl) {
                d2 = DZ.NORTH;
                v1 = c2;
            } else {
                void v2 = c2;
                void v3 = b2;
                bl = v2.J(v3.west()).J().J();
                bl2 = v2.J(v3.east()).J().J();
                if (d2 == DZ.WEST && bl && !bl2) {
                    d2 = DZ.EAST;
                    v1 = c2;
                } else {
                    if (d2 == DZ.EAST && bl2 && !bl) {
                        d2 = DZ.WEST;
                    }
                    v1 = c2;
                }
            }
            v1.J((XF)b2, a2.J(FACING, d2).J(TRIGGERED, uSa.E != 0), uqa.g);
        }
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockDispenser a2 = this;
        return a2.J().J(FACING, BlockDispenser.J(b2)).J(TRIGGERED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    public void f(Gg gg2, XF xF) {
        bb a2;
        BlockDispenser c2 = gg2;
        BlockDispenser b2 = this;
        BlockSourceImpl blockSourceImpl = new BlockSourceImpl((Gg)c2, (XF)a2);
        dz dz2 = (dz)blockSourceImpl.J();
        if (dz2 != null) {
            int n2 = dz2.d();
            if (n2 < 0) {
                c2.f(BQa.J, (XF)a2, uSa.E);
                return;
            }
            c2 = dz2.J(n2);
            a2 = b2.J((Mda)c2);
            if (a2 != bb.I) {
                c2 = a2.J((dc)blockSourceImpl, (Mda)c2);
                dz2.J(n2, (Mda)(((Mda)c2).E <= 0 ? null : c2));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockDispenser i2;
        void g2;
        void h;
        BlockDispenser blockDispenser = blockDispenser2;
        BlockDispenser blockDispenser2 = gl2;
        BlockDispenser a2 = blockDispenser;
        return a2.J().J(FACING, BlockPistonBase.J((Gg)h, (XF)g2, (Gl)i2)).J(TRIGGERED, uSa.E != 0);
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockDispenser a2 = this;
        return new dz();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockDispenser a2 = this;
        return Ega.J((uY)b2.J((XF)((Object)c2)));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockDispenser i2 = gg2;
        BlockDispenser h = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = i2.J((XF)g2)) instanceof dz) {
            void e2;
            e2.J((HA)((dz)i2));
            if (i2 instanceof Ny) {
                e2.J(Tz.G);
            } else {
                e2.J(Tz.Q);
            }
        }
        return vRa.d != 0;
    }

    @Override
    public IBlockState J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockDispenser a2 = this;
        return a2.J().J(FACING, DZ.SOUTH);
    }

    public static DZ J(int a2) {
        return DZ.getFront(a2 & XTa.W);
    }

    public bb J(Mda mda2) {
        BlockDispenser b2 = mda2;
        BlockDispenser a2 = this;
        return dispenseBehaviorRegistry.J(b2 == null ? null : b2.J());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockDispenser f2 = gg2;
        BlockDispenser e2 = this;
        f2.J((XF)d2, c2.J(FACING, BlockPistonBase.J((Gg)f2, (XF)d2, (Gl)b2)), uqa.g);
        if (a2.l() && (f2 = f2.J((XF)d2)) instanceof dz) {
            ((dz)f2).J(a2.J());
        }
    }

    public BlockDispenser() {
        BlockDispenser a2;
        BlockDispenser blockDispenser = a2;
        super(Material.rock);
        blockDispenser.rand = new Random();
        blockDispenser.J(a2.blockState.J().J(FACING, DZ.NORTH).J(TRIGGERED, uSa.E != 0));
        blockDispenser.J(yGa.I);
    }

    @Override
    public BlockState J() {
        BlockDispenser a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = TRIGGERED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockDispenser blockDispenser = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getIndex();
        if (a2.J(TRIGGERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF;
        BlockDispenser b2 = this;
        uY uY2 = c2.J((XF)((Object)d2));
        if (uY2 instanceof dz) {
            Mfa.J((Gg)c2, (XF)((Object)d2), (HA)((dz)uY2));
            c2.J((XF)((Object)d2), (Block)b2);
        }
        super.l((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void b2;
        void d2;
        XF e2 = xF;
        BlockDispenser c2 = this;
        int a2 = d2.k(e2) || d2.k(e2.up()) ? vRa.d : uSa.E;
        boolean bl = b2.J(TRIGGERED);
        if (a2 != 0 && !bl) {
            void v0 = d2;
            BlockDispenser blockDispenser = c2;
            v0.J(e2, (Block)blockDispenser, blockDispenser.J((Gg)d2));
            v0.J(e2, b2.J(TRIGGERED, vRa.d != 0), AQa.P);
            return;
        }
        if (a2 == 0 && bl) {
            d2.J(e2, b2.J(TRIGGERED, uSa.E != 0), AQa.P);
        }
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }
}

