/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  cQa
 *  cT
 *  vRa
 *  wra
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelBanner
extends ModelBase {
    public cT bannerSlate;
    public cT bannerStand;
    public cT bannerTop;

    public ModelBanner() {
        ModelBanner a2;
        ModelBanner modelBanner = a2;
        modelBanner.textureWidth = ysa.s;
        modelBanner.textureHeight = ysa.s;
        ModelBanner modelBanner2 = a2;
        modelBanner.bannerSlate = new cT((ModelBase)a2, uSa.E, uSa.E);
        modelBanner.bannerSlate.J(Cra.fa, JPa.N, dua.ca, kTa.j, wra.P, vRa.d, JPa.N);
        modelBanner.bannerStand = new cT((ModelBase)a2, Yqa.D, uSa.E);
        modelBanner.bannerStand.J(vqa.T, TOa.R, vqa.T, uqa.g, cQa.i, uqa.g, JPa.N);
        modelBanner.bannerTop = new cT((ModelBase)a2, uSa.E, cQa.i);
        modelBanner.bannerTop.J(Cra.fa, NSa.c, vqa.T, kTa.j, uqa.g, uqa.g, JPa.N);
    }

    public void J() {
        ModelBanner a2;
        ModelBanner modelBanner = a2;
        modelBanner.bannerSlate.rotationPointY = NSa.c;
        modelBanner.bannerSlate.C(rRa.T);
        modelBanner.bannerStand.C(rRa.T);
        modelBanner.bannerTop.C(rRa.T);
    }
}

