/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  ZOa
 *  gFa
 *  vL
 *  vRa
 *  wra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hDa_1
extends gFa {
    private int C;
    private int i;
    private int M;
    private boolean k;
    private final bga j;
    public XF J;
    public int A;
    private final double I;

    private boolean d() {
        int n2;
        hDa_1 hDa_12 = this;
        int n3 = hDa_12.C;
        XF xF = new XF((vL)hDa_12.j);
        int n4 = n2 = uSa.E;
        while (n4 <= vRa.d) {
            int n5 = uSa.E;
            while (n5 < n3) {
                int n6;
                int n7 = uSa.E;
                while (n7 <= n6) {
                    int a2;
                    int n8;
                    int n9 = n8 = a2 < n6 && a2 > -n6 ? n6 : uSa.E;
                    while (n9 <= n6) {
                        XF xF2 = xF.add(a2, n2 - vRa.d, n8);
                        if (hDa_12.j.J(xF2)) {
                            hDa_1 hDa_13 = hDa_12;
                            if (hDa_13.J((Gg)hDa_13.j.j, xF2)) {
                                hDa_12.J = xF2;
                                return vRa.d != 0;
                            }
                        }
                        n9 = n8 = n8 > 0 ? -n8 : vRa.d - n8;
                    }
                    n7 = a2 = a2 > 0 ? -a2 : vRa.d - a2;
                }
                n5 = ++n6;
            }
            n4 = n2 = n2 > 0 ? -n2 : vRa.d - n2;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        hDa_1 a2;
        hDa_1 hDa_12 = a2;
        if (hDa_12.i >= -hDa_12.M && a2.i <= PRa.ga) {
            hDa_1 hDa_13 = a2;
            if (hDa_13.J((Gg)a2.j.j, hDa_13.J)) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public abstract boolean J(Gg var1, XF var2);

    public boolean f() {
        hDa_1 a2;
        if (a2.A > 0) {
            a2.A -= vRa.d;
            return uSa.E != 0;
        }
        a2.A = ZOa.x + a2.j.J().nextInt(ZOa.x);
        return a2.d();
    }

    public void f() {
        hDa_1 a2;
        hDa_1 hDa_12 = a2;
        if (hDa_12.j.f(hDa_12.J.up()) > oua.i) {
            hDa_1 hDa_13 = a2;
            hDa_13.k = uSa.E;
            hDa_13.i += vRa.d;
            if (hDa_13.i % wra.P == 0) {
                a2.j.J().J((double)a2.J.getX() + kTa.B, a2.J.getY() + vRa.d, (double)a2.J.getZ() + kTa.B, a2.I);
                return;
            }
        } else {
            a2.k = vRa.d;
            a2.i -= vRa.d;
        }
    }

    public void l() {
        hDa_1 a2;
        a2.j.J().J((double)a2.J.getX() + kTa.B, a2.J.getY() + vRa.d, (double)a2.J.getZ() + kTa.B, a2.I);
        a2.i = uSa.E;
        a2.M = a2.j.J().nextInt(a2.j.J().nextInt(PRa.ga) + PRa.ga) + PRa.ga;
    }

    public boolean C() {
        hDa_1 a2;
        return a2.k;
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public hDa_1(bga bga2, double d2, int n2) {
        void d3;
        void b2;
        void c2;
        int n3 = n2;
        hDa_1 a2 = this;
        a2.J = XF.ORIGIN;
        a2.j = c2;
        a2.I = b2;
        a2.C = d3;
        a2.J(tTa.h);
    }
}

