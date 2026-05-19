/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uR
 */
public final class bu
implements Runnable {
    private final double A;
    private final uR I;

    /*
     * WARNING - void declaration
     */
    private bu(uR uR2, double d2) {
        void a2;
        bu b2;
        bu c2 = uR2;
        bu bu2 = b2 = this;
        bu2.I = c2;
        bu2.A = a2;
    }

    public static Runnable J(uR b2, double a2) {
        return new bu(b2, a2);
    }

    @Override
    public void run() {
        bu a2;
        bu bu2 = a2;
        uR.J((uR)bu2.I, (double)bu2.A);
    }
}

