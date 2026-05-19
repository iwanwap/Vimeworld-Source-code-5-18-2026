/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hG
 *  uKa
 *  vRa
 */
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iq_3 {
    public final hG M;
    private final int k;
    private final List<int[][]> j;
    public boolean J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public iq_3(hG hG2, BufferedImage bufferedImage, int n2, int n3) {
        void b2;
        void a2;
        int[] d2;
        iq_3 c2;
        BufferedImage e2 = bufferedImage;
        iq_3 iq_32 = c2 = this;
        iq_3 iq_33 = c2;
        iq_33.j = new ArrayList<int[][]>();
        iq_32.M = d2;
        iq_32.k = a2;
        d2 = new int[e2.getWidth() * e2.getHeight()];
        Object object = e2;
        ((BufferedImage)object).getRGB(uSa.E, uSa.E, ((BufferedImage)object).getWidth(), e2.getHeight(), d2, uSa.E, e2.getWidth());
        c2.J(d2, (int)b2);
    }

    /*
     * WARNING - void declaration
     */
    private static int[][] J(int[][] nArray, int n2, int n3, int n4) {
        int d2;
        int[][] nArray2 = nArray;
        int[][] nArrayArray = new int[nArray2.length][];
        int n5 = d2 = uSa.E;
        while (n5 < nArray2.length) {
            int[] nArray3 = nArray2[d2];
            if (nArray3 != null) {
                void a2;
                void b2;
                void c2;
                int n6 = d2;
                nArrayArray[n6] = new int[(c2 >> d2) * (b2 >> n6)];
                System.arraycopy(nArray3, (int)(a2 * nArrayArray[d2].length), nArrayArray[d2], uSa.E, nArrayArray[d2].length);
            }
            n5 = ++d2;
        }
        return nArrayArray;
    }

    public void f() {
        iq_3 a2;
        if (a2.k == 0 || !a2.J) {
            return;
        }
        a2.J = uSa.E;
        if ((a2.I += vRa.d) == a2.k) {
            iq_3 iq_32 = a2;
            iq_32.A = (iq_32.A + vRa.d) % a2.j.size();
            a2.I = uSa.E;
            uKa.C((int)iq_32.M.M.J);
            iq_32.J(iq_32.A);
        }
    }

    private void J(int n2) {
        int b2 = n2;
        iq_3 a2 = this;
        gLa.J(a2.j.get(b2), a2.M.k, a2.M.J, a2.M.I, a2.M.j, uSa.E != 0, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public iq_3(hG hG2, we we2, int n2, int n3) {
        void b2;
        void c2;
        void e2;
        void d2;
        int n4 = n3;
        iq_3 a2 = this;
        iq_3 iq_32 = a2;
        a2.j = new ArrayList<int[][]>();
        a2.M = d2;
        a2.k = e2;
        a2.J(c2.E.array(), (int)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int[] nArray, int n2) {
        void a2;
        void b2;
        iq_3 iq_32 = this;
        Object c2 = new int[iq_32.M.M.I + vRa.d][];
        c2[uSa.E] = b2;
        c2 = gLa.J(iq_32.M.M.I, iq_32.M.k, (int[][])c2);
        int n3 = b2 = uSa.E;
        while (n3 < a2) {
            iq_32.j.add(iq_3.J((int[][])c2, iq_32.M.k, iq_32.M.J, b2++));
            n3 = b2;
        }
    }

    public boolean J() {
        iq_3 a2;
        if (a2.j.size() > vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        iq_3 a2;
        iq_3 iq_32 = a2;
        uKa.C((int)iq_32.M.M.J);
        iq_32.J(uSa.E);
        if (!iq_32.J()) {
            a2.j.clear();
        }
    }
}

