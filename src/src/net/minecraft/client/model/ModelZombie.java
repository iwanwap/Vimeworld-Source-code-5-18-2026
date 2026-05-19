/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  JQa
 *  Oz
 *  pPa
 *  pqa
 *  pua
 *  vL
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBiped;

public class ModelZombie
extends ModelBiped {
    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        float f8;
        ModelZombie g2;
        float h2 = f2;
        ModelZombie modelZombie = g2 = this;
        super.J(h2, f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)a2);
        h2 = Oz.d((float)(modelZombie.swingProgress * pua.j));
        f8 = Oz.d((float)((pqa.r - (pqa.r - g2.swingProgress) * (pqa.r - g2.swingProgress)) * pua.j));
        g2.bipedRightArm.rotateAngleZ = JPa.N;
        modelZombie.bipedLeftArm.rotateAngleZ = JPa.N;
        modelZombie.bipedRightArm.rotateAngleY = -(Nra.e - h2 * Ora.D);
        modelZombie.bipedLeftArm.rotateAngleY = Nra.e - h2 * Ora.D;
        modelZombie.bipedRightArm.rotateAngleX = Fsa.s;
        modelZombie.bipedLeftArm.rotateAngleX = Fsa.s;
        modelZombie.bipedRightArm.rotateAngleX -= h2 * pPa.c - f8 * Xpa.R;
        modelZombie.bipedLeftArm.rotateAngleX -= h2 * pPa.c - f8 * Xpa.R;
        modelZombie.bipedRightArm.rotateAngleZ += Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
        modelZombie.bipedLeftArm.rotateAngleZ -= Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
        modelZombie.bipedRightArm.rotateAngleX += Oz.d((float)(e2 * JQa.k)) * Yqa.C;
        modelZombie.bipedLeftArm.rotateAngleX -= Oz.d((float)(e2 * JQa.k)) * Yqa.C;
    }

    /*
     * WARNING - void declaration
     */
    public ModelZombie(float f2, boolean bl) {
        void b2;
        boolean c2 = bl;
        ModelZombie a2 = this;
        super((float)b2, JPa.N, ysa.s, c2 ? fPa.i : ysa.s);
    }

    /*
     * WARNING - void declaration
     */
    public ModelZombie(float f2, float f3, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        ModelZombie a2 = this;
        super((float)d2, (float)c2, (int)b2, (int)e2);
    }

    public ModelZombie() {
        a2(JPa.N, uSa.E != 0);
        ModelZombie a2;
    }
}

