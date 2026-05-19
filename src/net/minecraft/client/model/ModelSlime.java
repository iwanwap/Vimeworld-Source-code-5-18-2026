/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NQa
 *  Yra
 *  cT
 *  vL
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelSlime
extends ModelBase {
    public cT slimeLeftEye;
    public cT slimeMouth;
    public cT slimeBodies;
    public cT slimeRightEye;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g2;
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelSlime a2;
        float f9 = f7;
        ModelSlime modelSlime = a2 = this;
        modelSlime.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelSlime.slimeBodies.C((float)h2);
        if (modelSlime.slimeRightEye != null) {
            ModelSlime modelSlime2 = a2;
            modelSlime2.slimeRightEye.C((float)h2);
            modelSlime2.slimeLeftEye.C((float)h2);
            modelSlime2.slimeMouth.C((float)h2);
        }
    }

    public ModelSlime(int n2) {
        int b2 = n2;
        ModelSlime a2 = this;
        a2.slimeBodies = new cT((ModelBase)a2, uSa.E, b2);
        a2.slimeBodies.J(NQa.m, Yra.i, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        if (b2 > 0) {
            ModelSlime modelSlime = a2;
            modelSlime.slimeBodies = new cT((ModelBase)modelSlime, uSa.E, b2);
            modelSlime.slimeBodies.J(TOa.p, gQa.ca, TOa.p, uua.p, uua.p, uua.p);
            ModelSlime modelSlime2 = a2;
            modelSlime2.slimeRightEye = new cT((ModelBase)modelSlime2, fPa.i, uSa.E);
            modelSlime2.slimeRightEye.J(POa.ja, vqa.A, Ura.T, uqa.g, uqa.g, uqa.g);
            ModelSlime modelSlime3 = a2;
            modelSlime3.slimeLeftEye = new cT((ModelBase)modelSlime3, fPa.i, AQa.P);
            modelSlime3.slimeLeftEye.J(oQa.z, vqa.A, Ura.T, uqa.g, uqa.g, uqa.g);
            ModelSlime modelSlime4 = a2;
            modelSlime4.slimeMouth = new cT((ModelBase)modelSlime4, fPa.i, Yqa.i);
            modelSlime4.slimeMouth.J(JPa.N, POa.Aa, Ura.T, vRa.d, vRa.d, vRa.d);
        }
    }
}

