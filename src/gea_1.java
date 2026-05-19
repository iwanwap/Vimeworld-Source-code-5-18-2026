/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Mda
 *  NCa
 *  NTa
 *  Oz
 *  URa
 *  UZ
 *  Waa
 *  XTa
 *  Xsa
 *  aQa
 *  kta
 *  pqa
 *  psa
 *  vL
 *  vQa
 *  vRa
 *  ysa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gea_1
extends vL {
    private int J;
    private int A;

    public void J(Waa waa2) {
        gea_1 b2 = waa2;
        gea_1 a2 = this;
        gea_1 gea_12 = b2;
        a2.J = b2.J(ysa.Y);
        a2.A = gea_12.J(Fua.j);
        b2 = gea_12.J(Vra.E);
        if (b2 != null && (b2 = Mda.J((Waa)b2)) != null) {
            a2.aa.J(Yqa.i, b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(byte by2) {
        void a2;
        gea_1 gea_12 = this;
        if (a2 == yta.Ka && gea_12.j.e) {
            gea_1 b2 = gea_12.aa.J(Yqa.i);
            Waa waa2 = null;
            if (b2 != null && b2.M()) {
                waa2 = b2.J().J(URa.O);
            }
            gea_1 gea_13 = gea_12;
            gea_13.j.J(gea_13.la, gea_12.Z, (double)gea_12.A, gea_12.i, gea_12.Ea, gea_12.f, waa2);
        }
        super.J((byte)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void d(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        gea_1 gea_12;
        gea_1 gea_13 = gea_12 = this;
        gea_12.f((double)c2);
        gea_13.J((double)b2);
        gea_13.l((double)a2);
        if (gea_13.o == JPa.N && gea_12.s == JPa.N) {
            void v1 = c2;
            void v2 = a2;
            float d5 = Oz.J((double)(v1 * v1 + v2 * v2));
            gea_1 gea_14 = gea_12;
            gea_14.s = gea_14.X = (float)(Oz.f((double)c2, (double)a2) * kta.Da / lQa.f);
            gea_1 gea_15 = gea_12;
            gea_15.o = gea_15.d = (float)(Oz.f((double)b2, (double)d5) * kta.Da / lQa.f);
        }
    }

    public int J(float f2) {
        float b2 = f2;
        gea_1 a2 = this;
        return super.J(b2);
    }

    public boolean I() {
        return uSa.E != 0;
    }

    public void d() {
        gea_1 gea_12;
        gea_1 gea_13 = gea_12 = this;
        gea_1 gea_14 = gea_13;
        gea_13.V = gea_13.la;
        gea_13.Ga = gea_13.Z;
        gea_13.Ca = gea_13.A;
        super.d();
        gea_13.f(gea_13.i * WOa.j);
        gea_13.l(gea_13.f * WOa.j);
        gea_13.J(gea_13.Ea + fta.F);
        gea_13.J(gea_13.i, gea_12.Ea, gea_12.f);
        float a2 = Oz.J((double)(gea_13.i * gea_12.i + gea_12.f * gea_12.f));
        gea_13.X = (float)(Oz.f((double)gea_13.i, (double)gea_12.f) * kta.Da / lQa.f);
        gea_13.d = (float)(Oz.f((double)gea_13.Ea, (double)a2) * kta.Da / lQa.f);
        while (gea_14.d - gea_12.o < xua.V) {
            gea_1 gea_15 = gea_12;
            gea_14 = gea_15;
            gea_15.o -= CRa.ja;
        }
        gea_1 gea_16 = gea_12;
        while (gea_16.d - gea_12.o >= Hra.Ga) {
            gea_1 gea_17 = gea_12;
            gea_16 = gea_17;
            gea_17.o += CRa.ja;
        }
        gea_1 gea_18 = gea_12;
        while (gea_18.X - gea_12.s < xua.V) {
            gea_1 gea_19 = gea_12;
            gea_18 = gea_19;
            gea_19.s -= CRa.ja;
        }
        gea_1 gea_110 = gea_12;
        while (gea_110.X - gea_12.s >= Hra.Ga) {
            gea_1 gea_111 = gea_12;
            gea_110 = gea_111;
            gea_111.s += CRa.ja;
        }
        gea_1 gea_112 = gea_12;
        gea_1 gea_113 = gea_12;
        gea_112.d = gea_112.o + (gea_113.d - gea_12.o) * psa.N;
        gea_1 gea_114 = gea_12;
        gea_112.X = gea_113.s + (gea_114.X - gea_114.s) * psa.N;
        if (gea_112.J == 0 && !gea_12.c()) {
            gea_12.j.J((vL)gea_12, tTa.f, vQa.q, pqa.r);
        }
        gea_1 gea_115 = gea_12;
        gea_115.J += vRa.d;
        if (gea_115.j.e && gea_12.J % uqa.g < uqa.g) {
            gea_12.j.J(UZ.FIREWORKS_SPARK, gea_12.la, gea_12.Z - aQa.r, (double)gea_12.A, gea_12.R.nextGaussian() * fPa.ca, -gea_12.Ea * kTa.B, gea_12.R.nextGaussian() * fPa.ca, new int[uSa.E]);
        }
        if (!gea_12.j.e) {
            gea_1 gea_116 = gea_12;
            if (gea_116.J > gea_116.A) {
                gea_1 gea_117 = gea_12;
                gea_12.j.J((vL)gea_117, (byte)yta.Ka);
                gea_117.k();
            }
        }
    }

    public boolean J(double a2) {
        if (a2 < Psa.t) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        void a2;
        gea_1 gea_12 = this;
        void v0 = a2;
        v0.J(ysa.Y, gea_12.J);
        gea_1 gea_13 = gea_12;
        v0.J(Fua.j, gea_13.A);
        Mda mda2 = gea_13.aa.J(Yqa.i);
        if (mda2 != null) {
            gea_1 b2 = new Waa();
            mda2.J((Waa)b2);
            a2.J(Vra.E, (NCa)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public gea_1(Gg gg2, double d2, double d3, double d4, Mda mda2) {
        gea_1 f2;
        void b2;
        void c2;
        void d5;
        void e22;
        gea_1 a2;
        gea_1 gea_12 = gea_13;
        gea_1 gea_13 = mda2;
        gea_1 gea_14 = a2 = gea_12;
        super((Gg)e22);
        a2.J = uSa.E;
        gea_14.l(rta.o, rta.o);
        gea_14.l((double)d5, (double)c2, (double)b2);
        int e22 = vRa.d;
        if (f2 != null && f2.M()) {
            gea_1 gea_15 = f2;
            a2.aa.J(Yqa.i, gea_15);
            f2 = gea_15.J().J(URa.O);
            if (f2 != null) {
                e22 += f2.J(Xsa.U);
            }
        }
        gea_1 gea_16 = a2;
        gea_16.f(gea_16.R.nextGaussian() * DPa.Ia);
        gea_16.l(gea_16.R.nextGaussian() * DPa.Ia);
        gea_16.J(fPa.ca);
        gea_16.A = NTa.C * e22 + a2.R.nextInt(uua.p) + a2.R.nextInt(XTa.W);
    }

    public void J() {
        gea_1 a2;
        a2.aa.J(Yqa.i, tTa.h);
    }

    public float J(float f2) {
        float b2 = f2;
        gea_1 a2 = this;
        return super.J(b2);
    }

    public gea_1(Gg gg2) {
        gea_1 a2;
        gea_1 b2 = gg2;
        gea_1 gea_12 = a2 = this;
        super((Gg)b2);
        gea_12.l(rta.o, rta.o);
    }
}

