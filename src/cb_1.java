/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  KA
 *  Kpa
 *  Lra
 *  Oz
 *  XTa
 *  aKa
 *  aSa
 *  ac
 *  fTa
 *  kpa
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 *  ysa
 */
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class cb_1 {
    public int c;
    public final Kpa B;
    public int d;
    public long a;
    public boolean b;
    public boolean l;
    public boolean e;
    public int G;
    public final int D;
    private int f;
    public int F;
    public int g;
    public int L;
    public int E;
    public boolean m;
    private int C;
    public float i;
    public int M;
    public int k;
    public float j;
    public int J;
    public int A;
    private boolean I;

    public abstract void l();

    public void J(int n2, int n3, pKa object) {
        cb_1 d2 = object;
        object = this;
    }

    public void f(int n2) {
        int b2 = n2;
        cb_1 a2 = this;
        a2.A = b2;
        a2.g = a2.A + a2.E;
    }

    public abstract void J(int var1, boolean var2, int var3, int var4);

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        void a2;
        cb_1 b2;
        boolean c2 = bl;
        cb_1 cb_12 = b2 = this;
        cb_12.m = c2;
        cb_12.G = a2;
        if (!c2) {
            b2.G = uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void l(int n2, int n3) {
        void b2;
        cb_1 a2;
        int c2 = n3;
        cb_1 cb_12 = a2 = this;
        cb_12.C = b2;
        cb_12.f = c2;
    }

    public void J(int n2) {
        cb_1 a2;
        int b2 = n2;
        cb_1 cb_12 = a2 = this;
        cb_12.i += (float)b2;
        cb_12.J();
        cb_12.c = rQa.p;
    }

    public int M() {
        cb_1 a2;
        return a2.E / uqa.g + cPa.Ea;
    }

    public void f(int n2, int n3) {
        int c2 = n3;
        cb_1 cb_12 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void l(int n2, int n3, int n4, int n5) {
        int n6;
        cb_1 cb_12 = this;
        int n7 = cb_12.e();
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        int n8 = n6 = uSa.E;
        while (n8 < n7) {
            void a2;
            void b2;
            void d2;
            void c2;
            void e2 = c2 + n6 * cb_12.D + cb_12.G;
            int n9 = cb_12.D - AQa.P;
            if (e2 > cb_12.J || e2 + n9 < cb_12.M) {
                cb_12.J(n6, (int)d2, (int)e2);
            }
            if (cb_12.l && cb_12.f(n6)) {
                cb_1 cb_13 = cb_12;
                int n10 = cb_13.A + (cb_13.E / uqa.g - cb_12.l() / uqa.g);
                int n11 = cb_13.A + cb_12.E / uqa.g + cb_12.l() / uqa.g;
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                uKa.z();
                aKa aKa3 = aKa2;
                int n12 = n11;
                aKa aKa4 = aKa2;
                aKa aKa5 = aKa2;
                aKa aKa6 = aKa2;
                aKa6.J(XTa.W, mka.a);
                aKa6.J((double)n10, (double)(e2 + n9 + uqa.g), aSa.V).J(aSa.V, oua.i).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                aKa5.J((double)n11, (double)(e2 + n9 + uqa.g), aSa.V).J(oua.i, oua.i).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                aKa5.J((double)n11, (double)(e2 - uqa.g), aSa.V).J(oua.i, aSa.V).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                aKa4.J((double)n10, (double)(e2 - uqa.g), aSa.V).J(aSa.V, aSa.V).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                aKa4.J((double)(n10 + vRa.d), (double)(e2 + n9 + vRa.d), aSa.V).J(aSa.V, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa2.J((double)(n12 - vRa.d), (double)(e2 + n9 + vRa.d), aSa.V).J(oua.i, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa3.J((double)(n12 - vRa.d), (double)(e2 - vRa.d), aSa.V).J(oua.i, aSa.V).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa3.J((double)(n10 + vRa.d), (double)(e2 - vRa.d), aSa.V).J(aSa.V, aSa.V).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                pKa2.J();
                uKa.H();
            }
            cb_12.J(n6++, (int)d2, (int)e2, n9, (int)b2, (int)a2);
            n8 = n6;
        }
    }

    public abstract boolean f(int var1);

    /*
     * Unable to fully structure code
     */
    public void f() {
        block19: {
            block22: {
                block20: {
                    block21: {
                        v0 = var1_4 = this;
                        if (!v0.J(v0.F)) break block19;
                        if (Mouse.getEventButton() == 0 && Mouse.getEventButtonState()) {
                            v1 = var1_4;
                            if (v1.F >= v1.M) {
                                v2 = var1_4;
                                if (v2.F <= v2.J) {
                                    v3 = var1_4;
                                    v4 = var1_4;
                                    a = (v3.E - v4.l()) / uqa.g;
                                    var2_5 = (v3.E + var1_4.l()) / uqa.g;
                                    var3_6 = v4.F - var1_4.M - var1_4.G + (int)var1_4.i - AQa.P;
                                    var4_7 = var3_6 / var1_4.D;
                                    if (var4_7 < var1_4.e() && var1_4.k >= a && var1_4.k <= var2_5 && var4_7 >= 0 && var3_6 >= 0) {
                                        v5 = var1_4;
                                        var1_4.J(var4_7, (boolean)uSa.E, v5.k, v5.F);
                                        var1_4.d = var4_7;
                                    } else if (var1_4.k >= a && var1_4.k <= var2_5 && var3_6 < 0) {
                                        v6 = var1_4;
                                        v6.J(var1_4.k - a, var1_4.F - v6.M + (int)var1_4.i - AQa.P);
                                    }
                                }
                            }
                        }
                        if (!Mouse.isButtonDown(uSa.E) || !var1_4.J()) break block20;
                        if (var1_4.c != pua.o) break block21;
                        a = vRa.d;
                        v7 = var1_4;
                        if (v7.F < v7.M) ** GOTO lbl-1000
                        v8 = var1_4;
                        if (v8.F <= v8.J) {
                            v9 = var1_4;
                            v10 = var1_4;
                            var2_5 = (v9.E - v10.l()) / uqa.g;
                            var3_6 = (v9.E + var1_4.l()) / uqa.g;
                            var4_7 = v10.F - var1_4.M - var1_4.G + (int)var1_4.i - AQa.P;
                            var5_8 = var4_7 / var1_4.D;
                            if (var5_8 < var1_4.e() && var1_4.k >= var2_5 && var1_4.k <= var3_6 && var5_8 >= 0 && var4_7 >= 0) {
                                var6_9 = var5_8 == var1_4.d && Kpa.J() - var1_4.a < DPa.o ? vRa.d : uSa.E;
                                v11 = var1_4;
                                v12 = var1_4;
                                var1_4.J(var5_8, (boolean)var6_9, v12.k, v12.F);
                                var1_4.d = var5_8;
                                var1_4.a = Kpa.J();
                            } else {
                                if (var1_4.k >= var2_5 && var1_4.k <= var3_6 && var4_7 < 0) {
                                    v13 = var1_4;
                                    v13.J(var1_4.k - var2_5, var1_4.F - v13.M + (int)var1_4.i - AQa.P);
                                    a = uSa.E;
                                }
                                v11 = var1_4;
                            }
                            var6_9 = v11.M();
                            var2_5 = var6_9 + uua.p;
                            if (var1_4.k >= var6_9 && var1_4.k <= var2_5) {
                                var1_4.j = vqa.T;
                                var2_5 = var1_4.d();
                                if (var2_5 < vRa.d) {
                                    var2_5 = vRa.d;
                                }
                                v14 = var1_4;
                                v15 = var1_4;
                                var3_6 = (int)((float)((v14.J - v14.M) * (v15.J - v15.M)) / (float)var1_4.C());
                                v16 = var1_4;
                                var3_6 = Oz.f((int)var3_6, (int)fPa.i, (int)(v16.J - v16.M - Yqa.i));
                                v17 = var1_4;
                                v14.j /= (float)(v17.J - v17.M - var3_6) / (float)var2_5;
                                v18 = a;
                            } else {
                                var1_4.j = pqa.r;
                                v18 = a;
                            }
                            var1_4.c = v18 != 0 ? var1_4.F : rQa.p;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_4.c = rQa.p;
                        }
                        break block22;
                    }
                    if (var1_4.c >= 0) {
                        v19 = var1_4;
                        var1_4.i -= (float)(v19.F - var1_4.c) * var1_4.j;
                        var1_4.c = v19.F;
                    }
                    break block22;
                }
                var1_4.c = pua.o;
            }
            a = Mouse.getEventDWheel();
            if (a != 0) {
                if (a > 0) {
                    a = pua.o;
                    v20 = var1_4;
                } else {
                    if (a < 0) {
                        a = vRa.d;
                    }
                    v20 = var1_4;
                }
                v20.i += (float)(a * var1_4.D / uqa.g);
            }
        }
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        cb_1 cb_12 = this;
    }

    public void J(int n2, int n3, int n4) {
        int d2 = n4;
        cb_1 cb_12 = this;
    }

    public abstract int e();

    public boolean J() {
        cb_1 a2;
        return a2.I;
    }

    public int d() {
        cb_1 a2;
        cb_1 cb_12 = a2;
        return Math.max(uSa.E, a2.C() - (cb_12.J - cb_12.M - AQa.P));
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        cb_1 a2 = this;
        a2.l = b2;
    }

    public int C() {
        cb_1 a2;
        return a2.e() * a2.D + a2.G;
    }

    public int l() {
        return fTa.Ja;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4, int n5) {
        void b2;
        void d2;
        void a2;
        void c2;
        cb_1 cb_12 = this;
        pKa pKa2 = pKa.J();
        cb_1 e2 = pKa2.J();
        cb_12.B.J().J(KA.J);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        cb_1 cb_13 = e2;
        cb_1 cb_14 = e2;
        cb_1 cb_15 = cb_12;
        e2.J(XTa.W, mka.a);
        cb_14.J(cb_15.A, (double)c2, aSa.V).J(aSa.V, (double)((float)c2 / Ura.m)).J(ysa.s, ysa.s, ysa.s, (int)a2).M();
        cb_1 cb_16 = cb_12;
        cb_14.J(cb_15.A + cb_16.E, (double)c2, aSa.V).J((double)((float)cb_12.E / Ura.m), (double)((float)c2 / Ura.m)).J(ysa.s, ysa.s, ysa.s, (int)a2).M();
        cb_13.J(cb_16.A + cb_12.E, (double)d2, aSa.V).J((double)((float)cb_12.E / Ura.m), (double)((float)d2 / Ura.m)).J(ysa.s, ysa.s, ysa.s, (int)b2).M();
        cb_13.J(cb_12.A, (double)d2, aSa.V).J(aSa.V, (double)((float)d2 / Ura.m)).J(ysa.s, ysa.s, ysa.s, (int)b2).M();
        pKa2.J();
    }

    public boolean J(int n2) {
        int b2 = n2;
        cb_1 a2 = this;
        if (b2 >= a2.M && b2 <= a2.J) {
            cb_1 cb_12 = a2;
            if (cb_12.k >= cb_12.A) {
                cb_1 cb_13 = a2;
                if (cb_13.k <= cb_13.g) {
                    return vRa.d != 0;
                }
            }
        }
        return uSa.E != 0;
    }

    public int f() {
        cb_1 a2;
        return (int)a2.i;
    }

    public void J(ac ac2) {
        cb_1 b2 = ac2;
        cb_1 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == a2.C) {
                cb_1 cb_12 = a2;
                cb_12.i -= (float)(a2.D * uqa.g / yRa.d);
                a2.c = rQa.p;
                cb_12.J();
                return;
            }
            if (((ac)b2).C == a2.f) {
                cb_1 cb_13 = a2;
                cb_13.i += (float)(a2.D * uqa.g / yRa.d);
                a2.c = rQa.p;
                cb_13.J();
            }
        }
    }

    public abstract void J(int var1, int var2, int var3, int var4, int var5, int var6);

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3) {
        void b2;
        void a2;
        cb_1 cb_12;
        cb_1 cb_13 = cb_12 = this;
        cb_1 cb_14 = cb_12;
        int n4 = cb_13.A + cb_13.E / uqa.g - cb_14.l() / uqa.g;
        int n5 = cb_14.A + cb_12.E / uqa.g + cb_12.l() / uqa.g;
        a2 = a2 - cb_12.M - cb_12.G + (int)cb_12.i - AQa.P;
        void c2 = a2 / cb_12.D;
        if (b2 < cb_12.M() && b2 >= n4 && b2 <= n5 && c2 >= 0 && a2 >= 0 && c2 < cb_12.e()) {
            return (int)c2;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        cb_1 cb_12 = this;
        if (cb_12.e) {
            void b2;
            void c2;
            cb_1 cb_13 = cb_12;
            cb_12.k = c2;
            cb_13.F = b2;
            cb_12.l();
            int a2 = cb_13.M();
            int n4 = a2 + uua.p;
            cb_13.J();
            uKa.L();
            uKa.I();
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            cb_13.B.J().J(KA.J);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            float d22 = Ura.m;
            aKa aKa3 = aKa2;
            aKa aKa4 = aKa2;
            aKa2.J(XTa.W, mka.a);
            cb_1 cb_14 = cb_12;
            cb_1 cb_15 = cb_12;
            aKa4.J((double)cb_12.A, (double)cb_12.J, aSa.V).J((double)((float)cb_14.A / d22), (double)((float)(cb_15.J + (int)cb_15.i) / d22)).J(fPa.i, fPa.i, fPa.i, osa.Ja).M();
            cb_1 cb_16 = cb_12;
            cb_1 cb_17 = cb_12;
            aKa4.J((double)cb_14.g, (double)cb_12.J, aSa.V).J((double)((float)cb_16.g / d22), (double)((float)(cb_17.J + (int)cb_17.i) / d22)).J(fPa.i, fPa.i, fPa.i, osa.Ja).M();
            cb_1 cb_18 = cb_12;
            aKa3.J((double)cb_16.g, (double)cb_12.M, aSa.V).J((double)((float)cb_12.g / d22), (double)((float)(cb_18.M + (int)cb_18.i) / d22)).J(fPa.i, fPa.i, fPa.i, osa.Ja).M();
            cb_1 cb_19 = cb_12;
            aKa3.J((double)cb_12.A, (double)cb_12.M, aSa.V).J((double)((float)cb_12.A / d22), (double)((float)(cb_19.M + (int)cb_19.i) / d22)).J(fPa.i, fPa.i, fPa.i, osa.Ja).M();
            pKa2.J();
            int d22 = cb_13.A + cb_12.E / uqa.g - cb_12.l() / uqa.g + uqa.g;
            int n5 = cb_13.M + AQa.P - (int)cb_12.i;
            if (cb_13.m) {
                cb_12.J(d22, n5, pKa2);
            }
            cb_1 cb_110 = cb_12;
            cb_110.l(d22, n5, (int)c2, (int)b2);
            uKa.u();
            d22 = AQa.P;
            cb_1 cb_111 = cb_12;
            cb_110.f(uSa.E, cb_111.M, osa.Ja, osa.Ja);
            cb_110.f(cb_111.J, cb_12.L, osa.Ja, osa.Ja);
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)uSa.E, (int)vRa.d);
            uKa.c();
            uKa.F((int)gua.X);
            uKa.z();
            aKa aKa5 = aKa2;
            cb_1 cb_112 = cb_12;
            aKa aKa6 = aKa2;
            aKa aKa7 = aKa2;
            cb_1 cb_113 = cb_12;
            aKa aKa8 = aKa2;
            aKa8.J(XTa.W, mka.a);
            aKa8.J((double)cb_12.A, (double)(cb_12.M + d22), aSa.V).J(aSa.V, oua.i).J(uSa.E, uSa.E, uSa.E, uSa.E).M();
            aKa2.J((double)cb_113.g, (double)(cb_12.M + d22), aSa.V).J(oua.i, oua.i).J(uSa.E, uSa.E, uSa.E, uSa.E).M();
            aKa7.J((double)cb_113.g, (double)cb_12.M, aSa.V).J(oua.i, aSa.V).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
            aKa7.J((double)cb_12.A, (double)cb_12.M, aSa.V).J(aSa.V, aSa.V).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
            pKa2.J();
            aKa6.J(XTa.W, mka.a);
            aKa6.J((double)cb_12.A, (double)cb_12.J, aSa.V).J(aSa.V, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
            aKa2.J((double)cb_112.g, (double)cb_12.J, aSa.V).J(oua.i, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
            aKa5.J((double)cb_112.g, (double)(cb_12.J - d22), aSa.V).J(oua.i, aSa.V).J(uSa.E, uSa.E, uSa.E, uSa.E).M();
            aKa5.J((double)cb_12.A, (double)(cb_12.J - d22), aSa.V).J(aSa.V, aSa.V).J(uSa.E, uSa.E, uSa.E, uSa.E).M();
            pKa2.J();
            d22 = cb_12.d();
            if (d22 > 0) {
                cb_1 cb_114 = cb_12;
                cb_1 cb_115 = cb_12;
                n5 = (cb_114.J - cb_114.M) * (cb_12.J - cb_115.M) / cb_12.C();
                cb_1 cb_116 = cb_12;
                n5 = Oz.f((int)n5, (int)fPa.i, (int)(cb_116.J - cb_116.M - Yqa.i));
                cb_1 cb_117 = cb_12;
                if ((d22 = (int)cb_115.i * (cb_117.J - cb_117.M - n5) / d22 + cb_12.M) < cb_12.M) {
                    d22 = cb_12.M;
                }
                aKa aKa9 = aKa2;
                aKa aKa10 = aKa2;
                aKa aKa11 = aKa2;
                int n6 = n4;
                aKa aKa12 = aKa2;
                aKa aKa13 = aKa2;
                int n7 = n4;
                aKa aKa14 = aKa2;
                aKa14.J(XTa.W, mka.a);
                aKa14.J((double)a2, (double)cb_12.J, aSa.V).J(aSa.V, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa2.J((double)n7, (double)cb_12.J, aSa.V).J(oua.i, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa13.J((double)n7, (double)cb_12.M, aSa.V).J(oua.i, aSa.V).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa13.J((double)a2, (double)cb_12.M, aSa.V).J(aSa.V, aSa.V).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                pKa2.J();
                aKa12.J(XTa.W, mka.a);
                aKa12.J((double)a2, (double)(d22 + n5), aSa.V).J(aSa.V, oua.i).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                aKa2.J((double)n6, (double)(d22 + n5), aSa.V).J(oua.i, oua.i).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                aKa11.J((double)n6, (double)d22, aSa.V).J(oua.i, aSa.V).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                aKa11.J((double)a2, (double)d22, aSa.V).J(aSa.V, aSa.V).J(XOa.h, XOa.h, XOa.h, osa.Ja).M();
                pKa2.J();
                aKa10.J(XTa.W, mka.a);
                aKa10.J((double)a2, (double)(d22 + n5 - vRa.d), aSa.V).J(aSa.V, oua.i).J(ppa.f, ppa.f, ppa.f, osa.Ja).M();
                aKa9.J((double)(n4 - vRa.d), (double)(d22 + n5 - vRa.d), aSa.V).J(oua.i, oua.i).J(ppa.f, ppa.f, ppa.f, osa.Ja).M();
                aKa9.J((double)(n4 - vRa.d), (double)d22, aSa.V).J(oua.i, aSa.V).J(ppa.f, ppa.f, ppa.f, osa.Ja).M();
                aKa2.J((double)a2, (double)d22, aSa.V).J(aSa.V, aSa.V).J(ppa.f, ppa.f, ppa.f, osa.Ja).M();
                pKa2.J();
            }
            cb_12.f((int)c2, (int)b2);
            uKa.H();
            uKa.F((int)Zra.f);
            uKa.K();
            uKa.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        cb_1 d2;
        int e2 = n2;
        cb_1 cb_12 = d2 = this;
        cb_1 cb_13 = d2;
        d2.E = e2;
        cb_13.L = c2;
        cb_13.M = b2;
        cb_12.J = a2;
        cb_12.A = uSa.E;
        cb_12.g = e2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        cb_1 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public cb_1(Kpa kpa2, int n2, int n3, int n4, int n5, int n6) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        cb_1 e2;
        int g2 = n2;
        cb_1 cb_12 = e2 = this;
        cb_1 cb_13 = e2;
        cb_1 cb_14 = e2;
        cb_1 cb_15 = e2;
        e2.b = vRa.d;
        e2.c = rQa.p;
        e2.d = pua.o;
        e2.e = vRa.d;
        cb_15.l = vRa.d;
        cb_15.I = vRa.d;
        cb_15.B = f2;
        cb_14.E = g2;
        cb_14.L = d2;
        cb_13.M = c2;
        cb_13.J = b2;
        cb_12.D = a2;
        cb_12.A = uSa.E;
        cb_12.g = g2;
    }

    public int J() {
        cb_1 a2;
        return a2.D;
    }

    public void J() {
        cb_1 a2;
        a2.i = Oz.J((float)a2.i, (float)JPa.N, (float)a2.d());
    }
}

