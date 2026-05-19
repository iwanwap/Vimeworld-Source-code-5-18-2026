/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Lz
 *  NTa
 *  Oz
 *  aSa
 *  vRa
 */
public final class OEa_2 {
    private static Lz I = new Lz(aSa.V, aSa.V, aSa.V);

    /*
     * WARNING - void declaration
     */
    public static Lz J(bga bga2, int n2, int n3) {
        void b2;
        int c2 = n3;
        bga a2 = bga2;
        return OEa_2.f(a2, (int)b2, c2, null);
    }

    /*
     * WARNING - void declaration
     */
    public static Lz l(bga bga2, int n2, int n3, Lz lz2) {
        void b2;
        void c2;
        bga a2;
        bga d2 = lz2;
        bga bga3 = a2 = bga2;
        I = d2.l(bga3.la, a2.Z, (double)a2.A);
        return OEa_2.f(bga3, (int)c2, (int)b2, I);
    }

    /*
     * Unable to fully structure code
     */
    private static Lz f(bga var0, int var1_2, int var2_4, Lz var3_5) {
        d = var1_2;
        v0 = c = var0;
        var4_6 = v0.J();
        var5_7 = uSa.E;
        var6_8 = uSa.E;
        var7_9 = uSa.E;
        var8_10 = uSa.E;
        var9_11 = xTa.T;
        if (v0.T()) {
            v1 = c;
            var11_12 = c.f().distanceSq(Oz.f((double)v1.la), Oz.f((double)c.Z), Oz.f((double)c.A)) + FPa.T;
            v2 = var13_14 = (double)(v1.F() + (float)d);
            var10_16 = var11_12 < v2 * v2 ? vRa.d : uSa.E;
        } else {
            var10_16 = uSa.E;
        }
        v3 = var11_13 = uSa.E;
        while (v3 < NTa.C) {
            block10: {
                v4 = var4_6;
                var12_17 = v4.nextInt(uqa.g * d + vRa.d) - d;
                var13_15 = v4.nextInt(uqa.g * b + vRa.d) - b;
                var14_18 = v4.nextInt(uqa.g * d + vRa.d) - d;
                if (a != null && !((double)var12_17 * a.A + (double)var14_18 * a.J >= aSa.V)) break block10;
                if (!c.T() || d <= vRa.d) ** GOTO lbl39
                v5 = c;
                var15_19 = v5.f();
                v6 = var12_17;
                if (v5.la > (double)var15_19.getX()) {
                    var12_17 = v6 - var4_6.nextInt(d / uqa.g);
                    v7 = c;
                } else {
                    var12_17 = v6 + var4_6.nextInt(d / uqa.g);
                    v7 = c;
                }
                v8 = var14_18;
                if (v7.A > (double)var15_19.getZ()) {
                    var14_18 = v8 - var4_6.nextInt(d / uqa.g);
                    v9 = var12_17;
                } else {
                    var14_18 = v8 + var4_6.nextInt(d / uqa.g);
lbl39:
                    // 2 sources

                    v9 = var12_17;
                }
                var12_17 = v9 + Oz.f((double)c.la);
                var15_19 = new XF(var12_17, var13_15 += Oz.f((double)c.Z), var14_18 += Oz.f((double)c.A));
                if (var10_16 == 0 || c.J(var15_19)) {
                    var15_20 = c.J(var15_19);
                    if (v10 > var9_11) {
                        var9_11 = var15_20;
                        var6_8 = var12_17;
                        var7_9 = var13_15;
                        var8_10 = var14_18;
                        var5_7 = vRa.d;
                    }
                }
            }
            v3 = ++var11_13;
        }
        if (var5_7 != 0) {
            return new Lz((double)var6_8, (double)var7_9, (double)var8_10);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static Lz J(bga bga2, int n2, int n3, Lz lz2) {
        void b2;
        void c2;
        bga d2 = lz2;
        bga a2 = bga2;
        I = new Lz(a2.la, a2.Z, (double)a2.A).d((Lz)d2);
        return OEa_2.f(a2, (int)c2, (int)b2, I);
    }

    public OEa_2() {
        OEa_2 a2;
    }
}

