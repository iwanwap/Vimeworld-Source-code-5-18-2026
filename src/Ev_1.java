/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  kx
 */
import java.util.Random;

public final class Ev_1
extends eV {
    private kx[] A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public double[] J(double[] dArray, double d2, double d3, int n2, int n3, double d4, double d5, double d6, double d7) {
        int n4;
        void e2;
        void f2;
        Object j2 = dArray;
        Ev_1 i2 = this;
        if (j2 != null && ((Object)j2).length >= f2 * e2) {
            int n5;
            int n6 = n5 = uSa.E;
            while (n6 < ((Object)j2).length) {
                j2[n5++] = aSa.V;
                n6 = n5;
            }
        } else {
            j2 = new double[f2 * e2];
        }
        double d8 = oua.i;
        double d9 = oua.i;
        int n7 = n4 = uSa.E;
        while (n7 < i2.I) {
            void a2;
            void b2;
            void c2;
            void d10;
            void g2;
            void h;
            i2.A[n4].J((double[])j2, (double)h, (double)g2, (int)f2, (int)e2, (double)(d10 * d9 * d8), (double)(c2 * d9 * d8), ATa.j / d8);
            d9 *= b2;
            d8 *= a2;
            n7 = ++n4;
        }
        return j2;
    }

    /*
     * WARNING - void declaration
     */
    public Ev_1(Random random, int n2) {
        int c2;
        void a2;
        Ev_1 ev_1;
        Ev_1 ev_12 = ev_1 = this;
        ev_12.I = a2;
        ev_12.A = new kx[a2];
        int n3 = c2 = uSa.E;
        while (n3 < a2) {
            void b2;
            ev_1.A[c2++] = new kx((Random)b2);
            n3 = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public double[] J(double[] dArray, double d2, double d3, int n2, int n3, double d4, double d5, double d6) {
        void a2;
        void b2;
        void c2;
        void i2;
        void e2;
        void f2;
        void g2;
        void h;
        int n4 = n3;
        Ev_1 d7 = this;
        return d7.J((double[])h, (double)g2, (double)f2, (int)e2, (int)i2, (double)c2, (double)b2, (double)a2, kTa.B);
    }

    /*
     * WARNING - void declaration
     */
    public double J(double d2, double d3) {
        int c2;
        Ev_1 ev_1 = this;
        double d4 = aSa.V;
        double d5 = oua.i;
        int n2 = c2 = uSa.E;
        while (n2 < ev_1.I) {
            void a2;
            void b2;
            d4 += ev_1.A[c2].J((double)(b2 * d5), (double)(a2 * d5)) / d5;
            d5 /= KPa.y;
            n2 = ++c2;
        }
        return d4;
    }
}

