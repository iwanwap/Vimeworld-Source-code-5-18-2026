/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  WZ
 *  hw
 *  vRa
 */
public final class MU
extends hw {
    /*
     * WARNING - void declaration
     */
    public MU(long l2, hw hw2) {
        void b2;
        MU c2 = hw2;
        MU a2 = this;
        super((long)b2);
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void a2;
        void i2;
        void e2;
        void f2;
        void h;
        void b2;
        void c2;
        int n8 = n4;
        MU d2 = this;
        if (!MU.J((int)c2, (int)b2)) {
            return uSa.E != 0;
        }
        void v0 = h;
        h = v0[f2 + vRa.d + (e2 + vRa.d - vRa.d) * (i2 + uqa.g)];
        void var9_12 = v0[f2 + vRa.d + vRa.d + (e2 + vRa.d) * (i2 + uqa.g)];
        void var10_13 = v0[f2 + vRa.d - vRa.d + (e2 + vRa.d) * (i2 + uqa.g)];
        void var11_14 = v0[f2 + vRa.d + (e2 + vRa.d + vRa.d) * (i2 + uqa.g)];
        g[f2 + e2 * i2] = d2.f((int)h, (int)b2) && d2.f((int)var9_12, (int)b2) && d2.f((int)var10_13, (int)b2) && d2.f((int)var11_14, (int)b2) ? c2 : a2;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void a2;
        void i2;
        void e2;
        void f2;
        void h;
        void b2;
        void c2;
        int n8 = n4;
        MU d2 = this;
        if (c2 != b2) {
            return uSa.E != 0;
        }
        void v0 = h;
        h = v0[f2 + vRa.d + (e2 + vRa.d - vRa.d) * (i2 + uqa.g)];
        void var9_12 = v0[f2 + vRa.d + vRa.d + (e2 + vRa.d) * (i2 + uqa.g)];
        void var10_13 = v0[f2 + vRa.d - vRa.d + (e2 + vRa.d) * (i2 + uqa.g)];
        void var11_14 = v0[f2 + vRa.d + (e2 + vRa.d + vRa.d) * (i2 + uqa.g)];
        g[f2 + e2 * i2] = MU.J((int)h, (int)b2) && MU.J((int)var9_12, (int)b2) && MU.J((int)var10_13, (int)b2) && MU.J((int)var11_14, (int)b2) ? c2 : a2;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(int n2, int n3) {
        void b22;
        int c22 = n3;
        MU a2 = this;
        if (MU.J((int)b22, (int)c22)) {
            return vRa.d != 0;
        }
        Jy b22 = Jy.l((int)b22);
        Jy c22 = Jy.l((int)c22);
        if (b22 != null && c22 != null) {
            if ((b22 = b22.J()) == (c22 = c22.J()) || b22 == WZ.MEDIUM || c22 == WZ.MEDIUM) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int n6;
        void a2;
        void b2;
        void c2;
        void d2;
        MU mU = this;
        int[] nArray = mU.A.J((int)(d2 - vRa.d), (int)(c2 - vRa.d), (int)(b2 + uqa.g), (int)(a2 + uqa.g));
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n7 = n6 = uSa.E;
        while (n7 < a2) {
            int n8 = uSa.E;
            while (n8 < b2) {
                int e2;
                MU mU2 = mU;
                mU2.J(e2 + d2, n6 + c2);
                int n9 = nArray[e2 + vRa.d + (n6 + vRa.d) * (b2 + uqa.g)];
                if (!(mU2.f(nArray, nArray2, e2, n6, (int)b2, n9, Jy.U.Ka, Jy.D.Ka) || mU.J(nArray, nArray2, e2, n6, (int)b2, n9, Jy.w.Ka, Jy.X.Ka) || mU.J(nArray, nArray2, e2, n6, (int)b2, n9, Jy.S.Ka, Jy.X.Ka) || mU.J(nArray, nArray2, e2, n6, (int)b2, n9, Jy.qa.Ka, Jy.I.Ka))) {
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    if (n9 == Jy.ea.Ka) {
                        n13 = nArray[e2 + vRa.d + (n6 + vRa.d - vRa.d) * (b2 + uqa.g)];
                        n12 = nArray[e2 + vRa.d + vRa.d + (n6 + vRa.d) * (b2 + uqa.g)];
                        n11 = nArray[e2 + vRa.d - vRa.d + (n6 + vRa.d) * (b2 + uqa.g)];
                        n10 = nArray[e2 + vRa.d + (n6 + vRa.d + vRa.d) * (b2 + uqa.g)];
                        nArray2[e2 + n6 * b2] = n13 != Jy.C.Ka && n12 != Jy.C.Ka && n11 != Jy.C.Ka && n10 != Jy.C.Ka ? n9 : Jy.Ia.Ka;
                    } else if (n9 == Jy.g.Ka) {
                        n13 = nArray[e2 + vRa.d + (n6 + vRa.d - vRa.d) * (b2 + uqa.g)];
                        n12 = nArray[e2 + vRa.d + vRa.d + (n6 + vRa.d) * (b2 + uqa.g)];
                        n11 = nArray[e2 + vRa.d - vRa.d + (n6 + vRa.d) * (b2 + uqa.g)];
                        n10 = nArray[e2 + vRa.d + (n6 + vRa.d + vRa.d) * (b2 + uqa.g)];
                        nArray2[e2 + n6 * b2] = n13 != Jy.ea.Ka && n12 != Jy.ea.Ka && n11 != Jy.ea.Ka && n10 != Jy.ea.Ka && n13 != Jy.Ta.Ka && n12 != Jy.Ta.Ka && n11 != Jy.Ta.Ka && n10 != Jy.Ta.Ka && n13 != Jy.C.Ka && n12 != Jy.C.Ka && n11 != Jy.C.Ka && n10 != Jy.C.Ka ? (n13 != Jy.Fa.Ka && n10 != Jy.Fa.Ka && n12 != Jy.Fa.Ka && n11 != Jy.Fa.Ka ? n9 : Jy.Ja.Ka) : Jy.Z.Ka;
                    } else {
                        nArray2[e2 + n6 * b2] = n9;
                    }
                }
                n8 = ++e2;
            }
            n7 = ++n6;
        }
        return nArray2;
    }
}

