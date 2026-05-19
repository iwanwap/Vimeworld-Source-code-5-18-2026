/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  Mda
 *  QFa
 *  Ypa
 *  ez
 *  pqa
 *  pua
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockRedstoneDiode
extends BlockDirectional {
    public final boolean isRepeaterPowered;

    @Override
    public boolean J(Block block) {
        Block b2 = block;
        BlockRedstoneDiode a2 = this;
        return a2.C(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        int n2;
        void c2;
        void d2;
        DZ[] e2 = iBlockState;
        DZ[] b2 = this;
        if (b2.l((Gg)d2, (XF)c2)) {
            b2.C((Gg)d2, (XF)c2, (IBlockState)e2);
            return;
        }
        b2.J((Gg)d2, (XF)c2, (IBlockState)e2, uSa.E);
        d2.G((XF)c2);
        e2 = DZ.values();
        int a2 = e2.length;
        int n3 = n2 = uSa.E;
        while (n3 < a2) {
            DZ dZ2 = e2[n2];
            d2.f(c2.offset(dZ2), (Block)b2);
            n3 = ++n2;
        }
    }

    public boolean J(I i2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        return uSa.E != 0;
    }

    public int J(Gg gg2, XF xF2, IBlockState iBlockState) {
        XF b2;
        IBlockState c2;
        Object d22 = iBlockState;
        BlockRedstoneDiode a2 = this;
        int d22 = c2.f(b2 = b2.offset((DZ)((Object)(d22 = d22.J(FACING)))), (DZ)((Object)d22));
        if (d22 >= Ypa.A) {
            return d22;
        }
        return Math.max(d22, (c2 = c2.J(b2)).J() == QFa.pa ? c2.J(BlockRedstoneWire.POWER) : uSa.E);
    }

    public boolean C(Block block) {
        block3: {
            block2: {
                BlockRedstoneDiode a2;
                Block b2 = block;
                BlockRedstoneDiode blockRedstoneDiode = a2 = this;
                if (b2 == blockRedstoneDiode.f(blockRedstoneDiode.J()).J()) break block2;
                BlockRedstoneDiode blockRedstoneDiode2 = a2;
                if (b2 != blockRedstoneDiode2.l(blockRedstoneDiode2.J()).J()) break block3;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract IBlockState l(IBlockState var1);

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        Object e2;
        void b2;
        void c2;
        void d2;
        BlockRedstoneDiode blockRedstoneDiode = object;
        Object object = dZ2;
        BlockRedstoneDiode a2 = blockRedstoneDiode;
        return a2.J((I)d2, (XF)c2, (IBlockState)b2, (DZ)((Object)e2));
    }

    public abstract int e(IBlockState var1);

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockRedstoneDiode a2 = this;
        return Gg.J((I)b2, (XF)c2.down());
    }

    /*
     * WARNING - void declaration
     */
    public int f(I i2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object d2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        DZ dZ2 = d2.J(FACING);
        d2 = dZ2.rotateY();
        DZ dZ3 = dZ2.rotateYCCW();
        return Math.max(a2.J((I)c2, b2.offset((DZ)((Object)d2)), (DZ)((Object)d2)), a2.J((I)c2, b2.offset(dZ3), dZ3));
    }

    /*
     * WARNING - void declaration
     */
    public void d(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        XF b2;
        Object d2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        d2 = d2.J(FACING);
        b2 = b2.offset(((DZ)((Object)d2)).getOpposite());
        void v0 = c2;
        v0.l(b2, (Block)a2);
        v0.J(b2, (Block)a2, (DZ)((Object)d2));
    }

    public abstract IBlockState f(IBlockState var1);

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        a2.d((Gg)c2, (XF)b2, d2);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockRedstoneDiode a2 = this;
        if (Gg.J((I)b2, (XF)c2.down())) {
            return super.J((Gg)b2, c2);
        }
        return uSa.E != 0;
    }

    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        DZ d2 = dZ2;
        BlockRedstoneDiode a2 = this;
        if (d2.getAxis() != RX.Y) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        return a2.isRepeaterPowered;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        void a2;
        Object b2 = this;
        IBlockState e2 = iBlockState;
        if (!((BlockRedstoneDiode)b2).J(e2)) {
            return uSa.E;
        }
        if (e2.J(FACING) == a2) {
            void c2;
            void d2;
            return ((BlockRedstoneDiode)b2).J((I)d2, (XF)c2, e2);
        }
        return uSa.E;
    }

    public int J(I i2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        return Ypa.A;
    }

    public boolean l(Block block) {
        Block b2 = block;
        BlockRedstoneDiode a2 = this;
        return b2.C();
    }

    public static boolean f(Block a2) {
        if (QFa.t.C(a2) || QFa.kc.C(a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        BlockRedstoneDiode blockRedstoneDiode = this;
        if (!blockRedstoneDiode.J((I)c2, (XF)b2, (IBlockState)a2)) {
            BlockRedstoneDiode blockRedstoneDiode2 = blockRedstoneDiode;
            int d2 = blockRedstoneDiode2.J((Gg)c2, (XF)b2, (IBlockState)a2);
            if ((blockRedstoneDiode2.isRepeaterPowered && d2 == 0 || !blockRedstoneDiode.isRepeaterPowered && d2 != 0) && !c2.J((XF)b2, (Block)blockRedstoneDiode)) {
                void v1;
                d2 = pua.o;
                if (blockRedstoneDiode.f((Gg)c2, (XF)b2, (IBlockState)a2)) {
                    d2 = ERa.Ka;
                    v1 = c2;
                } else {
                    if (blockRedstoneDiode.isRepeaterPowered) {
                        d2 = rQa.p;
                    }
                    v1 = c2;
                }
                BlockRedstoneDiode blockRedstoneDiode3 = blockRedstoneDiode;
                v1.J((XF)b2, (Block)blockRedstoneDiode3, blockRedstoneDiode3.e((IBlockState)a2), d2);
            }
        }
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockRedstoneDiode blockRedstoneDiode = random2;
        Random random2 = random;
        BlockRedstoneDiode a2 = blockRedstoneDiode;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(Gg gg2, XF xF2, IBlockState iBlockState) {
        XF b2;
        void c2;
        Object d2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        if (BlockRedstoneDiode.f(c2.J(b2 = b2.offset((DZ)((Object)(d2 = d2.J(FACING).getOpposite())))).J())) {
            if (c2.J(b2).J(FACING) != d2) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockRedstoneDiode i2;
        BlockRedstoneDiode blockRedstoneDiode = blockRedstoneDiode2;
        BlockRedstoneDiode blockRedstoneDiode2 = gl2;
        BlockRedstoneDiode a2 = blockRedstoneDiode;
        return a2.J().J(FACING, i2.J().getOpposite());
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object a2 = this;
        IBlockState d2 = iBlockState;
        if (((BlockRedstoneDiode)a2).J((Gg)c2, (XF)b2, d2) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BlockRedstoneDiode(boolean bl) {
        BlockRedstoneDiode a2;
        boolean b2 = bl;
        BlockRedstoneDiode blockRedstoneDiode = a2 = this;
        super(Material.circuits);
        blockRedstoneDiode.isRepeaterPowered = b2;
        blockRedstoneDiode.J(JPa.N, JPa.N, JPa.N, pqa.r, Mqa.N, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void c2;
        void e2;
        BlockRedstoneDiode d2 = this;
        Object f2 = xF2;
        if (d2.J((Gg)e2, (XF)((Object)f2), (IBlockState)c2)) {
            e2.J((XF)((Object)f2), (Block)d2, vRa.d);
        }
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    public int d(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneDiode a2 = this;
        return a2.e(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        BlockRedstoneDiode blockRedstoneDiode = this;
        if (blockRedstoneDiode.isRepeaterPowered) {
            int d2;
            DZ[] dZArray = DZ.values();
            int n2 = dZArray.length;
            int n3 = d2 = uSa.E;
            while (n3 < n2) {
                DZ dZ2 = dZArray[d2];
                c2.f(b2.offset(dZ2), (Block)blockRedstoneDiode);
                n3 = ++d2;
            }
        }
        super.J((Gg)c2, (XF)b2, (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    public int J(I i2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        BlockRedstoneDiode blockRedstoneDiode = this;
        IBlockState iBlockState = c2.J((XF)b2);
        Block d2 = iBlockState.J();
        if (blockRedstoneDiode.l(d2)) {
            void a2;
            if (d2 == QFa.pa) {
                return iBlockState.J(BlockRedstoneWire.POWER);
            }
            return c2.J((XF)b2, (DZ)a2);
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        void d2;
        Object b2 = this;
        IBlockState e2 = iBlockState;
        if (!((BlockRedstoneDiode)b2).J((I)d2, (XF)c2, e2)) {
            BlockRedstoneDiode blockRedstoneDiode = b2;
            boolean a2 = blockRedstoneDiode.J((Gg)d2, (XF)c2, e2);
            if (blockRedstoneDiode.isRepeaterPowered && !a2) {
                d2.J((XF)c2, ((BlockRedstoneDiode)b2).l(e2), uqa.g);
                return;
            }
            if (!((BlockRedstoneDiode)b2).isRepeaterPowered) {
                d2.J((XF)c2, ((BlockRedstoneDiode)b2).f(e2), uqa.g);
                if (!a2) {
                    d2.J((XF)c2, ((BlockRedstoneDiode)b2).f(e2).J(), ((BlockRedstoneDiode)b2).d(e2), pua.o);
                }
            }
        }
    }
}

