/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  NTa
 *  XTa
 *  Ypa
 *  aSa
 *  gFa
 *  kta
 *  vL
 *  vRa
 *  yCa
 *  yra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ADa_1
extends gFa {
    public yCa L;
    public bga E;
    public Class<? extends vL> m;
    public double C;
    public Gg i;
    private double M;
    private double k;
    public boolean j;
    public int J;
    private int A;
    private double I;

    public boolean l() {
        ADa_1 aDa_1 = this;
        ADa_1 a2 = aDa_1.E.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (!a2.K()) {
            return uSa.E != 0;
        }
        if (!aDa_1.j) {
            if (!aDa_1.E.J().f()) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return aDa_1.E.J(new XF((vL)a2));
    }

    /*
     * WARNING - void declaration
     */
    public ADa_1(bga bga2, Class<? extends vL> clazz, double d2, boolean bl) {
        void c2;
        void e2;
        void b2;
        void d3;
        boolean bl2 = bl;
        ADa_1 a2 = this;
        a2((bga)d3, (double)b2, (boolean)e2);
        a2.m = c2;
    }

    public double J(Gl gl2) {
        ADa_1 b2 = gl2;
        ADa_1 a2 = this;
        return a2.E.F * kta.v * a2.E.F * kta.v + ((Gl)b2).F;
    }

    /*
     * WARNING - void declaration
     */
    public ADa_1(bga bga2, double d2, boolean bl) {
        void a2;
        void b2;
        ADa_1 c2;
        Object d3 = bga2;
        ADa_1 aDa_1 = c2 = this;
        aDa_1.E = d3;
        aDa_1.i = ((bga)((Object)d3)).j;
        c2.C = b2;
        c2.j = a2;
        c2.J(yRa.d);
    }

    public boolean f() {
        ADa_1 aDa_1 = this;
        ADa_1 a2 = aDa_1.E.C();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (!a2.K()) {
            return uSa.E != 0;
        }
        if (aDa_1.m != null && !aDa_1.m.isAssignableFrom(((Object)((Object)a2)).getClass())) {
            return uSa.E != 0;
        }
        ADa_1 aDa_12 = aDa_1;
        aDa_12.L = aDa_12.E.J().J((vL)a2);
        if (aDa_12.L != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        ADa_1 aDa_1;
        ADa_1 aDa_12 = aDa_1 = this;
        ADa_1 a2 = aDa_12.E.C();
        aDa_12.E.J().J((vL)a2, NSa.B, NSa.B);
        double d2 = aDa_12.E.f(((Gl)a2).la, a2.J().j, ((Gl)a2).A);
        double d3 = aDa_12.J((Gl)a2);
        aDa_12.A -= vRa.d;
        if ((aDa_12.j || aDa_1.E.J().J((vL)a2)) && aDa_1.A <= 0 && (aDa_1.I == aSa.V && aDa_1.M == aSa.V && aDa_1.k == aSa.V || a2.f(aDa_1.I, aDa_1.M, aDa_1.k) >= oua.i || aDa_1.E.J().nextFloat() < Yqa.C)) {
            ADa_1 aDa_13;
            ADa_1 aDa_14 = aDa_1;
            ADa_1 aDa_15 = a2;
            aDa_1.I = ((Gl)aDa_15).la;
            aDa_14.M = aDa_15.J().j;
            aDa_14.k = ((Gl)a2).A;
            aDa_1.A = AQa.P + aDa_1.E.J().nextInt(XTa.W);
            if (d2 > yra.Y) {
                ADa_1 aDa_16 = aDa_1;
                aDa_13 = aDa_16;
                aDa_16.A += NTa.C;
            } else {
                if (d2 > ZSa.o) {
                    aDa_1.A += tTa.h;
                }
                aDa_13 = aDa_1;
            }
            if (!aDa_13.E.J().J((vL)a2, aDa_1.C)) {
                aDa_1.A += Ypa.A;
            }
        }
        aDa_1.J = Math.max(aDa_1.J - vRa.d, uSa.E);
        if (d2 <= d3 && aDa_1.J <= 0) {
            aDa_1.J = kTa.j;
            if (aDa_1.E.J() != null) {
                aDa_1.E.u();
            }
            aDa_1.E.C((vL)a2);
        }
    }

    public void J() {
        ADa_1 a2;
        a2.E.J().f();
    }

    public void l() {
        ADa_1 a2;
        ADa_1 aDa_1 = a2;
        a2.E.J().J(aDa_1.L, aDa_1.C);
        a2.A = uSa.E;
    }
}

