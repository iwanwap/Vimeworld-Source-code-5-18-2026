/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  dFa
 *  vRa
 *  xy
 */
public class IFa
extends dFa {
    private boolean J;
    private final Class[] A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public void J(bga bga2, Gl gl2) {
        void b2;
        IFa c2 = gl2;
        IFa a2 = this;
        b2.C((Gl)c2);
    }

    public boolean f() {
        IFa a2;
        if (a2.j.k() != a2.I) {
            IFa iFa = a2;
            if (iFa.J(iFa.j.f(), uSa.E != 0)) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public IFa(bga bga2, boolean bl, Class ... classArray) {
        void b2;
        void c2;
        Class[] d2 = classArray;
        Class[] a2 = this;
        super((bga)c2, uSa.E != 0);
        a2.J = b2;
        a2.A = d2;
        a2.J(vRa.d);
    }

    public void l() {
        IFa iFa;
        IFa iFa2 = iFa = this;
        iFa2.j.C(iFa.j.f());
        iFa.I = iFa2.j.k();
        if (iFa2.J) {
            double d2;
            IFa iFa3 = iFa;
            double d3 = d2 = iFa3.J();
            for (bga bga2 : iFa3.j.j.J(((Object)((Object)iFa.j)).getClass(), new xy(iFa.j.la, iFa.j.Z, (double)iFa.j.A, iFa.j.la + oua.i, iFa.j.Z + oua.i, (double)(iFa.j.A + oua.i)).f(d3, Wqa.m, d3))) {
                int n2;
                block4: {
                    if (iFa.j == bga2 || bga2.C() != null || bga2.J(iFa.j.f())) continue;
                    int n3 = uSa.E;
                    Class[] classArray = iFa.A;
                    int n4 = iFa.A.length;
                    int n5 = uSa.E;
                    while (n5 < n4) {
                        int a2;
                        Class clazz = classArray[a2];
                        if (((Object)((Object)bga2)).getClass() == clazz) {
                            n2 = n3 = vRa.d;
                            break block4;
                        }
                        n5 = ++a2;
                    }
                    n2 = n3;
                }
                if (n2 != 0) continue;
                IFa iFa4 = iFa;
                iFa4.J(bga2, iFa4.j.f());
            }
        }
        super.l();
    }
}

