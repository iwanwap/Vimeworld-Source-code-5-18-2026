/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LQ
 *  wI
 */
public final class Ep_1
implements Runnable {
    private final LQ A;
    private final wI I;

    @Override
    public void run() {
        Ep_1 a2;
        Ep_1 ep_1 = a2;
        LQ.J((LQ)ep_1.A, (wI)ep_1.I);
    }

    public static Runnable J(LQ lQ2, wI wI2) {
        LQ b2 = wI2;
        LQ a2 = lQ2;
        return new Ep_1(a2, (wI)b2);
    }

    /*
     * WARNING - void declaration
     */
    private Ep_1(LQ lQ2, wI wI2) {
        void b2;
        Ep_1 a2;
        Ep_1 c2 = wI2;
        Ep_1 ep_1 = a2 = this;
        ep_1.A = b2;
        ep_1.I = c2;
    }
}

