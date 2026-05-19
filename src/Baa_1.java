/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Ypa
 *  jRa
 *  vRa
 */
public final class Baa_1 {
    public final int j;
    private int J;
    public final int A;
    private static final String I = "CL_00000133";

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof Baa_1)) {
            return uSa.E != 0;
        }
        b2 = (Baa_1)b2;
        if (((Baa_1)a2).j == ((Baa_1)b2).j && ((Baa_1)a2).A == ((Baa_1)b2).A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int e() {
        Baa_1 a2;
        return (a2.A << AQa.P) + Yqa.i;
    }

    public int d() {
        Baa_1 a2;
        return a2.j << AQa.P;
    }

    public String toString() {
        Baa_1 a2;
        return new StringBuilder().insert(3 ^ 3, dqa.X).append(a2.j).append(TOa.n).append(a2.A).append(XOa.D).toString();
    }

    public int hashCode() {
        Baa_1 baa_1 = this;
        if (baa_1.J == 0) {
            int n2 = dqa.L * baa_1.j + jRa.ja;
            int a2 = dqa.L * (baa_1.A ^ NTa.e) + jRa.ja;
            baa_1.J = n2 ^ a2;
        }
        return baa_1.J;
    }

    /*
     * WARNING - void declaration
     */
    public Baa_1(int n2, int n3) {
        void b2;
        Baa_1 a2;
        int c2 = n3;
        Baa_1 baa_1 = a2 = this;
        a2.J = uSa.E;
        baa_1.j = b2;
        baa_1.A = c2;
    }

    public int C() {
        Baa_1 a2;
        return (a2.j << AQa.P) + Ypa.A;
    }

    /*
     * WARNING - void declaration
     */
    public XF J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Baa_1 a2 = this;
        return new XF((a2.j << AQa.P) + c2, (int)b2, (a2.A << AQa.P) + d2);
    }

    public int l() {
        Baa_1 a2;
        return (a2.A << AQa.P) + Ypa.A;
    }

    public int f() {
        Baa_1 a2;
        return a2.A << AQa.P;
    }

    public XF J(int n2) {
        int b2 = n2;
        Baa_1 a2 = this;
        return new XF(a2.J(), b2, a2.e());
    }

    public int J() {
        Baa_1 a2;
        return (a2.j << AQa.P) + Yqa.i;
    }

    public static long J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return (long)a2 & vRa.C | ((long)b2 & vRa.C) << fPa.i;
    }
}

