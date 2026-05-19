/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pua
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class he_1 {
    private int m;
    private int[][][] C;
    private int i;
    private int M;
    private int[] k;
    private int j;
    private int J;
    private int A;
    private int I;

    public void J() {
        int n2;
        he_1 he_12 = this;
        int n3 = n2 = uSa.E;
        while (n3 < he_12.A) {
            int[][] nArray = he_12.C[n2];
            int n4 = uSa.E;
            while (n4 < he_12.I) {
                int a2;
                int[] nArray2 = nArray[a2];
                int n5 = uSa.E;
                while (n5 < he_12.i) {
                    int n6;
                    nArray2[n6++] = pua.o;
                    n5 = n6;
                }
                n4 = ++a2;
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        he_1 a2 = this;
        a2.j = c2;
        a2.m = b2;
        a2.M = d2;
        a2.J();
    }

    public void J(int n2) {
        int b22 = n2;
        he_1 a2 = this;
        try {
            he_1 he_12 = a2;
            he_12.k[he_12.J] = b22;
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
    public he_1(int n2, int n3, int n4) {
        void b2;
        void c2;
        he_1 a2;
        int d2 = n4;
        he_1 he_12 = a2 = this;
        a2.A = yOa.B;
        a2.I = XOa.h;
        a2.i = yOa.B;
        a2.j = uSa.E;
        he_12.m = uSa.E;
        he_12.M = uSa.E;
        he_12.C = null;
        he_1 he_13 = a2;
        he_1 he_14 = a2;
        he_1 he_15 = a2;
        he_15.k = null;
        he_15.J = uSa.E;
        he_14.A = c2;
        he_14.I = b2;
        he_13.i = d2;
        he_13.C = new int[c2][b2][d2];
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3, int n4) {
        int d22 = n2;
        he_1 c2 = this;
        try {
            void a2;
            void b2;
            c2.k = c2.C[d22 - c2.j][b2 - c2.m];
            c2.J = a2 - c2.M;
            return c2.k[c2.J];
        }
        catch (ArrayIndexOutOfBoundsException d22) {
            d22.printStackTrace();
            return pua.o;
        }
    }
}

