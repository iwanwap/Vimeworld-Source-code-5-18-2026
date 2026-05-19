/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  ERa
 *  FPa
 *  Gl
 *  JPa
 *  Lqa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Qqa
 *  Qsa
 *  Qta
 *  SRa
 *  TQa
 *  Wsa
 *  XTa
 *  Ypa
 *  Yra
 *  cT
 *  cfa
 *  kta
 *  lPa
 *  pqa
 *  pua
 *  uKa
 *  vL
 *  vPa
 *  vQa
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelRabbit
extends ModelBase {
    public cT rabbitNose;
    public cT rabbitRightArm;
    public cT rabbitRightFoot;
    public cT rabbitTail;
    public cT rabbitLeftArm;
    public cT rabbitRightEar;
    public cT rabbitBody;
    public cT rabbitHead;
    public cT rabbitLeftEar;
    public cT rabbitLeftFoot;
    public cT rabbitRightThigh;
    public cT rabbitLeftThigh;
    private float field_178699_n;
    private float field_178701_m;

    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        float f5 = f4;
        ModelRabbit a2 = this;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void d2;
        void c2;
        ModelRabbit h2;
        void e2;
        ModelRabbit modelRabbit = modelRabbit2;
        ModelRabbit modelRabbit2 = vL2;
        ModelRabbit a2 = modelRabbit;
        void g2 = e2 - (float)((vL)h2).g;
        cfa f8 = (cfa)h2;
        ModelRabbit modelRabbit3 = a2;
        ModelRabbit modelRabbit4 = a2;
        modelRabbit4.rabbitRightEar.rotateAngleX = modelRabbit4.rabbitLeftEar.rotateAngleX = c2 * Bua.ga;
        modelRabbit3.rabbitHead.rotateAngleX = modelRabbit4.rabbitLeftEar.rotateAngleX;
        modelRabbit3.rabbitNose.rotateAngleX = modelRabbit4.rabbitLeftEar.rotateAngleX;
        ModelRabbit modelRabbit5 = a2;
        modelRabbit5.rabbitNose.rotateAngleY = modelRabbit5.rabbitHead.rotateAngleY = d2 * Bua.ga;
        ModelRabbit modelRabbit6 = a2;
        a2.rabbitRightEar.rotateAngleY = a2.rabbitNose.rotateAngleY - DPa.s;
        modelRabbit6.rabbitLeftEar.rotateAngleY = a2.rabbitNose.rotateAngleY + DPa.s;
        modelRabbit6.field_178701_m = Oz.d((float)(f8.l((float)g2) * pua.j));
        modelRabbit6.rabbitLeftThigh.rotateAngleX = a2.rabbitRightThigh.rotateAngleX = (a2.field_178701_m * SPa.b - POa.Aa) * Bua.ga;
        ModelRabbit modelRabbit7 = a2;
        modelRabbit7.rabbitLeftFoot.rotateAngleX = modelRabbit7.rabbitRightFoot.rotateAngleX = a2.field_178701_m * SPa.b * Bua.ga;
        ModelRabbit modelRabbit8 = a2;
        modelRabbit8.rabbitLeftArm.rotateAngleX = modelRabbit8.rabbitRightArm.rotateAngleX = (a2.field_178701_m * Qta.S - AQa.W) * Bua.ga;
    }

    public ModelRabbit() {
        ModelRabbit a2;
        ModelRabbit modelRabbit = a2;
        modelRabbit.field_178701_m = JPa.N;
        modelRabbit.field_178699_n = JPa.N;
        modelRabbit.J(APa.Y, uSa.E, uSa.E);
        modelRabbit.J(PQa.h, uSa.E, osa.c);
        modelRabbit.J(yOa.O, uSa.E, NTa.C);
        modelRabbit.J(Wsa.R, uua.p, NTa.C);
        ModelRabbit modelRabbit2 = a2;
        modelRabbit.rabbitLeftFoot = new cT((ModelBase)a2, ITa.E, osa.c);
        modelRabbit.rabbitLeftFoot.J(vqa.T, SRa.V, vQa.w, uqa.g, vRa.d, XTa.W);
        ModelRabbit modelRabbit3 = a2;
        modelRabbit3.rabbitLeftFoot.J(vQa.q, Qqa.R, Era.Ga);
        modelRabbit3.rabbitLeftFoot.mirror = vRa.d;
        modelRabbit3.J(modelRabbit3.rabbitLeftFoot, JPa.N, JPa.N, JPa.N);
        modelRabbit3.rabbitRightFoot = new cT((ModelBase)a2, Yqa.i, osa.c);
        modelRabbit3.rabbitRightFoot.J(vqa.T, SRa.V, vQa.w, uqa.g, vRa.d, XTa.W);
        ModelRabbit modelRabbit4 = a2;
        modelRabbit4.rabbitRightFoot.J(TOa.p, Qqa.R, Era.Ga);
        modelRabbit4.rabbitRightFoot.mirror = vRa.d;
        modelRabbit4.J(modelRabbit4.rabbitRightFoot, JPa.N, JPa.N, JPa.N);
        modelRabbit4.rabbitLeftThigh = new cT((ModelBase)a2, Fsa.d, Ypa.A);
        modelRabbit4.rabbitLeftThigh.J(vqa.T, JPa.N, JPa.N, uqa.g, AQa.P, tTa.h);
        ModelRabbit modelRabbit5 = a2;
        modelRabbit5.rabbitLeftThigh.J(vQa.q, Qqa.R, Era.Ga);
        modelRabbit5.rabbitLeftThigh.mirror = vRa.d;
        modelRabbit5.J(modelRabbit5.rabbitLeftThigh, TQa.K, JPa.N, JPa.N);
        modelRabbit5.rabbitRightThigh = new cT((ModelBase)a2, ERa.C, Ypa.A);
        modelRabbit5.rabbitRightThigh.J(vqa.T, JPa.N, JPa.N, uqa.g, AQa.P, tTa.h);
        ModelRabbit modelRabbit6 = a2;
        modelRabbit6.rabbitRightThigh.J(TOa.p, Qqa.R, Era.Ga);
        modelRabbit6.rabbitRightThigh.mirror = vRa.d;
        modelRabbit6.J(modelRabbit6.rabbitRightThigh, TQa.K, JPa.N, JPa.N);
        modelRabbit6.rabbitBody = new cT((ModelBase)a2, uSa.E, uSa.E);
        modelRabbit6.rabbitBody.J(TOa.p, dua.ca, Cra.fa, uua.p, tTa.h, NTa.C);
        ModelRabbit modelRabbit7 = a2;
        modelRabbit7.rabbitBody.J(JPa.N, LPa.v, Qsa.k);
        modelRabbit7.rabbitBody.mirror = vRa.d;
        modelRabbit7.J(modelRabbit7.rabbitBody, TQa.K, JPa.N, JPa.N);
        modelRabbit7.rabbitLeftArm = new cT((ModelBase)a2, Yqa.i, Ypa.A);
        modelRabbit7.rabbitLeftArm.J(vqa.T, JPa.N, vqa.T, uqa.g, XTa.W, uqa.g);
        ModelRabbit modelRabbit8 = a2;
        modelRabbit8.rabbitLeftArm.J(vQa.q, gQa.ca, vqa.T);
        modelRabbit8.rabbitLeftArm.mirror = vRa.d;
        modelRabbit8.J(modelRabbit8.rabbitLeftArm, kra.aa, JPa.N, JPa.N);
        modelRabbit8.rabbitRightArm = new cT((ModelBase)a2, uSa.E, Ypa.A);
        modelRabbit8.rabbitRightArm.J(vqa.T, JPa.N, vqa.T, uqa.g, XTa.W, uqa.g);
        ModelRabbit modelRabbit9 = a2;
        modelRabbit9.rabbitRightArm.J(TOa.p, gQa.ca, vqa.T);
        modelRabbit9.rabbitRightArm.mirror = vRa.d;
        modelRabbit9.J(modelRabbit9.rabbitRightArm, kra.aa, JPa.N, JPa.N);
        modelRabbit9.rabbitHead = new cT((ModelBase)a2, fPa.i, uSa.E);
        modelRabbit9.rabbitHead.J(Ppa.Ha, NQa.m, CRa.M, tTa.h, AQa.P, tTa.h);
        ModelRabbit modelRabbit10 = a2;
        modelRabbit10.rabbitHead.J(JPa.N, Yra.i, vqa.T);
        modelRabbit10.rabbitHead.mirror = vRa.d;
        modelRabbit10.J(modelRabbit10.rabbitHead, JPa.N, JPa.N, JPa.N);
        modelRabbit10.rabbitRightEar = new cT((ModelBase)a2, FPa.F, uSa.E);
        modelRabbit10.rabbitRightEar.J(Ppa.Ha, Lqa.C, vqa.T, uqa.g, tTa.h, vRa.d);
        ModelRabbit modelRabbit11 = a2;
        modelRabbit11.rabbitRightEar.J(JPa.N, Yra.i, vqa.T);
        modelRabbit11.rabbitRightEar.mirror = vRa.d;
        modelRabbit11.J(modelRabbit11.rabbitRightEar, JPa.N, vTa.K, JPa.N);
        modelRabbit11.rabbitLeftEar = new cT((ModelBase)a2, lQa.R, uSa.E);
        modelRabbit11.rabbitLeftEar.J(MQa.L, Lqa.C, vqa.T, uqa.g, tTa.h, vRa.d);
        ModelRabbit modelRabbit12 = a2;
        modelRabbit12.rabbitLeftEar.J(JPa.N, Yra.i, vqa.T);
        modelRabbit12.rabbitLeftEar.mirror = vRa.d;
        modelRabbit12.J(modelRabbit12.rabbitLeftEar, JPa.N, DPa.s, JPa.N);
        modelRabbit12.rabbitTail = new cT((ModelBase)a2, FPa.F, uua.p);
        modelRabbit12.rabbitTail.J(FRa.ca, FRa.ca, JPa.N, yRa.d, yRa.d, uqa.g);
        ModelRabbit modelRabbit13 = a2;
        modelRabbit13.rabbitTail.J(JPa.N, eta.e, BRa.k);
        modelRabbit13.rabbitTail.mirror = vRa.d;
        modelRabbit13.J(modelRabbit13.rabbitTail, lPa.q, JPa.N, JPa.N);
        modelRabbit13.rabbitNose = new cT((ModelBase)a2, fPa.i, WOa.fa);
        modelRabbit13.rabbitNose.J(vPa.b, Ppa.Ha, KSa.Y, vRa.d, vRa.d, vRa.d);
        ModelRabbit modelRabbit14 = a2;
        modelRabbit14.rabbitNose.J(JPa.N, Yra.i, vqa.T);
        modelRabbit14.rabbitNose.mirror = vRa.d;
        modelRabbit14.J(modelRabbit14.rabbitNose, JPa.N, JPa.N, JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g22;
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelRabbit a2;
        float f9 = f7;
        ModelRabbit modelRabbit = a2 = this;
        modelRabbit.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g22);
        if (modelRabbit.isChild) {
            float g22 = kta.v;
            uKa.e();
            uKa.J((float)JPa.N, (float)(eua.C * h2), (float)(kta.v * h2));
            ModelRabbit modelRabbit2 = a2;
            modelRabbit2.rabbitHead.C((float)h2);
            modelRabbit2.rabbitLeftEar.C((float)h2);
            modelRabbit2.rabbitRightEar.C((float)h2);
            modelRabbit2.rabbitNose.C((float)h2);
            uKa.D();
            uKa.e();
            uKa.l((float)(pqa.r / g22), (float)(pqa.r / g22), (float)(pqa.r / g22));
            uKa.J((float)JPa.N, (float)(KSa.I * h2), (float)JPa.N);
            modelRabbit2.rabbitLeftFoot.C((float)h2);
            modelRabbit2.rabbitRightFoot.C((float)h2);
            modelRabbit2.rabbitLeftThigh.C((float)h2);
            modelRabbit2.rabbitRightThigh.C((float)h2);
            modelRabbit2.rabbitBody.C((float)h2);
            modelRabbit2.rabbitLeftArm.C((float)h2);
            modelRabbit2.rabbitRightArm.C((float)h2);
            modelRabbit2.rabbitTail.C((float)h2);
            uKa.D();
            return;
        }
        ModelRabbit modelRabbit3 = a2;
        modelRabbit3.rabbitLeftFoot.C((float)h2);
        modelRabbit3.rabbitRightFoot.C((float)h2);
        modelRabbit3.rabbitLeftThigh.C((float)h2);
        modelRabbit3.rabbitRightThigh.C((float)h2);
        modelRabbit3.rabbitBody.C((float)h2);
        modelRabbit3.rabbitLeftArm.C((float)h2);
        modelRabbit3.rabbitRightArm.C((float)h2);
        modelRabbit3.rabbitHead.C((float)h2);
        modelRabbit3.rabbitRightEar.C((float)h2);
        modelRabbit3.rabbitLeftEar.C((float)h2);
        modelRabbit3.rabbitTail.C((float)h2);
        modelRabbit3.rabbitNose.C((float)h2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(cT cT2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        ModelRabbit e2 = cT2;
        ModelRabbit d2 = this;
        ModelRabbit modelRabbit = e2;
        ((cT)e2).rotateAngleX = c2;
        ((cT)modelRabbit).rotateAngleY = b2;
        ((cT)modelRabbit).rotateAngleZ = a2;
    }
}

