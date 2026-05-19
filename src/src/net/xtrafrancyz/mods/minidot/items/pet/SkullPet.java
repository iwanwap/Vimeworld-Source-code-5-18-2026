/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Cra
 *  EQa
 *  ERa
 *  ISa
 *  JPa
 *  Js
 *  LQa
 *  NOa
 *  NQa
 *  Oz
 *  PTa
 *  Qsa
 *  SOa
 *  TQa
 *  Tpa
 *  Usa
 *  XTa
 *  Xsa
 *  YSa
 *  asa
 *  bSa
 *  cQa
 *  fsa
 *  iPa
 *  isa
 *  kpa
 *  kta
 *  nQa
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  yQa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class SkullPet
extends BasePet {
    private static final ResourceLocation tex = new ResourceLocation(Cra.V, cPa.g);
    private final Js Piece1;
    private static final ResourceLocation tex1 = new ResourceLocation(Cra.V, bSa.Aa);

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        SkullPet a2 = this;
        float c2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        uKa.J((float)Ora.D, (float)(vPa.b + c2), (float)Xpa.R);
        if (d2 % ISa.a > NSa.B) {
            a2.J(tex);
            return;
        }
        a2.J(tex1);
    }

    public SkullPet() {
        SkullPet a2;
        SkullPet skullPet = a2;
        skullPet.textureWidth = ysa.s;
        skullPet.textureHeight = fPa.i;
        skullPet.J(fsa.Ka, uSa.E, uSa.E);
        skullPet.J(SOa.H, uSa.E, wOa.t);
        skullPet.J(oqa.P, Fsa.d, uSa.E);
        skullPet.J(ERa.O, uSa.E, wOa.t);
        skullPet.J(isa.n, Zqa.G, uSa.E);
        skullPet.J(cPa.ca, uSa.E, wOa.t);
        skullPet.J(Iqa.h, Zqa.G, uSa.E);
        skullPet.J(pqa.f, uSa.E, wOa.t);
        skullPet.J(wta.r, Tpa.z, AQa.P);
        skullPet.J(NOa.X, Fsa.d, uSa.E);
        skullPet.J(TQa.T, Fsa.d, yRa.d);
        skullPet.J(fPa.E, tua.U, uqa.g);
        skullPet.J(ppa.Y, Qsa.Ha, uqa.g);
        skullPet.J(vPa.y, CRa.L, uqa.g);
        skullPet.J(ATa.a, kra.U, yRa.d);
        skullPet.J(ZSa.d, tua.U, vRa.d);
        skullPet.J(vQa.f, cQa.i, yRa.d);
        SkullPet skullPet2 = a2;
        skullPet.Piece1 = new Js((ModelBase)a2, Usa.f);
        skullPet.Piece1.J(vQa.C, NQa.m, NQa.m, TOa.p, Yqa.i, Yqa.i, XTa.W);
        a2.Piece1.J(PTa.Ga, psa.N, eua.C, NQa.m, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(kua.j, NQa.m, NQa.m, NQa.m, Yqa.i, AQa.P, vRa.d);
        a2.Piece1.J(yQa.g, ySa.Da, eua.C, NQa.m, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(kpa.ca, NQa.m, JPa.N, NQa.m, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Xsa.B, qQa.f, eua.C, NQa.m, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Bra.f, vQa.q, JPa.N, NQa.m, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Fsa.ca, Wqa.V, eua.C, NQa.m, vRa.d, vRa.d, vRa.d);
        a2.Piece1.J(LQa.A, vqa.T, JPa.N, NQa.m, uqa.g, vRa.d, vRa.d);
        a2.Piece1.J(STa.w, TOa.p, YSa.G, NQa.m, uua.p, vRa.d, tTa.h);
        a2.Piece1.J(iPa.g, NQa.m, pqa.r, NQa.m, Yqa.i, vRa.d, vRa.d);
        a2.Piece1.J(asa.a, EQa.G, kta.v, EQa.G, uqa.g, uqa.g, uqa.g);
        a2.Piece1.J(Ata.q, NQa.m, kta.v, NQa.m, yRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Bua.X, MTa.y, kta.v, EQa.G, uqa.g, uqa.g, uqa.g);
        a2.Piece1.J(QTa.w, pqa.r, kta.v, NQa.m, yRa.d, vRa.d, vRa.d);
        a2.Piece1.J(nQa.R, NQa.m, vQa.q, NQa.m, Yqa.i, vRa.d, vRa.d);
        a2.Piece1.J(vua.L, vPa.b, kta.v, NQa.m, vRa.d, vRa.d, vRa.d);
        a2.J(tex);
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        SkullPet a2 = this;
        uKa.l((float)pPa.c, (float)pPa.c, (float)pPa.c);
        super.J(b2);
    }
}

