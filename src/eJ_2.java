/*
 * Decompiled with CFR 0.152.
 */
public final class eJ_2
implements b {
    private final RJ I;

    private eJ_2(RJ rJ2) {
        Object b2 = rJ2;
        eJ_2 a2 = this;
        a2.I = b2;
    }

    public static b J(RJ a2) {
        return new eJ_2(a2);
    }

    @Override
    public float J() {
        eJ_2 a2;
        return RJ.D(a2.I);
    }
}

