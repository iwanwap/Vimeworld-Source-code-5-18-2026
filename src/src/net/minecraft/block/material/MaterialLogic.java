/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public final class MaterialLogic
extends Material {
    @Override
    public boolean C() {
        return uSa.E != 0;
    }

    public MaterialLogic(MapColor mapColor) {
        MaterialLogic a2;
        MapColor b2 = mapColor;
        MaterialLogic materialLogic = a2 = this;
        super(b2);
        materialLogic.f();
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }

    @Override
    public boolean i() {
        return uSa.E != 0;
    }
}

