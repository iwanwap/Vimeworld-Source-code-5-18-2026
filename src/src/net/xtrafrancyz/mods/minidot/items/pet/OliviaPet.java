/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Cra
 *  Cta
 *  FPa
 *  Fpa
 *  ISa
 *  JPa
 *  Js
 *  Lqa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  Qta
 *  RPa
 *  SRa
 *  Spa
 *  Sqa
 *  TPa
 *  TQa
 *  Tpa
 *  URa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  Yra
 *  Zta
 *  aQa
 *  aSa
 *  aqa
 *  asa
 *  bpa
 *  fpa
 *  hTa
 *  hqa
 *  isa
 *  jRa
 *  jpa
 *  kPa
 *  kta
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  qta
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  wra
 *  xOa
 *  ysa
 *  zTa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class OliviaPet
extends BasePet {
    private final Js RightHand;
    private final Js Head;
    private final Js RightLeg;
    private final Js Body;
    private final Js LeftHand;
    private final Js LeftLeg;

    public OliviaPet() {
        OliviaPet a2;
        OliviaPet oliviaPet = a2;
        oliviaPet.disableAnimationInPreview = vRa.d;
        oliviaPet.textureWidth = XOa.h;
        oliviaPet.textureHeight = ysa.s;
        oliviaPet.useDisplayLists = vRa.d;
        oliviaPet.J(Bua.B, TQa.ca, uSa.E);
        oliviaPet.J(mSa.ca, uSa.E, uSa.E);
        oliviaPet.J(Ura.M, TQa.ca, uSa.E);
        oliviaPet.J(cTa.F, Tpa.z, EPa.O);
        oliviaPet.J(rRa.B, TQa.ca, lqa.s);
        oliviaPet.J(vRa.R, jRa.X, uSa.E);
        oliviaPet.J(ISa.K, Cra.S, wOa.t);
        oliviaPet.J(isa.b, TQa.ca, lqa.s);
        oliviaPet.J(jpa.Ka, csa.A, uSa.E);
        oliviaPet.J(Ypa.s, NPa.e, Yqa.i);
        oliviaPet.J(hqa.T, AQa.P, FPa.F);
        oliviaPet.J(GPa.D, uua.s, Bpa.Z);
        oliviaPet.J(ppa.s, AQa.P, FPa.F);
        oliviaPet.J(dua.K, iSa.ca, uSa.E);
        oliviaPet.J(Cta.Q, zTa.C, uSa.E);
        oliviaPet.J(Wqa.i, fPa.z, uSa.E);
        oliviaPet.J(tpa.Ga, ySa.T, wra.P);
        oliviaPet.J(xOa.f, lPa.p, Fsa.d);
        oliviaPet.J(Xsa.F, Fpa.ca, Yqa.D);
        oliviaPet.J(jRa.ca, Zta.Q, uSa.E);
        oliviaPet.J(vQa.E, iSa.ca, uSa.E);
        oliviaPet.J(VPa.L, zTa.C, uSa.E);
        oliviaPet.J(STa.o, fPa.z, uSa.E);
        oliviaPet.J(Yra.K, ySa.T, wra.P);
        oliviaPet.J(KQa.A, lPa.p, Fsa.d);
        oliviaPet.J(TPa.y, Fpa.ca, Yqa.D);
        oliviaPet.J(yRa.P, Zta.Q, uSa.E);
        oliviaPet.J(BRa.Ia, wOa.h, wra.P);
        oliviaPet.J(ISa.g, Vra.b, uSa.E);
        oliviaPet.J(Mqa.Q, zua.m, XTa.W);
        OliviaPet oliviaPet2 = a2;
        oliviaPet.Body = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
        oliviaPet.Body.J(dua.ca, eua.l, vqa.T, AQa.P, AQa.P, uqa.g);
        OliviaPet oliviaPet3 = a2;
        oliviaPet3.Body.J(vRa.d != 0);
        a2.LeftHand = new Js((ModelBase)a2, uSa.E, osa.c);
        oliviaPet3.LeftHand.J(JPa.N, vqa.T, vqa.T, uqa.g, AQa.P, uqa.g);
        OliviaPet oliviaPet4 = a2;
        oliviaPet4.LeftHand.J(kta.v, pqa.r, JPa.N);
        oliviaPet4.LeftHand.J(vRa.d != 0);
        a2.RightHand = new Js((ModelBase)a2, hpa.Z, yta.Ka);
        oliviaPet4.RightHand.J(dua.ca, vqa.T, vqa.T, uqa.g, AQa.P, uqa.g);
        OliviaPet oliviaPet5 = a2;
        oliviaPet5.RightHand.J(dua.ca, pqa.r, JPa.N);
        oliviaPet5.RightHand.J(vRa.d != 0);
        a2.LeftLeg = new Js((ModelBase)a2, hpa.Z, osa.c);
        oliviaPet5.LeftLeg.J(vqa.T, eua.l, vqa.T, uqa.g, AQa.P, uqa.g);
        OliviaPet oliviaPet6 = a2;
        oliviaPet6.LeftLeg.J(pqa.r, YSa.G, JPa.N);
        oliviaPet6.LeftLeg.J(vRa.d != 0);
        a2.RightLeg = new Js((ModelBase)a2, osa.c, osa.c);
        oliviaPet6.RightLeg.J(vqa.T, eua.l, vqa.T, uqa.g, AQa.P, uqa.g);
        OliviaPet oliviaPet7 = a2;
        oliviaPet7.RightLeg.J(vqa.T, YSa.G, JPa.N);
        oliviaPet7.RightLeg.J(vRa.d != 0);
        a2.Head = new Js((ModelBase)a2, Spa.fa);
        oliviaPet7.Head.J(vQa.C, vQa.q, oua.b, NQa.m, vRa.d, vRa.d, Yqa.i);
        a2.Head.J(TQa.h, NQa.m, Sqa.Fa, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        a2.Head.J(rRa.H, NQa.m, oua.b, NQa.m, XTa.W, vRa.d, Yqa.i);
        a2.Head.J(Qsa.i, NQa.m, kPa.Ga, NQa.m, AQa.P, vRa.d, Yqa.i);
        a2.Head.J(KPa.o, YSa.G, oua.b, TOa.p, vRa.d, yRa.d, XTa.W);
        a2.Head.J(Qta.R, YSa.G, oua.b, NQa.m, vRa.d, uqa.g, vRa.d);
        a2.Head.J(Ypa.M, CRa.M, fpa.Ca, CRa.M, Yqa.i, yRa.d, vRa.d);
        a2.Head.J(Bta.F, CRa.M, fpa.Ca, TOa.p, vRa.d, AQa.P, XTa.W);
        a2.Head.J(aqa.H, CRa.M, fpa.Ca, NQa.m, vRa.d, yRa.d, vRa.d);
        a2.Head.J(NTa.Aa, CRa.M, fpa.Ca, YSa.G, Yqa.i, AQa.P, vRa.d);
        a2.Head.J(xqa.w, pqa.r, fpa.Ca, Yua.S, yRa.d, yRa.d, vRa.d);
        a2.Head.J(DPa.E, vqa.T, oua.b, Yua.S, uqa.g, vRa.d, vRa.d);
        a2.Head.J(Yra.o, NQa.m, fpa.Ca, Yua.S, yRa.d, yRa.d, vRa.d);
        a2.Head.J(RPa.ha, YSa.G, fPa.A, TOa.p, vRa.d, uqa.g, vRa.d);
        a2.Head.J(nqa.B, Bpa.Ea, aQa.D, dua.ca, vRa.d, vRa.d, vRa.d);
        a2.Head.J(Yra.D, YSa.G, fPa.A, JPa.N, vRa.d, uqa.g, vRa.d);
        a2.Head.J(qta.t, YSa.G, fPa.A, pqa.r, vRa.d, yRa.d, yRa.d);
        a2.Head.J(opa.E, eua.C, NSa.b, pqa.r, yRa.d, uqa.g, uqa.g);
        a2.Head.J(Lqa.B, lqa.ga, NQa.m, pqa.r, uqa.g, vRa.d, uqa.g);
        a2.Head.J(aSa.I, Qsa.k, NQa.m, pqa.r, vRa.d, vRa.d, uqa.g);
        a2.Head.J(rSa.ia, CRa.M, fPa.A, TOa.p, vRa.d, uqa.g, vRa.d);
        a2.Head.J(XOa.N, vQa.k, aQa.D, dua.ca, vRa.d, vRa.d, vRa.d);
        a2.Head.J(URa.C, CRa.M, fPa.A, JPa.N, vRa.d, uqa.g, vRa.d);
        a2.Head.J(Xsa.Ha, CRa.M, fPa.A, pqa.r, vRa.d, yRa.d, yRa.d);
        a2.Head.J(asa.W, sOa.Z, NSa.b, pqa.r, yRa.d, uqa.g, uqa.g);
        a2.Head.J(Qta.W, sOa.Z, NQa.m, pqa.r, uqa.g, vRa.d, uqa.g);
        a2.Head.J(dua.o, Lqa.C, NQa.m, pqa.r, vRa.d, vRa.d, uqa.g);
        a2.Head.J(hTa.a, CRa.M, BPa.I, YSa.G, NTa.C, AQa.P, vRa.d);
        a2.Head.J(FPa.Z, vQa.q, oua.b, CRa.M, uqa.g, uqa.g, vRa.d);
        a2.Head.J(Yqa.P, vQa.q, oua.b, YSa.G, uqa.g, yRa.d, vRa.d);
        OliviaPet oliviaPet8 = a2;
        oliviaPet8.Head.J(vRa.d != 0);
        oliviaPet8.J(new ResourceLocation(Cra.V, SRa.Ja));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        OliviaPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        OliviaPet oliviaPet = a2;
        oliviaPet.Head.rotationY = c2.bipedHead.rotateAngleY + psa.N;
        oliviaPet.Head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        oliviaPet.Head.rotationZ = c2.bipedHead.rotateAngleZ;
        oliviaPet.RightLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / MTa.y + f3 * vQa.q;
        oliviaPet.LeftLeg.rotationX = c2.bipedRightLeg.rotateAngleX / MTa.y + -f3 * vQa.q;
        oliviaPet.LeftLeg.rotationZ = b2 * eua.C;
        oliviaPet.LeftHand.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * Nra.e;
        oliviaPet.LeftHand.rotationY = -d2 * b2 * kta.v;
        oliviaPet.LeftHand.rotationZ = d2 * b2 * YSa.G;
        oliviaPet.RightHand.rotationX = -a2.LeftHand.rotationX;
        oliviaPet.RightHand.rotationY = -a2.LeftHand.rotationY;
        oliviaPet.RightHand.rotationZ = a2.LeftHand.rotationZ;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        OliviaPet a2 = this;
        uKa.J((float)JPa.N, (float)Nra.e, (float)JPa.N);
        super.J(b2);
    }
}

