/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  ISa
 *  JPa
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  YSa
 *  cQa
 *  cT
 *  kta
 *  lqa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  wra
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public class ModelVillager
extends ModelBase {
    public cT rightVillagerLeg;
    public cT villagerNose;
    public cT leftVillagerLeg;
    public cT villagerArms;
    public cT villagerBody;
    public cT villagerHead;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g;
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelVillager a2;
        float f9 = f7;
        ModelVillager modelVillager = a2 = this;
        modelVillager.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h, (vL)g);
        modelVillager.villagerHead.C((float)h);
        modelVillager.villagerBody.C((float)h);
        modelVillager.rightVillagerLeg.C((float)h);
        modelVillager.leftVillagerLeg.C((float)h);
        modelVillager.villagerArms.C((float)h);
    }

    /*
     * WARNING - void declaration
     */
    public ModelVillager(float f2, float f3, int n2, int n3) {
        void c2;
        void a2;
        void b2;
        ModelVillager d2;
        float e2 = f2;
        ModelVillager modelVillager = d2 = this;
        modelVillager.villagerHead = new cT((ModelBase)d2).J((int)b2, (int)a2);
        d2.villagerHead.J(JPa.N, JPa.N + c2, JPa.N);
        modelVillager.villagerHead.f(uSa.E, uSa.E).J(NQa.m, Cra.fa, NQa.m, Yqa.i, NTa.C, Yqa.i, e2);
        modelVillager.villagerNose = new cT((ModelBase)d2).J((int)b2, (int)a2);
        modelVillager.villagerNose.J(JPa.N, (float)(c2 - kta.v), JPa.N);
        modelVillager.villagerNose.f(osa.c, uSa.E).J(vqa.T, vqa.T, NSa.b, uqa.g, AQa.P, uqa.g, e2);
        modelVillager.villagerHead.J(d2.villagerNose);
        modelVillager.villagerBody = new cT((ModelBase)d2).J((int)b2, (int)a2);
        modelVillager.villagerBody.J(JPa.N, JPa.N + c2, JPa.N);
        modelVillager.villagerBody.f(ERa.C, kTa.j).J(NQa.m, JPa.N, TOa.p, Yqa.i, lqa.s, uua.p, e2);
        modelVillager.villagerBody.f(uSa.E, ISa.E).J(NQa.m, JPa.N, TOa.p, Yqa.i, yOa.B, uua.p, e2 + MQa.L);
        modelVillager.villagerArms = new cT((ModelBase)d2).J((int)b2, (int)a2);
        modelVillager.villagerArms.J(JPa.N, JPa.N + c2 + kta.v, JPa.N);
        modelVillager.villagerArms.f(Yqa.D, cQa.o).J(sOa.Z, dua.ca, dua.ca, AQa.P, Yqa.i, AQa.P, e2);
        modelVillager.villagerArms.f(Yqa.D, cQa.o).J(YSa.G, dua.ca, dua.ca, AQa.P, Yqa.i, AQa.P, e2);
        modelVillager.villagerArms.f(wra.P, ISa.E).J(NQa.m, kta.v, dua.ca, Yqa.i, AQa.P, AQa.P, e2);
        modelVillager.rightVillagerLeg = new cT((ModelBase)d2, uSa.E, cQa.o).J((int)b2, (int)a2);
        modelVillager.rightVillagerLeg.J(dua.ca, Fua.Y + c2, JPa.N);
        modelVillager.rightVillagerLeg.J(dua.ca, JPa.N, dua.ca, AQa.P, lqa.s, AQa.P, e2);
        modelVillager.leftVillagerLeg = new cT((ModelBase)d2, uSa.E, cQa.o).J((int)b2, (int)a2);
        modelVillager.leftVillagerLeg.mirror = vRa.d;
        modelVillager.leftVillagerLeg.J(kta.v, Fua.Y + c2, JPa.N);
        modelVillager.leftVillagerLeg.J(dua.ca, JPa.N, dua.ca, AQa.P, lqa.s, AQa.P, e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void g;
        void c2;
        void d2;
        ModelVillager f8;
        float h = f3;
        ModelVillager modelVillager = f8 = this;
        modelVillager.villagerHead.rotateAngleY = d2 / zpa.Z;
        modelVillager.villagerHead.rotateAngleX = c2 / zpa.Z;
        modelVillager.villagerArms.rotationPointY = vQa.q;
        modelVillager.villagerArms.rotationPointZ = vqa.T;
        modelVillager.villagerArms.rotateAngleX = zpa.ja;
        modelVillager.rightVillagerLeg.rotateAngleX = Oz.C((float)(g * Zra.u)) * NPa.B * h * MQa.L;
        modelVillager.leftVillagerLeg.rotateAngleX = Oz.C((float)(g * Zra.u + pua.j)) * NPa.B * h * MQa.L;
        modelVillager.rightVillagerLeg.rotateAngleY = JPa.N;
        modelVillager.leftVillagerLeg.rotateAngleY = JPa.N;
    }

    public ModelVillager(float f2) {
        float b2 = f2;
        ModelVillager a2 = this;
        a2(b2, JPa.N, ysa.s, ysa.s);
    }
}

