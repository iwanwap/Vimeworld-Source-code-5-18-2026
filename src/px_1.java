/*
 * Decompiled with CFR 0.152.
 */
public final class px_1
implements Runnable {
    private final mx j;
    private final float J;
    private final int A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public static Runnable J(mx mx2, int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        mx a2 = mx2;
        return new px_1(a2, (int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    private px_1(mx mx2, int n2, int n3, float f2) {
        void e2;
        void b2;
        void c2;
        void d2;
        px_1 a2;
        float f3 = f2;
        px_1 px_12 = a2 = this;
        px_1 px_13 = a2;
        px_13.j = d2;
        px_13.I = c2;
        px_12.A = b2;
        px_12.J = e2;
    }

    @Override
    public void run() {
        px_1 a2;
        px_1 px_12 = a2;
        px_1 px_13 = a2;
        mx.J(px_12.j, px_12.I, px_13.A, px_13.J);
    }
}

