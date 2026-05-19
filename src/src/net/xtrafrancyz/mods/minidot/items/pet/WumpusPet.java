/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Cra
 *  Gua
 *  JPa
 *  Js
 *  LQa
 *  Lra
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Qqa
 *  SOa
 *  TQa
 *  WQa
 *  YSa
 *  Ypa
 *  Yra
 *  aSa
 *  bpa
 *  cT
 *  fua
 *  hra
 *  isa
 *  kta
 *  lqa
 *  pPa
 *  pQa
 *  pqa
 *  uKa
 *  uOa
 *  uQa
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

public final class WumpusPet
extends BasePet {
    private final Js bone2;
    private final Js bone5;
    private final Js rightleg;
    private final Js leftleg;
    private final Js pyatak;
    private final Js lefthand;
    private final Js listok;
    private final Js ear;
    private final Js righthand;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        jU e2;
        void b2;
        void c2;
        void d2;
        WumpusPet wumpusPet = jU3;
        jU jU3 = jU2;
        WumpusPet a2 = wumpusPet;
        uKa.h();
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, e2);
        uKa.m();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        float e2 = f2;
        WumpusPet b2 = this;
        super.f((ModelPlayer)d2, (Sx)c2, e2, (jU)a2);
        double d3 = Math.sin(e2 * Yqa.C) * Tqa.Ia;
        uKa.f((double)Qqa.b, (double)(Lsa.c + d3), (double)SOa.M);
        double d4 = uQa.Ka;
        uKa.J((double)d4, (double)d4, (double)d4);
    }

    public WumpusPet() {
        WumpusPet a2;
        WumpusPet wumpusPet = a2;
        wumpusPet.textureWidth = ysa.s;
        wumpusPet.textureHeight = ysa.s;
        WumpusPet wumpusPet2 = a2;
        wumpusPet.leftleg = new Js((ModelBase)a2);
        wumpusPet.leftleg.J(pqa.r, NQa.m, JPa.N);
        wumpusPet.leftleg.cubeList.add(new AMa((cT)a2.leftleg, lqa.s, osa.c, vqa.T, vqa.T, dua.ca, yRa.d, tTa.h, yRa.d, JPa.N, uSa.E != 0));
        WumpusPet wumpusPet3 = a2;
        wumpusPet3.bone2 = new Js((ModelBase)wumpusPet3);
        wumpusPet3.bone2.cubeList.add(new AMa((cT)a2.bone2, uSa.E, lqa.s, CRa.M, csa.P, TOa.p, WOa.fa, Yqa.i, tTa.h, JPa.N, uSa.E != 0));
        WumpusPet wumpusPet4 = a2;
        a2.lefthand = new Js((ModelBase)a2);
        wumpusPet4.lefthand.J(vQa.q, TQa.Z, JPa.N);
        wumpusPet4.J(wumpusPet4.lefthand, JPa.N, JPa.N, LRa.r);
        wumpusPet4.lefthand.cubeList.add(new AMa((cT)a2.lefthand, osa.c, kTa.g, pqa.r, vqa.T, FRa.ca, uqa.g, Yqa.i, uqa.g, JPa.N, uSa.E != 0));
        WumpusPet wumpusPet5 = a2;
        a2.righthand = new Js((ModelBase)a2);
        wumpusPet5.righthand.J(CRa.M, WQa.E, JPa.N);
        wumpusPet5.J(wumpusPet5.righthand, JPa.N, JPa.N, Gua.U);
        wumpusPet5.righthand.cubeList.add(new AMa((cT)a2.righthand, osa.c, kTa.g, dua.ca, uOa.ba, FRa.ca, uqa.g, Yqa.i, uqa.g, JPa.N, uSa.E != 0));
        WumpusPet wumpusPet6 = a2;
        a2.bone5 = new Js((ModelBase)a2);
        wumpusPet6.bone5.J(JPa.N, YSa.G, JPa.N);
        wumpusPet6.bone5.cubeList.add(new AMa((cT)a2.bone5, vRa.d, LQa.c, KSa.Y, uSa.b, Ura.T, NTa.C, uua.p, uua.p, JPa.N, uSa.E != 0));
        WumpusPet wumpusPet7 = a2;
        a2.pyatak = new Js((ModelBase)a2);
        wumpusPet7.pyatak.J(JPa.N, YSa.G, JPa.N);
        wumpusPet7.pyatak.cubeList.add(new AMa((cT)a2.pyatak, Zqa.G, Zqa.G, TOa.p, isa.z, Lra.Da, tTa.h, yRa.d, vRa.d, vua.G, uSa.E != 0));
        WumpusPet wumpusPet8 = a2;
        wumpusPet8.ear = new Js((ModelBase)wumpusPet8);
        wumpusPet8.ear.cubeList.add(new AMa((cT)a2.ear, uSa.E, uua.p, sOa.Z, hra.S, vqa.T, Ypa.A, AQa.P, vRa.d, JPa.N, uSa.E != 0));
        WumpusPet wumpusPet9 = a2;
        a2.listok = new Js((ModelBase)a2);
        wumpusPet9.listok.J(kta.v, nOa.C, JPa.N);
        wumpusPet9.J(wumpusPet9.listok, JPa.N, JPa.N, ZSa.ja);
        wumpusPet9.listok.cubeList.add(new AMa((cT)a2.listok, TQa.ca, WOa.fa, KSa.Y, vqa.T, JPa.N, uua.p, uSa.E, vRa.d, JPa.N, uSa.E != 0));
        a2.listok.cubeList.add(new AMa((cT)a2.listok, CRa.L, NTa.C, pQa.s, vqa.T, vqa.T, AQa.P, uSa.E, vRa.d, JPa.N, uSa.E != 0));
        a2.listok.cubeList.add(new AMa((cT)a2.listok, CRa.L, NTa.C, pQa.s, vqa.T, pqa.r, AQa.P, uSa.E, vRa.d, JPa.N, uSa.E != 0));
        WumpusPet wumpusPet10 = a2;
        a2.rightleg = new Js((ModelBase)a2);
        wumpusPet10.rightleg.J(Ppa.Ha, NQa.m, JPa.N);
        wumpusPet10.rightleg.cubeList.add(new AMa((cT)a2.rightleg, uSa.E, osa.c, FRa.ca, vqa.T, dua.ca, yRa.d, tTa.h, yRa.d, JPa.N, uSa.E != 0));
        super.J(new ResourceLocation(Cra.V, Yra.z));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        WumpusPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        fua.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        fua.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        WumpusPet wumpusPet = a2;
        wumpusPet.rightleg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v + f3;
        wumpusPet.rightleg.rotationY = b2 * kta.v;
        wumpusPet.leftleg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v - f3;
        wumpusPet.leftleg.rotationZ = b2 * kta.v;
        wumpusPet.lefthand.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * Nra.e;
        wumpusPet.lefthand.rotationY = -d2 * b2 * kta.v;
        wumpusPet.lefthand.rotationZ = d2 * b2 * YSa.G;
        wumpusPet.righthand.rotationX = -a2.lefthand.rotationX;
        wumpusPet.righthand.rotationY = -a2.lefthand.rotationY;
        wumpusPet.righthand.rotationZ = a2.lefthand.rotationZ;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        WumpusPet a2 = this;
        uKa.f((double)aSa.V, (double)vsa.K, (double)aSa.V);
        super.J(b2);
    }
}

