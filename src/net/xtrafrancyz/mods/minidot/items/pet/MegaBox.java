/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Cra
 *  ERa
 *  Fpa
 *  ISa
 *  JPa
 *  Js
 *  Lqa
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Qsa
 *  SQa
 *  Sqa
 *  TQa
 *  Vua
 *  WSa
 *  XTa
 *  YSa
 *  Ypa
 *  Yra
 *  aSa
 *  aqa
 *  cQa
 *  cT
 *  fTa
 *  fpa
 *  hra
 *  iPa
 *  isa
 *  ju
 *  kPa
 *  kpa
 *  kta
 *  lqa
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  qta
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wra
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class MegaBox
extends BasePet {
    private final Js caze;
    private final Js r_leg;
    private final Js arms;
    private final xB secretAnimation;
    private final Js chupa_chups;
    private final Js bone9;
    private final Js root;
    private final Js cap;
    private final Js bone4;
    private final Js bone7;
    private final Js PlayerModel;
    private final Js bone3;
    private final Js bone;
    private final Js bone2;
    private final Js bone8;
    private xB activeAnimation;
    private final Js l_leg;
    private final Js body;
    private final Js r_arm;
    private final Js head;
    private final Js r_arm2;
    private final xB animation;
    private final Js legs;
    private final Js buttons;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        jU e2;
        void b2;
        void c2;
        void d2;
        MegaBox megaBox = jU3;
        jU jU3 = jU2;
        MegaBox a2 = megaBox;
        uKa.h();
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, e2);
        uKa.m();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        void b2;
        MegaBox megaBox = this;
        float e2 = Oz.d((float)(b2 * TOa.r)) * Bta.G;
        uKa.J((float)ZSa.q, (float)(SQa.w + e2), (float)psa.N);
        float f3 = kPa.W;
        uKa.l((float)f3, (float)f3, (float)f3);
        super.f((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void b2;
        float d2 = f2;
        MegaBox a2 = this;
        if (a2.activeAnimation.J()) {
            MegaBox megaBox = a2;
            if (megaBox.activeAnimation.equals(megaBox.secretAnimation)) {
                MegaBox megaBox2 = a2;
                megaBox2.activeAnimation = megaBox2.animation;
                megaBox2.secretAnimation.J();
                return;
            }
        }
        if (a2.animation.J() && (double)b2.j.v.nextFloat() < iPa.c) {
            MegaBox megaBox = a2;
            megaBox.activeAnimation = megaBox.secretAnimation;
            megaBox.animation.J();
            return;
        }
        a2.activeAnimation.J(d2);
    }

    public MegaBox() {
        MegaBox megaBox;
        MegaBox megaBox2 = megaBox = this;
        megaBox2.textureWidth = XOa.h;
        megaBox2.textureHeight = XOa.h;
        MegaBox megaBox3 = megaBox;
        megaBox2.root = new Js((ModelBase)megaBox);
        megaBox2.root.J(pqa.r, FRa.B, vqa.T);
        megaBox2.caze = new Js((ModelBase)megaBox);
        megaBox2.caze.J(vqa.T, Yra.i, pqa.r);
        megaBox2.root.J((cT)megaBox.caze);
        megaBox2.caze.cubeList.add(new AMa((cT)megaBox.caze, uSa.E, ISa.E, DPa.m, FRa.B, csa.P, Zqa.G, ERa.C, cQa.o, JPa.N, uSa.E != 0));
        MegaBox megaBox4 = megaBox;
        megaBox.cap = new Js((ModelBase)megaBox);
        megaBox4.cap.J(pqa.r, DPa.m, FRa.Ga);
        megaBox4.caze.J((cT)megaBox.cap);
        megaBox4.cap.cubeList.add(new AMa((cT)megaBox.cap, uSa.E, uSa.E, hra.S, kpa.G, fpa.G, TQa.ca, uua.s, kTa.g, JPa.N, uSa.E != 0));
        MegaBox megaBox5 = megaBox;
        MegaBox megaBox6 = megaBox;
        megaBox5.cap.cubeList.add(new AMa((cT)megaBox.cap, Psa.M, NPa.i, NSa.b, JPa.N, fpa.G, uua.s, uua.p, vRa.d, JPa.N, uSa.E != 0));
        megaBox6.cap.cubeList.add(new AMa((cT)megaBox.cap, WOa.fa, ISa.E, YSa.G, hra.S, csa.P, yRa.d, AQa.P, yRa.d, JPa.N, uSa.E != 0));
        megaBox.cap.cubeList.add(new AMa((cT)megaBox.cap, Fpa.ca, pPa.ja, NSa.b, hra.S, csa.P, yRa.d, AQa.P, yRa.d, JPa.N, uSa.E != 0));
        megaBox.cap.cubeList.add(new AMa((cT)megaBox.cap, osa.c, NPa.i, NQa.d, Lsa.X, csa.P, Ypa.A, yRa.d, yRa.d, JPa.N, uSa.E != 0));
        MegaBox megaBox7 = megaBox;
        megaBox.bone3 = new Js((ModelBase)megaBox);
        megaBox7.bone3.J(kta.v, qta.D, Cra.fa);
        megaBox7.cap.J((cT)megaBox.bone3);
        megaBox7.bone3.cubeList.add(new AMa((cT)megaBox.bone3, uSa.E, uSa.E, cPa.Ka, DPa.m, NSa.b, vRa.d, NTa.C, pPa.f, JPa.N, vRa.d != 0));
        MegaBox megaBox8 = megaBox;
        megaBox.bone4 = new Js((ModelBase)megaBox);
        megaBox8.bone4.J(cPa.Ka, yRa.Aa, vPa.b);
        megaBox8.J(megaBox8.bone4, Qsa.M, JPa.N, JPa.N);
        megaBox8.bone3.J((cT)megaBox.bone4);
        megaBox8.bone4.cubeList.add(new AMa((cT)megaBox.bone4, fPa.i, aqa.Aa, dua.ca, aua.q, Ura.T, vRa.d, uqa.g, XTa.W, JPa.N, vRa.d != 0));
        megaBox.bone4.cubeList.add(new AMa((cT)megaBox.bone4, uSa.E, ISa.E, vqa.T, aua.q, Ura.T, vRa.d, XTa.W, XTa.W, JPa.N, vRa.d != 0));
        megaBox.bone4.cubeList.add(new AMa((cT)megaBox.bone4, csa.A, NPa.i, dua.ca, oQa.z, Ura.T, vRa.d, uqa.g, XTa.W, JPa.N, vRa.d != 0));
        MegaBox megaBox9 = megaBox;
        megaBox.bone2 = new Js((ModelBase)megaBox);
        megaBox9.bone2.J(vqa.T, qta.D, Cra.fa);
        megaBox9.cap.J((cT)megaBox.bone2);
        megaBox9.bone2.cubeList.add(new AMa((cT)megaBox.bone2, uSa.E, uSa.E, vqa.A, DPa.m, NSa.b, vRa.d, NTa.C, pPa.f, JPa.N, uSa.E != 0));
        MegaBox megaBox10 = megaBox;
        megaBox.bone = new Js((ModelBase)megaBox);
        megaBox10.bone.J(LPa.v, yRa.Aa, vPa.b);
        megaBox10.J(megaBox10.bone, Qsa.M, JPa.N, JPa.N);
        megaBox10.bone2.J((cT)megaBox.bone);
        megaBox10.bone.cubeList.add(new AMa((cT)megaBox.bone, fPa.i, aqa.Aa, pqa.r, aua.q, Ura.T, vRa.d, uqa.g, XTa.W, JPa.N, uSa.E != 0));
        megaBox.bone.cubeList.add(new AMa((cT)megaBox.bone, uSa.E, ISa.E, JPa.N, aua.q, Ura.T, vRa.d, XTa.W, XTa.W, JPa.N, uSa.E != 0));
        megaBox.bone.cubeList.add(new AMa((cT)megaBox.bone, csa.A, NPa.i, pqa.r, oQa.z, Ura.T, vRa.d, uqa.g, XTa.W, JPa.N, uSa.E != 0));
        MegaBox megaBox11 = megaBox;
        megaBox.PlayerModel = new Js((ModelBase)megaBox);
        megaBox11.PlayerModel.J(pqa.r, Yra.i, pqa.r);
        megaBox11.root.J((cT)megaBox.PlayerModel);
        megaBox11.head = new Js((ModelBase)megaBox);
        megaBox11.head.J(JPa.N, DPa.m, JPa.N);
        megaBox11.PlayerModel.J((cT)megaBox.head);
        megaBox11.head.cubeList.add(new AMa((cT)megaBox.head, uSa.E, NPa.i, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, JPa.N, uSa.E != 0));
        megaBox.head.cubeList.add(new AMa((cT)megaBox.head, uSa.E, iSa.ca, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, MQa.L, uSa.E != 0));
        megaBox.head.cubeList.add(new AMa((cT)megaBox.head, uSa.E, wra.e, JPa.N, NQa.d, kta.v, uSa.E, XTa.W, XTa.W, JPa.N, uSa.E != 0));
        MegaBox megaBox12 = megaBox;
        megaBox.chupa_chups = new Js((ModelBase)megaBox);
        megaBox12.chupa_chups.J(JPa.N, lTa.Z, NQa.m);
        megaBox12.J(megaBox12.chupa_chups, zta.x, isa.X, vqa.p);
        megaBox12.head.J((cT)megaBox.chupa_chups);
        megaBox12.chupa_chups.cubeList.add(new AMa((cT)megaBox.chupa_chups, pqa.ga, NTa.C, vPa.b, vPa.b, vqa.T, vRa.d, AQa.P, vRa.d, SQa.w, uSa.E != 0));
        megaBox.chupa_chups.cubeList.add(new AMa((cT)megaBox.chupa_chups, pqa.ga, Yqa.i, vPa.b, vPa.b, vqa.T, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        MegaBox megaBox13 = megaBox;
        megaBox.buttons = new Js((ModelBase)megaBox);
        megaBox13.buttons.J(dua.ca, qta.D, JPa.N);
        megaBox13.head.J((cT)megaBox.buttons);
        megaBox13.buttons.cubeList.add(new AMa((cT)megaBox.buttons, pqa.ga, Ypa.A, TOa.p, KPa.i, FRa.ca, vRa.d, yRa.d, yRa.d, JPa.N, uSa.E != 0));
        megaBox.buttons.cubeList.add(new AMa((cT)megaBox.buttons, pqa.ga, Ypa.A, lqa.ga, KPa.i, FRa.ca, vRa.d, yRa.d, yRa.d, JPa.N, vRa.d != 0));
        MegaBox megaBox14 = megaBox;
        megaBox.legs = new Js((ModelBase)megaBox);
        megaBox14.PlayerModel.J((cT)megaBox.legs);
        megaBox.l_leg = new Js((ModelBase)megaBox);
        megaBox14.l_leg.J(pqa.r, Lqa.C, JPa.N);
        megaBox14.J(megaBox14.l_leg, WSa.Ga, Asa.u, Qra.E);
        megaBox14.legs.J((cT)megaBox.l_leg);
        megaBox14.l_leg.cubeList.add(new AMa((cT)megaBox.l_leg, uSa.E, uSa.E, vqa.T, JPa.N, vqa.T, uqa.g, uua.p, uqa.g, JPa.N, uSa.E != 0));
        MegaBox megaBox15 = megaBox;
        megaBox.r_leg = new Js((ModelBase)megaBox);
        megaBox15.r_leg.J(vqa.T, Lqa.C, JPa.N);
        megaBox15.J(megaBox15.r_leg, Lqa.U, JPa.N, ZSa.ja);
        megaBox15.legs.J((cT)megaBox.r_leg);
        megaBox15.r_leg.cubeList.add(new AMa((cT)megaBox.r_leg, hpa.Z, vpa.o, vqa.T, JPa.N, vqa.T, uqa.g, uua.p, uqa.g, JPa.N, uSa.E != 0));
        MegaBox megaBox16 = megaBox;
        megaBox.arms = new Js((ModelBase)megaBox);
        megaBox16.PlayerModel.J((cT)megaBox.arms);
        megaBox.r_arm = new Js((ModelBase)megaBox);
        megaBox16.r_arm.J(TOa.p, Lsa.A, JPa.N);
        megaBox16.J(megaBox16.r_arm, JPa.N, JPa.N, xra.B);
        megaBox16.arms.J((cT)megaBox.r_arm);
        megaBox16.r_arm.cubeList.add(new AMa((cT)megaBox.r_arm, pqa.ga, uSa.E, vqa.T, vqa.T, vqa.T, uqa.g, yRa.d, uqa.g, ZSa.r, uSa.E != 0));
        MegaBox megaBox17 = megaBox;
        megaBox.bone7 = new Js((ModelBase)megaBox);
        megaBox17.bone7.J(vqa.T, kta.v, JPa.N);
        megaBox17.r_arm.J((cT)megaBox.bone7);
        megaBox17.bone7.cubeList.add(new AMa((cT)megaBox.bone7, uSa.E, NPa.i, JPa.N, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g, JPa.N, uSa.E != 0));
        MegaBox megaBox18 = megaBox;
        megaBox.r_arm2 = new Js((ModelBase)megaBox);
        megaBox18.r_arm2.J(kta.v, DPa.m, JPa.N);
        megaBox18.J(megaBox18.r_arm2, JPa.N, JPa.N, Bra.F);
        megaBox18.arms.J((cT)megaBox.r_arm2);
        megaBox18.r_arm2.cubeList.add(new AMa((cT)megaBox.r_arm2, pqa.ga, uSa.E, JPa.N, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g, ZSa.r, vRa.d != 0));
        megaBox.bone8 = new Js((ModelBase)megaBox);
        megaBox5.bone8.J(kta.v, vQa.q, JPa.N);
        megaBox5.J(megaBox6.bone8, JPa.N, JPa.N, xua.Da);
        megaBox5.r_arm2.J((cT)megaBox.bone8);
        megaBox.bone8.cubeList.add(new AMa((cT)megaBox.bone8, uSa.E, NPa.i, dua.ca, JPa.N, vqa.T, uqa.g, yRa.d, uqa.g, JPa.N, vRa.d != 0));
        MegaBox megaBox19 = megaBox;
        megaBox.body = new Js((ModelBase)megaBox);
        megaBox19.body.J(JPa.N, DPa.m, JPa.N);
        megaBox19.PlayerModel.J((cT)megaBox.body);
        megaBox19.body.cubeList.add(new AMa((cT)megaBox.body, uua.s, uSa.E, dua.ca, JPa.N, vqa.T, AQa.P, uua.p, uqa.g, JPa.N, uSa.E != 0));
        megaBox.body.cubeList.add(new AMa((cT)megaBox.body, iSa.x, Vua.J, fTa.S, Sqa.ga, pPa.x, AQa.P, yRa.d, vRa.d, dua.Ja, uSa.E != 0));
        MegaBox megaBox20 = megaBox;
        megaBox.bone9 = new Js((ModelBase)megaBox);
        megaBox20.bone9.J(JPa.N, JPa.N, vqa.T);
        megaBox20.J(megaBox20.bone9, Qsa.f, JPa.N, JPa.N);
        megaBox20.body.J((cT)megaBox.bone9);
        megaBox20.bone9.cubeList.add(new AMa((cT)megaBox.bone9, pqa.ga, tTa.h, vqa.T, JPa.N, JPa.N, uqa.g, yRa.d, uSa.E, JPa.N, uSa.E != 0));
        MegaBox megaBox21 = megaBox;
        super.J(new ResourceLocation(Cra.V, oqa.s));
        MegaBox a2 = new ju(new ResourceLocation(Cra.V, Ppa.Ja));
        megaBox21.animation = a2.J(MRa.F, megaBox);
        megaBox.secretAnimation = a2.J(pua.w, megaBox);
        megaBox21.activeAnimation = megaBox21.animation;
    }

    @Override
    public void J(float f2) {
        MegaBox a2;
        float b2 = f2;
        MegaBox megaBox = a2 = this;
        megaBox.activeAnimation.J(b2);
        uKa.f((double)aSa.V, (double)VPa.W, (double)aSa.V);
        double d2 = vTa.ga;
        uKa.J((double)d2, (double)d2, (double)d2);
        super.J(b2);
    }
}

