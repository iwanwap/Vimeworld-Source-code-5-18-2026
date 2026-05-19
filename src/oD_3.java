/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Oz
 *  TPa
 *  Yka
 *  lPa
 *  vRa
 */
import java.util.IdentityHashMap;
import java.util.Map;
import optifine.Config;

public final class oD_3 {
    public int J;
    private Map[] A;
    public boolean I;

    /*
     * WARNING - void declaration
     */
    private boolean J(Yka yka) {
        int n2;
        void a22;
        oD_3 oD_32 = this;
        void v0 = a22;
        KLa kLa2 = v0.J();
        float a22 = kLa2.l();
        float f2 = kLa2.C();
        float f3 = (f2 - a22) / Fpa.q;
        float f4 = kLa2.J();
        float f5 = kLa2.f();
        float f6 = (f5 - f4) / Fpa.q;
        int[] nArray = v0.J();
        int n3 = nArray.length / AQa.P;
        int n4 = n2 = uSa.E;
        while (n4 < AQa.P) {
            int b22 = n2 * n3;
            float f7 = Float.intBitsToFloat(nArray[b22 + AQa.P]);
            float b22 = Float.intBitsToFloat(nArray[b22 + AQa.P + vRa.d]);
            if (!oD_32.J(f7, a22, f3) && !oD_32.J(f7, f2, f3)) {
                return uSa.E != 0;
            }
            if (!oD_32.J(b22, f4, f6) && !oD_32.J(b22, f5, f6)) {
                return uSa.E != 0;
            }
            n4 = ++n2;
        }
        return vRa.d != 0;
    }

    public boolean J() {
        oD_3 a2;
        if (a2.J != uqa.g && a2.J != AQa.P) {
            return a2.I;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int[] J(int[] nArray, int n2, boolean bl) {
        int n3;
        void a2;
        void c2;
        int d2 = n2;
        oD_3 b2 = this;
        int[] nArray2 = (int[])c2.clone();
        d2 = AQa.P - d2;
        if (a2 != false) {
            d2 += 3;
        }
        d2 %= AQa.P;
        int n4 = nArray2.length / AQa.P;
        int n5 = n3 = uSa.E;
        while (n5 < AQa.P) {
            int n6 = n3 * n4;
            int n7 = d2 * n4;
            nArray2[n7 + AQa.P] = c2[n6 + AQa.P];
            nArray2[n7 + AQa.P + vRa.d] = c2[n6 + AQa.P + vRa.d];
            if (a2 != false) {
                if (--d2 < 0) {
                    d2 = yRa.d;
                }
            } else if (++d2 > yRa.d) {
                d2 = uSa.E;
            }
            n5 = ++n3;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    private Yka f(Yka yka, int n2, boolean bl) {
        void a2;
        void b2;
        void c2;
        oD_3 oD_32 = this;
        void v0 = c2;
        Object d2 = v0.J();
        int n3 = v0.J();
        DZ dZ2 = v0.J();
        KLa kLa2 = v0.J();
        if (!oD_32.J((Yka)c2)) {
            return c2;
        }
        d2 = oD_32.J((int[])d2, (int)b2, (boolean)a2);
        return new Yka((int[])d2, n3, dZ2, kLa2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        oD_3 a2 = this;
        if (Oz.l((float)(c2 - b2)) < d2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public oD_3(String string) {
        String b2 = string;
        oD_3 a2 = this;
        a2.J = vRa.d;
        a2.I = uSa.E;
        a2.A = new Map[Yqa.i];
        if (b2.equals(TPa.w)) {
            a2.J = AQa.P;
            return;
        }
        if (b2.equals(WRa.Ga)) {
            a2.J = uqa.g;
            return;
        }
        if (b2.equals(eta.T)) {
            a2.I = vRa.d;
            return;
        }
        if (b2.equals(lPa.W)) {
            oD_3 oD_32 = a2;
            oD_32.J = AQa.P;
            oD_32.I = vRa.d;
            return;
        }
        if (b2.equals(Nra.fa)) {
            oD_3 oD_33 = a2;
            oD_33.J = uqa.g;
            oD_33.I = vRa.d;
            return;
        }
        Config.J(new StringBuilder().insert(3 & 4, Jsa.A).append(b2).toString());
    }

    /*
     * WARNING - void declaration
     */
    public synchronized Yka J(Yka yka, int n2, boolean bl) {
        void c2;
        void a2;
        void b2;
        oD_3 oD_32 = this;
        int d22 = b2;
        if (a2 != false) {
            d22 = b2 | AQa.P;
        }
        if (d22 > 0 && d22 < oD_32.A.length) {
            Yka d22;
            IdentityHashMap<void, Yka> identityHashMap = oD_32.A[d22];
            if (identityHashMap == null) {
                oD_32.A[d22] = identityHashMap = new IdentityHashMap<void, Yka>(vRa.d);
            }
            if ((d22 = (Yka)identityHashMap.get(c2)) == null) {
                d22 = oD_32.f((Yka)c2, (int)b2, (boolean)a2);
                identityHashMap.put(c2, d22);
            }
            return d22;
        }
        return c2;
    }
}

