/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  Sk
 *  bx
 */
public final class ij_3
implements Runnable {
    private final Sk J;
    private final bx A;
    private final Kl I;

    @Override
    public void run() {
        ij_3 a2;
        ij_3 ij_32 = a2;
        Sk.f((Sk)ij_32.J, (bx)ij_32.A, (Kl)a2.I);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(Sk sk2, bx bx2, Kl kl2) {
        void b2;
        Sk c2 = kl2;
        Sk a2 = sk2;
        return new ij_3(a2, (bx)b2, (Kl)c2);
    }

    /*
     * WARNING - void declaration
     */
    private ij_3(Sk sk2, bx bx2, Kl kl2) {
        void b2;
        void c2;
        ij_3 a2;
        ij_3 d2 = kl2;
        ij_3 ij_32 = a2 = this;
        a2.J = c2;
        ij_32.A = b2;
        ij_32.I = d2;
    }
}

