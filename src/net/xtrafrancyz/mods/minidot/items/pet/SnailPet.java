/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  Lqa
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Ssa
 *  YSa
 *  bpa
 *  pPa
 *  pqa
 *  uKa
 *  vPa
 *  vRa
 *  wOa
 *  wra
 *  xOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class SnailPet
extends BasePet {
    private final Js Shape4;
    private final Js Shape5;
    private final Js Shape6;
    private final Js Shape3;
    private final Js Shape1;
    private final Js Shape7;
    private final Js Shape2;

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        SnailPet a2 = this;
        float c2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float b2 = Oz.d((float)(d2 * TOa.r)) * VPa.i;
        float f3 = Oz.d((float)(d2 * Nra.e)) * Jpa.B;
        float f4 = Oz.d((float)(d2 * Nra.e - ZSa.q)) * Jpa.B;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)pta.d, (float)(NTa.D + c2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        SnailPet snailPet = a2;
        snailPet.Shape3.offsetZ = f4 * Ssa.la;
        snailPet.Shape2.offsetZ = -a2.Shape3.offsetZ * MQa.L;
        a2.Shape4.rotationY = b2;
        snailPet.Shape4.rotationZ = b2 * rta.o;
        snailPet.Shape4.offsetZ = a2.Shape2.offsetZ;
        snailPet.Shape7.rotationY = -b2;
        snailPet.Shape7.rotationZ = -a2.Shape4.rotationZ;
        snailPet.Shape7.offsetZ = a2.Shape2.offsetZ;
        snailPet.Shape6.offsetZ = f3;
        snailPet.Shape1.offsetZ = a2.Shape2.offsetZ;
        snailPet.Shape5.offsetZ = a2.Shape2.offsetZ;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        SnailPet a2 = this;
        uKa.l((float)Jsa.Z, (float)Jsa.Z, (float)Jsa.Z);
        uKa.J((float)JPa.N, (float)Bta.G, (float)ERa.i);
        super.J(b2);
    }

    public SnailPet() {
        int a2;
        SnailPet snailPet;
        SnailPet snailPet2 = snailPet = this;
        snailPet2.textureWidth = ysa.s;
        snailPet2.textureHeight = fPa.i;
        SnailPet snailPet3 = snailPet;
        snailPet2.Shape1 = new Js((ModelBase)snailPet, ERa.C, wOa.h);
        snailPet2.Shape1.J(JPa.N, JPa.N, JPa.N, AQa.P, yRa.d, Yqa.i);
        SnailPet snailPet4 = snailPet;
        snailPet4.Shape1.J(dua.ca, JPa.N, TOa.p);
        snailPet4.Shape1.mirror = vRa.d;
        snailPet.Shape2 = new Js((ModelBase)snailPet, uSa.E, Lra.e);
        snailPet4.Shape2.J(JPa.N, JPa.N, JPa.N, yRa.d, uqa.g, yRa.d);
        SnailPet snailPet5 = snailPet;
        snailPet5.Shape2.J(FRa.ca, pqa.r, CRa.M);
        snailPet5.Shape2.mirror = vRa.d;
        snailPet.Shape3 = new Js((ModelBase)snailPet, GPa.C, EPa.O);
        snailPet5.Shape3.J(vqa.T, vPa.b, JPa.N, uqa.g, vRa.d, yRa.d);
        SnailPet snailPet6 = snailPet;
        snailPet6.Shape3.J(JPa.N, MTa.y, BRa.k);
        snailPet6.Shape3.mirror = vRa.d;
        snailPet.Shape4 = new Js((ModelBase)snailPet, uSa.E, pPa.f);
        snailPet6.Shape4.J(vPa.b, CRa.M, vPa.b, vRa.d, tTa.h, vRa.d);
        SnailPet snailPet7 = snailPet;
        snailPet7.Shape4.J(ZSa.q, pqa.r, NQa.m);
        snailPet7.Shape4.mirror = vRa.d;
        snailPet.Shape7 = new Js((ModelBase)snailPet, uSa.E, pPa.f);
        snailPet7.Shape7.J(vPa.b, CRa.M, vPa.b, vRa.d, tTa.h, vRa.d);
        SnailPet snailPet8 = snailPet;
        snailPet8.Shape7.J(Lqa.a, pqa.r, NQa.m);
        snailPet8.Shape7.mirror = vRa.d;
        snailPet.Shape5 = new Js((ModelBase)snailPet, osa.c, uSa.E);
        snailPet8.Shape5.J(JPa.N, JPa.N, JPa.N, tTa.h, WOa.fa, Yqa.i);
        SnailPet snailPet9 = snailPet;
        snailPet9.Shape5.J(Ppa.Ha, xOa.w, vqa.T);
        snailPet9.Shape5.mirror = vRa.d;
        snailPet.Shape6 = new Js((ModelBase)snailPet, wra.P, ITa.E);
        snailPet9.Shape6.J(FRa.ca, JPa.N, JPa.N, yRa.d, uqa.g, AQa.P);
        SnailPet snailPet10 = snailPet;
        snailPet10.Shape6.J(JPa.N, pqa.r, YSa.G);
        snailPet10.Shape6.mirror = vRa.d;
        Js[] jsArray = snailPet10.l();
        int n2 = jsArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            jsArray[a2++].J(vRa.d != 0);
            n3 = a2;
        }
        SnailPet snailPet11 = snailPet;
        snailPet11.J();
        snailPet11.J(new ResourceLocation(Cra.V, Cra.L));
    }
}

