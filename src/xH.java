/*
 * Decompiled with CFR 0.152.
 */
public final class xH
implements b {
    private final b[] I;

    private xH(b[] bArray) {
        b[] b2 = bArray;
        b[] a2 = this;
        a2.I = b2;
    }

    public static b J(b[] a2) {
        return new xH(a2);
    }

    @Override
    public float J() {
        xH a2;
        return RJ.l(a2.I);
    }
}

