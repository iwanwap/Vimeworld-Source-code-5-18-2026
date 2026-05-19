/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  xy
 */
public final class vg_3
implements Runnable {
    private final xy J;
    private final xy A;
    private final vL I;

    /*
     * WARNING - void declaration
     */
    public static Runnable J(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        return new vg_3(a2, (xy)b2, (xy)c2);
    }

    /*
     * WARNING - void declaration
     */
    private vg_3(vL vL2, xy xy2, xy xy3) {
        void b2;
        void c2;
        vg_3 a2;
        vg_3 d2 = xy3;
        vg_3 vg_32 = a2 = this;
        a2.I = c2;
        vg_32.J = b2;
        vg_32.A = d2;
    }

    @Override
    public void run() {
        vg_3 a2;
        vg_3 vg_32 = a2;
        gh.d(vg_32.I, vg_32.J, a2.A);
    }
}

