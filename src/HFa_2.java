/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Gg
 *  HFa
 *  JPa
 *  MQa
 *  Mda
 *  NTa
 *  Oz
 *  YEa
 *  Ypa
 *  aSa
 *  eAa
 *  fsa
 *  gFa
 *  iea
 *  jpa
 *  kPa
 *  pqa
 *  psa
 *  pua
 *  vL
 *  vRa
 *  wOa
 */
import net.minecraft.block.material.Material;

public final class HFa_2
extends YEa {
    private float n;
    public float x;
    public float H;
    public float c;
    public float a;
    public float b;
    private float l;
    private float f;
    private float g;
    public float m;
    private float C;
    public float j;
    public float J;
    private float A;

    public float G() {
        return Xpa.R;
    }

    public static /* synthetic */ boolean J(HFa a2) {
        return (boolean)a2.H;
    }

    public String i() {
        return null;
    }

    public boolean L() {
        HFa_2 a2;
        return a2.j.J(a2.J().f(aSa.V, jpa.Ha, aSa.V), Material.water, (vL)a2);
    }

    public String f() {
        return null;
    }

    public void s() {
        HFa_2 a2;
        HFa_2 hFa_2 = a2;
        super.s();
        hFa_2.J(Kha.M).J(Wqa.m);
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public void J(byte by2) {
        byte b2 = by2;
        HFa_2 a2 = this;
        if (b2 == wOa.t) {
            a2.m = JPa.N;
            return;
        }
        super.J(b2);
    }

    public void d(float f2, float f3) {
        HFa_2 a2;
        float c2 = f3;
        HFa_2 hFa_2 = a2 = this;
        hFa_2.J(a2.i, hFa_2.Ea, a2.f);
    }

    public boolean V() {
        HFa_2 a2;
        if (a2.f != JPa.N || a2.A != JPa.N || a2.g != JPa.N) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public HFa_2(Gg gg2) {
        HFa_2 a2;
        HFa_2 b2 = gg2;
        HFa_2 hFa_2 = a2 = this;
        super((Gg)b2);
        hFa_2.l(fsa.Ia, fsa.Ia);
        hFa_2.R.setSeed(vRa.d + a2.M());
        hFa_2.l = pqa.r / (a2.R.nextFloat() + pqa.r) * psa.N;
        hFa_2.D.J(uSa.E, (gFa)new Lea((HFa)a2));
    }

    public void J(boolean bl2, int n2) {
        int c2 = n2;
        HFa_2 a2 = this;
        int b2 = a2.R.nextInt(yRa.d + c2) + vRa.d;
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            a2.J(new Mda(Gea.Q, vRa.d, iea.BLACK.getDyeDamage()), JPa.N);
            n3 = ++c2;
        }
    }

    public String A() {
        return null;
    }

    public eAa J() {
        return null;
    }

    public float l() {
        HFa_2 a2;
        return a2.u * MQa.L;
    }

    /*
     * Unable to fully structure code
     */
    public void y() {
        v0 = var1_3 = this;
        super.y();
        v0.a = v0.j;
        v0.c = v0.H;
        v0.J = v0.m;
        v0.x = v0.b;
        v0.m += var1_3.l;
        if (!((double)v0.m > kPa.Z)) ** GOTO lbl18
        if (var1_3.j.e) {
            v1 = var1_3;
            var1_3.m = Ypa.Ha;
        } else {
            v2 = var1_3;
            v2.m = (float)((double)v2.m - kPa.Z);
            if (v2.R.nextInt(NTa.C) == 0) {
                var1_3.l = pqa.r / (var1_3.R.nextFloat() + pqa.r) * psa.N;
            }
            var1_3.j.J((vL)var1_3, (byte)wOa.t);
lbl18:
            // 2 sources

            v1 = var1_3;
        }
        if (v1.H != false) {
            if (var1_3.m < pua.j) {
                a = var1_3.m / pua.j;
                var1_3.b = Oz.d((float)(a * a * pua.j)) * pua.j * rta.o;
                if ((double)a > Bsa.x) {
                    v3 = var1_3;
                    v3.n = pqa.r;
                    v3.C = pqa.r;
                } else {
                    var1_3.C *= xSa.la;
                }
            } else {
                v4 = var1_3;
                v4.b = JPa.N;
                v4.n *= ATa.r;
                v4.C *= KPa.w;
            }
            if (!var1_3.j.e) {
                v5 = var1_3;
                v6 = var1_3;
                v5.f(v5.f * v6.n);
                v5.J(v6.A * var1_3.n);
                v5.l(v5.g * var1_3.n);
            }
            v7 = var1_3;
            a = Oz.J((double)(v7.i * var1_3.i + var1_3.f * var1_3.f));
            v8 = var1_3;
            v7.ba += (-((float)Oz.f((double)v8.i, (double)var1_3.f)) * Hra.Ga / pua.j - var1_3.ba) * Nra.e;
            v7.X = v8.ba;
            v7.H = (float)((double)v7.H + lQa.f * (double)var1_3.C * Bta.c);
            v7.j += (-((float)Oz.f((double)a, (double)var1_3.Ea)) * Hra.Ga / pua.j - var1_3.j) * Nra.e;
            return;
        }
        v9 = var1_3;
        v9.b = Oz.l((float)Oz.d((float)v9.m)) * pua.j * rta.o;
        if (!v9.j.e) {
            v10 = var1_3;
            v10.f(aSa.V);
            v10.J(v10.Ea - tSa.K);
            v10.J(v10.Ea * uua.G);
            v10.l(aSa.V);
        }
        var1_3.j = (float)((double)var1_3.j + (double)(kPa.Ha - var1_3.j) * GPa.g);
    }

    public boolean w() {
        HFa_2 a2;
        if (a2.Z > Yqa.Ha && a2.Z < (double)a2.j.M() && super.w()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4) {
        void b2;
        void c2;
        HFa_2 a2;
        float d2 = f4;
        HFa_2 hFa_2 = a2 = this;
        a2.f = c2;
        hFa_2.A = b2;
        hFa_2.g = d2;
    }
}

