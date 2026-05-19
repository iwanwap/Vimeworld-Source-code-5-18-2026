/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ez
 */
package net.minecraft.block;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public final class BlockCopperGrate
extends BlockBreakable {
    /*
     * WARNING - void declaration
     */
    public BlockCopperGrate(Material material, MapColor mapColor) {
        void b2;
        MapColor c2 = mapColor;
        BlockCopperGrate a2 = this;
        super((Material)b2, uSa.E != 0, c2);
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }
}

