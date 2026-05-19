/*
 * Decompiled with CFR 0.152.
 */
public final class ff {
    public static int J(int[] nArray) {
        int a2;
        int[] nArray2 = nArray;
        if (nArray2.length <= 0) {
            return uSa.E;
        }
        int n2 = uSa.E;
        int n3 = a2 = uSa.E;
        while (n3 < nArray2.length) {
            int n4 = nArray2[a2];
            n2 += n4;
            n3 = ++a2;
        }
        a2 = n2 / nArray2.length;
        return a2;
    }

    public ff() {
        ff a2;
    }
}

