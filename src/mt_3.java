/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eT
 */
public final class mt_3
implements Runnable {
    private final eT I;

    private mt_3(eT eT2) {
        mt_3 b2 = eT2;
        mt_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        mt_3 a2;
        eT.J((eT)a2.I);
    }

    public static Runnable J(eT a2) {
        return new mt_3(a2);
    }
}

