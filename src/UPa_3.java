/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class UPa_3
implements Runnable {
    private final nra I;

    @Override
    public void run() {
        UPa_3 a2;
        nra.l((nra)a2.I);
    }

    private UPa_3(nra nra2) {
        UPa_3 b2 = nra2;
        UPa_3 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(nra a2) {
        return new UPa_3(a2);
    }
}

