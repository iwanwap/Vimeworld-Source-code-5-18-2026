/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Bsa
 *  Cra
 *  Cta
 *  ERa
 *  FTa
 *  Fpa
 *  Gl
 *  JPa
 *  KTa
 *  Lqa
 *  MQa
 *  NOa
 *  NQa
 *  NTa
 *  QSa
 *  Qqa
 *  Qsa
 *  RPa
 *  RQa
 *  Rua
 *  Spa
 *  Uta
 *  VQa
 *  Xsa
 *  YSa
 *  Ypa
 *  Yra
 *  ZOa
 *  ZRa
 *  aSa
 *  bRa
 *  bqa
 *  bua
 *  cT
 *  fTa
 *  fsa
 *  hra
 *  kta
 *  lqa
 *  nQa
 *  pDa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  yQa
 *  ysa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelDragon
extends ModelBase {
    private cT jaw;
    private cT wingTip;
    private cT frontFoot;
    private cT rearLegTip;
    private cT rearLeg;
    private cT body;
    private cT frontLeg;
    private cT frontLegTip;
    private cT rearFoot;
    private float partialTicks;
    private cT spine;
    private cT wing;
    private cT head;

    private float J(double a2) {
        double d2 = a2;
        while (d2 >= kta.Da) {
            d2 = a2 - ZOa.Ja;
        }
        double d3 = a2;
        while (d3 < bqa.H) {
            d3 = a2 + ZOa.Ja;
        }
        return (float)a2;
    }

    public ModelDragon(float f2) {
        ModelDragon a2;
        float b2 = f2;
        ModelDragon modelDragon = a2 = this;
        modelDragon.textureWidth = hra.Ja;
        modelDragon.textureHeight = hra.Ja;
        modelDragon.J(Xsa.fa, uSa.E, uSa.E);
        modelDragon.J(sra.R, Qra.J, ZRa.D);
        modelDragon.J(vRa.w, Qra.J, FTa.A);
        modelDragon.J(Mqa.D, uSa.E, uSa.E);
        modelDragon.J(Jpa.j, BRa.E, uSa.E);
        modelDragon.J(VQa.j, pta.c, uSa.E);
        modelDragon.J(fPa.x, BRa.E, Fsa.d);
        modelDragon.J(cPa.q, BRa.E, ZRa.D);
        modelDragon.J(Bsa.S, MTa.U, Yqa.D);
        modelDragon.J(VQa.J, MTa.U, fPa.ga);
        modelDragon.J(aSa.ga, BRa.E, Lqa.h);
        modelDragon.J(nQa.j, BRa.E, PRa.D);
        modelDragon.J(Spa.Ga, FTa.A, Lqa.h);
        modelDragon.J(NOa.q, ppa.f, Lqa.h);
        modelDragon.J(yQa.V, Iqa.t, Ypa.Z);
        modelDragon.J(csa.e, fTa.Ja, Bpa.Z);
        modelDragon.J(ZOa.ja, uSa.E, uSa.E);
        modelDragon.J(fsa.N, QSa.p, uSa.E);
        modelDragon.J(RQa.J, BRa.E, uSa.E);
        b2 = FRa.B;
        ModelDragon modelDragon2 = a2;
        modelDragon.head = new cT((ModelBase)a2, WRa.q);
        modelDragon.head.J(bRa.S, NSa.b, vqa.T, sOa.Z + b2, lqa.s, tTa.h, ERa.C);
        a2.head.J(mPa.R, sOa.Z, sOa.Z, lqa.ga + b2, ERa.C, ERa.C, ERa.C);
        a2.head.mirror = vRa.d;
        a2.head.J(Rua.C, CRa.M, csa.P, Fua.Y + b2, uqa.g, AQa.P, uua.p);
        a2.head.J(hQa.Ga, CRa.M, TOa.p, NSa.b + b2, uqa.g, uqa.g, AQa.P);
        a2.head.mirror = uSa.E;
        a2.head.J(Rua.C, vQa.q, csa.P, Fua.Y + b2, uqa.g, AQa.P, uua.p);
        a2.head.J(hQa.Ga, vQa.q, TOa.p, NSa.b + b2, uqa.g, uqa.g, AQa.P);
        ModelDragon modelDragon3 = a2;
        a2.jaw = new cT((ModelBase)a2, qsa.u);
        modelDragon3.jaw.J(JPa.N, YSa.G, Qsa.k + b2);
        modelDragon3.jaw.J(qsa.u, NSa.b, JPa.N, FRa.B, lqa.s, AQa.P, ERa.C);
        ModelDragon modelDragon4 = a2;
        a2.head.J(modelDragon4.jaw);
        a2.spine = new cT((ModelBase)a2, Mqa.Aa);
        modelDragon4.spine.J(WRa.P, CRa.M, CRa.M, CRa.M, NTa.C, NTa.C, NTa.C);
        a2.spine.J(Rua.C, vqa.T, Lqa.C, TOa.p, uqa.g, AQa.P, uua.p);
        ModelDragon modelDragon5 = a2;
        a2.body = new cT((ModelBase)a2, Eqa.Z);
        modelDragon5.body.J(JPa.N, YSa.G, Qsa.k);
        modelDragon5.body.J(Eqa.Z, csa.P, JPa.N, FRa.B, osa.c, osa.c, ysa.s);
        a2.body.J(Rua.C, vqa.T, NSa.b, Cra.fa, uqa.g, uua.p, lqa.s);
        a2.body.J(Rua.C, vqa.T, NSa.b, FRa.Ga, uqa.g, uua.p, lqa.s);
        a2.body.J(Rua.C, vqa.T, NSa.b, NSa.B, uqa.g, uua.p, lqa.s);
        ModelDragon modelDragon6 = a2;
        a2.wing = new cT((ModelBase)a2, Cta.s);
        modelDragon6.wing.J(csa.P, eua.C, kta.v);
        modelDragon6.wing.J(Uta.Ka, UTa.p, NQa.m, NQa.m, Upa.D, Yqa.i, Yqa.i);
        a2.wing.J(Fpa.v, UTa.p, JPa.N, kta.v, Upa.D, uSa.E, Upa.D);
        ModelDragon modelDragon7 = a2;
        a2.wingTip = new cT((ModelBase)a2, qsa.s);
        modelDragon7.wingTip.J(UTa.p, JPa.N, JPa.N);
        modelDragon7.wingTip.J(Uta.Ka, UTa.p, dua.ca, dua.ca, Upa.D, AQa.P, AQa.P);
        a2.wingTip.J(Fpa.v, UTa.p, JPa.N, kta.v, Upa.D, uSa.E, Upa.D);
        ModelDragon modelDragon8 = a2;
        ModelDragon modelDragon9 = a2;
        modelDragon8.wing.J(modelDragon9.wingTip);
        modelDragon8.frontLeg = new cT((ModelBase)a2, hQa.c);
        modelDragon9.frontLeg.J(csa.P, eta.e, kta.v);
        modelDragon8.frontLeg.J(Qsa.m, NQa.m, NQa.m, NQa.m, Yqa.i, osa.c, Yqa.i);
        ModelDragon modelDragon10 = a2;
        a2.frontLegTip = new cT((ModelBase)a2, Nra.T);
        modelDragon10.frontLegTip.J(JPa.N, eta.e, vqa.T);
        modelDragon10.frontLegTip.J(Qsa.m, TOa.p, vqa.T, TOa.p, uua.p, osa.c, uua.p);
        ModelDragon modelDragon11 = a2;
        ModelDragon modelDragon12 = a2;
        modelDragon11.frontLeg.J(modelDragon12.frontLegTip);
        modelDragon11.frontFoot = new cT((ModelBase)a2, tua.Aa);
        modelDragon12.frontFoot.J(JPa.N, RPa.Ia, JPa.N);
        modelDragon11.frontFoot.J(Qsa.m, NQa.m, JPa.N, csa.P, Yqa.i, AQa.P, ERa.C);
        ModelDragon modelDragon13 = a2;
        ModelDragon modelDragon14 = a2;
        modelDragon13.frontLegTip.J(modelDragon14.frontFoot);
        modelDragon13.rearLeg = new cT((ModelBase)a2, SPa.c);
        modelDragon14.rearLeg.J(FRa.B, Yra.i, CRa.q);
        modelDragon13.rearLeg.J(Qsa.m, sOa.Z, NQa.m, sOa.Z, ERa.C, fPa.i, ERa.C);
        ModelDragon modelDragon15 = a2;
        a2.rearLegTip = new cT((ModelBase)a2, bua.B);
        modelDragon15.rearLegTip.J(JPa.N, Ura.m, NQa.m);
        modelDragon15.rearLegTip.J(Qsa.m, NSa.b, dua.ca, JPa.N, lqa.s, fPa.i, lqa.s);
        ModelDragon modelDragon16 = a2;
        ModelDragon modelDragon17 = a2;
        modelDragon16.rearLeg.J(modelDragon17.rearLegTip);
        modelDragon16.rearFoot = new cT((ModelBase)a2, Qqa.a);
        modelDragon17.rearFoot.J(JPa.N, Ira.Ka, YSa.G);
        modelDragon16.rearFoot.J(Qsa.m, Lqa.C, JPa.N, Lsa.X, yOa.B, uua.p, osa.c);
        ModelDragon modelDragon18 = a2;
        modelDragon18.rearLegTip.J(modelDragon18.rearFoot);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n2;
        int n3;
        void a2;
        float f8;
        int n4;
        pDa g2;
        float f9 = f4;
        ModelDragon d2 = this;
        uKa.e();
        pDa pDa2 = g2 = (pDa)g2;
        float f10 = g2.l + (pDa2.C - g2.l) * d2.partialTicks;
        d2.jaw.rotateAngleX = (float)(Math.sin(f10 * pua.j * kta.v) + oua.i) * psa.N;
        float e2 = (float)(Math.sin(f10 * pua.j * kta.v - pqa.r) + oua.i);
        e2 = (e2 * e2 * pqa.r + e2 * kta.v) * Yqa.C;
        uKa.J((float)JPa.N, (float)(e2 - kta.v), (float)TOa.p);
        uKa.J((float)(e2 * kta.v), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        float h2 = TOa.R;
        float c2 = JPa.N;
        float b2 = Ira.d;
        double[] dArray = pDa2.J(uua.p, d2.partialTicks);
        pDa pDa3 = g2;
        ModelDragon modelDragon = d2;
        float f11 = modelDragon.J(pDa3.J(tTa.h, modelDragon.partialTicks)[uSa.E] - g2.J(NTa.C, d2.partialTicks)[uSa.E]);
        ModelDragon modelDragon2 = d2;
        float f12 = modelDragon2.J(pDa3.J(tTa.h, modelDragon2.partialTicks)[uSa.E] + (double)(f11 / kta.v));
        h2 += kta.v;
        float f13 = f10 * pua.j * kta.v;
        h2 = eta.e;
        float f14 = csa.P;
        int n5 = n4 = uSa.E;
        while (n5 < tTa.h) {
            double[] dArray2 = g2.J(tTa.h - n4, d2.partialTicks);
            f8 = (float)Math.cos((float)n4 * KTa.r + f13) * VPa.i;
            ModelDragon modelDragon3 = d2;
            modelDragon3.spine.rotateAngleY = d2.J(dArray2[uSa.E] - dArray[uSa.E]) * pua.j / Hra.Ga * b2;
            modelDragon3.spine.rotateAngleX = f8 + (float)(dArray2[vRa.d] - dArray[vRa.d]) * pua.j / Hra.Ga * b2 * eua.C;
            d2.spine.rotateAngleZ = -d2.J(dArray2[uSa.E] - (double)f12) * pua.j / Hra.Ga * b2;
            modelDragon3.spine.rotationPointY = h2;
            d2.spine.rotationPointZ = f14;
            d2.spine.rotationPointX = c2;
            h2 = (float)((double)h2 + Math.sin(d2.spine.rotateAngleX) * Wqa.m);
            f14 = (float)((double)f14 - Math.cos(d2.spine.rotateAngleY) * Math.cos(d2.spine.rotateAngleX) * Wqa.m);
            c2 = (float)((double)c2 - Math.sin(d2.spine.rotateAngleY) * Math.cos(d2.spine.rotateAngleX) * Wqa.m);
            d2.spine.C((float)a2);
            n5 = ++n4;
        }
        ModelDragon modelDragon4 = d2;
        d2.head.rotationPointY = h2;
        modelDragon4.head.rotationPointZ = f14;
        modelDragon4.head.rotationPointX = c2;
        double[] dArray3 = g2.J(uSa.E, d2.partialTicks);
        ModelDragon modelDragon5 = d2;
        modelDragon4.head.rotateAngleY = modelDragon5.J(dArray3[uSa.E] - dArray[uSa.E]) * pua.j / Hra.Ga * pqa.r;
        d2.head.rotateAngleZ = -d2.J(dArray3[uSa.E] - (double)f12) * pua.j / Hra.Ga * pqa.r;
        modelDragon5.head.C((float)a2);
        uKa.e();
        uKa.J((float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(-f11 * b2 * pqa.r), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)JPa.N, (float)vqa.T, (float)JPa.N);
        d2.body.rotateAngleZ = JPa.N;
        d2.body.C((float)a2);
        int n6 = n3 = uSa.E;
        while (n6 < uqa.g) {
            uKa.h();
            f8 = f10 * pua.j * kta.v;
            ModelDragon modelDragon6 = d2;
            modelDragon6.wing.rotateAngleX = Mqa.N - (float)Math.cos(f8) * psa.N;
            modelDragon6.wing.rotateAngleY = rta.o;
            modelDragon6.wing.rotateAngleZ = (float)(Math.sin(f8) + fqa.ca) * xSa.la;
            modelDragon6.wingTip.rotateAngleZ = -((float)(Math.sin(f8 + kta.v) + kTa.B)) * wOa.w;
            modelDragon6.rearLeg.rotateAngleX = pqa.r + e2 * Nra.e;
            modelDragon6.rearLegTip.rotateAngleX = MQa.L + e2 * Nra.e;
            modelDragon6.rearFoot.rotateAngleX = wOa.w + e2 * Nra.e;
            modelDragon6.frontLeg.rotateAngleX = Jsa.Z + e2 * Nra.e;
            modelDragon6.frontLegTip.rotateAngleX = vPa.b - e2 * Nra.e;
            modelDragon6.frontFoot.rotateAngleX = wOa.w + e2 * Nra.e;
            modelDragon6.wing.C((float)a2);
            modelDragon6.frontLeg.C((float)a2);
            modelDragon6.rearLeg.C((float)a2);
            uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
            if (n3 == 0) {
                uKa.M((int)Yua.O);
            }
            n6 = ++n3;
        }
        uKa.D();
        uKa.M((int)Zra.W);
        uKa.m();
        float f15 = -((float)Math.sin(f10 * pua.j * kta.v)) * JPa.N;
        f13 = f10 * pua.j * kta.v;
        h2 = FRa.Ga;
        f14 = gua.l;
        c2 = JPa.N;
        dArray = g2.J(pPa.f, d2.partialTicks);
        int n7 = n2 = uSa.E;
        while (n7 < lqa.s) {
            dArray3 = g2.J(lqa.s + n2, d2.partialTicks);
            f15 = (float)((double)f15 + Math.sin((float)n2 * KTa.r + f13) * ySa.Ja);
            ModelDragon modelDragon7 = d2;
            modelDragon7.spine.rotateAngleY = (d2.J(dArray3[uSa.E] - dArray[uSa.E]) * b2 + Hra.Ga) * pua.j / Hra.Ga;
            modelDragon7.spine.rotateAngleX = f15 + (float)(dArray3[vRa.d] - dArray[vRa.d]) * pua.j / Hra.Ga * b2 * eua.C;
            d2.spine.rotateAngleZ = d2.J(dArray3[uSa.E] - (double)f12) * pua.j / Hra.Ga * b2;
            modelDragon7.spine.rotationPointY = h2;
            d2.spine.rotationPointZ = f14;
            d2.spine.rotationPointX = c2;
            h2 = (float)((double)h2 + Math.sin(d2.spine.rotateAngleX) * Wqa.m);
            f14 = (float)((double)f14 - Math.cos(d2.spine.rotateAngleY) * Math.cos(d2.spine.rotateAngleX) * Wqa.m);
            c2 = (float)((double)c2 - Math.sin(d2.spine.rotateAngleY) * Math.cos(d2.spine.rotateAngleX) * Wqa.m);
            d2.spine.C((float)a2);
            n7 = ++n2;
        }
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        void e2;
        float f5 = f4;
        ModelDragon a2 = this;
        a2.partialTicks = e2;
    }
}

