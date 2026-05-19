/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  JPa
 *  Mda
 *  Oz
 *  UZ
 *  Waa
 *  YSa
 *  aQa
 *  jFa
 *  kqa
 *  kta
 *  pqa
 *  psa
 *  uQa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tDa_3
extends vL {
    private double M;
    private double k;
    private boolean j;
    private int A;
    private double I;

    public void J(Waa object) {
        tDa_3 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void f(XF xF2) {
        tDa_3 tDa_32;
        float f2;
        void a22;
        tDa_3 tDa_33 = this;
        void v0 = a22;
        double d2 = v0.getX();
        int a22 = v0.getY();
        double d3 = v0.getZ();
        double d4 = d2 - tDa_33.la;
        double d5 = d3 - tDa_33.A;
        double d6 = d4;
        double d7 = d5;
        float b2 = Oz.J((double)(d6 * d6 + d7 * d7));
        if (f2 > Fua.Y) {
            tDa_3 tDa_34 = tDa_33;
            tDa_32 = tDa_34;
            tDa_34.k = tDa_34.la + d4 / (double)b2 * hQa.x;
            tDa_34.I = tDa_34.A + d5 / (double)b2 * hQa.x;
            tDa_34.M = tDa_34.Z + Wqa.Z;
        } else {
            tDa_32 = tDa_33;
            tDa_3 tDa_35 = tDa_33;
            tDa_33.k = d2;
            tDa_35.M = a22;
            tDa_35.I = d3;
        }
        tDa_32.A = uSa.E;
        tDa_33.j = tDa_33.R.nextInt(tTa.h) > 0 ? vRa.d : uSa.E;
    }

    public void J() {
    }

    public int J(float f2) {
        float b2 = f2;
        tDa_3 a2 = this;
        return YSa.L;
    }

    public void f(Waa object) {
        tDa_3 b2 = object;
        object = this;
    }

    public boolean J(double a2) {
        tDa_3 b2;
        double d2 = b2.J().J() * FPa.T;
        if (Double.isNaN(d2)) {
            d2 = FPa.T;
        }
        double d3 = d2 *= ypa.X;
        if (a2 < d3 * d3) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean I() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public tDa_3(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        tDa_3 d5;
        tDa_3 e2 = gg2;
        tDa_3 tDa_32 = d5 = this;
        super((Gg)e2);
        d5.A = uSa.E;
        tDa_32.l(rta.o, rta.o);
        tDa_32.l((double)c2, (double)b2, (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void d(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        tDa_3 tDa_32;
        tDa_3 tDa_33 = tDa_32 = this;
        tDa_32.f((double)c2);
        tDa_33.J((double)b2);
        tDa_33.l((double)a2);
        if (tDa_33.o == JPa.N && tDa_32.s == JPa.N) {
            void v1 = c2;
            void v2 = a2;
            float d5 = Oz.J((double)(v1 * v1 + v2 * v2));
            tDa_3 tDa_34 = tDa_32;
            tDa_34.s = tDa_34.X = (float)(Oz.f((double)c2, (double)a2) * kta.Da / lQa.f);
            tDa_3 tDa_35 = tDa_32;
            tDa_35.o = tDa_35.d = (float)(Oz.f((double)b2, (double)d5) * kta.Da / lQa.f);
        }
    }

    public tDa_3(Gg gg2) {
        tDa_3 a2;
        tDa_3 b2 = gg2;
        tDa_3 tDa_32 = a2 = this;
        super((Gg)b2);
        tDa_32.l(rta.o, rta.o);
    }

    public float J(float f2) {
        float b2 = f2;
        tDa_3 a2 = this;
        return pqa.r;
    }

    public void d() {
        tDa_3 tDa_32;
        tDa_3 tDa_33 = tDa_32 = this;
        tDa_3 tDa_34 = tDa_33;
        tDa_33.V = tDa_33.la;
        tDa_33.Ga = tDa_33.Z;
        tDa_33.Ca = tDa_33.A;
        super.d();
        tDa_33.la += tDa_32.i;
        tDa_33.Z += tDa_32.Ea;
        tDa_33.A += tDa_32.f;
        float a2 = Oz.J((double)(tDa_33.i * tDa_32.i + tDa_32.f * tDa_32.f));
        tDa_33.X = (float)(Oz.f((double)tDa_33.i, (double)tDa_32.f) * kta.Da / lQa.f);
        tDa_33.d = (float)(Oz.f((double)tDa_33.Ea, (double)a2) * kta.Da / lQa.f);
        while (tDa_34.d - tDa_32.o < xua.V) {
            tDa_3 tDa_35 = tDa_32;
            tDa_34 = tDa_35;
            tDa_35.o -= CRa.ja;
        }
        tDa_3 tDa_36 = tDa_32;
        while (tDa_36.d - tDa_32.o >= Hra.Ga) {
            tDa_3 tDa_37 = tDa_32;
            tDa_36 = tDa_37;
            tDa_37.o += CRa.ja;
        }
        tDa_3 tDa_38 = tDa_32;
        while (tDa_38.X - tDa_32.s < xua.V) {
            tDa_3 tDa_39 = tDa_32;
            tDa_38 = tDa_39;
            tDa_39.s -= CRa.ja;
        }
        tDa_3 tDa_310 = tDa_32;
        while (tDa_310.X - tDa_32.s >= Hra.Ga) {
            tDa_3 tDa_311 = tDa_32;
            tDa_310 = tDa_311;
            tDa_311.s += CRa.ja;
        }
        tDa_3 tDa_312 = tDa_32;
        tDa_3 tDa_313 = tDa_32;
        tDa_312.d = tDa_312.o + (tDa_313.d - tDa_32.o) * psa.N;
        tDa_3 tDa_314 = tDa_32;
        tDa_312.X = tDa_313.s + (tDa_314.X - tDa_314.s) * psa.N;
        if (!tDa_312.j.e) {
            tDa_3 tDa_315 = tDa_32;
            double d2 = tDa_32.k - tDa_315.la;
            double d3 = tDa_315.I - tDa_32.A;
            double d4 = d2;
            double d5 = d3;
            float f2 = (float)Math.sqrt(d4 * d4 + d5 * d5);
            float f3 = (float)Oz.f((double)d3, (double)d2);
            d3 = (double)a2 + (double)(f2 - a2) * uQa.H;
            if (f2 < pqa.r) {
                d3 *= Jra.A;
                tDa_3 tDa_316 = tDa_32;
                tDa_316.J(tDa_316.Ea * Jra.A);
            }
            tDa_3 tDa_317 = tDa_32;
            tDa_317.f(Math.cos(f3) * d3);
            tDa_317.l(Math.sin(f3) * d3);
            tDa_3 tDa_318 = tDa_32;
            if (tDa_32.Z < tDa_32.M) {
                tDa_318.J(tDa_32.Ea + (oua.i - tDa_32.Ea) * xTa.Ha);
            } else {
                tDa_318.J(tDa_32.Ea + (pqa.q - tDa_32.Ea) * xTa.Ha);
            }
        }
        float f4 = rta.o;
        if (tDa_32.L()) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < AQa.P) {
                int n4 = 3 >> 1;
                tDa_32.j.J(UZ.WATER_BUBBLE, tDa_32.la - tDa_32.i * (double)f4, tDa_32.Z - tDa_32.Ea * (double)f4, (double)(tDa_32.A - tDa_32.f * (double)f4), tDa_32.i, tDa_32.Ea, tDa_32.f, new int[uSa.E]);
                n3 = ++n2;
            }
        } else {
            tDa_32.j.J(UZ.PORTAL, tDa_32.la - tDa_32.i * (double)f4 + tDa_32.R.nextDouble() * oQa.fa - aQa.r, tDa_32.Z - tDa_32.Ea * (double)f4 - kTa.B, (double)(tDa_32.A - tDa_32.f * (double)f4 + tDa_32.R.nextDouble() * oQa.fa - aQa.r), tDa_32.i, tDa_32.Ea, tDa_32.f, new int[uSa.E]);
        }
        if (!tDa_32.j.e) {
            tDa_3 tDa_319 = tDa_32;
            tDa_3 tDa_320 = tDa_32;
            tDa_320.l(tDa_319.la, tDa_320.Z, tDa_32.A);
            tDa_319.A += vRa.d;
            if (tDa_319.A > Fua.J && !tDa_32.j.e) {
                tDa_3 tDa_321 = tDa_32;
                tDa_321.k();
                tDa_3 tDa_322 = tDa_32;
                if (tDa_321.j) {
                    tDa_3 tDa_323 = tDa_32;
                    tDa_322.j.f((vL)new jFa((Gg)tDa_323.j, tDa_323.la, tDa_32.Z, (double)tDa_32.A, new Mda(Gea.da)));
                    return;
                }
                tDa_322.j.f(kqa.W, new XF(tDa_32), uSa.E);
            }
        }
    }
}

