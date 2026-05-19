/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  JPa
 *  NTa
 *  Qsa
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

public class ModelChest
extends ModelBase {
    public cT chestLid;
    public cT chestKnob;
    public cT chestBelow;

    public ModelChest() {
        ModelChest a2;
        ModelChest modelChest = a2;
        modelChest.chestLid = new cT((ModelBase)a2, uSa.E, uSa.E).J(ysa.s, ysa.s);
        a2.chestLid.J(JPa.N, CRa.M, Lsa.A, hpa.Z, tTa.h, hpa.Z, JPa.N);
        modelChest.chestLid.rotationPointX = pqa.r;
        modelChest.chestLid.rotationPointY = BRa.k;
        modelChest.chestLid.rotationPointZ = qta.D;
        modelChest.chestKnob = new cT((ModelBase)a2, uSa.E, uSa.E).J(ysa.s, ysa.s);
        modelChest.chestKnob.J(vqa.T, dua.ca, DPa.m, uqa.g, AQa.P, vRa.d, JPa.N);
        modelChest.chestKnob.rotationPointX = Qsa.k;
        modelChest.chestKnob.rotationPointY = BRa.k;
        modelChest.chestKnob.rotationPointZ = qta.D;
        modelChest.chestBelow = new cT((ModelBase)a2, uSa.E, wOa.t).J(ysa.s, ysa.s);
        modelChest.chestBelow.J(JPa.N, JPa.N, JPa.N, hpa.Z, NTa.C, hpa.Z, JPa.N);
        modelChest.chestBelow.rotationPointX = pqa.r;
        modelChest.chestBelow.rotationPointY = lqa.ga;
        modelChest.chestBelow.rotationPointZ = pqa.r;
    }

    public void J() {
        ModelChest a2;
        ModelChest modelChest = a2;
        ModelChest modelChest2 = a2;
        modelChest.chestKnob.rotateAngleX = modelChest2.chestLid.rotateAngleX;
        modelChest.chestLid.C(rRa.T);
        modelChest2.chestKnob.C(rRa.T);
        modelChest.chestBelow.C(rRa.T);
    }
}

