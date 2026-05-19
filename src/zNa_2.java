/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  ERa
 *  Epa
 *  JQa
 *  Kna
 *  Lra
 *  NTa
 *  SOa
 *  Tpa
 *  Uqa
 *  Vua
 *  WQa
 *  Woa
 *  XTa
 *  Ypa
 *  ZOa
 *  ZRa
 *  Zpa
 *  Zta
 *  aSa
 *  ac
 *  cQa
 *  cRa
 *  cX
 *  cra
 *  fTa
 *  fpa
 *  fsa
 *  jRa
 *  jsa
 *  kqa
 *  kta
 *  lqa
 *  mZ
 *  oqa
 *  pPa
 *  pQa
 *  pb
 *  pqa
 *  pua
 *  uOa
 *  uRa
 *  ura
 *  vLa
 *  vRa
 *  vU
 *  wOa
 *  zNa
 */
import java.io.IOException;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public final class zNa_2
extends EC {
    private ac v;
    private int o;
    private ac h;
    private String K;
    private ac H;
    private boolean c;
    private Woa B;
    private String d;
    private boolean a;
    private boolean b;
    private ac l;
    private String e;
    private Woa G;
    private boolean D;
    private String F;
    private String g;
    private boolean L;
    private static final String[] E;
    private boolean m;
    private ac C;
    private String i;
    private ac M;
    public String k;
    private boolean j;
    private EC J;
    private ac A;
    private String I;

    static {
        String[] stringArray = new String[osa.c];
        stringArray[uSa.E] = pQa.I;
        stringArray[vRa.d] = Nra.f;
        stringArray[uqa.g] = jsa.X;
        stringArray[yRa.d] = Nra.k;
        stringArray[AQa.P] = dqa.x;
        stringArray[tTa.h] = oqa.Y;
        stringArray[uua.p] = yRa.E;
        stringArray[XTa.W] = Lra.P;
        stringArray[Yqa.i] = Zpa.V;
        stringArray[WOa.fa] = Epa.fa;
        stringArray[NTa.C] = fTa.Aa;
        stringArray[pPa.f] = WOa.H;
        stringArray[lqa.s] = Npa.R;
        stringArray[uua.s] = cra.t;
        stringArray[hpa.Z] = nqa.z;
        stringArray[Ypa.A] = tua.p;
        stringArray[ERa.C] = xqa.i;
        stringArray[yta.Ka] = dua.Ka;
        stringArray[yOa.B] = rSa.l;
        stringArray[wOa.t] = fsa.o;
        stringArray[kTa.j] = LRa.ha;
        stringArray[wOa.h] = WOa.g;
        stringArray[cQa.o] = Fua.X;
        stringArray[AQa.ba] = kua.ja;
        E = stringArray;
    }

    private void J(boolean bl) {
        zNa_2 zNa_22;
        boolean b2 = bl;
        zNa_2 a2 = this;
        a2.D = b2;
        if (Fy.f[a2.o] == Fy.A) {
            a2.M.k = !a2.D ? vRa.d : uSa.E;
            a2.M.J = uSa.E;
            if (a2.d == null) {
                a2.d = a2.i;
            }
            zNa_22 = a2;
            a2.i = aSa.N;
            a2.v.k = uSa.E;
            a2.A.k = uSa.E;
            a2.H.k = a2.D;
            a2.h.k = uSa.E;
            a2.l.k = uSa.E;
        } else {
            a2.M.k = !a2.D ? vRa.d : uSa.E;
            a2.M.J = vRa.d;
            if (a2.d != null) {
                a2.i = a2.d;
                a2.d = null;
            }
            a2.v.k = a2.D && Fy.f[a2.o] != Fy.m ? vRa.d : uSa.E;
            a2.A.k = a2.D;
            a2.H.k = a2.D;
            a2.h.k = a2.D;
            a2.l.k = a2.D && (Fy.f[a2.o] == Fy.k || Fy.f[a2.o] == Fy.m) ? vRa.d : uSa.E;
            zNa_22 = a2;
        }
        zNa_22.f();
        zNa_2 zNa_23 = a2;
        if (a2.D) {
            zNa_23.C.i = oha.J(cra.g, new Object[uSa.E]);
            return;
        }
        zNa_23.C.i = oha.J(pta.n, new Object[uSa.E]);
    }

    public void J(ac ac2) throws IOException {
        zNa_2 b2 = ac2;
        zNa_2 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == vRa.d) {
                zNa_2 zNa_22 = a2;
                zNa_22.g.J(zNa_22.J);
                return;
            }
            if (((ac)b2).C == 0) {
                a2.g.J((EC)null);
                if (a2.a) {
                    return;
                }
                a2.a = vRa.d;
                long l2 = new Random().nextLong();
                String string = a2.G.f();
                if (!StringUtils.isEmpty(string)) {
                    try {
                        long l3 = Long.parseLong(string);
                        if (l3 != nqa.i) {
                            l2 = l3;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        l2 = string.hashCode();
                    }
                }
                zNa_2 zNa_23 = a2;
                Daa daa = Daa.getByName(zNa_23.i);
                zNa_2 zNa_24 = a2;
                mZ mZ2 = new mZ(l2, daa, zNa_24.m, zNa_24.L, Fy.f[a2.o]);
                mZ2.J(a2.k);
                if (zNa_23.b && !a2.L) {
                    mZ2.J();
                }
                if (a2.c && !a2.L) {
                    mZ2.f();
                }
                zNa_2 zNa_25 = a2;
                zNa_25.g.J(zNa_25.F, a2.B.f().trim(), mZ2);
                return;
            }
            if (((ac)b2).C == yRa.d) {
                a2.D();
                return;
            }
            if (((ac)b2).C == uqa.g) {
                zNa_2 zNa_26;
                if (a2.i.equals(APa.k)) {
                    if (!a2.j) {
                        a2.c = uSa.E;
                    }
                    zNa_2 zNa_27 = a2;
                    zNa_26 = zNa_27;
                    zNa_27.L = uSa.E;
                    zNa_27.i = Jqa.m;
                    zNa_27.L = vRa.d;
                    zNa_27.h.J = uSa.E;
                    zNa_27.A.J = uSa.E;
                    zNa_27.f();
                } else if (a2.i.equals(Jqa.m)) {
                    if (!a2.j) {
                        a2.c = vRa.d;
                    }
                    zNa_2 zNa_28 = a2;
                    zNa_26 = zNa_28;
                    zNa_28.L = uSa.E;
                    zNa_28.i = mPa.P;
                    zNa_28.f();
                    zNa_28.L = uSa.E;
                    zNa_28.h.J = vRa.d;
                    zNa_28.A.J = vRa.d;
                } else {
                    if (!a2.j) {
                        a2.c = uSa.E;
                    }
                    zNa_2 zNa_29 = a2;
                    zNa_26 = zNa_29;
                    zNa_29.i = APa.k;
                    zNa_29.f();
                    zNa_29.h.J = vRa.d;
                    zNa_29.A.J = vRa.d;
                    zNa_29.L = uSa.E;
                }
                zNa_26.f();
                return;
            }
            if (((ac)b2).C == AQa.P) {
                a2.m = !a2.m ? vRa.d : uSa.E;
                a2.f();
                return;
            }
            if (((ac)b2).C == XTa.W) {
                a2.b = !a2.b ? vRa.d : uSa.E;
                a2.f();
                return;
            }
            if (((ac)b2).C == tTa.h) {
                zNa_2 zNa_210 = a2;
                zNa_210.o += vRa.d;
                if (zNa_210.o >= Fy.f.length) {
                    a2.o = uSa.E;
                }
                block2: while (true) {
                    zNa_2 zNa_211 = a2;
                    while (!zNa_211.d()) {
                        zNa_2 zNa_212 = a2;
                        zNa_212.o += vRa.d;
                        if (zNa_212.o < Fy.f.length) continue block2;
                        zNa_211 = a2;
                        a2.o = uSa.E;
                    }
                    break;
                }
                zNa_2 zNa_213 = a2;
                zNa_213.k = Mqa.y;
                zNa_213.f();
                zNa_213.J(zNa_213.D);
                return;
            }
            if (((ac)b2).C == uua.p) {
                a2.j = vRa.d;
                a2.c = !a2.c ? vRa.d : uSa.E;
                a2.f();
                return;
            }
            if (((ac)b2).C == Yqa.i) {
                if (Fy.f[a2.o] == Fy.k) {
                    zNa_2 zNa_214 = a2;
                    a2.g.J((EC)new vLa((zNa)zNa_214, zNa_214.k));
                    return;
                }
                zNa_2 zNa_215 = a2;
                a2.g.J((EC)new ZLa(zNa_215, zNa_215.k));
            }
        }
    }

    public void l() {
        zNa_2 a2;
        zNa_2 zNa_22 = a2;
        zNa_22.B.C();
        zNa_22.G.C();
    }

    public void A() {
        zNa_2 a2;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        zNa_2 zNa_22 = a2;
        zNa_22.E.clear();
        zNa_22.E.add(new ac(uSa.E, (int)(a2.A / uqa.g - BQa.Q), (int)(a2.I - EPa.O), Jpa.Ha, kTa.j, oha.J(KQa.b, new Object[uSa.E])));
        a2.E.add(new ac(vRa.d, (int)(a2.A / uqa.g + tTa.h), (int)(a2.I - EPa.O), Jpa.Ha, kTa.j, oha.J(SOa.l, new Object[uSa.E])));
        a2.M = new ac(uqa.g, (int)(a2.A / uqa.g - jRa.X), pta.ba, Jpa.Ha, kTa.j, oha.J(ZRa.ja, new Object[uSa.E]));
        a2.E.add(a2.M);
        a2.C = new ac(yRa.d, (int)(a2.A / uqa.g - jRa.X), JQa.O, Jpa.Ha, kTa.j, oha.J(pta.n, new Object[uSa.E]));
        a2.E.add(a2.C);
        a2.v = new ac(AQa.P, (int)(a2.A / uqa.g - BQa.Q), ySa.T, Jpa.Ha, kTa.j, oha.J(JQa.U, new Object[uSa.E]));
        a2.E.add(a2.v);
        a2.v.k = uSa.E;
        a2.A = new ac(XTa.W, (int)(a2.A / uqa.g + tTa.h), Uqa.s, Jpa.Ha, kTa.j, oha.J(cRa.F, new Object[uSa.E]));
        a2.E.add(a2.A);
        a2.A.k = uSa.E;
        a2.H = new ac(tTa.h, (int)(a2.A / uqa.g + tTa.h), ySa.T, Jpa.Ha, kTa.j, oha.J(kta.s, new Object[uSa.E]));
        a2.E.add(a2.H);
        a2.H.k = uSa.E;
        a2.h = new ac(uua.p, (int)(a2.A / uqa.g - BQa.Q), Uqa.s, Jpa.Ha, kTa.j, oha.J(qsa.X, new Object[uSa.E]));
        a2.E.add(a2.h);
        a2.h.k = uSa.E;
        a2.l = new ac(Yqa.i, (int)(a2.A / uqa.g + tTa.h), sOa.D, Jpa.Ha, kTa.j, oha.J(WQa.F, new Object[uSa.E]));
        a2.E.add(a2.l);
        zNa_2 zNa_23 = a2;
        zNa_23.l.k = uSa.E;
        zNa_2 zNa_24 = a2;
        zNa_23.B = new Woa(WOa.fa, (Kna)zNa_24.L, (int)(zNa_24.A / uqa.g - ySa.T), Psa.M, ZOa.x, kTa.j);
        zNa_23.B.l(vRa.d != 0);
        zNa_23.B.f(a2.I);
        zNa_2 zNa_25 = a2;
        zNa_23.G = new Woa(NTa.C, (Kna)zNa_25.L, (int)(zNa_25.A / uqa.g - ySa.T), Psa.M, ZOa.x, kTa.j);
        zNa_23.G.f(a2.K);
        zNa_23.J(zNa_23.D);
        zNa_23.J();
        zNa_23.f();
    }

    public zNa_2(EC eC2) {
        zNa_2 a2;
        zNa_2 b2 = eC2;
        zNa_2 zNa_22 = a2 = this;
        zNa_2 zNa_23 = a2;
        a2.i = APa.k;
        a2.m = vRa.d;
        zNa_23.k = Mqa.y;
        zNa_22.J = b2;
        zNa_23.K = Mqa.y;
        zNa_22.I = oha.J(kqa.c, new Object[uSa.E]);
    }

    public static String J(pb pb2, String string) {
        int n2;
        Object b2 = string;
        pb a2 = pb2;
        b2 = ((String)b2).replaceAll(uRa.Ka, IPa.W);
        String[] stringArray = E;
        int n3 = E.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            String string2 = stringArray[n2];
            if (((String)b2).equalsIgnoreCase(string2)) {
                b2 = new StringBuilder().insert(3 ^ 3, IPa.W).append((String)b2).append(IPa.W).toString();
            }
            n4 = ++n2;
        }
        pb pb3 = a2;
        while (pb3.J((String)b2) != null) {
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(Vua.m).toString();
            pb3 = a2;
        }
        return b2;
    }

    private boolean d() {
        zNa_2 zNa_22 = this;
        Fy a2 = Fy.f[zNa_22.o];
        if (a2 != null && a2.J()) {
            if (a2 == Fy.A) {
                return zNa_2.l();
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void D() {
        zNa_2 a2;
        zNa_2 zNa_22 = a2;
        zNa_22.J((!zNa_22.D ? vRa.d : uSa.E) != 0);
    }

    public void M() {
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }

    private void f() {
        zNa_2 zNa_22;
        zNa_2 zNa_23;
        zNa_2 a2;
        a2.M.i = oha.J(ZRa.ja, new Object[uSa.E]) + Xpa.E + oha.J(new StringBuilder().insert(3 & 4, WQa.H).append(a2.i).toString(), new Object[uSa.E]);
        zNa_2 zNa_24 = a2;
        a2.e = oha.J(WQa.H + a2.i + rpa.z, new Object[uSa.E]);
        a2.g = oha.J(new StringBuilder().insert(5 >> 3, WQa.H).append(a2.i).append(wOa.Ha).toString(), new Object[uSa.E]);
        a2.v.i = oha.J(JQa.U, new Object[uSa.E]) + Tpa.E;
        if (a2.m) {
            a2.v.i = new StringBuilder().insert(2 & 5, a2.v.i).append(oha.J(ppa.H, new Object[uSa.E])).toString();
            zNa_23 = a2;
        } else {
            a2.v.i = new StringBuilder().insert(5 >> 3, a2.v.i).append(oha.J(tSa.Ha, new Object[uSa.E])).toString();
            zNa_23 = a2;
        }
        zNa_23.A.i = oha.J(cRa.F, new Object[uSa.E]) + Tpa.E;
        if (a2.b && !a2.L) {
            a2.A.i = new StringBuilder().insert(3 & 4, a2.A.i).append(oha.J(ppa.H, new Object[uSa.E])).toString();
            zNa_22 = a2;
        } else {
            a2.A.i = new StringBuilder().insert(2 & 5, a2.A.i).append(oha.J(tSa.Ha, new Object[uSa.E])).toString();
            zNa_22 = a2;
        }
        zNa_22.H.i = oha.J(kta.s, new Object[uSa.E]) + Tpa.E + oha.J(Fy.f[a2.o].f(), new Object[uSa.E]);
        a2.h.i = oha.J(qsa.X, new Object[uSa.E]) + Tpa.E;
        if (a2.c && !a2.L) {
            a2.h.i = new StringBuilder().insert(5 >> 3, a2.h.i).append(oha.J(ppa.H, new Object[uSa.E])).toString();
            return;
        }
        a2.h.i = new StringBuilder().insert(3 ^ 3, a2.h.i).append(oha.J(tSa.Ha, new Object[uSa.E])).toString();
    }

    private void J() {
        int a2;
        zNa_2 zNa_22 = this;
        zNa_22.F = zNa_22.B.f().trim();
        char[] cArray = cX.I;
        int n2 = cX.I.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            char c2 = cArray[a2];
            zNa_22.F = zNa_22.F.replace(c2, (char)pqa.ga);
            n3 = ++a2;
        }
        if (StringUtils.isEmpty(zNa_22.F)) {
            zNa_22.F = ura.ja;
        }
        zNa_22.F = zNa_2.J(zNa_22.g.J(), zNa_22.F);
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int n3;
        int c3 = n2;
        zNa_2 a2 = this;
        if (a2.B.f() && !a2.D) {
            int n4 = c3;
            n3 = n4;
            a2.B.J((char)b2, n4);
            a2.I = a2.B.f();
        } else {
            if (a2.G.f() && a2.D) {
                a2.G.J((char)b2, c3);
                a2.K = a2.G.f();
            }
            n3 = c3;
        }
        if (n3 == EPa.O || c3 == yRa.r) {
            zNa_2 zNa_22 = a2;
            zNa_22.J((ac)zNa_22.E.get(uSa.E));
        }
        ((ac)a2.E.get((int)uSa.E)).J = a2.B.f().length() > 0 ? vRa.d : uSa.E;
        a2.J();
    }

    public void J(vU vU2) {
        zNa_2 b2 = vU2;
        zNa_2 a2 = this;
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2.f();
        a2.I = oha.J(AQa.la, objectArray);
        zNa_2 zNa_22 = b2;
        zNa_2 zNa_23 = a2;
        zNa_2 zNa_24 = b2;
        zNa_2 zNa_25 = a2;
        zNa_25.K = b2.C() + Mqa.y;
        a2.o = zNa_24.J().f();
        zNa_23.k = zNa_24.J();
        zNa_23.m = b2.l();
        a2.c = zNa_22.M();
        if (zNa_22.d()) {
            a2.i = Jqa.m;
            return;
        }
        if (b2.J().isSurvivalOrAdventure()) {
            a2.i = APa.k;
            return;
        }
        if (b2.J().isCreative()) {
            a2.i = mPa.P;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        zNa_2 zNa_22;
        float d2;
        block4: {
            zNa_2 a2;
            block3: {
                block2: {
                    d2 = f2;
                    a2 = this;
                    a2.i();
                    zNa_2 zNa_23 = a2;
                    zNa_2.J((String)oha.J(KQa.b, new Object[uSa.E]), (int)(zNa_23.A / uqa.g), (int)kTa.j, (int)pua.o);
                    if (!zNa_23.D) break block2;
                    zNa_2.f((String)oha.J(SOa.P, new Object[uSa.E]), (int)(a2.A / uqa.g - ySa.T), (int)uOa.F, (int)gsa.Ga);
                    zNa_2.f((String)oha.J(ERa.a, new Object[uSa.E]), (int)(a2.A / uqa.g - ySa.T), (int)Ira.ga, (int)gsa.Ga);
                    if (a2.v.k) {
                        zNa_2.f((String)oha.J(uOa.Q, new Object[uSa.E]), (int)(a2.A / uqa.g - Jpa.Ha), (int)Zta.Ma, (int)gsa.Ga);
                    }
                    if (a2.h.k) {
                        zNa_2.f((String)oha.J(fpa.l, new Object[uSa.E]), (int)(a2.A / uqa.g - Jpa.Ha), (int)ERa.T, (int)gsa.Ga);
                    }
                    a2.G.J();
                    if (!Fy.f[a2.o].f()) break block3;
                    a2.L.J(oha.J(Fy.f[a2.o].l(), new Object[uSa.E]), a2.H.m + uqa.g, a2.H.I + cQa.o, a2.H.J(), xra.R);
                    zNa_22 = a2;
                    break block4;
                }
                zNa_2.f((String)oha.J(WPa.Ka, new Object[uSa.E]), (int)(a2.A / uqa.g - ySa.T), (int)uOa.F, (int)gsa.Ga);
                zNa_2.f((String)(oha.J(gsa.V, new Object[uSa.E]) + Tpa.E + a2.F), (int)(a2.A / uqa.g - ySa.T), (int)Ira.ga, (int)gsa.Ga);
                zNa_2 zNa_24 = a2;
                zNa_24.B.J();
                zNa_2 zNa_25 = a2;
                zNa_2.f((String)zNa_24.e, (int)(zNa_25.A / uqa.g - ySa.T), (int)ATa.L, (int)gsa.Ga);
                zNa_2.f((String)zNa_25.g, (int)(a2.A / uqa.g - ySa.T), (int)gQa.V, (int)gsa.Ga);
            }
            zNa_22 = a2;
        }
        super.J((int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        zNa_2 a2;
        int d2 = n4;
        zNa_2 zNa_22 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        if (zNa_22.D) {
            a2.G.J((int)c2, (int)b2, d2);
            return;
        }
        a2.B.J((int)c2, (int)b2, d2);
    }
}

