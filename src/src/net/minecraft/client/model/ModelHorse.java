/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  EQa
 *  ERa
 *  FTa
 *  Gl
 *  ISa
 *  JPa
 *  KTa
 *  LQa
 *  Lra
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  RQa
 *  Rea
 *  SRa
 *  Tpa
 *  XTa
 *  YSa
 *  Yra
 *  Zpa
 *  Zua
 *  aqa
 *  bqa
 *  cT
 *  cra
 *  fsa
 *  hqa
 *  jpa
 *  kPa
 *  kpa
 *  kta
 *  lqa
 *  pqa
 *  psa
 *  pua
 *  qta
 *  uKa
 *  uOa
 *  uRa
 *  ura
 *  vL
 *  vPa
 *  vQa
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelHorse
extends ModelBase {
    private cT frontRightHoof;
    private cT backLeftShin;
    private cT horseSaddleBottom;
    private cT horseRightRein;
    private cT muleLeftChest;
    private cT horseFaceRopes;
    private cT frontLeftLeg;
    private cT horseRightEar;
    private cT muleRightChest;
    private cT field_178712_c;
    private cT horseSaddleBack;
    private cT mane;
    private cT horseLeftRein;
    private cT horseLeftSaddleRope;
    private cT horseRightSaddleRope;
    private cT horseLeftEar;
    private cT horseSaddleFront;
    private cT horseRightSaddleMetal;
    private cT backRightLeg;
    private cT muleRightEar;
    private cT backRightShin;
    private cT field_178711_b;
    private cT frontRightShin;
    private cT tailTip;
    private cT body;
    private cT frontLeftShin;
    private cT tailBase;
    private cT frontRightLeg;
    private cT horseLeftFaceMetal;
    private cT neck;
    private cT backLeftHoof;
    private cT horseLeftSaddleMetal;
    private cT backRightHoof;
    private cT frontLeftHoof;
    private cT tailMiddle;
    private cT backLeftLeg;
    private cT horseRightFaceMetal;
    private cT muleLeftEar;
    private cT head;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        ModelHorse modelHorse;
        float f5;
        float a2;
        void b2;
        float c2;
        void d22;
        ModelHorse modelHorse2;
        ModelHorse modelHorse3 = modelHorse2 = this;
        void v1 = d22;
        super.J((Gl)v1, c2, (float)b2, a2);
        void v2 = d22;
        float f6 = modelHorse3.J(v1.Ma, v2.ba, a2);
        void v3 = d22;
        float f7 = modelHorse3.J(v2.ga, v3.t, a2);
        void v4 = d22;
        float f8 = v3.o + (v4.d - v4.o) * a2;
        f6 = f7 - f6;
        f7 = f8 / zpa.Z;
        if (f6 > eta.e) {
            f6 = eta.e;
        }
        if (f6 < Lsa.X) {
            f6 = Lsa.X;
        }
        if (b2 > psa.N) {
            f7 += Oz.C((float)(c2 * Xpa.R)) * VPa.i * b2;
        }
        Rea rea2 = (Rea)d22;
        float f9 = rea2.l(a2);
        float e2 = rea2.C(a2);
        float f10 = pqa.r - e2;
        float f11 = rea2.d(a2);
        int n2 = rea2.M != 0 ? vRa.d : uSa.E;
        Rea rea3 = rea2;
        boolean bl = rea3.ma();
        int n3 = rea3.Aa != null ? vRa.d : uSa.E;
        float d22 = (float)d22.g + a2;
        c2 = Oz.C((float)(c2 * Zra.u + pua.j));
        a2 = c2 * xSa.la * b2;
        ModelHorse modelHorse4 = modelHorse2;
        ModelHorse modelHorse5 = modelHorse2;
        modelHorse5.head.rotationPointY = YSa.G;
        modelHorse5.head.rotationPointZ = Cra.fa;
        modelHorse5.tailBase.rotationPointY = vQa.q;
        modelHorse5.tailMiddle.rotationPointZ = bsa.la;
        modelHorse5.muleRightChest.rotationPointY = vQa.q;
        modelHorse5.muleRightChest.rotationPointZ = FRa.Ga;
        modelHorse5.body.rotateAngleX = JPa.N;
        modelHorse5.head.rotateAngleX = fqa.U + f7;
        modelHorse5.head.rotateAngleY = f6 / zpa.Z;
        modelHorse5.head.rotateAngleX = e2 * (DPa.s + f7) + f9 * Zua.h + (pqa.r - Math.max(e2, f9)) * modelHorse2.head.rotateAngleX;
        modelHorse5.head.rotateAngleY = e2 * f6 / zpa.Z + (pqa.r - Math.max(e2, f9)) * modelHorse2.head.rotateAngleY;
        modelHorse5.head.rotationPointY = e2 * NSa.b + f9 * AQa.W + (pqa.r - Math.max(e2, f9)) * modelHorse2.head.rotationPointY;
        modelHorse5.head.rotationPointZ = e2 * vqa.T + f9 * Cra.fa + (pqa.r - Math.max(e2, f9)) * modelHorse2.head.rotationPointZ;
        modelHorse5.tailBase.rotationPointY = e2 * kPa.S + f10 * modelHorse2.tailBase.rotationPointY;
        modelHorse5.tailMiddle.rotationPointZ = e2 * vqa.A + f10 * modelHorse2.tailMiddle.rotationPointZ;
        modelHorse5.muleRightChest.rotationPointY = e2 * SRa.V + f10 * modelHorse2.muleRightChest.rotationPointY;
        modelHorse5.muleRightChest.rotationPointZ = e2 * qta.D + f10 * modelHorse2.muleRightChest.rotationPointZ;
        modelHorse5.body.rotateAngleX = e2 * pua.e / zpa.Z + f10 * modelHorse2.body.rotateAngleX;
        modelHorse5.horseLeftEar.rotationPointY = modelHorse2.head.rotationPointY;
        modelHorse5.horseRightEar.rotationPointY = modelHorse2.head.rotationPointY;
        modelHorse5.muleLeftEar.rotationPointY = modelHorse2.head.rotationPointY;
        modelHorse5.muleRightEar.rotationPointY = modelHorse2.head.rotationPointY;
        modelHorse5.neck.rotationPointY = modelHorse2.head.rotationPointY;
        modelHorse5.field_178711_b.rotationPointY = WRa.e;
        modelHorse5.field_178712_c.rotationPointY = JPa.N;
        modelHorse5.mane.rotationPointY = modelHorse2.head.rotationPointY;
        modelHorse5.horseLeftEar.rotationPointZ = modelHorse2.head.rotationPointZ;
        modelHorse5.horseRightEar.rotationPointZ = modelHorse2.head.rotationPointZ;
        modelHorse5.muleLeftEar.rotationPointZ = modelHorse2.head.rotationPointZ;
        modelHorse5.muleRightEar.rotationPointZ = modelHorse2.head.rotationPointZ;
        modelHorse5.neck.rotationPointZ = modelHorse2.head.rotationPointZ;
        modelHorse5.field_178711_b.rotationPointZ = WRa.e - f11 * pqa.r;
        modelHorse5.field_178712_c.rotationPointZ = JPa.N + f11 * pqa.r;
        modelHorse5.mane.rotationPointZ = modelHorse2.head.rotationPointZ;
        modelHorse5.horseLeftEar.rotateAngleX = modelHorse2.head.rotateAngleX;
        modelHorse5.horseRightEar.rotateAngleX = modelHorse2.head.rotateAngleX;
        modelHorse5.muleLeftEar.rotateAngleX = modelHorse2.head.rotateAngleX;
        modelHorse5.muleRightEar.rotateAngleX = modelHorse2.head.rotateAngleX;
        modelHorse5.neck.rotateAngleX = modelHorse2.head.rotateAngleX;
        modelHorse5.field_178711_b.rotateAngleX = JPa.N - wsa.j * f11;
        modelHorse5.field_178712_c.rotateAngleX = JPa.N + FTa.C * f11;
        modelHorse5.mane.rotateAngleX = modelHorse2.head.rotateAngleX;
        modelHorse5.horseLeftEar.rotateAngleY = modelHorse2.head.rotateAngleY;
        modelHorse5.horseRightEar.rotateAngleY = modelHorse2.head.rotateAngleY;
        modelHorse5.muleLeftEar.rotateAngleY = modelHorse2.head.rotateAngleY;
        modelHorse5.muleRightEar.rotateAngleY = modelHorse2.head.rotateAngleY;
        modelHorse5.neck.rotateAngleY = modelHorse2.head.rotateAngleY;
        modelHorse5.field_178711_b.rotateAngleY = JPa.N;
        modelHorse5.field_178712_c.rotateAngleY = JPa.N;
        modelHorse5.mane.rotateAngleY = modelHorse2.head.rotateAngleY;
        modelHorse5.muleLeftChest.rotateAngleX = a2 / eua.C;
        modelHorse5.muleRightChest.rotateAngleX = -a2 / eua.C;
        f6 = jpa.f;
        f9 = DPa.s * e2;
        f11 = Oz.C((float)(d22 * Ora.D + pua.j));
        modelHorse5.frontLeftLeg.rotationPointY = dua.ca * e2 + kPa.S * f10;
        modelHorse5.frontLeftLeg.rotationPointZ = dua.ca * e2 + sOa.Z * f10;
        modelHorse5.frontRightLeg.rotationPointY = modelHorse2.frontLeftLeg.rotationPointY;
        modelHorse5.frontRightLeg.rotationPointZ = modelHorse2.frontLeftLeg.rotationPointZ;
        modelHorse5.backLeftShin.rotationPointY = modelHorse2.backLeftLeg.rotationPointY + Oz.d((float)(jpa.f + f9 + f10 * -c2 * MQa.L * b2)) * BRa.k;
        modelHorse5.backLeftShin.rotationPointZ = modelHorse2.backLeftLeg.rotationPointZ + Oz.C((float)(hqa.Y + f9 + f10 * -c2 * MQa.L * b2)) * BRa.k;
        modelHorse5.backRightShin.rotationPointY = modelHorse2.backRightLeg.rotationPointY + Oz.d((float)(jpa.f + f9 + f10 * c2 * MQa.L * b2)) * BRa.k;
        modelHorse5.backRightShin.rotationPointZ = modelHorse2.backRightLeg.rotationPointZ + Oz.C((float)(hqa.Y + f9 + f10 * c2 * MQa.L * b2)) * BRa.k;
        float f12 = (Zra.y + f11) * e2 + a2 * f10;
        float f13 = (Zra.y + -f11) * e2 + -a2 * f10;
        modelHorse5.frontLeftShin.rotationPointY = modelHorse2.frontLeftLeg.rotationPointY + Oz.d((float)(jpa.f + f12)) * BRa.k;
        modelHorse5.frontLeftShin.rotationPointZ = modelHorse2.frontLeftLeg.rotationPointZ + Oz.C((float)(hqa.Y + f12)) * BRa.k;
        modelHorse5.frontRightShin.rotationPointY = modelHorse2.frontRightLeg.rotationPointY + Oz.d((float)(jpa.f + f13)) * BRa.k;
        modelHorse5.frontRightShin.rotationPointZ = modelHorse2.frontRightLeg.rotationPointZ + Oz.C((float)(hqa.Y + f13)) * BRa.k;
        modelHorse5.backLeftLeg.rotateAngleX = f9 + -c2 * MQa.L * b2 * f10;
        modelHorse5.backLeftShin.rotateAngleX = vTa.e * e2 + (-c2 * MQa.L * b2 - Math.max(JPa.N, c2 * MQa.L * b2)) * f10;
        modelHorse5.backLeftHoof.rotateAngleX = modelHorse2.backLeftShin.rotateAngleX;
        modelHorse5.backRightLeg.rotateAngleX = f9 + c2 * MQa.L * b2 * f10;
        modelHorse5.backRightShin.rotateAngleX = vTa.e * e2 + (c2 * MQa.L * b2 - Math.max(JPa.N, -c2 * MQa.L * b2)) * f10;
        modelHorse5.backRightHoof.rotateAngleX = modelHorse2.backRightShin.rotateAngleX;
        modelHorse5.frontLeftLeg.rotateAngleX = f12;
        modelHorse5.frontLeftShin.rotateAngleX = (modelHorse2.frontLeftLeg.rotateAngleX + pua.j * Math.max(JPa.N, psa.N + f11 * psa.N)) * e2 + (a2 + Math.max(JPa.N, c2 * MQa.L * b2)) * f10;
        modelHorse5.frontLeftHoof.rotateAngleX = modelHorse2.frontLeftShin.rotateAngleX;
        modelHorse5.frontRightLeg.rotateAngleX = f13;
        modelHorse5.frontRightShin.rotateAngleX = (modelHorse2.frontRightLeg.rotateAngleX + pua.j * Math.max(JPa.N, psa.N - f11 * psa.N)) * e2 + (-a2 + Math.max(JPa.N, -c2 * MQa.L * b2)) * f10;
        modelHorse5.frontRightHoof.rotateAngleX = modelHorse2.frontRightShin.rotateAngleX;
        modelHorse4.backLeftHoof.rotationPointY = modelHorse2.backLeftShin.rotationPointY;
        modelHorse4.backLeftHoof.rotationPointZ = modelHorse2.backLeftShin.rotationPointZ;
        modelHorse4.backRightHoof.rotationPointY = modelHorse2.backRightShin.rotationPointY;
        modelHorse4.backRightHoof.rotationPointZ = modelHorse2.backRightShin.rotationPointZ;
        ModelHorse modelHorse6 = modelHorse2;
        modelHorse6.frontLeftHoof.rotationPointY = modelHorse2.frontLeftShin.rotationPointY;
        modelHorse6.frontLeftHoof.rotationPointZ = modelHorse2.frontLeftShin.rotationPointZ;
        modelHorse2.frontRightHoof.rotationPointY = modelHorse2.frontRightShin.rotationPointY;
        modelHorse6.frontRightHoof.rotationPointZ = modelHorse2.frontRightShin.rotationPointZ;
        if (bl) {
            ModelHorse modelHorse7 = modelHorse2;
            modelHorse7.horseSaddleBottom.rotationPointY = e2 * MQa.L + f10 * kta.v;
            modelHorse7.horseSaddleBottom.rotationPointZ = e2 * AQa.W + f10 * kta.v;
            modelHorse7.horseSaddleFront.rotationPointY = modelHorse2.horseSaddleBottom.rotationPointY;
            modelHorse7.horseSaddleBack.rotationPointY = modelHorse2.horseSaddleBottom.rotationPointY;
            modelHorse7.horseLeftSaddleRope.rotationPointY = modelHorse2.horseSaddleBottom.rotationPointY;
            modelHorse7.horseRightSaddleRope.rotationPointY = modelHorse2.horseSaddleBottom.rotationPointY;
            modelHorse7.horseLeftSaddleMetal.rotationPointY = modelHorse2.horseSaddleBottom.rotationPointY;
            modelHorse7.horseRightSaddleMetal.rotationPointY = modelHorse2.horseSaddleBottom.rotationPointY;
            modelHorse7.muleLeftChest.rotationPointY = modelHorse2.muleRightChest.rotationPointY;
            modelHorse7.horseSaddleFront.rotationPointZ = modelHorse2.horseSaddleBottom.rotationPointZ;
            modelHorse7.horseSaddleBack.rotationPointZ = modelHorse2.horseSaddleBottom.rotationPointZ;
            modelHorse7.horseLeftSaddleRope.rotationPointZ = modelHorse2.horseSaddleBottom.rotationPointZ;
            modelHorse7.horseRightSaddleRope.rotationPointZ = modelHorse2.horseSaddleBottom.rotationPointZ;
            modelHorse7.horseLeftSaddleMetal.rotationPointZ = modelHorse2.horseSaddleBottom.rotationPointZ;
            modelHorse7.horseRightSaddleMetal.rotationPointZ = modelHorse2.horseSaddleBottom.rotationPointZ;
            modelHorse7.muleLeftChest.rotationPointZ = modelHorse2.muleRightChest.rotationPointZ;
            modelHorse7.horseSaddleBottom.rotateAngleX = modelHorse2.body.rotateAngleX;
            modelHorse7.horseSaddleFront.rotateAngleX = modelHorse2.body.rotateAngleX;
            modelHorse7.horseSaddleBack.rotateAngleX = modelHorse2.body.rotateAngleX;
            modelHorse7.horseLeftRein.rotationPointY = modelHorse2.head.rotationPointY;
            modelHorse7.horseRightRein.rotationPointY = modelHorse2.head.rotationPointY;
            modelHorse7.horseFaceRopes.rotationPointY = modelHorse2.head.rotationPointY;
            modelHorse7.horseLeftFaceMetal.rotationPointY = modelHorse2.head.rotationPointY;
            modelHorse7.horseRightFaceMetal.rotationPointY = modelHorse2.head.rotationPointY;
            modelHorse7.horseLeftRein.rotationPointZ = modelHorse2.head.rotationPointZ;
            modelHorse7.horseRightRein.rotationPointZ = modelHorse2.head.rotationPointZ;
            modelHorse7.horseFaceRopes.rotationPointZ = modelHorse2.head.rotationPointZ;
            modelHorse7.horseLeftFaceMetal.rotationPointZ = modelHorse2.head.rotationPointZ;
            modelHorse7.horseRightFaceMetal.rotationPointZ = modelHorse2.head.rotationPointZ;
            modelHorse7.horseLeftRein.rotateAngleX = f7;
            modelHorse7.horseRightRein.rotateAngleX = f7;
            modelHorse7.horseFaceRopes.rotateAngleX = modelHorse2.head.rotateAngleX;
            modelHorse7.horseLeftFaceMetal.rotateAngleX = modelHorse2.head.rotateAngleX;
            modelHorse7.horseRightFaceMetal.rotateAngleX = modelHorse2.head.rotateAngleX;
            modelHorse7.horseFaceRopes.rotateAngleY = modelHorse2.head.rotateAngleY;
            modelHorse7.horseLeftFaceMetal.rotateAngleY = modelHorse2.head.rotateAngleY;
            modelHorse7.horseLeftRein.rotateAngleY = modelHorse2.head.rotateAngleY;
            modelHorse7.horseRightFaceMetal.rotateAngleY = modelHorse2.head.rotateAngleY;
            modelHorse7.horseRightRein.rotateAngleY = modelHorse2.head.rotateAngleY;
            ModelHorse modelHorse8 = modelHorse2;
            if (n3 != 0) {
                modelHorse8.horseLeftSaddleRope.rotateAngleX = Zra.y;
                ModelHorse modelHorse9 = modelHorse2;
                modelHorse9.horseLeftSaddleMetal.rotateAngleX = Zra.y;
                modelHorse9.horseRightSaddleRope.rotateAngleX = Zra.y;
                modelHorse9.horseRightSaddleMetal.rotateAngleX = Zra.y;
                modelHorse9.horseLeftSaddleRope.rotateAngleZ = JPa.N;
                modelHorse9.horseLeftSaddleMetal.rotateAngleZ = JPa.N;
                modelHorse9.horseRightSaddleRope.rotateAngleZ = JPa.N;
                modelHorse9.horseRightSaddleMetal.rotateAngleZ = JPa.N;
            } else {
                modelHorse8.horseLeftSaddleRope.rotateAngleX = a2 / vQa.q;
                ModelHorse modelHorse10 = modelHorse2;
                modelHorse10.horseLeftSaddleMetal.rotateAngleX = a2 / vQa.q;
                modelHorse10.horseRightSaddleRope.rotateAngleX = a2 / vQa.q;
                modelHorse10.horseRightSaddleMetal.rotateAngleX = a2 / vQa.q;
                modelHorse10.horseLeftSaddleRope.rotateAngleZ = a2 / eua.C;
                modelHorse10.horseLeftSaddleMetal.rotateAngleZ = a2 / eua.C;
                modelHorse10.horseRightSaddleRope.rotateAngleZ = -a2 / eua.C;
                modelHorse10.horseRightSaddleMetal.rotateAngleZ = -a2 / eua.C;
            }
        }
        f6 = aqa.x + b2 * Ira.d;
        if (f5 > JPa.N) {
            f6 = JPa.N;
        }
        ModelHorse modelHorse11 = modelHorse2;
        if (n2 != 0) {
            modelHorse11.tailBase.rotateAngleY = Oz.C((float)(d22 * ZSa.q));
            f6 = JPa.N;
            modelHorse = modelHorse2;
        } else {
            modelHorse11.tailBase.rotateAngleY = JPa.N;
            modelHorse = modelHorse2;
        }
        modelHorse.tailMiddle.rotateAngleY = modelHorse2.tailBase.rotateAngleY;
        ModelHorse modelHorse12 = modelHorse2;
        modelHorse12.tailTip.rotateAngleY = modelHorse2.tailBase.rotateAngleY;
        modelHorse12.tailMiddle.rotationPointY = modelHorse2.tailBase.rotationPointY;
        modelHorse2.tailTip.rotationPointY = modelHorse2.tailBase.rotationPointY;
        modelHorse12.tailMiddle.rotationPointZ = modelHorse2.tailBase.rotationPointZ;
        modelHorse12.tailTip.rotationPointZ = modelHorse2.tailBase.rotationPointZ;
        modelHorse12.tailBase.rotateAngleX = f6;
        modelHorse12.tailMiddle.rotateAngleX = f6;
        modelHorse12.tailTip.rotateAngleX = LRa.r + f6;
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void a2;
        void c2;
        float d2 = f3;
        ModelHorse b2 = this;
        float f5 = d2 = d2 - c2;
        while (f5 < xua.V) {
            f5 = d2 + CRa.ja;
        }
        float f6 = d2;
        while (f6 >= Hra.Ga) {
            f6 = d2 - CRa.ja;
        }
        return (float)(c2 + a2 * d2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(cT cT2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        ModelHorse e2 = cT2;
        ModelHorse d2 = this;
        ModelHorse modelHorse = e2;
        ((cT)e2).rotateAngleX = c2;
        ((cT)modelHorse).rotateAngleY = b2;
        ((cT)modelHorse).rotateAngleZ = a2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(vL var1_2, float var2_4, float var3_6, float var4_7, float var5_9, float var6_11, float var7_13) {
        var0_1 = var7_13;
        a = this;
        g = g;
        f = g.B();
        e = g.l(JPa.N);
        d = g.ga();
        c = d != false && g.ma() != false ? vRa.d : uSa.E;
        b = d != false && g.ca() != false ? vRa.d : uSa.E;
        var8_15 = f == vRa.d || f == uqa.g ? vRa.d : uSa.E;
        v0 = g;
        g = v0.j();
        v1 = f = v0.Aa != null ? vRa.d : uSa.E;
        if (c != 0) {
            v2 = a;
            v2.horseFaceRopes.C((float)h);
            v2.horseSaddleBottom.C((float)h);
            v2.horseSaddleFront.C((float)h);
            v2.horseSaddleBack.C((float)h);
            v2.horseLeftSaddleRope.C((float)h);
            v2.horseLeftSaddleMetal.C((float)h);
            v2.horseRightSaddleRope.C((float)h);
            v2.horseRightSaddleMetal.C((float)h);
            v2.horseLeftFaceMetal.C((float)h);
            v2.horseRightFaceMetal.C((float)h);
            if (f != 0) {
                v3 = a;
                v3.horseLeftRein.C((float)h);
                v3.horseRightRein.C((float)h);
            }
        }
        if (!d) {
            uKa.e();
            v4 = g;
            uKa.l((float)v4, (float)(MQa.L + g * MQa.L), (float)v4);
            uKa.J((float)JPa.N, (float)(fsa.Ia * (pqa.r - g)), (float)JPa.N);
        }
        v5 = a;
        v5.backLeftLeg.C((float)h);
        v5.backLeftShin.C((float)h);
        v5.backLeftHoof.C((float)h);
        v5.backRightLeg.C((float)h);
        v5.backRightShin.C((float)h);
        v5.backRightHoof.C((float)h);
        v5.frontLeftLeg.C((float)h);
        v5.frontLeftShin.C((float)h);
        v5.frontLeftHoof.C((float)h);
        v5.frontRightLeg.C((float)h);
        v5.frontRightShin.C((float)h);
        v5.frontRightHoof.C((float)h);
        if (!d) {
            uKa.D();
            uKa.e();
            v6 = g;
            uKa.l((float)v6, (float)v6, (float)v6);
            uKa.J((float)JPa.N, (float)(ura.Ha * (pqa.r - g)), (float)JPa.N);
        }
        v7 = a;
        v7.body.C((float)h);
        v7.tailBase.C((float)h);
        v7.tailMiddle.C((float)h);
        v7.tailTip.C((float)h);
        v7.neck.C((float)h);
        v7.mane.C((float)h);
        if (d) ** GOTO lbl71
        uKa.D();
        uKa.e();
        v8 = g;
        v9 = MQa.L + v8 * v8 * MQa.L;
        uKa.l((float)v9, (float)v9, (float)v9);
        if (e <= JPa.N) {
            uKa.J((float)JPa.N, (float)(ura.Ha * (pqa.r - g)), (float)JPa.N);
            v10 = var8_15;
        } else {
            uKa.J((float)JPa.N, (float)(ATa.r * (pqa.r - g) * e + ura.Ha * (pqa.r - g) * (pqa.r - e)), (float)(VPa.i * (pqa.r - g) * e));
lbl71:
            // 2 sources

            v10 = var8_15;
        }
        if (v10 != 0) {
            v11 = a;
            v12 = v11;
            v11.muleLeftEar.C((float)h);
            v11.muleRightEar.C((float)h);
        } else {
            v13 = a;
            v12 = v13;
            v13.horseLeftEar.C((float)h);
            v13.horseRightEar.C((float)h);
        }
        v12.head.C((float)h);
        if (!d) {
            uKa.D();
        }
        if (b != 0) {
            v14 = a;
            v14.muleLeftChest.C((float)h);
            v14.muleRightChest.C((float)h);
        }
    }

    public ModelHorse() {
        ModelHorse a2;
        ModelHorse modelHorse = a2;
        modelHorse.textureWidth = XOa.h;
        modelHorse.textureHeight = XOa.h;
        ModelHorse modelHorse2 = a2;
        modelHorse.body = new cT((ModelBase)a2, uSa.E, Tpa.z);
        modelHorse.body.J(CRa.M, sOa.Z, cPa.Ka, NTa.C, NTa.C, osa.c);
        ModelHorse modelHorse3 = a2;
        modelHorse3.body.J(JPa.N, AQa.W, kPa.S);
        a2.tailBase = new cT((ModelBase)a2, Yqa.D, uSa.E);
        modelHorse3.tailBase.J(vqa.T, vqa.T, JPa.N, uqa.g, uqa.g, yRa.d);
        ModelHorse modelHorse4 = a2;
        modelHorse4.tailBase.J(JPa.N, vQa.q, bsa.la);
        modelHorse4.J(modelHorse4.tailBase, LQa.w, JPa.N, JPa.N);
        modelHorse4.tailMiddle = new cT((ModelBase)a2, ISa.E, XTa.W);
        modelHorse4.tailMiddle.J(FRa.ca, dua.ca, vQa.q, yRa.d, AQa.P, XTa.W);
        ModelHorse modelHorse5 = a2;
        modelHorse5.tailMiddle.J(JPa.N, vQa.q, bsa.la);
        modelHorse5.J(modelHorse5.tailMiddle, LQa.w, JPa.N, JPa.N);
        modelHorse5.tailTip = new cT((ModelBase)a2, osa.c, yRa.d);
        modelHorse5.tailTip.J(FRa.ca, EQa.G, kPa.S, yRa.d, AQa.P, XTa.W);
        ModelHorse modelHorse6 = a2;
        modelHorse6.tailTip.J(JPa.N, vQa.q, bsa.la);
        modelHorse6.J(modelHorse6.tailTip, xra.Z, JPa.N, JPa.N);
        modelHorse6.backLeftLeg = new cT((ModelBase)a2, RQa.b, ITa.A);
        modelHorse6.backLeftLeg.J(Ppa.Ha, dua.ca, Ppa.Ha, AQa.P, WOa.fa, tTa.h);
        ModelHorse modelHorse7 = a2;
        modelHorse7.backLeftLeg.J(YSa.G, kPa.S, AQa.W);
        a2.backLeftShin = new cT((ModelBase)a2, RQa.b, iSa.x);
        modelHorse7.backLeftShin.J(dua.ca, JPa.N, FRa.ca, yRa.d, tTa.h, yRa.d);
        ModelHorse modelHorse8 = a2;
        modelHorse8.backLeftShin.J(YSa.G, Yra.i, AQa.W);
        a2.backLeftHoof = new cT((ModelBase)a2, RQa.b, cPa.Q);
        modelHorse8.backLeftHoof.J(Ppa.Ha, Mqa.B, dua.ca, AQa.P, yRa.d, AQa.P);
        ModelHorse modelHorse9 = a2;
        modelHorse9.backLeftHoof.J(YSa.G, Yra.i, AQa.W);
        a2.backRightLeg = new cT((ModelBase)a2, zua.m, ITa.A);
        modelHorse9.backRightLeg.J(FRa.ca, dua.ca, Ppa.Ha, AQa.P, WOa.fa, tTa.h);
        ModelHorse modelHorse10 = a2;
        modelHorse10.backRightLeg.J(NQa.m, kPa.S, AQa.W);
        a2.backRightShin = new cT((ModelBase)a2, zua.m, iSa.x);
        modelHorse10.backRightShin.J(vqa.T, JPa.N, FRa.ca, yRa.d, tTa.h, yRa.d);
        ModelHorse modelHorse11 = a2;
        modelHorse11.backRightShin.J(NQa.m, Yra.i, AQa.W);
        a2.backRightHoof = new cT((ModelBase)a2, zua.m, cPa.Q);
        modelHorse11.backRightHoof.J(FRa.ca, Mqa.B, dua.ca, AQa.P, yRa.d, AQa.P);
        ModelHorse modelHorse12 = a2;
        modelHorse12.backRightHoof.J(NQa.m, Yra.i, AQa.W);
        a2.frontLeftLeg = new cT((ModelBase)a2, Yqa.D, ITa.A);
        modelHorse12.frontLeftLeg.J(AQa.d, vqa.T, Fua.N, yRa.d, Yqa.i, AQa.P);
        ModelHorse modelHorse13 = a2;
        modelHorse13.frontLeftLeg.J(YSa.G, kPa.S, sOa.Z);
        a2.frontLeftShin = new cT((ModelBase)a2, Yqa.D, kra.U);
        modelHorse13.frontLeftShin.J(AQa.d, JPa.N, eua.n, yRa.d, tTa.h, yRa.d);
        ModelHorse modelHorse14 = a2;
        modelHorse14.frontLeftShin.J(YSa.G, Yra.i, sOa.Z);
        a2.frontLeftHoof = new cT((ModelBase)a2, Yqa.D, cPa.Q);
        modelHorse14.frontLeftHoof.J(kpa.fa, Mqa.B, Fua.N, AQa.P, yRa.d, AQa.P);
        ModelHorse modelHorse15 = a2;
        modelHorse15.frontLeftHoof.J(YSa.G, Yra.i, sOa.Z);
        a2.frontRightLeg = new cT((ModelBase)a2, Psa.M, ITa.A);
        modelHorse15.frontRightLeg.J(zua.w, vqa.T, Fua.N, yRa.d, Yqa.i, AQa.P);
        ModelHorse modelHorse16 = a2;
        modelHorse16.frontRightLeg.J(NQa.m, kPa.S, sOa.Z);
        a2.frontRightShin = new cT((ModelBase)a2, Psa.M, kra.U);
        modelHorse16.frontRightShin.J(zua.w, JPa.N, eua.n, yRa.d, tTa.h, yRa.d);
        ModelHorse modelHorse17 = a2;
        modelHorse17.frontRightShin.J(NQa.m, Yra.i, sOa.Z);
        a2.frontRightHoof = new cT((ModelBase)a2, Psa.M, cPa.Q);
        modelHorse17.frontRightHoof.J(eua.n, Mqa.B, Fua.N, AQa.P, yRa.d, AQa.P);
        ModelHorse modelHorse18 = a2;
        modelHorse18.frontRightHoof.J(NQa.m, Yra.i, sOa.Z);
        a2.head = new cT((ModelBase)a2, uSa.E, uSa.E);
        modelHorse18.head.J(Ppa.Ha, Cra.fa, FRa.ca, tTa.h, tTa.h, XTa.W);
        ModelHorse modelHorse19 = a2;
        modelHorse19.head.J(JPa.N, YSa.G, Cra.fa);
        modelHorse19.J(modelHorse19.head, fqa.U, JPa.N, JPa.N);
        modelHorse19.field_178711_b = new cT((ModelBase)a2, osa.c, yOa.B);
        modelHorse19.field_178711_b.J(dua.ca, Cra.fa, NQa.d, AQa.P, yRa.d, uua.p);
        ModelHorse modelHorse20 = a2;
        modelHorse20.field_178711_b.J(JPa.N, YSa.T, Cra.fa);
        modelHorse20.J(modelHorse20.field_178711_b, fqa.U, JPa.N, JPa.N);
        modelHorse20.field_178712_c = new cT((ModelBase)a2, osa.c, Lra.e);
        modelHorse20.field_178712_c.J(dua.ca, NQa.d, BPa.I, AQa.P, uqa.g, tTa.h);
        ModelHorse modelHorse21 = a2;
        modelHorse21.field_178712_c.J(JPa.N, YSa.G, Cra.fa);
        modelHorse21.J(modelHorse21.field_178712_c, fqa.U, JPa.N, JPa.N);
        modelHorse21.head.J(a2.field_178711_b);
        modelHorse21.head.J(a2.field_178712_c);
        modelHorse21.horseLeftEar = new cT((ModelBase)a2, uSa.E, uSa.E);
        modelHorse21.horseLeftEar.J(KTa.r, csa.P, YSa.G, uqa.g, yRa.d, vRa.d);
        ModelHorse modelHorse22 = a2;
        modelHorse22.horseLeftEar.J(JPa.N, YSa.G, Cra.fa);
        modelHorse22.J(modelHorse22.horseLeftEar, fqa.U, JPa.N, JPa.N);
        modelHorse22.horseRightEar = new cT((ModelBase)a2, uSa.E, uSa.E);
        modelHorse22.horseRightEar.J(NQa.y, csa.P, YSa.G, uqa.g, yRa.d, vRa.d);
        ModelHorse modelHorse23 = a2;
        modelHorse23.horseRightEar.J(JPa.N, YSa.G, Cra.fa);
        modelHorse23.J(modelHorse23.horseRightEar, fqa.U, JPa.N, JPa.N);
        modelHorse23.muleLeftEar = new cT((ModelBase)a2, uSa.E, lqa.s);
        modelHorse23.muleLeftEar.J(dua.ca, FRa.B, YSa.G, uqa.g, XTa.W, vRa.d);
        ModelHorse modelHorse24 = a2;
        modelHorse24.muleLeftEar.J(JPa.N, YSa.G, Cra.fa);
        modelHorse24.J(modelHorse24.muleLeftEar, fqa.U, JPa.N, DPa.s);
        modelHorse24.muleRightEar = new cT((ModelBase)a2, uSa.E, lqa.s);
        modelHorse24.muleRightEar.J(JPa.N, FRa.B, YSa.G, uqa.g, XTa.W, vRa.d);
        ModelHorse modelHorse25 = a2;
        modelHorse25.muleRightEar.J(JPa.N, YSa.G, Cra.fa);
        modelHorse25.J(modelHorse25.muleRightEar, fqa.U, JPa.N, vTa.K);
        modelHorse25.neck = new cT((ModelBase)a2, uSa.E, lqa.s);
        modelHorse25.neck.J(cra.fa, uRa.q, dua.ca, AQa.P, hpa.Z, Yqa.i);
        ModelHorse modelHorse26 = a2;
        modelHorse26.neck.J(JPa.N, YSa.G, Cra.fa);
        modelHorse26.J(modelHorse26.neck, fqa.U, JPa.N, JPa.N);
        modelHorse26.muleLeftChest = new cT((ModelBase)a2, uSa.E, Tpa.z);
        modelHorse26.muleLeftChest.J(TOa.p, JPa.N, JPa.N, Yqa.i, Yqa.i, yRa.d);
        ModelHorse modelHorse27 = a2;
        modelHorse27.muleLeftChest.J(APa.D, vQa.q, FRa.Ga);
        modelHorse27.J(modelHorse27.muleLeftChest, JPa.N, jpa.f, JPa.N);
        modelHorse27.muleRightChest = new cT((ModelBase)a2, uSa.E, uOa.F);
        modelHorse27.muleRightChest.J(TOa.p, JPa.N, JPa.N, Yqa.i, Yqa.i, yRa.d);
        ModelHorse modelHorse28 = a2;
        modelHorse28.muleRightChest.J(Jta.r, vQa.q, FRa.Ga);
        modelHorse28.J(modelHorse28.muleRightChest, JPa.N, jpa.f, JPa.N);
        modelHorse28.horseSaddleBottom = new cT((ModelBase)a2, Fua.J, uSa.E);
        modelHorse28.horseSaddleBottom.J(CRa.M, JPa.N, TOa.p, NTa.C, vRa.d, Yqa.i);
        ModelHorse modelHorse29 = a2;
        modelHorse29.horseSaddleBottom.J(JPa.N, kta.v, kta.v);
        a2.horseSaddleFront = new cT((ModelBase)a2, Yra.j, WOa.fa);
        modelHorse29.horseSaddleFront.J(FRa.ca, vqa.T, TOa.p, yRa.d, vRa.d, uqa.g);
        ModelHorse modelHorse30 = a2;
        modelHorse30.horseSaddleFront.J(JPa.N, kta.v, kta.v);
        a2.horseSaddleBack = new cT((ModelBase)a2, Fua.J, WOa.fa);
        modelHorse30.horseSaddleBack.J(NQa.m, vqa.T, vQa.q, Yqa.i, vRa.d, uqa.g);
        ModelHorse modelHorse31 = a2;
        modelHorse31.horseSaddleBack.J(JPa.N, kta.v, kta.v);
        a2.horseLeftSaddleMetal = new cT((ModelBase)a2, bqa.Ga, uSa.E);
        modelHorse31.horseLeftSaddleMetal.J(vPa.b, lqa.ga, vqa.T, vRa.d, uqa.g, uqa.g);
        modelHorse4.horseLeftSaddleMetal.J(eua.C, vQa.q, kta.v);
        modelHorse4.horseLeftSaddleRope = new cT((ModelBase)a2, NPa.e, uSa.E);
        modelHorse4.horseLeftSaddleRope.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        ModelHorse modelHorse32 = a2;
        modelHorse32.horseLeftSaddleRope.J(eua.C, vQa.q, kta.v);
        a2.horseRightSaddleMetal = new cT((ModelBase)a2, bqa.Ga, AQa.P);
        modelHorse32.horseRightSaddleMetal.J(vPa.b, lqa.ga, vqa.T, vRa.d, uqa.g, uqa.g);
        ModelHorse modelHorse33 = a2;
        modelHorse33.horseRightSaddleMetal.J(CRa.M, vQa.q, kta.v);
        a2.horseRightSaddleRope = new cT((ModelBase)a2, Fua.J, uSa.E);
        modelHorse33.horseRightSaddleRope.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        ModelHorse modelHorse34 = a2;
        modelHorse34.horseRightSaddleRope.J(CRa.M, vQa.q, kta.v);
        a2.horseLeftFaceMetal = new cT((ModelBase)a2, bqa.Ga, uua.s);
        modelHorse34.horseLeftFaceMetal.J(Ira.d, sOa.Z, NQa.m, vRa.d, uqa.g, uqa.g);
        ModelHorse modelHorse35 = a2;
        modelHorse35.horseLeftFaceMetal.J(JPa.N, YSa.G, Cra.fa);
        modelHorse35.J(modelHorse35.horseLeftFaceMetal, fqa.U, JPa.N, JPa.N);
        modelHorse35.horseRightFaceMetal = new cT((ModelBase)a2, bqa.Ga, uua.s);
        modelHorse35.horseRightFaceMetal.J(Ppa.Ha, sOa.Z, NQa.m, vRa.d, uqa.g, uqa.g);
        ModelHorse modelHorse36 = a2;
        modelHorse36.horseRightFaceMetal.J(JPa.N, YSa.G, Cra.fa);
        modelHorse36.J(modelHorse36.horseRightFaceMetal, fqa.U, JPa.N, JPa.N);
        modelHorse36.horseLeftRein = new cT((ModelBase)a2, Yqa.D, NTa.C);
        modelHorse36.horseLeftRein.J(Zpa.o, NSa.b, NSa.b, uSa.E, yRa.d, ERa.C);
        ModelHorse modelHorse37 = a2;
        modelHorse37.horseLeftRein.J(JPa.N, YSa.G, Cra.fa);
        a2.horseRightRein = new cT((ModelBase)a2, Yqa.D, tTa.h);
        modelHorse37.horseRightRein.J(Wqa.V, NSa.b, NSa.b, uSa.E, yRa.d, ERa.C);
        ModelHorse modelHorse38 = a2;
        modelHorse38.horseRightRein.J(JPa.N, YSa.G, Cra.fa);
        a2.mane = new cT((ModelBase)a2, lQa.R, uSa.E);
        modelHorse38.mane.J(vqa.T, dua.B, eua.C, uqa.g, ERa.C, AQa.P);
        ModelHorse modelHorse39 = a2;
        modelHorse39.mane.J(JPa.N, YSa.G, Cra.fa);
        modelHorse39.J(modelHorse39.mane, fqa.U, JPa.N, JPa.N);
        modelHorse39.horseFaceRopes = new cT((ModelBase)a2, Fua.J, lqa.s);
        modelHorse39.horseFaceRopes.J(Ppa.Ha, JPa.b, NQa.d, tTa.h, tTa.h, lqa.s, psa.N);
        modelHorse39.horseFaceRopes.J(JPa.N, YSa.G, Cra.fa);
        modelHorse39.J(modelHorse39.horseFaceRopes, fqa.U, JPa.N, JPa.N);
    }
}

