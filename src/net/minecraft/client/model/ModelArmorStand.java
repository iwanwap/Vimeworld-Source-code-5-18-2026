/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NQa
 *  Oea
 *  QSa
 *  XTa
 *  Zua
 *  cT
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vL
 *  vQa
 *  vRa
 *  wra
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelArmorStandArmor;
import net.minecraft.client.model.ModelBase;

public final class ModelArmorStand
extends ModelArmorStandArmor {
    public cT standBase;
    public cT standLeftSide;
    public cT standRightSide;
    public cT standWaist;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2) {
        void a2;
        ModelArmorStand modelArmorStand;
        ModelArmorStand modelArmorStand2 = modelArmorStand = this;
        boolean b2 = modelArmorStand2.bipedRightArm.showModel;
        modelArmorStand2.bipedRightArm.showModel = vRa.d;
        super.J((float)a2);
        modelArmorStand2.bipedRightArm.showModel = b2;
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
        void f8;
        float h22 = f2;
        ModelArmorStand g2 = this;
        super.J(h22, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)a2);
        if (a2 instanceof Oea) {
            Oea h22 = (Oea)a2;
            g2.bipedLeftArm.showModel = h22.w();
            g2.bipedRightArm.showModel = h22.w();
            g2.standBase.showModel = !h22.x() ? vRa.d : uSa.E;
            ModelArmorStand modelArmorStand = g2;
            Oea oea2 = h22;
            ModelArmorStand modelArmorStand2 = g2;
            ModelArmorStand modelArmorStand3 = g2;
            modelArmorStand3.bipedLeftLeg.J(Zua.D, Fua.Y, JPa.N);
            modelArmorStand3.bipedRightLeg.J(AQa.d, Fua.Y, JPa.N);
            modelArmorStand3.standRightSide.rotateAngleX = Bua.ga * h22.e().l();
            modelArmorStand3.standRightSide.rotateAngleY = Bua.ga * h22.e().J();
            modelArmorStand3.standRightSide.rotateAngleZ = Bua.ga * h22.e().f();
            modelArmorStand3.standLeftSide.rotateAngleX = Bua.ga * h22.e().l();
            modelArmorStand3.standLeftSide.rotateAngleY = Bua.ga * h22.e().J();
            modelArmorStand3.standLeftSide.rotateAngleZ = Bua.ga * h22.e().f();
            modelArmorStand3.standWaist.rotateAngleX = Bua.ga * h22.e().l();
            modelArmorStand3.standWaist.rotateAngleY = Bua.ga * h22.e().J();
            modelArmorStand2.standWaist.rotateAngleZ = Bua.ga * h22.e().f();
            float cfr_ignored_0 = (h22.C().l() + h22.f().l()) / kta.v;
            float cfr_ignored_1 = (oea2.C().J() + h22.f().J()) / kta.v;
            float cfr_ignored_2 = (oea2.C().f() + h22.f().f()) / kta.v;
            modelArmorStand2.standBase.rotateAngleX = JPa.N;
            modelArmorStand.standBase.rotateAngleY = Bua.ga * -a2.X;
            modelArmorStand.standBase.rotateAngleZ = JPa.N;
        }
    }

    public ModelArmorStand() {
        a2(JPa.N);
        ModelArmorStand a2;
    }

    public ModelArmorStand(float f2) {
        ModelArmorStand a2;
        float b2 = f2;
        ModelArmorStand modelArmorStand = a2 = this;
        super(b2, ysa.s, ysa.s);
        modelArmorStand.bipedHead = new cT((ModelBase)a2, uSa.E, uSa.E);
        a2.bipedHead.J(vqa.T, NQa.d, vqa.T, uqa.g, XTa.W, uqa.g, b2);
        modelArmorStand.bipedHead.J(JPa.N, JPa.N, JPa.N);
        modelArmorStand.bipedBody = new cT((ModelBase)a2, uSa.E, ITa.E);
        modelArmorStand.bipedBody.J(NSa.b, JPa.N, FRa.ca, lqa.s, yRa.d, yRa.d, b2);
        modelArmorStand.bipedBody.J(JPa.N, JPa.N, JPa.N);
        modelArmorStand.bipedRightArm = new cT((ModelBase)a2, osa.c, uSa.E);
        modelArmorStand.bipedRightArm.J(dua.ca, dua.ca, vqa.T, uqa.g, lqa.s, uqa.g, b2);
        modelArmorStand.bipedRightArm.J(CRa.M, kta.v, JPa.N);
        modelArmorStand.bipedLeftArm = new cT((ModelBase)a2, fPa.i, ERa.C);
        modelArmorStand.bipedLeftArm.mirror = vRa.d;
        modelArmorStand.bipedLeftArm.J(JPa.N, dua.ca, vqa.T, uqa.g, lqa.s, uqa.g, b2);
        modelArmorStand.bipedLeftArm.J(eua.C, kta.v, JPa.N);
        modelArmorStand.bipedRightLeg = new cT((ModelBase)a2, Yqa.i, uSa.E);
        modelArmorStand.bipedRightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, pPa.f, uqa.g, b2);
        modelArmorStand.bipedRightLeg.J(AQa.d, Fua.Y, JPa.N);
        modelArmorStand.bipedLeftLeg = new cT((ModelBase)a2, wra.P, ERa.C);
        modelArmorStand.bipedLeftLeg.mirror = vRa.d;
        modelArmorStand.bipedLeftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, pPa.f, uqa.g, b2);
        modelArmorStand.bipedLeftLeg.J(Zua.D, Fua.Y, JPa.N);
        modelArmorStand.standRightSide = new cT((ModelBase)a2, ERa.C, uSa.E);
        modelArmorStand.standRightSide.J(TOa.p, vQa.q, vqa.T, uqa.g, XTa.W, uqa.g, b2);
        modelArmorStand.standRightSide.J(JPa.N, JPa.N, JPa.N);
        modelArmorStand.standRightSide.showModel = vRa.d;
        modelArmorStand.standLeftSide = new cT((ModelBase)a2, QSa.p, ERa.C);
        modelArmorStand.standLeftSide.J(pqa.r, vQa.q, vqa.T, uqa.g, XTa.W, uqa.g, b2);
        modelArmorStand.standLeftSide.J(JPa.N, JPa.N, JPa.N);
        modelArmorStand.standWaist = new cT((ModelBase)a2, uSa.E, QSa.p);
        modelArmorStand.standWaist.J(NQa.m, FRa.Ga, vqa.T, Yqa.i, uqa.g, uqa.g, b2);
        modelArmorStand.standWaist.J(JPa.N, JPa.N, JPa.N);
        modelArmorStand.standBase = new cT((ModelBase)a2, uSa.E, fPa.i);
        modelArmorStand.standBase.J(NSa.b, AQa.W, NSa.b, lqa.s, vRa.d, lqa.s, b2);
        modelArmorStand.standBase.J(JPa.N, Fua.Y, JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        float f8;
        void g2;
        ModelArmorStand a2;
        float f9 = f7;
        ModelArmorStand modelArmorStand = a2 = this;
        super.J((vL)g2, f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2);
        uKa.e();
        if (modelArmorStand.isChild) {
            f8 = kta.v;
            uKa.l((float)(pqa.r / f8), (float)(pqa.r / f8), (float)(pqa.r / f8));
            uKa.J((float)JPa.N, (float)(KSa.I * h2), (float)JPa.N);
            ModelArmorStand modelArmorStand2 = a2;
            modelArmorStand2.standRightSide.C((float)h2);
            modelArmorStand2.standLeftSide.C((float)h2);
            modelArmorStand2.standWaist.C((float)h2);
            modelArmorStand2.standBase.C((float)h2);
        } else {
            if (g2.q()) {
                uKa.J((float)JPa.N, (float)psa.N, (float)JPa.N);
            }
            ModelArmorStand modelArmorStand3 = a2;
            modelArmorStand3.standRightSide.C((float)h2);
            modelArmorStand3.standLeftSide.C((float)h2);
            modelArmorStand3.standWaist.C((float)h2);
            modelArmorStand3.standBase.C((float)h2);
        }
        uKa.D();
    }
}

