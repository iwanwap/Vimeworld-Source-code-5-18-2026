/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hw
 *  vRa
 */
public final class WU_2
extends hw {
    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        WU_2 wU_2 = this;
        void var5_7 = d2 - vRa.d;
        void var6_9 = c2 - vRa.d;
        void var7_11 = b2 + uqa.g;
        int e2 = a2 + uqa.g;
        int[] nArray = wU_2.A.J((int)var5_7, (int)var6_9, (int)var7_11, e2);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                int n9;
                int n10 = nArray[n9 + vRa.d + (e2 + vRa.d - vRa.d) * (b2 + uqa.g)];
                int n11 = nArray[n9 + vRa.d + vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                int n12 = nArray[n9 + vRa.d - vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                int n13 = nArray[n9 + vRa.d + (e2 + vRa.d + vRa.d) * (b2 + uqa.g)];
                nArray2[n9 + e2 * b2] = n8 = nArray[n9 + vRa.d + (e2 + vRa.d) * var7_11];
                wU_2.J(n9 + d2, e2 + c2);
                if (n8 == 0 && n10 == 0 && n11 == 0 && n12 == 0 && n13 == 0 && wU_2.J(uqa.g) == 0) {
                    nArray2[n9 + e2 * b2] = vRa.d;
                }
                n7 = ++n9;
            }
            n6 = ++e2;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public WU_2(long l2, hw hw2) {
        void b2;
        WU_2 c2 = hw2;
        WU_2 a2 = this;
        super((long)b2);
        a2.A = c2;
    }
}

