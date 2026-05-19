/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  cT
 *  vL
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelLeashKnot
extends ModelBase {
    public cT field_110723_a;

    /*
     * WARNING - void declaration
     */
    public ModelLeashKnot(int n2, int n3, int n4, int n5) {
        void c2;
        void d2;
        void e2;
        void b2;
        ModelLeashKnot a2;
        int n6 = n5;
        ModelLeashKnot modelLeashKnot = a2 = this;
        modelLeashKnot.textureWidth = b2;
        modelLeashKnot.textureHeight = e2;
        a2.field_110723_a = new cT((ModelBase)a2, (int)d2, (int)c2);
        a2.field_110723_a.J(TOa.p, NSa.b, TOa.p, uua.p, Yqa.i, uua.p, JPa.N);
        a2.field_110723_a.J(JPa.N, JPa.N, JPa.N);
    }

    public ModelLeashKnot() {
        a2(uSa.E, uSa.E, fPa.i, fPa.i);
        ModelLeashKnot a2;
    }

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
        ModelLeashKnot a2;
        float f9 = f7;
        ModelLeashKnot modelLeashKnot = a2 = this;
        modelLeashKnot.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelLeashKnot.field_110723_a.C((float)h2);
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
        ModelLeashKnot c2 = this;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)h2, (float)b2, (vL)a2);
        c2.field_110723_a.rotateAngleY = d2 / zpa.Z;
        c2.field_110723_a.rotateAngleX = h2 / zpa.Z;
    }
}

