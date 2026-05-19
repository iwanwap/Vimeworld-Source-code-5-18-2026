/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public final class MaterialPortal
extends Material {
    @Override
    public boolean f() {
        return uSa.E != 0;
    }

    public MaterialPortal(MapColor mapColor) {
        MapColor b2 = mapColor;
        MaterialPortal a2 = this;
        super(b2);
    }

    @Override
    public boolean C() {
        return uSa.E != 0;
    }

    @Override
    public boolean i() {
        return uSa.E != 0;
    }
}

