/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  ERa
 *  Gl
 *  JPa
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  QSa
 *  Qsa
 *  XTa
 *  Yra
 *  cT
 *  hqa
 *  jpa
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  uKa
 *  vL
 *  vRa
 *  wOa
 *  xfa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelWolf
extends ModelBase {
    public cT wolfHeadMain;
    public cT wolfTail;
    public cT wolfLeg4;
    public cT wolfBody;
    public cT wolfMane;
    public cT wolfLeg3;
    public cT wolfLeg2;
    public cT wolfLeg1;

    public ModelWolf() {
        ModelWolf modelWolf;
        ModelWolf modelWolf2 = modelWolf = this;
        float a2 = JPa.N;
        float f2 = Hra.g;
        modelWolf2.wolfHeadMain = new cT((ModelBase)modelWolf, uSa.E, uSa.E);
        modelWolf.wolfHeadMain.J(TOa.p, TOa.p, dua.ca, uua.p, uua.p, AQa.P, a2);
        modelWolf2.wolfHeadMain.J(vqa.T, f2, NQa.d);
        modelWolf2.wolfBody = new cT((ModelBase)modelWolf, yOa.B, hpa.Z);
        modelWolf2.wolfBody.J(NQa.m, dua.ca, TOa.p, uua.p, WOa.fa, uua.p, a2);
        modelWolf2.wolfBody.J(JPa.N, bsa.la, kta.v);
        modelWolf2.wolfMane = new cT((ModelBase)modelWolf, wOa.h, uSa.E);
        modelWolf2.wolfMane.J(NQa.m, TOa.p, TOa.p, Yqa.i, uua.p, XTa.W, a2);
        modelWolf2.wolfMane.J(vqa.T, bsa.la, kta.v);
        modelWolf2.wolfLeg1 = new cT((ModelBase)modelWolf, uSa.E, yOa.B);
        modelWolf2.wolfLeg1.J(vqa.T, JPa.N, vqa.T, uqa.g, Yqa.i, uqa.g, a2);
        modelWolf2.wolfLeg1.J(Ppa.Ha, Yra.i, BRa.k);
        modelWolf2.wolfLeg2 = new cT((ModelBase)modelWolf, uSa.E, yOa.B);
        modelWolf2.wolfLeg2.J(vqa.T, JPa.N, vqa.T, uqa.g, Yqa.i, uqa.g, a2);
        modelWolf2.wolfLeg2.J(MQa.L, Yra.i, BRa.k);
        modelWolf2.wolfLeg3 = new cT((ModelBase)modelWolf, uSa.E, yOa.B);
        modelWolf2.wolfLeg3.J(vqa.T, JPa.N, vqa.T, uqa.g, Yqa.i, uqa.g, a2);
        modelWolf2.wolfLeg3.J(Ppa.Ha, Yra.i, NQa.m);
        modelWolf2.wolfLeg4 = new cT((ModelBase)modelWolf, uSa.E, yOa.B);
        modelWolf2.wolfLeg4.J(vqa.T, JPa.N, vqa.T, uqa.g, Yqa.i, uqa.g, a2);
        modelWolf2.wolfLeg4.J(MQa.L, Yra.i, NQa.m);
        modelWolf2.wolfTail = new cT((ModelBase)modelWolf, WOa.fa, yOa.B);
        modelWolf2.wolfTail.J(vqa.T, JPa.N, vqa.T, uqa.g, Yqa.i, uqa.g, a2);
        modelWolf2.wolfTail.J(vqa.T, Fua.Y, Qsa.k);
        modelWolf2.wolfHeadMain.f(ERa.C, hpa.Z).J(TOa.p, CRa.M, JPa.N, uqa.g, uqa.g, vRa.d, a2);
        modelWolf2.wolfHeadMain.f(ERa.C, hpa.Z).J(pqa.r, CRa.M, JPa.N, uqa.g, uqa.g, vRa.d, a2);
        modelWolf2.wolfHeadMain.f(uSa.E, NTa.C).J(FRa.ca, JPa.N, CRa.M, yRa.d, yRa.d, AQa.P, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void a2;
        void b2;
        void h;
        void d2;
        void e2;
        void f8;
        void g2;
        float f9 = f6;
        ModelWolf c2 = this;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)h, (float)b2, (vL)a2);
        c2.wolfHeadMain.rotateAngleX = h / zpa.Z;
        c2.wolfHeadMain.rotateAngleY = d2 / zpa.Z;
        c2.wolfTail.rotateAngleX = e2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        void a2;
        ModelWolf modelWolf;
        void b2;
        void c2;
        ModelWolf modelWolf2;
        ModelWolf e2 = gl2;
        ModelWolf d2 = this;
        if ((e2 = (xfa)e2).Fa()) {
            modelWolf2 = e2;
            d2.wolfTail.rotateAngleY = JPa.N;
        } else {
            d2.wolfTail.rotateAngleY = Oz.C((float)(c2 * Zra.u)) * NPa.B * b2;
            modelWolf2 = e2;
        }
        if (modelWolf2.v()) {
            ModelWolf modelWolf3 = d2;
            modelWolf = modelWolf3;
            modelWolf3.wolfMane.J(vqa.T, Yra.i, TOa.p);
            modelWolf3.wolfMane.rotateAngleX = Upa.ga;
            modelWolf3.wolfMane.rotateAngleY = JPa.N;
            modelWolf3.wolfBody.J(JPa.N, vqa.A, JPa.N);
            modelWolf3.wolfBody.rotateAngleX = Jra.Z;
            modelWolf3.wolfTail.J(vqa.T, POa.Aa, lqa.ga);
            modelWolf3.wolfLeg1.J(Ppa.Ha, Tqa.V, kta.v);
            modelWolf3.wolfLeg1.rotateAngleX = hqa.Y;
            modelWolf3.wolfLeg2.J(MQa.L, Tqa.V, kta.v);
            modelWolf3.wolfLeg2.rotateAngleX = hqa.Y;
            modelWolf3.wolfLeg3.rotateAngleX = lTa.b;
            modelWolf3.wolfLeg3.J(QSa.ha, gQa.ca, NQa.m);
            modelWolf3.wolfLeg4.rotateAngleX = lTa.b;
            modelWolf3.wolfLeg4.J(Hta.F, gQa.ca, NQa.m);
        } else {
            ModelWolf modelWolf4 = d2;
            modelWolf = modelWolf4;
            modelWolf4.wolfBody.J(JPa.N, bsa.la, kta.v);
            modelWolf4.wolfBody.rotateAngleX = jpa.f;
            modelWolf4.wolfMane.J(vqa.T, bsa.la, TOa.p);
            modelWolf4.wolfMane.rotateAngleX = d2.wolfBody.rotateAngleX;
            modelWolf4.wolfTail.J(vqa.T, Fua.Y, Qsa.k);
            modelWolf4.wolfLeg1.J(Ppa.Ha, Yra.i, BRa.k);
            modelWolf4.wolfLeg2.J(MQa.L, Yra.i, BRa.k);
            modelWolf4.wolfLeg3.J(Ppa.Ha, Yra.i, NQa.m);
            modelWolf4.wolfLeg4.J(MQa.L, Yra.i, NQa.m);
            modelWolf4.wolfLeg1.rotateAngleX = Oz.C((float)(c2 * Zra.u)) * NPa.B * b2;
            modelWolf4.wolfLeg2.rotateAngleX = Oz.C((float)(c2 * Zra.u + pua.j)) * NPa.B * b2;
            modelWolf4.wolfLeg3.rotateAngleX = Oz.C((float)(c2 * Zra.u + pua.j)) * NPa.B * b2;
            modelWolf4.wolfLeg4.rotateAngleX = Oz.C((float)(c2 * Zra.u)) * NPa.B * b2;
        }
        modelWolf.wolfHeadMain.rotateAngleZ = e2.l((float)a2) + e2.f((float)a2, JPa.N);
        ModelWolf modelWolf5 = d2;
        modelWolf5.wolfMane.rotateAngleZ = e2.f((float)a2, Bua.b);
        modelWolf5.wolfBody.rotateAngleZ = e2.f((float)a2, Hra.h);
        modelWolf5.wolfTail.rotateAngleZ = e2.f((float)a2, ATa.x);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g22;
        ModelWolf a2;
        float f9 = f7;
        ModelWolf modelWolf = a2 = this;
        super.J((vL)g22, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h);
        modelWolf.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h, (vL)g22);
        if (modelWolf.isChild) {
            float g22 = kta.v;
            uKa.e();
            uKa.J((float)JPa.N, (float)(eua.C * h), (float)(kta.v * h));
            ModelWolf modelWolf2 = a2;
            modelWolf2.wolfHeadMain.J((float)h);
            uKa.D();
            uKa.e();
            uKa.l((float)(pqa.r / g22), (float)(pqa.r / g22), (float)(pqa.r / g22));
            uKa.J((float)JPa.N, (float)(KSa.I * h), (float)JPa.N);
            modelWolf2.wolfBody.C((float)h);
            modelWolf2.wolfLeg1.C((float)h);
            modelWolf2.wolfLeg2.C((float)h);
            modelWolf2.wolfLeg3.C((float)h);
            modelWolf2.wolfLeg4.C((float)h);
            modelWolf2.wolfTail.J((float)h);
            modelWolf2.wolfMane.C((float)h);
            uKa.D();
            return;
        }
        ModelWolf modelWolf3 = a2;
        modelWolf3.wolfHeadMain.J((float)h);
        modelWolf3.wolfBody.C((float)h);
        modelWolf3.wolfLeg1.C((float)h);
        modelWolf3.wolfLeg2.C((float)h);
        modelWolf3.wolfLeg3.C((float)h);
        modelWolf3.wolfLeg4.C((float)h);
        modelWolf3.wolfTail.J((float)h);
        modelWolf3.wolfMane.C((float)h);
    }
}

