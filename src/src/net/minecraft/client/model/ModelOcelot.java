/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  Gl
 *  JPa
 *  Lqa
 *  NQa
 *  NTa
 *  ODa
 *  Oz
 *  Ppa
 *  Qsa
 *  Wsa
 *  YSa
 *  Ypa
 *  Zpa
 *  bpa
 *  cT
 *  isa
 *  jpa
 *  kta
 *  pPa
 *  pqa
 *  pua
 *  qta
 *  uKa
 *  uOa
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  wra
 *  xOa
 *  zsa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelOcelot
extends ModelBase {
    public cT ocelotFrontLeftLeg;
    public cT ocelotFrontRightLeg;
    public cT ocelotBackRightLeg;
    public cT ocelotHead;
    public cT ocelotTail;
    public int field_78163_i;
    public cT ocelotBackLeftLeg;
    public cT ocelotTail2;
    public cT ocelotBody;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void g22;
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f8;
        ModelOcelot a2;
        float f9 = f7;
        ModelOcelot modelOcelot = a2 = this;
        modelOcelot.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g22);
        if (modelOcelot.isChild) {
            float g22 = kta.v;
            uKa.e();
            uKa.l((float)(Ira.d / g22), (float)(Ira.d / g22), (float)(Ira.d / g22));
            uKa.J((float)JPa.N, (float)(FRa.Ga * h2), (float)(YSa.G * h2));
            ModelOcelot modelOcelot2 = a2;
            modelOcelot2.ocelotHead.C((float)h2);
            uKa.D();
            uKa.e();
            uKa.l((float)(pqa.r / g22), (float)(pqa.r / g22), (float)(pqa.r / g22));
            uKa.J((float)JPa.N, (float)(KSa.I * h2), (float)JPa.N);
            modelOcelot2.ocelotBody.C((float)h2);
            modelOcelot2.ocelotBackLeftLeg.C((float)h2);
            modelOcelot2.ocelotBackRightLeg.C((float)h2);
            modelOcelot2.ocelotFrontLeftLeg.C((float)h2);
            modelOcelot2.ocelotFrontRightLeg.C((float)h2);
            modelOcelot2.ocelotTail.C((float)h2);
            modelOcelot2.ocelotTail2.C((float)h2);
            uKa.D();
            return;
        }
        ModelOcelot modelOcelot3 = a2;
        modelOcelot3.ocelotHead.C((float)h2);
        modelOcelot3.ocelotBody.C((float)h2);
        modelOcelot3.ocelotTail.C((float)h2);
        modelOcelot3.ocelotTail2.C((float)h2);
        modelOcelot3.ocelotBackLeftLeg.C((float)h2);
        modelOcelot3.ocelotBackRightLeg.C((float)h2);
        modelOcelot3.ocelotFrontLeftLeg.C((float)h2);
        modelOcelot3.ocelotFrontRightLeg.C((float)h2);
    }

    public ModelOcelot() {
        ModelOcelot a2;
        ModelOcelot modelOcelot = a2;
        modelOcelot.field_78163_i = vRa.d;
        modelOcelot.J(APa.Y, uSa.E, uSa.E);
        modelOcelot.J(PQa.h, uSa.E, osa.c);
        modelOcelot.J(yOa.O, uSa.E, NTa.C);
        modelOcelot.J(Wsa.R, uua.p, NTa.C);
        ModelOcelot modelOcelot2 = a2;
        modelOcelot.ocelotHead = new cT((ModelBase)a2, WRa.q);
        modelOcelot.ocelotHead.J(Qsa.m, Ppa.Ha, dua.ca, TOa.p, tTa.h, AQa.P, tTa.h);
        a2.ocelotHead.J(Zpa.S, FRa.ca, JPa.N, NQa.m, yRa.d, uqa.g, uqa.g);
        a2.ocelotHead.J(tpa.A, dua.ca, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        a2.ocelotHead.J(wta.i, pqa.r, TOa.p, JPa.N, vRa.d, vRa.d, uqa.g);
        ModelOcelot modelOcelot3 = a2;
        modelOcelot3.ocelotHead.J(JPa.N, qta.D, Lqa.C);
        a2.ocelotBody = new cT((ModelBase)a2, kTa.j, uSa.E);
        modelOcelot3.ocelotBody.J(dua.ca, vQa.q, sOa.Z, AQa.P, ERa.C, uua.p, JPa.N);
        modelOcelot3.ocelotBody.J(JPa.N, Fua.Y, Cra.fa);
        modelOcelot3.ocelotTail = new cT((ModelBase)a2, uSa.E, Ypa.A);
        modelOcelot3.ocelotTail.J(vPa.b, JPa.N, JPa.N, vRa.d, Yqa.i, vRa.d);
        ModelOcelot modelOcelot4 = a2;
        modelOcelot4.ocelotTail.rotateAngleX = ATa.r;
        modelOcelot4.ocelotTail.J(JPa.N, qta.D, Qsa.k);
        a2.ocelotTail2 = new cT((ModelBase)a2, AQa.P, Ypa.A);
        modelOcelot4.ocelotTail2.J(vPa.b, JPa.N, JPa.N, vRa.d, Yqa.i, vRa.d);
        ModelOcelot modelOcelot5 = a2;
        modelOcelot5.ocelotTail2.J(JPa.N, eta.e, bsa.la);
        a2.ocelotBackLeftLeg = new cT((ModelBase)a2, Yqa.i, uua.s);
        modelOcelot5.ocelotBackLeftLeg.J(vqa.T, JPa.N, pqa.r, uqa.g, uua.p, uqa.g);
        ModelOcelot modelOcelot6 = a2;
        modelOcelot6.ocelotBackLeftLeg.J(isa.W, vqa.A, eua.C);
        a2.ocelotBackRightLeg = new cT((ModelBase)a2, Yqa.i, uua.s);
        modelOcelot6.ocelotBackRightLeg.J(vqa.T, JPa.N, pqa.r, uqa.g, uua.p, uqa.g);
        ModelOcelot modelOcelot7 = a2;
        modelOcelot7.ocelotBackRightLeg.J(zua.w, vqa.A, eua.C);
        a2.ocelotFrontLeftLeg = new cT((ModelBase)a2, wra.P, uSa.E);
        modelOcelot7.ocelotFrontLeftLeg.J(vqa.T, JPa.N, JPa.N, uqa.g, NTa.C, uqa.g);
        ModelOcelot modelOcelot8 = a2;
        modelOcelot8.ocelotFrontLeftLeg.J(pPa.c, pua.A, CRa.M);
        a2.ocelotFrontRightLeg = new cT((ModelBase)a2, wra.P, uSa.E);
        modelOcelot8.ocelotFrontRightLeg.J(vqa.T, JPa.N, JPa.N, uqa.g, NTa.C, uqa.g);
        a2.ocelotFrontRightLeg.J(qQa.f, pua.A, CRa.M);
    }

    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        ModelOcelot e2 = gl2;
        ModelOcelot d2 = this;
        e2 = (ODa)e2;
        ModelOcelot modelOcelot = d2;
        modelOcelot.ocelotBody.rotationPointY = Fua.Y;
        modelOcelot.ocelotBody.rotationPointZ = Cra.fa;
        modelOcelot.ocelotHead.rotationPointY = qta.D;
        modelOcelot.ocelotHead.rotationPointZ = Lqa.C;
        modelOcelot.ocelotTail.rotationPointY = qta.D;
        modelOcelot.ocelotTail.rotationPointZ = Qsa.k;
        modelOcelot.ocelotTail2.rotationPointY = eta.e;
        modelOcelot.ocelotTail2.rotationPointZ = bsa.la;
        modelOcelot.ocelotFrontLeftLeg.rotationPointY = d2.ocelotFrontRightLeg.rotationPointY = pua.A;
        ModelOcelot modelOcelot2 = d2;
        modelOcelot2.ocelotFrontLeftLeg.rotationPointZ = modelOcelot2.ocelotFrontRightLeg.rotationPointZ = CRa.M;
        ModelOcelot modelOcelot3 = d2;
        modelOcelot3.ocelotBackLeftLeg.rotationPointY = modelOcelot3.ocelotBackRightLeg.rotationPointY = vqa.A;
        ModelOcelot modelOcelot4 = d2;
        modelOcelot4.ocelotBackLeftLeg.rotationPointZ = modelOcelot4.ocelotBackRightLeg.rotationPointZ = eua.C;
        d2.ocelotTail.rotateAngleX = ATa.r;
        if (e2.q()) {
            ModelOcelot modelOcelot5 = d2;
            modelOcelot5.ocelotBody.rotationPointY += pqa.r;
            modelOcelot5.ocelotHead.rotationPointY += kta.v;
            modelOcelot5.ocelotTail.rotationPointY += pqa.r;
            modelOcelot5.ocelotTail2.rotationPointY += NQa.m;
            modelOcelot5.ocelotTail2.rotationPointZ += kta.v;
            modelOcelot5.ocelotTail.rotateAngleX = jpa.f;
            modelOcelot5.ocelotTail2.rotateAngleX = jpa.f;
            modelOcelot5.field_78163_i = uSa.E;
            return;
        }
        if (e2.j()) {
            d2.ocelotTail2.rotationPointY = d2.ocelotTail.rotationPointY;
            d2.ocelotTail2.rotationPointZ += kta.v;
            d2.ocelotTail.rotateAngleX = jpa.f;
            d2.ocelotTail2.rotateAngleX = jpa.f;
            d2.field_78163_i = uqa.g;
            return;
        }
        if (e2.v()) {
            d2.ocelotBody.rotateAngleX = Jra.Z;
            ModelOcelot modelOcelot6 = d2;
            modelOcelot6.ocelotBody.rotationPointY += NQa.m;
            modelOcelot6.ocelotBody.rotationPointZ += eua.C;
            modelOcelot6.ocelotHead.rotationPointY += kua.b;
            modelOcelot6.ocelotHead.rotationPointZ += pqa.r;
            modelOcelot6.ocelotTail.rotationPointY += Qsa.k;
            modelOcelot6.ocelotTail.rotationPointZ += dua.ca;
            modelOcelot6.ocelotTail2.rotationPointY += kta.v;
            modelOcelot6.ocelotTail2.rotationPointZ += uOa.ba;
            modelOcelot6.ocelotTail.rotateAngleX = rSa.v;
            modelOcelot6.ocelotTail2.rotateAngleX = zsa.H;
            modelOcelot6.ocelotFrontLeftLeg.rotateAngleX = d2.ocelotFrontRightLeg.rotateAngleX = pta.H;
            ModelOcelot modelOcelot7 = d2;
            modelOcelot7.ocelotFrontLeftLeg.rotationPointY = modelOcelot7.ocelotFrontRightLeg.rotationPointY = isa.Aa;
            ModelOcelot modelOcelot8 = d2;
            modelOcelot8.ocelotFrontLeftLeg.rotationPointZ = modelOcelot8.ocelotFrontRightLeg.rotationPointZ = NQa.d;
            ModelOcelot modelOcelot9 = d2;
            modelOcelot9.ocelotBackLeftLeg.rotateAngleX = modelOcelot9.ocelotBackRightLeg.rotateAngleX = Fsa.s;
            ModelOcelot modelOcelot10 = d2;
            modelOcelot10.ocelotBackLeftLeg.rotationPointY = modelOcelot10.ocelotBackRightLeg.rotationPointY = POa.Aa;
            ModelOcelot modelOcelot11 = d2;
            modelOcelot11.ocelotBackLeftLeg.rotationPointZ = modelOcelot11.ocelotBackRightLeg.rotationPointZ = pqa.r;
            d2.field_78163_i = yRa.d;
            return;
        }
        d2.field_78163_i = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void d2;
        void c2;
        float h2 = f3;
        ModelOcelot f8 = this;
        f8.ocelotHead.rotateAngleX = c2 / zpa.Z;
        f8.ocelotHead.rotateAngleY = d2 / zpa.Z;
        if (f8.field_78163_i != yRa.d) {
            void g2;
            f8.ocelotBody.rotateAngleX = jpa.f;
            if (f8.field_78163_i == uqa.g) {
                ModelOcelot modelOcelot = f8;
                modelOcelot.ocelotBackLeftLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u)) * pqa.r * h2;
                modelOcelot.ocelotBackRightLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u + bpa.K)) * pqa.r * h2;
                modelOcelot.ocelotFrontLeftLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u + pua.j + bpa.K)) * pqa.r * h2;
                modelOcelot.ocelotFrontRightLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u + pua.j)) * pqa.r * h2;
                modelOcelot.ocelotTail2.rotateAngleX = rSa.v + xOa.b * Oz.C((float)g2) * h2;
                return;
            }
            f8.ocelotBackLeftLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u)) * pqa.r * h2;
            f8.ocelotBackRightLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u + pua.j)) * pqa.r * h2;
            f8.ocelotFrontLeftLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u + pua.j)) * pqa.r * h2;
            f8.ocelotFrontRightLeg.rotateAngleX = Oz.C((float)(g2 * Zra.u)) * pqa.r * h2;
            if (f8.field_78163_i == vRa.d) {
                f8.ocelotTail2.rotateAngleX = rSa.v + Jra.Z * Oz.C((float)g2) * h2;
                return;
            }
            f8.ocelotTail2.rotateAngleX = rSa.v + dua.p * Oz.C((float)g2) * h2;
        }
    }
}

