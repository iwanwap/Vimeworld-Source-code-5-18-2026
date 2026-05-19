/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  LQa
 *  Lra
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  SOa
 *  Spa
 *  XTa
 *  YSa
 *  Ypa
 *  bpa
 *  cQa
 *  dQa
 *  fpa
 *  hTa
 *  iPa
 *  kpa
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  xOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class ChipmunkPet
extends BasePet {
    private final Js Head;
    private final Js leftLegFront;
    private final Js leftLegBack;
    private final Js body1;
    private final Js body;
    private final Js rightLegFront;
    private final Js rightLegBack;
    private final Js tail;

    public ChipmunkPet() {
        ChipmunkPet a2;
        ChipmunkPet chipmunkPet = a2;
        chipmunkPet.textureWidth = ysa.s;
        chipmunkPet.textureHeight = fPa.i;
        chipmunkPet.disableAnimationInPreview = vRa.d;
        chipmunkPet.J(SOa.E, uSa.E, uSa.E);
        chipmunkPet.J(Bua.B, EPa.O, WOa.fa);
        chipmunkPet.J(KQa.o, yOa.B, pPa.f);
        chipmunkPet.J(fqa.Z, yOa.B, pPa.f);
        chipmunkPet.J(xOa.o, Lra.e, uSa.E);
        chipmunkPet.J(vRa.ja, wOa.t, uSa.E);
        chipmunkPet.J(fpa.V, EPa.O, pPa.f);
        chipmunkPet.J(ppa.b, wOa.t, AQa.P);
        chipmunkPet.J(lqa.V, yOa.B, XTa.W);
        ChipmunkPet chipmunkPet2 = a2;
        chipmunkPet.body = new Js((ModelBase)a2, uSa.E, XTa.W);
        chipmunkPet.body.J(JPa.N, JPa.N, JPa.N, AQa.P, yRa.d, tTa.h);
        ChipmunkPet chipmunkPet3 = a2;
        chipmunkPet3.body.J(dua.ca, JPa.N, dua.ca);
        a2.body1 = new Js((ModelBase)a2, uSa.E, Ypa.A);
        chipmunkPet3.body1.J(Ppa.Ha, vqa.T, pqa.r, tTa.h, AQa.P, yRa.d);
        ChipmunkPet chipmunkPet4 = a2;
        chipmunkPet4.tail = new Js((ModelBase)chipmunkPet4, ERa.C, Ypa.A);
        chipmunkPet4.tail.J(vqa.T, vqa.T, JPa.N, uqa.g, uqa.g, AQa.P);
        ChipmunkPet chipmunkPet5 = a2;
        chipmunkPet5.tail.J(JPa.N, pqa.r, Bpa.w);
        chipmunkPet5.J(chipmunkPet5.tail, hTa.v, JPa.N, JPa.N);
        chipmunkPet5.tail.J(vRa.d != 0);
        chipmunkPet5.rightLegFront = new Js((ModelBase)a2, cQa.o, XTa.W);
        chipmunkPet5.rightLegFront.J(vPa.b, JPa.N, vPa.b, vRa.d, vRa.d, vRa.d);
        ChipmunkPet chipmunkPet6 = a2;
        chipmunkPet6.rightLegFront.J(FRa.ca, vQa.q, FRa.ca);
        chipmunkPet6.rightLegFront.J(vRa.d != 0);
        a2.rightLegBack = new Js((ModelBase)a2, cQa.o, WOa.fa);
        chipmunkPet6.rightLegBack.J(vPa.b, JPa.N, vPa.b, vRa.d, vRa.d, vRa.d);
        ChipmunkPet chipmunkPet7 = a2;
        chipmunkPet7.rightLegBack.J(FRa.ca, vQa.q, MTa.y);
        chipmunkPet7.rightLegBack.J(vRa.d != 0);
        a2.leftLegFront = new Js((ModelBase)a2, cQa.o, pPa.f);
        chipmunkPet7.leftLegFront.J(vPa.b, JPa.N, vPa.b, vRa.d, vRa.d, vRa.d);
        ChipmunkPet chipmunkPet8 = a2;
        chipmunkPet8.leftLegFront.J(Ira.d, vQa.q, FRa.ca);
        chipmunkPet8.leftLegFront.J(vRa.d != 0);
        a2.leftLegBack = new Js((ModelBase)a2, cQa.o, uua.s);
        chipmunkPet8.leftLegBack.J(vPa.b, JPa.N, vPa.b, vRa.d, vRa.d, vRa.d);
        ChipmunkPet chipmunkPet9 = a2;
        chipmunkPet9.leftLegBack.J(Ira.d, vQa.q, MTa.y);
        chipmunkPet9.leftLegBack.J(vRa.d != 0);
        a2.Head = new Js((ModelBase)a2, Spa.fa);
        chipmunkPet9.Head.J(JPa.N, pqa.r, vqa.T);
        chipmunkPet9.Head.J(kua.j, dua.ca, NQa.m, TOa.p, AQa.P, yRa.d, AQa.P);
        a2.Head.J(vQa.C, FRa.ca, TOa.p, dua.ca, yRa.d, AQa.P, uqa.g);
        a2.Head.J(kpa.ca, dua.ca, CRa.M, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.Head.J(Bra.f, pqa.r, CRa.M, JPa.N, vRa.d, vRa.d, vRa.d);
        a2.Head.J(LQa.A, Xpa.R, Ppa.Ha, fpa.M, uqa.g, uqa.g, uqa.g);
        a2.Head.J(iPa.g, kpa.fa, Ppa.Ha, fpa.M, uqa.g, uqa.g, uqa.g);
        a2.Head.J(Ata.q, vqa.T, dua.ca, NQa.m, uqa.g, vRa.d, yRa.d);
        a2.Head.J(QTa.w, vqa.T, nua.ja, NTa.ha, uqa.g, vRa.d, uqa.g);
        a2.Head.J(vua.L, vPa.b, dQa.j, KQa.O, vRa.d, vRa.d, vRa.d);
        ChipmunkPet chipmunkPet10 = a2;
        chipmunkPet10.Head.J(vRa.d != 0);
        chipmunkPet10.J(new ResourceLocation(Cra.V, rSa.Q));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx, float f2) {
        void c2;
        float d2 = f2;
        ChipmunkPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        uKa.l((float)NPa.B, (float)NPa.B, (float)NPa.B);
        ChipmunkPet chipmunkPet = a2;
        chipmunkPet.Head.rotationY = c2.bipedHead.rotateAngleY + psa.N;
        chipmunkPet.Head.rotationX = c2.bipedHead.rotateAngleX / kta.v + psa.N;
        chipmunkPet.Head.rotationZ = c2.bipedHead.rotateAngleZ;
        chipmunkPet.leftLegFront.rotationX = f3;
        chipmunkPet.leftLegBack.rotationX = -f3;
        chipmunkPet.rightLegBack.rotationX = a2.leftLegFront.rotationX;
        chipmunkPet.rightLegFront.rotationX = a2.leftLegBack.rotationX;
        chipmunkPet.tail.rotationX = d2 * psa.N;
        chipmunkPet.tail.rotationY = f3;
        chipmunkPet.tail.rotationZ = f3 * kta.v;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        ChipmunkPet a2 = this;
        uKa.J((float)yta.n, (float)JPa.N, (float)JPa.N);
        uKa.l((float)ySa.Da, (float)ySa.Da, (float)ySa.Da);
        super.J(b2);
    }
}

