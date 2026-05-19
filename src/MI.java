/*
 * Decompiled with CFR 0.152.
 */
public final class MI
implements b {
    private final b[] I;

    private MI(b[] bArray) {
        b[] b2 = bArray;
        b[] a2 = this;
        a2.I = b2;
    }

    @Override
    public float J() {
        MI a2;
        return RJ.i(a2.I);
    }

    public static b J(b[] a2) {
        return new MI(a2);
    }
}

