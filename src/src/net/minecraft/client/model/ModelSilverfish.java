/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  MQa
 *  NTa
 *  Oz
 *  XTa
 *  Yra
 *  cQa
 *  cT
 *  pPa
 *  psa
 *  pua
 *  vL
 *  vPa
 *  vRa
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;

public final class ModelSilverfish
extends ModelBase {
    private static final int[][] silverfishTexturePositions;
    private cT[] silverfishWings;
    private static final int[][] silverfishBoxLength;
    private float[] field_78170_c;
    private cT[] silverfishBodyParts;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, vL vL2) {
        float h = f2;
        ModelSilverfish g2 = this;
        int n2 = h = uSa.E;
        while (n2 < g2.silverfishBodyParts.length) {
            void e2;
            g2.silverfishBodyParts[h].rotateAngleY = Oz.C((float)(e2 * ATa.r + (float)h * VPa.i * pua.j)) * pua.j * Yqa.C * (float)(vRa.d + Math.abs(h - uqa.g));
            cT cT2 = g2.silverfishBodyParts[h];
            float f8 = Oz.d((float)(e2 * ATa.r + (float)h * VPa.i * pua.j)) * pua.j * psa.N;
            int n3 = Math.abs(h - uqa.g);
            cT2.rotationPointX = f8 * (float)n3;
            n2 = ++h;
        }
        ModelSilverfish modelSilverfish = g2;
        modelSilverfish.silverfishWings[uSa.E].rotateAngleY = g2.silverfishBodyParts[uqa.g].rotateAngleY;
        modelSilverfish.silverfishWings[vRa.d].rotateAngleY = g2.silverfishBodyParts[AQa.P].rotateAngleY;
        g2.silverfishWings[vRa.d].rotationPointX = g2.silverfishBodyParts[AQa.P].rotationPointX;
        modelSilverfish.silverfishWings[uqa.g].rotateAngleY = g2.silverfishBodyParts[vRa.d].rotateAngleY;
        modelSilverfish.silverfishWings[uqa.g].rotationPointX = g2.silverfishBodyParts[vRa.d].rotationPointX;
    }

    static {
        int[][] nArrayArray = new int[XTa.W][];
        int[] nArray = new int[yRa.d];
        nArray[uSa.E] = yRa.d;
        nArray[vRa.d] = uqa.g;
        nArray[uqa.g] = uqa.g;
        nArrayArray[uSa.E] = nArray;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = AQa.P;
        nArray2[vRa.d] = yRa.d;
        nArray2[uqa.g] = uqa.g;
        nArrayArray[vRa.d] = nArray2;
        int[] nArray3 = new int[yRa.d];
        nArray3[uSa.E] = uua.p;
        nArray3[vRa.d] = AQa.P;
        nArray3[uqa.g] = yRa.d;
        nArrayArray[uqa.g] = nArray3;
        int[] nArray4 = new int[yRa.d];
        nArray4[uSa.E] = yRa.d;
        nArray4[vRa.d] = yRa.d;
        nArray4[uqa.g] = yRa.d;
        nArrayArray[yRa.d] = nArray4;
        int[] nArray5 = new int[yRa.d];
        nArray5[uSa.E] = uqa.g;
        nArray5[vRa.d] = uqa.g;
        nArray5[uqa.g] = yRa.d;
        nArrayArray[AQa.P] = nArray5;
        int[] nArray6 = new int[yRa.d];
        nArray6[uSa.E] = uqa.g;
        nArray6[vRa.d] = vRa.d;
        nArray6[uqa.g] = uqa.g;
        nArrayArray[tTa.h] = nArray6;
        int[] nArray7 = new int[yRa.d];
        nArray7[uSa.E] = vRa.d;
        nArray7[vRa.d] = vRa.d;
        nArray7[uqa.g] = uqa.g;
        nArrayArray[uua.p] = nArray7;
        silverfishBoxLength = nArrayArray;
        int[][] nArrayArray2 = new int[XTa.W][];
        int[] nArray8 = new int[uqa.g];
        nArray8[uSa.E] = uSa.E;
        nArray8[vRa.d] = uSa.E;
        nArrayArray2[uSa.E] = nArray8;
        int[] nArray9 = new int[uqa.g];
        nArray9[uSa.E] = uSa.E;
        nArray9[vRa.d] = AQa.P;
        nArrayArray2[vRa.d] = nArray9;
        int[] nArray10 = new int[uqa.g];
        nArray10[uSa.E] = uSa.E;
        nArray10[vRa.d] = WOa.fa;
        nArrayArray2[uqa.g] = nArray10;
        int[] nArray11 = new int[uqa.g];
        nArray11[uSa.E] = uSa.E;
        nArray11[vRa.d] = ERa.C;
        nArrayArray2[yRa.d] = nArray11;
        int[] nArray12 = new int[uqa.g];
        nArray12[uSa.E] = uSa.E;
        nArray12[vRa.d] = cQa.o;
        nArrayArray2[AQa.P] = nArray12;
        int[] nArray13 = new int[uqa.g];
        nArray13[uSa.E] = pPa.f;
        nArray13[vRa.d] = uSa.E;
        nArrayArray2[tTa.h] = nArray13;
        int[] nArray14 = new int[uqa.g];
        nArray14[uSa.E] = uua.s;
        nArray14[vRa.d] = AQa.P;
        nArrayArray2[uua.p] = nArray14;
        silverfishTexturePositions = nArrayArray2;
    }

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
        ModelSilverfish h = vL2;
        ModelSilverfish g2 = this;
        g2.J((float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2, (vL)h);
        int n2 = h = uSa.E;
        while (n2 < g2.silverfishBodyParts.length) {
            g2.silverfishBodyParts[h++].C((float)a2);
            n2 = h;
        }
        int n3 = h = uSa.E;
        while (n3 < g2.silverfishWings.length) {
            g2.silverfishWings[h++].C((float)a2);
            n3 = h;
        }
    }

    public ModelSilverfish() {
        int a2;
        ModelSilverfish modelSilverfish = this;
        modelSilverfish.silverfishBodyParts = new cT[XTa.W];
        modelSilverfish.field_78170_c = new float[XTa.W];
        float f2 = Ura.T;
        int n2 = a2 = uSa.E;
        while (n2 < modelSilverfish.silverfishBodyParts.length) {
            ModelSilverfish modelSilverfish2 = modelSilverfish;
            int n3 = a2;
            int n4 = a2;
            modelSilverfish2.silverfishBodyParts[n3] = new cT((ModelBase)modelSilverfish, silverfishTexturePositions[a2][uSa.E], silverfishTexturePositions[a2][vRa.d]);
            modelSilverfish2.silverfishBodyParts[a2].J((float)silverfishBoxLength[a2][uSa.E] * vPa.b, JPa.N, (float)silverfishBoxLength[a2][uqa.g] * vPa.b, silverfishBoxLength[a2][uSa.E], silverfishBoxLength[a2][vRa.d], silverfishBoxLength[a2][uqa.g]);
            ModelSilverfish modelSilverfish3 = modelSilverfish;
            modelSilverfish3.silverfishBodyParts[a2].J(JPa.N, (float)(osa.c - silverfishBoxLength[a2][vRa.d]), f2);
            modelSilverfish3.field_78170_c[a2] = f2;
            if (n3 < modelSilverfish.silverfishBodyParts.length - vRa.d) {
                f2 += (float)(silverfishBoxLength[a2][uqa.g] + silverfishBoxLength[a2 + vRa.d][uqa.g]) * MQa.L;
            }
            n2 = ++a2;
        }
        modelSilverfish.silverfishWings = new cT[yRa.d];
        ModelSilverfish modelSilverfish4 = modelSilverfish;
        modelSilverfish4.silverfishWings[uSa.E] = new cT((ModelBase)modelSilverfish, kTa.j, uSa.E);
        modelSilverfish4.silverfishWings[uSa.E].J(CRa.M, JPa.N, (float)silverfishBoxLength[uqa.g][uqa.g] * vPa.b, NTa.C, Yqa.i, silverfishBoxLength[uqa.g][uqa.g]);
        ModelSilverfish modelSilverfish5 = modelSilverfish;
        modelSilverfish5.silverfishWings[uSa.E].J(JPa.N, Yra.i, modelSilverfish.field_78170_c[uqa.g]);
        modelSilverfish5.silverfishWings[vRa.d] = new cT((ModelBase)modelSilverfish, kTa.j, pPa.f);
        modelSilverfish5.silverfishWings[vRa.d].J(TOa.p, JPa.N, (float)silverfishBoxLength[AQa.P][uqa.g] * vPa.b, uua.p, AQa.P, silverfishBoxLength[AQa.P][uqa.g]);
        ModelSilverfish modelSilverfish6 = modelSilverfish;
        modelSilverfish6.silverfishWings[vRa.d].J(JPa.N, eta.e, modelSilverfish.field_78170_c[AQa.P]);
        modelSilverfish6.silverfishWings[uqa.g] = new cT((ModelBase)modelSilverfish, kTa.j, yOa.B);
        modelSilverfish6.silverfishWings[uqa.g].J(TOa.p, JPa.N, (float)silverfishBoxLength[AQa.P][uqa.g] * vPa.b, uua.p, tTa.h, silverfishBoxLength[vRa.d][uqa.g]);
        modelSilverfish.silverfishWings[uqa.g].J(JPa.N, LPa.v, modelSilverfish.field_78170_c[vRa.d]);
    }
}

