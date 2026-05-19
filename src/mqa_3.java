/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dpa
 */
public final class mqa_3
implements Runnable {
    private final Dpa I;

    private mqa_3(Dpa dpa2) {
        mqa_3 b2 = dpa2;
        mqa_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        mqa_3 a2;
        Dpa.J((Dpa)a2.I);
    }

    public static Runnable J(Dpa a2) {
        return new mqa_3(a2);
    }
}

