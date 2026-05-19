/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Cra
 *  FTa
 *  JPa
 *  Js
 *  LQa
 *  Lqa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  QSa
 *  Sqa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  ZRa
 *  asa
 *  bpa
 *  iPa
 *  kpa
 *  kta
 *  nQa
 *  pPa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  yQa
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class ChickenPet
extends BasePet {
    private final Js RightLeg;
    private final Js RightHand;
    private final Js Hat;
    private final Js LeftLeg;
    private final Js LeftHand;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        void a2;
        ChickenPet chickenPet = this;
        float b2 = Oz.d((float)(a2 * Jta.w)) * Yqa.C;
        float f3 = Oz.C((float)(a2 * Nra.e));
        float d2 = JPa.N;
        if (a2 % UOa.d > SPa.b) {
            d2 = Oz.C((float)(a2 % UOa.d * VPa.i + Xpa.R)) * pPa.c;
        }
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(f3 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        ChickenPet chickenPet2 = chickenPet;
        chickenPet2.LeftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v;
        chickenPet2.RightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v;
        chickenPet2.LeftHand.rotationY = -d2;
        chickenPet2.RightHand.rotationY = d2;
    }

    public ChickenPet() {
        ChickenPet a2;
        ChickenPet chickenPet = a2;
        chickenPet.textureWidth = ysa.s;
        chickenPet.textureHeight = fPa.i;
        chickenPet.J(Jqa.D, uSa.E, uSa.E);
        chickenPet.J(QSa.Ha, WOa.fa, uua.p);
        chickenPet.J(UOa.n, tua.U, uSa.E);
        chickenPet.J(xSa.W, uSa.E, uua.s);
        chickenPet.J(vqa.B, vRa.d, osa.c);
        chickenPet.J(Qra.b, uqa.g, Ypa.A);
        chickenPet.J(FTa.V, yRa.d, ITa.E);
        chickenPet.J(Iqa.v, uSa.E, kTa.g);
        chickenPet.J(opa.O, yRa.d, ITa.E);
        chickenPet.J(dsa.A, AQa.P, osa.c);
        chickenPet.J(Sqa.p, yRa.d, ITa.E);
        chickenPet.J(Lqa.ga, yRa.d, ITa.E);
        chickenPet.J(ZRa.C, uSa.E, kTa.g);
        chickenPet.J(Xpa.p, AQa.P, osa.c);
        ChickenPet chickenPet2 = a2;
        chickenPet.Hat = new Js((ModelBase)a2, uSa.Z);
        chickenPet.Hat.J(vQa.C, Ura.T, JPa.N, JPa.N, XTa.W, AQa.P, XTa.W);
        a2.Hat.J(kua.j, Ppa.Ha, JPa.N, BRa.k, tTa.h, AQa.P, vRa.d);
        a2.Hat.J(kpa.ca, Ura.T, NSa.b, JPa.N, XTa.W, uua.p, tTa.h);
        a2.Hat.J(Bra.f, vqa.T, sOa.Z, MQa.L, uqa.g, uqa.g, AQa.P);
        a2.Hat.J(LQa.A, vqa.T, NQa.m, TOa.p, uqa.g, uqa.g, yRa.d);
        a2.Hat.J(iPa.g, vqa.T, dua.ca, dua.ca, uqa.g, uqa.g, uqa.g);
        ChickenPet chickenPet3 = a2;
        chickenPet3.RightHand = new Js((ModelBase)chickenPet3, NTa.C, uSa.E);
        chickenPet3.RightHand.J(dua.ca, vqa.T, JPa.N, uqa.g, uqa.g, AQa.P);
        ChickenPet chickenPet4 = a2;
        chickenPet4.RightHand.J(Ura.T, kta.v, kta.v);
        chickenPet4.RightHand.J(vRa.d != 0);
        a2.LeftHand = new Js((ModelBase)a2, NTa.C, uSa.E);
        chickenPet4.LeftHand.J(JPa.N, vqa.T, JPa.N, uqa.g, uqa.g, AQa.P);
        ChickenPet chickenPet5 = a2;
        chickenPet5.LeftHand.J(Bpa.w, kta.v, kta.v);
        chickenPet5.LeftHand.J(vRa.d != 0);
        a2.RightLeg = new Js((ModelBase)a2, zsa.K);
        chickenPet5.RightLeg.J(dua.ca, YSa.G, Jta.r);
        chickenPet5.RightLeg.J(Fsa.ca, MQa.L, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.RightLeg.J(Bua.X, FRa.ca, YSa.G, FRa.ca, yRa.d, vRa.d, yRa.d);
        a2.RightLeg.J(STa.w, FRa.ca, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.RightLeg.J(vua.L, vPa.b, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        ChickenPet chickenPet6 = a2;
        chickenPet6.RightLeg.J(vRa.d != 0);
        a2.LeftLeg = new Js((ModelBase)a2, cTa.ja);
        chickenPet6.LeftLeg.J(kta.v, YSa.G, Jta.r);
        chickenPet6.LeftLeg.J(yQa.g, FRa.ca, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.LeftLeg.J(Xsa.B, MQa.L, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.LeftLeg.J(asa.a, FRa.ca, YSa.G, FRa.ca, yRa.d, vRa.d, yRa.d);
        a2.LeftLeg.J(nQa.R, vPa.b, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        ChickenPet chickenPet7 = a2;
        chickenPet7.LeftLeg.J(vRa.d != 0);
        chickenPet7.J(new ResourceLocation(Cra.V, Bra.x));
    }
}

