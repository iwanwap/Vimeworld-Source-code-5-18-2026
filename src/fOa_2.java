/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  Gg
 *  MQa
 *  YSa
 *  Yra
 *  pPa
 *  pqa
 *  psa
 *  qta
 *  ska
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fOa_2
extends ska {
    private float C;
    private double M;
    private double J;
    private double I;

    /*
     * WARNING - void declaration
     */
    public fOa_2(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        fOa_2 g2;
        fOa_2 h22 = gg2;
        fOa_2 fOa_22 = g2 = this;
        fOa_2 fOa_23 = g2;
        fOa_2 fOa_24 = g2;
        fOa_2 fOa_25 = g2;
        super((Gg)h22, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        fOa_25.f((double)c2);
        fOa_24.J((double)b2);
        fOa_24.l((double)a2);
        fOa_23.I = f2;
        fOa_23.M = e2;
        fOa_22.J = d8;
        fOa_22.la = fOa_22.c = f2 + c2;
        fOa_2 fOa_26 = g2;
        fOa_26.Z = fOa_26.ba = e2 + b2;
        fOa_2 fOa_27 = g2;
        fOa_27.A = fOa_27.r = d8 + a2;
        fOa_2 fOa_28 = g2;
        float h22 = fOa_28.R.nextFloat() * Ora.D + Xpa.R;
        fOa_28.C = fOa_28.f = fOa_28.R.nextFloat() * MQa.L + psa.N;
        fOa_2 fOa_29 = g2;
        float f3 = pqa.r * h22;
        fOa_29.J = f3;
        fOa_29.a = f3;
        fOa_29.l = f3;
        fOa_2 fOa_210 = g2;
        fOa_210.a *= ATa.r;
        fOa_210.l *= ATa.r;
        fOa_210.A = (int)(Math.random() * Wqa.m) + Fsa.d;
        fOa_210.Ma = vRa.d;
        fOa_210.M((int)(Math.random() * rua.g + oua.i + FPa.y));
    }

    public int J(float f2) {
        fOa_2 a2;
        float b22 = f2;
        fOa_2 fOa_22 = a2 = this;
        int b22 = super.J(b22);
        float f3 = (float)fOa_22.D / (float)a2.A;
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
        fOa_2 fOa_22;
        fOa_2 fOa_23 = fOa_22 = this;
        a2 = super.J(a2);
        float b2 = (float)fOa_23.D / (float)fOa_22.A;
        b2 *= b2;
        b2 *= b2;
        return a2 * (pqa.r - b2) + b2;
    }

    public void d() {
        fOa_2 fOa_22;
        fOa_2 fOa_23 = fOa_22 = this;
        fOa_23.c = fOa_23.la;
        fOa_23.ba = fOa_23.Z;
        fOa_23.r = fOa_23.A;
        float a2 = (float)fOa_23.D / (float)fOa_22.A;
        a2 = pqa.r - a2;
        float f2 = pqa.r - a2;
        f2 *= f2;
        f2 *= f2;
        fOa_23.la = fOa_23.I + fOa_22.i * (double)a2;
        fOa_23.Z = fOa_23.M + fOa_22.Ea * (double)a2 - (double)(f2 * pPa.c);
        fOa_23.A = fOa_23.J + fOa_22.f * (double)a2;
        int n2 = fOa_23.D;
        fOa_23.D = n2 + vRa.d;
        if (n2 >= fOa_22.A) {
            fOa_22.k();
        }
    }
}

