/*
 * Decompiled with CFR 0.152.
 */
public final class XJ
implements b {
    private final b[] A;
    private final RJ I;

    /*
     * WARNING - void declaration
     */
    private XJ(RJ rJ, b[] bArray) {
        void b2;
        b[] c2 = bArray;
        b[] a2 = this;
        a2.I = b2;
        a2.A = c2;
    }

    public static b J(RJ rJ, b[] bArray) {
        b[] b2 = bArray;
        RJ a2 = rJ;
        return new XJ(a2, b2);
    }

    @Override
    public float J() {
        XJ a2;
        XJ xJ = a2;
        return RJ.J(xJ.I, xJ.A);
    }
}

