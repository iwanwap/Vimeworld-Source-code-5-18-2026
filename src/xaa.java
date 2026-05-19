/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Ila
 *  Lz
 *  Oz
 *  Qsa
 *  Yfa
 *  Yra
 *  aSa
 *  cAa
 *  fpa
 *  pqa
 *  vL
 *  vRa
 *  xy
 *  yCa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class xaa {
    public yCa E;
    public Gg m;
    private final cAa C;
    public double i;
    private Lz M;
    public Yfa k;
    private float j;
    private int J;
    private int A;
    private final bA I;

    public void C() {
        xaa xaa2;
        Lz lz2;
        block7: {
            int n2;
            xaa xaa3;
            int n3;
            xaa xaa4;
            block6: {
                int a22;
                xaa xaa5 = xaa4 = this;
                lz2 = xaa5.J();
                n3 = xaa5.E.J();
                int n4 = a22 = xaa5.E.f();
                while (n4 < xaa4.E.J()) {
                    if (xaa4.E.J((int)a22).C != (int)lz2.j) {
                        n3 = a22;
                        xaa3 = xaa4;
                        break block6;
                    }
                    n4 = ++a22;
                }
                xaa3 = xaa4;
            }
            float a22 = xaa3.k.F * xaa4.k.F * xaa4.j;
            int n5 = n2 = xaa4.E.f();
            while (n5 < n3) {
                xaa xaa6 = xaa4;
                Lz lz3 = xaa6.E.J((vL)xaa6.k, n2);
                if (lz2.l(lz3) < (double)a22) {
                    xaa4.E.J(n2 + vRa.d);
                }
                n5 = ++n2;
            }
            xaa xaa7 = xaa4;
            n2 = Oz.f((float)xaa7.k.F);
            int n6 = (int)xaa7.k.u + vRa.d;
            int a22 = n2;
            int n7 = n3 = n3 - vRa.d;
            while (n7 >= xaa4.E.f()) {
                xaa xaa8 = xaa4;
                if (xaa8.J(lz2, xaa4.E.J((vL)xaa8.k, n3), n2, n6, a22)) {
                    xaa xaa9 = xaa4;
                    xaa2 = xaa9;
                    xaa9.E.J(n3);
                    break block7;
                }
                n7 = --n3;
            }
            xaa2 = xaa4;
        }
        xaa2.J(lz2);
    }

    public float J() {
        xaa a2;
        return (float)a2.I.f();
    }

    public void J(float f2) {
        float b2 = f2;
        xaa a2 = this;
        a2.j = b2;
    }

    public abstract boolean l();

    public abstract boolean J(Lz var1, Lz var2, int var3, int var4, int var5);

    public boolean J(double d2, double c2, double b2, double a2) {
        xaa e2;
        xaa xaa2 = e2;
        return xaa2.J(xaa2.J(Oz.f((double)d2), (int)c2, Oz.f((double)b2)), a2);
    }

    public void l() {
        xaa xaa2;
        xaa xaa3 = xaa2 = this;
        xaa3.A += vRa.d;
        if (!xaa3.f()) {
            Lz lz2;
            xaa a2;
            xaa xaa4;
            if (xaa2.l()) {
                xaa xaa5 = xaa2;
                xaa4 = xaa5;
                xaa5.C();
            } else {
                if (xaa2.E != null && xaa2.E.f() < xaa2.E.J()) {
                    xaa xaa6 = xaa2;
                    a2 = xaa6.J();
                    xaa xaa7 = xaa2;
                    lz2 = xaa6.E.J((vL)xaa7.k, xaa7.E.f());
                    if (((Lz)a2).j > lz2.j && !xaa2.k.ha && Oz.f((double)((Lz)a2).A) == Oz.f((double)lz2.A) && Oz.f((double)((Lz)a2).J) == Oz.f((double)lz2.J)) {
                        xaa xaa8 = xaa2;
                        xaa8.E.J(xaa8.E.f() + vRa.d);
                    }
                }
                xaa4 = xaa2;
            }
            if (!xaa4.f()) {
                xaa xaa9 = xaa2;
                a2 = xaa9.E.J((vL)xaa9.k);
                if (a2 != null) {
                    lz2 = new xy(((Lz)a2).A, ((Lz)a2).j, ((Lz)a2).J, ((Lz)a2).A, ((Lz)a2).j, ((Lz)a2).J).f(kTa.B, kTa.B, kTa.B);
                    xaa xaa10 = xaa2;
                    Object object = xaa10.m.J((vL)xaa10.k, lz2.l(aSa.V, pqa.q, aSa.V));
                    double d2 = pqa.q;
                    lz2 = lz2.C(aSa.V, oua.i, aSa.V);
                    Object object2 = object = object.iterator();
                    while (object2.hasNext()) {
                        d2 = ((xy)object.next()).J((xy)lz2, d2);
                        object2 = object;
                    }
                    xaa2.k.J().J(((Lz)a2).A, ((Lz)a2).j + d2, ((Lz)a2).J, xaa2.i);
                }
            }
        }
    }

    public boolean f() {
        xaa a2;
        if (a2.E == null || a2.E.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(yCa yCa2, double d2) {
        void a2;
        xaa c2 = yCa2;
        xaa b2 = this;
        if (c2 == null) {
            b2.E = null;
            return uSa.E != 0;
        }
        if (!c2.J(b2.E)) {
            b2.E = c2;
        }
        xaa xaa2 = b2;
        xaa2.J();
        if (xaa2.E.J() == 0) {
            return uSa.E != 0;
        }
        xaa xaa3 = b2;
        xaa3.i = a2;
        c2 = xaa3.J();
        xaa3.J = xaa3.A;
        xaa3.M = c2;
        return vRa.d != 0;
    }

    public void J(double a2) {
        b.i = a2;
    }

    public abstract Lz J();

    public void f() {
        a.E = null;
    }

    public final yCa J(double c2, double b2, double a2) {
        xaa d2;
        return d2.J(new XF(Oz.f((double)c2), (int)b2, Oz.f((double)a2)));
    }

    public yCa J(vL vL2) {
        yCa a2;
        int n2;
        Object object = this;
        if (!object.l()) {
            return null;
        }
        xaa xaa2 = object;
        float f2 = xaa2.J();
        xaa2.m.H.J(nqa.s);
        xaa xaa3 = object;
        Object b2 = new XF((vL)xaa3.k).up();
        int n3 = n2 = (int)(f2 + Yra.i);
        b2 = new Ila(object.m, ((XF)((Object)b2)).add(-n2, -n2, -n2), ((XF)((Object)b2)).add(n3, n3, n3), uSa.E);
        a2 = xaa3.C.J((I)b2, (vL)object.k, (vL)a2, f2);
        xaa2.m.H.f();
        return a2;
    }

    public void J(Lz lz2) {
        xaa a2;
        xaa b2 = lz2;
        xaa xaa2 = a2 = this;
        if (xaa2.A - xaa2.J > ySa.T) {
            if (b2.l(a2.M) < fpa.o) {
                a2.f();
            }
            a2.J = a2.A;
            a2.M = b2;
        }
    }

    public yCa J(XF xF) {
        yCa a2;
        int n2;
        Object object = this;
        if (!object.l()) {
            return null;
        }
        xaa xaa2 = object;
        float f2 = xaa2.J();
        xaa2.m.H.J(nqa.s);
        xaa xaa3 = object;
        Object b2 = new XF((vL)xaa3.k);
        int n3 = n2 = (int)(f2 + Qsa.k);
        b2 = new Ila(object.m, ((XF)((Object)b2)).add(-n2, -n2, -n2), ((XF)((Object)b2)).add(n3, n3, n3), uSa.E);
        a2 = xaa3.C.J((I)b2, (vL)object.k, (XF)a2, f2);
        xaa2.m.H.f();
        return a2;
    }

    public yCa J() {
        xaa a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, double d2) {
        xaa c2 = vL2;
        xaa b2 = this;
        if ((c2 = b2.J((vL)c2)) != null) {
            void a2;
            return b2.J((yCa)c2, (double)a2);
        }
        return uSa.E != 0;
    }

    public abstract cAa J();

    /*
     * WARNING - void declaration
     */
    public xaa(Yfa yfa, Gg gg2) {
        void a2;
        xaa b2;
        xaa c2 = yfa;
        xaa xaa2 = b2 = this;
        xaa xaa3 = b2;
        xaa xaa4 = b2;
        xaa3.M = new Lz(aSa.V, aSa.V, aSa.V);
        xaa3.j = pqa.r;
        xaa3.k = c2;
        b2.m = a2;
        xaa2.I = c2.J(Kha.I);
        xaa2.C = b2.J();
    }

    public void J() {
    }

    public boolean J() {
        xaa a2;
        if (a2.k.L() || a2.k.H()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

