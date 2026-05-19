/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class Tra
implements Runnable {
    private final nra J;
    private final boolean A;
    private final boolean I;

    @Override
    public void run() {
        Tra a2;
        Tra tra2 = a2;
        nra.J((nra)tra2.J, (boolean)tra2.I, (boolean)a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(nra nra2, boolean bl, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        nra a2 = nra2;
        return new Tra(a2, (boolean)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    private Tra(nra nra2, boolean bl, boolean bl2) {
        void b2;
        void c2;
        Tra a2;
        boolean d2 = bl2;
        Tra tra2 = a2 = this;
        a2.J = c2;
        tra2.I = b2;
        tra2.A = d2;
    }
}

