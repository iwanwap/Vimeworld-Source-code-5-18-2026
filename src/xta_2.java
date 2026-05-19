/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  FPa
 *  FTa
 *  JPa
 *  JSa
 *  Kpa
 *  Lqa
 *  Spa
 *  TPa
 *  Tpa
 *  Uqa
 *  WSa
 *  WTa
 *  XSa
 *  YTa
 *  ZRa
 *  aPa
 *  aSa
 *  hqa
 *  iPa
 *  isa
 *  jsa
 *  mTa
 *  oqa
 *  psa
 *  uRa
 *  uTa
 *  vRa
 *  wPa
 *  xOa
 *  yra
 */
import java.util.Arrays;

public final class xta_2 {
    public static Kpa I = Kpa.J();

    public static boolean J(String string) {
        String string2 = string;
        if (string2.startsWith(hqa.B) || string2.equals(XSa.w)) {
            if (!mTa.M.J()) {
                return uSa.E != 0;
            }
            String[] a2 = string2.split(Tpa.E);
            xta_2.J((u)xta_2.I.c, Arrays.copyOfRange(a2, vRa.d, a2.length));
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void f(u u2, String string) {
        String b2 = string;
        u a2 = u2;
        a2.J(Sg.J(b2));
    }

    /*
     * Unable to fully structure code
     */
    private static void J(u var0, String[] var1_1) {
        block75: {
            block74: {
                block73: {
                    block72: {
                        block71: {
                            block70: {
                                block69: {
                                    b = var1_1;
                                    a = var0;
                                    if (b.length == 0) {
                                        v0 = a;
                                        xta_2.f(v0, TOa.Q);
                                        xta_2.f(v0, pta.M);
                                        xta_2.f(v0, Pua.j);
                                        if (xta_2.J()) {
                                            xta_2.f(a, psa.g);
                                        }
                                        v1 = a;
                                        xta_2.f(v1, aPa.f);
                                        xta_2.f(v1, Xpa.m);
                                        xta_2.f(v1, FPa.M);
                                        xta_2.f(v1, osa.r);
                                        v2 = a;
                                        xta_2.f(v1, WPa.B + String.join((CharSequence)MTa.a, uTa.J()) + yOa.V);
                                        xta_2.f(v1, new StringBuilder().insert(2 & 5, iPa.H).append(String.join((CharSequence)MTa.a, uTa.J())).append(lQa.G).toString());
                                        xta_2.f(v1, new StringBuilder().insert(5 >> 3, Jta.G).append(String.join((CharSequence)MTa.a, uTa.J())).append(xqa.k).toString());
                                        return;
                                    }
                                    var2_2 = b[uSa.E];
                                    if (var2_2.equals(cPa.i)) {
                                        xta_2.J(a, xTa.j);
                                        mTa.k.clear();
                                    }
                                    if (!var2_2.equals(Qra.U)) ** GOTO lbl47
                                    if (b.length == vRa.d) {
                                        mTa.k.add(new YTa());
                                        xta_2.J(a, new StringBuilder().insert(2 & 5, PRa.Da).append(mTa.k.size()).append(LPa.H).toString());
                                        v3 = var2_2;
                                    } else {
                                        block68: {
                                            if (b.length == uqa.g) {
                                                try {
                                                    var3_3 = Integer.parseInt(b[vRa.d]) - vRa.d;
                                                    if (var3_3 >= 0 && var3_3 < mTa.k.size()) {
                                                        mTa.k.add(var3_3, new YTa());
                                                        xta_2.J(a, new StringBuilder().insert(3 ^ 3, oua.L).append(var3_3).append(LPa.H).toString());
                                                    } else {
                                                        xta_2.J(a, new StringBuilder().insert(3 >> 2, sra.Ha).append(var3_3).append(WSa.f).append(mTa.k.size()).toString());
                                                    }
                                                    break block68;
                                                }
                                                catch (Exception var3_4) {
                                                    v3 = var2_2;
                                                    xta_2.J(a, oqa.J);
                                                    break block69;
                                                }
                                            }
                                            xta_2.f(a, TOa.Q);
                                        }
                                        v3 = var2_2;
                                    }
                                }
                                if (v3.equals(FTa.G)) {
                                    if (b.length >= uqa.g) {
                                        try {
                                            var3_5 = hF.J(b[vRa.d]);
                                            if (var3_5 > nqa.i) {
                                                mTa.I = var3_5;
                                            }
                                        }
                                        catch (Exception var3_6) {
                                            v4 = a;
                                            xta_2.J(v4, uua.i);
                                            xta_2.J(v4, dqa.Aa);
                                            return;
                                        }
                                    }
                                    mTa.e();
                                }
                                if (var2_2.equals(aSa.c)) {
                                    if (b.length >= uqa.g) {
                                        try {
                                            var3_7 = Integer.parseInt(b[vRa.d]) - vRa.d;
                                            if (var3_7 >= 0 && var3_7 < mTa.k.size()) {
                                                mTa.k.remove(var3_7);
                                                xta_2.J(a, new StringBuilder().insert(3 & 4, yra.f).append(var3_7 + vRa.d).append(Ura.N).toString());
                                            } else {
                                                xta_2.J(a, Bpa.B);
                                            }
                                            break block70;
                                        }
                                        catch (Exception var3_8) {
                                            v5 = var2_2;
                                            xta_2.J(a, oqa.J);
                                            break block71;
                                        }
                                    }
                                    xta_2.f(a, Xpa.m);
                                }
                            }
                            v5 = var2_2;
                        }
                        if (v5.equals(pta.G)) {
                            if (b.length >= uqa.g) {
                                try {
                                    var3_9 = Integer.parseInt(b[vRa.d]) - vRa.d;
                                    if (var3_9 >= 0 && var3_9 < mTa.k.size()) {
                                        mTa.k.set(var3_9, new YTa());
                                        xta_2.J(a, new StringBuilder().insert(3 ^ 3, yra.f).append(var3_9 + vRa.d).append(jsa.P).toString());
                                    } else {
                                        xta_2.J(a, Bpa.B);
                                    }
                                    break block72;
                                }
                                catch (Exception var3_10) {
                                    v6 = var2_2;
                                    xta_2.J(a, oqa.J);
                                    break block73;
                                }
                            }
                            xta_2.f(a, aPa.f);
                        }
                    }
                    v6 = var2_2;
                }
                if (v6.equals(Spa.W) && xta_2.J()) {
                    if (b.length >= uqa.g) {
                        try {
                            var3_11 = Integer.parseInt(b[vRa.d]) - vRa.d;
                            if (var3_11 >= 0 && var3_11 < mTa.k.size()) {
                                var4_19 = (YTa)mTa.k.get(var3_11);
                                mTa.j = (float)var4_19.roll;
                                WTa.m = (float)var4_19.zoom;
                                if (xta_2.I.f()) {
                                    xta_2.I.c.h.f((boolean)vRa.d);
                                    xta_2.I.c.l(var4_19.x, var4_19.y, var4_19.z, (float)var4_19.rotationYaw, (float)var4_19.rotationPitch);
                                    xta_2.I.c.f(var4_19.x, var4_19.y, var4_19.z, (float)var4_19.rotationYaw, (float)var4_19.rotationPitch);
                                } else {
                                    xta_2.I.Ya.J().J(new StringBuilder().insert(3 ^ 3, Uqa.n).append(var4_19.x).append(Tpa.E).append(var4_19.y).append(Tpa.E).append(var4_19.z).append(Tpa.E).append((float)var4_19.rotationYaw).append(Tpa.E).append((float)var4_19.rotationPitch).toString());
                                }
                            } else {
                                xta_2.J(a, Bpa.B);
                            }
                            break block74;
                        }
                        catch (Exception var3_12) {
                            v7 = var2_2;
                            xta_2.J(a, oqa.J);
                            break block75;
                        }
                    }
                    xta_2.f(a, psa.g);
                }
            }
            v7 = var2_2;
        }
        if (v7.equals(aPa.n)) {
            if (b.length == uqa.g) {
                var3_13 = b[vRa.d];
                if (var3_13.equals(xqa.f)) {
                    mTa.C = xqa.f;
                    xta_2.J(a, eua.U);
                } else if (var3_13.equals(TPa.n)) {
                    mTa.C = null;
                    xta_2.J(a, Tqa.Z);
                } else {
                    xta_2.J(a, sOa.J);
                }
            } else {
                WTa.i = vRa.d;
                xta_2.J(a, tSa.E);
            }
        }
        if (var2_2.equals(vsa.B)) {
            if (b.length == uqa.g) {
                var3_14 = b[vRa.d];
                var4_19 = uTa.J((String)var3_14);
                if (var4_19 != null) {
                    mTa.A = var3_14;
                    xta_2.J(a, new StringBuilder().insert(3 ^ 3, JPa.h).append(var3_14).toString());
                } else {
                    xta_2.J(a, wPa.C);
                }
            } else {
                xta_2.f(a, new StringBuilder().insert(0, WPa.B).append(String.join((CharSequence)MTa.a, uTa.J())).append(yOa.V).toString());
            }
        }
        if (!var2_2.equals(isa.e)) ** GOTO lbl165
        if (b.length == uqa.g) {
            try {
                var3_15 = Float.parseFloat(b[vRa.d]);
                mTa.i = var3_15;
                xta_2.J(a, new StringBuilder().insert(0, MTa.B).append(var3_15).append(Lqa.x).toString());
                v8 = var2_2;
            }
            catch (NumberFormatException var3_16) {
                v8 = var2_2;
                xta_2.J(a, uRa.x);
            }
        } else {
            xta_2.f(a, osa.r);
lbl165:
            // 2 sources

            v8 = var2_2;
        }
        if (v8.equals(XOa.Ga)) {
            if (b.length == uqa.g) {
                var3_17 = b[vRa.d];
                var4_19 = uTa.J((String)var3_17);
                if (var4_19 != null) {
                    var4_19.I = vRa.d;
                    xta_2.J(a, new StringBuilder().insert(0, yRa.V).append(var3_17).append(ZRa.P).toString());
                } else if (var3_17.equals(JSa.H)) {
                    v9 = var5_20 = uTa.M.values().iterator();
                    while (v9.hasNext()) {
                        var6_21 = (uTa)var5_20.next();
                        v9 = var5_20;
                        var6_21.I = vRa.d;
                    }
                    xta_2.J(a, rpa.D);
                } else {
                    xta_2.J(a, wPa.C);
                }
            } else {
                xta_2.f(a, new StringBuilder().insert(0, iPa.H).append(String.join((CharSequence)MTa.a, uTa.J())).append(lQa.G).toString());
            }
        }
        if (var2_2.equals(Tqa.i)) {
            if (b.length == uqa.g) {
                var3_18 = b[vRa.d];
                var4_19 = uTa.J((String)var3_18);
                if (var4_19 != null) {
                    var4_19.I = uSa.E;
                    xta_2.J(a, new StringBuilder().insert(0, yRa.V).append(var3_18).append(xOa.h).toString());
                } else if (var3_18.equals(JSa.H)) {
                    var5_20 = uTa.M.values().iterator();
                    v10 = var5_20;
                    while (v10.hasNext()) {
                        var6_21 = (uTa)var5_20.next();
                        v10 = var5_20;
                        var6_21.I = uSa.E;
                    }
                    xta_2.J(a, yOa.Y);
                } else {
                    xta_2.J(a, wPa.C);
                }
            } else {
                xta_2.f(a, new StringBuilder().insert(0, Jta.G).append(String.join((CharSequence)MTa.a, uTa.J())).append(xqa.k).toString());
            }
        }
        if (var2_2.equals(VPa.k)) {
            mTa.f();
            xta_2.J(a, POa.E);
        }
    }

    public static void J(u u2, String string) {
        String b2 = string;
        u a2 = u2;
        xta_2.f(a2, lQa.p + (String)b2);
    }

    public xta_2() {
        xta_2 a2;
    }

    private static boolean J() {
        if (mTa.J.J() || I.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

