/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NQa
 *  TPa
 *  cRa
 *  cT
 *  kta
 *  lqa
 *  mra
 *  pQa
 *  pqa
 *  uKa
 *  vL
 *  vPa
 *  xOa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelEnderCrystal
extends ModelBase {
    private cT glass;
    private cT base;
    private cT cube;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void d2;
        void e2;
        void h2;
        float f8 = f7;
        ModelEnderCrystal a2 = this;
        uKa.e();
        uKa.l((float)kta.v, (float)kta.v, (float)kta.v);
        uKa.J((float)JPa.N, (float)vPa.b, (float)JPa.N);
        if (a2.base != null) {
            a2.base.C((float)h2);
        }
        uKa.J((float)e2, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)(xSa.la + d2), (float)JPa.N);
        uKa.J((float)gua.l, (float)cRa.X, (float)JPa.N, (float)cRa.X);
        ModelEnderCrystal modelEnderCrystal = a2;
        modelEnderCrystal.glass.C((float)h2);
        float g2 = xOa.B;
        uKa.l((float)g2, (float)g2, (float)g2);
        uKa.J((float)gua.l, (float)cRa.X, (float)JPa.N, (float)cRa.X);
        uKa.J((float)e2, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        modelEnderCrystal.glass.C((float)h2);
        float f9 = g2;
        uKa.l((float)f9, (float)f9, (float)f9);
        uKa.J((float)gua.l, (float)cRa.X, (float)JPa.N, (float)cRa.X);
        uKa.J((float)e2, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        modelEnderCrystal.cube.C((float)h2);
        uKa.D();
    }

    public ModelEnderCrystal(float f2, boolean bl) {
        boolean c2 = bl;
        ModelEnderCrystal a2 = this;
        a2.glass = new cT((ModelBase)a2, pQa.T);
        a2.glass.f(uSa.E, uSa.E).J(NQa.m, NQa.m, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        ModelEnderCrystal modelEnderCrystal = a2;
        modelEnderCrystal.cube = new cT((ModelBase)modelEnderCrystal, mra.f);
        modelEnderCrystal.cube.f(fPa.i, uSa.E).J(NQa.m, NQa.m, NQa.m, Yqa.i, Yqa.i, Yqa.i);
        if (c2) {
            ModelEnderCrystal modelEnderCrystal2 = a2;
            modelEnderCrystal2.base = new cT((ModelBase)modelEnderCrystal2, TPa.Ha);
            modelEnderCrystal2.base.f(uSa.E, ERa.C).J(NSa.b, JPa.N, NSa.b, lqa.s, AQa.P, lqa.s);
        }
    }
}

