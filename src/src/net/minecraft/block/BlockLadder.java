/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  ez
 *  pqa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder$1;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockLadder
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void g2;
        void h2;
        DZ i2 = dZ2;
        BlockLadder f5 = this;
        if (i2.getAxis().isHorizontal() && f5.f((Gg)h2, (XF)g2, i2)) {
            return f5.J().J(FACING, i2);
        }
        for (DZ e2 : LX.HORIZONTAL) {
            if (!f5.f((Gg)h2, (XF)g2, e2)) continue;
            return f5.J().J(FACING, e2);
        }
        return f5.J();
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockLadder a2 = this;
        DZ b22 = DZ.getFront(b22);
        if (b22.getAxis() == RX.Y) {
            b22 = DZ.NORTH;
        }
        return a2.J().J(FACING, b22);
    }

    public BlockLadder() {
        BlockLadder a2;
        BlockLadder blockLadder = a2;
        super(Material.circuits);
        blockLadder.J(blockLadder.blockState.J().J(FACING, DZ.NORTH));
        blockLadder.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        DZ d2 = dZ2;
        BlockLadder a2 = this;
        return c2.J(b2.offset(d2.getOpposite())).J().A();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(DZ dZ2) {
        void a2;
        BlockLadder blockLadder = this;
        float b2 = Mqa.N;
        switch (BlockLadder$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                blockLadder.J(JPa.N, JPa.N, pqa.r - b2, pqa.r, pqa.r, pqa.r);
                return;
            }
            case 2: {
                blockLadder.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, b2);
                return;
            }
            case 3: {
                blockLadder.J(pqa.r - b2, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                return;
            }
        }
        blockLadder.J(JPa.N, JPa.N, JPa.N, b2, pqa.r, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockLadder b2;
        Object d2 = xF2;
        BlockLadder blockLadder = b2 = this;
        blockLadder.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    @Override
    public BlockState J() {
        BlockLadder a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockLadder a2 = this;
        return b2.J(FACING).getIndex();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockLadder a2 = this;
        if (b2.J(c2.west()).J().A() || b2.J(c2.east()).J().A() || b2.J(c2.north()).J().A() || b2.J(c2.south()).J().A()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void a2;
        void d2;
        void b2;
        BlockLadder c2 = this;
        Object e2 = xF2;
        DZ dZ2 = b2.J(FACING);
        if (!c2.f((Gg)d2, (XF)((Object)e2), dZ2)) {
            void v0 = d2;
            c2.J((Gg)v0, (XF)((Object)e2), (IBlockState)b2, uSa.E);
            v0.G((XF)((Object)e2));
        }
        super.J((Gg)d2, (XF)((Object)e2), (IBlockState)b2, (Block)a2);
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2) {
        void b2;
        BlockLadder a2;
        Object c2 = xF2;
        BlockLadder blockLadder = a2 = this;
        blockLadder.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        Gg b2;
        BlockLadder blockLadder = this;
        Object c2 = b2.J((XF)a2);
        if (c2.J() == blockLadder) {
            blockLadder.J(c2.J(FACING));
            return;
        }
        if (b2 instanceof Gg && ((Gg)b2).h != null) {
            b2 = b2;
            c2 = b2.h;
            if (((DZ)((Object)c2)).getAxis().isHorizontal() && blockLadder.f(b2, (XF)a2, (DZ)((Object)c2))) {
                blockLadder.J((DZ)((Object)c2));
                return;
            }
            for (DZ dZ2 : LX.HORIZONTAL) {
                if (!blockLadder.f(b2, (XF)a2, dZ2)) continue;
                blockLadder.J(dZ2);
                return;
            }
            BlockLadder blockLadder2 = blockLadder;
            blockLadder2.J(blockLadder2.J().J(FACING));
        }
    }
}

