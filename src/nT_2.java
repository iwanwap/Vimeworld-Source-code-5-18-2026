/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Xt
 */
public final class nT_2
implements Runnable {
    private final Xt I;

    @Override
    public void run() {
        nT_2 a2;
        Xt.J((Xt)a2.I);
    }

    private nT_2(Xt xt) {
        nT_2 b2 = xt;
        nT_2 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(Xt a2) {
        return new nT_2(a2);
    }
}

