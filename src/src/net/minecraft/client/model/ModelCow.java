/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  FPa
 *  JPa
 *  NQa
 *  NTa
 *  YSa
 *  cQa
 *  cT
 *  kta
 *  lqa
 *  pqa
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelQuadruped;

public final class ModelCow
extends ModelQuadruped {
    public ModelCow() {
        ModelCow a2;
        ModelCow modelCow = a2;
        super(lqa.s, JPa.N);
        modelCow.head = new cT((ModelBase)a2, uSa.E, uSa.E);
        a2.head.J(NQa.m, NQa.m, NSa.b, Yqa.i, Yqa.i, uua.p, JPa.N);
        modelCow.head.J(JPa.N, YSa.G, sOa.Z);
        modelCow.head.f(cQa.o, uSa.E).J(CRa.M, CRa.M, NQa.m, vRa.d, yRa.d, vRa.d, JPa.N);
        modelCow.head.f(cQa.o, uSa.E).J(YSa.G, CRa.M, NQa.m, vRa.d, yRa.d, vRa.d, JPa.N);
        modelCow.body = new cT((ModelBase)a2, yOa.B, AQa.P);
        modelCow.body.J(NSa.b, Cra.fa, NQa.d, lqa.s, yOa.B, NTa.C, JPa.N);
        modelCow.body.J(JPa.N, eua.C, kta.v);
        modelCow.body.f(FPa.F, uSa.E).J(dua.ca, kta.v, sOa.Z, AQa.P, uua.p, vRa.d);
        ModelCow modelCow2 = a2;
        modelCow2.leg1.rotationPointX -= pqa.r;
        modelCow2.leg2.rotationPointX += pqa.r;
        modelCow2.leg1.rotationPointZ += JPa.N;
        modelCow2.leg2.rotationPointZ += JPa.N;
        modelCow2.leg3.rotationPointX -= pqa.r;
        modelCow2.leg4.rotationPointX += pqa.r;
        modelCow2.leg3.rotationPointZ -= pqa.r;
        modelCow2.leg4.rotationPointZ -= pqa.r;
        modelCow2.childZOffset += kta.v;
    }
}

