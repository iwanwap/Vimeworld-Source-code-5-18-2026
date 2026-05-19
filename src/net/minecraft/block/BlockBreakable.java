/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 *  QFa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockBreakable
extends Block {
    private boolean ignoreSimilarity;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void a2;
        void b2;
        void c2;
        BlockBreakable blockBreakable = this;
        IBlockState iBlockState = c2.J((XF)b2);
        Block d2 = iBlockState.J();
        if (blockBreakable == QFa.ye || blockBreakable == QFa.VA) {
            if (c2.J(b2.offset(a2.getOpposite())) != iBlockState) {
                return vRa.d != 0;
            }
            if (d2 == blockBreakable) {
                return uSa.E != 0;
            }
        }
        if (!blockBreakable.ignoreSimilarity && d2 == blockBreakable) {
            return uSa.E != 0;
        }
        return super.J((I)c2, (XF)b2, (DZ)a2);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockBreakable(Material material, boolean bl) {
        void b2;
        boolean c2 = bl;
        BlockBreakable a2 = this;
        void v0 = b2;
        a2((Material)v0, c2, v0.J());
    }

    /*
     * WARNING - void declaration
     */
    public BlockBreakable(Material material, boolean bl, MapColor mapColor) {
        void b2;
        void c2;
        MapColor d2 = mapColor;
        BlockBreakable a2 = this;
        super((Material)c2, d2);
        a2.ignoreSimilarity = b2;
    }
}

