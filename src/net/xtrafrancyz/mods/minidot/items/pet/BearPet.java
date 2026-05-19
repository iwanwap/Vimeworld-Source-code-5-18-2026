/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  FPa
 *  JPa
 *  Js
 *  Lqa
 *  NQa
 *  Oz
 *  QSa
 *  XTa
 *  YSa
 *  bpa
 *  kta
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class BearPet
extends BasePet {
    private final Js rightLeg;
    private final Js leftHand;
    private final Js leftLeg;
    private final Js rightHand;
    private final Js head;
    private final Js body;

    public BearPet() {
        BearPet a2;
        BearPet bearPet = a2;
        bearPet.textureWidth = ysa.s;
        bearPet.textureHeight = fPa.i;
        bearPet.disableAnimationInPreview = vRa.d;
        bearPet.J(Ora.i, uSa.E, uSa.E);
        bearPet.J(Fua.b, Yqa.i, XTa.W);
        bearPet.J(FRa.w, Yqa.i, XTa.W);
        BearPet bearPet2 = a2;
        bearPet.head = new Js((ModelBase)a2, FPa.b);
        bearPet.head.J(WRa.q, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        a2.head.J(QSa.H, vQa.q, Lqa.C, dua.ca, uqa.g, uqa.g, vRa.d);
        a2.head.J(xSa.T, CRa.M, Lqa.C, dua.ca, uqa.g, uqa.g, vRa.d);
        BearPet bearPet3 = a2;
        bearPet3.head.J(vRa.d != 0);
        a2.body = new Js((ModelBase)a2, kTa.j, kTa.j);
        bearPet3.body.J(dua.ca, JPa.N, vqa.T, AQa.P, AQa.P, uqa.g);
        BearPet bearPet4 = a2;
        bearPet4.leftHand = new Js((ModelBase)bearPet4, Yqa.D, osa.c);
        bearPet4.leftHand.J(JPa.N, vPa.b, vqa.T, uqa.g, AQa.P, uqa.g);
        BearPet bearPet5 = a2;
        bearPet5.leftHand.J(kta.v, pqa.r, JPa.N);
        bearPet5.leftHand.J(vRa.d != 0);
        a2.rightHand = new Js((ModelBase)a2, Yqa.D, osa.c);
        bearPet5.rightHand.J(dua.ca, vPa.b, vqa.T, uqa.g, AQa.P, uqa.g);
        BearPet bearPet6 = a2;
        bearPet6.rightHand.J(dua.ca, pqa.r, JPa.N);
        bearPet6.rightHand.J(vRa.d != 0);
        a2.leftLeg = new Js((ModelBase)a2, EPa.O, ITa.E);
        bearPet6.leftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
        BearPet bearPet7 = a2;
        bearPet7.leftLeg.J(pqa.r, YSa.G, JPa.N);
        bearPet7.leftLeg.J(vRa.d != 0);
        a2.rightLeg = new Js((ModelBase)a2, EPa.O, ITa.E);
        bearPet7.rightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
        BearPet bearPet8 = a2;
        bearPet8.rightLeg.J(vqa.T, YSa.G, JPa.N);
        bearPet8.rightLeg.J(vRa.d != 0);
        bearPet8.J(new ResourceLocation(Cra.V, XTa.v));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        BearPet a2 = this;
        float b2 = Oz.d((float)(d2 * Nra.e)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * Nra.e));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        BearPet bearPet = a2;
        bearPet.head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        bearPet.head.rotationY = c2.bipedHead.rotateAngleY + psa.N - d2 * Nra.e;
        bearPet.head.rotationZ = c2.bipedHead.rotateAngleZ;
        bearPet.rightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v + f3;
        bearPet.rightLeg.rotationY = b2 * kta.v;
        bearPet.leftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v - f3;
        bearPet.leftLeg.rotationZ = b2 * kta.v;
        bearPet.leftHand.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * Nra.e;
        bearPet.leftHand.rotationY = -d2 * b2 * kta.v;
        bearPet.leftHand.rotationZ = d2 * b2 * YSa.G;
        bearPet.rightHand.rotationX = -a2.leftHand.rotationX;
        bearPet.rightHand.rotationY = -a2.leftHand.rotationY;
        bearPet.rightHand.rotationZ = a2.leftHand.rotationZ;
    }
}

