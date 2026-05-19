/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Tz
 *  Waa
 *  eAa
 *  vRa
 *  waa
 */
public final class JCa_2
extends eAa {
    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        Sx d2 = sx2;
        JCa_2 a2 = this;
        Sx sx3 = d2;
        void v1 = c2;
        sx3.J((Mda)v1);
        sx3.J(Tz.H[eAa.J((eAa)a2)]);
        return v1;
    }

    public static boolean f(Waa waa2) {
        int a2;
        Waa waa3 = waa2;
        if (waa3 == null) {
            return uSa.E != 0;
        }
        if (!waa3.J(sra.A, WOa.fa)) {
            return uSa.E != 0;
        }
        waa waa4 = waa3.J(sra.A, Yqa.i);
        int n2 = a2 = uSa.E;
        while (n2 < waa4.J()) {
            String string = waa4.J(a2);
            if (string == null) {
                return uSa.E != 0;
            }
            if (string.length() > BQa.h) {
                return uSa.E != 0;
            }
            n2 = ++a2;
        }
        return vRa.d != 0;
    }

    public JCa_2() {
        JCa_2 a2;
        JCa_2 jCa_2 = a2;
        jCa_2.J(vRa.d);
    }
}

