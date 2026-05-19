/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QSa
 *  Ypa
 *  pqa
 *  pua
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wX_1 {
    private final byte[] I;

    public int f(int n2) {
        int b2 = n2;
        wX_1 a2 = this;
        return a2.I[b2 >> vRa.d] >>> ((b2 & vRa.d) << uqa.g) & Ypa.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n6 = n5;
        wX_1 a2 = this;
        a2.J(wX_1.f((int)d2, (int)c2, (int)b2), (int)e2);
    }

    private int J(int n2) {
        int b2 = n2;
        wX_1 a2 = this;
        return b2 >> vRa.d;
    }

    private boolean J(int n2) {
        int b2 = n2;
        wX_1 a2 = this;
        if ((b2 & vRa.d) == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(int n2, int n3) {
        int a2;
        int c2 = n2;
        wX_1 b2 = this;
        int n4 = (c2 & vRa.d) << uqa.g;
        wX_1 wX_12 = b2;
        a2 = wX_12.I[c2 >>= vRa.d] & (Ypa.A << n4 ^ pua.o) | (a2 & Ypa.A) << n4;
        wX_12.I[c2] = (byte)a2;
    }

    public byte[] J() {
        wX_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    private static int f(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        return b2 << Yqa.i | c2 << AQa.P | a2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        wX_1 a2 = this;
        return a2.f(wX_1.f((int)c2, (int)b2, d2));
    }

    public wX_1() {
        wX_1 a2;
        a2.I = new byte[QSa.ba];
    }

    public wX_1(byte[] byArray) {
        Object b2 = byArray;
        wX_1 a2 = this;
        Object object = b2;
        a2.I = (byte[])object;
        if (((Object)object).length != QSa.ba) {
            throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, pqa.U).append(((Object)b2).length).toString());
        }
    }
}

