/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  hw
 */
public final class Sv_2
extends hw {
    private hw J;
    private hw I;

    public void J(long a2) {
        Sv_2 b2;
        Sv_2 sv_2 = b2;
        b2.J.J(a2);
        sv_2.I.J(a2);
        super.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int e2;
        void a2;
        void b2;
        void c22;
        void d22;
        Sv_2 sv_2;
        Sv_2 sv_22 = sv_2 = this;
        int[] nArray = sv_22.J.J((int)d22, (int)c22, (int)b2, (int)a2);
        int[] d22 = sv_22.I.J((int)d22, (int)c22, (int)b2, (int)a2);
        int[] c22 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < b2 * a2) {
            if (nArray[e2] != Jy.Ba.Ka && nArray[e2] != Jy.L.Ka) {
                if (d22[e2] == Jy.n.Ka) {
                    if (nArray[e2] == Jy.C.Ka) {
                        c22[e2] = Jy.b.Ka;
                    } else if (nArray[e2] != Jy.P.Ka && nArray[e2] != Jy.Da.Ka) {
                        int n7 = e2;
                        c22[n7] = d22[n7] & osa.Ja;
                    } else {
                        c22[e2] = Jy.Da.Ka;
                    }
                } else {
                    int n8 = e2;
                    c22[n8] = nArray[n8];
                }
            } else {
                int n9 = e2;
                c22[n9] = nArray[n9];
            }
            n6 = ++e2;
        }
        return c22;
    }

    /*
     * WARNING - void declaration
     */
    public Sv_2(long l2, hw hw2, hw hw3) {
        Sv_2 d2;
        void b2;
        void c2;
        Sv_2 a2;
        Sv_2 sv_2 = sv_22;
        Sv_2 sv_22 = hw3;
        Sv_2 sv_23 = a2 = sv_2;
        super((long)c2);
        sv_23.J = b2;
        sv_23.I = d2;
    }
}

