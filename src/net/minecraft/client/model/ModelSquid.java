/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  QSa
 *  SQa
 *  cT
 *  fTa
 *  lqa
 *  nQa
 *  vL
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelSquid
extends ModelBase {
    public cT squidBody;
    public cT[] squidTentacles;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        int h2;
        float f8 = f5;
        ModelSquid d2 = this;
        cT[] g2 = d2.squidTentacles;
        int f9 = d2.squidTentacles.length;
        int n2 = h2 = uSa.E;
        while (n2 < f9) {
            void e2;
            g2[h2++].rotateAngleX = e2;
            n2 = h2;
        }
    }

    public ModelSquid() {
        ModelSquid modelSquid = this;
        modelSquid.squidTentacles = new cT[Yqa.i];
        int n2 = nQa.u;
        modelSquid.squidBody = new cT((ModelBase)modelSquid, uSa.E, uSa.E);
        modelSquid.squidBody.J(NSa.b, sOa.Z, NSa.b, lqa.s, ERa.C, lqa.s);
        modelSquid.squidBody.rotationPointY += (float)(osa.c + n2);
        int a2 = uSa.E;
        int n3 = a2;
        while (n3 < modelSquid.squidTentacles.length) {
            int n4 = a2;
            modelSquid.squidTentacles[n4] = new cT((ModelBase)modelSquid, QSa.p, uSa.E);
            double d2 = (double)n4 * lQa.f * KPa.y / (double)modelSquid.squidTentacles.length;
            float f2 = (float)Math.cos(d2) * eua.C;
            float f3 = (float)Math.sin(d2) * eua.C;
            ModelSquid modelSquid2 = modelSquid;
            modelSquid2.squidTentacles[a2].rotationPointX = f2;
            modelSquid2.squidTentacles[a2].rotationPointZ = f3;
            modelSquid.squidTentacles[a2].J(vqa.T, JPa.N, vqa.T, uqa.g, yOa.B, uqa.g);
            modelSquid2.squidTentacles[a2].rotationPointY = tua.U + n2;
            d2 = (double)a2 * lQa.f * SQa.E / (double)modelSquid.squidTentacles.length + fTa.o;
            cT cT2 = modelSquid.squidTentacles[a2];
            cT2.rotateAngleY = (float)d2;
            n3 = ++a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelSquid g2;
        ModelSquid h2 = vL2;
        ModelSquid modelSquid = g2 = this;
        modelSquid.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2, (vL)h2);
        modelSquid.squidBody.C((float)a2);
        int n2 = h2 = uSa.E;
        while (n2 < g2.squidTentacles.length) {
            g2.squidTentacles[h2++].C((float)a2);
            n2 = h2;
        }
    }
}

