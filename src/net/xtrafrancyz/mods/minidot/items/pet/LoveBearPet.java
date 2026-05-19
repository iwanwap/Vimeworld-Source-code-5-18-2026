/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Bpa
 *  Cra
 *  EQa
 *  JPa
 *  Js
 *  LQa
 *  Lqa
 *  NQa
 *  NTa
 *  Ppa
 *  Qsa
 *  Tpa
 *  XTa
 *  Ysa
 *  aSa
 *  bpa
 *  cT
 *  fpa
 *  hqa
 *  hra
 *  kpa
 *  kta
 *  lqa
 *  pqa
 *  uKa
 *  vPa
 *  vRa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class LoveBearPet
extends BasePet {
    private final Js leg5;
    private final Js leg6;
    private final Js leg4;
    private final Js leg3;
    private final Js bone;
    private final Js bone2;
    private final Js bone3;
    private final Js body;
    private final Js head;

    @Override
    public void J(float f2) {
        float b2 = f2;
        LoveBearPet a2 = this;
        double d2 = Jra.A;
        uKa.J((double)d2, (double)d2, (double)d2);
        uKa.f((double)aSa.V, (double)Tqa.ja, (double)iSa.P);
        super.J(b2);
    }

    public LoveBearPet() {
        LoveBearPet a2;
        LoveBearPet loveBearPet = a2;
        loveBearPet.textureWidth = ysa.s;
        loveBearPet.textureHeight = ysa.s;
        LoveBearPet loveBearPet2 = a2;
        loveBearPet.head = new Js((ModelBase)a2);
        loveBearPet.head.J(JPa.N, Lsa.X, CRa.M);
        loveBearPet.head.cubeList.add(new AMa((cT)a2.head, uSa.E, yta.Ka, Ura.T, hra.S, JPa.N, XTa.W, XTa.W, XTa.W, JPa.N, uSa.E != 0));
        a2.head.cubeList.add(new AMa((cT)a2.head, wOa.h, yta.Ka, Ppa.Ha, kpa.G, TOa.p, tTa.h, yRa.d, yRa.d, JPa.N, uSa.E != 0));
        a2.head.cubeList.add(new AMa((cT)a2.head, Tpa.z, lqa.s, MTa.y, fpa.ia, kta.v, uqa.g, uqa.g, vRa.d, JPa.N, uSa.E != 0));
        a2.head.cubeList.add(new AMa((cT)a2.head, Tpa.z, lqa.s, EQa.G, fpa.ia, kta.v, uqa.g, uqa.g, vRa.d, JPa.N, uSa.E != 0));
        LoveBearPet loveBearPet3 = a2;
        a2.body = new Js((ModelBase)a2);
        loveBearPet3.body.J(kta.v, DPa.m, Fua.Y);
        loveBearPet3.body.cubeList.add(new AMa((cT)a2.body, uSa.E, uSa.E, NQa.d, DPa.m, hra.S, NTa.C, NTa.C, XTa.W, JPa.N, uSa.E != 0));
        LoveBearPet loveBearPet4 = a2;
        a2.leg3 = new Js((ModelBase)a2);
        loveBearPet4.leg3.J(Ppa.Ha, fpa.G, NQa.m);
        loveBearPet4.J(loveBearPet4.leg3, Bta.C, PRa.f, NTa.Ka);
        loveBearPet4.leg3.cubeList.add(new AMa((cT)a2.leg3, AQa.ba, ITa.E, dua.ca, JPa.N, vqa.T, AQa.P, WOa.fa, tTa.h, JPa.N, uSa.E != 0));
        LoveBearPet loveBearPet5 = a2;
        a2.leg4 = new Js((ModelBase)a2);
        loveBearPet5.leg4.J(MTa.y, fpa.G, NQa.m);
        loveBearPet5.J(loveBearPet5.leg4, Bta.C, fPa.ba, Ysa.Ga);
        loveBearPet5.leg4.cubeList.add(new AMa((cT)a2.leg4, AQa.ba, ITa.E, dua.ca, JPa.N, vqa.T, AQa.P, WOa.fa, tTa.h, JPa.N, vRa.d != 0));
        LoveBearPet loveBearPet6 = a2;
        a2.leg5 = new Js((ModelBase)a2);
        loveBearPet6.leg5.J(Bpa.w, bpa.Aa, JPa.N);
        loveBearPet6.J(loveBearPet6.leg5, Bta.C, fPa.ba, Ysa.Ga);
        loveBearPet6.leg5.cubeList.add(new AMa((cT)a2.leg5, AQa.ba, ITa.E, dua.ca, JPa.N, vqa.T, AQa.P, WOa.fa, tTa.h, JPa.N, vRa.d != 0));
        LoveBearPet loveBearPet7 = a2;
        a2.leg6 = new Js((ModelBase)a2);
        loveBearPet7.leg6.J(Ura.T, bpa.Aa, JPa.N);
        loveBearPet7.J(loveBearPet7.leg6, Bta.C, PRa.f, NTa.Ka);
        loveBearPet7.leg6.cubeList.add(new AMa((cT)a2.leg6, AQa.ba, ITa.E, dua.ca, JPa.N, vqa.T, AQa.P, WOa.fa, tTa.h, JPa.N, uSa.E != 0));
        LoveBearPet loveBearPet8 = a2;
        a2.bone3 = new Js((ModelBase)a2);
        loveBearPet8.bone3.J(JPa.N, Lsa.X, APa.D);
        loveBearPet8.J(loveBearPet8.bone3, JPa.N, JPa.N, Qsa.M);
        loveBearPet8.bone2 = new Js((ModelBase)a2);
        loveBearPet8.bone2.J(vPa.b, JPa.N, JPa.N);
        loveBearPet8.J(loveBearPet8.bone2, JPa.N, JPa.N, eta.P);
        loveBearPet8.bone3.J((cT)a2.bone2);
        loveBearPet8.bone2.cubeList.add(new AMa((cT)a2.bone2, uSa.E, tua.U, CRa.M, hqa.t, FRa.ca, tTa.h, WOa.fa, yRa.d, Qsa.N, uSa.E != 0));
        LoveBearPet loveBearPet9 = a2;
        a2.bone = new Js((ModelBase)a2);
        loveBearPet9.bone.J(pqa.r, JPa.N, FRa.ca);
        loveBearPet9.bone3.J((cT)a2.bone);
        loveBearPet9.bone.cubeList.add(new AMa((cT)a2.bone, uSa.E, tua.U, vqa.T, Lqa.C, JPa.N, tTa.h, WOa.fa, yRa.d, JPa.N, uSa.E != 0));
        super.J(new ResourceLocation(Cra.V, ypa.Q));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        float e2 = f2;
        LoveBearPet b2 = this;
        super.f((ModelPlayer)d2, (Sx)c2, e2, (jU)a2);
        double d3 = Math.sin((double)e2 * fPa.ca) * tpa.k;
        uKa.f((double)oua.i, (double)(kTa.B + d3), (double)iSa.P);
        double d4 = LQa.E;
        uKa.J((double)d4, (double)d4, (double)d4);
    }
}

