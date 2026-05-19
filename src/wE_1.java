/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DD
 */
public final class wE_1
implements Runnable {
    private final DD I;

    @Override
    public void run() {
        wE_1 a2;
        DD.J((DD)a2.I);
    }

    private wE_1(DD dD) {
        wE_1 b2 = dD;
        wE_1 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(DD a2) {
        return new wE_1(a2);
    }
}

