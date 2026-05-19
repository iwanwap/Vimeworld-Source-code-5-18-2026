/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  hw
 *  vRa
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Lv_1
extends hw {
    private static final Logger A = LogManager.getLogger();
    private hw I;

    /*
     * WARNING - void declaration
     */
    public Lv_1(long l2, hw hw2, hw hw3) {
        Lv_1 d2;
        void b2;
        void c2;
        Lv_1 a2;
        Lv_1 lv_1 = lv_12;
        Lv_1 lv_12 = hw3;
        Lv_1 lv_13 = a2 = lv_1;
        super((long)c2);
        lv_13.A = b2;
        lv_13.I = d2;
    }

    /*
     * Unable to fully structure code
     */
    public int[] J(int var1_2, int var2_3, int var3_4, int var4_5) {
        v0 = var10_6 = this;
        var5_7 = v0.A.J((int)(d - vRa.d), (int)(c - vRa.d), (int)(b + uqa.g), (int)(a + uqa.g));
        var6_8 = v0.I.J((int)(d - vRa.d), (int)(c - vRa.d), (int)(b + uqa.g), (int)(a + uqa.g));
        var7_9 = iW.J((int)(b * a));
        v1 = var8_10 = uSa.E;
        while (v1 < a) {
            v2 = uSa.E;
            while (v2 < b) {
                block16: {
                    block19: {
                        block32: {
                            block31: {
                                block30: {
                                    block29: {
                                        block28: {
                                            block27: {
                                                block26: {
                                                    block25: {
                                                        block24: {
                                                            block23: {
                                                                block22: {
                                                                    block21: {
                                                                        block20: {
                                                                            block18: {
                                                                                block17: {
                                                                                    block15: {
                                                                                        v3 = var9_11;
                                                                                        var10_6.J(v3 + d, var8_10 + c);
                                                                                        e = var5_7[v3 + vRa.d + (var8_10 + vRa.d) * (b + uqa.g)];
                                                                                        var11_12 = var6_8[var9_11 + vRa.d + (var8_10 + vRa.d) * (b + uqa.g)];
                                                                                        v4 = var12_13 = (var11_12 - uqa.g) % ITa.A == 0 ? vRa.d : uSa.E;
                                                                                        if (e > osa.Ja) {
                                                                                            Lv_1.A.debug(new StringBuilder().insert(2 & 5, zua.c).append(e).toString());
                                                                                        }
                                                                                        if (e == 0 || var11_12 < uqa.g || (var11_12 - uqa.g) % ITa.A != vRa.d || e >= XOa.h) break block15;
                                                                                        var7_9[var9_11 + var8_10 * b] = Jy.l((int)(e + XOa.h)) != null ? e + XOa.h : e;
                                                                                        break block16;
                                                                                    }
                                                                                    if (var10_6.J(yRa.d) == 0 || var12_13 != 0) break block17;
                                                                                    var7_9[var9_11 + var8_10 * b] = e;
                                                                                    break block16;
                                                                                }
                                                                                var11_12 = e;
                                                                                if (e != Jy.ea.Ka) break block18;
                                                                                var11_12 = Jy.Ga.Ka;
                                                                                v5 = var12_13;
                                                                                break block19;
                                                                            }
                                                                            if (e != Jy.Y.Ka) break block20;
                                                                            var11_12 = Jy.fa.Ka;
                                                                            v5 = var12_13;
                                                                            break block19;
                                                                        }
                                                                        if (e != Jy.Sa.Ka) break block21;
                                                                        var11_12 = Jy.Aa.Ka;
                                                                        v5 = var12_13;
                                                                        break block19;
                                                                    }
                                                                    if (e != Jy.O.Ka) break block22;
                                                                    var11_12 = Jy.Z.Ka;
                                                                    v5 = var12_13;
                                                                    break block19;
                                                                }
                                                                if (e != Jy.I.Ka) break block23;
                                                                var11_12 = Jy.l.Ka;
                                                                v5 = var12_13;
                                                                break block19;
                                                            }
                                                            if (e != Jy.qa.Ka) break block24;
                                                            var11_12 = Jy.ja.Ka;
                                                            v5 = var12_13;
                                                            break block19;
                                                        }
                                                        if (e != Jy.Ta.Ka) break block25;
                                                        var11_12 = Jy.ca.Ka;
                                                        v5 = var12_13;
                                                        break block19;
                                                    }
                                                    if (e != Jy.Z.Ka) break block26;
                                                    if (var10_6.J(yRa.d) == 0) {
                                                        var11_12 = Jy.fa.Ka;
                                                        v5 = var12_13;
                                                    } else {
                                                        var11_12 = Jy.Y.Ka;
                                                        v5 = var12_13;
                                                    }
                                                    break block19;
                                                }
                                                if (e != Jy.C.Ka) break block27;
                                                var11_12 = Jy.Ea.Ka;
                                                v5 = var12_13;
                                                break block19;
                                            }
                                            if (e != Jy.Fa.Ka) break block28;
                                            var11_12 = Jy.y.Ka;
                                            v5 = var12_13;
                                            break block19;
                                        }
                                        if (e != Jy.Ba.Ka) break block29;
                                        var11_12 = Jy.L.Ka;
                                        v5 = var12_13;
                                        break block19;
                                    }
                                    if (e != Jy.U.Ka) break block30;
                                    var11_12 = Jy.Ia.Ka;
                                    v5 = var12_13;
                                    break block19;
                                }
                                if (e != Jy.r.Ka) break block31;
                                var11_12 = Jy.K.Ka;
                                v5 = var12_13;
                                break block19;
                            }
                            if (!Lv_1.J((int)e, (int)Jy.w.Ka)) break block32;
                            var11_12 = Jy.X.Ka;
                            v5 = var12_13;
                            break block19;
                        }
                        if (e != Jy.L.Ka || var10_6.J(yRa.d) != 0) ** GOTO lbl106
                        var13_14 = var10_6.J(uqa.g);
                        if (var13_14 == 0) {
                            var11_12 = Jy.Z.Ka;
                            v5 = var12_13;
                        } else {
                            var11_12 = Jy.Y.Ka;
lbl106:
                            // 2 sources

                            v5 = var12_13;
                        }
                    }
                    if (v5 == 0 || var11_12 == e) ** GOTO lbl113
                    if (Jy.l((int)(var11_12 + XOa.h)) != null) {
                        v6 = var11_12 += 128;
                    } else {
                        var11_12 = e;
lbl113:
                        // 2 sources

                        v6 = var11_12;
                    }
                    if (v6 == e) {
                        var7_9[var9_11 + var8_10 * b] = e;
                    } else {
                        var13_14 = var5_7[var9_11 + vRa.d + (var8_10 + vRa.d - vRa.d) * (b + uqa.g)];
                        var12_13 = var5_7[var9_11 + vRa.d + vRa.d + (var8_10 + vRa.d) * (b + uqa.g)];
                        var14_15 = var5_7[var9_11 + vRa.d - vRa.d + (var8_10 + vRa.d) * (b + uqa.g)];
                        var15_16 = var5_7[var9_11 + vRa.d + (var8_10 + vRa.d + vRa.d) * (b + uqa.g)];
                        var16_17 = uSa.E;
                        if (Lv_1.J((int)var13_14, (int)e)) {
                            ++var16_17;
                        }
                        if (Lv_1.J((int)var12_13, (int)e)) {
                            ++var16_17;
                        }
                        if (Lv_1.J((int)var14_15, (int)e)) {
                            ++var16_17;
                        }
                        if (Lv_1.J((int)var15_16, (int)e)) {
                            ++var16_17;
                        }
                        var7_9[var9_11 + var8_10 * b] = var16_17 >= yRa.d ? var11_12 : e;
                    }
                }
                v2 = ++var9_11;
            }
            v1 = ++var8_10;
        }
        return var7_9;
    }
}

