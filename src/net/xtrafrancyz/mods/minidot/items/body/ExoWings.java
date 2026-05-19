/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  DQa
 *  Epa
 *  FPa
 *  JPa
 *  Js
 *  KTa
 *  Kpa
 *  Lqa
 *  Lra
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  PTa
 *  Ppa
 *  Qqa
 *  Qsa
 *  Qta
 *  RPa
 *  RQa
 *  SQa
 *  SRa
 *  TQa
 *  Uqa
 *  VQa
 *  WSa
 *  Wsa
 *  XTa
 *  YSa
 *  Yra
 *  Ysa
 *  ZRa
 *  Zpa
 *  Zta
 *  aSa
 *  aqa
 *  bSa
 *  cra
 *  dpa
 *  eS
 *  hqa
 *  iPa
 *  jRa
 *  kPa
 *  kta
 *  lPa
 *  lqa
 *  nQa
 *  pPa
 *  pqa
 *  psa
 *  qta
 *  uKa
 *  ura
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  xOa
 *  ysa
 *  zTa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class ExoWings
extends BaseItem {
    private static final Map<String, ResourceLocation> colors = new HashMap<String, ResourceLocation>();
    private String color;
    private static Js wing = null;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        void b2;
        ExoWings exoWings = this;
        float e2 = Oz.C((float)(b2 * VPa.i)) * lqa.ga;
        Kpa.J().J().J(exoWings.tex);
        uKa.e();
        uKa.h();
        exoWings.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)Nra.e, (float)wsa.W);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)ZSa.q);
        uKa.J((float)vua.G, (float)JPa.N, (float)JPa.N);
        uKa.J((float)(FRa.Ga + e2), (float)JPa.N, (float)ATa.x, (float)JPa.N);
        uKa.J((float)VPa.i, (float)JPa.N, (float)JPa.N);
        wing.C(ATa.q);
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.l((float)pqa.r, (float)pqa.r, (float)ZSa.q);
        uKa.J((float)vua.G, (float)JPa.N, (float)JPa.N);
        uKa.J((float)(FRa.Ga + e2), (float)JPa.N, (float)ATa.x, (float)JPa.N);
        uKa.J((float)VPa.i, (float)JPa.N, (float)JPa.N);
        wing.C(ATa.q);
        uKa.D();
        uKa.m();
        uKa.D();
    }

    static {
        colors.put(rQa.a, new ResourceLocation(Cra.V, tpa.I));
        colors.put(gQa.r, new ResourceLocation(Cra.V, CRa.T));
        colors.put(rQa.Y, new ResourceLocation(Cra.V, iPa.e));
        colors.put(QTa.v, new ResourceLocation(Cra.V, Ira.Y));
        colors.put(NSa.A, new ResourceLocation(Cra.V, gua.c));
    }

    public ExoWings(String string) {
        ExoWings a2;
        String b2 = string;
        ExoWings exoWings = a2 = this;
        super(eS.BODY);
        exoWings.textureWidth = XOa.h;
        exoWings.textureHeight = ysa.s;
        exoWings.color = b2;
        if (wing == null) {
            ExoWings exoWings2 = a2;
            exoWings2.J(ATa.T, uSa.E, lqa.s);
            exoWings2.J(uSa.R, rQa.s, Yqa.i);
            exoWings2.J(aSa.ca, Iqa.M, TQa.ca);
            exoWings2.J(xra.F, ySa.T, EPa.O);
            exoWings2.J(sra.q, BRa.E, EPa.O);
            exoWings2.J(jRa.U, cPa.Ea, uSa.E);
            exoWings2.J(MRa.U, cPa.Ea, uSa.E);
            exoWings2.J(Hta.A, Jra.o, EPa.O);
            exoWings2.J(ura.w, Lqa.h, EPa.O);
            exoWings2.J(qta.R, rQa.s, TQa.ca);
            exoWings2.J(vTa.Z, sOa.D, EPa.O);
            exoWings2.J(tTa.ja, Zta.Ma, TQa.ca);
            exoWings2.J(lTa.B, cPa.Ea, EPa.O);
            exoWings2.J(DQa.t, Zta.Ma, TQa.ca);
            exoWings2.J(mSa.h, rQa.s, EPa.O);
            exoWings2.J(lPa.Ka, cPa.Ea, uSa.E);
            exoWings2.J(yOa.Ka, cPa.Ea, uSa.E);
            exoWings2.J(cra.a, sOa.D, Yqa.i);
            exoWings2.J(Cqa.A, Iqa.M, uSa.E);
            exoWings2.J(Nra.v, cPa.Ea, uSa.E);
            exoWings2.J(Era.U, cPa.Ea, uSa.E);
            exoWings2.J(Gta.j, Zta.Q, uSa.E);
            exoWings2.J(kta.S, dpa.A, uSa.E);
            exoWings2.J(lQa.ba, cPa.Ea, uSa.E);
            exoWings2.J(hqa.Ja, cPa.Ea, uSa.E);
            exoWings2.J(vpa.la, cPa.Ea, Yqa.i);
            exoWings2.J(hqa.z, cPa.Ea, uSa.E);
            exoWings2.J(Nra.E, cPa.Ea, uSa.E);
            exoWings2.J(DPa.A, cPa.Ea, uSa.E);
            exoWings2.J(Qsa.D, cPa.Ea, uSa.E);
            exoWings2.J(yOa.H, cPa.Ea, uSa.E);
            exoWings2.J(KQa.Q, cPa.Ea, uSa.E);
            exoWings2.J(RQa.M, cPa.Ea, uSa.E);
            exoWings2.J(zTa.fa, cPa.Ea, uSa.E);
            exoWings2.J(SRa.G, cPa.Ea, uSa.E);
            exoWings2.J(oQa.C, cPa.Ea, uSa.E);
            exoWings2.J(Qsa.y, cPa.Ea, uSa.E);
            exoWings2.J(Zra.e, Zta.Q, uSa.E);
            exoWings2.J(PRa.e, Iqa.M, uSa.E);
            exoWings2.J(rua.W, cPa.Ea, wOa.h);
            exoWings2.J(vQa.p, Jra.o, Yqa.i);
            exoWings2.J(ySa.y, sOa.D, wOa.h);
            exoWings2.J(xSa.v, cPa.Ea, Yqa.i);
            exoWings2.J(aua.n, BRa.E, Yqa.i);
            exoWings2.J(Qta.s, aqa.Aa, uSa.E);
            exoWings2.J(nQa.N, Iqa.M, uSa.E);
            exoWings2.J(Bua.t, cPa.Ea, uSa.E);
            exoWings2.J(Nta.b, cPa.Ea, uSa.E);
            exoWings2.J(ZRa.o, cPa.Ea, uSa.E);
            exoWings2.J(aSa.B, Iqa.M, uSa.E);
            exoWings2.J(vPa.Z, Zta.Q, uSa.E);
            exoWings2.J(PTa.x, cPa.Ea, uSa.E);
            exoWings2.J(ZSa.Da, cPa.Ea, uSa.E);
            exoWings2.J(csa.X, cPa.Ea, uSa.E);
            exoWings2.J(WSa.A, cPa.Ea, uSa.E);
            exoWings2.J(Ppa.k, cPa.Ea, uSa.E);
            exoWings2.J(jRa.i, Zta.Q, uSa.E);
            exoWings2.J(kua.z, Zta.Q, uSa.E);
            exoWings2.J(Npa.p, Zta.Q, uSa.E);
            wing = new Js((ModelBase)a2, sra.I);
            wing.J(Ppa.Ha, JPa.N, JPa.N);
            ExoWings.wing.mirror = vRa.d;
            wing.J(lQa.U, JPa.N, Jsa.o, JPa.N, uSa.E, Lra.e, kTa.g);
            wing.J(Wsa.t, vPa.b, JPa.N, JPa.N, vRa.d, tTa.h, vRa.d);
            wing.J(Qsa.K, vPa.b, vqa.T, pqa.r, vRa.d, tTa.h, uqa.g);
            wing.J(JPa.d, vPa.b, JPa.N, vQa.q, vRa.d, uua.p, vRa.d);
            wing.J(vpa.U, vPa.b, YSa.G, kta.v, vRa.d, yRa.d, vRa.d);
            wing.J(dqa.g, vPa.b, BRa.k, pqa.r, vRa.d, vRa.d, vRa.d);
            wing.J(lPa.S, vPa.b, lqa.ga, JPa.N, vRa.d, vRa.d, vRa.d);
            wing.J(Lsa.M, vPa.b, vqa.T, YSa.G, vRa.d, AQa.P, vRa.d);
            wing.J(XTa.O, vPa.b, dua.ca, eua.C, vRa.d, AQa.P, vRa.d);
            wing.J(RPa.p, vPa.b, TOa.p, lqa.ga, vRa.d, yRa.d, uqa.g);
            wing.J(fPa.I, vPa.b, JPa.N, lqa.ga, vRa.d, vRa.d, vRa.d);
            wing.J(SRa.O, vPa.b, NQa.m, Qsa.k, vRa.d, uqa.g, uqa.g);
            wing.J(NTa.v, vPa.b, dua.ca, Qsa.k, vRa.d, vRa.d, vRa.d);
            wing.J(uua.Aa, vPa.b, CRa.M, FRa.Ga, vRa.d, uqa.g, uqa.g);
            wing.J(Uqa.N, vPa.b, NSa.b, Fua.Y, vRa.d, uqa.g, vRa.d);
            wing.J(nqa.Ka, vPa.b, NSa.b, bSa.J, vRa.d, vRa.d, vRa.d);
            wing.J(ppa.U, vPa.b, kta.v, lqa.ga, vRa.d, vRa.d, vRa.d);
            wing.J(Yqa.G, vPa.b, pqa.r, BRa.k, vRa.d, yRa.d, vRa.d);
            wing.J(STa.i, vPa.b, JPa.N, Qsa.k, vRa.d, vRa.d, yRa.d);
            wing.J(Xpa.F, vPa.b, vqa.T, FRa.Ga, vRa.d, vRa.d, vRa.d);
            wing.J(LPa.q, vPa.b, dua.ca, AQa.W, vRa.d, vRa.d, vRa.d);
            wing.J(XOa.A, vPa.b, TOa.p, Fua.Y, vRa.d, vRa.d, uqa.g);
            wing.J(NPa.S, vPa.b, NQa.m, bsa.la, vRa.d, vRa.d, tTa.h);
            wing.J(PTa.m, vPa.b, CRa.M, Yra.i, vRa.d, vRa.d, vRa.d);
            wing.J(ppa.Q, vPa.b, NSa.b, gQa.ca, vRa.d, vRa.d, vRa.d);
            wing.J(uqa.w, vPa.b, sOa.Z, vqa.A, vRa.d, uqa.g, vRa.d);
            wing.J(Qqa.u, vPa.b, Lqa.C, eta.e, vRa.d, vRa.d, vRa.d);
            wing.J(uSa.d, vPa.b, Cra.fa, KSa.I, vRa.d, vRa.d, vRa.d);
            wing.J(Iqa.P, vPa.b, Lqa.C, RPa.Ia, vRa.d, vRa.d, vRa.d);
            wing.J(Ysa.Y, vPa.b, sOa.Z, Tqa.V, vRa.d, vRa.d, vRa.d);
            wing.J(nua.n, vPa.b, NQa.d, POa.Aa, vRa.d, vRa.d, vRa.d);
            wing.J(sra.m, vPa.b, NSa.b, eta.e, vRa.d, vRa.d, vRa.d);
            wing.J(hqa.c, vPa.b, CRa.M, LPa.v, vRa.d, vRa.d, vRa.d);
            wing.J(hpa.n, vPa.b, TOa.p, gQa.ca, vRa.d, vRa.d, vRa.d);
            wing.J(wua.L, vPa.b, dua.ca, Yra.i, vRa.d, vRa.d, vRa.d);
            wing.J(xTa.k, vPa.b, vqa.T, qta.D, vRa.d, vRa.d, vRa.d);
            wing.J(Yra.C, vPa.b, JPa.N, bsa.la, vRa.d, vRa.d, vRa.d);
            wing.J(Wqa.N, vPa.b, pqa.r, qta.D, vRa.d, vRa.d, uqa.g);
            wing.J(nQa.L, vPa.b, pqa.r, AQa.W, vRa.d, vRa.d, yRa.d);
            wing.J(hQa.y, vPa.b, kta.v, kPa.S, vRa.d, vRa.d, vRa.d);
            wing.J(jRa.c, vPa.b, vQa.q, eua.C, vRa.d, lqa.s, vRa.d);
            wing.J(gsa.ca, vPa.b, eua.C, lqa.ga, vRa.d, uua.p, vRa.d);
            wing.J(xra.p, vPa.b, FRa.Ga, BRa.k, vRa.d, uqa.g, vRa.d);
            wing.J(Epa.Ja, vPa.b, YSa.G, Qsa.k, vRa.d, uua.p, vRa.d);
            wing.J(mSa.B, vPa.b, YSa.G, kPa.S, vRa.d, vRa.d, XTa.W);
            wing.J(FPa.D, vPa.b, vQa.q, AQa.W, vRa.d, vRa.d, yRa.d);
            wing.J(dua.Y, vPa.b, kta.v, AQa.W, vRa.d, vRa.d, vRa.d);
            wing.J(Npa.v, vPa.b, eua.C, Fua.Y, vRa.d, vRa.d, vRa.d);
            wing.J(rQa.E, vPa.b, lqa.ga, bSa.J, vRa.d, vRa.d, vRa.d);
            wing.J(Gta.n, vPa.b, eua.C, Yra.i, vRa.d, vRa.d, yRa.d);
            wing.J(tpa.G, vPa.b, YSa.G, LPa.v, vRa.d, vRa.d, uqa.g);
            wing.J(nua.B, vPa.b, vQa.q, POa.Aa, vRa.d, vRa.d, vRa.d);
            wing.J(Xpa.a, vPa.b, kta.v, Tqa.V, vRa.d, vRa.d, vRa.d);
            wing.J(pPa.s, vPa.b, pqa.r, RPa.Ia, vRa.d, vRa.d, vRa.d);
            wing.J(DPa.b, vPa.b, lqa.ga, kPa.S, vRa.d, vRa.d, vRa.d);
            wing.J(vQa.ca, vPa.b, BRa.k, FRa.Ga, vRa.d, vRa.d, vRa.d);
            wing.J(xOa.Ja, vPa.b, Qsa.k, AQa.W, vRa.d, vRa.d, uqa.g);
            wing.J(VQa.L, vPa.b, kPa.S, bSa.J, vRa.d, vRa.d, uqa.g);
            wing.J(Zpa.d, vPa.b, FRa.Ga, qta.D, vRa.d, vRa.d, uqa.g);
        }
        a2.J(colors.get(b2));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        ExoWings a2 = this;
        uKa.J((float)JPa.N, (float)JPa.N, (float)SQa.w);
        uKa.l((float)ZSa.q, (float)Ora.D, (float)KTa.r);
        Kpa.J().J().J(a2.tex);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)Cra.fa, (float)vqa.T, (float)kta.v, (float)JPa.N);
        uKa.J((float)JPa.N, (float)JPa.N, (float)psa.N);
        wing.C(ATa.q);
        uKa.D();
        uKa.e();
        uKa.J((float)Cra.fa, (float)vqa.T, (float)kta.v, (float)JPa.N);
        uKa.J((float)JPa.N, (float)JPa.N, (float)psa.N);
        wing.C(ATa.q);
        uKa.D();
    }
}

