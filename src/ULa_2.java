/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  Gg
 *  UZ
 *  aKa
 *  kta
 *  pqa
 *  ska
 *  vL
 *  vRa
 */
public final class ULa_2
extends ska {
    private int k;
    private vL j;
    private int J;
    private UZ I;

    public void d() {
        int a2;
        ULa_2 uLa_2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < ERa.C) {
            ULa_2 uLa_22 = uLa_2;
            double d2 = uLa_22.R.nextFloat() * kta.v - pqa.r;
            double d3 = uLa_22.R.nextFloat() * kta.v - pqa.r;
            double d4 = uLa_22.R.nextFloat() * kta.v - pqa.r;
            double d5 = d2;
            double d6 = d3;
            double d7 = d4;
            if (d5 * d5 + d6 * d6 + d7 * d7 <= oua.i) {
                ULa_2 uLa_23 = uLa_2;
                double d8 = uLa_23.j.la + d2 * (double)uLa_2.j.F / FPa.T;
                ULa_2 uLa_24 = uLa_2;
                double d9 = uLa_23.j.J().j + (double)(uLa_24.j.u / kta.v) + d3 * (double)uLa_2.j.u / FPa.T;
                double d10 = uLa_24.j.A + d4 * (double)uLa_2.j.F / FPa.T;
                uLa_23.j.J(uLa_2.I, uSa.E != 0, d8, d9, d10, d2, d3 + iSa.P, d4, new int[uSa.E]);
            }
            n2 = ++a2;
        }
        ULa_2 uLa_25 = uLa_2;
        uLa_25.k += vRa.d;
        if (uLa_25.k >= uLa_2.J) {
            uLa_2.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public ULa_2(Gg gg2, vL vL2, UZ uZ) {
        void a2;
        void c2;
        ULa_2 d2 = vL2;
        ULa_2 b2 = this;
        super((Gg)c2, ((vL)d2).la, d2.J().j + (double)(((vL)d2).u / kta.v), ((vL)d2).A, ((vL)d2).i, ((vL)d2).Ea, ((vL)d2).f);
        b2.j = d2;
        b2.J = yRa.d;
        b2.I = a2;
        b2.d();
    }

    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f7;
        ULa_2 a2 = this;
    }

    public int J() {
        return yRa.d;
    }
}

