/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  hw
 *  vRa
 */
public final class rW_1
extends hw {
    public rW_1(long a2) {
        super(a2);
        rW_1 b2;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void c2;
        void d2;
        int n6;
        void a2;
        int e2 = n4;
        rW_1 b2 = this;
        int[] nArray = iW.J(e2 * a2);
        int n7 = n6 = uSa.E;
        while (n7 < a2) {
            int n8 = uSa.E;
            while (n8 < e2) {
                int n9;
                int n10 = n9;
                b2.J((long)(d2 + n10), (long)(c2 + n6));
                nArray[n10 + n6 * e2] = b2.J(NTa.C) == 0 ? vRa.d : uSa.E;
                n8 = ++n9;
            }
            n7 = ++n6;
        }
        if (d2 > -e2 && d2 <= 0 && c2 > -a2 && c2 <= 0) {
            nArray[-d2 + -c2 * e2] = vRa.d;
        }
        return nArray;
    }
}

