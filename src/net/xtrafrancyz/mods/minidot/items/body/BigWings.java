/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Cra
 *  Cta
 *  DQa
 *  EQa
 *  ERa
 *  FTa
 *  Fpa
 *  JPa
 *  Js
 *  KTa
 *  Kpa
 *  LQa
 *  MQa
 *  NOa
 *  NQa
 *  Oz
 *  PTa
 *  Ppa
 *  Pqa
 *  Qsa
 *  RPa
 *  Rua
 *  SOa
 *  Spa
 *  TPa
 *  Tpa
 *  Uqa
 *  Usa
 *  Uta
 *  VQa
 *  YSa
 *  Yra
 *  Ysa
 *  ZRa
 *  Zta
 *  aPa
 *  aQa
 *  asa
 *  bRa
 *  bSa
 *  cra
 *  dQa
 *  eS
 *  fsa
 *  iPa
 *  jpa
 *  kPa
 *  kpa
 *  kta
 *  lPa
 *  lqa
 *  mra
 *  nQa
 *  oqa
 *  pqa
 *  psa
 *  pua
 *  qta
 *  uKa
 *  uRa
 *  vPa
 *  vQa
 *  vRa
 *  wPa
 *  xOa
 *  ysa
 *  zTa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class BigWings
extends BaseItem {
    private static Js Left;
    private static final Map<String, ResourceLocation> colors;
    private String color;
    private boolean rainbow;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        void b2;
        BigWings bigWings = this;
        if (bigWings.rainbow) {
            float[] fArray = Qt.I[(int)(b2 * BRa.k) % uSa.i];
            Object e2 = fArray;
            uKa.f((float)fArray[uSa.E], (float)e2[vRa.d], (float)e2[uqa.g], (float)uKa.G.J);
        }
        float e2 = Oz.C((float)(b2 * Jta.w)) * kta.v;
        Kpa.J().J().J(bigWings.tex);
        uKa.e();
        uKa.h();
        uKa.l((float)pqa.r, (float)pqa.r, (float)xSa.la);
        BigWings bigWings2 = bigWings;
        bigWings2.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.e();
        uKa.J((float)(sSa.E - e2), (float)MQa.L, (float)kta.v, (float)JPa.N);
        uKa.J((float)KQa.C, (float)JPa.N, (float)Qra.j);
        Left.C(ATa.q);
        uKa.D();
        uKa.e();
        uKa.J((float)(Yra.V + e2), (float)vPa.b, (float)kta.v, (float)JPa.N);
        uKa.J((float)ERa.i, (float)JPa.N, (float)Qra.j);
        Left.C(ATa.q);
        uKa.D();
        uKa.m();
        uKa.D();
        if (bigWings2.rainbow) {
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)uKa.G.J);
        }
    }

    @Override
    public void J(float f2) {
        float b22 = f2;
        BigWings a2 = this;
        if (a2.rainbow) {
            float[] b22 = Qt.I[(int)(b22 * BRa.k) % uSa.i];
            uKa.f((float)b22[uSa.E], (float)b22[vRa.d], (float)b22[uqa.g], (float)uKa.G.J);
        }
        uKa.J((float)JPa.N, (float)Nra.e, (float)Tpa.S);
        uKa.l((float)ZSa.q, (float)ZSa.q, (float)Xpa.R);
        Kpa.J().J().J(a2.tex);
        uKa.e();
        uKa.J((float)dua.fa, (float)Ira.d, (float)pqa.r, (float)JPa.N);
        uKa.J((float)KQa.C, (float)JPa.N, (float)Qra.j);
        Left.C(ATa.q);
        uKa.D();
        uKa.e();
        uKa.J((float)wPa.Ha, (float)FRa.ca, (float)pqa.r, (float)JPa.N);
        uKa.J((float)ERa.i, (float)JPa.N, (float)Qra.j);
        Left.C(ATa.q);
        uKa.D();
        if (a2.rainbow) {
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)uKa.G.J);
        }
    }

    static {
        colors = new HashMap<String, ResourceLocation>();
        Left = null;
        colors.put(GPa.i, new ResourceLocation(Cra.V, Gta.w));
        colors.put(gQa.r, new ResourceLocation(Cra.V, Vra.n));
        colors.put(Cta.W, new ResourceLocation(Cra.V, oqa.e));
        colors.put(pua.Ea, colors.get(gQa.r));
    }

    public BigWings(String string) {
        BigWings a2;
        String b2 = string;
        BigWings bigWings = a2 = this;
        super(eS.BODY);
        a2.textureWidth = ysa.s;
        a2.textureHeight = fPa.i;
        bigWings.color = b2;
        bigWings.rainbow = b2.equals(pua.Ea);
        if (Left == null) {
            BigWings bigWings2 = a2;
            bigWings2.J(STa.R, uSa.E, TOa.V);
            bigWings2.J(Fua.Ga, uSa.E, uSa.E);
            bigWings2.J(iSa.ja, uSa.E, uSa.E);
            bigWings2.J(psa.Ha, Yqa.i, uSa.E);
            bigWings2.J(CRa.Ga, uSa.E, uSa.E);
            bigWings2.J(fqa.Ma, Yqa.i, uSa.E);
            bigWings2.J(kPa.ga, Yqa.i, uSa.E);
            bigWings2.J(ZRa.ca, Yqa.i, uSa.E);
            bigWings2.J(vPa.p, uSa.E, uSa.E);
            bigWings2.J(Pua.K, Yqa.i, uSa.E);
            bigWings2.J(Qra.y, Yqa.i, uSa.E);
            bigWings2.J(Jpa.h, Yqa.i, uSa.E);
            bigWings2.J(cra.K, Yqa.i, uSa.E);
            bigWings2.J(aPa.K, Yqa.i, uSa.E);
            bigWings2.J(Yra.g, Yqa.i, uSa.E);
            bigWings2.J(EQa.Z, Yqa.i, uSa.E);
            bigWings2.J(Vra.S, Yqa.i, uSa.E);
            bigWings2.J(Mqa.f, Yqa.i, uSa.E);
            bigWings2.J(TOa.P, Yqa.i, uSa.E);
            bigWings2.J(DQa.f, uSa.E, uSa.E);
            bigWings2.J(JPa.n, uSa.E, uSa.E);
            bigWings2.J(Spa.O, uSa.E, uSa.E);
            bigWings2.J(fsa.A, uSa.E, uSa.E);
            bigWings2.J(uRa.k, uSa.E, uSa.E);
            bigWings2.J(Jra.W, uSa.E, uSa.E);
            bigWings2.J(KSa.P, uSa.E, uSa.E);
            bigWings2.J(zTa.Ha, Yqa.i, uSa.E);
            bigWings2.J(UTa.O, uSa.E, uSa.E);
            bigWings2.J(oua.t, Yqa.i, uSa.E);
            bigWings2.J(tpa.v, Yqa.i, uSa.E);
            bigWings2.J(Ata.Ja, Yqa.i, uSa.E);
            bigWings2.J(opa.o, Yqa.i, uSa.E);
            bigWings2.J(Npa.l, uSa.E, uSa.E);
            bigWings2.J(Rua.i, uSa.E, uSa.E);
            bigWings2.J(xSa.Ka, Yqa.i, uSa.E);
            bigWings2.J(xra.ga, Yqa.i, uSa.E);
            bigWings2.J(WPa.k, Yqa.i, uSa.E);
            bigWings2.J(Ppa.fa, uSa.E, uSa.E);
            bigWings2.J(aQa.A, uSa.E, uSa.E);
            bigWings2.J(Eqa.X, uSa.E, uSa.E);
            bigWings2.J(nQa.n, Yqa.i, uSa.E);
            bigWings2.J(gsa.s, Yqa.i, uSa.E);
            bigWings2.J(iPa.k, Yqa.i, uSa.E);
            bigWings2.J(vua.n, Yqa.i, uSa.E);
            bigWings2.J(EPa.H, uSa.E, uSa.E);
            bigWings2.J(EQa.o, uSa.E, uSa.E);
            bigWings2.J(DPa.M, Yqa.i, uSa.E);
            bigWings2.J(DQa.m, Yqa.i, uSa.E);
            bigWings2.J(DPa.N, uSa.E, uSa.E);
            bigWings2.J(Zqa.M, uSa.E, uSa.E);
            bigWings2.J(SPa.F, uSa.E, uSa.E);
            bigWings2.J(ITa.Ga, uSa.E, uSa.E);
            bigWings2.J(TPa.F, uSa.E, uSa.E);
            bigWings2.J(dQa.Aa, Yqa.i, uSa.E);
            bigWings2.J(ysa.Ja, Yqa.i, uSa.E);
            bigWings2.J(VQa.p, uSa.E, uSa.E);
            bigWings2.J(tSa.J, Yqa.i, uSa.E);
            bigWings2.J(dQa.G, uSa.E, uSa.E);
            bigWings2.J(qta.T, Yqa.i, uSa.E);
            bigWings2.J(Pqa.U, uSa.E, uSa.E);
            bigWings2.J(Uta.D, Yqa.i, uSa.E);
            bigWings2.J(nOa.f, uSa.E, uSa.E);
            bigWings2.J(Ura.Ha, uSa.E, uSa.E);
            bigWings2.J(Uta.S, uSa.E, uSa.E);
            bigWings2.J(rpa.H, uSa.E, uSa.E);
            bigWings2.J(jpa.m, uSa.E, uSa.E);
            bigWings2.J(PTa.M, uSa.E, uSa.E);
            bigWings2.J(Zta.P, uSa.E, uSa.E);
            bigWings2.J(oua.y, Yqa.i, uSa.E);
            bigWings2.J(rpa.g, Yqa.i, uSa.E);
            bigWings2.J(sSa.Ia, Yqa.i, uSa.E);
            bigWings2.J(Ira.C, Yqa.i, uSa.E);
            bigWings2.J(sqa.g, Yqa.i, uSa.E);
            bigWings2.J(vua.D, Yqa.i, uSa.E);
            Left = new Js((ModelBase)a2, Tqa.Ma);
            BigWings.Left.mirror = vRa.d;
            Left.J(Ysa.S, pqa.r, CRa.M, eua.C, uSa.E, yta.Ka, Fsa.d);
            Left.J(Ysa.S, pqa.r, CRa.M, eua.C, uSa.E, yta.Ka, Fsa.d);
            Left.J(SOa.X, MQa.L, CRa.M, Yra.i, vRa.d, vRa.d, uqa.g);
            Left.J(Ysa.d, MQa.L, NQa.m, bsa.la, vRa.d, vRa.d, vRa.d);
            Left.J(fsa.K, MQa.L, NQa.m, qta.D, vRa.d, vRa.d, vRa.d);
            Left.J(KSa.b, MQa.L, NQa.m, LPa.v, vRa.d, vRa.d, vRa.d);
            Left.J(FTa.F, MQa.L, CRa.M, vqa.A, vRa.d, vRa.d, vRa.d);
            Left.J(mSa.x, MQa.L, NQa.m, eta.e, vRa.d, vRa.d, vRa.d);
            Left.J(Bua.e, MQa.L, TOa.p, POa.Aa, vRa.d, vRa.d, vRa.d);
            Left.J(Cta.M, MQa.L, dua.ca, Tqa.V, vRa.d, vRa.d, vRa.d);
            Left.J(nOa.j, MQa.L, dua.ca, RPa.Ia, vRa.d, vRa.d, vRa.d);
            Left.J(jpa.J, MQa.L, vqa.T, KSa.I, vRa.d, vRa.d, vRa.d);
            Left.J(xqa.C, MQa.L, JPa.N, sSa.E, vRa.d, vRa.d, vRa.d);
            Left.J(uRa.s, MQa.L, BRa.k, VQa.n, vRa.d, vRa.d, vRa.d);
            Left.J(csa.l, MQa.L, lqa.ga, Ura.m, vRa.d, vRa.d, uqa.g);
            Left.J(Nra.w, MQa.L, eua.C, NSa.B, vRa.d, vRa.d, uqa.g);
            Left.J(BPa.W, MQa.L, YSa.G, DQa.q, vRa.d, vRa.d, vRa.d);
            Left.J(Hta.z, MQa.L, vQa.q, mra.q, vRa.d, vRa.d, vRa.d);
            Left.J(qsa.v, MQa.L, pqa.r, gQa.b, vRa.d, vRa.d, vRa.d);
            Left.J(DQa.Y, MQa.L, kta.v, vRa.T, vRa.d, vRa.d, vRa.d);
            Left.J(LQa.r, MQa.L, Qsa.k, Ira.Ka, vRa.d, vRa.d, yRa.d);
            Left.J(kua.N, MQa.L, Qsa.k, NSa.B, vRa.d, vRa.d, vRa.d);
            Left.J(Fpa.h, MQa.L, BRa.k, vRa.T, vRa.d, vRa.d, yRa.d);
            Left.J(kpa.ba, MQa.L, lqa.ga, gQa.b, vRa.d, vRa.d, vRa.d);
            Left.J(bRa.F, MQa.L, Qsa.k, mra.q, vRa.d, vRa.d, vRa.d);
            Left.J(VPa.fa, MQa.L, eua.C, sSa.E, vRa.d, vRa.d, vRa.d);
            Left.J(iSa.L, MQa.L, AQa.W, mra.q, vRa.d, vRa.d, uqa.g);
            Left.J(rSa.Aa, MQa.L, lqa.ga, vRa.T, vRa.d, vRa.d, vRa.d);
            Left.J(SOa.k, MQa.L, FRa.Ga, gQa.b, vRa.d, vRa.d, uqa.g);
            Left.J(mra.I, MQa.L, YSa.G, KSa.I, vRa.d, vRa.d, vRa.d);
            Left.J(bSa.Z, MQa.L, vQa.q, RPa.Ia, vRa.d, vRa.d, vRa.d);
            Left.J(PTa.O, MQa.L, kPa.S, DQa.q, vRa.d, vRa.d, vRa.d);
            Left.J(NOa.g, MQa.L, FRa.Ga, NSa.B, vRa.d, vRa.d, vRa.d);
            Left.J(LPa.i, MQa.L, kPa.S, sSa.E, vRa.d, vRa.d, vRa.d);
            Left.J(dqa.J, MQa.L, Qsa.k, KSa.I, vRa.d, vRa.d, vRa.d);
            Left.J(Pua.ja, MQa.L, FRa.Ga, KSa.I, vRa.d, vRa.d, vRa.d);
            Left.J(Zra.U, MQa.L, lqa.ga, Tqa.V, vRa.d, vRa.d, vRa.d);
            Left.J(ZSa.M, MQa.L, BRa.k, RPa.Ia, vRa.d, vRa.d, vRa.d);
            Left.J(Qpa.E, MQa.L, AQa.W, RPa.Ia, vRa.d, vRa.d, uqa.g);
            Left.J(qQa.n, MQa.L, FRa.Ga, Tqa.V, vRa.d, vRa.d, vRa.d);
            Left.J(asa.g, MQa.L, kPa.S, POa.Aa, vRa.d, vRa.d, vRa.d);
            Left.J(zsa.Ka, MQa.L, Qsa.k, eta.e, vRa.d, vRa.d, vRa.d);
            Left.J(ROa.x, MQa.L, BRa.k, LPa.v, vRa.d, vRa.d, vRa.d);
            Left.J(Bra.Aa, MQa.L, FRa.Ga, eta.e, vRa.d, vRa.d, vRa.d);
            Left.J(NQa.p, MQa.L, FRa.Ga, vqa.A, vRa.d, vRa.d, vRa.d);
            Left.J(pta.b, MQa.L, AQa.W, vqa.A, vRa.d, vRa.d, uqa.g);
            Left.J(Usa.m, MQa.L, kPa.S, gQa.ca, vRa.d, uqa.g, vRa.d);
            Left.J(Rua.O, MQa.L, Qsa.k, Yra.i, vRa.d, vRa.d, vRa.d);
            Left.J(CRa.o, MQa.L, FRa.Ga, Yra.i, vRa.d, vRa.d, vRa.d);
            Left.J(UOa.e, MQa.L, AQa.W, qta.D, vRa.d, vRa.d, vRa.d);
            Left.J(Yqa.c, MQa.L, kPa.S, bsa.la, vRa.d, uqa.g, vRa.d);
            Left.J(FRa.J, MQa.L, AQa.W, bSa.J, vRa.d, vRa.d, vRa.d);
            Left.J(BPa.Y, MQa.L, FRa.Ga, Fua.Y, vRa.d, vRa.d, vRa.d);
            Left.J(Tqa.G, MQa.L, kPa.S, AQa.W, vRa.d, vRa.d, vRa.d);
            Left.J(xra.ca, MQa.L, Qsa.k, AQa.W, vRa.d, vRa.d, vRa.d);
            Left.J(zpa.F, MQa.L, kPa.S, FRa.Ga, vRa.d, vRa.d, vRa.d);
            Left.J(Jsa.r, MQa.L, FRa.Ga, Qsa.k, vRa.d, vRa.d, uqa.g);
            Left.J(uSa.o, MQa.L, kPa.S, Qsa.k, vRa.d, vRa.d, vRa.d);
            Left.J(Uqa.ia, MQa.L, kPa.S, BRa.k, vRa.d, vRa.d, vRa.d);
            Left.J(KTa.N, MQa.L, Qsa.k, BRa.k, vRa.d, vRa.d, vRa.d);
            Left.J(xOa.P, MQa.L, BRa.k, lqa.ga, vRa.d, uqa.g, vRa.d);
            Left.J(Psa.E, MQa.L, lqa.ga, lqa.ga, vRa.d, vRa.d, vRa.d);
            Left.J(Jta.s, MQa.L, vQa.q, eua.C, vRa.d, AQa.P, vRa.d);
            Left.J(oua.P, MQa.L, kta.v, lqa.ga, vRa.d, vRa.d, vRa.d);
            Left.J(Nta.J, MQa.L, TOa.p, Fua.Y, vRa.d, vRa.d, uqa.g);
            Left.J(dsa.I, MQa.L, dua.ca, FRa.Ga, vRa.d, vRa.d, uqa.g);
            Left.J(ITa.O, MQa.L, pqa.r, BRa.k, vRa.d, vRa.d, vRa.d);
            Left.J(xqa.c, MQa.L, JPa.N, Qsa.k, vRa.d, vRa.d, vRa.d);
            Left.J(oqa.E, MQa.L, vqa.T, kPa.S, vRa.d, vRa.d, vRa.d);
            Left.J(Uta.C, MQa.L, kta.v, FRa.Ga, vRa.d, vRa.d, vRa.d);
            Left.J(UTa.D, MQa.L, pqa.r, AQa.W, vRa.d, vRa.d, uqa.g);
            Left.J(lPa.f, MQa.L, JPa.N, bSa.J, vRa.d, vRa.d, uqa.g);
            Left.J(TOa.z, MQa.L, vqa.T, qta.D, vRa.d, vRa.d, uqa.g);
            Left.J(EPa.j, MQa.L, dua.ca, gQa.ca, vRa.d, vRa.d, uqa.g);
            Left.J(Zqa.T, MQa.L, vqa.T, LPa.v, vRa.d, vRa.d, vRa.d);
        }
        a2.J(colors.get(b2));
    }
}

