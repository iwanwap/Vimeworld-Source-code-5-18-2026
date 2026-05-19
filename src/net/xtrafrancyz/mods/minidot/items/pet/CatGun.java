/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Cra
 *  Cta
 *  EQa
 *  FPa
 *  JPa
 *  Js
 *  LQa
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  PTa
 *  Ppa
 *  RPa
 *  RQa
 *  Rua
 *  SOa
 *  Spa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  asa
 *  bpa
 *  bua
 *  cra
 *  fpa
 *  iPa
 *  jRa
 *  kPa
 *  kpa
 *  kta
 *  lPa
 *  lqa
 *  nQa
 *  pPa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  wra
 *  xOa
 *  yQa
 *  yra
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class CatGun
extends BasePet {
    private final Js Head;
    private final Js Body;
    private final Js RightLeg;
    private final Js Eyes;
    private final Js LeftLeg;
    private final Js LeftHand;
    private final Js RightHand;

    @Override
    public void J(float f2) {
        float b2 = f2;
        CatGun a2 = this;
        uKa.J((float)JPa.N, (float)cra.S, (float)JPa.N);
        super.J(b2);
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx, float f2) {
        float a2;
        ModelBase d2 = modelPlayer;
        CatGun c2 = this;
        float b2 = Oz.d((float)(a2 * Nra.e)) * WRa.e;
        a2 = Oz.C((float)(a2 * Nra.e));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(a2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        CatGun catGun = c2;
        catGun.Eyes.offsetY = ((ModelPlayer)d2).bipedHead.rotateAngleX * bua.T;
        catGun.Eyes.offsetX = -((ModelPlayer)d2).bipedHead.rotateAngleY * bua.T;
        catGun.LeftHand.rotationX = ((ModelPlayer)d2).bipedLeftArm.rotateAngleX / kta.v;
        catGun.RightHand.rotationX = ((ModelPlayer)d2).bipedRightArm.rotateAngleX;
        catGun.LeftLeg.rotationX = ((ModelPlayer)d2).bipedLeftLeg.rotateAngleX / kta.v;
        catGun.RightLeg.rotationX = ((ModelPlayer)d2).bipedRightLeg.rotateAngleX / kta.v;
    }

    public CatGun() {
        CatGun a2;
        CatGun catGun = a2;
        catGun.textureWidth = ysa.s;
        catGun.textureHeight = fPa.i;
        catGun.disableAnimationInPreview = vRa.d;
        catGun.J(wOa.s, uSa.E, NTa.C);
        catGun.J(Wqa.t, uSa.E, NTa.C);
        catGun.J(yRa.c, uua.p, NTa.C);
        catGun.J(lTa.E, Ypa.A, NTa.C);
        catGun.J(yra.Aa, uua.p, NTa.C);
        catGun.J(XTa.ca, Ypa.A, NTa.C);
        catGun.J(Bua.B, fPa.i, uSa.E);
        catGun.J(SOa.E, lQa.R, Ypa.A);
        catGun.J(KQa.o, jRa.q, Ypa.A);
        catGun.J(fqa.Z, uSa.E, yta.Ka);
        catGun.J(xOa.o, wra.P, Lra.e);
        catGun.J(vRa.ja, wra.P, wOa.h);
        catGun.J(fpa.V, wra.P, wOa.h);
        catGun.J(ppa.b, wra.P, wOa.h);
        catGun.J(lqa.V, wra.P, wOa.h);
        catGun.J(lqa.k, wra.P, wOa.h);
        catGun.J(QTa.Ja, wra.P, wOa.h);
        catGun.J(zOa.Ia, wra.P, wOa.h);
        catGun.J(fta.u, wra.P, wOa.h);
        catGun.J(qQa.G, Ypa.A, pPa.f);
        catGun.J(lPa.I, FPa.F, wOa.h);
        catGun.J(Rua.Ga, FPa.F, wOa.h);
        catGun.J(STa.j, Ypa.A, pPa.f);
        catGun.J(SOa.f, wra.P, yta.Ka);
        catGun.J(Vra.ha, wra.P, yta.Ka);
        CatGun catGun2 = a2;
        catGun.Body = new Js((ModelBase)a2, uSa.E, uSa.E);
        catGun.Body.J(Ura.T, JPa.N, Ppa.Ha, XTa.W, AQa.P, tTa.h);
        CatGun catGun3 = a2;
        a2.LeftHand = new Js((ModelBase)a2, gQa.Ia);
        catGun3.LeftHand.J(vQa.q, JPa.N, JPa.N);
        catGun3.LeftHand.J(Spa.h, MQa.L, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        CatGun catGun4 = a2;
        catGun4.LeftHand.J(vRa.d != 0);
        a2.RightHand = new Js((ModelBase)a2, sra.e);
        catGun4.RightHand.J(TOa.p, JPa.N, JPa.N);
        catGun4.RightHand.J(Cta.G, FRa.ca, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        CatGun catGun5 = a2;
        catGun5.RightHand.J(vRa.d != 0);
        a2.LeftLeg = new Js((ModelBase)a2, cTa.ja);
        catGun5.LeftLeg.J(kta.v, YSa.G, JPa.N);
        catGun5.LeftLeg.J(RQa.v, vqa.T, JPa.N, vqa.T, uqa.g, uqa.g, uqa.g);
        a2.LeftLeg.J(UTa.Q, vqa.T, kta.v, dua.ca, uqa.g, vRa.d, yRa.d);
        CatGun catGun6 = a2;
        catGun6.LeftLeg.J(vRa.d != 0);
        a2.RightLeg = new Js((ModelBase)a2, zsa.K);
        catGun6.RightLeg.J(dua.ca, YSa.G, JPa.N);
        catGun6.RightLeg.J(XOa.Ka, vqa.T, JPa.N, vqa.T, uqa.g, uqa.g, uqa.g);
        a2.RightLeg.J(uqa.T, vqa.T, kta.v, dua.ca, uqa.g, vRa.d, yRa.d);
        CatGun catGun7 = a2;
        catGun7.RightLeg.J(vRa.d != 0);
        a2.Head = new Js((ModelBase)a2, Spa.fa);
        catGun7.Head.J(vQa.C, EQa.G, NQa.d, Ura.T, WOa.fa, XTa.W, XTa.W);
        a2.Head.J(kua.j, dua.ca, JPa.N, MTa.y, uqa.g, yRa.d, vRa.d);
        a2.Head.J(kpa.ca, FRa.ca, NQa.m, EQa.G, yRa.d, uqa.g, vRa.d);
        a2.Head.J(Bra.f, KSa.Y, Jsa.o, Ppa.Ha, pPa.f, Yqa.i, XTa.W);
        a2.Head.J(LQa.A, KSa.Y, Jsa.o, Ura.T, pPa.f, AQa.P, vRa.d);
        a2.Head.J(iPa.g, EQa.G, Jsa.o, EQa.G, yRa.d, vRa.d, vRa.d);
        a2.Head.J(Ata.q, EQa.G, sOa.Z, EQa.G, yRa.d, vRa.d, vRa.d);
        a2.Head.J(QTa.w, KSa.Y, Jsa.o, EQa.G, vRa.d, AQa.P, vRa.d);
        a2.Head.J(vua.L, FRa.ca, Jsa.o, EQa.G, vRa.d, AQa.P, vRa.d);
        a2.Head.J(nQa.R, Ira.d, Jsa.o, EQa.G, yRa.d, vRa.d, vRa.d);
        a2.Head.J(Bua.X, Jta.r, Jsa.o, EQa.G, vRa.d, AQa.P, vRa.d);
        a2.Head.J(asa.a, Ira.d, sOa.Z, EQa.G, yRa.d, vRa.d, vRa.d);
        a2.Head.J(STa.w, MQa.L, Jsa.o, EQa.G, vRa.d, AQa.P, vRa.d);
        a2.Head.J(Fsa.ca, EQa.G, kpa.G, FRa.ca, yRa.d, vRa.d, uqa.g);
        a2.Head.J(Xsa.B, EQa.G, csa.P, vPa.b, yRa.d, vRa.d, vRa.d);
        a2.Head.J(yQa.g, Ira.d, csa.P, vPa.b, yRa.d, vRa.d, vRa.d);
        a2.Head.J(PTa.Ga, Ira.d, kpa.G, FRa.ca, yRa.d, vRa.d, uqa.g);
        CatGun catGun8 = a2;
        catGun8.Eyes = new Js((ModelBase)catGun8, kPa.R);
        catGun8.Eyes.J(oua.R, kta.v, KSa.Y, fpa.M, vRa.d, vRa.d, vRa.d);
        a2.Eyes.J(opa.Da, TOa.p, KSa.Y, fpa.M, vRa.d, vRa.d, vRa.d);
        CatGun catGun9 = a2;
        catGun9.Eyes.J(vRa.d != 0);
        catGun9.J(new ResourceLocation(Cra.V, RPa.n));
    }
}

