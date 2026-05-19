/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YSa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pZ {
    private int j;
    private int J;
    private int A;
    private final long[] I = new long[YSa.c];

    public void J(long a2) {
        pZ b2;
        pZ pZ2 = b2;
        pZ pZ3 = b2;
        pZ2.I[pZ3.j] = a2;
        pZ2.j += vRa.d;
        if (pZ3.j == YSa.c) {
            b2.j = uSa.E;
        }
        if (b2.J < YSa.c) {
            b2.A = uSa.E;
            b2.J += vRa.d;
            return;
        }
        pZ pZ4 = b2;
        pZ4.A = pZ4.J(pZ4.j + vRa.d);
    }

    public long[] J() {
        pZ a2;
        return a2.I;
    }

    public int f() {
        pZ a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public int J(long l2, int n2) {
        void b2;
        int c2 = n2;
        pZ a2 = this;
        return (int)((double)b2 / xqa.s * (double)c2);
    }

    public pZ() {
        pZ a2;
    }

    public int J(int n2) {
        int b2 = n2;
        pZ a2 = this;
        return b2 % YSa.c;
    }

    public int J() {
        pZ a2;
        return a2.j;
    }
}

