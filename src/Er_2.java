/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lp
 */
public final class Er_2
implements Runnable {
    private final double A;
    private final double I;

    private Er_2(double b2, double a2) {
        Er_2 c2;
        Er_2 er_2 = c2;
        er_2.I = b2;
        er_2.A = a2;
    }

    public static Runnable J(double b2, double a2) {
        return new Er_2(b2, a2);
    }

    @Override
    public void run() {
        Er_2 a2;
        lp.J((double)a2.I, (double)a2.A);
    }
}

