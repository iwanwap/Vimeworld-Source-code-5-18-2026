/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  Lz
 *  QFa
 *  ez
 *  pqa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailBase$Rail;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockRailBase
extends Block {
    public final boolean isPowered;

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockRailBase a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public RY J(Gg gg2, XF xF2, Lz lz2, Lz lz3) {
        void a2;
        void b2;
        void d2;
        BlockRailBase c2;
        Object e2 = xF2;
        BlockRailBase blockRailBase = c2 = this;
        blockRailBase.J((I)d2, (XF)((Object)e2));
        return super.J((Gg)d2, (XF)((Object)e2), (Lz)b2, (Lz)a2);
    }

    public BlockRailBase(boolean bl2) {
        BlockRailBase a2;
        boolean b2 = bl2;
        BlockRailBase blockRailBase = a2 = this;
        super(Material.circuits);
        a2.isPowered = b2;
        blockRailBase.J(JPa.N, JPa.N, JPa.N, pqa.r, Mqa.N, pqa.r);
        a2.J(yGa.f);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockRailBase b2;
        XF d2 = xF2;
        BlockRailBase blockRailBase = b2 = this;
        super.l((Gg)c2, d2, (IBlockState)a2);
        if (a2.J(blockRailBase.J()).isAscending()) {
            c2.f(d2.up(), (Block)b2);
        }
        if (b2.isPowered) {
            void v1 = c2;
            v1.f(d2, (Block)b2);
            v1.f(d2.down(), (Block)b2);
        }
    }

    @Override
    public int l() {
        return uSa.E;
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    public static boolean l(Gg gg2, XF xF2) {
        Object b2 = xF2;
        Gg a2 = gg2;
        return BlockRailBase.J(a2.J((XF)((Object)b2)));
    }

    public static boolean J(IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        Block a2 = iBlockState2.J();
        if (a2 == QFa.SA || a2 == QFa.JC || a2 == QFa.g || a2 == QFa.gc) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        BlockRailBase blockRailBase = block2;
        Block block2 = block;
        BlockRailBase a2 = blockRailBase;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        XF e2 = xF2;
        BlockRailBase c2 = this;
        if (!d2.e) {
            void a2;
            int n2;
            void b2;
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection = b2.J(c2.J());
            int n3 = uSa.E;
            if (!Gg.J((I)d2, (XF)e2.down())) {
                n3 = vRa.d;
            }
            if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.ASCENDING_EAST && !Gg.J((I)d2, (XF)e2.east())) {
                n2 = n3 = vRa.d;
            } else if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.ASCENDING_WEST && !Gg.J((I)d2, (XF)e2.west())) {
                n2 = n3 = vRa.d;
            } else if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.ASCENDING_NORTH && !Gg.J((I)d2, (XF)e2.north())) {
                n2 = n3 = vRa.d;
            } else {
                if (blockRailBase$EnumRailDirection == BlockRailBase$EnumRailDirection.ASCENDING_SOUTH && !Gg.J((I)d2, (XF)e2.south())) {
                    n3 = vRa.d;
                }
                n2 = n3;
            }
            if (n2 != 0) {
                void v1 = d2;
                c2.J((Gg)v1, e2, (IBlockState)b2, uSa.E);
                v1.G(e2);
                return;
            }
            c2.f((Gg)d2, e2, (IBlockState)b2, (Block)a2);
        }
    }

    @Override
    public void J(I i2, XF xF2) {
        IBlockState b2;
        Object c2 = xF2;
        BlockRailBase a2 = this;
        Object object = c2 = (b2 = b2.J((XF)((Object)c2))).J() == a2 ? b2.J(a2.J()) : null;
        if (c2 != null && ((BlockRailBase$EnumRailDirection)((Object)c2)).isAscending()) {
            a2.J(JPa.N, JPa.N, JPa.N, pqa.r, Jpa.y, pqa.r);
            return;
        }
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, Mqa.N, pqa.r);
    }

    public abstract IProperty<BlockRailBase$EnumRailDirection> J();

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        Object d2 = iBlockState;
        BlockRailBase a2 = this;
        if (!c2.e) {
            void b2;
            BlockRailBase blockRailBase = a2;
            d2 = blockRailBase.J((Gg)c2, (XF)b2, (IBlockState)d2, vRa.d != 0);
            if (blockRailBase.isPowered) {
                a2.J((Gg)c2, (XF)b2, (IBlockState)d2, a2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockRailBase a2 = this;
        return Gg.J((I)b2, (XF)c2.down());
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl2) {
        void a2;
        void c2;
        void b2;
        BlockRailBase e2 = gg2;
        BlockRailBase d2 = this;
        if (((Gg)e2).e) {
            return b2;
        }
        return new BlockRailBase$Rail(d2, (Gg)e2, (XF)c2, (IBlockState)b2).J(e2.k((XF)c2), (boolean)a2).J();
    }
}

