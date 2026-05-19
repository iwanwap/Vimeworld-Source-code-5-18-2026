/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  JPa
 *  MQa
 *  Oz
 *  QSa
 *  YSa
 *  Yra
 *  aKa
 *  dpa
 *  pqa
 *  qta
 *  ska
 *  vL
 *  vRa
 *  yra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uNa_3
extends ska {
    private float I;

    public int J(float f2) {
        uNa_3 a2;
        float b22 = f2;
        uNa_3 uNa_32 = a2 = this;
        float f3 = ((float)a2.D + b22) / (float)uNa_32.A;
        f3 = Oz.J((float)f3, (float)JPa.N, (float)pqa.r);
        int b22 = super.J(b22);
        int n2 = b22 & osa.Ja;
        b22 = b22 >> ERa.C & osa.Ja;
        if ((n2 += (int)(f3 * qta.D * Yra.i)) > YSa.c) {
            n2 = YSa.c;
        }
        return n2 | b22 << ERa.C;
    }

    /*
     * WARNING - void declaration
     */
    public float J(float f2) {
        void a2;
        uNa_3 uNa_32;
        uNa_3 uNa_33 = uNa_32 = this;
        float b2 = ((float)uNa_32.D + a2) / (float)uNa_33.A;
        b2 = Oz.J((float)b2, (float)JPa.N, (float)pqa.r);
        return super.J((float)a2) * b2 + (pqa.r - b2);
    }

    /*
     * WARNING - void declaration
     */
    public uNa_3(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        uNa_3 g2;
        uNa_3 h2 = gg2;
        uNa_3 uNa_32 = g2 = this;
        super((Gg)h2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        uNa_32.f(uNa_32.i * yra.d + c2);
        uNa_32.J(uNa_32.Ea * yra.d + b2);
        uNa_32.l(uNa_32.f * yra.d + a2);
        uNa_32.la += (double)((g2.R.nextFloat() - g2.R.nextFloat()) * Yqa.C);
        uNa_32.Z += (double)((g2.R.nextFloat() - g2.R.nextFloat()) * Yqa.C);
        uNa_32.A += (double)((g2.R.nextFloat() - g2.R.nextFloat()) * Yqa.C);
        uNa_32.I = uNa_32.f;
        uNa_32.a = uNa_32.J = pqa.r;
        uNa_32.l = uNa_32.J;
        g2.A = (int)(Wqa.Z / (Math.random() * Jra.A + iSa.P)) + AQa.P;
        g2.Ma = vRa.d;
        g2.M(QSa.p);
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
        uNa_3 h2;
        uNa_3 i2 = aKa2;
        uNa_3 uNa_32 = h2 = this;
        float f9 = i2 = ((float)h2.D + f8) / (float)h2.A;
        uNa_32.f = uNa_32.I * (pqa.r - f9 * f9 * MQa.L);
        super.J((aKa)i2, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    public void d() {
        uNa_3 a2;
        uNa_3 uNa_32 = a2;
        uNa_32.c = uNa_32.la;
        uNa_32.ba = uNa_32.Z;
        uNa_32.r = uNa_32.A;
        int n2 = uNa_32.D;
        uNa_32.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        uNa_3 uNa_33 = a2;
        uNa_3 uNa_34 = a2;
        uNa_34.J(uNa_33.i, uNa_34.Ea, a2.f);
        uNa_33.f(uNa_33.i * DPa.r);
        uNa_33.J(uNa_33.Ea * DPa.r);
        uNa_33.l(uNa_33.f * DPa.r);
        if (uNa_33.ha) {
            uNa_3 uNa_35 = a2;
            uNa_35.f(uNa_35.i * dpa.X);
            uNa_35.l(uNa_35.f * dpa.X);
        }
    }
}

