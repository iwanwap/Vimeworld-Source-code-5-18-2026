/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  JPa
 *  Oz
 *  UZ
 *  YSa
 *  Zta
 *  aKa
 *  aSa
 *  dpa
 *  jRa
 *  kta
 *  pqa
 *  psa
 *  ska
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ooa_3
extends ska {
    private float I;

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
        Ooa_3 h2;
        Ooa_3 i2 = aKa2;
        Ooa_3 ooa_3 = h2 = this;
        float f9 = i2 = ((float)h2.D + f8) / (float)h2.A;
        ooa_3.f = ooa_3.I * (pqa.r - f9 * f9);
        super.J((aKa)i2, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    public float J(float f2) {
        float b2 = f2;
        Ooa_3 a2 = this;
        return pqa.r;
    }

    public int J(float f2) {
        Ooa_3 a2;
        float b22 = f2;
        Ooa_3 ooa_3 = a2 = this;
        Oz.J((float)(((float)a2.D + b22) / (float)ooa_3.A), (float)JPa.N, (float)pqa.r);
        int b22 = super.J(b22);
        int n2 = YSa.c;
        b22 = b22 >> ERa.C & osa.Ja;
        return n2 | b22 << ERa.C;
    }

    /*
     * WARNING - void declaration
     */
    public Ooa_3(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Ooa_3 d5;
        Ooa_3 e2 = gg2;
        Ooa_3 ooa_3 = d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2, aSa.V, aSa.V, aSa.V);
        ooa_3.f(ooa_3.i * GPa.fa);
        ooa_3.J(ooa_3.Ea * GPa.fa);
        ooa_3.l(ooa_3.f * GPa.fa);
        ooa_3.J(ooa_3.R.nextFloat() * Xpa.R + Yqa.C);
        ooa_3.a = ooa_3.J = pqa.r;
        ooa_3.l = ooa_3.J;
        Ooa_3 ooa_32 = d5;
        Ooa_3 ooa_33 = d5;
        ooa_32.f *= ooa_33.R.nextFloat() * kta.v + psa.N;
        ooa_32.I = ooa_33.f;
        ooa_32.A = (int)(Zta.ba / (Math.random() * Jra.A + iSa.P));
        ooa_32.Ma = uSa.E;
        ooa_32.M(jRa.q);
    }

    public void d() {
        Ooa_3 ooa_3;
        Ooa_3 ooa_32 = ooa_3 = this;
        ooa_32.c = ooa_32.la;
        ooa_32.ba = ooa_32.Z;
        ooa_32.r = ooa_32.A;
        int n2 = ooa_32.D;
        ooa_32.D = n2 + vRa.d;
        if (n2 >= ooa_3.A) {
            ooa_3.k();
        }
        Ooa_3 ooa_33 = ooa_3;
        float a2 = (float)ooa_33.D / (float)ooa_3.A;
        if (ooa_33.R.nextFloat() > a2) {
            ooa_3.j.J(UZ.SMOKE_NORMAL, ooa_3.la, ooa_3.Z, ooa_3.A, ooa_3.i, ooa_3.Ea, ooa_3.f, new int[uSa.E]);
        }
        Ooa_3 ooa_34 = ooa_3;
        ooa_34.J(ooa_34.Ea - mPa.ia);
        ooa_34.J(ooa_34.i, ooa_3.Ea, ooa_3.f);
        ooa_34.f(ooa_34.i * kta.h);
        ooa_34.J(ooa_34.Ea * kta.h);
        ooa_34.l(ooa_34.f * kta.h);
        if (ooa_34.ha) {
            Ooa_3 ooa_35 = ooa_3;
            ooa_35.f(ooa_35.i * dpa.X);
            ooa_35.l(ooa_35.f * dpa.X);
        }
    }
}

