/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aKa
 *  pKa
 *  uKa
 *  vRa
 */
public final class IG_1 {
    private final aKa M;
    private boolean k;
    private int j;
    private final hKa J;
    private final int A;
    private final pKa I;

    public void J(int n2) {
        int b2 = n2;
        IG_1 a2 = this;
        if (b2 != a2.j) {
            a2.j = b2;
            if (a2.k) {
                IG_1 iG_1 = a2;
                iG_1.f();
                iG_1.J();
            }
            uKa.C((int)b2);
        }
    }

    public void f() {
        IG_1 a2;
        a2.I.J();
        a2.k = uSa.E;
    }

    public void J() {
        IG_1 a2;
        IG_1 iG_1 = a2;
        iG_1.M.J(iG_1.A, a2.J);
    }

    public aKa J(double c2, double b2, double a2) {
        IG_1 d2;
        d2.k = vRa.d;
        return d2.M.J(c2, b2, a2);
    }

    /*
     * WARNING - void declaration
     */
    public IG_1(int n2, hKa hKa2) {
        void b2;
        IG_1 a2;
        hKa c2 = hKa2;
        IG_1 iG_1 = a2 = this;
        IG_1 iG_12 = a2;
        iG_12.I = pKa.J();
        iG_12.M = iG_12.I.J();
        iG_12.j = ypa.L;
        iG_12.k = uSa.E;
        iG_1.A = b2;
        iG_1.J = c2;
    }
}

