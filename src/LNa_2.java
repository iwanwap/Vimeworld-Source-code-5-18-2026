/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 */
public final class LNa_2
implements Runnable {
    private final boolean A;
    private final ANa I;

    @Override
    public void run() {
        LNa_2 a2;
        LNa_2 lNa_2 = a2;
        ANa.J((ANa)lNa_2.I, (boolean)lNa_2.A);
    }

    /*
     * WARNING - void declaration
     */
    private LNa_2(ANa aNa2, boolean bl) {
        void b2;
        LNa_2 a2;
        boolean c2 = bl;
        LNa_2 lNa_2 = a2 = this;
        lNa_2.I = b2;
        lNa_2.A = c2;
    }

    public static Runnable J(ANa aNa2, boolean bl) {
        boolean b2 = bl;
        ANa a2 = aNa2;
        return new LNa_2(a2, b2);
    }
}

