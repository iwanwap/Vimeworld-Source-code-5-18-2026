/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NQa
 *  TQa
 *  cT
 *  vL
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public class ModelSkeletonHead
extends ModelBase {
    public cT skeletonHead;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g2;
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelSkeletonHead a2;
        float f9 = f7;
        ModelSkeletonHead modelSkeletonHead = a2 = this;
        modelSkeletonHead.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelSkeletonHead.skeletonHead.C((float)h2);
    }

    /*
     * WARNING - void declaration
     */
    public ModelSkeletonHead(int n2, int n3, int n4, int n5) {
        void c2;
        void d2;
        void e2;
        void b2;
        ModelSkeletonHead a2;
        int n6 = n5;
        ModelSkeletonHead modelSkeletonHead = a2 = this;
        modelSkeletonHead.textureWidth = b2;
        modelSkeletonHead.textureHeight = e2;
        a2.skeletonHead = new cT((ModelBase)a2, (int)d2, (int)c2);
        a2.skeletonHead.J(NQa.m, sOa.Z, NQa.m, Yqa.i, Yqa.i, Yqa.i, JPa.N);
        a2.skeletonHead.J(JPa.N, JPa.N, JPa.N);
    }

    public ModelSkeletonHead() {
        a2(uSa.E, TQa.ca, ysa.s, ysa.s);
        ModelSkeletonHead a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void a2;
        void b2;
        void h2;
        void d2;
        void e2;
        void f8;
        void g2;
        float f9 = f6;
        ModelSkeletonHead c2 = this;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)h2, (float)b2, (vL)a2);
        c2.skeletonHead.rotateAngleY = d2 / zpa.Z;
        c2.skeletonHead.rotateAngleX = h2 / zpa.Z;
    }
}

