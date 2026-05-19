/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  wI
 */
public final class fQ_3
implements Runnable {
    private final wI A;
    private final Cq I;

    public static Runnable J(Cq cq2, wI wI2) {
        Cq b2 = wI2;
        Cq a2 = cq2;
        return new fQ_3(a2, (wI)b2);
    }

    @Override
    public void run() {
        fQ_3 a2;
        fQ_3 fQ_32 = a2;
        Cq.J(fQ_32.I, fQ_32.A);
    }

    /*
     * WARNING - void declaration
     */
    private fQ_3(Cq cq2, wI wI2) {
        void b2;
        fQ_3 a2;
        fQ_3 c2 = wI2;
        fQ_3 fQ_32 = a2 = this;
        fQ_32.I = b2;
        fQ_32.A = c2;
    }
}

