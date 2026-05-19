/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  ERa
 *  Gl
 *  JPa
 *  MQa
 *  NPa
 *  NQa
 *  ZFa
 *  cT
 *  kPa
 *  kta
 *  lqa
 *  vL
 *  vQa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelQuadruped;

public final class ModelSheep1
extends ModelQuadruped {
    private float headRotationAngleX;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        ModelSheep1 h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g2;
        ModelSheep1 modelSheep1 = modelSheep12;
        ModelSheep1 modelSheep12 = vL2;
        ModelSheep1 a2 = modelSheep1;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)h);
        a2.head.rotateAngleX = a2.headRotationAngleX;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f5 = f4;
        ModelSheep1 a2 = this;
        super.J((Gl)d2, (float)c2, (float)b2, (float)e2);
        a2.head.rotationPointY = lqa.ga + ((ZFa)d2).l((float)e2) * kPa.S;
        a2.headRotationAngleX = ((ZFa)d2).C((float)e2);
    }

    public ModelSheep1() {
        ModelSheep1 modelSheep1;
        ModelSheep1 modelSheep12 = modelSheep1 = this;
        super(lqa.s, JPa.N);
        modelSheep12.head = new cT((ModelBase)modelSheep1, uSa.E, uSa.E);
        modelSheep1.head.J(TOa.p, NQa.m, NQa.m, uua.p, uua.p, uua.p, Ora.D);
        modelSheep12.head.J(JPa.N, lqa.ga, sOa.Z);
        modelSheep12.body = new cT((ModelBase)modelSheep1, EPa.O, Yqa.i);
        modelSheep12.body.J(NQa.m, Cra.fa, NQa.d, Yqa.i, ERa.C, uua.p, NPa.L);
        modelSheep12.body.J(JPa.N, eua.C, kta.v);
        float a2 = MQa.L;
        modelSheep12.leg1 = new cT((ModelBase)modelSheep1, uSa.E, ERa.C);
        modelSheep12.leg1.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, a2);
        modelSheep12.leg1.J(TOa.p, Fua.Y, BRa.k);
        modelSheep12.leg2 = new cT((ModelBase)modelSheep1, uSa.E, ERa.C);
        modelSheep12.leg2.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, a2);
        modelSheep12.leg2.J(vQa.q, Fua.Y, BRa.k);
        modelSheep12.leg3 = new cT((ModelBase)modelSheep1, uSa.E, ERa.C);
        modelSheep12.leg3.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, a2);
        modelSheep12.leg3.J(TOa.p, Fua.Y, CRa.M);
        modelSheep12.leg4 = new cT((ModelBase)modelSheep1, uSa.E, ERa.C);
        modelSheep12.leg4.J(dua.ca, JPa.N, dua.ca, AQa.P, uua.p, AQa.P, a2);
        modelSheep12.leg4.J(vQa.q, Fua.Y, CRa.M);
    }
}

