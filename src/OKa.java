/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class OKa
implements Callable {
    public final /* synthetic */ int[][] J;
    public final /* synthetic */ KLa A;
    private static final String I = "CL_00001063";

    /*
     * WARNING - void declaration
     */
    public OKa(KLa kLa2, int[][] object) {
        void a2;
        Object b2 = object;
        object = this;
        object.A = a2;
        object.J = (int[][])b2;
    }

    public String J() throws Exception {
        int n2;
        OKa oKa2 = this;
        StringBuilder a2 = new StringBuilder();
        int[][] nArray = oKa2.J;
        int n3 = oKa2.J.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            int[] nArray2 = nArray[n2];
            if (a2.length() > 0) {
                a2.append(TOa.n);
            }
            a2.append(nArray2 == null ? SPa.V : Integer.valueOf(nArray2.length));
            n4 = ++n2;
        }
        return a2.toString();
    }
}

