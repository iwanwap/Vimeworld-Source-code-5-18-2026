/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bsa
 *  EQa
 *  ERa
 *  GDa
 *  JPa
 *  Kpa
 *  LQa
 *  Lz
 *  MQa
 *  NPa
 *  NTa
 *  Oz
 *  Qsa
 *  XTa
 *  Yra
 *  aSa
 *  cT
 *  jpa
 *  kta
 *  lqa
 *  pPa
 *  pqa
 *  pua
 *  qta
 *  vL
 *  vQa
 *  vRa
 *  wOa
 *  wra
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelGuardian
extends ModelBase {
    private cT[] guardianSpines;
    private cT[] guardianTail;
    private cT guardianBody;
    private cT guardianEye;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        int h22;
        void c22;
        void d22;
        float e22;
        void a2;
        ModelGuardian modelGuardian = this;
        GDa g2 = (GDa)a2;
        void f8 = e22 - (float)g2.g;
        ModelGuardian modelGuardian2 = modelGuardian;
        modelGuardian2.guardianBody.rotateAngleY = d22 / zpa.Z;
        modelGuardian2.guardianBody.rotateAngleX = c22 / zpa.Z;
        float[] fArray = new float[lqa.s];
        fArray[uSa.E] = NPa.L;
        fArray[vRa.d] = rta.o;
        fArray[uqa.g] = JPa.N;
        fArray[yRa.d] = JPa.N;
        fArray[AQa.P] = MQa.L;
        fArray[tTa.h] = MQa.L;
        fArray[uua.p] = MQa.L;
        fArray[XTa.W] = MQa.L;
        fArray[Yqa.i] = oQa.z;
        fArray[WOa.fa] = wOa.w;
        fArray[NTa.C] = JPa.N;
        fArray[pPa.f] = JPa.N;
        Object d22 = fArray;
        float[] fArray2 = new float[lqa.s];
        fArray2[uSa.E] = JPa.N;
        fArray2[vRa.d] = JPa.N;
        fArray2[uqa.g] = JPa.N;
        fArray2[yRa.d] = JPa.N;
        fArray2[AQa.P] = rta.o;
        fArray2[tTa.h] = NPa.L;
        fArray2[uua.p] = oQa.z;
        fArray2[XTa.W] = wOa.w;
        fArray2[Yqa.i] = JPa.N;
        fArray2[WOa.fa] = JPa.N;
        fArray2[NTa.C] = JPa.N;
        fArray2[pPa.f] = JPa.N;
        Object c22 = fArray2;
        float[] fArray3 = new float[lqa.s];
        fArray3[uSa.E] = JPa.N;
        fArray3[vRa.d] = JPa.N;
        fArray3[uqa.g] = rta.o;
        fArray3[yRa.d] = NPa.L;
        fArray3[AQa.P] = JPa.N;
        fArray3[tTa.h] = JPa.N;
        fArray3[uua.p] = JPa.N;
        fArray3[XTa.W] = JPa.N;
        fArray3[Yqa.i] = JPa.N;
        fArray3[WOa.fa] = JPa.N;
        fArray3[NTa.C] = wOa.w;
        fArray3[pPa.f] = oQa.z;
        float[] b2 = fArray3;
        float[] fArray4 = new float[lqa.s];
        fArray4[uSa.E] = JPa.N;
        fArray4[vRa.d] = JPa.N;
        fArray4[uqa.g] = Qsa.k;
        fArray4[yRa.d] = sOa.Z;
        fArray4[AQa.P] = sOa.Z;
        fArray4[tTa.h] = Qsa.k;
        fArray4[uua.p] = Qsa.k;
        fArray4[XTa.W] = sOa.Z;
        fArray4[Yqa.i] = JPa.N;
        fArray4[WOa.fa] = JPa.N;
        fArray4[NTa.C] = Qsa.k;
        fArray4[pPa.f] = sOa.Z;
        float[] fArray5 = fArray4;
        float[] fArray6 = new float[lqa.s];
        fArray6[uSa.E] = sOa.Z;
        fArray6[vRa.d] = sOa.Z;
        fArray6[uqa.g] = sOa.Z;
        fArray6[yRa.d] = sOa.Z;
        fArray6[AQa.P] = JPa.N;
        fArray6[tTa.h] = JPa.N;
        fArray6[uua.p] = JPa.N;
        fArray6[XTa.W] = JPa.N;
        fArray6[Yqa.i] = Qsa.k;
        fArray6[WOa.fa] = Qsa.k;
        fArray6[NTa.C] = Qsa.k;
        fArray6[pPa.f] = Qsa.k;
        float[] fArray7 = fArray6;
        float[] fArray8 = new float[lqa.s];
        fArray8[uSa.E] = Qsa.k;
        fArray8[vRa.d] = sOa.Z;
        fArray8[uqa.g] = JPa.N;
        fArray8[yRa.d] = JPa.N;
        fArray8[AQa.P] = sOa.Z;
        fArray8[tTa.h] = sOa.Z;
        fArray8[uua.p] = Qsa.k;
        fArray8[XTa.W] = Qsa.k;
        fArray8[Yqa.i] = Qsa.k;
        fArray8[WOa.fa] = sOa.Z;
        fArray8[NTa.C] = JPa.N;
        fArray8[pPa.f] = JPa.N;
        float[] fArray9 = fArray8;
        float f9 = (pqa.r - g2.l((float)f8)) * vTa.N;
        int n2 = h22 = uSa.E;
        while (n2 < lqa.s) {
            modelGuardian.guardianSpines[h22].rotateAngleX = pua.j * d22[h22];
            modelGuardian.guardianSpines[h22].rotateAngleY = pua.j * c22[h22];
            modelGuardian.guardianSpines[h22].rotateAngleZ = pua.j * b2[h22];
            modelGuardian.guardianSpines[h22].rotationPointX = fArray5[h22] * (pqa.r + Oz.C((float)(e22 * Ira.d + (float)h22)) * Jpa.B - f9);
            modelGuardian.guardianSpines[h22].rotationPointY = Yra.i + fArray7[h22] * (pqa.r + Oz.C((float)(e22 * Ira.d + (float)h22)) * Jpa.B - f9);
            cT cT2 = modelGuardian.guardianSpines[h22];
            float f10 = fArray9[h22];
            float f11 = pqa.r + Oz.C((float)(e22 * Ira.d + (float)h22)) * Jpa.B;
            cT2.rotationPointZ = f10 * (f11 - f9);
            n2 = ++h22;
        }
        modelGuardian.guardianEye.rotationPointZ = Bsa.Ha;
        vL h22 = Kpa.J().J();
        if (g2.v()) {
            h22 = g2.d();
        }
        if (h22 != null) {
            void v11;
            Lz e22 = h22.f(JPa.N);
            d22 = a2.f(JPa.N);
            if (e22.j - d22.j > aSa.V) {
                v11 = a2;
                modelGuardian.guardianEye.rotationPointY = JPa.N;
            } else {
                modelGuardian.guardianEye.rotationPointY = pqa.r;
                v11 = a2;
            }
            c22 = v11.J(JPa.N);
            c22 = new Lz(c22.A, aSa.V, c22.J);
            d22 = new Lz(d22.A - e22.A, aSa.V, d22.J - e22.J).J().J(jpa.f);
            double d3 = c22.f((Lz)d22);
            modelGuardian.guardianEye.rotationPointX = Oz.J((float)((float)Math.abs(d3))) * kta.v * (float)Math.signum(d3);
        }
        ModelGuardian modelGuardian3 = modelGuardian;
        ModelGuardian modelGuardian4 = modelGuardian;
        modelGuardian4.guardianEye.showModel = vRa.d;
        e22 = g2.C((float)f8);
        modelGuardian4.guardianTail[uSa.E].rotateAngleY = Oz.d((float)e22) * pua.j * Yqa.C;
        modelGuardian3.guardianTail[vRa.d].rotateAngleY = Oz.d((float)e22) * pua.j * Nra.e;
        modelGuardian3.guardianTail[vRa.d].rotationPointX = FRa.ca;
        modelGuardian3.guardianTail[vRa.d].rotationPointY = MQa.L;
        modelGuardian3.guardianTail[vRa.d].rotationPointZ = bsa.la;
        modelGuardian3.guardianTail[uqa.g].rotateAngleY = Oz.d((float)e22) * pua.j * VPa.i;
        modelGuardian3.guardianTail[uqa.g].rotationPointX = MQa.L;
        modelGuardian3.guardianTail[uqa.g].rotationPointY = MQa.L;
        modelGuardian3.guardianTail[uqa.g].rotationPointZ = lqa.ga;
    }

    public ModelGuardian() {
        ModelGuardian modelGuardian = this;
        modelGuardian.textureWidth = ysa.s;
        modelGuardian.textureHeight = ysa.s;
        modelGuardian.guardianSpines = new cT[lqa.s];
        modelGuardian.guardianBody = new cT((ModelBase)modelGuardian);
        modelGuardian.guardianBody.f(uSa.E, uSa.E).J(NSa.b, FRa.Ga, sOa.Z, lqa.s, lqa.s, ERa.C);
        modelGuardian.guardianBody.f(uSa.E, EPa.O).J(sOa.Z, FRa.Ga, NSa.b, uqa.g, lqa.s, lqa.s);
        modelGuardian.guardianBody.f(uSa.E, EPa.O).J(lqa.ga, FRa.Ga, NSa.b, uqa.g, lqa.s, lqa.s, vRa.d != 0);
        modelGuardian.guardianBody.f(ERa.C, wra.P).J(NSa.b, Qsa.k, NSa.b, lqa.s, uqa.g, lqa.s);
        modelGuardian.guardianBody.f(ERa.C, wra.P).J(NSa.b, Tqa.V, NSa.b, lqa.s, uqa.g, lqa.s);
        int a2 = uSa.E;
        int n2 = a2;
        while (n2 < modelGuardian.guardianSpines.length) {
            ModelGuardian modelGuardian2 = modelGuardian;
            modelGuardian2.guardianSpines[a2] = new cT((ModelBase)modelGuardian, uSa.E, uSa.E);
            modelGuardian2.guardianSpines[a2].J(vqa.T, EQa.G, vqa.T, uqa.g, WOa.fa, uqa.g);
            ModelGuardian modelGuardian3 = modelGuardian;
            modelGuardian3.guardianBody.J(modelGuardian3.guardianSpines[a2++]);
            n2 = a2;
        }
        modelGuardian.guardianEye = new cT((ModelBase)modelGuardian, Yqa.i, uSa.E);
        modelGuardian.guardianEye.J(vqa.T, qta.D, JPa.N, uqa.g, uqa.g, vRa.d);
        ModelGuardian modelGuardian4 = modelGuardian;
        modelGuardian4.guardianBody.J(modelGuardian4.guardianEye);
        modelGuardian.guardianTail = new cT[yRa.d];
        ModelGuardian modelGuardian5 = modelGuardian;
        modelGuardian5.guardianTail[uSa.E] = new cT((ModelBase)modelGuardian, wra.P, uSa.E);
        modelGuardian5.guardianTail[uSa.E].J(dua.ca, bsa.la, BRa.k, AQa.P, AQa.P, Yqa.i);
        ModelGuardian modelGuardian6 = modelGuardian;
        modelGuardian6.guardianTail[vRa.d] = new cT((ModelBase)modelGuardian, uSa.E, GPa.C);
        modelGuardian6.guardianTail[vRa.d].J(JPa.N, bsa.la, JPa.N, yRa.d, yRa.d, XTa.W);
        ModelGuardian modelGuardian7 = modelGuardian;
        modelGuardian7.guardianTail[uqa.g] = new cT((ModelBase)modelGuardian);
        modelGuardian7.guardianTail[uqa.g].f(kra.U, fPa.i).J(JPa.N, bsa.la, JPa.N, uqa.g, uqa.g, uua.p);
        modelGuardian.guardianTail[uqa.g].f(kTa.g, wOa.t).J(pqa.r, LQa.Z, vQa.q, vRa.d, WOa.fa, WOa.fa);
        ModelGuardian modelGuardian8 = modelGuardian;
        ModelGuardian modelGuardian9 = modelGuardian;
        modelGuardian8.guardianBody.J(modelGuardian9.guardianTail[uSa.E]);
        modelGuardian8.guardianTail[uSa.E].J(modelGuardian.guardianTail[vRa.d]);
        modelGuardian9.guardianTail[vRa.d].J(modelGuardian.guardianTail[uqa.g]);
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
        ModelGuardian a2;
        float f9 = f7;
        ModelGuardian modelGuardian = a2 = this;
        modelGuardian.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelGuardian.guardianBody.C((float)h2);
    }

    public int J() {
        return GPa.C;
    }
}

