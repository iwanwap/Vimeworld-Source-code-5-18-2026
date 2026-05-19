/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ypa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockRotatedPillar
extends Block {
    public static final PropertyEnum<RX> AXIS = PropertyEnum.J(Ypa.V, RX.class);

    public BlockRotatedPillar(Material material) {
        Material b2 = material;
        BlockRotatedPillar a2 = this;
        Object object = b2;
        super((Material)object, ((Material)object).J());
    }

    /*
     * WARNING - void declaration
     */
    public BlockRotatedPillar(Material material, MapColor mapColor) {
        void b2;
        MapColor c2 = mapColor;
        BlockRotatedPillar a2 = this;
        super((Material)b2, c2);
    }
}

