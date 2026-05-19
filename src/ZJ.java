/*
 * Decompiled with CFR 0.152.
 */
public final class ZJ
implements b {
    private final RJ A;
    private final String I;

    /*
     * WARNING - void declaration
     */
    private ZJ(RJ rJ, String string) {
        void b2;
        ZJ a2;
        String c2 = string;
        ZJ zJ2 = a2 = this;
        zJ2.A = b2;
        zJ2.I = c2;
    }

    @Override
    public float J() {
        ZJ a2;
        ZJ zJ2 = a2;
        return RJ.J(zJ2.A, zJ2.I);
    }

    public static b J(RJ rJ, String string) {
        Object b2 = string;
        RJ a2 = rJ;
        return new ZJ(a2, (String)b2);
    }
}

