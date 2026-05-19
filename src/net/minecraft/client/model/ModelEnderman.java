/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  MQa
 *  NQa
 *  cT
 *  kPa
 *  kta
 *  lqa
 *  pqa
 *  vL
 *  vPa
 *  vRa
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;

public final class ModelEnderman
extends ModelBiped {
    public boolean isAttacking;
    public boolean isCarrying;

    /*
     * WARNING - void declaration
     */
    public ModelEnderman(float f2) {
        void a2;
        ModelEnderman modelEnderman;
        ModelEnderman modelEnderman2 = modelEnderman = this;
        super(JPa.N, Lsa.A, ysa.s, fPa.i);
        float b2 = Lsa.A;
        modelEnderman2.bipedHeadwear = new cT((ModelBase)modelEnderman, uSa.E, ERa.C);
        modelEnderman.bipedHeadwear.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, (float)(a2 - MQa.L));
        modelEnderman2.bipedHeadwear.J(JPa.N, JPa.N + b2, JPa.N);
        modelEnderman2.bipedBody = new cT((ModelBase)modelEnderman, fPa.i, ERa.C);
        modelEnderman2.bipedBody.J(NQa.m, JPa.N, dua.ca, Yqa.i, lqa.s, AQa.P, (float)a2);
        modelEnderman2.bipedBody.J(JPa.N, JPa.N + b2, JPa.N);
        modelEnderman2.bipedRightArm = new cT((ModelBase)modelEnderman, Upa.D, uSa.E);
        modelEnderman2.bipedRightArm.J(vqa.T, dua.ca, vqa.T, uqa.g, Fsa.d, uqa.g, (float)a2);
        modelEnderman2.bipedRightArm.J(TOa.p, kta.v + b2, JPa.N);
        modelEnderman2.bipedLeftArm = new cT((ModelBase)modelEnderman, Upa.D, uSa.E);
        modelEnderman2.bipedLeftArm.mirror = vRa.d;
        modelEnderman2.bipedLeftArm.J(vqa.T, dua.ca, vqa.T, uqa.g, Fsa.d, uqa.g, (float)a2);
        modelEnderman2.bipedLeftArm.J(eua.C, kta.v + b2, JPa.N);
        modelEnderman2.bipedRightLeg = new cT((ModelBase)modelEnderman, Upa.D, uSa.E);
        modelEnderman2.bipedRightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, Fsa.d, uqa.g, (float)a2);
        modelEnderman2.bipedRightLeg.J(dua.ca, Fua.Y + b2, JPa.N);
        modelEnderman2.bipedLeftLeg = new cT((ModelBase)modelEnderman, Upa.D, uSa.E);
        modelEnderman2.bipedLeftLeg.mirror = vRa.d;
        modelEnderman2.bipedLeftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, Fsa.d, uqa.g, (float)a2);
        modelEnderman2.bipedLeftLeg.J(kta.v, Fua.Y + b2, JPa.N);
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
        ModelEnderman f8;
        float h2 = f3;
        ModelEnderman modelEnderman = f8 = this;
        super.J(g2, h2, (float)e2, (float)d2, (float)c2, (float)b2, (vL)a2);
        modelEnderman.bipedHead.showModel = vRa.d;
        g2 = Lsa.A;
        modelEnderman.bipedBody.rotateAngleX = JPa.N;
        modelEnderman.bipedBody.rotationPointY = g2;
        modelEnderman.bipedBody.rotationPointZ = QTa.ga;
        modelEnderman.bipedRightLeg.rotateAngleX -= JPa.N;
        modelEnderman.bipedLeftLeg.rotateAngleX -= JPa.N;
        modelEnderman.bipedRightArm.rotateAngleX = (float)((double)f8.bipedRightArm.rotateAngleX * kTa.B);
        modelEnderman.bipedLeftArm.rotateAngleX = (float)((double)f8.bipedLeftArm.rotateAngleX * kTa.B);
        modelEnderman.bipedRightLeg.rotateAngleX = (float)((double)f8.bipedRightLeg.rotateAngleX * kTa.B);
        modelEnderman.bipedLeftLeg.rotateAngleX = (float)((double)f8.bipedLeftLeg.rotateAngleX * kTa.B);
        h2 = Xpa.R;
        if (modelEnderman.bipedRightArm.rotateAngleX > h2) {
            f8.bipedRightArm.rotateAngleX = h2;
        }
        if (f8.bipedLeftArm.rotateAngleX > h2) {
            f8.bipedLeftArm.rotateAngleX = h2;
        }
        if (f8.bipedRightArm.rotateAngleX < -h2) {
            f8.bipedRightArm.rotateAngleX = -h2;
        }
        if (f8.bipedLeftArm.rotateAngleX < -h2) {
            f8.bipedLeftArm.rotateAngleX = -h2;
        }
        if (f8.bipedRightLeg.rotateAngleX > h2) {
            f8.bipedRightLeg.rotateAngleX = h2;
        }
        if (f8.bipedLeftLeg.rotateAngleX > h2) {
            f8.bipedLeftLeg.rotateAngleX = h2;
        }
        if (f8.bipedRightLeg.rotateAngleX < -h2) {
            f8.bipedRightLeg.rotateAngleX = -h2;
        }
        if (f8.bipedLeftLeg.rotateAngleX < -h2) {
            f8.bipedLeftLeg.rotateAngleX = -h2;
        }
        if (f8.isCarrying) {
            ModelEnderman modelEnderman2 = f8;
            modelEnderman2.bipedRightArm.rotateAngleX = vPa.b;
            modelEnderman2.bipedLeftArm.rotateAngleX = vPa.b;
            modelEnderman2.bipedRightArm.rotateAngleZ = Yqa.C;
            modelEnderman2.bipedLeftArm.rotateAngleZ = KQa.C;
        }
        f8.bipedRightArm.rotationPointZ = JPa.N;
        f8.bipedLeftArm.rotationPointZ = JPa.N;
        f8.bipedRightLeg.rotationPointZ = JPa.N;
        f8.bipedLeftLeg.rotationPointZ = JPa.N;
        f8.bipedRightLeg.rotationPointY = kPa.S + g2;
        f8.bipedLeftLeg.rotationPointY = kPa.S + g2;
        f8.bipedHead.rotationPointZ = QTa.ga;
        f8.bipedHead.rotationPointY = g2 + pqa.r;
        f8.bipedHeadwear.rotationPointX = f8.bipedHead.rotationPointX;
        f8.bipedHeadwear.rotationPointY = f8.bipedHead.rotationPointY;
        f8.bipedHeadwear.rotationPointZ = f8.bipedHead.rotationPointZ;
        f8.bipedHeadwear.rotateAngleX = f8.bipedHead.rotateAngleX;
        f8.bipedHeadwear.rotateAngleY = f8.bipedHead.rotateAngleY;
        f8.bipedHeadwear.rotateAngleZ = f8.bipedHead.rotateAngleZ;
        if (f8.isAttacking) {
            g2 = pqa.r;
            f8.bipedHead.rotationPointY -= g2 * eua.C;
        }
    }
}

