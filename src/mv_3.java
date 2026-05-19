/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hw
 *  vRa
 */
public final class mv_3
extends hw {
    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        mv_3 mv_32 = this;
        void var5_7 = d2 - vRa.d;
        void var6_9 = c2 - vRa.d;
        void var7_11 = b2 + uqa.g;
        int e2 = a2 + uqa.g;
        int[] nArray = mv_32.A.J((int)var5_7, (int)var6_9, (int)var7_11, e2);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int[] nArray3;
                int n8;
                int n9 = nArray[n8 + uSa.E + (e2 + vRa.d) * var7_11];
                int n10 = nArray[n8 + uqa.g + (e2 + vRa.d) * var7_11];
                int n11 = nArray[n8 + vRa.d + (e2 + uSa.E) * var7_11];
                int n12 = nArray[n8 + vRa.d + (e2 + uqa.g) * var7_11];
                int n13 = nArray[n8 + vRa.d + (e2 + vRa.d) * var7_11];
                if (n9 == n10 && n11 == n12) {
                    mv_3 mv_33 = mv_32;
                    mv_33.J(n8 + d2, e2 + c2);
                    if (mv_33.J(uqa.g) == 0) {
                        n13 = n9;
                        nArray3 = nArray2;
                    } else {
                        n13 = n11;
                        nArray3 = nArray2;
                    }
                } else {
                    if (n9 == n10) {
                        n13 = n9;
                    }
                    if (n11 == n12) {
                        n13 = n11;
                    }
                    nArray3 = nArray2;
                }
                int n14 = n8 + e2 * b2;
                nArray3[n14] = n13;
                n7 = ++n8;
            }
            n6 = ++e2;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public mv_3(long l2, hw hw2) {
        void b2;
        mv_3 c2 = hw2;
        mv_3 a2 = this;
        super((long)b2);
        a2.A = c2;
    }
}

