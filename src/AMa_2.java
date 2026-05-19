/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  JPa
 *  Qsa
 *  SNa
 *  XTa
 *  aKa
 *  cT
 *  tNa
 *  vRa
 */
public final class AMa_2 {
    public final float m;
    public final float C;
    public final float i;
    public final float M;
    private tNa[] k;
    public final float j;
    public final float J;
    public String A;
    private SNa[] I;

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, float f2) {
        int c2;
        AMa_2 aMa_2 = this;
        int n2 = c2 = uSa.E;
        while (n2 < aMa_2.I.length) {
            void a2;
            void b2;
            SNa sNa2 = aMa_2.I[c2];
            sNa2.J((aKa)b2, (float)a2);
            n2 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public AMa_2(cT cT2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f6;
        void g2;
        void h2;
        void i2;
        AMa_2 k2 = cT2;
        AMa_2 j2 = this;
        j2((cT)k2, (int)i2, (int)h2, (float)g2, (float)f6, (float)e2, (int)d2, (int)c2, (int)b2, (float)a2, ((cT)k2).mirror);
    }

    /*
     * WARNING - void declaration
     */
    public AMa_2(cT cT2, int n2, int n3, float f2, float f3, float f4, int n4, int n5, int n6, float f5, boolean bl) {
        void i2;
        void j2;
        void k2;
        void a2;
        void b22;
        void l2;
        void d2;
        void e2;
        void f222;
        void g22;
        void h22;
        AMa_2 c2;
        int n7 = n6;
        AMa_2 aMa_2 = c2 = this;
        AMa_2 aMa_22 = c2;
        AMa_2 aMa_23 = c2;
        aMa_23.C = h22;
        aMa_23.M = g22;
        aMa_22.i = f222;
        aMa_22.j = h22 + (float)e2;
        aMa_2.J = g22 + (float)d2;
        aMa_2.m = f222 + (float)l2;
        aMa_2.k = new tNa[Yqa.i];
        c2.I = new SNa[uua.p];
        void var12_19 = h22 + (float)e2;
        void var13_21 = g22 + (float)d2;
        void var14_22 = f222 + (float)l2;
        h22 -= b22;
        g22 -= b22;
        f222 -= b22;
        var12_19 += b22;
        var13_21 += b22;
        var14_22 += b22;
        if (a2 != false) {
            void v3 = var12_19;
            var12_19 = h22;
            h22 = v3;
        }
        tNa b22 = new tNa((float)h22, (float)g22, (float)f222, JPa.N, JPa.N);
        tNa tNa2 = new tNa((float)var12_19, (float)g22, (float)f222, JPa.N, Qsa.k);
        tNa tNa3 = new tNa((float)var12_19, (float)var13_21, (float)f222, Qsa.k, Qsa.k);
        tNa f222 = new tNa((float)h22, (float)var13_21, (float)f222, Qsa.k, JPa.N);
        tNa tNa4 = new tNa((float)h22, (float)g22, (float)var14_22, JPa.N, JPa.N);
        tNa g22 = new tNa((float)var12_19, (float)g22, (float)var14_22, JPa.N, Qsa.k);
        tNa tNa5 = new tNa((float)var12_19, (float)var13_21, (float)var14_22, Qsa.k, Qsa.k);
        tNa h22 = new tNa((float)h22, (float)var13_21, (float)var14_22, Qsa.k, JPa.N);
        AMa_2 aMa_24 = c2;
        aMa_24.k[uSa.E] = b22;
        aMa_24.k[vRa.d] = tNa2;
        aMa_24.k[uqa.g] = tNa3;
        aMa_24.k[yRa.d] = f222;
        aMa_24.k[AQa.P] = tNa4;
        aMa_24.k[tTa.h] = g22;
        aMa_24.k[uua.p] = tNa5;
        aMa_24.k[XTa.W] = h22;
        tNa[] tNaArray = new tNa[AQa.P];
        tNaArray[uSa.E] = g22;
        tNaArray[vRa.d] = tNa2;
        tNaArray[uqa.g] = tNa3;
        tNaArray[yRa.d] = tNa5;
        void v6 = k2;
        aMa_24.I[uSa.E] = new SNa(tNaArray, (int)(j2 + l2 + e2), (int)(i2 + l2), (int)(j2 + l2 + e2 + l2), (int)(i2 + l2 + d2), v6.textureWidth, v6.textureHeight);
        tNa[] tNaArray2 = new tNa[AQa.P];
        tNaArray2[uSa.E] = b22;
        tNaArray2[vRa.d] = tNa4;
        tNaArray2[uqa.g] = h22;
        tNaArray2[yRa.d] = f222;
        void v8 = j2;
        void v9 = k2;
        c2.I[vRa.d] = new SNa(tNaArray2, (int)v8, (int)(i2 + l2), (int)(v8 + l2), (int)(i2 + l2 + d2), v9.textureWidth, v9.textureHeight);
        tNa[] tNaArray3 = new tNa[AQa.P];
        tNaArray3[uSa.E] = g22;
        tNaArray3[vRa.d] = tNa4;
        tNaArray3[uqa.g] = b22;
        tNaArray3[yRa.d] = tNa2;
        void v11 = i2;
        void v12 = k2;
        c2.I[uqa.g] = new SNa(tNaArray3, (int)(j2 + l2), (int)v11, (int)(j2 + l2 + e2), (int)(v11 + l2), v12.textureWidth, v12.textureHeight);
        tNa[] tNaArray4 = new tNa[AQa.P];
        tNaArray4[uSa.E] = tNa3;
        tNaArray4[vRa.d] = f222;
        tNaArray4[uqa.g] = h22;
        tNaArray4[yRa.d] = tNa5;
        void v14 = k2;
        c2.I[yRa.d] = new SNa(tNaArray4, (int)(j2 + l2 + e2), (int)(i2 + l2), (int)(j2 + l2 + e2 + e2), (int)i2, v14.textureWidth, v14.textureHeight);
        tNa[] tNaArray5 = new tNa[AQa.P];
        tNaArray5[uSa.E] = tNa2;
        tNaArray5[vRa.d] = b22;
        tNaArray5[uqa.g] = f222;
        tNaArray5[yRa.d] = tNa3;
        void v16 = k2;
        c2.I[AQa.P] = new SNa(tNaArray5, (int)(j2 + l2), (int)(i2 + l2), (int)(j2 + l2 + e2), (int)(i2 + l2 + d2), v16.textureWidth, v16.textureHeight);
        tNa[] tNaArray6 = new tNa[AQa.P];
        tNaArray6[uSa.E] = tNa4;
        tNaArray6[vRa.d] = g22;
        tNaArray6[uqa.g] = tNa5;
        tNaArray6[yRa.d] = h22;
        void v18 = k2;
        c2.I[tTa.h] = new SNa(tNaArray6, (int)(j2 + l2 + e2 + l2), (int)(i2 + l2), (int)(j2 + l2 + e2 + l2 + e2), (int)(i2 + l2 + d2), v18.textureWidth, v18.textureHeight);
        if (a2 != false) {
            int n8 = k2 = uSa.E;
            while (n8 < c2.I.length) {
                c2.I[k2++].J();
                n8 = k2;
            }
        }
    }

    public AMa J(String string) {
        String b2 = string;
        AMa_2 a2 = this;
        a2.A = b2;
        return a2;
    }
}

