/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class tPa_3
implements Runnable {
    private final nra A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    private tPa_3(nra nra2, int n2) {
        void b2;
        tPa_3 a2;
        int c2 = n2;
        tPa_3 tPa_32 = a2 = this;
        tPa_32.A = b2;
        tPa_32.I = c2;
    }

    public static Runnable J(nra nra2, int n2) {
        int b2 = n2;
        nra a2 = nra2;
        return new tPa_3(a2, b2);
    }

    @Override
    public void run() {
        tPa_3 a2;
        tPa_3 tPa_32 = a2;
        nra.J((nra)tPa_32.A, (int)tPa_32.I);
    }
}

