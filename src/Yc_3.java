/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NTa
 *  XTa
 *  Ypa
 *  aSa
 *  lqa
 *  pPa
 *  vRa
 */
import java.nio.FloatBuffer;
import java.util.Arrays;

public final class Yc_3 {
    /*
     * WARNING - void declaration
     */
    public static void J(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, float[] fArray, float[] fArray2) {
        void b2;
        void c2;
        Object d2 = fArray2;
        FloatBuffer a2 = floatBuffer;
        c2.get((float[])d2);
        void v0 = b2;
        Yc_3.J((float[])v0, (float[])d2);
        a2.put((float[])v0);
    }

    public Yc_3() {
        Yc_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void f(float[] fArray, float[] fArray2, float[] fArray3) {
        int n2;
        float[] fArray4 = fArray;
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            int n4 = uSa.E;
            while (n4 < AQa.P) {
                void a2;
                void b2;
                int c2;
                int n5 = AQa.P * n2 + c2;
                void v3 = b2[AQa.P * n2 + uSa.E] * a2[uSa.E + c2] + b2[AQa.P * n2 + vRa.d] * a2[AQa.P + c2] + b2[AQa.P * n2 + uqa.g] * a2[Yqa.i + c2] + b2[AQa.P * n2 + yRa.d] * a2[lqa.s + c2];
                fArray4[n5] = v3;
                n4 = ++c2;
            }
            n3 = ++n2;
        }
    }

    public static void J(float[] fArray, float[] fArray2) {
        float[] a2;
        float[] b22 = fArray2;
        float[] fArray3 = a2 = fArray;
        float[] fArray4 = a2;
        fArray3[uSa.E] = b22[tTa.h] * b22[NTa.C] * b22[Ypa.A] - b22[tTa.h] * b22[pPa.f] * b22[hpa.Z] - b22[WOa.fa] * b22[uua.p] * b22[Ypa.A] + b22[WOa.fa] * b22[XTa.W] * b22[hpa.Z] + b22[uua.s] * b22[uua.p] * b22[pPa.f] - b22[uua.s] * b22[XTa.W] * b22[NTa.C];
        fArray4[vRa.d] = -b22[vRa.d] * b22[NTa.C] * b22[Ypa.A] + b22[vRa.d] * b22[pPa.f] * b22[hpa.Z] + b22[WOa.fa] * b22[uqa.g] * b22[Ypa.A] - b22[WOa.fa] * b22[yRa.d] * b22[hpa.Z] - b22[uua.s] * b22[uqa.g] * b22[pPa.f] + b22[uua.s] * b22[yRa.d] * b22[NTa.C];
        fArray3[uqa.g] = b22[vRa.d] * b22[uua.p] * b22[Ypa.A] - b22[vRa.d] * b22[XTa.W] * b22[hpa.Z] - b22[tTa.h] * b22[uqa.g] * b22[Ypa.A] + b22[tTa.h] * b22[yRa.d] * b22[hpa.Z] + b22[uua.s] * b22[uqa.g] * b22[XTa.W] - b22[uua.s] * b22[yRa.d] * b22[uua.p];
        fArray4[yRa.d] = -b22[vRa.d] * b22[uua.p] * b22[pPa.f] + b22[vRa.d] * b22[XTa.W] * b22[NTa.C] + b22[tTa.h] * b22[uqa.g] * b22[pPa.f] - b22[tTa.h] * b22[yRa.d] * b22[NTa.C] - b22[WOa.fa] * b22[uqa.g] * b22[XTa.W] + b22[WOa.fa] * b22[yRa.d] * b22[uua.p];
        fArray3[AQa.P] = -b22[AQa.P] * b22[NTa.C] * b22[Ypa.A] + b22[AQa.P] * b22[pPa.f] * b22[hpa.Z] + b22[Yqa.i] * b22[uua.p] * b22[Ypa.A] - b22[Yqa.i] * b22[XTa.W] * b22[hpa.Z] - b22[lqa.s] * b22[uua.p] * b22[pPa.f] + b22[lqa.s] * b22[XTa.W] * b22[NTa.C];
        fArray4[tTa.h] = b22[uSa.E] * b22[NTa.C] * b22[Ypa.A] - b22[uSa.E] * b22[pPa.f] * b22[hpa.Z] - b22[Yqa.i] * b22[uqa.g] * b22[Ypa.A] + b22[Yqa.i] * b22[yRa.d] * b22[hpa.Z] + b22[lqa.s] * b22[uqa.g] * b22[pPa.f] - b22[lqa.s] * b22[yRa.d] * b22[NTa.C];
        fArray3[uua.p] = -b22[uSa.E] * b22[uua.p] * b22[Ypa.A] + b22[uSa.E] * b22[XTa.W] * b22[hpa.Z] + b22[AQa.P] * b22[uqa.g] * b22[Ypa.A] - b22[AQa.P] * b22[yRa.d] * b22[hpa.Z] - b22[lqa.s] * b22[uqa.g] * b22[XTa.W] + b22[lqa.s] * b22[yRa.d] * b22[uua.p];
        fArray4[XTa.W] = b22[uSa.E] * b22[uua.p] * b22[pPa.f] - b22[uSa.E] * b22[XTa.W] * b22[NTa.C] - b22[AQa.P] * b22[uqa.g] * b22[pPa.f] + b22[AQa.P] * b22[yRa.d] * b22[NTa.C] + b22[Yqa.i] * b22[uqa.g] * b22[XTa.W] - b22[Yqa.i] * b22[yRa.d] * b22[uua.p];
        fArray3[Yqa.i] = b22[AQa.P] * b22[WOa.fa] * b22[Ypa.A] - b22[AQa.P] * b22[pPa.f] * b22[uua.s] - b22[Yqa.i] * b22[tTa.h] * b22[Ypa.A] + b22[Yqa.i] * b22[XTa.W] * b22[uua.s] + b22[lqa.s] * b22[tTa.h] * b22[pPa.f] - b22[lqa.s] * b22[XTa.W] * b22[WOa.fa];
        fArray4[WOa.fa] = -b22[uSa.E] * b22[WOa.fa] * b22[Ypa.A] + b22[uSa.E] * b22[pPa.f] * b22[uua.s] + b22[Yqa.i] * b22[vRa.d] * b22[Ypa.A] - b22[Yqa.i] * b22[yRa.d] * b22[uua.s] - b22[lqa.s] * b22[vRa.d] * b22[pPa.f] + b22[lqa.s] * b22[yRa.d] * b22[WOa.fa];
        fArray3[NTa.C] = b22[uSa.E] * b22[tTa.h] * b22[Ypa.A] - b22[uSa.E] * b22[XTa.W] * b22[uua.s] - b22[AQa.P] * b22[vRa.d] * b22[Ypa.A] + b22[AQa.P] * b22[yRa.d] * b22[uua.s] + b22[lqa.s] * b22[vRa.d] * b22[XTa.W] - b22[lqa.s] * b22[yRa.d] * b22[tTa.h];
        float[] fArray5 = a2;
        float[] fArray6 = a2;
        fArray5[pPa.f] = -b22[uSa.E] * b22[tTa.h] * b22[pPa.f] + b22[uSa.E] * b22[XTa.W] * b22[WOa.fa] + b22[AQa.P] * b22[vRa.d] * b22[pPa.f] - b22[AQa.P] * b22[yRa.d] * b22[WOa.fa] - b22[Yqa.i] * b22[vRa.d] * b22[XTa.W] + b22[Yqa.i] * b22[yRa.d] * b22[tTa.h];
        fArray6[lqa.s] = -b22[AQa.P] * b22[WOa.fa] * b22[hpa.Z] + b22[AQa.P] * b22[NTa.C] * b22[uua.s] + b22[Yqa.i] * b22[tTa.h] * b22[hpa.Z] - b22[Yqa.i] * b22[uua.p] * b22[uua.s] - b22[lqa.s] * b22[tTa.h] * b22[NTa.C] + b22[lqa.s] * b22[uua.p] * b22[WOa.fa];
        fArray5[uua.s] = b22[uSa.E] * b22[WOa.fa] * b22[hpa.Z] - b22[uSa.E] * b22[NTa.C] * b22[uua.s] - b22[Yqa.i] * b22[vRa.d] * b22[hpa.Z] + b22[Yqa.i] * b22[uqa.g] * b22[uua.s] + b22[lqa.s] * b22[vRa.d] * b22[NTa.C] - b22[lqa.s] * b22[uqa.g] * b22[WOa.fa];
        fArray6[hpa.Z] = -b22[uSa.E] * b22[tTa.h] * b22[hpa.Z] + b22[uSa.E] * b22[uua.p] * b22[uua.s] + b22[AQa.P] * b22[vRa.d] * b22[hpa.Z] - b22[AQa.P] * b22[uqa.g] * b22[uua.s] - b22[lqa.s] * b22[vRa.d] * b22[uua.p] + b22[lqa.s] * b22[uqa.g] * b22[tTa.h];
        fArray5[Ypa.A] = b22[uSa.E] * b22[tTa.h] * b22[NTa.C] - b22[uSa.E] * b22[uua.p] * b22[WOa.fa] - b22[AQa.P] * b22[vRa.d] * b22[NTa.C] + b22[AQa.P] * b22[uqa.g] * b22[WOa.fa] + b22[Yqa.i] * b22[vRa.d] * b22[uua.p] - b22[Yqa.i] * b22[uqa.g] * b22[tTa.h];
        float b22 = b22[uSa.E] * a2[uSa.E] + b22[vRa.d] * a2[AQa.P] + b22[uqa.g] * a2[Yqa.i] + b22[yRa.d] * a2[lqa.s];
        if ((double)b22 != aSa.V) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < ERa.C) {
                int n4 = n2++;
                a2[n4] = a2[n4] / b22;
                n3 = n2;
            }
        } else {
            Arrays.fill(a2, JPa.N);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(float[] fArray, float[] fArray2, float[] fArray3) {
        void b2;
        float[] a2;
        float[] c2 = fArray3;
        float[] fArray4 = a2 = fArray;
        float[] fArray5 = a2;
        fArray4[uSa.E] = b2[uSa.E] * c2[uSa.E] + b2[AQa.P] * c2[vRa.d] + b2[Yqa.i] * c2[uqa.g] + b2[lqa.s] * c2[yRa.d];
        fArray5[vRa.d] = b2[vRa.d] * c2[uSa.E] + b2[tTa.h] * c2[vRa.d] + b2[WOa.fa] * c2[uqa.g] + b2[uua.s] * c2[yRa.d];
        fArray4[uqa.g] = b2[uqa.g] * c2[uSa.E] + b2[uua.p] * c2[vRa.d] + b2[NTa.C] * c2[uqa.g] + b2[hpa.Z] * c2[yRa.d];
        fArray5[yRa.d] = b2[yRa.d] * c2[uSa.E] + b2[XTa.W] * c2[vRa.d] + b2[pPa.f] * c2[uqa.g] + b2[Ypa.A] * c2[yRa.d];
    }
}

