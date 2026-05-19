/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lp
 */
public final class IR_1
implements Runnable {
    private final lp I;

    private IR_1(lp lp2) {
        IR_1 b2 = lp2;
        IR_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        IR_1 a2;
        lp.f((lp)a2.I);
    }

    public static Runnable J(lp a2) {
        return new IR_1(a2);
    }
}

