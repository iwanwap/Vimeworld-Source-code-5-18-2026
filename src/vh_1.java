/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LI
 */
public final class vh_1
implements b {
    private final b A;
    private final b I;

    /*
     * WARNING - void declaration
     */
    private vh_1(b b2, b b3) {
        void b4;
        vh_1 a2;
        b c2 = b3;
        vh_1 vh_12 = a2 = this;
        vh_12.I = b4;
        vh_12.A = c2;
    }

    @Override
    public float J() {
        vh_1 a2;
        vh_1 vh_12 = a2;
        return LI.e((b)vh_12.I, (b)vh_12.A);
    }

    public static b J(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        return new vh_1(a2, b4);
    }
}

