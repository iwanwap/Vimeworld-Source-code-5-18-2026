/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pQ
 */
public final class lQ
implements b {
    private final b[] I;

    private lQ(b[] bArray) {
        b[] b2 = bArray;
        b[] a2 = this;
        a2.I = b2;
    }

    public static b J(b[] a2) {
        return new lQ(a2);
    }

    @Override
    public float J() {
        lQ a2;
        return pQ.C((b[])a2.I);
    }
}

