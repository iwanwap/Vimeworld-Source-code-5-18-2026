/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  BRa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  YSa
 *  aqa
 *  bpa
 *  cQa
 *  cT
 *  ju
 *  kta
 *  pqa
 *  uKa
 *  vPa
 *  vQa
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

public final class SheepPig
extends BasePet {
    private final Js Head;
    private final xB animation;
    private final Js Nose;
    private final Js Sheep;
    private final Js RFLeg;
    private final Js RBLeg;
    private final Js LFLeg;
    private final Js LBLeg;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        void a2;
        ModelBase d2 = modelPlayer;
        SheepPig c2 = this;
        float b2 = Oz.d((float)(a2 * TOa.r)) * WRa.e;
        uKa.J((float)ZSa.q, (float)(ATa.x + b2), (float)bpa.K);
        uKa.l((float)ATa.r, (float)ATa.r, (float)ATa.r);
        SheepPig sheepPig = c2;
        sheepPig.Head.rotationY = ((ModelPlayer)d2).bipedHead.rotateAngleY;
        sheepPig.Head.rotationX = ((ModelPlayer)d2).bipedHead.rotateAngleX / kta.v;
        sheepPig.Head.rotationZ = ((ModelPlayer)d2).bipedHead.rotateAngleZ;
        sheepPig.LFLeg.rotationX = ((ModelPlayer)d2).bipedLeftLeg.rotateAngleX / YSa.G;
        sheepPig.RFLeg.rotationX = ((ModelPlayer)d2).bipedRightLeg.rotateAngleX / YSa.G;
        sheepPig.LBLeg.rotationX = c2.RFLeg.rotationX;
        sheepPig.RBLeg.rotationX = c2.LFLeg.rotationX;
        if (((ModelPlayer)d2).isSneak) {
            c2.animation.J((float)a2, Yqa.C);
        }
        c2.animation.J((float)a2, FRa.Ga);
    }

    public SheepPig() {
        SheepPig a2;
        SheepPig sheepPig = a2;
        sheepPig.textureWidth = ysa.s;
        sheepPig.textureHeight = fPa.i;
        SheepPig sheepPig2 = a2;
        sheepPig.Sheep = new Js((ModelBase)a2);
        sheepPig.Sheep.cubeList.add(new AMa((cT)a2.Sheep, ERa.C, NTa.C, NQa.m, Lsa.A, sOa.Z, Yqa.i, uua.p, ERa.C, NPa.L, vRa.d != 0));
        SheepPig sheepPig3 = a2;
        a2.RBLeg = new Js((ModelBase)a2);
        sheepPig3.RBLeg.J(TOa.p, NQa.d, BRa.k);
        sheepPig3.Sheep.J((cT)a2.RBLeg);
        sheepPig3.RBLeg.cubeList.add(new AMa((cT)a2.RBLeg, fPa.i, uua.s, dua.ca, vqa.T, dua.ca, AQa.P, uua.p, AQa.P, MQa.L, vRa.d != 0));
        a2.RBLeg.cubeList.add(new AMa((cT)a2.RBLeg, uSa.E, cQa.o, dua.ca, pqa.r, dua.ca, AQa.P, uua.p, AQa.P, JPa.N, vRa.d != 0));
        SheepPig sheepPig4 = a2;
        a2.LBLeg = new Js((ModelBase)a2);
        sheepPig4.LBLeg.J(vQa.q, NQa.d, BRa.k);
        sheepPig4.Sheep.J((cT)a2.LBLeg);
        sheepPig4.LBLeg.cubeList.add(new AMa((cT)a2.LBLeg, fPa.i, uua.s, dua.ca, vqa.T, dua.ca, AQa.P, uua.p, AQa.P, MQa.L, vRa.d != 0));
        a2.LBLeg.cubeList.add(new AMa((cT)a2.LBLeg, uSa.E, cQa.o, dua.ca, pqa.r, dua.ca, AQa.P, uua.p, AQa.P, JPa.N, uSa.E != 0));
        SheepPig sheepPig5 = a2;
        a2.RFLeg = new Js((ModelBase)a2);
        sheepPig5.RFLeg.J(TOa.p, NQa.d, CRa.M);
        sheepPig5.Sheep.J((cT)a2.RFLeg);
        sheepPig5.RFLeg.cubeList.add(new AMa((cT)a2.RFLeg, fPa.i, uua.s, dua.ca, vqa.T, dua.ca, AQa.P, uua.p, AQa.P, MQa.L, vRa.d != 0));
        a2.RFLeg.cubeList.add(new AMa((cT)a2.RFLeg, uSa.E, cQa.o, dua.ca, pqa.r, dua.ca, AQa.P, uua.p, AQa.P, JPa.N, vRa.d != 0));
        SheepPig sheepPig6 = a2;
        a2.LFLeg = new Js((ModelBase)a2);
        sheepPig6.LFLeg.J(vQa.q, NQa.d, CRa.M);
        sheepPig6.Sheep.J((cT)a2.LFLeg);
        sheepPig6.LFLeg.cubeList.add(new AMa((cT)a2.LFLeg, fPa.i, uua.s, dua.ca, vqa.T, dua.ca, AQa.P, uua.p, AQa.P, MQa.L, vRa.d != 0));
        a2.LFLeg.cubeList.add(new AMa((cT)a2.LFLeg, uSa.E, cQa.o, dua.ca, pqa.r, dua.ca, AQa.P, uua.p, AQa.P, JPa.N, uSa.E != 0));
        SheepPig sheepPig7 = a2;
        a2.Head = new Js((ModelBase)a2);
        sheepPig7.Head.J(JPa.N, Lsa.A, sOa.Z);
        sheepPig7.Sheep.J((cT)a2.Head);
        sheepPig7.Head.cubeList.add(new AMa((cT)a2.Head, uSa.E, uSa.E, NQa.m, CRa.M, NQa.d, Yqa.i, Yqa.i, Yqa.i, vqa.T, vRa.d != 0));
        a2.Head.cubeList.add(new AMa((cT)a2.Head, Fsa.d, kTa.j, TOa.p, NQa.m, NQa.m, uua.p, uua.p, uua.p, Ora.D, vRa.d != 0));
        SheepPig sheepPig8 = a2;
        a2.Nose = new Js((ModelBase)a2);
        sheepPig8.Nose.J(JPa.N, bsa.la, Qsa.k);
        sheepPig8.Head.J((cT)a2.Nose);
        sheepPig8.Nose.cubeList.add(new AMa((cT)a2.Nose, yOa.B, yOa.B, dua.ca, aqa.Ka, DPa.m, AQa.P, yRa.d, uqa.g, vPa.b, uSa.E != 0));
        SheepPig sheepPig9 = a2;
        sheepPig9.RBLeg.J(vRa.d != 0);
        sheepPig9.LBLeg.J(vRa.d != 0);
        sheepPig9.RFLeg.J(vRa.d != 0);
        sheepPig9.LFLeg.J(vRa.d != 0);
        sheepPig9.Head.J(vRa.d != 0);
        sheepPig9.animation = new ju(new ResourceLocation(Cra.V, XOa.p)).J(LPa.U, (MDModel)a2);
        sheepPig9.J(new ResourceLocation(Cra.V, wOa.B));
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        SheepPig a2 = this;
        uKa.J((float)JPa.N, (float)rta.o, (float)JPa.N);
        uKa.l((float)ZSa.q, (float)ZSa.q, (float)ZSa.q);
        a2.Head.rotationX = JPa.N;
        a2.Head.rotationY = JPa.N;
        a2.Head.rotationZ = JPa.N;
        super.J(b2);
    }
}

