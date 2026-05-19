/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NTa
 *  XTa
 *  Ypa
 *  lqa
 *  pPa
 *  vRa
 */
import org.lwjgl.util.vector.Matrix4f;

public final class Uy_3
extends Matrix4f {
    public Uy_3(float[] fArray) {
        Uy_3 a2;
        Object b2 = fArray;
        Uy_3 uy_3 = a2 = this;
        Object object = b2;
        Uy_3 uy_32 = a2;
        Object object2 = b2;
        Uy_3 uy_33 = a2;
        Object object3 = b2;
        Uy_3 uy_34 = a2;
        Object object4 = b2;
        Uy_3 uy_35 = a2;
        Object object5 = b2;
        a2.m00 = (float)b2[uSa.E];
        a2.m01 = (float)object5[vRa.d];
        uy_35.m02 = (float)object5[uqa.g];
        uy_35.m03 = (float)b2[yRa.d];
        a2.m10 = (float)object4[AQa.P];
        uy_34.m11 = (float)object4[tTa.h];
        uy_34.m12 = (float)b2[uua.p];
        a2.m13 = (float)object3[XTa.W];
        uy_33.m20 = (float)object3[Yqa.i];
        uy_33.m21 = (float)b2[WOa.fa];
        a2.m22 = (float)object2[NTa.C];
        uy_32.m23 = (float)object2[pPa.f];
        uy_32.m30 = (float)b2[lqa.s];
        a2.m31 = (float)object[uua.s];
        uy_3.m32 = (float)object[hpa.Z];
        uy_3.m33 = (float)b2[Ypa.A];
    }

    public Uy_3() {
        Uy_3 a2;
        a2.m32 = a2.m33 = JPa.N;
        a2.m31 = a2.m33;
        a2.m30 = a2.m33;
        a2.m23 = a2.m33;
        a2.m22 = a2.m33;
        a2.m21 = a2.m33;
        a2.m20 = a2.m33;
        a2.m13 = a2.m33;
        a2.m12 = a2.m33;
        a2.m11 = a2.m33;
        a2.m10 = a2.m33;
        a2.m03 = a2.m33;
        a2.m02 = a2.m33;
        a2.m01 = a2.m33;
        a2.m00 = a2.m33;
    }
}

