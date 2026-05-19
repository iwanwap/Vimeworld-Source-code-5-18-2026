/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Cra
 *  ERa
 *  JPa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  YSa
 *  cT
 *  jpa
 *  kta
 *  pqa
 *  pua
 *  uKa
 *  vL
 *  vQa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public class ModelQuadruped
extends ModelBase {
    public float childZOffset;
    public cT leg2;
    public cT body;
    public cT leg1;
    public float childYOffset;
    public cT leg3;
    public cT leg4;
    public cT head;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void g2;
        void d2;
        void c2;
        float h = f3;
        ModelQuadruped f8 = this;
        ModelQuadruped modelQuadruped = f8;
        modelQuadruped.head.rotateAngleX = c2 / zpa.Z;
        modelQuadruped.head.rotateAngleY = d2 / zpa.Z;
        modelQuadruped.body.rotateAngleX = jpa.f;
        modelQuadruped.leg1.rotateAngleX = Oz.C((float)(g2 * Zra.u)) * NPa.B * h;
        modelQuadruped.leg2.rotateAngleX = Oz.C((float)(g2 * Zra.u + pua.j)) * NPa.B * h;
        modelQuadruped.leg3.rotateAngleX = Oz.C((float)(g2 * Zra.u + pua.j)) * NPa.B * h;
        modelQuadruped.leg4.rotateAngleX = Oz.C((float)(g2 * Zra.u)) * NPa.B * h;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g22;
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelQuadruped a2;
        float f9 = f7;
        ModelQuadruped modelQuadruped = a2 = this;
        modelQuadruped.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h, (vL)g22);
        if (modelQuadruped.isChild) {
            float g22 = kta.v;
            uKa.e();
            uKa.J((float)JPa.N, (float)(a2.childYOffset * h), (float)(a2.childZOffset * h));
            ModelQuadruped modelQuadruped2 = a2;
            modelQuadruped2.head.C((float)h);
            uKa.D();
            uKa.e();
            uKa.l((float)(pqa.r / g22), (float)(pqa.r / g22), (float)(pqa.r / g22));
            uKa.J((float)JPa.N, (float)(KSa.I * h), (float)JPa.N);
            modelQuadruped2.body.C((float)h);
            modelQuadruped2.leg1.C((float)h);
            modelQuadruped2.leg2.C((float)h);
            modelQuadruped2.leg3.C((float)h);
            modelQuadruped2.leg4.C((float)h);
            uKa.D();
            return;
        }
        ModelQuadruped modelQuadruped3 = a2;
        modelQuadruped3.head.C((float)h);
        modelQuadruped3.body.C((float)h);
        modelQuadruped3.leg1.C((float)h);
        modelQuadruped3.leg2.C((float)h);
        modelQuadruped3.leg3.C((float)h);
        modelQuadruped3.leg4.C((float)h);
    }

    /*
     * WARNING - void declaration
     */
    public ModelQuadruped(int n2, float f2) {
        void a2;
        ModelQuadruped b2;
        int c2 = n2;
        ModelQuadruped modelQuadruped = b2 = this;
        ModelQuadruped modelQuadruped2 = b2;
        modelQuadruped.head = new cT((ModelBase)b2, uSa.E, uSa.E);
        modelQuadruped2.childYOffset = Qsa.k;
        modelQuadruped.childZOffset = YSa.G;
        modelQuadruped.head.J(NQa.m, NQa.m, sOa.Z, Yqa.i, Yqa.i, Yqa.i, (float)a2);
        modelQuadruped.head.J(JPa.N, (float)(yOa.B - c2), NSa.b);
        modelQuadruped.body = new cT((ModelBase)b2, EPa.O, Yqa.i);
        modelQuadruped.body.J(CRa.M, Cra.fa, NQa.d, NTa.C, ERa.C, Yqa.i, (float)a2);
        modelQuadruped.body.J(JPa.N, (float)(yta.Ka - c2), kta.v);
        modelQuadruped.leg1 = new cT((ModelBase)b2, uSa.E, ERa.C);
        modelQuadruped.leg1.J(dua.ca, JPa.N, dua.ca, AQa.P, c2, AQa.P, (float)a2);
        modelQuadruped.leg1.J(TOa.p, (float)(osa.c - c2), BRa.k);
        modelQuadruped.leg2 = new cT((ModelBase)b2, uSa.E, ERa.C);
        modelQuadruped.leg2.J(dua.ca, JPa.N, dua.ca, AQa.P, c2, AQa.P, (float)a2);
        modelQuadruped.leg2.J(vQa.q, (float)(osa.c - c2), BRa.k);
        modelQuadruped.leg3 = new cT((ModelBase)b2, uSa.E, ERa.C);
        modelQuadruped.leg3.J(dua.ca, JPa.N, dua.ca, AQa.P, c2, AQa.P, (float)a2);
        modelQuadruped.leg3.J(TOa.p, (float)(osa.c - c2), CRa.M);
        modelQuadruped.leg4 = new cT((ModelBase)b2, uSa.E, ERa.C);
        modelQuadruped.leg4.J(dua.ca, JPa.N, dua.ca, AQa.P, c2, AQa.P, (float)a2);
        modelQuadruped.leg4.J(vQa.q, (float)(osa.c - c2), CRa.M);
    }
}

