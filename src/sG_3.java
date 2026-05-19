/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ae
 *  BRa
 *  Bh
 *  Bpa
 *  Cj
 *  Cta
 *  DQa
 *  ERa
 *  Ef
 *  FH
 *  Fe
 *  Fpa
 *  GD
 *  Gua
 *  If
 *  JSa
 *  KTa
 *  MQa
 *  NG
 *  NI
 *  NQa
 *  Oe
 *  Of
 *  Oz
 *  Pg
 *  Pi
 *  Ppa
 *  QE
 *  Qe
 *  Qh
 *  Qqa
 *  Qsa
 *  Sh
 *  TD
 *  Te
 *  Ug
 *  Uta
 *  Vh
 *  WN
 *  WSa
 *  Xsa
 *  YF
 *  YSa
 *  Yra
 *  ZG
 *  Zf
 *  bI
 *  bSa
 *  ch
 *  de
 *  gj
 *  hD
 *  iH
 *  ji
 *  jpa
 *  kPa
 *  kta
 *  lG
 *  lqa
 *  me
 *  oG
 *  oH
 *  of
 *  og
 *  pD
 *  pQa
 *  pqa
 *  pua
 *  rF
 *  ri
 *  sg
 *  tg
 *  uD
 *  vRa
 *  wOa
 *  wra
 *  xF
 *  xG
 *  yH
 *  yra
 *  ysa
 *  zH
 */
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public final class sG_3 {
    public static final Map<WN, K> J;
    public static final K A;
    public static final Map<String, K> I;

    public static float y(float a2) {
        if ((double)a2 < kTa.B) {
            return YSa.G * a2 * a2 * a2;
        }
        return (a2 - pqa.r) * (kta.v * a2 - kta.v) * (kta.v * a2 - kta.v) + pqa.r;
    }

    public static float u(float a2) {
        float f2 = a2;
        float f3 = f2 * f2;
        return f3 * f3 * Oz.d((float)(a2 * pua.j * Jta.r));
    }

    /*
     * WARNING - void declaration
     */
    public static K J(float f2, float f3, float f4, float f5) {
        void b2;
        void c2;
        float d2 = f5;
        float a2 = f2;
        return new Ef(a2, (float)c2, (float)b2, d2);
    }

    public static float q(float a2) {
        if ((double)a2 < kTa.B) {
            return Qsa.k * a2 * a2 * a2 * a2;
        }
        return pqa.r - Qsa.k * (a2 -= pqa.r) * a2 * a2 * a2;
    }

    public static float z(float a2) {
        return Oz.d((float)(a2 * jpa.f));
    }

    public static float o(float a2) {
        if (a2 < MQa.L) {
            return (pqa.r - Oz.J((float)(pqa.r - kta.v * a2))) * MQa.L;
        }
        return (pqa.r + Oz.J((float)(kta.v * a2 - pqa.r))) * MQa.L;
    }

    public static float h(float a2) {
        if ((double)a2 < kTa.B) {
            return Qsa.k * (float)Math.pow(KPa.y, Qsa.k * (a2 - pqa.r)) * Oz.l((float)Oz.d((float)(a2 * pua.j * BRa.k)));
        }
        return pqa.r - Qsa.k * (float)Math.pow(KPa.y, sOa.Z * a2) * Oz.l((float)Oz.d((float)(a2 * pua.j * BRa.k)));
    }

    public static float m(float a2) {
        float f2 = a2;
        return f2 * f2 * a2;
    }

    public static float E(float a2) {
        return ((float)Math.pow(KPa.y, Qsa.k * a2) - pqa.r) / NQa.Y;
    }

    public static float K(float a2) {
        return pqa.r - (a2 -= pqa.r) * a2 * a2 * a2;
    }

    public static float c(float a2) {
        return pqa.r + (a2 -= pqa.r) * a2 * a2 * a2 * a2;
    }

    public static float B(float a2) {
        float f2 = a2;
        return f2 * f2 * a2 * a2 * a2;
    }

    public static float L(float a2) {
        return pqa.r - (float)Math.pow(KPa.y, NSa.b * a2) * Oz.l((float)Oz.C((float)(a2 * pua.j * Bpa.w)));
    }

    public static float b(float a2) {
        float f2 = a2;
        return f2 * f2;
    }

    public sG_3() {
        sG_3 a2;
    }

    public static float a(float a2) {
        float f2 = a2;
        return f2 * (kta.v - f2);
    }

    public static float H(float a2) {
        return a2;
    }

    public static float g(float a2) {
        return (a2 -= pqa.r) * a2 * a2 + pqa.r;
    }

    public static K J(String string, K k2) {
        K b2 = k2;
        String a2 = string;
        if (I.containsKey(a2 = a2.trim())) {
            return I.get(a2);
        }
        if (a2.startsWith(Qsa.a) && a2.endsWith(hpa.b)) {
            String string2 = a2;
            return sG_3.J(string2.substring(uua.s, string2.length() - vRa.d));
        }
        return b2;
    }

    public static float I(float a2) {
        return (float)Math.pow(KPa.y, lqa.ga * (a2 - pqa.r)) * Oz.l((float)Oz.d((float)(a2 * pua.j * Bpa.w)));
    }

    public static float j(float a2) {
        if (a2 < MQa.L) {
            float f2 = a2;
            return f2 * f2 * (BRa.k * a2 - MTa.y) * kta.v;
        }
        return pqa.r + (a2 -= pqa.r) * a2 * kta.v * (BRa.k * a2 + MTa.y);
    }

    public static K J(String string) {
        String string2 = string;
        String[] a22 = string2.split(yra.t);
        if (a22.length != AQa.P) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, tua.t).append(string2).toString());
        }
        float a22 = Float.parseFloat(a22[uSa.E]);
        float f2 = Float.parseFloat(a22[vRa.d]);
        float f3 = Float.parseFloat(a22[uqa.g]);
        float f4 = Float.parseFloat(a22[yRa.d]);
        return new Ef(a22, f2, f3, f4);
    }

    public static float F(float f2) {
        float a2;
        float f3 = f2;
        float f4 = a2 = (f3 - pqa.r) * (f3 - pqa.r);
        return pqa.r - f4 * f4 * Oz.C((float)(f3 * pua.j * Jta.r));
    }

    public static float k(float a2) {
        return pqa.r - Oz.J((float)(pqa.r - a2));
    }

    public static float G(float a2) {
        return MQa.L * (pqa.r + Oz.d((float)(pua.j * (a2 - MQa.L))));
    }

    static {
        I = new HashMap<String, K>();
        J = new EnumMap<WN, K>(WN.class);
        A = vG.J();
        I.put(bSa.u, yh.J());
        I.put(WOa.m, zH.J());
        I.put(KQa.p, QH.J());
        I.put(uua.Ka, rF.J());
        I.put(Nra.B, pD.J());
        I.put(Fpa.Ka, YF.J());
        I.put(BQa.z, fD.J());
        I.put(vRa.Ga, mg.J());
        I.put(Era.H, kh.J());
        I.put(Uta.Da, Vh.J());
        I.put(JSa.t, zG.J());
        I.put(ysa.j, ch.J());
        I.put(WRa.s, Oh.J());
        I.put(Xsa.l, iH.J());
        I.put(DQa.W, bI.J());
        I.put(Qqa.Z, tg.J());
        I.put(UOa.L, dI.J());
        I.put(fta.x, yH.J());
        I.put(fta.J, Qh.J());
        I.put(fPa.Q, Cj.J());
        I.put(xTa.A, ZG.J());
        I.put(MQa.e, oG.J());
        I.put(Jra.G, FH.J());
        I.put(wra.ga, ji.J());
        I.put(Ppa.y, NG.J());
        I.put(Gua.i, NI.J());
        I.put(Wqa.I, oH.J());
        I.put(Jra.I, Bh.J());
        I.put(WSa.M, ri.J());
        I.put(wsa.Ja, gj.J());
        I.put(Cta.O, xG.J());
        J.put(WN.LINEAR, TG.J());
        J.put(WN.EASE_IN_SINE, Ug.J());
        J.put(WN.EASE_OUT_SINE, og.J());
        J.put(WN.EASE_IN_OUT_SINE, Sh.J());
        J.put(WN.EASE_IN_QUAD, Pi.J());
        J.put(WN.EASE_OUT_QUAD, Pg.J());
        J.put(WN.EASE_IN_OUT_QUAD, lG.J());
        J.put(WN.EASE_IN_CUBIC, nh.J());
        J.put(WN.EASE_OUT_CUBIC, sg.J());
        J.put(WN.EASE_IN_OUT_CUBIC, JH.J());
        J.put(WN.EASE_IN_QUART, If.J());
        J.put(WN.EASE_OUT_QUART, Ye.J());
        J.put(WN.EASE_IN_OUT_QUART, Fe.J());
        J.put(WN.EASE_IN_QUINT, MF.J());
        J.put(WN.EASE_OUT_QUINT, Ae.J());
        J.put(WN.EASE_IN_OUT_QUINT, Of.J());
        J.put(WN.EASE_IN_EXPO, yf.J());
        J.put(WN.EASE_OUT_EXPO, QE.J());
        J.put(WN.EASE_IN_OUT_EXPO, QD.J());
        J.put(WN.EASE_IN_CIRC, Te.J());
        J.put(WN.EASE_OUT_CIRC, uD.J());
        J.put(WN.EASE_IN_OUT_CIRC, me.J());
        J.put(WN.EASE_IN_BACK, of.J());
        J.put(WN.EASE_OUT_BACK, xF.J());
        J.put(WN.EASE_IN_OUT_BACK, GD.J());
        J.put(WN.EASE_IN_ELASTIC, de.J());
        J.put(WN.EASE_OUT_ELASTIC, TD.J());
        J.put(WN.EASE_IN_OUT_ELASTIC, Zf.J());
        J.put(WN.EASE_IN_BOUNCE, Oe.J());
        J.put(WN.EASE_OUT_BOUNCE, Qe.J());
        J.put(WN.EASE_IN_OUT_BOUNCE, hD.J());
    }

    public static K J(WN wN2, K k2) {
        Object b2 = k2;
        WN a2 = wN2;
        return J.getOrDefault(a2, (K)b2);
    }

    public static float D(float a2) {
        float f2 = a2;
        return f2 * f2 * a2 * a2;
    }

    public static float A(float a2) {
        return pqa.r - (float)Math.pow(KPa.y, sOa.Z * a2);
    }

    public static float i(float a2) {
        if ((double)a2 < kTa.B) {
            return Yra.i * a2 * a2 * a2 * a2 * a2;
        }
        return pqa.r + Yra.i * (a2 -= pqa.r) * a2 * a2 * a2 * a2;
    }

    public static float M(float a2) {
        return Oz.J((float)a2);
    }

    public static float e(float a2) {
        if ((double)a2 < kTa.B) {
            return kta.v * a2 * a2;
        }
        return vqa.T + (YSa.G - kta.v * a2) * a2;
    }

    public static float d(float f2) {
        float a2;
        float f3 = f2;
        if (f3 < KTa.r) {
            float f4 = f3;
            a2 = f4 * f4;
            return Qsa.k * a2 * a2 * Oz.d((float)(f3 * pua.j * kPa.S));
        }
        if (f3 < vTa.N) {
            return MQa.L + wOa.w * Oz.d((float)(f3 * pua.j * YSa.G));
        }
        a2 = (f3 - pqa.r) * (f3 - pqa.r);
        return pqa.r - Qsa.k * a2 * a2 * Oz.d((float)(f3 * pua.j * kPa.S));
    }

    public static float C(float a2) {
        float f2 = a2;
        return f2 * f2 * (pQa.Ka * a2 - ERa.K);
    }

    public static float l(float a2) {
        if (a2 < MQa.L) {
            return ((float)Math.pow(KPa.y, Yra.i * a2) - pqa.r) / MTa.Ga;
        }
        return pqa.r - MQa.L * (float)Math.pow(KPa.y, FRa.B * (a2 - MQa.L));
    }

    public static float f(float a2) {
        return pqa.r + Oz.d((float)((a2 - pqa.r) * jpa.f));
    }

    public static float J(float a2) {
        return pqa.r + (a2 -= pqa.r) * a2 * (pQa.Ka * a2 + ERa.K);
    }
}

