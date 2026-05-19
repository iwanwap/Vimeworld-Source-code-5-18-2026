/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  hw
 *  vRa
 */
public final class bv_2
extends hw {
    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        bv_2 bv_22 = this;
        void var5_7 = d2 - vRa.d;
        void var6_9 = c2 - vRa.d;
        void var7_11 = b2 + uqa.g;
        int e2 = a2 + uqa.g;
        int[] nArray = bv_22.A.J((int)var5_7, (int)var6_9, (int)var7_11, e2);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                int n9 = nArray[n8 + uSa.E + (e2 + uSa.E) * var7_11];
                int n10 = nArray[n8 + uqa.g + (e2 + uSa.E) * var7_11];
                int n11 = nArray[n8 + uSa.E + (e2 + uqa.g) * var7_11];
                int n12 = nArray[n8 + uqa.g + (e2 + uqa.g) * var7_11];
                int n13 = nArray[n8 + vRa.d + (e2 + vRa.d) * var7_11];
                bv_22.J(n8 + d2, e2 + c2);
                nArray2[n8 + e2 * b2] = n13 == 0 && n9 == 0 && n10 == 0 && n11 == 0 && n12 == 0 && bv_22.J(ySa.T) == 0 ? Jy.P.Ka : n13;
                n7 = ++n8;
            }
            n6 = ++e2;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public bv_2(long l2, hw hw2) {
        void b2;
        bv_2 c2 = hw2;
        bv_2 a2 = this;
        super((long)b2);
        a2.A = c2;
    }
}

