/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Oz
 *  aSa
 *  vRa
 *  xw
 */
import java.util.Random;

public final class MV
extends eV {
    private xw[] A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public double[] J(double[] dArray, int n2, int n3, int n4, int n5, double d2, double d3, double d4) {
        void b2;
        void c2;
        void i2;
        void e2;
        void f2;
        void g2;
        void h2;
        int n6 = n5;
        MV d5 = this;
        return d5.J((double[])h2, (int)g2, NTa.C, (int)f2, (int)e2, vRa.d, (int)i2, (double)c2, oua.i, (double)b2);
    }

    /*
     * WARNING - void declaration
     */
    public double[] J(double[] dArray, int n2, int n3, int n4, int n5, int n6, int n7, double d2, double d3, double d4) {
        int n8;
        void d5;
        void e2;
        void f2;
        Object k2 = dArray;
        MV j2 = this;
        if (k2 == null) {
            k2 = new double[f2 * e2 * d5];
        } else {
            int n9;
            int n10 = n9 = uSa.E;
            while (n10 < ((Object)k2).length) {
                k2[n9++] = aSa.V;
                n10 = n9;
            }
        }
        double d6 = oua.i;
        int n11 = n8 = uSa.E;
        while (n11 < j2.I) {
            void a2;
            void g2;
            void b2;
            void h2;
            void c2;
            void i2;
            double d7 = (double)i2 * d6 * c2;
            double d8 = (double)h2 * d6 * b2;
            double d9 = (double)g2 * d6 * a2;
            long l2 = Oz.J((double)d7);
            long l3 = Oz.J((double)d9);
            d7 -= (double)l2;
            d9 -= (double)l3;
            j2.A[n8].J((double[])k2, d7 += (double)(l2 %= dqa.fa), d8, d9 += (double)(l3 %= dqa.fa), (int)f2, (int)e2, (int)d5, (double)(c2 * d6), (double)(b2 * d6), (double)(a2 * d6), d6);
            d6 /= KPa.y;
            n11 = ++n8;
        }
        return k2;
    }

    /*
     * WARNING - void declaration
     */
    public MV(Random random, int n2) {
        int c2;
        void a2;
        MV mV;
        MV mV2 = mV = this;
        mV2.I = a2;
        mV2.A = new xw[a2];
        int n3 = c2 = uSa.E;
        while (n3 < a2) {
            void b2;
            mV.A[c2++] = new xw((Random)b2);
            n3 = c2;
        }
    }
}

