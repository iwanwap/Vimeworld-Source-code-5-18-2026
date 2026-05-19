/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  Lqa
 *  YSa
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelQuadruped;

public final class ModelPig
extends ModelQuadruped {
    public ModelPig() {
        a2(JPa.N);
        ModelPig a2;
    }

    public ModelPig(float f2) {
        ModelPig a2;
        float b2 = f2;
        ModelPig modelPig = a2 = this;
        super(uua.p, b2);
        modelPig.head.f(ERa.C, ERa.C).J(dua.ca, JPa.N, Lqa.C, AQa.P, yRa.d, vRa.d, b2);
        modelPig.childYOffset = YSa.G;
    }
}

