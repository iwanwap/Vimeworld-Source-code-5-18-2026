/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  MQa
 *  NQa
 *  Oz
 *  QSa
 *  Qsa
 *  Sqa
 *  Ssa
 *  Usa
 *  YSa
 *  cQa
 *  cT
 *  iPa
 *  kta
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vRa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class MushroomPet
extends BasePet {
    private static Js body;
    private static Js RightLeg;
    private String color;
    private static final Map<String, ResourceLocation> colors;
    private static Js LeftHand;
    private static Js RightHand;
    private static Js LeftLeg;
    private static Js bone7;
    private static Js Head;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        MushroomPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.l((float)Xpa.R, (float)Xpa.R, (float)Xpa.R);
        uKa.J((float)Ssa.la, (float)(vPa.b + b2), (float)ZSa.q);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        MushroomPet.Head.rotationY = c2.bipedHead.rotateAngleY + psa.N;
        MushroomPet.Head.rotationX = c2.bipedHead.rotateAngleX * MQa.L;
        MushroomPet.Head.rotationZ = c2.bipedHead.rotateAngleZ;
        MushroomPet.RightLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / MTa.y + f3;
        MushroomPet.LeftLeg.rotationX = c2.bipedRightLeg.rotateAngleX / MTa.y + -f3;
        MushroomPet.LeftHand.rotationX = c2.bipedLeftArm.rotateAngleX * psa.N + d2 * Nra.e;
        MushroomPet.LeftHand.rotationY = -d2 * b2 * kta.v;
        MushroomPet.LeftHand.rotationZ = d2 * b2 * YSa.G;
        MushroomPet.RightHand.rotationX = -MushroomPet.LeftHand.rotationX;
        MushroomPet.RightHand.rotationY = -MushroomPet.LeftHand.rotationY;
        MushroomPet.RightHand.rotationZ = MushroomPet.LeftHand.rotationZ;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        MushroomPet a2 = this;
        uKa.l((float)Xpa.R, (float)Xpa.R, (float)Xpa.R);
        uKa.J((float)JPa.N, (float)Sqa.g, (float)JPa.N);
        super.J(b2);
    }

    public MushroomPet(String string) {
        MushroomPet a2;
        String b2 = string;
        MushroomPet mushroomPet = a2 = this;
        a2.disableAnimationInPreview = vRa.d;
        mushroomPet.textureWidth = XOa.h;
        mushroomPet.textureHeight = ysa.s;
        mushroomPet.color = b2;
        if (body == null) {
            body = new Js((ModelBase)a2);
            MushroomPet.body.cubeList.add(new AMa((cT)body, uSa.E, ERa.C, NQa.m, FRa.B, TOa.p, Yqa.i, Yqa.i, AQa.P, JPa.N, uSa.E != 0));
            RightLeg = new Js((ModelBase)a2);
            RightLeg.J(dua.ca, sOa.Z, vqa.T);
            a2.J(RightLeg, aua.T, JPa.N, JPa.N);
            MushroomPet.RightLeg.cubeList.add(new AMa((cT)RightLeg, fPa.i, QSa.p, dua.ca, JPa.N, dua.ca, AQa.P, Yqa.i, AQa.P, JPa.N, uSa.E != 0));
            RightLeg.J(vRa.d != 0);
            LeftLeg = new Js((ModelBase)a2);
            LeftLeg.J(kta.v, sOa.Z, vqa.T);
            a2.J(LeftLeg, vRa.f, JPa.N, JPa.N);
            MushroomPet.LeftLeg.cubeList.add(new AMa((cT)LeftLeg, QSa.p, QSa.p, dua.ca, JPa.N, dua.ca, AQa.P, Yqa.i, AQa.P, JPa.N, uSa.E != 0));
            LeftLeg.J(vRa.d != 0);
            LeftHand = new Js((ModelBase)a2);
            LeftHand.J(YSa.G, DPa.m, vqa.T);
            a2.J(LeftHand, aua.T, JPa.N, JPa.N);
            MushroomPet.LeftHand.cubeList.add(new AMa((cT)LeftHand, ERa.C, QSa.p, JPa.N, vqa.T, dua.ca, AQa.P, Yqa.i, AQa.P, JPa.N, uSa.E != 0));
            LeftHand.J(vRa.d != 0);
            RightHand = new Js((ModelBase)a2);
            RightHand.J(NQa.m, DPa.m, vqa.T);
            a2.J(RightHand, vRa.f, JPa.N, JPa.N);
            MushroomPet.RightHand.cubeList.add(new AMa((cT)RightHand, uSa.E, QSa.p, NQa.m, vqa.T, dua.ca, AQa.P, Yqa.i, AQa.P, JPa.N, uSa.E != 0));
            RightHand.J(vRa.d != 0);
            Head = new Js((ModelBase)a2);
            Head.J(JPa.N, FRa.B, vqa.T);
            MushroomPet.Head.cubeList.add(new AMa((cT)Head, uSa.E, uSa.E, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, JPa.N, uSa.E != 0));
            bone7 = new Js((ModelBase)a2);
            bone7.J(JPa.N, JPa.N, pqa.r);
            a2.J(bone7, Qsa.f, JPa.N, JPa.N);
            Head.J((cT)bone7);
            MushroomPet.bone7.cubeList.add(new AMa((cT)bone7, uSa.E, uSa.E, FRa.B, cQa.P, Eqa.x, fPa.i, ERa.C, fPa.i, JPa.N, uSa.E != 0));
            Head.J(vRa.d != 0);
        }
        a2.J(colors.get(b2));
    }

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(JPa.y, new ResourceLocation(Cra.V, MRa.n));
        colors.put(rQa.Y, new ResourceLocation(Cra.V, GPa.j));
        colors.put(Usa.s, new ResourceLocation(Cra.V, Eqa.g));
        colors.put(osa.q, new ResourceLocation(Cra.V, iPa.T));
    }
}

