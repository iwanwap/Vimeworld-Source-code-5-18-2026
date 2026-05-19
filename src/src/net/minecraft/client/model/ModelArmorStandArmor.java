/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oea
 *  Zua
 *  pqa
 *  vL
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBiped;

public class ModelArmorStandArmor
extends ModelBiped {
    public ModelArmorStandArmor(float f2) {
        float b2 = f2;
        ModelArmorStandArmor a2 = this;
        a2(b2, ysa.s, fPa.i);
    }

    public ModelArmorStandArmor() {
        a2(JPa.N);
        ModelArmorStandArmor a2;
    }

    /*
     * WARNING - void declaration
     */
    public ModelArmorStandArmor(float f2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        ModelArmorStandArmor a2 = this;
        super((float)c2, JPa.N, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void a2;
        float h22 = f2;
        ModelArmorStandArmor g2 = this;
        if (a2 instanceof Oea) {
            Oea h22 = (Oea)a2;
            ModelArmorStandArmor modelArmorStandArmor = g2;
            modelArmorStandArmor.bipedHead.rotateAngleX = Bua.ga * h22.J().l();
            modelArmorStandArmor.bipedHead.rotateAngleY = Bua.ga * h22.J().J();
            modelArmorStandArmor.bipedHead.rotateAngleZ = Bua.ga * h22.J().f();
            modelArmorStandArmor.bipedHead.J(JPa.N, pqa.r, JPa.N);
            modelArmorStandArmor.bipedBody.rotateAngleX = Bua.ga * h22.e().l();
            modelArmorStandArmor.bipedBody.rotateAngleY = Bua.ga * h22.e().J();
            modelArmorStandArmor.bipedBody.rotateAngleZ = Bua.ga * h22.e().f();
            modelArmorStandArmor.bipedLeftArm.rotateAngleX = Bua.ga * h22.l().l();
            modelArmorStandArmor.bipedLeftArm.rotateAngleY = Bua.ga * h22.l().J();
            modelArmorStandArmor.bipedLeftArm.rotateAngleZ = Bua.ga * h22.l().f();
            modelArmorStandArmor.bipedRightArm.rotateAngleX = Bua.ga * h22.d().l();
            modelArmorStandArmor.bipedRightArm.rotateAngleY = Bua.ga * h22.d().J();
            modelArmorStandArmor.bipedRightArm.rotateAngleZ = Bua.ga * h22.d().f();
            modelArmorStandArmor.bipedLeftLeg.rotateAngleX = Bua.ga * h22.C().l();
            modelArmorStandArmor.bipedLeftLeg.rotateAngleY = Bua.ga * h22.C().J();
            modelArmorStandArmor.bipedLeftLeg.rotateAngleZ = Bua.ga * h22.C().f();
            modelArmorStandArmor.bipedLeftLeg.J(Zua.D, AQa.W, JPa.N);
            modelArmorStandArmor.bipedRightLeg.rotateAngleX = Bua.ga * h22.f().l();
            modelArmorStandArmor.bipedRightLeg.rotateAngleY = Bua.ga * h22.f().J();
            modelArmorStandArmor.bipedRightLeg.rotateAngleZ = Bua.ga * h22.f().f();
            modelArmorStandArmor.bipedRightLeg.J(AQa.d, AQa.W, JPa.N);
            ModelArmorStandArmor.J(modelArmorStandArmor.bipedHead, g2.bipedHeadwear);
        }
    }
}

