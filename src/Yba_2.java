/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  FPa
 *  Gg
 *  Mda
 *  NTa
 *  Oz
 *  QFa
 *  Qqa
 *  SCa
 *  Vx
 *  WSa
 *  Ypa
 *  aSa
 *  dQa
 *  dW
 *  pPa
 *  pua
 *  vL
 *  vRa
 *  yQa
 *  ysa
 */
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import java.util.List;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.material.MapColor;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Yba_2
extends SCa {
    /*
     * WARNING - void declaration
     */
    public KC J(Mda mda2, Gg gg2, Sx sx2) {
        void a2;
        void c2;
        Yba_2 d2 = gg2;
        Yba_2 b2 = this;
        return b2.J((Mda)c2, (Gg)d2).J((Mda)c2, (Gg)d2, (Sx)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl) {
        void a2;
        void c2;
        Yba_2 e2 = mda2;
        Yba_2 d2 = this;
        e2 = d2.J((Mda)e2, (Gg)c2.j);
        if (a2 != false) {
            void b2;
            if (e2 == null) {
                b2.add(cTa.q);
                return;
            }
            b2.add(new StringBuilder().insert(3 & 4, Bra.W).append(vRa.d << ((dW)e2).C).toString());
            b2.add(CRa.n + ((dW)e2).C + WSa.f + AQa.P + hpa.b);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static dW J(int n2, Gg gg2) {
        void a2;
        int n3 = n2;
        String string = new StringBuilder().insert(5 >> 3, yQa.H).append(n3).toString();
        dW b2 = (dW)a2.J(dW.class, string);
        if (b2 == null) {
            b2 = new dW(string);
            a2.J(string, (Vx)b2);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        Yba_2 yba_2 = this;
        if (c2.M() && c2.J().f(qsa.N)) {
            void b2;
            dW a2 = Gea.wa.J((Mda)c2, (Gg)b2);
            c2.J(b2.J(Epa.Aa));
            Yba_2 d2 = new dW(new StringBuilder().insert(5 >> 3, yQa.H).append(c2.J()).toString());
            ((dW)d2).C = (byte)(a2.C + vRa.d);
            if (((dW)d2).C > AQa.P) {
                ((dW)d2).C = (byte)AQa.P;
            }
            d2.J(a2.I, a2.i, ((dW)d2).C);
            ((dW)d2).M = a2.M;
            d2.J();
            b2.J(yQa.H + c2.J(), (Vx)d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public dW J(Mda mda2, Gg gg2) {
        void a2;
        void b2;
        Yba_2 yba_2 = this;
        String string = new StringBuilder().insert(3 >> 2, yQa.H).append(b2.J()).toString();
        Yba_2 c2 = (dW)a2.J(dW.class, string);
        if (c2 == null && !a2.e) {
            b2.J(a2.J(Epa.Aa));
            string = new StringBuilder().insert(3 & 4, yQa.H).append(b2.J()).toString();
            c2 = new dW(string);
            void v0 = a2;
            Yba_2 yba_22 = c2;
            ((dW)c2).C = (byte)yRa.d;
            yba_22.J(a2.J().C(), a2.J().f(), ((dW)c2).C);
            ((dW)c2).M = (byte)v0.F.J();
            yba_22.J();
            v0.J(string, (Vx)c2);
        }
        return c2;
    }

    /*
     * Unable to fully structure code
     */
    public void J(Gg var1_2, vL var2_3, dW var3_4) {
        block20: {
            var14_5 = this;
            if (c.F.J() != a.M || !(b instanceof Sx)) break block20;
            var4_6 = vRa.d << a.C;
            v0 = a;
            var5_7 = v0.I;
            var6_8 = v0.i;
            var7_9 = Oz.f((double)(b.la - (double)var5_7)) / var4_6 + ysa.s;
            var8_10 = Oz.f((double)(b.A - (double)var6_8)) / var4_6 + ysa.s;
            var9_11 = XOa.h / var4_6;
            if (c.F.f()) {
                var9_11 /= uqa.g;
            }
            b = a.J((Sx)b);
            b.j += vRa.d;
            var10_12 = uSa.E;
            v1 = var11_13 = var7_9 - var9_11 + vRa.d;
            while (v1 < var7_9 + var9_11) {
                block21: {
                    if ((var11_13 & Ypa.A) != (b.j & Ypa.A) && var10_12 == 0) break block21;
                    var10_12 = uSa.E;
                    var12_14 = aSa.V;
                    v2 = var8_10 - var9_11 - vRa.d;
                    while (v2 < var8_10 + var9_11) {
                        block22: {
                            block24: {
                                block23: {
                                    if (var11_13 < 0 || d < pua.o || var11_13 >= XOa.h || d >= XOa.h) break block22;
                                    var15_15 = var11_13 - var7_9;
                                    var16_16 = d - var8_10;
                                    v3 = var15_15;
                                    v4 = var16_16;
                                    var17_17 = v3 * v3 + v4 * v4 > (var9_11 - uqa.g) * (var9_11 - uqa.g) ? vRa.d : uSa.E;
                                    var18_18 = (var5_7 / var4_6 + var11_13 - ysa.s) * var4_6;
                                    var19_20 = (var6_8 / var4_6 + d - ysa.s) * var4_6;
                                    var20_21 = HashMultiset.create();
                                    var21_22 = c.J(new XF(var18_18, uSa.E, var19_20));
                                    if (var21_22.f()) break block22;
                                    var22_23 = var18_18 & Ypa.A;
                                    var23_24 = var19_20 & Ypa.A;
                                    var24_25 = uSa.E;
                                    var25_26 = aSa.V;
                                    if (!c.F.f()) break block23;
                                    var27_28 = var18_18 + var19_20 * Nta.E;
                                    if (((var27_28 = var27_28 * var27_28 * dQa.u + var27_28 * pPa.f) >> kTa.j & vRa.d) == 0) {
                                        var20_21.add(QFa.Bc.J(QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.DIRT)), NTa.C);
                                    } else {
                                        var20_21.add(QFa.Gd.J(QFa.Gd.J().J(BlockStone.VARIANT, BlockStone$EnumType.STONE)), ySa.T);
                                    }
                                    var25_26 = fqa.W;
                                    v5 = var24_25;
                                    break block24;
                                }
                                var27_29 = new zz();
                                v6 = uSa.E;
                                while (v6 < var4_6) {
                                    v7 = uSa.E;
                                    while (v7 < var4_6) {
                                        block18: {
                                            var30_33 = var21_22.J(var28_30 + var22_23, var29_31 + var23_24) + vRa.d;
                                            var31_34 = QFa.HF.J();
                                            if (var30_33 <= vRa.d) ** GOTO lbl-1000
                                            while ((var31_34 = var21_22.J((XF)var27_29.func_181079_c(var28_30 + var22_23, --var30_33, var29_31 + var23_24))).J().J(var31_34) == MapColor.airColor) {
                                                if (var30_33 > 0) continue;
                                                v8 = var30_33;
                                                break block18;
                                            }
                                            v8 = var30_33;
                                        }
                                        if (v8 > 0 && var31_34.J().J().l()) {
                                            var32_36 = var30_33 - vRa.d;
                                            do {
                                                ++var24_25;
                                                var18_19 = var21_22.J(var28_30 + var22_23, var32_36--, var29_31 + var23_24);
                                                if (var32_36 <= 0) ** break block19
                                            } while (var18_19.J().l());
                                            v9 = var25_26;
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v9 = var25_26;
                                        }
                                        v10 = var4_6;
                                        var25_26 = v9 + (double)var30_33 / (double)(v10 * v10);
                                        var20_21.add(var31_34.J().J(var31_34));
                                        v7 = ++var29_31;
                                    }
                                    v6 = ++var28_30;
                                }
                                v5 = var24_25;
                            }
                            v11 = var4_6;
                            var24_25 = v5 / (v11 * v11);
                            var27_27 = (var25_26 - var12_14) * FPa.T / (double)(var4_6 + AQa.P) + ((double)(var11_13 + d & vRa.d) - kTa.B) * Qqa.b;
                            var29_31 = vRa.d;
                            if (var27_27 > oQa.fa) {
                                var29_31 = uqa.g;
                            }
                            if (var27_27 < tTa.Q) {
                                var29_31 = uSa.E;
                            }
                            if ((var30_32 = Iterables.getFirst(Multisets.copyHighestCountFirst(var20_21), MapColor.airColor)) == MapColor.waterColor) {
                                var27_27 = (double)var24_25 * tpa.k + (double)(var11_13 + d & vRa.d) * iSa.P;
                                var29_31 = vRa.d;
                                if (var27_27 < kTa.B) {
                                    var29_31 = uqa.g;
                                }
                                if (var27_27 > Tqa.ja) {
                                    var29_31 = uSa.E;
                                }
                            }
                            var12_14 = var25_26;
                            if (d >= 0) {
                                v12 = var15_15;
                                v13 = var16_16;
                                v14 = var9_11;
                                if (v12 * v12 + v13 * v13 < v14 * v14 && (var17_17 == 0 || (var11_13 + d & vRa.d) != 0) && (var31_35 = a.j[var11_13 + d * XOa.h]) != (var32_36 = (int)((byte)(var30_32.colorIndex * AQa.P + var29_31)))) {
                                    v15 = a;
                                    v15.j[var11_13 + d * XOa.h] = var32_36;
                                    v15.J(var11_13, d);
                                    var10_12 = vRa.d;
                                }
                            }
                        }
                        v2 = ++d;
                    }
                }
                v1 = ++var11_13;
            }
        }
    }

    public Yba_2() {
        Yba_2 a2;
        Yba_2 yba_2 = a2;
        yba_2.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Gg gg2, vL vL2, int n2, boolean bl) {
        void d2;
        int n3 = n2;
        Yba_2 b2 = this;
        if (!d2.e) {
            void a2;
            void c2;
            void e2;
            dW f2 = b2.J((Mda)e2, (Gg)d2);
            if (c2 instanceof Sx) {
                Sx sx2 = (Sx)c2;
                f2.J(sx2, (Mda)e2);
            }
            if (a2 != false) {
                b2.J((Gg)d2, (vL)c2, f2);
            }
        }
    }
}

