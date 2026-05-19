/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Kpa
 *  XTa
 *  kta
 *  pqa
 *  pua
 *  vPa
 *  vRa
 */
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Yka_3 {
    public final int M;
    public final DZ k;
    public int[] j;
    private int[] J;
    private KLa A;
    private static final String I = "CL_00002512";

    public boolean J() {
        Yka_3 a2;
        if (a2.M != pua.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private static int[] f(int[] nArray) {
        int a2;
        int[] nArray2 = nArray;
        int n2 = nArray2.length / AQa.P;
        int n3 = n2 * uqa.g;
        int[] nArray3 = new int[n3 * AQa.P];
        int n4 = a2 = uSa.E;
        while (n4 < AQa.P) {
            System.arraycopy(nArray2, a2 * n2, nArray3, a2++ * n3, n2);
            n4 = a2;
        }
        return nArray3;
    }

    /*
     * WARNING - void declaration
     */
    public Yka_3(int[] nArray, int n2, DZ dZ2) {
        void b2;
        void c2;
        Yka_3 a2;
        Object d2 = dZ2;
        Yka_3 yka_3 = a2 = this;
        a2.A = null;
        yka_3.J = null;
        yka_3.j = c2;
        a2.M = b2;
        a2.k = d2;
        a2.J();
    }

    private static KLa J(int[] nArray) {
        int a22;
        int[] nArray2 = nArray;
        float f2 = pqa.r;
        float f3 = pqa.r;
        float f4 = JPa.N;
        float f5 = JPa.N;
        int n2 = nArray2.length / AQa.P;
        int n3 = a22 = uSa.E;
        while (n3 < AQa.P) {
            int n4 = a22 * n2;
            float f6 = Float.intBitsToFloat(nArray2[n4 + AQa.P]);
            float f7 = Float.intBitsToFloat(nArray2[n4 + AQa.P + vRa.d]);
            f2 = Math.min(f2, f6);
            f3 = Math.min(f3, f7);
            f4 = Math.max(f4, f6);
            f5 = Math.max(f5, f7);
            n3 = ++a22;
        }
        float a22 = (f2 + f4) / kta.v;
        float f8 = (f3 + f5) / kta.v;
        KLa kLa2 = Kpa.J().J().J(a22, f8);
        return kLa2;
    }

    public DZ J() {
        Yka_3 a2;
        return a2.k;
    }

    public int[] f() {
        Yka_3 a2;
        if (a2.J == null) {
            a2.J = Yka_3.J(a2.J(), a2.J());
        }
        return a2.J;
    }

    public KLa J() {
        Yka_3 a2;
        if (a2.A == null) {
            a2.A = Yka_3.J(a2.J());
        }
        return a2.A;
    }

    private static int[] J(int[] nArray) {
        int a2;
        int[] nArray2 = nArray;
        int n2 = nArray2.length / AQa.P;
        int n3 = n2 / uqa.g;
        int[] nArray3 = new int[n3 * AQa.P];
        int n4 = a2 = uSa.E;
        while (n4 < AQa.P) {
            System.arraycopy(nArray2, a2 * n2, nArray3, a2++ * n3, n3);
            n4 = a2;
        }
        return nArray3;
    }

    /*
     * WARNING - void declaration
     */
    public Yka_3(int[] nArray, int n2, DZ dZ2, KLa kLa2) {
        KLa e2;
        void b2;
        void c2;
        void d2;
        Yka_3 a2;
        Yka_3 yka_3 = kLa3;
        KLa kLa3 = kLa2;
        Yka_3 yka_32 = a2 = yka_3;
        Yka_3 yka_33 = a2;
        yka_33.A = null;
        yka_33.J = null;
        yka_32.j = d2;
        yka_32.M = c2;
        a2.k = b2;
        a2.A = e2;
        a2.J();
    }

    private void J() {
        Yka_3 a2;
        if (Config.h()) {
            if (a2.j.length == EPa.O) {
                a2.j = Yka_3.f(a2.j);
                return;
            }
        } else if (a2.j.length == Upa.D) {
            a2.j = Yka_3.J(a2.j);
        }
    }

    public int J() {
        Yka_3 a2;
        return a2.M;
    }

    public int[] J() {
        Yka_3 a2;
        Yka_3 yka_3 = a2;
        yka_3.J();
        return yka_3.j;
    }

    /*
     * WARNING - void declaration
     */
    private static int[] J(int[] nArray, KLa kLa2) {
        int n2;
        void a2;
        int[] nArray2 = nArray;
        int[] nArray3 = (int[])nArray2.clone();
        void v0 = a2;
        int cfr_ignored_0 = a2.c / v0.J();
        int cfr_ignored_1 = v0.k / a2.f();
        int n3 = nArray3.length / AQa.P;
        int n4 = n2 = uSa.E;
        while (n4 < AQa.P) {
            int b2 = n2 * n3;
            int[] nArray4 = nArray3;
            float f2 = Float.intBitsToFloat(nArray3[b2 + AQa.P]);
            float f3 = Float.intBitsToFloat(nArray4[b2 + AQa.P + vRa.d]);
            f2 = a2.J(f2);
            f3 = a2.f(f3);
            nArray3[b2 + AQa.P] = Float.floatToRawIntBits(f2);
            nArray4[b2 + AQa.P + vRa.d] = Float.floatToRawIntBits(f3);
            n4 = ++n2;
        }
        return nArray3;
    }

    public String toString() {
        Yka_3 a2;
        return new StringBuilder().insert(3 & 4, hQa.o).append(a2.j.length / XTa.W).append(vPa.X).append(a2.M).append(gsa.ja).append((Object)a2.k).append(EPa.a).append(a2.A).toString();
    }
}

