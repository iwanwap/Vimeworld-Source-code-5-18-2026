/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EK
 *  Epa
 *  FTa
 *  JPa
 *  JSa
 *  Kh
 *  Kpa
 *  MQa
 *  NQa
 *  Qsa
 *  RR
 *  VQa
 *  Vua
 *  WSa
 *  XTa
 *  YSa
 *  aT
 *  hra
 *  jt
 *  kPa
 *  kta
 *  lqa
 *  pS
 *  pqa
 *  uOa
 *  uw
 *  vQa
 *  vRa
 *  vpa
 *  wS
 *  yra
 */
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.input.Keyboard;

public final class pS_2
extends aT {
    private final Kpa i;
    public static final pS M = new pS_2();
    private static int k = EPa.O;
    private final Map<mIa, wS> j;
    private static int J = k * yRa.d + AQa.P;
    public static final String A = "##TKeystrokesHud";
    private static final int I = 2;

    public static void A() {
        RR.J((Bp)M, (jt.B != 0 ? vRa.d : uSa.E) != 0);
        k = lqa.s + jt.B * Yqa.i;
        J = k * yRa.d + AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    private void f(long l2, mIa mIa2, float f2, float f3, float f4, float f5) {
        void f6;
        void a2;
        void b2;
        void c2;
        void d2;
        Object g2 = mIa2;
        pS_2 e2 = this;
        Kh.J((double)((double)d2), (double)((double)c2), (double)((double)b2), (double)((double)a2), (int)e2.J((long)f6, (mIa)g2));
        g2 = (jt.c ? PQa.l : Mqa.y) + pS_2.J(((mIa)g2).getKeyCode());
        if (jt.B == vRa.d) {
            e2.J((long)f6, (String)g2, (float)(d2 + b2 / kta.v), (float)(c2 + a2 / kta.v), pqa.r, vRa.d != 0, jt.I, jt.D, jt.F);
            return;
        }
        if (jt.B == uqa.g) {
            e2.J((long)f6, (String)g2, (float)(d2 + b2 / kta.v), (float)(c2 + a2 / kta.v), kta.v, vRa.d != 0, jt.I, jt.D, jt.F);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        void a2;
        pS_2 pS_22 = this;
        if (uw.l) {
            return;
        }
        Cia cia2 = pS_22.i.z;
        int b2 = uSa.E;
        if (jt.J) {
            pS_2 pS_23 = pS_22;
            pS_2 pS_24 = pS_22;
            pS_24.f((long)a2, cia2.jb, k + uqa.g, b2, k, k);
            pS_23.f((long)a2, cia2.L, JPa.N, b2 += k + uqa.g, k, k);
            pS_24.f((long)a2, cia2.JA, k + uqa.g, b2, k, k);
            pS_23.f((long)a2, cia2.gd, J - k, b2, k, k);
            b2 += k + uqa.g;
        }
        if (jt.a) {
            float f2 = (float)(J - uqa.g) / kta.v;
            pS_2 pS_25 = pS_22;
            pS_25.J((long)a2, cia2.H, RR.j, JPa.N, b2, f2, k);
            pS_25.J((long)a2, cia2.pA, RR.A, (float)J - f2, b2, f2, k);
            b2 += k + uqa.g;
        }
        if (jt.H) {
            pS_22.f((long)a2, cia2.ia, JPa.N, b2, J, k);
            b2 += k + uqa.g;
        }
        if (jt.L) {
            pS_22.J((long)a2, cia2.ta, JPa.N, b2, J, k);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String J(int a2) {
        if (a2 >= 0 && a2 < hra.Ja) {
            switch (a2) {
                case 41: {
                    return kPa.x;
                }
                case 12: 
                case 74: {
                    return Vua.m;
                }
                case 40: {
                    return XTa.Z;
                }
                case 26: {
                    return dqa.X;
                }
                case 27: {
                    return XOa.D;
                }
                case 43: {
                    return vpa.H;
                }
                case 53: 
                case 181: {
                    return WSa.f;
                }
                case 51: {
                    return yra.t;
                }
                case 52: {
                    return VQa.ja;
                }
                case 39: {
                    return rua.Aa;
                }
                case 13: {
                    return vTa.S;
                }
                case 200: {
                    return kua.u;
                }
                case 208: {
                    return UTa.d;
                }
                case 203: {
                    return uOa.s;
                }
                case 205: {
                    return BQa.Ja;
                }
                case 55: {
                    return JSa.a;
                }
                case 78: {
                    return NQa.C;
                }
            }
            return Keyboard.getKeyName(a2);
        }
        switch (a2) {
            case -100: {
                return zpa.g;
            }
            case -99: {
                return Epa.d;
            }
        }
        return vRa.A;
    }

    /*
     * WARNING - void declaration
     */
    private void J(long l2, mIa mIa2, float f2, float f3, float f4, float f5) {
        void v0;
        float f6;
        float f7;
        float e22;
        void e22;
        void f8;
        void a2;
        void b2;
        void c2;
        void g2;
        float f9 = f2;
        pS_2 d2 = this;
        Kh.J((double)((double)g2), (double)((double)c2), (double)((double)b2), (double)((double)a2), (int)d2.J((long)f8, (mIa)e22));
        if (jt.B == vRa.d) {
            e22 = NSa.B;
            f7 = kta.v;
            f6 = MQa.L;
            v0 = g2;
        } else {
            e22 = gua.l;
            f7 = vQa.q;
            f6 = pqa.r;
            v0 = g2;
        }
        g2 = v0 + b2 * MQa.L - e22 * MQa.L;
        c2 = c2 + a2 * MQa.L - f7 * MQa.L;
        if (jt.F) {
            Kh.J((double)((double)(g2 + f6)), (double)((double)(c2 + f6)), (double)e22, (double)f7, (int)rRa.Da);
        }
        if (jt.I == uqa.g) {
            pS_2.J((long)f8, (float)g2, (float)c2, (float)e22, (float)f7);
            return;
        }
        Kh.J((double)((double)g2), (double)((double)c2), (double)e22, (double)f7, (int)(jt.I == vRa.d ? pS_2.J((long)f8) : jt.D));
    }

    /*
     * WARNING - void declaration
     */
    private void J(long l2, mIa mIa2, Du du2, float f2, float f3, float f4, float f5) {
        void e222;
        String f6;
        void g2;
        void a2;
        void b2;
        void c2;
        void d2;
        pS_2 pS_22 = this;
        Kh.J((double)((double)d2), (double)((double)c2), (double)((double)b2), (double)((double)a2), (int)pS_22.J((long)g2, (mIa)((Object)f6)));
        int e222 = e222.J();
        Object h2 = jt.c ? PQa.l : Mqa.y;
        f6 = new StringBuilder().insert(2 & 5, (String)h2).append(pS_2.J(((mIa)((Object)f6)).getKeyCode())).toString();
        h2 = new StringBuilder().insert(2 & 5, (String)h2).append(e222).append(JPa.Z).toString();
        if (jt.B == vRa.d) {
            Object e222 = e222 > 0 ? h2 : f6;
            pS_22.J((long)g2, (String)e222, (float)(d2 + b2 / kta.v), (float)(c2 + a2 / kta.v), pqa.r, vRa.d != 0, jt.I, jt.D, jt.F);
            return;
        }
        if (jt.B == uqa.g) {
            pS_2 pS_23 = pS_22;
            pS_23.J((long)g2, f6, (float)(d2 + b2 / kta.v), (float)(c2 + a2 / vQa.q), kta.v, vRa.d != 0, jt.I, jt.D, jt.F);
            pS_23.J((long)g2, (String)h2, (float)(d2 + b2 / kta.v), (float)(c2 + a2 - a2 / YSa.G), pqa.r, vRa.d != 0, jt.I, jt.D, jt.F);
        }
    }

    public pS_2() {
        pS_2 a2;
        pS_2 pS_22 = a2;
        super(rua.n);
        pS_22.i = Kpa.J();
        pS_2 pS_23 = a2;
        pS_23.j = new HashMap<mIa, wS>();
        pS_22.d.J(kta.v);
        pS_22.b.J(kta.v);
    }

    public float d() {
        pS_2 pS_22 = this;
        int a2 = uSa.E;
        a2 += jt.J ? uqa.g : uSa.E;
        a2 += jt.a ? vRa.d : uSa.E;
        a2 += jt.H ? vRa.d : uSa.E;
        if ((a2 += jt.L ? vRa.d : uSa.E) > 0) {
            return a2 * k + (a2 - vRa.d) * uqa.g;
        }
        return JPa.N;
    }

    public float e() {
        return J;
    }

    /*
     * WARNING - void declaration
     */
    private int J(long l2, mIa mIa2) {
        void b2;
        void a2;
        pS_2 pS_22 = this;
        pS_2 c2 = pS_22.j.get(a2);
        if (c2 == null) {
            c2 = new wS(null);
            pS_22.j.put((mIa)a2, (wS)c2);
        }
        if (a2.isKeyDown()) {
            wS.J((wS)c2, (long)b2);
        }
        return EK.J((float)(pqa.r - (float)Math.min((long)(b2 - wS.J((wS)c2)), FTa.N) / Qsa.U), (int)MTa.O, (int)LRa.G);
    }
}

