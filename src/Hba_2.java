/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dv
 *  ERa
 *  Gg
 *  I
 *  Lz
 *  Oz
 *  QFa
 *  Yfa
 *  aAa
 *  aSa
 *  cAa
 *  nda
 *  pua
 *  vRa
 */
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Hba_2
extends xaa {
    private boolean A;
    public Dv I;

    public void d(boolean bl) {
        boolean b2 = bl;
        Hba_2 a2 = this;
        a2.I.l(b2);
    }

    public boolean e() {
        Hba_2 a2;
        return a2.I.l();
    }

    public boolean d() {
        Hba_2 a2;
        return a2.I.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Lz lz2, Lz lz3, int n2, int n3, int n4) {
        void b2;
        double d2;
        void d222;
        Hba_2 f2 = lz2;
        Hba_2 e2 = this;
        Hba_2 hba_2 = f2;
        int n5 = Oz.f((double)((Lz)hba_2).A);
        int n6 = Oz.f((double)((Lz)hba_2).J);
        double d3 = d222.A - ((Lz)f2).A;
        double d4 = d222.J - ((Lz)f2).J;
        double d5 = d3;
        double d6 = d4;
        double d7 = d5 * d5 + d6 * d6;
        if (d2 < qQa.x) {
            return uSa.E != 0;
        }
        if (!e2.f(n5, (int)((Lz)f2).j, n6, (int)(c2 += uqa.g), (int)b2, (int)(a2 += uqa.g), (Lz)f2, d3 *= (d7 = oua.i / Math.sqrt(d7)), d4 *= d7)) {
            return uSa.E != 0;
        }
        c2 -= uqa.g;
        a2 -= uqa.g;
        d7 = oua.i / Math.abs(d3);
        double d8 = oua.i / Math.abs(d4);
        double d9 = (double)(n5 * vRa.d) - ((Lz)f2).A;
        double d10 = (double)(n6 * vRa.d) - ((Lz)f2).J;
        if (d3 >= aSa.V) {
            d9 += oua.i;
        }
        if (d4 >= aSa.V) {
            d10 += oua.i;
        }
        d9 /= d3;
        d10 /= d4;
        int n7 = d3 < aSa.V ? pua.o : vRa.d;
        int n8 = d4 < aSa.V ? pua.o : vRa.d;
        void v4 = d222;
        int d222 = Oz.f((double)v4.A);
        int n9 = Oz.f((double)v4.J);
        int n10 = d222 - n5;
        int n11 = n9 - n6;
        while (n10 * n7 > 0 || n11 * n8 > 0) {
            void a2;
            void c2;
            Hba_2 hba_22;
            if (d9 < d10) {
                d9 += d7;
                n10 = d222 - (n5 += n7);
                hba_22 = e2;
            } else {
                d10 += d8;
                n11 = n9 - (n6 += n8);
                hba_22 = e2;
            }
            if (hba_22.f(n5, (int)((Lz)f2).j, n6, (int)c2, (int)b2, (int)a2, (Lz)f2, d3, d4)) continue;
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public boolean C() {
        Hba_2 a2;
        return a2.I.f();
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        Hba_2 a2 = this;
        a2.A = b2;
    }

    private int J() {
        Hba_2 hba_2 = this;
        if (hba_2.k.L() && hba_2.e()) {
            Hba_2 hba_22 = hba_2;
            int n2 = (int)hba_22.k.J().j;
            Object a2 = hba_22.m.J(new XF(Oz.f((double)hba_2.k.la), n2, Oz.f((double)hba_2.k.A))).J();
            int n3 = uSa.E;
            while (a2 == QFa.jd || a2 == QFa.sc) {
                a2 = hba_2.m.J(new XF(Oz.f((double)hba_2.k.la), ++n2, Oz.f((double)hba_2.k.A))).J();
                if (++n3 <= ERa.C) continue;
                return (int)hba_2.k.J().j;
            }
            return n2;
        }
        return (int)(hba_2.k.J().j + kTa.B);
    }

    @Override
    public boolean l() {
        Hba_2 a2;
        if (a2.k.ha || a2.e() && a2.J() || a2.k.B() && a2.k instanceof nda && a2.k.ja instanceof aEa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(int n2, int n3, int n4, int n5, int n6, int n7, Lz lz2, double d2, double d3) {
        void i2;
        void a2;
        void b2;
        void c2;
        void j2;
        void d4;
        void h2;
        void f2;
        int n8 = n6;
        Hba_2 e2 = this;
        if (!e2.J((int)(i2 -= f2 / uqa.g), (int)h2, (int)(g2 -= d4 / uqa.g), (int)f2, (int)j2, (int)d4, (Lz)c2, (double)b2, (double)a2)) {
            return uSa.E != 0;
        }
        void v0 = j2 = i2;
        while (v0 < i2 + f2) {
            void g2;
            void v1 = g2;
            while (v1 < g2 + d4) {
                void var12_12;
                double d5 = (double)j2 + kTa.B - c2.A;
                double d6 = (double)var12_12 + kTa.B - c2.J;
                if (d5 * b2 + d6 * a2 >= aSa.V) {
                    Material material = e2.m.J(new XF((int)j2, (int)(h2 - vRa.d), (int)var12_12)).J().J();
                    if (material == Material.air) {
                        return uSa.E != 0;
                    }
                    if (material == Material.water && !e2.k.L()) {
                        return uSa.E != 0;
                    }
                    if (material == Material.lava) {
                        return uSa.E != 0;
                    }
                }
                v1 = ++var12_12;
            }
            v0 = ++j2;
        }
        return vRa.d != 0;
    }

    @Override
    public Lz J() {
        Hba_2 a2;
        return new Lz(a2.k.la, (double)a2.J(), a2.k.A);
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        Hba_2 a2 = this;
        a2.I.C(b2);
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        Hba_2 a2 = this;
        a2.I.f(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Hba_2(Yfa yfa, Gg gg2) {
        void b2;
        Hba_2 c2 = gg2;
        Hba_2 a2 = this;
        super((Yfa)b2, (Gg)c2);
    }

    @Override
    public cAa J() {
        Hba_2 a2;
        a2.I = new Dv();
        a2.I.C(vRa.d != 0);
        return new cAa((Ex)a2.I);
    }

    @Override
    public void J() {
        Hba_2 hba_2;
        Hba_2 hba_22 = hba_2 = this;
        super.J();
        if (hba_22.A) {
            int a2;
            if (hba_2.m.j(new XF(Oz.f((double)hba_2.k.la), (int)(hba_2.k.J().j + kTa.B), Oz.f((double)hba_2.k.A)))) {
                return;
            }
            int n2 = a2 = uSa.E;
            while (n2 < hba_2.E.J()) {
                aAa aAa2;
                Hba_2 hba_23 = hba_2;
                aAa aAa3 = aAa2 = hba_23.E.J(a2);
                if (hba_23.m.j(new XF(aAa3.I, aAa3.C, aAa2.k))) {
                    hba_2.E.f(a2 - vRa.d);
                    return;
                }
                n2 = ++a2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(int n2, int n3, int n4, int n5, int n6, int n7, Lz lz2, double d2, double d3) {
        void d4;
        void e2;
        void f2;
        void g2;
        void i2;
        int j22 = n3;
        Hba_2 h2 = this;
        for (XF j22 : XF.getAllInBox(new XF((int)i2, j22, (int)g2), new XF((int)(i2 + f2 - vRa.d), j22 + e2 - vRa.d, (int)(g2 + d4 - vRa.d)))) {
            void a2;
            double d5;
            void b2;
            void c2;
            double d6 = (double)j22.getX() + kTa.B - c2.A;
            if (!(d6 * b2 + (d5 = (double)j22.getZ() + kTa.B - c2.J) * a2 >= aSa.V) || h2.m.J(j22).J().J((I)h2.m, j22)) continue;
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Hba_2 a2 = this;
        a2.I.J(b2);
    }
}

