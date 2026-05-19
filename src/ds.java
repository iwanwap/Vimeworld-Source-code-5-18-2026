/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Xt
 */
public final class ds
implements Runnable {
    private final Xt I;

    @Override
    public void run() {
        ds a2;
        Xt.f((Xt)a2.I);
    }

    private ds(Xt xt) {
        ds b2 = xt;
        ds a2 = this;
        a2.I = b2;
    }

    public static Runnable J(Xt a2) {
        return new ds(a2);
    }
}

