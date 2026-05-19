/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Gua
 *  JPa
 *  Js
 *  Kpa
 *  NPa
 *  NTa
 *  Oz
 *  QSa
 *  Qsa
 *  Spa
 *  Tpa
 *  XTa
 *  aPa
 *  bRa
 *  bpa
 *  bqa
 *  cra
 *  eS
 *  iPa
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  xOa
 *  ysa
 *  zTa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class SkyeyWings
extends BaseItem {
    private final Js[] wings;

    @Override
    public void J(float f2) {
        float b2 = f2;
        SkyeyWings a2 = this;
        Kpa.J().J().J(a2.tex);
        uKa.J((float)JPa.N, (float)cra.S, (float)ATa.x);
        uKa.l((float)lTa.D, (float)lTa.D, (float)lTa.D);
        uKa.e();
        uKa.J((float)gQa.b, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Nra.e, (float)JPa.N, (float)kTa.J);
        SkyeyWings skyeyWings = a2;
        skyeyWings.f();
        uKa.D();
        uKa.e();
        uKa.J((float)zTa.w, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Qra.j, (float)JPa.N, (float)kTa.J);
        skyeyWings.f();
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        void b2;
        SkyeyWings skyeyWings = this;
        float e2 = Oz.C((float)(b2 * VPa.i)) * Qsa.k;
        Kpa.J().J().J(skyeyWings.tex);
        uKa.e();
        uKa.h();
        SkyeyWings skyeyWings2 = skyeyWings;
        skyeyWings.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)Nra.e, (float)PQa.T);
        uKa.l((float)pPa.c, (float)Jsa.Z, (float)pPa.c);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)UTa.Y, (float)JPa.N, (float)kTa.J);
        uKa.J((float)FRa.B, (float)pqa.r, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        skyeyWings2.f();
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.J((float)UTa.Y, (float)JPa.N, (float)kTa.J);
        uKa.J((float)FRa.B, (float)pqa.r, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        skyeyWings2.f();
        uKa.D();
        uKa.m();
        uKa.D();
    }

    public SkyeyWings() {
        super(eS.BODY);
        SkyeyWings a2;
        a2.textureWidth = ysa.s;
        a2.textureHeight = fPa.i;
        a2.useDisplayLists = vRa.d;
        a2.wings = new Js[WOa.fa];
        SkyeyWings skyeyWings = a2;
        skyeyWings.wings[vRa.d] = new Js((ModelBase)a2, uSa.E, uSa.E);
        skyeyWings.wings[vRa.d].J(vqa.T, JPa.N, vqa.T, vRa.d, uqa.g, AQa.P);
        SkyeyWings skyeyWings2 = a2;
        skyeyWings2.wings[vRa.d].mirror = vRa.d;
        skyeyWings2.J(skyeyWings2.wings[vRa.d], Gua.E, JPa.N, JPa.N);
        skyeyWings2.wings[uqa.g] = new Js((ModelBase)a2, uSa.E, uua.s);
        skyeyWings2.wings[uqa.g].J(Hra.ha, bqa.v, ATa.x, vRa.d, uqa.g, yRa.d);
        SkyeyWings skyeyWings3 = a2;
        skyeyWings3.wings[uqa.g].mirror = vRa.d;
        skyeyWings3.J(skyeyWings3.wings[uqa.g], bRa.fa, JPa.N, JPa.N);
        skyeyWings3.wings[yRa.d] = new Js((ModelBase)a2, uSa.E, XTa.W);
        skyeyWings3.wings[yRa.d].J(Hra.ha, Ora.D, ATa.x, vRa.d, uqa.g, yRa.d);
        SkyeyWings skyeyWings4 = a2;
        skyeyWings4.wings[yRa.d].mirror = vRa.d;
        skyeyWings4.J(skyeyWings4.wings[yRa.d], iPa.la, JPa.N, JPa.N);
        skyeyWings4.wings[AQa.P] = new Js((ModelBase)a2, uSa.E, wOa.t);
        skyeyWings4.wings[AQa.P].J(mSa.b, pPa.c, NPa.B, vRa.d, vRa.d, yRa.d);
        SkyeyWings skyeyWings5 = a2;
        skyeyWings5.wings[AQa.P].mirror = vRa.d;
        skyeyWings5.J(skyeyWings5.wings[AQa.P], bpa.ja, JPa.N, JPa.N);
        skyeyWings5.wings[tTa.h] = new Js((ModelBase)a2, tTa.h, osa.c);
        skyeyWings5.wings[tTa.h].J(Spa.m, ySa.Da, ATa.r, vRa.d, vRa.d, yRa.d);
        SkyeyWings skyeyWings6 = a2;
        skyeyWings6.wings[tTa.h].mirror = vRa.d;
        skyeyWings6.J(skyeyWings6.wings[tTa.h], bpa.W, JPa.N, JPa.N);
        skyeyWings6.wings[uua.p] = new Js((ModelBase)a2, uSa.E, EPa.O);
        skyeyWings6.wings[uua.p].J(Spa.m, QSa.L, psa.N, vRa.d, vRa.d, yRa.d);
        SkyeyWings skyeyWings7 = a2;
        skyeyWings7.wings[uua.p].mirror = vRa.d;
        skyeyWings7.J(skyeyWings7.wings[uua.p], xOa.m, JPa.N, JPa.N);
        skyeyWings7.wings[XTa.W] = new Js((ModelBase)a2, hpa.Z, uSa.E);
        skyeyWings7.wings[XTa.W].J(vPa.b, bqa.N, Xpa.R, uSa.E, AQa.P, lqa.s);
        SkyeyWings skyeyWings8 = a2;
        skyeyWings8.wings[XTa.W].mirror = vRa.d;
        skyeyWings8.J(skyeyWings8.wings[XTa.W], vQa.S, JPa.N, JPa.N);
        skyeyWings8.wings[Yqa.i] = new Js((ModelBase)a2, hpa.Z, uua.p);
        skyeyWings8.wings[Yqa.i].J(vPa.b, Tpa.S, ATa.x, uSa.E, AQa.P, pPa.f);
        SkyeyWings skyeyWings9 = a2;
        skyeyWings9.wings[Yqa.i].mirror = vRa.d;
        skyeyWings9.J(skyeyWings9.wings[Yqa.i], Jsa.Da, JPa.N, JPa.N);
        skyeyWings9.wings[uSa.E] = new Js((ModelBase)a2, hpa.Z, lqa.s);
        skyeyWings9.wings[uSa.E].J(vPa.b, bqa.v, ATa.x, uSa.E, AQa.P, NTa.C);
        SkyeyWings skyeyWings10 = a2;
        skyeyWings10.wings[uSa.E].mirror = vRa.d;
        skyeyWings10.J(skyeyWings10.wings[uSa.E], aPa.k, JPa.N, JPa.N);
        SkyeyWings skyeyWings11 = a2;
        skyeyWings10.J(new ResourceLocation(Cra.V, osa.C));
    }
}

