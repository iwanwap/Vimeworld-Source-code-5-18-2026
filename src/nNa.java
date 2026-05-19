/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  CZ
 *  EC
 *  EQa
 *  ERa
 *  FPa
 *  JPa
 *  Kpa
 *  LQa
 *  Lra
 *  MQa
 *  NTa
 *  Oz
 *  QFa
 *  Qba
 *  RQa
 *  SOa
 *  SQa
 *  Spa
 *  TQa
 *  VQa
 *  WSa
 *  XTa
 *  Ypa
 *  Yra
 *  Ysa
 *  ac
 *  bpa
 *  bqa
 *  cQa
 *  cra
 *  fsa
 *  hra
 *  jpa
 *  kpa
 *  kta
 *  lqa
 *  nLa
 *  oqa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  qBa
 *  uKa
 *  uOa
 *  vRa
 *  wOa
 *  wb
 *  zf
 */
import java.io.IOException;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nNa
extends EC
implements wb {
    public double a;
    public double b;
    private static final int l = mY.M * osa.c - BRa.E;
    public double e;
    public int G;
    private static final int D;
    public int f;
    private boolean F;
    public float g;
    private static final int L;
    public double E;
    private int m;
    public int C;
    public double i;
    public EC M;
    public double k;
    private static final int j;
    public int J;
    private Laa A;
    private static final ResourceLocation I;

    public boolean J() {
        nNa a2;
        if (!a2.F) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        nNa a2;
        if (!a2.F) {
            nNa nNa2 = a2;
            nNa2.E = nNa2.e;
            nNa2.b = nNa2.a;
            double d2 = nNa2.i - a2.e;
            double d3 = nNa2.k - a2.a;
            double d4 = d2;
            double d5 = d3;
            if (d4 * d4 + d5 * d5 < FPa.T) {
                nNa nNa3 = a2;
                nNa3.e += d2;
                nNa3.a += d3;
                return;
            }
            nNa nNa4 = a2;
            nNa4.e += d2 * RQa.m;
            nNa4.a += d3 * RQa.m;
        }
    }

    public void f() {
        nNa a2;
        if (a2.F) {
            a2.F = uSa.E;
        }
    }

    public void J(ac ac2) throws IOException {
        nNa b2 = ac2;
        nNa a2 = this;
        if (!a2.F && ((ac)b2).C == vRa.d) {
            nNa nNa2 = a2;
            nNa2.g.J(nNa2.M);
        }
    }

    private KLa J(Block block) {
        Block b2 = block;
        nNa a2 = this;
        return Kpa.J().J().J().J(b2.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        nNa a2 = this;
        if (c3 == a2.g.z.xc.getKeyCode()) {
            a2.g.J((EC)null);
            a2.g.C();
            return;
        }
        super.J((char)b2, c3);
    }

    /*
     * WARNING - void declaration
     */
    public nNa(EC eC2, Laa laa) {
        void b22;
        nNa a2;
        Object c22 = laa;
        nNa nNa2 = a2 = this;
        a2.J = hra.Ja;
        a2.f = bqa.P;
        a2.g = pqa.r;
        a2.F = vRa.d;
        a2.M = b22;
        nNa2.A = c22;
        int b22 = SQa.i;
        int c22 = SQa.i;
        nNa2.e = a2.i = (double)(mY.q.displayColumn * osa.c - b22 / uqa.g - lqa.s);
        nNa2.E = a2.i;
        a2.a = a2.k = (double)(mY.q.displayRow * osa.c - c22 / uqa.g);
        a2.b = a2.k;
    }

    static {
        j = mY.Q * osa.c - BRa.E;
        L = mY.s * osa.c - uqa.b;
        D = mY.d * osa.c - uqa.b;
        I = new ResourceLocation(Eqa.V);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f(int var1_5, int var2_6, float var3_7) {
        block51: {
            block52: {
                v0 = var20_8 = this;
                var4_9 = Oz.f((double)(var20_8.E + (v0.e - var20_8.E) * (double)a));
                var5_10 = Oz.f((double)(v0.b + (var20_8.a - var20_8.b) * (double)a));
                if (var4_9 < nNa.l) {
                    var4_9 = nNa.l;
                }
                if (var5_10 < nNa.j) {
                    var5_10 = nNa.j;
                }
                if (var4_9 >= nNa.L) {
                    var4_9 = nNa.L - vRa.d;
                }
                if (var5_10 >= nNa.D) {
                    var5_10 = nNa.D - vRa.d;
                }
                v1 = var20_8;
                var6_11 = (var20_8.A - v1.J) / uqa.g;
                var7_12 = (v1.I - var20_8.f) / uqa.g;
                var8_13 = var6_11 + ERa.C;
                var9_14 = var7_12 + yta.Ka;
                var20_8.I = (ResourceLocation)JPa.N;
                uKa.I((int)uOa.w);
                uKa.e();
                uKa.J((float)((float)var8_13), (float)((float)var9_14), (float)SOa.n);
                uKa.l((float)(pqa.r / var20_8.g), (float)(pqa.r / var20_8.g), (float)JPa.N);
                uKa.H();
                uKa.L();
                uKa.o();
                uKa.a();
                var10_15 = var4_9 + fsa.E >> AQa.P;
                var11_16 = var5_10 + fsa.E >> AQa.P;
                var12_17 = (var4_9 + fsa.E) % ERa.C;
                var13_19 = (var5_10 + fsa.E) % ERa.C;
                var14_22 = new Random();
                var15_23 = Yra.i / var20_8.g;
                var16_24 = Yra.i / var20_8.g;
                v2 = var17_25 = uSa.E;
                while ((float)v2 * var15_23 - (float)var13_19 < jpa.P) {
                    var18_27 = Ora.D - (float)(var11_16 + var17_25) / sSa.E * bpa.K;
                    uKa.f((float)var18_27, (float)var18_27, (float)var18_27, (float)pqa.r);
                    v3 = uSa.E;
                    while ((float)v3 * var16_24 - (float)var12_17 < RQa.w) {
                        block40: {
                            block44: {
                                block38: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block39: {
                                                    v4 = var14_22;
                                                    v5 = var20_8;
                                                    v4.setSeed(v5.g.J().C().hashCode() + var10_15 + var19_30 + (var11_16 + var17_25) * ERa.C);
                                                    d = v4.nextInt(vRa.d + var11_16 + var17_25) + (var11_16 + var17_25) / uqa.g;
                                                    var21_32 = v5.J(QFa.R);
                                                    if (d > LQa.c || var11_16 + var17_25 == TQa.ca) break block38;
                                                    if (d != cQa.o) break block39;
                                                    if (var14_22.nextInt(uqa.g) == 0) {
                                                        v6 = var20_8;
                                                        v7 = v6;
                                                        var21_32 = v6.J(QFa.Ic);
                                                    } else {
                                                        v8 = var20_8;
                                                        v7 = v8;
                                                        var21_32 = v8.J(QFa.M);
                                                    }
                                                    break block40;
                                                }
                                                if (d != NTa.C) break block41;
                                                v9 = var20_8;
                                                v7 = v9;
                                                var21_32 = v9.J(QFa.b);
                                                break block40;
                                            }
                                            if (d != Yqa.i) break block42;
                                            v10 = var20_8;
                                            v7 = v10;
                                            var21_32 = v10.J(QFa.Za);
                                            break block40;
                                        }
                                        if (d <= AQa.P) break block43;
                                        v11 = var20_8;
                                        v7 = v11;
                                        var21_32 = v11.J(QFa.Gd);
                                        break block40;
                                    }
                                    if (d <= 0) break block44;
                                    v12 = var20_8;
                                    v7 = v12;
                                    var21_32 = v12.J(QFa.Bc);
                                    break block40;
                                }
                                var22_37 = QFa.bg;
                                var21_32 = var20_8.J(var22_37);
                            }
                            v7 = var20_8;
                        }
                        v7.g.J().J(WKa.C);
                        v13 = var19_30 * ERa.C - var12_17;
                        var20_8.J(v13, var17_25 * ERa.C - var13_19, var21_32, ERa.C, ERa.C);
                        v3 = ++var19_30;
                    }
                    v2 = ++var17_25;
                }
                uKa.J();
                uKa.I((int)Ira.A);
                var20_8.g.J().J(nNa.I);
                v14 = var17_25 = uSa.E;
                while (v14 < mY.m.size()) {
                    var18_28 = mY.m.get(var17_25);
                    if (var18_28.parentAchievement != null) {
                        v15 = var18_28;
                        var19_30 = v15.displayColumn * osa.c - var4_9 + pPa.f;
                        d = v15.displayRow * osa.c - var5_10 + pPa.f;
                        var21_34 = v15.parentAchievement.displayColumn * osa.c - var4_9 + pPa.f;
                        var22_38 = v15.parentAchievement.displayRow * osa.c - var5_10 + pPa.f;
                        v16 = var20_8;
                        var10_15 = (int)v16.A.f(var18_28);
                        var11_16 = (int)v16.A.J(var18_28);
                        var12_17 = v16.A.J(var18_28);
                        if (var12_17 <= AQa.P) {
                            var13_19 = gsa.X;
                            if (var10_15 != 0) {
                                var13_19 = gsa.Ga;
                                v17 = var20_8;
                            } else {
                                if (var11_16 != 0) {
                                    var13_19 = Ura.I;
                                }
                                v17 = var20_8;
                            }
                            v17.l(var19_30, var21_34, d, var13_19);
                            var20_8.f(var21_34, d, var22_38, var13_19);
                            if (var19_30 > var21_34) {
                                var20_8.f(var19_30 - pPa.f - XTa.W, d - tTa.h, WSa.o, Ysa.k, XTa.W, pPa.f);
                            } else if (var19_30 < var21_34) {
                                var20_8.f(var19_30 + pPa.f, d - tTa.h, jpa.E, Ysa.k, XTa.W, pPa.f);
                            } else if (d > var22_38) {
                                var20_8.f(var19_30 - tTa.h, d - pPa.f - XTa.W, zua.m, Ysa.k, pPa.f, XTa.W);
                            } else if (d < var22_38) {
                                var20_8.f(var19_30 - tTa.h, d + pPa.f, zua.m, Yqa.Da, pPa.f, XTa.W);
                            }
                        }
                    }
                    v14 = ++var17_25;
                }
                var17_26 = null;
                var18_29 = (float)(c - var8_13) * var20_8.g;
                var19_31 = (float)(b - var9_14) * var20_8.g;
                nLa.J();
                uKa.L();
                uKa.o();
                uKa.a();
                v18 = d = uSa.E;
                while (v18 < mY.m.size()) {
                    block45: {
                        block47: {
                            block50: {
                                block49: {
                                    block48: {
                                        block46: {
                                            var21_35 = mY.m.get(d);
                                            var22_39 = var21_35.displayColumn * osa.c - var4_9;
                                            var10_15 = var21_35.displayRow * osa.c - var5_10;
                                            if (var22_39 < Ata.la || var10_15 < Ata.la || !((float)var22_39 <= RQa.w * var20_8.g) || !((float)var10_15 <= jpa.P * var20_8.g)) break block45;
                                            v19 = var20_8;
                                            var11_16 = v19.A.J(var21_35);
                                            if (!v19.A.f(var21_35)) break block46;
                                            var12_18 = wOa.w;
                                            uKa.f((float)var12_18, (float)var12_18, (float)var12_18, (float)pqa.r);
                                            v20 = var20_8;
                                            break block47;
                                        }
                                        if (!var20_8.A.J(var21_35)) break block48;
                                        var12_18 = pqa.r;
                                        uKa.f((float)var12_18, (float)var12_18, (float)var12_18, (float)pqa.r);
                                        v20 = var20_8;
                                        break block47;
                                    }
                                    if (var11_16 >= yRa.d) break block49;
                                    var12_18 = bpa.K;
                                    uKa.f((float)var12_18, (float)var12_18, (float)var12_18, (float)pqa.r);
                                    v20 = var20_8;
                                    break block47;
                                }
                                if (var11_16 != yRa.d) break block50;
                                var12_18 = psa.N;
                                uKa.f((float)var12_18, (float)var12_18, (float)var12_18, (float)pqa.r);
                                v20 = var20_8;
                                break block47;
                            }
                            if (var11_16 != AQa.P) break block45;
                            var12_18 = Nra.e;
                            uKa.f((float)var12_18, (float)var12_18, (float)var12_18, (float)pqa.r);
                            v20 = var20_8;
                        }
                        v20.g.J().J(nNa.I);
                        v21 = var20_8;
                        if (var21_35.f()) {
                            v21.f(var22_39 - uqa.g, var10_15 - uqa.g, ITa.E, bqa.P, ITa.E, ITa.E);
                            v22 = var20_8;
                        } else {
                            v21.f(var22_39 - uqa.g, var10_15 - uqa.g, uSa.E, bqa.P, ITa.E, ITa.E);
                            v22 = var20_8;
                        }
                        if (!v22.A.J(var21_35)) {
                            var12_18 = Nra.e;
                            uKa.f((float)var12_18, (float)var12_18, (float)var12_18, (float)pqa.r);
                            var20_8.m.J((boolean)uSa.E);
                        }
                        uKa.P();
                        uKa.h();
                        v23 = var20_8;
                        v23.m.f(var21_35.theItemStack, var22_39 + yRa.d, var10_15 + yRa.d);
                        uKa.f((int)Lra.k, (int)kpa.J);
                        uKa.L();
                        if (!v23.A.J(var21_35)) {
                            var20_8.m.J((boolean)vRa.d);
                        }
                        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                        if (var18_29 >= (float)var22_39 && var18_29 <= (float)(var22_39 + cQa.o) && var19_31 >= (float)var10_15 && var19_31 <= (float)(var10_15 + cQa.o)) {
                            var17_26 = var21_35;
                        }
                    }
                    v18 = ++d;
                }
                uKa.u();
                uKa.B();
                uKa.D();
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                v24 = var20_8;
                var20_8.g.J().J(nNa.I);
                v25 = var20_8;
                v24.f((int)var6_11, (int)var7_12, uSa.E, uSa.E, v25.J, v25.f);
                v24.I = (ResourceLocation)JPa.N;
                uKa.I((int)Ira.A);
                uKa.u();
                uKa.H();
                super.J(c, (int)b, (float)a);
                if (var17_26 == null) break block51;
                v26 = var17_26;
                d = v26.f().f();
                var21_36 = v26.J();
                var22_40 = c + lqa.s;
                var10_15 = b - AQa.P;
                v27 = var20_8;
                var11_16 = v27.A.J(var17_26);
                if (!v27.A.J(var17_26)) break block52;
                v28 = var20_8;
                var12_17 = Math.max(v28.L.J(d), sOa.D);
                var13_19 = v28.L.J(var21_36, var12_17);
                if (v28.A.f(var17_26)) {
                    var13_19 += 12;
                }
                v29 = var20_8;
                v29.J((int)(var22_40 - yRa.d), var10_15 - yRa.d, (int)(var22_40 + var12_17 + yRa.d), var10_15 + var13_19 + yRa.d + lqa.s, Jsa.ca, Jsa.ca);
                v29.L.J(var21_36, (int)var22_40, var10_15 + lqa.s, var12_17, gsa.Ga);
                if (v29.A.f(var17_26)) {
                    var20_8.L.J(oha.J(Fua.g, new Object[uSa.E]), (float)var22_40, (float)(var10_15 + var13_19 + AQa.P), ppa.u);
                }
                ** GOTO lbl274
            }
            if (var11_16 == yRa.d) {
                d = oha.J(Jta.f, new Object[uSa.E]);
                var12_17 = Math.max(var20_8.L.J(d), sOa.D);
                v30 = new Object[vRa.d];
                v30[uSa.E] = var17_26.parentAchievement.f();
                var13_20 = new CZ(lqa.Z, v30).f();
                v31 = d;
                v32 = var20_8;
                c = v32.L.J(var13_20, var12_17);
                v32.J((int)(var22_40 - yRa.d), var10_15 - yRa.d, (int)(var22_40 + var12_17 + yRa.d), var10_15 + c + lqa.s + yRa.d, Jsa.ca, Jsa.ca);
                v32.L.J(var13_20, (int)var22_40, var10_15 + lqa.s, var12_17, pua.R);
            } else if (var11_16 < yRa.d) {
                var12_17 = Math.max(var20_8.L.J(d), sOa.D);
                v33 = new Object[vRa.d];
                v33[uSa.E] = var17_26.parentAchievement.f();
                var13_21 = new CZ(lqa.Z, v33).f();
                v31 = d;
                v34 = var20_8;
                c = v34.L.J(var13_21, var12_17);
                v34.J((int)(var22_40 - yRa.d), var10_15 - yRa.d, (int)(var22_40 + var12_17 + yRa.d), var10_15 + c + lqa.s + yRa.d, Jsa.ca, Jsa.ca);
                v34.L.J(var13_21, (int)var22_40, var10_15 + lqa.s, var12_17, pua.R);
            } else {
                d = null;
lbl274:
                // 2 sources

                v31 = d;
            }
            if (v31 != null) {
                var20_8.L.J(d, (float)var22_40, (float)var10_15, var20_8.A.J(var17_26) ? (var17_26.f() ? oqa.n : pua.o) : (var17_26.f() != false ? VQa.g : KPa.v));
            }
        }
        uKa.J();
        uKa.P();
        nLa.C();
    }

    public void A() {
        nNa a2;
        nNa nNa2 = a2;
        nNa2.g.J().J((KC)new qBa(Qba.REQUEST_STATS));
        nNa2.E.clear();
        nNa2.E.add(new zf(vRa.d, (int)(a2.A / uqa.g + osa.c), (int)(a2.I / uqa.g + bqa.Ga), Fua.J, kTa.j, oha.J(cra.g, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        nNa nNa2;
        void b2;
        void c2;
        Object object;
        nNa nNa3 = this;
        if (nNa3.F) {
            nNa3.i();
            nNa.J((String)oha.J(eua.a, new Object[uSa.E]), (int)(nNa3.A / uqa.g), (int)(nNa3.I / uqa.g), (int)pua.o);
            nNa.J((String)((Object)I[(int)(Kpa.J() / Spa.R % (long)((ResourceLocation)I).length)]), (int)(nNa3.A / uqa.g), (int)(nNa3.I / uqa.g + nNa3.L.u * uqa.g), (int)pua.o);
            return;
        }
        if (Mouse.isButtonDown(uSa.E)) {
            nNa nNa4 = nNa3;
            nNa nNa5 = nNa3;
            object = (nNa4.A - nNa5.J) / uqa.g;
            reference d2 = (nNa4.I - nNa3.f) / uqa.g;
            int n4 = object + Yqa.i;
            reference var7_11 = d2 + yta.Ka;
            if ((nNa5.m == 0 || nNa3.m == vRa.d) && c2 >= n4 && c2 < n4 + EQa.B && b2 >= var7_11 && b2 < var7_11 + BQa.Q) {
                nNa nNa6;
                if (nNa3.m == 0) {
                    nNa6 = nNa3;
                    nNa3.m = vRa.d;
                } else {
                    nNa nNa7 = nNa3;
                    nNa7.e -= (double)((float)(c2 - nNa3.C) * nNa3.g);
                    nNa7.a -= (double)((float)(b2 - nNa3.G) * nNa3.g);
                    nNa7.i = nNa7.E = nNa7.e;
                    nNa3.k = nNa3.b = nNa3.a;
                    nNa6 = nNa3;
                }
                nNa6.C = c2;
                nNa3.G = b2;
            }
        } else {
            nNa3.m = uSa.E;
        }
        object = Mouse.getDWheel();
        float d2 = nNa3.g;
        if (object < 0) {
            nNa nNa8 = nNa3;
            nNa2 = nNa8;
            nNa8.g += rta.o;
        } else {
            if (object > 0) {
                nNa3.g -= rta.o;
            }
            nNa2 = nNa3;
        }
        nNa2.g = Oz.J((float)nNa3.g, (float)pqa.r, (float)kta.v);
        if (nNa3.g != d2) {
            float f3 = d2 - nNa3.g;
            float f4 = d2 * (float)nNa3.J;
            float f5 = d2 * (float)nNa3.f;
            nNa nNa9 = nNa3;
            nNa nNa10 = nNa3;
            d2 = nNa9.g * (float)nNa10.J;
            f3 = nNa9.g * (float)nNa3.f;
            nNa10.e -= (double)((d2 - f4) * MQa.L);
            nNa9.a -= (double)((f3 - f5) * MQa.L);
            nNa9.i = nNa9.E = nNa9.e;
            nNa3.k = nNa3.b = nNa3.a;
        }
        if (nNa3.i < (double)l) {
            nNa3.i = l;
        }
        if (nNa3.k < (double)j) {
            nNa3.k = j;
        }
        if (nNa3.i >= (double)L) {
            nNa3.i = L - vRa.d;
        }
        if (nNa3.k >= (double)D) {
            nNa3.k = D - vRa.d;
        }
        nNa nNa11 = nNa3;
        nNa11.i();
        nNa11.f((int)c2, (int)b2, (float)a2);
        uKa.L();
        uKa.u();
        nNa3.J();
        uKa.P();
        uKa.J();
    }

    public void J() {
        nNa nNa2;
        nNa nNa3 = nNa2 = this;
        nNa nNa4 = nNa2;
        reference var1_3 = (nNa3.A - nNa4.J) / uqa.g;
        reference a2 = (nNa3.I - nNa2.f) / uqa.g;
        nNa4.L.J(oha.J(Ypa.f, new Object[uSa.E]), (int)(var1_3 + Ypa.A), (int)(a2 + tTa.h), tpa.i);
    }
}

