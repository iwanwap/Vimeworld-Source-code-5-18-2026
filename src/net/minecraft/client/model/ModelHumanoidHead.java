/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NQa
 *  cT
 *  vL
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSkeletonHead;

public final class ModelHumanoidHead
extends ModelSkeletonHead {
    private final cT head;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        ModelHumanoidHead h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g2;
        ModelHumanoidHead modelHumanoidHead = modelHumanoidHead2;
        ModelHumanoidHead modelHumanoidHead2 = vL2;
        ModelHumanoidHead a2 = modelHumanoidHead;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)h2);
        a2.head.rotateAngleY = a2.skeletonHead.rotateAngleY;
        a2.head.rotateAngleX = a2.skeletonHead.rotateAngleX;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g2;
        ModelHumanoidHead a2;
        float f9 = f7;
        ModelHumanoidHead modelHumanoidHead = a2 = this;
        super.J((vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2);
        modelHumanoidHead.head.C((float)h2);
    }

    public ModelHumanoidHead() {
        ModelHumanoidHead a2;
        ModelHumanoidHead modelHumanoidHead = a2;
        super(uSa.E, uSa.E, ysa.s, ysa.s);
        modelHumanoidHead.head = new cT((ModelBase)a2, fPa.i, uSa.E);
        a2.head.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, rta.o);
        modelHumanoidHead.head.J(JPa.N, JPa.N, JPa.N);
    }
}

