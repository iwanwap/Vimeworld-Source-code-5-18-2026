/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  xy
 */
public final class mG_3
implements Runnable {
    private final vL J;
    private final xy A;
    private final xy I;

    @Override
    public void run() {
        mG_3 a2;
        mG_3 mG_32 = a2;
        gh.l(mG_32.J, mG_32.I, a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        return new mG_3(a2, (xy)b2, (xy)c2);
    }

    /*
     * WARNING - void declaration
     */
    private mG_3(vL vL2, xy xy2, xy xy3) {
        void b2;
        void c2;
        mG_3 a2;
        mG_3 d2 = xy3;
        mG_3 mG_32 = a2 = this;
        a2.J = c2;
        mG_32.I = b2;
        mG_32.A = d2;
    }
}

