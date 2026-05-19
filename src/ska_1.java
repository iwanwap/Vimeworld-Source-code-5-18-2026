/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Kpa
 *  MQa
 *  Oz
 *  Waa
 *  YSa
 *  Yra
 *  aKa
 *  aqa
 *  dpa
 *  kta
 *  pqa
 *  psa
 *  qta
 *  ska
 *  vL
 *  vQa
 *  vRa
 *  yQa
 *  yra
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ska_1
extends vL {
    public float a;
    public float b;
    public float l;
    public KLa e;
    public int G;
    public int D;
    public float f;
    public int F;
    public float E;
    public float m;
    public static double C;
    public float i;
    public static double k;
    public static double j;
    public float J;
    public int A;

    /*
     * WARNING - void declaration
     */
    public ska_1(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f22;
        ska_1 g2;
        ska_1 h22 = gg2;
        ska_1 ska_12 = g2 = this;
        ska_1 ska_13 = g2;
        ska_1 ska_14 = g2;
        ska_14((Gg)h22, (double)f22, (double)e2, (double)d8);
        ska_14.f((double)(c2 + (Math.random() * KPa.y - oua.i) * rpa.ja));
        ska_13.J((double)(b2 + (Math.random() * KPa.y - oua.i) * rpa.ja));
        ska_13.l((double)(a2 + (Math.random() * KPa.y - oua.i) * rpa.ja));
        float h22 = (float)(Math.random() + Math.random() + oua.i) * VPa.i;
        ska_1 ska_15 = g2;
        float f22 = Oz.J((double)(ska_12.i * ska_15.i + g2.Ea * g2.Ea + g2.f * g2.f));
        ska_12.f(ska_15.i / (double)f22 * (double)h22 * rpa.ja);
        ska_12.J(ska_12.Ea / (double)f22 * (double)h22 * rpa.ja + Tqa.Ia);
        ska_12.l(ska_12.f / (double)f22 * (double)h22 * rpa.ja);
    }

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void a2;
        void c2;
        void d2;
        void b2;
        void e2;
        void h2;
        void f222;
        ska_1 ska_12;
        ska_1 ska_13 = ska_12 = this;
        float g2 = (float)ska_13.F / Yra.i;
        float f8 = g2 + NSa.d;
        float f9 = (float)ska_13.G / Yra.i;
        float f10 = f9 + NSa.d;
        ska_1 ska_14 = ska_12;
        float i2 = Nra.e * ska_14.f;
        if (ska_14.e != null) {
            ska_1 ska_15 = ska_12;
            g2 = ska_15.e.l();
            f8 = ska_15.e.C();
            f9 = ska_15.e.J();
            f10 = ska_15.e.f();
        }
        ska_1 ska_16 = ska_12;
        float f11 = (float)(ska_16.c + (ska_12.la - ska_12.c) * (double)f222 - C);
        ska_1 ska_17 = ska_12;
        float f12 = (float)(ska_16.ba + (ska_17.Z - ska_12.ba) * (double)f222 - k);
        float f13 = (float)(ska_17.r + (ska_12.A - ska_12.r) * (double)f222 - j);
        int f222 = ska_16.J((float)f222);
        int n2 = f222 >> ERa.C & yQa.j;
        void v5 = h2;
        float f14 = f11;
        ska_1 ska_18 = ska_12;
        ska_1 ska_19 = ska_12;
        h2.J((double)(f11 - e2 * i2 - b2 * i2), (double)(f12 - d2 * i2), (double)(f13 - c2 * i2 - a2 * i2)).J((double)f8, (double)f10).J(ska_18.l, ska_18.a, ska_19.J, ska_19.E).J(n2, f222 &= yQa.j).M();
        ska_1 ska_110 = ska_12;
        ska_1 ska_111 = ska_12;
        h2.J((double)(f14 - e2 * i2 + b2 * i2), (double)(f12 + d2 * i2), (double)(f13 - c2 * i2 + a2 * i2)).J((double)f8, (double)f9).J(ska_110.l, ska_110.a, ska_111.J, ska_111.E).J(n2, f222).M();
        ska_1 ska_112 = ska_12;
        ska_1 ska_113 = ska_12;
        v5.J((double)(f14 + e2 * i2 + b2 * i2), (double)(f12 + d2 * i2), (double)(f13 + c2 * i2 + a2 * i2)).J((double)g2, (double)f9).J(ska_112.l, ska_112.a, ska_113.J, ska_113.E).J(n2, f222).M();
        ska_1 ska_114 = ska_12;
        ska_1 ska_115 = ska_12;
        v5.J((double)(f11 + e2 * i2 - b2 * i2), (double)(f12 - d2 * i2), (double)(f13 + c2 * i2 - a2 * i2)).J((double)g2, (double)f10).J(ska_114.l, ska_114.a, ska_115.J, ska_115.E).J(n2, f222).M();
    }

    public void J(KLa kLa2) {
        Object b2 = kLa2;
        ska_1 a2 = this;
        if (a2.J() == vRa.d) {
            a2.e = b2;
            return;
        }
        throw new RuntimeException(eua.i);
    }

    public boolean I() {
        return uSa.E != 0;
    }

    public String toString() {
        ska_1 a2;
        return new StringBuilder().insert(2 & 5, ((Object)((Object)a2)).getClass().getSimpleName()).append(Qpa.w).append(a2.la).append(yra.t).append(a2.Z).append(yra.t).append((double)a2.A).append(aqa.M).append(a2.l).append(yra.t).append(a2.a).append(yra.t).append(a2.J).append(yra.t).append(a2.E).append(qta.Ja).append(a2.D).toString();
    }

    public float i() {
        ska_1 a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public ska_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        ska_1 d5;
        ska_1 e2 = gg2;
        ska_1 ska_12 = d5 = this;
        super((Gg)e2);
        ska_12.E = pqa.r;
        ska_12.l(psa.N, psa.N);
        d5.l((double)c2, (double)b2, (double)a2);
        d5.V = d5.c = c2;
        ska_1 ska_13 = d5;
        ska_13.Ga = ska_13.ba = b2;
        ska_1 ska_14 = d5;
        ska_14.Ca = ska_14.r = a2;
        d5.a = d5.J = pqa.r;
        d5.l = d5.J;
        ska_1 ska_15 = d5;
        ska_15.i = ska_15.R.nextFloat() * vQa.q;
        ska_15.b = ska_15.R.nextFloat() * vQa.q;
        ska_15.f = (ska_15.R.nextFloat() * MQa.L + MQa.L) * kta.v;
        ska_15.A = (int)(YSa.G / (d5.R.nextFloat() * ATa.r + Nra.e));
        ska_15.D = uSa.E;
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public int J() {
        return uSa.E;
    }

    public void l(float f2) {
        ska_1 ska_12;
        float b2 = f2;
        ska_1 a2 = this;
        if (a2.E == pqa.r && b2 < pqa.r) {
            Kpa.J().f.C((ska)a2);
            ska_12 = a2;
        } else {
            if (a2.E < pqa.r && b2 == pqa.r) {
                Kpa.J().f.l((ska)a2);
            }
            ska_12 = a2;
        }
        ska_12.E = b2;
    }

    public void J() {
    }

    public ska f(float f2) {
        ska_1 a2;
        float b2 = f2;
        ska_1 ska_12 = a2 = this;
        ska_12.f(ska_12.i * (double)b2);
        ska_12.J((ska_12.Ea - Tqa.Ia) * (double)b2 + Tqa.Ia);
        ska_12.l(ska_12.f * (double)b2);
        return ska_12;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4) {
        void b2;
        void c2;
        ska_1 a2;
        float d2 = f4;
        ska_1 ska_12 = a2 = this;
        a2.l = c2;
        ska_12.a = b2;
        ska_12.J = d2;
    }

    public void f() {
        a.F += vRa.d;
    }

    public void d() {
        ska_1 a2;
        ska_1 ska_12 = a2;
        ska_12.c = ska_12.la;
        ska_12.ba = ska_12.Z;
        ska_12.r = ska_12.A;
        int n2 = ska_12.D;
        ska_12.D = n2 + vRa.d;
        if (n2 >= a2.A) {
            a2.k();
        }
        ska_1 ska_13 = a2;
        ska_13.J(ska_13.Ea - fta.F * (double)a2.m);
        ska_13.J(ska_13.i, a2.Ea, a2.f);
        ska_13.f(ska_13.i * uua.G);
        ska_13.J(ska_13.Ea * uua.G);
        ska_13.l(ska_13.f * uua.G);
        if (ska_13.ha) {
            ska_1 ska_14 = a2;
            ska_14.f(ska_14.i * dpa.X);
            ska_14.l(ska_14.f * dpa.X);
        }
    }

    public ska J(float f2) {
        ska_1 a2;
        float b2 = f2;
        ska_1 ska_12 = a2 = this;
        ska_12.l(psa.N * b2, psa.N * b2);
        ska_12.f *= b2;
        return ska_12;
    }

    public float M() {
        ska_1 a2;
        return a2.J;
    }

    public float f() {
        ska_1 a2;
        return a2.l;
    }

    public float J() {
        ska_1 a2;
        return a2.a;
    }

    public void M(int n2) {
        int b2 = n2;
        ska_1 a2 = this;
        if (a2.J() != 0) {
            throw new RuntimeException(FRa.X);
        }
        ska_1 ska_12 = a2;
        int n3 = b2;
        ska_12.F = n3 % ERa.C;
        ska_12.G = n3 / ERa.C;
    }

    public void J(Waa object) {
        ska_1 b2 = object;
        object = this;
    }

    public void f(Waa object) {
        ska_1 b2 = object;
        object = this;
    }
}

