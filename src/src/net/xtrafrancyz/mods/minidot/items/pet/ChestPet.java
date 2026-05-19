/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Cra
 *  Gua
 *  JPa
 *  Js
 *  LQa
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  QSa
 *  Usa
 *  XTa
 *  Zta
 *  bpa
 *  fsa
 *  iPa
 *  isa
 *  jRa
 *  jpa
 *  kpa
 *  oqa
 *  pqa
 *  uKa
 *  uOa
 *  vPa
 *  vQa
 *  vRa
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

public final class ChestPet
extends BasePet {
    private static Js Piece1;
    private static Js Piece2;
    private String color;
    private static final Map<String, ResourceLocation> colors;

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(AQa.t, new ResourceLocation(Cra.V, Gua.Aa));
        colors.put(rQa.Y, new ResourceLocation(Cra.V, KQa.a));
        colors.put(NSa.A, new ResourceLocation(Cra.V, aua.y));
    }

    public ChestPet(String string) {
        ChestPet a2;
        String b2 = string;
        ChestPet chestPet = a2 = this;
        chestPet.textureWidth = XOa.h;
        chestPet.textureHeight = ysa.s;
        chestPet.color = b2;
        if (Piece1 == null) {
            ChestPet chestPet2 = a2;
            chestPet2.J(fsa.Ka, uSa.E, wOa.t);
            chestPet2.J(oqa.P, NPa.e, kra.U);
            chestPet2.J(isa.n, jRa.X, tua.U);
            chestPet2.J(Iqa.h, fPa.ga, Zqa.G);
            chestPet2.J(ysa.c, uSa.E, uSa.E);
            chestPet2.J(Qra.p, hpa.Z, KSa.x);
            chestPet2.J(ATa.b, yta.Ka, wra.e);
            chestPet2.J(Zta.M, XTa.W, QSa.p);
            chestPet2.J(uOa.x, uSa.E, uSa.E);
            Piece1 = new Js((ModelBase)a2, Usa.f);
            Piece1.J(vQa.C, NQa.d, JPa.N, NQa.d, hpa.Z, NTa.C, hpa.Z);
            Piece1.J(kua.j, BPa.I, dua.ca, BPa.I, uua.s, uqa.g, uSa.E);
            Piece1.J(kpa.ca, jpa.K, dua.ca, BPa.I, uSa.E, uqa.g, Yqa.i);
            Piece1.J(Bra.f, BPa.I, dua.ca, BPa.I, uSa.E, uqa.g, uua.p);
            Piece2 = new Js((ModelBase)a2, Mqa.n);
            Piece2.J(JPa.N, JPa.N, BRa.k);
            Piece2.J(LQa.A, NQa.d, CRa.M, Lsa.A, hpa.Z, tTa.h, hpa.Z);
            Piece2.J(iPa.g, BPa.I, JPa.N, rpa.y, uua.s, uqa.g, uSa.E);
            Piece2.J(Ata.q, jpa.K, JPa.N, rpa.y, uSa.E, uqa.g, NTa.C);
            Piece2.J(QTa.w, BPa.I, JPa.N, rpa.y, uSa.E, uqa.g, XTa.W);
            Piece2.J(vua.L, vqa.T, dua.ca, DPa.m, uqa.g, AQa.P, vRa.d);
        }
        a2.J(colors.get(b2));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        ChestPet a2 = this;
        uKa.l((float)xSa.la, (float)xSa.la, (float)xSa.la);
        uKa.J((float)JPa.N, (float)Qra.j, (float)JPa.N);
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void a2;
        ModelBase d22 = modelPlayer;
        ChestPet c2 = this;
        float d22 = Oz.d((float)(a2 * TOa.r)) * WRa.e;
        uKa.J((float)xSa.la, (float)(vPa.b + d22), (float)bpa.K);
        uKa.J((float)Ira.d, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.l((float)wOa.w, (float)wOa.w, (float)wOa.w);
        d22 = JPa.N;
        if (a2 % UOa.d > SPa.b) {
            d22 = Oz.C((float)(a2 % UOa.d * QTa.D)) * MQa.L - MQa.L;
        }
        ChestPet.Piece2.rotationX = d22;
    }
}

