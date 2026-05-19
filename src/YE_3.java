/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pP
 *  uf
 */
import java.util.function.Consumer;

public final class YE_3
implements Consumer {
    private final double k;
    private final float j;
    private final double J;
    private final double A;
    private final uf I;

    public void accept(Object object) {
        YE_3 a2;
        Object b2 = object;
        YE_3 yE_3 = a2 = this;
        uf.J((uf)yE_3.I, (double)yE_3.J, (double)a2.k, (double)a2.A, (float)a2.j, (pP)((pP)b2));
    }

    /*
     * WARNING - void declaration
     */
    public static Consumer J(uf uf2, double d2, double d3, double d4, float f2) {
        void e2;
        void b2;
        void c2;
        void d5;
        float f3 = f2;
        uf a2 = uf2;
        return new YE_3(a2, (double)d5, (double)c2, (double)b2, (float)e2);
    }

    /*
     * WARNING - void declaration
     */
    private YE_3(uf uf2, double d2, double d3, double d4, float f2) {
        void f3;
        void b2;
        void c2;
        void d5;
        void e2;
        YE_3 a2;
        float f4 = f2;
        YE_3 yE_3 = a2 = this;
        YE_3 yE_32 = a2;
        a2.I = e2;
        yE_32.J = d5;
        yE_32.k = c2;
        yE_3.A = b2;
        yE_3.j = f3;
    }
}

