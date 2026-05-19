/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Cra
 *  EC
 *  ERa
 *  Epa
 *  Fpa
 *  JPa
 *  KA
 *  Kpa
 *  LQa
 *  NTa
 *  Qta
 *  Sqa
 *  Ssa
 *  Usa
 *  Wc
 *  Xia
 *  Yma
 *  Zta
 *  ld
 *  lqa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 */
import java.util.List;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Xia_1
implements Wc {
    public final Yma M;
    private static final ld k;
    private static final ld j;
    public final Kpa J;
    private static final ResourceLocation A;
    private static final ld I;

    public Xia_1(Yma yma2) {
        Xia_1 b2 = yma2;
        Xia_1 a2 = this;
        a2.M = b2;
        a2.J = Kpa.J();
    }

    public boolean d() {
        Xia_1 a2;
        return a2.M.J((Xia)a2);
    }

    /*
     * Unable to fully structure code
     */
    public void J(int var1_2, int var2_3, int var3_4, int var4_6, int var5_8, int var6_10, int var7_11, boolean var8_12) {
        block15: {
            block14: {
                i = var3_4;
                f = this;
                h = f.J();
                if (h != vRa.d) {
                    uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                    KA.J((int)(g - vRa.d), (int)(i - vRa.d), (int)(g + e - WOa.fa), (int)(i + d + vRa.d), (int)gua.y);
                }
                v0 = f;
                v1 = f;
                v1.J();
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                KA.J((int)g, (int)i, (float)JPa.N, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Ura.m, (float)Ura.m);
                e = v0.f();
                d = v1.J();
                if (!v0.J.z.tb && a == false || !f.l()) ** GOTO lbl59
                f.J.J().J(Xia_1.A);
                v2 = g;
                KA.J((int)v2, (int)i, (int)(v2 + fPa.i), (int)(i + fPa.i), (int)Zta.ca);
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                var9_13 = c - g;
                var10_14 = b - i;
                if (h < vRa.d) {
                    e = Xia_1.I.l();
                    d = Xia_1.k.l();
                    v3 = f;
                } else {
                    if (h > vRa.d) {
                        e = Xia_1.I.l();
                        d = Xia_1.j.l();
                    }
                    v3 = f;
                }
                if (!v3.f()) break block14;
                if (var9_13 < fPa.i) {
                    KA.J((int)g, (int)i, (float)JPa.N, (float)Ura.m, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                    v4 = f;
                } else {
                    KA.J((int)g, (int)i, (float)JPa.N, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                    v4 = f;
                }
                break block15;
            }
            if (!f.d()) ** GOTO lbl45
            if (var9_13 < ERa.C) {
                KA.J((int)g, (int)i, (float)Ura.m, (float)Ura.m, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                v5 = f;
            } else {
                KA.J((int)g, (int)i, (float)Ura.m, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
lbl45:
                // 2 sources

                v5 = f;
            }
            if (!v5.J()) ** GOTO lbl52
            if (var9_13 < fPa.i && var9_13 > ERa.C && var10_14 < ERa.C) {
                KA.J((int)g, (int)i, (float)Sqa.Ja, (float)Ura.m, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                v6 = f;
            } else {
                KA.J((int)g, (int)i, (float)Sqa.Ja, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
lbl52:
                // 2 sources

                v6 = f;
            }
            if (!v6.C()) ** GOTO lbl59
            if (var9_13 < fPa.i && var9_13 > ERa.C && var10_14 > ERa.C) {
                KA.J((int)g, (int)i, (float)EPa.r, (float)Ura.m, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                v4 = f;
            } else {
                KA.J((int)g, (int)i, (float)EPa.r, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
lbl59:
                // 3 sources

                v4 = f;
            }
        }
        var9_13 = v4.J.Ea.J(e);
        if (var9_13 > Epa.ja) {
            e = new StringBuilder().insert(5 >> 3, f.J.Ea.J(e, Epa.ja - f.J.Ea.J(Usa.E))).append(Usa.E).toString();
        }
        f.J.Ea.J(e, (float)(g + fPa.i + uqa.g), (float)(i + vRa.d), pua.o);
        var10_15 = f.J.Ea.J(d, Epa.ja);
        h = uSa.E;
        v7 = h;
        while (v7 < uqa.g && h < var10_15.size()) {
            v8 = (String)var10_15.get(h);
            v9 = i + lqa.s + NTa.C * h;
            f.J.Ea.J(v8, (float)(g + fPa.i + uqa.g), (float)v9, Qta.L);
            v7 = ++h;
        }
    }

    public boolean C() {
        Xia_1 xia_1 = this;
        List list = xia_1.M.J((Xia)xia_1);
        int a2 = list.indexOf(xia_1);
        if (a2 >= 0 && a2 < list.size() - vRa.d && ((Xia_1)list.get(a2 + vRa.d)).l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n7;
        Xia_1 a2 = this;
    }

    public void J(int n2, int n3, int n4) {
        int d2 = n4;
        Xia_1 xia_1 = this;
    }

    static {
        A = new ResourceLocation(Ura.R);
        I = new CZ(STa.Y, new Object[uSa.E]);
        k = new CZ(Qra.F, new Object[uSa.E]);
        j = new CZ(LQa.Fa, new Object[uSa.E]);
    }

    public abstract void J();

    public abstract int J();

    public boolean l() {
        return vRa.d != 0;
    }

    public boolean f() {
        Xia_1 a2;
        if (!a2.M.J((Xia)a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract String f();

    public boolean J() {
        Xia_1 xia_1 = this;
        List list = xia_1.M.J((Xia)xia_1);
        int a2 = list.indexOf(xia_1);
        if (a2 > 0 && ((Xia_1)list.get(a2 - vRa.d)).l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void b2;
        int g2 = n2;
        Xia_1 f2 = this;
        if (f2.l() && b2 <= fPa.i) {
            int e22;
            void a2;
            if (f2.f()) {
                Xia_1 xia_1 = f2;
                xia_1.M.J();
                g2 = xia_1.J();
                if (g2 != vRa.d) {
                    String e22 = oha.J(Cra.a, new Object[uSa.E]);
                    String d2 = oha.J(new StringBuilder().insert(5 >> 3, DPa.D).append(g2 > vRa.d ? Ssa.ha : WRa.Y).toString(), new Object[uSa.E]);
                    f2.J.J((EC)new Vma(new KGa((Xia)f2), e22, d2, uSa.E));
                } else {
                    f2.M.J((Xia)f2).remove(f2);
                    f2.M.f().add(uSa.E, f2);
                }
                return vRa.d != 0;
            }
            if (b2 < ERa.C && f2.d()) {
                f2.M.J((Xia)f2).remove(f2);
                Xia_1 xia_1 = f2;
                f2.M.J().add(uSa.E, xia_1);
                xia_1.M.J();
                return vRa.d != 0;
            }
            if (b2 > ERa.C && a2 < ERa.C && f2.J()) {
                List list = g2 = f2.M.J((Xia)f2);
                e22 = list.indexOf(f2);
                list.remove(f2);
                Xia_1 xia_1 = f2;
                g2.add(e22 - vRa.d, xia_1);
                xia_1.M.J();
                return vRa.d != 0;
            }
            if (b2 > ERa.C && a2 > ERa.C && f2.C()) {
                List list = g2 = f2.M.J((Xia)f2);
                e22 = list.indexOf(f2);
                list.remove(f2);
                Xia_1 xia_1 = f2;
                g2.add(e22 + vRa.d, xia_1);
                xia_1.M.J();
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public abstract String J();
}

