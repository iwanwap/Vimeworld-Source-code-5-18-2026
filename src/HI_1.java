/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  xy
 */
public final class HI_1
implements Runnable {
    private final vL J;
    private final xy A;
    private final xy I;

    /*
     * WARNING - void declaration
     */
    private HI_1(vL vL2, xy xy2, xy xy3) {
        void b2;
        void c2;
        HI_1 a2;
        HI_1 d2 = xy3;
        HI_1 hI_1 = a2 = this;
        a2.J = c2;
        hI_1.A = b2;
        hI_1.I = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        return new HI_1(a2, (xy)b2, (xy)c2);
    }

    @Override
    public void run() {
        HI_1 a2;
        HI_1 hI_1 = a2;
        gh.f(hI_1.J, hI_1.A, a2.I);
    }
}

