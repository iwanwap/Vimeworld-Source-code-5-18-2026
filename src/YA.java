/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AA
 *  ERa
 *  JPa
 *  NTa
 *  Oz
 *  XTa
 *  Yc
 *  Ypa
 *  aSa
 *  lqa
 *  pPa
 *  pqa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class YA
extends AA {
    public float[] m = new float[uua.p];
    public float[][] C = new float[NTa.C][AQa.P];
    private static YA i = new YA();
    public float[] M;
    public int A;
    public float[] I;

    /*
     * WARNING - void declaration
     */
    private double J(float[] fArray, float[] fArray2) {
        void b2;
        Object c2 = fArray2;
        YA a2 = this;
        return (double)b2[uSa.E] * (double)c2[uSa.E] + (double)b2[vRa.d] * (double)c2[vRa.d] + (double)b2[uqa.g] * (double)c2[uqa.g];
    }

    private void l(float[] fArray) {
        Object b2 = fArray;
        YA a2 = this;
        float f2 = Oz.J((float)(b2[uSa.E] * b2[uSa.E] + b2[vRa.d] * b2[vRa.d] + b2[uqa.g] * b2[uqa.g]));
        if (f2 == JPa.N) {
            f2 = pqa.r;
        }
        Object object = b2;
        int n2 = uSa.E;
        object[n2] = object[n2] / f2;
        int n3 = vRa.d;
        object[n3] = object[n3] / f2;
        int n4 = uqa.g;
        object[n4] = object[n4] / f2;
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        YA a2 = this;
        void v0 = c2;
        void v1 = b2;
        float f5 = d2;
        return (float)Math.sqrt((double)(v0 * v0 + v1 * v1 + f5 * f5));
    }

    /*
     * WARNING - void declaration
     */
    private double J(float[] fArray, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Object e2 = fArray;
        YA d5 = this;
        return (double)e2[uSa.E] * c2 + (double)e2[vRa.d] * b2 + (double)e2[uqa.g] * a2 + (double)e2[yRa.d];
    }

    public YA() {
        YA a2;
        YA yA2 = a2;
        yA2.M = new float[ERa.C];
        yA2.I = new float[AQa.P];
    }

    private void f(float[] fArray) {
        Object b22 = fArray;
        YA a2 = this;
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

    public void J() {
        YA yA2;
        YA yA3 = yA2 = this;
        float[] fArray = yA3.j;
        float[] fArray2 = yA3.k;
        Object a22 = yA3.J;
        System.arraycopy(pA.nB, uSa.E, fArray, uSa.E, ERa.C);
        System.arraycopy(pA.Ed, uSa.E, fArray2, uSa.E, ERa.C);
        Yc.f((float[])a22, (float[])fArray2, (float[])fArray);
        yA3.J((float[])yA3.I[uSa.E], (float)(a22[yRa.d] - a22[uSa.E]), (float)(a22[XTa.W] - a22[AQa.P]), (float)(a22[pPa.f] - a22[Yqa.i]), (float)(a22[Ypa.A] - a22[lqa.s]));
        yA3.J((float[])yA3.I[vRa.d], (float)(a22[yRa.d] + a22[uSa.E]), (float)(a22[XTa.W] + a22[AQa.P]), (float)(a22[pPa.f] + a22[Yqa.i]), (float)(a22[Ypa.A] + a22[lqa.s]));
        yA3.J((float[])yA3.I[uqa.g], (float)(a22[yRa.d] + a22[vRa.d]), (float)(a22[XTa.W] + a22[tTa.h]), (float)(a22[pPa.f] + a22[WOa.fa]), (float)(a22[Ypa.A] + a22[uua.s]));
        yA3.J((float[])yA3.I[yRa.d], (float)(a22[yRa.d] - a22[vRa.d]), (float)(a22[XTa.W] - a22[tTa.h]), (float)(a22[pPa.f] - a22[WOa.fa]), (float)(a22[Ypa.A] - a22[uua.s]));
        yA3.J((float[])yA3.I[AQa.P], (float)(a22[yRa.d] - a22[uqa.g]), (float)(a22[XTa.W] - a22[uua.p]), (float)(a22[pPa.f] - a22[NTa.C]), (float)(a22[Ypa.A] - a22[hpa.Z]));
        yA3.J((float[])yA3.I[tTa.h], (float)(a22[yRa.d] + a22[uqa.g]), (float)(a22[XTa.W] + a22[uua.p]), (float)(a22[pPa.f] + a22[NTa.C]), (float)(a22[Ypa.A] + a22[hpa.Z]));
        fArray = pA.R;
        float f2 = (float)yA3.J((float[])yA3.I[uSa.E], fArray);
        float a22 = (float)yA3.J((float[])yA3.I[vRa.d], fArray);
        float f3 = (float)yA3.J((float[])yA3.I[uqa.g], fArray);
        float f4 = (float)yA3.J((float[])yA3.I[yRa.d], fArray);
        float f5 = (float)yA3.J((float[])yA3.I[AQa.P], fArray);
        float f6 = (float)yA3.J((float[])yA3.I[tTa.h], fArray);
        yA3.A = uSa.E;
        if (f2 >= JPa.N) {
            YA yA4 = yA2;
            int n2 = yA4.A;
            yA4.A = n2 + vRa.d;
            yA4.J(yA2.C[n2], (float[])yA2.I[uSa.E]);
            if (f2 > JPa.N) {
                if (f3 < JPa.N) {
                    YA yA5 = yA2;
                    int n3 = yA5.A;
                    yA5.A = n3 + vRa.d;
                    yA5.J(yA2.C[n3], (float[])yA2.I[uSa.E], (float[])yA2.I[uqa.g], fArray);
                }
                if (f4 < JPa.N) {
                    YA yA6 = yA2;
                    int n4 = yA6.A;
                    yA6.A = n4 + vRa.d;
                    yA6.J(yA2.C[n4], (float[])yA2.I[uSa.E], (float[])yA2.I[yRa.d], fArray);
                }
                if (f5 < JPa.N) {
                    YA yA7 = yA2;
                    int n5 = yA7.A;
                    yA7.A = n5 + vRa.d;
                    yA7.J(yA2.C[n5], (float[])yA2.I[uSa.E], (float[])yA2.I[AQa.P], fArray);
                }
                if (f6 < JPa.N) {
                    YA yA8 = yA2;
                    int n6 = yA8.A;
                    yA8.A = n6 + vRa.d;
                    yA8.J(yA2.C[n6], (float[])yA2.I[uSa.E], (float[])yA2.I[tTa.h], fArray);
                }
            }
        }
        if (a22 >= JPa.N) {
            YA yA9 = yA2;
            int n7 = yA9.A;
            yA9.A = n7 + vRa.d;
            yA9.J(yA2.C[n7], (float[])yA2.I[vRa.d]);
            if (a22 > JPa.N) {
                if (f3 < JPa.N) {
                    YA yA10 = yA2;
                    int n8 = yA10.A;
                    yA10.A = n8 + vRa.d;
                    yA10.J(yA2.C[n8], (float[])yA2.I[vRa.d], (float[])yA2.I[uqa.g], fArray);
                }
                if (f4 < JPa.N) {
                    YA yA11 = yA2;
                    int n9 = yA11.A;
                    yA11.A = n9 + vRa.d;
                    yA11.J(yA2.C[n9], (float[])yA2.I[vRa.d], (float[])yA2.I[yRa.d], fArray);
                }
                if (f5 < JPa.N) {
                    YA yA12 = yA2;
                    int n10 = yA12.A;
                    yA12.A = n10 + vRa.d;
                    yA12.J(yA2.C[n10], (float[])yA2.I[vRa.d], (float[])yA2.I[AQa.P], fArray);
                }
                if (f6 < JPa.N) {
                    YA yA13 = yA2;
                    int n11 = yA13.A;
                    yA13.A = n11 + vRa.d;
                    yA13.J(yA2.C[n11], (float[])yA2.I[vRa.d], (float[])yA2.I[tTa.h], fArray);
                }
            }
        }
        if (f3 >= JPa.N) {
            YA yA14 = yA2;
            int n12 = yA14.A;
            yA14.A = n12 + vRa.d;
            yA14.J(yA2.C[n12], (float[])yA2.I[uqa.g]);
            if (f3 > JPa.N) {
                if (f2 < JPa.N) {
                    YA yA15 = yA2;
                    int n13 = yA15.A;
                    yA15.A = n13 + vRa.d;
                    yA15.J(yA2.C[n13], (float[])yA2.I[uqa.g], (float[])yA2.I[uSa.E], fArray);
                }
                if (a22 < JPa.N) {
                    YA yA16 = yA2;
                    int n14 = yA16.A;
                    yA16.A = n14 + vRa.d;
                    yA16.J(yA2.C[n14], (float[])yA2.I[uqa.g], (float[])yA2.I[vRa.d], fArray);
                }
                if (f5 < JPa.N) {
                    YA yA17 = yA2;
                    int n15 = yA17.A;
                    yA17.A = n15 + vRa.d;
                    yA17.J(yA2.C[n15], (float[])yA2.I[uqa.g], (float[])yA2.I[AQa.P], fArray);
                }
                if (f6 < JPa.N) {
                    YA yA18 = yA2;
                    int n16 = yA18.A;
                    yA18.A = n16 + vRa.d;
                    yA18.J(yA2.C[n16], (float[])yA2.I[uqa.g], (float[])yA2.I[tTa.h], fArray);
                }
            }
        }
        if (f4 >= JPa.N) {
            YA yA19 = yA2;
            int n17 = yA19.A;
            yA19.A = n17 + vRa.d;
            yA19.J(yA2.C[n17], (float[])yA2.I[yRa.d]);
            if (f4 > JPa.N) {
                if (f2 < JPa.N) {
                    YA yA20 = yA2;
                    int n18 = yA20.A;
                    yA20.A = n18 + vRa.d;
                    yA20.J(yA2.C[n18], (float[])yA2.I[yRa.d], (float[])yA2.I[uSa.E], fArray);
                }
                if (a22 < JPa.N) {
                    YA yA21 = yA2;
                    int n19 = yA21.A;
                    yA21.A = n19 + vRa.d;
                    yA21.J(yA2.C[n19], (float[])yA2.I[yRa.d], (float[])yA2.I[vRa.d], fArray);
                }
                if (f5 < JPa.N) {
                    YA yA22 = yA2;
                    int n20 = yA22.A;
                    yA22.A = n20 + vRa.d;
                    yA22.J(yA2.C[n20], (float[])yA2.I[yRa.d], (float[])yA2.I[AQa.P], fArray);
                }
                if (f6 < JPa.N) {
                    YA yA23 = yA2;
                    int n21 = yA23.A;
                    yA23.A = n21 + vRa.d;
                    yA23.J(yA2.C[n21], (float[])yA2.I[yRa.d], (float[])yA2.I[tTa.h], fArray);
                }
            }
        }
        if (f5 >= JPa.N) {
            YA yA24 = yA2;
            int n22 = yA24.A;
            yA24.A = n22 + vRa.d;
            yA24.J(yA2.C[n22], (float[])yA2.I[AQa.P]);
            if (f5 > JPa.N) {
                if (f2 < JPa.N) {
                    YA yA25 = yA2;
                    int n23 = yA25.A;
                    yA25.A = n23 + vRa.d;
                    yA25.J(yA2.C[n23], (float[])yA2.I[AQa.P], (float[])yA2.I[uSa.E], fArray);
                }
                if (a22 < JPa.N) {
                    YA yA26 = yA2;
                    int n24 = yA26.A;
                    yA26.A = n24 + vRa.d;
                    yA26.J(yA2.C[n24], (float[])yA2.I[AQa.P], (float[])yA2.I[vRa.d], fArray);
                }
                if (f3 < JPa.N) {
                    YA yA27 = yA2;
                    int n25 = yA27.A;
                    yA27.A = n25 + vRa.d;
                    yA27.J(yA2.C[n25], (float[])yA2.I[AQa.P], (float[])yA2.I[uqa.g], fArray);
                }
                if (f4 < JPa.N) {
                    YA yA28 = yA2;
                    int n26 = yA28.A;
                    yA28.A = n26 + vRa.d;
                    yA28.J(yA2.C[n26], (float[])yA2.I[AQa.P], (float[])yA2.I[yRa.d], fArray);
                }
            }
        }
        if (f6 >= JPa.N) {
            YA yA29 = yA2;
            int n27 = yA29.A;
            yA29.A = n27 + vRa.d;
            yA29.J(yA2.C[n27], (float[])yA2.I[tTa.h]);
            if (f6 > JPa.N) {
                if (f2 < JPa.N) {
                    YA yA30 = yA2;
                    int n28 = yA30.A;
                    yA30.A = n28 + vRa.d;
                    yA30.J(yA2.C[n28], (float[])yA2.I[tTa.h], (float[])yA2.I[uSa.E], fArray);
                }
                if (a22 < JPa.N) {
                    YA yA31 = yA2;
                    int n29 = yA31.A;
                    yA31.A = n29 + vRa.d;
                    yA31.J(yA2.C[n29], (float[])yA2.I[tTa.h], (float[])yA2.I[vRa.d], fArray);
                }
                if (f3 < JPa.N) {
                    YA yA32 = yA2;
                    int n30 = yA32.A;
                    yA32.A = n30 + vRa.d;
                    yA32.J(yA2.C[n30], (float[])yA2.I[tTa.h], (float[])yA2.I[uqa.g], fArray);
                }
                if (f4 < JPa.N) {
                    YA yA33 = yA2;
                    int n31 = yA33.A;
                    yA33.A = n31 + vRa.d;
                    yA33.J(yA2.C[n31], (float[])yA2.I[tTa.h], (float[])yA2.I[yRa.d], fArray);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(float[] fArray, float[] fArray2, float[] fArray3) {
        void b2;
        void c2;
        Object d2 = fArray3;
        YA a2 = this;
        void v0 = c2;
        v0[uSa.E] = b2[vRa.d] * d2[uqa.g] - b2[uqa.g] * d2[vRa.d];
        v0[vRa.d] = b2[uqa.g] * d2[uSa.E] - b2[uSa.E] * d2[uqa.g];
        v0[uqa.g] = b2[uSa.E] * d2[vRa.d] - b2[vRa.d] * d2[uSa.E];
    }

    public static AA J() {
        i.J();
        return i;
    }

    /*
     * WARNING - void declaration
     */
    private void J(float[] fArray, float[] fArray2) {
        void b2;
        Object c2 = fArray2;
        YA a2 = this;
        void v0 = b2;
        v0[uSa.E] = c2[uSa.E];
        v0[vRa.d] = c2[vRa.d];
        v0[uqa.g] = c2[uqa.g];
        v0[yRa.d] = c2[yRa.d];
    }

    /*
     * WARNING - void declaration
     */
    private void J(float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4) {
        void a22;
        void c2;
        void d22;
        YA b2;
        Object e2 = fArray3;
        YA yA2 = b2 = this;
        void v1 = d22;
        YA yA3 = b2;
        void v3 = d22;
        YA yA4 = b2;
        void v5 = d22;
        YA yA5 = b2;
        yA5.J(yA5.I, (float[])c2, (float[])e2);
        b2.J((float[])v5, yA5.I, (float[])a22);
        yA4.l((float[])v5);
        float a22 = (float)yA4.J((float[])c2, (float[])e2);
        float f2 = (float)b2.J((float[])v3, (float[])e2);
        f2 = yA3.J((float)v3[uSa.E], (float)d22[vRa.d], (float)d22[uqa.g], (float)(e2[uSa.E] * f2), (float)(e2[vRa.d] * f2), (float)(e2[uqa.g] * f2));
        float f3 = yA3.J((float)c2[uSa.E], (float)c2[vRa.d], (float)c2[uqa.g], (float)(e2[uSa.E] * a22), (float)(e2[vRa.d] * a22), (float)(e2[uqa.g] * a22));
        f2 /= f3;
        f3 = (float)b2.J((float[])v1, (float[])c2);
        float d22 = yA2.J((float)v1[uSa.E], (float)d22[vRa.d], (float)d22[uqa.g], (float)(c2[uSa.E] * f3), (float)(c2[vRa.d] * f3), (float)(c2[uqa.g] * f3));
        a22 = yA2.J((float)e2[uSa.E], (float)e2[vRa.d], (float)e2[uqa.g], (float)(c2[uSa.E] * a22), (float)(c2[vRa.d] * a22), (float)(c2[uqa.g] * a22));
        d22[yRa.d] = c2[yRa.d] * f2 + e2[yRa.d] * (d22 /= a22);
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4, float f5, float f6, float f7) {
        void g2;
        void d2;
        void b2;
        void e2;
        void c2;
        void f8;
        float f9 = f7;
        YA a2 = this;
        return a2.J((float)(f8 - c2), (float)(e2 - b2), (float)(d2 - g2));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(double d2, double d3, double d4, double d5, double d6, double d7) {
        int n2;
        YA yA2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < yA2.A) {
            void a2;
            void b2;
            void c2;
            void d8;
            void e2;
            void f2;
            YA yA3 = yA2;
            float[] fArray = yA3.C[n2];
            Object g2 = fArray;
            if (yA3.J(fArray, (double)f2, (double)e2, (double)d8) <= aSa.V && yA2.J((float[])g2, (double)c2, (double)e2, (double)d8) <= aSa.V && yA2.J((float[])g2, (double)f2, (double)b2, (double)d8) <= aSa.V && yA2.J((float[])g2, (double)c2, (double)b2, (double)d8) <= aSa.V && yA2.J((float[])g2, (double)f2, (double)e2, (double)a2) <= aSa.V && yA2.J((float[])g2, (double)c2, (double)e2, (double)a2) <= aSa.V && yA2.J((float[])g2, (double)f2, (double)b2, (double)a2) <= aSa.V && yA2.J((float[])g2, (double)c2, (double)b2, (double)a2) <= aSa.V) {
                return uSa.E != 0;
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    private void J(float[] fArray) {
        YA a2;
        Object b2 = fArray;
        YA yA2 = a2 = this;
        int n2 = yA2.A;
        yA2.A = n2 + vRa.d;
        yA2.J(a2.C[n2], (float[])b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(float[] fArray, float f2, float f3, float f4, float f5) {
        void a2;
        void e2;
        void b2;
        void c2;
        void d2;
        YA yA2 = this;
        void v0 = d2;
        void v1 = c2;
        void v2 = b2;
        float f6 = (float)Math.sqrt((double)(v0 * v0 + v1 * v1 + v2 * v2));
        void v3 = e2;
        v3[uSa.E] = d2 / f6;
        v3[vRa.d] = c2 / f6;
        v3[uqa.g] = b2 / f6;
        v3[yRa.d] = a2 / f6;
    }
}

