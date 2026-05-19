/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  MQa
 *  NQa
 *  Oz
 *  XTa
 *  YSa
 *  Ypa
 *  bpa
 *  kta
 *  lqa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  yra
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class KodamaPet
extends BasePet {
    private final Js Head;
    private final Js rightHand;
    private final Js body;
    private final Js leftLeg;
    private final Js leftHand;
    private final Js rightLeg;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        KodamaPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        KodamaPet kodamaPet = a2;
        kodamaPet.Head.rotationX = c2.bipedHead.rotateAngleX / eua.C + psa.N;
        kodamaPet.Head.rotationY = c2.bipedHead.rotateAngleY + psa.N - d2 * Nra.e;
        kodamaPet.Head.rotationZ = c2.bipedHead.rotateAngleZ - b2 * kta.v;
        kodamaPet.rightLeg.rotationX = f3 * MQa.L;
        kodamaPet.leftLeg.rotationX = a2.rightLeg.rotationX;
        kodamaPet.leftLeg.rotationZ = b2 * MQa.L;
        kodamaPet.leftHand.rotationX = d2 * Nra.e;
        kodamaPet.leftHand.rotationY = -d2 * b2;
        kodamaPet.leftHand.rotationZ = d2 * b2 * kta.v;
        kodamaPet.rightHand.rotationX = -a2.leftHand.rotationX;
        kodamaPet.rightHand.rotationY = -a2.leftHand.rotationY;
        kodamaPet.rightHand.rotationZ = a2.leftHand.rotationZ;
    }

    public KodamaPet() {
        KodamaPet a2;
        KodamaPet kodamaPet = a2;
        kodamaPet.disableAnimationInPreview = vRa.d;
        kodamaPet.textureWidth = ysa.s;
        kodamaPet.textureHeight = fPa.i;
        KodamaPet kodamaPet2 = a2;
        kodamaPet.body = new Js((ModelBase)a2, tua.U, uSa.E);
        kodamaPet.body.J(JPa.N, JPa.N, JPa.N, uua.p, XTa.W, AQa.P);
        KodamaPet kodamaPet3 = a2;
        kodamaPet3.rightLeg = new Js((ModelBase)kodamaPet3, uua.p, Ypa.A);
        kodamaPet3.rightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
        KodamaPet kodamaPet4 = a2;
        kodamaPet4.rightLeg.J(pqa.r, BRa.k, kta.v);
        kodamaPet4.rightLeg.J(vRa.d != 0);
        a2.leftLeg = new Js((ModelBase)a2, uua.p, Ypa.A);
        kodamaPet4.leftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
        KodamaPet kodamaPet5 = a2;
        kodamaPet5.leftLeg.J(eua.C, BRa.k, kta.v);
        kodamaPet5.leftLeg.J(vRa.d != 0);
        a2.rightHand = new Js((ModelBase)a2, uSa.E, Ypa.A);
        kodamaPet5.rightHand.J(vqa.T, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        KodamaPet kodamaPet6 = a2;
        kodamaPet6.rightHand.J(JPa.N, pqa.r, Ira.d);
        kodamaPet6.rightHand.J(vRa.d != 0);
        a2.leftHand = new Js((ModelBase)a2, uSa.E, Ypa.A);
        kodamaPet6.leftHand.J(JPa.N, JPa.N, vPa.b, vRa.d, AQa.P, vRa.d);
        KodamaPet kodamaPet7 = a2;
        kodamaPet7.leftHand.J(lqa.ga, pqa.r, Ira.d);
        kodamaPet7.leftHand.J(vRa.d != 0);
        a2.Head = new Js((ModelBase)a2, uSa.E, uSa.E);
        kodamaPet7.Head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, XTa.W, XTa.W);
        KodamaPet kodamaPet8 = a2;
        kodamaPet8.Head.J(vQa.q, pqa.r, kta.v);
        kodamaPet8.Head.J(vRa.d != 0);
        kodamaPet8.J(new ResourceLocation(Cra.V, yra.C));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        KodamaPet a2 = this;
        uKa.J((float)Qra.j, (float)ERa.i, (float)JPa.N);
        super.J(b2);
    }
}

