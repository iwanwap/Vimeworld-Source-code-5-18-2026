/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nj
 *  vQa
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime;

import net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime.BedrockComponentLifetime;

public final class BedrockComponentLifetimeOnce
extends BedrockComponentLifetime {
    @Override
    public void J(nj nj2) {
        BedrockComponentLifetimeOnce b2 = nj2;
        BedrockComponentLifetimeOnce a2 = this;
        double d2 = a2.activeTime.J();
        ((nj)b2).J = (int)(d2 * vQa.c);
        if (b2.f() >= d2) {
            b2.d();
        }
    }

    public BedrockComponentLifetimeOnce() {
        BedrockComponentLifetimeOnce a2;
    }
}

