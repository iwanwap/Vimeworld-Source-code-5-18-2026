/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  MQa
 *  NPa
 *  NQa
 *  Oz
 *  YSa
 *  cT
 *  kta
 *  lqa
 *  pua
 *  vL
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelCreeper
extends ModelBase {
    public cT creeperArmor;
    public cT leg1;
    public cT leg4;
    public cT body;
    public cT leg2;
    public cT head;
    public cT leg3;

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
        ModelCreeper a2;
        float f9 = f7;
        ModelCreeper modelCreeper = a2 = this;
        modelCreeper.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h, (vL)g);
        modelCreeper.head.C((float)h);
        modelCreeper.body.C((float)h);
        modelCreeper.leg1.C((float)h);
        modelCreeper.leg2.C((float)h);
        modelCreeper.leg3.C((float)h);
        modelCreeper.leg4.C((float)h);
    }

    /*
     * WARNING - void declaration
     */
    public ModelCreeper(float f2) {
        void a2;
        ModelCreeper modelCreeper;
        ModelCreeper modelCreeper2 = modelCreeper = this;
        int b2 = uua.p;
        modelCreeper2.head = new cT((ModelBase)modelCreeper, uSa.E, uSa.E);
        modelCreeper.head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, (float)a2);
        modelCreeper2.head.J(JPa.N, (float)b2, JPa.N);
        modelCreeper2.creeperArmor = new cT((ModelBase)modelCreeper, fPa.i, uSa.E);
        modelCreeper2.creeperArmor.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, (float)(a2 + MQa.L));
        modelCreeper2.creeperArmor.J(JPa.N, (float)b2, JPa.N);
        modelCreeper2.body = new cT((ModelBase)modelCreeper, ERa.C, ERa.C);
        modelCreeper2.body.J(NQa.m, JPa.N, dua.ca, Yqa.i, lqa.s, AQa.P, (float)a2);
        modelCreeper2.body.J(JPa.N, (float)b2, JPa.N);
        modelCreeper2.leg1 = new cT((ModelBase)modelCreeper, uSa.E, ERa.C);
        modelCreeper2.leg1.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, (float)a2);
        modelCreeper2.leg1.J(dua.ca, (float)(lqa.s + b2), YSa.G);
        modelCreeper2.leg2 = new cT((ModelBase)modelCreeper, uSa.E, ERa.C);
        modelCreeper2.leg2.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, (float)a2);
        modelCreeper2.leg2.J(kta.v, (float)(lqa.s + b2), YSa.G);
        modelCreeper2.leg3 = new cT((ModelBase)modelCreeper, uSa.E, ERa.C);
        modelCreeper2.leg3.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, (float)a2);
        modelCreeper2.leg3.J(dua.ca, (float)(lqa.s + b2), NQa.m);
        modelCreeper2.leg4 = new cT((ModelBase)modelCreeper, uSa.E, ERa.C);
        modelCreeper2.leg4.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, (float)a2);
        modelCreeper2.leg4.J(kta.v, (float)(lqa.s + b2), NQa.m);
    }

    public ModelCreeper() {
        a2(JPa.N);
        ModelCreeper a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void g;
        void c2;
        void d2;
        ModelCreeper f8;
        float h = f3;
        ModelCreeper modelCreeper = f8 = this;
        modelCreeper.head.rotateAngleY = d2 / zpa.Z;
        modelCreeper.head.rotateAngleX = c2 / zpa.Z;
        modelCreeper.leg1.rotateAngleX = Oz.C((float)(g * Zra.u)) * NPa.B * h;
        modelCreeper.leg2.rotateAngleX = Oz.C((float)(g * Zra.u + pua.j)) * NPa.B * h;
        modelCreeper.leg3.rotateAngleX = Oz.C((float)(g * Zra.u + pua.j)) * NPa.B * h;
        modelCreeper.leg4.rotateAngleX = Oz.C((float)(g * Zra.u)) * NPa.B * h;
    }
}

