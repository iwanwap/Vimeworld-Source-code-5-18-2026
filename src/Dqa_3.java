/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dpa
 */
public final class Dqa_3
implements Runnable {
    private final Dpa A;
    private final boolean I;

    public static Runnable J(Dpa dpa2, boolean bl) {
        boolean b2 = bl;
        Dpa a2 = dpa2;
        return new Dqa_3(a2, b2);
    }

    @Override
    public void run() {
        Dqa_3 a2;
        Dqa_3 dqa_3 = a2;
        Dpa.J((Dpa)dqa_3.A, (boolean)dqa_3.I);
    }

    /*
     * WARNING - void declaration
     */
    private Dqa_3(Dpa dpa2, boolean bl) {
        void b2;
        Dqa_3 a2;
        boolean c2 = bl;
        Dqa_3 dqa_3 = a2 = this;
        dqa_3.A = b2;
        dqa_3.I = c2;
    }
}

