/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  MQa
 *  XTa
 *  Ypa
 *  Yra
 *  bpa
 *  jea
 *  kqa
 *  pqa
 *  uRa
 *  vL
 *  vRa
 *  wPa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockButton$1;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockButton
extends Block {
    private final boolean wooden;
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja);
    public static final PropertyBool POWERED = PropertyBool.J(uRa.M);

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, XF xF2, DZ dZ2) {
        void a2;
        void c2;
        XF d2 = xF2;
        BlockButton b2 = this;
        void v0 = c2;
        v0.f(d2, (Block)b2);
        v0.f(d2.offset(a2.getOpposite()), (Block)b2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockButton b2 = this;
        Object d2 = xF2;
        if (b2.J((Gg)c2, (XF)((Object)d2))) {
            return vRa.d != 0;
        }
        b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2, uSa.E);
        c2.G((XF)((Object)d2));
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public int f(IBlockState iBlockState) {
        void v0;
        int b2;
        void a2;
        BlockButton blockButton = this;
        switch (BlockButton$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.J(FACING).ordinal()]) {
            case 1: {
                b2 = vRa.d;
                v0 = a2;
                break;
            }
            case 2: {
                b2 = uqa.g;
                v0 = a2;
                break;
            }
            case 3: {
                b2 = yRa.d;
                v0 = a2;
                break;
            }
            case 4: {
                b2 = AQa.P;
                v0 = a2;
                break;
            }
            default: {
                b2 = tTa.h;
                v0 = a2;
                break;
            }
            case 6: {
                b2 = uSa.E;
                v0 = a2;
            }
        }
        if (v0.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        DZ d2 = dZ2;
        BlockButton a2 = this;
        return BlockButton.f((Gg)c2, (XF)b2, d2.getOpposite());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void g2;
        void h2;
        DZ i2 = dZ2;
        BlockButton f5 = this;
        if (BlockButton.f((Gg)h2, (XF)g2, i2.getOpposite())) {
            return f5.J().J(FACING, i2).J(POWERED, uSa.E != 0);
        }
        return f5.J().J(FACING, DZ.DOWN).J(POWERED, uSa.E != 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f(IBlockState iBlockState) {
        IBlockState b322 = iBlockState;
        BlockButton a2 = this;
        DZ dZ2 = b322.J(FACING);
        boolean b322 = b322.J(POWERED);
        float b322 = (float)(b322 ? vRa.d : uqa.g) / Yra.i;
        switch (BlockButton$1.$SwitchMap$net$minecraft$util$EnumFacing[dZ2.ordinal()]) {
            case 1: {
                a2.J(JPa.N, MRa.K, wPa.F, b322, Jpa.y, sOa.Ka);
                return;
            }
            case 2: {
                a2.J(pqa.r - b322, MRa.K, wPa.F, pqa.r, Jpa.y, sOa.Ka);
                return;
            }
            case 3: {
                a2.J(wPa.F, MRa.K, JPa.N, sOa.Ka, Jpa.y, b322);
                return;
            }
            case 4: {
                a2.J(wPa.F, MRa.K, pqa.r - b322, sOa.Ka, Jpa.y, pqa.r);
                return;
            }
            case 5: {
                a2.J(wPa.F, JPa.N, MRa.K, sOa.Ka, JPa.N + b322, Jpa.y);
                return;
            }
            case 6: {
                a2.J(wPa.F, pqa.r - b322, MRa.K, sOa.Ka, pqa.r, Jpa.y);
                return;
            }
        }
    }

    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        IBlockState e2 = iBlockState;
        BlockButton b2 = this;
        if (e2.J(POWERED).booleanValue()) {
            return Ypa.A;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        void d2;
        IBlockState e2 = iBlockState;
        BlockButton b2 = this;
        if (!d2.e && b2.wooden && !e2.J(POWERED).booleanValue()) {
            void c2;
            b2.C((Gg)d2, (XF)c2, e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void h2;
        void f5;
        Object i2 = xF2;
        BlockButton g2 = this;
        if (f5.J(POWERED).booleanValue()) {
            return vRa.d != 0;
        }
        h2.J((XF)((Object)i2), f5.J(POWERED, vRa.d != 0), yRa.d);
        void v0 = h2;
        Object object = i2;
        v0.J((XF)((Object)object), (XF)((Object)object));
        v0.J((double)i2.getX() + kTa.B, (double)i2.getY() + kTa.B, (double)i2.getZ() + kTa.B, kqa.B, bpa.K, Ora.D);
        g2.J((Gg)h2, (XF)((Object)i2), f5.J(FACING));
        BlockButton blockButton = g2;
        h2.J((XF)((Object)i2), (Block)blockButton, blockButton.J((Gg)h2));
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void b2;
        void d2;
        BlockButton c2 = this;
        Object e2 = xF2;
        if (c2.J((Gg)d2, (XF)((Object)e2), (IBlockState)b2) && !BlockButton.f((Gg)d2, (XF)((Object)e2), b2.J(FACING).getOpposite())) {
            void v0 = d2;
            c2.J((Gg)v0, (XF)((Object)e2), (IBlockState)b2, uSa.E);
            v0.G((XF)((Object)e2));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockButton a2 = this;
        if (d2.J(POWERED).booleanValue()) {
            a2.J((Gg)c2, (XF)b2, d2.J(FACING));
        }
        super.l((Gg)c2, (XF)b2, d2);
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockButton a2 = this;
        return null;
    }

    @Override
    public int J(Gg gg2) {
        BlockButton b2 = gg2;
        BlockButton a2 = this;
        if (a2.wooden) {
            return Fsa.d;
        }
        return kTa.j;
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockButton blockButton = random2;
        Random random2 = random;
        BlockButton a2 = blockButton;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockButton a2 = this;
        a2.f(b2.J((XF)((Object)c2)));
    }

    public BlockButton(boolean bl2) {
        BlockButton a2;
        boolean b2 = bl2;
        BlockButton blockButton = a2 = this;
        super(Material.circuits);
        blockButton.J(blockButton.blockState.J().J(FACING, DZ.NORTH).J(POWERED, uSa.E != 0));
        blockButton.J(vRa.d != 0);
        a2.J(yGa.I);
        a2.wooden = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void b2;
        void d2;
        Object e2 = xF2;
        BlockButton c2 = this;
        if (!d2.e && b2.J(POWERED).booleanValue()) {
            if (c2.wooden) {
                c2.C((Gg)d2, (XF)((Object)e2), (IBlockState)b2);
                return;
            }
            d2.J((XF)((Object)e2), b2.J(POWERED, uSa.E != 0));
            c2.J((Gg)d2, (XF)((Object)e2), b2.J(FACING));
            Object object = e2;
            void v1 = d2;
            v1.J((double)e2.getX() + kTa.B, (double)e2.getY() + kTa.B, (double)e2.getZ() + kTa.B, kqa.B, bpa.K, MQa.L);
            v1.J((XF)((Object)object), (XF)((Object)object));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        void a2;
        Object d2 = xF2;
        BlockButton b2 = this;
        b2.f((IBlockState)a2);
        int n2 = !c2.J(jea.class, new xy((double)d2.getX() + b2.minX, (double)d2.getY() + b2.minY, (double)d2.getZ() + b2.minZ, (double)d2.getX() + b2.maxX, (double)d2.getY() + b2.maxY, (double)d2.getZ() + b2.maxZ)).isEmpty() ? vRa.d : uSa.E;
        boolean bl2 = a2.J(POWERED);
        if (n2 != 0 && !bl2) {
            void v0 = c2;
            v0.J((XF)((Object)d2), a2.J(POWERED, vRa.d != 0));
            b2.J((Gg)v0, (XF)((Object)d2), a2.J(FACING));
            void v1 = c2;
            Object object = d2;
            v1.J((XF)((Object)object), (XF)((Object)object));
            v1.J((double)d2.getX() + kTa.B, (double)d2.getY() + kTa.B, (double)d2.getZ() + kTa.B, kqa.B, bpa.K, Ora.D);
        }
        if (n2 == 0 && bl2) {
            void v3 = c2;
            v3.J((XF)((Object)d2), a2.J(POWERED, uSa.E != 0));
            b2.J((Gg)v3, (XF)((Object)d2), a2.J(FACING));
            void v4 = c2;
            Object object = d2;
            v4.J((XF)((Object)object), (XF)((Object)object));
            v4.J((double)d2.getX() + kTa.B, (double)d2.getY() + kTa.B, (double)d2.getZ() + kTa.B, kqa.B, bpa.K, MQa.L);
        }
        if (n2 != 0) {
            BlockButton blockButton = b2;
            c2.J((XF)((Object)d2), (Block)blockButton, blockButton.J((Gg)c2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean f(Gg gg2, XF xF2, DZ dZ2) {
        void a2;
        Object c2 = xF2;
        Gg b2 = gg2;
        c2 = c2.offset((DZ)a2);
        if (a2 == DZ.DOWN) {
            return Gg.J((I)b2, (XF)((Object)c2));
        }
        return b2.J((XF)((Object)c2)).J().A();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        void a2;
        IBlockState e2 = iBlockState;
        BlockButton b2 = this;
        if (!e2.J(POWERED).booleanValue()) {
            return uSa.E;
        }
        if (e2.J(FACING) == a2) {
            return Ypa.A;
        }
        return uSa.E;
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    @Override
    public void f() {
        BlockButton blockButton = this;
        float f2 = sqa.Z;
        float f3 = Mqa.N;
        float a2 = Mqa.N;
        blockButton.J(MQa.L - f2, MQa.L - f3, MQa.L - a2, MQa.L + f2, MQa.L + f3, MQa.L + a2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public IBlockState J(int n2) {
        boolean bl2;
        void b22;
        BlockButton blockButton;
        void a2;
        BlockButton blockButton2 = this;
        switch (a2 & XTa.W) {
            case 0: {
                DZ b22 = DZ.DOWN;
                blockButton = blockButton2;
                break;
            }
            case 1: {
                DZ b22 = DZ.EAST;
                blockButton = blockButton2;
                break;
            }
            case 2: {
                DZ b22 = DZ.WEST;
                blockButton = blockButton2;
                break;
            }
            case 3: {
                DZ b22 = DZ.SOUTH;
                blockButton = blockButton2;
                break;
            }
            case 4: {
                DZ b22 = DZ.NORTH;
                blockButton = blockButton2;
                break;
            }
            default: {
                DZ b22 = DZ.UP;
                blockButton = blockButton2;
            }
        }
        IBlockState iBlockState = blockButton.J().J(FACING, b22);
        if ((a2 & Yqa.i) > 0) {
            bl2 = vRa.d;
            return iBlockState.J(POWERED, bl2);
        }
        bl2 = uSa.E;
        return iBlockState.J(POWERED, bl2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        int c2;
        BlockButton blockButton = this;
        DZ[] dZArray = DZ.values();
        int n2 = dZArray.length;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            void a2;
            void b2;
            DZ dZ2 = dZArray[c2];
            if (BlockButton.f((Gg)b2, (XF)a2, dZ2)) {
                return vRa.d != 0;
            }
            n3 = ++c2;
        }
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockButton a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }
}

