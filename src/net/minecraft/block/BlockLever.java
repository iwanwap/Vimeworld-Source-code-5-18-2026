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
 *  bpa
 *  kqa
 *  kta
 *  pqa
 *  psa
 *  pua
 *  uRa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockLever$1;
import net.minecraft.block.BlockLever$EnumOrientation;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockLever
extends Block {
    public static final PropertyBool POWERED;
    public static final PropertyEnum<BlockLever$EnumOrientation> FACING;

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    static {
        FACING = PropertyEnum.J(oua.ja, BlockLever$EnumOrientation.class);
        POWERED = PropertyBool.J(uRa.M);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        void h2;
        Object i2 = iBlockState;
        BlockLever f5 = this;
        if (h2.e) {
            return vRa.d != 0;
        }
        i2 = i2.J(POWERED);
        void v0 = h2;
        v0.J((XF)g2, (IBlockState)i2, yRa.d);
        v0.J((double)g2.getX() + kTa.B, (double)g2.getY() + kTa.B, (double)g2.getZ() + kTa.B, kqa.B, bpa.K, i2.J(POWERED) != false ? Ora.D : MQa.L);
        h2.f((XF)g2, (Block)f5);
        i2 = i2.J(FACING).getFacing();
        h2.f(g2.offset(((DZ)((Object)i2)).getOpposite()), (Block)f5);
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
        BlockLever blockLever = this;
        float c2 = sqa.Z;
        switch (BlockLever$1.$SwitchMap$net$minecraft$block$BlockLever$EnumOrientation[b2.J((XF)a2).J(FACING).ordinal()]) {
            case 1: {
                blockLever.J(JPa.N, psa.N, MQa.L - c2, c2 * kta.v, xSa.la, MQa.L + c2);
                return;
            }
            case 2: {
                blockLever.J(pqa.r - c2 * kta.v, psa.N, MQa.L - c2, pqa.r, xSa.la, MQa.L + c2);
                return;
            }
            case 3: {
                blockLever.J(MQa.L - c2, psa.N, JPa.N, MQa.L + c2, xSa.la, c2 * kta.v);
                return;
            }
            case 4: {
                blockLever.J(MQa.L - c2, psa.N, pqa.r - c2 * kta.v, MQa.L + c2, xSa.la, pqa.r);
                return;
            }
            case 5: 
            case 6: {
                c2 = rta.o;
                blockLever.J(MQa.L - c2, JPa.N, MQa.L - c2, MQa.L + c2, Ora.D, MQa.L + c2);
                return;
            }
            case 7: 
            case 8: {
                c2 = rta.o;
                blockLever.J(MQa.L - c2, Xpa.R, MQa.L - c2, MQa.L + c2, pqa.r, MQa.L + c2);
                return;
            }
        }
    }

    @Override
    public BlockState J() {
        BlockLever a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockLever blockLever = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getMetadata();
        if (a2.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    public BlockLever() {
        BlockLever a2;
        BlockLever blockLever = a2;
        super(Material.circuits);
        blockLever.J(blockLever.blockState.J().J(FACING, BlockLever$EnumOrientation.NORTH).J(POWERED, uSa.E != 0));
        blockLever.J(yGa.I);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        void a2;
        IBlockState e2 = iBlockState;
        BlockLever b2 = this;
        if (!e2.J(POWERED).booleanValue()) {
            return uSa.E;
        }
        if (e2.J(FACING).getFacing() == a2) {
            return Ypa.A;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockLever b2 = this;
        Object d2 = xF2;
        if (b2.J((Gg)c2, (XF)((Object)d2))) {
            return vRa.d != 0;
        }
        b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2, uSa.E);
        c2.G((XF)((Object)d2));
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int J(DZ a2) {
        switch (BlockLever$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                return uSa.E;
            }
            case 2: {
                return tTa.h;
            }
            case 3: {
                return AQa.P;
            }
            case 4: {
                return yRa.d;
            }
            case 5: {
                return uqa.g;
            }
            case 6: {
                return vRa.d;
            }
        }
        return pua.o;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockLever a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean f(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        Object c2 = dZ2;
        Gg a2 = gg2;
        return BlockButton.f(a2, (XF)b2, (DZ)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void a2;
        void f5;
        void g2;
        void h2;
        float f6 = f2;
        BlockLever e2 = this;
        IBlockState i2 = e2.J().J(POWERED, uSa.E != 0);
        if (BlockLever.f((Gg)h2, (XF)g2, f5.getOpposite())) {
            return i2.J(FACING, BlockLever$EnumOrientation.forFacings((DZ)f5, a2.J()));
        }
        for (DZ c2 : LX.HORIZONTAL) {
            if (c2 == f5 || !BlockLever.f((Gg)h2, (XF)g2, c2.getOpposite())) continue;
            return i2.J(FACING, BlockLever$EnumOrientation.forFacings(c2, a2.J()));
        }
        if (Gg.J((I)h2, (XF)g2.down())) {
            return i2.J(FACING, BlockLever$EnumOrientation.forFacings(DZ.UP, a2.J()));
        }
        return i2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockLever a2 = this;
        if (d2.J(POWERED).booleanValue()) {
            c2.f((XF)b2, (Block)a2);
            DZ dZ2 = d2.J(FACING).getFacing();
            c2.f(b2.offset(dZ2.getOpposite()), (Block)a2);
        }
        super.l((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        int c2;
        BlockLever blockLever = this;
        DZ[] dZArray = DZ.values();
        int n2 = dZArray.length;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            void a2;
            void b2;
            DZ dZ2 = dZArray[c2];
            if (BlockLever.f((Gg)b2, (XF)a2, dZ2)) {
                return vRa.d != 0;
            }
            n3 = ++c2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void b2;
        void d2;
        BlockLever c2 = this;
        Object e2 = xF2;
        if (c2.J((Gg)d2, (XF)((Object)e2), (IBlockState)b2) && !BlockLever.f((Gg)d2, (XF)((Object)e2), b2.J(FACING).getFacing().getOpposite())) {
            void v0 = d2;
            c2.J((Gg)v0, (XF)((Object)e2), (IBlockState)b2, uSa.E);
            v0.G((XF)((Object)e2));
        }
    }

    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        IBlockState e2 = iBlockState;
        BlockLever b2 = this;
        if (e2.J(POWERED).booleanValue()) {
            return Ypa.A;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        DZ d2 = dZ2;
        BlockLever a2 = this;
        return BlockLever.f((Gg)c2, (XF)b2, d2.getOpposite());
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockLever a2 = this;
        return a2.J().J(FACING, BlockLever$EnumOrientation.byMetadata(b2 & XTa.W)).J(POWERED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

