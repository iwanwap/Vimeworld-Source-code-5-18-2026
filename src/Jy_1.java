/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  BRa
 *  BY
 *  DQa
 *  Dga
 *  EQa
 *  ERa
 *  Ev
 *  FPa
 *  Gg
 *  HFa
 *  ISa
 *  JPa
 *  JX
 *  Jy
 *  KTa
 *  KY
 *  Kz
 *  LQa
 *  Lqa
 *  Lra
 *  MQa
 *  NPa
 *  NTa
 *  Ov
 *  Oz
 *  PZ
 *  QFa
 *  QSa
 *  Qaa
 *  Qsa
 *  Sqa
 *  Ssa
 *  TQa
 *  Tpa
 *  Uqa
 *  WY
 *  WZ
 *  Wsa
 *  XTa
 *  Xsa
 *  Ypa
 *  Ysa
 *  ZFa
 *  ZY
 *  Zta
 *  aSa
 *  aqa
 *  asa
 *  bSa
 *  bY
 *  bpa
 *  bqa
 *  bua
 *  cQa
 *  cfa
 *  cga
 *  daa
 *  fY
 *  fsa
 *  hX
 *  hqa
 *  hra
 *  iPa
 *  iX
 *  jRa
 *  jW
 *  jaa
 *  jsa
 *  kta
 *  lEa
 *  lqa
 *  mEa
 *  nFa
 *  nQa
 *  nda
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  rY
 *  uRa
 *  vPa
 *  vQa
 *  vRa
 *  vY
 *  vea
 *  wOa
 *  xY
 *  yZ
 *  ysa
 *  zX
 *  zda
 *  zfa
 *  zsa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Jy_1 {
    public static final Jy Sa;
    public static final Jy Ta;
    public static final Kz Xa;
    public static final Jy qa;
    private static final Logger za;
    public int ma;
    public static final Kz La;
    public FW ka;
    public static final Jy da;
    public static final Jy Ba;
    public List<AZ> aa;
    public static final Jy ea;
    public static final Jy Ea;
    public float Ca;
    public static final Jy ia;
    public String Ma;
    public static final Set<Jy> ba;
    public static final Kz ha;
    public static final Jy Fa;
    public static final Jy Ia;
    public static final Kz la;
    public List<AZ> ga;
    public static final Jy Da;
    public static final Jy ca;
    public static final Jy Ja;
    public static final Jy ja;
    public static final Jy Ha;
    public static final Jy Ga;
    public static final Jy fa;
    public final int Ka;
    public static final Jy Aa;
    public static final Jy S;
    public static final Jy Z;
    public static final Jy Y;
    public static final Jy r;
    public static final aW V;
    public List<AZ> z;
    public static final Jy X;
    public static final Jy y;
    public static final Jy U;
    public static final Jy P;
    public boolean u;
    public static final Jy O;
    public int t;
    public static final Ev R;
    public static final Kz Q;
    public static final Jy N;
    public static final Kz T;
    public static final Kz p;
    public static final Jy n;
    public int s;
    public static final Jy w;
    public static final Kz W;
    public List<AZ> q;
    public static final Kz x;
    public int v;
    public static final Jy o;
    public static final Ev h;
    public static final Jy K;
    public static final Kz H;
    private static final Jy[] c;
    public static final Jy B;
    public float d;
    public static final Kz a;
    public static final Jy b;
    public static final Jy l;
    public Ov e;
    public IBlockState G;
    public static final Jy D;
    public static final Jy f;
    public boolean F;
    public static final Jy g;
    public static final Jy L;
    public float E;
    public static final Map<String, Jy> m;
    public static final Jy C;
    public static final Kz i;
    public IBlockState M;
    public float k;
    public static final Kz j;
    public hx J;
    public rY A;
    public static final Jy I;

    public boolean C() {
        Jy_1 a2;
        if (a2.d > Sqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public WZ J() {
        Jy_1 a2;
        if ((double)a2.E < iSa.P) {
            return WZ.COLD;
        }
        if ((double)a2.E < oua.i) {
            return WZ.MEDIUM;
        }
        return WZ.WARM;
    }

    public Jy J(String string) {
        String b2 = string;
        Jy_1 a2 = this;
        a2.Ma = b2;
        return a2;
    }

    public BlockFlower$EnumFlowerType J(Random random, XF xF2) {
        Random c2 = random;
        Jy_1 b2 = this;
        if (c2.nextInt(yRa.d) > 0) {
            return BlockFlower$EnumFlowerType.DANDELION;
        }
        return BlockFlower$EnumFlowerType.POPPY;
    }

    public final Jy J(Kz kz2) {
        Jy_1 b2 = kz2;
        Jy_1 a2 = this;
        a2.Ca = ((Kz)b2).A;
        a2.k = ((Kz)b2).I;
        return a2;
    }

    public Jy l() {
        Jy_1 a2;
        a2.F = uSa.E;
        return a2;
    }

    /*
     * Unable to fully structure code
     */
    public final void f(Gg var1_2, Random var2_4, oz var3_5, int var4_6, int var5_7, double var6_8) {
        var13_10 = this;
        f = f.M();
        var8_11 = var13_10.M;
        var9_12 = var13_10.G;
        var10_13 = pua.o;
        a = (int)(a / uRa.I + uRa.I + e.nextDouble() * VPa.W);
        var7_14 = c & Ypa.A;
        var11_15 = b & Ypa.A;
        var12_16 = new zz();
        v0 = g = osa.Ja;
        while (v0 >= 0) {
            block13: {
                block15: {
                    block14: {
                        block12: {
                            if (g > e.nextInt(tTa.h)) break block12;
                            d.J(var11_15, g, var7_14, QFa.bg.J());
                            break block13;
                        }
                        var14_17 = d.J(var11_15, g, var7_14);
                        if (var14_17.J().J() != Material.air) break block14;
                        var10_13 = pua.o;
                        break block13;
                    }
                    if (var14_17.J() != QFa.Gd) break block13;
                    if (var10_13 != pua.o) break block15;
                    if (a <= 0) {
                        var8_11 = null;
                        var9_12 = QFa.Gd.J();
                        v1 = g;
                    } else {
                        if (g >= f - AQa.P && g <= f + vRa.d) {
                            v2 = var13_10;
                            var8_11 = v2.M;
                            var9_12 = v2.G;
                        }
                        v1 = g;
                    }
                    if (v1 >= f || var8_11 != null && var8_11.J().J() != Material.air) ** GOTO lbl39
                    if (var13_10.J(var12_16.func_181079_c((int)c, g, (int)b)) < VPa.i) {
                        var8_11 = QFa.Ta.J();
                        v3 = a;
                    } else {
                        var8_11 = QFa.sc.J();
lbl39:
                        // 2 sources

                        v3 = var10_13 = a;
                    }
                    if (g >= f - vRa.d) {
                        d.J(var11_15, g, var7_14, var8_11);
                    } else if (g < f - XTa.W - a) {
                        var8_11 = null;
                        var9_12 = QFa.Gd.J();
                        d.J(var11_15, g, var7_14, QFa.Q.J());
                    } else {
                        d.J(var11_15, g, var7_14, var9_12);
                    }
                    break block13;
                }
                if (var10_13 > 0) {
                    d.J(var11_15, g, var7_14, var9_12);
                    if (--var10_13 == 0 && var9_12.J() == QFa.R) {
                        var10_13 = e.nextInt(AQa.P) + Math.max(uSa.E, g - Ssa.u);
                        var9_12 = var9_12.J(BlockSand.VARIANT) == BlockSand$EnumType.RED_SAND ? QFa.ec.J() : QFa.qC.J();
                    }
                }
            }
            v0 = --g;
        }
    }

    public int f(XF xF2) {
        Jy_1 a2;
        Object b2 = xF2;
        Jy_1 jy_1 = a2 = this;
        double d2 = Oz.J((float)jy_1.J((XF)((Object)b2)), (float)JPa.N, (float)pqa.r);
        double d3 = Oz.J((float)jy_1.f(), (float)JPa.N, (float)pqa.r);
        return JX.J((double)d2, (double)d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<AZ> J(VIa vIa) {
        VIa b2 = vIa;
        Jy_1 a2 = this;
        switch (hX.I[b2.ordinal()]) {
            case 1: {
                return a2.ga;
            }
            case 2: {
                return a2.q;
            }
            case 3: {
                return a2.aa;
            }
            case 4: {
                return a2.z;
            }
        }
        return Collections.emptyList();
    }

    public boolean l() {
        Jy_1 a2;
        return a2.f();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        void b2;
        void c2;
        Object d2 = xF2;
        Jy_1 a2 = this;
        a2.A.J((Gg)c2, (Random)b2, (Jy)a2, (XF)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    public static Jy J(int n2, Jy jy2) {
        int n3 = n2;
        if (n3 >= 0 && n3 <= c.length) {
            Jy b2 = c[n3];
            if (b2 == null) {
                void a2;
                return a2;
            }
            return b2;
        }
        za.warn(new StringBuilder().insert(3 >> 2, pPa.E).append(n3).append(Ura.V).toString());
        return Ba;
    }

    public final float f() {
        Jy_1 a2;
        return a2.d;
    }

    public Jy d(int n2) {
        Jy_1 a2;
        int b2 = n2;
        Jy_1 jy_1 = a2 = this;
        jy_1.J(b2, uSa.E != 0);
        return jy_1;
    }

    public jW J(Random random) {
        Random b2 = random;
        Jy_1 a2 = this;
        return new dx(BlockTallGrass$EnumType.GRASS);
    }

    public int J(float f2) {
        float b2 = f2;
        Jy_1 a2 = this;
        b2 /= vQa.q;
        b2 = Oz.J((float)b2, (float)vqa.T, (float)pqa.r);
        return Oz.f((float)(hqa.Q - b2 * Yqa.C), (float)(MQa.L + b2 * Nra.e), (float)pqa.r);
    }

    public int J(XF xF2) {
        Jy_1 a2;
        Object b2 = xF2;
        Jy_1 jy_1 = a2 = this;
        double d2 = Oz.J((float)jy_1.J((XF)((Object)b2)), (float)JPa.N, (float)pqa.r);
        double d3 = Oz.J((float)jy_1.f(), (float)JPa.N, (float)pqa.r);
        return zX.J((double)d2, (double)d3);
    }

    public Jy C(int n2) {
        int b2 = n2;
        Jy_1 a2 = this;
        a2.v = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Jy J(int n2, boolean bl) {
        void a2;
        int c2 = n2;
        Jy_1 b2 = this;
        b2.s = c2;
        if (a2 != false) {
            b2.v = (c2 & Psa.P) >> vRa.d;
            return b2;
        }
        b2.v = c2;
        return b2;
    }

    public Jy f() {
        Jy_1 a2;
        Jy_1 jy_1 = a2;
        return jy_1.f(jy_1.Ka + XOa.h);
    }

    public boolean f() {
        Jy_1 a2;
        return a2.u;
    }

    public rY J() {
        return new rY();
    }

    public final float J(XF xF2) {
        Object b2 = xF2;
        Jy_1 a2 = this;
        if (b2.getY() > ysa.s) {
            float f2 = (float)(R.J((double)b2.getX() * oua.i / Wqa.Z, (double)b2.getZ() * oua.i / Wqa.Z) * FPa.T);
            return a2.E - (f2 + (float)b2.getY() - EPa.r) * Yqa.C / NSa.B;
        }
        return a2.E;
    }

    public static Jy l(int a2) {
        return Jy_1.J(a2, (Jy)((Jy_1)null));
    }

    public float J() {
        return Nra.e;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, oz oz2, int n2, int n3, double d2) {
        void a2;
        void g2;
        void c2;
        void d3;
        void e2;
        void f2;
        int n4 = n3;
        Jy_1 b2 = this;
        b2.f((Gg)f2, (Random)e2, (oz)d3, (int)c2, (int)g2, (double)a2);
    }

    public boolean J() {
        Jy_1 a2;
        if (a2.f()) {
            return uSa.E != 0;
        }
        return a2.F;
    }

    public bV J(Random random) {
        Random b2 = random;
        Jy_1 a2 = this;
        if (b2.nextInt(NTa.C) == 0) {
            return a2.e;
        }
        return a2.J;
    }

    public Jy_1(int n2) {
        int b2 = n2;
        Jy_1 a2 = this;
        a2.M = QFa.lf.J();
        a2.G = QFa.Bc.J();
        a2.ma = sOa.p;
        a2.Ca = Jy_1.La.A;
        a2.k = Jy_1.La.I;
        a2.E = MQa.L;
        a2.d = MQa.L;
        a2.t = Wsa.K;
        a2.ga = Lists.newArrayList();
        a2.q = Lists.newArrayList();
        a2.aa = Lists.newArrayList();
        a2.z = Lists.newArrayList();
        a2.F = vRa.d;
        Jy_1 jy_1 = a2;
        a2.J = new hx(uSa.E != 0);
        a2.e = new Ov(uSa.E != 0);
        a2.ka = new FW();
        a2.Ka = b2;
        Jy_1.c[b2] = a2;
        a2.A = a2.J();
        a2.q.add(new AZ(ZFa.class, lqa.s, AQa.P, AQa.P));
        a2.q.add(new AZ(cfa.class, NTa.C, yRa.d, yRa.d));
        a2.q.add(new AZ(zda.class, NTa.C, AQa.P, AQa.P));
        a2.q.add(new AZ(aEa.class, NTa.C, AQa.P, AQa.P));
        a2.q.add(new AZ(aDa.class, Yqa.i, AQa.P, AQa.P));
        a2.ga.add(new AZ(Dga.class, ySa.T, AQa.P, AQa.P));
        a2.ga.add(new AZ(nda.class, ySa.T, AQa.P, AQa.P));
        a2.ga.add(new AZ(lEa.class, ySa.T, AQa.P, AQa.P));
        a2.ga.add(new AZ(zfa.class, ySa.T, AQa.P, AQa.P));
        a2.ga.add(new AZ(cga.class, ySa.T, AQa.P, AQa.P));
        a2.ga.add(new AZ(vea.class, NTa.C, vRa.d, AQa.P));
        a2.ga.add(new AZ(nFa.class, tTa.h, vRa.d, vRa.d));
        a2.aa.add(new AZ(HFa.class, NTa.C, AQa.P, AQa.P));
        a2.z.add(new AZ(mEa.class, NTa.C, Yqa.i, Yqa.i));
    }

    public Jy J() {
        Jy_1 a2;
        a2.u = vRa.d;
        return a2;
    }

    public boolean J(Jy jy2) {
        Jy_1 b2 = jy2;
        Jy_1 a2 = this;
        if (b2 == a2) {
            return vRa.d != 0;
        }
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (a2.J() == b2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        int n2;
        za = LogManager.getLogger();
        La = new Kz(Nra.e, psa.N);
        H = new Kz(vPa.b, JPa.N);
        Xa = new Kz(vqa.T, Nra.e);
        x = new Kz(bqa.N, Nra.e);
        Q = new Kz(Mqa.N, Yqa.C);
        T = new Kz(psa.N, psa.N);
        j = new Kz(KTa.r, bpa.K);
        p = new Kz(Ira.d, POa.o);
        a = new Kz(pqa.r, MQa.L);
        ha = new Kz(JPa.N, POa.o);
        W = new Kz(Nra.e, xSa.la);
        la = new Kz(psa.N, bpa.K);
        i = new Kz(ATa.x, Nra.e);
        c = new Jy_1[hra.Ja];
        ba = Sets.newHashSet();
        m = Maps.newHashMap();
        Ba = new KY(uSa.E).d(BRa.E).J(KPa.W).J(Xa);
        Z = new daa(vRa.d).d(gsa.C).J(aqa.o);
        ea = new WY(uqa.g).d(jsa.h).J(pqa.V).l().J(kta.v, JPa.N).J(Q);
        U = new iX(yRa.d, uSa.E != 0).d(bSa.L).J(vRa.N).J(a).J(psa.N, bpa.K);
        Y = new Qaa(AQa.P, uSa.E).d(pta.Ha).J(NPa.T);
        I = new gy(tTa.h, uSa.E).d(zsa.d).J(STa.H).J(Yqa.K).J(rta.o, xSa.la).J(T);
        g = new wZ(uua.p).d(AQa.k).J(Ysa.Z).J(aSa.U).J(i).J(xSa.la, ATa.r);
        n = new yZ(XTa.W).d(osa.Ja).J(Zqa.t).J(H);
        B = new BY(Yqa.i).d(Zqa.E).J(fta.p).l().J(kta.v, JPa.N);
        ia = new vY(WOa.fa).d(ySa.v).J(Ira.F).l();
        N = new KY(NTa.C).d(Lsa.Aa).J(yta.r).J().J(Xa).J(JPa.N, MQa.L);
        b = new yZ(pPa.f).d(EPa.Ga).J(WOa.l).J().J(H).J(JPa.N, MQa.L);
        C = new ZY(lqa.s, uSa.E != 0).d(Wsa.K).J(iSa.Ha).J().J(JPa.N, MQa.L).J(Q);
        Ea = new ZY(uua.s, uSa.E != 0).d(xra.R).J(cPa.I).J().J(j).J(JPa.N, MQa.L);
        P = new VZ(hpa.Z).d(IPa.r).J(nQa.J).J(ATa.r, pqa.r).J(la);
        Da = new VZ(Ypa.A).d(hQa.u).J(qsa.B).J(ATa.r, pqa.r).J(ha);
        Ha = new jaa(ERa.C).d(KPa.Ha).J(mSa.l).J(xSa.la, Xpa.R).J(ha);
        Ga = new WY(yta.Ka).d(Ssa.s).J(Xsa.I).l().J(kta.v, JPa.N).J(j);
        fa = new Qaa(yOa.B, uSa.E).d(Zta.v).J(UOa.F).J(j);
        l = new gy(wOa.t, uSa.E).d(FPa.c).J(Psa.s).J(Yqa.K).J(rta.o, xSa.la).J(j);
        D = new iX(kTa.j, vRa.d != 0).d(Qsa.Z).J(hpa.Ja).J(a.J()).J(psa.N, bpa.K);
        Fa = new cY(wOa.h, uSa.E != 0).d(cPa.B).J(Nta.n).J(cPa.B).J(fsa.Ia, ATa.r);
        y = new cY(cQa.o, uSa.E != 0).d(wsa.V).J(yRa.o).J(cPa.B).J(fsa.Ia, ATa.r).J(j);
        Ja = new cY(AQa.ba, vRa.d != 0).d(iPa.K).J(jRa.s).J(cPa.B).J(fsa.Ia, xSa.la);
        L = new KY(osa.c).d(QSa.p).J(iPa.O).J(x);
        o = new xY(kTa.g).d(UOa.N).J(uua.a).J(psa.N, bpa.K).J(W);
        da = new jaa(ITa.E).d(GPa.v).J(wua.Aa).J(Yqa.C, bpa.K).J(ha).J();
        Sa = new Qaa(Lra.e, uqa.g).J(KTa.l).d(Lqa.d);
        Aa = new Qaa(EPa.O, uqa.g).J(EQa.O).d(ROa.h).J(j);
        O = new Qaa(ITa.A, yRa.d).d(vTa.f).J(fsa.z);
        Ta = new gy(Fsa.d, uSa.E).d(yRa.S).J(Ira.h).J(Yqa.K).J().J(vPa.b, Xpa.R).J(T).C(Wsa.K);
        ca = new gy(tua.U, uSa.E).d(vQa.Da).J(Qsa.F).J(Yqa.K).J().J(vPa.b, Xpa.R).J(j).C(Wsa.K);
        qa = new gy(fPa.i, vRa.d).d(pQa.W).J(QTa.i).J(Yqa.K).J(bpa.K, xSa.la).J(T);
        ja = new gy(Zqa.G, vRa.d).d(BQa.n).J(XTa.c).J(Yqa.K).J(bpa.K, xSa.la).J(j);
        Ia = new iX(Tpa.z, vRa.d != 0).d(DQa.P).J(rpa.w).J(a).J(psa.N, bpa.K);
        r = new PZ(TQa.ca).d(Tqa.N).J(Yua.M).J(pPa.c, JPa.N).l().J(Q);
        K = new PZ(Qsa.Ha).d(Iqa.R).J(uqa.c).J(pqa.r, JPa.N).l().J(p);
        X = new fY(LQa.c, uSa.E != 0, uSa.E != 0).d(Uqa.w).J(XTa.G);
        w = new fY(ISa.E, uSa.E != 0, vRa.d != 0).d(bua.E).J(MTa.G).J(p);
        S = new fY(CRa.L, uSa.E != 0, uSa.E != 0).d(kra.A).J(rta.Y).J(p);
        f = Ba;
        Z.f();
        ea.f();
        Y.f();
        I.f();
        g.f();
        C.f();
        Fa.f();
        Ja.f();
        Ta.f();
        r.f();
        K.f();
        X.f();
        w.f();
        S.f();
        Sa.f();
        Aa.f();
        O.f();
        qa.f();
        U.f();
        Ia.f();
        qa.f(Jy_1.ja.Ka + XOa.h).J(xra.u);
        Jy[] jyArray = c;
        int n3 = jyArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Jy jy2 = jyArray[n2];
            if (jy2 != null) {
                if (m.containsKey(jy2.Ma)) {
                    throw new Error(new StringBuilder().insert(3 >> 2, iSa.J).append(jy2.Ma).append(sqa.J).append(((Jy_1)Jy_1.m.get((Object)jy2.Ma)).Ka).append(sSa.P).append(jy2.Ka).toString());
                }
                m.put(jy2.Ma, jy2);
                if (jy2.Ka < XOa.h) {
                    ba.add(jy2);
                }
            }
            n4 = ++n2;
        }
        ba.remove(B);
        ba.remove(ia);
        ba.remove(N);
        ba.remove(D);
        R = new Ev(new Random(PQa.e), vRa.d);
        h = new Ev(new Random(jRa.Da), vRa.d);
        V = new aW();
    }

    public Class<? extends Jy> J() {
        Jy_1 a2;
        return a2.getClass();
    }

    public Jy f(int n2) {
        int b2 = n2;
        Jy_1 a2 = this;
        return new bY(b2, (Jy)a2);
    }

    public static Jy[] J() {
        return c;
    }

    public Jy J(int n2) {
        int b2 = n2;
        Jy_1 a2 = this;
        a2.ma = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Jy J(float f2, float f3) {
        void a2;
        float c2 = f2;
        Jy_1 b2 = this;
        if (c2 > Nra.e && c2 < psa.N) {
            throw new IllegalArgumentException(fqa.L);
        }
        Jy_1 jy_1 = b2;
        jy_1.E = c2;
        jy_1.d = a2;
        return b2;
    }

    public final int J() {
        Jy_1 a2;
        return (int)(a2.d * asa.o);
    }
}

