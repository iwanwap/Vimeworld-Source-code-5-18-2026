/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  Lra
 *  NPa
 *  NQa
 *  Oz
 *  kpa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  yQa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class SlimePet
extends BasePet {
    private final Js mouth;
    private final Js rightEye;
    private final Js leftEye;
    private final Js small;
    private final Js slime;

    public SlimePet() {
        SlimePet a2;
        SlimePet slimePet = a2;
        slimePet.textureWidth = ysa.s;
        slimePet.textureHeight = fPa.i;
        slimePet.useDisplayLists = vRa.d;
        SlimePet slimePet2 = a2;
        slimePet.slime = new Js((ModelBase)a2, uSa.E, uSa.E);
        slimePet.slime.J(NQa.m, NQa.m, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        SlimePet slimePet3 = a2;
        slimePet3.small = new Js((ModelBase)slimePet3, uSa.E, ERa.C);
        slimePet3.small.J(TOa.p, TOa.p, TOa.p, uua.p, uua.p, uua.p);
        SlimePet slimePet4 = a2;
        slimePet4.mouth = new Js((ModelBase)slimePet4, fPa.i, Yqa.i);
        slimePet4.mouth.J(JPa.N, pqa.r, yQa.T, vRa.d, vRa.d, vRa.d);
        SlimePet slimePet5 = a2;
        slimePet5.leftEye = new Js((ModelBase)slimePet5, fPa.i, uSa.E);
        slimePet5.leftEye.J(NPa.B, dua.ca, yQa.T, uqa.g, uqa.g, uqa.g);
        SlimePet slimePet6 = a2;
        slimePet6.rightEye = new Js((ModelBase)slimePet6, fPa.i, uSa.E);
        slimePet6.rightEye.J(yQa.T, dua.ca, yQa.T, uqa.g, uqa.g, uqa.g);
        a2.J(new ResourceLocation(Cra.V, Yua.x));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        SlimePet a2 = this;
        uKa.f((int)Lra.k, (int)kpa.J);
        uKa.B();
        uKa.l((float)rRa.C, (float)rRa.C, (float)rRa.C);
        super.J(b2);
        uKa.k();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void a2;
        Object d22 = sx2;
        SlimePet b2 = this;
        float c2 = Oz.d((float)(a2 * TOa.r)) * WRa.e;
        float d22 = Oz.d((float)(a2 * psa.N)) * Yqa.C + Ira.d;
        uKa.J((float)Ora.D, (float)(vPa.b + c2), (float)Xpa.R);
        float f3 = d22;
        uKa.l((float)f3, (float)(d22 + c2 * vQa.q), (float)f3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void b2;
        void c2;
        void d2;
        SlimePet slimePet = this;
        float e2 = uKa.G.J;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)(e2 * xSa.la));
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)e2);
    }
}

