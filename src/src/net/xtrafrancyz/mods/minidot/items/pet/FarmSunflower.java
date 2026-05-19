/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Cra
 *  Cu
 *  ERa
 *  Epa
 *  FTa
 *  JPa
 *  Js
 *  Lra
 *  NQa
 *  Oz
 *  Pqa
 *  Qsa
 *  VQa
 *  Wsa
 *  XSa
 *  XTa
 *  Xsa
 *  Ypa
 *  ZRa
 *  aPa
 *  aQa
 *  aSa
 *  cT
 *  ju
 *  qta
 *  uKa
 *  uQa
 *  vPa
 *  vRa
 *  vpa
 *  wOa
 *  wra
 *  xOa
 *  yQa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class FarmSunflower
extends BasePet {
    private final Js bone4;
    private final Js bone;
    private final Js bone7;
    private final Js bone5;
    private final Js bone12;
    private final Js bone2;
    private final Js bone10;
    private final Js bone9;
    private final xB animation;
    private final Js bone6;
    private final Js bone13;
    private final Js bone8;
    private final xB secretAnimation;
    private final Js bone11;
    private final Js bone3;
    private final Js bone14;

    @Override
    public void J(float f2) {
        FarmSunflower a2;
        float b2 = f2;
        FarmSunflower farmSunflower = a2 = this;
        farmSunflower.animation.J(b2);
        uKa.f((double)aSa.V, (double)aQa.r, (double)aSa.V);
        super.J(b2);
    }

    public static /* synthetic */ void f(Js a2) {
        Js js2 = a2;
        js2.rotationX = JPa.N;
        js2.rotationY = JPa.N;
        js2.rotationZ = JPa.N;
    }

    public FarmSunflower() {
        FarmSunflower farmSunflower;
        FarmSunflower farmSunflower2 = farmSunflower = this;
        farmSunflower2.textureWidth = fPa.i;
        farmSunflower2.textureHeight = fPa.i;
        FarmSunflower farmSunflower3 = farmSunflower;
        farmSunflower2.bone = new Js((ModelBase)farmSunflower);
        farmSunflower2.bone.cubeList.add(new AMa((cT)farmSunflower.bone, uSa.E, WOa.fa, TOa.p, CRa.M, TOa.p, uua.p, tTa.h, uua.p, JPa.N, uSa.E != 0));
        farmSunflower.bone.cubeList.add(new AMa((cT)farmSunflower.bone, uSa.E, uSa.E, Ura.T, NQa.d, Ura.T, XTa.W, uqa.g, XTa.W, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower4 = farmSunflower;
        farmSunflower.bone2 = new Js((ModelBase)farmSunflower);
        farmSunflower4.bone2.J(lTa.Z, gua.T, rta.o);
        farmSunflower4.J(farmSunflower4.bone2, JPa.N, JPa.N, Wsa.z);
        farmSunflower4.bone.J((cT)farmSunflower.bone2);
        farmSunflower4.bone2.cubeList.add(new AMa((cT)farmSunflower.bone2, uSa.E, uSa.E, vPa.b, NSa.b, vPa.b, vRa.d, uua.p, vRa.d, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower5 = farmSunflower;
        farmSunflower.bone10 = new Js((ModelBase)farmSunflower);
        farmSunflower5.bone10.J(JPa.N, CRa.M, vTa.N);
        farmSunflower5.J(farmSunflower5.bone10, XOa.ja, ZRa.c, aPa.Ga);
        farmSunflower5.bone2.J((cT)farmSunflower.bone10);
        farmSunflower5.bone10.cubeList.add(new AMa((cT)farmSunflower.bone10, Yqa.i, ERa.C, LRa.ga, vpa.j, APa.Ka, uSa.E, yRa.d, AQa.P, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower6 = farmSunflower;
        farmSunflower.bone11 = new Js((ModelBase)farmSunflower);
        farmSunflower6.bone11.J(lTa.Z, Psa.Ja, Yqa.C);
        farmSunflower6.J(farmSunflower6.bone11, fqa.m, aSa.H, Bta.i);
        farmSunflower6.bone2.J((cT)farmSunflower.bone11);
        farmSunflower6.bone11.cubeList.add(new AMa((cT)farmSunflower.bone11, uSa.E, ERa.C, Ypa.B, qta.c, hpa.p, uSa.E, yRa.d, AQa.P, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower7 = farmSunflower;
        farmSunflower.bone3 = new Js((ModelBase)farmSunflower);
        farmSunflower7.bone3.J(JPa.N, xOa.T, JPa.N);
        farmSunflower7.J(farmSunflower7.bone3, ZSa.ja, JPa.N, gQa.h);
        farmSunflower7.bone2.J((cT)farmSunflower.bone3);
        farmSunflower7.bone3.cubeList.add(new AMa((cT)farmSunflower.bone3, uSa.E, WOa.fa, vPa.b, NQa.m, vPa.b, vRa.d, AQa.P, vRa.d, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower8 = farmSunflower;
        farmSunflower.bone4 = new Js((ModelBase)farmSunflower);
        farmSunflower8.bone4.J(FRa.ca, yQa.t, vPa.b);
        farmSunflower8.J(farmSunflower8.bone4, JPa.N, JPa.N, Epa.x);
        farmSunflower8.bone2.J((cT)farmSunflower.bone4);
        farmSunflower8.bone4.cubeList.add(new AMa((cT)farmSunflower.bone4, yOa.B, WOa.fa, rQa.ca, XSa.l, Xpa.t, yRa.d, yRa.d, uqa.g, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower9 = farmSunflower;
        farmSunflower.bone5 = new Js((ModelBase)farmSunflower);
        farmSunflower9.bone5.J(xSa.c, XSa.l, vPa.b);
        farmSunflower9.J(farmSunflower9.bone5, Wsa.z, JPa.N, JPa.N);
        farmSunflower9.bone4.J((cT)farmSunflower.bone5);
        farmSunflower9.bone5.cubeList.add(new AMa((cT)farmSunflower.bone5, osa.c, hpa.Z, dua.ca, CRa.M, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower10 = farmSunflower;
        farmSunflower.bone8 = new Js((ModelBase)farmSunflower);
        farmSunflower10.bone8.J(xSa.c, uQa.T, vPa.b);
        farmSunflower10.J(farmSunflower10.bone8, LRa.r, JPa.N, JPa.N);
        farmSunflower10.bone4.J((cT)farmSunflower.bone8);
        farmSunflower10.bone8.cubeList.add(new AMa((cT)farmSunflower.bone8, wOa.h, uSa.E, dua.ca, JPa.N, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower11 = farmSunflower;
        farmSunflower.bone9 = new Js((ModelBase)farmSunflower);
        farmSunflower11.bone9.J(tSa.h, Lra.u, zpa.ja);
        farmSunflower11.J(farmSunflower11.bone9, LRa.r, JPa.N, Gta.G);
        farmSunflower11.bone4.J((cT)farmSunflower.bone9);
        farmSunflower11.bone9.cubeList.add(new AMa((cT)farmSunflower.bone9, ERa.C, kTa.j, dua.ca, JPa.N, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower12 = farmSunflower;
        farmSunflower.bone12 = new Js((ModelBase)farmSunflower);
        farmSunflower12.bone12.J(Era.f, Lra.u, zpa.ja);
        farmSunflower12.J(farmSunflower12.bone12, LRa.r, JPa.N, eta.P);
        farmSunflower12.bone4.J((cT)farmSunflower.bone12);
        farmSunflower12.bone12.cubeList.add(new AMa((cT)farmSunflower.bone12, ERa.C, kTa.j, dua.ca, JPa.N, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, vRa.d != 0));
        FarmSunflower farmSunflower13 = farmSunflower;
        farmSunflower.bone6 = new Js((ModelBase)farmSunflower);
        farmSunflower13.bone6.J(tSa.h, BPa.Ga, vPa.b);
        farmSunflower13.J(farmSunflower13.bone6, JPa.N, JPa.N, Pqa.z);
        farmSunflower13.bone4.J((cT)farmSunflower.bone6);
        farmSunflower13.bone6.cubeList.add(new AMa((cT)farmSunflower.bone6, Yqa.i, AQa.ba, dua.ca, CRa.M, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower14 = farmSunflower;
        farmSunflower.bone13 = new Js((ModelBase)farmSunflower);
        farmSunflower14.bone13.J(Era.f, BPa.Ga, vPa.b);
        farmSunflower14.J(farmSunflower14.bone13, JPa.N, JPa.N, Qsa.M);
        farmSunflower14.bone4.J((cT)farmSunflower.bone13);
        farmSunflower14.bone13.cubeList.add(new AMa((cT)farmSunflower.bone13, Yqa.i, AQa.ba, dua.ca, CRa.M, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, vRa.d != 0));
        FarmSunflower farmSunflower15 = farmSunflower;
        farmSunflower.bone7 = new Js((ModelBase)farmSunflower);
        farmSunflower15.bone7.J(tSa.h, EPa.W, vPa.b);
        farmSunflower15.J(farmSunflower15.bone7, JPa.N, JPa.N, Qsa.M);
        farmSunflower15.bone4.J((cT)farmSunflower.bone7);
        farmSunflower15.bone7.cubeList.add(new AMa((cT)farmSunflower.bone7, uSa.E, AQa.ba, dua.ca, JPa.N, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, uSa.E != 0));
        FarmSunflower farmSunflower16 = farmSunflower;
        farmSunflower.bone14 = new Js((ModelBase)farmSunflower);
        farmSunflower16.bone14.J(Era.f, EPa.W, vPa.b);
        farmSunflower16.J(farmSunflower16.bone14, JPa.N, JPa.N, Pqa.z);
        farmSunflower16.bone4.J((cT)farmSunflower.bone14);
        farmSunflower16.bone14.cubeList.add(new AMa((cT)farmSunflower.bone14, uSa.E, AQa.ba, dua.ca, JPa.N, JPa.N, AQa.P, tTa.h, uSa.E, JPa.N, vRa.d != 0));
        super.J(new ResourceLocation(Cra.V, FTa.h));
        FarmSunflower a2 = new ju(new ResourceLocation(Cra.V, VQa.O));
        farmSunflower.animation = a2.J(Jpa.F, farmSunflower);
        farmSunflower.secretAnimation = a2.J(wra.X, farmSunflower);
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
        FarmSunflower farmSunflower = jU3;
        jU jU3 = jU2;
        FarmSunflower a2 = farmSunflower;
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
        void d22;
        FarmSunflower b2;
        float e2 = f2;
        FarmSunflower farmSunflower = b2 = this;
        super.f((ModelPlayer)d22, (Sx)c2, e2, (jU)a2);
        float f3 = e2;
        farmSunflower.animation.J(f3);
        float d22 = Oz.d((float)(f3 * Nra.e)) * Yqa.C;
        uKa.f((double)JPa.ja, (double)(Xsa.i + (double)d22), (double)tpa.k);
        double d3 = Tqa.ja;
        uKa.J((double)d3, (double)d3, (double)d3);
        if (c2.q()) {
            if (b2.animation.J()) {
                b2.animation.J();
            }
            b2.secretAnimation.J(e2);
            return;
        }
        FarmSunflower farmSunflower2 = b2;
        farmSunflower2.secretAnimation.J();
        farmSunflower2.J(Cu.J());
        farmSunflower2.animation.J(e2);
    }
}

