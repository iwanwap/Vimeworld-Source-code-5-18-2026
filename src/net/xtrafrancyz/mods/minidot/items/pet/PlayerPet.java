/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  Js
 *  NQa
 *  Oz
 *  TPa
 *  YSa
 *  bpa
 *  isa
 *  kta
 *  pPa
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

public final class PlayerPet
extends BasePet {
    private static Js hair;
    private static Js leftHand;
    private boolean yt;
    private final String username;
    private static final Map<String, ResourceLocation> textures;
    private static Js leftLeg;
    private static Js body;
    private static Js rightLeg;
    private static Js rightHand;
    private static Js head;

    @Override
    public void J(float f2) {
        float b2 = f2;
        PlayerPet a2 = this;
        uKa.m();
        uKa.J((float)JPa.N, (float)Yqa.C, (float)JPa.N);
        super.J(b2);
        uKa.h();
    }

    public PlayerPet(String string) {
        String b2 = string;
        PlayerPet a2 = this;
        Object object = b2;
        a2((String)object, ((String)object).toLowerCase());
    }

    /*
     * WARNING - void declaration
     */
    public PlayerPet(String string, String string2) {
        void b2;
        PlayerPet a2;
        Object c2 = string2;
        PlayerPet playerPet = a2 = this;
        PlayerPet playerPet2 = a2;
        playerPet2.yt = uSa.E;
        playerPet.username = b2;
        playerPet2.textureWidth = ysa.s;
        playerPet.textureHeight = fPa.i;
        playerPet.disableAnimationInPreview = vRa.d;
        if (hair == null) {
            hair = new Js((ModelBase)a2, fPa.i, uSa.E);
            hair.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
            PlayerPet.hair.mirror = vRa.d;
            hair.J(vRa.d != 0);
            PlayerPet.hair.scaleX = isa.W;
            PlayerPet.hair.scaleY = TPa.z;
            PlayerPet.hair.scaleZ = isa.W;
            hair.J(JPa.N, bpa.K, JPa.N);
            head = new Js((ModelBase)a2, uSa.E, uSa.E);
            head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i);
            PlayerPet.head.mirror = vRa.d;
            head.J(vRa.d != 0);
            body = new Js((ModelBase)a2, uSa.E, yta.Ka);
            body.J(dua.ca, JPa.N, vqa.T, AQa.P, AQa.P, uqa.g);
            PlayerPet.body.mirror = vRa.d;
            leftHand = new Js((ModelBase)a2, WOa.fa, osa.c);
            leftHand.J(JPa.N, vPa.b, vqa.T, uqa.g, AQa.P, uqa.g);
            leftHand.J(kta.v, pqa.r, JPa.N);
            PlayerPet.leftHand.mirror = vRa.d;
            leftHand.J(vRa.d != 0);
            rightHand = new Js((ModelBase)a2, uSa.E, osa.c);
            rightHand.J(dua.ca, vPa.b, vqa.T, uqa.g, AQa.P, uqa.g);
            rightHand.J(dua.ca, pqa.r, JPa.N);
            PlayerPet.rightHand.mirror = vRa.d;
            rightHand.J(vRa.d != 0);
            leftLeg = new Js((ModelBase)a2, yOa.B, yta.Ka);
            leftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
            leftLeg.J(pqa.r, YSa.G, JPa.N);
            PlayerPet.leftLeg.mirror = vRa.d;
            leftLeg.J(vRa.d != 0);
            rightLeg = new Js((ModelBase)a2, EPa.O, yta.Ka);
            rightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g);
            rightLeg.J(vqa.T, YSa.G, JPa.N);
            PlayerPet.rightLeg.mirror = vRa.d;
            rightLeg.J(vRa.d != 0);
        }
        if (textures.containsKey(b2.toLowerCase())) {
            a2.J(textures.get(b2.toLowerCase()));
            return;
        }
        c2 = new ResourceLocation(Cra.V, new StringBuilder().insert(2 & 5, osa.K).append((String)c2).append(KPa.C).toString());
        textures.put(b2.toLowerCase(), (ResourceLocation)c2);
        a2.J((ResourceLocation)c2);
    }

    public PlayerPet J() {
        PlayerPet a2;
        a2.yt = vRa.d;
        return a2;
    }

    static {
        textures = new HashMap<String, ResourceLocation>();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx, float f2) {
        void c2;
        float d2 = f2;
        PlayerPet a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        PlayerPet.head.rotationX = c2.bipedHead.rotateAngleX / kta.v;
        PlayerPet.head.rotationY = c2.bipedHead.rotateAngleY + psa.N - d2 * Nra.e;
        PlayerPet.head.rotationZ = c2.bipedHead.rotateAngleZ;
        Js js2 = hair;
        js2.rotationX = PlayerPet.head.rotationX;
        js2.rotationY = PlayerPet.head.rotationY;
        js2.rotationZ = PlayerPet.head.rotationZ;
        PlayerPet.rightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v + f3;
        PlayerPet.rightLeg.rotationY = b2 * kta.v;
        PlayerPet.leftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v - f3;
        PlayerPet.leftLeg.rotationZ = b2 * kta.v;
        PlayerPet.leftHand.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * Nra.e;
        PlayerPet.leftHand.rotationY = -d2 * b2 * kta.v;
        PlayerPet.leftHand.rotationZ = d2 * b2 * YSa.G;
        PlayerPet.rightHand.rotationX = -PlayerPet.leftHand.rotationX;
        PlayerPet.rightHand.rotationY = -PlayerPet.leftHand.rotationY;
        PlayerPet.rightHand.rotationZ = PlayerPet.leftHand.rotationZ;
    }
}

