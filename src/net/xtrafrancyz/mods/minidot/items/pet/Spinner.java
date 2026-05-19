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
 *  ISa
 *  JPa
 *  JTa
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
 *  cQa
 *  jRa
 *  kPa
 *  kta
 *  lPa
 *  lqa
 *  pPa
 *  pqa
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

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class Spinner
extends BasePet {
    private String color;
    public static boolean compiled;
    public static int displayList;
    private static final Map<String, ResourceLocation> colors;
    public static Js[] spinner;
    public static Js[] base;

    @Override
    public void J(float f2) {
        float b2 = f2;
        Spinner a2 = this;
        uKa.l((float)xSa.la, (float)xSa.la, (float)xSa.la);
        uKa.J((float)(b2 * SRa.V), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        super.J(b2);
    }

    public Spinner(String string) {
        Spinner a2;
        String b2 = string;
        Spinner spinner = a2 = this;
        a2.textureWidth = ysa.s;
        spinner.textureHeight = fPa.i;
        spinner.useDisplayLists = vRa.d;
        spinner.color = b2;
        if (Spinner.spinner == null) {
            Spinner.spinner = new Js[Cra.S];
            base = new Js[uqa.g];
            Spinner.base[vRa.d] = new Js((ModelBase)a2, yOa.B, uSa.E);
            base[vRa.d].J(Ppa.Ha, FRa.ca, vqa.T, tTa.h, yRa.d, AQa.P);
            base[vRa.d].J(vRa.d != 0);
            Spinner.base[uSa.E] = new Js((ModelBase)a2, yOa.B, uSa.E);
            base[uSa.E].J(FRa.ca, Ppa.Ha, vqa.T, yRa.d, tTa.h, AQa.P);
            base[uSa.E].J(vRa.d != 0);
            Spinner.spinner[wOa.h] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[wOa.h].J(NQa.d, NQa.m, JPa.N, yRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[wOa.h], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[wra.P] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[wra.P].J(dua.ca, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
            a2.J(Spinner.spinner[wra.P], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[cQa.o] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[cQa.o].J(NQa.d, sOa.Z, JPa.N, yRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[cQa.o], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[CRa.L] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[CRa.L].J(Cra.fa, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
            a2.J(Spinner.spinner[CRa.L], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[AQa.ba] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[AQa.ba].J(sOa.Z, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
            a2.J(Spinner.spinner[AQa.ba], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[ISa.E] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[ISa.E].J(Lqa.C, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[ISa.E], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[kTa.g] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[kTa.g].J(Lqa.C, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
            a2.J(Spinner.spinner[kTa.g], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[LQa.c] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[LQa.c].J(TOa.p, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[LQa.c], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[ITa.E] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[ITa.E].J(TOa.p, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
            a2.J(Spinner.spinner[ITa.E], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[Qsa.Ha] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Qsa.Ha].J(TOa.p, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[Qsa.Ha], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[Lra.e] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Lra.e].J(NQa.m, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[Lra.e], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[TQa.ca] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[TQa.ca].J(Lqa.C, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[TQa.ca], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[EPa.O] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[EPa.O].J(sOa.Z, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[EPa.O], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[Tpa.z] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Tpa.z].J(sOa.Z, Cra.fa, JPa.N, tTa.h, vRa.d, uqa.g);
            a2.J(Spinner.spinner[Tpa.z], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[ITa.A] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[ITa.A].J(sOa.Z, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[ITa.A], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[Zqa.G] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Zqa.G].J(sOa.Z, dua.ca, JPa.N, tTa.h, vRa.d, uqa.g);
            a2.J(Spinner.spinner[Zqa.G], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[Fsa.d] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Fsa.d].J(NQa.m, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[Fsa.d], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[ysa.s] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[ysa.s].J(NQa.m, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
            a2.J(Spinner.spinner[ysa.s], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[fPa.i] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[fPa.i].J(NQa.d, Lqa.C, vPa.b, yRa.d, vRa.d, yRa.d);
            a2.J(Spinner.spinner[fPa.i], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[tua.U] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[tua.U].J(NQa.d, TOa.p, vPa.b, yRa.d, vRa.d, yRa.d);
            a2.J(Spinner.spinner[tua.U], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[vRa.d] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[vRa.d].J(YSa.G, NQa.m, JPa.N, yRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[vRa.d], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[uqa.g] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[uqa.g].J(YSa.G, sOa.Z, JPa.N, yRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[uqa.g], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[yRa.d] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[yRa.d].J(vQa.q, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
            a2.J(Spinner.spinner[yRa.d], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[AQa.P] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[AQa.P].J(BRa.k, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
            a2.J(Spinner.spinner[AQa.P], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[tTa.h] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[tTa.h].J(kta.v, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
            a2.J(Spinner.spinner[tTa.h], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[uua.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[uua.p].J(Qsa.k, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
            a2.J(Spinner.spinner[uua.p], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[XTa.W] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[XTa.W].J(BRa.k, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[XTa.W], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[Yqa.i] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Yqa.i].J(vQa.q, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[Yqa.i], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[WOa.fa] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[WOa.fa].J(vQa.q, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[WOa.fa], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[NTa.C] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[NTa.C].J(BRa.k, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[NTa.C], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[pPa.f] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[pPa.f].J(YSa.G, TOa.p, vPa.b, yRa.d, vRa.d, yRa.d);
            a2.J(Spinner.spinner[pPa.f], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[lqa.s] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[lqa.s].J(YSa.G, Lqa.C, vPa.b, yRa.d, vRa.d, yRa.d);
            a2.J(Spinner.spinner[lqa.s], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[uua.s] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[uua.s].J(vQa.q, dua.ca, JPa.N, tTa.h, vRa.d, uqa.g);
            a2.J(Spinner.spinner[uua.s], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[hpa.Z] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[hpa.Z].J(vQa.q, Cra.fa, JPa.N, tTa.h, vRa.d, uqa.g);
            a2.J(Spinner.spinner[hpa.Z], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[Ypa.A] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Ypa.A].J(Qsa.k, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[Ypa.A], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[ERa.C] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[ERa.C].J(Qsa.k, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[ERa.C], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[yta.Ka] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[yta.Ka].J(kta.v, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[yta.Ka], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[yOa.B] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[yOa.B].J(kta.v, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[yOa.B], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[wOa.t] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[wOa.t].J(pqa.r, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
            a2.J(Spinner.spinner[wOa.t], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[kTa.j] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[kTa.j].J(kPa.S, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
            a2.J(Spinner.spinner[kTa.j], JPa.N, JPa.N, Qra.G);
            Spinner.spinner[kra.U] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[kra.U].J(sOa.Z, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
            a2.J(Spinner.spinner[kra.U], JPa.N, JPa.N, dua.N);
            Spinner.spinner[tua.w] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[tua.w].J(sOa.Z, Cra.fa, JPa.N, tTa.h, vRa.d, uqa.g);
            a2.J(Spinner.spinner[tua.w], JPa.N, JPa.N, dua.N);
            Spinner.spinner[cQa.i] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[cQa.i].J(NQa.d, sOa.Z, JPa.N, yRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[cQa.i], JPa.N, JPa.N, dua.N);
            Spinner.spinner[Psa.M] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Psa.M].J(NQa.m, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[Psa.M], JPa.N, JPa.N, dua.N);
            Spinner.spinner[iSa.x] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[iSa.x].J(NQa.d, Lqa.C, vPa.b, yRa.d, vRa.d, yRa.d);
            a2.J(Spinner.spinner[iSa.x], JPa.N, JPa.N, dua.N);
            Spinner.spinner[lPa.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[lPa.p].J(TOa.p, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[lPa.p], JPa.N, JPa.N, dua.N);
            Spinner.spinner[Yqa.D] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Yqa.D].J(sOa.Z, Lqa.C, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[Yqa.D], JPa.N, JPa.N, dua.N);
            Spinner.spinner[lQa.R] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[lQa.R].J(TOa.p, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[lQa.R], JPa.N, JPa.N, dua.N);
            Spinner.spinner[wra.e] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[wra.e].J(Lqa.C, Lqa.C, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[wra.e], JPa.N, JPa.N, dua.N);
            Spinner.spinner[KSa.x] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[KSa.x].J(dua.ca, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
            a2.J(Spinner.spinner[KSa.x], JPa.N, JPa.N, dua.N);
            Spinner.spinner[Bpa.Ha] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Bpa.Ha].J(Lqa.C, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
            a2.J(Spinner.spinner[Bpa.Ha], JPa.N, JPa.N, dua.N);
            Spinner.spinner[Upa.D] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Upa.D].J(TOa.p, sOa.Z, vPa.b, vRa.d, tTa.h, yRa.d);
            a2.J(Spinner.spinner[Upa.D], JPa.N, JPa.N, dua.N);
            Spinner.spinner[uOa.F] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[uOa.F].J(Cra.fa, sOa.Z, JPa.N, vRa.d, tTa.h, uqa.g);
            a2.J(Spinner.spinner[uOa.F], JPa.N, JPa.N, dua.N);
            Spinner.spinner[GPa.C] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[GPa.C].J(NQa.m, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[GPa.C], JPa.N, JPa.N, dua.N);
            Spinner.spinner[QSa.p] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[QSa.p].J(Lqa.C, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[QSa.p], JPa.N, JPa.N, dua.N);
            Spinner.spinner[Bpa.Z] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[Bpa.Z].J(NQa.m, NQa.d, JPa.N, vRa.d, yRa.d, uqa.g);
            a2.J(Spinner.spinner[Bpa.Z], JPa.N, JPa.N, dua.N);
            Spinner.spinner[jRa.q] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[jRa.q].J(sOa.Z, NQa.m, vPa.b, vRa.d, uqa.g, yRa.d);
            a2.J(Spinner.spinner[jRa.q], JPa.N, JPa.N, dua.N);
            Spinner.spinner[FPa.F] = new Js((ModelBase)a2, yOa.B, uSa.E);
            Spinner.spinner[FPa.F].J(NQa.d, NQa.m, JPa.N, yRa.d, vRa.d, uqa.g);
            a2.J(Spinner.spinner[FPa.F], JPa.N, JPa.N, dua.N);
            Spinner.spinner[vpa.o] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[vpa.o].J(NQa.d, TOa.p, vPa.b, yRa.d, vRa.d, yRa.d);
            a2.J(Spinner.spinner[vpa.o], JPa.N, JPa.N, dua.N);
            Spinner.spinner[cPa.Q] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[cPa.Q].J(sOa.Z, dua.ca, JPa.N, tTa.h, vRa.d, uqa.g);
            a2.J(Spinner.spinner[cPa.Q], JPa.N, JPa.N, dua.N);
            Spinner.spinner[uSa.E] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[uSa.E].J(vqa.T, NQa.m, JPa.N, uqa.g, AQa.P, uqa.g);
            Spinner.spinner[WPa.L] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[WPa.L].J(JPa.N, FRa.ca, JPa.N, AQa.P, yRa.d, uqa.g);
            a2.J(Spinner.spinner[WPa.L], JPa.N, JPa.N, fqa.Q);
            Spinner.spinner[Vra.b] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Vra.b].J(JPa.N, FRa.ca, JPa.N, AQa.P, yRa.d, uqa.g);
            a2.J(Spinner.spinner[Vra.b], JPa.N, JPa.N, fqa.U);
            Spinner.spinner[osa.c] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[osa.c].J(JPa.N, pPa.c, JPa.N, AQa.P, uqa.g, uqa.g);
            a2.J(Spinner.spinner[osa.c], JPa.N, JPa.N, DPa.s);
            Spinner.spinner[SPa.T] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[SPa.T].J(WRa.m, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
            a2.J(Spinner.spinner[SPa.T], JPa.N, JPa.N, Jra.Z);
            Spinner.spinner[ITa.V] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[ITa.V].J(WRa.m, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
            a2.J(Spinner.spinner[ITa.V], JPa.N, JPa.N, dua.N);
            Spinner.spinner[Ssa.u] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Ssa.u].J(pPa.c, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
            a2.J(Spinner.spinner[Ssa.u], JPa.N, JPa.N, vpa.P);
            Spinner.spinner[Fpa.ca] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[Fpa.ca].J(NQa.m, pPa.c, JPa.N, AQa.P, uqa.g, uqa.g);
            a2.J(Spinner.spinner[Fpa.ca], JPa.N, JPa.N, vTa.K);
            Spinner.spinner[fPa.ga] = new Js((ModelBase)a2, uSa.E, uSa.E);
            Spinner.spinner[fPa.ga].J(pPa.c, JPa.N, JPa.N, uqa.g, AQa.P, uqa.g);
            a2.J(Spinner.spinner[fPa.ga], JPa.N, JPa.N, Qra.G);
        }
        a2.J(colors.get(b2));
    }

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(QTa.v, new ResourceLocation(Cra.V, KPa.z));
        colors.put(NSa.A, new ResourceLocation(Cra.V, iSa.la));
        colors.put(gQa.r, new ResourceLocation(Cra.V, uSa.O));
        colors.put(rQa.a, new ResourceLocation(Cra.V, JTa.o));
        colors.put(rQa.Y, new ResourceLocation(Cra.V, rua.u));
    }

    @Override
    public void f() {
        Spinner a2;
        if (((BasePet)a2).compiled) {
            super.f();
            return;
        }
        if (compiled) {
            ((BasePet)a2).compiled = vRa.d;
            ((BasePet)a2).displayList = displayList;
            a2.J();
        }
        super.f();
        if (!compiled) {
            compiled = vRa.d;
            displayList = ((BasePet)a2).displayList;
        }
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        Spinner a2 = this;
        float c2 = d2 * dqa.B;
        Spinner.base[uSa.E].rotationZ = -c2;
        Spinner.base[vRa.d].rotationZ = -c2;
        uKa.J((float)Ora.D, (float)vPa.b, (float)MQa.L);
        uKa.J((float)(-d2 * Ira.d), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(d2 * SRa.V), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.l((float)Ora.D, (float)Ora.D, (float)Ora.D);
    }
}

