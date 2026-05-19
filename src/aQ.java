/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dp
 */
public final class aQ
implements Runnable {
    private final dp A;
    private final float I;

    @Override
    public void run() {
        aQ a2;
        aQ aQ2 = a2;
        dp.J((dp)aQ2.A, (float)aQ2.I);
    }

    public static Runnable J(dp dp2, float f2) {
        float b2 = f2;
        dp a2 = dp2;
        return new aQ(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private aQ(dp dp2, float f2) {
        void b2;
        aQ a2;
        float c2 = f2;
        aQ aQ2 = a2 = this;
        aQ2.A = b2;
        aQ2.I = c2;
    }
}

