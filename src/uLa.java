/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  EC
 *  Epa
 *  FPa
 *  Gma
 *  Goa
 *  Kpa
 *  Loa
 *  MNa
 *  NPa
 *  Ppa
 *  Pqa
 *  Qsa
 *  Rna
 *  SOa
 *  Ssa
 *  Wc
 *  XTa
 *  ZOa
 *  ac
 *  bNa
 *  bqa
 *  dOa
 *  foa
 *  iPa
 *  jRa
 *  l
 *  lma
 *  pua
 *  uRa
 *  vPa
 *  vRa
 *  vpa
 *  xoa
 *  ysa
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uLa
extends EC
implements l {
    private EC l;
    private boolean e;
    private boolean G;
    private pna D;
    private ac f;
    private lma F;
    private gNa g;
    private String L;
    private ac E;
    private boolean m;
    private boolean C;
    private boolean i;
    private goa M;
    private xoa k;
    private boolean j;
    private ac J;
    private static final Logger A = LogManager.getLogger();
    private final dOa I;

    private void D() {
        uLa a2;
        a2.g.J(new uLa(a2.l));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        uLa b2;
        int d2 = n3;
        uLa uLa2 = b2 = this;
        uLa2.L = null;
        uLa2.i();
        uLa2.D.J((int)c2, d2, (float)a2);
        uLa.J((String)oha.J(Pua.x, new Object[uSa.E]), (int)(b2.A / uqa.g), (int)kTa.j, (int)pua.o);
        uLa uLa3 = b2;
        super.J((int)c2, d2, (float)a2);
        if (uLa3.L != null) {
            uLa uLa4 = b2;
            uLa4.J(Lists.newArrayList(Splitter.on(SPa.O).split(uLa4.L)), (int)c2, d2);
        }
    }

    public void d() throws IOException {
        uLa a2;
        uLa uLa2 = a2;
        super.d();
        uLa2.D.f();
    }

    public boolean f(Rna rna, int n2) {
        int c2 = n2;
        uLa a2 = this;
        if (c2 < a2.k.J() - vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        uLa a2;
        int d2 = n4;
        uLa uLa2 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        uLa2.D.J((int)c2, (int)b2, d2);
    }

    public void f() {
        uLa a2;
        Object object;
        uLa uLa2 = this;
        if (uLa2.D.i() < 0) {
            object = null;
        } else {
            uLa uLa3 = uLa2;
            object = a2 = uLa3.D.J(uLa3.D.i());
        }
        if (a2 instanceof Rna) {
            uLa2.J(((Rna)a2).J());
            return;
        }
        if (a2 instanceof Goa) {
            a2 = ((Goa)a2).J();
            uLa2.J(new lma(a2.J(), a2.f(), vRa.d != 0));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        void a2;
        uLa uLa2 = this;
        void v0 = a2;
        uLa2.D.l((int)v0);
        uLa b2 = v0 < 0 ? null : uLa2.D.J((int)a2);
        uLa uLa3 = uLa2;
        uLa3.E.J = uSa.E;
        uLa3.f.J = uSa.E;
        uLa3.J.J = uSa.E;
        if (b2 != null && !(b2 instanceof bNa)) {
            uLa2.E.J = vRa.d;
            if (b2 instanceof Rna) {
                uLa uLa4 = uLa2;
                uLa4.f.J = vRa.d;
                uLa4.J.J = vRa.d;
            }
        }
    }

    public void J(String string) {
        Object b2 = string;
        uLa a2 = this;
        a2.L = b2;
    }

    public void J(boolean bl, int n2) {
        Wc a2;
        Wc wc;
        boolean c22 = bl;
        uLa b2 = this;
        if (b2.D.i() < 0) {
            wc = null;
        } else {
            uLa uLa2 = b2;
            wc = a2 = uLa2.D.J(uLa2.D.i());
        }
        if (b2.m) {
            b2.m = uSa.E;
            if (c22 && a2 instanceof Rna) {
                uLa uLa3 = b2;
                uLa uLa4 = b2;
                uLa3.k.J(uLa4.D.i());
                uLa3.k.f();
                uLa4.D.l(pua.o);
                uLa3.D.J(b2.k);
            }
            b2.g.J(b2);
            return;
        }
        if (b2.i) {
            b2.i = uSa.E;
            uLa uLa5 = b2;
            if (c22) {
                uLa5.J(b2.F);
                return;
            }
            uLa5.g.J(b2);
            return;
        }
        if (b2.C) {
            b2.C = uSa.E;
            if (c22) {
                uLa uLa6 = b2;
                uLa uLa7 = b2;
                uLa6.k.f(uLa7.F);
                uLa6.k.f();
                uLa7.D.l(pua.o);
                uLa6.D.J(b2.k);
            }
            b2.g.J(b2);
            return;
        }
        if (b2.G) {
            b2.G = uSa.E;
            if (c22 && a2 instanceof Rna) {
                lma c22 = ((Rna)a2).J();
                uLa uLa8 = b2;
                lma lma2 = c22;
                lma2.serverName = b2.F.serverName;
                lma2.serverIP = b2.F.serverIP;
                c22.J(uLa8.F);
                uLa8.k.f();
                uLa8.D.J(b2.k);
            }
            b2.g.J(b2);
        }
    }

    public dOa J() {
        uLa a2;
        return a2.I;
    }

    public void J() {
        uLa a2;
        a2.f = new ac(XTa.W, (int)(a2.A / uqa.g - Epa.u), (int)(a2.I - EPa.O), NPa.e, kTa.j, oha.J(vPa.N, new Object[uSa.E]));
        a2.E.add(a2.f);
        a2.J = new ac(uqa.g, (int)(a2.A / uqa.g - bqa.Ga), (int)(a2.I - EPa.O), NPa.e, kTa.j, oha.J(MRa.m, new Object[uSa.E]));
        a2.E.add(a2.J);
        a2.E = new ac(vRa.d, (int)(a2.A / uqa.g - Epa.u), (int)(a2.I - FPa.F), ySa.T, kTa.j, oha.J(ysa.a, new Object[uSa.E]));
        a2.E.add(a2.E);
        a2.E.add(new ac(AQa.P, (int)(a2.A / uqa.g - vpa.o), (int)(a2.I - FPa.F), ySa.T, kTa.j, oha.J(iSa.Aa, new Object[uSa.E])));
        a2.E.add(new ac(yRa.d, (int)(a2.A / uqa.g + AQa.P + vpa.o), (int)(a2.I - FPa.F), ySa.T, kTa.j, oha.J(VPa.z, new Object[uSa.E])));
        a2.E.add(new ac(Yqa.i, (int)(a2.A / uqa.g + AQa.P), (int)(a2.I - EPa.O), NPa.e, kTa.j, oha.J(uRa.C, new Object[uSa.E])));
        a2.E.add(new ac(uSa.E, (int)(a2.A / uqa.g + AQa.P + NPa.i), (int)(a2.I - EPa.O), jRa.X, kTa.j, oha.J(SOa.l, new Object[uSa.E])));
        uLa uLa2 = a2;
        uLa2.J(uLa2.D.i());
    }

    /*
     * WARNING - void declaration
     */
    public void f(Rna rna, int n2, boolean bl) {
        void a2;
        int d2 = n2;
        uLa b2 = this;
        int c2 = a2 != false ? uSa.E : d2 - vRa.d;
        uLa uLa2 = b2;
        uLa2.k.J(d2, c2);
        if (uLa2.D.i() == d2) {
            b2.J(c2);
        }
        uLa uLa3 = b2;
        uLa3.D.J(uLa3.k);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Rna rna, int n2, boolean bl) {
        void a2;
        int d2 = n2;
        uLa b2 = this;
        int c2 = a2 != false ? b2.k.J() - vRa.d : d2 + vRa.d;
        uLa uLa2 = b2;
        uLa2.k.J(d2, c2);
        if (uLa2.D.i() == d2) {
            b2.J(c2);
        }
        uLa uLa3 = b2;
        uLa3.D.J(uLa3.k);
    }

    private void J(lma lma2) {
        uLa b2 = lma2;
        uLa a2 = this;
        if (a2.e) {
            return;
        }
        a2.e = vRa.d;
        uLa uLa2 = a2;
        a2.g.J((EC)new Loa((EC)uLa2, (Kpa)uLa2.g, (lma)b2));
    }

    public void J(ac ac2) throws IOException {
        uLa b2 = ac2;
        uLa a2 = this;
        if (((ac)b2).J) {
            Wc wc;
            Wc wc2;
            if (a2.D.i() < 0) {
                wc2 = null;
            } else {
                uLa uLa2 = a2;
                wc2 = wc = uLa2.D.J(uLa2.D.i());
            }
            if (((ac)b2).C == uqa.g && wc instanceof Rna) {
                String string = ((Rna)wc).J().serverName;
                if (string != null) {
                    a2.m = vRa.d;
                    Object object = oha.J(BRa.W, new Object[uSa.E]);
                    String string2 = new StringBuilder().insert(3 >> 2, XTa.Z).append(string).append(qQa.E).append(oha.J(EPa.Ha, new Object[uSa.E])).toString();
                    String string3 = oha.J(Ppa.H, new Object[uSa.E]);
                    String string4 = oha.J(SOa.l, new Object[uSa.E]);
                    object = new Vma(a2, (String)object, string2, string3, string4, a2.D.i());
                    a2.g.J((EC)object);
                    return;
                }
            } else {
                if (((ac)b2).C == vRa.d) {
                    a2.f();
                    return;
                }
                if (((ac)b2).C == AQa.P) {
                    a2.i = vRa.d;
                    uLa uLa3 = a2;
                    uLa3.F = new lma(oha.J(Yua.g, new Object[uSa.E]), Mqa.y, uSa.E != 0);
                    a2.g.J((EC)new Gma((EC)uLa3, uLa3.F));
                    return;
                }
                if (((ac)b2).C == yRa.d) {
                    a2.C = vRa.d;
                    a2.F = new lma(oha.J(Yua.g, new Object[uSa.E]), Mqa.y, uSa.E != 0);
                    a2.g.J((EC)new foa((EC)a2, a2.F));
                    return;
                }
                if (((ac)b2).C == XTa.W && wc instanceof Rna) {
                    a2.G = vRa.d;
                    lma lma2 = ((Rna)wc).J();
                    uLa uLa4 = a2;
                    lma lma3 = lma2;
                    uLa4.F = new lma(lma3.serverName, lma3.serverIP, uSa.E != 0);
                    uLa4.F.J(lma2);
                    uLa uLa5 = a2;
                    uLa4.g.J((EC)new foa((EC)uLa5, uLa5.F));
                    return;
                }
                if (((ac)b2).C == 0) {
                    uLa uLa6 = a2;
                    uLa6.g.J(uLa6.l);
                    return;
                }
                if (((ac)b2).C == Yqa.i) {
                    a2.D();
                }
            }
        }
    }

    public void M() {
        uLa a2;
        Keyboard.enableRepeatEvents(uSa.E != 0);
        if (a2.g != null) {
            a2.g.interrupt();
            a2.g = null;
        }
        a2.I.J();
    }

    public void l() {
        uLa uLa2;
        uLa uLa3 = uLa2 = this;
        super.l();
        if (uLa3.M.J()) {
            uLa uLa4 = uLa2;
            Object a2 = uLa4.M.J();
            uLa4.M.J();
            uLa4.D.J((List<MNa>)a2);
        }
        uLa2.I.f();
    }

    public xoa J() {
        uLa a2;
        return a2.k;
    }

    public boolean J(Rna rna, int n2) {
        int c2 = n2;
        uLa a2 = this;
        if (c2 > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        void a2;
        Wc wc;
        uLa uLa2 = this;
        int c3 = uLa2.D.i();
        Wc wc2 = wc = c3 < 0 ? null : uLa2.D.J(c3);
        if (a2 == Ssa.u) {
            uLa2.D();
            return;
        }
        if (c3 >= 0) {
            if (a2 == ZOa.x) {
                if (uLa.l()) {
                    if (c3 <= 0 || !(wc instanceof Rna)) return;
                    uLa uLa3 = uLa2;
                    int n3 = c3;
                    uLa3.k.J(n3, n3 - vRa.d);
                    uLa3.J(uLa3.D.i() - vRa.d);
                    uLa3.D.J(-uLa2.D.J());
                    uLa3.D.J(uLa2.k);
                    return;
                }
                if (c3 > 0) {
                    uLa uLa4 = uLa2;
                    uLa4.J(uLa4.D.i() - vRa.d);
                    uLa4.D.J(-uLa2.D.J());
                    if (!(uLa4.D.J(uLa2.D.i()) instanceof bNa)) return;
                    uLa uLa5 = uLa2;
                    if (uLa2.D.i() > 0) {
                        uLa5.J(uLa2.D.e() - vRa.d);
                        uLa uLa6 = uLa2;
                        uLa6.D.J(-uLa6.D.J());
                        return;
                    }
                    uLa5.J(pua.o);
                    return;
                }
                uLa2.J(pua.o);
                return;
            }
            if (a2 == Pqa.i) {
                if (uLa.l()) {
                    if (c3 >= uLa2.k.J() - vRa.d) return;
                    uLa uLa7 = uLa2;
                    int n4 = c3;
                    uLa7.k.J(n4, n4 + vRa.d);
                    uLa7.J(c3 + vRa.d);
                    uLa uLa8 = uLa2;
                    uLa7.D.J(uLa8.D.J());
                    uLa8.D.J(uLa2.k);
                    return;
                }
                if (c3 < uLa2.D.e()) {
                    uLa uLa9 = uLa2;
                    uLa9.J(uLa9.D.i() + vRa.d);
                    uLa9.D.J(uLa2.D.J());
                    if (!(uLa9.D.J(uLa2.D.i()) instanceof bNa)) return;
                    if (uLa2.D.i() < uLa2.D.e() - vRa.d) {
                        uLa uLa10 = uLa2;
                        uLa10.J(uLa10.D.e() + vRa.d);
                        uLa10.D.J(uLa2.D.J());
                        return;
                    }
                    uLa2.J(pua.o);
                    return;
                }
                uLa2.J(pua.o);
                return;
            }
            if (a2 != EPa.O && a2 != yRa.r) {
                super.J((char)b2, (int)a2);
                return;
            }
            uLa uLa11 = uLa2;
            uLa11.J((ac)uLa11.E.get(uqa.g));
            return;
        }
        super.J((char)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void b2;
        void c2;
        uLa a2;
        int d2 = n4;
        uLa uLa2 = a2 = this;
        super.f((int)c2, (int)b2, d2);
        uLa2.D.f((int)c2, (int)b2, d2);
    }

    public uLa(EC eC) {
        uLa b2 = eC;
        uLa a2 = this;
        uLa uLa2 = a2;
        a2.I = new dOa();
        a2.l = b2;
    }

    public void A() {
        uLa uLa2;
        uLa uLa3;
        uLa uLa4 = uLa3 = this;
        uLa4.e = uSa.E;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        uLa4.E.clear();
        if (!uLa4.j) {
            uLa uLa5;
            uLa uLa6 = uLa3;
            uLa6.j = vRa.d;
            uLa6.k = new xoa((Kpa)uLa3.g);
            uLa3.k.J();
            uLa6.M = new goa();
            try {
                uLa3.g = new gNa(uLa3.M);
                uLa3.g.start();
                uLa5 = uLa3;
            }
            catch (Exception a2) {
                A.warn(new StringBuilder().insert(3 >> 2, iPa.P).append(a2.getMessage()).toString());
                uLa5 = uLa3;
            }
            uLa uLa7 = uLa3;
            uLa uLa8 = uLa3;
            uLa5.D = new pna(uLa8, (Kpa)uLa7.g, (int)uLa7.A, (int)uLa8.I, fPa.i, (int)(uLa3.I - ysa.s), Qsa.Ha);
            uLa uLa9 = uLa3;
            uLa2 = uLa9;
            uLa3.D.J(uLa9.k);
        } else {
            uLa uLa10 = uLa3;
            uLa2 = uLa10;
            uLa10.D.J((int)uLa10.A, (int)uLa3.I, fPa.i, (int)(uLa3.I - ysa.s));
        }
        uLa2.J();
    }
}

