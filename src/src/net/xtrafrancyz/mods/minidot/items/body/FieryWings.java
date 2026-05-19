/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Cra
 *  JPa
 *  Js
 *  Kpa
 *  LQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  Tpa
 *  Usa
 *  XTa
 *  YSa
 *  Yra
 *  aSa
 *  bSa
 *  cQa
 *  cRa
 *  eS
 *  fTa
 *  fpa
 *  hqa
 *  jsa
 *  kPa
 *  kpa
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  vQa
 *  vRa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class FieryWings
extends BaseItem {
    private String color;
    private static Js[] Shape;
    private static final Map<String, ResourceLocation> colors;
    private static boolean compiled;
    private static int displayList;

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(rQa.Y, new ResourceLocation(Cra.V, uqa.t));
        colors.put(rQa.a, new ResourceLocation(Cra.V, Nta.d));
        colors.put(NSa.A, new ResourceLocation(Cra.V, cPa.n));
        colors.put(bSa.q, new ResourceLocation(Cra.V, hqa.ja));
        colors.put(aSa.F, new ResourceLocation(Cra.V, jsa.w));
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
        FieryWings fieryWings = this;
        float e2 = Oz.C((float)(b2 * VPa.i)) * Qsa.k;
        Kpa.J().J().J(fieryWings.tex);
        uKa.e();
        uKa.h();
        FieryWings fieryWings2 = fieryWings;
        fieryWings.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)ATa.x, (float)PQa.T);
        uKa.l((float)ZSa.q, (float)xSa.la, (float)Ora.D);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)JPa.N, (float)JPa.N, (float)kTa.J);
        uKa.J((float)Yra.i, (float)vqa.T, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        fieryWings2.f();
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.J((float)JPa.N, (float)JPa.N, (float)kTa.J);
        uKa.J((float)Yra.i, (float)vqa.T, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        fieryWings2.f();
        uKa.D();
        uKa.m();
        uKa.D();
    }

    @Override
    public void f() {
        FieryWings a2;
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

    @Override
    public void J(float f2) {
        float b2 = f2;
        FieryWings a2 = this;
        Kpa.J().J().J(a2.tex);
        uKa.h();
        uKa.J((float)JPa.N, (float)Qra.j, (float)ATa.x);
        uKa.l((float)kPa.W, (float)Xpa.R, (float)kPa.W);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)JPa.N, (float)JPa.N, (float)kTa.J);
        uKa.J((float)eua.C, (float)vqa.T, (float)pqa.r, (float)JPa.N);
        uKa.J((float)FRa.Ga, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        FieryWings fieryWings = a2;
        fieryWings.f();
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.J((float)JPa.N, (float)JPa.N, (float)kTa.J);
        uKa.J((float)eua.C, (float)vqa.T, (float)pqa.r, (float)JPa.N);
        uKa.J((float)FRa.Ga, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        fieryWings.f();
        uKa.D();
        uKa.m();
    }

    public FieryWings(String string) {
        FieryWings a2;
        String b2 = string;
        FieryWings fieryWings = a2 = this;
        super(eS.BODY);
        a2.textureWidth = ysa.s;
        fieryWings.textureHeight = ysa.s;
        fieryWings.useDisplayLists = vRa.d;
        fieryWings.color = b2;
        if (Shape == null) {
            Shape = new Js[pPa.f];
            FieryWings.Shape[uSa.E] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[vRa.d] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[uqa.g] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[yRa.d] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[AQa.P] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[tTa.h] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[uua.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[XTa.W] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[Yqa.i] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[WOa.fa] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[NTa.C] = new Js((ModelBase)a2, uSa.E, uSa.E);
            FieryWings.Shape[uqa.g].scaleModifier = KPa.w;
            FieryWings.Shape[yRa.d].scaleModifier = KPa.w;
            FieryWings.Shape[NTa.C].scaleModifier = KPa.w;
            Shape[uSa.E].J(NQa.m, fpa.G, kta.v, uSa.E, fPa.i, cQa.o);
            Shape[vRa.d].J(CRa.M, NQa.m, Tpa.Ja, uqa.g, AQa.P, uqa.g);
            Shape[uqa.g].J(CRa.M, NQa.m, pPa.c, uqa.g, AQa.P, uqa.g);
            Shape[yRa.d].J(CRa.M, pua.P, pPa.c, uqa.g, uqa.g, uqa.g);
            Shape[AQa.P].J(CRa.M, lqa.ga, eua.n, uqa.g, uqa.g, AQa.P);
            Shape[tTa.h].J(CRa.M, fTa.H, vQa.q, uqa.g, AQa.P, uqa.g);
            Shape[uua.p].J(CRa.M, YSa.G, NPa.B, uqa.g, uqa.g, uua.p);
            Shape[XTa.W].J(CRa.M, oua.b, psa.N, uqa.g, AQa.P, uqa.g);
            Shape[Yqa.i].J(CRa.M, ySa.Da, NPa.B, uqa.g, uqa.g, AQa.P);
            Shape[WOa.fa].J(CRa.M, csa.P, kpa.fa, uqa.g, AQa.P, uqa.g);
            Shape[NTa.C].J(CRa.M, JPa.N, JPa.N, uqa.g, AQa.P, AQa.P);
            Shape[uSa.E].J(JPa.N, YSa.G, kta.v);
            Shape[vRa.d].J(JPa.N, YSa.G, kta.v);
            Shape[uqa.g].J(JPa.N, YSa.G, kta.v);
            Shape[yRa.d].J(JPa.N, YSa.G, kta.v);
            Shape[AQa.P].J(JPa.N, YSa.G, kta.v);
            Shape[tTa.h].J(JPa.N, YSa.G, kta.v);
            Shape[uua.p].J(JPa.N, YSa.G, kta.v);
            Shape[XTa.W].J(JPa.N, YSa.G, kta.v);
            Shape[Yqa.i].J(JPa.N, YSa.G, kta.v);
            Shape[WOa.fa].J(JPa.N, YSa.G, kta.v);
            Shape[NTa.C].J(JPa.N, YSa.G, kta.v);
            FieryWings fieryWings2 = a2;
            fieryWings2.J(Shape[uSa.E], GPa.q, WPa.z, JPa.N);
            fieryWings2.J(Shape[vRa.d], LQa.fa, WPa.z, JPa.N);
            fieryWings2.J(Shape[uqa.g], LQa.fa, WPa.z, JPa.N);
            fieryWings2.J(Shape[yRa.d], cRa.z, WPa.z, JPa.N);
            fieryWings2.J(Shape[AQa.P], ITa.v, WPa.z, JPa.N);
            fieryWings2.J(Shape[tTa.h], pPa.Y, WPa.z, JPa.N);
            fieryWings2.J(Shape[uua.p], Bsa.h, WPa.z, JPa.N);
            fieryWings2.J(Shape[XTa.W], Usa.Q, WPa.z, JPa.N);
            fieryWings2.J(Shape[Yqa.i], Bsa.h, WPa.z, JPa.N);
            fieryWings2.J(Shape[WOa.fa], qQa.M, WPa.z, JPa.N);
            fieryWings2.J(Shape[NTa.C], ITa.v, WPa.z, JPa.N);
        }
        a2.J(colors.get(b2));
    }
}

