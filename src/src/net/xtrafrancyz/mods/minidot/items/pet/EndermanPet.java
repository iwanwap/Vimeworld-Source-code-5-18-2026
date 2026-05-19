/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  Js
 *  LQa
 *  MQa
 *  NQa
 *  Oz
 *  QSa
 *  Qsa
 *  YSa
 *  aPa
 *  bpa
 *  cQa
 *  kta
 *  pqa
 *  psa
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

public final class EndermanPet
extends BasePet {
    private final Js leftHand;
    private final Js rightLeg;
    private final Js rightHand;
    private final Js cube;
    private final Js head;
    private final Js body;
    private final Js leftLeg;

    public EndermanPet() {
        EndermanPet a2;
        EndermanPet endermanPet = a2;
        endermanPet.disableAnimationInPreview = vRa.d;
        endermanPet.textureWidth = ysa.s;
        endermanPet.textureHeight = fPa.i;
        endermanPet.useDisplayLists = vRa.d;
        EndermanPet endermanPet2 = a2;
        endermanPet.body = new Js((ModelBase)a2, fPa.i, uqa.g);
        endermanPet.body.J(JPa.N, JPa.N, JPa.N, yRa.d, AQa.P, vRa.d);
        EndermanPet endermanPet3 = a2;
        endermanPet3.leftLeg = new Js((ModelBase)endermanPet3, fPa.i, uSa.E);
        endermanPet3.leftLeg.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        EndermanPet endermanPet4 = a2;
        endermanPet4.leftLeg.J(MTa.y, YSa.G, MQa.L);
        endermanPet4.leftLeg.J(vRa.d != 0);
        a2.rightLeg = new Js((ModelBase)a2, fPa.i, uSa.E);
        endermanPet4.rightLeg.J(vPa.b, JPa.N, vPa.b, vRa.d, uua.p, vRa.d);
        EndermanPet endermanPet5 = a2;
        endermanPet5.rightLeg.J(MQa.L, YSa.G, MQa.L);
        endermanPet5.rightLeg.J(vRa.d != 0);
        a2.head = new Js((ModelBase)a2, uSa.E, uSa.E);
        endermanPet5.head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        EndermanPet endermanPet6 = a2;
        endermanPet6.head.J(Ira.d, JPa.N, MQa.L);
        endermanPet6.head.J(vRa.d != 0);
        a2.cube = new Js((ModelBase)a2, QSa.p, uSa.E);
        endermanPet6.cube.J(JPa.N, JPa.N, JPa.N, yRa.d, yRa.d, yRa.d);
        EndermanPet endermanPet7 = a2;
        endermanPet7.cube.J(JPa.N, kta.v, CRa.M);
        a2.rightHand = new Js((ModelBase)a2, cQa.i, uSa.E);
        endermanPet7.rightHand.J(JPa.N, JPa.N, JPa.N, vRa.d, tTa.h, vRa.d);
        EndermanPet endermanPet8 = a2;
        endermanPet8.rightHand.J(vqa.T, JPa.N, bpa.K);
        endermanPet8.J(endermanPet8.rightHand, LQa.i, JPa.N, JPa.N);
        endermanPet8.leftHand = new Js((ModelBase)a2, cQa.i, uSa.E);
        endermanPet8.leftHand.J(JPa.N, JPa.N, JPa.N, vRa.d, tTa.h, vRa.d);
        EndermanPet endermanPet9 = a2;
        endermanPet9.leftHand.J(vQa.q, JPa.N, bpa.K);
        endermanPet9.J(endermanPet9.leftHand, LQa.i, JPa.N, JPa.N);
        endermanPet9.J(new ResourceLocation(Cra.V, aPa.Aa));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        EndermanPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * kTa.J;
        float f3 = Oz.d((float)(d2 * Jta.w)) * dqa.B;
        d2 = Oz.C((float)(d2 * Jta.w)) * dqa.B;
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(b2 * Qsa.U), (float)pqa.r, (float)Ora.D, (float)JPa.N);
        EndermanPet endermanPet = a2;
        endermanPet.head.rotationY = d2 + c2.bipedHead.rotateAngleY + psa.N;
        endermanPet.head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        endermanPet.head.rotationZ = c2.bipedHead.rotateAngleZ;
        endermanPet.rightLeg.rotationX = f3 * xSa.la;
        endermanPet.rightLeg.rotationZ = f3 * xSa.la;
        endermanPet.leftLeg.rotationX = -f3 * xSa.la;
    }
}

