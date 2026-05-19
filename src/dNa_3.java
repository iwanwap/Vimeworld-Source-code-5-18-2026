/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Oz
 *  Qqa
 *  Zpa
 *  aKa
 *  aSa
 *  dpa
 *  isa
 *  lPa
 *  pqa
 *  ska
 *  vL
 *  vRa
 *  wOa
 */
public final class dNa_3
extends ska {
    public float I;

    public void d() {
        dNa_3 a2;
        dNa_3 dNa_32 = a2;
        dNa_32.c = dNa_32.la;
        dNa_32.ba = dNa_32.Z;
        dNa_32.r = dNa_32.A;
        int n2 = dNa_32.D;
        dNa_32.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        dNa_3 dNa_33 = a2;
        dNa_3 dNa_34 = a2;
        dNa_34.J(dNa_33.i, dNa_34.Ea, a2.f);
        dNa_33.a = (float)((double)dNa_33.a * isa.K);
        dNa_33.J = (float)((double)dNa_33.J * Tqa.ja);
        dNa_33.f(dNa_33.i * dpa.X);
        dNa_33.J(dNa_33.Ea * dpa.X);
        dNa_33.l(dNa_33.f * dpa.X);
        dNa_33.J(dNa_33.Ea - lQa.l);
        if (dNa_33.ha) {
            dNa_3 dNa_35 = a2;
            dNa_35.f(dNa_35.i * dpa.X);
            dNa_35.l(dNa_35.f * dpa.X);
        }
    }

    /*
     * WARNING - void declaration
     */
    public dNa_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        void i2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f3;
        void g2;
        void h2;
        dNa_3 a2;
        float f4 = f2;
        dNa_3 dNa_32 = a2 = this;
        super((Gg)h2, (double)g2, (double)f3, (double)e2, aSa.V, aSa.V, aSa.V);
        dNa_32.f(dNa_32.i * Tqa.Ia);
        dNa_32.J(dNa_32.Ea * Tqa.Ia);
        dNa_32.l(dNa_32.f * Tqa.Ia);
        dNa_32.f(dNa_32.i + d8 * Qqa.b);
        dNa_32.J(dNa_32.Ea + c2 * Qqa.b);
        dNa_32.l(dNa_32.f + b2 * Qqa.b);
        dNa_32.a = dNa_32.J = (float)(Math.random() * osa.b + Zpa.ca);
        dNa_32.l = dNa_32.J;
        dNa_3 dNa_33 = a2;
        dNa_33.f *= wOa.w;
        dNa_33.f *= i2;
        dNa_33.I = dNa_33.f;
        dNa_33.A = (int)(lPa.K / (Math.random() * Jra.A + oQa.fa));
        dNa_33.A = (int)((float)dNa_33.A * i2);
        dNa_33.Ma = uSa.E;
        dNa_33.M(fPa.ga);
        dNa_33.d();
    }

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        void f8;
        dNa_3 h2;
        dNa_3 i22 = aKa2;
        dNa_3 dNa_32 = h2 = this;
        float i22 = ((float)h2.D + f8) / (float)h2.A * Ura.m;
        i22 = Oz.J((float)i22, (float)JPa.N, (float)pqa.r);
        dNa_32.f = dNa_32.I * i22;
        super.J((aKa)i22, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public dNa_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        dNa_3 h2 = gg2;
        dNa_3 g2 = this;
        g2((Gg)h2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2, pqa.r);
    }
}

