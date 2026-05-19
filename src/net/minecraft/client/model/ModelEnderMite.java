/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  Oz
 *  cT
 *  pua
 *  vL
 *  vPa
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelEnderMite
extends ModelBase {
    private static final int[][] field_178714_b;
    private static final int field_178715_c;
    private static final int[][] field_178716_a;
    private final cT[] field_178713_d;

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
        ModelEnderMite h = vL2;
        ModelEnderMite g = this;
        g.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2, (vL)h);
        int n2 = h = uSa.E;
        while (n2 < g.field_178713_d.length) {
            g.field_178713_d[h++].C((float)a2);
            n2 = h;
        }
    }

    static {
        int[][] nArrayArray = new int[AQa.P][];
        int[] nArray = new int[yRa.d];
        nArray[uSa.E] = AQa.P;
        nArray[vRa.d] = yRa.d;
        nArray[uqa.g] = uqa.g;
        nArrayArray[uSa.E] = nArray;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = uua.p;
        nArray2[vRa.d] = AQa.P;
        nArray2[uqa.g] = tTa.h;
        nArrayArray[vRa.d] = nArray2;
        int[] nArray3 = new int[yRa.d];
        nArray3[uSa.E] = yRa.d;
        nArray3[vRa.d] = yRa.d;
        nArray3[uqa.g] = vRa.d;
        nArrayArray[uqa.g] = nArray3;
        int[] nArray4 = new int[yRa.d];
        nArray4[uSa.E] = vRa.d;
        nArray4[vRa.d] = uqa.g;
        nArray4[uqa.g] = vRa.d;
        nArrayArray[yRa.d] = nArray4;
        field_178716_a = nArrayArray;
        int[][] nArrayArray2 = new int[AQa.P][];
        int[] nArray5 = new int[uqa.g];
        nArray5[uSa.E] = uSa.E;
        nArray5[vRa.d] = uSa.E;
        nArrayArray2[uSa.E] = nArray5;
        int[] nArray6 = new int[uqa.g];
        nArray6[uSa.E] = uSa.E;
        nArray6[vRa.d] = tTa.h;
        nArrayArray2[vRa.d] = nArray6;
        int[] nArray7 = new int[uqa.g];
        nArray7[uSa.E] = uSa.E;
        nArray7[vRa.d] = hpa.Z;
        nArrayArray2[uqa.g] = nArray7;
        int[] nArray8 = new int[uqa.g];
        nArray8[uSa.E] = uSa.E;
        nArray8[vRa.d] = yOa.B;
        nArrayArray2[yRa.d] = nArray8;
        field_178714_b = nArrayArray2;
        field_178715_c = field_178716_a.length;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        float h = f2;
        ModelEnderMite g = this;
        int n2 = h = uSa.E;
        while (n2 < g.field_178713_d.length) {
            void e2;
            g.field_178713_d[h].rotateAngleY = Oz.C((float)(e2 * ATa.r + (float)h * VPa.i * pua.j)) * pua.j * Jpa.B * (float)(vRa.d + Math.abs(h - uqa.g));
            cT cT2 = g.field_178713_d[h];
            float f8 = Oz.d((float)(e2 * ATa.r + (float)h * VPa.i * pua.j)) * pua.j * Nra.e;
            int n3 = Math.abs(h - uqa.g);
            cT2.rotationPointX = f8 * (float)n3;
            n2 = ++h;
        }
    }

    public ModelEnderMite() {
        int a2;
        ModelEnderMite modelEnderMite = this;
        modelEnderMite.field_178713_d = new cT[field_178715_c];
        float f2 = Ura.T;
        int n2 = a2 = uSa.E;
        while (n2 < modelEnderMite.field_178713_d.length) {
            ModelEnderMite modelEnderMite2 = modelEnderMite;
            int n3 = a2;
            int n4 = a2;
            modelEnderMite2.field_178713_d[n3] = new cT((ModelBase)modelEnderMite, field_178714_b[a2][uSa.E], field_178714_b[a2][vRa.d]);
            modelEnderMite2.field_178713_d[a2].J((float)field_178716_a[a2][uSa.E] * vPa.b, JPa.N, (float)field_178716_a[a2][uqa.g] * vPa.b, field_178716_a[a2][uSa.E], field_178716_a[a2][vRa.d], field_178716_a[a2][uqa.g]);
            modelEnderMite.field_178713_d[a2].J(JPa.N, (float)(osa.c - field_178716_a[a2][vRa.d]), f2);
            if (n3 < modelEnderMite.field_178713_d.length - vRa.d) {
                f2 += (float)(field_178716_a[a2][uqa.g] + field_178716_a[a2 + vRa.d][uqa.g]) * MQa.L;
            }
            n2 = ++a2;
        }
    }
}

