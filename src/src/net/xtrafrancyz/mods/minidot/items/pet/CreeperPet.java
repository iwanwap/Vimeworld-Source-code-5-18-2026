/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  ISa
 *  JPa
 *  Js
 *  NQa
 *  Oz
 *  YSa
 *  bpa
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

public final class CreeperPet
extends BasePet {
    private final Js rightLegF;
    private final Js leftLegB;
    private final Js head;
    private final Js leftLegF;
    private final Js rightLegB;
    private final Js body;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        CreeperPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)d2);
        float f4 = Oz.d((float)(d2 + ISa.a));
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        CreeperPet creeperPet = a2;
        creeperPet.head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        creeperPet.head.rotationY = c2.bipedHead.rotateAngleY + psa.N - d2 * Nra.e;
        creeperPet.head.rotationZ = c2.bipedHead.rotateAngleZ;
        creeperPet.leftLegF.rotationX = c2.bipedLeftLeg.rotateAngleX + f3 / vQa.q;
        creeperPet.leftLegB.rotationX = c2.bipedRightLeg.rotateAngleX + f4 / vQa.q;
        creeperPet.rightLegB.rotationX = c2.bipedLeftLeg.rotateAngleX + f3 / vQa.q;
        creeperPet.rightLegF.rotationX = c2.bipedRightLeg.rotateAngleX + f4 / vQa.q;
    }

    public CreeperPet() {
        CreeperPet a2;
        CreeperPet creeperPet = a2;
        creeperPet.disableAnimationInPreview = vRa.d;
        creeperPet.textureWidth = ysa.s;
        creeperPet.textureHeight = fPa.i;
        CreeperPet creeperPet2 = a2;
        creeperPet.head = new Js((ModelBase)a2, uSa.E, uSa.E);
        creeperPet.head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        CreeperPet creeperPet3 = a2;
        creeperPet3.head.J(JPa.N, JPa.N, pqa.r);
        creeperPet3.head.J(vRa.d != 0);
        a2.body = new Js((ModelBase)a2, fPa.i, uSa.E);
        creeperPet3.body.J(JPa.N, JPa.N, JPa.N, AQa.P, AQa.P, uqa.g);
        CreeperPet creeperPet4 = a2;
        creeperPet4.body.J(dua.ca, JPa.N, JPa.N);
        a2.rightLegF = new Js((ModelBase)a2, uSa.E, ERa.C);
        creeperPet4.rightLegF.J(vqa.T, JPa.N, dua.ca, uqa.g, uqa.g, uqa.g);
        CreeperPet creeperPet5 = a2;
        creeperPet5.rightLegF.J(vqa.T, YSa.G, JPa.N);
        creeperPet5.rightLegF.J(vRa.d != 0);
        a2.rightLegB = new Js((ModelBase)a2, uSa.E, kTa.j);
        creeperPet5.rightLegB.J(vqa.T, JPa.N, vqa.T, uqa.g, uqa.g, uqa.g);
        CreeperPet creeperPet6 = a2;
        creeperPet6.rightLegB.J(vqa.T, YSa.G, kta.v);
        creeperPet6.rightLegB.J(vRa.d != 0);
        a2.leftLegF = new Js((ModelBase)a2, uSa.E, osa.c);
        creeperPet6.leftLegF.J(vqa.T, JPa.N, vqa.T, uqa.g, uqa.g, uqa.g);
        CreeperPet creeperPet7 = a2;
        creeperPet7.leftLegF.J(pqa.r, YSa.G, JPa.N);
        creeperPet7.leftLegF.J(vRa.d != 0);
        a2.leftLegB = new Js((ModelBase)a2, uSa.E, EPa.O);
        creeperPet7.leftLegB.J(vqa.T, JPa.N, JPa.N, uqa.g, uqa.g, uqa.g);
        CreeperPet creeperPet8 = a2;
        creeperPet8.leftLegB.J(pqa.r, YSa.G, kta.v);
        creeperPet8.leftLegB.J(vRa.d != 0);
        creeperPet8.J(new ResourceLocation(Cra.V, WPa.Ia));
    }
}

