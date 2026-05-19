/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Bsa
 *  Cra
 *  Cta
 *  Gua
 *  ISa
 *  JPa
 *  Js
 *  Lra
 *  NQa
 *  NTa
 *  Oz
 *  QSa
 *  Qqa
 *  Qsa
 *  Tpa
 *  XTa
 *  YSa
 *  Yra
 *  aSa
 *  cT
 *  fpa
 *  hra
 *  ju
 *  kpa
 *  kta
 *  lqa
 *  pPa
 *  pQa
 *  pqa
 *  uKa
 *  vQa
 *  vRa
 *  wOa
 *  wPa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class GrinchPet
extends BasePet {
    private final Js Legs;
    private final Js bone12;
    private final Js Hands;
    private final Js bone15;
    private final Js Torso2;
    private final Js LeftArm;
    private final Js RightArm;
    private final Js bone;
    private final Js bone13;
    private final Js Body;
    private final Js Hat;
    private final Js Torso;
    private final xB animation;
    private final Js bone14;
    private final Js bone3;
    private final Js BodyWithoutHands;
    private final Js LeftLeg;
    private final Js RightLeg;
    private final Js Belly;
    private final Js bone2;
    private final Js bone4;
    private final Js TheGrinch;
    private final Js Head;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        GrinchPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        GrinchPet grinchPet = a2;
        grinchPet.RightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v + f3;
        grinchPet.RightLeg.rotationY = b2 * kta.v;
        grinchPet.LeftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v - f3;
        grinchPet.LeftLeg.rotationZ = b2 * kta.v;
        grinchPet.LeftArm.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * Nra.e;
        grinchPet.LeftArm.rotationY = -d2 * b2 * kta.v;
        grinchPet.LeftArm.rotationZ = d2 * b2 * YSa.G;
        grinchPet.RightArm.rotationX = -a2.LeftArm.rotationX;
        grinchPet.RightArm.rotationY = -a2.LeftArm.rotationY;
        grinchPet.RightArm.rotationZ = a2.LeftArm.rotationZ;
    }

    @Override
    public void J(float f2) {
        GrinchPet a2;
        float b2 = f2;
        GrinchPet grinchPet = a2 = this;
        grinchPet.animation.J(b2);
        double d2 = fpa.K;
        uKa.J((double)d2, (double)d2, (double)d2);
        uKa.f((double)aSa.V, (double)Bsa.x, (double)aSa.V);
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        GrinchPet b2;
        float e2 = f2;
        GrinchPet grinchPet = b2 = this;
        super.f((ModelPlayer)d2, (Sx)c2, e2, (jU)a2);
        grinchPet.animation.J(e2);
        uKa.f((double)Qpa.Aa, (double)(Math.sin((double)e2 * fPa.ca) * tpa.k + tpa.k), (double)Qqa.b);
        double d3 = fpa.K;
        uKa.J((double)d3, (double)d3, (double)d3);
    }

    public GrinchPet() {
        GrinchPet a2;
        GrinchPet grinchPet = a2;
        grinchPet.textureWidth = ysa.s;
        grinchPet.textureHeight = ysa.s;
        GrinchPet grinchPet2 = a2;
        grinchPet.TheGrinch = new Js((ModelBase)a2);
        grinchPet.TheGrinch.J(pqa.r, vQa.q, JPa.N);
        grinchPet.Head = new Js((ModelBase)a2);
        grinchPet.Head.J(zpa.ja, Yra.V, kta.v);
        grinchPet.TheGrinch.J((cT)a2.Head);
        grinchPet.Head.cubeList.add(new AMa((cT)a2.Head, uSa.E, Lra.e, KQa.L, NQa.m, NQa.m, NTa.C, AQa.P, XTa.W, JPa.N, uSa.E != 0));
        a2.Head.cubeList.add(new AMa((cT)a2.Head, Zqa.G, XTa.W, pQa.s, sOa.Z, dua.ca, Yqa.i, XTa.W, tTa.h, tTa.z, uSa.E != 0));
        GrinchPet grinchPet3 = a2;
        a2.Hat = new Js((ModelBase)a2);
        grinchPet3.Hat.J(wOa.w, sSa.E, dua.ca);
        grinchPet3.Head.J((cT)a2.Hat);
        grinchPet3.bone = new Js((ModelBase)a2);
        grinchPet3.bone.J(JPa.N, yOa.Z, kta.v);
        grinchPet3.J(grinchPet3.bone, JPa.N, JPa.N, vRa.f);
        grinchPet3.Hat.J((cT)a2.bone);
        grinchPet3.bone.cubeList.add(new AMa((cT)a2.bone, uSa.E, uSa.E, NSa.b, vqa.T, NQa.m, NTa.C, yRa.d, WOa.fa, JPa.N, uSa.E != 0));
        GrinchPet grinchPet4 = a2;
        a2.bone2 = new Js((ModelBase)a2);
        grinchPet4.bone2.J(JPa.N, mPa.n, kta.v);
        grinchPet4.J(grinchPet4.bone2, JPa.N, JPa.N, vRa.f);
        grinchPet4.Hat.J((cT)a2.bone2);
        grinchPet4.bone2.cubeList.add(new AMa((cT)a2.bone2, Lra.e, kTa.j, NQa.m, TOa.p, TOa.p, XTa.W, tTa.h, XTa.W, JPa.N, uSa.E != 0));
        GrinchPet grinchPet5 = a2;
        a2.bone3 = new Js((ModelBase)a2);
        grinchPet5.bone3.J(JPa.N, Cta.p, kta.v);
        grinchPet5.J(grinchPet5.bone3, JPa.N, JPa.N, ZSa.ja);
        grinchPet5.Hat.J((cT)a2.bone3);
        grinchPet5.bone3.cubeList.add(new AMa((cT)a2.bone3, ITa.A, uSa.E, FRa.ca, JPa.N, vqa.T, pPa.f, yRa.d, uqa.g, JPa.N, uSa.E != 0));
        GrinchPet grinchPet6 = a2;
        a2.bone4 = new Js((ModelBase)a2);
        grinchPet6.bone4.J(JPa.N, Cta.p, kta.v);
        grinchPet6.J(grinchPet6.bone4, JPa.N, JPa.N, ZSa.ja);
        grinchPet6.Hat.J((cT)a2.bone4);
        grinchPet6.bone4.cubeList.add(new AMa((cT)a2.bone4, Tpa.z, Yqa.D, MTa.i, wOa.w, dua.ca, yRa.d, AQa.P, AQa.P, JPa.N, uSa.E != 0));
        GrinchPet grinchPet7 = a2;
        a2.Body = new Js((ModelBase)a2);
        grinchPet7.TheGrinch.J((cT)a2.Body);
        a2.BodyWithoutHands = new Js((ModelBase)a2);
        grinchPet7.Body.J((cT)a2.BodyWithoutHands);
        grinchPet7.Belly = new Js((ModelBase)a2);
        grinchPet7.BodyWithoutHands.J((cT)a2.Belly);
        grinchPet7.Belly.cubeList.add(new AMa((cT)a2.Belly, uSa.E, lqa.s, KSa.Y, Lsa.X, TOa.p, WOa.fa, XTa.W, Yqa.i, Nra.e, uSa.E != 0));
        GrinchPet grinchPet8 = a2;
        grinchPet8.Torso = new Js((ModelBase)grinchPet8);
        GrinchPet grinchPet9 = a2;
        grinchPet8.BodyWithoutHands.J((cT)grinchPet9.Torso);
        grinchPet9.Torso.cubeList.add(new AMa((cT)a2.Torso, uSa.E, ISa.E, CRa.M, Yra.V, vqa.T, Yqa.i, tTa.h, tTa.h, JPa.N, uSa.E != 0));
        GrinchPet grinchPet10 = a2;
        grinchPet10.Torso2 = new Js((ModelBase)grinchPet10);
        GrinchPet grinchPet11 = a2;
        grinchPet10.BodyWithoutHands.J((cT)grinchPet11.Torso2);
        grinchPet11.Torso2.cubeList.add(new AMa((cT)a2.Torso2, ITa.A, Zqa.G, CRa.M, hra.S, vqa.T, Yqa.i, uua.p, tTa.h, yta.n, uSa.E != 0));
        GrinchPet grinchPet12 = a2;
        a2.Legs = new Js((ModelBase)a2);
        grinchPet12.BodyWithoutHands.J((cT)a2.Legs);
        a2.RightLeg = new Js((ModelBase)a2);
        grinchPet12.RightLeg.J(TOa.p, Jsa.o, kta.v);
        grinchPet12.Legs.J((cT)a2.RightLeg);
        grinchPet12.bone14 = new Js((ModelBase)a2);
        grinchPet12.bone14.J(vQa.q, AQa.W, dua.ca);
        grinchPet12.RightLeg.J((cT)a2.bone14);
        grinchPet12.bone14.cubeList.add(new AMa((cT)a2.bone14, QSa.p, wOa.t, NQa.m, NQa.m, vqa.T, uqa.g, vRa.d, AQa.P, JPa.N, uSa.E != 0));
        GrinchPet grinchPet13 = a2;
        a2.bone13 = new Js((ModelBase)a2);
        grinchPet13.bone13.J(vQa.q, AQa.W, dua.ca);
        grinchPet13.RightLeg.J((cT)a2.bone13);
        grinchPet13.bone13.cubeList.add(new AMa((cT)a2.bone13, Yqa.i, QSa.p, NQa.m, kpa.G, pqa.r, uqa.g, WOa.fa, uqa.g, JPa.N, uSa.E != 0));
        GrinchPet grinchPet14 = a2;
        a2.LeftLeg = new Js((ModelBase)a2);
        grinchPet14.LeftLeg.J(pqa.r, Jsa.o, kta.v);
        grinchPet14.BodyWithoutHands.J((cT)a2.LeftLeg);
        grinchPet14.bone15 = new Js((ModelBase)a2);
        grinchPet14.bone15.J(vqa.T, AQa.W, dua.ca);
        grinchPet14.LeftLeg.J((cT)a2.bone15);
        grinchPet14.bone15.cubeList.add(new AMa((cT)a2.bone15, Yqa.D, QSa.p, JPa.N, NQa.m, vqa.T, uqa.g, vRa.d, AQa.P, JPa.N, uSa.E != 0));
        GrinchPet grinchPet15 = a2;
        a2.bone12 = new Js((ModelBase)a2);
        grinchPet15.bone12.J(vqa.T, AQa.W, dua.ca);
        grinchPet15.LeftLeg.J((cT)a2.bone12);
        grinchPet15.bone12.cubeList.add(new AMa((cT)a2.bone12, uSa.E, QSa.p, JPa.N, kpa.G, pqa.r, uqa.g, WOa.fa, uqa.g, JPa.N, uSa.E != 0));
        GrinchPet grinchPet16 = a2;
        a2.Hands = new Js((ModelBase)a2);
        grinchPet16.Body.J((cT)a2.Hands);
        a2.LeftArm = new Js((ModelBase)a2);
        grinchPet16.LeftArm.J(vQa.q, fpa.G, kta.v);
        grinchPet16.J(grinchPet16.LeftArm, JPa.N, JPa.N, Qsa.f);
        grinchPet16.Hands.J((cT)a2.LeftArm);
        grinchPet16.LeftArm.cubeList.add(new AMa((cT)a2.LeftArm, ITa.E, Yqa.D, JPa.N, vqa.T, vqa.T, uqa.g, hpa.Z, uqa.g, JPa.N, uSa.E != 0));
        GrinchPet grinchPet17 = a2;
        a2.RightArm = new Js((ModelBase)a2);
        grinchPet17.RightArm.J(CRa.M, fpa.G, kta.v);
        grinchPet17.J(grinchPet17.RightArm, JPa.N, JPa.N, Gua.U);
        grinchPet17.Hands.J((cT)a2.RightArm);
        grinchPet17.RightArm.cubeList.add(new AMa((cT)a2.RightArm, ITa.E, Yqa.D, dua.ca, vqa.T, vqa.T, uqa.g, hpa.Z, uqa.g, JPa.N, vRa.d != 0));
        super.J(new ResourceLocation(Cra.V, KQa.U));
        a2.animation = new ju(new ResourceLocation(Cra.V, wPa.X)).J(rta.P, (MDModel)a2);
    }
}

