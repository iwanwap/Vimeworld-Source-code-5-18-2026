/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  aAa
 *  pua
 *  vRa
 */
public final class aAa_3 {
    private final int E;
    public float m;
    public final int C;
    public int i;
    public float M;
    public final int k;
    public float j;
    public aAa J;
    public boolean A;
    public final int I;

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3, int n4) {
        int a2;
        void b2;
        int c2 = n4;
        return b2 & osa.Ja | (a2 & BQa.h) << Yqa.i | (c2 & BQa.h) << osa.c | ((a2 = n2) < 0 ? ypa.L : uSa.E) | (c2 < 0 ? CRa.Y : uSa.E);
    }

    public float f(aAa aAa2) {
        aAa_3 b22 = aAa2;
        aAa_3 a2 = this;
        aAa_3 aAa_32 = b22;
        float b22 = aAa_32.I - a2.I;
        float f2 = aAa_32.C - a2.C;
        float f3 = aAa_32.k - a2.k;
        float f4 = b22;
        float f5 = f2;
        float f6 = f3;
        return f4 * f4 + f5 * f5 + f6 * f6;
    }

    /*
     * WARNING - void declaration
     */
    public aAa_3(int n2, int n3, int n4) {
        void b2;
        void c2;
        aAa_3 a2;
        int d2 = n4;
        aAa_3 aAa_32 = a2 = this;
        aAa_3 aAa_33 = a2;
        a2.i = pua.o;
        aAa_33.I = c2;
        aAa_33.C = b2;
        aAa_32.k = d2;
        aAa_32.E = aAa_3.J((int)c2, (int)b2, d2);
    }

    public boolean J() {
        aAa_3 a2;
        if (a2.i >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String toString() {
        aAa_3 a2;
        return a2.I + TOa.n + a2.C + TOa.n + a2.k;
    }

    public int hashCode() {
        aAa_3 a2;
        return a2.E;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        aAa_3 a2 = this;
        if (!(b2 instanceof aAa_3)) {
            return uSa.E != 0;
        }
        b2 = (aAa_3)b2;
        if (a2.E == ((aAa_3)b2).E && a2.I == ((aAa_3)b2).I && a2.C == ((aAa_3)b2).C && a2.k == ((aAa_3)b2).k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float J(aAa aAa2) {
        aAa_3 b22 = aAa2;
        aAa_3 a2 = this;
        aAa_3 aAa_32 = b22;
        float b22 = aAa_32.I - a2.I;
        float f2 = aAa_32.C - a2.C;
        float f3 = aAa_32.k - a2.k;
        float f4 = b22;
        float f5 = f2;
        float f6 = f3;
        return Oz.J((float)(f4 * f4 + f5 * f5 + f6 * f6));
    }
}

