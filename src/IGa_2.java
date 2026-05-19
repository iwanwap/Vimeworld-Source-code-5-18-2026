/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  LC
 *  MQa
 *  Oz
 *  Yfa
 *  gFa
 *  pqa
 *  pua
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IGa_2
extends gFa {
    private double E;
    private float m;
    private float C;
    private int i;
    private Gl M;
    private int k;
    private int j;
    private final LC J;
    private int A;
    private final Yfa I;

    /*
     * WARNING - void declaration
     */
    public IGa_2(LC lC2, double d2, int n2, int n3, float f2) {
        void f3;
        void b2;
        void c2;
        void d3;
        void e2;
        float f4 = f2;
        IGa_2 a2 = this;
        a2.A = pua.o;
        if (!(e2 instanceof Gl)) {
            throw new IllegalArgumentException(MQa.P);
        }
        a2.J = e2;
        a2.I = (Yfa)a2.J;
        IGa_2 iGa_2 = a2;
        a2.E = d3;
        iGa_2.j = c2;
        iGa_2.k = b2;
        a2.C = f3;
        a2.m = f3 * f3;
        a2.J(yRa.d);
    }

    public boolean f() {
        IGa_2 iGa_2 = this;
        IGa_2 a2 = iGa_2.I.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        iGa_2.M = a2;
        return vRa.d != 0;
    }

    public void J() {
        IGa_2 a2;
        IGa_2 iGa_2 = a2;
        iGa_2.M = null;
        iGa_2.i = uSa.E;
        iGa_2.A = pua.o;
    }

    public void f() {
        IGa_2 iGa_2;
        double d2;
        IGa_2 iGa_22;
        IGa_2 iGa_23 = iGa_22 = this;
        double d3 = iGa_22.I.f(iGa_23.M.la, iGa_22.M.J().j, iGa_22.M.A);
        boolean a22 = iGa_23.I.J().J((vL)iGa_22.M);
        if (a22) {
            d2 = d3;
            iGa_22.i += vRa.d;
        } else {
            iGa_22.i = uSa.E;
            d2 = d3;
        }
        if (d2 <= (double)iGa_22.m && iGa_22.i >= kTa.j) {
            IGa_2 iGa_24 = iGa_22;
            iGa_2 = iGa_24;
            iGa_24.I.J().f();
        } else {
            IGa_2 iGa_25 = iGa_22;
            iGa_2 = iGa_25;
            IGa_2 iGa_26 = iGa_22;
            iGa_25.I.J().J((vL)iGa_26.M, iGa_26.E);
        }
        iGa_2.I.J().J((vL)iGa_22.M, NSa.B, NSa.B);
        if ((iGa_22.A -= vRa.d) == 0) {
            if (d3 > (double)iGa_22.m || !a22) {
                return;
            }
            float f2 = Oz.J((double)d3) / iGa_22.C;
            float a22 = Oz.J((float)f2, (float)Nra.e, (float)pqa.r);
            iGa_22.J.J(iGa_22.M, a22);
            IGa_2 iGa_27 = iGa_22;
            iGa_22.A = Oz.J((float)(f2 * (float)(iGa_27.k - iGa_27.j) + (float)iGa_22.j));
            return;
        }
        if (iGa_22.A < 0) {
            float f3 = Oz.J((double)d3) / iGa_22.C;
            iGa_22.A = Oz.J((float)(f3 * (float)(iGa_22.k - iGa_22.j) + (float)iGa_22.j));
        }
    }

    /*
     * WARNING - void declaration
     */
    public IGa_2(LC lC2, double d2, int n2, float f2) {
        void e2;
        void c2;
        void d3;
        void b2;
        float f3 = f2;
        IGa_2 a2 = this;
        void v0 = b2;
        a2((LC)d3, (double)c2, (int)v0, (int)v0, (float)e2);
    }

    public boolean l() {
        IGa_2 a2;
        if (a2.f() || !a2.I.J().f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

