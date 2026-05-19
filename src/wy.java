/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ABa
 *  Fba
 *  OCa
 *  Tf
 *  Vb
 *  Yra
 *  Zta
 *  bCa
 *  bFa
 *  pqa
 *  vL
 *  vRa
 *  yra
 */
public final class wy
implements Vb {
    private OCa A;
    private Tf I;

    /*
     * WARNING - void declaration
     */
    public void f(int n2, XF xF, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        wy a2 = this;
        a2.A.J().J((KC)new bCa((int)c2, (XF)b2, d2, vRa.d != 0));
    }

    /*
     * WARNING - void declaration
     */
    public wy(OCa oCa2, Tf tf) {
        void b2;
        wy a2;
        wy c2 = tf;
        wy wy2 = a2 = this;
        wy2.A = b2;
        wy2.I = c2;
    }

    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n7;
        wy a2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, int n2, XF xF, int n3) {
        void a2;
        void c2;
        void d2;
        Object e2 = xF;
        wy b2 = this;
        b2.A.J().J((Sx)d2, e2.getX(), e2.getY(), e2.getZ(), ypa.X, b2.I.F.J(), (KC)new bCa((int)c2, (XF)((Object)e2), (int)a2, uSa.E != 0));
    }

    public void J(String string, XF object) {
        Object c2 = object;
        object = this;
    }

    public void J(int n2, boolean bl, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        wy wy2 = object;
        Object object = nArray;
        wy a2 = wy2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, XF xF, int n3) {
        wy wy2 = this;
        for (bFa d2 : wy2.A.J().J()) {
            void a2;
            void b2;
            void c2;
            if (d2 == null || d2.j != wy2.I || d2.M() == c2) continue;
            void v0 = b2;
            double d3 = (double)v0.getX() - d2.la;
            double d4 = (double)v0.getY() - d2.Z;
            double d5 = (double)v0.getZ() - d2.A;
            double d6 = d3;
            double d7 = d4;
            double d8 = d5;
            if (!(d6 * d6 + d7 * d7 + d8 * d8 < yra.Y)) continue;
            d2.I.J((KC)new Fba((int)c2, (XF)b2, (int)a2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void f4;
        void c2;
        void d5;
        void e2;
        wy wy2;
        double d6;
        void g2;
        float f5 = f2;
        wy b2 = this;
        Cba cba = b2.A.J();
        if (g2 > pqa.r) {
            d6 = Yra.i * g2;
            wy2 = b2;
        } else {
            d6 = Zta.ba;
            wy2 = b2;
        }
        cba.J((double)e2, (double)d5, (double)c2, d6, wy2.I.F.J(), (KC)new ABa((String)f4, (double)e2, (double)d5, (double)c2, (float)g2, (float)a2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, String string, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void f4;
        void c2;
        void d5;
        void e2;
        void g2;
        wy wy2;
        double d6;
        void h2;
        float f5 = f2;
        wy b2 = this;
        Cba cba = b2.A.J();
        if (h2 > pqa.r) {
            d6 = Yra.i * h2;
            wy2 = b2;
        } else {
            d6 = Zta.ba;
            wy2 = b2;
        }
        cba.J((Sx)g2, (double)e2, (double)d5, (double)c2, d6, wy2.I.F.J(), (KC)new ABa((String)f4, (double)e2, (double)d5, (double)c2, (float)h2, (float)a2));
    }

    public void f(vL vL2) {
        wy a2;
        wy b2 = vL2;
        wy wy2 = a2 = this;
        wy2.I.J().f((vL)b2);
        wy2.I.J().J((vL)b2);
    }

    public void J(XF xF) {
        Object b2 = xF;
        wy a2 = this;
        a2.I.J().J((XF)((Object)b2));
    }

    public void f(XF object) {
        Object b2 = object;
        object = this;
    }

    public void J(vL vL2) {
        wy b2 = vL2;
        wy a2 = this;
        a2.I.J().J((vL)b2);
    }
}

