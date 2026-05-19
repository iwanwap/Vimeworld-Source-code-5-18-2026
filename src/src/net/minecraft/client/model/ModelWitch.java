/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  JPa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Ssa
 *  XSa
 *  XTa
 *  Zpa
 *  cT
 *  kqa
 *  kta
 *  pqa
 *  psa
 *  pua
 *  uOa
 *  vL
 *  vQa
 *  vRa
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelVillager;

public final class ModelWitch
extends ModelVillager {
    public boolean field_82900_g;
    private cT witchHat;
    private cT field_82901_h;

    public ModelWitch(float f2) {
        ModelWitch a2;
        float b22 = f2;
        ModelWitch modelWitch = a2 = this;
        super(b22, JPa.N, ysa.s, XOa.h);
        modelWitch.field_82901_h = new cT((ModelBase)a2).J(ysa.s, XOa.h);
        a2.field_82901_h.J(JPa.N, dua.ca, JPa.N);
        modelWitch.field_82901_h.f(uSa.E, uSa.E).J(JPa.N, vQa.q, gua.T, vRa.d, vRa.d, vRa.d, lTa.Z);
        modelWitch.villagerNose.J(a2.field_82901_h);
        modelWitch.witchHat = new cT((ModelBase)a2).J(ysa.s, XOa.h);
        modelWitch.witchHat.J(CRa.M, Jta.A, CRa.M);
        modelWitch.witchHat.f(uSa.E, ysa.s).J(JPa.N, JPa.N, JPa.N, NTa.C, uqa.g, NTa.C);
        ModelWitch modelWitch2 = a2;
        modelWitch2.villagerHead.J(modelWitch2.witchHat);
        cT b22 = new cT((ModelBase)a2).J(ysa.s, XOa.h);
        b22.J(NPa.L, NQa.m, kta.v);
        b22.f(uSa.E, NPa.i).J(JPa.N, JPa.N, JPa.N, XTa.W, AQa.P, XTa.W);
        cT cT2 = b22;
        cT2.rotateAngleX = kqa.ca;
        cT2.rotateAngleZ = Ssa.l;
        a2.witchHat.J(b22);
        cT cT3 = new cT((ModelBase)a2).J(ysa.s, XOa.h);
        cT3.J(NPa.L, NQa.m, kta.v);
        cT3.f(uSa.E, Jqa.S).J(JPa.N, JPa.N, JPa.N, AQa.P, AQa.P, AQa.P);
        cT cT4 = cT3;
        cT3.rotateAngleX = psa.t;
        cT4.rotateAngleZ = Zpa.L;
        b22.J(cT4);
        cT cT5 = new cT((ModelBase)a2).J(ysa.s, XOa.h);
        cT5.J(NPa.L, dua.ca, kta.v);
        cT5.f(uSa.E, pqa.ga).J(JPa.N, JPa.N, JPa.N, vRa.d, uqa.g, vRa.d, rta.o);
        cT5.rotateAngleX = uOa.y;
        cT5.rotateAngleZ = XSa.V;
        cT4.J(cT5);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        ModelWitch h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        float g;
        ModelWitch modelWitch = modelWitch2;
        ModelWitch modelWitch2 = vL2;
        ModelWitch a2 = modelWitch;
        super.J(g, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (vL)h);
        a2.villagerNose.offsetY = a2.villagerNose.offsetZ = JPa.N;
        a2.villagerNose.offsetX = a2.villagerNose.offsetZ;
        g = Jpa.B * (float)(h.M() % NTa.C);
        a2.villagerNose.rotateAngleX = Oz.d((float)((float)((vL)h).g * g)) * Jta.r * pua.j / Hra.Ga;
        a2.villagerNose.rotateAngleY = JPa.N;
        a2.villagerNose.rotateAngleZ = Oz.C((float)((float)((vL)h).g * g)) * MTa.y * pua.j / Hra.Ga;
        if (a2.field_82900_g) {
            ModelWitch modelWitch3 = a2;
            modelWitch3.villagerNose.rotateAngleX = Hra.ha;
            modelWitch3.villagerNose.offsetZ = Cta.d;
            modelWitch3.villagerNose.offsetY = sqa.Z;
        }
    }
}

