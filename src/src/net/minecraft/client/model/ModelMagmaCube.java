/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gl
 *  JPa
 *  NQa
 *  NTa
 *  cT
 *  ega
 *  vL
 *  vRa
 *  wOa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelMagmaCube
extends ModelBase {
    public cT core;
    public cT[] segments;

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
        ModelMagmaCube g2;
        ModelMagmaCube h2 = vL2;
        ModelMagmaCube modelMagmaCube = g2 = this;
        modelMagmaCube.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2, (vL)h2);
        modelMagmaCube.core.C((float)a2);
        int n2 = h2 = uSa.E;
        while (n2 < g2.segments.length) {
            g2.segments[h2++].C((float)a2);
            n2 = h2;
        }
    }

    public ModelMagmaCube() {
        int a2;
        ModelMagmaCube modelMagmaCube = this;
        modelMagmaCube.segments = new cT[Yqa.i];
        int n2 = a2 = uSa.E;
        while (n2 < modelMagmaCube.segments.length) {
            ModelMagmaCube modelMagmaCube2;
            int n3 = uSa.E;
            int n4 = a2;
            if (a2 == uqa.g) {
                n3 = osa.c;
                n4 = NTa.C;
                modelMagmaCube2 = modelMagmaCube;
            } else {
                if (a2 == yRa.d) {
                    n3 = osa.c;
                    n4 = wOa.t;
                }
                modelMagmaCube2 = modelMagmaCube;
            }
            modelMagmaCube2.segments[a2] = new cT((ModelBase)modelMagmaCube, n3, n4);
            cT cT2 = modelMagmaCube.segments[a2];
            float f2 = ERa.C + a2;
            cT2.J(NQa.m, f2, NQa.m, Yqa.i, vRa.d, Yqa.i);
            n2 = ++a2;
        }
        modelMagmaCube.core = new cT((ModelBase)modelMagmaCube, uSa.E, ERa.C);
        modelMagmaCube.core.J(dua.ca, vqa.A, dua.ca, AQa.P, AQa.P, AQa.P);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        int c2;
        float f5;
        void a2;
        ModelMagmaCube e22 = gl2;
        ModelMagmaCube d2 = this;
        e22 = (ega)e22;
        float e22 = ((ega)e22).J + (((ega)e22).C - ((ega)e22).J) * a2;
        if (f5 < JPa.N) {
            e22 = JPa.N;
        }
        int n2 = c2 = uSa.E;
        while (n2 < d2.segments.length) {
            cT cT2 = d2.segments[c2];
            float f6 = (float)(-(AQa.P - c2)) * e22;
            cT2.rotationPointY = f6 * rRa.C;
            n2 = ++c2;
        }
    }
}

