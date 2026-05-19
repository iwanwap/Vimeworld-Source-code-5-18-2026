/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  Lqa
 *  MQa
 *  NPa
 *  NQa
 *  QSa
 *  bpa
 *  cT
 *  ju
 *  kta
 *  lqa
 *  psa
 *  uKa
 *  vQa
 *  vRa
 *  wra
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MDModel;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class PlayerNewPet
extends BasePet {
    private final Js bone3;
    private final Js bone7;
    private final Js bone2;
    private final xB animation;
    private final Js bone6;
    private final Js bone;
    private final Js bone4;
    private final Js bone5;

    public PlayerNewPet() {
        PlayerNewPet a2;
        PlayerNewPet playerNewPet = a2;
        playerNewPet.textureWidth = ysa.s;
        playerNewPet.textureHeight = ysa.s;
        PlayerNewPet playerNewPet2 = a2;
        playerNewPet.bone7 = new Js((ModelBase)a2);
        playerNewPet.bone2 = new Js((ModelBase)a2);
        playerNewPet.bone2.J(JPa.N, vQa.q, JPa.N);
        playerNewPet.bone7.J((cT)a2.bone2);
        playerNewPet.bone2.cubeList.add(new AMa((cT)a2.bone2, ERa.C, ERa.C, NQa.m, csa.P, dua.ca, Yqa.i, lqa.s, AQa.P, JPa.N, uSa.E != 0));
        a2.bone2.cubeList.add(new AMa((cT)a2.bone2, ERa.C, fPa.i, NQa.m, csa.P, dua.ca, Yqa.i, lqa.s, AQa.P, MQa.L, uSa.E != 0));
        PlayerNewPet playerNewPet3 = a2;
        a2.bone4 = new Js((ModelBase)a2);
        playerNewPet3.bone4.J(kta.v, kta.v, JPa.N);
        playerNewPet3.bone2.J((cT)a2.bone4);
        playerNewPet3.bone4.cubeList.add(new AMa((cT)a2.bone4, ERa.C, QSa.p, dua.ca, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, JPa.N, uSa.E != 0));
        a2.bone4.cubeList.add(new AMa((cT)a2.bone4, uSa.E, QSa.p, dua.ca, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, bpa.K, uSa.E != 0));
        PlayerNewPet playerNewPet4 = a2;
        a2.bone3 = new Js((ModelBase)a2);
        playerNewPet4.bone3.J(dua.ca, kta.v, JPa.N);
        playerNewPet4.bone2.J((cT)a2.bone3);
        playerNewPet4.bone3.cubeList.add(new AMa((cT)a2.bone3, uSa.E, ERa.C, dua.ca, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, JPa.N, uSa.E != 0));
        a2.bone3.cubeList.add(new AMa((cT)a2.bone3, uSa.E, fPa.i, dua.ca, dua.ca, dua.ca, AQa.P, lqa.s, AQa.P, bpa.K, uSa.E != 0));
        PlayerNewPet playerNewPet5 = a2;
        a2.bone6 = new Js((ModelBase)a2);
        playerNewPet5.bone6.J(CRa.M, Cra.fa, JPa.N);
        playerNewPet5.bone2.J((cT)a2.bone6);
        playerNewPet5.bone6.cubeList.add(new AMa((cT)a2.bone6, fPa.i, QSa.p, dua.ca, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, JPa.N, vRa.d != 0));
        a2.bone6.cubeList.add(new AMa((cT)a2.bone6, QSa.p, QSa.p, dua.ca, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, bpa.K, vRa.d != 0));
        PlayerNewPet playerNewPet6 = a2;
        a2.bone5 = new Js((ModelBase)a2);
        playerNewPet6.bone5.J(lqa.ga, Cra.fa, JPa.N);
        playerNewPet6.bone2.J((cT)a2.bone5);
        playerNewPet6.bone5.cubeList.add(new AMa((cT)a2.bone5, wra.P, ERa.C, dua.ca, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, JPa.N, vRa.d != 0));
        a2.bone5.cubeList.add(new AMa((cT)a2.bone5, wra.P, fPa.i, dua.ca, dua.ca, dua.ca, yRa.d, lqa.s, AQa.P, bpa.K, vRa.d != 0));
        PlayerNewPet playerNewPet7 = a2;
        a2.bone = new Js((ModelBase)a2);
        playerNewPet7.bone.J(JPa.N, Lqa.C, JPa.N);
        playerNewPet7.bone.cubeList.add(new AMa((cT)a2.bone, uSa.E, uSa.E, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, JPa.N, uSa.E != 0));
        a2.bone.cubeList.add(new AMa((cT)a2.bone, fPa.i, uSa.E, NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, bpa.K, uSa.E != 0));
        a2.animation = new ju(new ResourceLocation(Cra.V, vTa.J)).J(yRa.Ma, (MDModel)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        float e2 = f2;
        PlayerNewPet b2 = this;
        uKa.l((float)MQa.L, (float)MQa.L, (float)MQa.L);
        uKa.J((float)NPa.B, (float)JPa.N, (float)psa.N);
        PlayerNewPet playerNewPet = b2;
        playerNewPet.animation.J(e2);
        uKa.h();
        super.J((ModelPlayer)d2, (Sx)c2, e2, (jU)a2);
        uKa.m();
    }

    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        Object e2 = sx2;
        PlayerNewPet c2 = this;
        if (!(e2 instanceof XW)) {
            return;
        }
        ResourceLocation d2 = ((XW)((Object)e2)).J();
        c2.J(d2);
    }
}

