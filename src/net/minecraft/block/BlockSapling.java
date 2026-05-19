/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bv
 *  Ey
 *  Gg
 *  JPa
 *  MQa
 *  Mda
 *  NTa
 *  Ov
 *  QFa
 *  Rw
 *  Uv
 *  VQa
 *  XTa
 *  ZW
 *  Zpa
 *  asa
 *  eAa
 *  kta
 *  kw
 *  pua
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockSapling$1;
import net.minecraft.block.BlockSapling$2;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockSapling
extends BlockBush
implements IGrowable {
    public static final PropertyEnum<BlockPlanks$EnumType> TYPE = PropertyEnum.J(Zpa.x, BlockPlanks$EnumType.class, new BlockSapling$1());
    public static final PropertyInteger STAGE = PropertyInteger.J(asa.b, uSa.E, vRa.d);

    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl) {
        boolean bl2 = bl;
        BlockSapling a2 = this;
        return vRa.d != 0;
    }

    @Override
    public String f() {
        BlockSapling a2;
        return Ey.f((String)new StringBuilder().insert(3 >> 2, a2.J()).append(VQa.ja).append(BlockPlanks$EnumType.OAK.getUnlocalizedName()).append(tpa.N).toString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        BlockSapling blockSapling = random2;
        Random random2 = random;
        BlockSapling a2 = blockSapling;
        if (!d2.e) {
            Random e2;
            void b2;
            void c2;
            void v1 = d2;
            super.f((Gg)v1, (XF)c2, (IBlockState)b2, e2);
            if (v1.C(c2.up()) >= WOa.fa && e2.nextInt(XTa.W) == 0) {
                a2.d((Gg)d2, (XF)c2, (IBlockState)b2, e2);
            }
        }
    }

    @Override
    public BlockState J() {
        BlockSapling a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = TYPE;
        iPropertyArray[vRa.d] = STAGE;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        void c2;
        IBlockState e2;
        void b2;
        void d2;
        BlockSapling blockSapling = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockSapling a2 = blockSapling;
        a2.d((Gg)d2, (XF)b2, e2, (Random)c2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2, BlockPlanks$EnumType blockPlanks$EnumType) {
        void a2;
        void b2;
        Object d2 = gg2;
        BlockSapling c2 = this;
        if ((d2 = d2.J((XF)b2)).J() == c2 && d2.J(TYPE) == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, int n2, int n3, BlockPlanks$EnumType blockPlanks$EnumType) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        BlockSapling blockSapling = object;
        Object object = blockPlanks$EnumType;
        BlockSapling a2 = blockSapling;
        if (a2.J((Gg)e2, d2.add((int)c2, uSa.E, (int)b2), (BlockPlanks$EnumType)((Object)f2)) && a2.J((Gg)e2, d2.add((int)(c2 + vRa.d), uSa.E, (int)b2), (BlockPlanks$EnumType)((Object)f2)) && a2.J((Gg)e2, d2.add((int)c2, uSa.E, (int)(b2 + vRa.d)), (BlockPlanks$EnumType)((Object)f2)) && a2.J((Gg)e2, d2.add((int)(c2 + vRa.d), uSa.E, (int)(b2 + vRa.d)), (BlockPlanks$EnumType)((Object)f2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockSapling a2 = this;
        return a2.J().J(TYPE, BlockPlanks$EnumType.byMetadata(b2 & XTa.W)).J(STAGE, (b2 & Yqa.i) >> yRa.d);
    }

    public BlockSapling() {
        BlockSapling blockSapling;
        BlockSapling blockSapling2 = blockSapling = this;
        blockSapling2.J(blockSapling2.blockState.J().J(TYPE, BlockPlanks$EnumType.OAK).J(STAGE, uSa.E));
        float a2 = Xpa.R;
        blockSapling2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, a2 * kta.v, MQa.L + a2);
        blockSapling2.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    public void d(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void a2;
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockSapling b2 = this;
        if (e2.J(STAGE) == 0) {
            d2.J((XF)c2, e2.J(STAGE), AQa.P);
            return;
        }
        b2.C((Gg)d2, (XF)c2, e2, (Random)a2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void C(Gg var1_2, XF var2_3, IBlockState var3_4, Random var4_5) {
        block23: {
            block25: {
                block24: {
                    var7_6 = this;
                    var5_7 /* !! */  = a.nextInt(NTa.C) == 0 ? new Ov((boolean)vRa.d) : new hx((boolean)vRa.d);
                    var6_8 = uSa.E;
                    e = uSa.E;
                    var8_9 = uSa.E;
                    block0 : switch (BlockSapling$2.$SwitchMap$net$minecraft$block$BlockPlanks$EnumType[b.J(BlockSapling.TYPE).ordinal()]) {
                        case 1: {
                            v0 = var6_8 = uSa.E;
lbl10:
                            // 2 sources

                            while (true) {
                                if (v0 >= pua.o) {
                                    v1 = uSa.E;
                                    break block0;
                                }
                                v2 = var8_9;
lbl15:
                                // 2 sources

                                while (v2 == 0) {
                                    e = uSa.E;
                                    var6_8 = uSa.E;
                                    var5_7 /* !! */  = new Rw((boolean)vRa.d);
                                    break block23;
                                }
                                break block23;
                                break;
                            }
                        }
                        case 2: {
                            var5_7 /* !! */  = new kw((boolean)vRa.d, (boolean)uSa.E);
                            break block23;
                        }
                        case 3: {
                            var9_10 = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.JUNGLE);
                            var10_11 = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.JUNGLE).J(BlockLeaves.CHECK_DECAY, (boolean)uSa.E);
                            v3 = var6_8 = uSa.E;
lbl28:
                            // 2 sources

                            while (true) {
                                if (v3 >= pua.o) {
                                    v4 = uSa.E;
                                    break block24;
                                }
                                v5 = var8_9;
lbl33:
                                // 2 sources

                                while (v5 == 0) {
                                    e = uSa.E;
                                    var6_8 = uSa.E;
                                    var5_7 /* !! */  = new hx((boolean)vRa.d, AQa.P + a.nextInt(XTa.W), var9_10, var10_11, (boolean)uSa.E);
                                    break block23;
                                }
                                break block23;
                                break;
                            }
                        }
                        case 4: {
                            var5_7 /* !! */  = new Bv((boolean)vRa.d);
                            break block23;
                        }
                        case 5: {
                            v6 = var6_8 = uSa.E;
lbl44:
                            // 2 sources

                            while (true) {
                                if (v6 >= pua.o) {
                                    v7 = uSa.E;
                                    break block25;
                                }
                                v8 = var8_9;
lbl49:
                                // 2 sources

                                while (v8 == 0) {
                                    return;
                                }
                                break block23;
                                break;
                            }
                        }
                        default: {
                            break block23;
                        }
                    }
                    while (v1 >= pua.o) {
                        block26: {
                            if (!var7_6.J((Gg)d, (XF)c, var6_8, e, BlockPlanks$EnumType.SPRUCE)) break block26;
                            var5_7 /* !! */  = new ZW((boolean)uSa.E, a.nextBoolean());
                            v2 = var8_9 = vRa.d;
                            ** GOTO lbl15
                        }
                        v1 = --e;
                    }
                    v0 = --var6_8;
                    ** while (true)
                }
                while (v4 >= pua.o) {
                    block27: {
                        if (!var7_6.J((Gg)d, (XF)c, var6_8, e, BlockPlanks$EnumType.JUNGLE)) break block27;
                        var5_7 /* !! */  = new jw((boolean)vRa.d, NTa.C, kTa.j, var9_10, var10_11);
                        v5 = var8_9 = vRa.d;
                        ** GOTO lbl33
                    }
                    v4 = --e;
                }
                v3 = --var6_8;
                ** while (true)
            }
            while (v7 >= pua.o) {
                block28: {
                    if (!var7_6.J((Gg)d, (XF)c, var6_8, e, BlockPlanks$EnumType.DARK_OAK)) break block28;
                    var5_7 /* !! */  = new Uv((boolean)vRa.d);
                    v8 = var8_9 = vRa.d;
                    ** GOTO lbl49
                }
                v7 = --e;
            }
            v6 = --var6_8;
            ** while (true)
        }
        var9_10 = QFa.HF.J();
        v9 = d;
        if (var8_9 != 0) {
            v9.J(c.add(var6_8, uSa.E, e), var9_10, AQa.P);
            d.J(c.add(var6_8 + vRa.d, uSa.E, e), var9_10, AQa.P);
            d.J(c.add(var6_8, uSa.E, e + vRa.d), var9_10, AQa.P);
            d.J(c.add(var6_8 + vRa.d, uSa.E, e + vRa.d), var9_10, AQa.P);
            v10 /* !! */  = var5_7 /* !! */ ;
        } else {
            v9.J((XF)c, var9_10, AQa.P);
            v10 /* !! */  = var5_7 /* !! */ ;
        }
        if (!v10 /* !! */ .J((Gg)d, (Random)a, c.add(var6_8, uSa.E, e))) {
            v11 = d;
            if (var8_9 != 0) {
                v11.J(c.add(var6_8, uSa.E, e), (IBlockState)b, AQa.P);
                d.J(c.add(var6_8 + vRa.d, uSa.E, e), (IBlockState)b, AQa.P);
                d.J(c.add(var6_8, uSa.E, e + vRa.d), (IBlockState)b, AQa.P);
                d.J(c.add(var6_8 + vRa.d, uSa.E, e + vRa.d), (IBlockState)b, AQa.P);
                return;
            }
            v11.J((XF)c, (IBlockState)b, AQa.P);
        }
    }

    @Override
    public boolean J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        BlockSapling e2 = gg2;
        BlockSapling d2 = this;
        if ((double)((Gg)e2).v.nextFloat() < BQa.ia) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockSapling blockSapling = this;
        BlockPlanks$EnumType[] b2 = BlockPlanks$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockPlanks$EnumType blockPlanks$EnumType = b2[d2];
            if (blockPlanks$EnumType.getMetadata() > tTa.h) {
                return;
            }
            a2.add(new Mda((eAa)c2, vRa.d, blockPlanks$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSapling a2 = this;
        return b2.J(TYPE).getMetadata();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSapling a2 = this;
        return uSa.E | b2.J(TYPE).getMetadata() | b2.J(STAGE) << yRa.d;
    }
}

