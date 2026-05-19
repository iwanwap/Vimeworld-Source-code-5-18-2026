/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  fY
 *  hw
 *  vRa
 */
public final class Aw_3
extends hw {
    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int e2;
        void a2;
        void b2;
        void c2;
        void d2;
        Aw_3 aw_3 = this;
        int[] nArray = aw_3.A.J((int)(d2 - vRa.d), (int)(c2 - vRa.d), (int)(b2 + uqa.g), (int)(a2 + uqa.g));
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n6 = e2 = uSa.E;
        while (n6 < a2) {
            int n7 = uSa.E;
            while (n7 < b2) {
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13 = n12;
                aw_3.J(n13 + d2, e2 + c2);
                int n14 = nArray[n13 + vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                Jy jy2 = Jy.l((int)n14);
                if (n14 == Jy.P.Ka) {
                    n11 = nArray[n12 + vRa.d + (e2 + vRa.d - vRa.d) * (b2 + uqa.g)];
                    n10 = nArray[n12 + vRa.d + vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                    n9 = nArray[n12 + vRa.d - vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                    n8 = nArray[n12 + vRa.d + (e2 + vRa.d + vRa.d) * (b2 + uqa.g)];
                    nArray2[n12 + e2 * b2] = n11 != Jy.Ba.Ka && n10 != Jy.Ba.Ka && n9 != Jy.Ba.Ka && n8 != Jy.Ba.Ka ? n14 : Jy.Da.Ka;
                } else if (jy2 != null && jy2.J() == cY.class) {
                    n11 = nArray[n12 + vRa.d + (e2 + vRa.d - vRa.d) * (b2 + uqa.g)];
                    n10 = nArray[n12 + vRa.d + vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                    n9 = nArray[n12 + vRa.d - vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                    n8 = nArray[n12 + vRa.d + (e2 + vRa.d + vRa.d) * (b2 + uqa.g)];
                    nArray2[n12 + e2 * b2] = aw_3.f(n11) && aw_3.f(n10) && aw_3.f(n9) && aw_3.f(n8) ? (!(Aw_3.J((int)n11) || Aw_3.J((int)n10) || Aw_3.J((int)n9) || Aw_3.J((int)n8)) ? n14 : Jy.Ha.Ka) : Jy.Ja.Ka;
                } else if (n14 != Jy.U.Ka && n14 != Jy.Ia.Ka && n14 != Jy.D.Ka) {
                    if (jy2 != null && jy2.f()) {
                        aw_3.J(nArray, nArray2, n12, e2, (int)b2, n14, Jy.da.Ka);
                    } else if (n14 != Jy.X.Ka && n14 != Jy.w.Ka) {
                        if (n14 != Jy.Ba.Ka && n14 != Jy.L.Ka && n14 != Jy.n.Ka && n14 != Jy.g.Ka) {
                            n11 = nArray[n12 + vRa.d + (e2 + vRa.d - vRa.d) * (b2 + uqa.g)];
                            n10 = nArray[n12 + vRa.d + vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                            n9 = nArray[n12 + vRa.d - vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                            n8 = nArray[n12 + vRa.d + (e2 + vRa.d + vRa.d) * (b2 + uqa.g)];
                            nArray2[n12 + e2 * b2] = !(Aw_3.J((int)n11) || Aw_3.J((int)n10) || Aw_3.J((int)n9) || Aw_3.J((int)n8)) ? n14 : Jy.Ha.Ka;
                        } else {
                            nArray2[n12 + e2 * b2] = n14;
                        }
                    } else {
                        n11 = nArray[n12 + vRa.d + (e2 + vRa.d - vRa.d) * (b2 + uqa.g)];
                        n10 = nArray[n12 + vRa.d + vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                        n9 = nArray[n12 + vRa.d - vRa.d + (e2 + vRa.d) * (b2 + uqa.g)];
                        n8 = nArray[n12 + vRa.d + (e2 + vRa.d + vRa.d) * (b2 + uqa.g)];
                        nArray2[n12 + e2 * b2] = !(Aw_3.J((int)n11) || Aw_3.J((int)n10) || Aw_3.J((int)n9) || Aw_3.J((int)n8)) ? (aw_3.l(n11) && aw_3.l(n10) && aw_3.l(n9) && aw_3.l(n8) ? n14 : Jy.ea.Ka) : n14;
                    }
                } else {
                    aw_3.J(nArray, nArray2, n12, e2, (int)b2, n14, Jy.o.Ka);
                }
                n7 = ++n12;
            }
            n6 = ++e2;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public Aw_3(long l2, hw hw2) {
        void b2;
        Aw_3 c2 = hw2;
        Aw_3 a2 = this;
        super((long)b2);
        a2.A = c2;
    }

    private boolean l(int n2) {
        int b2 = n2;
        Aw_3 a2 = this;
        return Jy.l((int)b2) instanceof fY;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6) {
        void a2;
        void h2;
        void d2;
        void e2;
        void g2;
        void b2;
        int n7 = n4;
        Aw_3 c2 = this;
        if (Aw_3.J((int)b2)) {
            f[e2 + d2 * h2] = b2;
            return;
        }
        void v0 = g2;
        g2 = v0[e2 + vRa.d + (d2 + vRa.d - vRa.d) * (h2 + uqa.g)];
        void var8_11 = v0[e2 + vRa.d + vRa.d + (d2 + vRa.d) * (h2 + uqa.g)];
        void var9_12 = v0[e2 + vRa.d - vRa.d + (d2 + vRa.d) * (h2 + uqa.g)];
        void var10_13 = v0[e2 + vRa.d + (d2 + vRa.d + vRa.d) * (h2 + uqa.g)];
        if (!(Aw_3.J((int)g2) || Aw_3.J((int)var8_11) || Aw_3.J((int)var9_12) || Aw_3.J((int)var10_13))) {
            f[e2 + d2 * h2] = b2;
            return;
        }
        f[e2 + d2 * h2] = a2;
    }

    private boolean f(int n2) {
        int b2 = n2;
        Aw_3 a2 = this;
        if (Jy.l((int)b2) != null && Jy.l((int)b2).J() == cY.class) {
            return vRa.d != 0;
        }
        if (b2 == Jy.Ja.Ka || b2 == Jy.Fa.Ka || b2 == Jy.y.Ka || b2 == Jy.Y.Ka || b2 == Jy.I.Ka || Aw_3.J((int)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

