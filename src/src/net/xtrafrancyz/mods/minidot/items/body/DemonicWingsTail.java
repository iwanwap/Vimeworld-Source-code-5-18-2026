/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Bpa
 *  Bsa
 *  Cra
 *  EQa
 *  ERa
 *  JPa
 *  Js
 *  LQa
 *  MQa
 *  NOa
 *  NTa
 *  Ppa
 *  RPa
 *  Rua
 *  Tpa
 *  XTa
 *  YSa
 *  Ypa
 *  Zta
 *  aSa
 *  bua
 *  cT
 *  eS
 *  hqa
 *  iPa
 *  ju
 *  lqa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vRa
 *  vpa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;
import net.xtrafrancyz.mods.minidot.items.MDModel;

public final class DemonicWingsTail
extends BaseItem {
    private final Js demon_tail;
    private final Js bone2;
    private final Js bone14;
    private final Js wings;
    private final Js bone15;
    private final Js bone9;
    private final Js bone5;
    private final Js bone16;
    private final Js bone3;
    private final Js bone;
    private final Js bone12;
    private final Js bone11;
    private final Js bone7;
    private final Js wing1;
    private final Js bone17;
    private final Js bone8;
    private final Js wing2;
    private final Js root;
    private final xB animation;
    private final Js bone13;
    private final Js bone10;

    @Override
    public void J(float f2) {
        DemonicWingsTail a2;
        float b2 = f2;
        DemonicWingsTail demonicWingsTail = a2 = this;
        demonicWingsTail.animation.J(b2);
        uKa.f((double)aSa.V, (double)ATa.j, (double)Wqa.d);
        double d2 = vpa.fa;
        uKa.J((double)d2, (double)d2, (double)d2);
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        DemonicWingsTail b2;
        float e2 = f2;
        DemonicWingsTail demonicWingsTail = b2 = this;
        super.f((ModelPlayer)d2, (Sx)c2, e2, (jU)a2);
        demonicWingsTail.animation.J(e2);
        uKa.f((double)aSa.V, (double)Tpa.c, (double)psa.q);
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
        DemonicWingsTail demonicWingsTail = jU3;
        jU jU3 = jU2;
        DemonicWingsTail a2 = demonicWingsTail;
        uKa.h();
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, e2);
        uKa.m();
    }

    public DemonicWingsTail() {
        DemonicWingsTail a2;
        DemonicWingsTail demonicWingsTail = a2;
        super(eS.BODY);
        demonicWingsTail.textureWidth = fPa.i;
        demonicWingsTail.textureHeight = fPa.i;
        DemonicWingsTail demonicWingsTail2 = a2;
        demonicWingsTail.root = new Js((ModelBase)a2);
        demonicWingsTail.root.J(vqa.T, JPa.N, TOa.p);
        demonicWingsTail.wings = new Js((ModelBase)a2);
        demonicWingsTail.root.J((cT)a2.wings);
        demonicWingsTail.wing1 = new Js((ModelBase)a2);
        demonicWingsTail.wing1.J(lTa.Z, Bsa.Ha, oQa.z);
        demonicWingsTail.J(demonicWingsTail.wing1, bua.h, mPa.t, iPa.Y);
        demonicWingsTail.wings.J((cT)a2.wing1);
        demonicWingsTail.bone = new Js((ModelBase)a2);
        demonicWingsTail.bone.J(ZSa.r, Asa.p, lqa.G);
        demonicWingsTail.J(demonicWingsTail.bone, gQa.h, JPa.N, JPa.N);
        demonicWingsTail.wing1.J((cT)a2.bone);
        demonicWingsTail.bone.cubeList.add(new AMa((cT)a2.bone, ERa.C, Ypa.A, vPa.b, EQa.G, vqa.T, vRa.d, yRa.d, uqa.g, JPa.N, uSa.E != 0));
        DemonicWingsTail demonicWingsTail3 = a2;
        a2.bone5 = new Js((ModelBase)a2);
        demonicWingsTail3.bone5.J(ROa.B, wsa.b, Mqa.t);
        demonicWingsTail3.wing1.J((cT)a2.bone5);
        demonicWingsTail3.bone2 = new Js((ModelBase)a2);
        demonicWingsTail3.bone2.J(lTa.Z, Bpa.w, dua.ca);
        demonicWingsTail3.J(demonicWingsTail3.bone2, gQa.h, JPa.N, JPa.N);
        demonicWingsTail3.bone5.J((cT)a2.bone2);
        demonicWingsTail3.bone2.cubeList.add(new AMa((cT)a2.bone2, uSa.E, uSa.E, MQa.L, hqa.t, CRa.M, uSa.E, Yqa.i, WOa.fa, JPa.N, uSa.E != 0));
        DemonicWingsTail demonicWingsTail4 = a2;
        a2.bone3 = new Js((ModelBase)a2);
        demonicWingsTail4.bone3.J(rta.o, KQa.L, Ira.d);
        demonicWingsTail4.J(demonicWingsTail4.bone3, gQa.h, JPa.N, JPa.N);
        demonicWingsTail4.bone5.J((cT)a2.bone3);
        demonicWingsTail4.bone3.cubeList.add(new AMa((cT)a2.bone3, uSa.E, lqa.s, JPa.N, Rua.r, PRa.R, uSa.E, uua.p, tTa.h, JPa.N, uSa.E != 0));
        DemonicWingsTail demonicWingsTail5 = a2;
        a2.wing2 = new Js((ModelBase)a2);
        demonicWingsTail5.wing2.J(Jra.S, Bsa.Ha, oQa.z);
        demonicWingsTail5.J(demonicWingsTail5.wing2, bua.h, hqa.Ia, Zta.S);
        demonicWingsTail5.wings.J((cT)a2.wing2);
        demonicWingsTail5.bone7 = new Js((ModelBase)a2);
        demonicWingsTail5.bone7.J(tTa.z, Asa.p, lqa.G);
        demonicWingsTail5.J(demonicWingsTail5.bone7, gQa.h, JPa.N, JPa.N);
        demonicWingsTail5.wing2.J((cT)a2.bone7);
        demonicWingsTail5.bone7.cubeList.add(new AMa((cT)a2.bone7, ERa.C, Ypa.A, vPa.b, EQa.G, vqa.T, vRa.d, yRa.d, uqa.g, JPa.N, vRa.d != 0));
        DemonicWingsTail demonicWingsTail6 = a2;
        a2.bone8 = new Js((ModelBase)a2);
        demonicWingsTail6.bone8.J(NOa.G, wsa.b, Mqa.t);
        demonicWingsTail6.wing2.J((cT)a2.bone8);
        demonicWingsTail6.bone9 = new Js((ModelBase)a2);
        demonicWingsTail6.bone9.J(rta.o, Bpa.w, dua.ca);
        demonicWingsTail6.J(demonicWingsTail6.bone9, gQa.h, JPa.N, JPa.N);
        demonicWingsTail6.bone8.J((cT)a2.bone9);
        demonicWingsTail6.bone9.cubeList.add(new AMa((cT)a2.bone9, uSa.E, uSa.E, vPa.b, hqa.t, CRa.M, uSa.E, Yqa.i, WOa.fa, JPa.N, vRa.d != 0));
        DemonicWingsTail demonicWingsTail7 = a2;
        a2.bone10 = new Js((ModelBase)a2);
        demonicWingsTail7.bone10.J(lTa.Z, KQa.L, Ira.d);
        demonicWingsTail7.J(demonicWingsTail7.bone10, gQa.h, JPa.N, JPa.N);
        demonicWingsTail7.bone8.J((cT)a2.bone10);
        demonicWingsTail7.bone10.cubeList.add(new AMa((cT)a2.bone10, uSa.E, lqa.s, JPa.N, Rua.r, PRa.R, uSa.E, uua.p, tTa.h, JPa.N, vRa.d != 0));
        DemonicWingsTail demonicWingsTail8 = a2;
        a2.demon_tail = new Js((ModelBase)a2);
        demonicWingsTail8.demon_tail.J(pqa.r, TOa.p, pqa.r);
        demonicWingsTail8.root.J((cT)a2.demon_tail);
        demonicWingsTail8.demon_tail.cubeList.add(new AMa((cT)a2.demon_tail, hpa.Z, uqa.g, vqa.T, vqa.T, JPa.N, uqa.g, uqa.g, yRa.d, JPa.N, uSa.E != 0));
        DemonicWingsTail demonicWingsTail9 = a2;
        a2.bone17 = new Js((ModelBase)a2);
        demonicWingsTail9.bone17.J(JPa.N, lTa.Z, RPa.k);
        demonicWingsTail9.demon_tail.J((cT)a2.bone17);
        demonicWingsTail9.bone16 = new Js((ModelBase)a2);
        demonicWingsTail9.bone16.J(JPa.N, JPa.N, XTa.U);
        demonicWingsTail9.bone17.J((cT)a2.bone16);
        demonicWingsTail9.bone14 = new Js((ModelBase)a2);
        demonicWingsTail9.bone14.J(JPa.N, JPa.N, YSa.G);
        demonicWingsTail9.bone16.J((cT)a2.bone14);
        demonicWingsTail9.bone13 = new Js((ModelBase)a2);
        demonicWingsTail9.bone13.J(JPa.N, vPa.b, vPa.b);
        demonicWingsTail9.bone14.J((cT)a2.bone13);
        demonicWingsTail9.bone13.cubeList.add(new AMa((cT)a2.bone13, uSa.E, uSa.E, Ppa.Ha, MQa.L, Ira.d, tTa.h, uSa.E, tTa.h, JPa.N, uSa.E != 0));
        DemonicWingsTail demonicWingsTail10 = a2;
        a2.bone15 = new Js((ModelBase)a2);
        demonicWingsTail10.bone15.J(JPa.N, JPa.N, EQa.G);
        demonicWingsTail10.bone14.J((cT)a2.bone15);
        demonicWingsTail10.bone15.cubeList.add(new AMa((cT)a2.bone15, AQa.P, tTa.h, FRa.ca, JPa.N, Jta.r, yRa.d, uSa.E, uqa.g, JPa.N, uSa.E != 0));
        DemonicWingsTail demonicWingsTail11 = a2;
        a2.bone12 = new Js((ModelBase)a2);
        demonicWingsTail11.bone12.J(JPa.N, JPa.N, vPa.b);
        demonicWingsTail11.bone16.J((cT)a2.bone12);
        demonicWingsTail11.bone12.cubeList.add(new AMa((cT)a2.bone12, uSa.E, tTa.h, vPa.b, JPa.N, MQa.L, vRa.d, uSa.E, AQa.P, JPa.N, uSa.E != 0));
        DemonicWingsTail demonicWingsTail12 = a2;
        a2.bone11 = new Js((ModelBase)a2);
        demonicWingsTail12.bone11.J(JPa.N, JPa.N, lTa.Z);
        demonicWingsTail12.bone17.J((cT)a2.bone11);
        demonicWingsTail12.bone11.cubeList.add(new AMa((cT)a2.bone11, NTa.C, uSa.E, vPa.b, JPa.N, MQa.L, vRa.d, uSa.E, tTa.h, JPa.N, uSa.E != 0));
        super.J(new ResourceLocation(Cra.V, EQa.ja));
        a2.animation = new ju(new ResourceLocation(Cra.V, LQa.Ka)).J(Fsa.P, (MDModel)a2);
    }
}

