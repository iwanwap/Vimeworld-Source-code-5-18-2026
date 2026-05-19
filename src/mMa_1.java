/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  MQa
 *  YSa
 *  Yra
 *  aKa
 *  bpa
 *  kta
 *  pqa
 *  psa
 *  qta
 *  ska
 *  vL
 *  vRa
 *  wra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mMa_1
extends ska {
    private double m;
    private double M;
    private double J;
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
        mMa_1 h2;
        mMa_1 i22 = aKa2;
        mMa_1 mMa_12 = h2 = this;
        float i22 = ((float)h2.D + f8) / (float)h2.A;
        i22 = pqa.r - i22;
        i22 *= i22;
        i22 = pqa.r - i22;
        mMa_12.f = mMa_12.I * i22;
        super.J((aKa)i22, (vL)g2, (float)f8, (float)e2, (float)d2, (float)c2, (float)b2, (float)a2);
    }

    public void d() {
        float a2;
        mMa_1 mMa_12;
        mMa_1 mMa_13 = mMa_12 = this;
        mMa_13.c = mMa_13.la;
        mMa_13.ba = mMa_13.Z;
        mMa_13.r = mMa_13.A;
        float f2 = a2 = (float)mMa_13.D / (float)mMa_12.A;
        a2 = -a2 + f2 * f2 * kta.v;
        a2 = pqa.r - a2;
        mMa_13.la = mMa_13.J + mMa_12.i * (double)a2;
        mMa_13.Z = mMa_13.M + mMa_12.Ea * (double)a2 + (double)(pqa.r - a2);
        mMa_13.A = mMa_13.m + mMa_12.f * (double)a2;
        int n2 = mMa_13.D;
        mMa_13.D = n2 + vRa.d;
        if (n2 >= mMa_12.A) {
            mMa_12.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public mMa_1(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        mMa_1 g2;
        mMa_1 h22 = gg2;
        mMa_1 mMa_12 = g2 = this;
        super((Gg)h22, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        mMa_12.f((double)c2);
        mMa_12.J((double)b2);
        g2.l((double)a2);
        g2.J = g2.la = f2;
        mMa_1 mMa_13 = g2;
        mMa_13.M = mMa_13.Z = e2;
        mMa_1 mMa_14 = g2;
        mMa_14.m = mMa_14.A = d8;
        mMa_1 mMa_15 = g2;
        float h22 = mMa_15.R.nextFloat() * Ora.D + Xpa.R;
        mMa_15.I = mMa_15.f = mMa_15.R.nextFloat() * psa.N + MQa.L;
        mMa_1 mMa_16 = g2;
        float f3 = pqa.r * h22;
        mMa_16.J = f3;
        mMa_16.a = f3;
        mMa_16.l = f3;
        mMa_1 mMa_17 = g2;
        mMa_17.a *= bpa.K;
        mMa_17.l *= ATa.r;
        mMa_17.A = (int)(Math.random() * Wqa.m) + wra.P;
        mMa_17.Ma = vRa.d;
        mMa_17.M((int)(Math.random() * Wqa.Z));
    }

    public int J(float f2) {
        mMa_1 a2;
        float b22 = f2;
        mMa_1 mMa_12 = a2 = this;
        int b22 = super.J(b22);
        float f3 = (float)mMa_12.D / (float)a2.A;
        f3 *= f3;
        f3 *= f3;
        int n2 = b22 & osa.Ja;
        b22 = b22 >> ERa.C & osa.Ja;
        if ((b22 += (int)(f3 * qta.D * Yra.i)) > YSa.c) {
            b22 = YSa.c;
        }
        return n2 | b22 << ERa.C;
    }

    public float J(float f2) {
        float a2;
        mMa_1 mMa_12;
        mMa_1 mMa_13 = mMa_12 = this;
        a2 = super.J(a2);
        float b2 = (float)mMa_13.D / (float)mMa_12.A;
        b2 = b2 * b2 * b2 * b2;
        return a2 * (pqa.r - b2) + b2;
    }
}

