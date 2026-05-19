/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  EQa
 *  ERa
 *  Gl
 *  JPa
 *  LQa
 *  Lqa
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  Ppa
 *  bSa
 *  cQa
 *  cT
 *  kPa
 *  kpa
 *  lqa
 *  pPa
 *  uOa
 *  vL
 *  vRa
 *  wOa
 *  wra
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelIronGolem
extends ModelBase {
    public cT ironGolemLeftLeg;
    public cT ironGolemRightLeg;
    public cT ironGolemHead;
    public cT ironGolemBody;
    public cT ironGolemRightArm;
    public cT ironGolemLeftArm;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gl gl2, float f2, float f3, float f4) {
        void b2;
        void c2;
        ModelIronGolem e22 = gl2;
        ModelIronGolem d2 = this;
        int n2 = (e22 = (DDa)e22).g();
        if (n2 > 0) {
            void a2;
            ModelIronGolem modelIronGolem = d2;
            modelIronGolem.ironGolemRightArm.rotateAngleX = dua.ca + Ira.d * d2.J((float)n2 - a2, FRa.Ga);
            modelIronGolem.ironGolemLeftArm.rotateAngleX = dua.ca + Ira.d * d2.J((float)n2 - a2, FRa.Ga);
            return;
        }
        int e22 = e22.I();
        if (e22 > 0) {
            ModelIronGolem modelIronGolem = d2;
            modelIronGolem.ironGolemRightArm.rotateAngleX = uOa.ba + POa.o * d2.J(e22, UOa.d);
            modelIronGolem.ironGolemLeftArm.rotateAngleX = JPa.N;
            return;
        }
        ModelIronGolem modelIronGolem = d2;
        modelIronGolem.ironGolemRightArm.rotateAngleX = (ATa.x + Ira.d * d2.J((float)c2, bSa.J)) * b2;
        modelIronGolem.ironGolemLeftArm.rotateAngleX = (ATa.x - Ira.d * d2.J((float)c2, bSa.J)) * b2;
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3) {
        void b2;
        float c2 = f3;
        ModelIronGolem a2 = this;
        return (Math.abs((float)(b2 % c2 - c2 * MQa.L)) - c2 * rta.o) / (c2 * rta.o);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        void g2;
        void c2;
        void d2;
        ModelIronGolem f8;
        float h2 = f3;
        ModelIronGolem modelIronGolem = f8 = this;
        modelIronGolem.ironGolemHead.rotateAngleY = d2 / zpa.Z;
        modelIronGolem.ironGolemHead.rotateAngleX = c2 / zpa.Z;
        modelIronGolem.ironGolemLeftLeg.rotateAngleX = FRa.ca * f8.J((float)g2, bSa.J) * h2;
        modelIronGolem.ironGolemRightLeg.rotateAngleX = Ira.d * f8.J((float)g2, bSa.J) * h2;
        modelIronGolem.ironGolemLeftLeg.rotateAngleY = JPa.N;
        modelIronGolem.ironGolemRightLeg.rotateAngleY = JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public ModelIronGolem(float f2, float f3) {
        void a2;
        ModelIronGolem b2;
        float c2 = f2;
        ModelIronGolem modelIronGolem = b2 = this;
        int n2 = XOa.h;
        int n3 = XOa.h;
        modelIronGolem.ironGolemHead = new cT((ModelBase)b2).J(n2, n3);
        b2.ironGolemHead.J(JPa.N, JPa.N + a2, dua.ca);
        modelIronGolem.ironGolemHead.f(uSa.E, uSa.E).J(NQa.m, csa.P, KSa.Y, Yqa.i, NTa.C, Yqa.i, c2);
        modelIronGolem.ironGolemHead.f(osa.c, uSa.E).J(vqa.T, CRa.M, APa.D, uqa.g, AQa.P, uqa.g, c2);
        modelIronGolem.ironGolemBody = new cT((ModelBase)b2).J(n2, n3);
        modelIronGolem.ironGolemBody.J(JPa.N, JPa.N + a2, JPa.N);
        modelIronGolem.ironGolemBody.f(uSa.E, wra.P).J(Lqa.C, dua.ca, NSa.b, yOa.B, lqa.s, pPa.f, c2);
        modelIronGolem.ironGolemBody.f(uSa.E, NPa.e).J(EQa.G, FRa.Ga, TOa.p, WOa.fa, tTa.h, uua.p, c2 + MQa.L);
        modelIronGolem.ironGolemRightArm = new cT((ModelBase)b2).J(n2, n3);
        modelIronGolem.ironGolemRightArm.J(JPa.N, NQa.d, JPa.N);
        modelIronGolem.ironGolemRightArm.f(Psa.M, wOa.h).J(kpa.G, Ppa.Ha, TOa.p, AQa.P, Fsa.d, uua.p, c2);
        modelIronGolem.ironGolemLeftArm = new cT((ModelBase)b2).J(n2, n3);
        modelIronGolem.ironGolemLeftArm.J(JPa.N, NQa.d, JPa.N);
        modelIronGolem.ironGolemLeftArm.f(Psa.M, lQa.R).J(kPa.S, Ppa.Ha, TOa.p, AQa.P, Fsa.d, uua.p, c2);
        modelIronGolem.ironGolemLeftLeg = new cT((ModelBase)b2, uSa.E, cQa.o).J(n2, n3);
        modelIronGolem.ironGolemLeftLeg.J(NQa.m, vqa.A + a2, JPa.N);
        modelIronGolem.ironGolemLeftLeg.f(LQa.c, uSa.E).J(Ura.T, TOa.p, TOa.p, uua.p, ERa.C, tTa.h, c2);
        modelIronGolem.ironGolemRightLeg = new cT((ModelBase)b2, uSa.E, cQa.o).J(n2, n3);
        modelIronGolem.ironGolemRightLeg.mirror = vRa.d;
        modelIronGolem.ironGolemRightLeg.f(Psa.M, uSa.E).J(eua.C, vqa.A + a2, JPa.N);
        modelIronGolem.ironGolemRightLeg.J(Ura.T, TOa.p, TOa.p, uua.p, ERa.C, tTa.h, c2);
    }

    public ModelIronGolem(float f2) {
        float b2 = f2;
        ModelIronGolem a2 = this;
        a2(b2, NQa.d);
    }

    public ModelIronGolem() {
        a2(JPa.N);
        ModelIronGolem a2;
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
        ModelIronGolem a2;
        float f9 = f7;
        ModelIronGolem modelIronGolem = a2 = this;
        modelIronGolem.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2, (vL)g2);
        modelIronGolem.ironGolemHead.C((float)h2);
        modelIronGolem.ironGolemBody.C((float)h2);
        modelIronGolem.ironGolemLeftLeg.C((float)h2);
        modelIronGolem.ironGolemRightLeg.C((float)h2);
        modelIronGolem.ironGolemRightArm.C((float)h2);
        modelIronGolem.ironGolemLeftArm.C((float)h2);
    }
}

