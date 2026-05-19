/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class MPa_1
implements Runnable {
    private final Runnable I;

    private MPa_1(Runnable runnable) {
        Runnable b2 = runnable;
        MPa_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        MPa_1 a2;
        nra.f((Runnable)a2.I);
    }

    public static Runnable J(Runnable a2) {
        return new MPa_1(a2);
    }
}

