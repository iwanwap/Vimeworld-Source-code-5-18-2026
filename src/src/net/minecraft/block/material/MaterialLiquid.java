/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public final class MaterialLiquid
extends Material {
    public MaterialLiquid(MapColor mapColor) {
        MaterialLiquid a2;
        MapColor b2 = mapColor;
        MaterialLiquid materialLiquid = a2 = this;
        super(b2);
        materialLiquid.d();
        a2.l();
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        return vRa.d != 0;
    }

    @Override
    public boolean i() {
        return uSa.E != 0;
    }
}

