/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  LQa
 *  Lqa
 *  NQa
 *  Oz
 *  PTa
 *  Qsa
 *  TQa
 *  Usa
 *  Vua
 *  XTa
 *  Xsa
 *  YSa
 *  cra
 *  fpa
 *  fsa
 *  iPa
 *  isa
 *  kpa
 *  kta
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vQa
 *  vRa
 *  yQa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class CloudPet
extends BasePet {
    private final Js Piece3;
    private final Js Piece2;
    private final Js Piece1;

    public CloudPet() {
        CloudPet a2;
        CloudPet cloudPet = a2;
        cloudPet.textureWidth = fPa.i;
        cloudPet.textureHeight = ERa.C;
        cloudPet.J(Zqa.u, tTa.h, WOa.fa);
        cloudPet.J(rSa.ha, uSa.E, WOa.fa);
        cloudPet.J(vQa.a, tTa.h, WOa.fa);
        cloudPet.J(KQa.B, tTa.h, WOa.fa);
        cloudPet.J(Vua.T, uSa.E, WOa.fa);
        cloudPet.J(Zqa.e, tTa.h, WOa.fa);
        cloudPet.J(fsa.Ka, uSa.E, uSa.E);
        cloudPet.J(oqa.P, tTa.h, WOa.fa);
        cloudPet.J(isa.n, tTa.h, WOa.fa);
        cloudPet.J(Iqa.h, tTa.h, WOa.fa);
        cloudPet.J(wta.r, tTa.h, WOa.fa);
        cloudPet.J(TQa.T, tTa.h, WOa.fa);
        cloudPet.J(ppa.Y, tTa.h, WOa.fa);
        cloudPet.J(ATa.a, tTa.h, WOa.fa);
        cloudPet.J(vQa.f, tTa.h, WOa.fa);
        CloudPet cloudPet2 = a2;
        cloudPet.Piece2 = new Js((ModelBase)a2, Mqa.n);
        cloudPet.Piece2.J(yQa.g, sOa.Z, Qsa.k, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.Piece2.J(PTa.Ga, Lqa.C, BRa.k, JPa.N, vRa.d, yRa.d, vRa.d);
        a2.Piece2.J(oua.R, Cra.fa, Qsa.k, JPa.N, vRa.d, vRa.d, vRa.d);
        CloudPet cloudPet3 = a2;
        cloudPet3.Piece3 = new Js((ModelBase)cloudPet3, dqa.e);
        cloudPet3.Piece3.J(STa.w, NSa.b, eua.C, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.Piece3.J(Fsa.ca, CRa.M, YSa.G, JPa.N, vRa.d, yRa.d, vRa.d);
        a2.Piece3.J(Xsa.B, NQa.m, eua.C, JPa.N, vRa.d, vRa.d, vRa.d);
        CloudPet cloudPet4 = a2;
        cloudPet4.Piece1 = new Js((ModelBase)cloudPet4, Usa.f);
        cloudPet4.Piece1.J(vQa.C, NSa.b, NQa.m, JPa.N, pPa.f, XTa.W, vRa.d);
        a2.Piece1.J(kua.j, CRa.M, CRa.M, JPa.N, yRa.d, vRa.d, vRa.d);
        a2.Piece1.J(kpa.ca, kta.v, CRa.M, JPa.N, yRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Bra.f, eua.C, NQa.m, JPa.N, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(LQa.A, eua.C, JPa.N, JPa.N, vRa.d, uqa.g, vRa.d);
        a2.Piece1.J(iPa.g, pqa.r, vQa.q, JPa.N, yRa.d, vRa.d, vRa.d);
        a2.Piece1.J(Ata.q, TOa.p, vQa.q, JPa.N, uqa.g, vRa.d, vRa.d);
        a2.Piece1.J(QTa.w, NQa.d, vqa.T, JPa.N, vRa.d, yRa.d, vRa.d);
        a2.Piece1.J(vua.L, NQa.d, TOa.p, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.J(new ResourceLocation(Cra.V, fpa.X));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void a2;
        ModelBase d22 = modelPlayer;
        CloudPet c2 = this;
        float d22 = Oz.d((float)(a2 * TOa.r)) * WRa.e;
        float b2 = Oz.d((float)(a2 * Nra.e)) * Yqa.C;
        uKa.l((float)Jsa.Z, (float)Jsa.Z, (float)kta.v);
        uKa.J((float)pta.d, (float)(eua.l + d22), (float)JPa.N);
        CloudPet cloudPet = c2;
        cloudPet.Piece3.offsetY = Ira.d;
        cloudPet.Piece3.offsetY = -d22 / YSa.G;
        cloudPet.Piece2.offsetY = -b2 / kta.v;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, int n2) {
        void b2;
        int c2 = n2;
        CloudPet a2 = this;
        uKa.J((float)(Hra.Ga + Oz.d((float)(b2 * cra.S + (float)c2)) * eta.e), (float)JPa.N, (float)psa.N, (float)JPa.N);
        uKa.l((float)pqa.r, (float)pqa.r, (float)Ira.d);
        uKa.J((float)JPa.N, (float)Qra.j, (float)JPa.N);
    }
}

