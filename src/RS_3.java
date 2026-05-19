/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ke
 */
public final class RS_3
implements i {
    private final Ke I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl3 = bl2;
        RS_3 a2 = this;
        CT.J(a2.I, (int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    private RS_3(Ke ke2) {
        RS_3 b2 = ke2;
        RS_3 a2 = this;
        a2.I = b2;
    }

    public static i J(Ke a2) {
        return new RS_3(a2);
    }
}

