/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  ERa
 *  JPa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  YSa
 *  cT
 *  kPa
 *  lqa
 *  pqa
 *  pua
 *  vL
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelSnowMan
extends ModelBase {
    public cT bottomBody;
    public cT leftHand;
    public cT rightHand;
    public cT body;
    public cT head;

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
        ModelSnowMan a2;
        float f9 = f7;
        ModelSnowMan modelSnowMan = a2 = this;
        modelSnowMan.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelSnowMan.body.C((float)h2);
        modelSnowMan.bottomBody.C((float)h2);
        modelSnowMan.head.C((float)h2);
        modelSnowMan.rightHand.C((float)h2);
        modelSnowMan.leftHand.C((float)h2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        float g2;
        ModelSnowMan f8;
        float h2 = f3;
        ModelSnowMan modelSnowMan = f8 = this;
        super.J(g2, h2, (float)e2, (float)d2, (float)c2, (float)b2, (vL)a2);
        modelSnowMan.head.rotateAngleY = d2 / zpa.Z;
        modelSnowMan.head.rotateAngleX = c2 / zpa.Z;
        modelSnowMan.body.rotateAngleY = d2 / zpa.Z * rta.o;
        g2 = Oz.d((float)modelSnowMan.body.rotateAngleY);
        h2 = Oz.C((float)modelSnowMan.body.rotateAngleY);
        modelSnowMan.rightHand.rotateAngleZ = pqa.r;
        modelSnowMan.leftHand.rotateAngleZ = vqa.T;
        modelSnowMan.rightHand.rotateAngleY = JPa.N + f8.body.rotateAngleY;
        modelSnowMan.leftHand.rotateAngleY = pua.j + f8.body.rotateAngleY;
        modelSnowMan.rightHand.rotationPointX = h2 * eua.C;
        modelSnowMan.rightHand.rotationPointZ = -g2 * eua.C;
        modelSnowMan.leftHand.rotationPointX = -h2 * eua.C;
        modelSnowMan.leftHand.rotationPointZ = g2 * eua.C;
    }

    public ModelSnowMan() {
        ModelSnowMan modelSnowMan;
        ModelSnowMan modelSnowMan2 = modelSnowMan = this;
        float f2 = YSa.G;
        float a2 = JPa.N;
        modelSnowMan2.head = new cT((ModelBase)modelSnowMan, uSa.E, uSa.E).J(ysa.s, ysa.s);
        modelSnowMan.head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, a2 - MQa.L);
        modelSnowMan2.head.J(JPa.N, JPa.N + f2, JPa.N);
        modelSnowMan2.rightHand = new cT((ModelBase)modelSnowMan, fPa.i, uSa.E).J(ysa.s, ysa.s);
        modelSnowMan2.rightHand.J(vqa.T, JPa.N, vqa.T, lqa.s, uqa.g, uqa.g, a2 - MQa.L);
        modelSnowMan2.rightHand.J(JPa.N, JPa.N + f2 + kPa.S - BRa.k, JPa.N);
        modelSnowMan2.leftHand = new cT((ModelBase)modelSnowMan, fPa.i, uSa.E).J(ysa.s, ysa.s);
        modelSnowMan2.leftHand.J(vqa.T, JPa.N, vqa.T, lqa.s, uqa.g, uqa.g, a2 - MQa.L);
        modelSnowMan2.leftHand.J(JPa.N, JPa.N + f2 + kPa.S - BRa.k, JPa.N);
        modelSnowMan2.body = new cT((ModelBase)modelSnowMan, uSa.E, ERa.C).J(ysa.s, ysa.s);
        modelSnowMan2.body.J(CRa.M, Cra.fa, CRa.M, NTa.C, NTa.C, NTa.C, a2 - MQa.L);
        modelSnowMan2.body.J(JPa.N, JPa.N + f2 + kPa.S, JPa.N);
        modelSnowMan2.bottomBody = new cT((ModelBase)modelSnowMan, uSa.E, Qsa.Ha).J(ysa.s, ysa.s);
        modelSnowMan2.bottomBody.J(NSa.b, csa.P, NSa.b, lqa.s, lqa.s, lqa.s, a2 - MQa.L);
        modelSnowMan2.bottomBody.J(JPa.N, JPa.N + f2 + eta.e, JPa.N);
    }
}

