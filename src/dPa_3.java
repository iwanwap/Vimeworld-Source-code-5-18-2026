/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class dPa_3
implements Runnable {
    private final nra A;
    private final long I;

    public static Runnable J(nra b2, long a2) {
        return new dPa_3(b2, a2);
    }

    @Override
    public void run() {
        dPa_3 a2;
        dPa_3 dPa_32 = a2;
        nra.J((nra)dPa_32.A, (long)dPa_32.I);
    }

    /*
     * WARNING - void declaration
     */
    private dPa_3(nra nra2, long l2) {
        void a2;
        dPa_3 b2;
        dPa_3 c2 = nra2;
        dPa_3 dPa_32 = b2 = this;
        dPa_32.A = c2;
        dPa_32.I = a2;
    }
}

