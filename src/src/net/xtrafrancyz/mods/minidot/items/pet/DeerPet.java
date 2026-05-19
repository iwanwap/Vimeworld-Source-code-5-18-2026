/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Bpa
 *  Cra
 *  ERa
 *  Fpa
 *  JPa
 *  Js
 *  LQa
 *  NOa
 *  NQa
 *  Oz
 *  QSa
 *  SQa
 *  Spa
 *  TQa
 *  Tpa
 *  Usa
 *  XSa
 *  XTa
 *  YSa
 *  aPa
 *  asa
 *  bpa
 *  fpa
 *  fsa
 *  hra
 *  iPa
 *  isa
 *  kpa
 *  kqa
 *  kta
 *  lqa
 *  nQa
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  uRa
 *  vPa
 *  vQa
 *  vRa
 *  xOa
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class DeerPet
extends BasePet {
    private final Js rightHand;
    private final Js Piece1;
    private final Js leftLeg;
    private final Js body;
    private final Js leftHand;
    private final Js rightLeg;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        DeerPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        DeerPet deerPet = a2;
        deerPet.rightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v + d2 * Nra.e;
        deerPet.leftLeg.rotationX = -a2.rightLeg.rotationX;
        a2.Piece1.rotationX = c2.bipedHead.rotateAngleX / kta.v + psa.N;
        deerPet.Piece1.rotationY = c2.bipedHead.rotateAngleY + psa.N - d2 * Nra.e;
        deerPet.Piece1.rotationZ = c2.bipedHead.rotateAngleZ - b2 * kta.v;
        deerPet.leftHand.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * VPa.i;
        deerPet.leftHand.rotationY = -d2 * b2;
        deerPet.leftHand.rotationZ = d2 * b2 * kta.v;
        deerPet.rightHand.rotationX = -a2.leftHand.rotationX;
        deerPet.rightHand.rotationY = -a2.leftHand.rotationY;
        deerPet.rightHand.rotationZ = a2.leftHand.rotationZ;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        DeerPet a2 = this;
        uKa.J((float)JPa.N, (float)XSa.I, (float)JPa.N);
        super.J(b2);
    }

    public DeerPet() {
        DeerPet a2;
        DeerPet deerPet = a2;
        deerPet.disableAnimationInPreview = vRa.d;
        deerPet.textureWidth = ysa.s;
        deerPet.textureHeight = fPa.i;
        deerPet.J(SQa.e, uSa.E, uSa.E);
        deerPet.J(oqa.P, QSa.p, XTa.W);
        deerPet.J(ZSa.d, uSa.E, uSa.E);
        deerPet.J(fsa.Ka, Yqa.D, uSa.E);
        deerPet.J(ppa.Y, uSa.E, uSa.E);
        deerPet.J(vQa.f, uSa.E, uSa.E);
        deerPet.J(ATa.a, uSa.E, uSa.E);
        deerPet.J(wta.r, uSa.E, uSa.E);
        deerPet.J(TQa.T, uSa.E, uSa.E);
        deerPet.J(isa.n, uSa.E, uSa.E);
        deerPet.J(Iqa.h, uSa.E, uSa.E);
        deerPet.J(kqa.S, uSa.E, uSa.E);
        deerPet.J(sra.v, uSa.E, uSa.E);
        deerPet.J(CRa.e, uSa.E, uSa.E);
        deerPet.J(vPa.y, uSa.E, uSa.E);
        deerPet.J(Tpa.V, uSa.E, uSa.E);
        deerPet.J(ITa.M, uSa.E, uSa.E);
        deerPet.J(Lsa.o, uSa.E, uSa.E);
        deerPet.J(aPa.t, uSa.E, uSa.E);
        deerPet.J(xOa.r, uSa.E, uSa.E);
        deerPet.J(Upa.b, uSa.E, uSa.E);
        deerPet.J(fPa.E, osa.c, osa.c);
        deerPet.J(NOa.X, ERa.C, osa.c);
        DeerPet deerPet2 = a2;
        deerPet.body = new Js((ModelBase)a2, iSa.x, uua.s);
        deerPet.body.J(dua.ca, JPa.N, vqa.T, AQa.P, AQa.P, uqa.g);
        DeerPet deerPet3 = a2;
        deerPet3.body.J(JPa.N, JPa.N, JPa.N);
        a2.rightLeg = new Js((ModelBase)a2, uSa.E, ERa.C);
        deerPet3.rightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
        DeerPet deerPet4 = a2;
        deerPet4.rightLeg.J(vqa.T, YSa.G, JPa.N);
        deerPet4.rightLeg.J(vRa.d != 0);
        a2.leftLeg = new Js((ModelBase)a2, uSa.E, ERa.C);
        deerPet4.leftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
        DeerPet deerPet5 = a2;
        deerPet5.leftLeg.J(pqa.r, YSa.G, JPa.N);
        deerPet5.leftLeg.J(vRa.d != 0);
        a2.rightHand = new Js((ModelBase)a2, uSa.E, ERa.C);
        deerPet5.rightHand.J(dua.ca, vPa.b, vqa.T, uqa.g, AQa.P, uqa.g);
        DeerPet deerPet6 = a2;
        deerPet6.rightHand.J(dua.ca, pqa.r, JPa.N);
        deerPet6.rightHand.J(vRa.d != 0);
        a2.leftHand = new Js((ModelBase)a2, uSa.E, ERa.C);
        deerPet6.leftHand.J(JPa.N, vPa.b, vqa.T, uqa.g, AQa.P, uqa.g);
        DeerPet deerPet7 = a2;
        deerPet7.leftHand.J(kta.v, pqa.r, JPa.N);
        deerPet7.leftHand.J(vRa.d != 0);
        a2.Piece1 = new Js((ModelBase)a2, Usa.f);
        deerPet7.Piece1.J(WRa.q, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        a2.Piece1.J(kua.j, vqa.T, Xpa.N, pua.P, uqa.g, uqa.g, uqa.g);
        a2.Piece1.J(nQa.R, BRa.k, FRa.B, vqa.T, vRa.d, uqa.g, vRa.d);
        a2.Piece1.J(vQa.C, TOa.p, CRa.M, NSa.b, uua.p, AQa.P, yRa.d);
        a2.Piece1.J(Ata.q, YSa.G, hra.S, vqa.T, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(vua.L, lqa.ga, DPa.m, vqa.T, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(QTa.w, eua.C, fpa.ia, vqa.T, vRa.d, XTa.W, vRa.d);
        a2.Piece1.J(LQa.A, vQa.q, Lsa.A, vqa.T, vRa.d, tTa.h, vRa.d);
        a2.Piece1.J(iPa.g, YSa.G, kpa.G, vqa.T, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(kpa.ca, pqa.r, csa.P, vqa.T, vRa.d, AQa.P, vRa.d);
        a2.Piece1.J(Bra.f, kta.v, Jsa.o, vqa.T, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(QSa.J, dua.ca, csa.P, vqa.T, vRa.d, AQa.P, vRa.d);
        a2.Piece1.J(uRa.S, TOa.p, Jsa.o, vqa.T, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(uua.Fa, NSa.b, fpa.ia, vqa.T, vRa.d, XTa.W, vRa.d);
        a2.Piece1.J(Bua.X, BRa.k, kpa.G, vqa.T, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(fta.P, CRa.M, hra.S, vqa.T, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(zsa.Fa, NQa.m, Lsa.A, vqa.T, vRa.d, tTa.h, vRa.d);
        a2.Piece1.J(Fpa.D, CRa.M, kpa.G, vqa.T, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(Spa.r, sOa.Z, FRa.B, vqa.T, vRa.d, uqa.g, vRa.d);
        a2.Piece1.J(xOa.z, NQa.d, DPa.m, vqa.T, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(Fsa.Z, sOa.Z, kpa.G, vqa.T, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(asa.a, YSa.G, sOa.Z, vPa.b, yRa.d, AQa.P, uSa.E);
        a2.Piece1.J(STa.w, NQa.d, sOa.Z, vPa.b, yRa.d, AQa.P, uSa.E);
        DeerPet deerPet8 = a2;
        deerPet8.Piece1.J(vRa.d != 0);
        deerPet8.J(new ResourceLocation(Cra.V, Bpa.F));
    }
}

