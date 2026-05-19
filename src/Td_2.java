/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  VQa
 */
public final class Td_2 {
    private int j;
    private int J;
    private String A;
    private int I;

    public int C() {
        Td_2 a2;
        if (a2.J > WOa.fa) {
            return a2.j * ySa.T + a2.J;
        }
        if (a2.I > WOa.fa) {
            return a2.j * ySa.T + a2.J * NTa.C + WOa.fa;
        }
        return a2.j * ySa.T + a2.J * NTa.C + a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public Td_2(int n2, int n3, int n4, String string) {
        String e2;
        void b2;
        void c2;
        void d2;
        Td_2 a2;
        Td_2 td_2 = string2;
        String string2 = string;
        Td_2 td_22 = a2 = td_2;
        Td_2 td_23 = a2;
        td_23.j = d2;
        td_23.J = c2;
        td_22.I = b2;
        td_22.A = e2;
    }

    public int l() {
        Td_2 a2;
        return a2.I;
    }

    public int f() {
        Td_2 a2;
        return a2.J;
    }

    public String toString() {
        Td_2 a2;
        if (a2.A == null) {
            return new StringBuilder().insert(3 ^ 3, Mqa.y).append(a2.j).append(VQa.ja).append(a2.J).append(VQa.ja).append(a2.I).toString();
        }
        return new StringBuilder().insert(5 >> 3, Mqa.y).append(a2.j).append(VQa.ja).append(a2.J).append(VQa.ja).append(a2.I).append(a2.A).toString();
    }

    /*
     * WARNING - void declaration
     */
    public Td_2(int n2, int n3) {
        void b2;
        int c2 = n3;
        Td_2 a2 = this;
        a2((int)b2, c2, uSa.E);
    }

    public int J() {
        Td_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public Td_2(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Td_2 a2 = this;
        a2((int)c2, (int)b2, d2, null);
    }
}

