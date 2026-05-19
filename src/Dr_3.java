/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tp
 */
public final class Dr_3
implements Runnable {
    private final long A;
    private final tp I;

    @Override
    public void run() {
        Dr_3 a2;
        Dr_3 dr_3 = a2;
        tp.J((tp)dr_3.I, (long)dr_3.A);
    }

    public static Runnable J(tp b2, long a2) {
        return new Dr_3(b2, a2);
    }

    /*
     * WARNING - void declaration
     */
    private Dr_3(tp tp2, long l2) {
        void a2;
        Dr_3 b2;
        Dr_3 c2 = tp2;
        Dr_3 dr_3 = b2 = this;
        dr_3.I = c2;
        dr_3.A = a2;
    }
}

