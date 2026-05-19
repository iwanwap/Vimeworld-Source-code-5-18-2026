/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vq
 *  wI
 */
public final class Zr_2
implements Runnable {
    private final wI A;
    private final vq I;

    @Override
    public void run() {
        Zr_2 a2;
        Zr_2 zr_2 = a2;
        vq.J((vq)zr_2.I, (wI)zr_2.A);
    }

    /*
     * WARNING - void declaration
     */
    private Zr_2(vq vq2, wI wI2) {
        void b2;
        Zr_2 a2;
        Zr_2 c2 = wI2;
        Zr_2 zr_2 = a2 = this;
        zr_2.I = b2;
        zr_2.A = c2;
    }

    public static Runnable J(vq vq2, wI wI2) {
        vq b2 = wI2;
        vq a2 = vq2;
        return new Zr_2(a2, (wI)b2);
    }
}

