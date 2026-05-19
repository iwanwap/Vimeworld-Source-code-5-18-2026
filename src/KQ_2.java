/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AQ
 *  JPa
 *  Qr
 *  Qsa
 *  XTa
 *  ap
 *  oc
 *  vRa
 *  zp
 */
public final class KQ_2
implements oc {
    public final float C;
    public final float i;
    public final float M;
    public final float k;
    public final float j;
    public final float J;
    public String A;
    public ap[] I;

    /*
     * WARNING - void declaration
     */
    public KQ_2(zp zp2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float[][] fArray) {
        void a2;
        void i2;
        void j2;
        void c2;
        void d2;
        void e2;
        void f9;
        void g2;
        void h2;
        KQ_2 b2;
        float f10 = f8;
        KQ_2 kQ_2 = b2 = this;
        KQ_2 kQ_22 = b2;
        KQ_2 kQ_23 = b2;
        kQ_23.J = h2;
        kQ_23.k = g2;
        kQ_22.C = f9;
        kQ_22.i = h2 + e2;
        kQ_2.M = g2 + d2;
        kQ_2.j = f9 + c2;
        e2 = h2 + e2;
        d2 = g2 + d2;
        c2 = f9 + c2;
        h2 -= j2;
        g2 -= j2;
        f9 -= j2;
        e2 += j2;
        d2 += j2;
        c2 += j2;
        Qr[] qrArray = j2 = new Qr[Yqa.i];
        Qr[] qrArray2 = j2;
        qrArray[uSa.E] = new Qr((float)h2, (float)g2, (float)f9, JPa.N, JPa.N);
        qrArray2[vRa.d] = new Qr((float)e2, (float)g2, (float)f9, JPa.N, Qsa.k);
        qrArray[uqa.g] = new Qr((float)e2, (float)d2, (float)f9, Qsa.k, Qsa.k);
        qrArray2[yRa.d] = new Qr((float)h2, (float)d2, (float)f9, Qsa.k, JPa.N);
        qrArray[AQa.P] = new Qr((float)h2, (float)g2, (float)c2, JPa.N, JPa.N);
        qrArray2[tTa.h] = new Qr((float)e2, (float)g2, (float)c2, JPa.N, Qsa.k);
        qrArray[uua.p] = new Qr((float)e2, (float)d2, (float)c2, Qsa.k, Qsa.k);
        qrArray2[XTa.W] = new Qr((float)h2, (float)d2, (float)c2, Qsa.k, JPa.N);
        b2.I = new ap[uua.p];
        Qr[] qrArray3 = new Qr[AQa.P];
        qrArray3[uSa.E] = j2[tTa.h];
        qrArray3[vRa.d] = j2[vRa.d];
        qrArray3[uqa.g] = j2[uqa.g];
        qrArray3[yRa.d] = j2[uua.p];
        void v6 = i2;
        b2.I[uSa.E] = new ap(qrArray3, (float)a2[AQa.P][uSa.E], (float)a2[AQa.P][vRa.d], (float)a2[AQa.P][uqa.g], (float)a2[AQa.P][yRa.d], v6.o, v6.m);
        Qr[] qrArray4 = new Qr[AQa.P];
        qrArray4[uSa.E] = j2[uSa.E];
        qrArray4[vRa.d] = j2[AQa.P];
        qrArray4[uqa.g] = j2[XTa.W];
        qrArray4[yRa.d] = j2[yRa.d];
        void v8 = i2;
        b2.I[vRa.d] = new ap(qrArray4, (float)a2[tTa.h][uSa.E], (float)a2[tTa.h][vRa.d], (float)a2[tTa.h][uqa.g], (float)a2[tTa.h][yRa.d], v8.o, v8.m);
        Qr[] qrArray5 = new Qr[AQa.P];
        qrArray5[uSa.E] = j2[uSa.E];
        qrArray5[vRa.d] = j2[vRa.d];
        qrArray5[uqa.g] = j2[tTa.h];
        qrArray5[yRa.d] = j2[AQa.P];
        void v10 = i2;
        b2.I[uqa.g] = new ap(qrArray5, (float)a2[yRa.d][uSa.E], (float)a2[yRa.d][vRa.d], (float)a2[yRa.d][uqa.g], (float)a2[yRa.d][yRa.d], v10.o, v10.m);
        Qr[] qrArray6 = new Qr[AQa.P];
        qrArray6[uSa.E] = j2[XTa.W];
        qrArray6[vRa.d] = j2[uua.p];
        qrArray6[uqa.g] = j2[uqa.g];
        qrArray6[yRa.d] = j2[yRa.d];
        void v12 = i2;
        b2.I[yRa.d] = new ap(qrArray6, (float)a2[uqa.g][uSa.E], (float)a2[uqa.g][vRa.d], (float)a2[uqa.g][uqa.g], (float)a2[uqa.g][yRa.d], v12.o, v12.m);
        Qr[] qrArray7 = new Qr[AQa.P];
        qrArray7[uSa.E] = j2[vRa.d];
        qrArray7[vRa.d] = j2[uSa.E];
        qrArray7[uqa.g] = j2[yRa.d];
        qrArray7[yRa.d] = j2[uqa.g];
        void v14 = i2;
        b2.I[AQa.P] = new ap(qrArray7, (float)a2[uSa.E][uSa.E], (float)a2[uSa.E][vRa.d], (float)a2[uSa.E][uqa.g], (float)a2[uSa.E][yRa.d], v14.o, v14.m);
        Qr[] qrArray8 = new Qr[AQa.P];
        qrArray8[uSa.E] = j2[AQa.P];
        qrArray8[vRa.d] = j2[tTa.h];
        qrArray8[uqa.g] = j2[uua.p];
        qrArray8[yRa.d] = j2[XTa.W];
        void v16 = i2;
        b2.I[tTa.h] = new ap(qrArray8, (float)a2[vRa.d][uSa.E], (float)a2[vRa.d][vRa.d], (float)a2[vRa.d][uqa.g], (float)a2[vRa.d][yRa.d], v16.o, v16.m);
    }

    /*
     * WARNING - void declaration
     */
    public void J(mr mr2, AQ aQ2) {
        int n2;
        KQ_2 kQ_2 = this;
        ap[] apArray = kQ_2.I;
        int n3 = kQ_2.I.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            KQ_2 c2 = apArray[n2];
            if (((ap)c2).I[uSa.E].J != JPa.N || ((ap)c2).I[vRa.d].J != JPa.N || ((ap)c2).I[vRa.d].A != JPa.N || ((ap)c2).I[uqa.g].A != JPa.N) {
                void a2;
                void b2;
                c2.J((mr)b2, (AQ)a2);
            }
            n4 = ++n2;
        }
    }

    public void J(String string) {
        String b2 = string;
        KQ_2 a2 = this;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public KQ_2(zp zp2, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean bl) {
        void i2;
        int k2;
        void j2;
        int l2;
        ap[] m2;
        void a2;
        void n4;
        void c2;
        void d2;
        void e2;
        void f11;
        void g2;
        void h2;
        KQ_2 b2;
        float f12 = f10;
        KQ_2 kQ_2 = b2 = this;
        KQ_2 kQ_22 = b2;
        KQ_2 kQ_23 = b2;
        kQ_23.J = h2;
        kQ_23.k = g2;
        kQ_22.C = f11;
        kQ_22.i = h2 + e2;
        kQ_2.M = g2 + d2;
        kQ_2.j = f11 + c2;
        void var14_17 = h2 + e2;
        void var15_18 = g2 + d2;
        void var16_19 = f11 + c2;
        h2 -= n4;
        g2 -= n4;
        f11 -= n4;
        var14_17 += n4;
        var15_18 += n4;
        var16_19 += n4;
        if (a2 != false) {
            void v3 = var14_17;
            var14_17 = h2;
            h2 = v3;
        }
        Qr[] qrArray = n4 = new Qr[Yqa.i];
        Qr[] qrArray2 = n4;
        qrArray[uSa.E] = new Qr((float)h2, (float)g2, (float)f11, JPa.N, JPa.N);
        qrArray2[vRa.d] = new Qr((float)var14_17, (float)g2, (float)f11, JPa.N, Qsa.k);
        qrArray[uqa.g] = new Qr((float)var14_17, (float)var15_18, (float)f11, Qsa.k, Qsa.k);
        qrArray2[yRa.d] = new Qr((float)h2, (float)var15_18, (float)f11, Qsa.k, JPa.N);
        qrArray[AQa.P] = new Qr((float)h2, (float)g2, (float)var16_19, JPa.N, JPa.N);
        qrArray2[tTa.h] = new Qr((float)var14_17, (float)g2, (float)var16_19, JPa.N, Qsa.k);
        qrArray[uua.p] = new Qr((float)var14_17, (float)var15_18, (float)var16_19, Qsa.k, Qsa.k);
        qrArray2[XTa.W] = new Qr((float)h2, (float)var15_18, (float)var16_19, Qsa.k, JPa.N);
        b2.I = new ap[uua.p];
        Qr[] qrArray3 = new Qr[AQa.P];
        qrArray3[uSa.E] = n4[tTa.h];
        qrArray3[vRa.d] = n4[vRa.d];
        qrArray3[uqa.g] = n4[uqa.g];
        qrArray3[yRa.d] = n4[uua.p];
        void v7 = m2;
        b2.I[uSa.E] = new ap(qrArray3, (float)l2 + (c2 + e2) * j2, (float)k2 + c2 * i2, (float)l2 + (c2 + e2 + c2) * j2, (float)k2 + (c2 + d2) * i2, v7.o, v7.m);
        Qr[] qrArray4 = new Qr[AQa.P];
        qrArray4[uSa.E] = n4[uSa.E];
        qrArray4[vRa.d] = n4[AQa.P];
        qrArray4[uqa.g] = n4[XTa.W];
        qrArray4[yRa.d] = n4[yRa.d];
        void v9 = m2;
        b2.I[vRa.d] = new ap(qrArray4, (float)l2, (float)k2 + c2 * i2, (float)l2 + c2 * j2, (float)k2 + (c2 + d2) * i2, v9.o, v9.m);
        Qr[] qrArray5 = new Qr[AQa.P];
        qrArray5[uSa.E] = n4[tTa.h];
        qrArray5[vRa.d] = n4[AQa.P];
        qrArray5[uqa.g] = n4[uSa.E];
        qrArray5[yRa.d] = n4[vRa.d];
        void v11 = m2;
        b2.I[uqa.g] = new ap(qrArray5, (float)l2 + c2 * j2, (float)k2, (float)l2 + (c2 + e2) * j2, (float)k2 + c2 * i2, v11.o, v11.m);
        Qr[] qrArray6 = new Qr[AQa.P];
        qrArray6[uSa.E] = n4[uqa.g];
        qrArray6[vRa.d] = n4[yRa.d];
        qrArray6[uqa.g] = n4[XTa.W];
        qrArray6[yRa.d] = n4[uua.p];
        void v13 = m2;
        b2.I[yRa.d] = new ap(qrArray6, (float)l2 + (c2 + e2) * j2, (float)k2 + c2 * i2, (float)l2 + (c2 + e2 + e2) * j2, (float)k2, v13.o, v13.m);
        Qr[] qrArray7 = new Qr[AQa.P];
        qrArray7[uSa.E] = n4[vRa.d];
        qrArray7[vRa.d] = n4[uSa.E];
        qrArray7[uqa.g] = n4[yRa.d];
        qrArray7[yRa.d] = n4[uqa.g];
        void v15 = m2;
        b2.I[AQa.P] = new ap(qrArray7, (float)l2 + c2 * j2, (float)k2 + c2 * i2, (float)l2 + (c2 + e2) * j2, (float)k2 + (c2 + d2) * i2, v15.o, v15.m);
        Qr[] qrArray8 = new Qr[AQa.P];
        qrArray8[uSa.E] = n4[AQa.P];
        qrArray8[vRa.d] = n4[tTa.h];
        qrArray8[uqa.g] = n4[uua.p];
        qrArray8[yRa.d] = n4[XTa.W];
        void v17 = m2;
        b2.I[tTa.h] = new ap(qrArray8, (float)l2 + (c2 + e2 + c2) * j2, (float)k2 + c2 * i2, (float)l2 + (c2 + e2 + c2 + e2) * j2, (float)k2 + (c2 + d2) * i2, v17.o, v17.m);
        if (a2 != false) {
            m2 = b2.I;
            l2 = b2.I.length;
            int n5 = k2 = uSa.E;
            while (n5 < l2) {
                m2[k2++].J();
                n5 = k2;
            }
        }
    }
}

