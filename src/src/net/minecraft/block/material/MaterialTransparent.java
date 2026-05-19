/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public final class MaterialTransparent
extends Material {
    public MaterialTransparent(MapColor mapColor) {
        MaterialTransparent a2;
        MapColor b2 = mapColor;
        MaterialTransparent materialTransparent = a2 = this;
        super(b2);
        materialTransparent.d();
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }

    @Override
    public boolean i() {
        return uSa.E != 0;
    }

    @Override
    public boolean C() {
        return uSa.E != 0;
    }
}

