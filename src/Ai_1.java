/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  xy
 */
public final class Ai_1
implements Runnable {
    private final xy J;
    private final xy A;
    private final vL I;

    /*
     * WARNING - void declaration
     */
    private Ai_1(vL vL2, xy xy2, xy xy3) {
        void b2;
        void c2;
        Ai_1 a2;
        Ai_1 d2 = xy3;
        Ai_1 ai_1 = a2 = this;
        a2.I = c2;
        ai_1.A = b2;
        ai_1.J = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        return new Ai_1(a2, (xy)b2, (xy)c2);
    }

    @Override
    public void run() {
        Ai_1 a2;
        Ai_1 ai_1 = a2;
        gh.C(ai_1.I, ai_1.A, a2.J);
    }
}

