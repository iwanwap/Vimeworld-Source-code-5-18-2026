/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  hw
 *  pua
 *  vRa
 */
public final class XU_3
extends hw {
    private int f(int n2) {
        int b2 = n2;
        XU_3 a2 = this;
        if (b2 >= uqa.g) {
            return uqa.g + (b2 & vRa.d);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        XU_3 xU_3 = this;
        void var5_9 = b2 + uqa.g;
        int e2 = a2 + uqa.g;
        int[] d2 = xU_3.A.J((int)(d2 -= vRa.d), (int)(c2 -= vRa.d), (int)var5_9, e2);
        int[] c2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                XU_3 xU_32 = xU_3;
                XU_3 xU_33 = xU_3;
                int n9 = xU_33.f(d2[n8 + uSa.E + (e2 + vRa.d) * var5_9]);
                int n10 = xU_33.f(d2[n8 + uqa.g + (e2 + vRa.d) * var5_9]);
                int n11 = xU_3.f(d2[n8 + vRa.d + (e2 + uSa.E) * var5_9]);
                int n12 = xU_32.f(d2[n8 + vRa.d + (e2 + uqa.g) * var5_9]);
                int n13 = xU_32.f(d2[n8 + vRa.d + (e2 + vRa.d) * var5_9]);
                c2[n8 + e2 * b2] = n13 == n9 && n13 == n11 && n13 == n10 && n13 == n12 ? pua.o : Jy.n.Ka;
                n7 = ++n8;
            }
            n6 = ++e2;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public XU_3(long l2, hw hw2) {
        void b2;
        XU_3 c2 = hw2;
        XU_3 a2 = this;
        super((long)b2);
        a2.A = c2;
    }
}

