/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gl
 *  JPa
 *  cT
 *  kta
 *  lEa
 *  lqa
 *  vL
 *  vRa
 *  wra
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelZombie;

public final class ModelSkeleton
extends ModelZombie {
    /*
     * WARNING - void declaration
     */
    public ModelSkeleton(float f2, boolean bl) {
        void a2;
        float c2 = f2;
        ModelSkeleton b2 = this;
        super(c2, JPa.N, ysa.s, fPa.i);
        if (a2 == false) {
            ModelSkeleton modelSkeleton = b2;
            modelSkeleton.bipedRightArm = new cT((ModelBase)b2, wra.P, ERa.C);
            b2.bipedRightArm.J(vqa.T, dua.ca, vqa.T, uqa.g, lqa.s, uqa.g, c2);
            modelSkeleton.bipedRightArm.J(CRa.M, kta.v, JPa.N);
            modelSkeleton.bipedLeftArm = new cT((ModelBase)b2, wra.P, ERa.C);
            modelSkeleton.bipedLeftArm.mirror = vRa.d;
            modelSkeleton.bipedLeftArm.J(vqa.T, dua.ca, vqa.T, uqa.g, lqa.s, uqa.g, c2);
            modelSkeleton.bipedLeftArm.J(eua.C, kta.v, JPa.N);
            modelSkeleton.bipedRightLeg = new cT((ModelBase)b2, uSa.E, ERa.C);
            modelSkeleton.bipedRightLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, lqa.s, uqa.g, c2);
            modelSkeleton.bipedRightLeg.J(dua.ca, Fua.Y, JPa.N);
            modelSkeleton.bipedLeftLeg = new cT((ModelBase)b2, uSa.E, ERa.C);
            modelSkeleton.bipedLeftLeg.mirror = vRa.d;
            modelSkeleton.bipedLeftLeg.J(vqa.T, JPa.N, vqa.T, uqa.g, lqa.s, uqa.g, c2);
            modelSkeleton.bipedLeftLeg.J(kta.v, Fua.Y, JPa.N);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        ModelSkeleton e2 = gl2;
        ModelSkeleton d2 = this;
        d2.aimedBow = ((lEa)e2).I() == vRa.d ? vRa.d : uSa.E;
        super.J((Gl)e2, (float)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        ModelSkeleton h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        void g2;
        ModelSkeleton modelSkeleton = modelSkeleton2;
        ModelSkeleton modelSkeleton2 = vL2;
        ModelSkeleton a2 = modelSkeleton;
        super.J((float)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)h);
    }

    public ModelSkeleton() {
        a2(JPa.N, uSa.E != 0);
        ModelSkeleton a2;
    }
}

