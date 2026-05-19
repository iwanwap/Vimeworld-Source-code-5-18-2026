/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Cra
 *  ERa
 *  FPa
 *  Fpa
 *  JPa
 *  JSa
 *  Js
 *  Kpa
 *  Lra
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Pqa
 *  SOa
 *  Ssa
 *  Uqa
 *  XSa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  Yra
 *  asa
 *  bqa
 *  cQa
 *  eS
 *  fpa
 *  hTa
 *  jRa
 *  jpa
 *  kPa
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  qta
 *  uKa
 *  ura
 *  vRa
 *  vpa
 *  wOa
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class WingsDragon
extends BaseItem {
    private final Js[] wing;

    public WingsDragon() {
        super(eS.BODY);
        WingsDragon a2;
        a2.textureWidth = ysa.s;
        a2.textureHeight = fPa.i;
        a2.useDisplayLists = vRa.d;
        a2.wing = new Js[Lra.e];
        WingsDragon wingsDragon = a2;
        wingsDragon.wing[uSa.E] = new Js((ModelBase)a2, lqa.s, XTa.W);
        wingsDragon.wing[vRa.d] = new Js((ModelBase)a2, AQa.P, XTa.W);
        wingsDragon.wing[uqa.g] = new Js((ModelBase)a2, Yqa.i, XTa.W);
        wingsDragon.wing[yRa.d] = new Js((ModelBase)a2, AQa.P, uSa.E);
        wingsDragon.wing[AQa.P] = new Js((ModelBase)a2, lqa.s, pPa.f);
        wingsDragon.wing[tTa.h] = new Js((ModelBase)a2, lqa.s, XTa.W);
        wingsDragon.wing[uua.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
        wingsDragon.wing[XTa.W] = new Js((ModelBase)a2, lqa.s, XTa.W);
        wingsDragon.wing[Yqa.i] = new Js((ModelBase)a2, kTa.j, uSa.E);
        wingsDragon.wing[WOa.fa] = new Js((ModelBase)a2, ITa.E, uSa.E);
        wingsDragon.wing[NTa.C] = new Js((ModelBase)a2, Yqa.i, uSa.E);
        wingsDragon.wing[pPa.f] = new Js((ModelBase)a2, ERa.C, pPa.f);
        wingsDragon.wing[lqa.s] = new Js((ModelBase)a2, lqa.s, uSa.E);
        wingsDragon.wing[uua.s] = new Js((ModelBase)a2, ERa.C, uSa.E);
        wingsDragon.wing[hpa.Z] = new Js((ModelBase)a2, ERa.C, uSa.E);
        wingsDragon.wing[Ypa.A] = new Js((ModelBase)a2, lqa.s, pPa.f);
        wingsDragon.wing[ERa.C] = new Js((ModelBase)a2, uSa.E, XTa.W);
        wingsDragon.wing[yta.Ka] = new Js((ModelBase)a2, kTa.j, AQa.P);
        wingsDragon.wing[yOa.B] = new Js((ModelBase)a2, lqa.s, XTa.W);
        wingsDragon.wing[wOa.t] = new Js((ModelBase)a2, lqa.s, XTa.W);
        wingsDragon.wing[kTa.j] = new Js((ModelBase)a2, fPa.i, uSa.E);
        wingsDragon.wing[wOa.h] = new Js((ModelBase)a2, hpa.Z, WOa.fa);
        wingsDragon.wing[cQa.o] = new Js((ModelBase)a2, hpa.Z, yta.Ka);
        wingsDragon.wing[AQa.ba] = new Js((ModelBase)a2, uua.p, AQa.ba);
        wingsDragon.wing[osa.c] = new Js((ModelBase)a2, lqa.s, EPa.O);
        wingsDragon.wing[kTa.g] = new Js((ModelBase)a2, lqa.s, kTa.g);
        wingsDragon.wing[ITa.E] = new Js((ModelBase)a2, uua.p, AQa.ba);
        wingsDragon.wing[uSa.E].J(qsa.ca, cPa.ba, FPa.o, vRa.d, yRa.d, vRa.d);
        a2.wing[vRa.d].J(qsa.ca, Hra.Q, NTa.ha, vRa.d, tTa.h, vRa.d);
        a2.wing[uqa.g].J(qsa.ca, lPa.X, pPa.c, vRa.d, AQa.P, vRa.d);
        a2.wing[yRa.d].J(qsa.ca, JPa.b, MTa.Aa, vRa.d, tTa.h, vRa.d);
        a2.wing[AQa.P].J(qsa.ca, uua.o, jpa.K, vRa.d, yRa.d, vRa.d);
        a2.wing[tTa.h].J(qsa.ca, BRa.k, psa.G, vRa.d, yRa.d, vRa.d);
        a2.wing[uua.p].J(qsa.ca, sra.h, Xsa.c, vRa.d, uua.p, vRa.d);
        a2.wing[XTa.W].J(qsa.ca, NPa.B, BRa.k, vRa.d, yRa.d, vRa.d);
        a2.wing[Yqa.i].J(qsa.ca, NSa.b, CRa.M, vRa.d, uqa.g, uqa.g);
        a2.wing[WOa.fa].J(qsa.ca, CRa.M, NQa.m, vRa.d, vRa.d, uqa.g);
        a2.wing[NTa.C].J(qsa.ca, XSa.n, Tqa.p, vRa.d, AQa.P, vRa.d);
        a2.wing[pPa.f].J(qsa.ca, MQa.L, hTa.w, vRa.d, yRa.d, vRa.d);
        a2.wing[lqa.s].J(qsa.ca, ATa.r, Jta.r, vRa.d, yRa.d, vRa.d);
        a2.wing[uua.s].J(qsa.ca, JPa.N, Xsa.c, vRa.d, uqa.g, vRa.d);
        a2.wing[hpa.Z].J(qsa.ca, Bpa.Ea, Gta.ca, vRa.d, uqa.g, vRa.d);
        a2.wing[Ypa.A].J(qsa.ca, BRa.k, Wqa.V, vRa.d, yRa.d, vRa.d);
        a2.wing[ERa.C].J(qsa.ca, Era.Ga, Ssa.A, vRa.d, tTa.h, vRa.d);
        a2.wing[yta.Ka].J(qsa.ca, wsa.r, Fua.N, vRa.d, uqa.g, vRa.d);
        a2.wing[yOa.B].J(qsa.ca, SOa.s, hTa.w, vRa.d, yRa.d, vRa.d);
        a2.wing[wOa.t].J(qsa.ca, Tqa.C, bqa.N, vRa.d, yRa.d, vRa.d);
        a2.wing[kTa.j].J(qsa.ca, kPa.y, asa.S, vRa.d, vRa.d, vRa.d);
        a2.wing[wOa.h].J(Wqa.V, yta.b, dua.ca, uSa.E, Yqa.i, XTa.W);
        a2.wing[cQa.o].J(Wqa.V, Ppa.Ha, fpa.N, uSa.E, Yqa.i, XTa.W);
        a2.wing[AQa.ba].J(Wqa.V, YSa.la, hTa.w, uSa.E, uua.p, yRa.d);
        a2.wing[osa.c].J(aua.b, Era.s, Tqa.p, vRa.d, AQa.P, uSa.E);
        a2.wing[kTa.g].J(PRa.G, APa.D, Tqa.p, vRa.d, yRa.d, uSa.E);
        a2.wing[ITa.E].J(Wqa.V, jRa.x, Ppa.Ha, uSa.E, vRa.d, uqa.g);
        WingsDragon wingsDragon2 = a2;
        wingsDragon2.wing[uSa.E].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[vRa.d].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[uqa.g].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[yRa.d].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[AQa.P].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[tTa.h].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[uua.p].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[XTa.W].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[Yqa.i].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[WOa.fa].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[NTa.C].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[pPa.f].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[lqa.s].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[uua.s].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[hpa.Z].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[Ypa.A].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[ERa.C].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[yta.Ka].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[yOa.B].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[wOa.t].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[kTa.j].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[wOa.h].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[cQa.o].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[AQa.ba].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[osa.c].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[kTa.g].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.wing[ITa.E].J(JPa.N, JPa.N, dua.ca);
        wingsDragon2.J(wingsDragon2.wing[uSa.E], fta.B, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[vRa.d], fpa.Q, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[uqa.g], Fpa.a, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[yRa.d], zpa.X, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[AQa.P], qQa.Y, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[tTa.h], Uqa.f, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[uua.p], ura.U, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[XTa.W], Yra.M, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[Yqa.i], ppa.q, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[WOa.fa], ppa.q, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[NTa.C], WPa.z, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[pPa.f], ura.U, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[lqa.s], Qpa.v, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[uua.s], vpa.P, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[hpa.Z], WPa.z, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[Ypa.A], dsa.o, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[ERa.C], fta.B, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[yta.Ka], zsa.E, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[yOa.B], tpa.M, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[wOa.t], Uqa.f, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[kTa.j], fta.B, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[wOa.h], qta.O, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[cQa.o], fqa.U, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[AQa.ba], ura.U, JPa.N, JPa.N);
        wingsDragon2.J(wingsDragon2.wing[osa.c], ppa.q, JPa.N, fta.B);
        wingsDragon2.J(wingsDragon2.wing[kTa.g], ppa.q, JPa.N, fta.B);
        wingsDragon2.J(wingsDragon2.wing[ITa.E], Jra.Z, JPa.N, JPa.N);
        WingsDragon wingsDragon3 = a2;
        wingsDragon2.J(new ResourceLocation(Cra.V, Pqa.h));
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
        WingsDragon wingsDragon = this;
        float e2 = Oz.C((float)(b2 * rta.o)) * lqa.ga;
        Kpa.J().J().J(wingsDragon.tex);
        uKa.e();
        uKa.h();
        WingsDragon wingsDragon2 = wingsDragon;
        wingsDragon.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)JSa.B, (float)vsa.z);
        uKa.l((float)uSa.T, (float)uSa.T, (float)uSa.T);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)TOa.R, (float)vqa.T, (float)MQa.L, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        wingsDragon2.f();
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.J((float)TOa.R, (float)vqa.T, (float)MQa.L, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        wingsDragon2.f();
        uKa.D();
        uKa.m();
        uKa.D();
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        WingsDragon a2 = this;
        Kpa.J().J().J(a2.tex);
        uKa.J((float)JPa.N, (float)JPa.N, (float)ATa.x);
        uKa.l((float)vTa.N, (float)vTa.N, (float)vTa.N);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)dua.fa, (float)pqa.r, (float)Ira.d, (float)JPa.N);
        uKa.J((float)psa.N, (float)JPa.N, (float)JPa.N);
        WingsDragon wingsDragon = a2;
        wingsDragon.f();
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.J((float)dua.fa, (float)pqa.r, (float)Ira.d, (float)JPa.N);
        uKa.J((float)psa.N, (float)JPa.N, (float)JPa.N);
        wingsDragon.f();
        uKa.D();
    }
}

