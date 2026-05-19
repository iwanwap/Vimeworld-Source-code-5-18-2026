/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  Gl
 *  I
 *  ISa
 *  JPa
 *  JTa
 *  MQa
 *  Mda
 *  NCa
 *  Pqa
 *  QFa
 *  TQa
 *  UZ
 *  WQa
 *  Waa
 *  XTa
 *  ZRa
 *  Zua
 *  aSa
 *  aX
 *  bpa
 *  eAa
 *  fy
 *  pqa
 *  rba
 *  uY
 *  vL
 *  vRa
 *  wOa
 *  xy
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockSkull$1;
import net.minecraft.block.BlockSkull$2;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.block.state.pattern.FactoryBlockPattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockSkull
extends BlockContainer {
    private BlockPattern witherPattern;
    private static final Predicate<BlockWorldState> IS_WITHER_SKELETON;
    public static final PropertyDirection FACING;
    private BlockPattern witherBasePattern;
    public static final PropertyBool NODROP;

    public BlockSkull() {
        BlockSkull a2;
        BlockSkull blockSkull = a2;
        super(Material.circuits);
        blockSkull.J(blockSkull.blockState.J().J(FACING, DZ.NORTH).J(NODROP, uSa.E != 0));
        blockSkull.J(rta.o, JPa.N, rta.o, wOa.w, MQa.L, wOa.w);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, Mda mda2) {
        void b2;
        void a2;
        BlockSkull d2 = gg2;
        BlockSkull c2 = this;
        if (a2.J() == vRa.d && b2.getY() >= uqa.g && d2.J() != sZ.PEACEFUL && !((Gg)d2).e) {
            if (c2.J().J((Gg)d2, (XF)b2) != null) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockSkull b2;
        Object d2 = xF2;
        BlockSkull blockSkull = b2 = this;
        blockSkull.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
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
        void c2;
        BlockSkull blockSkull = this;
        if (!c2.e) {
            void b2;
            BlockSkull d2;
            void a2;
            if (!a2.J(NODROP).booleanValue() && (d2 = c2.J((XF)b2)) instanceof fy) {
                d2 = (fy)d2;
                Mda mda2 = new Mda(Gea.GB, vRa.d, blockSkull.f((Gg)c2, (XF)b2));
                if (d2.f() == yRa.d && d2.J() != null) {
                    mda2.J(new Waa());
                    Waa waa2 = new Waa();
                    rba.J((Waa)waa2, (GameProfile)d2.J());
                    mda2.J().J(Pqa.Aa, (NCa)waa2);
                }
                BlockSkull.J((Gg)c2, (XF)b2, mda2);
            }
            super.l((Gg)c2, (XF)b2, (IBlockState)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF2) {
        void a2;
        void b2;
        BlockSkull blockSkull = this;
        BlockSkull c2 = b2.J((XF)a2);
        if (c2 instanceof fy) {
            return ((fy)c2).f();
        }
        return super.f((Gg)b2, (XF)a2);
    }

    public BlockPattern f() {
        BlockSkull a2;
        if (a2.witherPattern == null) {
            String[] stringArray = new String[yRa.d];
            stringArray[uSa.E] = wua.d;
            stringArray[vRa.d] = Qpa.t;
            stringArray[uqa.g] = zpa.L;
            a2.witherPattern = FactoryBlockPattern.J().J(stringArray).J((char)TQa.ca, BlockWorldState.J(BlockStateHelper.J(QFa.VC))).J((char)bpa.I, IS_WITHER_SKELETON).J((char)rQa.i, BlockWorldState.J(BlockStateHelper.J(QFa.HF))).J();
        }
        return a2.witherPattern;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockSkull blockSkull = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getIndex();
        if (a2.J(NODROP).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockSkull a2 = this;
        return Gea.GB;
    }

    @Override
    public String f() {
        return Ey.f((String)WQa.A);
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockSkull a2 = this;
        return new fy();
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockSkull i2;
        BlockSkull blockSkull = blockSkull2;
        BlockSkull blockSkull2 = gl2;
        BlockSkull a2 = blockSkull;
        return a2.J().J(FACING, i2.J()).J(NODROP, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockSkull a2 = this;
        switch (BlockSkull$2.$SwitchMap$net$minecraft$util$EnumFacing[b2.J((XF)((Object)c2)).J(FACING).ordinal()]) {
            default: {
                a2.J(rta.o, JPa.N, rta.o, wOa.w, MQa.L, wOa.w);
                return;
            }
            case 2: {
                a2.J(rta.o, rta.o, MQa.L, wOa.w, wOa.w, pqa.r);
                return;
            }
            case 3: {
                a2.J(rta.o, rta.o, JPa.N, wOa.w, wOa.w, MQa.L);
                return;
            }
            case 4: {
                a2.J(MQa.L, rta.o, rta.o, pqa.r, wOa.w, wOa.w);
                return;
            }
            case 5: 
        }
        a2.J(JPa.N, rta.o, rta.o, MQa.L, wOa.w, wOa.w);
    }

    @Override
    public BlockState J() {
        BlockSkull a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = NODROP;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockSkull a2 = this;
        return a2.J().J(FACING, DZ.getFront(b2 & XTa.W)).J(NODROP, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    static {
        FACING = PropertyDirection.J(oua.ja);
        NODROP = PropertyBool.J(Zua.A);
        IS_WITHER_SKELETON = new BlockSkull$1();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, fy fy2) {
        void c2;
        BlockPattern$PatternHelper b2;
        BlockPattern a2;
        BlockSkull blockSkull = this;
        if (a2.f() == vRa.d && b2.getY() >= uqa.g && c2.J() != sZ.PEACEFUL && !c2.e && (b2 = (a2 = blockSkull.f()).J((Gg)c2, (XF)((Object)b2))) != null) {
            Iterator d22;
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < yRa.d) {
                BlockWorldState blockWorldState = b2.J(n2, uSa.E, uSa.E);
                c2.J(blockWorldState.J(), blockWorldState.J().J(NODROP, vRa.d != 0), uqa.g);
                n3 = ++n2;
            }
            int n4 = n2 = uSa.E;
            while (n4 < a2.J()) {
                int n5 = uSa.E;
                while (n5 < a2.f()) {
                    int n6;
                    d22 = b2.J(n2, n6, uSa.E);
                    c2.J(((BlockWorldState)((Object)d22)).J(), QFa.HF.J(), uqa.g);
                    n5 = ++n6;
                }
                n4 = ++n2;
            }
            BlockPattern$PatternHelper blockPattern$PatternHelper = b2;
            Object object = blockPattern$PatternHelper.J(vRa.d, uSa.E, uSa.E).J();
            IDa iDa = new IDa((Gg)c2);
            d22 = blockPattern$PatternHelper.J(vRa.d, uqa.g, uSa.E).J();
            iDa.f((double)d22.getX() + kTa.B, (double)d22.getY() + ATa.j, (double)d22.getZ() + kTa.B, b2.f().getAxis() == RX.X ? JPa.N : ISa.a, JPa.N);
            iDa.ba = b2.f().getAxis() == RX.X ? JPa.N : ISa.a;
            iDa.N();
            Iterator iterator = d22 = c2.J(Sx.class, iDa.J().f(ZRa.r, ZRa.r, ZRa.r)).iterator();
            while (iterator.hasNext()) {
                Sx sx2 = (Sx)((Object)d22.next());
                iterator = d22;
                sx2.J((aX)mY.N);
            }
            c2.f((vL)iDa);
            int d22 = uSa.E;
            int n7 = d22;
            while (n7 < sOa.D) {
                int n8 = 3 >> 1;
                c2.J(UZ.SNOWBALL, (double)object.getX() + c2.v.nextDouble(), (double)(object.getY() - uqa.g) + c2.v.nextDouble() * JTa.Aa, (double)object.getZ() + c2.v.nextDouble(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                n7 = ++d22;
            }
            int n9 = d22 = uSa.E;
            while (n9 < a2.J()) {
                int n10 = uSa.E;
                while (n10 < a2.f()) {
                    int n11;
                    object = b2.J(d22, n11, uSa.E);
                    c2.d(((BlockWorldState)object).J(), QFa.HF);
                    n10 = ++n11;
                }
                n9 = ++d22;
            }
        }
    }

    public BlockPattern J() {
        BlockSkull a2;
        if (a2.witherBasePattern == null) {
            String[] stringArray = new String[yRa.d];
            stringArray[uSa.E] = rQa.W;
            stringArray[vRa.d] = Qpa.t;
            stringArray[uqa.g] = zpa.L;
            a2.witherBasePattern = FactoryBlockPattern.J().J(stringArray).J((char)TQa.ca, BlockWorldState.J(BlockStateHelper.J(QFa.VC))).J((char)rQa.i, BlockWorldState.J(BlockStateHelper.J(QFa.HF))).J();
        }
        return a2.witherBasePattern;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockSkull a2 = this;
        return Gea.GB;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2) {
        void c2;
        void d2;
        void a2;
        Object e2 = iBlockState;
        BlockSkull b2 = this;
        if (a2.h.f()) {
            e2 = e2.J(NODROP, vRa.d != 0);
            d2.J((XF)c2, (IBlockState)e2, AQa.P);
        }
        super.J((Gg)d2, (XF)c2, (IBlockState)e2, (Sx)a2);
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        int n3 = n2;
        BlockSkull a2 = this;
    }
}

