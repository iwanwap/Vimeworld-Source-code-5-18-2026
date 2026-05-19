/*
 * Decompiled with CFR 0.152.
 */
public final class LK_3
implements b {
    private final RJ I;

    private LK_3(RJ rJ2) {
        Object b2 = rJ2;
        LK_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public float J() {
        LK_3 a2;
        return RJ.i(a2.I);
    }

    public static b J(RJ a2) {
        return new LK_3(a2);
    }
}

