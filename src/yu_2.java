/*
 * Decompiled with CFR 0.152.
 */
public final class yu_2
implements Runnable {
    private final int j;
    private final XR J;
    private final int A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    private yu_2(XR xR2, int n2, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        yu_2 a2;
        int n5 = n4;
        yu_2 yu_22 = a2 = this;
        yu_2 yu_23 = a2;
        yu_23.J = d2;
        yu_23.A = c2;
        yu_22.I = b2;
        yu_22.j = e2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(XR xR2, int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        XR a2 = xR2;
        return new yu_2(a2, (int)c2, (int)b2, d2);
    }

    @Override
    public void run() {
        yu_2 a2;
        yu_2 yu_22 = a2;
        yu_2 yu_23 = a2;
        XR.J(yu_22.J, yu_22.A, yu_23.I, yu_23.j);
    }
}

