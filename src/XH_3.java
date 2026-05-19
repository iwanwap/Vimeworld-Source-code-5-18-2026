/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LI
 */
public final class XH_3
implements b {
    private final b A;
    private final b I;

    /*
     * WARNING - void declaration
     */
    private XH_3(b b2, b b3) {
        void b4;
        XH_3 a2;
        b c2 = b3;
        XH_3 xH_3 = a2 = this;
        xH_3.I = b4;
        xH_3.A = c2;
    }

    public static b J(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        return new XH_3(a2, b4);
    }

    @Override
    public float J() {
        XH_3 a2;
        XH_3 xH_3 = a2;
        return LI.A((b)xH_3.I, (b)xH_3.A);
    }
}

