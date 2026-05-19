/*
 * Decompiled with CFR 0.152.
 */
public final class npa_3
implements Runnable {
    private final jb I;

    public static Runnable J(jb a2) {
        return new npa_3(a2);
    }

    private npa_3(jb jb2) {
        Object b2 = jb2;
        npa_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        npa_3 a2;
        a2.I.d();
    }
}

