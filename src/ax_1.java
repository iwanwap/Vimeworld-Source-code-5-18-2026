/*
 * Decompiled with CFR 0.152.
 */
public final class ax_1
implements Runnable {
    private final double k;
    private final double j;
    private final mx J;
    private final double A;
    private final double I;

    /*
     * WARNING - void declaration
     */
    private ax_1(mx mx2, double d2, double d3, double d4, double d5) {
        void a2;
        void b2;
        void c2;
        void d6;
        ax_1 e2;
        Object f2 = mx2;
        ax_1 ax_12 = e2 = this;
        ax_1 ax_13 = e2;
        e2.J = f2;
        ax_13.I = d6;
        ax_13.j = c2;
        ax_12.k = b2;
        ax_12.A = a2;
    }

    @Override
    public void run() {
        ax_1 a2;
        ax_1 ax_12 = a2;
        mx.J(ax_12.J, ax_12.I, a2.j, a2.k, a2.A);
    }

    public static Runnable J(mx e2, double d2, double c2, double b2, double a2) {
        return new ax_1(e2, d2, c2, b2, a2);
    }
}

