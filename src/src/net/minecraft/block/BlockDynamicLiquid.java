/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  QFa
 *  mra
 *  pua
 *  vRa
 */
package net.minecraft.block;

import java.util.EnumSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockDynamicLiquid
extends BlockLiquid {
    public int adjacentSourceBlocks;

    /*
     * WARNING - void declaration
     */
    private int J(Gg gg2, XF xF, int n2, DZ dZ) {
        BlockDynamicLiquid blockDynamicLiquid = this;
        int n3 = PRa.U;
        for (DZ dZ2 : LX.HORIZONTAL) {
            int n4;
            void b2;
            Object e2;
            void c2;
            XF xF2;
            void d2;
            void a2;
            if (dZ2 == a2 || blockDynamicLiquid.f((Gg)d2, xF2 = c2.offset(dZ2), (IBlockState)(e2 = d2.J(xF2))) || e2.J().J() == blockDynamicLiquid.blockMaterial && e2.J(LEVEL) <= 0) continue;
            if (!blockDynamicLiquid.f((Gg)d2, xF2.down(), (IBlockState)e2)) {
                return (int)b2;
            }
            if (b2 >= AQa.P || (n4 = blockDynamicLiquid.J((Gg)d2, xF2, (int)(b2 + vRa.d), dZ2.getOpposite())) >= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    private void f(Gg var1_1, XF var2_2, IBlockState var3_3, int var4_4) {
        block2: {
            b = this;
            e = var3_3;
            if (!b.l((Gg)d, (XF)c, e)) break block2;
            if (e.J() == QFa.HF) ** GOTO lbl11
            if (b.blockMaterial == Material.lava) {
                v0 = d;
                v1 = v0;
                b.f((Gg)v0, (XF)c);
            } else {
                e.J().J((Gg)d, (XF)c, e, uSa.E);
lbl11:
                // 2 sources

                v1 = d;
            }
            v1.J((XF)c, b.J().J(BlockDynamicLiquid.LEVEL, (int)a), yRa.d);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void f(Gg var1_1, XF var2_2, IBlockState var3_3, Random var4_4) {
        block21: {
            block20: {
                e = var2_2;
                c = this;
                var5_5 = b.J(BlockDynamicLiquid.LEVEL);
                var6_6 = vRa.d;
                if (c.blockMaterial == Material.lava && !d.F.C()) {
                    var6_6 = uqa.g;
                }
                var7_7 = c.J((Gg)d);
                if (var5_5 <= 0) break block20;
                var8_8 = mra.Z;
                c.adjacentSourceBlocks = uSa.E;
                v0 = var9_10 = LX.HORIZONTAL.iterator();
                while (v0.hasNext()) {
                    var10_13 = var9_10.next();
                    v0 = var9_10;
                    var8_8 = c.J((Gg)d, e.offset(var10_13), var8_8);
                }
                var9_11 = var8_8 + var6_6;
                if (var9_11 >= Yqa.i || var8_8 < 0) {
                    var9_11 = pua.o;
                }
                if (c.C((I)d, e.up()) < 0) ** GOTO lbl27
                var10_14 = c.C((I)d, e.up());
                if (var10_14 >= Yqa.i) {
                    var9_11 = var10_14;
                    v1 = c;
                } else {
                    var9_11 = var10_14 + Yqa.i;
lbl27:
                    // 2 sources

                    v1 = c;
                }
                if (v1.adjacentSourceBlocks < uqa.g || c.blockMaterial != Material.water) ** GOTO lbl36
                var10_15 = d.J(e.down());
                if (var10_15.J().J().i()) {
                    var9_11 = uSa.E;
                    v2 = c;
                } else {
                    if (var10_15.J().J() == c.blockMaterial && var10_15.J(BlockDynamicLiquid.LEVEL) == 0) {
                        var9_11 = uSa.E;
                    }
lbl36:
                    // 4 sources

                    v2 = c;
                }
                if (v2.blockMaterial == Material.lava && var5_5 < Yqa.i && var9_11 < Yqa.i && var9_11 > var5_5 && a.nextInt(AQa.P) != 0) {
                    var7_7 *= AQa.P;
                }
                if (var9_11 == var5_5) {
                    c.C((Gg)d, e, (IBlockState)b);
                } else {
                    var5_5 = var9_11;
                    if (var9_11 < 0) {
                        d.G(e);
                    } else {
                        b = b.J(BlockDynamicLiquid.LEVEL, var9_11);
                        d.J(e, (IBlockState)b, uqa.g);
                        v3 = d;
                        v3.J(e, (Block)c, var7_7);
                        v3.f(e, (Block)c);
                    }
                }
                break block21;
            }
            c.C((Gg)d, e, (IBlockState)b);
        }
        var8_9 = d.J(e.down());
        if (c.l((Gg)d, e.down(), var8_9)) {
            if (c.blockMaterial == Material.lava && d.J(e.down()).J().J() == Material.water) {
                d.J(e.down(), QFa.Gd.J());
                c.f((Gg)d, e.down());
                return;
            }
            if (var5_5 >= Yqa.i) {
                c.f((Gg)d, e.down(), var8_9, var5_5);
                return;
            }
            c.f((Gg)d, e.down(), var8_9, var5_5 + Yqa.i);
            return;
        }
        if (var5_5 >= 0 && (var5_5 == 0 || c.f((Gg)d, e.down(), var8_9))) {
            var9_12 = c.J((Gg)d, e);
            var10_16 = var5_5 + var6_6;
            if (var5_5 >= Yqa.i) {
                var10_16 = vRa.d;
            }
            if (var10_16 >= Yqa.i) {
                return;
            }
            v4 = b = var9_12.iterator();
            while (v4.hasNext()) {
                a = b.next();
                v4 = b;
                v5 = d;
                c.f((Gg)v5, e.offset(a), v5.J(e.offset(a)), var10_16);
            }
        }
    }

    public BlockDynamicLiquid(Material material) {
        Material b2 = material;
        BlockDynamicLiquid a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    public int J(Gg gg2, XF xF, int n2) {
        void a2;
        void b2;
        BlockDynamicLiquid c2 = this;
        BlockDynamicLiquid d22 = gg2;
        int d22 = c2.C((I)d22, (XF)b2);
        if (d22 < 0) {
            return (int)a2;
        }
        if (d22 == 0) {
            c2.adjacentSourceBlocks += vRa.d;
        }
        if (d22 >= Yqa.i) {
            d22 = uSa.E;
        }
        if (a2 >= 0 && d22 >= a2) {
            return (int)a2;
        }
        return d22;
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        void c2;
        void a2;
        BlockDynamicLiquid blockDynamicLiquid = this;
        Material d2 = a2.J().J();
        if (d2 != blockDynamicLiquid.blockMaterial && d2 != Material.lava && !blockDynamicLiquid.f((Gg)c2, (XF)b2, (IBlockState)a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Set<DZ> J(Gg gg2, XF xF) {
        BlockDynamicLiquid blockDynamicLiquid = this;
        int n2 = PRa.U;
        EnumSet<DZ> enumSet = EnumSet.noneOf(DZ.class);
        for (DZ dZ : LX.HORIZONTAL) {
            Object c2;
            void b2;
            void a2;
            XF xF2 = a2.offset(dZ);
            if (blockDynamicLiquid.f((Gg)b2, xF2, (IBlockState)(c2 = b2.J(xF2))) || c2.J().J() == blockDynamicLiquid.blockMaterial && c2.J(LEVEL) <= 0) continue;
            void v0 = b2;
            if ((blockDynamicLiquid.f((Gg)v0, xF2.down(), v0.J(xF2.down())) ? blockDynamicLiquid.J((Gg)b2, xF2, vRa.d, dZ.getOpposite()) : uSa.E) < n2) {
                enumSet.clear();
            }
            if (c2 > n2) continue;
            enumSet.add(dZ);
            n2 = c2;
        }
        return enumSet;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        Block d2 = gg2;
        BlockDynamicLiquid c2 = this;
        if (!((d2 = d2.J((XF)b2).J()) instanceof BlockDoor) && d2 != QFa.Nd && d2 != QFa.z && d2 != QFa.ka) {
            if (d2.blockMaterial == Material.portal) {
                return vRa.d != 0;
            }
            return d2.blockMaterial.f();
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void b2;
        BlockDynamicLiquid c2 = this;
        BlockDynamicLiquid d2 = gg2;
        if (!c2.J((Gg)d2, (XF)b2, (IBlockState)a2)) {
            BlockDynamicLiquid blockDynamicLiquid = c2;
            d2.J((XF)b2, blockDynamicLiquid, blockDynamicLiquid.J((Gg)d2));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockDynamicLiquid a2 = this;
        c2.J((XF)b2, BlockDynamicLiquid.J(a2.blockMaterial).J().J(LEVEL, d2.J(LEVEL)), uqa.g);
    }
}

