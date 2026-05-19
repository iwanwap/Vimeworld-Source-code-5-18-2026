/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public final class Xs_1
implements Runnable {
    private final UUID j;
    private final JJ J;
    private final int A;
    private final OT I;

    /*
     * WARNING - void declaration
     */
    private Xs_1(OT oT2, JJ jJ2, int n2, UUID uUID) {
        UUID e2;
        void b2;
        void c2;
        void d2;
        Xs_1 a2;
        Xs_1 xs_1 = uUID2;
        UUID uUID2 = uUID;
        Xs_1 xs_12 = a2 = xs_1;
        Xs_1 xs_13 = a2;
        xs_13.I = d2;
        xs_13.J = c2;
        xs_12.A = b2;
        xs_12.j = e2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(OT oT2, JJ jJ2, int n2, UUID uUID) {
        void b2;
        void c2;
        UUID d2 = uUID;
        OT a2 = oT2;
        return new Xs_1(a2, (JJ)c2, (int)b2, d2);
    }

    @Override
    public void run() {
        Xs_1 a2;
        Xs_1 xs_1 = a2;
        Xs_1 xs_12 = a2;
        OT.J(xs_1.I, xs_1.J, xs_12.A, xs_12.j);
    }
}

