/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ypa
 *  vRa
 */
public final class TZ_3 {
    private final int J;
    public final byte[] A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public TZ_3(byte[] byArray, int n2) {
        void b2;
        TZ_3 a2;
        int c2 = n2;
        TZ_3 tZ_3 = a2 = this;
        a2.A = b2;
        tZ_3.J = c2;
        tZ_3.I = c2 + AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3, int n4) {
        void a2;
        int c2;
        int d2 = n3;
        TZ_3 b2 = this;
        c2 = c2 << b2.I | a2 << b2.J | d2;
        d2 = c2 >> vRa.d;
        if ((c2 & vRa.d) == 0) {
            return b2.A[d2] & Ypa.A;
        }
        return b2.A[d2] >> AQa.P & Ypa.A;
    }
}

