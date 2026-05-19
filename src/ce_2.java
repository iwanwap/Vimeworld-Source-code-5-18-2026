/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ND
 */
public final class ce_2
implements Runnable {
    private final ND I;

    public static Runnable J(ND a2) {
        return new ce_2(a2);
    }

    private ce_2(ND nD2) {
        ce_2 b2 = nD2;
        ce_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        ce_2 a2;
        a2.I.l();
    }
}

