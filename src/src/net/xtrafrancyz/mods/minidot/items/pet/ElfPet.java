/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  LQa
 *  NQa
 *  Oz
 *  SQa
 *  TQa
 *  Usa
 *  YSa
 *  bpa
 *  fsa
 *  iPa
 *  isa
 *  kPa
 *  kpa
 *  kta
 *  lqa
 *  oqa
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

public final class ElfPet
extends BasePet {
    private final Js hair;
    private final Js leftHand;
    private final Js leftLeg;
    private final Js rightHand;
    private final Js rightLeg;
    private final Js Piece1;
    private final Js body;

    public ElfPet() {
        ElfPet a2;
        ElfPet elfPet = a2;
        elfPet.textureWidth = ysa.s;
        elfPet.textureHeight = fPa.i;
        elfPet.J(SQa.e, uSa.E, uSa.E);
        elfPet.J(fsa.Ka, uSa.E, uSa.E);
        elfPet.J(oqa.P, uSa.E, uSa.E);
        elfPet.J(isa.n, uSa.E, uSa.E);
        elfPet.J(Iqa.h, uSa.E, uSa.E);
        elfPet.J(wta.r, uSa.E, uSa.E);
        elfPet.J(TQa.T, uSa.E, uSa.E);
        ElfPet elfPet2 = a2;
        elfPet.body = new Js((ModelBase)a2, uSa.E, ERa.C);
        elfPet.body.J(dua.ca, JPa.N, vqa.T, AQa.P, uua.p, uqa.g);
        ElfPet elfPet3 = a2;
        elfPet3.body.J(vRa.d != 0);
        a2.rightHand = new Js((ModelBase)a2, uSa.E, osa.c);
        elfPet3.rightHand.J(dua.ca, vqa.T, vqa.T, uqa.g, uua.p, uqa.g);
        ElfPet elfPet4 = a2;
        elfPet4.rightHand.J(dua.ca, kta.v, JPa.N);
        elfPet4.rightHand.J(vRa.d != 0);
        a2.leftHand = new Js((ModelBase)a2, WOa.fa, osa.c);
        elfPet4.leftHand.J(JPa.N, vqa.T, vqa.T, uqa.g, uua.p, uqa.g);
        ElfPet elfPet5 = a2;
        elfPet5.leftHand.J(kta.v, kta.v, JPa.N);
        elfPet5.leftHand.J(vRa.d != 0);
        a2.rightLeg = new Js((ModelBase)a2, EPa.O, yta.Ka);
        elfPet5.rightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, uua.p, uqa.g);
        ElfPet elfPet6 = a2;
        elfPet6.rightLeg.J(vqa.T, lqa.ga, JPa.N);
        a2.leftLeg = new Js((ModelBase)a2, yOa.B, yta.Ka);
        elfPet6.leftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, uua.p, uqa.g);
        ElfPet elfPet7 = a2;
        elfPet7.leftLeg.J(pqa.r, lqa.ga, JPa.N);
        a2.hair = new Js((ModelBase)a2, fPa.i, uSa.E);
        elfPet7.hair.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        ElfPet elfPet8 = a2;
        elfPet8.hair.J(vRa.d != 0);
        elfPet8.hair.scaleModifier = isa.W;
        a2.Piece1 = new Js((ModelBase)a2, Usa.f);
        elfPet8.Piece1.mirror = vRa.d;
        elfPet8.Piece1.J(WRa.q, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        a2.Piece1.J(vQa.C, kPa.I, CRa.M, JPa.N, vRa.d, uqa.g, uqa.g);
        a2.Piece1.J(kua.j, kPa.I, NQa.m, vqa.T, vRa.d, uqa.g, uqa.g);
        a2.Piece1.J(kpa.ca, kPa.I, CRa.M, kta.v, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Bra.f, Era.Ga, CRa.M, JPa.N, vRa.d, uqa.g, uqa.g);
        a2.Piece1.J(LQa.A, Era.Ga, NQa.m, vqa.T, vRa.d, uqa.g, uqa.g);
        a2.Piece1.J(iPa.g, Era.Ga, CRa.M, kta.v, vRa.d, vRa.d, vRa.d);
        ElfPet elfPet9 = a2;
        elfPet9.Piece1.J(vRa.d != 0);
        elfPet9.J(new ResourceLocation(Cra.V, Jqa.Z));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        ElfPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.l((float)ATa.r, (float)ATa.r, (float)ATa.r);
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        ElfPet elfPet = a2;
        elfPet.Piece1.rotationY = c2.bipedHead.rotateAngleY + psa.N;
        elfPet.Piece1.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        elfPet.Piece1.rotationZ = c2.bipedHead.rotateAngleZ;
        elfPet.hair.rotationX = a2.Piece1.rotationX;
        elfPet.hair.rotationY = a2.Piece1.rotationY;
        elfPet.hair.rotationZ = a2.Piece1.rotationZ;
        elfPet.rightLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / MTa.y + f3 * vQa.q;
        elfPet.leftLeg.rotationX = c2.bipedRightLeg.rotateAngleX / MTa.y + -f3 * vQa.q;
        elfPet.leftLeg.rotationZ = b2 * eua.C;
        elfPet.leftHand.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * Nra.e;
        elfPet.leftHand.rotationY = -d2 * b2 * kta.v;
        elfPet.leftHand.rotationZ = d2 * b2 * YSa.G;
        elfPet.rightHand.rotationX = -a2.leftHand.rotationX;
        elfPet.rightHand.rotationY = -a2.leftHand.rotationY;
        elfPet.rightHand.rotationZ = a2.leftHand.rotationZ;
    }
}

