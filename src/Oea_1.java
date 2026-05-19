/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  FPa
 *  Gg
 *  Gl
 *  JPa
 *  JTa
 *  LQa
 *  Lz
 *  MQa
 *  Mda
 *  NCa
 *  NQa
 *  NTa
 *  QFa
 *  Qqa
 *  Rda
 *  Spa
 *  Tf
 *  URa
 *  UZ
 *  VEa
 *  Waa
 *  YSa
 *  Yea
 *  Yfa
 *  Ypa
 *  Yra
 *  aQa
 *  aSa
 *  aqa
 *  dQa
 *  eAa
 *  gZ
 *  jea
 *  kpa
 *  lqa
 *  pPa
 *  pqa
 *  tX
 *  vL
 *  vRa
 *  waa
 *  xOa
 *  yra
 *  zTa
 *  zsa
 */
import java.util.List;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Oea_1
extends Gl {
    private static final tX l;
    private tX e;
    private tX G;
    private static final tX D;
    private static final tX f;
    private tX F;
    private static final tX g;
    private tX L;
    private long E;
    private int m;
    private tX C;
    private boolean i;
    private boolean M;
    private final Mda[] j;
    private tX J;
    private static final tX A;
    private static final tX I;

    /*
     * WARNING - void declaration
     */
    private void D(float f2) {
        float f3;
        void a2;
        Oea_1 oea_1 = this;
        float b2 = oea_1.f();
        b2 -= a2;
        if (f3 <= MQa.L) {
            Oea_1 oea_12 = oea_1;
            oea_12.n();
            oea_12.k();
            return;
        }
        oea_1.A(b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, Mda mda2) {
        void v0;
        void a2;
        int c2;
        void b2;
        Oea_1 oea_1 = this;
        if (b2 == zOa.v) {
            c2 = uSa.E;
            v0 = a2;
        } else {
            c2 = b2 - ySa.T + vRa.d;
            if (c2 < 0 || c2 >= oea_1.j.length) {
                return uSa.E != 0;
            }
            v0 = a2;
        }
        if (!(v0 == null || Yfa.J((Mda)a2) == c2 || c2 == AQa.P && a2.J() instanceof kda)) {
            return uSa.E != 0;
        }
        oea_1.f(c2, (Mda)a2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void I(boolean bl) {
        Oea_1 oea_1;
        void a2;
        Oea_1 oea_12 = this;
        byte b2 = oea_12.aa.J(NTa.C);
        if (a2 != false) {
            b2 = (byte)(b2 | Yqa.i);
            oea_1 = oea_12;
        } else {
            b2 = (byte)(b2 & Jra.Fa);
            oea_1 = oea_12;
        }
        oea_1.aa.J(NTa.C, Byte.valueOf(b2));
    }

    /*
     * WARNING - void declaration
     */
    private void j(boolean bl) {
        Oea_1 oea_1;
        void a2;
        Oea_1 oea_12 = this;
        byte b2 = oea_12.aa.J(NTa.C);
        if (a2 != false) {
            b2 = (byte)(b2 | AQa.P);
            oea_1 = oea_12;
        } else {
            b2 = (byte)(b2 & kpa.w);
            oea_1 = oea_12;
        }
        oea_1.aa.J(NTa.C, Byte.valueOf(b2));
    }

    public tX e() {
        Oea_1 a2;
        return a2.C;
    }

    public void F() {
        Oea_1 a2;
        a2.k();
    }

    /*
     * WARNING - void declaration
     */
    private void F(boolean bl) {
        Oea_1 oea_1;
        void a2;
        Oea_1 oea_12 = this;
        byte b2 = oea_12.aa.J(NTa.C);
        if (a2 != false) {
            b2 = (byte)(b2 | vRa.d);
            oea_1 = oea_12;
        } else {
            b2 = (byte)(b2 & rQa.p);
            oea_1 = oea_12;
        }
        oea_1.aa.J(NTa.C, Byte.valueOf(b2));
    }

    /*
     * WARNING - void declaration
     */
    private void k(boolean bl) {
        Oea_1 oea_1;
        void a2;
        Oea_1 oea_12 = this;
        byte b2 = oea_12.aa.J(NTa.C);
        if (a2 != false) {
            b2 = (byte)(b2 | uqa.g);
            oea_1 = oea_12;
        } else {
            b2 = (byte)(b2 & ERa.Ka);
            oea_1 = oea_12;
        }
        oea_1.aa.J(NTa.C, Byte.valueOf(b2));
    }

    public void f(Waa waa2) {
        int n2;
        Oea_1 b2 = waa2;
        Oea_1 a2 = this;
        super.f((Waa)b2);
        waa waa3 = new waa();
        int n3 = n2 = uSa.E;
        while (n3 < a2.j.length) {
            Waa waa4 = new Waa();
            if (a2.j[n2] != null) {
                a2.j[n2].J(waa4);
            }
            waa3.J((NCa)waa4);
            n3 = ++n2;
        }
        b2.J(yOa.M, (NCa)waa3);
        if (a2.a() && (a2.e() == null || a2.e().length() == 0)) {
            b2.J(JTa.N, a2.a());
        }
        Oea_1 oea_1 = b2;
        oea_1.J(Ura.A, a2.C());
        oea_1.J(zTa.p, a2.S());
        oea_1.J(yra.c, a2.w());
        oea_1.J(aqa.fa, a2.m);
        oea_1.J(Jqa.u, a2.Q());
        oea_1.J(UTa.F, a2.x());
        if (a2.n()) {
            b2.J(sOa.w, a2.n());
        }
        b2.J(gsa.Ka, (NCa)a2.f());
    }

    private void n() {
        int a2;
        Oea_1 oea_1 = this;
        int n2 = a2 = uSa.E;
        while (n2 < oea_1.j.length) {
            if (oea_1.j[a2] != null && oea_1.j[a2].E > 0) {
                if (oea_1.j[a2] != null) {
                    Block.J((Gg)oea_1.j, new XF((vL)oea_1).up(), oea_1.j[a2]);
                }
                oea_1.j[a2] = null;
            }
            n2 = ++a2;
        }
    }

    private void e(Waa waa2) {
        Oea_1 oea_1;
        Oea_1 oea_12;
        Oea_1 oea_13;
        Oea_1 oea_14;
        Oea_1 oea_15;
        Oea_1 b2 = waa2;
        Oea_1 a2 = this;
        waa waa3 = b2.J(Spa.fa, tTa.h);
        if (waa3.J() > 0) {
            oea_15 = b2;
            a2.d(new tX(waa3));
        } else {
            a2.d(A);
            oea_15 = b2;
        }
        waa3 = oea_15.J(URa.K, tTa.h);
        if (waa3.J() > 0) {
            oea_14 = b2;
            a2.l(new tX(waa3));
        } else {
            a2.l(I);
            oea_14 = b2;
        }
        waa3 = oea_14.J(dQa.L, tTa.h);
        Oea_1 oea_16 = a2;
        if (waa3.J() > 0) {
            oea_16.f(new tX(waa3));
            oea_13 = b2;
        } else {
            oea_16.f(D);
            oea_13 = b2;
        }
        waa3 = oea_13.J(LRa.y, tTa.h);
        Oea_1 oea_17 = a2;
        if (waa3.J() > 0) {
            oea_17.e(new tX(waa3));
            oea_12 = b2;
        } else {
            oea_17.e(l);
            oea_12 = b2;
        }
        waa3 = oea_12.J(cTa.ja, tTa.h);
        Oea_1 oea_18 = a2;
        if (waa3.J() > 0) {
            oea_18.C(new tX(waa3));
            oea_1 = b2;
        } else {
            oea_18.C(f);
            oea_1 = b2;
        }
        b2 = oea_1.J(zsa.K, tTa.h);
        Oea_1 oea_19 = a2;
        if (b2.J() > 0) {
            oea_19.J(new tX((waa)b2));
            return;
        }
        oea_19.J(g);
    }

    public void e(tX tX2) {
        Oea_1 b2 = tX2;
        Oea_1 a2 = this;
        a2.L = b2;
        a2.aa.J(hpa.Z, b2);
    }

    public tX d() {
        Oea_1 a2;
        return a2.L;
    }

    private void G(boolean bl) {
        Oea_1 oea_1;
        Oea_1 a2;
        boolean b2 = bl;
        Oea_1 oea_12 = a2 = this;
        double d2 = oea_12.la;
        double d3 = oea_12.Z;
        tX tX2 = oea_12.A;
        if (b2) {
            Oea_1 oea_13 = a2;
            oea_1 = oea_13;
            oea_13.l(MQa.L, uqa.y);
        } else {
            Oea_1 oea_14 = a2;
            oea_1 = oea_14;
            oea_14.l(JPa.N, JPa.N);
        }
        oea_1.l(d2, d3, (double)tX2);
    }

    /*
     * WARNING - void declaration
     */
    public Oea_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Oea_1 d5;
        Oea_1 e2 = gg2;
        Oea_1 oea_1 = d5 = this;
        oea_1((Gg)e2);
        oea_1.l((double)c2, (double)b2, (double)a2);
    }

    public Mda f(int n2) {
        int b2 = n2;
        Oea_1 a2 = this;
        return a2.j[b2];
    }

    public void d(tX tX2) {
        Oea_1 b2 = tX2;
        Oea_1 a2 = this;
        a2.G = b2;
        a2.aa.J(pPa.f, b2);
    }

    public void R() {
        Oea_1 a2;
        Oea_1 oea_1 = a2;
        oea_1.J(oea_1.M);
    }

    public boolean w() {
        Oea_1 a2;
        if ((a2.aa.J(NTa.C) & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean E() {
        Oea_1 a2;
        if (super.E() && !a2.n()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(double a2) {
        Oea_1 b2;
        double d2 = b2.J().J() * FPa.T;
        if (Double.isNaN(d2) || d2 == aSa.V) {
            d2 = FPa.T;
        }
        double d3 = d2 *= ypa.X;
        if (a2 < d3 * d3) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean z() {
        return uSa.E != 0;
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(Sx var1_2, Lz var2_3) {
        block19: {
            block21: {
                block22: {
                    block20: {
                        var3_5 = this;
                        if (var3_5.n()) {
                            return (boolean)uSa.E;
                        }
                        if (var3_5.j.e || b.t()) break block19;
                        var4_6 = uSa.E;
                        c = b.f();
                        v0 = var5_7 = c != null ? vRa.d : uSa.E;
                        if (var5_7 == 0 || !(c.J() instanceof VEa)) ** GOTO lbl24
                        var6_8 = (VEa)c.J();
                        if (var6_8.j == yRa.d) {
                            var4_6 = vRa.d;
                            v1 = var5_7;
                        } else if (var6_8.j == uqa.g) {
                            var4_6 = uqa.g;
                            v1 = var5_7;
                        } else if (var6_8.j == vRa.d) {
                            var4_6 = yRa.d;
                            v1 = var5_7;
                        } else {
                            if (var6_8.j == 0) {
                                var4_6 = AQa.P;
                            }
lbl24:
                            // 4 sources

                            v1 = var5_7;
                        }
                        if (v1 != 0 && (c.J() == Gea.GB || c.J() == eAa.J((Block)QFa.s))) {
                            var4_6 = AQa.P;
                        }
                        var6_9 = tpa.k;
                        c = uSa.E;
                        var8_10 = var3_5.S();
                        v2 = a;
                        v3 = var6_9 = var8_10 != false ? v2.j * KPa.y : v2.j;
                        if (!(var6_9 >= tpa.k)) break block20;
                        v4 = var8_10 != false ? Jra.A : BQa.ia;
                        if (!(var6_9 < tpa.k + v4) || var3_5.j[vRa.d] == null) break block20;
                        c = vRa.d;
                        v5 = var3_5;
                        break block21;
                    }
                    v6 = var8_10 != false ? aQa.r : aSa.V;
                    if (!(var6_9 >= Tqa.ja + v6)) break block22;
                    v7 = var8_10 != false ? oua.i : LQa.E;
                    if (!(var6_9 < Tqa.ja + v7) || var3_5.j[yRa.d] == null) break block22;
                    c = yRa.d;
                    v5 = var3_5;
                    break block21;
                }
                if (!(var6_9 >= Qqa.b)) ** GOTO lbl-1000
                v8 = var8_10 != false ? oua.i : Jra.A;
                if (var6_9 < Qqa.b + v8 && var3_5.j[uqa.g] != null) {
                    c = uqa.g;
                    v5 = var3_5;
                } else lbl-1000:
                // 2 sources

                {
                    if (var6_9 >= Eqa.O && var3_5.j[AQa.P] != null) {
                        c = AQa.P;
                    }
                    v5 = var3_5;
                }
            }
            v9 = a = v5.j[c] != null ? vRa.d : uSa.E;
            if ((var3_5.m & vRa.d << c) != 0 || (var3_5.m & vRa.d << var4_6) != 0) {
                c = var4_6;
                if ((var3_5.m & vRa.d << var4_6) != 0) {
                    if ((var3_5.m & vRa.d) != 0) {
                        return (boolean)vRa.d;
                    }
                    c = uSa.E;
                }
            }
            if (var5_7 != 0 && var4_6 == 0 && !var3_5.w()) {
                return (boolean)vRa.d;
            }
            if (var5_7 != 0) {
                var3_5.J((Sx)b, var4_6);
            } else if (a != 0) {
                var3_5.J((Sx)b, c);
            }
            return (boolean)vRa.d;
        }
        return (boolean)vRa.d;
    }

    public void J(Waa waa2) {
        waa waa3;
        Oea_1 b2 = waa2;
        Oea_1 a2 = this;
        Oea_1 oea_1 = b2;
        super.J((Waa)oea_1);
        if (oea_1.J(yOa.M, WOa.fa)) {
            int n2;
            waa3 = b2.J(yOa.M, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < a2.j.length) {
                int n4 = n2++;
                a2.j[n4] = Mda.J((Waa)waa3.J(n4));
                n3 = n2;
            }
        }
        Oea_1 oea_12 = a2;
        Oea_1 oea_13 = b2;
        Oea_1 oea_14 = b2;
        a2.J(b2.f(Ura.A));
        a2.F(oea_14.f(zTa.p));
        a2.j(oea_14.f(yra.c));
        a2.m = b2.J(aqa.fa);
        a2.k(oea_13.f(Jqa.u));
        oea_12.I(oea_13.f(UTa.F));
        a2.D(b2.f(sOa.w));
        a2.i = !oea_12.n() ? vRa.d : uSa.E;
        Oea_1 oea_15 = a2;
        oea_15.Ma = oea_15.Q();
        waa3 = b2.J(gsa.Ka);
        oea_15.e((Waa)waa3);
    }

    public Mda J() {
        Oea_1 a2;
        return a2.j[uSa.E];
    }

    public boolean i() {
        Oea_1 a2;
        return a2.C();
    }

    public float l() {
        Oea_1 a2;
        if (a2.Y()) {
            return a2.u * MQa.L;
        }
        return a2.u * ATa.r;
    }

    public void C(tX tX2) {
        Oea_1 b2 = tX2;
        Oea_1 a2 = this;
        a2.F = b2;
        a2.aa.J(Ypa.A, b2);
    }

    public Mda J(int n2) {
        int b2 = n2;
        Oea_1 a2 = this;
        return a2.j[b2 + vRa.d];
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Oea_1 a2 = this;
        a2.M = b2;
        super.J(b2);
    }

    public boolean Y() {
        Oea_1 a2;
        return a2.S();
    }

    public void l(tX tX2) {
        Oea_1 b2 = tX2;
        Oea_1 a2 = this;
        a2.C = b2;
        a2.aa.J(lqa.s, b2);
    }

    public void e(vL object) {
        Oea_1 b2 = object;
        object = this;
    }

    public Mda[] J() {
        Oea_1 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    private void D(boolean bl) {
        Oea_1 oea_1;
        void a2;
        Oea_1 oea_12 = this;
        byte b2 = oea_12.aa.J(NTa.C);
        if (a2 != false) {
            b2 = (byte)(b2 | ERa.C);
            oea_1 = oea_12;
        } else {
            b2 = (byte)(b2 & NQa.A);
            oea_1 = oea_12;
        }
        oea_1.aa.J(NTa.C, Byte.valueOf(b2));
    }

    public void f() {
        Oea_1 oea_1;
        Oea_1 oea_12 = oea_1 = this;
        List list = oea_1.j.f((vL)oea_12, oea_12.J());
        if (list != null && !list.isEmpty()) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < list.size()) {
                Oea_1 a2 = (vL)list.get(n2);
                if (a2 instanceof Yea && ((Yea)a2).J() == Rda.RIDEABLE && oea_1.J((vL)a2) <= iSa.P) {
                    a2.J((vL)oea_1);
                }
                n3 = ++n2;
            }
        }
    }

    public boolean U() {
        Oea_1 a2;
        if (super.U() && !a2.Q()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Waa f() {
        Oea_1 oea_1 = this;
        Oea_1 a2 = new Waa();
        if (!A.equals((Object)oea_1.G)) {
            a2.J(Spa.fa, (NCa)oea_1.G.J());
        }
        if (!I.equals((Object)oea_1.C)) {
            a2.J(URa.K, (NCa)oea_1.C.J());
        }
        if (!D.equals((Object)oea_1.J)) {
            a2.J(dQa.L, (NCa)oea_1.J.J());
        }
        if (!l.equals((Object)oea_1.L)) {
            a2.J(LRa.y, (NCa)oea_1.L.J());
        }
        if (!f.equals((Object)oea_1.F)) {
            a2.J(cTa.ja, (NCa)oea_1.F.J());
        }
        if (!g.equals((Object)oea_1.e)) {
            a2.J(zsa.K, (NCa)oea_1.e.J());
        }
        return a2;
    }

    public boolean S() {
        Oea_1 a2;
        if ((a2.aa.J(NTa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(tX tX2) {
        Oea_1 b2 = tX2;
        Oea_1 a2 = this;
        a2.J = b2;
        a2.aa.J(uua.s, b2);
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2, float f3) {
        float c2 = f3;
        Oea_1 a2 = this;
        if (!a2.Q()) {
            void b2;
            super.d((float)b2, c2);
        }
    }

    public void d() {
        Oea_1 oea_1;
        Oea_1 oea_12;
        Oea_1 oea_13 = oea_12 = this;
        super.d();
        Oea_1 a22 = oea_13.aa.J(pPa.f);
        if (!oea_13.G.equals((Object)a22)) {
            oea_12.d((tX)a22);
        }
        Oea_1 oea_14 = oea_12;
        a22 = oea_14.aa.J(lqa.s);
        if (!oea_14.C.equals((Object)a22)) {
            oea_12.l((tX)a22);
        }
        Oea_1 oea_15 = oea_12;
        a22 = oea_15.aa.J(uua.s);
        if (!oea_15.J.equals((Object)a22)) {
            oea_12.f((tX)a22);
        }
        Oea_1 oea_16 = oea_12;
        a22 = oea_16.aa.J(hpa.Z);
        if (!oea_16.L.equals((Object)a22)) {
            oea_12.e((tX)a22);
        }
        Oea_1 oea_17 = oea_12;
        a22 = oea_17.aa.J(Ypa.A);
        if (!oea_17.F.equals((Object)a22)) {
            oea_12.C((tX)a22);
        }
        Oea_1 oea_18 = oea_12;
        a22 = oea_18.aa.J(ERa.C);
        if (!oea_18.e.equals((Object)a22)) {
            oea_12.J((tX)a22);
        }
        Oea_1 oea_19 = oea_12;
        boolean a22 = oea_19.n();
        if (!oea_19.i && a22) {
            Oea_1 oea_110 = oea_12;
            oea_1 = oea_110;
            oea_110.G(uSa.E != 0);
        } else {
            if (!oea_12.i || a22) {
                return;
            }
            Oea_1 oea_111 = oea_12;
            oea_1 = oea_111;
            oea_111.G(vRa.d != 0);
        }
        oea_1.i = a22;
    }

    public void J() {
        Oea_1 a2;
        Oea_1 oea_1 = a2;
        super.J();
        oea_1.aa.f(NTa.C, (byte)uSa.E);
        oea_1.aa.f(pPa.f, A);
        oea_1.aa.f(lqa.s, I);
        oea_1.aa.f(uua.s, D);
        oea_1.aa.f(hpa.Z, l);
        oea_1.aa.f(Ypa.A, f);
        oea_1.aa.f(ERa.C, g);
    }

    public boolean n() {
        Oea_1 a2;
        if ((a2.aa.J(NTa.C) & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Sx sx2, int n2) {
        void a2;
        Oea_1 oea_1 = this;
        Mda mda2 = oea_1.j[a2];
        if (!(mda2 != null && (oea_1.m & vRa.d << a2 + Yqa.i) != 0 || mda2 == null && (oea_1.m & vRa.d << a2 + ERa.C) != 0)) {
            void b2;
            void v0 = b2;
            int n3 = v0.K.J;
            Oea_1 c2 = v0.K.J(n3);
            if (v0.h.f() && (mda2 == null || mda2.J() == eAa.J((Block)QFa.HF)) && c2 != null) {
                Mda mda3 = c2.J();
                mda3.E = vRa.d;
                oea_1.f((int)a2, mda3);
                return;
            }
            if (c2 != null && ((Mda)c2).E > vRa.d) {
                if (mda2 == null) {
                    Oea_1 oea_12 = c2;
                    Mda mda4 = oea_12.J();
                    mda4.E = vRa.d;
                    oea_1.f((int)a2, mda4);
                    ((Mda)oea_12).E -= vRa.d;
                    return;
                }
            } else {
                oea_1.f((int)a2, (Mda)c2);
                b2.K.J(n3, mda2);
            }
        }
    }

    static {
        A = new tX(JPa.N, JPa.N, JPa.N);
        I = new tX(JPa.N, JPa.N, JPa.N);
        D = new tX(Cra.fa, JPa.N, Cra.fa);
        l = new tX(DPa.m, JPa.N, FRa.Ga);
        f = new tX(vqa.T, JPa.N, vqa.T);
        g = new tX(pqa.r, JPa.N, pqa.r);
    }

    public tX C() {
        Oea_1 a2;
        return a2.F;
    }

    public void J(tX tX2) {
        Oea_1 b2 = tX2;
        Oea_1 a2 = this;
        a2.e = b2;
        a2.aa.J(ERa.C, b2);
    }

    public tX l() {
        Oea_1 a2;
        return a2.J;
    }

    private void x() {
        Oea_1 a2;
        Oea_1 oea_1 = a2;
        Block.J((Gg)oea_1.j, new XF((vL)a2), new Mda((eAa)Gea.U));
        oea_1.n();
    }

    public boolean J(gZ gZ2, float f2) {
        Oea_1 c2 = gZ2;
        Oea_1 b2 = this;
        if (b2.j.e) {
            return uSa.E != 0;
        }
        if (gZ.c.equals((Object)c2)) {
            b2.k();
            return uSa.E != 0;
        }
        if (!(b2.J((gZ)c2) || b2.M || b2.n())) {
            if (c2.l()) {
                Oea_1 oea_1 = b2;
                oea_1.n();
                oea_1.k();
                return uSa.E != 0;
            }
            if (gZ.j.equals((Object)c2)) {
                Oea_1 oea_1 = b2;
                if (!b2.o()) {
                    oea_1.J(tTa.h);
                } else {
                    oea_1.D(VPa.i);
                }
                return uSa.E != 0;
            }
            if (gZ.k.equals((Object)c2) && b2.f() > MQa.L) {
                b2.D(YSa.G);
                return uSa.E != 0;
            }
            boolean a2 = Spa.k.equals(c2.J());
            if (!xOa.l.equals(c2.J()) && !a2) {
                return uSa.E != 0;
            }
            if (c2.J() instanceof jea) {
                c2.J().k();
            }
            if (c2.f() instanceof Sx && !((Sx)c2.f()).h.J) {
                return uSa.E != 0;
            }
            if (c2.i()) {
                Oea_1 oea_1 = b2;
                oea_1.Q();
                oea_1.k();
                return uSa.E != 0;
            }
            long l2 = b2.j.l();
            if (l2 - b2.E > Yra.t && !a2) {
                b2.E = l2;
            } else {
                Oea_1 oea_1 = b2;
                oea_1.x();
                oea_1.Q();
                oea_1.k();
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public tX f() {
        Oea_1 a2;
        return a2.e;
    }

    public void f(int n2, Mda mda2) {
        Oea_1 c2 = mda2;
        Oea_1 a2 = this;
        a2.j[b] = c2;
    }

    public tX J() {
        Oea_1 a2;
        return a2.G;
    }

    public float J(float f2, float f3) {
        Oea_1 a2;
        float c2 = f3;
        Oea_1 oea_1 = a2 = this;
        oea_1.Ma = oea_1.s;
        oea_1.ba = oea_1.X;
        return JPa.N;
    }

    public boolean x() {
        Oea_1 a2;
        if ((a2.aa.J(NTa.C) & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Oea_1(Gg gg2) {
        Oea_1 b2 = gg2;
        Oea_1 a2 = this;
        super((Gg)b2);
        a2.j = new Mda[tTa.h];
        Oea_1 oea_1 = a2;
        oea_1.G = A;
        oea_1.C = I;
        oea_1.J = D;
        oea_1.L = l;
        oea_1.F = f;
        oea_1.e = g;
        oea_1.C(vRa.d != 0);
        oea_1.Ma = oea_1.Q();
        oea_1.l(MQa.L, uqa.y);
    }

    private void Q() {
        Oea_1 a2;
        if (a2.j instanceof Tf) {
            int[] nArray = new int[vRa.d];
            nArray[uSa.E] = Block.l(QFa.L.J());
            ((Tf)a2.j).J(UZ.BLOCK_DUST, a2.la, a2.Z + (double)a2.u / Bta.c, (double)a2.A, NTa.C, (double)(a2.F / YSa.G), (double)(a2.u / YSa.G), (double)(a2.F / YSa.G), fPa.ca, nArray);
        }
    }

    public boolean Q() {
        Oea_1 a2;
        if ((a2.aa.J(NTa.C) & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

