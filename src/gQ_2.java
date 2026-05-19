/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dp
 */
public final class gQ_2
implements Runnable {
    private final dp I;

    private gQ_2(dp dp2) {
        gQ_2 b2 = dp2;
        gQ_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        gQ_2 a2;
        dp.J((dp)a2.I);
    }

    public static Runnable J(dp a2) {
        return new gQ_2(a2);
    }
}

