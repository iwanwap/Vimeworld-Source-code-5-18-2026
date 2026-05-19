/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class Hpa_2
implements Runnable {
    private final nra I;

    public static Runnable J(nra a2) {
        return new Hpa_2(a2);
    }

    private Hpa_2(nra nra2) {
        Hpa_2 b2 = nra2;
        Hpa_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        Hpa_2 a2;
        nra.f((nra)a2.I);
    }
}

