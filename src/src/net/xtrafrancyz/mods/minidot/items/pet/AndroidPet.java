/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  Js
 *  LQa
 *  NQa
 *  Oz
 *  Ppa
 *  SOa
 *  Spa
 *  Tpa
 *  XTa
 *  YSa
 *  bpa
 *  kPa
 *  kpa
 *  kta
 *  pPa
 *  pqa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  xOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class AndroidPet
extends BasePet {
    private final Js LeftHand;
    private final Js RightHand;
    private final Js Shape7;
    private final Js Head;
    private final Js LeftLeg;
    private final Js RightLeg;
    private final Js Shape6;

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float a2;
        ModelBase d2 = modelPlayer;
        AndroidPet c2 = this;
        float b2 = Oz.d((float)(a2 * Nra.e)) * WRa.e;
        a2 = Oz.C((float)(a2 * Nra.e));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(a2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        AndroidPet androidPet = c2;
        androidPet.Head.rotationY = ((ModelPlayer)d2).bipedHead.rotateAngleY;
        androidPet.LeftHand.rotationX = ((ModelPlayer)d2).bipedLeftArm.rotateAngleX / kta.v;
        androidPet.RightHand.rotationX = ((ModelPlayer)d2).bipedRightArm.rotateAngleX;
        androidPet.LeftLeg.rotationX = ((ModelPlayer)d2).bipedLeftLeg.rotateAngleX / kta.v;
        androidPet.RightLeg.rotationX = ((ModelPlayer)d2).bipedRightLeg.rotateAngleX / kta.v;
    }

    public AndroidPet() {
        AndroidPet a2;
        AndroidPet androidPet = a2;
        androidPet.textureWidth = ysa.s;
        androidPet.textureHeight = fPa.i;
        androidPet.disableAnimationInPreview = vRa.d;
        androidPet.J(Bua.B, Tpa.z, uSa.E);
        androidPet.J(SOa.E, uSa.E, uSa.E);
        androidPet.J(KQa.o, uSa.E, uSa.E);
        androidPet.J(fqa.Z, uSa.E, uSa.E);
        androidPet.J(xOa.o, uSa.E, uSa.E);
        AndroidPet androidPet2 = a2;
        androidPet.Shape6 = new Js((ModelBase)a2, uSa.E, wOa.t);
        androidPet.Shape6.J(TOa.p, JPa.N, Ppa.Ha, uua.p, vRa.d, tTa.h);
        AndroidPet androidPet3 = a2;
        androidPet3.Shape7 = new Js((ModelBase)androidPet3, uSa.E, uSa.E);
        androidPet3.Shape7.J(NQa.m, pqa.r, Ura.T, Yqa.i, Yqa.i, XTa.W);
        AndroidPet androidPet4 = a2;
        androidPet4.LeftHand = new Js((ModelBase)androidPet4, uSa.E, uSa.E);
        androidPet4.LeftHand.J(JPa.N, vqa.T, vqa.T, uqa.g, tTa.h, uqa.g);
        AndroidPet androidPet5 = a2;
        androidPet5.LeftHand.J(YSa.G, vQa.q, vPa.b);
        androidPet5.LeftHand.J(vRa.d != 0);
        a2.RightHand = new Js((ModelBase)a2, uSa.E, uSa.E);
        androidPet5.RightHand.J(dua.ca, vqa.T, vqa.T, uqa.g, tTa.h, uqa.g);
        AndroidPet androidPet6 = a2;
        androidPet6.RightHand.J(NQa.m, vQa.q, vPa.b);
        androidPet6.RightHand.J(vRa.d != 0);
        a2.Head = new Js((ModelBase)a2, Spa.fa);
        androidPet6.Head.J(vQa.C, NQa.m, NQa.m, Ura.T, Yqa.i, AQa.P, XTa.W);
        a2.Head.J(kua.j, kta.v, CRa.M, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.Head.J(kpa.ca, vQa.q, NSa.b, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.Head.J(Bra.f, TOa.p, CRa.M, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.Head.J(LQa.A, NQa.m, NSa.b, JPa.N, vRa.d, vRa.d, vRa.d);
        AndroidPet androidPet7 = a2;
        androidPet7.Head.J(vRa.d != 0);
        a2.LeftLeg = new Js((ModelBase)a2, uSa.E, uSa.E);
        androidPet7.LeftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g);
        AndroidPet androidPet8 = a2;
        androidPet8.LeftLeg.J(kta.v, kPa.S, vPa.b);
        androidPet8.LeftLeg.J(vRa.d != 0);
        a2.RightLeg = new Js((ModelBase)a2, uSa.E, uSa.E);
        androidPet8.RightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g);
        AndroidPet androidPet9 = a2;
        androidPet9.RightLeg.J(dua.ca, kPa.S, vPa.b);
        androidPet9.RightLeg.J(vRa.d != 0);
        androidPet9.J(new ResourceLocation(Cra.V, POa.T));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        AndroidPet a2 = this;
        uKa.J((float)JPa.N, (float)vua.G, (float)JPa.N);
        uKa.l((float)pPa.c, (float)pPa.c, (float)pPa.c);
        super.J(b2);
    }
}

