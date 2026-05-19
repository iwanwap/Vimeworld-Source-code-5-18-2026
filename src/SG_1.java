/*
 * Decompiled with CFR 0.152.
 */
public final class SG_1
implements b {
    private final b[] I;

    private SG_1(b[] bArray) {
        b[] b2 = bArray;
        b[] a2 = this;
        a2.I = b2;
    }

    @Override
    public float J() {
        SG_1 a2;
        return RJ.G(a2.I);
    }

    public static b J(b[] a2) {
        return new SG_1(a2);
    }
}

