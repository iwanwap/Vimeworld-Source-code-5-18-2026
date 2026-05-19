/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ge
 */
public final class BE
implements i {
    private final String I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        BE a2 = this;
        ge.J((String)a2.I, (int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    public static i J(String a2) {
        return new BE(a2);
    }

    private BE(String string) {
        String b2 = string;
        BE a2 = this;
        a2.I = b2;
    }
}

