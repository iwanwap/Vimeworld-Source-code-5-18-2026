/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hw
 *  vRa
 */
public final class UV_3
extends hw {
    /*
     * WARNING - void declaration
     */
    public UV_3(long l2, hw hw2) {
        void b2;
        UV_3 c2 = hw2;
        UV_3 a2 = this;
        super((long)b2);
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        UV_3 uV_3 = this;
        void var5_7 = d2 - vRa.d;
        void var6_9 = c2 - vRa.d;
        void var7_11 = b2 + uqa.g;
        int e2 = a2 + uqa.g;
        int[] nArray = uV_3.A.J((int)var5_7, (int)var6_9, (int)var7_11, e2);
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
                uV_3.J(n8 + d2, e2 + c2);
                if (n13 != 0 || n9 == 0 && n10 == 0 && n11 == 0 && n12 == 0) {
                    nArray2[n8 + e2 * b2] = n13 > 0 && (n9 == 0 || n10 == 0 || n11 == 0 || n12 == 0) ? (uV_3.J(tTa.h) == 0 ? (n13 == AQa.P ? AQa.P : uSa.E) : n13) : n13;
                } else {
                    n13 = vRa.d;
                    int n14 = vRa.d;
                    if (n9 != 0) {
                        int n15 = uV_3.J(n13);
                        ++n13;
                        if (n15 == 0) {
                            n14 = n9;
                        }
                    }
                    if (n10 != 0) {
                        int n16 = uV_3.J(n13);
                        ++n13;
                        if (n16 == 0) {
                            n14 = n10;
                        }
                    }
                    if (n11 != 0) {
                        int n17 = uV_3.J(n13);
                        ++n13;
                        if (n17 == 0) {
                            n14 = n11;
                        }
                    }
                    if (n12 != 0) {
                        int n18 = uV_3.J(n13);
                        ++n13;
                        if (n18 == 0) {
                            n14 = n12;
                        }
                    }
                    nArray2[n8 + e2 * b2] = uV_3.J(yRa.d) == 0 ? n14 : (n14 == AQa.P ? AQa.P : uSa.E);
                }
                n7 = ++n8;
            }
            n6 = ++e2;
        }
        return nArray2;
    }
}

