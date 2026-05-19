/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Bpa
 *  Cra
 *  Epa
 *  Gua
 *  ISa
 *  JPa
 *  JQa
 *  Js
 *  Kpa
 *  Lqa
 *  Lra
 *  MQa
 *  NOa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Qsa
 *  SQa
 *  TQa
 *  Tpa
 *  Wsa
 *  XTa
 *  Ysa
 *  aPa
 *  bpa
 *  cT
 *  fpa
 *  hTa
 *  hqa
 *  isa
 *  ju
 *  kPa
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  wra
 *  ysa
 *  zsa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;
import org.lwjgl.util.glu.Sphere;

public final class PersonaGrandArcades
extends BasePet {
    private final Js bone10;
    private final Js mouth;
    private final Js mouth_one;
    private final Js left_leg;
    private final Js mouth_two;
    private final xB animation;
    private final Js bone7;
    private final Js bone3;
    private final Js left_hand;
    private final Js eyes;
    private final Js hands;
    private final Js left_ear;
    private final Js eyes_one;
    private final Js bottom;
    private final Js top;
    private final Js main;
    private final Js bone;
    private final ResourceLocation texture;
    private final Js bone4;
    private final Js bone5;
    private final Js right_ear;
    private final Js face;
    private final Js bone8;
    private final Js bone9;
    private final Js eyes_two;
    private final Js bone2;
    private final Js body;
    private final Js right_leg;
    private final Js bone6;
    private final Js right_hand;

    @Override
    public void J(float f2) {
        float b2 = f2;
        PersonaGrandArcades a2 = this;
        uKa.l((float)ZSa.q, (float)ZSa.q, (float)ZSa.q);
        uKa.J((float)b2, (float)JPa.N, (float)pqa.r, (float)pqa.r);
        uKa.J((float)JPa.N, (float)kPa.W, (float)JPa.N);
        PersonaGrandArcades personaGrandArcades = a2;
        float f3 = b2;
        a2.animation.J(f3);
        super.J(f3);
        uKa.e();
        uKa.B();
        personaGrandArcades.f(b2);
        uKa.k();
        uKa.D();
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        PersonaGrandArcades a2 = this;
        float c2 = Oz.d((float)(d2 * Nra.e)) * Yqa.C;
        uKa.J((float)ZSa.q, (float)(SQa.w + c2), (float)bpa.K);
        float f3 = MQa.L;
        uKa.l((float)f3, (float)f3, (float)f3);
        uKa.J((float)d2, (float)JPa.N, (float)pqa.r, (float)pqa.r);
        a2.animation.J(d2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(float f2) {
        void v0;
        void a2;
        PersonaGrandArcades personaGrandArcades = this;
        float b2 = a2 % CRa.ja;
        if (v0 >= Hra.Ga) {
            b2 = CRa.ja - b2;
        }
        float f3 = uKa.G.J;
        uKa.f((float)(b2 /= Hra.Ga), (float)pqa.r, (float)pqa.r, (float)(f3 * MQa.L));
        uKa.J((float)JPa.N, (float)Lqa.a, (float)JPa.N);
        uKa.J((float)a2, (float)SQa.w, (float)Lqa.a, (float)JPa.N);
        Kpa.J().J().J(personaGrandArcades.texture);
        Sphere sphere = new Sphere();
        sphere.setTextureFlag(vRa.d != 0);
        sphere.draw(isa.W, XTa.W, XTa.W);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)f3);
    }

    public PersonaGrandArcades() {
        PersonaGrandArcades a2;
        PersonaGrandArcades personaGrandArcades = a2;
        PersonaGrandArcades personaGrandArcades2 = a2;
        personaGrandArcades.texture = new ResourceLocation(Cra.V, lQa.F);
        personaGrandArcades2.textureWidth = ysa.s;
        personaGrandArcades.textureHeight = ysa.s;
        personaGrandArcades.main = new Js((ModelBase)a2);
        personaGrandArcades.main.J(JPa.N, Cra.fa, JPa.N);
        personaGrandArcades.body = new Js((ModelBase)a2);
        personaGrandArcades.body.J(JPa.N, yta.b, JPa.N);
        personaGrandArcades.main.J((cT)a2.body);
        personaGrandArcades.body.cubeList.add(new AMa((cT)a2.body, uSa.E, uSa.E, NQa.d, eta.x, Ura.T, hpa.Z, uua.s, XTa.W, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades3 = a2;
        a2.top = new Js((ModelBase)a2);
        personaGrandArcades3.top.J(JPa.N, Npa.la, JPa.N);
        personaGrandArcades3.body.J((cT)a2.top);
        personaGrandArcades3.top.cubeList.add(new AMa((cT)a2.top, uSa.E, kTa.j, NSa.b, FRa.ca, Ppa.Ha, lqa.s, yRa.d, tTa.h, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades4 = a2;
        a2.left_ear = new Js((ModelBase)a2);
        personaGrandArcades4.left_ear.J(Bpa.w, vPa.b, JPa.N);
        personaGrandArcades4.top.J((cT)a2.left_ear);
        personaGrandArcades4.bone5 = new Js((ModelBase)a2);
        personaGrandArcades4.bone5.J(qQa.f, Fua.N, JPa.N);
        personaGrandArcades4.J(personaGrandArcades4.bone5, JPa.N, JPa.N, XOa.ja);
        personaGrandArcades4.left_ear.J((cT)a2.bone5);
        personaGrandArcades4.bone5.cubeList.add(new AMa((cT)a2.bone5, NTa.C, wra.P, SQa.w, Fua.N, vPa.b, AQa.P, tTa.h, vRa.d, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades5 = a2;
        a2.right_ear = new Js((ModelBase)a2);
        personaGrandArcades5.right_ear.J(Ura.T, vPa.b, JPa.N);
        personaGrandArcades5.top.J((cT)a2.right_ear);
        personaGrandArcades5.bone6 = new Js((ModelBase)a2);
        personaGrandArcades5.bone6.J(pPa.c, Fua.N, JPa.N);
        personaGrandArcades5.J(personaGrandArcades5.bone6, JPa.N, JPa.N, Epa.x);
        personaGrandArcades5.right_ear.J((cT)a2.bone6);
        personaGrandArcades5.bone6.cubeList.add(new AMa((cT)a2.bone6, TQa.ca, uSa.E, vQa.w, Fua.N, vPa.b, AQa.P, tTa.h, vRa.d, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades6 = a2;
        a2.bottom = new Js((ModelBase)a2);
        personaGrandArcades6.bottom.J(JPa.N, Hra.ha, Ppa.Ha);
        personaGrandArcades6.body.J((cT)a2.bottom);
        personaGrandArcades6.bottom.cubeList.add(new AMa((cT)a2.bottom, uSa.E, EPa.O, NSa.b, vqa.T, JPa.N, lqa.s, yRa.d, tTa.h, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades7 = a2;
        a2.left_leg = new Js((ModelBase)a2);
        personaGrandArcades7.left_leg.J(vQa.q, rRa.C, MTa.y);
        personaGrandArcades7.bottom.J((cT)a2.left_leg);
        personaGrandArcades7.bone7 = new Js((ModelBase)a2);
        personaGrandArcades7.bone7.J(SQa.w, kta.v, JPa.N);
        personaGrandArcades7.J(personaGrandArcades7.bone7, JPa.N, JPa.N, Lqa.U);
        personaGrandArcades7.left_leg.J((cT)a2.bone7);
        personaGrandArcades7.bone7.cubeList.add(new AMa((cT)a2.bone7, tua.U, ISa.E, vPa.b, TOa.p, zsa.J, yRa.d, tTa.h, yRa.d, JPa.N, vRa.d != 0));
        PersonaGrandArcades personaGrandArcades8 = a2;
        a2.bone8 = new Js((ModelBase)a2);
        personaGrandArcades8.bone8.J(BQa.M, zta.Ka, JPa.N);
        personaGrandArcades8.J(personaGrandArcades8.bone8, JPa.N, JPa.N, LRa.r);
        personaGrandArcades8.left_leg.J((cT)a2.bone8);
        personaGrandArcades8.bone8.cubeList.add(new AMa((cT)a2.bone8, uSa.E, wra.P, vPa.b, TOa.p, FRa.ca, uqa.g, tTa.h, yRa.d, JPa.N, vRa.d != 0));
        PersonaGrandArcades personaGrandArcades9 = a2;
        a2.right_leg = new Js((ModelBase)a2);
        personaGrandArcades9.right_leg.J(TOa.p, rRa.C, MTa.y);
        personaGrandArcades9.bottom.J((cT)a2.right_leg);
        personaGrandArcades9.bone9 = new Js((ModelBase)a2);
        personaGrandArcades9.bone9.J(bpa.K, kta.v, JPa.N);
        personaGrandArcades9.J(personaGrandArcades9.bone9, JPa.N, JPa.N, NOa.H);
        personaGrandArcades9.right_leg.J((cT)a2.bone9);
        personaGrandArcades9.bone9.cubeList.add(new AMa((cT)a2.bone9, tua.U, ISa.E, Ppa.Ha, TOa.p, zsa.J, yRa.d, tTa.h, yRa.d, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades10 = a2;
        a2.bone10 = new Js((ModelBase)a2);
        personaGrandArcades10.bone10.J(BQa.ea, zta.Ka, JPa.N);
        personaGrandArcades10.J(personaGrandArcades10.bone10, JPa.N, JPa.N, Wsa.z);
        personaGrandArcades10.right_leg.J((cT)a2.bone10);
        personaGrandArcades10.bone10.cubeList.add(new AMa((cT)a2.bone10, uSa.E, wra.P, FRa.ca, TOa.p, FRa.ca, uqa.g, tTa.h, yRa.d, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades11 = a2;
        a2.face = new Js((ModelBase)a2);
        personaGrandArcades11.face.J(JPa.N, Jsa.Z, JPa.N);
        personaGrandArcades11.body.J((cT)a2.face);
        personaGrandArcades11.mouth = new Js((ModelBase)a2);
        personaGrandArcades11.face.J((cT)a2.mouth);
        personaGrandArcades11.mouth_one = new Js((ModelBase)a2);
        personaGrandArcades11.mouth.J((cT)a2.mouth_one);
        personaGrandArcades11.mouth_one.cubeList.add(new AMa((cT)a2.mouth_one, kTa.j, wra.P, dua.ca, ySa.fa, fpa.M, AQa.P, AQa.P, uSa.E, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades12 = a2;
        a2.mouth_two = new Js((ModelBase)a2);
        personaGrandArcades12.mouth_two.J(JPa.N, wta.Q, JPa.N);
        personaGrandArcades12.mouth.J((cT)a2.mouth_two);
        personaGrandArcades12.mouth_two.cubeList.add(new AMa((cT)a2.mouth_two, Tpa.z, Zqa.G, NQa.m, vqa.T, Wqa.V, Yqa.i, uqa.g, uSa.E, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades13 = a2;
        a2.eyes = new Js((ModelBase)a2);
        personaGrandArcades13.eyes.J(JPa.N, ATa.x, Ppa.Ha);
        personaGrandArcades13.face.J((cT)a2.eyes);
        personaGrandArcades13.eyes_one = new Js((ModelBase)a2);
        personaGrandArcades13.eyes_one.J(JPa.N, hqa.t, zua.w);
        personaGrandArcades13.eyes.J((cT)a2.eyes_one);
        personaGrandArcades13.eyes_one.cubeList.add(new AMa((cT)a2.eyes_one, Tpa.z, osa.c, NSa.b, dua.ca, JPa.N, lqa.s, AQa.P, uSa.E, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades14 = a2;
        a2.eyes_two = new Js((ModelBase)a2);
        personaGrandArcades14.eyes_two.J(JPa.N, hqa.t, zua.w);
        personaGrandArcades14.eyes.J((cT)a2.eyes_two);
        personaGrandArcades14.eyes_two.cubeList.add(new AMa((cT)a2.eyes_two, ITa.A, kTa.j, NSa.b, dua.ca, pqa.r, lqa.s, AQa.P, uSa.E, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades15 = a2;
        a2.hands = new Js((ModelBase)a2);
        personaGrandArcades15.hands.J(JPa.N, CRa.M, JPa.N);
        personaGrandArcades15.body.J((cT)a2.hands);
        personaGrandArcades15.left_hand = new Js((ModelBase)a2);
        personaGrandArcades15.left_hand.J(aua.X, Tpa.S, psa.N);
        personaGrandArcades15.J(personaGrandArcades15.left_hand, JPa.N, Qsa.f, tua.Ga);
        personaGrandArcades15.hands.J((cT)a2.left_hand);
        personaGrandArcades15.bone = new Js((ModelBase)a2);
        personaGrandArcades15.bone.J(ZSa.R, BQa.d, Jpa.g);
        personaGrandArcades15.J(personaGrandArcades15.bone, JPa.N, aPa.Ga, zsa.r);
        personaGrandArcades15.left_hand.J((cT)a2.bone);
        personaGrandArcades15.bone.cubeList.add(new AMa((cT)a2.bone, Tpa.z, EPa.O, Ura.T, vqa.T, FRa.ca, XTa.W, uqa.g, yRa.d, JPa.N, vRa.d != 0));
        PersonaGrandArcades personaGrandArcades16 = a2;
        a2.bone2 = new Js((ModelBase)a2);
        personaGrandArcades16.bone2.J(JQa.Z, Zqa.l, MQa.L);
        personaGrandArcades16.J(personaGrandArcades16.bone2, JPa.N, JPa.N, zsa.r);
        personaGrandArcades16.left_hand.J((cT)a2.bone2);
        personaGrandArcades16.bone2.cubeList.add(new AMa((cT)a2.bone2, Tpa.z, EPa.O, Ura.T, vqa.T, FRa.ca, XTa.W, uqa.g, yRa.d, JPa.N, vRa.d != 0));
        PersonaGrandArcades personaGrandArcades17 = a2;
        a2.right_hand = new Js((ModelBase)a2);
        personaGrandArcades17.right_hand.J(fPa.A, Tpa.S, psa.N);
        personaGrandArcades17.J(personaGrandArcades17.right_hand, JPa.N, Gua.U, xua.Da);
        personaGrandArcades17.hands.J((cT)a2.right_hand);
        personaGrandArcades17.bone3 = new Js((ModelBase)a2);
        personaGrandArcades17.bone3.J(ppa.I, Zqa.l, MQa.L);
        personaGrandArcades17.J(personaGrandArcades17.bone3, JPa.N, JPa.N, hTa.c);
        personaGrandArcades17.right_hand.J((cT)a2.bone3);
        personaGrandArcades17.bone3.cubeList.add(new AMa((cT)a2.bone3, Tpa.z, EPa.O, Ura.T, vqa.T, FRa.ca, XTa.W, uqa.g, yRa.d, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades18 = a2;
        a2.bone4 = new Js((ModelBase)a2);
        personaGrandArcades18.bone4.J(uSa.Aa, BQa.d, Jpa.g);
        personaGrandArcades18.J(personaGrandArcades18.bone4, JPa.N, ZSa.ja, hTa.c);
        personaGrandArcades18.right_hand.J((cT)a2.bone4);
        personaGrandArcades4.bone4.cubeList.add(new AMa((cT)a2.bone4, Tpa.z, EPa.O, Ura.T, vqa.T, FRa.ca, XTa.W, uqa.g, yRa.d, JPa.N, uSa.E != 0));
        PersonaGrandArcades personaGrandArcades19 = a2;
        personaGrandArcades19.animation = new ju(new ResourceLocation(Cra.V, rRa.n)).J(Lra.W, (MDModel)personaGrandArcades19);
        personaGrandArcades19.J(new ResourceLocation(Cra.V, Ysa.r));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        PersonaGrandArcades b2;
        float e2 = f2;
        PersonaGrandArcades personaGrandArcades = b2 = this;
        void v1 = d2;
        super.J((ModelPlayer)v1, (Sx)c2, e2, (jU)a2);
        uKa.e();
        uKa.h();
        personaGrandArcades.f((ModelPlayer)v1, (Sx)c2, e2, (jU)a2);
        personaGrandArcades.f(e2);
        uKa.m();
        uKa.D();
    }
}

