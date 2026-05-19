/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  Gl
 *  JPa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  YSa
 *  cQa
 *  cT
 *  jpa
 *  lqa
 *  pPa
 *  pua
 *  vL
 *  vPa
 *  vRa
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelWither
extends ModelBase {
    private cT[] field_82904_b;
    private cT[] field_82905_a;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void c2;
        void d2;
        void e2;
        float h2 = f2;
        ModelWither g2 = this;
        h2 = Oz.C((float)(e2 * Nra.e));
        g2.field_82905_a[vRa.d].rotateAngleX = (Wqa.Ca + Yqa.C * h2) * pua.j;
        g2.field_82905_a[uqa.g].J(dua.ca, hpa.fa + Oz.C((float)g2.field_82905_a[vRa.d].rotateAngleX) * FRa.Ga, vPa.b + Oz.d((float)g2.field_82905_a[vRa.d].rotateAngleX) * FRa.Ga);
        g2.field_82905_a[uqa.g].rotateAngleX = (mSa.n + Nra.e * h2) * pua.j;
        g2.field_82904_b[uSa.E].rotateAngleY = d2 / zpa.Z;
        g2.field_82904_b[uSa.E].rotateAngleX = c2 / zpa.Z;
    }

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
        ModelWither e2;
        float h2 = f3;
        ModelWither modelWither = e2 = this;
        modelWither.J((float)f222, h2, (float)d2, (float)c2, (float)b2, (float)a2, (vL)g2);
        g2 = modelWither.field_82904_b;
        int f222 = modelWither.field_82904_b.length;
        int n2 = h2 = uSa.E;
        while (n2 < f222) {
            cT cT2 = g2[h2];
            cT2.C((float)a2);
            n2 = ++h2;
        }
        g2 = e2.field_82905_a;
        f222 = e2.field_82905_a.length;
        int n3 = h2 = uSa.E;
        while (n3 < f222) {
            cT cT3 = g2[h2];
            cT3.C((float)a2);
            n3 = ++h2;
        }
    }

    public ModelWither(float f2) {
        float b2 = f2;
        ModelWither a2 = this;
        a2.textureWidth = ysa.s;
        a2.textureHeight = ysa.s;
        a2.field_82905_a = new cT[yRa.d];
        ModelWither modelWither = a2;
        modelWither.field_82905_a[uSa.E] = new cT((ModelBase)a2, uSa.E, ERa.C);
        modelWither.field_82905_a[uSa.E].J(Cra.fa, kua.k, vPa.b, kTa.j, yRa.d, yRa.d, b2);
        ModelWither modelWither2 = a2;
        modelWither.field_82905_a[vRa.d] = new cT((ModelBase)a2).J(modelWither2.textureWidth, modelWither2.textureHeight);
        modelWither.field_82905_a[vRa.d].J(dua.ca, hpa.fa, vPa.b);
        modelWither.field_82905_a[vRa.d].f(uSa.E, cQa.o).J(JPa.N, JPa.N, JPa.N, yRa.d, NTa.C, yRa.d, b2);
        modelWither.field_82905_a[vRa.d].f(osa.c, cQa.o).J(NQa.m, Ira.d, MQa.L, pPa.f, uqa.g, uqa.g, b2);
        modelWither.field_82905_a[vRa.d].f(osa.c, cQa.o).J(NQa.m, YSa.G, MQa.L, pPa.f, uqa.g, uqa.g, b2);
        modelWither.field_82905_a[vRa.d].f(osa.c, cQa.o).J(NQa.m, jpa.K, MQa.L, pPa.f, uqa.g, uqa.g, b2);
        modelWither.field_82905_a[uqa.g] = new cT((ModelBase)a2, lqa.s, cQa.o);
        modelWither.field_82905_a[uqa.g].J(JPa.N, JPa.N, JPa.N, yRa.d, uua.p, yRa.d, b2);
        modelWither.field_82904_b = new cT[yRa.d];
        ModelWither modelWither3 = a2;
        modelWither3.field_82904_b[uSa.E] = new cT((ModelBase)a2, uSa.E, uSa.E);
        modelWither3.field_82904_b[uSa.E].J(NQa.m, NQa.m, NQa.m, Yqa.i, Yqa.i, Yqa.i, b2);
        modelWither3.field_82904_b[vRa.d] = new cT((ModelBase)a2, fPa.i, uSa.E);
        modelWither3.field_82904_b[vRa.d].J(NQa.m, NQa.m, NQa.m, uua.p, uua.p, uua.p, b2);
        modelWither3.field_82904_b[vRa.d].rotationPointX = sOa.Z;
        modelWither3.field_82904_b[vRa.d].rotationPointY = YSa.G;
        modelWither3.field_82904_b[uqa.g] = new cT((ModelBase)a2, fPa.i, uSa.E);
        modelWither3.field_82904_b[uqa.g].J(NQa.m, NQa.m, NQa.m, uua.p, uua.p, uua.p, b2);
        modelWither3.field_82904_b[uqa.g].rotationPointX = FRa.Ga;
        modelWither3.field_82904_b[uqa.g].rotationPointY = YSa.G;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        void d2;
        float e2 = f3;
        ModelWither b2 = this;
        IDa c2 = (IDa)d2;
        int n2 = e2 = vRa.d;
        while (n2 < yRa.d) {
            b2.field_82904_b[e2].rotateAngleY = (c2.f(e2 - vRa.d) - d2.ba) / zpa.Z;
            cT cT2 = b2.field_82904_b[e2];
            float f5 = c2.J(e2 - vRa.d);
            cT2.rotateAngleX = f5 / zpa.Z;
            n2 = ++e2;
        }
    }
}

