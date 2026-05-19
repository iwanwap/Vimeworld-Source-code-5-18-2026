/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  Js
 *  Lqa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  XTa
 *  YSa
 *  ZOa
 *  bpa
 *  bqa
 *  cra
 *  kPa
 *  kta
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

public final class GhastPet
extends BasePet {
    private final Js atenta3;
    private final Js btenta1;
    private final Js atenta5;
    private final Js btenta4;
    private final Js btenta2;
    private final Js atenta1;
    private final Js atenta4;
    private final Js Head;
    private final Js atenta2;
    private final Js btenta3;

    @Override
    public void J(float f2) {
        float b2 = f2;
        GhastPet a2 = this;
        uKa.J((float)JPa.N, (float)NTa.D, (float)JPa.N);
        uKa.l((float)Ira.d, (float)Ira.d, (float)Ira.d);
        super.J(b2);
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        GhastPet a2 = this;
        float c2 = Oz.d((float)(d2 * TOa.r)) * Bta.G;
        float b2 = Oz.d((float)(d2 * psa.N)) * cra.S;
        float f3 = Oz.d((float)(d2 * fqa.w + pqa.r)) * Yqa.C;
        float f4 = Oz.C((float)(d2 * TOa.r));
        d2 = Oz.C((float)(d2 * TOa.r)) * UOa.W;
        uKa.J((float)Ora.D, (float)(Lqa.a + c2 * MQa.L), (float)bpa.K);
        uKa.J((float)(f4 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        uKa.l((float)Jsa.Z, (float)Jsa.Z, (float)Jsa.Z);
        GhastPet ghastPet = a2;
        ghastPet.atenta1.rotationX = c2 * YSa.G;
        ghastPet.atenta2.rotationX = c2 * vQa.q;
        ghastPet.atenta3.rotationX = d2;
        ghastPet.atenta4.rotationX = f3 * kta.v;
        ghastPet.atenta5.rotationX = b2;
        ghastPet.btenta1.rotationX = c2 * kta.v;
        ghastPet.btenta2.rotationX = -a2.atenta4.rotationX;
        ghastPet.btenta3.rotationX = -a2.btenta1.rotationX;
        ghastPet.btenta4.rotationX = f3 * YSa.G;
    }

    public GhastPet() {
        GhastPet a2;
        GhastPet ghastPet = a2;
        ghastPet.textureWidth = ysa.s;
        ghastPet.textureHeight = fPa.i;
        GhastPet ghastPet2 = a2;
        ghastPet.Head = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet.Head.J(JPa.N, JPa.N, JPa.N, Yqa.i, Yqa.i, Yqa.i);
        GhastPet ghastPet3 = a2;
        ghastPet3.Head.J(NQa.m, JPa.N, NQa.m);
        a2.atenta1 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet3.atenta1.J(vPa.b, JPa.N, vPa.b, vRa.d, tTa.h, vRa.d);
        GhastPet ghastPet4 = a2;
        ghastPet4.atenta1.J(dua.ca, kPa.y, dua.ca);
        ghastPet4.J(ghastPet4.atenta1, wta.A, JPa.N, JPa.N);
        ghastPet4.atenta1.J(vRa.d != 0);
        ghastPet4.atenta2 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet4.atenta2.J(vPa.b, JPa.N, vPa.b, vRa.d, XTa.W, vRa.d);
        GhastPet ghastPet5 = a2;
        ghastPet5.atenta2.J(vQa.q, kPa.y, Ira.d);
        ghastPet5.J(ghastPet5.atenta2, wta.A, JPa.N, JPa.N);
        ghastPet5.atenta2.J(vRa.d != 0);
        ghastPet5.atenta3 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet5.atenta3.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        GhastPet ghastPet6 = a2;
        ghastPet6.atenta3.J(vPa.b, kPa.y, FRa.ca);
        ghastPet6.J(ghastPet6.atenta3, wta.A, JPa.N, JPa.N);
        ghastPet6.atenta3.J(vRa.d != 0);
        ghastPet6.atenta4 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet6.atenta4.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        GhastPet ghastPet7 = a2;
        ghastPet7.atenta4.J(FRa.ca, kPa.y, pqa.r);
        ghastPet7.J(ghastPet7.atenta4, wta.A, JPa.N, JPa.N);
        ghastPet7.atenta4.J(vRa.d != 0);
        ghastPet7.atenta5 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet7.atenta5.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        GhastPet ghastPet8 = a2;
        ghastPet8.atenta5.J(MQa.L, kPa.y, TOa.p);
        ghastPet8.J(ghastPet8.atenta5, ZOa.I, JPa.N, JPa.N);
        ghastPet8.atenta5.J(vRa.d != 0);
        ghastPet8.btenta1 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet8.btenta1.J(vPa.b, JPa.N, vPa.b, vRa.d, XTa.W, vRa.d);
        GhastPet ghastPet9 = a2;
        ghastPet9.btenta1.J(TOa.p, kPa.y, JPa.N);
        ghastPet9.J(ghastPet9.btenta1, ZOa.I, JPa.N, JPa.N);
        ghastPet9.btenta1.J(vRa.d != 0);
        ghastPet9.btenta2 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet9.btenta2.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        GhastPet ghastPet10 = a2;
        ghastPet10.btenta2.J(pqa.r, kPa.y, MTa.y);
        ghastPet10.J(ghastPet10.btenta2, ZOa.I, JPa.N, JPa.N);
        ghastPet10.btenta2.J(vRa.d != 0);
        ghastPet10.btenta3 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet10.btenta3.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        GhastPet ghastPet11 = a2;
        ghastPet11.btenta3.J(kta.v, kPa.y, vPa.b);
        ghastPet11.J(ghastPet11.btenta3, ZOa.I, JPa.N, JPa.N);
        ghastPet11.btenta3.J(vRa.d != 0);
        ghastPet11.btenta4 = new Js((ModelBase)a2, uSa.E, uSa.E);
        ghastPet11.btenta4.J(vPa.b, JPa.N, vPa.b, vRa.d, tTa.h, vRa.d);
        GhastPet ghastPet12 = a2;
        ghastPet12.btenta4.J(vQa.q, kPa.y, dua.ca);
        ghastPet12.J(ghastPet12.btenta4, wta.A, JPa.N, JPa.N);
        ghastPet12.btenta4.J(vRa.d != 0);
        ghastPet12.J(new ResourceLocation(Cra.V, bqa.J));
    }
}

