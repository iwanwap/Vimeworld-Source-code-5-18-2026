/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  yQa
 */
public final class HX_3 {
    private static final Integer[] I = new Integer[yQa.j];

    public HX_3() {
        HX_3 a2;
    }

    static {
        int n2 = uSa.E;
        int n3 = I.length;
        int n4 = n2;
        while (n4 < n3) {
            int n5 = n2++;
            HX_3.I[n5] = n5;
            n4 = n2;
        }
    }

    public static Integer J(int a2) {
        if (a2 > 0 && a2 < I.length) {
            return I[a2];
        }
        return a2;
    }
}

