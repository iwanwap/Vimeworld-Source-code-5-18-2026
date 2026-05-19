/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cRa
 *  pqa
 *  uw
 *  wi
 */
public final class JX_2 {
    private static int[] I = new int[opa.w];

    public JX_2() {
        JX_2 a2;
    }

    public static int J(double b2, double a2) {
        int n2 = (int)((oua.i - b2) * pqa.o);
        int n3 = (int)((oua.i - (a2 *= b2)) * pqa.o) << Yqa.i | n2;
        int[] nArray = uw.H ? wi.j : I;
        if (n3 > nArray.length) {
            return cRa.Aa;
        }
        return nArray[n3];
    }

    public static void J(int[] a2) {
        I = a2;
    }
}

