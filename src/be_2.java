/*
 * Decompiled with CFR 0.152.
 */
public final class be_2 {
    private static final int A = 4096;
    private static final Integer[] I = be_2.J(mPa.H);

    public static Integer valueOf(int a2) {
        if (a2 >= 0 && a2 < mPa.H) {
            return I[a2];
        }
        return new Integer(a2);
    }

    public be_2() {
        be_2 a2;
    }

    private static Integer[] J(int n2) {
        int a2;
        int n3 = n2;
        Integer[] integerArray = new Integer[n3];
        int n4 = a2 = uSa.E;
        while (n4 < n3) {
            int n5 = a2;
            int n6 = a2++;
            integerArray[n6] = new Integer(n6);
            n4 = a2;
        }
        return integerArray;
    }
}

