/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hw
 */
public final class sW
extends hw {
    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int e2;
        void a2;
        void b2;
        void c2;
        void d2;
        sW sW2 = this;
        int[] nArray = sW2.A.J((int)d2, (int)c2, (int)b2, (int)a2);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                int n9 = n8;
                sW2.J(n9 + d2, e2 + c2);
                nArray2[n9 + e2 * b2] = nArray[n8 + e2 * b2] > 0 ? sW2.J(MTa.K) + uqa.g : uSa.E;
                n7 = ++n8;
            }
            n6 = ++e2;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public sW(long l2, hw hw2) {
        void b2;
        sW c2 = hw2;
        sW a2 = this;
        super((long)b2);
        a2.A = c2;
    }
}

