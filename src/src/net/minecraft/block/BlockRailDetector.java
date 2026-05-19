/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  HA
 *  I
 *  RGa
 *  XTa
 *  Yea
 *  Ypa
 *  psa
 *  uRa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailDetector$1;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockRailDetector
extends BlockRailBase {
    public static final PropertyEnum<BlockRailBase$EnumRailDirection> SHAPE = PropertyEnum.J(TOa.S, BlockRailBase$EnumRailDirection.class, new BlockRailDetector$1());
    public static final PropertyBool POWERED = PropertyBool.J(uRa.M);

    private xy J(XF xF2) {
        Object b2 = xF2;
        BlockRailDetector a2 = this;
        return new xy((double)((float)b2.getX() + psa.N), (double)b2.getY(), (double)((float)b2.getZ() + psa.N), (double)((float)(b2.getX() + vRa.d) - psa.N), (double)((float)(b2.getY() + vRa.d) - psa.N), (double)((float)(b2.getZ() + vRa.d) - psa.N));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        Object e2;
        void b2;
        BlockRailDetector blockRailDetector = object;
        Object object = dZ2;
        BlockRailDetector a2 = blockRailDetector;
        if (!b2.J(POWERED).booleanValue()) {
            return uSa.E;
        }
        if (e2 == DZ.UP) {
            return Ypa.A;
        }
        return uSa.E;
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends Yea> List<T> J(Gg gg2, XF xF2, Class<T> clazz, Predicate<vL> ... predicateArray) {
        void b2;
        void d2;
        void a2;
        Object e2 = xF2;
        BlockRailDetector c2 = this;
        e2 = c2.J((XF)((Object)e2));
        if (((void)a2).length != vRa.d) {
            return d2.J((Class)b2, (xy)e2);
        }
        return d2.J((Class)b2, (xy)e2, (Predicate)a2[uSa.E]);
    }

    @Override
    public int J(Gg gg2) {
        BlockRailDetector b2 = gg2;
        BlockRailDetector a2 = this;
        return kTa.j;
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void a2;
        BlockRailDetector d2 = gg2;
        BlockRailDetector c2 = this;
        boolean bl2 = a2.J(POWERED);
        int n2 = uSa.E;
        if (!c2.J((Gg)d2, (XF)b2, Yea.class, new Predicate[uSa.E]).isEmpty()) {
            n2 = vRa.d;
        }
        if (n2 != 0 && !bl2) {
            d2.J((XF)b2, a2.J(POWERED, vRa.d != 0), yRa.d);
            void v0 = b2;
            BlockRailDetector blockRailDetector = d2;
            void v2 = b2;
            d2.f((XF)v2, c2);
            blockRailDetector.f(v2.down(), c2);
            blockRailDetector.J((XF)v0, (XF)v0);
        }
        if (n2 == 0 && bl2) {
            d2.J((XF)b2, a2.J(POWERED, uSa.E != 0), yRa.d);
            void v3 = b2;
            BlockRailDetector blockRailDetector = d2;
            void v5 = b2;
            d2.f((XF)v5, c2);
            blockRailDetector.f(v5.down(), c2);
            blockRailDetector.J((XF)v3, (XF)v3);
        }
        if (n2 != 0) {
            BlockRailDetector blockRailDetector = c2;
            d2.J((XF)b2, blockRailDetector, blockRailDetector.J((Gg)d2));
        }
        d2.J((XF)b2, (Block)c2);
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        BlockRailDetector a2;
        IBlockState d2 = iBlockState;
        BlockRailDetector blockRailDetector = a2 = this;
        super.f((Gg)c2, (XF)b2, d2);
        blockRailDetector.C((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF2) {
        void a2;
        Object c2 = gg2;
        BlockRailDetector b2 = this;
        if (c2.J((XF)a2).J(POWERED).booleanValue()) {
            List<RGa> list = b2.J((Gg)c2, (XF)a2, RGa.class, new Predicate[uSa.E]);
            if (!list.isEmpty()) {
                return list.get(uSa.E).J().f();
            }
            Predicate[] predicateArray = new Predicate[vRa.d];
            predicateArray[uSa.E] = Kaa.J;
            if (!(c2 = b2.J((Gg)c2, (XF)a2, Yea.class, predicateArray)).isEmpty()) {
                return Ega.J((HA)((HA)c2.get(uSa.E)));
            }
        }
        return uSa.E;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockRailDetector a2 = this;
        return a2.J().J(SHAPE, BlockRailBase$EnumRailDirection.byMetadata(b2 & XTa.W)).J(POWERED, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        IBlockState e2 = iBlockState;
        BlockRailDetector b2 = this;
        if (e2.J(POWERED).booleanValue()) {
            return Ypa.A;
        }
        return uSa.E;
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockRailDetector blockRailDetector = random2;
        Random random2 = random;
        BlockRailDetector a2 = blockRailDetector;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        IBlockState e2 = iBlockState;
        BlockRailDetector b2 = this;
        if (!d2.e && e2.J(POWERED).booleanValue()) {
            void c2;
            b2.C((Gg)d2, (XF)c2, e2);
        }
    }

    @Override
    public BlockState J() {
        BlockRailDetector a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = SHAPE;
        iPropertyArray[vRa.d] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, vL vL2) {
        void d2;
        IBlockState e2 = iBlockState;
        BlockRailDetector b2 = this;
        if (!d2.e && !e2.J(POWERED).booleanValue()) {
            void c2;
            b2.C((Gg)d2, (XF)c2, e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockRailDetector blockRailDetector = this;
        int b2 = uSa.E;
        b2 |= a2.J(SHAPE).getMetadata();
        if (a2.J(POWERED).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    public BlockRailDetector() {
        BlockRailDetector a2;
        BlockRailDetector blockRailDetector = a2;
        super(vRa.d != 0);
        blockRailDetector.J(blockRailDetector.blockState.J().J(POWERED, uSa.E != 0).J(SHAPE, BlockRailBase$EnumRailDirection.NORTH_SOUTH));
        blockRailDetector.J(vRa.d != 0);
    }

    @Override
    public IProperty<BlockRailBase$EnumRailDirection> J() {
        return SHAPE;
    }
}

