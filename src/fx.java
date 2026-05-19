/*
 * Decompiled with CFR 0.152.
 */
public final class fx
implements Runnable {
    private final rw I;

    private fx(rw rw2) {
        rw b2 = rw2;
        fx a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        fx a2;
        rw.J(a2.I);
    }

    public static Runnable J(rw a2) {
        return new fx(a2);
    }
}

