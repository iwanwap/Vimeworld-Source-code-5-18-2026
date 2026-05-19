/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cra
 *  JPa
 *  Js
 *  NQa
 *  Oz
 *  YSa
 *  bpa
 *  cQa
 *  kta
 *  pqa
 *  psa
 *  uKa
 *  uOa
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

public final class ZombiePet
extends BasePet {
    private final Js leftLeg;
    private final Js head;
    private final Js leftHand;
    private final Js rightHand;
    private final Js body;
    private final Js rightLeg;

    public ZombiePet() {
        ZombiePet a2;
        ZombiePet zombiePet = a2;
        zombiePet.disableAnimationInPreview = vRa.d;
        zombiePet.textureWidth = ysa.s;
        zombiePet.textureHeight = fPa.i;
        ZombiePet zombiePet2 = a2;
        zombiePet.body = new Js((ModelBase)a2, fPa.i, uSa.E);
        zombiePet.body.J(dua.ca, JPa.N, JPa.N, AQa.P, tTa.h, uqa.g);
        ZombiePet zombiePet3 = a2;
        zombiePet3.leftLeg = new Js((ModelBase)zombiePet3, Yqa.i, cQa.o);
        zombiePet3.leftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g);
        ZombiePet zombiePet4 = a2;
        zombiePet4.leftLeg.J(pqa.r, eua.C, pqa.r);
        zombiePet4.leftLeg.J(vRa.d != 0);
        a2.rightLeg = new Js((ModelBase)a2, uSa.E, cQa.o);
        zombiePet4.rightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g);
        ZombiePet zombiePet5 = a2;
        zombiePet5.rightLeg.J(vqa.T, eua.C, pqa.r);
        zombiePet5.rightLeg.J(vRa.d != 0);
        a2.head = new Js((ModelBase)a2, uSa.E, uSa.E);
        zombiePet5.head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        ZombiePet zombiePet6 = a2;
        zombiePet6.head.J(JPa.N, JPa.N, pqa.r);
        zombiePet6.head.J(vRa.d != 0);
        a2.leftHand = new Js((ModelBase)a2, Bpa.Ha, uSa.E);
        zombiePet6.leftHand.J(JPa.N, uOa.ba, uOa.ba, uqa.g, AQa.P, uqa.g);
        ZombiePet zombiePet7 = a2;
        zombiePet7.leftHand.J(kta.v, pqa.r, pqa.r);
        zombiePet7.J(zombiePet7.leftHand, zua.Y, JPa.N, JPa.N);
        zombiePet7.leftHand.J(vRa.d != 0);
        zombiePet7.rightHand = new Js((ModelBase)a2, Bpa.Ha, uSa.E);
        zombiePet7.rightHand.J(dua.ca, uOa.ba, uOa.ba, uqa.g, AQa.P, uqa.g);
        ZombiePet zombiePet8 = a2;
        zombiePet8.rightHand.J(dua.ca, pqa.r, pqa.r);
        zombiePet8.J(zombiePet8.rightHand, zua.Y, JPa.N, JPa.N);
        zombiePet8.rightHand.J(vRa.d != 0);
        zombiePet8.J(new ResourceLocation(Cra.V, Pua.a));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        ZombiePet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        ZombiePet zombiePet = a2;
        zombiePet.head.rotationY = c2.bipedHead.rotateAngleY + psa.N;
        zombiePet.head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        zombiePet.head.rotationZ = c2.bipedHead.rotateAngleZ;
        zombiePet.rightLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / MTa.y + f3 * vQa.q;
        zombiePet.leftLeg.rotationX = c2.bipedRightLeg.rotateAngleX / MTa.y + -f3 * vQa.q;
        zombiePet.leftLeg.rotationZ = b2 * eua.C;
        zombiePet.leftHand.rotationX = d2 * Nra.e;
        zombiePet.leftHand.rotationY = -d2 * b2 * kta.v;
        zombiePet.leftHand.rotationZ = d2 * b2 * YSa.G;
        zombiePet.rightHand.rotationX = -a2.leftHand.rotationX;
        zombiePet.rightHand.rotationY = -a2.leftHand.rotationY;
        zombiePet.rightHand.rotationZ = a2.leftHand.rotationZ;
    }
}

