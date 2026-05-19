/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  NQa
 *  QSa
 *  SMa
 *  Uqa
 *  Wsa
 *  XTa
 *  YSa
 *  aKa
 *  aSa
 *  dpa
 *  lqa
 *  pqa
 *  psa
 *  ska
 *  vL
 *  vRa
 *  wOa
 *  xy
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yLa_3
extends ska {
    private float L;
    private boolean C;
    private final SMa i;
    private boolean M;
    private float j;
    private int J;
    private boolean A;
    private float I;

    /*
     * WARNING - void declaration
     */
    public yLa_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7, SMa sMa2) {
        yLa_3 i2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        void h2;
        yLa_3 a2;
        yLa_3 yLa_32 = yLa_33;
        yLa_3 yLa_33 = sMa2;
        yLa_3 yLa_34 = a2 = yLa_32;
        super((Gg)h2, (double)g2, (double)f2, (double)e2);
        a2.J = rRa.f;
        yLa_34.f((double)d8);
        yLa_34.J((double)c2);
        a2.l((double)b2);
        a2.i = i2;
        a2.f *= wOa.w;
        a2.A = QSa.p + a2.R.nextInt(lqa.s);
        a2.Ma = uSa.E;
    }

    public xy f() {
        return null;
    }

    public float J(float f2) {
        float b2 = f2;
        yLa_3 a2 = this;
        return pqa.r;
    }

    public int J(float f2) {
        float b2 = f2;
        yLa_3 a2 = this;
        return YSa.L;
    }

    public void D(boolean bl2) {
        boolean b2 = bl2;
        yLa_3 a2 = this;
        a2.A = b2;
    }

    public boolean z() {
        return uSa.E != 0;
    }

    public void A(int n2) {
        int b22 = n2;
        yLa_3 a2 = this;
        float f2 = (float)((b22 & Zqa.E) >> ERa.C) / NQa.Y;
        float f3 = (float)((b22 & Uqa.Q) >> Yqa.i) / NQa.Y;
        float b22 = (float)((b22 & osa.Ja) >> uSa.E) / NQa.Y;
        float f4 = pqa.r;
        a2.f(f2 * f4, f3 * f4, b22 * f4);
    }

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        block3: {
            void i2;
            void b2;
            void c2;
            void d2;
            void e2;
            void f8;
            void g2;
            void h2;
            yLa_3 a2;
            block2: {
                float f9 = f7;
                a2 = this;
                if (!a2.C) break block2;
                yLa_3 yLa_32 = a2;
                if (yLa_32.D < yLa_32.A / yRa.d) break block2;
                yLa_3 yLa_33 = a2;
                if ((yLa_33.D + yLa_33.A) / yRa.d % uqa.g != 0) break block3;
            }
            super.J((aKa)h2, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2);
        }
    }

    public void A(boolean bl2) {
        boolean b2 = bl2;
        yLa_3 a2 = this;
        a2.C = b2;
    }

    public void i(int n2) {
        yLa_3 a2;
        int b2 = n2;
        yLa_3 yLa_32 = a2 = this;
        int n3 = b2;
        a2.j = (float)((n3 & Zqa.E) >> ERa.C) / NQa.Y;
        yLa_32.I = (float)((n3 & Uqa.Q) >> Yqa.i) / NQa.Y;
        yLa_32.L = (float)((b2 & osa.Ja) >> uSa.E) / NQa.Y;
        yLa_32.M = vRa.d;
    }

    public void d() {
        yLa_3 yLa_32;
        yLa_3 yLa_33 = yLa_32 = this;
        yLa_33.c = yLa_33.la;
        yLa_33.ba = yLa_33.Z;
        yLa_33.r = (double)yLa_33.A;
        int n2 = yLa_33.D;
        yLa_33.D = n2 + vRa.d;
        if (n2 >= yLa_32.A) {
            yLa_32.k();
        }
        yLa_3 yLa_34 = yLa_32;
        if (yLa_34.D > yLa_34.A / uqa.g) {
            yLa_3 yLa_35 = yLa_32;
            yLa_35.l(pqa.r - ((float)yLa_35.D - (float)(yLa_32.A / uqa.g)) / (float)yLa_32.A);
            if (yLa_35.M) {
                yLa_3 yLa_36 = yLa_32;
                yLa_3 yLa_37 = yLa_32;
                yLa_36.l += (yLa_37.j - yLa_37.l) * psa.N;
                yLa_3 yLa_38 = yLa_32;
                yLa_36.a += (yLa_38.I - yLa_32.a) * psa.N;
                yLa_3 yLa_39 = yLa_32;
                yLa_38.J += (yLa_39.L - yLa_39.J) * psa.N;
            }
        }
        yLa_3 yLa_310 = yLa_32;
        yLa_3 yLa_311 = yLa_32;
        yLa_311.M(yLa_310.J + (XTa.W - yLa_311.D * Yqa.i / yLa_32.A));
        yLa_310.J(yLa_310.Ea - Wsa.I);
        yLa_310.J((double)yLa_310.i, yLa_32.Ea, yLa_32.f);
        yLa_310.f((double)(yLa_310.i * IPa.Ha));
        yLa_310.J(yLa_310.Ea * IPa.Ha);
        yLa_310.l(yLa_310.f * IPa.Ha);
        if (yLa_310.ha) {
            yLa_3 yLa_312 = yLa_32;
            yLa_312.f((double)(yLa_312.i * dpa.X));
            yLa_312.l(yLa_312.f * dpa.X);
        }
        if (yLa_32.A) {
            yLa_3 yLa_313 = yLa_32;
            if (yLa_313.D < yLa_313.A / uqa.g) {
                yLa_3 yLa_314 = yLa_32;
                if ((yLa_314.D + yLa_314.A) % uqa.g == 0) {
                    yLa_3 yLa_315 = yLa_32;
                    yLa_3 a2 = new yLa_3((Gg)yLa_315.j, yLa_315.la, yLa_32.Z, (double)yLa_32.A, aSa.V, aSa.V, aSa.V, yLa_32.i);
                    yLa_3 yLa_316 = yLa_32;
                    yLa_3 yLa_317 = a2;
                    yLa_317.l(KPa.w);
                    yLa_3 yLa_318 = yLa_32;
                    a2.f(yLa_316.l, yLa_318.a, yLa_318.J);
                    a2.D = yLa_317.A / uqa.g;
                    if (yLa_316.M) {
                        yLa_3 yLa_319 = a2;
                        yLa_3 yLa_320 = yLa_32;
                        a2.M = vRa.d;
                        a2.j = yLa_320.j;
                        yLa_319.I = yLa_320.I;
                        yLa_319.L = yLa_32.L;
                    }
                    a2.C = yLa_32.C;
                    yLa_32.i.J((ska)a2);
                }
            }
        }
    }
}

