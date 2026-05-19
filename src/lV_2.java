/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hw
 *  vRa
 */
public class lV_2
extends hw {
    /*
     * WARNING - void declaration
     */
    public static hw J(long l2, hw hw2, int n2) {
        void a2;
        int b2;
        hw hw3 = hw2;
        int n3 = b2 = uSa.E;
        while (n3 < a2) {
            long c2;
            long l3 = c2 + (long)b2;
            hw3 = new lV_2(l3, hw3);
            n3 = ++b2;
        }
        return hw3;
    }

    /*
     * WARNING - void declaration
     */
    public lV_2(long l2, hw hw2) {
        void b2;
        lV_2 c2 = hw2;
        lV_2 a2 = this;
        super((long)b2);
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int n6;
        int e22;
        void a2;
        void b2;
        void c2;
        void d2;
        lV_2 lV_22 = this;
        void var5_8 = d2 >> vRa.d;
        void var6_9 = c2 >> vRa.d;
        void var7_10 = (b2 >> vRa.d) + uqa.g;
        void var8_11 = (a2 >> vRa.d) + uqa.g;
        int[] nArray = lV_22.A.J((int)var5_8, (int)var6_9, (int)var7_10, (int)var8_11);
        void var10_13 = var7_10 - vRa.d << vRa.d;
        void var11_14 = var8_11 - vRa.d << vRa.d;
        int[] nArray2 = iW.J((int)(var10_13 * var11_14));
        int n7 = e22 = uSa.E;
        while (n7 < var8_11 - vRa.d) {
            n6 = (e22 << vRa.d) * var10_13;
            int n8 = uSa.E;
            int n9 = nArray[n8 + uSa.E + (e22 + uSa.E) * var7_10];
            int n10 = nArray[n8 + uSa.E + (e22 + vRa.d) * var7_10];
            int n11 = n8;
            while (n11 < var7_10 - vRa.d) {
                lV_22.J(n8 + var5_8 << vRa.d, e22 + var6_9 << vRa.d);
                int n12 = nArray[n8 + vRa.d + (e22 + uSa.E) * var7_10];
                int n13 = nArray[n8 + vRa.d + (e22 + vRa.d) * var7_10];
                int[] nArray3 = nArray2;
                int n14 = n6++;
                nArray2[n14] = n9;
                int[] nArray4 = new int[uqa.g];
                nArray4[uSa.E] = n9;
                nArray4[vRa.d] = n10;
                nArray3[n14 + var10_13] = lV_22.J(nArray4);
                int[] nArray5 = new int[uqa.g];
                nArray5[uSa.E] = n9;
                nArray5[vRa.d] = n12;
                nArray2[n6] = lV_22.J(nArray5);
                int n15 = n6 + var10_13;
                ++n6;
                nArray3[n15] = lV_22.J(n9, n12, n10, n13);
                n9 = n12;
                n10 = n13;
                n11 = ++n8;
            }
            n7 = ++e22;
        }
        int[] e22 = iW.J((int)(b2 * a2));
        int n16 = n6 = uSa.E;
        while (n16 < a2) {
            System.arraycopy(nArray2, (n6 + (c2 & vRa.d)) * var10_13 + (d2 & vRa.d), e22, n6++ * b2, (int)b2);
            n16 = n6;
        }
        return e22;
    }
}

