/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Tpa
 *  YSa
 *  Yra
 *  ZRa
 *  cQa
 *  cT
 *  kta
 *  lqa
 *  mEa
 *  pqa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelBat
extends ModelBase {
    private cT batHead;
    private cT batOuterRightWing;
    private cT batRightWing;
    private cT batBody;
    private cT batOuterLeftWing;
    private cT batLeftWing;

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
        ModelBat a2;
        float f9 = f7;
        ModelBat modelBat = a2 = this;
        modelBat.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelBat.batHead.C((float)h2);
        modelBat.batBody.C((float)h2);
    }

    public ModelBat() {
        ModelBat modelBat;
        ModelBat modelBat2 = modelBat = this;
        modelBat2.textureWidth = ysa.s;
        modelBat2.textureHeight = ysa.s;
        ModelBat modelBat3 = modelBat;
        modelBat2.batHead = new cT((ModelBase)modelBat, uSa.E, uSa.E);
        modelBat2.batHead.J(TOa.p, TOa.p, TOa.p, uua.p, uua.p, uua.p);
        ModelBat a2 = new cT((ModelBase)modelBat, osa.c, uSa.E);
        a2.J(NQa.m, NSa.b, dua.ca, yRa.d, AQa.P, vRa.d);
        modelBat.batHead.J((cT)a2);
        a2 = new cT((ModelBase)modelBat, osa.c, uSa.E);
        ((cT)a2).mirror = vRa.d;
        a2.J(pqa.r, NSa.b, dua.ca, yRa.d, AQa.P, vRa.d);
        ModelBat modelBat4 = modelBat;
        modelBat4.batHead.J((cT)a2);
        modelBat.batBody = new cT((ModelBase)modelBat, uSa.E, ERa.C);
        modelBat4.batBody.J(TOa.p, YSa.G, TOa.p, uua.p, lqa.s, uua.p);
        modelBat.batBody.f(uSa.E, Tpa.z).J(CRa.M, Yra.i, JPa.N, NTa.C, uua.p, vRa.d);
        ModelBat modelBat5 = modelBat;
        modelBat5.batRightWing = new cT((ModelBase)modelBat5, cQa.i, uSa.E);
        modelBat5.batRightWing.J(csa.P, pqa.r, Ira.d, NTa.C, ERa.C, vRa.d);
        ModelBat modelBat6 = modelBat;
        modelBat.batOuterRightWing = new cT((ModelBase)modelBat, osa.c, ERa.C);
        modelBat6.batOuterRightWing.J(csa.P, pqa.r, Ira.d);
        modelBat6.batOuterRightWing.J(sOa.Z, pqa.r, JPa.N, Yqa.i, lqa.s, vRa.d);
        modelBat.batLeftWing = new cT((ModelBase)modelBat, cQa.i, uSa.E);
        modelBat.batLeftWing.mirror = vRa.d;
        modelBat.batLeftWing.J(kta.v, pqa.r, Ira.d, NTa.C, ERa.C, vRa.d);
        ModelBat modelBat7 = modelBat;
        modelBat.batOuterLeftWing = new cT((ModelBase)modelBat, osa.c, ERa.C);
        modelBat7.batOuterLeftWing.mirror = vRa.d;
        modelBat7.batOuterLeftWing.J(Fua.Y, pqa.r, Ira.d);
        modelBat7.batOuterLeftWing.J(JPa.N, pqa.r, JPa.N, Yqa.i, lqa.s, vRa.d);
        ModelBat modelBat8 = modelBat;
        ModelBat modelBat9 = modelBat;
        modelBat8.batBody.J(modelBat9.batRightWing);
        modelBat8.batBody.J(modelBat.batLeftWing);
        modelBat9.batRightWing.J(modelBat.batOuterRightWing);
        modelBat8.batLeftWing.J(modelBat.batOuterLeftWing);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void e2;
        void d2;
        void h2;
        void a2;
        float f8 = f6;
        ModelBat c2 = this;
        if (((mEa)a2).V()) {
            ModelBat modelBat = c2;
            modelBat.batHead.rotateAngleX = h2 / zpa.Z;
            modelBat.batHead.rotateAngleY = pua.j - d2 / zpa.Z;
            modelBat.batHead.rotateAngleZ = pua.j;
            modelBat.batHead.J(JPa.N, dua.ca, JPa.N);
            modelBat.batRightWing.J(TOa.p, JPa.N, vQa.q);
            modelBat.batLeftWing.J(vQa.q, JPa.N, vQa.q);
            modelBat.batBody.rotateAngleX = pua.j;
            modelBat.batRightWing.rotateAngleX = pta.H;
            modelBat.batRightWing.rotateAngleY = ZRa.Z;
            modelBat.batOuterRightWing.rotateAngleY = kra.T;
            modelBat.batLeftWing.rotateAngleX = c2.batRightWing.rotateAngleX;
            modelBat.batLeftWing.rotateAngleY = -c2.batRightWing.rotateAngleY;
            modelBat.batOuterLeftWing.rotateAngleY = -c2.batOuterRightWing.rotateAngleY;
            return;
        }
        ModelBat modelBat = c2;
        modelBat.batHead.rotateAngleX = h2 / zpa.Z;
        modelBat.batHead.rotateAngleY = d2 / zpa.Z;
        modelBat.batHead.rotateAngleZ = JPa.N;
        modelBat.batHead.J(JPa.N, JPa.N, JPa.N);
        modelBat.batRightWing.J(JPa.N, JPa.N, JPa.N);
        modelBat.batLeftWing.J(JPa.N, JPa.N, JPa.N);
        modelBat.batBody.rotateAngleX = Jra.Z + Oz.C((float)(e2 * Nra.e)) * VPa.i;
        modelBat.batBody.rotateAngleY = JPa.N;
        modelBat.batRightWing.rotateAngleY = Oz.C((float)(e2 * Jsa.Z)) * pua.j * rta.o;
        modelBat.batLeftWing.rotateAngleY = -c2.batRightWing.rotateAngleY;
        modelBat.batOuterRightWing.rotateAngleY = c2.batRightWing.rotateAngleY * MQa.L;
        modelBat.batOuterLeftWing.rotateAngleY = -c2.batRightWing.rotateAngleY * MQa.L;
    }
}

