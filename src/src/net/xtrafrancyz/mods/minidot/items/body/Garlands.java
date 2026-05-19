/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Bsa
 *  Cra
 *  Cta
 *  DQa
 *  ERa
 *  FTa
 *  Fpa
 *  JPa
 *  Js
 *  Kpa
 *  Lqa
 *  MQa
 *  NPa
 *  NQa
 *  Oz
 *  PTa
 *  Qsa
 *  Qta
 *  Spa
 *  Sqa
 *  Tpa
 *  URa
 *  Usa
 *  Uta
 *  Vua
 *  YSa
 *  Ypa
 *  Yra
 *  Ysa
 *  ZRa
 *  bSa
 *  bpa
 *  cra
 *  eS
 *  fTa
 *  fpa
 *  hTa
 *  hra
 *  kPa
 *  kpa
 *  kta
 *  lqa
 *  mra
 *  oqa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  uKa
 *  uOa
 *  ura
 *  vQa
 *  vRa
 *  yQa
 *  yra
 *  zTa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class Garlands
extends BaseItem {
    private final ResourceLocation[] tex;
    public static final ResourceLocation[] CMYK;
    private final Js Front;
    public static final ResourceLocation[] RGB;
    private final Js Back;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, int n2) {
        void b2;
        int c2 = n2;
        Garlands a2 = this;
        uKa.J((float)(Hra.Ga + Oz.d((float)(b2 * cra.S + (float)c2)) * FRa.Ga), (float)JPa.N, (float)psa.N, (float)JPa.N);
        uKa.J((float)JPa.N, (float)Tpa.S, (float)bpa.K);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx, float f2, jU jU2) {
        void v1;
        void a2;
        void b2;
        void c2;
        ModelBase e22 = modelPlayer;
        Garlands d2 = this;
        void v0 = c2;
        super.f((ModelPlayer)e22, (Sx)v0, (float)b2, (jU)a2);
        uKa.l((float)FTa.q, (float)FTa.q, (float)FTa.q);
        if (v0.J(uqa.g) != null) {
            uKa.l((float)pqa.r, (float)pqa.r, (float)pPa.c);
        }
        uKa.J((float)JPa.N, (float)JPa.N, (float)NPa.N);
        void e22 = b2 % vRa.T;
        if (v1 > vqa.A) {
            Garlands garlands = d2;
            garlands.J(garlands.tex[uSa.E]);
            return;
        }
        if (e22 > kPa.S) {
            Garlands garlands = d2;
            garlands.J(garlands.tex[vRa.d]);
            return;
        }
        Garlands garlands = d2;
        garlands.J(garlands.tex[uqa.g]);
    }

    static {
        ResourceLocation[] resourceLocationArray = new ResourceLocation[yRa.d];
        resourceLocationArray[uSa.E] = new ResourceLocation(Cra.V, POa.t);
        resourceLocationArray[vRa.d] = new ResourceLocation(Cra.V, tpa.a);
        resourceLocationArray[uqa.g] = new ResourceLocation(Cra.V, Uta.U);
        RGB = resourceLocationArray;
        ResourceLocation[] resourceLocationArray2 = new ResourceLocation[yRa.d];
        resourceLocationArray2[uSa.E] = new ResourceLocation(Cra.V, Asa.L);
        resourceLocationArray2[vRa.d] = new ResourceLocation(Cra.V, PQa.I);
        resourceLocationArray2[uqa.g] = new ResourceLocation(Cra.V, Qta.fa);
        CMYK = resourceLocationArray2;
    }

    public Garlands(ResourceLocation[] resourceLocationArray) {
        ResourceLocation[] b2 = resourceLocationArray;
        ResourceLocation[] a2 = this;
        super(eS.BODY);
        a2.tex = b2;
        a2.textureWidth = fPa.i;
        a2.textureHeight = fPa.i;
        a2.J(Xpa.U, uSa.E, uSa.E);
        a2.J(ZRa.I, Yqa.i, uSa.E);
        a2.J(zTa.O, uSa.E, Yqa.i);
        a2.J(sqa.D, Yqa.i, Yqa.i);
        a2.J(URa.fa, uSa.E, uSa.E);
        a2.J(Jta.V, Yqa.i, uSa.E);
        a2.J(ypa.C, uSa.E, uSa.E);
        a2.J(vqa.u, Yqa.i, uSa.E);
        a2.J(Jta.H, uSa.E, Yqa.i);
        a2.J(uua.t, Yqa.i, Yqa.i);
        a2.J(LRa.W, uSa.E, ERa.C);
        a2.J(FTa.W, Yqa.i, ERa.C);
        a2.J(oqa.X, uSa.E, uSa.E);
        a2.J(vQa.v, Yqa.i, uSa.E);
        a2.J(Bpa.E, uSa.E, uSa.E);
        a2.J(Xpa.C, Yqa.i, uSa.E);
        a2.J(Vua.Ga, uSa.E, ERa.C);
        a2.J(PRa.W, Yqa.i, ERa.C);
        a2.J(Ypa.i, uSa.E, ERa.C);
        a2.J(Bsa.i, Yqa.i, ERa.C);
        a2.J(uOa.D, uSa.E, Yqa.i);
        a2.J(UTa.s, Yqa.i, Yqa.i);
        a2.J(ySa.i, uSa.E, Yqa.i);
        a2.J(rSa.D, Yqa.i, Yqa.i);
        a2.J(gQa.c, uSa.E, ERa.C);
        a2.J(nOa.P, Yqa.i, ERa.C);
        a2.J(Eqa.ca, uSa.E, Yqa.i);
        a2.J(ura.f, Yqa.i, Yqa.i);
        a2.J(pPa.p, uSa.E, ERa.C);
        a2.J(xqa.P, Yqa.i, ERa.C);
        a2.J(bSa.m, uSa.E, Yqa.i);
        a2.J(bsa.o, Yqa.i, Yqa.i);
        a2.J(MTa.u, uSa.E, Yqa.i);
        a2.J(Spa.Aa, Yqa.i, Yqa.i);
        a2.J(hTa.W, uSa.E, ERa.C);
        a2.J(sqa.H, Yqa.i, ERa.C);
        a2.J(hra.F, uSa.E, uSa.E);
        a2.J(sra.x, Yqa.i, uSa.E);
        a2.J(bpa.M, uSa.E, Yqa.i);
        a2.J(IPa.w, Yqa.i, Yqa.i);
        a2.J(FRa.e, uSa.E, Yqa.i);
        a2.J(oQa.F, Yqa.i, Yqa.i);
        a2.J(sSa.f, uSa.E, uSa.E);
        a2.J(opa.i, Yqa.i, uSa.E);
        a2.J(KSa.ja, uSa.E, uSa.E);
        a2.J(DQa.G, Yqa.i, uSa.E);
        a2.J(MQa.H, uSa.E, ERa.C);
        a2.J(cPa.r, Yqa.i, ERa.C);
        a2.J(Usa.x, uSa.E, ERa.C);
        a2.J(wta.z, Yqa.i, ERa.C);
        a2.J(Bua.s, uSa.E, uSa.E);
        a2.J(yra.P, Yqa.i, uSa.E);
        ResourceLocation[] resourceLocationArray2 = a2;
        a2.Front = new Js((ModelBase)a2, Sqa.m);
        a2.Front.J(JPa.N, vqa.A, NSa.b);
        a2.Front.J(pPa.y, Lqa.C, kta.v, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(Usa.J, Cra.fa, pqa.r, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(pQa.w, BRa.k, kpa.G, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(uOa.u, lqa.ga, Lsa.A, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(PQa.B, kPa.S, hra.S, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(fTa.O, Qsa.k, fpa.ia, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(Cta.g, kPa.S, bSa.J, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(BRa.Ja, Qsa.k, Fua.Y, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(kPa.k, pqa.r, kPa.S, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(Tpa.n, JPa.N, Qsa.k, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(MTa.d, NQa.d, lqa.ga, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(Bsa.fa, sOa.Z, eua.C, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(yQa.G, TOa.p, Qsa.k, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(mra.t, NQa.m, BRa.k, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(DPa.n, eua.C, Lqa.C, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(tpa.P, YSa.G, Cra.fa, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(pQa.Ha, NQa.d, NQa.m, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(Fpa.l, sOa.Z, CRa.M, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(Fua.t, pqa.r, NQa.d, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(bsa.fa, JPa.N, sOa.Z, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(eta.N, TOa.p, NSa.b, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(PTa.T, NQa.m, NQa.d, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(vTa.m, Jsa.o, dua.ca, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(Pua.Ga, csa.P, TOa.p, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Front.J(Ysa.ca, eua.C, AQa.W, TOa.p, uqa.g, uqa.g, uqa.g);
        a2.Front.J(fta.W, YSa.G, FRa.Ga, NQa.m, AQa.P, AQa.P, AQa.P);
        a2.Back = new Js((ModelBase)a2, Yra.Y);
        a2.Back.J(JPa.N, vqa.A, lqa.ga);
        a2.Back.J(pPa.y, Lqa.C, kta.v, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(Usa.J, Cra.fa, pqa.r, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(pQa.w, BRa.k, kpa.G, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(uOa.u, lqa.ga, Lsa.A, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(PQa.B, kPa.S, hra.S, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(fTa.O, Qsa.k, fpa.ia, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(Cta.g, kPa.S, bSa.J, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(BRa.Ja, Qsa.k, Fua.Y, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(kPa.k, pqa.r, kPa.S, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(Tpa.n, JPa.N, Qsa.k, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(MTa.d, NQa.d, lqa.ga, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(Bsa.fa, sOa.Z, eua.C, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(yQa.G, TOa.p, Qsa.k, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(mra.t, NQa.m, BRa.k, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(DPa.n, eua.C, Lqa.C, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(tpa.P, YSa.G, Cra.fa, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(pQa.Ha, NQa.d, NQa.m, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(Fpa.l, sOa.Z, CRa.M, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(Fua.t, pqa.r, NQa.d, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(bsa.fa, JPa.N, sOa.Z, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(eta.N, TOa.p, NSa.b, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(PTa.T, NQa.m, NQa.d, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(vTa.m, Jsa.o, dua.ca, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(Pua.Ga, csa.P, TOa.p, JPa.N, AQa.P, AQa.P, AQa.P);
        a2.Back.J(Ysa.ca, eua.C, AQa.W, pqa.r, uqa.g, uqa.g, uqa.g);
        a2.Back.J(fta.W, YSa.G, FRa.Ga, JPa.N, AQa.P, AQa.P, AQa.P);
    }

    @Override
    public void J(float f2) {
        float f3;
        float b2 = f2;
        Garlands a2 = this;
        uKa.l((float)Tpa.S, (float)Xpa.R, (float)Xpa.R);
        uKa.B();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        b2 %= nua.M;
        if (f3 > Qsa.U) {
            Garlands garlands = a2;
            garlands.J(garlands.tex[uSa.E]);
        } else if (b2 > QTa.G) {
            Garlands garlands = a2;
            garlands.J(garlands.tex[vRa.d]);
        } else {
            Garlands garlands = a2;
            garlands.J(garlands.tex[uqa.g]);
        }
        Kpa.J().J().J(((BaseItem)a2).tex);
        a2.Front.C(rRa.T);
        uKa.k();
    }
}

