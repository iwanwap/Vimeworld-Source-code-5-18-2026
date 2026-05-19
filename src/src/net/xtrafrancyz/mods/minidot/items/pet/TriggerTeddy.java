/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Ata
 *  Bsa
 *  Cra
 *  EQa
 *  Epa
 *  JPa
 *  JSa
 *  Js
 *  Lqa
 *  Lra
 *  MQa
 *  NOa
 *  NPa
 *  NQa
 *  Oz
 *  Ppa
 *  Qsa
 *  SRa
 *  XTa
 *  Ypa
 *  aPa
 *  aSa
 *  cQa
 *  cT
 *  dQa
 *  ju
 *  kta
 *  oqa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vRa
 *  wOa
 *  wra
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class TriggerTeddy
extends BasePet {
    private final Js leg_left;
    private final Js bone3;
    private final Js costume;
    private final Js TriggerTeddy;
    private final xB animation;
    private final Js skull;
    private boolean secretReseted;
    private final Js arm_right;
    private final Js bone4;
    private final Js arm_left;
    private final Js bone2;
    private final xB secret;
    private final Js head;
    private final Js leg_right;
    private final Js bone;

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        float e2 = f2;
        TriggerTeddy b2 = this;
        super.f((ModelPlayer)d2, (Sx)c2, e2, (jU)a2);
        double d3 = (double)Oz.d((float)(e2 * Nra.e)) * mPa.ia;
        uKa.f((double)oua.i, (double)(Zra.F + d3), (double)kTa.B);
        uKa.J((double)Tqa.ja, (double)Tqa.ja, (double)Tqa.ja);
        if (c2.f() <= SRa.V) {
            if (b2.secret.J()) {
                b2.secret.J();
            }
            b2.secret.J(e2);
            b2.secretReseted = uSa.E;
            return;
        }
        if (!b2.secretReseted) {
            TriggerTeddy triggerTeddy = b2;
            triggerTeddy.secret.J();
            triggerTeddy.J(Wt.J());
            triggerTeddy.secretReseted = vRa.d;
        }
        b2.animation.J(e2);
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        TriggerTeddy a2 = this;
        uKa.f((double)aSa.V, (double)VPa.W, (double)tpa.k);
        TriggerTeddy triggerTeddy = a2;
        triggerTeddy.animation.J(b2);
        super.J(b2);
    }

    public TriggerTeddy() {
        TriggerTeddy triggerTeddy;
        TriggerTeddy triggerTeddy2 = triggerTeddy = this;
        triggerTeddy2.textureWidth = ysa.s;
        triggerTeddy2.textureHeight = ysa.s;
        TriggerTeddy triggerTeddy3 = triggerTeddy;
        triggerTeddy2.TriggerTeddy = new Js((ModelBase)triggerTeddy);
        triggerTeddy2.TriggerTeddy.cubeList.add(new AMa((cT)triggerTeddy.TriggerTeddy, XTa.W, tua.U, NPa.L, KQa.L, dQa.j, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.TriggerTeddy.cubeList.add(new AMa((cT)triggerTeddy.TriggerTeddy, Lra.e, Fsa.d, kta.v, pta.ca, kta.t, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        boolean bl2 = triggerTeddy.TriggerTeddy.cubeList.add(new AMa((cT)triggerTeddy.TriggerTeddy, kTa.j, uua.s, Ppa.Ha, sOa.Z, Ppa.Ha, tTa.h, uua.p, yRa.d, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy4 = triggerTeddy;
        triggerTeddy.TriggerTeddy.cubeList.add(new AMa((cT)triggerTeddy.TriggerTeddy, uSa.E, fPa.i, vPa.b, BQa.H, Ura.T, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy5 = triggerTeddy;
        triggerTeddy.leg_right = new Js((ModelBase)triggerTeddy);
        triggerTeddy5.leg_right.J(dua.ca, Lqa.l, vqa.T);
        triggerTeddy5.J(triggerTeddy5.leg_right, aPa.Ga, JPa.N, NOa.H);
        triggerTeddy5.TriggerTeddy.J((cT)triggerTeddy.leg_right);
        triggerTeddy4.leg_right.cubeList.add(new AMa((cT)triggerTeddy.leg_right, ITa.E, uua.p, vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g, JPa.N, uSa.E != 0));
        triggerTeddy.leg_right.cubeList.add(new AMa((cT)triggerTeddy.leg_right, Ypa.A, tua.U, FRa.ca, pqa.r, FRa.ca, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.leg_right.cubeList.add(new AMa((cT)triggerTeddy.leg_right, pPa.f, tua.U, JSa.x, Ira.d, JSa.x, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy6 = triggerTeddy;
        triggerTeddy.leg_left = new Js((ModelBase)triggerTeddy);
        triggerTeddy6.leg_left.J(kta.v, Lqa.l, vqa.T);
        triggerTeddy6.J(triggerTeddy6.leg_left, aPa.Ga, JPa.N, Lqa.U);
        triggerTeddy6.TriggerTeddy.J((cT)triggerTeddy.leg_left);
        triggerTeddy6.leg_left.cubeList.add(new AMa((cT)triggerTeddy.leg_left, Yqa.i, AQa.ba, vqa.T, JPa.N, vqa.T, uqa.g, AQa.P, uqa.g, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy7 = triggerTeddy;
        triggerTeddy.arm_left = new Js((ModelBase)triggerTeddy);
        triggerTeddy7.arm_left.J(Jra.S, oqa.Ga, vqa.T);
        triggerTeddy7.J(triggerTeddy7.arm_left, Qsa.f, JPa.N, Epa.x);
        triggerTeddy7.TriggerTeddy.J((cT)triggerTeddy.arm_left);
        triggerTeddy7.arm_left.cubeList.add(new AMa((cT)triggerTeddy.arm_left, uSa.E, AQa.ba, JPa.N, JPa.N, vqa.T, uqa.g, tTa.h, uqa.g, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy8 = triggerTeddy;
        triggerTeddy.arm_right = new Js((ModelBase)triggerTeddy);
        triggerTeddy8.arm_right.J(Lqa.l, oqa.Ga, vqa.T);
        triggerTeddy8.J(triggerTeddy8.arm_right, Qsa.f, JPa.N, XOa.ja);
        triggerTeddy8.TriggerTeddy.J((cT)triggerTeddy.arm_right);
        triggerTeddy8.arm_right.cubeList.add(new AMa((cT)triggerTeddy.arm_right, yOa.B, cQa.o, dua.ca, JPa.N, vqa.T, uqa.g, tTa.h, uqa.g, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy9 = triggerTeddy;
        triggerTeddy.bone3 = new Js((ModelBase)triggerTeddy);
        triggerTeddy9.bone3.J(MQa.L, gua.T, TOa.p);
        triggerTeddy9.J(triggerTeddy9.bone3, JPa.N, JPa.N, pQa.X);
        triggerTeddy9.TriggerTeddy.J((cT)triggerTeddy.bone3);
        triggerTeddy9.bone3.cubeList.add(new AMa((cT)triggerTeddy.bone3, tua.U, Fsa.d, JPa.N, vqa.T, JPa.N, uqa.g, uqa.g, uSa.E, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy10 = triggerTeddy;
        triggerTeddy.bone4 = new Js((ModelBase)triggerTeddy);
        triggerTeddy10.bone4.J(vPa.b, gua.T, TOa.p);
        triggerTeddy10.J(triggerTeddy10.bone4, JPa.N, JPa.N, JPa.w);
        triggerTeddy10.TriggerTeddy.J((cT)triggerTeddy.bone4);
        triggerTeddy10.bone4.cubeList.add(new AMa((cT)triggerTeddy.bone4, wOa.t, tua.U, dua.ca, vqa.T, JPa.N, uqa.g, uqa.g, uSa.E, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy11 = triggerTeddy;
        triggerTeddy.head = new Js((ModelBase)triggerTeddy);
        triggerTeddy11.head.J(JPa.N, sOa.Z, vqa.T);
        triggerTeddy11.TriggerTeddy.J((cT)triggerTeddy.head);
        triggerTeddy11.skull = new Js((ModelBase)triggerTeddy);
        triggerTeddy11.skull.J(JPa.N, vPa.b, JPa.N);
        triggerTeddy11.head.J((cT)triggerTeddy.skull);
        triggerTeddy11.skull.cubeList.add(new AMa((cT)triggerTeddy.skull, uSa.E, uua.s, Ppa.Ha, CRa.M, Ppa.Ha, tTa.h, tTa.h, tTa.h, JPa.N, uSa.E != 0));
        triggerTeddy.skull.cubeList.add(new AMa((cT)triggerTeddy.skull, AQa.ba, Fsa.d, vPa.b, lTa.Z, vPa.b, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy12 = triggerTeddy;
        triggerTeddy.bone = new Js((ModelBase)triggerTeddy);
        triggerTeddy12.bone.J(MTa.y, Ppa.Ha, lTa.Z);
        triggerTeddy12.J(triggerTeddy12.bone, wra.L, ZSa.ja, JPa.N);
        triggerTeddy12.skull.J((cT)triggerTeddy.bone);
        triggerTeddy12.bone.cubeList.add(new AMa((cT)triggerTeddy.bone, hpa.Z, Lra.e, vPa.b, vqa.T, vPa.b, vRa.d, uqa.g, uqa.g, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy13 = triggerTeddy;
        triggerTeddy.bone2 = new Js((ModelBase)triggerTeddy);
        triggerTeddy13.bone2.J(Ppa.Ha, Ppa.Ha, lTa.Z);
        triggerTeddy13.J(triggerTeddy13.bone2, wra.L, aPa.Ga, JPa.N);
        triggerTeddy13.skull.J((cT)triggerTeddy.bone2);
        triggerTeddy13.bone2.cubeList.add(new AMa((cT)triggerTeddy.bone2, uSa.E, uSa.E, vPa.b, vqa.T, vPa.b, vRa.d, uqa.g, uqa.g, JPa.N, uSa.E != 0));
        TriggerTeddy triggerTeddy14 = triggerTeddy;
        triggerTeddy.costume = new Js((ModelBase)triggerTeddy);
        triggerTeddy14.costume.J(JPa.N, lTa.Z, JPa.N);
        triggerTeddy14.head.J((cT)triggerTeddy.costume);
        triggerTeddy14.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, uSa.E, uSa.E, Ura.T, NQa.d, TOa.p, XTa.W, XTa.W, uua.p, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, ITa.E, ITa.E, EQa.G, Era.s, JPa.N, yRa.d, yRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, ITa.E, cQa.o, Ira.d, Era.s, JPa.N, yRa.d, yRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, EPa.O, uSa.E, dua.ca, zpa.ja, Ura.T, AQa.P, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, kTa.j, uSa.E, NQa.m, oqa.Ga, FRa.ca, uqa.g, uqa.g, AQa.P, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, kTa.j, uqa.g, Ura.T, Bsa.Ha, Xpa.t, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, kTa.j, uSa.E, EQa.G, BQa.H, Xpa.t, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, Ypa.A, Ypa.A, yRa.ha, pta.ca, MQa.L, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, uSa.E, Ypa.A, pQa.s, sOa.Z, oQa.z, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, uSa.E, uua.s, Psa.Ja, Bsa.Ha, rta.o, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, EPa.O, uqa.g, lTa.Z, vPa.b, NQa.m, uqa.g, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, uSa.E, AQa.P, JSa.x, lTa.Z, aua.q, uqa.g, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy4.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, hpa.Z, AQa.ba, Xpa.t, vqa.T, NQa.m, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, uua.p, AQa.ba, oQa.z, lTa.Z, aua.q, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, Ypa.A, uua.s, FRa.ca, Psa.Ja, NQa.m, yRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, XTa.W, ITa.A, vqa.T, TOa.p, pQa.s, uqa.g, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, AQa.P, Fsa.d, vPa.b, Ura.T, EQa.G, vRa.d, vRa.d, vRa.d, JPa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, uSa.E, Fsa.d, Ira.d, pQa.s, TOa.p, vRa.d, vRa.d, vRa.d, psa.N, uSa.E != 0));
        triggerTeddy.costume.cubeList.add(new AMa((cT)triggerTeddy.costume, kTa.j, ITa.A, Ppa.Ha, pQa.s, TOa.p, vRa.d, vRa.d, vRa.d, psa.N, uSa.E != 0));
        super.J(new ResourceLocation(Cra.V, Ata.C));
        TriggerTeddy a2 = new ju(new ResourceLocation(Cra.V, oQa.b));
        triggerTeddy.animation = a2.J(Lra.W, triggerTeddy);
        triggerTeddy.secret = a2.J(kua.s, triggerTeddy);
    }

    public static /* synthetic */ void f(Js a2) {
        Js js2 = a2;
        js2.rotationX = JPa.N;
        js2.scaleX = pqa.r;
        js2.rotationY = JPa.N;
        js2.scaleY = pqa.r;
        js2.rotationZ = JPa.N;
        js2.scaleZ = pqa.r;
    }
}

