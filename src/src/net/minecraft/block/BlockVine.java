/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  Mda
 *  NTa
 *  QFa
 *  Tz
 *  Zpa
 *  aSa
 *  eAa
 *  ez
 *  hTa
 *  pqa
 *  pua
 *  uY
 *  vRa
 *  xy
 *  zX
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine$1;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockVine
extends Block {
    public static final PropertyBool SOUTH;
    public static final PropertyBool NORTH;
    public static final PropertyBool[] ALL_FACES;
    public static final PropertyBool WEST;
    public static final PropertyBool EAST;
    public static final PropertyBool UP;

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        BlockVine blockVine = this;
        if (!d2.e && d2.v.nextInt(AQa.P) == 0) {
            void b2;
            void v3;
            void a2;
            void c2;
            int n2;
            block29: {
                int n3;
                int n4 = AQa.P;
                int n5 = tTa.h;
                n2 = uSa.E;
                int n6 = n3 = -n4;
                while (n6 <= n4) {
                    int n7 = -n4;
                    while (n7 <= n4) {
                        int e2;
                        int n8 = pua.o;
                        while (n8 <= vRa.d) {
                            int n9;
                            if (d2.J(c2.add(n3, n9, e2)).J() == blockVine && --n5 <= 0) {
                                n2 = vRa.d;
                                v3 = a2;
                                break block29;
                            }
                            n8 = ++n9;
                        }
                        n7 = ++e2;
                    }
                    n6 = ++n3;
                }
                v3 = a2;
            }
            DZ dZ2 = DZ.random((Random)v3);
            Object e2 = c2.up();
            if (dZ2 == DZ.UP && c2.getY() < osa.Ja && d2.J((XF)((Object)e2))) {
                if (n2 == 0) {
                    IBlockState iBlockState2 = b2;
                    for (DZ dZ3 : LX.HORIZONTAL) {
                        if (!a2.nextBoolean() && blockVine.f(d2.J(((XF)((Object)e2)).offset(dZ3)).J())) continue;
                        iBlockState2 = iBlockState2.J(BlockVine.J(dZ3), uSa.E != 0);
                    }
                    if (iBlockState2.J(NORTH).booleanValue() || iBlockState2.J(EAST).booleanValue() || iBlockState2.J(SOUTH).booleanValue() || iBlockState2.J(WEST).booleanValue()) {
                        d2.J((XF)((Object)e2), iBlockState2, uqa.g);
                        return;
                    }
                }
            } else if (dZ2.getAxis().isHorizontal() && !b2.J(BlockVine.J(dZ2)).booleanValue()) {
                if (n2 == 0) {
                    XF xF3 = c2.offset(dZ2);
                    Block block = d2.J(xF3).J();
                    if (block.blockMaterial == Material.air) {
                        DZ dZ4 = dZ2;
                        DZ dZ5 = dZ4.rotateY();
                        e2 = dZ4.rotateYCCW();
                        boolean bl2 = b2.J(BlockVine.J(dZ5));
                        boolean bl3 = b2.J(BlockVine.J((DZ)((Object)e2)));
                        XF xF4 = xF3;
                        XF xF5 = xF4.offset(dZ5);
                        XF xF6 = xF4.offset((DZ)((Object)e2));
                        if (bl2 && blockVine.f(d2.J(xF5).J())) {
                            d2.J(xF3, blockVine.J().J(BlockVine.J(dZ5), vRa.d != 0), uqa.g);
                            return;
                        }
                        if (bl3 && blockVine.f(d2.J(xF6).J())) {
                            d2.J(xF3, blockVine.J().J(BlockVine.J((DZ)((Object)e2)), vRa.d != 0), uqa.g);
                            return;
                        }
                        if (bl2 && d2.J(xF5) && blockVine.f(d2.J(c2.offset(dZ5)).J())) {
                            d2.J(xF5, blockVine.J().J(BlockVine.J(dZ2.getOpposite()), vRa.d != 0), uqa.g);
                            return;
                        }
                        if (bl3 && d2.J(xF6) && blockVine.f(d2.J(c2.offset((DZ)((Object)e2))).J())) {
                            d2.J(xF6, blockVine.J().J(BlockVine.J(dZ2.getOpposite()), vRa.d != 0), uqa.g);
                            return;
                        }
                        if (blockVine.f(d2.J(xF3.up()).J())) {
                            d2.J(xF3, blockVine.J(), uqa.g);
                            return;
                        }
                    } else if (block.blockMaterial.J() && block.l()) {
                        d2.J((XF)c2, b2.J(BlockVine.J(dZ2), vRa.d != 0), uqa.g);
                        return;
                    }
                }
            } else if (c2.getY() > vRa.d) {
                XF xF7 = c2.down();
                IBlockState iBlockState3 = d2.J(xF7);
                Block block = iBlockState3.J();
                if (block.blockMaterial == Material.air) {
                    e2 = b2;
                    for (DZ dZ6 : LX.HORIZONTAL) {
                        if (!a2.nextBoolean()) continue;
                        e2 = e2.J(BlockVine.J(dZ6), uSa.E != 0);
                    }
                    if (e2.J(NORTH).booleanValue() || e2.J(EAST).booleanValue() || e2.J(SOUTH).booleanValue() || e2.J(WEST).booleanValue()) {
                        d2.J(xF7, (IBlockState)e2, uqa.g);
                        return;
                    }
                } else if (block == blockVine) {
                    e2 = iBlockState3;
                    for (DZ dZ7 : LX.HORIZONTAL) {
                        PropertyBool propertyBool = BlockVine.J(dZ7);
                        if (!a2.nextBoolean() || !b2.J(propertyBool).booleanValue()) continue;
                        e2 = e2.J(propertyBool, vRa.d != 0);
                    }
                    if (e2.J(NORTH).booleanValue() || e2.J(EAST).booleanValue() || e2.J(SOUTH).booleanValue() || e2.J(WEST).booleanValue()) {
                        d2.J(xF7, (IBlockState)e2, uqa.g);
                    }
                }
            }
        }
    }

    @Override
    public boolean f(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockVine a2 = this;
        return vRa.d != 0;
    }

    @Override
    public void f() {
        BlockVine a2;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        DZ d2 = dZ2;
        BlockVine a2 = this;
        switch (BlockVine$1.$SwitchMap$net$minecraft$util$EnumFacing[d2.ordinal()]) {
            case 1: {
                void b2;
                void c2;
                return a2.f(c2.J(b2.up()).J());
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                void b2;
                void c2;
                return a2.f(c2.J(b2.offset(d2.getOpposite())).J());
            }
        }
        return uSa.E != 0;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockVine a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, int n2) {
        void c2;
        Object d2 = xF2;
        BlockVine b2 = this;
        return c2.J((XF)((Object)d2)).J((XF)((Object)d2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static PropertyBool J(DZ a2) {
        switch (BlockVine$1.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                return UP;
            }
            case 2: {
                return NORTH;
            }
            case 3: {
                return SOUTH;
            }
            case 4: {
                return EAST;
            }
            case 5: {
                return WEST;
            }
        }
        throw new IllegalArgumentException((Object)((Object)a2) + aSa.l);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockVine a2 = this;
        return uSa.E;
    }

    static {
        UP = PropertyBool.J(dsa.a);
        NORTH = PropertyBool.J(hTa.d);
        EAST = PropertyBool.J(Zpa.D);
        SOUTH = PropertyBool.J(vsa.k);
        WEST = PropertyBool.J(NTa.U);
        PropertyBool[] propertyBoolArray = new PropertyBool[tTa.h];
        propertyBoolArray[uSa.E] = UP;
        propertyBoolArray[vRa.d] = NORTH;
        propertyBoolArray[uqa.g] = SOUTH;
        propertyBoolArray[yRa.d] = WEST;
        propertyBoolArray[AQa.P] = EAST;
        ALL_FACES = propertyBoolArray;
    }

    public BlockVine() {
        BlockVine a2;
        BlockVine blockVine = a2;
        super(Material.vine);
        blockVine.J(blockVine.blockState.J().J(UP, uSa.E != 0).J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0));
        blockVine.J(vRa.d != 0);
        a2.J(yGa.a);
    }

    @Override
    public int J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockVine a2 = this;
        return zX.f();
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object d2 = iBlockState;
        BlockVine a2 = this;
        Object object = d2;
        for (Object object2 : LX.HORIZONTAL) {
            PropertyBool propertyBool = BlockVine.J(object2);
            if (!d2.J(propertyBool).booleanValue() || a2.f(c2.J(b2.offset((DZ)((Object)object2))).J()) || (object2 = c2.J(b2.up())).J() == a2 && object2.J(propertyBool).booleanValue()) continue;
            d2 = d2.J(propertyBool, uSa.E != 0);
        }
        if (BlockVine.d((IBlockState)d2) == 0) {
            return uSa.E != 0;
        }
        if (object != d2) {
            c2.J((XF)b2, (IBlockState)d2, uqa.g);
        }
        return vRa.d != 0;
    }

    @Override
    public int J() {
        return zX.f();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void b2;
        void c2;
        XF d2 = xF2;
        BlockVine a2 = this;
        return c2.J(UP, b2.J(d2.up()).J().d());
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Sx sx2, XF xF2, IBlockState iBlockState, uY uY2) {
        void a2;
        void b2;
        void c2;
        void e2;
        Sx f2 = sx2;
        BlockVine d2 = this;
        if (!e2.e && f2.f() != null && f2.f().J() == Gea.ja) {
            f2.J(Tz.a[Block.J(d2)]);
            BlockVine.J((Gg)e2, (XF)c2, new Mda(QFa.vC, vRa.d, uSa.E));
            return;
        }
        super.J((Gg)e2, f2, (XF)c2, (IBlockState)b2, (uY)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void f5;
        Object i2 = gg2;
        BlockVine h2 = this;
        i2 = h2.J().J(UP, uSa.E != 0).J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0);
        if (f5.getAxis().isHorizontal()) {
            return i2.J(BlockVine.J(f5.getOpposite()), vRa.d != 0);
        }
        return i2;
    }

    @Override
    public BlockState J() {
        BlockVine a2;
        IProperty[] iPropertyArray = new IProperty[tTa.h];
        iPropertyArray[uSa.E] = UP;
        iPropertyArray[vRa.d] = NORTH;
        iPropertyArray[uqa.g] = EAST;
        iPropertyArray[yRa.d] = SOUTH;
        iPropertyArray[AQa.P] = WEST;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockVine a2 = this;
        return null;
    }

    private boolean f(Block block) {
        Block b2 = block;
        BlockVine a2 = this;
        if (b2.l() && b2.blockMaterial.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    public static int d(IBlockState iBlockState) {
        int a2;
        IBlockState iBlockState2 = iBlockState;
        int n2 = uSa.E;
        PropertyBool[] propertyBoolArray = ALL_FACES;
        int n3 = ALL_FACES.length;
        int n4 = a2 = uSa.E;
        while (n4 < n3) {
            PropertyBool propertyBool = propertyBoolArray[a2];
            if (iBlockState2.J(propertyBool).booleanValue()) {
                ++n2;
            }
            n4 = ++a2;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        void b2;
        BlockVine blockVine = this;
        float f2 = pqa.r;
        float f3 = pqa.r;
        float f4 = pqa.r;
        float f5 = JPa.N;
        float f6 = JPa.N;
        float c2 = JPa.N;
        int n2 = uSa.E;
        if (b2.J((XF)a2).J(WEST).booleanValue()) {
            f5 = Math.max(f5, rRa.T);
            f2 = JPa.N;
            f3 = JPa.N;
            f6 = pqa.r;
            f4 = JPa.N;
            c2 = pqa.r;
            n2 = vRa.d;
        }
        if (b2.J((XF)a2).J(EAST).booleanValue()) {
            f2 = Math.min(f2, pqa.Ha);
            f5 = pqa.r;
            f3 = JPa.N;
            f6 = pqa.r;
            f4 = JPa.N;
            c2 = pqa.r;
            n2 = vRa.d;
        }
        if (b2.J((XF)a2).J(NORTH).booleanValue()) {
            c2 = Math.max(c2, rRa.T);
            f4 = JPa.N;
            f2 = JPa.N;
            f5 = pqa.r;
            f3 = JPa.N;
            f6 = pqa.r;
            n2 = vRa.d;
        }
        if (b2.J((XF)a2).J(SOUTH).booleanValue()) {
            f4 = Math.min(f4, pqa.Ha);
            c2 = pqa.r;
            f2 = JPa.N;
            f5 = pqa.r;
            f3 = JPa.N;
            f6 = pqa.r;
            n2 = vRa.d;
        }
        if (n2 == 0 && blockVine.f(b2.J(a2.up()).J())) {
            f3 = Math.min(f3, pqa.Ha);
            f6 = pqa.r;
            f2 = JPa.N;
            f5 = pqa.r;
            f4 = JPa.N;
            c2 = pqa.r;
        }
        blockVine.J(f2, f3, f4, f5, f6, c2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockVine a2 = this;
        return a2.J().J(SOUTH, ((b2 & vRa.d) > 0 ? vRa.d : uSa.E) != 0).J(WEST, ((b2 & uqa.g) > 0 ? vRa.d : uSa.E) != 0).J(NORTH, ((b2 & AQa.P) > 0 ? vRa.d : uSa.E) != 0).J(EAST, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockVine blockVine = this;
        int b2 = uSa.E;
        if (a2.J(SOUTH).booleanValue()) {
            b2 |= vRa.d;
        }
        if (a2.J(WEST).booleanValue()) {
            b2 |= uqa.g;
        }
        if (a2.J(NORTH).booleanValue()) {
            b2 |= AQa.P;
        }
        if (a2.J(EAST).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void b2;
        void d2;
        Object e2 = xF2;
        BlockVine c2 = this;
        if (!d2.e && !c2.J((Gg)d2, (XF)((Object)e2), (IBlockState)b2)) {
            void v0 = d2;
            c2.J((Gg)v0, (XF)((Object)e2), (IBlockState)b2, uSa.E);
            v0.G((XF)((Object)e2));
        }
    }
}

