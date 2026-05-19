/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  NTa
 *  QFa
 *  Zpa
 *  asa
 *  eAa
 *  ez
 *  hTa
 *  pqa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockPane
extends Block {
    public static final PropertyBool NORTH = PropertyBool.J(hTa.d);
    private final boolean canDrop;
    public static final PropertyBool EAST = PropertyBool.J(Zpa.D);
    public static final PropertyBool WEST;
    public static final PropertyBool SOUTH;

    @Override
    public void f() {
        BlockPane a2;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
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
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        void f2;
        BlockPane e2;
        XF g2;
        block6: {
            block7: {
                block4: {
                    block5: {
                        g2 = xF2;
                        BlockPane blockPane = e2 = this;
                        void v1 = f2;
                        bl6 = e2.f(f2.J(g2.north()).J());
                        bl5 = e2.f(v1.J(g2.south()).J());
                        bl4 = blockPane.f(v1.J(g2.west()).J());
                        bl3 = blockPane.f(f2.J(g2.east()).J());
                        if (bl4 && bl3 || !bl4 && !bl3 && !bl6 && !bl5) break block4;
                        if (!bl4) break block5;
                        bl2 = bl6;
                        BlockPane blockPane2 = e2;
                        blockPane2.J(JPa.N, JPa.N, asa.t, MQa.L, pqa.r, NTa.c);
                        super.J((Gg)f2, g2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
                        break block6;
                    }
                    if (!bl3) break block7;
                    bl2 = bl6;
                    BlockPane blockPane = e2;
                    blockPane.J(MQa.L, JPa.N, asa.t, pqa.r, pqa.r, NTa.c);
                    super.J((Gg)f2, g2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
                    break block6;
                }
                e2.J(JPa.N, JPa.N, asa.t, pqa.r, pqa.r, NTa.c);
                super.J((Gg)f2, g2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
            }
            bl2 = bl6;
        }
        if ((!bl2 || !bl5) && (bl4 || bl3 || bl6 || bl5)) {
            if (bl6) {
                BlockPane blockPane = e2;
                blockPane.J(asa.t, JPa.N, JPa.N, NTa.c, pqa.r, MQa.L);
                super.J((Gg)f2, g2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
                return;
            }
            if (bl5) {
                BlockPane blockPane = e2;
                blockPane.J(asa.t, JPa.N, MQa.L, NTa.c, pqa.r, pqa.r);
                super.J((Gg)f2, g2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
                return;
            }
        } else {
            e2.J(asa.t, JPa.N, JPa.N, NTa.c, pqa.r, pqa.r);
            super.J((Gg)f2, g2, (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
        }
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPane a2 = this;
        return uSa.E;
    }

    public final boolean f(Block block) {
        Block b2 = block;
        BlockPane a2 = this;
        if (b2.J() || b2 == a2 || b2 == QFa.ye || b2 == QFa.VA || b2 == QFa.KC || b2 instanceof BlockPane) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        SOUTH = PropertyBool.J(vsa.k);
        WEST = PropertyBool.J(NTa.U);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        BlockPane blockPane;
        float f2;
        float f3;
        float f4;
        float f5;
        block6: {
            BlockPane b2;
            block7: {
                block4: {
                    boolean bl2;
                    block5: {
                        boolean bl3;
                        boolean a22;
                        boolean bl4;
                        boolean c22;
                        block2: {
                            block3: {
                                block0: {
                                    block1: {
                                        void a22;
                                        BlockPane c22 = i2;
                                        b2 = this;
                                        f5 = asa.t;
                                        f4 = NTa.c;
                                        f3 = asa.t;
                                        f2 = NTa.c;
                                        BlockPane blockPane2 = b2;
                                        BlockPane blockPane3 = c22;
                                        c22 = b2.f(c22.J(a22.north()).J());
                                        bl2 = b2.f(blockPane3.J(a22.south()).J());
                                        bl4 = blockPane2.f(blockPane3.J(a22.west()).J());
                                        a22 = blockPane2.f(c22.J(a22.east()).J());
                                        if (bl4 && a22 || !bl4 && !a22 && !c22 && !bl2) break block0;
                                        if (!bl4) break block1;
                                        f5 = JPa.N;
                                        bl3 = c22;
                                        break block2;
                                    }
                                    if (!a22) break block3;
                                    f4 = pqa.r;
                                    bl3 = c22;
                                    break block2;
                                }
                                f5 = JPa.N;
                                f4 = pqa.r;
                            }
                            bl3 = c22;
                        }
                        if (bl3 && bl2 || !bl4 && !a22 && !c22 && !bl2) break block4;
                        if (!c22) break block5;
                        f3 = JPa.N;
                        blockPane = b2;
                        break block6;
                    }
                    if (!bl2) break block7;
                    f2 = pqa.r;
                    blockPane = b2;
                    break block6;
                }
                f3 = JPa.N;
                f2 = pqa.r;
            }
            blockPane = b2;
        }
        blockPane.J(f5, JPa.N, f3, f4, pqa.r, f2);
    }

    @Override
    public ez J() {
        return ez.CUTOUT_MIPPED;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void a2;
        void c2;
        Object d2 = xF2;
        BlockPane b2 = this;
        if (c2.J((XF)((Object)d2)).J() == b2) {
            return uSa.E != 0;
        }
        return super.J((I)c2, (XF)((Object)d2), (DZ)a2);
    }

    @Override
    public BlockState J() {
        BlockPane a2;
        IProperty[] iPropertyArray = new IProperty[AQa.P];
        iPropertyArray[uSa.E] = NORTH;
        iPropertyArray[vRa.d] = EAST;
        iPropertyArray[uqa.g] = WEST;
        iPropertyArray[yRa.d] = SOUTH;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    public BlockPane(Material material, boolean bl2) {
        void b2;
        BlockPane a2;
        boolean c2 = bl2;
        BlockPane blockPane = a2 = this;
        BlockPane blockPane2 = a2;
        super((Material)b2);
        blockPane.J(blockPane2.blockState.J().J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0));
        blockPane.canDrop = c2;
        blockPane.J(yGa.a);
    }

    @Override
    public boolean G() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void b2;
        void c2;
        XF d2 = xF2;
        BlockPane a2 = this;
        return c2.J(NORTH, a2.f(b2.J(d2.north()).J())).J(SOUTH, a2.f(b2.J(d2.south()).J())).J(WEST, a2.f(b2.J(d2.west()).J())).J(EAST, a2.f(b2.J(d2.east()).J()));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        void b2;
        void c2;
        int d2 = n2;
        BlockPane a2 = this;
        if (!a2.canDrop) {
            return null;
        }
        return super.J((IBlockState)c2, (Random)b2, d2);
    }
}

