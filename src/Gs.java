/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZM
 */
public final class Gs
implements Runnable {
    private final OT J;
    private final ZM A;
    private final String I;

    @Override
    public void run() {
        Gs a2;
        Gs gs = a2;
        OT.J(gs.J, gs.I, a2.A);
    }

    /*
     * WARNING - void declaration
     */
    private Gs(OT oT, String string, ZM zM) {
        void b2;
        void c2;
        Gs a2;
        Gs d2 = zM;
        Gs gs = a2 = this;
        a2.J = c2;
        gs.I = b2;
        gs.A = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(OT oT, String string, ZM zM) {
        void b2;
        OT c2 = zM;
        OT a2 = oT;
        return new Gs(a2, (String)b2, (ZM)c2);
    }
}

