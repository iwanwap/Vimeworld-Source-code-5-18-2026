/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Od
 */
public final class BB_2
implements Runnable {
    private final double k;
    private final double j;
    private final double J;
    private final Od A;
    private final double I;

    /*
     * WARNING - void declaration
     */
    private BB_2(Od od2, double d2, double d3, double d4, double d5) {
        void a2;
        void b2;
        void c2;
        void d6;
        BB_2 e2;
        BB_2 f2 = od2;
        BB_2 bB_2 = e2 = this;
        BB_2 bB_22 = e2;
        e2.A = f2;
        bB_22.J = d6;
        bB_22.k = c2;
        bB_2.j = b2;
        bB_2.I = a2;
    }

    public static Runnable J(Od e2, double d2, double c2, double b2, double a2) {
        return new BB_2(e2, d2, c2, b2, a2);
    }

    @Override
    public void run() {
        BB_2 a2;
        BB_2 bB_2 = a2;
        Od.J((Od)bB_2.A, (double)bB_2.J, (double)a2.k, (double)a2.j, (double)a2.I);
    }
}

