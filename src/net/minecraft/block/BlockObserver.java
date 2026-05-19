/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  XTa
 *  Ypa
 *  uRa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockObserver
extends Block {
    public static final PropertyBool POWERED;
    public static final PropertyDirection FACING;

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        void a2;
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockObserver b2 = this;
        return e2.J().J((I)d2, (XF)c2, e2, (DZ)a2);
    }

    public static DZ J(int n2) {
        int n3 = n2;
        int a2 = n3 & XTa.W;
        if (a2 > tTa.h) {
            return null;
        }
        return DZ.getFront(a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(IBlockState iBlockState, Gg gg2, XF xF2) {
        void a2;
        void c2;
        BlockObserver d2 = gg2;
        BlockObserver b2 = this;
        if (!c2.J(POWERED).booleanValue() && !d2.J((XF)a2, (Block)b2)) {
            BlockObserver blockObserver = b2;
            d2.J((XF)a2, blockObserver, blockObserver.J((Gg)d2));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        IBlockState d2 = iBlockState;
        BlockObserver a2 = this;
        if (!c2.e) {
            void b2;
            if (d2.J(POWERED).booleanValue()) {
                void v0 = c2;
                a2.f((Gg)v0, (XF)b2, d2, v0.v);
            }
            a2.J(d2, (Gg)c2, (XF)b2);
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
        BlockObserver a2 = this;
        if (d2.J(POWERED).booleanValue() && c2.J((XF)b2, (Block)a2)) {
            a2.C((Gg)c2, (XF)b2, d2.J(POWERED, uSa.E != 0));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        BlockObserver blockObserver;
        void b2;
        BlockObserver e2 = gg2;
        BlockObserver d2 = this;
        if (b2.J(POWERED).booleanValue()) {
            blockObserver = d2;
            e2.J((XF)c2, b2.J(POWERED, uSa.E != 0), uqa.g);
        } else {
            e2.J((XF)c2, b2.J(POWERED, vRa.d != 0), uqa.g);
            BlockObserver blockObserver2 = d2;
            e2.J((XF)c2, blockObserver2, blockObserver2.J((Gg)e2));
            blockObserver = d2;
        }
        blockObserver.C((Gg)e2, (XF)c2, (IBlockState)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        XF b2;
        Object d2 = iBlockState;
        BlockObserver a2 = this;
        d2 = d2.J(FACING);
        b2 = b2.offset(((DZ)((Object)d2)).getOpposite());
        void v0 = c2;
        v0.l(b2, (Block)a2);
        v0.J(b2, (Block)a2, (DZ)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockObserver i2;
        void g2;
        void h2;
        BlockObserver blockObserver = blockObserver2;
        BlockObserver blockObserver2 = gl2;
        BlockObserver a2 = blockObserver;
        return a2.J().J(FACING, BlockPistonBase.J((Gg)h2, (XF)g2, (Gl)i2).getOpposite()).J(POWERED, uSa.E != 0);
    }

    @Override
    public int J(Gg gg2) {
        BlockObserver b2 = gg2;
        BlockObserver a2 = this;
        return uqa.g;
    }

    public BlockObserver() {
        BlockObserver a2;
        BlockObserver blockObserver = a2;
        super(Material.rock, MapColor.stoneColor);
        blockObserver.J(blockObserver.blockState.J().J(FACING, DZ.SOUTH).J(POWERED, uSa.E != 0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockObserver blockObserver = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getIndex();
        if (a2.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    static {
        FACING = PropertyDirection.J(oua.ja);
        POWERED = PropertyBool.J(uRa.M);
    }

    @Override
    public BlockState J() {
        BlockObserver a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockObserver a2 = this;
        return a2.J().J(FACING, BlockObserver.J(b2)).J(POWERED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(IBlockState iBlockState, Gg gg2, XF xF2, Block block, XF xF3) {
        void a2;
        void e2;
        void d2;
        XF f2 = xF2;
        BlockObserver c2 = this;
        if (!d2.e && f2.offset(e2.J(FACING)).equals(a2)) {
            c2.J((IBlockState)e2, (Gg)d2, f2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        void a2;
        IBlockState e2 = iBlockState;
        BlockObserver b2 = this;
        if (e2.J(POWERED).booleanValue() && e2.J(FACING) == a2) {
            return Ypa.A;
        }
        return uSa.E;
    }
}

