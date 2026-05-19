/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Cta
 *  DQa
 *  Ed
 *  FC
 *  FPa
 *  GA
 *  Hb
 *  JPa
 *  Jc
 *  LB
 *  Mc
 *  QSa
 *  SQa
 *  UA
 *  WA
 *  WQa
 *  WSa
 *  XSa
 *  Yb
 *  ZC
 *  Zta
 *  aSa
 *  bC
 *  cC
 *  cc
 *  db
 *  ec
 *  fd
 *  hB
 *  iB
 *  jRa
 *  lqa
 *  md
 *  nd
 *  pqa
 *  tC
 *  uRa
 *  vA
 *  vQa
 *  xc
 *  ysa
 */
public final class sB_2 {
    private static final double Q = 1.3962634015954636;
    public static final d N;
    public static final d T;
    public static final d p;
    public static final d n;
    public static final d s;
    private static final double w = 2.0943951023931953;
    public static final d W;
    public static final d q;
    public static final d x;
    public static final d v;
    public static final d o;
    public static final d h;
    public static final d K;
    public static final d H;
    public static final d c;
    public static final d B;
    private static final double d = 7.5625;
    public static final d a;
    public static final d b;
    public static final d l;
    public static final d e;
    public static final d G;
    public static final d D;
    private static final double f = 2.5949095;
    public static final d F;
    private static final double g = 1.70158;
    public static final d L;
    public static final d E;
    public static final d m;
    public static final d C;
    public static final d i;
    public static final d M;
    public static final d k;
    private static final double j = 2.70158;
    public static final d J;
    public static final d A;
    private static final double I = 2.75;

    public static /* synthetic */ double y(double a2) {
        return jRa.T * a2 * a2 * a2 - XSa.E * a2 * a2;
    }

    public static /* synthetic */ double u(double a2) {
        return oua.i - Math.sqrt(oua.i - Math.pow(a2, KPa.y));
    }

    public static /* synthetic */ double q(double a2) {
        return -(Math.cos(lQa.f * a2) - oua.i) / KPa.y;
    }

    public static /* synthetic */ double z(double a2) {
        if (a2 == aSa.V) {
            return aSa.V;
        }
        if (a2 == oua.i) {
            return oua.i;
        }
        return -Math.pow(KPa.y, Wqa.m * a2 - Wqa.m) * Math.sin((a2 * Wqa.m - Yqa.V) * ySa.P);
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        float f5 = a2 = f2;
        return f5 + (b2 - f5) * c2;
    }

    public static /* synthetic */ double o(double a2) {
        double d2 = a2;
        return d2 * d2 * a2 * a2;
    }

    public static /* synthetic */ double h(double a2) {
        return oua.i - Math.pow(oua.i - a2, uRa.I);
    }

    public static /* synthetic */ double m(double a2) {
        return a2;
    }

    public static /* synthetic */ double E(double a2) {
        return oua.i - Math.pow(oua.i - a2, DQa.S);
    }

    public static /* synthetic */ double K(double a2) {
        double d2 = a2;
        return d2 * d2 * a2 * a2 * a2;
    }

    public static /* synthetic */ double c(double a2) {
        return Math.sin(a2 * lQa.f / KPa.y);
    }

    public static /* synthetic */ double B(double a2) {
        if (a2 < kTa.B) {
            return Zta.ba * a2 * a2 * a2 * a2 * a2;
        }
        return oua.i - Math.pow(SQa.E * a2 + KPa.y, DQa.S) / KPa.y;
    }

    public static /* synthetic */ double L(double a2) {
        return oua.i - n.J(oua.i - a2);
    }

    public static /* synthetic */ double b(double a2) {
        double d2 = a2;
        return d2 * d2;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4, float f5) {
        void a2;
        void c2;
        void b2;
        float f6 = f2;
        void var4_5 = b2;
        float f7 = sB_2.J(JPa.N, f6, (float)c2, pqa.r, (float)b2);
        float d2 = Math.copySign(Nra.e, (float)(b2 - f7));
        while (Math.abs((float)(b2 - f7)) > a2) {
            float f8 = d2;
            f7 = sB_2.J(JPa.N, f6, (float)c2, pqa.r, (float)(var4_5 += d2));
            if (Math.copySign(d2, (float)(b2 - f7)) == f8) continue;
            d2 *= lTa.Z;
        }
        return (float)var4_5;
    }

    public static /* synthetic */ double a(double a2) {
        return Math.sqrt(oua.i - Math.pow(a2 - oua.i, KPa.y));
    }

    public static /* synthetic */ double H(double a2) {
        if (a2 == oua.i) {
            return oua.i;
        }
        return oua.i - Math.pow(KPa.y, dsa.Ka * a2);
    }

    public static /* synthetic */ double g(double a2) {
        if (a2 < kTa.B) {
            return Wqa.Z * a2 * a2 * a2 * a2;
        }
        return oua.i - Math.pow(SQa.E * a2 + KPa.y, FPa.T) / KPa.y;
    }

    public static /* synthetic */ double I(double a2) {
        if (a2 == aSa.V) {
            return aSa.V;
        }
        return Math.pow(KPa.y, Wqa.m * a2 - Wqa.m);
    }

    public static /* synthetic */ double j(double a2) {
        if (a2 < kTa.B) {
            return (oua.i - Math.sqrt(oua.i - Math.pow(KPa.y * a2, KPa.y))) / KPa.y;
        }
        return (Math.sqrt(oua.i - Math.pow(SQa.E * a2 + KPa.y, KPa.y)) + oua.i) / KPa.y;
    }

    public static /* synthetic */ double F(double a2) {
        if (a2 == aSa.V) {
            return aSa.V;
        }
        if (a2 == oua.i) {
            return oua.i;
        }
        if (a2 < kTa.B) {
            return Math.pow(KPa.y, vQa.c * a2 - Wqa.m) / KPa.y;
        }
        return (KPa.y - Math.pow(KPa.y, QSa.l * a2 + Wqa.m)) / KPa.y;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4, float f5, float f6) {
        float b2;
        float c2;
        void a2;
        float e2 = f3;
        float d2 = f2;
        float f7 = sB_2.J(d2, e2, (float)a2);
        e2 = sB_2.J(e2, c2, (float)a2);
        c2 = sB_2.J(c2, b2, (float)a2);
        b2 = sB_2.J(f7, e2, (float)a2);
        e2 = sB_2.J(e2, c2, (float)a2);
        return sB_2.J(b2, e2, (float)a2);
    }

    public static /* synthetic */ double k(double a2) {
        if (a2 == aSa.V) {
            return aSa.V;
        }
        if (a2 == oua.i) {
            return oua.i;
        }
        if (a2 < kTa.B) {
            return -(Math.pow(KPa.y, vQa.c * a2 - Wqa.m) * Math.sin((vQa.c * a2 - qQa.Aa) * vTa.l)) / KPa.y;
        }
        return Math.pow(KPa.y, QSa.l * a2 + Wqa.m) * Math.sin((vQa.c * a2 - qQa.Aa) * vTa.l) / KPa.y + oua.i;
    }

    public static /* synthetic */ double G(double a2) {
        return oua.i + jRa.T * Math.pow(a2 - oua.i, uRa.I) + XSa.E * Math.pow(a2 - oua.i, KPa.y);
    }

    public static /* synthetic */ double D(double a2) {
        if (a2 < kTa.B) {
            return KPa.y * a2 * a2;
        }
        return oua.i - Math.pow(SQa.E * a2 + KPa.y, KPa.y) / KPa.y;
    }

    public static /* synthetic */ double A(double a2) {
        return oua.i - Math.pow(oua.i - a2, FPa.T);
    }

    public static /* synthetic */ double i(double a2) {
        if (a2 < kTa.B) {
            return Math.pow(KPa.y * a2, KPa.y) * (Zra.Ha * a2 - Hra.t) / KPa.y;
        }
        return (Math.pow(KPa.y * a2 - KPa.y, KPa.y) * (WQa.X * (a2 * KPa.y - KPa.y) + Hra.t) + KPa.y) / KPa.y;
    }

    public sB_2() {
        sB_2 a2;
    }

    public static /* synthetic */ double M(double a2) {
        double d2 = a2;
        return d2 * d2 * a2;
    }

    public static /* synthetic */ double e(double a2) {
        return oua.i - (oua.i - a2) * (oua.i - a2);
    }

    public static /* synthetic */ double d(double a2) {
        if (a2 == aSa.V) {
            return aSa.V;
        }
        if (a2 == oua.i) {
            return oua.i;
        }
        return Math.pow(KPa.y, dsa.Ka * a2) * Math.sin((a2 * Wqa.m - Bsa.x) * ySa.P) + oua.i;
    }

    public static /* synthetic */ double C(double a2) {
        if (a2 < kTa.B) {
            return (oua.i - n.J(oua.i - KPa.y * a2)) / KPa.y;
        }
        return (oua.i + n.J(KPa.y * a2 - oua.i)) / KPa.y;
    }

    public static /* synthetic */ double l(double a2) {
        if (a2 < ySa.E) {
            return ysa.Z * Math.pow(a2, KPa.y);
        }
        if (a2 < Bta.ja) {
            return ysa.Z * Math.pow(a2 - tpa.fa, KPa.y) + Bsa.x;
        }
        if (a2 < nOa.w) {
            return ysa.Z * Math.pow(a2 - lqa.W, KPa.y) + WSa.P;
        }
        return ysa.Z * Math.pow(a2 - Cta.o, KPa.y) + Nra.b;
    }

    public static /* synthetic */ double f(double a2) {
        return oua.i - Math.cos(a2 * lQa.f / KPa.y);
    }

    static {
        G = db.J();
        E = vA.J();
        x = hB.J();
        C = FC.J();
        b = tC.J();
        v = LB.J();
        p = GA.J();
        M = nd.J();
        q = MC.J();
        F = ZC.J();
        K = ec.J();
        k = Gb.J();
        e = UA.J();
        L = cC.J();
        D = Mc.J();
        l = iB.J();
        h = fd.J();
        N = WA.J();
        c = Hb.J();
        o = md.J();
        W = Cc.J();
        s = cc.J();
        i = Yb.J();
        A = xc.J();
        m = FA.J();
        T = QC.J();
        J = Jc.J();
        B = bC.J();
        n = tb.J();
        H = oC.J();
        a = Ed.J();
    }

    public static /* synthetic */ double J(double a2) {
        if (a2 < kTa.B) {
            return FPa.T * a2 * a2 * a2;
        }
        return oua.i - Math.pow(SQa.E * a2 + KPa.y, uRa.I) / KPa.y;
    }
}

