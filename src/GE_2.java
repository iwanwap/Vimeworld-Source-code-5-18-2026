/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GE_2 {
    private int J;
    private int A;
    private int[] I;

    /*
     * WARNING - void declaration
     */
    public void J(int[] nArray) {
        int b2;
        void a2;
        GE_2 gE_2 = this;
        int n2 = ((void)a2).length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            GE_2 gE_22 = gE_2;
            gE_2.I[gE_22.A] = a2[b2];
            gE_22.A += vRa.d;
            n3 = ++b2;
        }
        GE_2 gE_23 = gE_2;
        if (gE_23.J < gE_23.A) {
            gE_2.J = gE_2.A;
        }
    }

    public int f() {
        GE_2 a2;
        return a2.A;
    }

    public int[] J() {
        GE_2 a2;
        return a2.I;
    }

    public int J(int n2) {
        int b2 = n2;
        GE_2 a2 = this;
        return a2.I[b2];
    }

    public void f(int n2) {
        int b2 = n2;
        GE_2 a2 = this;
        a2.A = b2;
    }

    public void J() {
        GE_2 a2;
        GE_2 gE_2 = a2;
        gE_2.A = uSa.E;
        gE_2.J = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        GE_2 b2;
        int c2 = n2;
        GE_2 gE_2 = b2 = this;
        gE_2.I[c2] = a2;
        if (gE_2.J < c2) {
            b2.J = c2;
        }
    }

    public GE_2(int n2) {
        GE_2 a2;
        int b2 = n2;
        GE_2 gE_2 = a2 = this;
        a2.I = null;
        gE_2.A = uSa.E;
        gE_2.J = uSa.E;
        gE_2.I = new int[b2];
    }

    public int J() {
        GE_2 a2;
        return a2.J;
    }

    public void J(int n2) {
        GE_2 a2;
        int b2 = n2;
        GE_2 gE_2 = a2 = this;
        GE_2 gE_22 = a2;
        gE_2.I[gE_22.A] = b2;
        gE_2.A += vRa.d;
        if (gE_22.J < a2.A) {
            a2.J = a2.A;
        }
    }
}

