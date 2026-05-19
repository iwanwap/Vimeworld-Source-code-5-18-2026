/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  EQa
 *  JPa
 *  Js
 *  NQa
 *  Oz
 *  Sqa
 *  TPa
 *  XTa
 *  YSa
 *  bSa
 *  fpa
 *  kta
 *  lqa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class BimoPet
extends BasePet {
    private final Js rightHand;
    private final Js rightLeg;
    private final Js body;
    private final Js leftHand;
    private final Js leftLeg;

    public BimoPet() {
        BimoPet a2;
        BimoPet bimoPet = a2;
        bimoPet.textureWidth = ysa.s;
        bimoPet.textureHeight = fPa.i;
        bimoPet.disableAnimationInPreview = vRa.d;
        bimoPet.J(KPa.j, uSa.E, uSa.E);
        bimoPet.J(rRa.s, uSa.E, uSa.E);
        bimoPet.J(fpa.O, uSa.E, uSa.E);
        bimoPet.J(dsa.D, uSa.E, uSa.E);
        BimoPet bimoPet2 = a2;
        bimoPet.body = new Js((ModelBase)a2, uSa.E, uSa.E);
        bimoPet.body.J(JPa.N, JPa.N, JPa.N, WOa.fa, uua.s, XTa.W);
        BimoPet bimoPet3 = a2;
        bimoPet3.body.J(EQa.G, JPa.N, NQa.m);
        a2.leftHand = new Js((ModelBase)a2, uSa.E, uSa.E);
        bimoPet3.leftHand.J(JPa.N, vPa.b, vPa.b, vRa.d, tTa.h, vRa.d);
        BimoPet bimoPet4 = a2;
        bimoPet4.leftHand.J(Jta.r, MTa.i, vPa.b);
        bimoPet4.leftHand.J(vRa.d != 0);
        a2.rightHand = new Js((ModelBase)a2, uSa.E, uSa.E);
        bimoPet4.rightHand.J(vqa.T, vPa.b, vPa.b, vRa.d, tTa.h, vRa.d);
        BimoPet bimoPet5 = a2;
        bimoPet5.rightHand.J(EQa.G, MTa.i, vPa.b);
        bimoPet5.rightHand.J(vRa.d != 0);
        a2.rightLeg = new Js((ModelBase)a2, fta.X);
        bimoPet5.rightLeg.J(dua.ca, bSa.J, vPa.b);
        bimoPet5.rightLeg.J(fta.X, vPa.b, JPa.N, vPa.b, vRa.d, yRa.d, vRa.d);
        a2.rightLeg.J(Fua.h, vPa.b, kta.v, FRa.ca, vRa.d, vRa.d, vRa.d);
        BimoPet bimoPet6 = a2;
        bimoPet6.rightLeg.J(vRa.d != 0);
        a2.leftLeg = new Js((ModelBase)a2, TPa.Ka);
        bimoPet6.leftLeg.J(kta.v, bSa.J, vPa.b);
        bimoPet6.leftLeg.J(TPa.Ka, vPa.b, JPa.N, vPa.b, vRa.d, yRa.d, vRa.d);
        a2.leftLeg.J(xSa.N, vPa.b, kta.v, FRa.ca, vRa.d, vRa.d, vRa.d);
        BimoPet bimoPet7 = a2;
        bimoPet7.leftLeg.J(vRa.d != 0);
        bimoPet7.J(new ResourceLocation(Cra.V, Sqa.s));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void a2;
        ModelBase d22 = modelPlayer;
        BimoPet c2 = this;
        float d22 = Oz.d((float)(a2 * TOa.r)) * WRa.e;
        float b2 = Oz.d((float)(a2 * Jta.w)) * Yqa.C;
        float f3 = Oz.C((float)(a2 * TOa.r));
        float f4 = JPa.N;
        if (a2 % UOa.d > SPa.b) {
            f4 = Oz.C((float)(a2 % UOa.d * VPa.i + Xpa.R)) * kta.v;
        }
        uKa.J((float)Ora.D, (float)(eua.l + d22), (float)Xpa.R);
        uKa.J((float)(f3 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        BimoPet bimoPet = c2;
        bimoPet.rightLeg.rotationX = b2 * vQa.q;
        bimoPet.rightLeg.rotationY = d22 * lqa.ga;
        bimoPet.leftLeg.rotationX = -b2 * vQa.q;
        bimoPet.leftLeg.rotationZ = d22 * eua.C;
        bimoPet.leftHand.rotationX = f3 * Nra.e;
        bimoPet.leftHand.rotationY = -f3 * d22 * kta.v;
        bimoPet.leftHand.rotationZ = f3 * d22 * YSa.G + f4;
        bimoPet.rightHand.rotationX = -c2.leftHand.rotationX;
        bimoPet.rightHand.rotationY = -c2.leftHand.rotationY;
        bimoPet.rightHand.rotationZ = f3 * d22 * YSa.G - f4;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        BimoPet a2 = this;
        uKa.J((float)JPa.N, (float)dua.s, (float)JPa.N);
        super.J(b2);
    }
}

