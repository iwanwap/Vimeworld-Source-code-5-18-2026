/*
 * Decompiled with CFR 0.152.
 */
public final class Su
implements b {
    private final b[] arg$1;

    private Su(b[] bArray) {
        b[] b2 = bArray;
        b[] a2 = this;
        a2.arg$1 = b2;
    }

    @Override
    public float J() {
        Su a2;
        return St.i(a2.arg$1);
    }

    public static b J(b[] a2) {
        return new Su(a2);
    }
}

