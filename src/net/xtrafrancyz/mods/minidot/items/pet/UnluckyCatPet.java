/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Bsa
 *  Cra
 *  EQa
 *  JPa
 *  JSa
 *  Js
 *  KTa
 *  LQa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  QSa
 *  SQa
 *  Usa
 *  Vua
 *  WSa
 *  XTa
 *  YSa
 *  Ypa
 *  Yra
 *  bua
 *  cQa
 *  cRa
 *  cra
 *  dpa
 *  hra
 *  kPa
 *  kpa
 *  kta
 *  lPa
 *  lqa
 *  pqa
 *  pua
 *  uKa
 *  uOa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class UnluckyCatPet
extends BasePet {
    private final Js BLLeg;
    private final Js Tooth2;
    private final Js Tail;
    private final Js Tooth1;
    private final Js Left_ear;
    private final Js Snout_bottom;
    private final Js Tongue;
    private final Js Snout_left;
    private final Js Snout_top;
    private final Js Nose;
    private final Js Right_eye;
    private final Js Right_ear;
    private final Js BRLeg;
    private final Js FRLeg;
    private final Js Left_eye;
    private final Js Snout_right;
    private final Js Head;
    private final Js FLLeg;
    private final Js Body;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        UnluckyCatPet a2 = this;
        float b2 = Oz.d((float)(d2 * Yqa.C)) * Yqa.C;
        float f3 = Oz.C((float)(d2 * Nra.e));
        d2 = Oz.d((float)(d2 * Nra.e)) * rta.o;
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)fqa.w);
        uKa.J((float)(f3 * kta.v), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        uKa.l((float)xSa.la, (float)xSa.la, (float)xSa.la);
        UnluckyCatPet unluckyCatPet = a2;
        unluckyCatPet.BRLeg.rotationX = c2.bipedLeftLeg.rotateAngleX;
        unluckyCatPet.FLLeg.rotationX = a2.BRLeg.rotationX;
        unluckyCatPet.FRLeg.rotationX = a2.BLLeg.rotationX = c2.bipedRightLeg.rotateAngleX;
        unluckyCatPet.Tail.rotationY = d2;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        UnluckyCatPet a2 = this;
        uKa.J((float)JPa.N, (float)cra.S, (float)SQa.w);
        super.J(b2);
    }

    public UnluckyCatPet() {
        UnluckyCatPet a2;
        UnluckyCatPet unluckyCatPet = a2;
        unluckyCatPet.textureWidth = ysa.s;
        unluckyCatPet.textureHeight = ysa.s;
        unluckyCatPet.useDisplayLists = vRa.d;
        unluckyCatPet.J(rSa.t, GPa.C, lqa.s);
        unluckyCatPet.J(JSa.q, iSa.x, lqa.s);
        unluckyCatPet.J(uqa.Aa, GPa.C, lqa.s);
        unluckyCatPet.J(IPa.c, iSa.x, lqa.s);
        unluckyCatPet.J(kpa.q, Upa.D, ITa.E);
        unluckyCatPet.J(bsa.i, iSa.x, Bpa.Ha);
        unluckyCatPet.J(WSa.D, iSa.x, ITa.E);
        unluckyCatPet.J(rSa.w, Upa.D, ITa.E);
        unluckyCatPet.J(Ura.r, iSa.x, Bpa.Ha);
        unluckyCatPet.J(DPa.Y, iSa.x, ITa.E);
        unluckyCatPet.J(ypa.F, yRa.d, Upa.D);
        unluckyCatPet.J(Jqa.Ka, hpa.Z, Upa.D);
        unluckyCatPet.J(Yra.U, cQa.o, KSa.x);
        UnluckyCatPet unluckyCatPet2 = a2;
        unluckyCatPet.Body = new Js((ModelBase)a2, uSa.E, ITa.E);
        unluckyCatPet.Body.J(Ura.T, NSa.b, YSa.G, XTa.W, Yqa.i, uua.s);
        UnluckyCatPet unluckyCatPet3 = a2;
        unluckyCatPet3.Head = new Js((ModelBase)unluckyCatPet3, NTa.C, uSa.E);
        unluckyCatPet3.Head.J(EQa.G, sOa.Z, JPa.N, WOa.fa, WOa.fa, AQa.P);
        UnluckyCatPet unluckyCatPet4 = a2;
        unluckyCatPet4.Left_eye = new Js((ModelBase)unluckyCatPet4, LQa.c, uSa.E);
        unluckyCatPet4.Left_eye.J(MQa.L, NQa.d, vqa.T, yRa.d, yRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet5 = a2;
        unluckyCatPet5.Right_eye = new Js((ModelBase)unluckyCatPet5, LQa.c, uua.p);
        unluckyCatPet5.Right_eye.J(Ura.T, NQa.d, vqa.T, yRa.d, yRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet6 = a2;
        unluckyCatPet6.Nose = new Js((ModelBase)unluckyCatPet6, uSa.E, tTa.h);
        unluckyCatPet6.Nose.J(vPa.b, CRa.M, vqa.T, vRa.d, vRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet7 = a2;
        unluckyCatPet7.Tooth1 = new Js((ModelBase)unluckyCatPet7, lPa.p, uua.p);
        unluckyCatPet7.Tooth1.J(FRa.ca, TOa.p, uOa.ba, vRa.d, vRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet8 = a2;
        unluckyCatPet8.Tooth2 = new Js((ModelBase)unluckyCatPet8, lPa.p, uSa.E);
        unluckyCatPet8.Tooth2.J(MQa.L, TOa.p, uOa.ba, vRa.d, vRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet9 = a2;
        unluckyCatPet9.Tongue = new Js((ModelBase)unluckyCatPet9, uSa.E, uSa.E);
        unluckyCatPet9.Tongue.J(FRa.ca, vqa.T, uOa.ba, yRa.d, vRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet10 = a2;
        unluckyCatPet10.Left_ear = new Js((ModelBase)unluckyCatPet10, QSa.p, uSa.E);
        unluckyCatPet10.Left_ear.J(Ira.d, Cra.fa, JPa.N, yRa.d, uqa.g, vRa.d);
        UnluckyCatPet unluckyCatPet11 = a2;
        unluckyCatPet11.Right_ear = new Js((ModelBase)unluckyCatPet11, QSa.p, uua.p);
        unluckyCatPet11.Right_ear.J(EQa.G, Cra.fa, JPa.N, yRa.d, uqa.g, vRa.d);
        UnluckyCatPet unluckyCatPet12 = a2;
        unluckyCatPet12.Snout_top = new Js((ModelBase)unluckyCatPet12, NTa.C, Ypa.A);
        unluckyCatPet12.Snout_top.J(Ppa.Ha, NQa.m, vqa.T, tTa.h, vRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet13 = a2;
        unluckyCatPet13.Snout_bottom = new Js((ModelBase)unluckyCatPet13, NTa.C, wOa.t);
        unluckyCatPet13.Snout_bottom.J(Ppa.Ha, JPa.N, vqa.T, tTa.h, vRa.d, vRa.d);
        UnluckyCatPet unluckyCatPet14 = a2;
        unluckyCatPet14.Snout_left = new Js((ModelBase)unluckyCatPet14, fPa.i, Ypa.A);
        unluckyCatPet14.Snout_left.J(MTa.y, NQa.m, vqa.T, uqa.g, tTa.h, vRa.d);
        UnluckyCatPet unluckyCatPet15 = a2;
        unluckyCatPet15.Snout_right = new Js((ModelBase)unluckyCatPet15, osa.c, Ypa.A);
        unluckyCatPet15.Snout_right.J(EQa.G, NQa.m, vqa.T, uqa.g, tTa.h, vRa.d);
        UnluckyCatPet unluckyCatPet16 = a2;
        a2.FRLeg = new Js((ModelBase)a2, hpa.k);
        unluckyCatPet16.FRLeg.J(Ppa.Ha, pqa.r, eua.C);
        unluckyCatPet16.FRLeg.J(vRa.d != 0);
        unluckyCatPet16.FRLeg.J(dpa.h, vqa.T, vQa.q, dua.ca, uqa.g, vRa.d, yRa.d);
        a2.FRLeg.J(bua.Z, vqa.T, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g);
        UnluckyCatPet unluckyCatPet17 = a2;
        a2.FLLeg = new Js((ModelBase)a2, kPa.P);
        unluckyCatPet17.FLLeg.J(MTa.y, pqa.r, eua.C);
        unluckyCatPet17.FLLeg.J(vRa.d != 0);
        unluckyCatPet17.FLLeg.J(zpa.H, vqa.T, vQa.q, dua.ca, uqa.g, vRa.d, yRa.d);
        a2.FLLeg.J(Usa.D, vqa.T, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g);
        UnluckyCatPet unluckyCatPet18 = a2;
        a2.BLLeg = new Js((ModelBase)a2, pua.I);
        unluckyCatPet18.BLLeg.J(MTa.y, pqa.r, Bpa.b);
        unluckyCatPet18.BLLeg.J(vRa.d != 0);
        unluckyCatPet18.BLLeg.J(cQa.Q, vqa.T, JPa.N, vPa.b, uqa.g, yRa.d, uqa.g);
        a2.BLLeg.J(KPa.a, vqa.T, vQa.q, FRa.ca, uqa.g, vRa.d, yRa.d);
        a2.BLLeg.J(Bpa.Aa, vqa.T, kpa.fa, FRa.ca, uqa.g, AQa.P, yRa.d);
        UnluckyCatPet unluckyCatPet19 = a2;
        a2.BRLeg = new Js((ModelBase)a2, hra.Aa);
        unluckyCatPet19.BRLeg.J(Ppa.Ha, pqa.r, Bpa.b);
        unluckyCatPet19.BRLeg.J(vRa.d != 0);
        unluckyCatPet19.BRLeg.J(Bsa.ca, vqa.T, JPa.N, vPa.b, uqa.g, yRa.d, uqa.g);
        a2.BRLeg.J(YSa.B, vqa.T, vQa.q, FRa.ca, uqa.g, vRa.d, yRa.d);
        a2.BRLeg.J(KTa.Ha, vqa.T, kpa.fa, FRa.ca, uqa.g, AQa.P, yRa.d);
        UnluckyCatPet unluckyCatPet20 = a2;
        a2.Tail = new Js((ModelBase)a2, Vua.S);
        unluckyCatPet20.Tail.J(JPa.N, EQa.G, gQa.ca);
        unluckyCatPet20.Tail.J(vRa.d != 0);
        unluckyCatPet20.Tail.J(APa.p, vPa.b, vPa.b, JPa.N, vRa.d, vRa.d, yRa.d);
        a2.Tail.J(LRa.fa, vPa.b, vPa.b, vQa.q, vRa.d, AQa.P, vRa.d);
        a2.Tail.J(wta.D, vPa.b, MTa.y, YSa.G, vRa.d, vRa.d, vRa.d);
        a2.J(new ResourceLocation(Cra.V, cRa.Da));
    }
}

