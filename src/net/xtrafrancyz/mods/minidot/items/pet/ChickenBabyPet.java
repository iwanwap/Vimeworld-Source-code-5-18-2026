/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cra
 *  FTa
 *  JPa
 *  Js
 *  LQa
 *  Lqa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  QSa
 *  Qsa
 *  Sqa
 *  XTa
 *  YSa
 *  ZRa
 *  asa
 *  bpa
 *  kpa
 *  kta
 *  lqa
 *  nQa
 *  pPa
 *  pqa
 *  uKa
 *  uOa
 *  vPa
 *  vQa
 *  vRa
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class ChickenBabyPet
extends BasePet {
    private final Js LeftHand;
    private final Js RightLeg;
    private final Js LeftLeg;
    private final Js Hat;
    private final Js RightHand;

    public ChickenBabyPet() {
        ChickenBabyPet a2;
        ChickenBabyPet chickenBabyPet = a2;
        chickenBabyPet.textureWidth = ysa.s;
        chickenBabyPet.textureHeight = fPa.i;
        chickenBabyPet.J(Jqa.D, uSa.E, uSa.E);
        chickenBabyPet.J(QSa.Ha, WOa.fa, uua.p);
        chickenBabyPet.J(UOa.n, tua.U, uSa.E);
        chickenBabyPet.J(xSa.W, uua.s, Yqa.i);
        chickenBabyPet.J(vqa.B, vRa.d, osa.c);
        chickenBabyPet.J(FTa.V, yRa.d, ITa.E);
        chickenBabyPet.J(Iqa.v, uSa.E, kTa.g);
        chickenBabyPet.J(opa.O, yRa.d, ITa.E);
        chickenBabyPet.J(dsa.A, AQa.P, osa.c);
        chickenBabyPet.J(Sqa.p, yRa.d, ITa.E);
        chickenBabyPet.J(Lqa.ga, yRa.d, ITa.E);
        chickenBabyPet.J(ZRa.C, uSa.E, kTa.g);
        chickenBabyPet.J(Xpa.p, AQa.P, osa.c);
        ChickenBabyPet chickenBabyPet2 = a2;
        chickenBabyPet.Hat = new Js((ModelBase)a2, uSa.Z);
        chickenBabyPet.Hat.J(vQa.C, Ura.T, JPa.N, JPa.N, XTa.W, AQa.P, Yqa.i);
        a2.Hat.J(kua.j, Ppa.Ha, vqa.T, lqa.ga, tTa.h, vRa.d, uqa.g);
        a2.Hat.J(kpa.ca, Ura.T, NSa.b, JPa.N, XTa.W, uua.p, tTa.h);
        a2.Hat.J(Bra.f, uSa.l, JPa.N, Qsa.k, tTa.h, yRa.d, vRa.d);
        a2.Hat.J(LQa.A, LRa.P, NQa.m, TOa.p, tTa.h, uqa.g, yRa.d);
        ChickenBabyPet chickenBabyPet3 = a2;
        chickenBabyPet3.RightHand = new Js((ModelBase)chickenBabyPet3, NTa.C, uSa.E);
        chickenBabyPet3.RightHand.J(dua.ca, vqa.T, JPa.N, uqa.g, uqa.g, AQa.P);
        ChickenBabyPet chickenBabyPet4 = a2;
        chickenBabyPet4.RightHand.J(Ura.T, pqa.r, kta.v);
        chickenBabyPet4.RightHand.J(vRa.d != 0);
        a2.LeftHand = new Js((ModelBase)a2, NTa.C, uSa.E);
        chickenBabyPet4.LeftHand.J(JPa.N, vqa.T, JPa.N, uqa.g, uqa.g, AQa.P);
        ChickenBabyPet chickenBabyPet5 = a2;
        chickenBabyPet5.LeftHand.J(Bpa.w, pqa.r, kta.v);
        chickenBabyPet5.LeftHand.J(vRa.d != 0);
        a2.RightLeg = new Js((ModelBase)a2, zsa.K);
        chickenBabyPet5.RightLeg.J(dua.ca, YSa.G, Jta.r);
        chickenBabyPet5.RightLeg.J(Bua.X, Ppa.Ha, YSa.G, Ppa.Ha, AQa.P, vRa.d, AQa.P);
        a2.RightLeg.J(vua.L, vPa.b, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        ChickenBabyPet chickenBabyPet6 = a2;
        chickenBabyPet6.RightLeg.J(vRa.d != 0);
        a2.LeftLeg = new Js((ModelBase)a2, cTa.ja);
        chickenBabyPet6.LeftLeg.J(kta.v, YSa.G, Jta.r);
        chickenBabyPet6.LeftLeg.J(asa.a, FRa.ca, YSa.G, Ppa.Ha, AQa.P, vRa.d, AQa.P);
        a2.LeftLeg.J(nQa.R, vPa.b, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        ChickenBabyPet chickenBabyPet7 = a2;
        chickenBabyPet7.LeftLeg.J(vRa.d != 0);
        chickenBabyPet7.J(new ResourceLocation(Cra.V, uOa.z));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        void a2;
        ChickenBabyPet chickenBabyPet = this;
        float b2 = Oz.d((float)(a2 * Jta.w)) * Yqa.C;
        float f3 = Oz.C((float)(a2 * Nra.e));
        float d2 = JPa.N;
        if (a2 % UOa.d > SPa.b) {
            d2 = Oz.C((float)(a2 % UOa.d * VPa.i + Xpa.R)) * pPa.c;
        }
        uKa.l((float)xSa.la, (float)xSa.la, (float)xSa.la);
        uKa.J((float)VPa.i, (float)KQa.C, (float)VPa.i);
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(f3 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        ChickenBabyPet chickenBabyPet2 = chickenBabyPet;
        chickenBabyPet2.LeftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v;
        chickenBabyPet2.RightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v;
        chickenBabyPet2.LeftHand.rotationY = -d2;
        chickenBabyPet2.RightHand.rotationY = d2;
    }
}

