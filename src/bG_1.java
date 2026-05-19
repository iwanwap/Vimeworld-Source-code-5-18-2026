/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  xy
 */
public final class bG_1
implements Runnable {
    private final xy J;
    private final xy A;
    private final vL I;

    /*
     * WARNING - void declaration
     */
    private bG_1(vL vL2, xy xy2, xy xy3) {
        void b2;
        void c2;
        bG_1 a2;
        bG_1 d2 = xy3;
        bG_1 bG_12 = a2 = this;
        a2.I = c2;
        bG_12.A = b2;
        bG_12.J = d2;
    }

    @Override
    public void run() {
        bG_1 a2;
        bG_1 bG_12 = a2;
        gh.e(bG_12.I, bG_12.A, a2.J);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        return new bG_1(a2, (xy)b2, (xy)c2);
    }
}

