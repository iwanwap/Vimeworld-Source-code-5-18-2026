/*
 * Decompiled with CFR 0.152.
 */
public final class YD_1
implements Runnable {
    private final int J;
    private final Xe A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public static Runnable J(Xe xe, int n2, int n3) {
        void b2;
        int c2 = n3;
        Xe a2 = xe;
        return new YD_1(a2, (int)b2, c2);
    }

    @Override
    public void run() {
        YD_1 a2;
        YD_1 yD_1 = a2;
        Xe.J(yD_1.A, yD_1.J, a2.I);
    }

    /*
     * WARNING - void declaration
     */
    private YD_1(Xe xe, int n2, int n3) {
        void b2;
        void c2;
        YD_1 a2;
        int d2 = n3;
        YD_1 yD_1 = a2 = this;
        a2.A = c2;
        yD_1.J = b2;
        yD_1.I = d2;
    }
}

