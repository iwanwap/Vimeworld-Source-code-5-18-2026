/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  Lz
 *  MQa
 *  QFa
 *  XTa
 *  aSa
 *  ez
 *  pqa
 *  vL
 *  vQa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs$EnumHalf;
import net.minecraft.block.BlockStairs$EnumShape;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockStairs
extends Block {
    private int rayTracePass;
    private final IBlockState modelState;
    private final Block modelBlock;
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
    private boolean hasRaytraced;
    private static final int[][] field_150150_a;
    public static final PropertyEnum<BlockStairs$EnumShape> SHAPE;
    public static final PropertyEnum<BlockStairs$EnumHalf> HALF;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        Object i2;
        void g2;
        void h2;
        BlockStairs blockStairs = object;
        Object object = sx2;
        BlockStairs e2 = blockStairs;
        return e2.modelBlock.J((Gg)h2, (XF)g2, e2.modelState, (Sx)((Object)i2), DZ.DOWN, JPa.N, JPa.N, JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockStairs a2 = this;
        a2.modelBlock.J((Gg)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(I i2, XF xF2, IBlockState iBlockState) {
        void a2;
        Object c2 = xF2;
        I b2 = i2;
        if (BlockStairs.f((c2 = b2.J((XF)((Object)c2))).J()) && c2.J(HALF) == a2.J(HALF) && c2.J(FACING) == a2.J(FACING)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void g2;
        Object i2 = gg2;
        BlockStairs h2 = this;
        i2 = super.J((Gg)i2, (XF)g2, (DZ)f5, (float)e2, (float)d2, (float)c2, (int)b2, (Gl)a2);
        i2 = i2.J(FACING, a2.J()).J(SHAPE, BlockStairs$EnumShape.STRAIGHT);
        if (f5 != DZ.DOWN && (f5 == DZ.UP || (double)d2 <= kTa.B)) {
            return i2.J(HALF, BlockStairs$EnumHalf.BOTTOM);
        }
        return i2.J(HALF, BlockStairs$EnumHalf.TOP);
    }

    /*
     * WARNING - void declaration
     */
    public void f(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockStairs a2 = this;
        if (b2.J((XF)((Object)c2)).J(HALF) == BlockStairs$EnumHalf.TOP) {
            a2.J(JPa.N, MQa.L, JPa.N, pqa.r, pqa.r, pqa.r);
            return;
        }
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, MQa.L, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(IBlockState iBlockState, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        BlockStairs a2 = this;
        return a2.modelBlock.J((IBlockState)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockStairs blockStairs = this;
        int b2 = uSa.E;
        if (a2.J(HALF) == BlockStairs$EnumHalf.TOP) {
            b2 |= AQa.P;
        }
        return b2 |= tTa.h - a2.J(FACING).getIndex();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public RY J(Gg gg2, XF xF2, Lz lz2, Lz lz3) {
        int b22;
        int n2;
        void a2;
        void c22;
        RY[] d22;
        BlockStairs blockStairs = this;
        Object object = new RY[Yqa.i];
        IBlockState iBlockState = d22.J((XF)c22);
        int e22 = iBlockState.J(FACING).getHorizontalIndex();
        int n3 = iBlockState.J(HALF) == BlockStairs$EnumHalf.TOP ? vRa.d : uSa.E;
        int[] nArray = field_150150_a[e22 + (n3 != 0 ? AQa.P : uSa.E)];
        blockStairs.hasRaytraced = vRa.d;
        int n4 = e22 = uSa.E;
        while (n4 < Yqa.i) {
            blockStairs.rayTracePass = e22;
            if (Arrays.binarySearch(nArray, blockStairs.rayTracePass) < 0) {
                void b22;
                object[e22] = super.J((Gg)d22, (XF)c22, (Lz)b22, (Lz)a2);
            }
            n4 = ++e22;
        }
        Object e22 = nArray;
        int n5 = nArray.length;
        int n6 = n2 = uSa.E;
        while (n6 < n5) {
            int d22 = e22[n2];
            object[d22] = null;
            n6 = ++n2;
        }
        e22 = null;
        double d3 = aSa.V;
        d22 = object;
        int c22 = ((RY[])object).length;
        int n7 = b22 = uSa.E;
        while (n7 < c22) {
            object = d22[b22];
            if (object != null) {
                double d4;
                double d5 = object.I.l((Lz)a2);
                if (d4 > d3) {
                    e22 = object;
                    d3 = d5;
                }
            }
            n7 = ++b22;
        }
        return e22;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        BlockStairs a2;
        IBlockState b2 = iBlockState;
        BlockStairs blockStairs = a2 = this;
        return blockStairs.modelBlock.J(blockStairs.modelState);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, NZ nZ2) {
        void b2;
        void c2;
        NZ d2 = nZ2;
        BlockStairs a2 = this;
        a2.modelBlock.J((Gg)c2, (XF)b2, d2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockStairs a2 = this;
        return a2.J().J(HALF, (b2 & AQa.P) > 0 ? BlockStairs$EnumHalf.TOP : BlockStairs$EnumHalf.BOTTOM).J(FACING, DZ.getFront(tTa.h - (b2 & yRa.d)));
    }

    /*
     * Unable to fully structure code
     */
    public boolean l(I var1_1, XF var2_2) {
        block19: {
            block18: {
                block17: {
                    c = var2_2;
                    a = this;
                    var13_3 = b.J(c);
                    var4_4 = var13_3.J(BlockStairs.FACING);
                    var5_5 = var13_3.J(BlockStairs.HALF);
                    var6_6 = var5_5 == BlockStairs$EnumHalf.TOP ? vRa.d : uSa.E;
                    var7_8 = MQa.L;
                    var8_9 = pqa.r;
                    if (var6_6 != 0) {
                        var7_8 = JPa.N;
                        var8_9 = MQa.L;
                    }
                    var6_7 = JPa.N;
                    var9_10 = MQa.L;
                    var10_11 = MQa.L;
                    var11_12 = pqa.r;
                    var12_13 = uSa.E;
                    if (var4_4 != DZ.EAST) break block17;
                    var3_14 = b.J(c.west());
                    if (BlockStairs.f(var3_14.J()) && var5_5 == var3_14.J(BlockStairs.HALF)) {
                        var14_18 = var3_14.J(BlockStairs.FACING);
                        if (var14_18 == DZ.NORTH && !BlockStairs.J((I)b, c.north(), var13_3)) {
                            var10_11 = JPa.N;
                            var11_12 = MQa.L;
                            var12_13 = vRa.d;
                        } else if (var14_18 == DZ.SOUTH && !BlockStairs.J((I)b, c.south(), var13_3)) {
                            var10_11 = MQa.L;
                            var11_12 = pqa.r;
                            var12_13 = vRa.d;
                        }
                    }
                    ** GOTO lbl79
                }
                if (var4_4 != DZ.WEST) break block18;
                var3_15 = b.J(c.east());
                if (BlockStairs.f(var3_15.J()) && var5_5 == var3_15.J(BlockStairs.HALF)) {
                    var6_7 = MQa.L;
                    var9_10 = pqa.r;
                    var14_19 = var3_15.J(BlockStairs.FACING);
                    if (var14_19 == DZ.NORTH && !BlockStairs.J((I)b, c.north(), var13_3)) {
                        var10_11 = JPa.N;
                        var11_12 = MQa.L;
                        var12_13 = vRa.d;
                    } else if (var14_19 == DZ.SOUTH && !BlockStairs.J((I)b, c.south(), var13_3)) {
                        var10_11 = MQa.L;
                        var11_12 = pqa.r;
                        var12_13 = vRa.d;
                    }
                }
                ** GOTO lbl79
            }
            if (var4_4 != DZ.SOUTH) break block19;
            var3_16 = b.J(c.north());
            if (BlockStairs.f(var3_16.J()) && var5_5 == var3_16.J(BlockStairs.HALF)) {
                var10_11 = JPa.N;
                var11_12 = MQa.L;
                var14_20 = var3_16.J(BlockStairs.FACING);
                if (var14_20 == DZ.WEST && !BlockStairs.J((I)b, c.west(), var13_3)) {
                    var12_13 = vRa.d;
                } else if (var14_20 == DZ.EAST && !BlockStairs.J((I)b, c.east(), var13_3)) {
                    var6_7 = MQa.L;
                    var9_10 = pqa.r;
                    var12_13 = vRa.d;
                }
            }
            ** GOTO lbl79
        }
        if (var4_4 != DZ.NORTH) ** GOTO lbl79
        var3_17 = b.J(c.south());
        if (!BlockStairs.f(var3_17.J()) || var5_5 != var3_17.J(BlockStairs.HALF)) ** GOTO lbl79
        var14_21 = var3_17.J(BlockStairs.FACING);
        if (var14_21 == DZ.WEST && !BlockStairs.J((I)b, c.west(), var13_3)) {
            v0 = var12_13 = vRa.d;
        } else {
            if (var14_21 == DZ.EAST && !BlockStairs.J((I)b, c.east(), var13_3)) {
                var6_7 = MQa.L;
                var9_10 = pqa.r;
                var12_13 = vRa.d;
            }
lbl79:
            // 11 sources

            v0 = var12_13;
        }
        if (v0 != 0) {
            a.J(var6_7, var7_8, var10_11, var9_10, var8_9, var11_12);
        }
        return (boolean)var12_13;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        BlockStairs e2;
        Object g2 = xF2;
        BlockStairs blockStairs = e2 = this;
        void v1 = f2;
        Object object = g2;
        e2.f((I)f2, (XF)((Object)object));
        super.J((Gg)v1, (XF)((Object)object), (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        boolean bl2 = blockStairs.f((I)v1, (XF)((Object)g2));
        super.J((Gg)f2, (XF)((Object)g2), (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        if (bl2 && e2.l((I)f2, (XF)((Object)g2))) {
            super.J((Gg)f2, (XF)((Object)g2), (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        }
        e2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, Sx sx2) {
        void b2;
        void c2;
        Object d2 = sx2;
        BlockStairs a2 = this;
        a2.modelBlock.J((Gg)c2, (XF)b2, (Sx)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockStairs a2 = this;
        return a2.modelBlock.f((I)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Random e2;
        void b2;
        void c2;
        void d2;
        BlockStairs blockStairs = random2;
        Random random2 = random;
        BlockStairs a2 = blockStairs;
        a2.modelBlock.f((Gg)d2, (XF)c2, (IBlockState)b2, e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, vL vL2) {
        void b2;
        void c2;
        BlockStairs d2 = vL2;
        BlockStairs a2 = this;
        a2.modelBlock.J((Gg)c2, (XF)b2, (vL)d2);
    }

    static {
        HALF = PropertyEnum.J(Fpa.H, BlockStairs$EnumHalf.class);
        SHAPE = PropertyEnum.J(TOa.S, BlockStairs$EnumShape.class);
        int[][] nArrayArray = new int[Yqa.i][];
        int[] nArray = new int[uqa.g];
        nArray[uSa.E] = AQa.P;
        nArray[vRa.d] = tTa.h;
        nArrayArray[uSa.E] = nArray;
        int[] nArray2 = new int[uqa.g];
        nArray2[uSa.E] = tTa.h;
        nArray2[vRa.d] = XTa.W;
        nArrayArray[vRa.d] = nArray2;
        int[] nArray3 = new int[uqa.g];
        nArray3[uSa.E] = uua.p;
        nArray3[vRa.d] = XTa.W;
        nArrayArray[uqa.g] = nArray3;
        int[] nArray4 = new int[uqa.g];
        nArray4[uSa.E] = AQa.P;
        nArray4[vRa.d] = uua.p;
        nArrayArray[yRa.d] = nArray4;
        int[] nArray5 = new int[uqa.g];
        nArray5[uSa.E] = uSa.E;
        nArray5[vRa.d] = vRa.d;
        nArrayArray[AQa.P] = nArray5;
        int[] nArray6 = new int[uqa.g];
        nArray6[uSa.E] = vRa.d;
        nArray6[vRa.d] = yRa.d;
        nArrayArray[tTa.h] = nArray6;
        int[] nArray7 = new int[uqa.g];
        nArray7[uSa.E] = uqa.g;
        nArray7[vRa.d] = yRa.d;
        nArrayArray[uua.p] = nArray7;
        int[] nArray8 = new int[uqa.g];
        nArray8[uSa.E] = uSa.E;
        nArray8[vRa.d] = uqa.g;
        nArrayArray[XTa.W] = nArray8;
        field_150150_a = nArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockStairs a2 = this;
        return a2.modelBlock.J((Gg)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Random e2;
        void b2;
        void c2;
        void d2;
        BlockStairs blockStairs = random2;
        Random random2 = random;
        BlockStairs a2 = blockStairs;
        a2.modelBlock.l((Gg)d2, (XF)c2, (IBlockState)b2, e2);
    }

    @Override
    public BlockState J() {
        BlockStairs a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = HALF;
        iPropertyArray[uqa.g] = SHAPE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public ez J() {
        BlockStairs a2;
        return a2.modelBlock.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        BlockStairs b2;
        Object d2 = xF2;
        BlockStairs blockStairs = b2 = this;
        blockStairs.J((Gg)c2, (XF)((Object)d2), blockStairs.modelState, QFa.HF);
        blockStairs.modelBlock.f((Gg)c2, (XF)((Object)d2), b2.modelState);
    }

    @Override
    public boolean j() {
        BlockStairs a2;
        return a2.modelBlock.j();
    }

    /*
     * WARNING - void declaration
     */
    public int C(I i2, XF xF2) {
        int n2;
        void b2;
        XF c2 = xF2;
        BlockStairs a2 = this;
        IBlockState iBlockState = b2.J(c2);
        DZ dZ2 = iBlockState.J(FACING);
        BlockStairs$EnumHalf blockStairs$EnumHalf = iBlockState.J(HALF);
        int n3 = n2 = blockStairs$EnumHalf == BlockStairs$EnumHalf.TOP ? vRa.d : uSa.E;
        if (dZ2 == DZ.EAST) {
            IBlockState iBlockState2 = b2.J(c2.east());
            if (BlockStairs.f(iBlockState2.J()) && blockStairs$EnumHalf == iBlockState2.J(HALF)) {
                DZ dZ3 = iBlockState2.J(FACING);
                if (dZ3 == DZ.NORTH && !BlockStairs.J((I)b2, c2.south(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
                if (dZ3 == DZ.SOUTH && !BlockStairs.J((I)b2, c2.north(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
            }
        } else if (dZ2 == DZ.WEST) {
            IBlockState iBlockState3 = b2.J(c2.west());
            if (BlockStairs.f(iBlockState3.J()) && blockStairs$EnumHalf == iBlockState3.J(HALF)) {
                DZ dZ4 = iBlockState3.J(FACING);
                if (dZ4 == DZ.NORTH && !BlockStairs.J((I)b2, c2.south(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
                if (dZ4 == DZ.SOUTH && !BlockStairs.J((I)b2, c2.north(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
            }
        } else if (dZ2 == DZ.SOUTH) {
            IBlockState iBlockState4 = b2.J(c2.south());
            if (BlockStairs.f(iBlockState4.J()) && blockStairs$EnumHalf == iBlockState4.J(HALF)) {
                DZ dZ5 = iBlockState4.J(FACING);
                if (dZ5 == DZ.WEST && !BlockStairs.J((I)b2, c2.east(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
                if (dZ5 == DZ.EAST && !BlockStairs.J((I)b2, c2.west(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
            }
        } else if (dZ2 == DZ.NORTH) {
            IBlockState iBlockState5 = b2.J(c2.north());
            if (BlockStairs.f(iBlockState5.J()) && blockStairs$EnumHalf == iBlockState5.J(HALF)) {
                DZ dZ6 = iBlockState5.J(FACING);
                if (dZ6 == DZ.WEST && !BlockStairs.J((I)b2, c2.east(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
                if (dZ6 == DZ.EAST && !BlockStairs.J((I)b2, c2.west(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
            }
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void a2;
        void b2;
        IBlockState d2 = iBlockState;
        Object c2 = this;
        if (((BlockStairs)c2).f((I)b2, (XF)a2)) {
            switch (((BlockStairs)c2).l((I)b2, (XF)a2)) {
                case 0: {
                    return d2.J(SHAPE, BlockStairs$EnumShape.STRAIGHT);
                }
                case 1: {
                    return d2.J(SHAPE, BlockStairs$EnumShape.INNER_RIGHT);
                }
                case 2: {
                    return d2.J(SHAPE, BlockStairs$EnumShape.INNER_LEFT);
                }
            }
            return d2;
        }
        switch (((BlockStairs)c2).C((I)b2, (XF)a2)) {
            case 0: {
                return d2.J(SHAPE, BlockStairs$EnumShape.STRAIGHT);
            }
            case 1: {
                return d2.J(SHAPE, BlockStairs$EnumShape.OUTER_RIGHT);
            }
            case 2: {
                return d2.J(SHAPE, BlockStairs$EnumShape.OUTER_LEFT);
            }
        }
        return d2;
    }

    @Override
    public void J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockStairs a2 = this;
        if (a2.hasRaytraced) {
            BlockStairs blockStairs = a2;
            blockStairs.J(MQa.L * (float)(a2.rayTracePass % uqa.g), MQa.L * (float)(blockStairs.rayTracePass / AQa.P % uqa.g), MQa.L * (float)(a2.rayTracePass / uqa.g % uqa.g), MQa.L + MQa.L * (float)(a2.rayTracePass % uqa.g), MQa.L + MQa.L * (float)(a2.rayTracePass / AQa.P % uqa.g), MQa.L + MQa.L * (float)(a2.rayTracePass / uqa.g % uqa.g));
            return;
        }
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    /*
     * Unable to fully structure code
     */
    public boolean f(I var1_1, XF var2_2) {
        block18: {
            block17: {
                block16: {
                    c = var2_2;
                    a = this;
                    var13_3 = b.J(c);
                    var4_4 = var13_3.J(BlockStairs.FACING);
                    var5_5 = var13_3.J(BlockStairs.HALF);
                    var6_6 = var5_5 == BlockStairs$EnumHalf.TOP ? vRa.d : uSa.E;
                    var7_8 = MQa.L;
                    var8_9 = pqa.r;
                    if (var6_6 != 0) {
                        var7_8 = JPa.N;
                        var8_9 = MQa.L;
                    }
                    var6_7 = JPa.N;
                    var9_10 = pqa.r;
                    var10_11 = JPa.N;
                    var11_12 = MQa.L;
                    var12_13 = vRa.d;
                    if (var4_4 != DZ.EAST) break block16;
                    var6_7 = MQa.L;
                    var11_12 = pqa.r;
                    var3_14 = b.J(c.east());
                    if (BlockStairs.f(var3_14.J()) && var5_5 == var3_14.J(BlockStairs.HALF)) {
                        var14_18 = var3_14.J(BlockStairs.FACING);
                        if (var14_18 == DZ.NORTH && !BlockStairs.J((I)b, c.south(), var13_3)) {
                            var11_12 = MQa.L;
                            var12_13 = uSa.E;
                        } else if (var14_18 == DZ.SOUTH && !BlockStairs.J((I)b, c.north(), var13_3)) {
                            var10_11 = MQa.L;
                            var12_13 = uSa.E;
                        }
                    }
                    ** GOTO lbl78
                }
                if (var4_4 != DZ.WEST) break block17;
                var9_10 = MQa.L;
                var11_12 = pqa.r;
                var3_15 = b.J(c.west());
                if (BlockStairs.f(var3_15.J()) && var5_5 == var3_15.J(BlockStairs.HALF)) {
                    var14_19 = var3_15.J(BlockStairs.FACING);
                    if (var14_19 == DZ.NORTH && !BlockStairs.J((I)b, c.south(), var13_3)) {
                        var11_12 = MQa.L;
                        var12_13 = uSa.E;
                    } else if (var14_19 == DZ.SOUTH && !BlockStairs.J((I)b, c.north(), var13_3)) {
                        var10_11 = MQa.L;
                        var12_13 = uSa.E;
                    }
                }
                ** GOTO lbl78
            }
            if (var4_4 != DZ.SOUTH) break block18;
            var10_11 = MQa.L;
            var11_12 = pqa.r;
            var3_16 = b.J(c.south());
            if (BlockStairs.f(var3_16.J()) && var5_5 == var3_16.J(BlockStairs.HALF)) {
                var14_20 = var3_16.J(BlockStairs.FACING);
                if (var14_20 == DZ.WEST && !BlockStairs.J((I)b, c.east(), var13_3)) {
                    var9_10 = MQa.L;
                    var12_13 = uSa.E;
                } else if (var14_20 == DZ.EAST && !BlockStairs.J((I)b, c.west(), var13_3)) {
                    var6_7 = MQa.L;
                    var12_13 = uSa.E;
                }
            }
            ** GOTO lbl78
        }
        if (var4_4 != DZ.NORTH) ** GOTO lbl78
        var3_17 = b.J(c.north());
        if (!BlockStairs.f(var3_17.J()) || var5_5 != var3_17.J(BlockStairs.HALF)) ** GOTO lbl78
        var14_21 = var3_17.J(BlockStairs.FACING);
        if (var14_21 == DZ.WEST && !BlockStairs.J((I)b, c.east(), var13_3)) {
            var9_10 = MQa.L;
            var12_13 = uSa.E;
            v0 = a;
        } else {
            if (var14_21 == DZ.EAST && !BlockStairs.J((I)b, c.west(), var13_3)) {
                var6_7 = MQa.L;
                var12_13 = uSa.E;
            }
lbl78:
            // 11 sources

            v0 = a;
        }
        v0.J(var6_7, var7_8, var10_11, var9_10, var8_9, var11_12);
        return (boolean)var12_13;
    }

    @Override
    public int J(Gg gg2) {
        BlockStairs b2 = gg2;
        BlockStairs a2 = this;
        return a2.modelBlock.J((Gg)b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockStairs a2 = this;
        return a2.modelBlock.J((Gg)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Lz J(Gg gg2, XF xF2, vL vL2, Lz lz2) {
        BlockStairs e2;
        void b2;
        void c2;
        void d2;
        BlockStairs blockStairs = blockStairs2;
        BlockStairs blockStairs2 = lz2;
        BlockStairs a2 = blockStairs;
        return a2.modelBlock.J((Gg)d2, (XF)c2, (vL)b2, (Lz)e2);
    }

    public BlockStairs(IBlockState iBlockState) {
        BlockStairs a2;
        IBlockState b2 = iBlockState;
        BlockStairs blockStairs = a2 = this;
        super(b2.J().blockMaterial);
        blockStairs.J(blockStairs.blockState.J().J(FACING, DZ.NORTH).J(HALF, BlockStairs$EnumHalf.BOTTOM).J(SHAPE, BlockStairs$EnumShape.STRAIGHT));
        a2.modelBlock = b2.J();
        a2.modelState = b2;
        a2.J(a2.modelBlock.blockHardness.J());
        BlockStairs blockStairs2 = a2;
        blockStairs2.l(blockStairs2.modelBlock.blockResistance / vQa.q);
        BlockStairs blockStairs3 = a2;
        blockStairs3.J(blockStairs3.modelBlock.stepSound);
        a2.J(osa.Ja);
        a2.J(yGa.A);
    }

    @Override
    public float J(vL vL2) {
        BlockStairs b2 = vL2;
        BlockStairs a2 = this;
        return a2.modelBlock.J((vL)b2);
    }

    public static boolean f(Block a2) {
        return a2 instanceof BlockStairs;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        Object d2 = xF2;
        BlockStairs b2 = this;
        b2.modelBlock.l((Gg)c2, (XF)((Object)d2), b2.modelState);
    }

    /*
     * WARNING - void declaration
     */
    public int l(I i2, XF xF2) {
        int n2;
        void b2;
        XF c2 = xF2;
        BlockStairs a2 = this;
        IBlockState iBlockState = b2.J(c2);
        DZ dZ2 = iBlockState.J(FACING);
        BlockStairs$EnumHalf blockStairs$EnumHalf = iBlockState.J(HALF);
        int n3 = n2 = blockStairs$EnumHalf == BlockStairs$EnumHalf.TOP ? vRa.d : uSa.E;
        if (dZ2 == DZ.EAST) {
            IBlockState iBlockState2 = b2.J(c2.west());
            if (BlockStairs.f(iBlockState2.J()) && blockStairs$EnumHalf == iBlockState2.J(HALF)) {
                DZ dZ3 = iBlockState2.J(FACING);
                if (dZ3 == DZ.NORTH && !BlockStairs.J((I)b2, c2.north(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
                if (dZ3 == DZ.SOUTH && !BlockStairs.J((I)b2, c2.south(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
            }
        } else if (dZ2 == DZ.WEST) {
            IBlockState iBlockState3 = b2.J(c2.east());
            if (BlockStairs.f(iBlockState3.J()) && blockStairs$EnumHalf == iBlockState3.J(HALF)) {
                DZ dZ4 = iBlockState3.J(FACING);
                if (dZ4 == DZ.NORTH && !BlockStairs.J((I)b2, c2.north(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
                if (dZ4 == DZ.SOUTH && !BlockStairs.J((I)b2, c2.south(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
            }
        } else if (dZ2 == DZ.SOUTH) {
            IBlockState iBlockState4 = b2.J(c2.north());
            if (BlockStairs.f(iBlockState4.J()) && blockStairs$EnumHalf == iBlockState4.J(HALF)) {
                DZ dZ5 = iBlockState4.J(FACING);
                if (dZ5 == DZ.WEST && !BlockStairs.J((I)b2, c2.west(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
                if (dZ5 == DZ.EAST && !BlockStairs.J((I)b2, c2.east(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
            }
        } else if (dZ2 == DZ.NORTH) {
            IBlockState iBlockState5 = b2.J(c2.south());
            if (BlockStairs.f(iBlockState5.J()) && blockStairs$EnumHalf == iBlockState5.J(HALF)) {
                DZ dZ6 = iBlockState5.J(FACING);
                if (dZ6 == DZ.WEST && !BlockStairs.J((I)b2, c2.west(), iBlockState)) {
                    if (n2 != 0) {
                        return vRa.d;
                    }
                    return uqa.g;
                }
                if (dZ6 == DZ.EAST && !BlockStairs.J((I)b2, c2.east(), iBlockState)) {
                    if (n2 != 0) {
                        return uqa.g;
                    }
                    return vRa.d;
                }
            }
        }
        return uSa.E;
    }
}

