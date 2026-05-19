/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LI
 */
public final class lI_2
implements b {
    private final b A;
    private final b I;

    /*
     * WARNING - void declaration
     */
    private lI_2(b b2, b b3) {
        void b4;
        lI_2 a2;
        b c2 = b3;
        lI_2 lI_22 = a2 = this;
        lI_22.A = b4;
        lI_22.I = c2;
    }

    @Override
    public float J() {
        lI_2 a2;
        lI_2 lI_22 = a2;
        return LI.J((b)lI_22.A, (b)lI_22.I);
    }

    public static b J(b b2, b b3) {
        b b4 = b3;
        b a2 = b2;
        return new lI_2(a2, b4);
    }
}

