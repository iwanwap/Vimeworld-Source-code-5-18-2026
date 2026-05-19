/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BD
 */
public final class ne_3
implements Runnable {
    private final BD I;

    private ne_3(BD bD2) {
        ne_3 b2 = bD2;
        ne_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        ne_3 a2;
        BD.J((BD)a2.I);
    }

    public static Runnable J(BD a2) {
        return new ne_3(a2);
    }
}

