/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NQa
 *  NTa
 *  QSa
 *  Zua
 *  cT
 *  kta
 *  lqa
 *  pqa
 *  psa
 *  uKa
 *  vL
 *  vRa
 *  wra
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;

public final class ModelPlayer
extends ModelBiped {
    private static final String __OBFID = "CL_00002626";
    public cT bipedBodyWear;
    public cT bipedLeftArmwear;
    private cT bipedDeadmau5Head;
    public cT bipedRightLegwear;
    public cT bipedRightArmwear;
    private boolean smallArms;
    public cT bipedCape;
    public cT bipedLeftLegwear;

    /*
     * WARNING - void declaration
     */
    public ModelPlayer(float f2, boolean bl) {
        ModelPlayer modelPlayer;
        void a2;
        float c2 = f2;
        ModelPlayer b2 = this;
        super(c2, JPa.N, ysa.s, ysa.s);
        b2.smallArms = a2;
        b2.bipedDeadmau5Head = new cT((ModelBase)b2, osa.c, uSa.E);
        b2.bipedDeadmau5Head.J(TOa.p, NSa.b, vqa.T, uua.p, uua.p, vRa.d, c2);
        b2.bipedCape = new cT((ModelBase)b2, uSa.E, uSa.E);
        b2.bipedCape.J(ysa.s, fPa.i);
        b2.bipedCape.J(CRa.M, JPa.N, vqa.T, NTa.C, ERa.C, vRa.d, c2);
        if (a2 != false) {
            ModelPlayer modelPlayer2 = b2;
            modelPlayer = modelPlayer2;
            b2.bipedLeftArm = new cT((ModelBase)b2, fPa.i, QSa.p);
            modelPlayer2.bipedLeftArm.J(vqa.T, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, c2);
            modelPlayer2.bipedLeftArm.J(eua.C, MTa.y, JPa.N);
            modelPlayer2.bipedRightArm = new cT((ModelBase)b2, wra.P, ERa.C);
            modelPlayer2.bipedRightArm.J(dua.ca, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, c2);
            modelPlayer2.bipedRightArm.J(CRa.M, MTa.y, JPa.N);
            modelPlayer2.bipedLeftArmwear = new cT((ModelBase)b2, QSa.p, QSa.p);
            modelPlayer2.bipedLeftArmwear.J(vqa.T, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, c2 + rta.o);
            modelPlayer2.bipedLeftArmwear.J(eua.C, MTa.y, JPa.N);
            modelPlayer2.bipedRightArmwear = new cT((ModelBase)b2, wra.P, fPa.i);
            modelPlayer2.bipedRightArmwear.J(dua.ca, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, c2 + rta.o);
            modelPlayer2.bipedRightArmwear.J(CRa.M, MTa.y, FRa.Ga);
        } else {
            ModelPlayer modelPlayer3 = b2;
            modelPlayer = modelPlayer3;
            b2.bipedLeftArm = new cT((ModelBase)b2, fPa.i, QSa.p);
            modelPlayer3.bipedLeftArm.J(vqa.T, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, c2);
            modelPlayer3.bipedLeftArm.J(eua.C, kta.v, JPa.N);
            modelPlayer3.bipedLeftArmwear = new cT((ModelBase)b2, QSa.p, QSa.p);
            modelPlayer3.bipedLeftArmwear.J(vqa.T, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, c2 + rta.o);
            modelPlayer3.bipedLeftArmwear.J(eua.C, kta.v, JPa.N);
            modelPlayer3.bipedRightArmwear = new cT((ModelBase)b2, wra.P, fPa.i);
            modelPlayer3.bipedRightArmwear.J(TOa.p, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, c2 + rta.o);
            modelPlayer3.bipedRightArmwear.J(CRa.M, kta.v, FRa.Ga);
        }
        modelPlayer.bipedLeftLeg = new cT((ModelBase)b2, ERa.C, QSa.p);
        ModelPlayer modelPlayer4 = b2;
        modelPlayer4.bipedLeftLeg.J(dua.ca, JPa.N, dua.ca, AQa.P, lqa.s, AQa.P, c2);
        modelPlayer4.bipedLeftLeg.J(Zua.D, Fua.Y, JPa.N);
        b2.bipedLeftLegwear = new cT((ModelBase)b2, uSa.E, QSa.p);
        modelPlayer4.bipedLeftLegwear.J(dua.ca, JPa.N, dua.ca, AQa.P, lqa.s, AQa.P, c2 + rta.o);
        modelPlayer4.bipedLeftLegwear.J(Zua.D, Fua.Y, JPa.N);
        modelPlayer4.bipedRightLegwear = new cT((ModelBase)b2, uSa.E, fPa.i);
        modelPlayer4.bipedRightLegwear.J(dua.ca, JPa.N, dua.ca, AQa.P, lqa.s, AQa.P, c2 + rta.o);
        modelPlayer4.bipedRightLegwear.J(AQa.d, Fua.Y, JPa.N);
        modelPlayer4.bipedBodyWear = new cT((ModelBase)b2, ERa.C, fPa.i);
        modelPlayer4.bipedBodyWear.J(NQa.m, JPa.N, dua.ca, Yqa.i, lqa.s, AQa.P, c2 + rta.o);
        modelPlayer4.bipedBodyWear.J(JPa.N, JPa.N, JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        ModelPlayer h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g2;
        ModelPlayer a2;
        ModelPlayer modelPlayer = modelPlayer2;
        ModelPlayer modelPlayer2 = vL2;
        ModelPlayer modelPlayer3 = a2 = modelPlayer;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)h2);
        ModelPlayer modelPlayer4 = a2;
        ModelPlayer.J(modelPlayer3.bipedLeftLeg, modelPlayer4.bipedLeftLegwear);
        ModelPlayer.J(modelPlayer4.bipedRightLeg, a2.bipedRightLegwear);
        ModelPlayer.J(modelPlayer3.bipedLeftArm, a2.bipedLeftArmwear);
        ModelPlayer.J(modelPlayer3.bipedRightArm, a2.bipedRightArmwear);
        ModelPlayer.J(modelPlayer3.bipedBody, a2.bipedBodyWear);
    }

    @Override
    public void J(boolean bl) {
        boolean b2 = bl;
        ModelPlayer a2 = this;
        super.J(b2);
        a2.bipedLeftArmwear.showModel = b2;
        a2.bipedRightArmwear.showModel = b2;
        a2.bipedLeftLegwear.showModel = b2;
        a2.bipedRightLegwear.showModel = b2;
        a2.bipedBodyWear.showModel = b2;
        a2.bipedCape.showModel = b2;
        a2.bipedDeadmau5Head.showModel = b2;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        ModelPlayer a2 = this;
        if (a2.smallArms) {
            ModelPlayer modelPlayer = a2;
            modelPlayer.bipedRightArm.rotationPointX += pqa.r;
            modelPlayer.bipedRightArm.l(b2);
            modelPlayer.bipedRightArm.rotationPointX -= pqa.r;
            return;
        }
        a2.bipedRightArm.l(b2);
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
        ModelPlayer a2;
        float f9 = f7;
        ModelPlayer modelPlayer = a2 = this;
        super.J((vL)g2, f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2);
        uKa.e();
        if (modelPlayer.isChild) {
            f8 = kta.v;
            uKa.l((float)(pqa.r / f8), (float)(pqa.r / f8), (float)(pqa.r / f8));
            uKa.J((float)JPa.N, (float)(KSa.I * h2), (float)JPa.N);
            ModelPlayer modelPlayer2 = a2;
            modelPlayer2.bipedLeftLegwear.C((float)h2);
            modelPlayer2.bipedRightLegwear.C((float)h2);
            modelPlayer2.bipedLeftArmwear.C((float)h2);
            modelPlayer2.bipedRightArmwear.C((float)h2);
            modelPlayer2.bipedBodyWear.C((float)h2);
        } else {
            if (g2.q()) {
                uKa.J((float)JPa.N, (float)psa.N, (float)JPa.N);
            }
            ModelPlayer modelPlayer3 = a2;
            modelPlayer3.bipedLeftLegwear.C((float)h2);
            modelPlayer3.bipedRightLegwear.C((float)h2);
            modelPlayer3.bipedLeftArmwear.C((float)h2);
            modelPlayer3.bipedRightArmwear.C((float)h2);
            modelPlayer3.bipedBodyWear.C((float)h2);
        }
        uKa.D();
    }

    public void l(float f2) {
        float b2 = f2;
        ModelPlayer a2 = this;
        a2.bipedCape.C(b2);
    }

    public void f(float f2) {
        ModelPlayer a2;
        float b2 = f2;
        ModelPlayer modelPlayer = a2 = this;
        ModelPlayer.J(modelPlayer.bipedHead, a2.bipedDeadmau5Head);
        modelPlayer.bipedDeadmau5Head.rotationPointX = JPa.N;
        a2.bipedDeadmau5Head.rotationPointY = JPa.N;
        modelPlayer.bipedDeadmau5Head.C(b2);
    }

    public void f() {
        ModelPlayer a2;
        ModelPlayer modelPlayer = a2;
        modelPlayer.bipedRightArm.C(rRa.T);
        modelPlayer.bipedRightArmwear.C(rRa.T);
    }

    public void J() {
        ModelPlayer a2;
        ModelPlayer modelPlayer = a2;
        modelPlayer.bipedLeftArm.C(rRa.T);
        modelPlayer.bipedLeftArmwear.C(rRa.T);
    }
}

