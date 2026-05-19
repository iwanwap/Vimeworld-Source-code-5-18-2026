/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ana
 *  Gg
 *  JPa
 *  Oz
 *  Wsa
 *  XTa
 *  Yra
 *  aKa
 *  aSa
 *  dpa
 *  pqa
 *  ska
 *  vL
 *  vRa
 *  wOa
 */
public class jMa_1
extends ska {
    public float I;

    /*
     * WARNING - void declaration
     */
    private jMa_1(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        jMa_1 h2 = gg2;
        jMa_1 g2 = this;
        g2((Gg)h2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2, pqa.r);
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
        jMa_1 h2;
        jMa_1 i22 = aKa2;
        jMa_1 jMa_12 = h2 = this;
        float i22 = ((float)h2.D + f8) / (float)h2.A * Ura.m;
        i22 = Oz.J((float)i22, (float)JPa.N, (float)pqa.r);
        jMa_12.f = jMa_12.I * i22;
        super.J((aKa)i22, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    public void d() {
        jMa_1 a2;
        jMa_1 jMa_12 = a2;
        jMa_12.c = jMa_12.la;
        jMa_12.ba = jMa_12.Z;
        jMa_12.r = jMa_12.A;
        int n2 = jMa_12.D;
        jMa_12.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        jMa_1 jMa_13 = a2;
        jMa_1 jMa_14 = a2;
        jMa_13.M(XTa.W - jMa_14.D * Yqa.i / a2.A);
        jMa_13.J(jMa_14.Ea + Wsa.I);
        jMa_13.J(jMa_13.i, a2.Ea, a2.f);
        if (jMa_13.Z == a2.ba) {
            jMa_1 jMa_15 = a2;
            jMa_15.f(jMa_15.i * Yra.f);
            jMa_15.l(jMa_15.f * Yra.f);
        }
        jMa_1 jMa_16 = a2;
        jMa_16.f(jMa_16.i * DPa.r);
        jMa_16.J(jMa_16.Ea * DPa.r);
        jMa_16.l(jMa_16.f * DPa.r);
        if (jMa_16.ha) {
            jMa_1 jMa_17 = a2;
            jMa_17.f(jMa_17.i * dpa.X);
            jMa_17.l(jMa_17.f * dpa.X);
        }
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ jMa_1(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7, Ana ana) {
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        jMa_1 i2 = gg2;
        jMa_1 h2 = this;
        h2((Gg)i2, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2);
    }

    /*
     * WARNING - void declaration
     */
    public jMa_1(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        void i2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f3;
        void g2;
        void h2;
        jMa_1 a2;
        float f4 = f2;
        jMa_1 jMa_12 = a2 = this;
        super((Gg)h2, (double)g2, (double)f3, (double)e2, aSa.V, aSa.V, aSa.V);
        jMa_12.f(jMa_12.i * Tqa.Ia);
        jMa_12.J(jMa_12.Ea * Tqa.Ia);
        jMa_12.l(jMa_12.f * Tqa.Ia);
        jMa_12.f(jMa_12.i + d8);
        jMa_12.J(jMa_12.Ea + c2);
        jMa_12.l(jMa_12.f + b2);
        jMa_12.a = jMa_12.J = (float)(Math.random() * osa.b);
        jMa_12.l = jMa_12.J;
        jMa_1 jMa_13 = a2;
        jMa_13.f *= wOa.w;
        jMa_13.f *= i2;
        jMa_13.I = jMa_13.f;
        jMa_13.A = (int)(Wqa.Z / (Math.random() * Jra.A + iSa.P));
        jMa_13.A = (int)((float)jMa_13.A * i2);
        jMa_13.Ma = uSa.E;
    }
}

