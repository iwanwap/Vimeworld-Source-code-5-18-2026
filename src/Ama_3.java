/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CR
 *  EC
 *  ERa
 *  Ega
 *  Gua
 *  JPa
 *  Kna
 *  Kpa
 *  Mda
 *  Oz
 *  Qsa
 *  YSa
 *  Zta
 *  aSa
 *  cQa
 *  gna
 *  kea
 *  kta
 *  nLa
 *  nka
 *  pY
 *  pqa
 *  pua
 *  uKa
 *  vRa
 *  wOa
 *  zsa
 */
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Ama_3
extends EC {
    public int v;
    private int o;
    private sEa h;
    private int K;
    private long H;
    public boolean c;
    private int B;
    private int d;
    public final Set<sEa> a;
    private sEa b;
    private boolean l;
    public int e;
    public static final ResourceLocation G = new ResourceLocation(gua.fa);
    private Mda D;
    private sEa f;
    public int F;
    private long g;
    private boolean L;
    private int E;
    private long m;
    private sEa C;
    private int i;
    private sEa M;
    private Mda k;
    public int j;
    private boolean J;
    private Mda A;
    public Ega I;

    public void A() {
        Ama_3 a2;
        Ama_3 ama_3 = a2;
        super.A();
        Ama_3 ama_32 = a2;
        ama_3.g.c.G = ama_32.I;
        ama_3.e = (int)((ama_32.A - a2.j) / uqa.g);
        ama_3.v = (int)((ama_3.I - a2.F) / uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(int n2) {
        Ama_3 ama_3 = this;
        if (ama_3.g.c.K.J() == null && ama_3.f != null) {
            int b2;
            int n3 = b2 = uSa.E;
            while (n3 < WOa.fa) {
                void a2;
                if (a2 == ama_3.g.z.Ga[b2].getKeyCode()) {
                    Ama_3 ama_32 = ama_3;
                    ama_32.J(ama_3.f, ama_32.f.I, b2, uqa.g);
                    return vRa.d != 0;
                }
                n3 = ++b2;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(sEa sEa2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Ama_3 a2 = this;
        void v0 = c2;
        return a2.J(v0.j, v0.A, ERa.C, ERa.C, (int)b2, d2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void J(sEa var1_1) {
        block13: {
            block10: {
                block11: {
                    block12: {
                        block9: {
                            var2_2 = this;
                            v0 = a;
                            var4_3 = v0.j;
                            var3_4 = v0.A;
                            b = v0.J();
                            var5_5 = uSa.E;
                            var6_6 = v0 == var2_2.b && var2_2.k != null && var2_2.l == false ? vRa.d : uSa.E;
                            var7_7 /* !! */  = var2_2.g.c.K.J();
                            var8_8 = null;
                            if (a != var2_2.b || var2_2.k == null || !var2_2.l || b == null) break block9;
                            b = b.J();
                            v1 = var2_2;
                            b.E /= uqa.g;
                            break block10;
                        }
                        if (!var2_2.c || !var2_2.a.contains(a) || var7_7 /* !! */  == null) break block11;
                        if (var2_2.a.size() == vRa.d) {
                            return;
                        }
                        if (!Ega.J((sEa)a, (Mda)var7_7 /* !! */ , (boolean)vRa.d) || !var2_2.I.J((sEa)a)) break block12;
                        b = var7_7 /* !! */ .J();
                        var5_5 = vRa.d;
                        v2 = var2_2;
                        Ega.J(v2.a, (int)v2.o, (Mda)b, (int)(a.J() == null ? uSa.E : a.J().E));
                        if (b.E > b.e()) {
                            var8_8 = pY.YELLOW + Mqa.y + b.e();
                            b.E = b.e();
                        }
                        if (b.E <= a.J((Mda)b)) break block11;
                        var8_8 = pY.YELLOW + Mqa.y + a.J((Mda)b);
                        v1 = var2_2;
                        b.E = a.J((Mda)b);
                        break block10;
                    }
                    var2_2.a.remove(a);
                    var2_2.J();
                }
                v1 = var2_2;
            }
            v1.I = (Ega)QTa.G;
            var2_2.m.m = QTa.G;
            if (b == null && (var7_7 /* !! */  = a.J()) != null) {
                v3 = var2_2;
                var9_9 = v3.g.J().J((String)var7_7 /* !! */ );
                uKa.L();
                v3.g.J().J(WKa.C);
                v3.J(var4_3, var3_4, var9_9, ERa.C, ERa.C);
                uKa.P();
                var6_6 = vRa.d;
            }
            if (var6_6 != 0) break block13;
            if (b == null || !b.M()) ** GOTO lbl73
            var7_7 /* !! */  = b.J();
            var9_10 = var7_7 /* !! */ .J(Gta.q);
            if (var9_10 != 0) {
                uKa.L();
                uKa.u();
                var10_11 = var7_7 /* !! */ .J(kra.c);
                if (var10_11 == aSa.V) {
                    v4 = var4_3;
                    Ama_3.J((int)v4, (int)var3_4, (int)(v4 + ERa.C), (int)(var3_4 + ERa.C), (int)gna.J((int)var9_10, (boolean)uSa.E));
                } else {
                    var2_2.J(var4_3, var3_4, ERa.C, Zta.ba * var10_11, gna.J((int)var9_10, (boolean)uSa.E));
                }
                uKa.P();
                uKa.J();
                v5 = var5_5;
            } else {
                var10_12 = var7_7 /* !! */ .J(wOa.L);
                if (var10_12 != 0) {
                    uKa.L();
                    uKa.u();
                    var2_2.J(var4_3, var3_4, ERa.C, gna.J((int)var10_12, (boolean)uSa.E));
                    uKa.P();
                    uKa.J();
                }
lbl73:
                // 4 sources

                v5 = var5_5;
            }
            if (v5 != 0) {
                v6 = var4_3;
                Ama_3.J((int)v6, (int)var3_4, (int)(v6 + ERa.C), (int)(var3_4 + ERa.C), (int)Gua.V);
            }
            uKa.J();
            v7 = var2_2;
            v7.m.f((Mda)b, var4_3, var3_4);
            v7.m.J((Kna)var2_2.L, (Mda)b, var4_3, var3_4, var8_8);
        }
        v8 = var2_2;
        v8.m.m = JPa.N;
        v8.I = (Ega)JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Mda mda2, int n2, int n3, String string) {
        void a2;
        void c2;
        void d2;
        int e2 = n3;
        Ama_3 b2 = this;
        uKa.J((float)JPa.N, (float)JPa.N, (float)Ura.m);
        Ama_3 ama_3 = b2;
        ama_3.I = (Ega)Qsa.U;
        ama_3.m.m = Qsa.U;
        ama_3.m.f((Mda)d2, (int)c2, e2);
        ama_3.m.J((Kna)b2.L, (Mda)d2, (int)c2, e2 - (b2.k == null ? uSa.E : Yqa.i), (String)a2);
        Ama_3 ama_32 = b2;
        ama_32.I = (Ega)JPa.N;
        ama_32.m.m = JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        Mda d222;
        int n4;
        int n5;
        void b2;
        void c2;
        void a322;
        Ama_3 ama_3;
        Ama_3 ama_32 = ama_3 = this;
        ama_32.i();
        int n6 = ama_32.e;
        int n7 = ama_32.v;
        ama_32.J((float)a322, (int)c2, (int)b2);
        uKa.E();
        nLa.C();
        uKa.L();
        uKa.u();
        super.J((int)c2, (int)b2, (float)a322);
        nLa.J();
        uKa.e();
        uKa.J((float)n6, (float)n7, (float)JPa.N);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.o();
        ama_32.f = null;
        int a322 = YSa.c;
        int d222 = YSa.c;
        nka.J((int)nka.P, (float)((float)a322 / pqa.r), (float)((float)d222 / pqa.r));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        int n8 = a322 = uSa.E;
        while (n8 < ama_3.I.A.size()) {
            sEa d222 = (sEa)ama_3.I.A.get(a322);
            Ama_3 ama_33 = ama_3;
            ama_33.J(d222);
            if (ama_33.J(d222, (int)c2, (int)b2) && d222.f()) {
                sEa sEa2 = ama_3.f = d222;
                uKa.L();
                uKa.u();
                n5 = sEa2.j;
                n4 = sEa2.A;
                uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, uSa.E != 0);
                int n9 = n5;
                ama_3.J(n9, n4, n9 + ERa.C, n4 + ERa.C, Gua.V, Gua.V);
                uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
                uKa.P();
                uKa.J();
            }
            n8 = ++a322;
        }
        nLa.C();
        Ama_3 ama_34 = ama_3;
        ama_34.J((int)c2, (int)b2);
        nLa.J();
        kea a322 = ama_34.g.c.K;
        Mda mda2 = d222 = ama_34.k == null ? a322.J() : ama_3.k;
        if (d222 != null) {
            Ama_3 ama_35;
            n5 = Yqa.i;
            n4 = ama_3.k == null ? Yqa.i : ERa.C;
            String string = null;
            if (ama_3.k != null && ama_3.l) {
                d222 = d222.J();
                ama_35 = ama_3;
                d222.E = Oz.f((float)((float)d222.E / kta.v));
            } else {
                if (ama_3.c && ama_3.a.size() > vRa.d) {
                    d222 = d222.J();
                    d222.E = ama_3.K;
                    if (d222.E == 0) {
                        string = new StringBuilder().insert(2 & 5, Mqa.y).append(pY.YELLOW).append(GPa.J).toString();
                    }
                }
                ama_35 = ama_3;
            }
            ama_35.J(d222, (int)(c2 - n6 - n5), (int)(b2 - n7 - n4), string);
        }
        if (ama_3.D != null) {
            float f3;
            float f4 = (float)(Kpa.J() - ama_3.m) / QTa.G;
            if (f3 >= pqa.r) {
                f4 = pqa.r;
                ama_3.D = null;
            }
            Ama_3 ama_36 = ama_3;
            Ama_3 ama_37 = ama_3;
            n4 = ama_36.C.j - ama_37.d;
            int n10 = ama_36.C.A - ama_3.i;
            n6 = ama_37.d + (int)((float)n4 * f4);
            n7 = ama_36.i + (int)((float)n10 * f4);
            ama_36.J(ama_36.D, n6, n7, null);
        }
        uKa.D();
        OT.i.F.J(CR.BEFORE_TOOLTIP);
        if (a322.J() == null && ama_3.f != null && ama_3.f.J()) {
            Ama_3 ama_38 = ama_3;
            Mda mda3 = ama_38.f.J();
            ama_38.J(mda3, (int)c2, (int)b2);
        }
        uKa.P();
        uKa.J();
        nLa.f();
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public void M() {
        Ama_3 a2;
        if (a2.g.c != null) {
            Ama_3 ama_3 = a2;
            ama_3.I.J((Sx)ama_3.g.c);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void f(int var1_1, int var2_2, int var3_3) {
        block20: {
            block22: {
                block21: {
                    block19: {
                        v0 = var4_4 = this;
                        d = v0.J((int)c, (int)b);
                        var5_5 = v0.e;
                        var6_6 = v0.v;
                        var7_7 = c < var5_5 || b < var6_6 || c >= var5_5 + var4_4.j || b >= var6_6 + var4_4.F ? vRa.d : uSa.E;
                        var8_10 = pua.o;
                        if (d != null) {
                            var8_10 = d.I;
                        }
                        if (var7_7 != 0) {
                            var8_10 = rta.n;
                        }
                        if (!var4_4.L || d == null || a != false || !var4_4.I.J((Mda)null, d)) break block19;
                        if (Ama_3.l()) {
                            if (d != null && d.J != null && var4_4.A != null) {
                                for (sEa var9_11 : var4_4.I.A) {
                                    if (var9_11 == null || !var9_11.J((Sx)var4_4.g.c) || !var9_11.J() || var9_11.J != d.J || !Ega.J((sEa)var9_11, (Mda)var4_4.A, (boolean)vRa.d)) continue;
                                    v1 = var9_11;
                                    var4_4.J(v1, v1.I, (int)a, vRa.d);
                                }
                            }
                        } else {
                            var4_4.J(d, var8_10, (int)a, uua.p);
                        }
                        v2 = var4_4;
                        var4_4.L = uSa.E;
                        var4_4.g = nqa.i;
                        break block20;
                    }
                    if (var4_4.c && var4_4.B != a) {
                        var4_4.c = uSa.E;
                        var4_4.a.clear();
                        var4_4.J = vRa.d;
                        return;
                    }
                    if (var4_4.J) {
                        var4_4.J = uSa.E;
                        return;
                    }
                    if (var4_4.b == null || !var4_4.g.z.tb) break block21;
                    if (a != false && a != vRa.d) ** GOTO lbl93
                    if (var4_4.k == null && d != var4_4.b) {
                        var4_4.k = var4_4.b.J();
                    }
                    var7_7 = (int)Ega.J((sEa)d, (Mda)var4_4.k, (boolean)uSa.E);
                    if (var8_10 != pua.o && var4_4.k != null && var7_7 != 0) {
                        v3 = var4_4;
                        v4 = var4_4;
                        v3.J(v4.b, v4.b.I, (int)a, uSa.E);
                        v3.J(d, var8_10, uSa.E, uSa.E);
                        if (v3.g.c.K.J() != null) {
                            v5 = var4_4;
                            var4_4.J(v5.b, v5.b.I, (int)a, uSa.E);
                            v6 = var4_4;
                            v7 = v6;
                            var4_4.d = c - var5_5;
                            v6.i = b - var6_6;
                            v6.C = var4_4.b;
                            v6.D = v6.k;
                            v6.m = Kpa.J();
                        } else {
                            var4_4.D = null;
                            v7 = var4_4;
                        }
                    } else {
                        if (var4_4.k != null) {
                            var4_4.d = c - var5_5;
                            var4_4.i = b - var6_6;
                            var4_4.C = var4_4.b;
                            var4_4.D = var4_4.k;
                            var4_4.m = Kpa.J();
                        }
                        v7 = var4_4;
                    }
                    v7.k = null;
                    v2 = var4_4;
                    var4_4.b = null;
                    break block20;
                }
                if (!var4_4.c || var4_4.a.isEmpty()) break block22;
                var4_4.J((sEa)null, rta.n, Ega.J((int)uSa.E, (int)var4_4.o), tTa.h);
                v8 = var7_9 = var4_4.a.iterator();
                while (v8.hasNext()) {
                    var9_12 = var7_9.next();
                    v8 = var7_9;
                    v9 = var9_12;
                    var4_4.J(v9, v9.I, Ega.J((int)vRa.d, (int)var4_4.o), tTa.h);
                }
                var4_4.J((sEa)null, rta.n, Ega.J((int)uqa.g, (int)var4_4.o), tTa.h);
                v2 = var4_4;
                break block20;
            }
            if (var4_4.g.c.K.J() == null) ** GOTO lbl93
            if (a == var4_4.g.z.I.getKeyCode() + ySa.T) {
                v10 = var4_4;
                v2 = v10;
                v10.J(d, var8_10, (int)a, yRa.d);
            } else {
                v11 = var7_7 = var8_10 != rta.n && (Keyboard.isKeyDown(cQa.i) != false || Keyboard.isKeyDown(GPa.C) != false) ? vRa.d : uSa.E;
                if (var7_7 != 0) {
                    var4_4.A = d != null && d.J() != false ? d.J() : null;
                }
                var4_4.J(d, var8_10, (int)a, var7_7 != 0 ? vRa.d : uSa.E);
lbl93:
                // 3 sources

                v2 = var4_4;
            }
        }
        if (v2.g.c.K.J() == null) {
            var4_4.g = nqa.i;
        }
        var4_4.c = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(sEa sEa2, int n2, int n3, int n4) {
        void a2;
        void b2;
        void d2;
        int e2 = n2;
        Ama_3 c2 = this;
        if (d2 != null) {
            e2 = d2.I;
        }
        c2.g.L.J(c2.I.k, e2, (int)b2, (int)a2, (Sx)c2.g.c);
    }

    private void J() {
        Ama_3 ama_3 = this;
        Mda mda2 = ama_3.g.c.K.J();
        if (mda2 != null && ama_3.c) {
            Iterator<sEa> iterator;
            ama_3.K = mda2.E;
            Iterator<sEa> iterator2 = iterator = ama_3.a.iterator();
            while (iterator2.hasNext()) {
                sEa sEa2 = iterator.next();
                Ama_3 a2 = mda2.J();
                int n2 = sEa2.J() == null ? uSa.E : sEa2.J().E;
                Ama_3 ama_32 = ama_3;
                Ama_3 ama_33 = a2;
                Ega.J(ama_32.a, (int)ama_32.o, (Mda)ama_33, (int)n2);
                if (((Mda)ama_33).E > a2.e()) {
                    ((Mda)a2).E = a2.e();
                }
                if (((Mda)a2).E > sEa2.J((Mda)a2)) {
                    ((Mda)a2).E = sEa2.J((Mda)a2);
                }
                ama_3.K -= ((Mda)a2).E - n2;
                iterator2 = iterator;
            }
        }
    }

    public void l() {
        Ama_3 a2;
        Ama_3 ama_3 = a2;
        super.l();
        if (!ama_3.g.c.K() || a2.g.c.J) {
            a2.g.c.r();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void J(int var1_2, int var2_3, int var3_4) throws IOException {
        block18: {
            block17: {
                d = var3_4;
                a = this;
                super.J(c, b, d);
                var4_6 = d == a.g.z.I.getKeyCode() + ySa.T ? vRa.d : uSa.E;
                v0 = a;
                var5_7 = v0.J(c, b);
                var6_8 = Kpa.J();
                v0.L = v0.M == var5_7 && var6_8 - a.g < DPa.o && a.E == d ? vRa.d : uSa.E;
                a.J = uSa.E;
                if (d != 0 && d != vRa.d && var4_6 == 0) ** GOTO lbl72
                v1 = a;
                var4_6 = v1.e;
                var8_9 = v1.v;
                var9_10 = c < var4_6 || b < var8_9 || c >= var4_6 + a.j || b >= var8_9 + a.F ? vRa.d : uSa.E;
                c = pua.o;
                if (var5_7 != null) {
                    c = var5_7.I;
                }
                if (var9_10 != 0) {
                    c = rta.n;
                }
                if (a.g.z.tb && var9_10 != 0 && a.g.c.K.J() == null) {
                    a.g.J((EC)null);
                    return;
                }
                if (c == pua.o) ** GOTO lbl72
                if (!a.g.z.tb) break block17;
                if (var5_7 != null && var5_7.J()) {
                    v2 = a;
                    a.b = var5_7;
                    v2.k = null;
                    v2.l = d == vRa.d ? vRa.d : uSa.E;
                    v3 = a;
                } else {
                    v3 = a;
                    a.b = null;
                }
                break block18;
            }
            if (a.c) ** GOTO lbl72
            if (a.g.c.K.J() == null) {
                if (d == a.g.z.I.getKeyCode() + ySa.T) {
                    v4 = a;
                    v5 = v4;
                    v4.J(var5_7, c, d, yRa.d);
                } else {
                    b = c != rta.n && (Keyboard.isKeyDown(cQa.i) != false || Keyboard.isKeyDown(GPa.C) != false) ? vRa.d : uSa.E;
                    var4_6 = uSa.E;
                    if (b != 0) {
                        a.A = var5_7 != null && var5_7.J() != false ? var5_7.J() : null;
                        var4_6 = vRa.d;
                        v6 = a;
                    } else {
                        if (c == rta.n) {
                            var4_6 = AQa.P;
                        }
                        v6 = a;
                    }
                    v6.J(var5_7, c, d, var4_6);
                    v5 = a;
                }
                v5.J = vRa.d;
                v3 = a;
            } else {
                v7 = a;
                v7.c = vRa.d;
                v7.B = d;
                a.a.clear();
                if (d == 0) {
                    v3 = a;
                    a.o = uSa.E;
                } else if (d == vRa.d) {
                    v3 = a;
                    a.o = vRa.d;
                } else {
                    if (d == a.g.z.I.getKeyCode() + ySa.T) {
                        a.o = uqa.g;
                    }
lbl72:
                    // 6 sources

                    v3 = a;
                }
            }
        }
        v3.M = var5_7;
        v8 = a;
        v8.g = var6_8;
        v8.E = d;
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        Ama_3 a2 = this;
        if (c3 == vRa.d || c3 == a2.g.z.xc.getKeyCode()) {
            a2.g.c.r();
        }
        Ama_3 ama_3 = a2;
        ama_3.d(c3);
        if (ama_3.f != null && a2.f.J()) {
            if (c3 == a2.g.z.I.getKeyCode()) {
                Ama_3 ama_32 = a2;
                ama_32.J(a2.f, ama_32.f.I, uSa.E, yRa.d);
                return;
            }
            if (c3 == a2.g.z.ub.getKeyCode()) {
                Ama_3 ama_33 = a2;
                ama_33.J(a2.f, ama_33.f.I, Ama_3.C() ? vRa.d : uSa.E, AQa.P);
            }
        }
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        Ama_3 ama_3 = this;
    }

    public Ama_3(Ega ega2) {
        Ama_3 a2;
        Ama_3 b2 = ega2;
        Ama_3 ama_3 = a2 = this;
        a2.j = MTa.U;
        a2.F = UTa.R;
        ama_3.a = Sets.newHashSet();
        ama_3.I = b2;
        ama_3.J = vRa.d;
    }

    public abstract void J(float var1, int var2, int var3);

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void J(int n2, int n3, int n4, long l2) {
        void c22;
        Ama_3 d2;
        int e22 = n2;
        Ama_3 ama_3 = d2 = this;
        sEa e22 = ama_3.J(e22, (int)c22);
        Mda c22 = ama_3.g.c.K.J();
        if (ama_3.b != null && d2.g.z.tb) {
            void b2;
            if (b2 != false && b2 != vRa.d) return;
            if (d2.k == null) {
                if (e22 == d2.b || d2.b.J() == null) return;
                d2.k = d2.b.J().J();
                return;
            }
            if (d2.k.E <= vRa.d || e22 == null || !Ega.J((sEa)e22, (Mda)d2.k, uSa.E != 0)) return;
            long l3 = Kpa.J();
            if (d2.h == e22) {
                if (l3 - d2.H <= zsa.R) return;
                Ama_3 ama_32 = d2;
                sEa sEa2 = e22;
                Ama_3 ama_33 = d2;
                Ama_3 ama_34 = d2;
                ama_33.J(ama_34.b, ama_34.b.I, uSa.E, uSa.E);
                ama_33.J(sEa2, sEa2.I, vRa.d, uSa.E);
                ama_32.J(ama_33.b, d2.b.I, uSa.E, uSa.E);
                ama_32.H = l3 + Gta.N;
                ama_32.k.E -= vRa.d;
                return;
            }
            d2.h = e22;
            d2.H = l3;
            return;
        }
        if (!d2.c || e22 == null || c22 == null || c22.E <= d2.a.size() || !Ega.J((sEa)e22, (Mda)c22, vRa.d != 0) || !e22.J(c22) || !d2.I.J(e22)) return;
        d2.a.add(e22);
        d2.J();
    }

    /*
     * WARNING - void declaration
     */
    private sEa J(int n2, int n3) {
        int n4;
        Ama_3 ama_3 = this;
        int n5 = n4 = uSa.E;
        while (n5 < ama_3.I.A.size()) {
            void a2;
            void b2;
            Object c2 = (sEa)ama_3.I.A.get(n4);
            if (ama_3.J((sEa)c2, (int)b2, (int)a2)) {
                return c2;
            }
            n5 = ++n4;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void c2;
        void g2;
        void e2;
        void d2;
        void b2;
        void f2;
        Ama_3 a2;
        int n8 = n7;
        Ama_3 ama_3 = a2 = this;
        int n9 = ama_3.e;
        int n10 = ama_3.v;
        if ((b2 -= n9) >= f2 - vRa.d && b2 < f2 + d2 + vRa.d && (g2 -= n10) >= e2 - vRa.d && g2 < e2 + c2 + vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

