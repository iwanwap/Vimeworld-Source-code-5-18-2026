/*
 * Decompiled with CFR 0.152.
 */
public final class Os
implements b {
    private final b[] arg$1;

    private Os(b[] bArray) {
        b[] b2 = bArray;
        b[] a2 = this;
        a2.arg$1 = b2;
    }

    @Override
    public float J() {
        Os a2;
        return St.M(a2.arg$1);
    }

    public static b J(b[] a2) {
        return new Os(a2);
    }
}

