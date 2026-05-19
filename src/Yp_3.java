/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZQ
 */
public final class Yp_3 {
    public int A;
    public ZQ[] I;

    /*
     * WARNING - void declaration
     */
    public Yp_3(Object ... objectArray) {
        int b2;
        void a2;
        Yp_3 yp_3 = this;
        yp_3.I = new ZQ[((void)a2).length];
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            if (a2[b2] instanceof ZQ) {
                int n3 = b2;
                yp_3.I[n3] = (ZQ)a2[n3];
            } else {
                yp_3.I[b2] = new ZQ(a2[b2].toString());
            }
            n2 = ++b2;
        }
    }
}

