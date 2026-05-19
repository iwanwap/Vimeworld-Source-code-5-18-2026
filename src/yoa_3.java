/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MQa
 *  psa
 *  ska
 *  vQa
 *  vRa
 */
public final class yoa_3
extends ska {
    /*
     * WARNING - void declaration
     */
    public yoa_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        yoa_3 g2;
        yoa_3 h2 = gg2;
        yoa_3 yoa_32 = g2 = this;
        super((Gg)h2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        yoa_32.l = h2 = yoa_32.R.nextFloat() * Nra.e + psa.N;
        yoa_32.a = h2;
        yoa_32.J = h2;
        yoa_32.M(uSa.E);
        yoa_32.l(WRa.e, WRa.e);
        yoa_32.f *= g2.R.nextFloat() * Ora.D + MQa.L;
        yoa_32.f(yoa_32.i * lQa.l);
        yoa_32.J(yoa_32.Ea * lQa.l);
        yoa_32.l(yoa_32.f * lQa.l);
        yoa_32.A = (int)(vQa.c / (Math.random() * Jra.A + iSa.P));
        yoa_32.Ma = vRa.d;
    }

    public void d() {
        yoa_3 a2;
        yoa_3 yoa_32 = a2;
        yoa_32.c = yoa_32.la;
        yoa_32.ba = yoa_32.Z;
        yoa_32.r = yoa_32.A;
        yoa_32.J(yoa_32.i, a2.Ea, a2.f);
        yoa_32.f(yoa_32.i * gsa.d);
        yoa_32.J(yoa_32.Ea * gsa.d);
        yoa_32.l(yoa_32.f * gsa.d);
        int n2 = yoa_32.A;
        yoa_32.A = n2 - vRa.d;
        if (n2 <= 0) {
            a2.k();
        }
    }
}

