/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hw
 *  vRa
 */
public final class gv_2
extends hw {
    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        gv_2 gv_22 = this;
        void var5_7 = d2 - vRa.d;
        void var6_9 = c2 - vRa.d;
        void var7_11 = b2 + uqa.g;
        int n6 = a2 + uqa.g;
        int[] nArray = gv_22.A.J((int)var5_7, (int)var6_9, (int)var7_11, n6);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n7 = n6 = uSa.E;
        while (n7 < a2) {
            int n8 = uSa.E;
            while (n8 < b2) {
                int n9;
                int e2 = nArray[n9 + vRa.d + (n6 + vRa.d) * var7_11];
                gv_22.J(n9 + d2, n6 + c2);
                if (e2 == 0) {
                    nArray2[n9 + n6 * b2] = uSa.E;
                } else {
                    int[] nArray3;
                    e2 = gv_22.J(uua.p);
                    if (e2 == 0) {
                        e2 = AQa.P;
                        nArray3 = nArray2;
                    } else if (e2 <= vRa.d) {
                        e2 = yRa.d;
                        nArray3 = nArray2;
                    } else {
                        e2 = vRa.d;
                        nArray3 = nArray2;
                    }
                    nArray3[n9 + n6 * b2] = e2;
                }
                n8 = ++n9;
            }
            n7 = ++n6;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public gv_2(long l2, hw hw2) {
        void b2;
        gv_2 c2 = hw2;
        gv_2 a2 = this;
        super((long)b2);
        a2.A = c2;
    }
}

