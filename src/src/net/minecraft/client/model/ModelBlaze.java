/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  ERa
 *  JPa
 *  MQa
 *  NQa
 *  Oz
 *  cT
 *  kPa
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  vL
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelBlaze
extends ModelBase {
    private cT[] blazeSticks;
    private cT blazeHead;

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
        ModelBlaze g;
        ModelBlaze h = vL2;
        ModelBlaze modelBlaze = g = this;
        modelBlaze.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2, (vL)h);
        modelBlaze.blazeHead.C((float)a2);
        int n2 = h = uSa.E;
        while (n2 < g.blazeSticks.length) {
            g.blazeSticks[h++].C((float)a2);
            n2 = h;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void c2;
        void d2;
        void e2;
        float h = f3;
        ModelBlaze f8 = this;
        float g = e2 * pua.j * Qra.j;
        int n2 = h = uSa.E;
        while (n2 < AQa.P) {
            ModelBlaze modelBlaze = f8;
            modelBlaze.blazeSticks[h].rotationPointY = dua.ca + Oz.C((float)(((float)(h * uqa.g) + e2) * rta.o));
            float f9 = g;
            modelBlaze.blazeSticks[h].rotationPointX = Oz.C((float)f9) * kPa.S;
            modelBlaze.blazeSticks[h].rotationPointZ = Oz.d((float)g) * kPa.S;
            g = f9 + pqa.r;
            n2 = ++h;
        }
        g = Jra.Z + e2 * pua.j * kTa.J;
        int n3 = h = AQa.P;
        while (n3 < Yqa.i) {
            ModelBlaze modelBlaze = f8;
            modelBlaze.blazeSticks[h].rotationPointY = kta.v + Oz.C((float)(((float)(h * uqa.g) + e2) * rta.o));
            float f10 = g;
            modelBlaze.blazeSticks[h].rotationPointX = Oz.C((float)f10) * BRa.k;
            modelBlaze.blazeSticks[h].rotationPointZ = Oz.d((float)g) * BRa.k;
            g = f10 + pqa.r;
            n3 = ++h;
        }
        g = dua.p + e2 * pua.j * KQa.C;
        int n4 = h = Yqa.i;
        while (n4 < lqa.s) {
            ModelBlaze modelBlaze = f8;
            modelBlaze.blazeSticks[h].rotationPointY = AQa.W + Oz.C((float)(((float)h * Ira.d + e2) * MQa.L));
            float f11 = g;
            modelBlaze.blazeSticks[h].rotationPointX = Oz.C((float)f11) * eua.C;
            modelBlaze.blazeSticks[h].rotationPointZ = Oz.d((float)g) * eua.C;
            g = f11 + pqa.r;
            n4 = ++h;
        }
        ModelBlaze modelBlaze = f8;
        modelBlaze.blazeHead.rotateAngleY = d2 / zpa.Z;
        modelBlaze.blazeHead.rotateAngleX = c2 / zpa.Z;
    }

    public ModelBlaze() {
        int a2;
        ModelBlaze modelBlaze = this;
        modelBlaze.blazeSticks = new cT[lqa.s];
        int n2 = a2 = uSa.E;
        while (n2 < modelBlaze.blazeSticks.length) {
            ModelBlaze modelBlaze2 = modelBlaze;
            modelBlaze2.blazeSticks[a2] = new cT((ModelBase)modelBlaze, uSa.E, ERa.C);
            cT cT2 = modelBlaze2.blazeSticks[a2];
            cT2.J(JPa.N, JPa.N, JPa.N, uqa.g, Yqa.i, uqa.g);
            n2 = ++a2;
        }
        modelBlaze.blazeHead = new cT((ModelBase)modelBlaze, uSa.E, uSa.E);
        modelBlaze.blazeHead.J(NQa.m, NQa.m, NQa.m, Yqa.i, Yqa.i, Yqa.i);
    }
}

