/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Dda
 *  EQa
 *  ERa
 *  Ez
 *  FPa
 *  Fpa
 *  Gl
 *  Hda
 *  IBa
 *  ISa
 *  Ifa
 *  LQa
 *  NOa
 *  NPa
 *  NQa
 *  NTa
 *  Pqa
 *  RC
 *  RQa
 *  SOa
 *  SRa
 *  Tpa
 *  Uqa
 *  VAa
 *  Vba
 *  WQa
 *  WSa
 *  XSa
 *  XTa
 *  Xsa
 *  Ypa
 *  Zpa
 *  Zta
 *  bSa
 *  bua
 *  cQa
 *  dQa
 *  dpa
 *  gZ
 *  iPa
 *  jRa
 *  kba
 *  lqa
 *  pPa
 *  pqa
 *  pua
 *  vL
 *  vPa
 *  vRa
 *  vpa
 *  wOa
 *  wra
 *  zsa
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Hda_3 {
    public static final Hda u;
    public final int O;
    public static final Hda t;
    public static final Hda R;
    public static final Hda Q;
    public static final Hda N;
    public static final Hda T;
    private final int p;
    public static final Hda n;
    private String s;
    public static final Hda w;
    public static final Hda W;
    public static final Hda q;
    private double x;
    public static final Hda v;
    public static final Hda o;
    public static final Hda h;
    private final boolean K;
    public static final Hda H;
    public static final Hda c;
    public static final Hda B;
    public static final Hda d;
    public static final Hda a;
    private int b;
    public static final Hda l;
    public static final Hda e;
    public static final Hda G;
    public static final Hda D;
    public static final Hda f;
    public static final Hda F;
    public static final Hda g;
    public static final Hda L;
    public static final Hda E;
    public static final Hda m;
    private final Map<RC, CEa> C;
    private static final Map<ResourceLocation, Hda> i;
    public static final Hda M;
    public static final Hda k;
    private boolean j;
    public static final Hda J;
    public static final Hda[] A;
    public static final Hda I;

    /*
     * WARNING - void declaration
     */
    public Hda_3(int n2, ResourceLocation resourceLocation, boolean bl, int n3) {
        void a2;
        Hda_3 hda_3;
        void b2;
        void c2;
        int e2 = n2;
        Hda_3 d2 = this;
        d2.C = Maps.newHashMap();
        d2.s = Mqa.y;
        d2.b = pua.o;
        d2.O = e2;
        Hda_3.A[e2] = d2;
        i.put((ResourceLocation)c2, (Hda)d2);
        d2.K = b2;
        if (d2.K) {
            hda_3 = d2;
            d2.x = kTa.B;
        } else {
            hda_3 = d2;
            d2.x = oua.i;
        }
        hda_3.p = a2;
    }

    /*
     * WARNING - void declaration
     */
    public double J(int n2, CEa cEa2) {
        void b2;
        CEa c2 = cEa2;
        Hda_3 a2 = this;
        return c2.J() * (double)(b2 + vRa.d);
    }

    public boolean C() {
        Hda_3 a2;
        return a2.K;
    }

    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gl gl2, Ifa ifa, int n2) {
        Hda_3 hda_3 = this;
        for (Map.Entry<RC, CEa> d2 : hda_3.C.entrySet()) {
            void a2;
            void b2;
            bA bA2 = b2.f((RC)d2.getKey());
            if (bA2 == null) continue;
            d2 = (CEa)d2.getValue();
            bA2.f((CEa)((Object)d2));
            bA2.J(new CEa(((CEa)((Object)d2)).J(), new StringBuilder().insert(5 >> 3, hda_3.J()).append(Tpa.E).append((int)a2).toString(), hda_3.J((int)a2, (CEa)((Object)d2)), ((CEa)((Object)d2)).J()));
        }
    }

    public static Set<ResourceLocation> J() {
        return i.keySet();
    }

    public Hda f(String string) {
        String b2 = string;
        Hda_3 a2 = this;
        a2.s = b2;
        return a2;
    }

    public int l() {
        Hda_3 a2;
        return a2.p;
    }

    public Map<RC, CEa> J() {
        Hda_3 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, Ifa ifa, int n2) {
        int d22 = n2;
        Hda_3 a2 = this;
        for (Map.Entry<RC, CEa> d22 : a2.C.entrySet()) {
            void b2;
            bA bA2 = b2.f(d22.getKey());
            if (bA2 == null) continue;
            bA2.f(d22.getValue());
        }
    }

    /*
     * WARNING - void declaration
     */
    public Hda J(RC rC, String string, double d2, int n2) {
        void d3;
        void a2;
        void b2;
        Object e2 = string;
        Hda_3 c2 = this;
        e2 = new CEa(UUID.fromString((String)e2), c2.J(), (double)b2, (int)a2);
        Hda_3 hda_3 = c2;
        hda_3.C.put((RC)d3, (CEa)e2);
        return hda_3;
    }

    public String J() {
        Hda_3 a2;
        return a2.s;
    }

    public boolean f() {
        Hda_3 a2;
        if (a2.b >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Hda J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Hda_3 a2 = this;
        a2.b = b2 + c2 * Yqa.i;
        return a2;
    }

    public static Hda J(String a2) {
        return (Hda_3)i.get(new ResourceLocation(a2));
    }

    public static String J(kba a2) {
        if (a2.l()) {
            return nOa.z;
        }
        return Ez.J((int)a2.l());
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, int n2) {
        Hda_3 c2 = gl2;
        Hda_3 b2 = this;
        if (b2.O == Hda_3.t.O) {
            if (c2.f() < c2.J()) {
                c2.e(pqa.r);
                return;
            }
        } else if (b2.O == Hda_3.c.O) {
            if (c2.f() > pqa.r) {
                c2.J(gZ.l, pqa.r);
                return;
            }
        } else {
            void a2;
            if (b2.O == Hda_3.H.O) {
                c2.J(gZ.E, pqa.r);
                return;
            }
            if (b2.O == Hda_3.L.O && c2 instanceof Sx) {
                ((Sx)((Object)c2)).D(POa.o * (float)(a2 + vRa.d));
                return;
            }
            if (b2.O == Hda_3.B.O && c2 instanceof Sx) {
                if (!((Gl)c2).j.e) {
                    ((Sx)((Object)c2)).J().J((int)(a2 + vRa.d), pqa.r);
                    return;
                }
            } else if (!(b2.O == Hda_3.W.O && !c2.P() || b2.O == Hda_3.q.O && c2.P())) {
                if (b2.O == Hda_3.q.O && !c2.P() || b2.O == Hda_3.W.O && c2.P()) {
                    c2.J(gZ.l, uua.p << a2);
                    return;
                }
            } else {
                c2.e(Math.max(AQa.P << a2, uSa.E));
            }
        }
    }

    public boolean J() {
        Hda_3 a2;
        return a2.j;
    }

    static {
        A = new Hda_3[fPa.i];
        i = Maps.newHashMap();
        R = null;
        o = new Hda_3(vRa.d, new ResourceLocation(TOa.Ha), uSa.E != 0, osa.P).f(SOa.h).J(uSa.E, uSa.E).J(Kha.j, fta.Z, Bua.Ia, uqa.g);
        N = new Hda_3(uqa.g, new ResourceLocation(nqa.E), vRa.d != 0, Iqa.ha).f(Fpa.f).J(vRa.d, uSa.E).J(Kha.j, dQa.la, bua.K, uqa.g);
        f = new Hda_3(yRa.d, new ResourceLocation(EQa.N), uSa.E != 0, Pua.b).f(NPa.M).J(uqa.g, uSa.E).J(Bta.c);
        I = new Hda_3(AQa.P, new ResourceLocation(Uqa.Z), vRa.d != 0, Iqa.S).f(lqa.fa).J(yRa.d, uSa.E);
        l = new VAa(tTa.h, new ResourceLocation(NOa.Z), uSa.E != 0, TOa.a).f(Zpa.g).J(AQa.P, uSa.E).J(Kha.A, dqa.l, vqa.c, uqa.g);
        W = new IBa(uua.p, new ResourceLocation(dpa.N), uSa.E != 0, IPa.L).f(vPa.w);
        q = new IBa(XTa.W, new ResourceLocation(jRa.t), vRa.d != 0, zsa.Ga).f(cPa.C);
        e = new Hda_3(Yqa.i, new ResourceLocation(tSa.A), uSa.E != 0, wOa.k).f(Zta.Ga).J(uqa.g, vRa.d);
        D = new Hda_3(WOa.fa, new ResourceLocation(QTa.Q), vRa.d != 0, Ira.Ja).f(Jpa.J).J(yRa.d, vRa.d).J(VPa.W);
        t = new Hda_3(NTa.C, new ResourceLocation(WQa.u), uSa.E != 0, rpa.R).f(Zta.x).J(XTa.W, uSa.E).J(VPa.W);
        u = new Hda_3(pPa.f, new ResourceLocation(Psa.o), uSa.E != 0, dpa.E).f(iPa.n).J(uua.p, vRa.d);
        G = new Hda_3(lqa.s, new ResourceLocation(fPa.Ka), uSa.E != 0, Fpa.W).f(LQa.Q).J(XTa.W, vRa.d);
        E = new Hda_3(uua.s, new ResourceLocation(Qra.B), uSa.E != 0, gua.Q).f(Zpa.X).J(uSa.E, uqa.g);
        k = new Hda_3(hpa.Z, new ResourceLocation(bSa.W), uSa.E != 0, Cra.f).f(Jpa.D).J(uSa.E, vRa.d);
        a = new Hda_3(Ypa.A, new ResourceLocation(Mqa.v), vRa.d != 0, lQa.C).f(QTa.T).J(tTa.h, vRa.d).J(VPa.W);
        w = new Hda_3(ERa.C, new ResourceLocation(sOa.Fa), uSa.E != 0, Npa.Ga).f(WSa.n).J(AQa.P, vRa.d);
        L = new Hda_3(yta.Ka, new ResourceLocation(Pqa.o), vRa.d != 0, Pua.m).f(Fua.H).J(vRa.d, vRa.d);
        Q = new VAa(yOa.B, new ResourceLocation(FPa.ca), vRa.d != 0, Uqa.C).f(Lsa.O).J(tTa.h, uSa.E).J(Kha.A, mPa.Aa, KPa.y, uSa.E);
        c = new Hda_3(wOa.t, new ResourceLocation(NQa.c), vRa.d != 0, SOa.A).f(zpa.j).J(uua.p, uSa.E).J(VPa.W);
        H = new Hda_3(kTa.j, new ResourceLocation(POa.Q), vRa.d != 0, pqa.g).f(Jta.g).J(vRa.d, uqa.g).J(VPa.W);
        g = new Dda(wOa.h, new ResourceLocation(XSa.Ja), uSa.E != 0, rta.O).f(ISa.j).J(uqa.g, uqa.g).J(Kha.M, RQa.Fa, FPa.T, uSa.E);
        d = new Vba(cQa.o, new ResourceLocation(tpa.y), uSa.E != 0, SRa.a).f(mPa.Da).J(uqa.g, uqa.g);
        B = new IBa(AQa.ba, new ResourceLocation(iSa.X), uSa.E != 0, IPa.L).f(Xsa.E);
        T = null;
        m = null;
        h = null;
        F = null;
        J = null;
        n = null;
        M = null;
        v = null;
    }

    public int f() {
        Hda_3 a2;
        return a2.b;
    }

    public int J() {
        Hda_3 a2;
        return a2.O;
    }

    public Hda J(double a2) {
        Hda_3 b2;
        b2.x = a2;
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        void a2;
        Hda_3 hda_3 = this;
        if (hda_3.O == Hda_3.t.O) {
            int c2 = vpa.o >> a2;
            if (c2 > 0) {
                if (b2 % c2 == false) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        if (hda_3.O == Hda_3.c.O) {
            int c2 = kTa.g >> a2;
            if (c2 > 0) {
                if (b2 % c2 == false) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        if (hda_3.O == Hda_3.H.O) {
            int c2 = wra.P >> a2;
            if (c2 > 0) {
                if (b2 % c2 == false) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        if (hda_3.O == Hda_3.L.O) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double J() {
        Hda_3 a2;
        return a2.x;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, vL vL3, Gl gl2, int n2, double d2) {
        void b2;
        void a2;
        Hda_3 f2 = gl2;
        Hda_3 c2 = this;
        if (!(c2.O == Hda_3.W.O && !f2.P() || c2.O == Hda_3.q.O && f2.P())) {
            if (c2.O == Hda_3.q.O && !f2.P() || c2.O == Hda_3.W.O && f2.P()) {
                void d3;
                void e2;
                int n3 = (int)(a2 * (double)(uua.p << b2) + kTa.B);
                if (e2 == null) {
                    f2.J(gZ.l, n3);
                    return;
                }
                f2.J(gZ.f((vL)e2, (vL)d3), n3);
                return;
            }
        } else {
            int n4 = (int)(a2 * (double)(AQa.P << b2) + kTa.B);
            f2.e(n4);
        }
    }
}

