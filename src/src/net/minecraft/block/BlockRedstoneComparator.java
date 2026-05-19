/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  FEa
 *  Gg
 *  Gl
 *  I
 *  MQa
 *  QFa
 *  Spa
 *  Ypa
 *  bpa
 *  eAa
 *  kZ
 *  kqa
 *  pua
 *  uRa
 *  uY
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneComparator$1;
import net.minecraft.block.BlockRedstoneComparator$Mode;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockRedstoneComparator
extends BlockRedstoneDiode
implements ITileEntityProvider {
    public static final PropertyEnum<BlockRedstoneComparator$Mode> MODE;
    public static final PropertyBool POWERED;

    /*
     * WARNING - void declaration
     */
    private FEa J(Gg gg2, DZ dZ2, XF xF2) {
        void b2;
        List c2;
        Object d2 = xF2;
        BlockRedstoneComparator a2 = this;
        if ((c2 = c2.J(FEa.class, new xy((double)d2.getX(), (double)d2.getY(), (double)d2.getZ(), (double)(d2.getX() + vRa.d), (double)(d2.getY() + vRa.d), (double)(d2.getZ() + vRa.d)), new BlockRedstoneComparator$1(a2, (DZ)b2))).size() == vRa.d) {
            return (FEa)c2.get(uSa.E);
        }
        return null;
    }

    @Override
    public IBlockState l(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockRedstoneComparator a2 = this;
        Boolean bl2 = b2.J(POWERED);
        BlockRedstoneComparator$Mode blockRedstoneComparator$Mode = b2.J(MODE);
        b2 = b2.J(FACING);
        return QFa.kc.J().J(FACING, b2).J(POWERED, bl2).J(MODE, blockRedstoneComparator$Mode);
    }

    static {
        POWERED = PropertyBool.J(uRa.M);
        MODE = PropertyEnum.J(Qpa.q, BlockRedstoneComparator$Mode.class);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a22;
        FEa c2;
        Object d2 = xF2;
        BlockRedstoneComparator b2 = this;
        int a22 = super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a22);
        DZ dZ2 = a22.J(FACING);
        Block block = c2.J((XF)((Object)(d2 = ((XF)((Object)d2)).offset(dZ2)))).J();
        if (block.F()) {
            a22 = block.J((Gg)c2, (XF)((Object)d2));
            return a22;
        }
        if (a22 < Ypa.A && block.A()) {
            block = c2.J((XF)((Object)(d2 = ((XF)((Object)d2)).offset(dZ2)))).J();
            if (block.F()) {
                a22 = block.J((Gg)c2, (XF)((Object)d2));
                return a22;
            }
            if (block.J() == Material.air && (c2 = b2.J((Gg)c2, dZ2, (XF)((Object)d2))) != null) {
                a22 = c2.l();
            }
        }
        return a22;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        Object d2 = xF2;
        BlockRedstoneComparator b2 = this;
        void v0 = c2;
        super.f((Gg)v0, (XF)((Object)d2), (IBlockState)a2);
        v0.f((XF)((Object)d2), b2.J((Gg)c2, uSa.E));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        void h2;
        void e2;
        Object i2 = iBlockState;
        BlockRedstoneComparator f5 = this;
        if (!e2.h.J) {
            return uSa.E != 0;
        }
        i2 = i2.J(MODE);
        h2.J((double)g2.getX() + kTa.B, (double)g2.getY() + kTa.B, (double)g2.getZ() + kTa.B, kqa.B, bpa.K, i2.J(MODE) == BlockRedstoneComparator$Mode.SUBTRACT ? vTa.N : MQa.L);
        h2.J((XF)g2, (IBlockState)i2, uqa.g);
        f5.e((Gg)h2, (XF)g2, (IBlockState)i2);
        return vRa.d != 0;
    }

    @Override
    public BlockState J() {
        BlockRedstoneComparator a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = MODE;
        iPropertyArray[uqa.g] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockRedstoneComparator b2 = this;
        if (b2.isRepeaterPowered) {
            d2.J((XF)c2, b2.l(e2).J(POWERED, vRa.d != 0), AQa.P);
        }
        b2.e((Gg)d2, (XF)c2, e2);
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockRedstoneComparator i2;
        BlockRedstoneComparator blockRedstoneComparator = blockRedstoneComparator2;
        BlockRedstoneComparator blockRedstoneComparator2 = gl2;
        BlockRedstoneComparator a2 = blockRedstoneComparator;
        return a2.J().J(FACING, i2.J().getOpposite()).J(POWERED, uSa.E != 0).J(MODE, BlockRedstoneComparator$Mode.COMPARE);
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockRedstoneComparator a2 = this;
        return Gea.k;
    }

    @Override
    public int e(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneComparator a2 = this;
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        Object d2 = xF2;
        BlockRedstoneComparator b2 = this;
        if (!c2.J((XF)((Object)d2), (Block)b2)) {
            int n2;
            void a2;
            void v0 = c2;
            int n3 = b2.f((Gg)v0, (XF)((Object)d2), (IBlockState)a2);
            uY uY2 = v0.J((XF)((Object)d2));
            int n4 = n2 = uY2 instanceof kZ ? ((kZ)uY2).J() : uSa.E;
            if (n3 != n2 || b2.J((IBlockState)a2) != b2.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2)) {
                if (b2.f((Gg)c2, (XF)((Object)d2), (IBlockState)a2)) {
                    c2.J((XF)((Object)d2), (Block)b2, uqa.g, pua.o);
                    return;
                }
                c2.J((XF)((Object)d2), (Block)b2, uqa.g, uSa.E);
            }
        }
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockRedstoneComparator a2 = this;
        return new kZ();
    }

    /*
     * WARNING - void declaration
     */
    private void e(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockRedstoneComparator a2 = this;
        void v0 = c2;
        int n2 = a2.f((Gg)v0, (XF)b2, d2);
        uY uY2 = v0.J((XF)b2);
        int n3 = uSa.E;
        if (uY2 instanceof kZ) {
            kZ kZ2 = (kZ)uY2;
            n3 = kZ2.J();
            kZ2.J(n2);
        }
        if (n3 != n2 || d2.J(MODE) == BlockRedstoneComparator$Mode.COMPARE) {
            BlockRedstoneComparator blockRedstoneComparator;
            boolean bl2 = a2.J((Gg)c2, (XF)b2, d2);
            boolean bl3 = a2.J(d2);
            n2 = bl3 ? 1 : 0;
            if (bl3 && !bl2) {
                blockRedstoneComparator = a2;
                c2.J((XF)b2, d2.J(POWERED, uSa.E != 0), uqa.g);
            } else {
                if (n2 == 0 && bl2) {
                    c2.J((XF)b2, d2.J(POWERED, vRa.d != 0), uqa.g);
                }
                blockRedstoneComparator = a2;
            }
            blockRedstoneComparator.d((Gg)c2, (XF)b2, d2);
        }
    }

    @Override
    public IBlockState f(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockRedstoneComparator a2 = this;
        Boolean bl2 = b2.J(POWERED);
        BlockRedstoneComparator$Mode blockRedstoneComparator$Mode = b2.J(MODE);
        b2 = b2.J(FACING);
        return QFa.gd.J().J(FACING, b2).J(POWERED, bl2).J(MODE, blockRedstoneComparator$Mode);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockRedstoneComparator b2;
        Object d2 = xF2;
        BlockRedstoneComparator blockRedstoneComparator = b2 = this;
        super.l((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
        c2.f((XF)((Object)d2));
        blockRedstoneComparator.d((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        BlockRedstoneComparator c2 = this;
        BlockRedstoneComparator d22 = gg2;
        int n2 = c2.J((Gg)d22, (XF)b2, (IBlockState)a2);
        if (n2 >= Ypa.A) {
            return vRa.d != 0;
        }
        if (n2 == 0) {
            return uSa.E != 0;
        }
        int d22 = c2.f((I)d22, (XF)b2, (IBlockState)a2);
        if (d22 == 0) {
            return vRa.d != 0;
        }
        if (n2 >= d22) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockRedstoneComparator a2 = this;
        if (a2.isRepeaterPowered || b2.J(POWERED).booleanValue()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockRedstoneComparator a2 = this;
        if (d2.J(MODE) == BlockRedstoneComparator$Mode.SUBTRACT) {
            return Math.max(a2.J((Gg)c2, (XF)b2, d2) - a2.f((I)c2, (XF)b2, d2), uSa.E);
        }
        return a2.J((Gg)c2, (XF)b2, d2);
    }

    public BlockRedstoneComparator(boolean bl2) {
        BlockRedstoneComparator a2;
        boolean b2 = bl2;
        BlockRedstoneComparator blockRedstoneComparator = a2 = this;
        super(b2);
        blockRedstoneComparator.J(blockRedstoneComparator.blockState.J().J(FACING, DZ.NORTH).J(POWERED, uSa.E != 0).J(MODE, BlockRedstoneComparator$Mode.COMPARE));
        blockRedstoneComparator.isBlockContainer = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockRedstoneComparator blockRedstoneComparator = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getHorizontalIndex();
        if (a2.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        if (a2.J(MODE) == BlockRedstoneComparator$Mode.SUBTRACT) {
            b2 |= AQa.P;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, int n2, int n3) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockRedstoneComparator f2 = gg2;
        BlockRedstoneComparator e2 = this;
        super.J((Gg)f2, (XF)d2, (IBlockState)c2, (int)b2, (int)a2);
        f2 = f2.J((XF)d2);
        if (f2 == null) {
            return uSa.E != 0;
        }
        return f2.J((int)b2, (int)a2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockRedstoneComparator a2 = this;
        return a2.J().J(FACING, DZ.getHorizontal(b2)).J(POWERED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0).J(MODE, (b2 & AQa.P) > 0 ? BlockRedstoneComparator$Mode.SUBTRACT : BlockRedstoneComparator$Mode.COMPARE);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState) {
        void b2;
        BlockRedstoneComparator d2 = i2;
        BlockRedstoneComparator c2 = this;
        if ((d2 = d2.J((XF)b2)) instanceof kZ) {
            return ((kZ)d2).J();
        }
        return uSa.E;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockRedstoneComparator a2 = this;
        return Gea.k;
    }

    @Override
    public String f() {
        return Ey.f((String)Spa.ha);
    }
}

