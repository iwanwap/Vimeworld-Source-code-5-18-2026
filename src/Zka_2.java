/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import java.util.Random;

public final class Zka_2
extends ska {
    private int J;
    private static final Random I = new Random();

    /*
     * WARNING - void declaration
     */
    public Zka_2(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void c2;
        void b2;
        void d8;
        void e2;
        void f2;
        Zka_2 g2;
        Zka_2 h2 = gg2;
        Zka_2 zka_2 = g2 = this;
        super((Gg)h2, (double)f2, (double)e2, (double)d8, kTa.B - I.nextDouble(), (double)b2, kTa.B - I.nextDouble());
        zka_2.J = XOa.h;
        zka_2.J(zka_2.Ea * Bua.Ia);
        if (c2 == aSa.V && a2 == aSa.V) {
            Zka_2 zka_22 = g2;
            zka_22.f(zka_22.i * Tqa.Ia);
            zka_22.l(zka_22.f * Tqa.Ia);
        }
        g2.f *= wOa.w;
        g2.A = (int)(Wqa.Z / (Math.random() * Jra.A + iSa.P));
        g2.Ma = uSa.E;
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
        void h2;
        Zka_2 f8;
        float i2 = f2;
        Zka_2 zka_2 = f8 = this;
        Oz.J((float)(((float)f8.D + i2) / (float)zka_2.A * Ura.m), (float)JPa.N, (float)pqa.r);
        super.J((aKa)h2, (vL)g2, i2, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    public void i(int n2) {
        int b2 = n2;
        Zka_2 a2 = this;
        a2.J = b2;
    }

    public void d() {
        Zka_2 a2;
        Zka_2 zka_2 = a2;
        zka_2.c = zka_2.la;
        zka_2.ba = zka_2.Z;
        zka_2.r = zka_2.A;
        int n2 = zka_2.D;
        zka_2.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        Zka_2 zka_22 = a2;
        Zka_2 zka_23 = a2;
        zka_23.M(zka_22.J + (XTa.W - zka_23.D * Yqa.i / a2.A));
        zka_22.J(zka_22.Ea + Wsa.I);
        zka_22.J(zka_22.i, a2.Ea, a2.f);
        if (zka_22.Z == a2.ba) {
            Zka_2 zka_24 = a2;
            zka_24.f(zka_24.i * Yra.f);
            zka_24.l(zka_24.f * Yra.f);
        }
        Zka_2 zka_25 = a2;
        zka_25.f(zka_25.i * DPa.r);
        zka_25.J(zka_25.Ea * DPa.r);
        zka_25.l(zka_25.f * DPa.r);
        if (zka_25.ha) {
            Zka_2 zka_26 = a2;
            zka_26.f(zka_26.i * dpa.X);
            zka_26.l(zka_26.f * dpa.X);
        }
    }
}

