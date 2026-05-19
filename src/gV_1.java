/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.util.Arrays;

public final class gV_1 {
    public Class[] A;
    public String I;

    public boolean equals(Object object) {
        int n2;
        Object b2 = object;
        gV_1 a2 = this;
        if (!(b2 instanceof gV_1)) {
            return uSa.E != 0;
        }
        b2 = (gV_1)b2;
        if (a2.A.length != ((gV_1)b2).A.length || !((gV_1)b2).I.equals(a2.I)) {
            return uSa.E != 0;
        }
        int n3 = n2 = uSa.E;
        while (n3 < a2.A.length) {
            if (a2.A[n2] != ((gV_1)b2).A[n2]) {
                return uSa.E != 0;
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public gV_1(String string, Class[] classArray) {
        void b2;
        Class[] c2 = classArray;
        Class[] a2 = this;
        a2.I = b2;
        a2.A = c2;
    }

    public int hashCode() {
        gV_1 gV_12 = this;
        int a2 = gV_12.I.hashCode();
        a2 = tua.U * a2 + Arrays.hashCode(gV_12.A);
        return a2;
    }
}

