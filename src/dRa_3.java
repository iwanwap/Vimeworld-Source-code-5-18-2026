/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class dRa_3
implements Runnable {
    private final nra A;
    private final long I;

    @Override
    public void run() {
        dRa_3 a2;
        dRa_3 dRa_32 = a2;
        nra.f((nra)dRa_32.A, (long)dRa_32.I);
    }

    /*
     * WARNING - void declaration
     */
    private dRa_3(nra nra2, long l2) {
        void a2;
        dRa_3 b2;
        dRa_3 c2 = nra2;
        dRa_3 dRa_32 = b2 = this;
        dRa_32.A = c2;
        dRa_32.I = a2;
    }

    public static Runnable J(nra b2, long a2) {
        return new dRa_3(b2, a2);
    }
}

