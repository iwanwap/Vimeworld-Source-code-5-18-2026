/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Bpa
 *  Cra
 *  ERa
 *  FPa
 *  Fpa
 *  ISa
 *  JPa
 *  Js
 *  LQa
 *  Lqa
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  Ppa
 *  QSa
 *  Qsa
 *  SRa
 *  Ssa
 *  TQa
 *  Tpa
 *  XTa
 *  YSa
 *  Ypa
 *  asa
 *  cQa
 *  jRa
 *  kPa
 *  kta
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  qta
 *  uKa
 *  uOa
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wra
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class SpinnerFlash
extends BasePet {
    private final Js[] spinner;
    private static final ResourceLocation[] tex;
    private final Js[] base;

    static {
        ResourceLocation[] resourceLocationArray = new ResourceLocation[yRa.d];
        resourceLocationArray[uSa.E] = new ResourceLocation(Cra.V, gQa.x);
        resourceLocationArray[vRa.d] = new ResourceLocation(Cra.V, Ata.Y);
        resourceLocationArray[uqa.g] = new ResourceLocation(Cra.V, asa.T);
        tex = resourceLocationArray;
    }

    public SpinnerFlash() {
        SpinnerFlash a2;
        a2.textureWidth = ysa.s;
        a2.textureHeight = fPa.i;
        a2.useDisplayLists = vRa.d;
        a2.spinner = new Js[Cra.S];
        a2.base = new Js[uqa.g];
        SpinnerFlash spinnerFlash = a2;
        spinnerFlash.base[uSa.E] = new Js((ModelBase)a2, yOa.B, uSa.E);
        spinnerFlash.base[uSa.E].J(Ppa.Ha, FRa.ca, vqa.T, tTa.h, yRa.d, AQa.P);
        SpinnerFlash spinnerFlash2 = a2;
        spinnerFlash2.base[uSa.E].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash2.base[uSa.E].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash3 = a2;
        spinnerFlash3.base[uSa.E].mirror = vRa.d;
        spinnerFlash3.J(spinnerFlash3.base[uSa.E], JPa.N, JPa.N, JPa.N);
        spinnerFlash3.base[vRa.d] = new Js((ModelBase)a2, yOa.B, uSa.E);
        spinnerFlash3.base[vRa.d].J(FRa.ca, Ppa.Ha, vqa.T, yRa.d, tTa.h, AQa.P);
        SpinnerFlash spinnerFlash4 = a2;
        spinnerFlash4.base[vRa.d].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash4.base[vRa.d].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash5 = a2;
        spinnerFlash5.base[vRa.d].mirror = vRa.d;
        spinnerFlash5.J(spinnerFlash5.base[vRa.d], JPa.N, JPa.N, JPa.N);
        spinnerFlash5.spinner[wOa.h] = new Js((ModelBase)a2, wra.P, uSa.E);
        spinnerFlash5.spinner[wOa.h].J(NQa.d, NQa.m, JPa.N, yRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash6 = a2;
        spinnerFlash6.spinner[wOa.h].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash6.spinner[wOa.h].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash7 = a2;
        spinnerFlash7.spinner[wOa.h].mirror = vRa.d;
        spinnerFlash7.J(spinnerFlash7.spinner[wOa.h], JPa.N, JPa.N, Jra.Z);
        spinnerFlash7.spinner[cQa.o] = new Js((ModelBase)a2, wra.P, uSa.E);
        spinnerFlash7.spinner[cQa.o].J(NQa.d, sOa.Z, JPa.N, yRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash8 = a2;
        spinnerFlash8.spinner[cQa.o].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash8.spinner[cQa.o].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash9 = a2;
        spinnerFlash9.spinner[cQa.o].mirror = vRa.d;
        spinnerFlash9.J(spinnerFlash9.spinner[cQa.o], JPa.N, JPa.N, Jra.Z);
        spinnerFlash9.spinner[AQa.ba] = new Js((ModelBase)a2, wra.P, uSa.E);
        spinnerFlash9.spinner[AQa.ba].J(sOa.Z, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
        SpinnerFlash spinnerFlash10 = a2;
        spinnerFlash10.spinner[AQa.ba].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash10.spinner[AQa.ba].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash11 = a2;
        spinnerFlash11.spinner[AQa.ba].mirror = vRa.d;
        spinnerFlash11.J(spinnerFlash11.spinner[AQa.ba], JPa.N, JPa.N, Jra.Z);
        spinnerFlash11.spinner[ysa.s] = new Js((ModelBase)a2, wra.P, uSa.E);
        spinnerFlash11.spinner[ysa.s].J(NQa.m, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
        SpinnerFlash spinnerFlash12 = a2;
        spinnerFlash12.spinner[ysa.s].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash12.spinner[ysa.s].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash13 = a2;
        spinnerFlash13.spinner[ysa.s].mirror = vRa.d;
        spinnerFlash13.J(spinnerFlash13.spinner[ysa.s], JPa.N, JPa.N, Jra.Z);
        spinnerFlash13.spinner[wra.P] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash13.spinner[wra.P].J(dua.ca, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
        SpinnerFlash spinnerFlash14 = a2;
        spinnerFlash14.spinner[wra.P].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash14.spinner[wra.P].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash15 = a2;
        spinnerFlash15.spinner[wra.P].mirror = vRa.d;
        spinnerFlash15.J(spinnerFlash15.spinner[wra.P], JPa.N, JPa.N, Jra.Z);
        spinnerFlash15.spinner[CRa.L] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash15.spinner[CRa.L].J(Cra.fa, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
        SpinnerFlash spinnerFlash16 = a2;
        spinnerFlash16.spinner[CRa.L].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash16.spinner[CRa.L].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash17 = a2;
        spinnerFlash17.spinner[CRa.L].mirror = vRa.d;
        spinnerFlash17.J(spinnerFlash17.spinner[CRa.L], JPa.N, JPa.N, Jra.Z);
        spinnerFlash17.spinner[ISa.E] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash17.spinner[ISa.E].J(Lqa.C, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash18 = a2;
        spinnerFlash18.spinner[ISa.E].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash18.spinner[ISa.E].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash19 = a2;
        spinnerFlash19.spinner[ISa.E].mirror = vRa.d;
        spinnerFlash19.J(spinnerFlash19.spinner[ISa.E], JPa.N, JPa.N, Jra.Z);
        spinnerFlash19.spinner[kTa.g] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash19.spinner[kTa.g].J(Lqa.C, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
        SpinnerFlash spinnerFlash20 = a2;
        spinnerFlash20.spinner[kTa.g].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash20.spinner[kTa.g].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash21 = a2;
        spinnerFlash21.spinner[kTa.g].mirror = vRa.d;
        spinnerFlash21.J(spinnerFlash21.spinner[kTa.g], JPa.N, JPa.N, Jra.Z);
        spinnerFlash21.spinner[LQa.c] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash21.spinner[LQa.c].J(TOa.p, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash22 = a2;
        spinnerFlash22.spinner[LQa.c].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash22.spinner[LQa.c].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash23 = a2;
        spinnerFlash23.spinner[LQa.c].mirror = vRa.d;
        spinnerFlash23.J(spinnerFlash23.spinner[LQa.c], JPa.N, JPa.N, Jra.Z);
        spinnerFlash23.spinner[ITa.E] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash23.spinner[ITa.E].J(TOa.p, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
        SpinnerFlash spinnerFlash24 = a2;
        spinnerFlash24.spinner[ITa.E].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash24.spinner[ITa.E].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash25 = a2;
        spinnerFlash25.spinner[ITa.E].mirror = vRa.d;
        spinnerFlash25.J(spinnerFlash25.spinner[ITa.E], JPa.N, JPa.N, Jra.Z);
        spinnerFlash25.spinner[Qsa.Ha] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash25.spinner[Qsa.Ha].J(TOa.p, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash26 = a2;
        spinnerFlash26.spinner[Qsa.Ha].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash26.spinner[Qsa.Ha].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash27 = a2;
        spinnerFlash27.spinner[Qsa.Ha].mirror = vRa.d;
        spinnerFlash27.J(spinnerFlash27.spinner[Qsa.Ha], JPa.N, JPa.N, Jra.Z);
        spinnerFlash27.spinner[Lra.e] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash27.spinner[Lra.e].J(NQa.m, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash28 = a2;
        spinnerFlash28.spinner[Lra.e].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash28.spinner[Lra.e].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash29 = a2;
        spinnerFlash29.spinner[Lra.e].mirror = vRa.d;
        spinnerFlash29.J(spinnerFlash29.spinner[Lra.e], JPa.N, JPa.N, Jra.Z);
        spinnerFlash29.spinner[TQa.ca] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash29.spinner[TQa.ca].J(Lqa.C, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash30 = a2;
        spinnerFlash30.spinner[TQa.ca].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash30.spinner[TQa.ca].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash31 = a2;
        spinnerFlash31.spinner[TQa.ca].mirror = vRa.d;
        spinnerFlash31.J(spinnerFlash31.spinner[TQa.ca], JPa.N, JPa.N, Jra.Z);
        spinnerFlash31.spinner[EPa.O] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash3.spinner[EPa.O].J(sOa.Z, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash32 = a2;
        spinnerFlash32.spinner[EPa.O].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash32.spinner[EPa.O].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash33 = a2;
        spinnerFlash33.spinner[EPa.O].mirror = vRa.d;
        spinnerFlash33.J(spinnerFlash33.spinner[EPa.O], JPa.N, JPa.N, Jra.Z);
        spinnerFlash33.spinner[Tpa.z] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash33.spinner[Tpa.z].J(sOa.Z, Cra.fa, JPa.N, tTa.h, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash34 = a2;
        spinnerFlash34.spinner[Tpa.z].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash34.spinner[Tpa.z].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash35 = a2;
        spinnerFlash35.spinner[Tpa.z].mirror = vRa.d;
        spinnerFlash35.J(spinnerFlash35.spinner[Tpa.z], JPa.N, JPa.N, Jra.Z);
        spinnerFlash35.spinner[ITa.A] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash35.spinner[ITa.A].J(sOa.Z, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash36 = a2;
        spinnerFlash36.spinner[ITa.A].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash36.spinner[ITa.A].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash37 = a2;
        spinnerFlash37.spinner[ITa.A].mirror = vRa.d;
        spinnerFlash37.J(spinnerFlash37.spinner[ITa.A], JPa.N, JPa.N, Jra.Z);
        spinnerFlash37.spinner[Zqa.G] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash37.spinner[Zqa.G].J(sOa.Z, dua.ca, JPa.N, tTa.h, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash38 = a2;
        spinnerFlash38.spinner[Zqa.G].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash38.spinner[Zqa.G].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash39 = a2;
        spinnerFlash39.spinner[Zqa.G].mirror = vRa.d;
        spinnerFlash39.J(spinnerFlash39.spinner[Zqa.G], JPa.N, JPa.N, Jra.Z);
        spinnerFlash39.spinner[Fsa.d] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash39.spinner[Fsa.d].J(NQa.m, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash40 = a2;
        spinnerFlash40.spinner[Fsa.d].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash40.spinner[Fsa.d].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash41 = a2;
        spinnerFlash41.spinner[Fsa.d].mirror = vRa.d;
        spinnerFlash41.J(spinnerFlash41.spinner[Fsa.d], JPa.N, JPa.N, Jra.Z);
        spinnerFlash41.spinner[fPa.i] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash41.spinner[fPa.i].J(NQa.d, Lqa.C, vPa.b, yRa.d, vRa.d, yRa.d);
        SpinnerFlash spinnerFlash42 = a2;
        spinnerFlash42.spinner[fPa.i].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash42.spinner[fPa.i].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash43 = a2;
        spinnerFlash43.spinner[fPa.i].mirror = vRa.d;
        spinnerFlash43.J(spinnerFlash43.spinner[fPa.i], JPa.N, JPa.N, Jra.Z);
        spinnerFlash43.spinner[tua.U] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash43.spinner[tua.U].J(NQa.d, TOa.p, vPa.b, yRa.d, vRa.d, yRa.d);
        SpinnerFlash spinnerFlash44 = a2;
        spinnerFlash44.spinner[tua.U].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash44.spinner[tua.U].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash45 = a2;
        spinnerFlash45.spinner[tua.U].mirror = vRa.d;
        spinnerFlash45.J(spinnerFlash45.spinner[tua.U], JPa.N, JPa.N, Jra.Z);
        spinnerFlash45.spinner[vRa.d] = new Js((ModelBase)a2, wra.P, XTa.W);
        spinnerFlash45.spinner[vRa.d].J(YSa.G, NQa.m, JPa.N, yRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash46 = a2;
        spinnerFlash46.spinner[vRa.d].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash46.spinner[vRa.d].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash47 = a2;
        spinnerFlash47.spinner[vRa.d].mirror = vRa.d;
        spinnerFlash47.J(spinnerFlash47.spinner[vRa.d], JPa.N, JPa.N, Qra.G);
        spinnerFlash47.spinner[uqa.g] = new Js((ModelBase)a2, wra.P, XTa.W);
        spinnerFlash47.spinner[uqa.g].J(YSa.G, sOa.Z, JPa.N, yRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash48 = a2;
        spinnerFlash48.spinner[uqa.g].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash48.spinner[uqa.g].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash49 = a2;
        spinnerFlash49.spinner[uqa.g].mirror = vRa.d;
        spinnerFlash49.J(spinnerFlash49.spinner[uqa.g], JPa.N, JPa.N, Qra.G);
        spinnerFlash49.spinner[yRa.d] = new Js((ModelBase)a2, wra.P, XTa.W);
        spinnerFlash49.spinner[yRa.d].J(vQa.q, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
        SpinnerFlash spinnerFlash50 = a2;
        spinnerFlash50.spinner[yRa.d].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash50.spinner[yRa.d].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash51 = a2;
        spinnerFlash51.spinner[yRa.d].mirror = vRa.d;
        spinnerFlash51.J(spinnerFlash51.spinner[yRa.d], JPa.N, JPa.N, Qra.G);
        spinnerFlash51.spinner[AQa.P] = new Js((ModelBase)a2, wra.P, XTa.W);
        spinnerFlash51.spinner[AQa.P].J(BRa.k, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
        SpinnerFlash spinnerFlash52 = a2;
        spinnerFlash52.spinner[AQa.P].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash52.spinner[AQa.P].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash53 = a2;
        spinnerFlash53.spinner[AQa.P].mirror = vRa.d;
        spinnerFlash53.J(spinnerFlash53.spinner[AQa.P], JPa.N, JPa.N, Qra.G);
        spinnerFlash53.spinner[tTa.h] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash53.spinner[tTa.h].J(kta.v, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
        SpinnerFlash spinnerFlash54 = a2;
        spinnerFlash54.spinner[tTa.h].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash54.spinner[tTa.h].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash55 = a2;
        spinnerFlash55.spinner[tTa.h].mirror = vRa.d;
        spinnerFlash55.J(spinnerFlash55.spinner[tTa.h], JPa.N, JPa.N, Qra.G);
        spinnerFlash55.spinner[uua.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash55.spinner[uua.p].J(Qsa.k, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
        SpinnerFlash spinnerFlash56 = a2;
        spinnerFlash56.spinner[uua.p].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash56.spinner[uua.p].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash57 = a2;
        spinnerFlash57.spinner[uua.p].mirror = vRa.d;
        spinnerFlash57.J(spinnerFlash57.spinner[uua.p], JPa.N, JPa.N, Qra.G);
        spinnerFlash57.spinner[XTa.W] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash57.spinner[XTa.W].J(BRa.k, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash58 = a2;
        spinnerFlash58.spinner[XTa.W].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash58.spinner[XTa.W].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash59 = a2;
        spinnerFlash59.spinner[XTa.W].mirror = vRa.d;
        spinnerFlash59.J(spinnerFlash59.spinner[XTa.W], JPa.N, JPa.N, Qra.G);
        spinnerFlash59.spinner[Yqa.i] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash59.spinner[Yqa.i].J(vQa.q, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash60 = a2;
        spinnerFlash60.spinner[Yqa.i].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash60.spinner[Yqa.i].J(ysa.s, fPa.i);
        a2.spinner[Yqa.i].mirror = vRa.d;
        SpinnerFlash spinnerFlash61 = a2;
        spinnerFlash61.J(spinnerFlash61.spinner[Yqa.i], JPa.N, JPa.N, Qra.G);
        spinnerFlash61.spinner[WOa.fa] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash61.spinner[WOa.fa].J(vQa.q, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash62 = a2;
        spinnerFlash62.spinner[WOa.fa].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash62.spinner[WOa.fa].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash63 = a2;
        spinnerFlash63.spinner[WOa.fa].mirror = vRa.d;
        spinnerFlash63.J(spinnerFlash63.spinner[WOa.fa], JPa.N, JPa.N, Qra.G);
        spinnerFlash63.spinner[NTa.C] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash63.spinner[NTa.C].J(BRa.k, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash64 = a2;
        spinnerFlash64.spinner[NTa.C].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash64.spinner[NTa.C].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash65 = a2;
        spinnerFlash65.spinner[NTa.C].mirror = vRa.d;
        spinnerFlash65.J(spinnerFlash65.spinner[NTa.C], JPa.N, JPa.N, Qra.G);
        spinnerFlash65.spinner[pPa.f] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash65.spinner[pPa.f].J(YSa.G, TOa.p, vPa.b, yRa.d, vRa.d, yRa.d);
        SpinnerFlash spinnerFlash66 = a2;
        spinnerFlash66.spinner[pPa.f].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash66.spinner[pPa.f].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash67 = a2;
        spinnerFlash67.spinner[pPa.f].mirror = vRa.d;
        spinnerFlash67.J(spinnerFlash67.spinner[pPa.f], JPa.N, JPa.N, Qra.G);
        spinnerFlash67.spinner[lqa.s] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash67.spinner[lqa.s].J(YSa.G, Lqa.C, vPa.b, yRa.d, vRa.d, yRa.d);
        SpinnerFlash spinnerFlash68 = a2;
        spinnerFlash68.spinner[lqa.s].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash68.spinner[lqa.s].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash69 = a2;
        spinnerFlash69.spinner[lqa.s].mirror = vRa.d;
        spinnerFlash69.J(spinnerFlash69.spinner[lqa.s], JPa.N, JPa.N, Qra.G);
        spinnerFlash69.spinner[uua.s] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash69.spinner[uua.s].J(vQa.q, dua.ca, JPa.N, tTa.h, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash70 = a2;
        spinnerFlash70.spinner[uua.s].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash70.spinner[uua.s].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash71 = a2;
        spinnerFlash71.spinner[uua.s].mirror = vRa.d;
        spinnerFlash71.J(spinnerFlash71.spinner[uua.s], JPa.N, JPa.N, Qra.G);
        spinnerFlash71.spinner[hpa.Z] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash71.spinner[hpa.Z].J(vQa.q, Cra.fa, JPa.N, tTa.h, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash72 = a2;
        spinnerFlash72.spinner[hpa.Z].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash72.spinner[hpa.Z].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash73 = a2;
        spinnerFlash73.spinner[hpa.Z].mirror = vRa.d;
        spinnerFlash73.J(spinnerFlash73.spinner[hpa.Z], JPa.N, JPa.N, Qra.G);
        spinnerFlash73.spinner[Ypa.A] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash73.spinner[Ypa.A].J(Qsa.k, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash74 = a2;
        spinnerFlash74.spinner[Ypa.A].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash74.spinner[Ypa.A].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash75 = a2;
        spinnerFlash75.spinner[Ypa.A].mirror = vRa.d;
        spinnerFlash75.J(spinnerFlash75.spinner[Ypa.A], JPa.N, JPa.N, Qra.G);
        spinnerFlash75.spinner[ERa.C] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash75.spinner[ERa.C].J(Qsa.k, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash76 = a2;
        spinnerFlash76.spinner[ERa.C].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash76.spinner[ERa.C].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash77 = a2;
        spinnerFlash77.spinner[ERa.C].mirror = vRa.d;
        spinnerFlash77.J(spinnerFlash77.spinner[ERa.C], JPa.N, JPa.N, Qra.G);
        spinnerFlash77.spinner[yta.Ka] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash77.spinner[yta.Ka].J(kta.v, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash78 = a2;
        spinnerFlash78.spinner[yta.Ka].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash78.spinner[yta.Ka].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash79 = a2;
        spinnerFlash79.spinner[yta.Ka].mirror = vRa.d;
        spinnerFlash79.J(spinnerFlash79.spinner[yta.Ka], JPa.N, JPa.N, Qra.G);
        spinnerFlash79.spinner[yOa.B] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash79.spinner[yOa.B].J(kta.v, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash80 = a2;
        spinnerFlash80.spinner[yOa.B].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash80.spinner[yOa.B].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash81 = a2;
        spinnerFlash81.spinner[yOa.B].mirror = vRa.d;
        spinnerFlash81.J(spinnerFlash81.spinner[yOa.B], JPa.N, JPa.N, Qra.G);
        spinnerFlash81.spinner[wOa.t] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash81.spinner[wOa.t].J(pqa.r, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
        SpinnerFlash spinnerFlash82 = a2;
        spinnerFlash82.spinner[wOa.t].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash82.spinner[wOa.t].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash83 = a2;
        spinnerFlash83.spinner[wOa.t].mirror = vRa.d;
        spinnerFlash83.J(spinnerFlash83.spinner[wOa.t], JPa.N, JPa.N, Qra.G);
        spinnerFlash83.spinner[kTa.j] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash83.spinner[kTa.j].J(kPa.S, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
        SpinnerFlash spinnerFlash84 = a2;
        spinnerFlash84.spinner[kTa.j].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash84.spinner[kTa.j].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash85 = a2;
        spinnerFlash85.spinner[kTa.j].mirror = vRa.d;
        spinnerFlash85.J(spinnerFlash85.spinner[kTa.j], JPa.N, JPa.N, Qra.G);
        spinnerFlash85.spinner[FPa.F] = new Js((ModelBase)a2, wra.P, hpa.Z);
        spinnerFlash85.spinner[FPa.F].J(NQa.d, NQa.m, JPa.N, yRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash86 = a2;
        spinnerFlash86.spinner[FPa.F].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash86.spinner[FPa.F].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash87 = a2;
        spinnerFlash87.spinner[FPa.F].mirror = vRa.d;
        spinnerFlash87.J(spinnerFlash87.spinner[FPa.F], JPa.N, JPa.N, dua.N);
        spinnerFlash87.spinner[Bpa.Z] = new Js((ModelBase)a2, wra.P, hpa.Z);
        spinnerFlash87.spinner[Bpa.Z].J(NQa.m, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
        SpinnerFlash spinnerFlash88 = a2;
        spinnerFlash88.spinner[Bpa.Z].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash88.spinner[Bpa.Z].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash89 = a2;
        spinnerFlash89.spinner[Bpa.Z].mirror = vRa.d;
        spinnerFlash89.J(spinnerFlash89.spinner[Bpa.Z], JPa.N, JPa.N, dua.N);
        spinnerFlash89.spinner[kra.U] = new Js((ModelBase)a2, wra.P, hpa.Z);
        spinnerFlash89.spinner[kra.U].J(sOa.Z, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
        spinnerFlash61.spinner[kra.U].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash61.spinner[kra.U].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash90 = a2;
        spinnerFlash90.spinner[kra.U].mirror = vRa.d;
        spinnerFlash90.J(spinnerFlash90.spinner[kra.U], JPa.N, JPa.N, dua.N);
        spinnerFlash90.spinner[cQa.i] = new Js((ModelBase)a2, wra.P, hpa.Z);
        spinnerFlash90.spinner[cQa.i].J(NQa.d, sOa.Z, JPa.N, yRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash91 = a2;
        spinnerFlash91.spinner[cQa.i].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash91.spinner[cQa.i].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash92 = a2;
        spinnerFlash92.spinner[cQa.i].mirror = vRa.d;
        spinnerFlash92.J(spinnerFlash92.spinner[cQa.i], JPa.N, JPa.N, dua.N);
        spinnerFlash92.spinner[tua.w] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash92.spinner[tua.w].J(sOa.Z, Cra.fa, JPa.N, tTa.h, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash93 = a2;
        spinnerFlash93.spinner[tua.w].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash93.spinner[tua.w].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash94 = a2;
        spinnerFlash94.spinner[tua.w].mirror = vRa.d;
        spinnerFlash94.J(spinnerFlash94.spinner[tua.w], JPa.N, JPa.N, dua.N);
        spinnerFlash94.spinner[Psa.M] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash94.spinner[Psa.M].J(NQa.m, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash95 = a2;
        spinnerFlash95.spinner[Psa.M].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash95.spinner[Psa.M].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash96 = a2;
        spinnerFlash96.spinner[Psa.M].mirror = vRa.d;
        spinnerFlash96.J(spinnerFlash96.spinner[Psa.M], JPa.N, JPa.N, dua.N);
        spinnerFlash96.spinner[iSa.x] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash96.spinner[iSa.x].J(NQa.d, Lqa.C, vPa.b, yRa.d, vRa.d, yRa.d);
        SpinnerFlash spinnerFlash97 = a2;
        spinnerFlash97.spinner[iSa.x].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash97.spinner[iSa.x].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash98 = a2;
        spinnerFlash98.spinner[iSa.x].mirror = vRa.d;
        spinnerFlash98.J(spinnerFlash98.spinner[iSa.x], JPa.N, JPa.N, dua.N);
        spinnerFlash98.spinner[lPa.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash98.spinner[lPa.p].J(TOa.p, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash99 = a2;
        spinnerFlash99.spinner[lPa.p].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash99.spinner[lPa.p].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash100 = a2;
        spinnerFlash100.spinner[lPa.p].mirror = vRa.d;
        spinnerFlash100.J(spinnerFlash100.spinner[lPa.p], JPa.N, JPa.N, dua.N);
        spinnerFlash100.spinner[Yqa.D] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash100.spinner[Yqa.D].J(sOa.Z, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash101 = a2;
        spinnerFlash101.spinner[Yqa.D].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash101.spinner[Yqa.D].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash102 = a2;
        spinnerFlash102.spinner[Yqa.D].mirror = vRa.d;
        spinnerFlash102.J(spinnerFlash102.spinner[Yqa.D], JPa.N, JPa.N, dua.N);
        spinnerFlash102.spinner[lQa.R] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash102.spinner[lQa.R].J(TOa.p, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash103 = a2;
        spinnerFlash103.spinner[lQa.R].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash103.spinner[lQa.R].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash104 = a2;
        spinnerFlash104.spinner[lQa.R].mirror = vRa.d;
        spinnerFlash104.J(spinnerFlash104.spinner[lQa.R], JPa.N, JPa.N, dua.N);
        spinnerFlash104.spinner[wra.e] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash104.spinner[wra.e].J(Lqa.C, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash105 = a2;
        spinnerFlash105.spinner[wra.e].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash105.spinner[wra.e].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash106 = a2;
        spinnerFlash106.spinner[wra.e].mirror = vRa.d;
        spinnerFlash106.J(spinnerFlash106.spinner[wra.e], JPa.N, JPa.N, dua.N);
        spinnerFlash106.spinner[KSa.x] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash106.spinner[KSa.x].J(dua.ca, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
        SpinnerFlash spinnerFlash107 = a2;
        spinnerFlash107.spinner[KSa.x].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash107.spinner[KSa.x].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash108 = a2;
        spinnerFlash108.spinner[KSa.x].mirror = vRa.d;
        spinnerFlash108.J(spinnerFlash108.spinner[KSa.x], JPa.N, JPa.N, dua.N);
        spinnerFlash108.spinner[Bpa.Ha] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash108.spinner[Bpa.Ha].J(Lqa.C, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
        SpinnerFlash spinnerFlash109 = a2;
        spinnerFlash109.spinner[Bpa.Ha].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash109.spinner[Bpa.Ha].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash110 = a2;
        spinnerFlash110.spinner[Bpa.Ha].mirror = vRa.d;
        spinnerFlash110.J(spinnerFlash110.spinner[Bpa.Ha], JPa.N, JPa.N, dua.N);
        spinnerFlash110.spinner[Upa.D] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash110.spinner[Upa.D].J(TOa.p, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
        SpinnerFlash spinnerFlash111 = a2;
        spinnerFlash111.spinner[Upa.D].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash111.spinner[Upa.D].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash112 = a2;
        spinnerFlash112.spinner[Upa.D].mirror = vRa.d;
        spinnerFlash112.J(spinnerFlash112.spinner[Upa.D], JPa.N, JPa.N, dua.N);
        spinnerFlash112.spinner[uOa.F] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash112.spinner[uOa.F].J(Cra.fa, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
        SpinnerFlash spinnerFlash113 = a2;
        spinnerFlash113.spinner[uOa.F].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash113.spinner[uOa.F].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash114 = a2;
        spinnerFlash114.spinner[uOa.F].mirror = vRa.d;
        spinnerFlash114.J(spinnerFlash114.spinner[uOa.F], JPa.N, JPa.N, dua.N);
        spinnerFlash114.spinner[GPa.C] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash114.spinner[GPa.C].J(NQa.m, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash115 = a2;
        spinnerFlash115.spinner[GPa.C].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash115.spinner[GPa.C].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash116 = a2;
        spinnerFlash116.spinner[GPa.C].mirror = vRa.d;
        spinnerFlash116.J(spinnerFlash116.spinner[GPa.C], JPa.N, JPa.N, dua.N);
        spinnerFlash116.spinner[QSa.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash116.spinner[QSa.p].J(Lqa.C, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash117 = a2;
        spinnerFlash117.spinner[QSa.p].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash117.spinner[QSa.p].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash118 = a2;
        spinnerFlash118.spinner[QSa.p].mirror = vRa.d;
        spinnerFlash118.J(spinnerFlash118.spinner[QSa.p], JPa.N, JPa.N, dua.N);
        SpinnerFlash spinnerFlash119 = a2;
        spinnerFlash119.spinner[jRa.q] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash119.spinner[jRa.q].J(sOa.Z, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
        SpinnerFlash spinnerFlash120 = a2;
        spinnerFlash120.spinner[jRa.q].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash120.spinner[jRa.q].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash121 = a2;
        spinnerFlash121.spinner[jRa.q].mirror = vRa.d;
        spinnerFlash121.J(spinnerFlash121.spinner[jRa.q], JPa.N, JPa.N, dua.N);
        spinnerFlash121.spinner[vpa.o] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash121.spinner[vpa.o].J(NQa.d, TOa.p, vPa.b, yRa.d, vRa.d, yRa.d);
        SpinnerFlash spinnerFlash122 = a2;
        spinnerFlash122.spinner[vpa.o].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash122.spinner[vpa.o].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash123 = a2;
        spinnerFlash123.spinner[vpa.o].mirror = vRa.d;
        spinnerFlash123.J(spinnerFlash123.spinner[vpa.o], JPa.N, JPa.N, dua.N);
        spinnerFlash123.spinner[cPa.Q] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash123.spinner[cPa.Q].J(sOa.Z, dua.ca, JPa.N, tTa.h, vRa.d, uqa.g);
        SpinnerFlash spinnerFlash124 = a2;
        spinnerFlash124.spinner[cPa.Q].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash124.spinner[cPa.Q].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash125 = a2;
        spinnerFlash125.spinner[cPa.Q].mirror = vRa.d;
        spinnerFlash125.J(spinnerFlash125.spinner[cPa.Q], JPa.N, JPa.N, dua.N);
        spinnerFlash125.spinner[uSa.E] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash125.spinner[uSa.E].J(vqa.T, NQa.m, JPa.N, uqa.g, AQa.P, uqa.g);
        SpinnerFlash spinnerFlash126 = a2;
        spinnerFlash126.spinner[uSa.E].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash126.spinner[uSa.E].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash127 = a2;
        spinnerFlash127.spinner[uSa.E].mirror = vRa.d;
        spinnerFlash127.J(spinnerFlash127.spinner[uSa.E], JPa.N, JPa.N, JPa.N);
        spinnerFlash127.spinner[WPa.L] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash127.spinner[WPa.L].J(JPa.N, FRa.ca, JPa.N, AQa.P, yRa.d, uqa.g);
        SpinnerFlash spinnerFlash128 = a2;
        spinnerFlash128.spinner[WPa.L].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash128.spinner[WPa.L].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash129 = a2;
        spinnerFlash129.spinner[WPa.L].mirror = vRa.d;
        spinnerFlash129.J(spinnerFlash129.spinner[WPa.L], JPa.N, JPa.N, fqa.Q);
        spinnerFlash129.spinner[Vra.b] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash129.spinner[Vra.b].J(JPa.N, FRa.ca, JPa.N, AQa.P, yRa.d, uqa.g);
        SpinnerFlash spinnerFlash130 = a2;
        spinnerFlash130.spinner[Vra.b].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash130.spinner[Vra.b].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash131 = a2;
        spinnerFlash131.spinner[Vra.b].mirror = vRa.d;
        spinnerFlash131.J(spinnerFlash131.spinner[Vra.b], JPa.N, JPa.N, fqa.U);
        spinnerFlash131.spinner[osa.c] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash131.spinner[osa.c].J(JPa.N, pPa.c, JPa.N, AQa.P, uqa.g, uqa.g);
        SpinnerFlash spinnerFlash132 = a2;
        spinnerFlash132.spinner[osa.c].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash132.spinner[osa.c].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash133 = a2;
        spinnerFlash133.spinner[osa.c].mirror = vRa.d;
        spinnerFlash133.J(spinnerFlash133.spinner[osa.c], JPa.N, JPa.N, DPa.s);
        spinnerFlash133.spinner[SPa.T] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash133.spinner[SPa.T].J(WRa.m, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
        SpinnerFlash spinnerFlash134 = a2;
        spinnerFlash134.spinner[SPa.T].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash134.spinner[SPa.T].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash135 = a2;
        spinnerFlash135.spinner[SPa.T].mirror = vRa.d;
        spinnerFlash135.J(spinnerFlash135.spinner[SPa.T], JPa.N, JPa.N, Jra.Z);
        spinnerFlash135.spinner[ITa.V] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash135.spinner[ITa.V].J(WRa.m, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
        SpinnerFlash spinnerFlash136 = a2;
        spinnerFlash136.spinner[ITa.V].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash136.spinner[ITa.V].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash137 = a2;
        spinnerFlash137.spinner[ITa.V].mirror = vRa.d;
        spinnerFlash137.J(spinnerFlash137.spinner[ITa.V], JPa.N, JPa.N, dua.N);
        spinnerFlash137.spinner[Ssa.u] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash137.spinner[Ssa.u].J(pPa.c, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
        SpinnerFlash spinnerFlash138 = a2;
        spinnerFlash138.spinner[Ssa.u].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash138.spinner[Ssa.u].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash139 = a2;
        spinnerFlash139.spinner[Ssa.u].mirror = vRa.d;
        spinnerFlash139.J(spinnerFlash139.spinner[Ssa.u], JPa.N, JPa.N, vpa.P);
        spinnerFlash139.spinner[Fpa.ca] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash139.spinner[Fpa.ca].J(NQa.m, pPa.c, JPa.N, AQa.P, uqa.g, uqa.g);
        SpinnerFlash spinnerFlash140 = a2;
        spinnerFlash140.spinner[Fpa.ca].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash140.spinner[Fpa.ca].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash141 = a2;
        spinnerFlash141.spinner[Fpa.ca].mirror = vRa.d;
        spinnerFlash141.J(spinnerFlash141.spinner[Fpa.ca], JPa.N, JPa.N, vTa.K);
        spinnerFlash141.spinner[fPa.ga] = new Js((ModelBase)a2, uSa.E, uSa.E);
        spinnerFlash141.spinner[fPa.ga].J(pPa.c, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
        SpinnerFlash spinnerFlash142 = a2;
        spinnerFlash142.spinner[fPa.ga].J(JPa.N, JPa.N, JPa.N);
        spinnerFlash142.spinner[fPa.ga].J(ysa.s, fPa.i);
        SpinnerFlash spinnerFlash143 = a2;
        spinnerFlash143.spinner[fPa.ga].mirror = vRa.d;
        spinnerFlash143.J(spinnerFlash143.spinner[fPa.ga], JPa.N, JPa.N, Qra.G);
        spinnerFlash143.J(tex[uSa.E]);
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        SpinnerFlash a2 = this;
        float c2 = d2 * dqa.B;
        a2.base[uSa.E].rotationZ = -c2;
        a2.base[vRa.d].rotationZ = -c2;
        uKa.J((float)Ora.D, (float)vPa.b, (float)MQa.L);
        uKa.J((float)(-d2 * Ira.d), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(d2 * SRa.V), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.l((float)Ora.D, (float)Ora.D, (float)Ora.D);
        a2.J(tex[(int)(d2 % qta.D / eua.C)]);
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        SpinnerFlash a2 = this;
        uKa.l((float)xSa.la, (float)xSa.la, (float)xSa.la);
        uKa.J((float)(b2 * SRa.V), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        SpinnerFlash spinnerFlash = a2;
        spinnerFlash.J(tex[(int)(b2 % qta.D / eua.C)]);
        super.J(b2);
    }
}

