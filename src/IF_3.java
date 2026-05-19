/*
 * Decompiled with CFR 0.152.
 */
public final class IF_3
implements i {
    private final RF I;

    private IF_3(RF rF2) {
        Object b2 = rF2;
        IF_3 a2 = this;
        a2.I = b2;
    }

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
        IF_3 a2 = this;
        RF.J(a2.I, (int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    public static i J(RF a2) {
        return new IF_3(a2);
    }
}

