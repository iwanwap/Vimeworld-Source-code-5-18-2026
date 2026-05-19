/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zD
 */
public final class yd_3
implements Runnable {
    private final zD I;

    @Override
    public void run() {
        yd_3 a2;
        zD.J((zD)a2.I);
    }

    private yd_3(zD zD2) {
        yd_3 b2 = zD2;
        yd_3 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(zD a2) {
        return new yd_3(a2);
    }
}

