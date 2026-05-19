/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  ISa
 *  JPa
 *  Js
 *  LQa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  RQa
 *  XTa
 *  YSa
 *  Yra
 *  Zta
 *  bpa
 *  dQa
 *  kta
 *  lqa
 *  oqa
 *  pPa
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

public final class VivillonPet
extends BasePet {
    private final Js rightWing;
    private final Js rightHand;
    private final Js head;
    private final Js leftLeg;
    private final Js body;
    private final Js leftStick;
    private final Js rightLeg;
    private final Js rightStick;
    private final Js leftWing;
    private final Js leftHand;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        jU e2;
        void b2;
        void c2;
        void d2;
        VivillonPet vivillonPet = jU3;
        jU jU3 = jU2;
        VivillonPet a2 = vivillonPet;
        uKa.h();
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, e2);
        uKa.m();
    }

    public VivillonPet() {
        VivillonPet a2;
        VivillonPet vivillonPet = a2;
        vivillonPet.textureWidth = ysa.s;
        vivillonPet.textureHeight = ysa.s;
        vivillonPet.J(mSa.Y, uSa.E, uSa.E);
        vivillonPet.J(Zta.H, NTa.C, tua.U);
        vivillonPet.J(iSa.j, uSa.E, uSa.E);
        vivillonPet.J(WPa.X, NTa.C, tua.U);
        VivillonPet vivillonPet2 = a2;
        vivillonPet.body = new Js((ModelBase)a2, uSa.E, ERa.C);
        vivillonPet.body.J(TOa.p, JPa.N, dua.ca, uua.p, WOa.fa, tTa.h);
        VivillonPet vivillonPet3 = a2;
        vivillonPet3.leftLeg = new Js((ModelBase)vivillonPet3, uSa.E, tua.U);
        vivillonPet3.leftLeg.J(uOa.ba, vPa.b, vqa.T, uqa.g, tTa.h, uqa.g);
        VivillonPet vivillonPet4 = a2;
        vivillonPet4.leftLeg.J(kta.v, Qsa.k, vqa.T);
        vivillonPet4.J(vivillonPet4.leftLeg, dQa.X, JPa.N, JPa.N);
        vivillonPet4.leftLeg.J(vRa.d != 0);
        vivillonPet4.rightLeg = new Js((ModelBase)a2, uSa.E, tua.U);
        vivillonPet4.rightLeg.J(qQa.f, vPa.b, vqa.T, uqa.g, tTa.h, uqa.g);
        VivillonPet vivillonPet5 = a2;
        vivillonPet5.rightLeg.J(dua.ca, Qsa.k, vqa.T);
        vivillonPet5.J(vivillonPet5.rightLeg, dQa.X, JPa.N, JPa.N);
        vivillonPet5.rightLeg.J(vRa.d != 0);
        vivillonPet5.leftHand = new Js((ModelBase)a2, uSa.E, uSa.E);
        vivillonPet5.leftHand.J(vqa.T, vqa.T, dua.ca, uqa.g, uqa.g, uqa.g);
        VivillonPet vivillonPet6 = a2;
        vivillonPet6.leftHand.J(kta.v, vQa.q, dua.ca);
        a2.rightHand = new Js((ModelBase)a2, uSa.E, uSa.E);
        vivillonPet6.rightHand.J(vqa.T, vqa.T, dua.ca, uqa.g, uqa.g, uqa.g);
        VivillonPet vivillonPet7 = a2;
        vivillonPet7.rightHand.J(dua.ca, vQa.q, dua.ca);
        a2.head = new Js((ModelBase)a2, uqa.g, uSa.E);
        vivillonPet7.head.J(NQa.m, NQa.d, NQa.m, Yqa.i, XTa.W, Yqa.i);
        VivillonPet vivillonPet8 = a2;
        a2.rightStick = new Js((ModelBase)a2, tTa.J);
        vivillonPet8.rightStick.J(dua.ca, NQa.d, pqa.r);
        vivillonPet8.rightStick.J(vua.T, vPa.b, NSa.b, vPa.b, vRa.d, uua.p, vRa.d);
        a2.rightStick.J(tTa.J, vqa.T, Cra.fa, vqa.T, uqa.g, AQa.P, uqa.g);
        VivillonPet vivillonPet9 = a2;
        vivillonPet9.rightStick.J(vRa.d != 0);
        a2.leftStick = new Js((ModelBase)a2, QTa.N);
        vivillonPet9.leftStick.J(kta.v, NQa.d, pqa.r);
        vivillonPet9.leftStick.J(RQa.U, vPa.b, NSa.b, vPa.b, vRa.d, uua.p, vRa.d);
        a2.leftStick.J(XOa.Y, vqa.T, Cra.fa, vqa.T, uqa.g, AQa.P, uqa.g);
        VivillonPet vivillonPet10 = a2;
        vivillonPet10.leftStick.J(vRa.d != 0);
        a2.leftWing = new Js((ModelBase)a2, uSa.E, ISa.E);
        vivillonPet10.leftWing.J(pqa.r, cPa.Ka, JPa.N, kTa.j, ITa.E, uSa.E);
        VivillonPet vivillonPet11 = a2;
        vivillonPet11.leftWing.J(kta.v, eua.C, kta.v);
        vivillonPet11.J(vivillonPet11.leftWing, tpa.M, LQa.i, JPa.N);
        vivillonPet11.leftWing.J(vRa.d != 0);
        vivillonPet11.rightWing = new Js((ModelBase)a2, uSa.E, ISa.E);
        vivillonPet11.rightWing.J(pqa.r, cPa.Ka, JPa.N, kTa.j, ITa.E, uSa.E);
        VivillonPet vivillonPet12 = a2;
        vivillonPet12.rightWing.J(dua.ca, eua.C, kta.v);
        vivillonPet12.J(vivillonPet12.rightWing, Yra.M, nOa.i, JPa.N);
        vivillonPet12.rightWing.J(vRa.d != 0);
        vivillonPet12.J(new ResourceLocation(Cra.V, Bua.m));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        VivillonPet a2 = this;
        uKa.l((float)pta.d, (float)pta.d, (float)pta.d);
        uKa.J((float)JPa.N, (float)JPa.N, (float)ATa.x);
        super.J(b2);
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        VivillonPet a2 = this;
        float c2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float b2 = Oz.d((float)(d2 * oqa.D)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        uKa.J((float)Ora.D, (float)(vPa.b + c2), (float)bpa.K);
        uKa.J((float)(d2 * YSa.G), (float)pqa.r, (float)Ora.D, (float)JPa.N);
        uKa.l((float)pta.d, (float)pta.d, (float)pta.d);
        VivillonPet vivillonPet = a2;
        vivillonPet.leftWing.rotationZ = c2 * lqa.ga;
        vivillonPet.leftWing.rotationY = c2 * eua.C;
        vivillonPet.rightWing.rotationZ = -a2.leftWing.rotationZ;
        vivillonPet.rightWing.rotationY = -a2.leftWing.rotationY;
        vivillonPet.leftStick.rotationX = b2 * pPa.c;
        vivillonPet.rightStick.rotationX = -a2.leftStick.rotationX;
        vivillonPet.leftStick.rotationY = c2 * lqa.ga;
        vivillonPet.rightStick.rotationY = -d2 * psa.N;
        vivillonPet.leftStick.rotationZ = c2 * rRa.C;
        vivillonPet.rightStick.rotationZ = -a2.leftStick.rotationZ;
        vivillonPet.rightLeg.rotationX = psa.N;
        vivillonPet.rightLeg.rotationY = ATa.x;
        vivillonPet.rightLeg.rotationZ = b2;
        vivillonPet.leftLeg.rotationX = a2.rightLeg.rotationX;
        vivillonPet.leftLeg.rotationY = -a2.rightLeg.rotationY;
        vivillonPet.leftLeg.rotationZ = -a2.rightLeg.rotationZ;
    }
}

