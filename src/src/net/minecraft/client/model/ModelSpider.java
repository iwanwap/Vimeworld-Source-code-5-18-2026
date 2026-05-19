/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NQa
 *  NTa
 *  Oz
 *  YSa
 *  Ypa
 *  cT
 *  hqa
 *  jpa
 *  kPa
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  vL
 *  wPa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelSpider
extends ModelBase {
    public cT spiderNeck;
    public cT spiderLeg4;
    public cT spiderLeg2;
    public cT spiderLeg3;
    public cT spiderLeg6;
    public cT spiderLeg8;
    public cT spiderBody;
    public cT spiderHead;
    public cT spiderLeg7;
    public cT spiderLeg1;
    public cT spiderLeg5;

    public ModelSpider() {
        ModelSpider modelSpider;
        ModelSpider modelSpider2 = modelSpider = this;
        float f2 = JPa.N;
        int a2 = Ypa.A;
        modelSpider2.spiderHead = new cT((ModelBase)modelSpider, fPa.i, AQa.P);
        modelSpider.spiderHead.J(NQa.m, NQa.m, sOa.Z, Yqa.i, Yqa.i, Yqa.i, f2);
        modelSpider2.spiderHead.J(JPa.N, (float)a2, TOa.p);
        modelSpider2.spiderNeck = new cT((ModelBase)modelSpider, uSa.E, uSa.E);
        modelSpider2.spiderNeck.J(TOa.p, TOa.p, TOa.p, uua.p, uua.p, uua.p, f2);
        modelSpider2.spiderNeck.J(JPa.N, (float)a2, JPa.N);
        modelSpider2.spiderBody = new cT((ModelBase)modelSpider, uSa.E, lqa.s);
        modelSpider2.spiderBody.J(CRa.M, NQa.m, NSa.b, NTa.C, Yqa.i, lqa.s, f2);
        modelSpider2.spiderBody.J(JPa.N, (float)a2, kPa.S);
        modelSpider2.spiderLeg1 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg1.J(DPa.m, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg1.J(NQa.m, (float)a2, kta.v);
        modelSpider2.spiderLeg2 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg2.J(vqa.T, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg2.J(YSa.G, (float)a2, kta.v);
        modelSpider2.spiderLeg3 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg3.J(DPa.m, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg3.J(NQa.m, (float)a2, pqa.r);
        modelSpider2.spiderLeg4 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg4.J(vqa.T, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg4.J(YSa.G, (float)a2, pqa.r);
        modelSpider2.spiderLeg5 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg5.J(DPa.m, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg5.J(NQa.m, (float)a2, JPa.N);
        modelSpider2.spiderLeg6 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg6.J(vqa.T, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg6.J(YSa.G, (float)a2, JPa.N);
        modelSpider2.spiderLeg7 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg7.J(DPa.m, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg7.J(NQa.m, (float)a2, vqa.T);
        modelSpider2.spiderLeg8 = new cT((ModelBase)modelSpider, yOa.B, uSa.E);
        modelSpider2.spiderLeg8.J(vqa.T, vqa.T, vqa.T, ERa.C, uqa.g, uqa.g, f2);
        modelSpider2.spiderLeg8.J(YSa.G, (float)a2, vqa.T);
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
        ModelSpider a2;
        float f9 = f7;
        ModelSpider modelSpider = a2 = this;
        modelSpider.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelSpider.spiderHead.C((float)h2);
        modelSpider.spiderNeck.C((float)h2);
        modelSpider.spiderBody.C((float)h2);
        modelSpider.spiderLeg1.C((float)h2);
        modelSpider.spiderLeg2.C((float)h2);
        modelSpider.spiderLeg3.C((float)h2);
        modelSpider.spiderLeg4.C((float)h2);
        modelSpider.spiderLeg5.C((float)h2);
        modelSpider.spiderLeg6.C((float)h2);
        modelSpider.spiderLeg7.C((float)h2);
        modelSpider.spiderLeg8.C((float)h2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void f8;
        float g2;
        float c2;
        float d2;
        ModelSpider e2;
        float h2 = f4;
        ModelSpider modelSpider = e2 = this;
        modelSpider.spiderHead.rotateAngleY = d2 / zpa.Z;
        modelSpider.spiderHead.rotateAngleX = c2 / zpa.Z;
        h2 = Jra.Z;
        modelSpider.spiderLeg1.rotateAngleZ = -h2;
        modelSpider.spiderLeg2.rotateAngleZ = h2;
        modelSpider.spiderLeg3.rotateAngleZ = -h2 * wPa.D;
        modelSpider.spiderLeg4.rotateAngleZ = h2 * wPa.D;
        modelSpider.spiderLeg5.rotateAngleZ = -h2 * wPa.D;
        modelSpider.spiderLeg6.rotateAngleZ = h2 * wPa.D;
        modelSpider.spiderLeg7.rotateAngleZ = -h2;
        modelSpider.spiderLeg8.rotateAngleZ = h2;
        h2 = QTa.ga;
        d2 = Tqa.ha;
        modelSpider.spiderLeg1.rotateAngleY = d2 * kta.v + h2;
        modelSpider.spiderLeg2.rotateAngleY = -d2 * kta.v - h2;
        modelSpider.spiderLeg3.rotateAngleY = d2 * pqa.r + h2;
        modelSpider.spiderLeg4.rotateAngleY = -d2 * pqa.r - h2;
        modelSpider.spiderLeg5.rotateAngleY = -d2 * pqa.r + h2;
        modelSpider.spiderLeg6.rotateAngleY = d2 * pqa.r - h2;
        modelSpider.spiderLeg7.rotateAngleY = -d2 * kta.v + h2;
        modelSpider.spiderLeg8.rotateAngleY = d2 * kta.v - h2;
        h2 = -(Oz.C((float)(g2 * Zra.u * kta.v + JPa.N)) * Xpa.R) * f8;
        d2 = -(Oz.C((float)(g2 * Zra.u * kta.v + pua.j)) * Xpa.R) * f8;
        c2 = -(Oz.C((float)(g2 * Zra.u * kta.v + jpa.f)) * Xpa.R) * f8;
        float b2 = -(Oz.C((float)(g2 * Zra.u * kta.v + hqa.Y)) * Xpa.R) * f8;
        float a2 = Math.abs(Oz.d((float)(g2 * Zra.u + JPa.N)) * Xpa.R) * f8;
        float f9 = Math.abs(Oz.d((float)(g2 * Zra.u + pua.j)) * Xpa.R) * f8;
        float f10 = Math.abs(Oz.d((float)(g2 * Zra.u + jpa.f)) * Xpa.R) * f8;
        g2 = Math.abs(Oz.d((float)(g2 * Zra.u + hqa.Y)) * Xpa.R) * f8;
        modelSpider.spiderLeg1.rotateAngleY += h2;
        modelSpider.spiderLeg2.rotateAngleY += -h2;
        modelSpider.spiderLeg3.rotateAngleY += d2;
        modelSpider.spiderLeg4.rotateAngleY += -d2;
        modelSpider.spiderLeg5.rotateAngleY += c2;
        modelSpider.spiderLeg6.rotateAngleY += -c2;
        modelSpider.spiderLeg7.rotateAngleY += b2;
        modelSpider.spiderLeg8.rotateAngleY += -b2;
        modelSpider.spiderLeg1.rotateAngleZ += a2;
        modelSpider.spiderLeg2.rotateAngleZ += -a2;
        modelSpider.spiderLeg3.rotateAngleZ += f9;
        modelSpider.spiderLeg4.rotateAngleZ += -f9;
        modelSpider.spiderLeg5.rotateAngleZ += f10;
        modelSpider.spiderLeg6.rotateAngleZ += -f10;
        modelSpider.spiderLeg7.rotateAngleZ += g2;
        modelSpider.spiderLeg8.rotateAngleZ += -g2;
    }
}

