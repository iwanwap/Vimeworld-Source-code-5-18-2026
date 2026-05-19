/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  xy
 */
public final class UH_3
implements Runnable {
    private final xy J;
    private final vL A;
    private final xy I;

    /*
     * WARNING - void declaration
     */
    public static Runnable J(vL vL2, xy xy2, xy xy3) {
        void b2;
        vL c2 = xy3;
        vL a2 = vL2;
        return new UH_3(a2, (xy)b2, (xy)c2);
    }

    @Override
    public void run() {
        UH_3 a2;
        UH_3 uH_3 = a2;
        gh.J(uH_3.A, uH_3.I, a2.J);
    }

    /*
     * WARNING - void declaration
     */
    private UH_3(vL vL2, xy xy2, xy xy3) {
        void b2;
        void c2;
        UH_3 a2;
        UH_3 d2 = xy3;
        UH_3 uH_3 = a2 = this;
        a2.A = c2;
        uH_3.I = b2;
        uH_3.J = d2;
    }
}

