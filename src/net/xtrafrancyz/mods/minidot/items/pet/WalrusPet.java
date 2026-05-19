/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Cra
 *  ERa
 *  FPa
 *  JPa
 *  Js
 *  Lra
 *  MQa
 *  NPa
 *  NQa
 *  Oz
 *  XTa
 *  bqa
 *  cT
 *  fsa
 *  kta
 *  pPa
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

public final class WalrusPet
extends BasePet {
    private final Js shape2;
    private final Js tail3;
    private final Js Body2;
    private final Js shape4;
    private final Js shape1;
    private final Js Body1;
    private final Js tail1;
    private final Js shape13;
    private final Js tail4;
    private final Js tail2;
    private final Js shape12;
    private final Js shape3;
    private final Js Body3;

    @Override
    public void J(float f2) {
        float b2 = f2;
        WalrusPet a2 = this;
        uKa.J((float)JPa.N, (float)Qra.j, (float)ATa.x);
        uKa.l((float)NPa.B, (float)NPa.B, (float)pPa.c);
        super.J(b2);
    }

    public WalrusPet() {
        int a2;
        WalrusPet walrusPet;
        WalrusPet walrusPet2 = walrusPet = this;
        walrusPet2.textureWidth = ysa.s;
        walrusPet2.textureHeight = fPa.i;
        walrusPet2.useDisplayLists = vRa.d;
        WalrusPet walrusPet3 = walrusPet;
        walrusPet2.tail2 = new Js((ModelBase)walrusPet, uSa.E, pPa.f);
        walrusPet2.tail2.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.tail2.J(vqa.T, JPa.N, Bpa.w, uqa.g, vRa.d, uqa.g, JPa.N);
        walrusPet2.tail3 = new Js((ModelBase)walrusPet, vRa.d, uua.s);
        walrusPet2.tail3.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.tail3.J(uqa.u, dua.Ja, eua.C, vRa.d, vRa.d, uqa.g, JPa.N);
        walrusPet2.J(walrusPet2.tail3, JPa.N, DPa.s, JPa.N);
        walrusPet2.Body3 = new Js((ModelBase)walrusPet, Yqa.D, uqa.g);
        walrusPet2.Body3.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.Body3.J(NQa.m, kta.v, vqa.T, uqa.g, vRa.d, uqa.g, JPa.N);
        walrusPet2.shape12 = new Js((ModelBase)walrusPet, FPa.F, uSa.E);
        walrusPet2.shape12.J(Bpa.w, vQa.q, MQa.L);
        walrusPet2.shape12.J(vPa.b, JPa.N, vPa.b, vRa.d, vRa.d, uqa.g, JPa.N);
        walrusPet2.J(walrusPet2.shape12, JPa.N, ysa.T, JPa.N);
        walrusPet2.shape13 = new Js((ModelBase)walrusPet, FPa.F, AQa.P);
        walrusPet2.shape13.J(Ura.T, vQa.q, MQa.L);
        walrusPet2.shape13.J(vPa.b, JPa.N, vPa.b, vRa.d, vRa.d, uqa.g, JPa.N);
        walrusPet2.J(walrusPet2.shape13, JPa.N, Vra.ga, JPa.N);
        walrusPet2.Body2 = new Js((ModelBase)walrusPet, Yqa.D, uqa.g);
        walrusPet2.Body2.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.Body2.J(kta.v, kta.v, vqa.T, uqa.g, vRa.d, uqa.g, JPa.N);
        walrusPet2.shape3 = new Js((ModelBase)walrusPet, Lra.e, WOa.fa);
        walrusPet2.shape3.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.shape3.J(fsa.Ia, ZSa.q, TOa.p, vRa.d, AQa.P, vRa.d, JPa.N);
        walrusPet2.J(walrusPet2.shape3, xTa.J, JPa.N, WPa.T);
        walrusPet2.shape4 = new Js((ModelBase)walrusPet, Lra.e, WOa.fa);
        walrusPet2.shape4.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.shape4.J(tpa.h, ZSa.q, TOa.p, vRa.d, AQa.P, vRa.d, JPa.N);
        walrusPet2.J(walrusPet2.shape4, xTa.J, JPa.N, nqa.la);
        walrusPet2.tail1 = new Js((ModelBase)walrusPet, ITa.E, uSa.E);
        walrusPet2.tail1.J(JPa.N, bqa.v, BRa.k);
        walrusPet2.tail1.J(dua.ca, FRa.ca, vqa.T, AQa.P, yRa.d, tTa.h, JPa.N);
        walrusPet2.Body1 = new Js((ModelBase)walrusPet, uSa.E, uSa.E);
        walrusPet2.Body1.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.Body1.J(TOa.p, JPa.N, JPa.N, uua.p, AQa.P, XTa.W, JPa.N);
        walrusPet2.shape2 = new Js((ModelBase)walrusPet, fPa.i, ERa.C);
        walrusPet2.shape2.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.shape2.J(vqa.T, JPa.N, TOa.p, uqa.g, uqa.g, vRa.d, JPa.N);
        walrusPet2.tail4 = new Js((ModelBase)walrusPet, vRa.d, uua.s);
        walrusPet2.tail4.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.tail4.J(Xpa.R, dua.Ja, eua.C, vRa.d, vRa.d, uqa.g, JPa.N);
        walrusPet2.J(walrusPet2.tail4, JPa.N, vTa.K, JPa.N);
        walrusPet2.shape1 = new Js((ModelBase)walrusPet, tua.U, WOa.fa);
        walrusPet2.shape1.J(JPa.N, JPa.N, JPa.N);
        walrusPet2.shape1.J(dua.ca, vqa.T, dua.ca, AQa.P, yRa.d, yRa.d, JPa.N);
        walrusPet2.tail1.J((cT)walrusPet.tail2);
        walrusPet2.tail2.J((cT)walrusPet.tail3);
        walrusPet2.tail2.J((cT)walrusPet.tail4);
        Js[] jsArray = walrusPet2.l();
        int n2 = jsArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            jsArray[a2++].J(vRa.d != 0);
            n3 = a2;
        }
        WalrusPet walrusPet4 = walrusPet;
        walrusPet4.J();
        walrusPet4.J(new ResourceLocation(Cra.V, BRa.r));
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float a2;
        ModelBase d22 = modelPlayer;
        WalrusPet c2 = this;
        float d22 = Oz.C((float)(a2 * TOa.r));
        float b2 = Oz.C((float)(a2 * psa.N));
        a2 = Oz.d((float)(a2 * TOa.r)) * WRa.e;
        uKa.J((float)ZSa.q, (float)(tTa.Da + a2), (float)Xpa.R);
        uKa.l((float)Ira.d, (float)Ira.d, (float)Ira.d);
        uKa.J((float)(d22 * vQa.q), (float)psa.N, (float)JPa.N, (float)JPa.N);
        WalrusPet walrusPet = c2;
        walrusPet.shape12.rotationY = -d22 * psa.N;
        walrusPet.shape13.rotationY = -d22 * psa.N;
        walrusPet.tail1.rotationX = d22 * dqa.B;
        walrusPet.tail1.rotationY = b2 * kTa.J;
        walrusPet.tail2.rotationX = d22 * Bta.G;
    }
}

