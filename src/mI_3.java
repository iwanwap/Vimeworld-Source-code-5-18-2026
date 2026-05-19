/*
 * Decompiled with CFR 0.152.
 */
public final class mI_3
implements b {
    private final RJ I;

    private mI_3(RJ rJ2) {
        Object b2 = rJ2;
        mI_3 a2 = this;
        a2.I = b2;
    }

    public static b J(RJ a2) {
        return new mI_3(a2);
    }

    @Override
    public float J() {
        mI_3 a2;
        return RJ.J(a2.I);
    }
}

