/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Oz
 *  XTa
 *  aKa
 *  dpa
 *  pqa
 *  ska
 *  vL
 *  vRa
 *  wOa
 */
public final class Zja
extends ska {
    public float I;

    /*
     * WARNING - void declaration
     */
    public Zja(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        Zja h = gg2;
        Zja g = this;
        g((Gg)h, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2, pqa.r);
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
        void g;
        void f8;
        Zja h;
        Zja i22 = aKa2;
        Zja zja2 = h = this;
        float i22 = ((float)h.D + f8) / (float)h.A * Ura.m;
        i22 = Oz.J((float)i22, (float)JPa.N, (float)pqa.r);
        zja2.f = zja2.I * i22;
        super.J((aKa)i22, (vL)g, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    public void d() {
        Zja a2;
        Zja zja2 = a2;
        zja2.c = zja2.la;
        zja2.ba = zja2.Z;
        zja2.r = zja2.A;
        int n2 = zja2.D;
        zja2.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        Zja zja3 = a2;
        Zja zja4 = a2;
        zja3.M(XTa.W - zja4.D * Yqa.i / a2.A);
        zja3.J(zja4.Ea - mPa.ia);
        zja3.J(zja3.i, a2.Ea, a2.f);
        zja3.f(zja3.i * hQa.h);
        zja3.J(zja3.Ea * hQa.h);
        zja3.l(zja3.f * hQa.h);
        if (zja3.ha) {
            Zja zja5 = a2;
            zja5.f(zja5.i * dpa.X);
            zja5.l(zja5.f * dpa.X);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Zja(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        void i2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f3;
        void g;
        void h;
        Zja a2;
        float f4 = f2;
        Zja zja2 = a2 = this;
        super((Gg)h, (double)g, (double)f3, (double)e2, (double)d8, (double)c2, (double)b2);
        zja2.f(zja2.i * Tqa.Ia);
        zja2.J(zja2.Ea * Tqa.Ia);
        zja2.l(zja2.f * Tqa.Ia);
        zja2.f(zja2.i + d8);
        zja2.J(zja2.Ea + c2);
        zja2.l(zja2.f + b2);
        zja2.a = zja2.J = pqa.r - (float)(Math.random() * osa.b);
        zja2.l = zja2.J;
        Zja zja3 = a2;
        zja3.f *= wOa.w;
        zja3.f *= i2;
        zja3.I = zja3.f;
        zja3.A = (int)(Wqa.Z / (Math.random() * Jra.A + iSa.P));
        zja3.A = (int)((float)zja3.A * i2);
        zja3.Ma = uSa.E;
    }
}

