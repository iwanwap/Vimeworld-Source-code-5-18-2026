/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  Gl
 *  JPa
 *  NQa
 *  ZFa
 *  cT
 *  kPa
 *  kta
 *  lqa
 *  vL
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelQuadruped;

public final class ModelSheep2
extends ModelQuadruped {
    private float headRotationAngleX;

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
        ModelSheep2 a2 = this;
        super.J((Gl)d2, (float)c2, (float)b2, (float)e2);
        a2.head.rotationPointY = lqa.ga + ((ZFa)d2).l((float)e2) * kPa.S;
        a2.headRotationAngleX = ((ZFa)d2).C((float)e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        ModelSheep2 h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g2;
        ModelSheep2 modelSheep2 = modelSheep22;
        ModelSheep2 modelSheep22 = vL2;
        ModelSheep2 a2 = modelSheep2;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)h2);
        a2.head.rotateAngleX = a2.headRotationAngleX;
    }

    public ModelSheep2() {
        ModelSheep2 a2;
        ModelSheep2 modelSheep2 = a2;
        super(lqa.s, JPa.N);
        modelSheep2.head = new cT((ModelBase)a2, uSa.E, uSa.E);
        a2.head.J(TOa.p, NQa.m, NSa.b, uua.p, uua.p, Yqa.i, JPa.N);
        modelSheep2.head.J(JPa.N, lqa.ga, sOa.Z);
        modelSheep2.body = new cT((ModelBase)a2, EPa.O, Yqa.i);
        modelSheep2.body.J(NQa.m, Cra.fa, NQa.d, Yqa.i, ERa.C, uua.p, JPa.N);
        modelSheep2.body.J(JPa.N, eua.C, kta.v);
    }
}

