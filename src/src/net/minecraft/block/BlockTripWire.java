/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  NTa
 *  QFa
 *  XTa
 *  Zpa
 *  cQa
 *  eAa
 *  ez
 *  hTa
 *  pqa
 *  uRa
 *  ura
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockTripWire
extends Block {
    public static final PropertyBool SOUTH;
    public static final PropertyBool ATTACHED;
    public static final PropertyBool POWERED;
    public static final PropertyBool DISARMED;
    public static final PropertyBool WEST;
    public static final PropertyBool SUSPENDED;
    public static final PropertyBool NORTH;
    public static final PropertyBool EAST;

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockTripWire blockTripWire = random2;
        Random random2 = random;
        BlockTripWire a2 = blockTripWire;
    }

    @Override
    public BlockState J() {
        BlockTripWire a2;
        IProperty[] iPropertyArray = new IProperty[Yqa.i];
        iPropertyArray[uSa.E] = POWERED;
        iPropertyArray[vRa.d] = SUSPENDED;
        iPropertyArray[uqa.g] = ATTACHED;
        iPropertyArray[yRa.d] = DISARMED;
        iPropertyArray[AQa.P] = NORTH;
        iPropertyArray[tTa.h] = EAST;
        iPropertyArray[uua.p] = WEST;
        iPropertyArray[XTa.W] = SOUTH;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void a2;
        void b2;
        IBlockState d2 = iBlockState;
        BlockTripWire c2 = this;
        return d2.J(NORTH, BlockTripWire.J((I)b2, (XF)a2, d2, DZ.NORTH)).J(EAST, BlockTripWire.J((I)b2, (XF)a2, d2, DZ.EAST)).J(SOUTH, BlockTripWire.J((I)b2, (XF)a2, d2, DZ.SOUTH)).J(WEST, BlockTripWire.J((I)b2, (XF)a2, d2, DZ.WEST));
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockTripWire a2 = this;
        return a2.J().J(POWERED, ((b2 & vRa.d) > 0 ? vRa.d : uSa.E) != 0).J(SUSPENDED, ((b2 & uqa.g) > 0 ? vRa.d : uSa.E) != 0).J(ATTACHED, ((b2 & AQa.P) > 0 ? vRa.d : uSa.E) != 0).J(DISARMED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public void J(I i2, XF xF2) {
        IBlockState b2;
        Object c22 = xF2;
        BlockTripWire a2 = this;
        b2 = b2.J((XF)((Object)c22));
        boolean c22 = b2.J(ATTACHED);
        if (!b2.J(SUSPENDED).booleanValue()) {
            a2.J(JPa.N, JPa.N, JPa.N, pqa.r, vqa.M, pqa.r);
            return;
        }
        if (!c22) {
            a2.J(JPa.N, JPa.N, JPa.N, pqa.r, MQa.L, pqa.r);
            return;
        }
        a2.J(JPa.N, rRa.T, JPa.N, pqa.r, kua.Fa, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        void b2;
        BlockTripWire e2 = gg2;
        BlockTripWire d2 = this;
        if (!((Gg)e2).e && !b2.J(POWERED).booleanValue()) {
            void c2;
            d2.f((Gg)e2, (XF)c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF2) {
        int n2;
        void b2;
        Object c2 = xF2;
        BlockTripWire a2 = this;
        IBlockState iBlockState = b2.J((XF)((Object)c2));
        int n3 = iBlockState.J(POWERED).booleanValue();
        int n4 = uSa.E;
        Object object = b2.f((vL)null, new xy((double)c2.getX() + a2.minX, (double)c2.getY() + a2.minY, (double)c2.getZ() + a2.minZ, (double)c2.getX() + a2.maxX, (double)c2.getY() + a2.maxY, (double)c2.getZ() + a2.maxZ));
        if (!object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (((vL)object.next()).g()) continue;
                n2 = n4 = vRa.d;
                break;
            }
        } else {
            n2 = n4;
        }
        if (n2 != n3) {
            iBlockState = iBlockState.J(POWERED, n4 != 0);
            b2.J((XF)((Object)c2), iBlockState, yRa.d);
            a2.C((Gg)b2, (XF)((Object)c2), iBlockState);
        }
        if (n4 != 0) {
            BlockTripWire blockTripWire = a2;
            b2.J((XF)((Object)c2), (Block)blockTripWire, blockTripWire.J((Gg)b2));
        }
    }

    @Override
    public ez J() {
        return ez.TRANSLUCENT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockTripWire a2 = this;
        a2.C((Gg)c2, (XF)b2, d2.J(POWERED, vRa.d != 0));
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        int n2;
        BlockTripWire blockTripWire = this;
        DZ[] dZArray = new DZ[uqa.g];
        dZArray[uSa.E] = DZ.SOUTH;
        dZArray[vRa.d] = DZ.WEST;
        DZ[] dZArray2 = dZArray;
        int n3 = dZArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            DZ dZ2 = dZArray2[n2];
            int n5 = vRa.d;
            while (n5 < cQa.i) {
                void c2;
                int n6;
                void b2;
                XF xF3 = b2.offset(dZ2, n6);
                IBlockState d2 = c2.J(xF3);
                if (d2.J() == QFa.r) {
                    void a2;
                    if (d2.J(BlockTripWireHook.FACING) != dZ2.getOpposite()) break;
                    QFa.r.J((Gg)c2, xF3, d2, uSa.E != 0, vRa.d != 0, n6, (IBlockState)a2);
                    break;
                }
                if (d2.J() != QFa.Qa) break;
                n5 = ++n6;
            }
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2) {
        Sx e2;
        void d2;
        BlockTripWire blockTripWire = sx3;
        Sx sx3 = sx2;
        BlockTripWire a2 = blockTripWire;
        if (!d2.e && e2.f() != null && e2.f().J() == Gea.ja) {
            void b2;
            void c2;
            d2.J((XF)c2, b2.J(DISARMED, vRa.d != 0), AQa.P);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        int n2;
        void b2;
        XF e2 = xF2;
        BlockTripWire c2 = this;
        int a2 = b2.J(SUSPENDED).booleanValue();
        int n3 = n2 = !Gg.J((I)d2, (XF)e2.down()) ? vRa.d : uSa.E;
        if (a2 != n2) {
            void v1 = d2;
            c2.J((Gg)v1, e2, (IBlockState)b2, uSa.E);
            v1.G(e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object d2 = iBlockState;
        BlockTripWire a2 = this;
        d2 = d2.J(SUSPENDED, (!Gg.J((I)c2, (XF)b2.down()) ? vRa.d : uSa.E) != 0);
        c2.J((XF)b2, (IBlockState)d2, yRa.d);
        a2.C((Gg)c2, (XF)b2, (IBlockState)d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        BlockTripWire e2 = gg2;
        BlockTripWire d2 = this;
        if (!((Gg)e2).e && e2.J((XF)c2).J(POWERED).booleanValue()) {
            d2.f((Gg)e2, (XF)c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockTripWire blockTripWire = this;
        int b2 = uSa.E;
        if (a2.J(POWERED).booleanValue()) {
            b2 |= vRa.d;
        }
        if (a2.J(SUSPENDED).booleanValue()) {
            b2 |= uqa.g;
        }
        if (a2.J(ATTACHED).booleanValue()) {
            b2 |= AQa.P;
        }
        if (a2.J(DISARMED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        void a2;
        Object d2 = xF2;
        I c2 = i2;
        d2 = ((XF)((Object)d2)).offset((DZ)a2);
        Block block = (d2 = c2.J((XF)((Object)d2))).J();
        if (block == QFa.r) {
            DZ dZ3 = a2.getOpposite();
            if (d2.J(BlockTripWireHook.FACING) == dZ3) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (block == QFa.Qa) {
            void b2;
            boolean bl = b2.J(SUSPENDED);
            if (bl == (d2 = d2.J(SUSPENDED).booleanValue())) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockTripWire a2 = this;
        return Gea.gd;
    }

    public BlockTripWire() {
        BlockTripWire a2;
        BlockTripWire blockTripWire = a2;
        super(Material.circuits);
        blockTripWire.J(blockTripWire.blockState.J().J(POWERED, uSa.E != 0).J(SUSPENDED, uSa.E != 0).J(ATTACHED, uSa.E != 0).J(DISARMED, uSa.E != 0).J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0));
        blockTripWire.J(JPa.N, JPa.N, JPa.N, pqa.r, kua.Fa, pqa.r);
        blockTripWire.J(vRa.d != 0);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    static {
        POWERED = PropertyBool.J(uRa.M);
        SUSPENDED = PropertyBool.J(ura.S);
        ATTACHED = PropertyBool.J(Cta.y);
        DISARMED = PropertyBool.J(KPa.c);
        NORTH = PropertyBool.J(hTa.d);
        EAST = PropertyBool.J(Zpa.D);
        SOUTH = PropertyBool.J(vsa.k);
        WEST = PropertyBool.J(NTa.U);
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockTripWire a2 = this;
        return null;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockTripWire a2 = this;
        return Gea.gd;
    }
}

