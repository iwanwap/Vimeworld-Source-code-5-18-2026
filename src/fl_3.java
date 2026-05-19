/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Wj
 */
public final class fl_3
implements Runnable {
    private final Wj I;

    @Override
    public void run() {
        fl_3 a2;
        Wj.f((Wj)a2.I);
    }

    private fl_3(Wj wj2) {
        fl_3 b2 = wj2;
        fl_3 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(Wj a2) {
        return new fl_3(a2);
    }
}

