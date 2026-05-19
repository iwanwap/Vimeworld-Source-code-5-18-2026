/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cra
 *  Cta
 *  EQa
 *  ERa
 *  Fpa
 *  JPa
 *  JSa
 *  Js
 *  Kpa
 *  LQa
 *  Lra
 *  NQa
 *  NTa
 *  Oz
 *  PTa
 *  QSa
 *  Qsa
 *  RQa
 *  SRa
 *  Sqa
 *  Ssa
 *  TQa
 *  Uqa
 *  Uta
 *  WSa
 *  XTa
 *  YSa
 *  Ypa
 *  Yra
 *  Zua
 *  aQa
 *  aqa
 *  asa
 *  cQa
 *  dQa
 *  eS
 *  hra
 *  jpa
 *  kPa
 *  kpa
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  pua
 *  uKa
 *  ura
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class BatterflyWingsV2
extends BaseItem {
    private static Js[] wing;
    private static final Map<String, ResourceLocation> colors;
    private static boolean compiled;
    private static int displayList;
    private String color;

    static {
        colors = new HashMap<String, ResourceLocation>();
        wing = null;
        colors.put(rQa.a, new ResourceLocation(Cra.V, LQa.m));
        colors.put(gQa.r, new ResourceLocation(Cra.V, fta.o));
        colors.put(NSa.A, new ResourceLocation(Cra.V, oua.n));
        colors.put(Cta.W, new ResourceLocation(Cra.V, PTa.g));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        BatterflyWingsV2 a2 = this;
        Kpa.J().J().J(a2.tex);
        uKa.J((float)JPa.N, (float)Qra.j, (float)ATa.x);
        uKa.l((float)Ora.D, (float)Ora.D, (float)Ora.D);
        uKa.e();
        uKa.J((float)Yqa.C, (float)JPa.N, (float)JPa.N);
        uKa.J((float)sSa.E, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Nra.e, (float)JPa.N, (float)JPa.N);
        BatterflyWingsV2 batterflyWingsV2 = a2;
        batterflyWingsV2.f();
        uKa.D();
        uKa.e();
        uKa.J((float)KQa.C, (float)JPa.N, (float)JPa.N);
        uKa.J((float)Yra.V, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Yqa.C, (float)JPa.N, (float)JPa.N);
        batterflyWingsV2.f();
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
        BatterflyWingsV2 batterflyWingsV2 = this;
        float e2 = Oz.C((float)(b2 * JSa.B)) * YSa.G;
        Kpa.J().J().J(batterflyWingsV2.tex);
        uKa.e();
        uKa.h();
        BatterflyWingsV2 batterflyWingsV22 = batterflyWingsV2;
        batterflyWingsV22.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)JPa.N, (float)kTa.J);
        uKa.l((float)xSa.la, (float)xSa.la, (float)xSa.la);
        uKa.e();
        uKa.J((float)Yqa.C, (float)JPa.N, (float)JPa.N);
        uKa.J((float)(sSa.E - e2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Nra.e, (float)JPa.N, (float)JPa.N);
        batterflyWingsV22.f();
        uKa.D();
        uKa.e();
        uKa.J((float)KQa.C, (float)JPa.N, (float)JPa.N);
        uKa.J((float)(Yra.V + e2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Yqa.C, (float)JPa.N, (float)JPa.N);
        batterflyWingsV22.f();
        uKa.D();
        uKa.m();
        uKa.D();
    }

    @Override
    public void f() {
        BatterflyWingsV2 a2;
        if (((BaseItem)a2).compiled) {
            super.f();
            return;
        }
        if (compiled) {
            ((BaseItem)a2).compiled = vRa.d;
            ((BaseItem)a2).displayList = displayList;
            a2.J();
        }
        super.f();
        if (!compiled) {
            compiled = vRa.d;
            displayList = ((BaseItem)a2).displayList;
        }
    }

    public BatterflyWingsV2(String string) {
        BatterflyWingsV2 a2;
        String b2 = string;
        BatterflyWingsV2 batterflyWingsV2 = a2 = this;
        super(eS.BODY);
        a2.textureWidth = ysa.s;
        batterflyWingsV2.textureHeight = ysa.s;
        batterflyWingsV2.useDisplayLists = vRa.d;
        batterflyWingsV2.color = b2;
        if (wing == null) {
            wing = new Js[EPa.O];
            BatterflyWingsV2.wing[uSa.E] = new Js((ModelBase)a2, Yqa.i, pua.o);
            BatterflyWingsV2.wing[vRa.d] = new Js((ModelBase)a2, uSa.E, fPa.i);
            BatterflyWingsV2.wing[uqa.g] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[yRa.d] = new Js((ModelBase)a2, uSa.E, fPa.i);
            BatterflyWingsV2.wing[AQa.P] = new Js((ModelBase)a2, uSa.E, fPa.i);
            BatterflyWingsV2.wing[tTa.h] = new Js((ModelBase)a2, uSa.E, fPa.i);
            BatterflyWingsV2.wing[uua.p] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[XTa.W] = new Js((ModelBase)a2, uSa.E, CRa.L);
            BatterflyWingsV2.wing[Yqa.i] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[WOa.fa] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[NTa.C] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[pPa.f] = new Js((ModelBase)a2, uSa.E, fPa.i);
            BatterflyWingsV2.wing[lqa.s] = new Js((ModelBase)a2, uua.p, Qsa.Ha);
            BatterflyWingsV2.wing[uua.s] = new Js((ModelBase)a2, uSa.E, CRa.L);
            BatterflyWingsV2.wing[hpa.Z] = new Js((ModelBase)a2, uua.p, Qsa.Ha);
            BatterflyWingsV2.wing[Ypa.A] = new Js((ModelBase)a2, uSa.E, CRa.L);
            BatterflyWingsV2.wing[ERa.C] = new Js((ModelBase)a2, uSa.E, CRa.L);
            BatterflyWingsV2.wing[yta.Ka] = new Js((ModelBase)a2, uSa.E, kra.U);
            BatterflyWingsV2.wing[yOa.B] = new Js((ModelBase)a2, uSa.E, kra.U);
            BatterflyWingsV2.wing[wOa.t] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[kTa.j] = new Js((ModelBase)a2, uSa.E, Bpa.Ha);
            BatterflyWingsV2.wing[wOa.h] = new Js((ModelBase)a2, uSa.E, kra.U);
            BatterflyWingsV2.wing[cQa.o] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[AQa.ba] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[osa.c] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[kTa.g] = new Js((ModelBase)a2, uSa.E, Qsa.Ha);
            BatterflyWingsV2.wing[ITa.E] = new Js((ModelBase)a2, uSa.E, fPa.i);
            BatterflyWingsV2.wing[Lra.e] = new Js((ModelBase)a2, uSa.E, fPa.i);
            wing[uSa.E].J(Ira.d, NQa.d, Yqa.L, uSa.E, wOa.h, lqa.s);
            wing[vRa.d].J(pqa.r, Bpa.Ea, eua.l, vRa.d, vRa.d, yRa.d);
            wing[uqa.g].J(pqa.r, Era.Ga, dQa.j, vRa.d, vRa.d, uqa.g);
            wing[yRa.d].J(pqa.r, QSa.L, pua.P, vRa.d, vRa.d, yRa.d);
            wing[AQa.P].J(pqa.r, MTa.y, Sqa.P, vRa.d, vRa.d, yRa.d);
            wing[tTa.h].J(pqa.r, Qra.j, eta.x, vRa.d, vRa.d, yRa.d);
            wing[uua.p].J(pqa.r, YSa.la, aqa.Ka, vRa.d, vRa.d, uqa.g);
            wing[XTa.W].J(pqa.r, Iqa.D, bsa.p, vRa.d, vRa.d, vRa.d);
            wing[Yqa.i].J(pqa.r, PTa.d, EQa.G, vRa.d, vRa.d, uqa.g);
            wing[WOa.fa].J(pqa.r, DPa.Ja, aua.X, vRa.d, vRa.d, uqa.g);
            wing[NTa.C].J(pqa.r, Uta.q, Tqa.Y, vRa.d, vRa.d, uqa.g);
            wing[pPa.f].J(pqa.r, eta.x, Ssa.la, vRa.d, vRa.d, yRa.d);
            wing[lqa.s].J(pqa.r, vQa.q, PQa.n, vRa.d, uqa.g, vRa.d);
            wing[uua.s].J(pqa.r, fPa.ha, asa.S, vRa.d, vRa.d, vRa.d);
            wing[hpa.Z].J(pqa.r, Jta.r, Npa.la, vRa.d, uqa.g, vRa.d);
            wing[Ypa.A].J(pqa.r, Zua.D, sSa.Ga, vRa.d, vRa.d, vRa.d);
            wing[ERa.C].J(pqa.r, jpa.K, csa.P, vRa.d, vRa.d, vRa.d);
            wing[yta.Ka].J(pqa.r, SRa.V, ROa.J, vRa.d, vRa.d, AQa.P);
            wing[yOa.B].J(pqa.r, TQa.j, YSa.V, vRa.d, vRa.d, AQa.P);
            wing[wOa.t].J(pqa.r, jpa.K, dua.ca, vRa.d, vRa.d, uqa.g);
            wing[kTa.j].J(pqa.r, YSa.G, dQa.j, vRa.d, XTa.W, vRa.d);
            wing[wOa.h].J(pqa.r, kpa.fa, eta.x, vRa.d, vRa.d, AQa.P);
            wing[cQa.o].J(pqa.r, Era.s, Uta.q, vRa.d, vRa.d, uqa.g);
            wing[AQa.ba].J(pqa.r, csa.P, lPa.X, vRa.d, vRa.d, uqa.g);
            wing[osa.c].J(pqa.r, NQa.ga, bsa.p, vRa.d, vRa.d, uqa.g);
            wing[kTa.g].J(pqa.r, NQa.ga, fPa.ha, vRa.d, vRa.d, uqa.g);
            wing[ITa.E].J(pqa.r, xSa.F, kPa.Ga, vRa.d, vRa.d, yRa.d);
            wing[Lra.e].J(pqa.r, Cta.z, ROa.J, vRa.d, vRa.d, yRa.d);
            BatterflyWingsV2 batterflyWingsV22 = a2;
            batterflyWingsV22.J(wing[uSa.E], JPa.N, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[vRa.d], FRa.Z, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[uqa.g], RQa.g, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[yRa.d], vpa.P, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[AQa.P], Fpa.a, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[tTa.h], WPa.z, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[uua.p], aQa.W, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[XTa.W], Jra.Z, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[Yqa.i], SPa.X, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[WOa.fa], FRa.Ma, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[NTa.C], hra.a, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[pPa.f], FRa.Ma, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[lqa.s], Yra.M, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[uua.s], Qpa.v, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[hpa.Z], Qpa.v, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[Ypa.A], Bpa.A, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[ERa.C], Qpa.v, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[yta.Ka], Yra.M, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[yOa.B], Qpa.v, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[wOa.t], lPa.q, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[kTa.j], JPa.N, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[wOa.h], zsa.E, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[cQa.o], TQa.C, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[AQa.ba], Jra.Ja, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[osa.c], KSa.e, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[kTa.g], oua.c, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[ITa.E], ura.U, WSa.S, JPa.N);
            batterflyWingsV22.J(wing[Lra.e], Uqa.f, WSa.S, JPa.N);
        }
        a2.J(colors.get(b2));
    }
}

