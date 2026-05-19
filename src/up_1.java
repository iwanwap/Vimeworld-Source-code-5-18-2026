/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tp
 *  ui
 */
public final class up_1
implements Runnable {
    private final float k;
    private final float j;
    private final tp J;
    private final float A;
    private final ui I;

    @Override
    public void run() {
        up_1 a2;
        up_1 up_12 = a2;
        up_1 up_13 = a2;
        tp.J((tp)up_12.J, (float)up_12.A, (ui)up_13.I, (float)up_13.j, (float)a2.k);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(tp tp2, float f2, ui ui2, float f3, float f4) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f5 = f4;
        tp a2 = tp2;
        return new up_1(a2, (float)d2, (ui)c2, (float)b2, (float)e2);
    }

    /*
     * WARNING - void declaration
     */
    private up_1(tp tp2, float f2, ui ui2, float f3, float f4) {
        void f5;
        void b2;
        void c2;
        void d2;
        void e2;
        up_1 a2;
        float f6 = f4;
        up_1 up_12 = a2 = this;
        up_1 up_13 = a2;
        a2.J = e2;
        up_13.A = d2;
        up_13.I = c2;
        up_12.j = b2;
        up_12.k = f5;
    }
}

