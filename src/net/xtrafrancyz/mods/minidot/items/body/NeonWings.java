/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cra
 *  Cta
 *  ERa
 *  Gua
 *  ISa
 *  JPa
 *  Js
 *  Kpa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Qsa
 *  SQa
 *  Sqa
 *  TPa
 *  TQa
 *  Wsa
 *  XTa
 *  YSa
 *  Ypa
 *  Zpa
 *  cQa
 *  eS
 *  fpa
 *  kpa
 *  kta
 *  lPa
 *  lqa
 *  mra
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vQa
 *  vRa
 *  vpa
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

public final class NeonWings
extends BaseItem {
    private static boolean compiled;
    private static Js[] wing;
    private static int displayList;
    private static final Map<String, ResourceLocation> colors;
    private String color;

    @Override
    public void f() {
        NeonWings a2;
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

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        void b2;
        NeonWings neonWings = this;
        float e2 = Oz.C((float)(b2 * VPa.i)) * lqa.ga;
        Kpa.J().J().J(neonWings.tex);
        uKa.e();
        NeonWings neonWings2 = neonWings;
        neonWings.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)psa.N, (float)Nra.e);
        uKa.l((float)Sqa.g, (float)wOa.w, (float)ZSa.q);
        uKa.e();
        uKa.J((float)Nra.e, (float)JPa.N, (float)JPa.N);
        uKa.J((float)FRa.Ga, (float)pqa.r, (float)MQa.L, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)psa.N, (float)JPa.N);
        uKa.J((float)psa.N, (float)JPa.N, (float)JPa.N);
        neonWings2.f();
        uKa.D();
        uKa.e();
        uKa.J((float)Qra.j, (float)JPa.N, (float)JPa.N);
        uKa.J((float)Cra.fa, (float)vqa.T, (float)MQa.L, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        uKa.J((float)Nra.e, (float)JPa.N, (float)JPa.N);
        neonWings2.f();
        uKa.D();
        uKa.D();
    }

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(rQa.a, new ResourceLocation(Cra.V, kua.S));
        colors.put(yRa.J, new ResourceLocation(Cra.V, Gua.r));
        colors.put(rQa.Y, new ResourceLocation(Cra.V, TPa.Y));
        colors.put(QTa.v, new ResourceLocation(Cra.V, opa.g));
        colors.put(NSa.A, new ResourceLocation(Cra.V, Wsa.S));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        NeonWings a2 = this;
        Kpa.J().J().J(a2.tex);
        uKa.J((float)Yqa.C, (float)KQa.C, (float)SQa.w);
        uKa.l((float)vTa.N, (float)fpa.ea, (float)JPa.c);
        uKa.e();
        uKa.J((float)FRa.Ga, (float)pqa.r, (float)kta.v, (float)JPa.N);
        uKa.J((float)psa.N, (float)JPa.N, (float)JPa.N);
        NeonWings neonWings = a2;
        neonWings.f();
        uKa.D();
        uKa.e();
        uKa.J((float)Cra.fa, (float)vqa.T, (float)kta.v, (float)JPa.N);
        neonWings.f();
        uKa.D();
    }

    public NeonWings(String string) {
        NeonWings a2;
        String b2 = string;
        NeonWings neonWings = a2 = this;
        super(eS.BODY);
        a2.textureWidth = ysa.s;
        neonWings.textureHeight = fPa.i;
        neonWings.useDisplayLists = vRa.d;
        neonWings.color = b2;
        if (wing == null) {
            wing = new Js[ITa.E];
            NeonWings.wing[lqa.s] = new Js((ModelBase)a2, Qsa.Ha, uSa.E);
            wing[lqa.s].J(NQa.m, JPa.N, Qsa.k, uqa.g, yRa.d, uqa.g);
            NeonWings.wing[lqa.s].mirror = vRa.d;
            a2.J(wing[lqa.s], JPa.N, JPa.N, JPa.N);
            NeonWings.wing[kTa.j] = new Js((ModelBase)a2, ISa.E, uua.p);
            wing[kTa.j].J(NQa.m, JPa.N, KSa.I, uqa.g, yRa.d, AQa.P);
            NeonWings.wing[kTa.j].mirror = vRa.d;
            a2.J(wing[kTa.j], JPa.N, JPa.N, JPa.N);
            NeonWings.wing[ERa.C] = new Js((ModelBase)a2, vRa.d, ERa.C);
            wing[ERa.C].J(Ura.T, MQa.L, FRa.Ga, vRa.d, uqa.g, hpa.Z);
            NeonWings.wing[ERa.C].mirror = vRa.d;
            a2.J(wing[ERa.C], JPa.N, JPa.N, JPa.N);
            NeonWings.wing[osa.c] = new Js((ModelBase)a2, Bpa.Ha, yRa.d);
            wing[osa.c].J(Ura.T, pqa.r, mra.q, vRa.d, vRa.d, vRa.d);
            NeonWings.wing[osa.c].mirror = vRa.d;
            a2.J(wing[osa.c], JPa.N, JPa.N, JPa.N);
            NeonWings.wing[pPa.f] = new Js((ModelBase)a2, Qsa.Ha, uSa.E);
            wing[pPa.f].J(NQa.m, kpa.fa, Qsa.k, uqa.g, yRa.d, uqa.g);
            NeonWings.wing[pPa.f].mirror = vRa.d;
            a2.J(wing[pPa.f], tpa.M, JPa.N, JPa.N);
            NeonWings.wing[Ypa.A] = new Js((ModelBase)a2, uSa.E, Ypa.A);
            wing[Ypa.A].J(Ura.T, AQa.d, FRa.Ga, vRa.d, uqa.g, Ypa.A);
            NeonWings.wing[Ypa.A].mirror = vRa.d;
            a2.J(wing[Ypa.A], tpa.M, JPa.N, JPa.N);
            NeonWings.wing[wOa.t] = new Js((ModelBase)a2, vpa.o, tTa.h);
            wing[wOa.t].J(NQa.m, kpa.fa, sSa.E, uqa.g, yRa.d, tTa.h);
            NeonWings.wing[wOa.t].mirror = vRa.d;
            a2.J(wing[wOa.t], tpa.M, JPa.N, JPa.N);
            NeonWings.wing[AQa.ba] = new Js((ModelBase)a2, Bpa.Ha, yRa.d);
            wing[AQa.ba].J(Ura.T, FRa.ca, NSa.B, vRa.d, vRa.d, vRa.d);
            NeonWings.wing[AQa.ba].mirror = vRa.d;
            a2.J(wing[AQa.ba], tpa.M, JPa.N, JPa.N);
            NeonWings.wing[uua.s] = new Js((ModelBase)a2, Qsa.Ha, uSa.E);
            wing[uua.s].J(NQa.m, ySa.Da, QTa.z, uqa.g, yRa.d, uqa.g);
            NeonWings.wing[uua.s].mirror = vRa.d;
            a2.J(wing[uua.s], Qpa.v, JPa.N, JPa.N);
            NeonWings.wing[yta.Ka] = new Js((ModelBase)a2, AQa.P, wOa.t);
            wing[yta.Ka].J(Ura.T, CRa.la, sSa.F, vRa.d, uqa.g, pPa.f);
            NeonWings.wing[yta.Ka].mirror = vRa.d;
            a2.J(wing[yta.Ka], Qpa.v, JPa.N, JPa.N);
            NeonWings.wing[wOa.h] = new Js((ModelBase)a2, GPa.C, uua.s);
            wing[wOa.h].J(NQa.m, ySa.Da, fqa.K, uqa.g, yRa.d, yRa.d);
            NeonWings.wing[wOa.h].mirror = vRa.d;
            a2.J(wing[wOa.h], Qpa.v, JPa.N, JPa.N);
            NeonWings.wing[kTa.g] = new Js((ModelBase)a2, Bpa.Ha, yRa.d);
            wing[kTa.g].J(Ura.T, Zpa.o, Psa.D, vRa.d, vRa.d, vRa.d);
            NeonWings.wing[kTa.g].mirror = vRa.d;
            a2.J(wing[kTa.g], Qpa.v, JPa.N, JPa.N);
            NeonWings.wing[hpa.Z] = new Js((ModelBase)a2, Qsa.Ha, uSa.E);
            wing[hpa.Z].J(NQa.m, vQa.q, KSa.M, uqa.g, yRa.d, uqa.g);
            NeonWings.wing[hpa.Z].mirror = vRa.d;
            a2.J(wing[hpa.Z], lPa.q, JPa.N, JPa.N);
            NeonWings.wing[yOa.B] = new Js((ModelBase)a2, XTa.W, cQa.o);
            wing[yOa.B].J(Ura.T, Bpa.w, Tqa.C, vRa.d, uqa.g, Yqa.i);
            NeonWings.wing[yOa.B].mirror = vRa.d;
            a2.J(wing[yOa.B], lPa.q, JPa.N, JPa.N);
            NeonWings.wing[cQa.o] = new Js((ModelBase)a2, GPa.C, uua.s);
            wing[cQa.o].J(NQa.m, vQa.q, rpa.Ga, uqa.g, yRa.d, yRa.d);
            NeonWings.wing[cQa.o].mirror = vRa.d;
            a2.J(wing[cQa.o], lPa.q, JPa.N, JPa.N);
            NeonWings.wing[uSa.E] = new Js((ModelBase)a2, Bpa.Ha, yRa.d);
            wing[uSa.E].J(Ura.T, YSa.G, rQa.fa, vRa.d, vRa.d, vRa.d);
            NeonWings.wing[uSa.E].mirror = vRa.d;
            a2.J(wing[uSa.E], lPa.q, JPa.N, JPa.N);
            NeonWings.wing[XTa.W] = new Js((ModelBase)a2, Yqa.D, uSa.E);
            wing[XTa.W].J(Ura.T, FRa.ca, lqa.ga, vRa.d, vRa.d, uqa.g);
            NeonWings.wing[XTa.W].mirror = vRa.d;
            a2.J(wing[XTa.W], tpa.M, JPa.N, JPa.N);
            NeonWings.wing[Yqa.i] = new Js((ModelBase)a2, Yqa.D, uSa.E);
            wing[Yqa.i].J(Ura.T, pqa.r, lqa.ga, vRa.d, vRa.d, uqa.g);
            NeonWings.wing[Yqa.i].mirror = vRa.d;
            a2.J(wing[Yqa.i], JPa.N, JPa.N, JPa.N);
            NeonWings.wing[WOa.fa] = new Js((ModelBase)a2, Yqa.D, uSa.E);
            wing[WOa.fa].J(Ura.T, Zpa.o, Cta.z, vRa.d, vRa.d, uqa.g);
            NeonWings.wing[WOa.fa].mirror = vRa.d;
            a2.J(wing[WOa.fa], Qpa.v, JPa.N, JPa.N);
            NeonWings.wing[NTa.C] = new Js((ModelBase)a2, Yqa.D, uSa.E);
            wing[NTa.C].J(Ura.T, YSa.G, kta.Q, vRa.d, vRa.d, uqa.g);
            NeonWings.wing[NTa.C].mirror = vRa.d;
            a2.J(wing[NTa.C], lPa.q, JPa.N, JPa.N);
            NeonWings.wing[uqa.g] = new Js((ModelBase)a2, vpa.o, uSa.E);
            wing[uqa.g].J(Ura.T, Ppa.Ha, eua.C, vRa.d, yRa.d, vRa.d);
            NeonWings.wing[uqa.g].mirror = vRa.d;
            a2.J(wing[uqa.g], tpa.M, JPa.N, JPa.N);
            NeonWings.wing[yRa.d] = new Js((ModelBase)a2, vpa.o, uSa.E);
            wing[yRa.d].J(Ura.T, JPa.N, eua.C, vRa.d, yRa.d, vRa.d);
            NeonWings.wing[yRa.d].mirror = vRa.d;
            a2.J(wing[yRa.d], JPa.N, JPa.N, JPa.N);
            NeonWings.wing[vRa.d] = new Js((ModelBase)a2, GPa.C, uSa.E);
            wing[vRa.d].J(Ura.T, Ppa.Ha, pqa.r, vRa.d, vRa.d, AQa.P);
            NeonWings.wing[vRa.d].mirror = vRa.d;
            a2.J(wing[vRa.d], tpa.M, JPa.N, JPa.N);
            NeonWings.wing[AQa.P] = new Js((ModelBase)a2, vpa.o, uSa.E);
            wing[AQa.P].J(Ura.T, ySa.Da, yta.b, vRa.d, yRa.d, vRa.d);
            NeonWings.wing[AQa.P].mirror = vRa.d;
            a2.J(wing[AQa.P], Qpa.v, JPa.N, JPa.N);
            NeonWings.wing[uua.p] = new Js((ModelBase)a2, GPa.C, uSa.E);
            wing[uua.p].J(Ura.T, eua.C, CRa.la, vRa.d, vRa.d, AQa.P);
            NeonWings.wing[uua.p].mirror = vRa.d;
            a2.J(wing[uua.p], lPa.q, JPa.N, JPa.N);
            NeonWings.wing[tTa.h] = new Js((ModelBase)a2, vpa.o, uSa.E);
            wing[tTa.h].J(Ura.T, vQa.q, TQa.j, vRa.d, yRa.d, vRa.d);
            NeonWings.wing[tTa.h].mirror = vRa.d;
            a2.J(wing[tTa.h], lPa.q, JPa.N, JPa.N);
        }
        a2.J(colors.get(b2));
    }
}

