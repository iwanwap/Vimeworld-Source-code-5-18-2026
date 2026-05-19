/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HT
 *  YS
 *  uT
 */
public final class XT_3
implements i {
    private final YS A;
    private final HT I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        XT_3 a2;
        boolean bl3 = bl2;
        XT_3 xT_3 = a2 = this;
        uT.J((HT)xT_3.I, (YS)xT_3.A, (int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    public static i J(HT hT2, YS yS2) {
        HT b2 = yS2;
        HT a2 = hT2;
        return new XT_3(a2, (YS)b2);
    }

    /*
     * WARNING - void declaration
     */
    private XT_3(HT hT2, YS yS2) {
        void b2;
        XT_3 a2;
        XT_3 c2 = yS2;
        XT_3 xT_3 = a2 = this;
        xT_3.I = b2;
        xT_3.A = c2;
    }
}

