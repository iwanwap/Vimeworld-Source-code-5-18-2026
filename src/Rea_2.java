/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  EQa
 *  ERa
 *  Ey
 *  FPa
 *  Fpa
 *  GFa
 *  Gg
 *  Gl
 *  Gua
 *  HA
 *  Hba
 *  Hda
 *  ISa
 *  JPa
 *  JTa
 *  KZ
 *  LQa
 *  MQa
 *  Mda
 *  NCa
 *  NPa
 *  NTa
 *  Oz
 *  QFa
 *  QSa
 *  RC
 *  Rea
 *  Rua
 *  SIa
 *  SOa
 *  Sda
 *  Spa
 *  Tpa
 *  UZ
 *  Uqa
 *  WQa
 *  Waa
 *  XTa
 *  YSa
 *  Yfa
 *  Ypa
 *  Yra
 *  ZOa
 *  Zta
 *  aQa
 *  aSa
 *  aqa
 *  bSa
 *  cQa
 *  cRa
 *  cra
 *  dQa
 *  dpa
 *  eAa
 *  fEa
 *  gFa
 *  gZ
 *  hc
 *  hra
 *  jRa
 *  kta
 *  lqa
 *  nHa
 *  oA
 *  oFa
 *  oHa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  qta
 *  tY
 *  uQa
 *  uRa
 *  vL
 *  vQa
 *  vRa
 *  vpa
 *  wEa
 *  wOa
 *  waa
 *  wra
 *  yDa
 *  yfa
 *  ysa
 *  zsa
 */
import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rea_2
extends fEa
implements hc {
    private float T;
    private static final String[] n;
    private static final String[] s;
    private static final Predicate<vL> w;
    private int W;
    private static final String[] q;
    private static final String[] x;
    private String v;
    private static final String[] o;
    private static final int[] h;
    public boolean K;
    private float H;
    private float c;
    private int B;
    private int d;
    private float a;
    private boolean b;
    private static final String[] l;
    private static final RC e;
    public int G;
    private int D;
    private String[] E;
    private float m;
    private float C;
    public int i;
    public int M;
    private GFa j;
    public float J;
    private boolean A;
    private boolean I;

    public String f() {
        int a2;
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        rea_22.ba();
        if (rea_22.R.nextInt(yRa.d) == 0) {
            rea_2.Ha();
        }
        if ((a2 = rea_2.B()) == yRa.d) {
            return Tpa.U;
        }
        if (a2 == AQa.P) {
            return kra.Ha;
        }
        if (a2 != vRa.d && a2 != uqa.g) {
            return dsa.H;
        }
        return Jsa.O;
    }

    public boolean da() {
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        int n2 = Oz.f((double)rea_22.la);
        int a2 = Oz.f((double)rea_22.A);
        rea_22.j.J(new XF(n2, uSa.E, a2));
        return vRa.d != 0;
    }

    public boolean ma() {
        Rea_2 a2;
        return a2.l(AQa.P);
    }

    public void ia() {
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        rea_22.Ha();
        Object a2 = rea_22.G();
        if (a2 != null) {
            Rea_2 rea_23 = rea_2;
            rea_23.J((String)a2, rea_2.G(), rea_23.M());
        }
    }

    public void B(boolean bl2) {
        int n2;
        boolean b22 = bl2;
        Rea_2 a2 = this;
        UZ b22 = b22 ? UZ.HEART : UZ.SMOKE_NORMAL;
        int n3 = n2 = uSa.E;
        while (n3 < XTa.W) {
            Rea_2 rea_2 = a2;
            double d2 = rea_2.R.nextGaussian() * GPa.g;
            double d3 = rea_2.R.nextGaussian() * GPa.g;
            double d4 = rea_2.R.nextGaussian() * GPa.g;
            int n4 = 3 & 5;
            rea_2.j.J(b22, a2.la + (double)(a2.R.nextFloat() * a2.F * kta.v) - (double)a2.F, a2.Z + kTa.B + (double)(a2.R.nextFloat() * a2.u), (double)(a2.A + (double)(a2.R.nextFloat() * a2.F * kta.v) - (double)a2.F), d2, d3, d4, new int[uSa.E]);
            n3 = ++n2;
        }
    }

    public boolean Aa() {
        Rea_2 a2;
        return a2.l(fPa.i);
    }

    public int B() {
        Rea_2 a2;
        return a2.aa.J(wOa.t);
    }

    private void fa() {
        Rea_2 rea_2;
        Rea_2 rea_22;
        Rea_2 rea_23 = rea_22 = this;
        rea_23.v = QSa.Ga;
        rea_23.E[uSa.E] = null;
        rea_23.E[vRa.d] = null;
        rea_23.E[uqa.g] = null;
        int n2 = rea_23.B();
        int n3 = rea_23.a();
        if (n2 == 0) {
            int a2 = n3 & osa.Ja;
            n3 = (n3 & Uqa.Q) >> Yqa.i;
            if (a2 >= n.length) {
                rea_22.I = uSa.E;
                return;
            }
            rea_22.E[uSa.E] = n[a2];
            Rea_2 rea_24 = rea_22;
            rea_22.v = rea_22.v + q[a2];
            if (n3 >= o.length) {
                rea_22.I = uSa.E;
                return;
            }
            Rea_2 rea_25 = rea_22;
            rea_2 = rea_25;
            rea_25.E[vRa.d] = o[n3];
            rea_22.v = new StringBuilder().insert(3 ^ 3, rea_22.v).append(l[n3]).toString();
        } else {
            Rea_2 rea_26 = rea_22;
            rea_2 = rea_26;
            rea_26.E[uSa.E] = Mqa.y;
            rea_22.v = new StringBuilder().insert(5 >> 3, rea_22.v).append(IPa.W).append(n2).append(IPa.W).toString();
        }
        int a2 = rea_2.H();
        if (a2 >= x.length) {
            rea_22.I = uSa.E;
            return;
        }
        rea_22.E[uqa.g] = x[a2];
        rea_22.v = new StringBuilder().insert(3 & 4, rea_22.v).append(s[a2]).toString();
        rea_22.I = vRa.d;
    }

    public String G() {
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        rea_22.ba();
        rea_22.Ha();
        int a2 = rea_22.B();
        if (a2 != yRa.d && a2 != AQa.P) {
            if (a2 != vRa.d && a2 != uqa.g) {
                return dpa.f;
            }
            return aqa.Y;
        }
        return null;
    }

    public boolean Z() {
        Rea_2 a2;
        if (a2.Aa != null && a2.ma()) {
            return vRa.d != 0;
        }
        if (a2.Aa() || a2.ia()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eAa J() {
        Rea_2 rea_2 = this;
        int n2 = rea_2.R.nextInt(AQa.P) == 0 ? vRa.d : uSa.E;
        int a2 = rea_2.B();
        if (a2 == AQa.P) {
            return Gea.Ya;
        }
        if (a2 == yRa.d) {
            if (n2 != 0) {
                return null;
            }
            return Gea.qa;
        }
        return Gea.Xb;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        void b2;
        Rea_2 rea_2 = this;
        Rea_2 c2 = b2.f();
        if (rea_2.Aa != null && rea_2.Aa.equals((Object)c2)) {
            return uSa.E != 0;
        }
        return super.J((gZ)b2, (float)a2);
    }

    public void d(float f2, float f3) {
        float b2;
        float c2 = f3;
        Rea_2 a2 = this;
        if (a2.Aa != null && a2.Aa instanceof Gl && a2.ma()) {
            float f4;
            float f5;
            a2.X = a2.Aa.X;
            a2.s = (String[])a2.X;
            Rea_2 rea_2 = a2;
            rea_2.d = (int)(rea_2.Aa.d * MQa.L);
            rea_2.C(rea_2.X, a2.d);
            rea_2.t = rea_2.ba = rea_2.X;
            b2 = ((Gl)a2.Aa).L * MQa.L;
            c2 = ((Gl)a2.Aa).ia;
            if (f5 <= JPa.N) {
                c2 *= rta.o;
                a2.D = uSa.E;
            }
            if (a2.ha && a2.J == JPa.N && a2.ia() && !a2.b) {
                b2 = JPa.N;
                c2 = JPa.N;
            }
            if (a2.J > JPa.N && !a2.Ha() && a2.ha) {
                Rea_2 rea_22 = a2;
                Rea_2 rea_23 = a2;
                rea_23.J(rea_22.f() * (double)rea_23.J);
                if (rea_22.J(Hda.e)) {
                    Rea_2 rea_24 = a2;
                    rea_24.J(a2.Ea + (double)((float)(rea_24.J(Hda.e).J() + vRa.d) * Nra.e));
                }
                a2.g(vRa.d != 0);
                a2.t = vRa.d;
                if (c2 > JPa.N) {
                    Rea_2 rea_25 = a2;
                    float f6 = Oz.d((float)(rea_25.X * pua.j / Hra.Ga));
                    float f7 = Oz.C((float)(rea_25.X * pua.j / Hra.Ga));
                    rea_25.f(rea_25.i + (double)(Tpa.S * f6 * a2.J));
                    rea_25.l(rea_25.f + (double)(Xpa.R * f7 * a2.J));
                    rea_25.J(Mqa.C, Xpa.R, pqa.r);
                }
                a2.J = JPa.N;
            }
            Rea_2 rea_26 = a2;
            rea_26.Ka = pqa.r;
            rea_26.P = rea_26.D() * Nra.e;
            if (!rea_26.j.e) {
                Rea_2 rea_27 = a2;
                rea_27.C((float)rea_27.J(Kha.j).f());
                super.d(b2, c2);
            }
            if (a2.ha) {
                a2.J = JPa.N;
                a2.g(uSa.E != 0);
            }
            Rea_2 rea_28 = a2;
            rea_28.z = rea_28.U;
            double d2 = rea_28.la - a2.c;
            int n2 = rea_28.A - a2.r;
            double d3 = d2;
            int n3 = n2;
            float f8 = Oz.J((double)(d3 * d3 + n3 * n3)) * YSa.G;
            if (f4 > pqa.r) {
                f8 = pqa.r;
            }
            Rea_2 rea_29 = a2;
            rea_29.U += (f8 - a2.U) * Xpa.R;
            rea_29.E += a2.U;
            return;
        }
        Rea_2 rea_2 = a2;
        rea_2.Ka = MQa.L;
        rea_2.P = WRa.e;
        super.d(b2, c2);
    }

    public void J(yDa yDa2) {
        Rea_2 a2;
        Rea_2 b22 = yDa2;
        Rea_2 rea_2 = a2 = this;
        int b22 = rea_2.H();
        boolean bl2 = rea_2.ma();
        rea_2.v();
        if (rea_2.g > kTa.j) {
            boolean bl3;
            if (b22 == 0 && b22 != a2.H()) {
                bl3 = bl2;
                a2.J(Ypa.j, MQa.L, pqa.r);
            } else {
                if (b22 != a2.H()) {
                    a2.J(Ypa.j, MQa.L, pqa.r);
                }
                bl3 = bl2;
            }
            if (!bl3 && a2.ma()) {
                a2.J(Bta.w, MQa.L, pqa.r);
            }
        }
    }

    public void J(Mda mda2) {
        Rea_2 a2;
        Rea_2 b2 = mda2;
        Rea_2 rea_2 = a2 = this;
        a2.aa.J(cQa.o, Integer.valueOf(rea_2.f((Mda)b2)));
        rea_2.ka();
    }

    public boolean ga() {
        Rea_2 a2;
        if (!a2.Y()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean ja() {
        Rea_2 a2;
        return a2.l(uqa.g);
    }

    public boolean Ia() {
        Rea_2 a2;
        return a2.ga();
    }

    private double l() {
        Rea_2 a2;
        return (vpa.w + a2.R.nextDouble() * aQa.r + a2.R.nextDouble() * aQa.r + a2.R.nextDouble() * aQa.r) * VPa.W;
    }

    public float d(float f2) {
        Rea_2 a2;
        float b2 = f2;
        Rea_2 rea_2 = a2 = this;
        return rea_2.c + (rea_2.C - a2.c) * b2;
    }

    private void ka() {
        a.v = null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, Block block) {
        void b22;
        void a2;
        Rea_2 rea_2 = this;
        Object c2 = a2.stepSound;
        if (rea_2.j.J(b22.up()).J() == QFa.gC) {
            c2 = QFa.gC.stepSound;
        }
        if (!a2.J().l()) {
            Rea_2 rea_22 = rea_2;
            int b22 = rea_22.B();
            if (rea_22.Aa != null && b22 != vRa.d && b22 != uqa.g) {
                Rea_2 rea_23 = rea_2;
                rea_23.D += vRa.d;
                if (rea_23.D > tTa.h && rea_2.D % yRa.d == 0) {
                    rea_2.J(DQa.D, ((Block$SoundType)c2).f() * VPa.i, ((Block$SoundType)c2).J());
                    if (b22 == 0 && rea_2.R.nextInt(NTa.C) == 0) {
                        rea_2.J(tTa.e, ((Block$SoundType)c2).f() * Ora.D, ((Block$SoundType)c2).J());
                        return;
                    }
                } else if (rea_2.D <= tTa.h) {
                    rea_2.J(tTa.U, ((Block$SoundType)c2).f() * VPa.i, ((Block$SoundType)c2).J());
                    return;
                }
            } else {
                if (c2 == Block.soundTypeWood) {
                    rea_2.J(tTa.U, ((Block$SoundType)c2).f() * VPa.i, ((Block$SoundType)c2).J());
                    return;
                }
                rea_2.J(tpa.V, ((Block$SoundType)c2).f() * VPa.i, ((Block$SoundType)c2).J());
            }
        }
    }

    public boolean Ka() {
        Rea_2 a2;
        return a2.l(ERa.C);
    }

    public void L(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.l(AQa.P, b2);
    }

    private void Ha() {
        Rea_2 a2;
        if (!a2.j.e) {
            a2.d = vRa.d;
            a2.I(vRa.d != 0);
        }
    }

    private int L() {
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        int a2 = rea_22.B();
        if (!rea_22.ca() || a2 != vRa.d && a2 != uqa.g) {
            return uqa.g;
        }
        return yta.Ka;
    }

    public int f() {
        Rea_2 a2;
        return h[a2.H()];
    }

    private float I() {
        Rea_2 a2;
        return qta.D + (float)a2.R.nextInt(Yqa.i) + (float)a2.R.nextInt(WOa.fa);
    }

    public void s() {
        Rea_2 a2;
        Rea_2 rea_2 = a2;
        super.s();
        rea_2.J().J(e);
        Rea_2 rea_22 = a2;
        rea_22.J(Kha.M).J(EQa.X);
        rea_22.J(Kha.j).J(wra.Aa);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, Mda mda2) {
        void var3_3;
        void b2;
        Rea_2 c2 = mda2;
        Rea_2 a2 = this;
        if (b2 == zsa.S && a2.v()) {
            if (c2 == null && a2.ca()) {
                Rea_2 rea_2 = a2;
                rea_2.H(uSa.E != 0);
                rea_2.X();
                return vRa.d != 0;
            }
            if (c2 != null && c2.J() == eAa.J((Block)QFa.dC) && !a2.ca()) {
                Rea_2 rea_2 = a2;
                rea_2.H(vRa.d != 0);
                rea_2.X();
                return vRa.d != 0;
            }
        }
        if ((var3_3 = b2 - hra.i) >= 0 && var3_3 < uqa.g && var3_3 < a2.j.f()) {
            if (var3_3 == false && c2 != null && c2.J() != Gea.NA) {
                return uSa.E != 0;
            }
            if (var3_3 != vRa.d || (c2 == null || Rea_2.J(c2.J())) && a2.fa()) {
                Rea_2 rea_2 = a2;
                rea_2.j.J((int)var3_3, (Mda)c2);
                rea_2.v();
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if ((b2 = b2 - dsa.f + uqa.g) >= uqa.g && b2 < a2.j.f()) {
            a2.j.J((int)b2, (Mda)c2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float l() {
        Rea_2 a2;
        return a2.u;
    }

    public void ca() {
        Rea_2 a2;
        if (!a2.j.e && a2.ca()) {
            a2.J(eAa.J((Block)QFa.dC), vRa.d);
            a2.H(uSa.E != 0);
        }
    }

    public void I(int n2) {
        int b2 = n2;
        Rea_2 a2 = this;
        a2.i = b2;
    }

    public boolean aa() {
        Rea_2 a2;
        return a2.I;
    }

    public void k(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        if (b2) {
            Rea_2 rea_2 = a2;
            rea_2.G(rea_2.j());
            return;
        }
        a2.G(pqa.r);
    }

    public String A() {
        int a2;
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        rea_22.ba();
        if (rea_22.R.nextInt(NTa.C) == 0 && !rea_2.Z()) {
            rea_2.Ha();
        }
        if ((a2 = rea_2.B()) == yRa.d) {
            return SPa.g;
        }
        if (a2 == AQa.P) {
            return dua.P;
        }
        if (a2 != vRa.d && a2 != uqa.g) {
            return dQa.Ia;
        }
        return dqa.h;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2) {
        Rea_2 b2;
        void a2;
        Rea_2 rea_2;
        block26: {
            int n2;
            block27: {
                Rea_2 rea_22;
                int n3;
                int n4;
                float f2;
                block29: {
                    block34: {
                        block33: {
                            block32: {
                                block31: {
                                    block30: {
                                        block28: {
                                            rea_2 = this;
                                            b2 = a2.K.f();
                                            if (b2 != null && b2.J() == Gea.SB) {
                                                return super.J((Sx)a2);
                                            }
                                            if (!rea_2.ja() && rea_2.ka()) {
                                                return uSa.E != 0;
                                            }
                                            if (rea_2.ja() && rea_2.ga() && a2.q()) {
                                                rea_2.f((Sx)a2);
                                                return vRa.d != 0;
                                            }
                                            if (rea_2.Ia() && rea_2.Aa != null) {
                                                return super.J((Sx)a2);
                                            }
                                            if (b2 == null) break block26;
                                            n2 = uSa.E;
                                            if (rea_2.fa()) {
                                                int n5;
                                                int n6 = pua.o;
                                                if (b2.J() == Gea.La) {
                                                    n5 = n6 = vRa.d;
                                                } else if (b2.J() == Gea.Yc) {
                                                    n5 = n6 = uqa.g;
                                                } else {
                                                    if (b2.J() == Gea.sd) {
                                                        n6 = yRa.d;
                                                    }
                                                    n5 = n6;
                                                }
                                                if (n5 >= 0) {
                                                    if (!rea_2.ja()) {
                                                        rea_2.ia();
                                                        return vRa.d != 0;
                                                    }
                                                    rea_2.f((Sx)a2);
                                                    return vRa.d != 0;
                                                }
                                            }
                                            if (n2 != 0 || rea_2.ka()) break block27;
                                            f2 = JPa.N;
                                            n4 = uSa.E;
                                            n3 = uSa.E;
                                            if (b2.J() != Gea.DC) break block28;
                                            f2 = kta.v;
                                            n4 = kTa.j;
                                            n3 = yRa.d;
                                            rea_22 = rea_2;
                                            break block29;
                                        }
                                        if (b2.J() != Gea.hb) break block30;
                                        f2 = pqa.r;
                                        n4 = Fsa.d;
                                        n3 = yRa.d;
                                        rea_22 = rea_2;
                                        break block29;
                                    }
                                    if (Block.J(b2.J()) != QFa.uA) break block31;
                                    f2 = eta.e;
                                    n4 = cRa.n;
                                    rea_22 = rea_2;
                                    break block29;
                                }
                                if (b2.J() != Gea.Mb) break block32;
                                f2 = vQa.q;
                                n4 = Psa.M;
                                n3 = yRa.d;
                                rea_22 = rea_2;
                                break block29;
                            }
                            if (b2.J() != Gea.Jd) break block33;
                            f2 = YSa.G;
                            n4 = Psa.M;
                            n3 = tTa.h;
                            if (!rea_2.ja() || rea_2.I() != 0) break block34;
                            n2 = vRa.d;
                            Rea_2 rea_23 = rea_2;
                            rea_22 = rea_23;
                            rea_23.J((Sx)a2);
                            break block29;
                        }
                        if (b2.J() == Gea.pb) {
                            f2 = FRa.Ga;
                            n4 = YSa.c;
                            n3 = NTa.C;
                            if (rea_2.ja() && rea_2.I() == 0) {
                                n2 = vRa.d;
                                rea_2.J((Sx)a2);
                            }
                        }
                    }
                    rea_22 = rea_2;
                }
                if (rea_22.f() < rea_2.J() && f2 > JPa.N) {
                    rea_2.e(f2);
                    n2 = vRa.d;
                }
                if (!rea_2.ga() && n4 > 0) {
                    rea_2.G(n4);
                    n2 = vRa.d;
                }
                if (!(n3 <= 0 || n2 == 0 && rea_2.ja() || n3 >= rea_2.b())) {
                    n2 = vRa.d;
                    rea_2.f(n3);
                }
                if (n2 != 0) {
                    rea_2.T();
                }
            }
            if (!rea_2.ja() && n2 == 0) {
                if (b2 != null && b2.J((Sx)a2, (Gl)rea_2)) {
                    return vRa.d != 0;
                }
                rea_2.ia();
                return vRa.d != 0;
            }
            if (n2 == 0 && rea_2.v() && !rea_2.ca() && b2.J() == eAa.J((Block)QFa.dC)) {
                Rea_2 rea_24 = rea_2;
                rea_24.H(vRa.d != 0);
                Rea_2 rea_25 = rea_2;
                rea_25.J(jRa.Ga, pqa.r, (rea_25.R.nextFloat() - rea_2.R.nextFloat()) * psa.N + pqa.r);
                n2 = vRa.d;
                rea_24.X();
            }
            if (n2 == 0 && rea_2.Ia() && !rea_2.ma() && b2.J() == Gea.NA) {
                rea_2.f((Sx)a2);
                return vRa.d != 0;
            }
            if (n2 != 0) {
                if (!a2.h.f() && (((Mda)b2).E -= vRa.d) == 0) {
                    void v5 = a2;
                    v5.K.J(v5.K.J, (Mda)null);
                }
                return vRa.d != 0;
            }
        }
        if (rea_2.Ia() && rea_2.Aa == null) {
            if (b2 != null && b2.J((Sx)a2, (Gl)rea_2)) {
                return vRa.d != 0;
            }
            rea_2.l((Sx)a2);
            return vRa.d != 0;
        }
        return super.J((Sx)a2);
    }

    public boolean Da() {
        Rea_2 a2;
        if (a2.B() == 0 || a2.H() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void D(float f2) {
        float b2 = f2;
        Rea_2 a2 = this;
        if (b2 > lqa.ga && a2.Aa()) {
            a2.b(uSa.E != 0);
        }
    }

    private void Fa() {
        a.M = vRa.d;
    }

    public double f() {
        Rea_2 a2;
        return a2.J(e).f();
    }

    private boolean ha() {
        Rea_2 a2;
        if (a2.Aa == null && a2.ja == null && a2.ja() && a2.ga() && !a2.Fa() && a2.f() >= a2.J() && a2.O()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean ia() {
        Rea_2 a2;
        return a2.l(ysa.s);
    }

    public boolean r() {
        Rea_2 a2;
        if (!a2.ka() && super.r()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Waa waa2) {
        Object object;
        String string;
        Rea_2 a2;
        Rea_2 b2 = waa2;
        Rea_2 rea_2 = a2 = this;
        Rea_2 rea_22 = b2;
        Rea_2 rea_23 = a2;
        Rea_2 rea_24 = b2;
        Rea_2 rea_25 = a2;
        Rea_2 rea_26 = b2;
        super.J((Waa)rea_26);
        rea_25.b(rea_26.f(rua.s));
        rea_25.F(b2.f(Tqa.ia));
        a2.H(rea_24.f(rRa.g));
        rea_23.a(rea_24.f(opa.N));
        rea_23.F(b2.J(JTa.Ga));
        a2.j(rea_22.J(WRa.J));
        rea_2.I(rea_22.J(ypa.c));
        rea_2.j(b2.f(BPa.E));
        String string2 = Mqa.y;
        if (b2.J(vpa.s, Yqa.i)) {
            string = string2 = b2.J(vpa.s);
        } else {
            object = b2.J(dQa.l);
            string = string2 = tY.J((String)object);
        }
        if (string.length() > 0) {
            a2.f(string2);
        }
        if ((object = a2.J().J(Fpa.C)) != null) {
            a2.J(Kha.j).J(object.J() * VPa.W);
        }
        if (a2.ca()) {
            int n2;
            string2 = b2.J(rua.la, NTa.C);
            a2.X();
            int n3 = n2 = uSa.E;
            while (n3 < string2.J()) {
                Waa waa3 = string2.J(n2);
                int n4 = waa3.J(kua.E) & osa.Ja;
                if (n4 >= uqa.g && n4 < a2.j.f()) {
                    a2.j.J(n4, Mda.J((Waa)waa3));
                }
                n3 = ++n2;
            }
        }
        if (b2.J(jRa.la, NTa.C) && (string2 = Mda.J((Waa)b2.J(jRa.la))) != null && Rea_2.J(string2.J())) {
            a2.j.J(vRa.d, (Mda)string2);
        }
        if (b2.J(aqa.f, NTa.C)) {
            string2 = Mda.J((Waa)b2.J(aqa.f));
            if (string2 != null && string2.J() == Gea.NA) {
                a2.j.J(uSa.E, (Mda)string2);
            }
        } else if (b2.f(rta.d)) {
            a2.j.J(uSa.E, new Mda(Gea.NA));
        }
        a2.v();
    }

    public boolean C(Sx sx2) {
        Rea_2 a2;
        Object b2 = sx2;
        Rea_2 rea_2 = a2 = this;
        rea_2.f(b2.J().toString());
        rea_2.j(vRa.d != 0);
        return vRa.d != 0;
    }

    public void f(Waa waa2) {
        Rea_2 b2 = waa2;
        Rea_2 a2 = this;
        Rea_2 rea_2 = b2;
        Rea_2 rea_22 = a2;
        super.f((Waa)b2);
        Rea_2 rea_23 = b2;
        rea_23.J(rua.s, a2.Aa());
        rea_23.J(rRa.g, a2.ca());
        rea_23.J(opa.N, a2.ba());
        rea_23.J(Tqa.ia, a2.Ka());
        rea_23.J(JTa.Ga, a2.B());
        rea_23.J(WRa.J, a2.a());
        rea_23.J(ypa.c, a2.g());
        rea_2.J(BPa.E, a2.ja());
        rea_2.J(vpa.s, a2.l());
        if (rea_22.ca()) {
            int n2;
            waa waa3 = new waa();
            int n3 = n2 = uqa.g;
            while (n3 < a2.j.f()) {
                Mda mda2 = a2.j.J(n2);
                if (mda2 != null) {
                    Waa waa4;
                    Waa waa5 = waa4 = new Waa();
                    waa5.J(kua.E, (byte)n2);
                    mda2.J(waa5);
                    waa3.J((NCa)waa4);
                }
                n3 = ++n2;
            }
            b2.J(rua.la, (NCa)waa3);
        }
        if (a2.j.J(vRa.d) != null) {
            b2.J(jRa.la, (NCa)a2.j.J(vRa.d).J(new Waa()));
        }
        if (a2.j.J(uSa.E) != null) {
            b2.J(aqa.f, (NCa)a2.j.J(uSa.E).J(new Waa()));
        }
    }

    public String[] J() {
        Rea_2 a2;
        if (a2.v == null) {
            a2.fa();
        }
        return a2.E;
    }

    public String i() {
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        rea_22.ba();
        int a2 = rea_22.B();
        if (a2 == yRa.d) {
            return sqa.T;
        }
        if (a2 == AQa.P) {
            return Zta.Z;
        }
        if (a2 != vRa.d && a2 != uqa.g) {
            return Ira.L;
        }
        return Gua.c;
    }

    public int b() {
        return ySa.T;
    }

    private int f(Mda mda2) {
        Rea_2 b2 = mda2;
        Rea_2 a2 = this;
        if (b2 == null) {
            return uSa.E;
        }
        if ((b2 = b2.J()) == Gea.La) {
            return vRa.d;
        }
        if (b2 == Gea.Yc) {
            return uqa.g;
        }
        if (b2 == Gea.sd) {
            return yRa.d;
        }
        return uSa.E;
    }

    public float C(float f2) {
        Rea_2 a2;
        float b2 = f2;
        Rea_2 rea_2 = a2 = this;
        return rea_2.T + (rea_2.a - a2.T) * b2;
    }

    public String D() {
        Rea_2 a2;
        if (a2.v == null) {
            a2.fa();
        }
        return a2.v;
    }

    public void M() {
        Rea_2 rea_2;
        Rea_2 rea_22 = rea_2 = this;
        super.M();
        if (rea_22.T > JPa.N) {
            Rea_2 rea_23 = rea_2;
            float f2 = Oz.d((float)(rea_23.ba * pua.j / Hra.Ga));
            float f3 = Oz.C((float)(rea_23.ba * pua.j / Hra.Ga));
            float a2 = ZSa.q * rea_2.T;
            Rea_2 rea_24 = rea_2;
            float f4 = VPa.i * rea_24.T;
            rea_24.Aa.l(rea_2.la + (double)(a2 * f2), rea_2.Z + rea_2.d() + rea_2.Aa.C() + (double)f4, (double)(rea_2.A - (double)(a2 * f3)));
            if (rea_23.Aa instanceof Gl) {
                ((Gl)rea_2.Aa).ba = rea_2.ba;
            }
        }
    }

    public boolean fa() {
        Rea_2 a2;
        if (a2.B() == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean ka() {
        Rea_2 rea_2 = this;
        int a2 = rea_2.B();
        if (a2 == yRa.d || a2 == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean Ha() {
        Rea_2 a2;
        return a2.K;
    }

    public void J() {
        Rea_2 a2;
        Rea_2 rea_2 = a2;
        super.J();
        rea_2.aa.f(ERa.C, uSa.E);
        rea_2.aa.f(wOa.t, (byte)uSa.E);
        rea_2.aa.f(kTa.j, uSa.E);
        rea_2.aa.f(wOa.h, String.valueOf(Mqa.y));
        rea_2.aa.f(cQa.o, uSa.E);
    }

    public void d() {
        Rea_2 a2;
        block17: {
            Rea_2 rea_2;
            block16: {
                block15: {
                    block14: {
                        Rea_2 rea_22;
                        block13: {
                            block12: {
                                Rea_2 rea_23 = a2;
                                super.d();
                                if (rea_23.j.e && a2.aa.J()) {
                                    Rea_2 rea_24 = a2;
                                    rea_24.aa.J();
                                    rea_24.ka();
                                }
                                if (a2.W > 0 && (a2.W += vRa.d) > Fsa.d) {
                                    a2.W = uSa.E;
                                    a2.l(XOa.h, uSa.E != 0);
                                }
                                if (!a2.j.e && a2.d > 0 && (a2.d += vRa.d) > kTa.j) {
                                    a2.d = uSa.E;
                                    a2.I(uSa.E != 0);
                                }
                                if (a2.M > 0 && (a2.M += vRa.d) > Yqa.i) {
                                    a2.M = uSa.E;
                                }
                                if (a2.G > 0) {
                                    Rea_2 rea_25 = a2;
                                    rea_25.G += vRa.d;
                                    if (rea_25.G > vpa.Ja) {
                                        a2.G = uSa.E;
                                    }
                                }
                                Rea_2 rea_26 = a2;
                                rea_26.m = rea_26.H;
                                if (!rea_26.Aa()) break block12;
                                Rea_2 rea_27 = a2;
                                rea_27.H += (pqa.r - a2.H) * Xpa.R + Yqa.C;
                                if (!(rea_27.H > pqa.r)) break block13;
                                rea_22 = a2;
                                a2.H = pqa.r;
                                break block14;
                            }
                            Rea_2 rea_28 = a2;
                            rea_28.H += (JPa.N - a2.H) * Xpa.R - Yqa.C;
                            if (rea_28.H < JPa.N) {
                                a2.H = JPa.N;
                            }
                        }
                        rea_22 = a2;
                    }
                    rea_22.T = a2.a;
                    if (!a2.ia()) break block15;
                    Rea_2 rea_29 = a2;
                    rea_29.m = rea_29.H = JPa.N;
                    Rea_2 rea_210 = a2;
                    rea_210.a += (pqa.r - a2.a) * Xpa.R + Yqa.C;
                    if (!(rea_210.a > pqa.r)) break block16;
                    rea_2 = a2;
                    a2.a = pqa.r;
                    break block17;
                }
                Rea_2 rea_211 = a2;
                rea_211.b = uSa.E;
                rea_211.a += (xSa.la * a2.a * a2.a * a2.a - a2.a) * Ora.D - Yqa.C;
                if (rea_211.a < JPa.N) {
                    a2.a = JPa.N;
                }
            }
            rea_2 = a2;
        }
        rea_2.c = a2.C;
        if (a2.l(XOa.h)) {
            Rea_2 rea_2 = a2;
            rea_2.C += (pqa.r - a2.C) * ZSa.q + Yqa.C;
            if (rea_2.C > pqa.r) {
                a2.C = pqa.r;
                return;
            }
        } else {
            Rea_2 rea_2 = a2;
            rea_2.C += (JPa.N - a2.C) * ZSa.q - Yqa.C;
            if (rea_2.C < JPa.N) {
                a2.C = JPa.N;
            }
        }
    }

    public boolean z() {
        Rea_2 a2;
        if (a2.Aa == null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float G() {
        return xSa.la;
    }

    public void b(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.M(b2);
    }

    private void ba() {
        Rea_2 a2;
        if (!a2.j.e) {
            a2.W = vRa.d;
            a2.l(XOa.h, vRa.d != 0);
        }
    }

    private void l(Sx sx2) {
        Rea_2 a2;
        Object b2 = sx2;
        Rea_2 rea_2 = a2 = this;
        ((Sx)((Object)b2)).X = (int)a2.X;
        ((Sx)((Object)b2)).d = rea_2.d;
        a2.b(uSa.E != 0);
        rea_2.I(uSa.E != 0);
        if (!rea_2.j.e) {
            b2.l((vL)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void l(int n2, boolean bl2) {
        void b2;
        void a2;
        Rea_2 rea_2 = this;
        int c2 = rea_2.aa.J(ERa.C);
        if (a2 != false) {
            rea_2.aa.J(ERa.C, Integer.valueOf(c2 | b2));
            return;
        }
        rea_2.aa.J(ERa.C, Integer.valueOf(c2 & (b2 ^ pua.o)));
    }

    public oA J(KZ kZ2, oA oA2) {
        Rea_2 rea_2;
        int n2;
        Rea_2 rea_22;
        oA a2;
        Rea_2 c22 = kZ2;
        Rea_2 b2 = this;
        a2 = super.J((KZ)c22, a2);
        int c22 = uSa.E;
        int n3 = uSa.E;
        if (a2 instanceof oFa) {
            c22 = ((oFa)a2).A;
            n3 = ((oFa)a2).I & osa.Ja | b2.R.nextInt(tTa.h) << Yqa.i;
            rea_22 = b2;
        } else {
            if (b2.R.nextInt(NTa.C) == 0) {
                c22 = vRa.d;
            } else {
                Rea_2 rea_23 = b2;
                int n4 = rea_23.R.nextInt(XTa.W);
                int n5 = rea_23.R.nextInt(tTa.h);
                c22 = uSa.E;
                n3 = n4 | n5 << Yqa.i;
            }
            a2 = new oFa(c22, n3);
            rea_22 = b2;
        }
        rea_22.F(c22);
        Rea_2 rea_24 = b2;
        rea_24.j(n3);
        if (rea_24.R.nextInt(tTa.h) == 0) {
            b2.D(QSa.e);
        }
        if (c22 != AQa.P && c22 != yRa.d) {
            b2.J(Kha.M).J(b2.I());
            Rea_2 rea_25 = b2;
            if (c22 == 0) {
                rea_25.J(Kha.j).J(b2.l());
                n2 = c22;
            } else {
                rea_25.J(Kha.j).J(cRa.ga);
                n2 = c22;
            }
        } else {
            Rea_2 rea_26 = b2;
            rea_26.J(Kha.M).J(zOa.X);
            rea_26.J(Kha.j).J(Bua.Ia);
            n2 = c22;
        }
        if (n2 != uqa.g && c22 != vRa.d) {
            Rea_2 rea_27 = b2;
            rea_2 = rea_27;
            b2.J(e).J(rea_27.J());
        } else {
            Rea_2 rea_28 = b2;
            rea_2 = rea_28;
            rea_28.J(e).J(kTa.B);
        }
        rea_2.A(b2.J());
        return a2;
    }

    public void a(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.A = b2;
    }

    public void f(String string) {
        Object b2 = string;
        Rea_2 a2 = this;
        a2.aa.J(wOa.h, b2);
    }

    public int D() {
        return uua.p;
    }

    public Rea_2(Gg gg2) {
        Rea_2 b2 = gg2;
        Rea_2 a2 = this;
        super((Gg)b2);
        a2.E = new String[yRa.d];
        Rea_2 rea_2 = a2;
        rea_2.I = uSa.E;
        rea_2.l(NPa.B, ySa.Da);
        rea_2.z = uSa.E;
        rea_2.H(uSa.E != 0);
        ((Hba)rea_2.J()).J(vRa.d != 0);
        Rea_2 rea_22 = a2;
        rea_22.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        rea_22.D.J(vRa.d, (gFa)new nfa((bga)((Object)a2), JPa.ja));
        rea_22.D.J(vRa.d, (gFa)new Rga((Rea)a2, JPa.ja));
        rea_22.D.J(uqa.g, (gFa)new Pia(a2, oua.i));
        rea_22.D.J(AQa.P, (gFa)new AIa(a2, oua.i));
        rea_22.D.J(uua.p, (gFa)new HDa((bga)((Object)a2), LQa.E));
        rea_22.D.J(XTa.W, (gFa)new nHa((Yfa)a2, Sx.class, lqa.ga));
        rea_22.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
        rea_22.X();
    }

    public boolean ca() {
        Rea_2 a2;
        return a2.l(Yqa.i);
    }

    public boolean l() {
        return uSa.E != 0;
    }

    public String l() {
        Rea_2 a2;
        return a2.aa.J(wOa.h);
    }

    public int a() {
        Rea_2 a2;
        return a2.aa.J(kTa.j);
    }

    public int H() {
        Rea_2 a2;
        return a2.aa.J(cQa.o);
    }

    /*
     * WARNING - void declaration
     */
    public wEa J(wEa wEa2) {
        int n2;
        void a2;
        Rea_2 rea_2 = this;
        Rea_2 rea_22 = (Rea_2)a2;
        Rea_2 b2 = new Rea_2((Gg)rea_2.j);
        int n3 = rea_2.B();
        int n4 = rea_22.B();
        int n5 = uSa.E;
        if (n3 == n4) {
            n2 = n5 = n3;
        } else {
            if (n3 == 0 && n4 == vRa.d || n3 == vRa.d && n4 == 0) {
                n5 = uqa.g;
            }
            n2 = n5;
        }
        if (n2 == 0) {
            Rea_2 rea_23;
            int n6;
            Rea_2 rea_24;
            int n7 = rea_2.R.nextInt(WOa.fa);
            if (n7 < AQa.P) {
                Rea_2 rea_25 = rea_2;
                rea_24 = rea_25;
                n6 = rea_25.a() & osa.Ja;
            } else if (n7 < Yqa.i) {
                rea_24 = rea_2;
                n6 = rea_22.a() & osa.Ja;
            } else {
                Rea_2 rea_26 = rea_2;
                rea_24 = rea_26;
                n6 = rea_26.R.nextInt(XTa.W);
            }
            int n8 = rea_24.R.nextInt(tTa.h);
            if (n8 < uqa.g) {
                n6 |= rea_2.a() & Uqa.Q;
                rea_23 = b2;
            } else if (n8 < AQa.P) {
                n6 |= rea_22.a() & Uqa.Q;
                rea_23 = b2;
            } else {
                n6 |= rea_2.R.nextInt(tTa.h) << Yqa.i & Uqa.Q;
                rea_23 = b2;
            }
            rea_23.j(n6);
        }
        Rea_2 rea_27 = b2;
        Rea_2 rea_28 = rea_2;
        b2.F(n5);
        double d2 = rea_28.J(Kha.M).J() + a2.J(Kha.M).J() + (double)rea_2.I();
        b2.J(Kha.M).J(d2 / uRa.I);
        double d3 = rea_28.J(e).J() + a2.J(e).J() + rea_2.J();
        rea_27.J(e).J(d3 / uRa.I);
        d2 = rea_2.J(Kha.j).J() + a2.J(Kha.j).J() + rea_2.l();
        rea_27.J(Kha.j).J(d2 / uRa.I);
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3) {
        void a2;
        float c22 = f2;
        Rea_2 b2 = this;
        if (c22 > pqa.r) {
            b2.J(IPa.v, Xpa.R, pqa.r);
        }
        if ((c22 = Oz.f((float)((c22 * MQa.L - vQa.q) * a2))) > 0) {
            Rea_2 rea_2 = b2;
            rea_2.J(gZ.B, c22);
            if (rea_2.Aa != null) {
                b2.Aa.J(gZ.B, (float)c22);
            }
            if (((Block)(c22 = b2.j.J(new XF(b2.la, b2.Z - iSa.P - (double)b2.s, (double)b2.A)).J())).J() != Material.air && !b2.c()) {
                Object c22 = ((Block)c22).stepSound;
                b2.j.J((vL)b2, ((Block$SoundType)c22).J(), ((Block$SoundType)c22).f() * MQa.L, ((Block$SoundType)c22).J() * wOa.w);
            }
        }
    }

    public boolean w() {
        Rea_2 a2;
        Rea_2 rea_2 = a2;
        rea_2.da();
        return super.w();
    }

    public void J(gZ gZ2) {
        Rea_2 a2;
        Rea_2 b2 = gZ2;
        Rea_2 rea_2 = a2 = this;
        super.J((gZ)b2);
        if (!rea_2.j.e) {
            a2.O();
        }
    }

    public void f(Sx sx2) {
        Sx b2 = sx2;
        Rea_2 a2 = this;
        if (!a2.j.e && (a2.Aa == null || a2.Aa == b2) && a2.ja()) {
            Rea_2 rea_2 = a2;
            a2.j.J(rea_2.J());
            b2.J((Rea)rea_2, (HA)a2.j);
        }
    }

    public void H(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.l(Yqa.i, b2);
    }

    private void v() {
        Rea_2 a2;
        if (!a2.j.e) {
            Rea_2 rea_2 = a2;
            rea_2.L((rea_2.j.J(uSa.E) != null ? vRa.d : uSa.E) != 0);
            if (a2.fa()) {
                Rea_2 rea_22 = a2;
                rea_22.J(rea_22.j.J(vRa.d));
            }
        }
    }

    public float j() {
        return MQa.L;
    }

    public int f(int n2) {
        Rea_2 a2;
        int b2 = n2;
        Rea_2 rea_2 = a2 = this;
        b2 = Oz.f((int)(a2.g() + b2), (int)uSa.E, (int)rea_2.b());
        rea_2.I(b2);
        return b2;
    }

    public boolean f(Mda mda2) {
        Rea_2 b2 = mda2;
        Rea_2 a2 = this;
        return uSa.E != 0;
    }

    public void O() {
        Rea_2 a2;
        Rea_2 rea_2 = a2;
        rea_2.J((vL)rea_2, rea_2.j);
        rea_2.ca();
    }

    public void g(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.K = b2;
    }

    public boolean J(fEa fEa2) {
        Rea_2 b22 = fEa2;
        Rea_2 a2 = this;
        if (b22 == a2) {
            return uSa.E != 0;
        }
        if (((Object)((Object)b22)).getClass() != ((Object)((Object)a2)).getClass()) {
            return uSa.E != 0;
        }
        if (a2.ha() && b22.ha()) {
            int n2;
            int b22 = a2.B();
            if (b22 == (n2 = b22.B()) || b22 == 0 && n2 == vRa.d || b22 == vRa.d && n2 == 0) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public int g() {
        Rea_2 a2;
        return a2.i;
    }

    public void j(int n2) {
        Rea_2 a2;
        int b2 = n2;
        Rea_2 rea_2 = a2 = this;
        rea_2.aa.J(kTa.j, Integer.valueOf(b2));
        rea_2.ka();
    }

    public void I(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        if (b2) {
            a2.b(uSa.E != 0);
        }
        a2.l(ysa.s, b2);
    }

    public float l(float f2) {
        Rea_2 a2;
        float b2 = f2;
        Rea_2 rea_2 = a2 = this;
        return rea_2.m + (rea_2.H - a2.m) * b2;
    }

    private double J() {
        Rea_2 a2;
        return rpa.ja + a2.R.nextDouble() * iSa.P + a2.R.nextDouble() * iSa.P + a2.R.nextDouble() * iSa.P;
    }

    public static boolean J(eAa a2) {
        if (a2 == Gea.La || a2 == Gea.Yc || a2 == Gea.sd) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean Fa() {
        Rea_2 a2;
        if (a2.ka() || a2.B() == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private boolean l(int n2) {
        int b2 = n2;
        Rea_2 a2 = this;
        if ((a2.aa.J(ERa.C) & b2) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void j(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.l(uqa.g, b2);
    }

    public Rea J(vL vL2, double d2) {
        double a2;
        Rea_2 c2 = vL2;
        Rea_2 b2 = this;
        double d3 = Bra.o;
        vL vL3 = null;
        Rea_2 rea_2 = c2;
        void v1 = a2;
        for (vL vL4 : b2.j.J((vL)rea_2, rea_2.J().l((double)v1, (double)v1, (double)v1), w)) {
            double d4;
            a2 = vL4.f(((vL)c2).la, ((vL)c2).Z, ((vL)c2).A);
            if (!(d4 < d3)) continue;
            vL3 = vL4;
            d3 = a2;
        }
        return (Rea_2)vL3;
    }

    public boolean ba() {
        Rea_2 a2;
        return a2.A;
    }

    public void F(int n2) {
        Rea_2 a2;
        int b2 = n2;
        Rea_2 rea_2 = a2 = this;
        rea_2.aa.J(wOa.t, Byte.valueOf((byte)b2));
        rea_2.ka();
    }

    private void T() {
        Rea_2 a2;
        Rea_2 rea_2 = a2;
        rea_2.ba();
        if (!rea_2.c()) {
            a2.j.J((vL)a2, Yua.a, pqa.r, pqa.r + (a2.R.nextFloat() - a2.R.nextFloat()) * psa.N);
        }
    }

    public void k(int n2) {
        int b2 = n2;
        Rea_2 a2 = this;
        if (a2.ma()) {
            int n3;
            if (b2 < 0) {
                n3 = b2 = uSa.E;
            } else {
                a2.b = vRa.d;
                a2.Ha();
                n3 = b2;
            }
            if (n3 >= Jsa.ha) {
                a2.J = pqa.r;
                return;
            }
            a2.J = Xpa.R + Xpa.R * (float)b2 / ISa.a;
        }
    }

    public void J(byte by2) {
        byte b2 = by2;
        Rea_2 a2 = this;
        if (b2 == XTa.W) {
            a2.B(vRa.d != 0);
            return;
        }
        if (b2 == uua.p) {
            a2.B(uSa.E != 0);
            return;
        }
        super.J(b2);
    }

    public void M(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.l(fPa.i, b2);
    }

    public void y() {
        Rea_2 rea_2 = this;
        if (rea_2.R.nextInt(ZOa.x) == 0) {
            rea_2.Fa();
        }
        Rea_2 rea_22 = rea_2;
        super.y();
        if (!rea_22.j.e) {
            if (rea_2.R.nextInt(cra.I) == 0 && rea_2.a == false) {
                rea_2.e(pqa.r);
            }
            if (!rea_2.Aa() && rea_2.Aa == null && rea_2.R.nextInt(vpa.Ja) == 0 && rea_2.j.J(new XF(Oz.f((double)rea_2.la), Oz.f((double)rea_2.Z) - vRa.d, Oz.f((double)rea_2.A))).J() == QFa.lf) {
                rea_2.b(vRa.d != 0);
            }
            if (rea_2.Aa() && (rea_2.B += vRa.d) > vpa.o) {
                rea_2.B = uSa.E;
                rea_2.b(uSa.E != 0);
            }
            if (rea_2.Ka() && !rea_2.ga() && !rea_2.Aa()) {
                Rea_2 rea_23 = rea_2;
                Rea_2 a2 = rea_23.J((vL)rea_23, Zta.ba);
                if (a2 != null && rea_2.J((vL)a2) > FPa.T) {
                    rea_2.e.J((vL)a2);
                }
            }
        }
    }

    public void F(boolean bl2) {
        boolean b2 = bl2;
        Rea_2 a2 = this;
        a2.l(ERa.C, b2);
    }

    private void X() {
        Rea_2 rea_2 = this;
        GFa gFa2 = rea_2.j;
        rea_2.j = new GFa(bSa.ja, rea_2.L());
        rea_2.j.J(rea_2.J());
        if (gFa2 != null) {
            int a2;
            GFa gFa3 = gFa2;
            gFa3.J((hc)rea_2);
            int n2 = Math.min(gFa3.f(), rea_2.j.f());
            int n3 = a2 = uSa.E;
            while (n3 < n2) {
                Mda mda2 = gFa2.J(a2);
                if (mda2 != null) {
                    rea_2.j.J(a2, mda2.J());
                }
                n3 = ++a2;
            }
        }
        Rea_2 rea_22 = rea_2;
        rea_22.j.f((hc)rea_2);
        rea_22.v();
    }

    public int j() {
        return hra.i;
    }

    public String J() {
        Rea_2 a2;
        if (a2.J()) {
            return a2.e();
        }
        switch (a2.B()) {
            default: {
                return Ey.f((String)MTa.m);
            }
            case 1: {
                while (false) {
                }
                return Ey.f((String)uQa.B);
            }
            case 2: {
                return Ey.f((String)SOa.r);
            }
            case 3: {
                return Ey.f((String)kta.b);
            }
            case 4: {
                return Ey.f((String)Rua.X);
            }
        }
    }

    private void J(vL vL2, GFa gFa2) {
        Rea_2 c2 = gFa2;
        Rea_2 a2 = this;
        if (c2 != null && !a2.j.e) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < c2.f()) {
                Mda mda2 = c2.J(b2);
                if (mda2 != null) {
                    a2.J(mda2, JPa.N);
                }
                n2 = ++b2;
            }
        }
    }

    static {
        w = new yfa();
        e = new Sda((RC)null, Pua.ca, LQa.E, aSa.V, KPa.y).J(Hta.u).J(vRa.d != 0);
        String[] stringArray = new String[AQa.P];
        stringArray[uSa.E] = null;
        stringArray[vRa.d] = ZOa.i;
        stringArray[uqa.g] = QSa.t;
        stringArray[yRa.d] = cra.O;
        x = stringArray;
        String[] stringArray2 = new String[AQa.P];
        stringArray2[uSa.E] = Mqa.y;
        stringArray2[vRa.d] = uQa.N;
        stringArray2[uqa.g] = gua.a;
        stringArray2[yRa.d] = lQa.A;
        s = stringArray2;
        int[] nArray = new int[AQa.P];
        nArray[uSa.E] = uSa.E;
        nArray[vRa.d] = tTa.h;
        nArray[uqa.g] = XTa.W;
        nArray[yRa.d] = pPa.f;
        h = nArray;
        String[] stringArray3 = new String[XTa.W];
        stringArray3[uSa.E] = sqa.S;
        stringArray3[vRa.d] = Nra.i;
        stringArray3[uqa.g] = DPa.ha;
        stringArray3[yRa.d] = zsa.ia;
        stringArray3[AQa.P] = Jsa.B;
        stringArray3[tTa.h] = Yra.fa;
        stringArray3[uua.p] = pqa.Ga;
        n = stringArray3;
        String[] stringArray4 = new String[XTa.W];
        stringArray4[uSa.E] = Era.ja;
        stringArray4[vRa.d] = EPa.y;
        stringArray4[uqa.g] = uQa.x;
        stringArray4[yRa.d] = fPa.Da;
        stringArray4[AQa.P] = KQa.Y;
        stringArray4[tTa.h] = WQa.d;
        stringArray4[uua.p] = Qra.k;
        q = stringArray4;
        String[] stringArray5 = new String[tTa.h];
        stringArray5[uSa.E] = null;
        stringArray5[vRa.d] = YSa.Q;
        stringArray5[uqa.g] = ISa.H;
        stringArray5[yRa.d] = sra.K;
        stringArray5[AQa.P] = qta.Q;
        o = stringArray5;
        String[] stringArray6 = new String[tTa.h];
        stringArray6[uSa.E] = Mqa.y;
        stringArray6[vRa.d] = Spa.t;
        stringArray6[uqa.g] = rua.D;
        stringArray6[yRa.d] = lTa.r;
        stringArray6[AQa.P] = kta.f;
        l = stringArray6;
    }

    public boolean v() {
        Rea_2 rea_2 = this;
        int a2 = rea_2.B();
        if (a2 == uqa.g || a2 == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

