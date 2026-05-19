/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;

public abstract class BlockDirectional
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);

    public BlockDirectional(Material material) {
        Material b2 = material;
        BlockDirectional a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    public BlockDirectional(Material material, MapColor mapColor) {
        void b2;
        MapColor c2 = mapColor;
        BlockDirectional a2 = this;
        super((Material)b2, c2);
    }
}

