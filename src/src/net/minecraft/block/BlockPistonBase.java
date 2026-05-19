/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  MQa
 *  Mda
 *  Oz
 *  QFa
 *  XTa
 *  aSa
 *  kta
 *  nZ
 *  pqa
 *  uY
 *  vL
 *  vRa
 *  wOa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase$1;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockPistonStructureHelper;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockPistonBase
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja);
    private final boolean isSticky;
    public static final PropertyBool EXTENDED = PropertyBool.J(fqa.H);

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        BlockPistonBase d2 = gg2;
        BlockPistonBase c2 = this;
        if (!((Gg)d2).e && d2.J((XF)b2) == null) {
            void a2;
            c2.C((Gg)d2, (XF)b2, (IBlockState)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static DZ J(Gg gg2, XF xF, Gl gl2) {
        void b2;
        Gg c2 = gl2;
        Gg a2 = gg2;
        if (Oz.l((float)((float)c2.la - (float)b2.getX())) < kta.v && Oz.l((float)((float)c2.A - (float)b2.getZ())) < kta.v) {
            double d2;
            double d3 = c2.Z + (double)c2.l();
            if (d2 - (double)b2.getY() > KPa.y) {
                return DZ.UP;
            }
            if ((double)b2.getY() - d3 > aSa.V) {
                return DZ.DOWN;
            }
        }
        return c2.J().getOpposite();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPistonBase a2 = this;
        return a2.J().J(FACING, BlockPistonBase.J(b2)).J(EXTENDED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        BlockPistonBase g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        BlockPistonBase a2;
        BlockPistonBase blockPistonBase = blockPistonBase2;
        BlockPistonBase blockPistonBase2 = vL2;
        BlockPistonBase blockPistonBase3 = a2 = blockPistonBase;
        blockPistonBase3.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        super.J((Gg)f2, (XF)e2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)g2);
    }

    public BlockPistonBase(boolean bl) {
        BlockPistonBase a2;
        boolean b2 = bl;
        BlockPistonBase blockPistonBase = a2 = this;
        BlockPistonBase blockPistonBase2 = a2;
        super(Material.piston);
        blockPistonBase.J(blockPistonBase2.blockState.J().J(FACING, DZ.NORTH).J(EXTENDED, uSa.E != 0));
        blockPistonBase.isSticky = b2;
        blockPistonBase.J(soundTypePiston);
        a2.J(MQa.L);
        a2.J(yGa.I);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockPistonBase i2;
        void g2;
        void h2;
        BlockPistonBase blockPistonBase = blockPistonBase2;
        BlockPistonBase blockPistonBase2 = gl2;
        BlockPistonBase a2 = blockPistonBase;
        return a2.J().J(FACING, BlockPistonBase.J((Gg)h2, (XF)g2, (Gl)i2)).J(EXTENDED, uSa.E != 0);
    }

    @Override
    public BlockState J() {
        BlockPistonBase a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = EXTENDED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF, DZ dZ2, boolean bl) {
        int e22;
        Object object;
        Object object2;
        Object e22;
        int n2;
        void b2;
        void c2;
        void d2;
        void a2;
        BlockPistonBase blockPistonBase = this;
        if (a2 == false) {
            d2.G(c2.offset((DZ)b2));
        }
        BlockPistonStructureHelper blockPistonStructureHelper = new BlockPistonStructureHelper((Gg)d2, (XF)c2, (DZ)b2, (boolean)a2);
        List<XF> list = blockPistonStructureHelper.J();
        List<XF> list2 = blockPistonStructureHelper.f();
        if (!blockPistonStructureHelper.J()) {
            return uSa.E != 0;
        }
        int n3 = list.size() + list2.size();
        Block[] blockArray = new Block[n3];
        DZ dZ3 = a2 != false ? b2 : b2.getOpposite();
        int n4 = n2 = list2.size() - vRa.d;
        while (n4 >= 0) {
            e22 = list2.get(n2);
            object2 = d2.J((XF)((Object)e22)).J();
            void v2 = d2;
            Object object3 = e22;
            ((Block)object2).J((Gg)v2, (XF)((Object)object3), d2.J((XF)((Object)object3)), uSa.E);
            v2.G((XF)((Object)e22));
            blockArray[--n3] = object2;
            n4 = --n2;
        }
        int n5 = n2 = list.size() - vRa.d;
        while (n5 >= 0) {
            e22 = list.get(n2);
            object2 = d2.J((XF)((Object)e22));
            object = object2.J();
            ((Block)object).f((IBlockState)object2);
            d2.G((XF)((Object)e22));
            e22 = ((XF)((Object)e22)).offset(dZ3);
            d2.J((XF)((Object)e22), QFa.zA.J().J(FACING, b2), AQa.P);
            d2.f((XF)((Object)e22), BlockPistonMoving.J((IBlockState)object2, (DZ)b2, (boolean)a2, uSa.E != 0));
            blockArray[--n3] = object;
            n5 = --n2;
        }
        XF xF2 = c2.offset((DZ)b2);
        if (a2 != false) {
            e22 = blockPistonBase.isSticky ? BlockPistonExtension$EnumPistonType.STICKY : BlockPistonExtension$EnumPistonType.DEFAULT;
            object2 = QFa.OD.J().J(BlockPistonExtension.FACING, b2).J(BlockPistonExtension.TYPE, e22);
            object = QFa.zA.J().J(BlockPistonMoving.FACING, b2).J(BlockPistonMoving.TYPE, blockPistonBase.isSticky ? BlockPistonExtension$EnumPistonType.STICKY : BlockPistonExtension$EnumPistonType.DEFAULT);
            d2.J(xF2, (IBlockState)object, AQa.P);
            d2.f(xF2, BlockPistonMoving.J((IBlockState)object2, (DZ)b2, vRa.d != 0, uSa.E != 0));
        }
        int n6 = e22 = list2.size() - vRa.d;
        while (n6 >= 0) {
            d2.f(list2.get(e22), blockArray[n3]);
            ++n3;
            n6 = --e22;
        }
        int n7 = e22 = list.size() - vRa.d;
        while (n7 >= 0) {
            d2.f(list.get(e22), blockArray[n3]);
            ++n3;
            n7 = --e22;
        }
        if (a2 != false) {
            void v7 = d2;
            v7.f(xF2, (Block)QFa.OD);
            v7.f((XF)c2, (Block)blockPistonBase);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockPistonBase b2;
        Object d2 = xF;
        BlockPistonBase blockPistonBase = b2 = this;
        blockPistonBase.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Block block, Gg gg2, XF xF, DZ dZ2, boolean bl) {
        void b2;
        void d2;
        Object e2 = xF;
        Block c2 = block;
        if (c2 == QFa.X || c2 == QFa.DC) {
            return uSa.E != 0;
        }
        if (!d2.J().J((XF)((Object)e2))) {
            return uSa.E != 0;
        }
        if (e2.getY() >= 0 && (b2 != DZ.DOWN || e2.getY() != 0)) {
            if (e2.getY() <= d2.C() - vRa.d && (b2 != DZ.UP || e2.getY() != d2.C() - vRa.d)) {
                if (c2 != QFa.Nc && c2 != QFa.bF) {
                    if (c2.J((Gg)d2, (XF)((Object)e2)) == vqa.T) {
                        return uSa.E != 0;
                    }
                    if (c2.l() == uqa.g) {
                        return uSa.E != 0;
                    }
                    if (c2.l() == vRa.d) {
                        void a2;
                        if (a2 == false) {
                            return uSa.E != 0;
                        }
                        return vRa.d != 0;
                    }
                } else if (d2.J((XF)((Object)e2)).J(EXTENDED).booleanValue()) {
                    return uSa.E != 0;
                }
                if (!(c2 instanceof ITileEntityProvider)) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        void c2;
        void a2;
        BlockPistonBase blockPistonBase = this;
        Object d2 = a2.J(FACING);
        boolean bl = blockPistonBase.f((Gg)c2, (XF)b2, (DZ)((Object)d2));
        if (bl && !a2.J(EXTENDED).booleanValue()) {
            if (new BlockPistonStructureHelper((Gg)c2, (XF)b2, (DZ)((Object)d2), vRa.d != 0).J()) {
                c2.f((XF)b2, (Block)blockPistonBase, uSa.E, ((DZ)((Object)d2)).getIndex());
                return;
            }
        } else if (!bl && a2.J(EXTENDED).booleanValue()) {
            c2.J((XF)b2, a2.J(EXTENDED, uSa.E != 0), uqa.g);
            c2.f((XF)b2, (Block)blockPistonBase, vRa.d, ((DZ)((Object)d2)).getIndex());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, int n2, int n3) {
        void b22;
        void d2;
        XF c2;
        BlockPistonBase f2 = gg2;
        BlockPistonBase e2 = this;
        DZ dZ2 = c2.J(FACING);
        if (!((Gg)f2).e) {
            boolean bl = e2.f((Gg)f2, (XF)d2, dZ2);
            if (bl && b22 == vRa.d) {
                f2.J((XF)d2, c2.J(EXTENDED, vRa.d != 0), uqa.g);
                return uSa.E != 0;
            }
            if (!bl && b22 == false) {
                return uSa.E != 0;
            }
        }
        if (b22 == false) {
            if (!e2.J((Gg)f2, (XF)d2, dZ2, vRa.d != 0)) {
                return uSa.E != 0;
            }
            f2.J((XF)d2, c2.J(EXTENDED, vRa.d != 0), uqa.g);
            f2.J((double)d2.getX() + kTa.B, (double)d2.getY() + kTa.B, (double)d2.getZ() + kTa.B, fta.Ga, MQa.L, ((Gg)f2).v.nextFloat() * rta.o + Ora.D);
        } else if (b22 == vRa.d) {
            int a2;
            uY uY2 = f2.J(d2.offset(dZ2));
            if (uY2 instanceof nZ) {
                ((nZ)uY2).l();
            }
            f2.J((XF)d2, QFa.zA.J().J(BlockPistonMoving.FACING, dZ2).J(BlockPistonMoving.TYPE, e2.isSticky ? BlockPistonExtension$EnumPistonType.STICKY : BlockPistonExtension$EnumPistonType.DEFAULT), yRa.d);
            f2.f((XF)d2, BlockPistonMoving.J(e2.J(a2), dZ2, uSa.E != 0, vRa.d != 0));
            if (e2.isSticky) {
                c2 = d2.add(dZ2.getFrontOffsetX() * uqa.g, dZ2.getFrontOffsetY() * uqa.g, dZ2.getFrontOffsetZ() * uqa.g);
                Block b22 = f2.J(c2).J();
                a2 = uSa.E;
                if (b22 == QFa.zA && (uY2 = f2.J(c2)) instanceof nZ && (uY2 = (nZ)uY2).J() == dZ2 && uY2.J()) {
                    uY2.l();
                    a2 = vRa.d;
                }
                if (a2 == 0 && b22.J() != Material.air && BlockPistonBase.J(b22, (Gg)f2, c2, dZ2.getOpposite(), uSa.E != 0) && (b22.l() == 0 || b22 == QFa.Nc || b22 == QFa.bF)) {
                    e2.J((Gg)f2, (XF)d2, dZ2, uSa.E != 0);
                }
            } else {
                f2.G(d2.offset(dZ2));
            }
            f2.J((double)d2.getX() + kTa.B, (double)d2.getY() + kTa.B, (double)d2.getZ() + kTa.B, ERa.G, MQa.L, ((Gg)f2).v.nextFloat() * VPa.i + Ora.D);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(Gg gg2, XF xF, DZ dZ2) {
        int d22;
        DZ b2;
        void c2;
        int n2;
        BlockPistonBase blockPistonBase = this;
        Object object = DZ.values();
        int n3 = ((DZ[])object).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            void a2;
            Object d22 = object[n2];
            if (d22 != a2 && c2.J(((XF)((Object)b2)).offset((DZ)((Object)d22)), (DZ)((Object)d22))) {
                return vRa.d != 0;
            }
            n4 = ++n2;
        }
        if (c2.J((XF)((Object)b2), DZ.DOWN)) {
            return vRa.d != 0;
        }
        object = ((XF)((Object)b2)).up();
        DZ[] dZArray = DZ.values();
        n2 = dZArray.length;
        int n5 = d22 = uSa.E;
        while (n5 < n2) {
            b2 = dZArray[d22];
            if (b2 != DZ.DOWN && c2.J(((XF)((Object)object)).offset(b2), b2)) {
                return vRa.d != 0;
            }
            n5 = ++d22;
        }
        return uSa.E != 0;
    }

    public static DZ J(int n2) {
        int n3 = n2;
        int a2 = n3 & XTa.W;
        if (a2 > tTa.h) {
            return null;
        }
        return DZ.getFront(a2);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPistonBase a2 = this;
        return a2.J().J(FACING, DZ.UP);
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
    public void J(I i2, XF xF) {
        void a2;
        Object c2 = i2;
        BlockPistonBase b2 = this;
        if ((c2 = c2.J((XF)a2)).J() == b2 && c2.J(EXTENDED).booleanValue()) {
            if ((c2 = c2.J(FACING)) == null) return;
            switch (BlockPistonBase$1.$SwitchMap$net$minecraft$util$EnumFacing[((Enum)c2).ordinal()]) {
                case 1: {
                    b2.J(JPa.N, rta.o, JPa.N, pqa.r, pqa.r, pqa.r);
                    return;
                }
                case 2: {
                    b2.J(JPa.N, JPa.N, JPa.N, pqa.r, wOa.w, pqa.r);
                    return;
                }
                case 3: {
                    b2.J(JPa.N, JPa.N, rta.o, pqa.r, pqa.r, pqa.r);
                    return;
                }
                case 4: {
                    b2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, wOa.w);
                    return;
                }
                case 5: {
                    b2.J(rta.o, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                    return;
                }
                case 6: {
                    b2.J(JPa.N, JPa.N, JPa.N, wOa.w, pqa.r, pqa.r);
                    return;
                }
            }
            return;
        } else {
            b2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockPistonBase blockPistonBase = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getIndex();
        if (a2.J(EXTENDED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void b2;
        void c2;
        void e2;
        Object f2 = xF;
        BlockPistonBase d2 = this;
        void v0 = e2;
        v0.J((XF)((Object)f2), c2.J(FACING, BlockPistonBase.J((Gg)e2, (XF)((Object)f2), (Gl)b2)), uqa.g);
        if (!v0.e) {
            d2.C((Gg)e2, (XF)((Object)f2), (IBlockState)c2);
        }
    }

    @Override
    public void f() {
        BlockPistonBase a2;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        BlockPistonBase e2 = gg2;
        BlockPistonBase d2 = this;
        if (!((Gg)e2).e) {
            void b2;
            void c2;
            d2.C((Gg)e2, (XF)c2, (IBlockState)b2);
        }
    }
}

