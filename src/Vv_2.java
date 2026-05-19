/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  hw
 *  vRa
 */
public final class Vv_2
extends hw {
    /*
     * WARNING - void declaration
     */
    public Vv_2(long l2, hw hw2) {
        void b2;
        Vv_2 c2 = hw2;
        Vv_2 a2 = this;
        super((long)b2);
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int n6;
        void a2;
        void b2;
        void c2;
        void d2;
        Vv_2 vv_2 = this;
        int[] nArray = vv_2.A.J((int)(d2 - vRa.d), (int)(c2 - vRa.d), (int)(b2 + uqa.g), (int)(a2 + uqa.g));
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n7 = n6 = uSa.E;
        while (n7 < a2) {
            int n8 = uSa.E;
            while (n8 < b2) {
                int e2;
                Vv_2 vv_22 = vv_2;
                vv_22.J(e2 + d2, n6 + c2);
                int n9 = nArray[e2 + vRa.d + (n6 + vRa.d) * (b2 + uqa.g)];
                nArray2[e2 + n6 * b2] = vv_22.J(KSa.x) == 0 ? (n9 == Jy.Z.Ka ? Jy.Z.Ka + XOa.h : n9) : n9;
                n8 = ++e2;
            }
            n7 = ++n6;
        }
        return nArray2;
    }
}

