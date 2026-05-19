/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gA_1 {
    private ze[] A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        int c2;
        gA_1 gA_12 = this;
        int n4 = c2 = uSa.E;
        while (n4 < gA_12.A.length) {
            void a2;
            void b2;
            if (gA_12.A[c2].J((int)b2, (int)a2)) {
                return vRa.d != 0;
            }
            n4 = ++c2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public gA_1(int n2, ze[] zeArray) {
        void b2;
        ze[] c2 = zeArray;
        ze[] a2 = this;
        a2.I = b2;
        a2.A = c2;
    }

    public int[] J() {
        int n2;
        gA_1 gA_12 = this;
        Object a2 = new int[gA_12.A.length];
        int n3 = n2 = uSa.E;
        while (n3 < ((Object)a2).length) {
            int n4 = n2++;
            a2[n4] = gA_12.A[n4].J();
            n3 = n2;
        }
        return a2;
    }

    public int J() {
        gA_1 a2;
        return a2.I;
    }
}

