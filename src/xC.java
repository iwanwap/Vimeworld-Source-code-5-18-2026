/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  Cra
 *  EC
 *  ERa
 *  FTa
 *  JPa
 *  KA
 *  Kpa
 *  MQa
 *  NTa
 *  Qb
 *  Qta
 *  RPa
 *  Rb
 *  Tpa
 *  Usa
 *  XTa
 *  YSa
 *  Ypa
 *  ZB
 *  ac
 *  bqa
 *  cra
 *  fTa
 *  kta
 *  pqa
 *  pua
 *  vRa
 *  vpa
 *  wc
 *  wra
 *  xb
 *  yra
 */
import java.io.File;
import java.io.IOException;
import java.net.URI;
import optifine.Config;
import org.lwjgl.Sys;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xC
extends EC {
    public EC G;
    public static final int D = 2;
    private static float[] f;
    public static final int F = 3;
    public String g;
    public static final int L = 1;
    public Qb E;
    public static final int m = 4;
    private static String[] C;
    private static float[] i;
    public static final int M = 0;
    private static String[] k;
    private boolean j;
    private int J;

    public void d() throws IOException {
        xC a2;
        xC xC2 = a2;
        super.d();
        xC2.E.f();
    }

    public static String J(boolean bl) {
        boolean bl2 = bl;
        String string = Kg.l();
        String a2 = Kg.f();
        if (bl2) {
            return string;
        }
        return a2;
    }

    public void l() {
        xC a2;
        xC xC2 = a2;
        super.l();
        xC2.J -= vRa.d;
    }

    public static String J(int a2) {
        if (a2 == uqa.g) {
            return Mqa.u;
        }
        if (a2 == AQa.P) {
            return fTa.Y;
        }
        return Kg.f();
    }

    public void A() {
        xC xC2 = this;
        xC2.g = oha.J(QTa.c, new Object[uSa.E]);
        if (pA.l == null) {
            pA.Fa();
        }
        int n2 = sOa.D;
        int n3 = kTa.j;
        xC xC3 = xC2;
        int n4 = xC3.A - n2 - NTa.C;
        int a2 = Fsa.d;
        int n5 = kTa.j;
        int n6 = xC3.A - n2 - kTa.j;
        xC xC4 = xC2;
        xC2.E = new Qb(xC2, n6, xC2.I, a2, xC2.I - vpa.o, ERa.C);
        xC3.E.l(XTa.W, Yqa.i);
        xC3.E.add(new ZB(Rb.ANTIALIASING, n4, uSa.E * n5 + a2, n2, n3));
        xC2.E.add(new ZB(Rb.NORMAL_MAP, n4, vRa.d * n5 + a2, n2, n3));
        xC2.E.add(new ZB(Rb.SPECULAR_MAP, n4, uqa.g * n5 + a2, n2, n3));
        xC2.E.add(new ZB(Rb.RENDER_RES_MUL, n4, yRa.d * n5 + a2, n2, n3));
        xC2.E.add(new ZB(Rb.SHADOW_RES_MUL, n4, AQa.P * n5 + a2, n2, n3));
        xC2.E.add(new ZB(Rb.HAND_DEPTH_MUL, n4, tTa.h * n5 + a2, n2, n3));
        xC2.E.add(new ZB(Rb.OLD_HAND_LIGHT, n4, uua.p * n5 + a2, n2, n3));
        xC2.E.add(new ZB(Rb.OLD_LIGHTING, n4, XTa.W * n5 + a2, n2, n3));
        a2 = Math.min(Jpa.Ha, n6 / uqa.g - NTa.C);
        xC2.E.add(new ac(Tqa.K, n6 / AQa.P - a2 / uqa.g, xC2.I - kTa.g, a2, n3, Kg.J(pta.P)));
        xC3.E.add(new ac(bqa.P, n6 / AQa.P * yRa.d - a2 / uqa.g, xC2.I - kTa.g, a2, n3, oha.J(cra.g, new Object[uSa.E])));
        xC2.E.add(new ac(Bta.la, n4, xC2.I - kTa.g, n2, n3, Kg.J(Cra.b)));
        xC2.J();
    }

    public xC(EC eC2, Cia cia) {
        xC b2;
        xC c2 = eC2;
        xC xC2 = b2 = this;
        b2.g = nOa.I;
        xC2.J = pua.o;
        xC2.j = uSa.E;
        xC2.G = c2;
    }

    public static String f(float a2) {
        return xC.J(a2, i, C);
    }

    /*
     * WARNING - void declaration
     */
    public static int J(float f2, float[] fArray) {
        void a2;
        int b2;
        float f3 = f2;
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            if (a2[b2] >= f3) {
                return b2;
            }
            n2 = ++b2;
        }
        return ((void)a2).length - vRa.d;
    }

    public static int J() {
        String string = System.getProperty(JPa.G).toLowerCase();
        if (string.contains(RPa.y)) {
            return vRa.d;
        }
        if (string.contains(gua.C)) {
            return uqa.g;
        }
        if (string.contains(vua.O)) {
            return yRa.d;
        }
        if (string.contains(iSa.O)) {
            return yRa.d;
        }
        if (string.contains(lTa.Y)) {
            return AQa.P;
        }
        if (string.contains(WPa.Z)) {
            return AQa.P;
        }
        return uSa.E;
    }

    static {
        float[] fArray = new float[tTa.h];
        fArray[uSa.E] = MQa.L;
        fArray[vRa.d] = AQa.G;
        fArray[uqa.g] = pqa.r;
        fArray[yRa.d] = dsa.B;
        fArray[AQa.P] = kta.v;
        f = fArray;
        String[] stringArray = new String[tTa.h];
        stringArray[uSa.E] = gua.s;
        stringArray[vRa.d] = fqa.R;
        stringArray[uqa.g] = mSa.D;
        stringArray[yRa.d] = yra.p;
        stringArray[AQa.P] = kTa.R;
        k = stringArray;
        float[] fArray2 = new float[yRa.d];
        fArray2[uSa.E] = rRa.T;
        fArray2[vRa.d] = Mqa.N;
        fArray2[uqa.g] = rta.o;
        i = fArray2;
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = gua.s;
        stringArray2[vRa.d] = mSa.D;
        stringArray2[uqa.g] = kTa.R;
        C = stringArray2;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(float f2, float[] fArray, String[] stringArray) {
        void a2;
        float[] c22 = fArray;
        float b2 = f2;
        int c22 = xC.J(b2, c22);
        return a2[c22];
    }

    /*
     * Unable to fully structure code
     */
    public void J(ac var1_6) {
        block37: {
            block38: {
                var2_7 = this;
                if (!a.J) break block37;
                if (!(a instanceof ZB)) break block38;
                var5_8 = (ZB)a;
                switch (wc.I[var5_8.J().ordinal()]) {
                    case 1: {
                        pA.k();
                        while (false) {
                        }
                        pA.J();
                        v0 = var5_8;
                        break;
                    }
                    case 2: {
                        pA.DA = pA.DA == false ? vRa.d : uSa.E;
                        v0 = var5_8;
                        var2_7.g.J();
                        break;
                    }
                    case 3: {
                        pA.hA = pA.hA == false ? vRa.d : uSa.E;
                        v0 = var5_8;
                        var2_7.g.J();
                        break;
                    }
                    case 4: {
                        var3_11 = pA.w;
                        var4_17 = xC.f;
                        b = xC.J(var3_11, var4_17);
                        if (!xC.l()) ** GOTO lbl35
                        if (--b >= 0) ** GOTO lbl37
                        b = var4_17.length - vRa.d;
                        v1 = var4_17;
                        ** GOTO lbl38
lbl35:
                        // 1 sources

                        if (++b >= var4_17.length) {
                            b = uSa.E;
                        }
lbl37:
                        // 4 sources

                        v1 = var4_17;
lbl38:
                        // 2 sources

                        pA.w = v1[b];
                        pA.ha();
                        v0 = var5_8;
                        break;
                    }
                    case 5: {
                        b = pA.Oa;
                        var6_19 = xC.f;
                        b = xC.J(b, var6_19);
                        if (!xC.l()) ** GOTO lbl52
                        if (--b >= 0) ** GOTO lbl54
                        b = var6_19.length - vRa.d;
                        v2 = var6_19;
                        ** GOTO lbl55
lbl52:
                        // 1 sources

                        if (++b >= var6_19.length) {
                            b = uSa.E;
                        }
lbl54:
                        // 4 sources

                        v2 = var6_19;
lbl55:
                        // 2 sources

                        pA.Oa = v2[b];
                        pA.m();
                        v0 = var5_8;
                        break;
                    }
                    case 6: {
                        b = pA.oB;
                        var6_20 = xC.i;
                        b = xC.J(b, var6_20);
                        if (!xC.l()) ** GOTO lbl69
                        if (--b >= 0) ** GOTO lbl71
                        b = var6_20.length - vRa.d;
                        v3 = var6_20;
                        ** GOTO lbl72
lbl69:
                        // 1 sources

                        if (++b >= var6_20.length) {
                            b = uSa.E;
                        }
lbl71:
                        // 4 sources

                        v3 = var6_20;
lbl72:
                        // 2 sources

                        pA.oB = v3[b];
                        v0 = var5_8;
                        break;
                    }
                    case 7: {
                        pA.ib = pA.ib == false ? vRa.d : uSa.E;
                        v0 = var5_8;
                        break;
                    }
                    case 8: {
                        pA.fc.J();
                        v0 = var5_8;
                        break;
                    }
                    case 9: {
                        pA.uB.J();
                        pA.E();
                        v0 = var5_8;
                        var2_7.g.J();
                        break;
                    }
                    case 10: {
                        pA.yb = pA.yb == false ? vRa.d : uSa.E;
                        v0 = var5_8;
                        break;
                    }
                    case 11: {
                        pA.ab = pA.JA = (pA.s = (pA.s + vRa.d) % yRa.d);
                        v0 = var5_8;
                        v4 = a;
                        v4.i = dua.Z + pA.z[pA.s];
                        xb.J();
                        break;
                    }
                    case 12: {
                        pA.Ia = (pA.Ia + vRa.d) % uqa.g;
                        v0 = var5_8;
                        a.i = new StringBuilder().insert(2 & 5, rta.X).append(pA.XB[pA.Ia]).toString();
                        xb.J();
                        break;
                    }
                    case 13: {
                        pA.M = (pA.M + vRa.d) % uqa.g;
                        v0 = var5_8;
                        a.i = new StringBuilder().insert(5 >> 3, mSa.Aa).append(pA.XB[pA.M]).toString();
                        xb.J();
                        break;
                    }
                    case 14: {
                        pA.e = pA.e == false ? vRa.d : uSa.E;
                        a.i = new StringBuilder().insert(2 & 5, FTa.x).append(xC.J(pA.e)).toString();
                        xb.J();
                    }
                    default: {
                        v0 = var5_8;
                    }
                }
                v0.J();
                return;
            }
            switch (a.C) {
                case 201: {
                    v5 = xC.J();
                    while (false) {
                    }
                    switch (v5) {
                        case 1: {
                            while (false) {
                            }
                            v6 = new Object[vRa.d];
                            v6[uSa.E] = pA.HB.getAbsolutePath();
                            var5_9 = String.format(rQa.ba, v6);
                            try {
                                Runtime.getRuntime().exec(var5_9);
                                return;
                            }
                            catch (IOException var3_12) {
                                var3_12.printStackTrace();
                                break;
                            }
                        }
                        case 2: {
                            try {
                                v7 = new String[uqa.g];
                                v7[uSa.E] = APa.x;
                                v7[vRa.d] = pA.HB.getAbsolutePath();
                                Runtime.getRuntime().exec(v7);
                                return;
                            }
                            catch (IOException var3_13) {
                                var3_13.printStackTrace();
                            }
                        }
                    }
                    var5_10 = uSa.E;
                    try {
                        var3_14 = Class.forName(Usa.e);
                        var4_18 = var3_14.getMethod(csa.i, new Class[uSa.E]).invoke(null, new Object[uSa.E]);
                        v8 = new Class[vRa.d];
                        v8[uSa.E] = URI.class;
                        v9 = new Object[vRa.d];
                        v9[uSa.E] = new File(var2_7.g.p, pA.MA).toURI();
                        var3_14.getMethod(ySa.l, v8).invoke(var4_18, v9);
                        v10 = var5_10;
                    }
                    catch (Throwable var3_15) {
                        var3_15.printStackTrace();
                        v10 = var5_10 = vRa.d;
                    }
                    if (v10 == 0) break;
                    Config.f(rQa.Ha);
                    Sys.openURL(new StringBuilder().insert(3 ^ 3, gua.E).append(pA.HB.getAbsolutePath()).toString());
                    return;
                }
                case 202: {
                    new File(pA.zb, nua.S);
                    pA.ga();
                    var2_7.j = vRa.d;
                    var2_7.g.J(var2_7.G);
                    return;
                }
                case 203: {
                    var3_16 = new bB(var2_7, Config.J());
                    Config.J().J((EC)var3_16);
                    return;
                }
                default: {
                    var2_7.E.J((ac)a);
                }
            }
        }
    }

    public void J() {
        xC xC2 = this;
        boolean bl = Config.h();
        for (xC a2 : xC2.E) {
            if (((ac)a2).C == Tqa.K || ((ac)a2).C == bqa.P || ((ac)a2).C == Rb.ANTIALIASING.ordinal()) continue;
            ((ac)a2).J = bl;
        }
    }

    public Kpa J() {
        xC a2;
        return a2.g;
    }

    public static String J(float a2) {
        return xC.J(a2, f, k);
    }

    public void M() {
        xC a2;
        xC xC2 = a2;
        super.M();
        if (!xC2.j) {
            pA.ga();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        xC xC2;
        void a2;
        void b2;
        void c2;
        xC xC3;
        xC xC4 = xC3 = this;
        xC4.i();
        xC4.E.J((int)c2, (int)b2, (float)a2);
        if (xC4.J <= 0) {
            xC xC5 = xC3;
            xC5.E.C();
            xC5.J += kTa.j;
        }
        KA.J((String)new StringBuilder().insert(3 >> 2, xC3.g).append(Tpa.E).toString(), (int)(xC3.A / uqa.g), (int)Ypa.A, (int)pua.o);
        Object d2 = new StringBuilder().insert(3 ^ 3, YSa.m).append(pA.ZB).append(TOa.n).append(pA.Ja).append(TOa.n).append(pA.dc).toString();
        if (xC3.L.J((String)d2) < xC3.A - tTa.h) {
            xC xC6 = xC3;
            xC2 = xC6;
            xC.J((String)d2, (int)(xC3.A / uqa.g), (int)(xC6.I - wra.P), (int)Qta.L);
        } else {
            xC.f((String)d2, (int)tTa.h, (int)(xC3.I - wra.P), (int)Qta.L);
            xC2 = xC3;
        }
        super.J((int)c2, (int)b2, (float)a2);
    }
}

