/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qoa
 */
public final class xMa_2
implements Runnable {
    private final Qoa I;

    @Override
    public void run() {
        xMa_2 a2;
        Qoa.J((Qoa)a2.I);
    }

    private xMa_2(Qoa qoa2) {
        xMa_2 b2 = qoa2;
        xMa_2 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(Qoa a2) {
        return new xMa_2(a2);
    }
}

