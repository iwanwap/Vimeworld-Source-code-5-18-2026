/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NPa
 *  NQa
 *  Oz
 *  YSa
 *  cT
 *  jpa
 *  kta
 *  pqa
 *  pua
 *  uKa
 *  vL
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelChicken
extends ModelBase {
    public cT head;
    public cT leftLeg;
    public cT leftWing;
    public cT body;
    public cT rightLeg;
    public cT chin;
    public cT rightWing;
    public cT bill;

    public ModelChicken() {
        ModelChicken modelChicken;
        ModelChicken modelChicken2 = modelChicken = this;
        int a2 = ERa.C;
        modelChicken2.head = new cT((ModelBase)modelChicken, uSa.E, uSa.E);
        modelChicken.head.J(dua.ca, NSa.b, dua.ca, AQa.P, uua.p, yRa.d, JPa.N);
        modelChicken2.head.J(JPa.N, (float)(pua.o + a2), NQa.m);
        modelChicken2.bill = new cT((ModelBase)modelChicken, hpa.Z, uSa.E);
        modelChicken2.bill.J(dua.ca, NQa.m, NQa.m, AQa.P, uqa.g, uqa.g, JPa.N);
        modelChicken2.bill.J(JPa.N, (float)(pua.o + a2), NQa.m);
        modelChicken2.chin = new cT((ModelBase)modelChicken, hpa.Z, AQa.P);
        modelChicken2.chin.J(vqa.T, dua.ca, TOa.p, uqa.g, uqa.g, uqa.g, JPa.N);
        modelChicken2.chin.J(JPa.N, (float)(pua.o + a2), NQa.m);
        modelChicken2.body = new cT((ModelBase)modelChicken, uSa.E, WOa.fa);
        modelChicken2.body.J(TOa.p, NQa.m, TOa.p, uua.p, Yqa.i, uua.p, JPa.N);
        modelChicken2.body.J(JPa.N, (float)a2, JPa.N);
        modelChicken2.rightLeg = new cT((ModelBase)modelChicken, ITa.E, uSa.E);
        modelChicken2.rightLeg.J(vqa.T, JPa.N, TOa.p, yRa.d, tTa.h, yRa.d);
        ModelChicken modelChicken3 = modelChicken;
        modelChicken3.rightLeg.J(dua.ca, (float)(yRa.d + a2), pqa.r);
        modelChicken.leftLeg = new cT((ModelBase)modelChicken, ITa.E, uSa.E);
        modelChicken3.leftLeg.J(vqa.T, JPa.N, TOa.p, yRa.d, tTa.h, yRa.d);
        ModelChicken modelChicken4 = modelChicken;
        modelChicken4.leftLeg.J(pqa.r, (float)(yRa.d + a2), pqa.r);
        modelChicken.rightWing = new cT((ModelBase)modelChicken, osa.c, uua.s);
        modelChicken4.rightWing.J(JPa.N, JPa.N, TOa.p, vRa.d, AQa.P, uua.p);
        ModelChicken modelChicken5 = modelChicken;
        modelChicken5.rightWing.J(NQa.m, (float)(ERa.Ka + a2), JPa.N);
        modelChicken.leftWing = new cT((ModelBase)modelChicken, osa.c, uua.s);
        modelChicken5.leftWing.J(vqa.T, JPa.N, TOa.p, vRa.d, AQa.P, uua.p);
        modelChicken.leftWing.J(YSa.G, (float)(ERa.Ka + a2), JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g2;
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelChicken a2;
        float f9 = f7;
        ModelChicken modelChicken = a2 = this;
        modelChicken.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h, (vL)g2);
        if (modelChicken.isChild) {
            float g2 = kta.v;
            uKa.e();
            uKa.J((float)JPa.N, (float)(eua.C * h), (float)(kta.v * h));
            ModelChicken modelChicken2 = a2;
            modelChicken2.head.C((float)h);
            modelChicken2.bill.C((float)h);
            modelChicken2.chin.C((float)h);
            uKa.D();
            uKa.e();
            uKa.l((float)(pqa.r / g2), (float)(pqa.r / g2), (float)(pqa.r / g2));
            uKa.J((float)JPa.N, (float)(KSa.I * h), (float)JPa.N);
            modelChicken2.body.C((float)h);
            modelChicken2.rightLeg.C((float)h);
            modelChicken2.leftLeg.C((float)h);
            modelChicken2.rightWing.C((float)h);
            modelChicken2.leftWing.C((float)h);
            uKa.D();
            return;
        }
        ModelChicken modelChicken3 = a2;
        modelChicken3.head.C((float)h);
        modelChicken3.bill.C((float)h);
        modelChicken3.chin.C((float)h);
        modelChicken3.body.C((float)h);
        modelChicken3.rightLeg.C((float)h);
        modelChicken3.leftLeg.C((float)h);
        modelChicken3.rightWing.C((float)h);
        modelChicken3.leftWing.C((float)h);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void f8;
        void g;
        void d2;
        void c2;
        ModelChicken e2;
        float h = f4;
        ModelChicken modelChicken = e2 = this;
        modelChicken.head.rotateAngleX = c2 / zpa.Z;
        modelChicken.head.rotateAngleY = d2 / zpa.Z;
        modelChicken.bill.rotateAngleX = e2.head.rotateAngleX;
        modelChicken.bill.rotateAngleY = e2.head.rotateAngleY;
        modelChicken.chin.rotateAngleX = e2.head.rotateAngleX;
        modelChicken.chin.rotateAngleY = e2.head.rotateAngleY;
        modelChicken.body.rotateAngleX = jpa.f;
        modelChicken.rightLeg.rotateAngleX = Oz.C((float)(g * Zra.u)) * NPa.B * f8;
        modelChicken.leftLeg.rotateAngleX = Oz.C((float)(g * Zra.u + pua.j)) * NPa.B * f8;
        modelChicken.rightWing.rotateAngleZ = h;
        modelChicken.leftWing.rotateAngleZ = -h;
    }
}

