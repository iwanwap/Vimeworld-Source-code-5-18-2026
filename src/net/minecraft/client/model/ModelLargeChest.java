/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  JPa
 *  NTa
 *  Yra
 *  cT
 *  lqa
 *  pqa
 *  qta
 *  vRa
 *  wOa
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelChest;

public final class ModelLargeChest
extends ModelChest {
    public ModelLargeChest() {
        ModelLargeChest a2;
        ModelLargeChest modelLargeChest = a2;
        modelLargeChest.chestLid = new cT((ModelBase)a2, uSa.E, uSa.E).J(XOa.h, ysa.s);
        a2.chestLid.J(JPa.N, CRa.M, Lsa.A, Fsa.d, tTa.h, hpa.Z, JPa.N);
        modelLargeChest.chestLid.rotationPointX = pqa.r;
        modelLargeChest.chestLid.rotationPointY = BRa.k;
        modelLargeChest.chestLid.rotationPointZ = qta.D;
        modelLargeChest.chestKnob = new cT((ModelBase)a2, uSa.E, uSa.E).J(XOa.h, ysa.s);
        modelLargeChest.chestKnob.J(vqa.T, dua.ca, DPa.m, uqa.g, AQa.P, vRa.d, JPa.N);
        modelLargeChest.chestKnob.rotationPointX = Yra.i;
        modelLargeChest.chestKnob.rotationPointY = BRa.k;
        modelLargeChest.chestKnob.rotationPointZ = qta.D;
        modelLargeChest.chestBelow = new cT((ModelBase)a2, uSa.E, wOa.t).J(XOa.h, ysa.s);
        modelLargeChest.chestBelow.J(JPa.N, JPa.N, JPa.N, Fsa.d, NTa.C, hpa.Z, JPa.N);
        modelLargeChest.chestBelow.rotationPointX = pqa.r;
        modelLargeChest.chestBelow.rotationPointY = lqa.ga;
        modelLargeChest.chestBelow.rotationPointZ = pqa.r;
    }
}

