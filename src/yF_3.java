/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pP
 *  uf
 */
import java.util.function.Consumer;

public final class yF_3
implements Consumer {
    private final int m;
    private final float C;
    private final float i;
    private final float M;
    private final uf k;
    private final float j;
    private final double J;
    private final double A;
    private final float I;

    /*
     * WARNING - void declaration
     */
    private yF_3(uf uf2, float f2, float f3, double d2, double d3, float f4, float f5, int n2, float f6) {
        void j2;
        void b2;
        void c2;
        void d4;
        void e2;
        void f7;
        void g2;
        void h2;
        void i2;
        yF_3 a2;
        float f8 = f6;
        yF_3 yF_32 = a2 = this;
        yF_3 yF_33 = a2;
        yF_3 yF_34 = a2;
        yF_3 yF_35 = a2;
        a2.k = i2;
        yF_35.I = h2;
        yF_35.C = g2;
        yF_34.J = f7;
        yF_34.A = e2;
        yF_33.M = d4;
        yF_33.i = c2;
        yF_32.m = b2;
        yF_32.j = j2;
    }

    /*
     * WARNING - void declaration
     */
    public static Consumer J(uf uf2, float f2, float f3, double d2, double d3, float f4, float f5, int n2, float f6) {
        void i2;
        void b2;
        void c2;
        void d4;
        void e2;
        void f7;
        void g2;
        void h2;
        float f8 = f6;
        uf a2 = uf2;
        return new yF_3(a2, (float)h2, (float)g2, (double)f7, (double)e2, (float)d4, (float)c2, (int)b2, (float)i2);
    }

    public void accept(Object object) {
        yF_3 a2;
        Object b2 = object;
        yF_3 yF_32 = a2 = this;
        yF_3 yF_33 = a2;
        yF_3 yF_34 = a2;
        yF_3 yF_35 = a2;
        uf.J((uf)yF_32.k, (float)yF_32.I, (float)yF_33.C, (double)yF_33.J, (double)a2.A, (float)yF_34.M, (float)yF_34.i, (int)yF_35.m, (float)yF_35.j, (pP)((pP)b2));
    }
}

