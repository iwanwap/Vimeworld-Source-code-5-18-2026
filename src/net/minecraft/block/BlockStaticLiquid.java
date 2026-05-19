/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  bpa
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockStaticLiquid
extends BlockLiquid {
    /*
     * WARNING - void declaration
     */
    private boolean C(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        BlockStaticLiquid a2 = this;
        return b2.J((XF)((Object)c2)).J().J().e();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState, Random random) {
        block9: {
            void c2;
            void a2;
            void d2;
            BlockStaticLiquid blockStaticLiquid = this;
            if (blockStaticLiquid.blockMaterial != Material.lava || !d2.J().f(bpa.Da)) break block9;
            int b2 = a2.nextInt(yRa.d);
            if (b2 > 0) {
                int n2;
                Object e2 = c2;
                int n3 = n2 = uSa.E;
                while (n3 < b2) {
                    e2 = ((XF)((Object)e2)).add(a2.nextInt(yRa.d) - vRa.d, vRa.d, a2.nextInt(yRa.d) - vRa.d);
                    Block block = d2.J((XF)((Object)e2)).J();
                    if (block.blockMaterial == Material.air) {
                        if (blockStaticLiquid.l((Gg)d2, (XF)((Object)e2))) {
                            d2.J((XF)((Object)e2), QFa.ic.J());
                            return;
                        }
                    } else if (block.blockMaterial.f()) {
                        return;
                    }
                    n3 = ++n2;
                }
            } else {
                int e2;
                int n4 = e2 = uSa.E;
                while (n4 < yRa.d) {
                    XF xF2 = c2.add(a2.nextInt(yRa.d) - vRa.d, uSa.E, a2.nextInt(yRa.d) - vRa.d);
                    if (d2.J(xF2.up()) && blockStaticLiquid.C((Gg)d2, xF2)) {
                        d2.J(xF2.up(), QFa.ic.J());
                    }
                    n4 = ++e2;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        Object b2 = this;
        IBlockState e2 = iBlockState;
        if (!((BlockLiquid)b2).J((Gg)d2, (XF)c2, e2)) {
            ((BlockStaticLiquid)b2).C((Gg)d2, (XF)c2, e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        BlockStaticLiquid blockStaticLiquid = this;
        BlockLiquid d2 = BlockStaticLiquid.J(blockStaticLiquid.blockMaterial);
        c2.J((XF)b2, d2.J().J(LEVEL, a2.J(LEVEL)), uqa.g);
        c2.J((XF)b2, (Block)d2, blockStaticLiquid.J((Gg)c2));
    }

    public BlockStaticLiquid(Material material) {
        BlockStaticLiquid a2;
        Material b2 = material;
        BlockStaticLiquid blockStaticLiquid = a2 = this;
        Object object = b2;
        super((Material)object);
        blockStaticLiquid.J(uSa.E != 0);
        if (object == Material.lava) {
            a2.J(vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF) {
        int c2;
        BlockStaticLiquid blockStaticLiquid = this;
        DZ[] dZArray = DZ.values();
        int n2 = dZArray.length;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            void a2;
            void b2;
            DZ dZ2 = dZArray[c2];
            if (blockStaticLiquid.C((Gg)b2, a2.offset(dZ2))) {
                return vRa.d != 0;
            }
            n3 = ++c2;
        }
        return uSa.E != 0;
    }
}

