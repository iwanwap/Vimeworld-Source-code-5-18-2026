/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Cra
 *  ERa
 *  JPa
 *  JSa
 *  Js
 *  LQa
 *  Lqa
 *  Lra
 *  MQa
 *  NPa
 *  NQa
 *  Oz
 *  PTa
 *  QSa
 *  Qsa
 *  Qta
 *  RQa
 *  SQa
 *  SRa
 *  TPa
 *  TQa
 *  URa
 *  VQa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  Ysa
 *  ZRa
 *  aPa
 *  aSa
 *  asa
 *  bua
 *  cQa
 *  cRa
 *  hTa
 *  hqa
 *  hra
 *  iPa
 *  isa
 *  kPa
 *  kpa
 *  kta
 *  lPa
 *  lqa
 *  nQa
 *  oqa
 *  pPa
 *  pqa
 *  pua
 *  uKa
 *  uRa
 *  vQa
 *  vRa
 *  wOa
 *  wra
 *  yQa
 *  yra
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class PinataPet
extends BasePet {
    private final Js FLLeg;
    private final Js BLLeg;
    private final Js FRLeg;
    private final Js BRLeg;
    private final Js Body;

    @Override
    public void J(float f2) {
        float b2 = f2;
        PinataPet a2 = this;
        uKa.l((float)isa.W, (float)isa.W, (float)isa.W);
        uKa.J((float)JPa.N, (float)UOa.W, (float)JPa.N);
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        PinataPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        d2 = Oz.d((float)(d2 * Nra.e)) * Yqa.C;
        uKa.l((float)NPa.B, (float)NPa.B, (float)NPa.B);
        uKa.J((float)MQa.L, (float)(SQa.w + b2), (float)Xpa.R);
        PinataPet pinataPet = a2;
        pinataPet.BRLeg.offsetY = -d2 / kta.v;
        pinataPet.FLLeg.offsetY = -d2 / kta.v;
        pinataPet.FRLeg.offsetY = d2 / kta.v;
        pinataPet.BLLeg.offsetY = d2 / kta.v;
        pinataPet.BRLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / lqa.ga;
        pinataPet.FLLeg.rotationX = a2.BRLeg.rotationX;
        pinataPet.BLLeg.rotationX = c2.bipedRightLeg.rotateAngleX / lqa.ga;
        pinataPet.FRLeg.rotationX = a2.BLLeg.rotationX;
    }

    public PinataPet() {
        PinataPet a2;
        PinataPet pinataPet = a2;
        pinataPet.textureWidth = ysa.s;
        pinataPet.textureHeight = fPa.i;
        pinataPet.J(Jqa.R, lQa.R, uSa.E);
        pinataPet.J(RQa.X, lQa.R, tTa.h);
        pinataPet.J(zpa.l, Bpa.Z, uSa.E);
        pinataPet.J(NPa.f, Bpa.Z, uSa.E);
        pinataPet.J(bua.R, lQa.R, uSa.E);
        pinataPet.J(Ysa.v, lQa.R, tTa.h);
        pinataPet.J(Jpa.o, lQa.R, uSa.E);
        pinataPet.J(hqa.b, lQa.R, tTa.h);
        pinataPet.J(eua.k, Bpa.Z, uSa.E);
        pinataPet.J(Jsa.a, lQa.R, uSa.E);
        pinataPet.J(PQa.V, lQa.R, tTa.h);
        pinataPet.J(aPa.ja, Bpa.Z, uSa.E);
        pinataPet.J(lPa.j, yta.Ka, wOa.t);
        pinataPet.J(uua.S, uSa.E, yta.Ka);
        pinataPet.J(SRa.N, Psa.M, ERa.C);
        pinataPet.J(ppa.g, Upa.D, WOa.fa);
        pinataPet.J(nua.X, LQa.c, uqa.g);
        pinataPet.J(cRa.C, EPa.O, uSa.E);
        pinataPet.J(oqa.W, tua.U, wOa.h);
        pinataPet.J(ERa.Da, Qsa.Ha, uua.s);
        pinataPet.J(hTa.O, uSa.E, uSa.E);
        pinataPet.J(opa.v, QSa.p, cQa.o);
        pinataPet.J(nua.I, QSa.p, cQa.o);
        pinataPet.J(UOa.Z, Psa.M, ERa.C);
        pinataPet.J(ySa.ja, cQa.o, osa.c);
        pinataPet.J(VQa.F, Upa.D, lqa.s);
        pinataPet.J(vRa.r, tua.U, yOa.B);
        pinataPet.J(sOa.C, TQa.ca, uSa.E);
        pinataPet.J(rRa.p, Lra.e, AQa.P);
        pinataPet.J(zua.a, AQa.ba, uSa.E);
        pinataPet.J(Fsa.Aa, cQa.o, yRa.d);
        pinataPet.J(PQa.a, Ypa.A, ITa.A);
        pinataPet.J(opa.L, uSa.E, osa.c);
        pinataPet.J(Ypa.K, Ypa.A, osa.c);
        pinataPet.J(bsa.L, yOa.B, ERa.C);
        pinataPet.J(kra.I, osa.c, wOa.t);
        pinataPet.J(yra.Q, yOa.B, lqa.s);
        pinataPet.J(pqa.x, uSa.E, pPa.f);
        pinataPet.J(IPa.u, pPa.f, lqa.s);
        pinataPet.J(TPa.u, Lra.e, WOa.fa);
        pinataPet.J(ysa.S, Fsa.d, lqa.s);
        pinataPet.J(nqa.p, kTa.g, uua.s);
        pinataPet.J(qsa.W, QSa.p, uSa.E);
        pinataPet.J(vRa.i, kTa.g, ERa.C);
        pinataPet.J(aSa.s, QSa.p, uSa.E);
        PinataPet pinataPet2 = a2;
        pinataPet.BLLeg = new Js((ModelBase)a2, pua.I);
        pinataPet.BLLeg.J(JPa.N, JPa.N, JPa.N);
        pinataPet.J(pinataPet.BLLeg, JPa.N, JPa.N, JPa.N);
        pinataPet.BLLeg.mirror = vRa.d;
        pinataPet.BLLeg.J(kpa.E, pqa.r, kta.v, kta.v, uqa.g, yRa.d, vRa.d);
        a2.BLLeg.J(fqa.T, pqa.r, vQa.q, vQa.q, uqa.g, uqa.g, vRa.d);
        a2.BLLeg.J(uRa.S, pqa.r, kta.v, vQa.q, vRa.d, vRa.d, vRa.d);
        PinataPet pinataPet3 = a2;
        a2.BRLeg = new Js((ModelBase)a2, hra.Aa);
        pinataPet3.BRLeg.J(JPa.N, JPa.N, JPa.N);
        pinataPet3.J(pinataPet3.BRLeg, JPa.N, JPa.N, JPa.N);
        pinataPet3.BRLeg.mirror = vRa.d;
        pinataPet3.BRLeg.J(xra.Y, TOa.p, kta.v, vQa.q, vRa.d, vRa.d, vRa.d);
        a2.BRLeg.J(SPa.B, NQa.m, kta.v, kta.v, uqa.g, yRa.d, vRa.d);
        a2.BRLeg.J(Xpa.V, NQa.m, vQa.q, vQa.q, uqa.g, uqa.g, vRa.d);
        PinataPet pinataPet4 = a2;
        a2.FLLeg = new Js((ModelBase)a2, kPa.P);
        pinataPet4.FLLeg.J(JPa.N, JPa.N, JPa.N);
        pinataPet4.J(pinataPet4.FLLeg, JPa.N, JPa.N, JPa.N);
        pinataPet4.FLLeg.mirror = vRa.d;
        pinataPet4.FLLeg.J(PQa.Ga, pqa.r, kta.v, NQa.m, uqa.g, yRa.d, vRa.d);
        a2.FLLeg.J(Eqa.fa, pqa.r, vQa.q, CRa.M, uqa.g, uqa.g, vRa.d);
        a2.FLLeg.J(zpa.o, pqa.r, kta.v, CRa.M, vRa.d, vRa.d, vRa.d);
        PinataPet pinataPet5 = a2;
        a2.FRLeg = new Js((ModelBase)a2, hpa.k);
        pinataPet5.FRLeg.J(JPa.N, JPa.N, JPa.N);
        pinataPet5.J(pinataPet5.FRLeg, JPa.N, JPa.N, JPa.N);
        pinataPet5.FRLeg.mirror = vRa.d;
        pinataPet5.FRLeg.J(ppa.D, NQa.m, kta.v, NQa.m, uqa.g, yRa.d, vRa.d);
        a2.FRLeg.J(FRa.b, NQa.m, vQa.q, CRa.M, uqa.g, uqa.g, vRa.d);
        a2.FRLeg.J(JSa.g, TOa.p, kta.v, CRa.M, vRa.d, vRa.d, vRa.d);
        PinataPet pinataPet6 = a2;
        a2.Body = new Js((ModelBase)a2, URa.K);
        pinataPet6.Body.J(JPa.N, JPa.N, JPa.N);
        pinataPet6.J(pinataPet6.Body, JPa.N, JPa.N, JPa.N);
        pinataPet6.Body.mirror = vRa.d;
        pinataPet6.Body.J(vQa.C, dua.ca, Jsa.o, NSa.b, vRa.d, uqa.g, uqa.g);
        a2.Body.J(kua.j, dua.ca, Lqa.C, Lqa.C, yRa.d, vRa.d, tTa.h);
        a2.Body.J(kpa.ca, TOa.p, TOa.p, CRa.M, vRa.d, yRa.d, vRa.d);
        a2.Body.J(Bra.f, dua.ca, JPa.N, vQa.q, yRa.d, vRa.d, vRa.d);
        a2.Body.J(LQa.A, dua.ca, sOa.Z, NSa.b, yRa.d, Yqa.i, yRa.d);
        a2.Body.J(iPa.g, vqa.T, TOa.p, YSa.G, vRa.d, vRa.d, uqa.g);
        a2.Body.J(Ata.q, dua.ca, NQa.m, kta.v, yRa.d, vRa.d, vRa.d);
        a2.Body.J(QTa.w, TOa.p, JPa.N, NQa.m, tTa.h, vRa.d, XTa.W);
        a2.Body.J(vua.L, TOa.p, TOa.p, NQa.m, tTa.h, yRa.d, Yqa.i);
        a2.Body.J(nQa.R, NQa.m, TOa.p, NQa.m, vRa.d, yRa.d, XTa.W);
        a2.Body.J(Bua.X, kta.v, TOa.p, NQa.m, vRa.d, yRa.d, XTa.W);
        a2.Body.J(asa.a, pqa.r, TOa.p, CRa.M, vRa.d, yRa.d, vRa.d);
        a2.Body.J(STa.w, TOa.p, NQa.m, NQa.m, tTa.h, vRa.d, uua.p);
        a2.Body.J(Fsa.ca, dua.ca, JPa.N, CRa.M, yRa.d, vRa.d, vRa.d);
        a2.Body.J(Xsa.B, vqa.T, NQa.m, vQa.q, vRa.d, vRa.d, vRa.d);
        a2.Body.J(yQa.g, TOa.p, dua.ca, YSa.G, tTa.h, vRa.d, vRa.d);
        a2.Body.J(PTa.Ga, dua.ca, dua.ca, eua.C, yRa.d, yRa.d, vRa.d);
        a2.Body.J(oua.R, vqa.T, pqa.r, eua.C, vRa.d, vRa.d, vRa.d);
        a2.Body.J(opa.Da, vqa.T, dua.ca, lqa.ga, vRa.d, yRa.d, vRa.d);
        a2.Body.J(eua.M, vqa.T, NSa.b, Cra.fa, vRa.d, vRa.d, vRa.d);
        a2.Body.J(LQa.p, dua.ca, sOa.Z, Cra.fa, yRa.d, uqa.g, AQa.P);
        a2.Body.J(TPa.J, dua.ca, NSa.b, Lqa.C, yRa.d, vRa.d, yRa.d);
        a2.Body.J(Qta.K, dua.ca, csa.P, NSa.b, vRa.d, vRa.d, vRa.d);
        a2.Body.J(zua.Ja, JPa.N, Jsa.o, NSa.b, vRa.d, uqa.g, uqa.g);
        a2.Body.J(uua.l, vqa.T, sOa.Z, TOa.p, vRa.d, vRa.d, uqa.g);
        a2.Body.J(ATa.Ka, vqa.T, Cra.fa, NQa.d, vRa.d, vRa.d, AQa.P);
        a2.Body.J(ZRa.m, vqa.T, Lqa.C, NQa.m, vRa.d, vRa.d, uqa.g);
        a2.Body.J(LRa.o, dua.ca, CRa.M, TOa.p, yRa.d, vRa.d, vRa.d);
        a2.Body.J(ySa.Aa, vqa.T, NSa.b, TOa.p, vRa.d, vRa.d, uqa.g);
        a2.Body.J(QSa.ga, vqa.T, NQa.d, TOa.p, vRa.d, vRa.d, vRa.d);
        a2.Body.J(osa.h, vqa.T, TOa.p, NQa.d, vRa.d, vRa.d, vRa.d);
        a2.Body.J(QSa.J, JPa.N, csa.P, NSa.b, vRa.d, vRa.d, vRa.d);
        a2.Body.J(wra.Ga, vqa.T, CRa.M, NQa.d, vRa.d, vRa.d, vRa.d);
        a2.J(new ResourceLocation(Cra.V, csa.I));
    }
}

