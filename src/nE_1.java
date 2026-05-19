/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pua
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nE_1 {
    private int m;
    private int C;
    private int i;
    private byte[][][] M;
    private byte[] k;
    private int j;
    private int J;
    private int A;
    private int I;

    public void J() {
        int n2;
        nE_1 nE_12 = this;
        int n3 = n2 = uSa.E;
        while (n3 < nE_12.j) {
            byte[][] byArray = nE_12.M[n2];
            int n4 = uSa.E;
            while (n4 < nE_12.I) {
                int a2;
                byte[] byArray2 = byArray[a2];
                int n5 = uSa.E;
                while (n5 < nE_12.J) {
                    int n6;
                    byArray2[n6++] = pua.o;
                    n5 = n6;
                }
                n4 = ++a2;
            }
            n3 = ++n2;
        }
    }

    public void J(byte by2) {
        byte b22 = by2;
        nE_1 a2 = this;
        try {
            nE_1 nE_12 = a2;
            nE_12.k[nE_12.C] = b22;
            return;
        }
        catch (Exception b22) {
            b22.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public byte J(int n2, int n3, int n4) {
        int d22 = n2;
        nE_1 c2 = this;
        try {
            void a2;
            void b2;
            c2.k = c2.M[d22 - c2.i][b2 - c2.A];
            c2.C = a2 - c2.m;
            return c2.k[c2.C];
        }
        catch (ArrayIndexOutOfBoundsException d22) {
            d22.printStackTrace();
            return (byte)pua.o;
        }
    }

    /*
     * WARNING - void declaration
     */
    public nE_1(int n2, int n3, int n4) {
        void b2;
        void c2;
        nE_1 a2;
        int d2 = n4;
        nE_1 nE_12 = a2 = this;
        a2.j = yOa.B;
        a2.I = XOa.h;
        a2.J = yOa.B;
        a2.i = uSa.E;
        nE_12.A = uSa.E;
        nE_12.m = uSa.E;
        nE_12.M = null;
        nE_1 nE_13 = a2;
        nE_1 nE_14 = a2;
        nE_1 nE_15 = a2;
        nE_15.k = null;
        nE_15.C = uSa.E;
        nE_14.j = c2;
        nE_14.I = b2;
        nE_13.J = d2;
        nE_13.M = new byte[c2][b2][d2];
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        nE_1 a2 = this;
        a2.i = c2;
        a2.A = b2;
        a2.m = d2;
        a2.J();
    }
}

