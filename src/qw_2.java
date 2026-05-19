/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gV
 *  vRa
 */
import java.util.Arrays;

public final class qw_2 {
    public Class[] I;

    public qw_2(Class[] classArray) {
        Class[] b2 = classArray;
        Class[] a2 = this;
        a2.I = b2;
    }

    public boolean equals(Object object) {
        int n2;
        Object b2 = object;
        qw_2 a2 = this;
        if (!(b2 instanceof gV)) {
            return uSa.E != 0;
        }
        b2 = (gV)b2;
        if (a2.I.length != ((gV)b2).A.length) {
            return uSa.E != 0;
        }
        int n3 = n2 = uSa.E;
        while (n3 < a2.I.length) {
            if (a2.I[n2] != ((gV)b2).A[n2]) {
                return uSa.E != 0;
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public int hashCode() {
        qw_2 a2;
        return Arrays.hashCode(a2.I);
    }
}

