/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  DQa
 *  ERa
 *  Epa
 *  FPa
 *  JPa
 *  Js
 *  Kpa
 *  LQa
 *  Lra
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Qqa
 *  Qsa
 *  RPa
 *  SQa
 *  SRa
 *  TQa
 *  Uta
 *  Vua
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  Yra
 *  ZOa
 *  ZRa
 *  Zpa
 *  Zta
 *  aSa
 *  aqa
 *  bpa
 *  bqa
 *  cQa
 *  cra
 *  eS
 *  fsa
 *  jRa
 *  jpa
 *  jsa
 *  kta
 *  lPa
 *  lqa
 *  mra
 *  pPa
 *  pQa
 *  pqa
 *  pua
 *  qta
 *  uKa
 *  ura
 *  vQa
 *  vRa
 *  wOa
 *  wra
 *  yQa
 *  ysa
 *  zTa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class BatWings
extends BaseItem {
    private final Js[] wings;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        void b2;
        BatWings batWings = this;
        float e2 = Oz.C((float)(b2 * fqa.w)) * Qsa.k;
        Kpa.J().J().J(batWings.tex);
        uKa.e();
        uKa.h();
        BatWings batWings2 = batWings;
        batWings.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.J((float)JPa.N, (float)Nra.e, (float)Yqa.C);
        uKa.l((float)wOa.w, (float)wOa.w, (float)pta.d);
        uKa.M((int)Yua.O);
        uKa.e();
        uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
        uKa.J((float)Qra.j, (float)JPa.N, (float)kTa.J);
        uKa.J((float)FRa.B, (float)pqa.r, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        uKa.J((float)cra.S, (float)JPa.N, (float)JPa.N);
        batWings2.f();
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.e();
        uKa.J((float)Qra.j, (float)JPa.N, (float)kTa.J);
        uKa.J((float)FRa.B, (float)pqa.r, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)ATa.x, (float)JPa.N);
        uKa.J((float)cra.S, (float)JPa.N, (float)JPa.N);
        batWings2.f();
        uKa.D();
        uKa.m();
        uKa.D();
    }

    public BatWings() {
        super(eS.BODY);
        BatWings a2;
        a2.textureWidth = XOa.h;
        a2.textureHeight = ysa.s;
        a2.useDisplayLists = vRa.d;
        a2.wings = new Js[Zqa.G];
        BatWings batWings = a2;
        batWings.wings[uSa.E] = new Js((ModelBase)a2, uqa.g, Lra.e);
        batWings.wings[uSa.E].J(dua.ca, STa.t, Npa.Z, vRa.d, vRa.d, hpa.Z);
        BatWings batWings2 = a2;
        batWings2.wings[uSa.E].mirror = vRa.d;
        batWings2.J(batWings2.wings[uSa.E], FPa.m, JPa.N, JPa.N);
        batWings2.wings[vRa.d] = new Js((ModelBase)a2, Eqa.Ka, uSa.E);
        batWings2.wings[vRa.d].J(dua.ca, kra.N, MTa.o, vRa.d, vRa.d, XTa.W);
        BatWings batWings3 = a2;
        batWings3.wings[vRa.d].mirror = vRa.d;
        batWings3.J(batWings3.wings[vRa.d], zsa.T, JPa.N, JPa.N);
        batWings3.wings[uqa.g] = new Js((ModelBase)a2, Zta.Q, yRa.d);
        batWings3.wings[uqa.g].J(dua.ca, Jra.n, XOa.t, vRa.d, vRa.d, uqa.g);
        BatWings batWings4 = a2;
        batWings4.wings[uqa.g].mirror = vRa.d;
        batWings4.J(batWings4.wings[uqa.g], DQa.K, JPa.N, JPa.N);
        batWings4.wings[yRa.d] = new Js((ModelBase)a2, cPa.Ea, uqa.g);
        batWings4.wings[yRa.d].J(dua.ca, Xpa.h, gua.U, vRa.d, vRa.d, vRa.d);
        BatWings batWings5 = a2;
        batWings5.wings[yRa.d].mirror = vRa.d;
        batWings5.J(batWings5.wings[yRa.d], zpa.y, JPa.N, JPa.N);
        batWings5.wings[AQa.P] = new Js((ModelBase)a2, Zta.Q, yRa.d);
        batWings5.wings[AQa.P].J(dua.ca, dua.O, bqa.Aa, vRa.d, vRa.d, uqa.g);
        BatWings batWings6 = a2;
        batWings6.wings[AQa.P].mirror = vRa.d;
        batWings6.J(batWings6.wings[AQa.P], ITa.v, JPa.N, JPa.N);
        batWings6.wings[tTa.h] = new Js((ModelBase)a2, Pua.Ka, Yqa.i);
        batWings6.wings[tTa.h].J(dua.ca, POa.l, yOa.W, vRa.d, vRa.d, uua.p);
        BatWings batWings7 = a2;
        batWings7.wings[tTa.h].mirror = vRa.d;
        batWings7.J(batWings7.wings[tTa.h], pua.K, JPa.N, JPa.N);
        batWings7.wings[uua.p] = new Js((ModelBase)a2, ZRa.D, uSa.E);
        batWings7.wings[uua.p].J(dua.ca, fsa.Fa, pQa.ga, vRa.d, vRa.d, tTa.h);
        BatWings batWings8 = a2;
        batWings8.wings[uua.p].mirror = vRa.d;
        batWings8.J(batWings8.wings[uua.p], dsa.Aa, JPa.N, JPa.N);
        batWings8.wings[XTa.W] = new Js((ModelBase)a2, ySa.T, tTa.h);
        batWings8.wings[XTa.W].J(dua.ca, aSa.o, sSa.Q, vRa.d, vRa.d, AQa.P);
        BatWings batWings9 = a2;
        batWings9.wings[XTa.W].mirror = vRa.d;
        batWings9.J(batWings9.wings[XTa.W], yQa.fa, JPa.N, JPa.N);
        batWings9.wings[Yqa.i] = new Js((ModelBase)a2, cPa.Ea, AQa.P);
        batWings9.wings[Yqa.i].J(dua.ca, LQa.Ca, WRa.e, vRa.d, vRa.d, vRa.d);
        BatWings batWings10 = a2;
        batWings10.wings[Yqa.i].mirror = vRa.d;
        batWings10.J(batWings10.wings[Yqa.i], SRa.c, JPa.N, JPa.N);
        batWings10.wings[WOa.fa] = new Js((ModelBase)a2, ySa.T, uSa.E);
        batWings10.wings[WOa.fa].J(dua.ca, LRa.Ja, UOa.k, vRa.d, vRa.d, AQa.P);
        BatWings batWings11 = a2;
        batWings11.wings[WOa.fa].mirror = vRa.d;
        batWings11.J(batWings11.wings[WOa.fa], yRa.x, JPa.N, JPa.N);
        batWings11.wings[NTa.C] = new Js((ModelBase)a2, cPa.Ea, uSa.E);
        batWings11.wings[NTa.C].J(dua.ca, LQa.Ca, Zpa.o, vRa.d, vRa.d, vRa.d);
        BatWings batWings12 = a2;
        batWings12.wings[NTa.C].mirror = vRa.d;
        batWings12.J(batWings12.wings[NTa.C], SRa.c, JPa.N, JPa.N);
        batWings12.wings[pPa.f] = new Js((ModelBase)a2, fPa.i, pPa.f);
        batWings12.wings[pPa.f].J(dua.ca, wsa.e, jsa.s, vRa.d, vRa.d, NTa.C);
        BatWings batWings13 = a2;
        batWings13.wings[pPa.f].mirror = vRa.d;
        batWings13.J(batWings13.wings[pPa.f], Bta.L, JPa.N, JPa.N);
        batWings13.wings[lqa.s] = new Js((ModelBase)a2, fPa.i, uSa.E);
        batWings13.wings[lqa.s].J(dua.ca, TQa.j, vRa.u, vRa.d, vRa.d, NTa.C);
        BatWings batWings14 = a2;
        batWings14.wings[lqa.s].mirror = vRa.d;
        batWings14.J(batWings14.wings[lqa.s], rua.U, JPa.N, JPa.N);
        batWings14.wings[uua.s] = new Js((ModelBase)a2, GPa.C, uSa.E);
        batWings14.wings[uua.s].J(dua.ca, NQa.la, aSa.Aa, vRa.d, vRa.d, Yqa.i);
        BatWings batWings15 = a2;
        batWings15.wings[uua.s].mirror = vRa.d;
        batWings15.J(batWings15.wings[uua.s], Yra.M, JPa.N, JPa.N);
        batWings15.wings[hpa.Z] = new Js((ModelBase)a2, GPa.C, WOa.fa);
        batWings15.wings[hpa.Z].J(dua.ca, KPa.d, csa.r, vRa.d, vRa.d, Yqa.i);
        BatWings batWings16 = a2;
        batWings16.wings[hpa.Z].mirror = vRa.d;
        batWings16.J(batWings16.wings[hpa.Z], Vra.R, JPa.N, JPa.N);
        batWings16.wings[Ypa.A] = new Js((ModelBase)a2, AQa.P, uua.s);
        batWings16.wings[Ypa.A].J(dua.ca, jpa.X, Zpa.o, vRa.d, vRa.d, uua.s);
        BatWings batWings17 = a2;
        batWings17.wings[Ypa.A].mirror = vRa.d;
        batWings17.J(batWings17.wings[Ypa.A], qta.X, JPa.N, JPa.N);
        batWings17.wings[yta.Ka] = new Js((ModelBase)a2, Zta.Q, uSa.E);
        batWings17.wings[yta.Ka].J(dua.ca, kua.a, YSa.Ca, vRa.d, vRa.d, uqa.g);
        BatWings batWings18 = a2;
        batWings18.wings[yta.Ka].mirror = vRa.d;
        batWings18.J(batWings18.wings[yta.Ka], lPa.q, JPa.N, JPa.N);
        batWings18.wings[ERa.C] = new Js((ModelBase)a2, uua.p, uSa.E);
        batWings18.wings[ERa.C].J(dua.ca, Hta.Aa, dsa.Y, vRa.d, vRa.d, lqa.s);
        BatWings batWings19 = a2;
        batWings19.wings[ERa.C].mirror = vRa.d;
        batWings19.J(batWings19.wings[ERa.C], fsa.Da, JPa.N, JPa.N);
        batWings19.wings[yOa.B] = new Js((ModelBase)a2, Iqa.M, uSa.E);
        batWings19.wings[yOa.B].J(dua.ca, cTa.e, Epa.g, vRa.d, vRa.d, yRa.d);
        BatWings batWings20 = a2;
        batWings20.wings[yOa.B].mirror = vRa.d;
        batWings20.J(batWings20.wings[yOa.B], Qpa.v, JPa.N, JPa.N);
        batWings20.wings[wOa.t] = new Js((ModelBase)a2, Zta.Q, uua.p);
        batWings20.wings[wOa.t].J(dua.ca, Uta.W, lTa.v, vRa.d, vRa.d, uqa.g);
        BatWings batWings21 = a2;
        batWings21.wings[wOa.t].mirror = vRa.d;
        batWings21.J(batWings21.wings[wOa.t], yQa.fa, JPa.N, JPa.N);
        batWings21.wings[kTa.j] = new Js((ModelBase)a2, aqa.Aa, lPa.p);
        batWings21.wings[kTa.j].J(FRa.ca, yRa.A, Jpa.i, uSa.E, vRa.d, yRa.d);
        BatWings batWings22 = a2;
        batWings22.wings[kTa.j].mirror = vRa.d;
        batWings22.J(batWings22.wings[kTa.j], Jta.X, JPa.N, JPa.N);
        batWings22.wings[wOa.h] = new Js((ModelBase)a2, Fua.J, tua.w);
        batWings22.wings[wOa.h].J(FRa.ca, SQa.W, RPa.J, uSa.E, vRa.d, uqa.g);
        BatWings batWings23 = a2;
        batWings23.wings[wOa.h].mirror = vRa.d;
        batWings23.J(batWings23.wings[wOa.h], Jta.X, JPa.N, JPa.N);
        batWings23.wings[cQa.o] = new Js((ModelBase)a2, NPa.e, wra.e);
        batWings23.wings[cQa.o].J(FRa.ca, Lsa.k, CRa.w, uSa.E, tTa.h, WOa.fa);
        batWings3.wings[cQa.o].mirror = vRa.d;
        batWings3.J(batWings3.wings[cQa.o], oQa.D, JPa.N, JPa.N);
        BatWings batWings24 = a2;
        batWings24.wings[AQa.ba] = new Js((ModelBase)a2, NPa.i, lPa.p);
        batWings24.wings[AQa.ba].J(FRa.ca, kta.Q, Ppa.Ha, uSa.E, vRa.d, yRa.d);
        BatWings batWings25 = a2;
        batWings25.wings[AQa.ba].mirror = vRa.d;
        batWings25.J(batWings25.wings[AQa.ba], BQa.r, JPa.N, JPa.N);
        batWings25.wings[osa.c] = new Js((ModelBase)a2, Vua.J, tua.w);
        batWings25.wings[osa.c].J(FRa.ca, pta.T, pQa.u, uSa.E, vRa.d, uqa.g);
        BatWings batWings26 = a2;
        batWings26.wings[osa.c].mirror = vRa.d;
        batWings26.J(batWings26.wings[osa.c], Tqa.Ja, JPa.N, JPa.N);
        batWings26.wings[kTa.g] = new Js((ModelBase)a2, NPa.i, GPa.C);
        batWings26.wings[kTa.g].J(FRa.ca, jpa.y, Tqa.C, uSa.E, vRa.d, uua.p);
        BatWings batWings27 = a2;
        batWings27.wings[kTa.g].mirror = vRa.d;
        batWings27.J(batWings27.wings[kTa.g], Bra.q, JPa.N, JPa.N);
        batWings27.wings[ITa.E] = new Js((ModelBase)a2, Fua.J, KSa.x);
        batWings27.wings[ITa.E].J(FRa.ca, bpa.Ha, pua.A, uSa.E, vRa.d, AQa.P);
        BatWings batWings28 = a2;
        batWings28.wings[ITa.E].mirror = vRa.d;
        batWings28.J(batWings28.wings[ITa.E], Ppa.J, JPa.N, JPa.N);
        batWings28.wings[Lra.e] = new Js((ModelBase)a2, NPa.e, lPa.p);
        batWings28.wings[Lra.e].J(FRa.ca, Xsa.c, WOa.Z, uSa.E, vRa.d, yRa.d);
        BatWings batWings29 = a2;
        batWings29.wings[Lra.e].mirror = vRa.d;
        batWings29.J(batWings29.wings[Lra.e], Bta.L, JPa.N, JPa.N);
        batWings29.wings[EPa.O] = new Js((ModelBase)a2, ysa.s, lPa.p);
        batWings29.wings[EPa.O].J(FRa.ca, pPa.la, Qqa.R, uSa.E, vRa.d, yRa.d);
        BatWings batWings30 = a2;
        batWings30.wings[EPa.O].mirror = vRa.d;
        batWings30.J(batWings30.wings[EPa.O], Tqa.m, JPa.N, JPa.N);
        batWings30.wings[ITa.A] = new Js((ModelBase)a2, WPa.L, jRa.q);
        batWings30.wings[ITa.A].J(FRa.ca, LPa.t, BQa.I, uSa.E, vRa.d, NTa.C);
        BatWings batWings31 = a2;
        batWings31.wings[ITa.A].mirror = vRa.d;
        batWings31.J(batWings31.wings[ITa.A], jsa.c, JPa.N, JPa.N);
        batWings31.wings[Fsa.d] = new Js((ModelBase)a2, ZRa.D, wOa.t);
        batWings31.wings[Fsa.d].J(FRa.ca, mra.u, rta.S, uSa.E, kTa.g, kTa.j);
        BatWings batWings32 = a2;
        batWings32.wings[Fsa.d].mirror = vRa.d;
        batWings32.J(batWings32.wings[Fsa.d], JPa.N, JPa.N, JPa.N);
        batWings32.wings[tua.U] = new Js((ModelBase)a2, ZRa.D, uua.p);
        batWings32.wings[tua.U].J(dua.ca, Iqa.G, vQa.q, vRa.d, vRa.d, tTa.h);
        BatWings batWings33 = a2;
        batWings33.wings[tua.U].mirror = vRa.d;
        batWings33.J(batWings33.wings[tua.U], vTa.K, JPa.N, JPa.N);
        batWings33.wings[fPa.i] = new Js((ModelBase)a2, Eqa.Ka, tua.w);
        batWings33.wings[fPa.i].J(FRa.ca, Xsa.c, xua.X, uSa.E, vRa.d, vRa.d);
        BatWings batWings34 = a2;
        batWings34.wings[fPa.i].mirror = vRa.d;
        batWings34.J(batWings34.wings[fPa.i], Bta.L, JPa.N, JPa.N);
        BatWings batWings35 = a2;
        batWings34.J(new ResourceLocation(Cra.V, ura.Z));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        BatWings a2 = this;
        Kpa.J().J().J(a2.tex);
        uKa.J((float)JPa.N, (float)cra.S, (float)NTa.D);
        uKa.l((float)LPa.S, (float)ZOa.ga, (float)ZOa.ga);
        uKa.e();
        uKa.J((float)gQa.b, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Nra.e, (float)JPa.N, (float)kTa.J);
        BatWings batWings = a2;
        batWings.f();
        uKa.D();
        uKa.e();
        uKa.J((float)zTa.w, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Qra.j, (float)JPa.N, (float)kTa.J);
        batWings.f();
        uKa.D();
    }
}

