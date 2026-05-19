/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Oz
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
public final class fNa
extends ska {
    public float I;

    /*
     * WARNING - void declaration
     */
    public fNa(Gg gg2, double d2, double d3, double d4, float f2, float f3, float f4) {
        void h2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f5;
        void g2;
        float f6 = f4;
        fNa a2 = this;
        a2((Gg)g2, (double)f5, (double)e2, (double)d5, pqa.r, (float)c2, (float)b2, (float)h2);
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
        fNa h2;
        fNa i22 = aKa2;
        fNa fNa2 = h2 = this;
        float i22 = ((float)h2.D + f8) / (float)h2.A * Ura.m;
        i22 = Oz.J((float)i22, (float)JPa.N, (float)pqa.r);
        fNa2.f = fNa2.I * i22;
        super.J((aKa)i22, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public fNa(Gg gg2, double d2, double d3, double d4, float f2, float f3, float f4, float f5) {
        void d5;
        void a2;
        void b2;
        float c2;
        void e2;
        void f6;
        void g2;
        fNa h2;
        fNa i22 = gg2;
        fNa fNa2 = h2 = this;
        super((Gg)i22, (double)g2, (double)f6, (double)e2, aSa.V, aSa.V, aSa.V);
        fNa2.f(fNa2.i * Tqa.Ia);
        fNa2.J(fNa2.Ea * Tqa.Ia);
        fNa2.l(fNa2.f * Tqa.Ia);
        if (c2 == JPa.N) {
            c2 = pqa.r;
        }
        float i22 = (float)Math.random() * Xpa.R + Ora.D;
        fNa fNa3 = h2;
        fNa3.l = ((float)(Math.random() * Bua.Ia) + xSa.la) * c2 * i22;
        fNa3.a = ((float)(Math.random() * Bua.Ia) + xSa.la) * b2 * i22;
        fNa3.J = ((float)(Math.random() * Bua.Ia) + xSa.la) * a2 * i22;
        fNa3.f *= wOa.w;
        fNa3.f *= d5;
        fNa3.I = fNa3.f;
        fNa3.A = (int)(Wqa.Z / (Math.random() * Jra.A + iSa.P));
        fNa3.A = (int)((float)fNa3.A * d5);
        fNa3.Ma = uSa.E;
    }

    public void d() {
        fNa a2;
        fNa fNa2 = a2;
        fNa2.c = fNa2.la;
        fNa2.ba = fNa2.Z;
        fNa2.r = fNa2.A;
        int n2 = fNa2.D;
        fNa2.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        fNa fNa3 = a2;
        fNa fNa4 = a2;
        fNa4.M(XTa.W - a2.D * Yqa.i / fNa4.A);
        fNa fNa5 = a2;
        fNa5.J(fNa3.i, fNa5.Ea, a2.f);
        if (fNa3.Z == a2.ba) {
            fNa fNa6 = a2;
            fNa6.f(fNa6.i * Yra.f);
            fNa6.l(fNa6.f * Yra.f);
        }
        fNa fNa7 = a2;
        fNa7.f(fNa7.i * DPa.r);
        fNa7.J(fNa7.Ea * DPa.r);
        fNa7.l(fNa7.f * DPa.r);
        if (fNa7.ha) {
            fNa fNa8 = a2;
            fNa8.f(fNa8.i * dpa.X);
            fNa8.l(fNa8.f * dpa.X);
        }
    }
}

