/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kl
 *  Sk
 *  bx
 */
public final class Ek_1
implements Runnable {
    private final Sk J;
    private final bx A;
    private final Kl I;

    /*
     * WARNING - void declaration
     */
    private Ek_1(Sk sk, bx bx2, Kl kl2) {
        void b2;
        void c2;
        Ek_1 a2;
        Ek_1 d2 = kl2;
        Ek_1 ek_1 = a2 = this;
        a2.J = c2;
        ek_1.A = b2;
        ek_1.I = d2;
    }

    @Override
    public void run() {
        Ek_1 a2;
        Ek_1 ek_1 = a2;
        Sk.J((Sk)ek_1.J, (bx)ek_1.A, (Kl)a2.I);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(Sk sk, bx bx2, Kl kl2) {
        void b2;
        Sk c2 = kl2;
        Sk a2 = sk;
        return new Ek_1(a2, (bx)b2, (Kl)c2);
    }
}

