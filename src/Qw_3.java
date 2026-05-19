/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ypa
 *  ew
 *  hw
 *  vRa
 */
public final class Qw_3
extends hw {
    private final ew I;

    /*
     * WARNING - void declaration
     */
    private int[] C(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        Qw_3 qw_3 = this;
        int n6 = vRa.d + b2 + vRa.d;
        int e2 = vRa.d + a2 + vRa.d;
        int[] d2 = qw_3.A.J((int)(d2 -= vRa.d), (int)(c2 -= vRa.d), n6, e2);
        int[] c2 = iW.J((int)(b2 * a2));
        int n7 = e2 = uSa.E;
        while (n7 < a2) {
            int n8 = uSa.E;
            while (n8 < b2) {
                int n9;
                int n10 = d2[n9 + vRa.d + (e2 + vRa.d) * n6];
                if (n10 == AQa.P) {
                    int n11 = d2[n9 + vRa.d + (e2 + vRa.d - vRa.d) * n6];
                    int n12 = d2[n9 + vRa.d + vRa.d + (e2 + vRa.d) * n6];
                    int n13 = d2[n9 + vRa.d - vRa.d + (e2 + vRa.d) * n6];
                    int n14 = d2[n9 + vRa.d + (e2 + vRa.d + vRa.d) * n6];
                    int n15 = n11 == uqa.g || n12 == uqa.g || n13 == uqa.g || n14 == uqa.g ? vRa.d : uSa.E;
                    int n16 = n11 = n11 == vRa.d || n12 == vRa.d || n13 == vRa.d || n14 == vRa.d ? vRa.d : uSa.E;
                    if (n11 != 0 || n15 != 0) {
                        n10 = yRa.d;
                    }
                }
                int n17 = n9 + e2 * b2;
                c2[n17] = n10;
                n8 = ++n9;
            }
            n7 = ++e2;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n6 = n5;
        Qw_3 a2 = this;
        switch (kW.I[a2.I.ordinal()]) {
            default: {
                return a2.l((int)d2, (int)c2, (int)b2, (int)e2);
            }
            case 2: {
                return a2.C((int)d2, (int)c2, (int)b2, (int)e2);
            }
            case 3: 
        }
        return a2.f((int)d2, (int)c2, (int)b2, (int)e2);
    }

    /*
     * WARNING - void declaration
     */
    private int[] l(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        Qw_3 qw_3 = this;
        void var5_7 = d2 - vRa.d;
        void var6_9 = c2 - vRa.d;
        int n6 = vRa.d + b2 + vRa.d;
        int e2 = vRa.d + a2 + vRa.d;
        int[] nArray = qw_3.A.J((int)var5_7, (int)var6_9, n6, e2);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n7 = e2 = uSa.E;
        while (n7 < a2) {
            int n8 = uSa.E;
            while (n8 < b2) {
                int n9;
                int n10 = n9;
                qw_3.J(n10 + d2, e2 + c2);
                int n11 = nArray[n10 + vRa.d + (e2 + vRa.d) * n6];
                if (n11 == vRa.d) {
                    int n12 = nArray[n9 + vRa.d + (e2 + vRa.d - vRa.d) * n6];
                    int n13 = nArray[n9 + vRa.d + vRa.d + (e2 + vRa.d) * n6];
                    int n14 = nArray[n9 + vRa.d - vRa.d + (e2 + vRa.d) * n6];
                    int n15 = nArray[n9 + vRa.d + (e2 + vRa.d + vRa.d) * n6];
                    int n16 = n12 == yRa.d || n13 == yRa.d || n14 == yRa.d || n15 == yRa.d ? vRa.d : uSa.E;
                    int n17 = n12 = n12 == AQa.P || n13 == AQa.P || n14 == AQa.P || n15 == AQa.P ? vRa.d : uSa.E;
                    if (n16 != 0 || n12 != 0) {
                        n11 = uqa.g;
                    }
                }
                int n18 = n9 + e2 * b2;
                nArray2[n18] = n11;
                n8 = ++n9;
            }
            n7 = ++e2;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    private int[] f(int n2, int n3, int n4, int n5) {
        int e2;
        void a2;
        void b2;
        void c2;
        void d2;
        Qw_3 qw_3 = this;
        int[] nArray = qw_3.A.J((int)d2, (int)c2, (int)b2, (int)a2);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                int n9 = n8;
                qw_3.J(n9 + d2, e2 + c2);
                int n10 = nArray[n9 + e2 * b2];
                if (n10 != 0 && qw_3.J(uua.s) == 0) {
                    n10 |= vRa.d + qw_3.J(Ypa.A) << Yqa.i & Yua.fa;
                }
                int n11 = n8 + e2 * b2;
                nArray2[n11] = n10;
                n7 = ++n8;
            }
            n6 = ++e2;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public Qw_3(long l2, hw hw2, ew ew2) {
        Qw_3 d2;
        void b2;
        void c2;
        Qw_3 a2;
        Qw_3 qw_3 = qw_32;
        Qw_3 qw_32 = ew2;
        Qw_3 qw_33 = a2 = qw_3;
        super((long)c2);
        qw_33.A = b2;
        qw_33.I = d2;
    }
}

