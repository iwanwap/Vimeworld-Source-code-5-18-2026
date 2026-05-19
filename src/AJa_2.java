/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cla
 *  ERa
 *  Gg
 *  Oz
 *  SA
 *  ZJa
 *  vRa
 */
public final class AJa_2 {
    public int i;
    public final ZJa M;
    private static final String k = "CL_00002531";
    public Cla[] j;
    public int J;
    public final Gg A;
    public int I;

    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int a2;
        int b2;
        int c2;
        int d2;
        int e2;
        int f2;
        AJa_2 aJa_2 = this;
        f2 = Oz.l((int)f2, (int)ERa.C);
        e2 = Oz.l((int)e2, (int)ERa.C);
        d2 = Oz.l((int)d2, (int)ERa.C);
        c2 = Oz.l((int)c2, (int)ERa.C);
        b2 = Oz.l((int)b2, (int)ERa.C);
        a2 = Oz.l((int)a2, (int)ERa.C);
        int n8 = f2 = f2;
        while (n8 <= c2) {
            int n9 = f2 % aJa_2.J;
            if (n9 < 0) {
                n9 += aJa_2.J;
            }
            int n10 = e2;
            while (n10 <= b2) {
                int n11;
                int n12 = n11 % aJa_2.I;
                if (n12 < 0) {
                    n12 += aJa_2.I;
                }
                int n13 = d2;
                while (n13 <= a2) {
                    int n14;
                    int g2 = n14 % aJa_2.i;
                    if (g2 < 0) {
                        g2 += aJa_2.i;
                    }
                    g2 = (g2 * aJa_2.I + n12) * aJa_2.J + n9;
                    aJa_2.j[g2].J(vRa.d != 0);
                    n13 = ++n14;
                }
                n10 = ++n11;
            }
            n8 = ++f2;
        }
    }

    public void J() {
        int a2;
        AJa_2 aJa_2 = this;
        Cla[] claArray = aJa_2.j;
        int n2 = aJa_2.j.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            claArray[a2++].f();
            n3 = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3) {
        int n2;
        void a22;
        void b22;
        AJa_2 aJa_2 = this;
        int b22 = Oz.f((double)b22) - Yqa.i;
        int n3 = Oz.f((double)a22) - Yqa.i;
        int a22 = aJa_2.J * ERa.C;
        int n4 = n2 = uSa.E;
        while (n4 < aJa_2.J) {
            int n5 = aJa_2.J(b22, a22, n2);
            int n6 = uSa.E;
            while (n6 < aJa_2.i) {
                int n7;
                int n8 = aJa_2.J(n3, a22, n7);
                int n9 = uSa.E;
                while (n9 < aJa_2.I) {
                    int n10;
                    int c2 = n10 * ERa.C;
                    Cla cla2 = aJa_2.j[(n7 * aJa_2.I + n10) * aJa_2.J + n2];
                    XF xF2 = cla2.J();
                    if (!(xF2.getX() == n5 && xF2.getY() == c2 && xF2.getZ() == n8 || (c2 = new XF(n5, c2, n8)).equals((Object)cla2.J()))) {
                        cla2.J(c2);
                    }
                    n9 = ++n10;
                }
                n6 = ++n7;
            }
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(SA sA2) {
        int n2;
        AJa_2 aJa_2;
        AJa_2 aJa_22 = aJa_2 = this;
        aJa_2.j = new Cla[aJa_22.J * aJa_22.I * aJa_2.i];
        int n3 = uSa.E;
        int n4 = n2 = uSa.E;
        while (n4 < aJa_2.J) {
            int n5 = uSa.E;
            while (n5 < aJa_2.I) {
                int b2;
                int n6 = uSa.E;
                while (n6 < aJa_2.i) {
                    void a2;
                    int n7;
                    int n8 = (n7 * aJa_2.I + b2) * aJa_2.J + n2;
                    XF xF2 = new XF(n2 * ERa.C, b2 * ERa.C, n7 * ERa.C);
                    AJa_2 aJa_23 = aJa_2;
                    Cla cla2 = a2.J(aJa_23.A, aJa_23.M, xF2, n3);
                    ++n3;
                    aJa_2.j[n8] = cla2;
                    n6 = ++n7;
                }
                n5 = ++b2;
            }
            n4 = ++n2;
        }
    }

    public Cla J(XF xF2) {
        Object b22 = xF2;
        AJa_2 a2 = this;
        Object object = b22;
        int b22 = object.getX() >> AQa.P;
        int n2 = object.getY() >> AQa.P;
        int n3 = object.getZ() >> AQa.P;
        if (n2 >= 0 && n2 < a2.I) {
            if ((b22 %= a2.J) < 0) {
                b22 += a2.J;
            }
            if ((n3 %= a2.i) < 0) {
                n3 += a2.i;
            }
            b22 = (n3 * a2.I + n2) * a2.J + b22;
            return a2.j[b22];
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3, int n4) {
        void a2;
        void b2;
        int d2 = n2;
        AJa_2 c2 = this;
        if ((d2 = (a2 *= ERa.C) - d2 + b2 / uqa.g) < 0) {
            d2 -= b2 - vRa.d;
        }
        return (int)(a2 - d2 / b2 * b2);
    }

    /*
     * WARNING - void declaration
     */
    public AJa_2(Gg gg2, int n2, ZJa zJa2, SA sA2) {
        AJa_2 e2;
        void c2;
        void d2;
        void b2;
        AJa_2 a2;
        AJa_2 aJa_2 = aJa_22;
        AJa_2 aJa_22 = sA2;
        AJa_2 aJa_23 = a2 = aJa_2;
        AJa_2 aJa_24 = a2;
        aJa_24.M = b2;
        aJa_24.A = d2;
        aJa_23.J((int)c2);
        aJa_23.J((SA)e2);
    }

    public void J(int n2) {
        int b2 = n2;
        AJa_2 a2 = this;
        b2 = b2 * uqa.g + vRa.d;
        AJa_2 aJa_2 = a2;
        aJa_2.J = b2;
        aJa_2.I = ERa.C;
        aJa_2.i = b2;
    }
}

