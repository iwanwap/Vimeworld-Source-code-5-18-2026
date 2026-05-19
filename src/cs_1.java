/*
 * Decompiled with CFR 0.152.
 */
public final class cs_1
implements Runnable {
    private final vS I;

    public static Runnable J(vS a2) {
        return new cs_1(a2);
    }

    private cs_1(vS vS2) {
        Object b2 = vS2;
        cs_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        cs_1 a2;
        vS.J(a2.I);
    }
}

