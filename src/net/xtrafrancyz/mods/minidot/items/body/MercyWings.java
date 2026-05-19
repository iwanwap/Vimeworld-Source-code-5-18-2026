/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  Cta
 *  EQa
 *  ERa
 *  Epa
 *  JPa
 *  Js
 *  Kpa
 *  Lqa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Qqa
 *  Qsa
 *  Qta
 *  SQa
 *  VQa
 *  Vua
 *  XTa
 *  YSa
 *  Ypa
 *  Yra
 *  eS
 *  fpa
 *  fsa
 *  iPa
 *  kPa
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  uOa
 *  vPa
 *  vRa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class MercyWings
extends BaseItem {
    private static Js[] wing;
    private static final Map<String, ResourceLocation> colors;
    private static boolean compiled;
    private static int displayList;
    private String color;

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(rQa.Y, new ResourceLocation(Cra.V, zua.h));
        colors.put(QTa.v, new ResourceLocation(Cra.V, bsa.U));
        colors.put(yRa.J, new ResourceLocation(Cra.V, kra.O));
        colors.put(Cta.W, new ResourceLocation(Cra.V, fqa.g));
        colors.put(rQa.a, new ResourceLocation(Cra.V, Qta.X));
        colors.put(pta.A, new ResourceLocation(Cra.V, vTa.F));
    }

    public MercyWings(String string) {
        MercyWings a2;
        String b2 = string;
        MercyWings mercyWings = a2 = this;
        super(eS.BODY);
        a2.textureWidth = ysa.s;
        mercyWings.textureHeight = fPa.i;
        mercyWings.useDisplayLists = vRa.d;
        mercyWings.color = b2;
        if (wing == null) {
            wing = new Js[wOa.h];
            MercyWings.wing[uSa.E] = new Js((ModelBase)a2, tua.U, AQa.P);
            wing[uSa.E].J(vPa.b, FRa.ca, JPa.N, vRa.d, uqa.g, uqa.g);
            MercyWings.wing[uSa.E].mirror = vRa.d;
            a2.J(wing[uSa.E], Upa.d, Yua.U, JPa.N);
            MercyWings.wing[vRa.d] = new Js((ModelBase)a2, ITa.E, uSa.E);
            wing[vRa.d].J(vqa.T, vqa.T, vPa.b, uqa.g, uqa.g, vRa.d);
            MercyWings.wing[vRa.d].mirror = vRa.d;
            a2.J(wing[vRa.d], Hra.H, JPa.N, JPa.N);
            MercyWings.wing[uqa.g] = new Js((ModelBase)a2, Zqa.G, WOa.fa);
            wing[uqa.g].J(vPa.b, KSa.Y, hpa.L, vRa.d, yRa.d, vRa.d);
            MercyWings.wing[uqa.g].mirror = vRa.d;
            a2.J(wing[uqa.g], fpa.Da, Yua.U, JPa.N);
            MercyWings.wing[yRa.d] = new Js((ModelBase)a2, ITa.E, WOa.fa);
            wing[yRa.d].J(iPa.Fa, EQa.G, vPa.b, vRa.d, AQa.P, uqa.g);
            MercyWings.wing[yRa.d].mirror = vRa.d;
            a2.J(wing[yRa.d], XOa.r, Yua.U, JPa.N);
            MercyWings.wing[AQa.P] = new Js((ModelBase)a2, ITa.E, AQa.P);
            wing[AQa.P].J(vPa.b, FRa.ca, xSa.la, vRa.d, yRa.d, vRa.d);
            MercyWings.wing[AQa.P].mirror = vRa.d;
            a2.J(wing[AQa.P], xra.K, Yua.U, JPa.N);
            MercyWings.wing[tTa.h] = new Js((ModelBase)a2, ITa.E, uSa.E);
            wing[tTa.h].J(vqa.T, JPa.N, vPa.b, uqa.g, uqa.g, vRa.d);
            MercyWings.wing[tTa.h].mirror = vRa.d;
            a2.J(wing[tTa.h], Nra.D, JPa.N, JPa.N);
            MercyWings.wing[uua.p] = new Js((ModelBase)a2, hpa.Z, uSa.E);
            wing[uua.p].J(Lqa.a, Jta.r, kta.v, vRa.d, uqa.g, vRa.d);
            MercyWings.wing[uua.p].mirror = vRa.d;
            a2.J(wing[uua.p], XTa.fa, Yua.U, JPa.N);
            MercyWings.wing[XTa.W] = new Js((ModelBase)a2, hpa.Z, uSa.E);
            wing[XTa.W].J(SQa.w, Jta.r, kta.v, vRa.d, uqa.g, vRa.d);
            MercyWings.wing[XTa.W].mirror = vRa.d;
            a2.J(wing[XTa.W], XTa.fa, Yua.U, JPa.N);
            MercyWings.wing[Yqa.i] = new Js((ModelBase)a2, wOa.t, AQa.P);
            wing[Yqa.i].J(Lqa.a, YSa.G, YSa.G, vRa.d, yRa.d, vRa.d);
            MercyWings.wing[Yqa.i].mirror = vRa.d;
            a2.J(wing[Yqa.i], fpa.m, Yua.U, JPa.N);
            MercyWings.wing[WOa.fa] = new Js((ModelBase)a2, wOa.t, AQa.P);
            wing[WOa.fa].J(SQa.w, YSa.G, YSa.G, vRa.d, yRa.d, vRa.d);
            MercyWings.wing[WOa.fa].mirror = vRa.d;
            a2.J(wing[WOa.fa], fpa.m, Yua.U, JPa.N);
            MercyWings.wing[NTa.C] = new Js((ModelBase)a2, wOa.t, uSa.E);
            wing[NTa.C].J(SQa.w, MTa.y, YSa.G, vRa.d, vRa.d, uqa.g);
            MercyWings.wing[NTa.C].mirror = vRa.d;
            a2.J(wing[NTa.C], osa.Da, Yua.U, JPa.N);
            MercyWings.wing[pPa.f] = new Js((ModelBase)a2, wOa.t, uSa.E);
            wing[pPa.f].J(Lqa.a, MTa.y, YSa.G, vRa.d, vRa.d, uqa.g);
            MercyWings.wing[pPa.f].mirror = vRa.d;
            a2.J(wing[pPa.f], osa.Da, Yua.U, JPa.N);
            MercyWings.wing[lqa.s] = new Js((ModelBase)a2, lqa.s, AQa.P);
            wing[lqa.s].J(lTa.Z, NQa.m, lqa.ga, vRa.d, uqa.g, uqa.g);
            MercyWings.wing[lqa.s].mirror = vRa.d;
            a2.J(wing[lqa.s], fqa.e, Yua.U, JPa.N);
            MercyWings.wing[uua.s] = new Js((ModelBase)a2, lqa.s, AQa.P);
            wing[uua.s].J(zpa.ja, NQa.m, lqa.ga, vRa.d, uqa.g, uqa.g);
            MercyWings.wing[uua.s].mirror = vRa.d;
            a2.J(wing[uua.s], fqa.e, Yua.U, JPa.N);
            MercyWings.wing[hpa.Z] = new Js((ModelBase)a2, WOa.fa, uSa.E);
            wing[hpa.Z].J(vPa.b, sOa.Z, kta.v, vRa.d, uqa.g, vRa.d);
            MercyWings.wing[hpa.Z].mirror = vRa.d;
            a2.J(wing[hpa.Z], Vua.l, Yua.U, JPa.N);
            MercyWings.wing[Ypa.A] = new Js((ModelBase)a2, uSa.E, Yqa.i);
            wing[Ypa.A].J(vPa.b, Wqa.V, fsa.ba, vRa.d, vRa.d, tTa.h);
            MercyWings.wing[Ypa.A].mirror = vRa.d;
            a2.J(wing[Ypa.A], Npa.r, Yua.U, JPa.N);
            MercyWings.wing[ERa.C] = new Js((ModelBase)a2, uSa.E, uua.p);
            wing[ERa.C].J(JPa.N, ySa.fa, BRa.k, uSa.E, uqa.g, pPa.f);
            MercyWings.wing[ERa.C].mirror = vRa.d;
            a2.J(wing[ERa.C], VQa.D, Yua.U, JPa.N);
            MercyWings.wing[yta.Ka] = new Js((ModelBase)a2, uSa.E, XTa.W);
            wing[yta.Ka].J(Yqa.C, Era.s, YSa.G, uSa.E, uqa.g, uua.s);
            MercyWings.wing[yta.Ka].mirror = vRa.d;
            a2.J(wing[yta.Ka], uOa.T, Yua.U, JPa.N);
            MercyWings.wing[yOa.B] = new Js((ModelBase)a2, uSa.E, NTa.C);
            wing[yOa.B].J(JPa.N, sOa.Z, MTa.y, uSa.E, uqa.g, uua.s);
            MercyWings.wing[yOa.B].mirror = vRa.d;
            a2.J(wing[yOa.B], Qqa.ca, Yua.U, JPa.N);
            MercyWings.wing[wOa.t] = new Js((ModelBase)a2, uSa.E, Ypa.A);
            wing[wOa.t].J(Yqa.C, NQa.d, pqa.r, uSa.E, uqa.g, pPa.f);
            MercyWings.wing[wOa.t].mirror = vRa.d;
            a2.J(wing[wOa.t], nOa.J, Yua.U, JPa.N);
            MercyWings.wing[kTa.j] = new Js((ModelBase)a2, uSa.E, kTa.j);
            wing[kTa.j].J(JPa.N, NSa.b, iPa.Fa, uSa.E, uqa.g, WOa.fa);
            MercyWings.wing[kTa.j].mirror = vRa.d;
            a2.J(wing[kTa.j], Epa.Q, Yua.U, JPa.N);
        }
        a2.J(colors.get(b2));
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
        MercyWings mercyWings = this;
        float e2 = Oz.C((float)(b2 * VPa.i)) * Qsa.k;
        Kpa.J().J().J(mercyWings.tex);
        uKa.e();
        uKa.h();
        MercyWings mercyWings2 = mercyWings;
        mercyWings.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)psa.N, (float)PQa.T);
        uKa.l((float)pqa.r, (float)pPa.c, (float)ATa.r);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)Mqa.Ga, (float)JPa.N, (float)kTa.J);
        uKa.J((float)Yra.i, (float)vqa.T, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        mercyWings2.f();
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.J((float)Mqa.Ga, (float)JPa.N, (float)kTa.J);
        uKa.J((float)Yra.i, (float)vqa.T, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        mercyWings2.f();
        uKa.D();
        uKa.m();
        uKa.D();
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        MercyWings a2 = this;
        Kpa.J().J().J(a2.tex);
        uKa.J((float)JPa.N, (float)vsa.z, (float)SQa.w);
        uKa.l((float)MQa.L, (float)nOa.s, (float)nOa.s);
        uKa.e();
        uKa.J((float)Nra.e, (float)JPa.N, (float)JPa.N);
        uKa.J((float)kPa.Ha, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        MercyWings mercyWings = a2;
        mercyWings.f();
        uKa.D();
        uKa.e();
        uKa.J((float)Qra.j, (float)JPa.N, (float)JPa.N);
        mercyWings.f();
        uKa.D();
    }

    @Override
    public void f() {
        MercyWings a2;
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
}

