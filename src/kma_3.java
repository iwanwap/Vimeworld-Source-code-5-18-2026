/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Oz
 *  XTa
 *  aKa
 *  aQa
 *  aSa
 *  dpa
 *  pqa
 *  ska
 *  vL
 *  vRa
 *  wOa
 */
public final class kma_3
extends ska {
    public float I;

    /*
     * WARNING - void declaration
     */
    public kma_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        kma_3 g2;
        kma_3 h22 = gg2;
        kma_3 kma_32 = g2 = this;
        super((Gg)h22, (double)f2, (double)e2, (double)d8, aSa.V, aSa.V, aSa.V);
        float h22 = MTa.y;
        kma_32.f(kma_32.i * Tqa.Ia);
        kma_32.J(kma_32.Ea * Tqa.Ia);
        kma_32.l(kma_32.f * Tqa.Ia);
        kma_32.f(kma_32.i + c2);
        kma_32.J(kma_32.Ea + b2);
        kma_32.l(kma_32.f + a2);
        kma_32.a = kma_32.J = pqa.r - (float)(Math.random() * osa.b);
        kma_32.l = kma_32.J;
        kma_3 kma_33 = g2;
        kma_33.f *= wOa.w;
        kma_33.f *= h22;
        kma_33.I = kma_33.f;
        kma_33.A = (int)(Wqa.Z / (Math.random() * Jra.A + aQa.r));
        kma_33.A = (int)((float)kma_33.A * h22);
        kma_33.Ma = uSa.E;
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
        kma_3 h2;
        kma_3 i22 = aKa2;
        kma_3 kma_32 = h2 = this;
        float i22 = ((float)h2.D + f8) / (float)h2.A * Ura.m;
        i22 = Oz.J((float)i22, (float)JPa.N, (float)pqa.r);
        kma_32.f = kma_32.I * i22;
        super.J((aKa)i22, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    public void d() {
        kma_3 kma_32;
        kma_3 kma_33 = kma_32 = this;
        kma_33.c = kma_33.la;
        kma_33.ba = kma_33.Z;
        kma_33.r = kma_33.A;
        int n2 = kma_33.D;
        kma_33.D = n2 + vRa.d;
        if (n2 >= kma_32.A) {
            kma_32.k();
        }
        kma_3 kma_34 = kma_32;
        kma_3 kma_35 = kma_32;
        kma_35.M(XTa.W - kma_32.D * Yqa.i / kma_35.A);
        kma_3 kma_36 = kma_32;
        kma_36.J(kma_34.i, kma_36.Ea, kma_32.f);
        kma_34.f(kma_34.i * DPa.r);
        kma_34.J(kma_34.Ea * DPa.r);
        kma_34.l(kma_34.f * DPa.r);
        Object a2 = kma_34.j.J((vL)kma_32, KPa.y);
        if (a2 != null && kma_32.Z > a2.J().j) {
            kma_3 kma_37 = kma_32;
            kma_37.Z += (a2.J().j - kma_32.Z) * iSa.P;
            kma_37.J(kma_37.Ea + (((Sx)((Object)a2)).Ea - kma_32.Ea) * iSa.P);
            kma_37.l(kma_37.la, kma_32.Z, kma_32.A);
        }
        if (kma_32.ha) {
            kma_3 kma_38 = kma_32;
            kma_38.f(kma_38.i * dpa.X);
            kma_38.l(kma_38.f * dpa.X);
        }
    }
}

