/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  hw
 *  vRa
 */
public final class hv_1
extends hw {
    /*
     * WARNING - void declaration
     */
    public hv_1(long l2, hw hw2) {
        void b2;
        hv_1 c2 = hw2;
        hv_1 a2 = this;
        super((long)b2);
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        hv_1 hv_12 = this;
        void var5_9 = b2 + uqa.g;
        int e2 = a2 + uqa.g;
        int[] d2 = hv_12.A.J((int)(d2 -= vRa.d), (int)(c2 -= vRa.d), (int)var5_9, e2);
        int[] c2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                int n9 = d2[n8 + vRa.d + (e2 + vRa.d - vRa.d) * (b2 + uqa.g)];
                int n10 = d2[n8 + vRa.d + vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                int n11 = d2[n8 + vRa.d - vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                int n12 = d2[n8 + vRa.d + (e2 + vRa.d + vRa.d) * (b2 + uqa.g)];
                int n13 = d2[n8 + vRa.d + (e2 + vRa.d) * var5_9];
                int n14 = uSa.E;
                if (n9 == 0) {
                    ++n14;
                }
                if (n10 == 0) {
                    ++n14;
                }
                if (n11 == 0) {
                    ++n14;
                }
                if (n12 == 0) {
                    ++n14;
                }
                c2[n8 + e2 * b2] = n13 == 0 && n14 > yRa.d ? Jy.L.Ka : n13;
                n7 = ++n8;
            }
            n6 = ++e2;
        }
        return c2;
    }
}

