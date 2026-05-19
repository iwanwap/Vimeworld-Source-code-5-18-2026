/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  BRa
 *  Cra
 *  EQa
 *  ERa
 *  JPa
 *  Js
 *  Lqa
 *  Lra
 *  NQa
 *  NTa
 *  Oz
 *  Ppa
 *  Pqa
 *  QSa
 *  Qsa
 *  SQa
 *  Uqa
 *  Usa
 *  Wsa
 *  XTa
 *  Xsa
 *  YSa
 *  aQa
 *  aSa
 *  bSa
 *  bpa
 *  cRa
 *  cT
 *  cra
 *  fsa
 *  fua
 *  hra
 *  jpa
 *  ju
 *  kpa
 *  kta
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vRa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class HuggyWuggy
extends BasePet {
    private final Js Butterfly;
    private final Js bone6;
    private final Js Base;
    private final Js bone17;
    private final Js Torse;
    private final Js bone7;
    private final Js Head;
    private final String type;
    private final Js bone;
    private final Js bone3;
    private final Js Roth;
    private final Js bone11;
    private final xB animation;
    private final Js Body;
    private final Js LeftLeg;
    private final Js bone5;
    private final Js bone2;
    private final Js Poppy;
    private final Js Eyes;
    private final Js RightArm;
    private final Js bone8;
    private final Js bone12;
    private final Js RightLeg;
    private final Js Teeth;
    private final Js bone9;
    private final Js LeftArm;
    private final Js bone4;
    private final Js bone16;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void c2;
        float d2 = f2;
        HuggyWuggy a2 = this;
        float b2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        float f3 = Oz.d((float)(d2 * Jta.w)) * Yqa.C;
        d2 = Oz.C((float)(d2 * TOa.r));
        fua.J((float)Ora.D, (float)(vPa.b + b2), (float)bpa.K);
        fua.J((float)(d2 * YSa.G), (float)JPa.N, (float)Ora.D, (float)JPa.N);
        HuggyWuggy huggyWuggy = a2;
        huggyWuggy.RightLeg.rotationX = c2.bipedRightLeg.rotateAngleX / kta.v + f3;
        huggyWuggy.RightLeg.rotationY = b2 * kta.v;
        huggyWuggy.LeftLeg.rotationX = c2.bipedLeftLeg.rotateAngleX / kta.v - f3;
        huggyWuggy.LeftLeg.rotationZ = b2 * kta.v;
        huggyWuggy.LeftArm.rotationX = c2.bipedLeftArm.rotateAngleX / pPa.c + d2 * Nra.e;
        huggyWuggy.LeftArm.rotationY = -d2 * b2 * kta.v;
        huggyWuggy.LeftArm.rotationZ = d2 * b2 * YSa.G;
        huggyWuggy.RightArm.rotationX = -a2.LeftArm.rotationX;
        huggyWuggy.RightArm.rotationY = -a2.LeftArm.rotationY;
        huggyWuggy.RightArm.rotationZ = a2.LeftArm.rotationZ;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        jU e2;
        void b2;
        void c2;
        void d2;
        HuggyWuggy huggyWuggy = jU3;
        jU jU3 = jU2;
        HuggyWuggy a2 = huggyWuggy;
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
        HuggyWuggy b2;
        float e2 = f2;
        HuggyWuggy huggyWuggy = b2 = this;
        super.f((ModelPlayer)d2, (Sx)c2, e2, (jU)a2);
        uKa.f((double)aQa.r, (double)Asa.l, (double)Nta.a);
        double d3 = zta.q;
        uKa.J((double)d3, (double)d3, (double)d3);
        huggyWuggy.animation.J(e2);
    }

    public HuggyWuggy(String string) {
        HuggyWuggy a2;
        String b2 = string;
        HuggyWuggy huggyWuggy = a2 = this;
        HuggyWuggy huggyWuggy2 = a2;
        huggyWuggy2.textureWidth = ysa.s;
        huggyWuggy2.textureHeight = ysa.s;
        huggyWuggy2.type = b2;
        huggyWuggy.Poppy = new Js((ModelBase)a2);
        a2.Poppy.J(JPa.N, TOa.R, JPa.N);
        huggyWuggy.Body = new Js((ModelBase)a2);
        huggyWuggy.Poppy.J((cT)a2.Body);
        huggyWuggy.Torse = new Js((ModelBase)a2);
        huggyWuggy.Torse.J(JPa.N, kpa.G, JPa.N);
        huggyWuggy.Body.J((cT)a2.Torse);
        huggyWuggy.Torse.cubeList.add(new AMa((cT)a2.Torse, uSa.E, Qsa.Ha, EQa.G, JPa.N, dua.ca, Yqa.i, hpa.Z, AQa.P, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy3 = a2;
        a2.Butterfly = new Js((ModelBase)a2);
        huggyWuggy3.Butterfly.J(TOa.p, dua.ca, JPa.N);
        huggyWuggy3.Torse.J((cT)a2.Butterfly);
        huggyWuggy3.bone16 = new Js((ModelBase)a2);
        huggyWuggy3.J(huggyWuggy3.bone16, JPa.N, JPa.N, Qsa.M);
        huggyWuggy3.Butterfly.J((cT)a2.bone16);
        huggyWuggy3.bone16.cubeList.add(new AMa((cT)a2.bone16, Yqa.D, yOa.B, EQa.G, kta.v, Lqa.l, tTa.h, yRa.d, uSa.E, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy4 = a2;
        a2.bone17 = new Js((ModelBase)a2);
        huggyWuggy4.bone17.J(eua.C, JPa.N, JPa.N);
        huggyWuggy4.J(huggyWuggy4.bone17, JPa.N, JPa.N, Pqa.z);
        huggyWuggy4.Butterfly.J((cT)a2.bone17);
        huggyWuggy4.bone17.cubeList.add(new AMa((cT)a2.bone17, Yqa.D, yOa.B, vPa.b, kta.v, Lqa.l, tTa.h, yRa.d, uSa.E, JPa.N, vRa.d != 0));
        HuggyWuggy huggyWuggy5 = a2;
        a2.LeftLeg = new Js((ModelBase)a2);
        huggyWuggy5.LeftLeg.J(kta.v, pqa.r, JPa.N);
        huggyWuggy5.Body.J((cT)a2.LeftLeg);
        huggyWuggy5.LeftLeg.cubeList.add(new AMa((cT)a2.LeftLeg, osa.c, Qsa.Ha, FRa.ca, JPa.N, FRa.ca, yRa.d, kTa.g, yRa.d, JPa.N, uSa.E != 0));
        a2.LeftLeg.cubeList.add(new AMa((cT)a2.LeftLeg, Yqa.D, uSa.E, FRa.ca, sSa.E, EQa.G, yRa.d, uqa.g, uua.p, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy6 = a2;
        a2.RightLeg = new Js((ModelBase)a2);
        huggyWuggy6.RightLeg.J(TOa.p, pqa.r, JPa.N);
        huggyWuggy6.Body.J((cT)a2.RightLeg);
        huggyWuggy6.RightLeg.cubeList.add(new AMa((cT)a2.RightLeg, osa.c, Qsa.Ha, FRa.ca, JPa.N, FRa.ca, yRa.d, kTa.g, yRa.d, JPa.N, uSa.E != 0));
        a2.RightLeg.cubeList.add(new AMa((cT)a2.RightLeg, Yqa.D, uSa.E, FRa.ca, sSa.E, EQa.G, yRa.d, uqa.g, uua.p, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy7 = a2;
        a2.RightArm = new Js((ModelBase)a2);
        huggyWuggy7.RightArm.J(CRa.M, Jsa.o, JPa.N);
        huggyWuggy7.Body.J((cT)a2.RightArm);
        huggyWuggy7.RightArm.cubeList.add(new AMa((cT)a2.RightArm, kTa.j, yOa.B, dua.ca, LPa.v, FRa.ca, uqa.g, AQa.P, yRa.d, JPa.N, uSa.E != 0));
        a2.RightArm.cubeList.add(new AMa((cT)a2.RightArm, QSa.p, Qsa.Ha, Ppa.Ha, dua.ca, FRa.ca, yRa.d, wOa.h, yRa.d, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy8 = a2;
        a2.LeftArm = new Js((ModelBase)a2);
        huggyWuggy8.LeftArm.J(YSa.G, Jsa.o, JPa.N);
        huggyWuggy8.Body.J((cT)a2.LeftArm);
        huggyWuggy8.LeftArm.cubeList.add(new AMa((cT)a2.LeftArm, Qsa.Ha, Qsa.Ha, vPa.b, dua.ca, FRa.ca, yRa.d, wOa.h, yRa.d, JPa.N, uSa.E != 0));
        a2.LeftArm.cubeList.add(new AMa((cT)a2.LeftArm, kTa.j, yOa.B, JPa.N, LPa.v, FRa.ca, uqa.g, AQa.P, yRa.d, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy9 = a2;
        a2.Head = new Js((ModelBase)a2);
        huggyWuggy9.Head.J(JPa.N, kpa.G, JPa.N);
        huggyWuggy9.Poppy.J((cT)a2.Head);
        huggyWuggy9.Eyes = new Js((ModelBase)a2);
        huggyWuggy9.Eyes.J(JPa.N, bSa.J, JPa.N);
        huggyWuggy9.Head.J((cT)a2.Eyes);
        huggyWuggy9.Eyes.cubeList.add(new AMa((cT)a2.Eyes, uSa.E, yOa.B, oQa.z, Yua.T, STa.s, yRa.d, yRa.d, uSa.E, JPa.N, uSa.E != 0));
        a2.Eyes.cubeList.add(new AMa((cT)a2.Eyes, uSa.E, wOa.h, KQa.L, Yua.T, STa.s, yRa.d, yRa.d, uSa.E, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy10 = a2;
        a2.Teeth = new Js((ModelBase)a2);
        huggyWuggy10.Teeth.J(JPa.N, bSa.J, JPa.N);
        huggyWuggy10.Head.J((cT)a2.Teeth);
        huggyWuggy10.Teeth.cubeList.add(new AMa((cT)a2.Teeth, kTa.j, uqa.g, NQa.m, hra.S, yRa.ha, XTa.W, vRa.d, uSa.E, JPa.N, uSa.E != 0));
        a2.Teeth.cubeList.add(new AMa((cT)a2.Teeth, kTa.j, yRa.d, NQa.m, DPa.m, yRa.ha, XTa.W, vRa.d, uSa.E, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy11 = a2;
        a2.bone11 = new Js((ModelBase)a2);
        huggyWuggy11.bone11.J(vqa.T, JPa.N, zpa.ja);
        huggyWuggy11.J(huggyWuggy11.bone11, JPa.N, JPa.N, Mqa.O);
        huggyWuggy11.Teeth.J((cT)a2.bone11);
        huggyWuggy11.bone11.cubeList.add(new AMa((cT)a2.bone11, uSa.E, XTa.W, gsa.E, Jra.H, NQa.m, AQa.P, vRa.d, uSa.E, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy12 = a2;
        a2.bone12 = new Js((ModelBase)a2);
        huggyWuggy12.bone12.J(JPa.N, JPa.N, zpa.ja);
        huggyWuggy12.J(huggyWuggy12.bone12, JPa.N, JPa.N, SPa.Ka);
        huggyWuggy12.Teeth.J((cT)a2.bone12);
        huggyWuggy12.bone12.cubeList.add(new AMa((cT)a2.bone12, uSa.E, uua.p, ERa.fa, Jra.H, NQa.m, AQa.P, vRa.d, uSa.E, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy13 = a2;
        a2.Roth = new Js((ModelBase)a2);
        huggyWuggy13.Roth.J(JPa.N, bSa.J, JPa.N);
        huggyWuggy13.Head.J((cT)a2.Roth);
        huggyWuggy13.Roth.cubeList.add(new AMa((cT)a2.Roth, uSa.E, AQa.P, dua.ca, Hta.D, Usa.S, yRa.d, vRa.d, vRa.d, Nra.e, uSa.E != 0));
        a2.Roth.cubeList.add(new AMa((cT)a2.Roth, kTa.j, uSa.E, NQa.m, Lsa.A, CRa.M, XTa.W, vRa.d, vRa.d, NTa.ia, uSa.E != 0));
        HuggyWuggy huggyWuggy14 = a2;
        a2.bone5 = new Js((ModelBase)a2);
        huggyWuggy14.J(huggyWuggy14.bone5, JPa.N, JPa.N, Mqa.O);
        huggyWuggy14.Roth.J((cT)a2.bone5);
        huggyWuggy14.bone5.cubeList.add(new AMa((cT)a2.bone5, kTa.j, AQa.P, gsa.E, Jra.H, CRa.M, tTa.h, vRa.d, vRa.d, ZSa.r, uSa.E != 0));
        HuggyWuggy huggyWuggy15 = a2;
        a2.bone7 = new Js((ModelBase)a2);
        huggyWuggy15.bone7.J(pqa.r, FRa.B, JPa.N);
        huggyWuggy15.J(huggyWuggy15.bone7, JPa.N, JPa.N, LRa.r);
        huggyWuggy15.Roth.J((cT)a2.bone7);
        huggyWuggy15.bone7.cubeList.add(new AMa((cT)a2.bone7, uSa.E, uSa.E, rQa.o, dqa.p, CRa.M, yRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy16 = a2;
        a2.bone6 = new Js((ModelBase)a2);
        huggyWuggy16.bone6.J(CRa.M, FRa.B, JPa.N);
        huggyWuggy16.J(huggyWuggy16.bone6, JPa.N, JPa.N, Wsa.z);
        huggyWuggy16.Roth.J((cT)a2.bone6);
        huggyWuggy16.bone6.cubeList.add(new AMa((cT)a2.bone6, uSa.E, uqa.g, rta.ca, XTa.F, CRa.M, yRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy17 = a2;
        a2.bone8 = new Js((ModelBase)a2);
        huggyWuggy17.bone8.J(CRa.M, FRa.B, JPa.N);
        huggyWuggy17.J(huggyWuggy17.bone8, JPa.N, JPa.N, cRa.o);
        huggyWuggy17.Roth.J((cT)a2.bone8);
        huggyWuggy17.bone8.cubeList.add(new AMa((cT)a2.bone8, Lra.e, yOa.B, Asa.P, lTa.J, CRa.M, uqa.g, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy18 = a2;
        a2.bone9 = new Js((ModelBase)a2);
        huggyWuggy18.bone9.J(YSa.G, FRa.B, JPa.N);
        huggyWuggy18.J(huggyWuggy18.bone9, JPa.N, JPa.N, Xsa.d);
        huggyWuggy18.Roth.J((cT)a2.bone9);
        huggyWuggy18.bone9.cubeList.add(new AMa((cT)a2.bone9, uSa.E, osa.c, BRa.Da, lTa.J, CRa.M, uqa.g, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        HuggyWuggy huggyWuggy19 = a2;
        a2.bone4 = new Js((ModelBase)a2);
        huggyWuggy19.J(huggyWuggy19.bone4, JPa.N, JPa.N, SPa.Ka);
        huggyWuggy4.Roth.J((cT)a2.bone4);
        huggyWuggy4.bone4.cubeList.add(new AMa((cT)a2.bone4, kTa.j, uua.p, SQa.Ia, WPa.F, CRa.M, tTa.h, vRa.d, vRa.d, ZSa.r, uSa.E != 0));
        HuggyWuggy huggyWuggy20 = a2;
        a2.Base = new Js((ModelBase)a2);
        huggyWuggy20.Base.J(JPa.N, bSa.J, JPa.N);
        huggyWuggy20.Head.J((cT)a2.Base);
        huggyWuggy20.bone = new Js((ModelBase)a2);
        huggyWuggy20.bone.J(JPa.N, kpa.G, JPa.N);
        huggyWuggy20.Base.J((cT)a2.bone);
        huggyWuggy20.bone.cubeList.add(new AMa((cT)a2.bone, EPa.O, yOa.B, Upa.V, YSa.Ia, NQa.m, AQa.P, NTa.C, Yqa.i, psa.N, uSa.E != 0));
        a2.bone.cubeList.add(new AMa((cT)a2.bone, EPa.O, uSa.E, cra.Z, YSa.Ia, NQa.m, AQa.P, NTa.C, Yqa.i, Ira.p, uSa.E != 0));
        HuggyWuggy huggyWuggy21 = a2;
        a2.bone3 = new Js((ModelBase)a2);
        huggyWuggy21.bone3.J(JPa.N, vqa.T, JPa.N);
        huggyWuggy21.J(huggyWuggy21.bone3, JPa.N, JPa.N, xua.Da);
        huggyWuggy21.Base.J((cT)a2.bone3);
        huggyWuggy21.bone3.cubeList.add(new AMa((cT)a2.bone3, uSa.E, uSa.E, sSa.Y, oqa.q, NQa.m, uua.p, NTa.C, Yqa.i, sqa.q, uSa.E != 0));
        HuggyWuggy huggyWuggy22 = a2;
        a2.bone2 = new Js((ModelBase)a2);
        huggyWuggy22.bone2.J(vqa.T, vqa.T, JPa.N);
        huggyWuggy22.J(huggyWuggy22.bone2, JPa.N, JPa.N, tua.Ga);
        huggyWuggy22.Base.J((cT)a2.bone2);
        huggyWuggy22.bone2.cubeList.add(new AMa((cT)a2.bone2, uSa.E, yOa.B, kpa.Ia, oqa.q, NQa.m, uua.p, NTa.C, Yqa.i, sqa.q, uSa.E != 0));
        super.J(new ResourceLocation(Cra.V, new StringBuilder().insert(3 >> 2, osa.K).append(b2).append(KPa.C).toString()));
        a2.animation = new ju(new ResourceLocation(Cra.V, jpa.I)).J(fsa.y, (MDModel)a2);
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        HuggyWuggy a2 = this;
        uKa.f((double)aSa.V, (double)Uqa.D, (double)aSa.V);
        double d2 = BQa.ia;
        uKa.J((double)d2, (double)d2, (double)d2);
        HuggyWuggy huggyWuggy = a2;
        huggyWuggy.animation.J(b2);
        super.J(b2);
    }
}

