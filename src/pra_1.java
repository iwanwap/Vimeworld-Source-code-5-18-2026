/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fRa
 *  nra
 */
public final class pra_1
implements Runnable {
    private final fRa A;
    private final nra I;

    @Override
    public void run() {
        pra_1 a2;
        pra_1 pra_12 = a2;
        nra.f((nra)pra_12.I, (fRa)pra_12.A);
    }

    /*
     * WARNING - void declaration
     */
    private pra_1(nra nra2, fRa fRa2) {
        void b2;
        pra_1 a2;
        pra_1 c2 = fRa2;
        pra_1 pra_12 = a2 = this;
        pra_12.I = b2;
        pra_12.A = c2;
    }

    public static Runnable J(nra nra2, fRa fRa2) {
        nra b2 = fRa2;
        nra a2 = nra2;
        return new pra_1(a2, (fRa)b2);
    }
}

