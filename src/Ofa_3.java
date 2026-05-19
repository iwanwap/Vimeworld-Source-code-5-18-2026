/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  ISa
 *  JPa
 *  Oz
 *  Yfa
 *  kta
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ofa_3 {
    private double i;
    private double M;
    private boolean k;
    private double j;
    private float J;
    private float A;
    private Yfa I;

    public boolean J() {
        Ofa_3 a2;
        return a2.k;
    }

    public double l() {
        Ofa_3 a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void a2;
        float f5;
        void c2;
        float d2 = f3;
        Ofa_3 b2 = this;
        d2 = Oz.f((float)(d2 - c2));
        if (f5 > a2) {
            d2 = a2;
        }
        if (d2 < -a2) {
            d2 = -a2;
        }
        return (float)(c2 + d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, float f2, float f3) {
        void a2;
        void b2;
        Ofa_3 ofa_3;
        Ofa_3 d2 = vL2;
        Ofa_3 c2 = this;
        Ofa_3 ofa_32 = d2;
        c2.i = ((vL)ofa_32).la;
        if (ofa_32 instanceof Gl) {
            ofa_3 = c2;
            c2.M = ((vL)d2).Z + (double)d2.l();
        } else {
            ofa_3 = c2;
            c2.M = (d2.J().j + d2.J().M) / KPa.y;
        }
        ofa_3.j = ((vL)d2).A;
        Ofa_3 ofa_33 = c2;
        ofa_33.J = b2;
        ofa_33.A = a2;
        ofa_33.k = vRa.d;
    }

    public void J() {
        Ofa_3 ofa_3;
        Ofa_3 a2;
        a2.I.d = JPa.N;
        if (a2.k) {
            Ofa_3 ofa_32 = a2;
            ofa_3 = ofa_32;
            ofa_32.k = uSa.E;
            Ofa_3 ofa_33 = a2;
            double d2 = ofa_32.i - ofa_33.I.la;
            double d3 = ofa_33.M - (a2.I.Z + (double)a2.I.l());
            double d4 = ofa_32.j - a2.I.A;
            double d5 = d2;
            double d6 = d4;
            double d7 = Oz.J((double)(d5 * d5 + d6 * d6));
            float f2 = (float)(Oz.f((double)d4, (double)d2) * kta.Da / lQa.f) - ISa.a;
            float f3 = (float)(-(Oz.f((double)d3, (double)d7) * kta.Da / lQa.f));
            Ofa_3 ofa_34 = a2;
            ofa_32.I.d = ofa_34.J(a2.I.d, f3, ofa_34.A);
            Ofa_3 ofa_35 = a2;
            ofa_32.I.t = ofa_35.J(a2.I.t, f2, ofa_35.J);
        } else {
            Ofa_3 ofa_36 = a2;
            ofa_3 = ofa_36;
            Ofa_3 ofa_37 = a2;
            ofa_36.I.t = ofa_37.J(ofa_36.I.t, ofa_37.I.ba, FRa.Ga);
        }
        float f4 = Oz.f((float)(ofa_3.I.t - a2.I.ba));
        if (!a2.I.J().f()) {
            if (f4 < Bua.D) {
                a2.I.t = a2.I.ba - CRa.d;
            }
            if (f4 > CRa.d) {
                a2.I.t = a2.I.ba + CRa.d;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3) {
        void f4;
        void b2;
        void c2;
        void d5;
        void e2;
        Ofa_3 a2;
        float f5 = f3;
        Ofa_3 ofa_3 = a2 = this;
        Ofa_3 ofa_32 = a2;
        a2.i = e2;
        ofa_32.M = d5;
        ofa_32.j = c2;
        ofa_3.J = b2;
        ofa_3.A = f4;
        ofa_3.k = vRa.d;
    }

    public Ofa_3(Yfa yfa2) {
        Ofa_3 b2 = yfa2;
        Ofa_3 a2 = this;
        a2.I = b2;
    }

    public double f() {
        Ofa_3 a2;
        return a2.M;
    }

    public double J() {
        Ofa_3 a2;
        return a2.j;
    }
}

