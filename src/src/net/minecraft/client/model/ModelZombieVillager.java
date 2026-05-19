/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  JQa
 *  NQa
 *  NTa
 *  Oz
 *  cT
 *  pPa
 *  pqa
 *  pua
 *  vL
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;

public final class ModelZombieVillager
extends ModelBiped {
    /*
     * WARNING - void declaration
     */
    public ModelZombieVillager(float f2, float f3, boolean bl) {
        void b2;
        void a2;
        float d2 = f2;
        ModelZombieVillager c2 = this;
        super(d2, JPa.N, ysa.s, a2 != false ? fPa.i : ysa.s);
        if (a2 != false) {
            c2.bipedHead = new cT((ModelBase)c2, uSa.E, uSa.E);
            c2.bipedHead.J(NQa.m, Cra.fa, NQa.m, Yqa.i, Yqa.i, Yqa.i, d2);
            c2.bipedHead.J(JPa.N, JPa.N + b2, JPa.N);
            return;
        }
        ModelZombieVillager modelZombieVillager = c2;
        c2.bipedHead = new cT((ModelBase)c2);
        modelZombieVillager.bipedHead.J(JPa.N, JPa.N + b2, JPa.N);
        modelZombieVillager.bipedHead.f(uSa.E, fPa.i).J(NQa.m, Cra.fa, NQa.m, Yqa.i, NTa.C, Yqa.i, d2);
        modelZombieVillager.bipedHead.f(osa.c, fPa.i).J(vqa.T, TOa.p, NSa.b, uqa.g, AQa.P, uqa.g, d2);
    }

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
        ModelZombieVillager g2;
        float h2 = f2;
        ModelZombieVillager modelZombieVillager = g2 = this;
        super.J(h2, f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)a2);
        h2 = Oz.d((float)(modelZombieVillager.swingProgress * pua.j));
        f8 = Oz.d((float)((pqa.r - (pqa.r - g2.swingProgress) * (pqa.r - g2.swingProgress)) * pua.j));
        g2.bipedRightArm.rotateAngleZ = JPa.N;
        modelZombieVillager.bipedLeftArm.rotateAngleZ = JPa.N;
        modelZombieVillager.bipedRightArm.rotateAngleY = -(Nra.e - h2 * Ora.D);
        modelZombieVillager.bipedLeftArm.rotateAngleY = Nra.e - h2 * Ora.D;
        modelZombieVillager.bipedRightArm.rotateAngleX = Fsa.s;
        modelZombieVillager.bipedLeftArm.rotateAngleX = Fsa.s;
        modelZombieVillager.bipedRightArm.rotateAngleX -= h2 * pPa.c - f8 * Xpa.R;
        modelZombieVillager.bipedLeftArm.rotateAngleX -= h2 * pPa.c - f8 * Xpa.R;
        modelZombieVillager.bipedRightArm.rotateAngleZ += Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
        modelZombieVillager.bipedLeftArm.rotateAngleZ -= Oz.C((float)(e2 * dqa.B)) * Yqa.C + Yqa.C;
        modelZombieVillager.bipedRightArm.rotateAngleX += Oz.d((float)(e2 * JQa.k)) * Yqa.C;
        modelZombieVillager.bipedLeftArm.rotateAngleX -= Oz.d((float)(e2 * JQa.k)) * Yqa.C;
    }

    public ModelZombieVillager() {
        a2(JPa.N, JPa.N, uSa.E != 0);
        ModelZombieVillager a2;
    }
}

