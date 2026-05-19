/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Sk
 */
public final class WL_1
implements Runnable {
    private final Runnable I;

    public static Runnable J(Runnable a2) {
        return new WL_1(a2);
    }

    @Override
    public void run() {
        WL_1 a2;
        Sk.f((Runnable)a2.I);
    }

    private WL_1(Runnable runnable) {
        Runnable b2 = runnable;
        WL_1 a2 = this;
        a2.I = b2;
    }
}

