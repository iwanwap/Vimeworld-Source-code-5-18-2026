/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  F
 *  KA
 *  Oqa
 *  ZRa
 *  aSa
 *  ad
 *  cI
 *  pua
 *  sB
 *  tqa
 *  vRa
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eF
extends ad
implements F {
    public vC D;
    public final List<ad> f;
    public double F;
    public boolean g;
    public Oqa L;
    public int E;
    public boolean m;
    public double C;
    public boolean i;
    public Color M;
    public int k;
    public Oqa j;
    public int J;
    public double A;

    public int f() {
        eF a2;
        return a2.E;
    }

    public void f(ad ad2) {
        eF b2 = ad2;
        eF a2 = this;
        a2.f.add(b2);
    }

    public List<ad> f() {
        eF a2;
        return a2.f;
    }

    public void J(ad ad2) {
        eF b2 = ad2;
        eF a2 = this;
        a2.f.remove((Object)b2);
    }

    public void d() {
    }

    /*
     * WARNING - void declaration
     */
    public eF(int n2, int n3, int n4, int n5, Oqa oqa2, int n6) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        eF a2;
        int n7 = n6;
        eF eF2 = a2 = this;
        super((int)f2, (int)e2, (int)d2, (int)c2);
        eF eF3 = a2;
        a2.f = new ArrayList<ad>();
        eF3.L = Oqa.ROW;
        a2.F = ZRa.r;
        a2.D = new vC();
        eF2.j = b2;
        eF2.J = g2;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        eF a2 = this;
        a2.g = b2;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void C() {
        var1_1 = this;
        if (var1_1.j == null) {
            var1_1.j = Oqa.COLUMN;
        }
        var4_2 = uSa.E;
        var2_3 = uSa.E;
        var1_1.C = aSa.V;
        var1_1.A = aSa.V;
        for (eF a : var1_1.f) {
            block15: {
                if (!var1_1.j.isHorizontal()) break block15;
                if (!var1_1.m || !((double)var4_2 + a.l() > var1_1.k)) ** GOTO lbl17
                var4_2 = uSa.E;
                if (var1_1.j.isIncrease()) {
                    v0 = a;
                    var2_3 = (int)(var1_1.A + (double)var1_1.J);
                } else {
                    var2_3 = (int)(-var1_1.A - (double)var1_1.J);
lbl17:
                    // 2 sources

                    v0 = a;
                }
                v0.C(var1_1.I + (double)var4_2);
                v1 = var1_1;
                a.l(v1.J + (double)var2_3);
                if (v1.L.isHorizontal()) {
                    v2 = a;
                    v2.C(v2.f() + (var1_1.L.isIncrease() != false ? var1_1.D.l() : -var1_1.D.l()));
                    v3 = var4_2;
                } else {
                    v4 = a;
                    v5 = var1_1;
                    v4.l(v4.C() + (var1_1.L.isIncrease() != false ? v5.D.l() : -v5.D.l()));
                    v3 = var4_2;
                }
                var4_2 = v3 + (int)(a.l() + (double)var1_1.J);
                v6 = var1_1;
                v6.C = Math.max(v6.C, (double)var4_2);
                v6.A = (int)Math.max(v6.A, (double)var2_3 + a.J());
                continue;
            }
            if (!var1_1.m || !((double)var2_3 + a.J() > var1_1.j)) ** GOTO lbl44
            var2_3 = uSa.E;
            v7 = var1_1;
            if (var1_1.j.isIncrease()) {
                var4_2 = (int)(v7.C + (double)var1_1.J);
                v8 = a;
            } else {
                var4_2 = (int)(-v7.C - (double)var1_1.J);
lbl44:
                // 2 sources

                v8 = a;
            }
            v8.C(var1_1.I + (double)var4_2);
            v9 = var1_1;
            a.l(v9.J + (double)var2_3);
            if (v9.L.isHorizontal()) {
                v10 = a;
                v11 = var1_1;
                v10.C(v10.f() + (var1_1.L.isIncrease() != false ? v11.D.l() : -v11.D.l()));
                v12 = var2_3;
            } else {
                v13 = a;
                v14 = var1_1;
                v13.l(v13.C() + (var1_1.L.isIncrease() != false ? v14.D.l() : -v14.D.l()));
                v12 = var2_3;
            }
            var2_3 = v12 + (int)(a.J() + (double)var1_1.J);
            v15 = var1_1;
            v15.C = (int)Math.max(v15.C, (double)var4_2 + a.l());
            v15.A = Math.max(v15.A, (double)var2_3);
        }
        if (!var1_1.i) {
            v16 = var1_1;
            v16.j = (Oqa)v16.A;
            if ((double)v16.E != aSa.V) {
                var1_1.j += (double)var1_1.E;
            }
            if (!(var1_1 instanceof TT)) {
                v17 = var1_1;
                v17.k = (int)v17.C;
                if (v17.j.isHorizontal()) {
                    var1_1.k -= (double)var1_1.J;
                }
            }
            if (var1_1.j.isVertical()) {
                var1_1.j -= (double)var1_1.J;
            }
        }
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        eF a2 = this;
        a2.m = b2;
    }

    public void f(int n2) {
        double d2;
        int b2 = n2;
        eF a2 = this;
        a2.k = b2;
        Object object = a2.D.l();
        if (-d2 > a2.j - (double)b2) {
            object = -a2.j + (double)b2;
        }
        eF eF2 = a2;
        eF2.D.f(Math.min((double)eF2.E, object), iSa.P, sB.x);
    }

    public int J() {
        eF a2;
        return a2.k;
    }

    public Color J() {
        eF a2;
        return a2.M;
    }

    public ad J() {
        int n2;
        eF eF2 = this;
        int n3 = n2 = eF2.f.size();
        while (n3 > 0) {
            eF a2 = eF2.f.get(n2 - vRa.d);
            if (a2 instanceof F && a2.f()) {
                if (a2 instanceof eF) {
                    return a2.J();
                }
                return a2;
            }
            n3 = --n2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void a2;
        void b2;
        void c2;
        void d2;
        eF eF2 = this;
        eF e2 = eF2.J();
        if (e2 == null) {
            return;
        }
        ((F)e2).J((int)d2, (int)c2, (int)b2, (boolean)a2);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        eF a2 = this;
        a2.i = b2;
    }

    public void d(double a2) {
        b.F = a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        eF eF2;
        eF eF3 = eF2 = this;
        eF3.D.J();
        if (eF3.g && !eF2.f().isEmpty()) {
            int c2;
            if (-eF2.D.l() < (double)eF2.E && eF2.D.f()) {
                eF eF4 = eF2;
                eF4.D.e(eF4.E);
                eF eF5 = eF2;
                eF5.D.C(eF5.E);
                eF eF6 = eF2;
                eF6.D.J((double)eF6.E);
            }
            if (eF2.f() && (c2 = Mouse.getDWheel()) != 0) {
                double d2;
                Object object = eF2.D.d() + (c2 > 0 ? eF2.F : -eF2.F);
                if (-d2 > eF2.j - (double)eF2.k) {
                    object = -eF2.j + (double)eF2.k;
                }
                eF eF7 = eF2;
                eF7.D.f(Math.min((double)eF7.E, object), iSa.P, sB.x);
            }
        }
        eF eF8 = eF2;
        eF8.C();
        if (eF8.i) {
            cI.J((Runnable)tqa.J((eF)eF2));
        }
        if (eF2.M != null && eF2.M.getAlpha() > 0) {
            eF2.J();
        }
        eF eF9 = eF2;
        super.J((int)b2, (int)a2);
        Iterator<ad> c2 = eF9.f.iterator();
        Object object = c2;
        while (object.hasNext()) {
            ad ad2 = (ad)c2.next();
            object = c2;
            ad2.J((int)b2, (int)a2);
        }
        eF eF10 = eF2;
        eF10.d();
        if (eF10.i) {
            cI.J();
        }
    }

    public List<ad> J() {
        Iterator<ad> iterator;
        eF eF2 = this;
        ArrayList a2 = new ArrayList();
        Iterator<ad> iterator2 = iterator = eF2.f.iterator();
        while (iterator2.hasNext()) {
            ad ad2 = iterator.next();
            if (ad2 instanceof eF) {
                a2.addAll(((eF)ad2).J());
            }
            a2.add(ad2);
            iterator2 = iterator;
        }
        return a2;
    }

    public boolean l() {
        eF a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public eF(int n2, int n3, int n4, int n5, Oqa oqa2, int n6, boolean bl) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        eF a2;
        boolean bl2 = bl;
        eF eF2 = a2 = this;
        eF eF3 = a2;
        super((int)g2, (int)f2, (int)e2, (int)d2);
        eF eF4 = a2;
        a2.f = new ArrayList<ad>();
        eF4.L = Oqa.ROW;
        eF3.F = ZRa.r;
        eF3.D = new vC();
        eF3.j = c2;
        eF2.J = b2;
        eF2.m = h2;
    }

    public void l() {
        eF a2;
        KA.J((int)((int)a2.I), (int)a2.J, (int)((int)(a2.I + a2.k)), (int)(a2.J + a2.j), (int)pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public eF(int n2, int n3, Oqa oqa2, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        eF a2;
        int n5 = n4;
        eF eF2 = a2 = this;
        super((int)d2, (int)c2);
        eF eF3 = a2;
        a2.f = new ArrayList<ad>();
        eF3.L = Oqa.ROW;
        a2.F = ZRa.r;
        a2.D = new vC();
        eF2.j = b2;
        eF2.J = e2;
    }

    /*
     * WARNING - void declaration
     */
    public eF(Oqa oqa2, int n2, boolean bl) {
        void b2;
        void c2;
        eF a2;
        boolean d2 = bl;
        eF eF2 = a2 = this;
        eF eF3 = a2;
        eF eF4 = a2;
        a2.f = new ArrayList<ad>();
        eF4.L = Oqa.ROW;
        eF3.F = ZRa.r;
        eF3.D = new vC();
        eF3.j = c2;
        eF2.J = b2;
        eF2.m = d2;
    }

    public boolean J() {
        eF a2;
        return a2.g;
    }

    /*
     * WARNING - void declaration
     */
    public eF(Oqa oqa2, int n2) {
        void b2;
        eF a2;
        int c2 = n2;
        eF eF2 = a2 = this;
        eF eF3 = a2;
        a2.f = new ArrayList<ad>();
        eF3.L = Oqa.ROW;
        a2.F = ZRa.r;
        a2.D = new vC();
        eF2.j = b2;
        eF2.J = c2;
    }

    public void J(int n2) {
        int b2 = n2;
        eF a2 = this;
        a2.E = b2;
    }

    public void J(Color color) {
        Object b2 = color;
        eF a2 = this;
        a2.M = b2;
    }

    public void J() {
        eF a2;
        KA.J((int)((int)a2.I), (int)a2.J, (int)((int)(a2.I + a2.k)), (int)(a2.J + a2.j), (int)a2.M.getRGB());
    }

    public vC J() {
        eF a2;
        return a2.D;
    }

    /*
     * WARNING - void declaration
     */
    public eF(int n2, int n3, Oqa oqa2, int n4, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        eF a2;
        boolean bl2 = bl;
        eF eF2 = a2 = this;
        eF eF3 = a2;
        super((int)e2, (int)d2);
        eF eF4 = a2;
        a2.f = new ArrayList<ad>();
        eF4.L = Oqa.ROW;
        eF3.F = ZRa.r;
        eF3.D = new vC();
        eF3.j = c2;
        eF2.J = b2;
        eF2.m = f2;
    }

    public void J(Oqa oqa2) {
        eF b2 = oqa2;
        eF a2 = this;
        a2.j = b2;
    }
}

