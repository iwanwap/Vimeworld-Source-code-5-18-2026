/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Gg
 *  Gl
 *  ISa
 *  JPa
 *  LQa
 *  NTa
 *  Oz
 *  QFa
 *  QSa
 *  Qqa
 *  Tpa
 *  UZ
 *  Waa
 *  Xsa
 *  ZRa
 *  Zta
 *  aSa
 *  eAa
 *  gZ
 *  gz
 *  kta
 *  oqa
 *  pqa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  wOa
 *  xy
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Wda_1
extends vL {
    private double D;
    private int F;
    private double L;
    private boolean E;
    private double m;
    private double C;
    private double M;
    private double k;
    private double j;
    private double J;
    private double I;

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        Wda_1 b2 = this;
        Wda_1 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (!b2.j.e && b2.J == false) {
            void a2;
            if (b2.Aa != null && b2.Aa == c2.f() && c2 instanceof gz) {
                return uSa.E != 0;
            }
            Wda_1 wda_1 = b2;
            wda_1.M(-wda_1.J());
            wda_1.i(NTa.C);
            wda_1.l(wda_1.J() + a2 * FRa.Ga);
            wda_1.i();
            int n2 = a2 = c2.f() instanceof Sx && ((Sx)c2.f()).h.f() ? vRa.d : uSa.E;
            if (a2 != 0 || b2.J() > ZRa.l) {
                if (b2.Aa != null) {
                    b2.Aa.l((vL)b2);
                }
                if (a2 == 0 && b2.j.J().f(qQa.y)) {
                    b2.J(Gea.ba, vRa.d, JPa.N);
                }
                b2.k();
            }
            return vRa.d != 0;
        }
        return vRa.d != 0;
    }

    public void J() {
        Wda_1 a2;
        Wda_1 wda_1 = a2;
        wda_1.aa.f(yta.Ka, new Integer(uSa.E));
        wda_1.aa.f(yOa.B, new Integer(vRa.d));
        wda_1.aa.f(wOa.t, new Float(JPa.N));
    }

    public void A(boolean bl) {
        boolean b2 = bl;
        Wda_1 a2 = this;
        a2.E = b2;
    }

    public Wda_1(Gg gg2) {
        Wda_1 a2;
        Wda_1 b2 = gg2;
        Wda_1 wda_1 = a2 = this;
        super((Gg)b2);
        wda_1.E = vRa.d;
        wda_1.C = oqa.F;
        wda_1.h = vRa.d;
        wda_1.l(Ira.d, Ora.D);
    }

    public void l(float f2) {
        float b2 = f2;
        Wda_1 a2 = this;
        a2.aa.J(wOa.t, Float.valueOf(b2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        Wda_1 wda_1;
        void h;
        void d5;
        void e2;
        void f4;
        void g;
        void a2;
        float f5 = f3;
        Wda_1 c2 = this;
        if (a2 != false && c2.Aa != null) {
            Wda_1 wda_12 = c2;
            wda_12.c = wda_12.la = g;
            Wda_1 wda_13 = c2;
            wda_13.ba = wda_13.Z = f4;
            Wda_1 wda_14 = c2;
            wda_14.r = wda_14.A = e2;
            Wda_1 wda_15 = c2;
            wda_15.X = d5;
            wda_15.d = h;
            c2.F = uSa.E;
            c2.l((double)g, (double)f4, (double)e2);
            c2.M = aSa.V;
            c2.f(c2.M);
            c2.m = aSa.V;
            c2.J(c2.m);
            c2.L = aSa.V;
            c2.l(c2.L);
            return;
        }
        if (c2.E) {
            void b2;
            wda_1 = c2;
            c2.F = b2 + tTa.h;
        } else {
            void var11_10 = g - c2.la;
            void var13_11 = f4 - c2.Z;
            void var15_12 = e2 - c2.A;
            void v5 = var11_10;
            void v6 = var13_11;
            void v7 = var15_12;
            if (v5 * v5 + v6 * v6 + v7 * v7 <= oua.i) {
                return;
            }
            wda_1 = c2;
            c2.F = yRa.d;
        }
        wda_1.J = g;
        Wda_1 wda_16 = c2;
        Wda_1 wda_17 = c2;
        wda_17.D = f4;
        wda_17.k = e2;
        c2.I = (double)d5;
        wda_16.j = (double)h;
        wda_16.f(c2.M);
        wda_16.J(wda_16.m);
        wda_16.l(wda_16.L);
    }

    public boolean E() {
        Wda_1 a2;
        if (a2.J == false) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, boolean n2, Block block, XF xF) {
        void d3;
        int e2 = n2;
        Wda_1 c2 = this;
        if (e2 != 0) {
            if (c2.O > vQa.q) {
                Wda_1 wda_1 = c2;
                wda_1.f(wda_1.O, pqa.r);
                if (!wda_1.j.e && c2.J == false) {
                    Wda_1 wda_12 = c2;
                    wda_12.k();
                    if (wda_12.j.J().f(qQa.y)) {
                        int n3 = e2 = uSa.E;
                        while (n3 < yRa.d) {
                            c2.J(eAa.J((Block)QFa.L), vRa.d, JPa.N);
                            n3 = ++e2;
                        }
                        int n4 = e2 = uSa.E;
                        while (n4 < uqa.g) {
                            c2.J(Gea.t, vRa.d, JPa.N);
                            n4 = ++e2;
                        }
                    }
                }
                c2.O = JPa.N;
                return;
            }
        } else if (c2.j.J(new XF(c2).down()).J().J() != Material.water && d3 < aSa.V) {
            c2.O = (float)((double)c2.O - d3);
        }
    }

    public void i(int n2) {
        int b2 = n2;
        Wda_1 a2 = this;
        a2.aa.J(yta.Ka, Integer.valueOf(b2));
    }

    public boolean l(Sx sx) {
        Object b2 = sx;
        Wda_1 a2 = this;
        if (a2.Aa != null && a2.Aa instanceof Sx && a2.Aa != b2) {
            return vRa.d != 0;
        }
        if (!a2.j.e) {
            b2.l(a2);
        }
        return vRa.d != 0;
    }

    public void d(double c2, double b2, double a2) {
        Wda_1 d2;
        Wda_1 wda_1 = d2;
        Wda_1 wda_12 = d2;
        wda_12.f(c2);
        wda_12.J(b2);
        d2.l(a2);
        d2.M = c2;
        wda_1.m = b2;
        wda_1.L = a2;
    }

    public boolean z() {
        return vRa.d != 0;
    }

    public int f() {
        Wda_1 a2;
        return a2.aa.J(yta.Ka);
    }

    public void J(Waa object) {
        Wda_1 b2 = object;
        object = this;
    }

    public xy J(vL vL2) {
        Wda_1 b2 = vL2;
        Wda_1 a2 = this;
        return b2.J();
    }

    public xy f() {
        Wda_1 a2;
        return a2.J();
    }

    public void d() {
        double d2;
        int n2;
        double d3;
        Wda_1 wda_1;
        int n3;
        double d4;
        double d5;
        double d6;
        int n4;
        Wda_1 wda_12;
        Wda_1 wda_13 = wda_12 = this;
        super.d();
        if (wda_13.f() > 0) {
            Wda_1 wda_14 = wda_12;
            wda_14.i(wda_14.f() - vRa.d);
        }
        if (wda_12.J() > JPa.N) {
            Wda_1 wda_15 = wda_12;
            wda_15.l(wda_15.J() - pqa.r);
        }
        Wda_1 wda_16 = wda_12;
        wda_16.c = wda_16.la;
        wda_16.ba = wda_16.Z;
        wda_16.r = wda_16.A;
        int a2 = tTa.h;
        double d7 = aSa.V;
        int n5 = n4 = uSa.E;
        while (n5 < a2) {
            Wda_1 wda_17 = wda_12;
            double d8 = wda_17.J().j + (wda_12.J().M - wda_12.J().j) * (double)(n4 + uSa.E) / (double)a2 - fqa.ca;
            Wda_1 wda_18 = wda_12;
            double d9 = wda_17.J().j + (wda_18.J().M - wda_12.J().j) * (double)(n4 + vRa.d) / (double)a2 - fqa.ca;
            xy xy2 = new xy(wda_12.J().J, d8, wda_12.J().I, wda_12.J().A, d9, wda_12.J().k);
            if (wda_18.j.J(xy2, Material.water)) {
                d7 += oua.i / (double)a2;
            }
            n5 = ++n4;
        }
        double d10 = Math.sqrt(wda_12.i * wda_12.i + wda_12.f * wda_12.f);
        if (d6 > AQa.ca) {
            Wda_1 wda_19 = wda_12;
            d5 = Math.cos((double)wda_19.X * lQa.f / kta.Da);
            d4 = Math.sin((double)wda_19.X * lQa.f / kta.Da);
            int n6 = n3 = uSa.E;
            while ((double)n6 < oua.i + d10 * Zta.l) {
                double d11;
                double d12;
                Wda_1 wda_110 = wda_12;
                double d13 = wda_110.R.nextFloat() * kta.v - pqa.r;
                double d14 = (double)(wda_110.R.nextInt(uqa.g) * uqa.g - vRa.d) * LQa.E;
                if (wda_110.R.nextBoolean()) {
                    Wda_1 wda_111 = wda_12;
                    d12 = wda_111.la - d5 * d13 * Jra.A + d4 * d14;
                    d11 = wda_111.A - d4 * d13 * Jra.A - d5 * d14;
                    wda_111.j.J(UZ.WATER_SPLASH, d12, wda_12.Z - fqa.ca, d11, wda_12.i, wda_12.Ea, wda_12.f, new int[uSa.E]);
                } else {
                    Wda_1 wda_112 = wda_12;
                    d12 = wda_112.la + d5 + d4 * d13 * LQa.E;
                    d11 = wda_112.A + d4 - d5 * d13 * LQa.E;
                    wda_112.j.J(UZ.WATER_SPLASH, d12, wda_12.Z - fqa.ca, d11, wda_12.i, wda_12.Ea, wda_12.f, new int[uSa.E]);
                }
                n6 = ++n3;
            }
        }
        if (wda_12.j.e && wda_12.E) {
            Wda_1 wda_113 = wda_12;
            if (wda_12.F > 0) {
                d5 = wda_113.la + (wda_12.J - wda_12.la) / (double)wda_12.F;
                Wda_1 wda_114 = wda_12;
                d4 = wda_114.Z + (wda_12.D - wda_12.Z) / (double)wda_12.F;
                Wda_1 wda_115 = wda_12;
                double d15 = wda_114.A + (wda_115.k - wda_12.A) / (double)wda_12.F;
                double d16 = Oz.J((double)(wda_115.I - (double)wda_12.X));
                wda_114.X = (float)((double)wda_114.X + d16 / (double)wda_12.F);
                wda_114.d = (float)((double)wda_114.d + (wda_12.j - (double)wda_12.d) / (double)wda_12.F);
                wda_114.F -= vRa.d;
                wda_114.l(d5, d4, d15);
                wda_114.C(wda_114.X, wda_12.d);
                return;
            }
            d5 = wda_113.la + wda_12.i;
            Wda_1 wda_116 = wda_12;
            d4 = wda_116.Z + wda_12.Ea;
            Wda_1 wda_117 = wda_12;
            double d17 = wda_116.A + wda_117.f;
            wda_117.l(d5, d4, d17);
            if (wda_116.ha) {
                Wda_1 wda_118 = wda_12;
                wda_118.f(wda_118.i * kTa.B);
                wda_118.J(wda_118.Ea * kTa.B);
                wda_118.l(wda_118.f * kTa.B);
            }
            Wda_1 wda_119 = wda_12;
            wda_119.f(wda_119.i * hQa.h);
            wda_119.J(wda_119.Ea * Cra.A);
            wda_119.l(wda_119.f * hQa.h);
            return;
        }
        if (d7 < oua.i) {
            d5 = d7 * KPa.y - oua.i;
            Wda_1 wda_120 = wda_12;
            wda_1 = wda_120;
            wda_120.J(wda_120.Ea + Tpa.fa * d5);
        } else {
            if (wda_12.Ea < aSa.V) {
                Wda_1 wda_121 = wda_12;
                wda_121.J(wda_121.Ea / KPa.y);
            }
            Wda_1 wda_122 = wda_12;
            wda_1 = wda_122;
            wda_122.J(wda_122.Ea + QSa.c);
        }
        if (wda_1.Aa instanceof Gl) {
            Gl gl2 = (Gl)wda_12.Aa;
            Wda_1 wda_123 = wda_12;
            float f2 = wda_123.Aa.X + -gl2.L * ISa.a;
            wda_123.f(wda_123.i + -Math.sin(f2 * pua.j / Hra.Ga) * wda_12.C * (double)gl2.ia * ySa.Ja);
            wda_123.l(wda_123.f + Math.cos(f2 * pua.j / Hra.Ga) * wda_12.C * (double)gl2.ia * ySa.Ja);
        }
        double d18 = Math.sqrt(wda_12.i * wda_12.i + wda_12.f * wda_12.f);
        if (d3 > LPa.e) {
            d4 = LPa.e / d18;
            Wda_1 wda_124 = wda_12;
            wda_124.f(wda_124.i * d4);
            wda_124.l(wda_124.f * d4);
            d18 = LPa.e;
        }
        if (d18 > d10 && wda_12.C < LPa.e) {
            Wda_1 wda_125 = wda_12;
            wda_125.C += (LPa.e - wda_12.C) / cTa.K;
            if (wda_125.C > LPa.e) {
                wda_12.C = LPa.e;
            }
        } else {
            Wda_1 wda_126 = wda_12;
            wda_126.C -= (wda_12.C - oqa.F) / cTa.K;
            if (wda_126.C < oqa.F) {
                wda_12.C = oqa.F;
            }
        }
        int n7 = n2 = uSa.E;
        while (n7 < AQa.P) {
            Wda_1 wda_127 = wda_12;
            int n8 = Oz.f((double)(wda_127.la + ((double)(n2 % uqa.g) - kTa.B) * Jra.A));
            n3 = Oz.f((double)(wda_127.A + ((double)(n2 / uqa.g) - kTa.B) * Jra.A));
            int n9 = uSa.E;
            while (n9 < uqa.g) {
                int n10;
                Wda_1 wda_128 = wda_12;
                int n11 = Oz.f((double)wda_128.Z) + n10;
                XF xF = new XF(n8, n11, n3);
                Block block = wda_128.j.J(xF).J();
                if (block == QFa.gC) {
                    wda_12.j.G(xF);
                    wda_12.ca = uSa.E;
                } else if (block == QFa.pB) {
                    wda_12.j.f(xF, vRa.d != 0);
                    wda_12.ca = uSa.E;
                }
                n9 = ++n10;
            }
            n7 = ++n2;
        }
        if (wda_12.ha) {
            Wda_1 wda_129 = wda_12;
            wda_129.f(wda_129.i * kTa.B);
            wda_129.J(wda_129.Ea * kTa.B);
            wda_129.l(wda_129.f * kTa.B);
        }
        Wda_1 wda_130 = wda_12;
        Wda_1 wda_131 = wda_12;
        wda_131.J(wda_130.i, wda_131.Ea, wda_12.f);
        if (wda_130.ca && d10 > AQa.ca) {
            if (!wda_12.j.e && wda_12.J == false) {
                Wda_1 wda_132 = wda_12;
                wda_132.k();
                if (wda_132.j.J().f(qQa.y)) {
                    int n12 = n2 = uSa.E;
                    while (n12 < yRa.d) {
                        wda_12.J(eAa.J((Block)QFa.L), vRa.d, JPa.N);
                        n12 = ++n2;
                    }
                    int n13 = n2 = uSa.E;
                    while (n13 < uqa.g) {
                        wda_12.J(Gea.t, vRa.d, JPa.N);
                        n13 = ++n2;
                    }
                }
            }
        } else {
            Wda_1 wda_133 = wda_12;
            wda_133.f(wda_133.i * hQa.h);
            wda_133.J(wda_133.Ea * Cra.A);
            wda_133.l(wda_133.f * hQa.h);
        }
        Wda_1 wda_134 = wda_12;
        wda_134.d = JPa.N;
        double d19 = wda_134.X;
        double d20 = wda_134.c - wda_12.la;
        double d21 = wda_134.r - wda_12.A;
        double d22 = d20;
        double d23 = d21;
        if (d22 * d22 + d23 * d23 > DPa.Ia) {
            d19 = (float)(Oz.f((double)d21, (double)d20) * kta.Da / lQa.f);
        }
        double d24 = Oz.J((double)(d19 - (double)wda_12.X));
        if (d2 > vQa.c) {
            d24 = vQa.c;
        }
        if (d24 < QSa.l) {
            d24 = QSa.l;
        }
        Wda_1 wda_135 = wda_12;
        wda_135.X = (float)((double)wda_135.X + d24);
        wda_135.C(wda_135.X, wda_12.d);
        if (!wda_135.j.e) {
            Wda_1 wda_136 = wda_12;
            List list = wda_12.j.f((vL)wda_136, wda_136.J().f(Bua.Ia, aSa.V, Bua.Ia));
            if (list != null && !list.isEmpty()) {
                int n14;
                int n15 = n14 = uSa.E;
                while (n15 < list.size()) {
                    vL vL2 = (vL)list.get(n14);
                    if (vL2 != wda_12.Aa && vL2.z() && vL2 instanceof Wda_1) {
                        vL2.J((vL)wda_12);
                    }
                    n15 = ++n14;
                }
            }
            if (wda_12.Aa != null && wda_12.Aa.J) {
                wda_12.Aa = null;
            }
        }
    }

    public double d() {
        return Xsa.i;
    }

    public void M(int n2) {
        int b2 = n2;
        Wda_1 a2 = this;
        a2.aa.J(yOa.B, Integer.valueOf(b2));
    }

    /*
     * WARNING - void declaration
     */
    public Wda_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Wda_1 d5;
        Wda_1 e2 = gg2;
        Wda_1 wda_1 = d5 = this;
        Wda_1 wda_12 = d5;
        Wda_1 wda_13 = d5;
        wda_13((Gg)e2);
        wda_13.l((double)c2, (double)b2, (double)a2);
        wda_12.f(aSa.V);
        wda_12.J(aSa.V);
        d5.l(aSa.V);
        d5.c = c2;
        wda_1.ba = b2;
        wda_1.r = a2;
    }

    public float J() {
        Wda_1 a2;
        return a2.aa.J(wOa.t);
    }

    public void G() {
        Wda_1 a2;
        Wda_1 wda_1 = a2;
        wda_1.M(-wda_1.J());
        wda_1.i(NTa.C);
        wda_1.l(wda_1.J() * AQa.W);
    }

    public void M() {
        Wda_1 a2;
        if (a2.Aa != null) {
            Wda_1 wda_1 = a2;
            double d2 = Math.cos((double)wda_1.X * lQa.f / kta.Da) * Qqa.b;
            double d3 = Math.sin((double)wda_1.X * lQa.f / kta.Da) * Qqa.b;
            wda_1.Aa.l(a2.la + d2, a2.Z + a2.d() + a2.Aa.C(), a2.A + d3);
        }
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public int J() {
        Wda_1 a2;
        return a2.aa.J(yOa.B);
    }

    public void f(Waa object) {
        Wda_1 b2 = object;
        object = this;
    }
}

