/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aga
 *  CDa
 *  Dfa
 *  FEa
 *  Fpa
 *  GAa
 *  Gl
 *  HCa
 *  JBa
 *  Kda
 *  LA
 *  LCa
 *  Mca
 *  Mda
 *  NPa
 *  NTa
 *  Nia
 *  Oea
 *  Oz
 *  PTa
 *  RAa
 *  RQa
 *  Ssa
 *  WEa
 *  WFa
 *  Waa
 *  Wda
 *  Xaa
 *  Yba
 *  Yea
 *  Yfa
 *  ZAa
 *  Zta
 *  aSa
 *  afa
 *  aga
 *  bFa
 *  bba
 *  bpa
 *  dW
 *  gea
 *  hba
 *  hqa
 *  hra
 *  jFa
 *  jRa
 *  jea
 *  kDa
 *  kba
 *  oqa
 *  sFa
 *  tDa
 *  uCa
 *  vL
 *  vRa
 *  vca
 *  vpa
 *  xba
 *  ysa
 *  zEa
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.minecraft.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Nga_3 {
    private boolean K;
    private boolean H;
    private vL c;
    private double B;
    public vL d;
    private boolean a;
    public int b;
    private double l;
    public double e;
    public Set<bFa> G;
    public int D;
    private boolean f;
    private double F;
    public int g;
    public int L;
    public int E;
    public double m;
    public int C;
    public int i;
    public int M;
    public boolean k;
    private int j;
    public double J;
    public int A;
    private static final Logger I = LogManager.getLogger();

    /*
     * WARNING - void declaration
     */
    public Nga_3(vL vL2, int n2, int n3, boolean bl2) {
        void a2;
        void b2;
        void c2;
        Nga_3 d2;
        Nga_3 e2 = vL2;
        Nga_3 nga_3 = d2 = this;
        Nga_3 nga_32 = e2;
        Nga_3 nga_33 = d2;
        Nga_3 nga_34 = e2;
        Nga_3 nga_35 = d2;
        Nga_3 nga_36 = d2;
        d2.G = Sets.newHashSet();
        d2.d = e2;
        nga_36.i = c2;
        nga_36.E = b2;
        nga_35.K = a2;
        nga_35.M = Oz.f((double)(((vL)e2).la * hqa.ha));
        d2.A = Oz.f((double)(((vL)nga_34).Z * hqa.ha));
        nga_33.g = Oz.f((double)(((vL)nga_34).A * hqa.ha));
        nga_33.L = Oz.J((float)(((vL)e2).X * Fpa.q / CRa.ja));
        d2.D = Oz.J((float)(((vL)nga_32).d * Fpa.q / CRa.ja));
        nga_3.C = Oz.J((float)(nga_32.e() * Fpa.q / CRa.ja));
        nga_3.H = ((vL)e2).ha;
    }

    private void f() {
        Nga_3 nga_3 = this;
        Object a2 = nga_3.d.J();
        if (((hga)a2).J()) {
            Nga_3 nga_32 = nga_3;
            Nga_3 nga_33 = nga_3;
            nga_33.f((KC)new hba(nga_33.d.M(), (hga)a2, uSa.E != 0));
        }
        if (nga_3.d instanceof Gl) {
            a2 = ((Aga)((Gl)nga_3.d).J()).J();
            if (!a2.isEmpty()) {
                Nga_3 nga_34 = nga_3;
                nga_34.f((KC)new vca(nga_34.d.M(), (Collection)a2));
            }
            a2.clear();
        }
    }

    public void f(KC kC2) {
        Nga_3 a2;
        KC b2 = kC2;
        Nga_3 nga_3 = a2 = this;
        nga_3.J(b2);
        if (nga_3.d instanceof bFa) {
            ((bFa)a2.d).I.J(b2);
        }
    }

    private boolean f(bFa bFa2) {
        Nga_3 b2 = bFa2;
        Nga_3 a2 = this;
        return b2.J().J().J((bFa)b2, a2.d.N, a2.d.L);
    }

    public void l(bFa bFa2) {
        Nga_3 b2 = bFa2;
        Nga_3 a2 = this;
        if (a2.G.contains(b2)) {
            Nga_3 nga_3 = a2;
            b2.F(nga_3.d);
            nga_3.G.remove(b2);
        }
    }

    public int hashCode() {
        Nga_3 a2;
        return a2.d.M();
    }

    public void J() {
        Object a2;
        Nga_3 nga_3 = this;
        Object object = a2 = nga_3.G.iterator();
        while (object.hasNext()) {
            ((bFa)a2.next()).F(nga_3.d);
            object = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(List<Sx> list) {
        void a2;
        int b2;
        Nga_3 nga_3 = this;
        int n2 = b2 = uSa.E;
        while (n2 < a2.size()) {
            nga_3.f((bFa)a2.get(b2++));
            n2 = b2;
        }
    }

    public boolean J(bFa bFa2) {
        Nga_3 b2 = bFa2;
        Nga_3 a2 = this;
        Nga_3 nga_3 = b2;
        double d2 = ((bFa)nga_3).la - (double)(a2.M / fPa.i);
        double d3 = ((bFa)nga_3).A - (double)(a2.g / fPa.i);
        if (d2 >= (double)(-a2.i) && d2 <= (double)a2.i && d3 >= (double)(-a2.i) && d3 <= (double)a2.i && a2.d.J((bFa)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(bFa bFa2) {
        Nga_3 b2 = bFa2;
        Nga_3 a2 = this;
        if (b2 != a2.d) {
            if (a2.J((bFa)b2)) {
                if (!a2.G.contains(b2) && (a2.f((bFa)b2) || a2.d.k)) {
                    Sx sx2;
                    Object object;
                    Waa waa2;
                    Nga_3 nga_3 = a2;
                    nga_3.G.add((bFa)b2);
                    KC kC2 = a2.J();
                    ((bFa)b2).I.J(kC2);
                    if (!nga_3.d.J().f()) {
                        ((bFa)b2).I.J((KC)new hba(a2.d.M(), a2.d.J(), vRa.d != 0));
                    }
                    if ((waa2 = a2.d.J()) != null) {
                        ((bFa)b2).I.J((KC)new ZAa(a2.d.M(), waa2));
                    }
                    if (a2.d instanceof Gl && !(object = (waa2 = (Aga)((Gl)a2.d).J()).f()).isEmpty()) {
                        ((bFa)b2).I.J((KC)new vca(a2.d.M(), (Collection)object));
                    }
                    Nga_3 nga_32 = a2;
                    nga_32.J = nga_32.d.i;
                    nga_32.m = nga_32.d.Ea;
                    nga_32.e = nga_32.d.f;
                    if (nga_32.K && !(kC2 instanceof Xaa)) {
                        ((bFa)b2).I.J((KC)new xba(a2.d.M(), a2.d.i, a2.d.Ea, a2.d.f));
                    }
                    if (a2.d.ja != null) {
                        Nga_3 nga_33 = a2;
                        ((bFa)b2).I.J(new Bca(uSa.E, nga_33.d, nga_33.d.ja));
                    }
                    if (a2.d instanceof Yfa && ((Yfa)a2.d).l() != null) {
                        Nga_3 nga_34 = a2;
                        ((bFa)b2).I.J(new Bca(vRa.d, nga_34.d, ((Yfa)nga_34.d).l()));
                    }
                    if (a2.d instanceof Gl) {
                        int n2;
                        int n3 = n2 = uSa.E;
                        while (n3 < tTa.h) {
                            object = ((Gl)a2.d).f(n2);
                            if (object != null) {
                                ((bFa)b2).I.J((KC)new Kda(a2.d.M(), n2, (Mda)object));
                            }
                            n3 = ++n2;
                        }
                    }
                    if (a2.d instanceof Sx && (sx2 = (Sx)a2.d).p()) {
                        ((bFa)b2).I.J((KC)new LCa(sx2, new XF(a2.d)));
                    }
                    if (a2.d instanceof Gl) {
                        Gl gl2 = (Gl)a2.d;
                        Object object2 = object = gl2.J().iterator();
                        while (object2.hasNext()) {
                            kC2 = (kba)object.next();
                            object2 = object;
                            ((bFa)b2).I.J(new cCa(a2.d.M(), (kba)kC2));
                        }
                    }
                }
            } else if (a2.G.contains(b2)) {
                a2.G.remove(b2);
                b2.F(a2.d);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(List<Sx> list) {
        Nga_3 nga_3;
        block17: {
            Nga_3 nga_32;
            int n2;
            block24: {
                int n3;
                block18: {
                    Nga_3 nga_33;
                    int n4;
                    int n5;
                    Object object;
                    int n6;
                    int n7;
                    int n8;
                    int b22;
                    block23: {
                        block19: {
                            block20: {
                                int a22;
                                int n9;
                                int n10;
                                block21: {
                                    block22: {
                                        void a22;
                                        block16: {
                                            block15: {
                                                nga_3 = this;
                                                nga_3.k = uSa.E;
                                                if (!nga_3.a) break block15;
                                                Nga_3 nga_34 = nga_3;
                                                if (!(nga_34.d.f(nga_34.l, nga_3.F, nga_3.B) > Zta.ba)) break block16;
                                            }
                                            Nga_3 nga_35 = nga_3;
                                            nga_35.l = nga_35.d.la;
                                            nga_35.F = nga_35.d.Z;
                                            nga_35.B = nga_35.d.A;
                                            nga_35.a = vRa.d;
                                            nga_35.k = vRa.d;
                                            nga_3.f((List<Sx>)a22);
                                        }
                                        Nga_3 nga_36 = nga_3;
                                        if (nga_36.c != nga_36.d.ja || nga_3.d.ja != null && nga_3.b % Psa.M == 0) {
                                            Nga_3 nga_37 = nga_3;
                                            nga_37.c = nga_37.d.ja;
                                            Nga_3 nga_38 = nga_3;
                                            Nga_3 nga_39 = nga_3;
                                            nga_37.J(new Bca(uSa.E, nga_39.d, nga_39.d.ja));
                                        }
                                        if (nga_3.d instanceof FEa && nga_3.b % NTa.C == 0) {
                                            FEa fEa2 = (FEa)nga_3.d;
                                            Nga_3 b22 = fEa2.J();
                                            if (b22 != null && b22.J() instanceof Yba) {
                                                dW dW2 = Gea.wa.J((Mda)b22, nga_3.d.j);
                                                for (Sx sx2 : a22) {
                                                    bFa bFa2 = (bFa)sx2;
                                                    dW2.J((Sx)bFa2, (Mda)b22);
                                                    KC kC2 = Gea.wa.J((Mda)b22, nga_3.d.j, (Sx)bFa2);
                                                    if (kC2 == null) continue;
                                                    bFa2.I.J(kC2);
                                                }
                                            }
                                            nga_3.f();
                                        }
                                        Nga_3 nga_310 = nga_3;
                                        if (nga_310.b % nga_310.E != 0 && !nga_3.d.t && !nga_3.d.J().J()) break block17;
                                        if (nga_3.d.ja != null) break block18;
                                        Nga_3 nga_311 = nga_3;
                                        nga_311.j += vRa.d;
                                        n2 = Oz.f((double)(nga_311.d.la * hqa.ha));
                                        b22 = Oz.f((double)(nga_311.d.Z * hqa.ha));
                                        n8 = Oz.f((double)(nga_311.d.A * hqa.ha));
                                        n7 = Oz.J((float)(nga_311.d.X * Fpa.q / CRa.ja));
                                        n6 = Oz.J((float)(nga_311.d.d * Fpa.q / CRa.ja));
                                        n10 = n2 - nga_3.M;
                                        n9 = b22 - nga_3.A;
                                        a22 = n8 - nga_3.g;
                                        object = null;
                                        n5 = Math.abs(n10) >= AQa.P || Math.abs(n9) >= AQa.P || Math.abs(a22) >= AQa.P || nga_3.b % Psa.M == 0 ? vRa.d : uSa.E;
                                        int n11 = n4 = Math.abs(n7 - nga_3.L) >= AQa.P || Math.abs(n6 - nga_3.D) >= AQa.P ? vRa.d : uSa.E;
                                        if (nga_3.b <= 0 && !(nga_3.d instanceof jea)) break block19;
                                        if (n10 < oqa.n || n10 >= XOa.h || n9 < oqa.n || n9 >= XOa.h || a22 < oqa.n || a22 >= XOa.h || nga_3.j > hra.i || nga_3.f) break block20;
                                        Nga_3 nga_312 = nga_3;
                                        if (nga_312.H != nga_312.d.ha) break block20;
                                        if (n5 != 0 && n4 != 0 || nga_3.d instanceof jea) break block21;
                                        if (n5 == 0) break block22;
                                        object = new ZCa(nga_3.d.M(), (byte)n10, (byte)n9, (byte)a22, nga_3.d.ha);
                                        nga_33 = nga_3;
                                        break block23;
                                    }
                                    if (n4 == 0) break block19;
                                    object = new GAa(nga_3.d.M(), (byte)n7, (byte)n6, nga_3.d.ha);
                                    nga_33 = nga_3;
                                    break block23;
                                }
                                object = new Mca(nga_3.d.M(), (byte)n10, (byte)n9, (byte)a22, (byte)n7, (byte)n6, nga_3.d.ha);
                                nga_33 = nga_3;
                                break block23;
                            }
                            nga_3.H = nga_3.d.ha;
                            nga_3.j = uSa.E;
                            object = new bba(nga_3.d.M(), n2, b22, n8, (byte)n7, (byte)n6, nga_3.d.ha);
                        }
                        nga_33 = nga_3;
                    }
                    if (nga_33.K) {
                        Nga_3 nga_313 = nga_3;
                        double d2 = nga_313.d.i - nga_3.J;
                        Nga_3 nga_314 = nga_3;
                        double d3 = nga_313.d.Ea - nga_314.m;
                        double d4 = nga_314.d.f - nga_3.e;
                        double d5 = GPa.g;
                        double d6 = d2;
                        double d7 = d3;
                        double d8 = d4;
                        d2 = d6 * d6 + d7 * d7 + d8 * d8;
                        double d9 = d5;
                        if (d2 > d9 * d9 || d2 > aSa.V && nga_3.d.i == aSa.V && nga_3.d.Ea == aSa.V && nga_3.d.f == aSa.V) {
                            Nga_3 nga_315 = nga_3;
                            nga_315.J = nga_315.d.i;
                            nga_315.m = nga_315.d.Ea;
                            nga_315.e = nga_315.d.f;
                            nga_315.J((KC)new xba(nga_3.d.M(), nga_3.J, nga_3.m, nga_3.e));
                        }
                    }
                    if (object != null) {
                        nga_3.J((KC)object);
                    }
                    nga_3.f();
                    if (n5 != 0) {
                        Nga_3 nga_316 = nga_3;
                        nga_3.M = n2;
                        nga_316.A = b22;
                        nga_316.g = n8;
                    }
                    if (n4 != 0) {
                        Nga_3 nga_317 = nga_3;
                        nga_317.L = n7;
                        nga_317.D = n6;
                    }
                    nga_32 = nga_3;
                    nga_3.f = uSa.E;
                    break block24;
                }
                Nga_3 nga_318 = nga_3;
                n2 = Oz.J((float)(nga_318.d.X * Fpa.q / CRa.ja));
                int b22 = Oz.J((float)(nga_318.d.d * Fpa.q / CRa.ja));
                int n12 = n3 = Math.abs(n2 - nga_3.L) >= AQa.P || Math.abs(b22 - nga_3.D) >= AQa.P ? vRa.d : uSa.E;
                if (n3 != 0) {
                    Nga_3 nga_319 = nga_3;
                    Nga_3 nga_320 = nga_3;
                    nga_320.J((KC)new GAa(nga_320.d.M(), (byte)n2, (byte)b22, nga_3.d.ha));
                    nga_319.L = n2;
                    nga_319.D = b22;
                }
                Nga_3 nga_321 = nga_3;
                nga_32 = nga_321;
                nga_321.M = Oz.f((double)(nga_321.d.la * hqa.ha));
                nga_321.A = Oz.f((double)(nga_321.d.Z * hqa.ha));
                nga_321.g = Oz.f((double)(nga_321.d.A * hqa.ha));
                nga_321.f();
                nga_321.f = vRa.d;
            }
            n2 = Oz.J((float)(nga_32.d.e() * Fpa.q / CRa.ja));
            if (Math.abs(n2 - nga_3.C) >= AQa.P) {
                nga_3.J((KC)new RAa(nga_3.d, (byte)n2));
                nga_3.C = n2;
            }
            nga_3.d.t = uSa.E;
        }
        Nga_3 nga_322 = nga_3;
        nga_322.b += vRa.d;
        if (nga_322.d.a) {
            Nga_3 nga_323 = nga_3;
            nga_323.f((KC)new xba(nga_323.d));
            nga_323.d.a = uSa.E;
        }
    }

    private KC J() {
        Object a2;
        Nga_3 nga_3 = this;
        if (nga_3.d.J) {
            I.warn(bpa.m);
        }
        if (nga_3.d instanceof jFa) {
            return new JBa(nga_3.d, uqa.g, vRa.d);
        }
        if (nga_3.d instanceof bFa) {
            return new uCa((Sx)nga_3.d);
        }
        if (nga_3.d instanceof Yea) {
            a2 = (Yea)nga_3.d;
            return new JBa(nga_3.d, NTa.C, a2.J().getNetworkID());
        }
        if (nga_3.d instanceof Wda) {
            return new JBa(nga_3.d, vRa.d);
        }
        if (nga_3.d instanceof LA) {
            nga_3.C = Oz.J((float)(nga_3.d.e() * Fpa.q / CRa.ja));
            return new Xaa((Gl)nga_3.d);
        }
        if (nga_3.d instanceof Fga) {
            a2 = ((Fga)nga_3.d).v;
            return new JBa(nga_3.d, Jsa.ha, a2 != null ? a2.M() : nga_3.d.M());
        }
        if (nga_3.d instanceof jea) {
            a2 = ((jea)nga_3.d).f;
            return new JBa(nga_3.d, Psa.M, a2 != null ? a2.M() : nga_3.d.M());
        }
        if (nga_3.d instanceof Pda) {
            return new JBa(nga_3.d, tua.w);
        }
        if (nga_3.d instanceof kDa) {
            return new JBa(nga_3.d, Pua.Ka, ((kDa)nga_3.d).J());
        }
        if (nga_3.d instanceof CDa) {
            return new JBa(nga_3.d, jRa.X);
        }
        if (nga_3.d instanceof Dfa) {
            return new JBa(nga_3.d, fPa.ga);
        }
        if (nga_3.d instanceof tDa) {
            return new JBa(nga_3.d, Eqa.Ka);
        }
        if (nga_3.d instanceof gea) {
            return new JBa(nga_3.d, NPa.i);
        }
        if (nga_3.d instanceof oEa) {
            JBa jBa2;
            JBa jBa3;
            Object object;
            a2 = (oEa)nga_3.d;
            JBa jBa4 = null;
            int n2 = Ssa.u;
            if (nga_3.d instanceof ZDa) {
                n2 = ysa.s;
                object = a2;
            } else {
                if (nga_3.d instanceof afa) {
                    n2 = SPa.T;
                }
                object = a2;
            }
            if (((oEa)((Object)object)).G != null) {
                jBa3 = new JBa(nga_3.d, n2, ((oEa)nga_3.d).G.M());
                jBa2 = jBa4 = jBa3;
            } else {
                jBa3 = new JBa(nga_3.d, n2, uSa.E);
                jBa2 = jBa4 = jBa3;
            }
            jBa2.f((int)(((oEa)((Object)a2)).M * Zta.C));
            JBa jBa5 = jBa4;
            jBa5.M((int)(((oEa)((Object)a2)).k * Zta.C));
            jBa5.C((int)(((oEa)((Object)a2)).C * Zta.C));
            return jBa5;
        }
        if (nga_3.d instanceof WEa) {
            return new JBa(nga_3.d, ITa.V);
        }
        if (nga_3.d instanceof vFa) {
            return new JBa(nga_3.d, vpa.o);
        }
        if (nga_3.d instanceof sFa) {
            return new JBa(nga_3.d, cPa.Q);
        }
        if (nga_3.d instanceof aga) {
            a2 = (aga)nga_3.d;
            return new JBa(nga_3.d, NPa.e, Block.l(a2.J()));
        }
        if (nga_3.d instanceof Oea) {
            return new JBa(nga_3.d, RQa.b);
        }
        if (nga_3.d instanceof WFa) {
            return new Sca((WFa)nga_3.d);
        }
        if (nga_3.d instanceof FEa) {
            a2 = (FEa)nga_3.d;
            JBa jBa6 = new JBa(nga_3.d, hqa.K, ((FEa)a2).j.getHorizontalIndex());
            XF xF2 = a2.f();
            JBa jBa7 = jBa6;
            XF xF3 = xF2;
            jBa6.J(Oz.J((float)(xF3.getX() * fPa.i)));
            jBa7.e(Oz.J((float)(xF3.getY() * fPa.i)));
            jBa7.l(Oz.J((float)(xF2.getZ() * fPa.i)));
            return jBa7;
        }
        if (nga_3.d instanceof Nia) {
            a2 = (Nia)nga_3.d;
            JBa jBa8 = new JBa(nga_3.d, uqa.b);
            XF xF4 = a2.f();
            JBa jBa9 = jBa8;
            XF xF5 = xF4;
            jBa8.J(Oz.J((float)(xF5.getX() * fPa.i)));
            jBa9.e(Oz.J((float)(xF5.getY() * fPa.i)));
            jBa9.l(Oz.J((float)(xF4.getZ() * fPa.i)));
            return jBa9;
        }
        if (nga_3.d instanceof zEa) {
            return new HCa((zEa)nga_3.d);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, PTa.h).append(nga_3.d.getClass()).append(dqa.O).toString());
    }

    /*
     * WARNING - void declaration
     */
    public void J(KC kC2) {
        Object b2;
        Nga_3 nga_3 = this;
        Object object = b2 = nga_3.G.iterator();
        while (object.hasNext()) {
            void a2;
            ((bFa)b2.next()).I.J((KC)a2);
            object = b2;
        }
    }

    public boolean equals(Object object) {
        Object b2 = object;
        Nga_3 a2 = this;
        if (b2 instanceof Nga_3) {
            if (((Nga_3)b2).d.M() == a2.d.M()) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public void J(bFa bFa2) {
        Nga_3 b2 = bFa2;
        Nga_3 a2 = this;
        if (a2.G.contains(b2)) {
            a2.G.remove(b2);
            b2.F(a2.d);
        }
    }
}

