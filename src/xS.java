/*
 * Decompiled with CFR 0.152.
 */
public final class xS
implements Runnable {
    private final XR I;

    private xS(XR xR) {
        Object b2 = xR;
        xS a2 = this;
        a2.I = b2;
    }

    public static Runnable J(XR a2) {
        return new xS(a2);
    }

    @Override
    public void run() {
        xS a2;
        XR.J(a2.I);
    }
}

