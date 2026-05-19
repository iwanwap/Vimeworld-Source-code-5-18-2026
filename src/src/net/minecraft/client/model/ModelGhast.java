/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  MQa
 *  Oz
 *  XTa
 *  bpa
 *  cT
 *  kta
 *  nQa
 *  pqa
 *  psa
 *  uKa
 *  vL
 */
package net.minecraft.client.model;

import java.util.Random;
import net.minecraft.client.model.ModelBase;

public final class ModelGhast
extends ModelBase {
    public cT body;
    public cT[] tentacles;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        cT[] g2;
        void a2;
        void b2;
        void c2;
        void d2;
        void f222;
        ModelGhast e2;
        float h2 = f3;
        ModelGhast modelGhast = e2 = this;
        modelGhast.J((float)f222, h2, (float)d2, (float)c2, (float)b2, (float)a2, (vL)g2);
        uKa.e();
        uKa.J((float)JPa.N, (float)Ora.D, (float)JPa.N);
        modelGhast.body.C((float)a2);
        g2 = modelGhast.tentacles;
        int f222 = modelGhast.tentacles.length;
        int n2 = h2 = uSa.E;
        while (n2 < f222) {
            g2[h2++].C((float)a2);
            n2 = h2;
        }
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        float h2 = f2;
        ModelGhast g2 = this;
        int n2 = h2 = uSa.E;
        while (n2 < g2.tentacles.length) {
            void e2;
            cT cT2 = g2.tentacles[h2];
            float f8 = psa.N * Oz.d((float)(e2 * bpa.K + (float)h2));
            cT2.rotateAngleX = f8 + Xpa.R;
            n2 = ++h2;
        }
    }

    public ModelGhast() {
        ModelGhast modelGhast = this;
        modelGhast.tentacles = new cT[WOa.fa];
        int n2 = nQa.u;
        modelGhast.body = new cT((ModelBase)modelGhast, uSa.E, uSa.E);
        modelGhast.body.J(sOa.Z, sOa.Z, sOa.Z, ERa.C, ERa.C, ERa.C);
        modelGhast.body.rotationPointY += (float)(osa.c + n2);
        Random random = new Random(osa.S);
        int a2 = uSa.E;
        int n3 = a2;
        while (n3 < modelGhast.tentacles.length) {
            ModelGhast modelGhast2 = modelGhast;
            modelGhast2.tentacles[a2] = new cT((ModelBase)modelGhast, uSa.E, uSa.E);
            float f2 = (((float)(a2 % yRa.d) - (float)(a2 / yRa.d % uqa.g) * MQa.L + rta.o) / kta.v * kta.v - pqa.r) * eua.C;
            float f3 = ((float)(a2 / yRa.d) / kta.v * kta.v - pqa.r) * eua.C;
            int n4 = random.nextInt(XTa.W) + Yqa.i;
            modelGhast2.tentacles[a2].J(vqa.T, JPa.N, vqa.T, uqa.g, n4, uqa.g);
            modelGhast.tentacles[a2].rotationPointX = f2;
            modelGhast.tentacles[a2].rotationPointZ = f3;
            cT cT2 = modelGhast.tentacles[a2];
            cT2.rotationPointY = tua.U + n2;
            n3 = ++a2;
        }
    }
}

