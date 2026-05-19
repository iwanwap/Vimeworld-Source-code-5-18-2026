/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YG
 *  gG
 */
public final class eH_2
implements Runnable {
    private final gG I;

    private eH_2(gG gG2) {
        eH_2 b2 = gG2;
        eH_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        eH_2 a2;
        YG.f((gG)a2.I);
    }

    public static Runnable J(gG a2) {
        return new eH_2(a2);
    }
}

