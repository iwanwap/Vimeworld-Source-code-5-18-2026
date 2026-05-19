/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pQ
 */
public final class mP
implements b {
    private final b[] I;

    private mP(b[] bArray) {
        b[] b2 = bArray;
        b[] a2 = this;
        a2.I = b2;
    }

    @Override
    public float J() {
        mP a2;
        return pQ.B((b[])a2.I);
    }

    public static b J(b[] a2) {
        return new mP(a2);
    }
}

