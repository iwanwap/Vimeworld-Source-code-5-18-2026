/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Wsa
 *  XTa
 *  Zta
 *  bpa
 *  dpa
 *  hqa
 *  lqa
 *  pqa
 *  ska
 *  vRa
 */
public final class BNa
extends ska {
    public void d() {
        BNa a2;
        BNa bNa2 = a2;
        bNa2.c = bNa2.la;
        bNa2.ba = bNa2.Z;
        bNa2.r = bNa2.A;
        int n2 = bNa2.D;
        bNa2.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        BNa bNa3 = a2;
        BNa bNa4 = a2;
        bNa3.M(XTa.W - bNa4.D * Yqa.i / a2.A);
        bNa3.J(bNa4.Ea + Wsa.I);
        bNa3.J(bNa3.i, a2.Ea, a2.f);
        bNa3.f(bNa3.i * hqa.l);
        bNa3.J(bNa3.Ea * hqa.l);
        bNa3.l(bNa3.f * hqa.l);
        if (bNa3.ha) {
            BNa bNa5 = a2;
            bNa5.f(bNa5.i * dpa.X);
            bNa5.l(bNa5.f * dpa.X);
        }
    }

    /*
     * WARNING - void declaration
     */
    public BNa(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        BNa g;
        BNa h = gg2;
        BNa bNa2 = g = this;
        BNa bNa3 = g;
        super((Gg)h, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        bNa3.f((double)(c2 + (Math.random() * KPa.y - oua.i) * ySa.Ja));
        bNa2.J((double)(b2 + (Math.random() * KPa.y - oua.i) * ySa.Ja));
        bNa2.l((double)(a2 + (Math.random() * KPa.y - oua.i) * ySa.Ja));
        g.a = g.J = g.R.nextFloat() * bpa.K + ZSa.q;
        g.l = g.J;
        g.f = g.R.nextFloat() * g.R.nextFloat() * lqa.ga + pqa.r;
        g.A = (int)(Zta.ba / ((double)g.R.nextFloat() * Jra.A + iSa.P)) + uqa.g;
    }
}

