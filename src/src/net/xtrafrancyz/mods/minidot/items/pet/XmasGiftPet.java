/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  Js
 *  MQa
 *  NTa
 *  Oz
 *  Ppa
 *  URa
 *  WSa
 *  bpa
 *  bqa
 *  fpa
 *  fsa
 *  isa
 *  kPa
 *  pqa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class XmasGiftPet
extends BasePet {
    private static Js Shape9;
    private static Js Shape7;
    private static Js Shape10;
    private static Js Shape11;
    private static final Map<String, ResourceLocation> colors;
    private static Js Shape8;
    private static Js Shape14;
    private static Js Shape13;
    private static Js Shape5;
    private static Js Shape15;
    private static Js Shape1;
    private static Js Shape16;
    private static Js Shape3;
    private static Js Shape2;
    private static Js Shape6;
    private static Js Shape12;
    private static Js Shape4;
    private String color;

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(rQa.Y, new ResourceLocation(Cra.V, WSa.Fa));
        colors.put(rQa.a, new ResourceLocation(Cra.V, wta.H));
        colors.put(NSa.A, new ResourceLocation(Cra.V, aua.l));
        colors.put(QTa.v, new ResourceLocation(Cra.V, URa.z));
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        XmasGiftPet a2 = this;
        float c2 = Oz.d((float)(d2 * TOa.r)) * Yqa.C;
        uKa.J((float)xSa.la, (float)(vPa.b + c2), (float)bpa.K);
        uKa.J((float)(d2 * Jsa.Z), (float)JPa.N, (float)pqa.r, (float)JPa.N);
    }

    public XmasGiftPet(String string) {
        XmasGiftPet a2;
        String b2 = string;
        XmasGiftPet xmasGiftPet = a2 = this;
        a2.textureWidth = ysa.s;
        xmasGiftPet.textureHeight = fPa.i;
        xmasGiftPet.useDisplayLists = vRa.d;
        xmasGiftPet.color = b2;
        if (Shape1 == null) {
            Shape1 = new Js((ModelBase)a2, uSa.E, uSa.E);
            Shape1.J(CRa.M, bqa.N, CRa.M, NTa.C, Yqa.i, NTa.C);
            XmasGiftPet.Shape1.scaleModifier = fsa.Ia;
            Shape2 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape2.J(fPa.ha, nOa.a, vPa.b, vRa.d, Yqa.i, vRa.d);
            Shape3 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape3.J(vQa.k, fpa.N, vPa.b, NTa.C, vRa.d, vRa.d);
            XmasGiftPet.Shape3.scaleModifier = oQa.S;
            Shape4 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape4.J(zta.P, nOa.a, vPa.b, NTa.C, vRa.d, vRa.d);
            XmasGiftPet.Shape4.scaleModifier = oQa.S;
            Shape5 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape5.J(zta.P, bqa.N, vPa.b, vRa.d, Yqa.i, vRa.d);
            Shape6 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape6.J(vPa.b, fpa.N, zta.P, vRa.d, vRa.d, NTa.C);
            Shape7 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape7.J(vPa.b, nOa.a, vQa.k, vRa.d, vRa.d, NTa.C);
            Shape8 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape8.J(vPa.b, nOa.a, zta.P, vRa.d, Yqa.i, vRa.d);
            XmasGiftPet.Shape8.scaleModifier = oQa.S;
            Shape9 = new Js((ModelBase)a2, uSa.E, wOa.h);
            Shape9.J(vPa.b, bqa.N, fPa.ha, vRa.d, Yqa.i, vRa.d);
            XmasGiftPet.Shape9.scaleModifier = oQa.S;
            Shape10 = new Js((ModelBase)a2, uSa.E, uSa.E);
            Shape10.J(MQa.L, kPa.I, vPa.b, vRa.d, vRa.d, vRa.d);
            Shape11 = new Js((ModelBase)a2, uSa.E, uSa.E);
            Shape11.J(FRa.ca, vpa.g, vPa.b, yRa.d, vRa.d, vRa.d);
            Shape12 = new Js((ModelBase)a2, uSa.E, uSa.E);
            Shape12.J(Ira.d, KQa.O, vPa.b, vRa.d, uqa.g, vRa.d);
            Shape13 = new Js((ModelBase)a2, uSa.E, uSa.E);
            Shape13.J(FRa.ca, kPa.I, vPa.b, vRa.d, vRa.d, vRa.d);
            Shape14 = new Js((ModelBase)a2, uSa.E, uSa.E);
            Shape14.J(Ppa.Ha, KQa.O, vPa.b, vRa.d, uqa.g, vRa.d);
            Shape15 = new Js((ModelBase)a2, uSa.E, uSa.E);
            Shape15.J(vPa.b, KQa.O, vPa.b, vRa.d, uqa.g, vRa.d);
            XmasGiftPet.Shape15.scaleModifier = oQa.S;
            Shape16 = new Js((ModelBase)a2, osa.c, wOa.t);
            Shape16.J(CRa.M, dua.ca, CRa.M, NTa.C, yRa.d, NTa.C);
            XmasGiftPet.Shape15.scaleModifier = MQa.d;
        }
        a2.J(colors.get(b2));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        XmasGiftPet a2 = this;
        uKa.l((float)isa.W, (float)isa.W, (float)isa.W);
        uKa.J((float)JPa.N, (float)KQa.C, (float)JPa.N);
        super.J(b2);
    }
}

