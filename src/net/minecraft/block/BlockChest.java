/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  Gl
 *  HA
 *  I
 *  JPa
 *  Mda
 *  Mfa
 *  ODa
 *  Oz
 *  Tz
 *  YSa
 *  Ypa
 *  hy
 *  jEa
 *  pqa
 *  uY
 *  vL
 *  vRa
 *  xOa
 *  xy
 *  zC
 */
package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockChest
extends BlockContainer {
    public final int chestType;
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void a2;
        void b2;
        void c2;
        BlockChest e2 = gg2;
        BlockChest d2 = this;
        BlockChest blockChest = e2;
        super.J((Gg)blockChest, (XF)c2, (IBlockState)b2, (Block)a2);
        e2 = blockChest.J((XF)c2);
        if (e2 instanceof Fz) {
            e2.e();
        }
    }

    @Override
    public boolean C() {
        BlockChest a2;
        if (a2.chestType == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState f(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        IBlockState a2;
        void c2;
        BlockChest blockChest = this;
        if (c2.e) {
            return a2;
        }
        void v0 = c2;
        IBlockState iBlockState2 = v0.J(b2.north());
        IBlockState iBlockState3 = v0.J(b2.south());
        Object object = v0.J(b2.west());
        Object object2 = v0.J(b2.east());
        Object d2 = a2.J(FACING);
        Block block = iBlockState2.J();
        Block block2 = iBlockState3.J();
        Block block3 = object.J();
        Block block4 = object2.J();
        if (block != blockChest && block2 != blockChest) {
            boolean bl = block.J();
            boolean bl2 = block2.J();
            if (block3 == blockChest || block4 == blockChest) {
                DZ dZ2;
                DZ dZ3;
                XF xF2 = block3 == blockChest ? b2.west() : b2.east();
                void v1 = c2;
                IBlockState iBlockState4 = v1.J(xF2.north());
                IBlockState iBlockState5 = v1.J(xF2.south());
                d2 = DZ.SOUTH;
                if ((block3 == blockChest ? (dZ3 = object.J(FACING)) : (dZ2 = object2.J(FACING))) == DZ.NORTH) {
                    d2 = DZ.NORTH;
                }
                object = iBlockState4.J();
                object2 = iBlockState5.J();
                if ((bl || ((Block)object).J()) && !bl2 && !((Block)object2).J()) {
                    d2 = DZ.SOUTH;
                }
                if ((bl2 || ((Block)object2).J()) && !bl && !((Block)object).J()) {
                    d2 = DZ.NORTH;
                }
            }
        } else {
            DZ dZ4;
            DZ dZ5;
            XF xF3 = block == blockChest ? b2.north() : b2.south();
            void v2 = c2;
            IBlockState iBlockState6 = v2.J(xF3.west());
            IBlockState iBlockState7 = v2.J(xF3.east());
            d2 = DZ.EAST;
            if ((block == blockChest ? (dZ5 = iBlockState2.J(FACING)) : (dZ4 = iBlockState3.J(FACING))) == DZ.WEST) {
                d2 = DZ.WEST;
            }
            Block block5 = iBlockState6.J();
            Block block6 = iBlockState7.J();
            if ((block3.J() || block5.J()) && !block4.J() && !block6.J()) {
                d2 = DZ.EAST;
            }
            if ((block4.J() || block6.J()) && !block3.J() && !block5.J()) {
                d2 = DZ.WEST;
            }
        }
        IBlockState iBlockState8 = a2 = a2.J(FACING, d2);
        c2.J((XF)b2, iBlockState8, yRa.d);
        return iBlockState8;
    }

    private boolean M(Gg gg2, XF xF) {
        Iterator b2;
        Object c2 = xF;
        BlockChest a2 = this;
        b2 = b2.J(ODa.class, new xy((double)c2.getX(), (double)(c2.getY() + vRa.d), (double)c2.getZ(), (double)(c2.getX() + vRa.d), (double)(c2.getY() + uqa.g), (double)(c2.getZ() + vRa.d))).iterator();
        while (b2.hasNext()) {
            if (!((ODa)((vL)b2.next())).v()) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockChest(int n2) {
        BlockChest a2;
        int b2 = n2;
        BlockChest blockChest = a2 = this;
        BlockChest blockChest2 = a2;
        super(Material.wood);
        blockChest.J(blockChest2.blockState.J().J(FACING, DZ.NORTH));
        blockChest.chestType = b2;
        blockChest.J(yGa.a);
        a2.J(rRa.T, JPa.N, rRa.T, pqa.Ha, xOa.B, pqa.Ha);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF, IBlockState iBlockState, DZ dZ2) {
        void c2;
        uY d2;
        IBlockState e22 = iBlockState;
        Object b2 = this;
        if (!((BlockChest)b2).C()) {
            return uSa.E;
        }
        int e22 = uSa.E;
        if ((d2 = d2.J((XF)c2)) instanceof Fz) {
            e22 = ((Fz)d2).I;
        }
        return Oz.f((int)e22, (int)uSa.E, (int)Ypa.A);
    }

    @Override
    public hy J() {
        return hy.ENTITYBLOCK_ANIMATED;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockChest b2;
        Object d2 = xF;
        BlockChest blockChest = b2 = this;
        blockChest.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(Gg gg2, XF xF) {
        void b2;
        BlockChest a2 = this;
        Object c2 = xF;
        if (a2.C((Gg)b2, (XF)((Object)c2)) || a2.M((Gg)b2, (XF)((Object)c2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(Gg gg2, XF xF) {
        void a2;
        void b2;
        BlockChest blockChest = this;
        if (b2.J((XF)a2).J() != blockChest) {
            return uSa.E != 0;
        }
        for (DZ dZ2 : LX.HORIZONTAL) {
            if (b2.J(a2.offset(dZ2)).J() != blockChest) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF;
        BlockChest b2 = this;
        uY uY2 = c2.J((XF)((Object)d2));
        if (uY2 instanceof HA) {
            Mfa.J((Gg)c2, (XF)((Object)d2), (HA)((HA)uY2));
            c2.J((XF)((Object)d2), (Block)b2);
        }
        super.l((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF) {
        void b2;
        XF c2 = xF;
        BlockChest a2 = this;
        if (b2.J(c2.north()).J() == a2) {
            a2.J(rRa.T, JPa.N, JPa.N, pqa.Ha, xOa.B, pqa.Ha);
            return;
        }
        if (b2.J(c2.south()).J() == a2) {
            a2.J(rRa.T, JPa.N, rRa.T, pqa.Ha, xOa.B, pqa.r);
            return;
        }
        if (b2.J(c2.west()).J() == a2) {
            a2.J(JPa.N, JPa.N, rRa.T, pqa.Ha, xOa.B, pqa.Ha);
            return;
        }
        if (b2.J(c2.east()).J() == a2) {
            a2.J(rRa.T, JPa.N, rRa.T, pqa.r, xOa.B, pqa.Ha);
            return;
        }
        a2.J(rRa.T, JPa.N, rRa.T, pqa.Ha, xOa.B, pqa.Ha);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockChest a2 = this;
        return new Fz();
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockChest a2 = this;
        return b2.J(FACING).getIndex();
    }

    @Override
    public BlockState J() {
        BlockChest a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF) {
        void b2;
        BlockChest a2;
        Object c2 = xF;
        BlockChest blockChest = a2 = this;
        blockChest.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(Gg gg2, XF xF, IBlockState iBlockState) {
        DZ dZ2;
        void a2;
        void b2;
        void c2;
        DZ dZ3;
        block7: {
            BlockChest blockChest = this;
            dZ3 = null;
            for (DZ dZ4 : LX.HORIZONTAL) {
                IBlockState iBlockState2 = c2.J(b2.offset(dZ4));
                if (iBlockState2.J() == blockChest) {
                    return a2;
                }
                if (!iBlockState2.J().J()) continue;
                if (dZ3 != null) {
                    dZ2 = dZ3 = null;
                    break block7;
                }
                dZ3 = dZ4;
            }
            dZ2 = dZ3;
        }
        if (dZ2 != null) {
            return a2.J(FACING, dZ3.getOpposite());
        }
        Object d2 = a2.J(FACING);
        if (c2.J(b2.offset((DZ)((Object)d2))).J().J()) {
            d2 = ((DZ)((Object)d2)).getOpposite();
        }
        if (c2.J(b2.offset((DZ)((Object)d2))).J().J()) {
            d2 = ((DZ)((Object)d2)).rotateY();
        }
        if (c2.J(b2.offset((DZ)((Object)d2))).J().J()) {
            d2 = ((DZ)((Object)d2)).getOpposite();
        }
        return a2.J(FACING, d2);
    }

    @Override
    public IBlockState J(Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockChest i2;
        BlockChest blockChest = blockChest2;
        BlockChest blockChest2 = gl2;
        BlockChest a2 = blockChest;
        return a2.J().J(FACING, i2.J());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockChest i2 = gg2;
        BlockChest h = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = h.J((Gg)i2, (XF)g2)) != null) {
            void e2;
            e2.J((HA)i2);
            if (h.chestType == 0) {
                e2.J(Tz.W);
            } else if (h.chestType == vRa.d) {
                e2.J(Tz.q);
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF, IBlockState iBlockState, DZ dZ2) {
        Object e2;
        BlockChest blockChest = object;
        Object object = dZ2;
        BlockChest a2 = blockChest;
        if (e2 == DZ.UP) {
            void b2;
            void c2;
            void d2;
            return a2.J((I)d2, (XF)c2, (IBlockState)b2, (DZ)((Object)e2));
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState) {
        Iterator<DZ> a2;
        void b2;
        void c2;
        BlockChest blockChest = this;
        blockChest.f((Gg)c2, (XF)b2, (IBlockState)((Object)a2));
        a2 = LX.HORIZONTAL.iterator();
        while (a2.hasNext()) {
            Object d2 = a2.next();
            IBlockState iBlockState2 = c2.J((XF)((Object)(d2 = b2.offset((DZ)((Object)d2)))));
            if (iBlockState2.J() != blockChest) continue;
            blockChest.f((Gg)c2, (XF)((Object)d2), iBlockState2);
        }
    }

    @Override
    public boolean J(Gg gg2, XF xF) {
        XF a2;
        BlockChest c2 = gg2;
        BlockChest b2 = this;
        int n2 = uSa.E;
        void v0 = a2;
        a2 = v0.west();
        XF xF2 = v0.east();
        XF xF3 = v0.north();
        XF xF4 = v0.south();
        if (c2.J(a2).J() == b2) {
            if (b2.d((Gg)c2, a2)) {
                return uSa.E != 0;
            }
            ++n2;
        }
        if (c2.J(xF2).J() == b2) {
            if (b2.d((Gg)c2, xF2)) {
                return uSa.E != 0;
            }
            ++n2;
        }
        if (c2.J(xF3).J() == b2) {
            if (b2.d((Gg)c2, xF3)) {
                return uSa.E != 0;
            }
            ++n2;
        }
        if (c2.J(xF4).J() == b2) {
            if (b2.d((Gg)c2, xF4)) {
                return uSa.E != 0;
            }
            ++n2;
        }
        if (n2 <= vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockChest a2 = this;
        DZ b22 = DZ.getFront(b22);
        if (b22.getAxis() == RX.Y) {
            b22 = DZ.NORTH;
        }
        return a2.J().J(FACING, b22);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void v2;
        void a2;
        void d2;
        BlockChest f2;
        block6: {
            block8: {
                BlockChest blockChest;
                int n2;
                XF xF2;
                XF xF3;
                IBlockState c2;
                block7: {
                    BlockChest blockChest2;
                    int n3;
                    int n4;
                    int n5;
                    XF xF4;
                    XF xF5;
                    DZ b2;
                    block5: {
                        f2 = gg2;
                        BlockChest e2 = this;
                        b2 = DZ.getHorizontal(Oz.f((double)((double)(((Gl)b2).X * YSa.G / CRa.ja) + kTa.B)) & yRa.d).getOpposite();
                        c2 = c2.J(FACING, b2);
                        void v0 = d2;
                        xF3 = v0.north();
                        xF2 = v0.south();
                        xF5 = v0.west();
                        xF4 = v0.east();
                        n2 = e2 == f2.J(xF3).J() ? vRa.d : uSa.E;
                        n5 = e2 == f2.J(xF2).J() ? vRa.d : uSa.E;
                        n4 = e2 == f2.J(xF5).J() ? vRa.d : uSa.E;
                        int n6 = n3 = e2 == f2.J(xF4).J() ? vRa.d : uSa.E;
                        if (n2 != 0 || n5 != 0 || n4 != 0 || n3 != 0) break block5;
                        v2 = a2;
                        f2.J((XF)d2, c2, yRa.d);
                        break block6;
                    }
                    if (b2.getAxis() == RX.X && (n2 != 0 || n5 != 0)) break block7;
                    if (b2.getAxis() != RX.Z || n4 == 0 && n3 == 0) break block8;
                    BlockChest blockChest3 = f2;
                    if (n4 != 0) {
                        blockChest3.J(xF5, c2, yRa.d);
                        blockChest2 = f2;
                    } else {
                        blockChest3.J(xF4, c2, yRa.d);
                        blockChest2 = f2;
                    }
                    blockChest2.J((XF)d2, c2, yRa.d);
                    v2 = a2;
                    break block6;
                }
                BlockChest blockChest4 = f2;
                if (n2 != 0) {
                    blockChest4.J(xF3, c2, yRa.d);
                    blockChest = f2;
                } else {
                    blockChest4.J(xF2, c2, yRa.d);
                    blockChest = f2;
                }
                blockChest.J((XF)d2, c2, yRa.d);
            }
            v2 = a2;
        }
        if (v2.l() && (f2 = f2.J((XF)d2)) instanceof Fz) {
            ((Fz)((Object)f2)).J(a2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockChest a2 = this;
        return Ega.J((HA)a2.J((Gg)b2, (XF)((Object)c2)));
    }

    /*
     * WARNING - void declaration
     */
    public zC J(Gg gg2, XF xF) {
        void a2;
        void b2;
        BlockChest blockChest = this;
        Object c2 = b2.J((XF)a2);
        if (!(c2 instanceof Fz)) {
            return null;
        }
        c2 = (Fz)((Object)c2);
        if (blockChest.e((Gg)b2, (XF)a2)) {
            return null;
        }
        for (DZ dZ2 : LX.HORIZONTAL) {
            XF xF2 = a2.offset(dZ2);
            if (b2.J(xF2).J() != blockChest) continue;
            if (blockChest.e((Gg)b2, xF2)) {
                return null;
            }
            if (!((xF2 = b2.J(xF2)) instanceof Fz)) continue;
            if (dZ2 != DZ.WEST && dZ2 != DZ.NORTH) {
                c2 = new jEa(KSa.E, (zC)c2, (zC)((Fz)((Object)xF2)));
                continue;
            }
            c2 = new jEa(KSa.E, (zC)((Fz)((Object)xF2)), (zC)c2);
        }
        return c2;
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean C(Gg gg2, XF xF) {
        void b2;
        XF c2 = xF;
        BlockChest a2 = this;
        return b2.J(c2.up()).J().A();
    }
}

