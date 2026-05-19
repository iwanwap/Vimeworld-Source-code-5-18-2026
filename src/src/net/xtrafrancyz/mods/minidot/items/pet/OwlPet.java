/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Cra
 *  EQa
 *  ERa
 *  Fpa
 *  JPa
 *  JQa
 *  Js
 *  LQa
 *  MQa
 *  NQa
 *  Oz
 *  PTa
 *  Ppa
 *  QSa
 *  Rua
 *  SRa
 *  Spa
 *  TPa
 *  Vua
 *  XTa
 *  Xsa
 *  YSa
 *  Zua
 *  aQa
 *  asa
 *  bpa
 *  cQa
 *  cRa
 *  cra
 *  iPa
 *  kta
 *  lPa
 *  lqa
 *  nQa
 *  pPa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  xOa
 *  yQa
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class OwlPet
extends BasePet {
    private final Js Head;
    private final Js Tail;
    private final Js LeftHand;
    private final Js Body;
    private final Js RightHand;
    private static final ResourceLocation tex1;
    private final Js RightLeg;
    private static final ResourceLocation tex;
    private final Js LeftLeg;

    public OwlPet() {
        OwlPet a2;
        OwlPet owlPet = a2;
        owlPet.textureWidth = ysa.s;
        owlPet.textureHeight = fPa.i;
        owlPet.disableAnimationInPreview = vRa.d;
        owlPet.J(ZSa.Z, lQa.R, WOa.fa);
        owlPet.J(vua.ja, lPa.p, WOa.fa);
        owlPet.J(GPa.P, lPa.p, WOa.fa);
        owlPet.J(uqa.W, lPa.p, WOa.fa);
        owlPet.J(EQa.m, uSa.E, uSa.E);
        owlPet.J(lQa.Ha, kTa.g, uSa.E);
        owlPet.J(QTa.k, uSa.E, uSa.E);
        owlPet.J(sqa.n, uSa.E, uSa.E);
        owlPet.J(fqa.Z, kTa.g, ERa.C);
        owlPet.J(LPa.P, lPa.p, WOa.fa);
        owlPet.J(NSa.h, QSa.p, uSa.E);
        owlPet.J(NQa.x, lPa.p, WOa.fa);
        owlPet.J(Hra.A, Bpa.Ha, uSa.E);
        owlPet.J(hpa.I, QSa.p, uSa.E);
        owlPet.J(xOa.o, uSa.E, uSa.E);
        owlPet.J(STa.j, QSa.p, uSa.E);
        owlPet.J(Rua.Ga, Bpa.Ha, uSa.E);
        owlPet.J(vRa.ja, uSa.E, uSa.E);
        owlPet.J(lPa.I, QSa.p, uSa.E);
        owlPet.J(ppa.b, QSa.p, uSa.E);
        owlPet.J(lqa.V, QSa.p, uSa.E);
        owlPet.J(qQa.G, QSa.p, uSa.E);
        owlPet.J(fta.u, Bpa.Ha, uSa.E);
        owlPet.J(lqa.k, QSa.p, uSa.E);
        owlPet.J(zOa.Ia, Bpa.Ha, uSa.E);
        owlPet.J(QTa.Ja, QSa.p, uSa.E);
        OwlPet owlPet2 = a2;
        owlPet.Body = new Js((ModelBase)a2, uSa.E, cQa.o);
        owlPet.Body.J(Ura.T, JPa.N, Ppa.Ha, XTa.W, AQa.P, tTa.h);
        OwlPet owlPet3 = a2;
        a2.LeftLeg = new Js((ModelBase)a2, cTa.ja);
        owlPet3.LeftLeg.J(kta.v, YSa.G, JPa.N);
        owlPet3.LeftLeg.J(ROa.G, vPa.b, JPa.N, vPa.b, vRa.d, yRa.d, vRa.d);
        a2.LeftLeg.J(cRa.s, vPa.b, kta.v, FRa.ca, vRa.d, vRa.d, vRa.d);
        OwlPet owlPet4 = a2;
        owlPet4.LeftLeg.J(vRa.d != 0);
        a2.RightLeg = new Js((ModelBase)a2, zsa.K);
        owlPet4.RightLeg.J(dua.ca, YSa.G, JPa.N);
        owlPet4.RightLeg.J(Zua.O, vPa.b, JPa.N, vPa.b, vRa.d, yRa.d, vRa.d);
        a2.RightLeg.J(oua.u, vPa.b, kta.v, FRa.ca, vRa.d, vRa.d, vRa.d);
        OwlPet owlPet5 = a2;
        owlPet5.RightLeg.J(vRa.d != 0);
        a2.LeftHand = new Js((ModelBase)a2, gQa.Ia);
        owlPet5.LeftHand.J(vQa.q, kta.v, JPa.N);
        owlPet5.LeftHand.J(aQa.b, MQa.L, JPa.N, vqa.T, vRa.d, yRa.d, uqa.g);
        OwlPet owlPet6 = a2;
        a2.RightHand = new Js((ModelBase)a2, sra.e);
        owlPet6.RightHand.J(Ura.T, kta.v, JPa.N);
        owlPet6.RightHand.J(Ata.q, EQa.G, dua.ca, Ura.T, yRa.d, AQa.P, yRa.d);
        a2.RightHand.J(kua.j, Ppa.Ha, vqa.T, vPa.b, yRa.d, uqa.g, vRa.d);
        OwlPet owlPet7 = a2;
        a2.Tail = new Js((ModelBase)a2, Vua.S);
        owlPet7.Tail.J(JPa.N, kta.v, MTa.y);
        owlPet7.Tail.J(vQa.C, FRa.ca, JPa.N, JPa.N, yRa.d, AQa.P, vRa.d);
        OwlPet owlPet8 = a2;
        owlPet8.Head = new Js((ModelBase)owlPet8, Spa.fa);
        owlPet8.Head.J(Bra.f, KSa.Y, sOa.Z, Ura.T, pPa.f, Yqa.i, XTa.W);
        a2.Head.J(TPa.J, vPa.b, TOa.p, KSa.Y, vRa.d, vRa.d, vRa.d);
        a2.Head.J(eua.M, vPa.b, NQa.m, EQa.G, vRa.d, vRa.d, vRa.d);
        a2.Head.J(LQa.p, vPa.b, TOa.p, EQa.G, vRa.d, uqa.g, vRa.d);
        a2.Head.J(opa.Da, MQa.L, dua.ca, EQa.G, tTa.h, vRa.d, vRa.d);
        a2.Head.J(oua.R, Jta.r, CRa.M, EQa.G, vRa.d, yRa.d, vRa.d);
        a2.Head.J(LQa.A, Ura.T, Cra.fa, vPa.b, vRa.d, uqa.g, uqa.g);
        a2.Head.J(PTa.Ga, MQa.L, CRa.M, EQa.G, vRa.d, yRa.d, vRa.d);
        a2.Head.J(yQa.g, MQa.L, NSa.b, EQa.G, tTa.h, vRa.d, vRa.d);
        a2.Head.J(iPa.g, MTa.y, Cra.fa, vPa.b, vRa.d, uqa.g, uqa.g);
        a2.Head.J(Xsa.B, FRa.ca, CRa.M, EQa.G, vRa.d, yRa.d, vRa.d);
        a2.Head.J(QTa.w, BPa.I, CRa.M, FRa.ca, vRa.d, uqa.g, vRa.d);
        a2.Head.J(vua.L, SRa.V, CRa.M, FRa.ca, vRa.d, uqa.g, vRa.d);
        a2.Head.J(Fsa.ca, KSa.Y, CRa.M, EQa.G, vRa.d, yRa.d, vRa.d);
        a2.Head.J(STa.w, KSa.Y, dua.ca, EQa.G, tTa.h, vRa.d, vRa.d);
        a2.Head.J(nQa.R, BPa.I, CRa.M, EQa.G, vRa.d, vRa.d, yRa.d);
        a2.Head.J(asa.a, KSa.Y, NSa.b, EQa.G, tTa.h, vRa.d, vRa.d);
        a2.Head.J(Bua.X, SRa.V, CRa.M, EQa.G, vRa.d, vRa.d, yRa.d);
        OwlPet owlPet9 = a2;
        owlPet9.Head.J(vRa.d != 0);
        owlPet9.J(tex);
    }

    static {
        tex = new ResourceLocation(Cra.V, Fpa.O);
        tex1 = new ResourceLocation(Cra.V, lTa.x);
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        OwlPet a2 = this;
        uKa.J((float)JPa.N, (float)cra.S, (float)JPa.N);
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        OwlPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(f3 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        OwlPet owlPet = a2;
        owlPet.RightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / YSa.G + f3 * Nra.e;
        owlPet.LeftLeg.rotationX = -a2.RightLeg.rotationX;
        a2.Head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        owlPet.Head.rotationY = c2.bipedHead.rotateAngleY;
        owlPet.Head.rotationZ = c2.bipedHead.rotateAngleZ;
        if (d2 % JQa.q > SPa.b) {
            a2.J(tex);
            return;
        }
        if (d2 % eta.e > eua.C) {
            a2.J(tex1);
            return;
        }
        a2.J(tex);
    }
}

