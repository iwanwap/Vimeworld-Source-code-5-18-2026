/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Cta
 *  ERa
 *  Fpa
 *  JPa
 *  Js
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  PTa
 *  SRa
 *  Tpa
 *  Uta
 *  YSa
 *  bRa
 *  bpa
 *  bua
 *  dQa
 *  jsa
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class SkeletonPet
extends BasePet {
    private final Js rightLeg;
    private final Js body4;
    private final Js head;
    private final Js leftHand;
    private final Js body;
    private final Js quiver;
    private final Js leftLeg;
    private final Js rightHand;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        SkeletonPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        SkeletonPet skeletonPet = a2;
        skeletonPet.head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        skeletonPet.head.rotationY = c2.bipedHead.rotateAngleY + psa.N - d2 * Nra.e;
        skeletonPet.head.rotationZ = c2.bipedHead.rotateAngleZ;
        skeletonPet.rightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / vQa.q + f3 * vQa.q;
        skeletonPet.leftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / vQa.q + -f3 * vQa.q;
        skeletonPet.leftHand.rotationX = d2 * Nra.e;
        skeletonPet.leftHand.rotationY = -d2 * b2 * kta.v;
        skeletonPet.leftHand.rotationZ = d2 * b2 * YSa.G;
        skeletonPet.rightHand.rotationX = -a2.leftHand.rotationX - Xpa.R;
        skeletonPet.rightHand.rotationY = -a2.leftHand.rotationY;
        skeletonPet.rightHand.rotationZ = a2.leftHand.rotationZ;
    }

    public SkeletonPet() {
        SkeletonPet a2;
        SkeletonPet skeletonPet = a2;
        skeletonPet.disableAnimationInPreview = vRa.d;
        skeletonPet.textureWidth = ysa.s;
        skeletonPet.textureHeight = fPa.i;
        skeletonPet.J(zOa.ja, uSa.E, WOa.fa);
        skeletonPet.J(SRa.h, uSa.E, NTa.C);
        skeletonPet.J(Fsa.N, uSa.E, WOa.fa);
        skeletonPet.J(WPa.c, uSa.E, NTa.C);
        skeletonPet.J(jsa.o, uSa.E, Yqa.i);
        skeletonPet.J(Wqa.F, uSa.E, pPa.f);
        skeletonPet.J(xSa.Aa, AQa.P, ERa.C);
        skeletonPet.J(hpa.s, uSa.E, ERa.C);
        skeletonPet.J(FRa.p, uSa.E, ERa.C);
        skeletonPet.J(sqa.X, uSa.E, WOa.fa);
        SkeletonPet skeletonPet2 = a2;
        skeletonPet.head = new Js((ModelBase)a2, uSa.E, uSa.E);
        skeletonPet.head.J(NQa.m, sOa.Z, CRa.M, Yqa.i, Yqa.i, Yqa.i);
        SkeletonPet skeletonPet3 = a2;
        skeletonPet3.head.J(vRa.d != 0);
        a2.leftHand = new Js((ModelBase)a2, uSa.E, WOa.fa);
        skeletonPet3.leftHand.J(JPa.N, ATa.x, vPa.b, vRa.d, yRa.d, vRa.d);
        SkeletonPet skeletonPet4 = a2;
        skeletonPet4.leftHand.J(Ira.d, MQa.L, vPa.b);
        skeletonPet4.J(skeletonPet4.leftHand, Fpa.a, JPa.N, JPa.N);
        skeletonPet4.leftHand.J(vRa.d != 0);
        skeletonPet4.leftLeg = new Js((ModelBase)a2, uSa.E, WOa.fa);
        skeletonPet4.leftLeg.J(vPa.b, JPa.N, vPa.b, vRa.d, yRa.d, vRa.d);
        SkeletonPet skeletonPet5 = a2;
        skeletonPet5.leftLeg.J(pqa.r, eua.C, vPa.b);
        skeletonPet5.leftLeg.J(vRa.d != 0);
        a2.rightLeg = new Js((ModelBase)a2, yRa.d, pPa.f);
        skeletonPet5.rightLeg.J(vPa.b, JPa.N, vPa.b, vRa.d, yRa.d, vRa.d);
        SkeletonPet skeletonPet6 = a2;
        skeletonPet6.rightLeg.J(vqa.T, eua.C, vPa.b);
        skeletonPet6.rightLeg.J(vRa.d != 0);
        a2.quiver = new Js((ModelBase)a2, lqa.s, ERa.C);
        skeletonPet6.quiver.J(JPa.N, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
        SkeletonPet skeletonPet7 = a2;
        skeletonPet7.quiver.J(YSa.la, pPa.c, Nra.e);
        skeletonPet7.J(skeletonPet7.quiver, JPa.N, JPa.N, dQa.X);
        skeletonPet7.body = new Js((ModelBase)a2, Eqa.Z);
        skeletonPet7.body.J(wOa.Z, FRa.ca, JPa.N, vqa.T, uSa.E, uqa.g, vRa.d);
        a2.body.J(bua.ca, vPa.b, kta.v, JPa.N, vRa.d, uqa.g, uSa.E);
        a2.body.J(rua.v, FRa.ca, YSa.G, vqa.T, yRa.d, vRa.d, vRa.d);
        a2.body.J(opa.j, FRa.ca, JPa.N, vqa.T, vRa.d, vRa.d, uSa.E);
        a2.body.J(Lra.ga, Ira.d, JPa.N, vqa.T, uSa.E, uqa.g, vRa.d);
        a2.body.J(bRa.I, MQa.L, JPa.N, vqa.T, vRa.d, vRa.d, uSa.E);
        SkeletonPet skeletonPet8 = a2;
        skeletonPet8.J(skeletonPet8.body, JPa.N, JPa.N, JPa.N);
        a2.body4 = new Js((ModelBase)a2, uSa.E, NTa.C);
        skeletonPet8.body4.J(JPa.N, JPa.N, JPa.N, yRa.d, uqa.g, uSa.E);
        SkeletonPet skeletonPet9 = a2;
        skeletonPet9.body4.J(FRa.ca, JPa.N, JPa.N);
        a2.rightHand = new Js((ModelBase)a2, Uta.b);
        skeletonPet9.rightHand.J(FRa.ca, MQa.L, vPa.b);
        skeletonPet9.rightHand.J(rta.ba, vqa.T, Cta.J, dua.ca, vRa.d, vRa.d, yRa.d);
        a2.rightHand.J(Tpa.u, vqa.T, kta.v, pqa.r, vRa.d, vRa.d, vRa.d);
        a2.rightHand.J(Asa.A, vqa.T, kta.v, TOa.p, vRa.d, vRa.d, vRa.d);
        a2.rightHand.J(gQa.w, vqa.T, ATa.x, vPa.b, vRa.d, yRa.d, vRa.d);
        SkeletonPet skeletonPet10 = a2;
        skeletonPet10.J(skeletonPet10.rightHand, Fpa.a, JPa.N, JPa.N);
        skeletonPet10.rightHand.J(vRa.d != 0);
        skeletonPet10.J(new ResourceLocation(Cra.V, PTa.V));
    }
}

