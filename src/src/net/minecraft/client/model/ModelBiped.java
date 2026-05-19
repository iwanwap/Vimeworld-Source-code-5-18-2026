/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  JQa
 *  MQa
 *  NPa
 *  NQa
 *  Oz
 *  Tpa
 *  YSa
 *  Yra
 *  ZRa
 *  Zua
 *  cT
 *  dQa
 *  kPa
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  vL
 *  vRa
 *  wOa
 *  wra
 *  xOa
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public class ModelBiped
extends ModelBase {
    public int heldItemLeft;
    public cT bipedLeftArm;
    public int heldItemRight;
    public cT bipedBody;
    public cT bipedHead;
    public cT bipedLeftLeg;
    public cT bipedRightArm;
    public cT bipedHeadwear;
    public boolean aimedBow;
    public boolean isSneak;
    public cT bipedRightLeg;

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
        float f8;
        ModelBiped a2;
        float f9 = f7;
        ModelBiped modelBiped = a2 = this;
        modelBiped.J(f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h, (vL)g2);
        uKa.e();
        if (modelBiped.isChild) {
            f8 = kta.v;
            uKa.l((float)(Ira.d / f8), (float)(Ira.d / f8), (float)(Ira.d / f8));
            uKa.J((float)JPa.N, (float)(Yra.i * h), (float)JPa.N);
            ModelBiped modelBiped2 = a2;
            modelBiped2.bipedHead.C((float)h);
            uKa.D();
            uKa.e();
            uKa.l((float)(pqa.r / f8), (float)(pqa.r / f8), (float)(pqa.r / f8));
            uKa.J((float)JPa.N, (float)(KSa.I * h), (float)JPa.N);
            modelBiped2.bipedBody.C((float)h);
            modelBiped2.bipedRightArm.C((float)h);
            modelBiped2.bipedLeftArm.C((float)h);
            modelBiped2.bipedRightLeg.C((float)h);
            modelBiped2.bipedLeftLeg.C((float)h);
            modelBiped2.bipedHeadwear.C((float)h);
        } else {
            if (g2.q()) {
                uKa.J((float)JPa.N, (float)psa.N, (float)JPa.N);
            }
            ModelBiped modelBiped3 = a2;
            modelBiped3.bipedHead.C((float)h);
            modelBiped3.bipedBody.C((float)h);
            modelBiped3.bipedRightArm.C((float)h);
            modelBiped3.bipedLeftArm.C((float)h);
            modelBiped3.bipedRightLeg.C((float)h);
            modelBiped3.bipedLeftLeg.C((float)h);
            modelBiped3.bipedHeadwear.C((float)h);
        }
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void e2;
        ModelBiped modelBiped;
        float f8;
        float d2;
        ModelBiped g2;
        float h;
        block11: {
            ModelBiped modelBiped2;
            void c2;
            h = f2;
            g2 = this;
            g2.bipedHead.rotateAngleY = d2 / zpa.Z;
            g2.bipedHead.rotateAngleX = c2 / zpa.Z;
            g2.bipedRightArm.rotateAngleX = Oz.C((float)(h * Zra.u + pua.j)) * kta.v * f8 * MQa.L;
            g2.bipedLeftArm.rotateAngleX = Oz.C((float)(h * Zra.u)) * kta.v * f8 * MQa.L;
            g2.bipedRightArm.rotateAngleZ = JPa.N;
            g2.bipedLeftArm.rotateAngleZ = JPa.N;
            g2.bipedRightLeg.rotateAngleX = Oz.C((float)(h * Zra.u)) * NPa.B * f8;
            g2.bipedLeftLeg.rotateAngleX = Oz.C((float)(h * Zra.u + pua.j)) * NPa.B * f8;
            g2.bipedRightLeg.rotateAngleY = JPa.N;
            g2.bipedLeftLeg.rotateAngleY = JPa.N;
            if (g2.isRiding) {
                ModelBiped modelBiped3 = g2;
                modelBiped3.bipedRightArm.rotateAngleX += NQa.s;
                modelBiped3.bipedLeftArm.rotateAngleX += NQa.s;
                modelBiped3.bipedRightLeg.rotateAngleX = ZRa.Z;
                modelBiped3.bipedLeftLeg.rotateAngleX = ZRa.Z;
                modelBiped3.bipedRightLeg.rotateAngleY = xOa.b;
                modelBiped3.bipedLeftLeg.rotateAngleY = MRa.c;
            }
            if (g2.heldItemLeft != 0) {
                g2.bipedLeftArm.rotateAngleX = g2.bipedLeftArm.rotateAngleX * MQa.L - xOa.b * (float)g2.heldItemLeft;
            }
            g2.bipedRightArm.rotateAngleY = JPa.N;
            g2.bipedRightArm.rotateAngleZ = JPa.N;
            switch (g2.heldItemRight) {
                default: {
                    break;
                }
                case 1: {
                    ModelBiped modelBiped4 = g2;
                    while (false) {
                    }
                    modelBiped2 = modelBiped4;
                    modelBiped4.bipedRightArm.rotateAngleX = modelBiped4.bipedRightArm.rotateAngleX * MQa.L - xOa.b * (float)g2.heldItemRight;
                    break block11;
                }
                case 3: {
                    g2.bipedRightArm.rotateAngleX = g2.bipedRightArm.rotateAngleX * MQa.L - xOa.b * (float)g2.heldItemRight;
                    g2.bipedRightArm.rotateAngleY = dQa.X;
                }
            }
            modelBiped2 = g2;
        }
        modelBiped2.bipedLeftArm.rotateAngleY = JPa.N;
        if (g2.swingProgress > MRa.ja) {
            ModelBiped modelBiped5 = g2;
            h = modelBiped5.swingProgress;
            modelBiped5.bipedBody.rotateAngleY = Oz.d((float)(Oz.J((float)h) * pua.j * kta.v)) * psa.N;
            modelBiped5.bipedRightArm.rotationPointZ = Oz.d((float)g2.bipedBody.rotateAngleY) * eua.C;
            modelBiped5.bipedRightArm.rotationPointX = -Oz.C((float)g2.bipedBody.rotateAngleY) * eua.C;
            modelBiped5.bipedLeftArm.rotationPointZ = -Oz.d((float)g2.bipedBody.rotateAngleY) * eua.C;
            modelBiped5.bipedLeftArm.rotationPointX = Oz.C((float)g2.bipedBody.rotateAngleY) * eua.C;
            modelBiped5.bipedRightArm.rotateAngleY += g2.bipedBody.rotateAngleY;
            modelBiped5.bipedLeftArm.rotateAngleY += g2.bipedBody.rotateAngleY;
            modelBiped5.bipedLeftArm.rotateAngleX += g2.bipedBody.rotateAngleY;
            h = pqa.r - g2.swingProgress;
            h *= h;
            h *= h;
            h = pqa.r - h;
            f8 = Oz.d((float)(h * pua.j));
            d2 = Oz.d((float)(modelBiped5.swingProgress * pua.j)) * -(g2.bipedHead.rotateAngleX - ZSa.q) * wOa.w;
            modelBiped5.bipedRightArm.rotateAngleX = (float)((double)g2.bipedRightArm.rotateAngleX - ((double)f8 * JPa.ja + (double)d2));
            modelBiped5.bipedRightArm.rotateAngleY += g2.bipedBody.rotateAngleY * kta.v;
            modelBiped5.bipedRightArm.rotateAngleZ += Oz.d((float)(g2.swingProgress * pua.j)) * Tpa.S;
        }
        ModelBiped modelBiped6 = g2;
        if (g2.isSneak) {
            modelBiped6.bipedBody.rotateAngleX = MQa.L;
            ModelBiped modelBiped7 = g2;
            modelBiped = modelBiped7;
            modelBiped7.bipedRightArm.rotateAngleX += Xpa.R;
            modelBiped7.bipedLeftArm.rotateAngleX += Xpa.R;
            modelBiped7.bipedRightLeg.rotationPointZ = YSa.G;
            modelBiped7.bipedLeftLeg.rotationPointZ = YSa.G;
            modelBiped7.bipedRightLeg.rotationPointY = kPa.S;
            modelBiped7.bipedLeftLeg.rotationPointY = kPa.S;
            modelBiped7.bipedHead.rotationPointY = pqa.r;
        } else {
            modelBiped6.bipedBody.rotateAngleX = JPa.N;
            modelBiped = g2;
            g2.bipedRightLeg.rotationPointZ = Nra.e;
            g2.bipedLeftLeg.rotationPointZ = Nra.e;
            g2.bipedRightLeg.rotationPointY = Fua.Y;
            g2.bipedLeftLeg.rotationPointY = Fua.Y;
            g2.bipedHead.rotationPointY = JPa.N;
        }
        modelBiped.bipedRightArm.rotateAngleZ += Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
        ModelBiped modelBiped8 = g2;
        modelBiped8.bipedLeftArm.rotateAngleZ -= Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
        modelBiped8.bipedRightArm.rotateAngleX += Oz.d((float)(e2 * JQa.k)) * Yqa.C;
        modelBiped8.bipedLeftArm.rotateAngleX -= Oz.d((float)(e2 * JQa.k)) * Yqa.C;
        if (modelBiped8.aimedBow) {
            h = JPa.N;
            f8 = JPa.N;
            ModelBiped modelBiped9 = g2;
            modelBiped9.bipedRightArm.rotateAngleZ = JPa.N;
            modelBiped9.bipedLeftArm.rotateAngleZ = JPa.N;
            modelBiped9.bipedRightArm.rotateAngleY = -(Nra.e - h * Ora.D) + g2.bipedHead.rotateAngleY;
            modelBiped9.bipedLeftArm.rotateAngleY = Nra.e - h * Ora.D + g2.bipedHead.rotateAngleY + Xpa.R;
            modelBiped9.bipedRightArm.rotateAngleX = Fsa.s + g2.bipedHead.rotateAngleX;
            modelBiped9.bipedLeftArm.rotateAngleX = Fsa.s + g2.bipedHead.rotateAngleX;
            modelBiped9.bipedRightArm.rotateAngleX -= h * pPa.c - f8 * Xpa.R;
            modelBiped9.bipedLeftArm.rotateAngleX -= h * pPa.c - f8 * Xpa.R;
            modelBiped9.bipedRightArm.rotateAngleZ += Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
            modelBiped9.bipedLeftArm.rotateAngleZ -= Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
            modelBiped9.bipedRightArm.rotateAngleX += Oz.d((float)(e2 * JQa.k)) * Yqa.C;
            modelBiped9.bipedLeftArm.rotateAngleX -= Oz.d((float)(e2 * JQa.k)) * Yqa.C;
        }
        ModelBiped modelBiped10 = g2;
        ModelBiped.J(modelBiped10.bipedHead, modelBiped10.bipedHeadwear);
    }

    public void J(boolean bl) {
        ModelBiped a2;
        boolean b2 = bl;
        ModelBiped modelBiped = a2 = this;
        modelBiped.bipedHead.showModel = b2;
        modelBiped.bipedHeadwear.showModel = b2;
        modelBiped.bipedBody.showModel = b2;
        modelBiped.bipedRightArm.showModel = b2;
        modelBiped.bipedLeftArm.showModel = b2;
        modelBiped.bipedRightLeg.showModel = b2;
        modelBiped.bipedLeftLeg.showModel = b2;
    }

    public ModelBiped(float f2) {
        float b2 = f2;
        ModelBiped a2 = this;
        a2(b2, JPa.N, ysa.s, fPa.i);
    }

    @Override
    public void J(ModelBase modelBase) {
        ModelBase b2 = modelBase;
        ModelBiped a2 = this;
        ModelBase modelBase2 = b2;
        super.J(modelBase2);
        if (modelBase2 instanceof ModelBiped) {
            ModelBiped modelBiped = a2;
            ModelBase modelBase3 = b2;
            a2.heldItemLeft = b2.heldItemLeft;
            a2.heldItemRight = modelBase3.heldItemRight;
            modelBiped.isSneak = modelBase3.isSneak;
            modelBiped.aimedBow = b2.aimedBow;
        }
    }

    /*
     * WARNING - void declaration
     */
    public ModelBiped(float f2, float f3, int n2, int n3) {
        void d2;
        void a2;
        void b2;
        ModelBiped c2;
        float e2 = f3;
        ModelBiped modelBiped = c2 = this;
        ModelBiped modelBiped2 = c2;
        modelBiped2.textureWidth = b2;
        modelBiped2.textureHeight = a2;
        modelBiped.bipedHead = new cT((ModelBase)c2, uSa.E, uSa.E);
        c2.bipedHead.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, (float)d2);
        modelBiped.bipedHead.J(JPa.N, JPa.N + e2, JPa.N);
        modelBiped.bipedHeadwear = new cT((ModelBase)c2, fPa.i, uSa.E);
        modelBiped.bipedHeadwear.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, (float)(d2 + MQa.L));
        modelBiped.bipedHeadwear.J(JPa.N, JPa.N + e2, JPa.N);
        modelBiped.bipedBody = new cT((ModelBase)c2, ERa.C, ERa.C);
        modelBiped.bipedBody.J(NQa.m, JPa.N, dua.ca, Yqa.i, lqa.s, AQa.P, (float)d2);
        modelBiped.bipedBody.J(JPa.N, JPa.N + e2, JPa.N);
        modelBiped.bipedRightArm = new cT((ModelBase)c2, wra.P, ERa.C);
        modelBiped.bipedRightArm.J(TOa.p, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, (float)d2);
        modelBiped.bipedRightArm.J(CRa.M, kta.v + e2, JPa.N);
        modelBiped.bipedLeftArm = new cT((ModelBase)c2, wra.P, ERa.C);
        modelBiped.bipedLeftArm.mirror = vRa.d;
        modelBiped.bipedLeftArm.J(vqa.T, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, (float)d2);
        modelBiped.bipedLeftArm.J(eua.C, kta.v + e2, JPa.N);
        modelBiped.bipedRightLeg = new cT((ModelBase)c2, uSa.E, ERa.C);
        modelBiped.bipedRightLeg.J(dua.ca, JPa.N, dua.ca, AQa.P, lqa.s, AQa.P, (float)d2);
        modelBiped.bipedRightLeg.J(AQa.d, Fua.Y + e2, JPa.N);
        modelBiped.bipedLeftLeg = new cT((ModelBase)c2, uSa.E, ERa.C);
        modelBiped.bipedLeftLeg.mirror = vRa.d;
        modelBiped.bipedLeftLeg.J(dua.ca, JPa.N, dua.ca, AQa.P, lqa.s, AQa.P, (float)d2);
        modelBiped.bipedLeftLeg.J(Zua.D, Fua.Y + e2, JPa.N);
    }

    public void J(float f2) {
        float b2 = f2;
        ModelBiped a2 = this;
        a2.bipedRightArm.l(b2);
    }

    public ModelBiped() {
        a2(JPa.N);
        ModelBiped a2;
    }
}

