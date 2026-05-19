/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kna
 */
public final class aoa_3
implements Runnable {
    private final boolean k;
    private final float j;
    private final char J;
    private final boolean A;
    private final Kna I;

    /*
     * WARNING - void declaration
     */
    private aoa_3(Kna kna2, char c2, float f2, boolean bl, boolean bl2) {
        void f3;
        void b2;
        void c3;
        void d2;
        void e2;
        aoa_3 a2;
        boolean bl3 = bl2;
        aoa_3 aoa_32 = a2 = this;
        aoa_3 aoa_33 = a2;
        a2.I = e2;
        aoa_33.J = d2;
        aoa_33.j = c3;
        aoa_32.A = b2;
        aoa_32.k = f3;
    }

    @Override
    public void run() {
        aoa_3 a2;
        aoa_3 aoa_32 = a2;
        aoa_3 aoa_33 = a2;
        Kna.J((Kna)aoa_32.I, (char)aoa_32.J, (float)aoa_33.j, (boolean)aoa_33.A, (boolean)a2.k);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(Kna kna2, char c2, float f2, boolean bl, boolean bl2) {
        void e2;
        void b2;
        void c3;
        void d2;
        boolean bl3 = bl2;
        Kna a2 = kna2;
        return new aoa_3(a2, (char)d2, (float)c3, (boolean)b2, (boolean)e2);
    }
}

