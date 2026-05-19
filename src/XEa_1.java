/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BFa
 *  Ega
 *  HA
 *  Mda
 *  Qsa
 *  Rea
 *  XEa
 *  fga
 *  jRa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XEa_1
extends Ega {
    private Rea A;
    private HA I;

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        Mda b2;
        block8: {
            XEa_1 c2;
            sEa sEa2;
            block10: {
                block13: {
                    XEa_1 xEa_1;
                    block12: {
                        block11: {
                            block9: {
                                void a2;
                                xEa_1 = this;
                                b2 = null;
                                sEa2 = (sEa)xEa_1.A.get((int)a2);
                                if (sEa2 == null || !sEa2.J()) break block8;
                                c2 = sEa2.J();
                                b2 = c2.J();
                                if (a2 >= xEa_1.I.f()) break block9;
                                XEa_1 xEa_12 = xEa_1;
                                if (!xEa_12.J((Mda)c2, xEa_1.I.f(), xEa_12.A.size(), vRa.d != 0)) {
                                    return null;
                                }
                                break block10;
                            }
                            if (!xEa_1.J(vRa.d).J((Mda)c2) || xEa_1.J(vRa.d).J()) break block11;
                            if (!xEa_1.J((Mda)c2, vRa.d, uqa.g, uSa.E != 0)) {
                                return null;
                            }
                            break block10;
                        }
                        if (!xEa_1.J(uSa.E).J((Mda)c2)) break block12;
                        if (!xEa_1.J((Mda)c2, uSa.E, vRa.d, uSa.E != 0)) {
                            return null;
                        }
                        break block10;
                    }
                    if (xEa_1.I.f() <= uqa.g) break block13;
                    XEa_1 xEa_13 = xEa_1;
                    if (xEa_13.J((Mda)c2, uqa.g, xEa_13.I.f(), uSa.E != 0)) break block10;
                }
                return null;
            }
            sEa sEa3 = sEa2;
            if (((Mda)c2).E == 0) {
                sEa3.J((Mda)null);
                return b2;
            }
            sEa3.J();
        }
        return b2;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        XEa_1 a2 = this;
        if (a2.I.J((Sx)((Object)b2)) && a2.A.K() && a2.A.J((vL)b2) < Qsa.k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Sx sx2) {
        XEa_1 a2;
        Object b2 = sx2;
        XEa_1 xEa_1 = a2 = this;
        super.J((Sx)((Object)b2));
        xEa_1.I.J((Sx)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public XEa_1(HA hA2, HA hA3, Rea rea2, Sx sx2) {
        void d2;
        int n2;
        void a22;
        void c2;
        XEa_1 b2;
        XEa_1 e2 = rea2;
        XEa_1 xEa_1 = b2 = this;
        xEa_1.I = c2;
        xEa_1.A = e2;
        int n3 = yRa.d;
        c2.f((Sx)a22);
        int a22 = (n3 - AQa.P) * yOa.B;
        XEa_1 xEa_12 = b2;
        XEa_1 xEa_13 = b2;
        xEa_13.J((sEa)new fga((XEa)xEa_13, (HA)c2, uSa.E, Yqa.i, yOa.B));
        XEa_1 xEa_14 = b2;
        xEa_14.J((sEa)new BFa((XEa)xEa_14, (HA)c2, vRa.d, Yqa.i, Qsa.Ha, (Rea)e2));
        if (xEa_1.A.ca()) {
            int n4 = e2 = uSa.E;
            while (n4 < n3) {
                int n5 = uSa.E;
                while (n5 < tTa.h) {
                    int n6 = uqa.g + n2 + e2 * tTa.h;
                    int n7 = Fua.J + n2 * yOa.B;
                    b2.J(new sEa((HA)c2, n6, n7, yOa.B + e2 * yOa.B));
                    n5 = ++n2;
                }
                n4 = ++e2;
            }
        }
        int n8 = e2 = uSa.E;
        while (n8 < yRa.d) {
            int n9 = uSa.E;
            while (n9 < WOa.fa) {
                int n10 = n2 + e2 * WOa.fa + WOa.fa;
                int n11 = Yqa.i + n2 * yOa.B;
                b2.J(new sEa((HA)d2, n10, n11, jRa.v + e2 * yOa.B + a22));
                n9 = ++n2;
            }
            n8 = ++e2;
        }
        int n12 = e2 = uSa.E;
        while (n12 < WOa.fa) {
            int n13 = e2++;
            b2.J(new sEa((HA)d2, n13, Yqa.i + n13 * yOa.B, rRa.f + a22));
            n12 = e2;
        }
    }
}

