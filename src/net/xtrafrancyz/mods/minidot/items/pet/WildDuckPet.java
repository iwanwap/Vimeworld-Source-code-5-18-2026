/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
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
 *  Qsa
 *  Qta
 *  Sqa
 *  XTa
 *  Xsa
 *  YSa
 *  ZRa
 *  asa
 *  bpa
 *  iPa
 *  kpa
 *  kta
 *  lqa
 *  nQa
 *  pPa
 *  pqa
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

public final class WildDuckPet
extends BasePet {
    private final Js RightHand;
    private final Js LeftLeg;
    private final Js Hat;
    private final Js RightLeg;
    private final Js LeftHand;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        void a2;
        WildDuckPet wildDuckPet = this;
        float b2 = Oz.d((float)(a2 * Jta.w)) * Yqa.C;
        float f3 = Oz.C((float)(a2 * Nra.e));
        float d2 = JPa.N;
        if (a2 % UOa.d > SPa.b) {
            d2 = Oz.C((float)(a2 % UOa.d * VPa.i + Xpa.R)) * pPa.c;
        }
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(f3 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        WildDuckPet wildDuckPet2 = wildDuckPet;
        wildDuckPet2.LeftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v;
        wildDuckPet2.RightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v;
        wildDuckPet2.LeftHand.rotationY = -d2;
        wildDuckPet2.RightHand.rotationY = d2;
    }

    public WildDuckPet() {
        WildDuckPet a2;
        WildDuckPet wildDuckPet = a2;
        wildDuckPet.textureWidth = ysa.s;
        wildDuckPet.textureHeight = fPa.i;
        wildDuckPet.J(Jqa.D, Fsa.d, hpa.Z);
        wildDuckPet.J(QSa.Ha, WOa.fa, uua.p);
        wildDuckPet.J(UOa.n, tua.U, uSa.E);
        wildDuckPet.J(xSa.W, uua.s, Yqa.i);
        wildDuckPet.J(vqa.B, uSa.E, yta.Ka);
        wildDuckPet.J(Qra.b, uSa.E, uua.s);
        wildDuckPet.J(Qta.P, uSa.E, uua.s);
        wildDuckPet.J(FTa.V, yRa.d, ITa.E);
        wildDuckPet.J(Iqa.v, uSa.E, kTa.g);
        wildDuckPet.J(opa.O, yRa.d, ITa.E);
        wildDuckPet.J(dsa.A, AQa.P, osa.c);
        wildDuckPet.J(Sqa.p, yRa.d, ITa.E);
        wildDuckPet.J(Lqa.ga, yRa.d, ITa.E);
        wildDuckPet.J(ZRa.C, uSa.E, kTa.g);
        wildDuckPet.J(Xpa.p, AQa.P, osa.c);
        WildDuckPet wildDuckPet2 = a2;
        wildDuckPet.Hat = new Js((ModelBase)a2, uSa.Z);
        wildDuckPet.Hat.J(vQa.C, Ura.T, JPa.N, JPa.N, XTa.W, AQa.P, Yqa.i);
        a2.Hat.J(kua.j, Ppa.Ha, vqa.T, lqa.ga, tTa.h, vRa.d, uqa.g);
        a2.Hat.J(kpa.ca, Ura.T, NSa.b, JPa.N, XTa.W, uua.p, tTa.h);
        a2.Hat.J(Bra.f, uSa.l, JPa.N, Qsa.k, tTa.h, yRa.d, vRa.d);
        a2.Hat.J(LQa.A, XTa.s, NQa.m, TOa.p, tTa.h, uqa.g, yRa.d);
        a2.Hat.J(iPa.g, vQa.w, NQa.m, pqa.r, vRa.d, vRa.d, vRa.d);
        a2.Hat.J(Ata.q, Tqa.p, NQa.m, pqa.r, vRa.d, vRa.d, vRa.d);
        WildDuckPet wildDuckPet3 = a2;
        wildDuckPet3.RightHand = new Js((ModelBase)wildDuckPet3, NTa.C, uSa.E);
        wildDuckPet3.RightHand.J(dua.ca, vqa.T, JPa.N, uqa.g, uqa.g, AQa.P);
        WildDuckPet wildDuckPet4 = a2;
        wildDuckPet4.RightHand.J(Ura.T, kta.v, kta.v);
        wildDuckPet4.RightHand.J(vRa.d != 0);
        a2.LeftHand = new Js((ModelBase)a2, NTa.C, uSa.E);
        wildDuckPet4.LeftHand.J(JPa.N, vqa.T, JPa.N, uqa.g, uqa.g, AQa.P);
        WildDuckPet wildDuckPet5 = a2;
        wildDuckPet5.LeftHand.J(Bpa.w, kta.v, kta.v);
        wildDuckPet5.LeftHand.J(vRa.d != 0);
        a2.RightLeg = new Js((ModelBase)a2, zsa.K);
        wildDuckPet5.RightLeg.J(dua.ca, YSa.G, Jta.r);
        wildDuckPet5.RightLeg.J(Fsa.ca, MQa.L, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.RightLeg.J(Bua.X, FRa.ca, YSa.G, FRa.ca, yRa.d, vRa.d, yRa.d);
        a2.RightLeg.J(STa.w, FRa.ca, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.RightLeg.J(vua.L, vPa.b, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        WildDuckPet wildDuckPet6 = a2;
        wildDuckPet6.RightLeg.J(vRa.d != 0);
        a2.LeftLeg = new Js((ModelBase)a2, cTa.ja);
        wildDuckPet6.LeftLeg.J(kta.v, YSa.G, Jta.r);
        wildDuckPet6.LeftLeg.J(yQa.g, FRa.ca, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.LeftLeg.J(Xsa.B, MQa.L, YSa.G, Ura.T, vRa.d, vRa.d, uqa.g);
        a2.LeftLeg.J(asa.a, FRa.ca, YSa.G, FRa.ca, yRa.d, vRa.d, yRa.d);
        a2.LeftLeg.J(nQa.R, vPa.b, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        WildDuckPet wildDuckPet7 = a2;
        wildDuckPet7.LeftLeg.J(vRa.d != 0);
        wildDuckPet7.J(new ResourceLocation(Cra.V, MRa.h));
    }
}

