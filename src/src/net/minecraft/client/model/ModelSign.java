/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  cT
 *  lqa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelSign
extends ModelBase {
    public cT signBoard;
    public cT signStick;

    public ModelSign() {
        ModelSign a2;
        ModelSign modelSign = a2;
        modelSign.signBoard = new cT((ModelBase)a2, uSa.E, uSa.E);
        a2.signBoard.J(csa.P, Lsa.A, vqa.T, osa.c, lqa.s, uqa.g, JPa.N);
        modelSign.signStick = new cT((ModelBase)a2, uSa.E, hpa.Z);
        modelSign.signStick.J(vqa.T, dua.ca, vqa.T, uqa.g, hpa.Z, uqa.g, JPa.N);
    }

    public void J() {
        ModelSign a2;
        ModelSign modelSign = a2;
        modelSign.signBoard.C(rRa.T);
        modelSign.signStick.C(rRa.T);
    }
}

