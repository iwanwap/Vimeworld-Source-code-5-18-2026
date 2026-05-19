/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class lpa_2
implements Runnable {
    private final nra I;

    public static Runnable J(nra a2) {
        return new lpa_2(a2);
    }

    private lpa_2(nra nra2) {
        lpa_2 b2 = nra2;
        lpa_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        lpa_2 a2;
        nra.J((nra)a2.I);
    }
}

