/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AA
 *  ERa
 *  NTa
 *  Oz
 *  Ppa
 *  TQa
 *  Vla
 *  XTa
 *  Ypa
 *  lqa
 *  pPa
 *  uKa
 *  vRa
 *  xJa
 */
import java.nio.FloatBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Vla_1
extends AA {
    private static Vla j = new Vla_1();
    private FloatBuffer J = xJa.J((int)ERa.C);
    private FloatBuffer A = xJa.J((int)ERa.C);
    private FloatBuffer I = xJa.J((int)ERa.C);

    public void J() {
        Vla_1 vla_1 = this;
        vla_1.J.clear();
        vla_1.A.clear();
        vla_1.I.clear();
        uKa.J((int)Ppa.Q, (FloatBuffer)vla_1.J);
        uKa.J((int)TQa.g, (FloatBuffer)vla_1.A);
        Vla_1 vla_12 = vla_1;
        Object a2 = vla_12.j;
        float[] fArray = vla_12.k;
        vla_12.J.flip().limit(ERa.C);
        vla_1.J.get((float[])a2);
        vla_1.A.flip().limit(ERa.C);
        vla_1.A.get(fArray);
        Vla_1 vla_13 = vla_1;
        vla_13.J[uSa.E] = (FloatBuffer)(fArray[uSa.E] * a2[uSa.E] + fArray[vRa.d] * a2[AQa.P] + fArray[uqa.g] * a2[Yqa.i] + fArray[yRa.d] * a2[lqa.s]);
        vla_13.J[vRa.d] = (FloatBuffer)(fArray[uSa.E] * a2[vRa.d] + fArray[vRa.d] * a2[tTa.h] + fArray[uqa.g] * a2[WOa.fa] + fArray[yRa.d] * a2[uua.s]);
        vla_13.J[uqa.g] = (FloatBuffer)(fArray[uSa.E] * a2[uqa.g] + fArray[vRa.d] * a2[uua.p] + fArray[uqa.g] * a2[NTa.C] + fArray[yRa.d] * a2[hpa.Z]);
        vla_13.J[yRa.d] = (FloatBuffer)(fArray[uSa.E] * a2[yRa.d] + fArray[vRa.d] * a2[XTa.W] + fArray[uqa.g] * a2[pPa.f] + fArray[yRa.d] * a2[Ypa.A]);
        vla_13.J[AQa.P] = (FloatBuffer)(fArray[AQa.P] * a2[uSa.E] + fArray[tTa.h] * a2[AQa.P] + fArray[uua.p] * a2[Yqa.i] + fArray[XTa.W] * a2[lqa.s]);
        vla_13.J[tTa.h] = (FloatBuffer)(fArray[AQa.P] * a2[vRa.d] + fArray[tTa.h] * a2[tTa.h] + fArray[uua.p] * a2[WOa.fa] + fArray[XTa.W] * a2[uua.s]);
        vla_13.J[uua.p] = (FloatBuffer)(fArray[AQa.P] * a2[uqa.g] + fArray[tTa.h] * a2[uua.p] + fArray[uua.p] * a2[NTa.C] + fArray[XTa.W] * a2[hpa.Z]);
        vla_13.J[XTa.W] = (FloatBuffer)(fArray[AQa.P] * a2[yRa.d] + fArray[tTa.h] * a2[XTa.W] + fArray[uua.p] * a2[pPa.f] + fArray[XTa.W] * a2[Ypa.A]);
        vla_13.J[Yqa.i] = (FloatBuffer)(fArray[Yqa.i] * a2[uSa.E] + fArray[WOa.fa] * a2[AQa.P] + fArray[NTa.C] * a2[Yqa.i] + fArray[pPa.f] * a2[lqa.s]);
        vla_13.J[WOa.fa] = (FloatBuffer)(fArray[Yqa.i] * a2[vRa.d] + fArray[WOa.fa] * a2[tTa.h] + fArray[NTa.C] * a2[WOa.fa] + fArray[pPa.f] * a2[uua.s]);
        vla_13.J[NTa.C] = (FloatBuffer)(fArray[Yqa.i] * a2[uqa.g] + fArray[WOa.fa] * a2[uua.p] + fArray[NTa.C] * a2[NTa.C] + fArray[pPa.f] * a2[hpa.Z]);
        vla_13.J[pPa.f] = (FloatBuffer)(fArray[Yqa.i] * a2[yRa.d] + fArray[WOa.fa] * a2[XTa.W] + fArray[NTa.C] * a2[pPa.f] + fArray[pPa.f] * a2[Ypa.A]);
        vla_13.J[lqa.s] = (FloatBuffer)(fArray[lqa.s] * a2[uSa.E] + fArray[uua.s] * a2[AQa.P] + fArray[hpa.Z] * a2[Yqa.i] + fArray[Ypa.A] * a2[lqa.s]);
        vla_13.J[uua.s] = (FloatBuffer)(fArray[lqa.s] * a2[vRa.d] + fArray[uua.s] * a2[tTa.h] + fArray[hpa.Z] * a2[WOa.fa] + fArray[Ypa.A] * a2[uua.s]);
        vla_13.J[hpa.Z] = (FloatBuffer)(fArray[lqa.s] * a2[uqa.g] + fArray[uua.s] * a2[uua.p] + fArray[hpa.Z] * a2[NTa.C] + fArray[Ypa.A] * a2[hpa.Z]);
        vla_13.J[Ypa.A] = (FloatBuffer)(fArray[lqa.s] * a2[yRa.d] + fArray[uua.s] * a2[XTa.W] + fArray[hpa.Z] * a2[pPa.f] + fArray[Ypa.A] * a2[Ypa.A]);
        FloatBuffer floatBuffer = vla_13.I[uSa.E];
        floatBuffer[uSa.E] = vla_1.J[yRa.d] - vla_1.J[uSa.E];
        floatBuffer[vRa.d] = vla_1.J[XTa.W] - vla_1.J[AQa.P];
        floatBuffer[uqa.g] = vla_1.J[pPa.f] - vla_1.J[Yqa.i];
        floatBuffer[yRa.d] = vla_1.J[Ypa.A] - vla_1.J[lqa.s];
        vla_13.J((float[])floatBuffer);
        FloatBuffer floatBuffer2 = vla_13.I[vRa.d];
        floatBuffer2[uSa.E] = vla_1.J[yRa.d] + vla_1.J[uSa.E];
        floatBuffer2[vRa.d] = vla_1.J[XTa.W] + vla_1.J[AQa.P];
        floatBuffer2[uqa.g] = vla_1.J[pPa.f] + vla_1.J[Yqa.i];
        floatBuffer2[yRa.d] = vla_1.J[Ypa.A] + vla_1.J[lqa.s];
        vla_13.J((float[])floatBuffer2);
        FloatBuffer floatBuffer3 = vla_13.I[uqa.g];
        floatBuffer3[uSa.E] = vla_1.J[yRa.d] + vla_1.J[vRa.d];
        floatBuffer3[vRa.d] = vla_1.J[XTa.W] + vla_1.J[tTa.h];
        floatBuffer3[uqa.g] = vla_1.J[pPa.f] + vla_1.J[WOa.fa];
        floatBuffer3[yRa.d] = vla_1.J[Ypa.A] + vla_1.J[uua.s];
        vla_13.J((float[])floatBuffer3);
        a2 = vla_13.I[yRa.d];
        Object object = a2;
        object[uSa.E] = vla_1.J[yRa.d] - vla_1.J[vRa.d];
        object[vRa.d] = vla_1.J[XTa.W] - vla_1.J[tTa.h];
        object[uqa.g] = vla_1.J[pPa.f] - vla_1.J[WOa.fa];
        Vla_1 vla_14 = vla_1;
        object[yRa.d] = vla_14.J[Ypa.A] - vla_1.J[uua.s];
        Vla_1 vla_15 = vla_1;
        vla_1.J((float[])a2);
        FloatBuffer floatBuffer4 = vla_15.I[AQa.P];
        floatBuffer4[uSa.E] = vla_1.J[yRa.d] - vla_1.J[uqa.g];
        floatBuffer4[vRa.d] = vla_1.J[XTa.W] - vla_1.J[uua.p];
        floatBuffer4[uqa.g] = vla_1.J[pPa.f] - vla_1.J[NTa.C];
        floatBuffer4[yRa.d] = vla_1.J[Ypa.A] - vla_1.J[hpa.Z];
        vla_15.J((float[])floatBuffer4);
        FloatBuffer floatBuffer5 = vla_14.I[tTa.h];
        floatBuffer5[uSa.E] = vla_1.J[yRa.d] + vla_1.J[uqa.g];
        floatBuffer5[vRa.d] = vla_1.J[XTa.W] + vla_1.J[uua.p];
        floatBuffer5[uqa.g] = vla_1.J[pPa.f] + vla_1.J[NTa.C];
        floatBuffer5[yRa.d] = vla_1.J[Ypa.A] + vla_1.J[hpa.Z];
        vla_15.J((float[])floatBuffer5);
    }

    private void J(float[] fArray) {
        Object b22 = fArray;
        Vla_1 a2 = this;
        Object object = b22;
        Object object2 = b22;
        float b22 = Oz.J((float)(object[uSa.E] * object2[uSa.E] + b22[vRa.d] * b22[vRa.d] + b22[uqa.g] * b22[uqa.g]));
        int n2 = uSa.E;
        object[n2] = object[n2] / b22;
        int n3 = vRa.d;
        object2[n3] = object2[n3] / b22;
        int n4 = uqa.g;
        object[n4] = object[n4] / b22;
        int n5 = yRa.d;
        object[n5] = object[n5] / b22;
    }

    public static AA J() {
        j.J();
        return j;
    }

    public Vla_1() {
        Vla_1 a2;
    }
}

