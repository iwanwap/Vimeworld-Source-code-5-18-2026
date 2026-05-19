/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dp
 */
public final class Rr
implements Runnable {
    private final dp I;

    private Rr(dp dp2) {
        Rr b2 = dp2;
        Rr a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        Rr a2;
        dp.f((dp)a2.I);
    }

    public static Runnable J(dp a2) {
        return new Rr(a2);
    }
}

