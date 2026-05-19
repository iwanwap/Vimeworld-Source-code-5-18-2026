/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  MQa
 *  Mda
 *  QFa
 *  WSa
 *  Ypa
 *  cQa
 *  ez
 *  kqa
 *  kta
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  uRa
 *  ura
 *  vRa
 *  xy
 */
package net.minecraft.block;

import com.google.common.base.Objects;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockTripWireHook$1;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockTripWireHook
extends Block {
    public static final PropertyBool POWERED;
    public static final PropertyDirection FACING;
    public static final PropertyBool SUSPENDED;
    public static final PropertyBool ATTACHED;

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockTripWireHook b2 = this;
        b2.J((Gg)d2, (XF)c2, e2, uSa.E != 0, vRa.d != 0, pua.o, null);
    }

    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        IBlockState e2 = iBlockState;
        BlockTripWireHook b2 = this;
        if (e2.J(POWERED).booleanValue()) {
            return Ypa.A;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockTripWireHook a2 = this;
        boolean bl2 = d2.J(ATTACHED);
        boolean bl3 = d2.J(POWERED);
        if (bl2 || bl3) {
            a2.J((Gg)c2, (XF)b2, d2, vRa.d != 0, uSa.E != 0, pua.o, null);
        }
        if (bl3) {
            void v0 = c2;
            v0.f((XF)b2, (Block)a2);
            v0.f(b2.offset(d2.J(FACING).getOpposite()), (Block)a2);
        }
        super.l((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockTripWireHook blockTripWireHook = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getHorizontalIndex();
        if (a2.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        if (a2.J(ATTACHED).booleanValue()) {
            b2 |= AQa.P;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void d2;
        void e2;
        IBlockState f2 = iBlockState;
        BlockTripWireHook c2 = this;
        c2.J((Gg)e2, (XF)d2, f2, uSa.E != 0, uSa.E != 0, pua.o, null);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockTripWireHook blockTripWireHook = random2;
        Random random2 = random;
        BlockTripWireHook a2 = blockTripWireHook;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void b2;
        void c2;
        XF d2 = xF2;
        BlockTripWireHook a2 = this;
        return c2.J(SUSPENDED, (!Gg.J((I)b2, (XF)d2.down()) ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void b2;
        void d2;
        DZ a2;
        XF e2 = xF2;
        Object c2 = this;
        if (a2 != c2 && c2.J((Gg)d2, e2, (IBlockState)b2) && !d2.J(e2.offset((a2 = b2.J(FACING)).getOpposite())).J().A()) {
            void v0 = d2;
            c2.J((Gg)v0, e2, (IBlockState)b2, uSa.E);
            v0.G(e2);
        }
    }

    public BlockTripWireHook() {
        BlockTripWireHook a2;
        BlockTripWireHook blockTripWireHook = a2;
        super(Material.circuits);
        blockTripWireHook.J(blockTripWireHook.blockState.J().J(FACING, DZ.NORTH).J(POWERED, uSa.E != 0).J(ATTACHED, uSa.E != 0).J(SUSPENDED, uSa.E != 0));
        blockTripWireHook.J(yGa.I);
        a2.J(vRa.d != 0);
    }

    @Override
    public ez J() {
        return ez.CUTOUT_MIPPED;
    }

    static {
        FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
        POWERED = PropertyBool.J(uRa.M);
        ATTACHED = PropertyBool.J(Cta.y);
        SUSPENDED = PropertyBool.J(ura.S);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        BlockTripWireHook blockTripWireHook = this;
        for (DZ dZ2 : LX.HORIZONTAL) {
            void a2;
            void b2;
            if (!b2.J(a2.offset(dZ2)).J().A()) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockTripWireHook a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl2, boolean bl3, int n2, IBlockState iBlockState2) {
        int n3;
        int n4;
        Object h2;
        XF xF3;
        IBlockState[] iBlockStateArray;
        int n5;
        int n52;
        void d2;
        void f2;
        void g2;
        boolean e232;
        int n6;
        DZ dZ2;
        BlockTripWireHook blockTripWireHook;
        block12: {
            int n7;
            void e232;
            blockTripWireHook = this;
            dZ2 = e232.J(FACING);
            n6 = e232.J(ATTACHED).booleanValue();
            e232 = e232.J(POWERED);
            int n8 = !Gg.J((I)g2, (XF)f2.down()) ? vRa.d : uSa.E;
            n52 = d2 == false ? vRa.d : uSa.E;
            int bl4 = uSa.E;
            n5 = uSa.E;
            iBlockStateArray = new IBlockState[cQa.i];
            int n9 = n7 = vRa.d;
            while (n9 < cQa.i) {
                void b2;
                xF3 = f2.offset(dZ2, n7);
                h2 = g2.J(xF3);
                if (h2.J() == QFa.r) {
                    if (h2.J(FACING) != dZ2.getOpposite()) break;
                    n5 = n7;
                    n4 = n52;
                    break block12;
                }
                if (h2.J() != QFa.Qa && n7 != b2) {
                    iBlockStateArray[n7] = null;
                    n52 = uSa.E;
                } else {
                    if (n7 == b2) {
                        void a2;
                        h2 = (IBlockState)Objects.firstNonNull(a2, h2);
                    }
                    int n10 = h2.J(BlockTripWire.DISARMED) == false ? vRa.d : uSa.E;
                    boolean bl5 = h2.J(BlockTripWire.POWERED);
                    int n11 = h2.J(BlockTripWire.SUSPENDED).booleanValue();
                    n52 &= n11 == n8 ? vRa.d : uSa.E;
                    n3 |= n10 != 0 && bl5 ? vRa.d : uSa.E;
                    int n12 = n7;
                    iBlockStateArray[n12] = h2;
                    if (n12 == b2) {
                        BlockTripWireHook blockTripWireHook2 = blockTripWireHook;
                        g2.J((XF)f2, (Block)blockTripWireHook2, blockTripWireHook2.J((Gg)g2));
                        n52 &= n10;
                    }
                }
                n9 = ++n7;
            }
            n4 = n52;
        }
        n52 = n4 & (n5 > vRa.d ? vRa.d : uSa.E);
        boolean bl6 = n3 & n52;
        IBlockState iBlockState3 = blockTripWireHook.J().J(ATTACHED, n52 != 0).J(POWERED, bl6);
        if (n5 > 0) {
            xF3 = f2.offset(dZ2, n5);
            h2 = dZ2.getOpposite();
            g2.J(xF3, iBlockState3.J(FACING, h2), yRa.d);
            BlockTripWireHook blockTripWireHook3 = blockTripWireHook;
            blockTripWireHook3.J((Gg)g2, xF3, (DZ)((Object)h2));
            blockTripWireHook3.J((Gg)g2, xF3, n52 != 0, bl6, n6 != 0, e232);
        }
        blockTripWireHook.J((Gg)g2, (XF)f2, n52 != 0, bl6, n6 != 0, e232);
        if (d2 == false) {
            void c2;
            g2.J((XF)f2, iBlockState3.J(FACING, dZ2), yRa.d);
            if (c2 != false) {
                blockTripWireHook.J((Gg)g2, (XF)f2, dZ2);
            }
        }
        if (n6 != n52) {
            int n13;
            int n14 = n13 = vRa.d;
            while (n14 < n5) {
                h2 = f2.offset(dZ2, n13);
                IBlockState iBlockState4 = iBlockStateArray[n13];
                if (iBlockState4 != null && g2.J((XF)((Object)h2)).J() != QFa.HF) {
                    g2.J((XF)((Object)h2), iBlockState4.J(ATTACHED, n52 != 0), yRa.d);
                }
                n14 = ++n13;
            }
        }
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        void b2;
        BlockTripWireHook blockTripWireHook = this;
        float c2 = sqa.Z;
        switch (BlockTripWireHook$1.$SwitchMap$net$minecraft$util$EnumFacing[b2.J((XF)a2).J(FACING).ordinal()]) {
            case 1: {
                blockTripWireHook.J(JPa.N, psa.N, MQa.L - c2, c2 * kta.v, xSa.la, MQa.L + c2);
                return;
            }
            case 2: {
                blockTripWireHook.J(pqa.r - c2 * kta.v, psa.N, MQa.L - c2, pqa.r, xSa.la, MQa.L + c2);
                return;
            }
            case 3: {
                blockTripWireHook.J(MQa.L - c2, psa.N, JPa.N, MQa.L + c2, xSa.la, c2 * kta.v);
                return;
            }
            case 4: {
                blockTripWireHook.J(MQa.L - c2, psa.N, pqa.r - c2 * kta.v, MQa.L + c2, xSa.la, pqa.r);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        BlockTripWireHook b2 = this;
        Object d2 = xF2;
        if (!b2.J((Gg)c2, (XF)((Object)d2))) {
            void a2;
            void v0 = c2;
            b2.J((Gg)v0, (XF)((Object)d2), (IBlockState)a2, uSa.E);
            v0.G((XF)((Object)d2));
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        DZ d2 = dZ2;
        BlockTripWireHook a2 = this;
        if (d2.getAxis().isHorizontal() && c2.J(b2.offset(d2.getOpposite())).J().A()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockTripWireHook a2 = this;
        return a2.J().J(FACING, DZ.getHorizontal(b2 & yRa.d)).J(POWERED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0).J(ATTACHED, ((b2 & AQa.P) > 0 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, XF xF2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        void b2;
        void d2;
        void f2;
        void a2;
        void c2;
        Object g2 = xF2;
        BlockTripWireHook e2 = this;
        if (c2 != false && a2 == false) {
            f2.J((double)g2.getX() + kTa.B, (double)g2.getY() + tpa.k, (double)g2.getZ() + kTa.B, kqa.B, Xpa.R, Ora.D);
            return;
        }
        if (c2 == false && a2 != false) {
            f2.J((double)g2.getX() + kTa.B, (double)g2.getY() + tpa.k, (double)g2.getZ() + kTa.B, kqa.B, Xpa.R, MQa.L);
            return;
        }
        if (d2 != false && b2 == false) {
            f2.J((double)g2.getX() + kTa.B, (double)g2.getY() + tpa.k, (double)g2.getZ() + kTa.B, kqa.B, Xpa.R, ZSa.q);
            return;
        }
        if (d2 == false && b2 != false) {
            f2.J((double)g2.getX() + kTa.B, (double)g2.getY() + tpa.k, (double)g2.getZ() + kTa.B, WSa.Ja, Xpa.R, pPa.c / (f2.v.nextFloat() * psa.N + ATa.r));
        }
    }

    @Override
    public BlockState J() {
        BlockTripWireHook a2;
        IProperty[] iPropertyArray = new IProperty[AQa.P];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = POWERED;
        iPropertyArray[uqa.g] = ATTACHED;
        iPropertyArray[yRa.d] = SUSPENDED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, XF xF2, DZ dZ2) {
        void a2;
        void c2;
        XF d2 = xF2;
        BlockTripWireHook b2 = this;
        void v0 = c2;
        v0.f(d2, (Block)b2);
        v0.f(d2.offset(a2.getOpposite()), (Block)b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void f5;
        Object i2 = gg2;
        BlockTripWireHook h2 = this;
        i2 = h2.J().J(POWERED, uSa.E != 0).J(ATTACHED, uSa.E != 0).J(SUSPENDED, uSa.E != 0);
        if (f5.getAxis().isHorizontal()) {
            i2 = i2.J(FACING, f5);
        }
        return i2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        void a2;
        IBlockState e2 = iBlockState;
        BlockTripWireHook b2 = this;
        if (!e2.J(POWERED).booleanValue()) {
            return uSa.E;
        }
        if (e2.J(FACING) == a2) {
            return Ypa.A;
        }
        return uSa.E;
    }
}

