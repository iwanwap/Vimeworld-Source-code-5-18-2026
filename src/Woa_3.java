/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  Gc
 *  JPa
 *  KA
 *  Kna
 *  NQa
 *  Oz
 *  Ppa
 *  Qsa
 *  Sf
 *  Tpa
 *  XTa
 *  aKa
 *  aSa
 *  cX
 *  mka
 *  pKa
 *  pQa
 *  pua
 *  uKa
 *  vRa
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Woa_3
extends KA {
    private int d;
    private int a;
    private final int b;
    private int l;
    private int e;
    private boolean G;
    public int D;
    private int f;
    private int F;
    private int g;
    public int L;
    private boolean E;
    private final int m;
    private boolean C;
    private Gc i;
    private boolean M;
    private String k;
    private boolean j;
    private final Kna J;
    private final int A;
    private Predicate<String> I;

    public int d() {
        Woa_3 a2;
        return a2.F;
    }

    /*
     * WARNING - void declaration
     */
    public void i(int n2) {
        Woa_3 woa_3 = this;
        if (woa_3.k.length() != 0) {
            void a2;
            Woa_3 woa_32 = woa_3;
            if (woa_32.f != woa_32.d) {
                woa_3.J(Mqa.y);
                return;
            }
            int n3 = a2 < 0 ? vRa.d : uSa.E;
            Woa_3 woa_33 = woa_3;
            int n4 = n3 != 0 ? woa_33.d + a2 : woa_33.d;
            Woa_3 woa_34 = woa_3;
            int n5 = n3 != 0 ? woa_34.d : woa_34.d + a2;
            Object b2 = Mqa.y;
            if (n4 >= 0) {
                b2 = woa_3.k.substring(uSa.E, n4);
            }
            if (n5 < woa_3.k.length()) {
                b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(woa_3.k.substring(n5)).toString();
            }
            if (woa_3.I.apply((String)b2)) {
                woa_3.k = b2;
                if (n3 != 0) {
                    woa_3.J((int)a2);
                }
                if (woa_3.i != null) {
                    Woa_3 woa_35 = woa_3;
                    woa_35.i.J(woa_35.A, woa_3.k);
                }
            }
        }
    }

    public int C() {
        Woa_3 a2;
        return a2.f;
    }

    public void d(boolean bl) {
        boolean b2 = bl;
        Woa_3 a2 = this;
        a2.M = b2;
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        Woa_3 a2 = this;
        a2.G = b2;
    }

    public void M(int n2) {
        int b2 = n2;
        Woa_3 a2 = this;
        a2.F = b2;
        if (a2.k.length() > b2) {
            a2.k = a2.k.substring(uSa.E, b2);
        }
    }

    public void e(int n2) {
        int b2 = n2;
        Woa_3 a2 = this;
        a2.a = b2;
    }

    public void d(int n2) {
        int b2 = n2;
        Woa_3 a2 = this;
        int n3 = a2.k.length();
        if (b2 > n3) {
            b2 = n3;
        }
        if (b2 < 0) {
            b2 = uSa.E;
        }
        a2.f = b2;
        if (a2.J != null) {
            Woa_3 woa_3;
            if (a2.e > n3) {
                a2.e = n3;
            }
            Woa_3 woa_32 = a2;
            int n4 = woa_32.J();
            Woa_3 woa_33 = a2;
            int n5 = woa_32.J.J(woa_33.k.substring(woa_33.e), n4).length() + a2.e;
            if (b2 == a2.e) {
                Woa_3 woa_34 = a2;
                a2.e -= woa_34.J.J(woa_34.k, n4, vRa.d != 0).length();
            }
            if (b2 > n5) {
                Woa_3 woa_35 = a2;
                woa_3 = woa_35;
                woa_35.e += b2 - n5;
            } else {
                if (b2 <= a2.e) {
                    a2.e -= a2.e - b2;
                }
                woa_3 = a2;
            }
            woa_3.e = Oz.f((int)a2.e, (int)uSa.E, (int)n3);
        }
    }

    public void C() {
        a.l += vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(char c2, int n2) {
        void b2;
        void a2;
        Woa_3 woa_3 = this;
        if (!woa_3.C) {
            return uSa.E != 0;
        }
        if (EC.l((int)a2)) {
            Woa_3 woa_32 = woa_3;
            woa_32.l();
            woa_32.d(uSa.E);
            return vRa.d != 0;
        }
        if (EC.C((int)a2)) {
            EC.C((String)woa_3.J());
            return vRa.d != 0;
        }
        if (EC.f((int)a2)) {
            if (woa_3.M) {
                Woa_3 woa_33;
                Object c3 = EC.J();
                if ((((String)c3).startsWith(rSa.ba) || ((String)c3).startsWith(Ppa.g)) && ((String)c3).contains(Wqa.fa)) {
                    try {
                        c3 = URLDecoder.decode((String)c3, wsa.H).replace(Tpa.E, STa.C);
                        woa_33 = woa_3;
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {}
                }
                woa_33 = woa_3;
                woa_33.J((String)c3);
            }
            return vRa.d != 0;
        }
        if (EC.J((int)a2)) {
            Woa_3 woa_34 = woa_3;
            EC.C((String)woa_34.J());
            if (woa_34.M) {
                woa_3.J(Mqa.y);
            }
            return vRa.d != 0;
        }
        switch (a2) {
            case 14: {
                boolean bl = EC.C();
                while (false) {
                }
                if (bl) {
                    if (woa_3.M) {
                        woa_3.l(pua.o);
                    }
                } else if (woa_3.M) {
                    woa_3.i(pua.o);
                }
                return vRa.d != 0;
            }
            case 199: {
                Woa_3 woa_35 = woa_3;
                if (EC.l()) {
                    woa_35.d(uSa.E);
                } else {
                    woa_35.f();
                }
                return vRa.d != 0;
            }
            case 203: {
                if (EC.l()) {
                    Woa_3 woa_36 = woa_3;
                    if (EC.C()) {
                        Woa_3 woa_37 = woa_3;
                        woa_36.d(woa_37.J(pua.o, woa_37.C()));
                    } else {
                        woa_36.d(woa_3.C() - vRa.d);
                    }
                } else {
                    Woa_3 woa_38 = woa_3;
                    if (EC.C()) {
                        woa_38.f(woa_3.J(pua.o));
                    } else {
                        woa_38.J(pua.o);
                    }
                }
                return vRa.d != 0;
            }
            case 205: {
                if (EC.l()) {
                    Woa_3 woa_39 = woa_3;
                    if (EC.C()) {
                        Woa_3 woa_310 = woa_3;
                        woa_39.d(woa_310.J(vRa.d, woa_310.C()));
                    } else {
                        woa_39.d(woa_3.C() + vRa.d);
                    }
                } else {
                    Woa_3 woa_311 = woa_3;
                    if (EC.C()) {
                        woa_311.f(woa_3.J(vRa.d));
                    } else {
                        woa_311.J(vRa.d);
                    }
                }
                return vRa.d != 0;
            }
            case 207: {
                Woa_3 woa_312 = woa_3;
                if (EC.l()) {
                    woa_312.d(woa_3.k.length());
                } else {
                    woa_312.l();
                }
                return vRa.d != 0;
            }
            case 211: {
                if (EC.C()) {
                    if (woa_3.M) {
                        woa_3.l(vRa.d);
                    }
                } else if (woa_3.M) {
                    woa_3.i(vRa.d);
                }
                return vRa.d != 0;
            }
        }
        if (cX.J((char)b2)) {
            if (woa_3.M) {
                if (Sf.J((char)b2) && !Sf.k && !Sf.J().contains((char)b2 + Mqa.y)) {
                    return uSa.E != 0;
                }
                woa_3.J(Character.toString((char)b2));
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        Woa_3 a2 = this;
        if (b2 && !a2.C) {
            a2.l = uSa.E;
        }
        a2.C = b2;
    }

    public int J(int n2) {
        Woa_3 a2;
        int b2 = n2;
        Woa_3 woa_3 = a2 = this;
        return woa_3.J(b2, woa_3.f());
    }

    public int l() {
        Woa_3 a2;
        return a2.A;
    }

    public String f() {
        Woa_3 a2;
        return a2.k;
    }

    public void J(Predicate<String> predicate) {
        Object b2 = predicate;
        Woa_3 a2 = this;
        a2.I = b2;
    }

    public void J(Gc gc2) {
        Woa_3 b2 = gc2;
        Woa_3 a2 = this;
        a2.i = b2;
    }

    public void C(int n2) {
        int b2 = n2;
        Woa_3 a2 = this;
        a2.g = b2;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        Woa_3 a2 = this;
        a2.E = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, int n3, int n4, int n5) {
        void a2;
        void c2;
        int b2;
        int e2 = n2;
        Woa_3 d2 = this;
        if (e2 < b2) {
            int n6 = e2;
            e2 = b2;
            b2 = n6;
        }
        if (c2 < a2) {
            void v1 = c2;
            c2 = a2;
            a2 = v1;
        }
        Woa_3 woa_3 = d2;
        if (b2 > woa_3.L + woa_3.m) {
            Woa_3 woa_32 = d2;
            b2 = woa_32.L + woa_32.m;
        }
        Woa_3 woa_33 = d2;
        if (e2 > woa_33.L + woa_33.m) {
            Woa_3 woa_34 = d2;
            e2 = woa_34.L + woa_34.m;
        }
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        uKa.f((float)JPa.N, (float)JPa.N, (float)NQa.Y, (float)NQa.Y);
        uKa.z();
        uKa.A();
        uKa.f((int)WOa.i);
        aKa aKa3 = aKa2;
        int n7 = b2;
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.M);
        aKa4.J((double)e2, (double)a2, aSa.V).M();
        aKa2.J((double)n7, (double)a2, aSa.V).M();
        aKa3.J((double)n7, (double)c2, aSa.V).M();
        aKa3.J((double)e2, (double)c2, aSa.V).M();
        pKa2.J();
        uKa.F();
        uKa.H();
    }

    public int f() {
        Woa_3 a2;
        return a2.d;
    }

    public void l(int n2) {
        int b2 = n2;
        Woa_3 a2 = this;
        if (a2.k.length() != 0) {
            Woa_3 woa_3 = a2;
            if (woa_3.f != woa_3.d) {
                a2.J(Mqa.y);
                return;
            }
            Woa_3 woa_32 = a2;
            woa_32.i(woa_32.J(b2) - a2.d);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Woa_3(int n2, Kna kna2, int n3, int n4, int n5, int n6) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        Woa_3 a2;
        int n7 = n6;
        Woa_3 woa_3 = a2 = this;
        Woa_3 woa_32 = a2;
        Woa_3 woa_33 = a2;
        a2.k = Mqa.y;
        a2.F = fPa.i;
        a2.j = vRa.d;
        a2.G = vRa.d;
        a2.M = vRa.d;
        a2.g = pQa.P;
        a2.a = Qsa.b;
        a2.E = vRa.d;
        a2.I = Predicates.alwaysTrue();
        woa_33.A = f2;
        woa_33.J = e2;
        woa_32.L = d2;
        woa_32.D = c2;
        woa_3.m = b2;
        woa_3.b = g2;
    }

    public void f(String string) {
        String b2 = string;
        Woa_3 a2 = this;
        if (a2.I.apply(b2)) {
            Woa_3 woa_3;
            if (b2.length() > a2.F) {
                Woa_3 woa_32 = a2;
                woa_3 = woa_32;
                woa_32.k = b2.substring(uSa.E, woa_32.F);
            } else {
                woa_3 = a2;
                a2.k = b2;
            }
            woa_3.l();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void J(int var1_2, int var2_4, int var3_6) {
        d = var1_2;
        c = this;
        if (d < c.L) ** GOTO lbl-1000
        v0 = c;
        if (d >= v0.L + v0.m || b < c.D) ** GOTO lbl-1000
        v1 = c;
        if (b < v1.D + v1.b) {
            v2 = vRa.d;
        } else lbl-1000:
        // 3 sources

        {
            v2 = var4_7 = uSa.E;
        }
        if (c.G) {
            c.l((boolean)var4_7);
        }
        if (c.C && var4_7 != 0 && a == false) {
            d -= c.L;
            if (c.j) {
                d -= 4;
            }
            v3 = c;
            v4 = c;
            b = v3.J.J(v3.k.substring(v4.e), c.J());
            v3.f(v4.J.J(b, d).length() + c.e);
        }
    }

    public void J(String string) {
        Woa_3 woa_3;
        String a2;
        Woa_3 woa_32 = this;
        Object b2 = Mqa.y;
        a2 = cX.J((String)a2);
        Woa_3 woa_33 = woa_32;
        int n2 = woa_33.d < woa_33.f ? woa_32.d : woa_32.f;
        Woa_3 woa_34 = woa_32;
        int n3 = woa_34.d < woa_34.f ? woa_32.f : woa_32.d;
        Woa_3 woa_35 = woa_32;
        int n4 = woa_32.F - woa_35.k.length() - (n2 - n3);
        int n5 = uSa.E;
        if (woa_35.k.length() > 0) {
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(woa_32.k.substring(uSa.E, n2)).toString();
        }
        if (n4 < a2.length()) {
            b2 = new StringBuilder().insert(3 ^ 3, (String)b2).append(a2.substring(uSa.E, n4)).toString();
            n5 = n4;
            woa_3 = woa_32;
        } else {
            b2 = new StringBuilder().insert(3 & 4, (String)b2).append(a2).toString();
            woa_3 = woa_32;
            n5 = a2.length();
        }
        if (woa_3.k.length() > 0 && n3 < woa_32.k.length()) {
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(woa_32.k.substring(n3)).toString();
        }
        if (woa_32.I.apply((String)b2)) {
            Woa_3 woa_36 = woa_32;
            woa_36.k = b2;
            woa_36.J(n2 - woa_32.f + n5);
            if (woa_36.i != null) {
                Woa_3 woa_37 = woa_32;
                woa_37.i.J(woa_37.A, woa_32.k);
            }
        }
    }

    public void f(int n2) {
        Woa_3 a2;
        int b2 = n2;
        Woa_3 woa_3 = a2 = this;
        woa_3.d = b2;
        b2 = woa_3.k.length();
        woa_3.d = Oz.f((int)woa_3.d, (int)uSa.E, (int)b2);
        woa_3.d(woa_3.d);
    }

    public void l() {
        Woa_3 a2;
        Woa_3 woa_3 = a2;
        woa_3.f(woa_3.k.length());
    }

    public void f() {
        Woa_3 a2;
        a2.f(uSa.E);
    }

    public boolean l() {
        Woa_3 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3, boolean bl) {
        int n4;
        int c2;
        int d2 = n3;
        Woa_3 b2 = this;
        int n5 = c2 < 0 ? vRa.d : uSa.E;
        c2 = Math.abs(c2);
        int n6 = n4 = uSa.E;
        while (n6 < c2) {
            void a2;
            if (n5 == 0) {
                Woa_3 woa_3 = b2;
                int n7 = woa_3.k.length();
                if ((d2 = woa_3.k.indexOf(fPa.i, d2)) == pua.o) {
                    d2 = n7;
                } else {
                    void v2 = a2;
                    while (v2 != false && d2 < n7 && b2.k.charAt(d2) == fPa.i) {
                        v2 = a2;
                        ++d2;
                    }
                }
            } else {
                void v3 = a2;
                while (v3 != false && d2 > 0 && b2.k.charAt(d2 - vRa.d) == fPa.i) {
                    v3 = a2;
                    --d2;
                }
                int n8 = d2;
                while (n8 > 0 && b2.k.charAt(d2 - vRa.d) != fPa.i) {
                    n8 = --d2;
                }
            }
            n6 = ++n4;
        }
        return d2;
    }

    public boolean f() {
        Woa_3 a2;
        return a2.C;
    }

    public void J(int n2) {
        Woa_3 a2;
        int b2 = n2;
        Woa_3 woa_3 = a2 = this;
        woa_3.f(woa_3.f + b2);
    }

    public int J() {
        Woa_3 a2;
        if (a2.l()) {
            return a2.m - Yqa.i;
        }
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Woa_3 a2 = this;
        return a2.J((int)b2, c2, vRa.d != 0);
    }

    public boolean J() {
        Woa_3 a2;
        return a2.E;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Woa_3 a2 = this;
        a2.j = b2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void J() {
        block10: {
            var1_1 /* !! */  = this;
            if (!var1_1 /* !! */ .J()) break block10;
            if (var1_1 /* !! */ .l()) {
                v0 = var1_1 /* !! */ ;
                v1 = var1_1 /* !! */ ;
                Woa_3.J((int)(var1_1 /* !! */ .L - vRa.d), (int)(var1_1 /* !! */ .D - vRa.d), (int)(v0.L + var1_1 /* !! */ .m + vRa.d), (int)(v1.D + v1.b + vRa.d), (int)gsa.Ga);
                v2 = var1_1 /* !! */ ;
                v3 = var1_1 /* !! */ ;
                Woa_3.J((int)v0.L, (int)v2.D, (int)(v2.L + var1_1 /* !! */ .m), (int)(v3.D + v3.b), (int)gsa.X);
            }
            var4_2 = var1_1 /* !! */ .M != false ? var1_1 /* !! */ .g : var1_1 /* !! */ .a;
            v4 = var1_1 /* !! */ ;
            v5 = var1_1 /* !! */ ;
            var2_3 = v4.d - v5.e;
            var8_4 = v4.f - var1_1 /* !! */ .e;
            v6 = var1_1 /* !! */ ;
            a = v5.J.J(v6.k.substring(v6.e), var1_1 /* !! */ .J());
            var5_5 = var2_3 >= 0 && var2_3 <= a.length() ? vRa.d : uSa.E;
            var6_6 = var1_1 /* !! */ .C != false && var1_1 /* !! */ .l / uua.p % uqa.g == 0 && var5_5 != 0 ? vRa.d : uSa.E;
            v7 = var1_1 /* !! */ ;
            var7_7 = var1_1 /* !! */ .j != false ? v7.L + AQa.P : v7.L;
            v8 = var1_1 /* !! */ ;
            var3_8 = var1_1 /* !! */ .j != false ? v8.D + (var1_1 /* !! */ .b - Yqa.i) / uqa.g : v8.D;
            var9_9 = var7_7;
            if (var8_4 > a.length()) {
                var8_4 = a.length();
            }
            if (a.length() > 0) {
                var10_10 = var5_5 != 0 ? a.substring(uSa.E, var2_3) : a;
                var9_9 = var1_1 /* !! */ .J.J(var10_10, (float)var7_7, (float)var3_8, var4_2);
            }
            v9 = var1_1 /* !! */ ;
            var10_11 = v9.d < v9.k.length() || var1_1 /* !! */ .k.length() >= var1_1 /* !! */ .d() ? vRa.d : uSa.E;
            var11_12 = var9_9;
            if (var5_5 == 0) {
                var11_12 = var2_3 > 0 ? var7_7 + var1_1 /* !! */ .m : var7_7;
                v10 = a;
            } else {
                if (var10_11 != 0) {
                    var11_12 = var9_9-- - vRa.d;
                }
                v10 = a;
            }
            if (v10.length() > 0 && var5_5 != 0 && var2_3 < a.length()) {
                var9_9 = var1_1 /* !! */ .J.J(a.substring(var2_3), (float)var9_9, (float)var3_8, var4_2);
            }
            if (var6_6 == 0) ** GOTO lbl49
            if (var10_11 != 0) {
                v11 = var11_12;
                KA.J((int)v11, (int)(var3_8 - vRa.d), (int)(v11 + vRa.d), (int)(var3_8 + vRa.d + var1_1 /* !! */ .J.u), (int)QTa.Ia);
                v12 = var8_4;
            } else {
                var1_1 /* !! */ .J.J(IPa.W, (float)var11_12, (float)var3_8, var4_2);
lbl49:
                // 2 sources

                v12 = var8_4;
            }
            if (v12 != var2_3) {
                var4_2 = var7_7 + var1_1 /* !! */ .J.J(a.substring(uSa.E, var8_4));
                var1_1 /* !! */ .C(var11_12, var3_8 - vRa.d, var4_2 - vRa.d, var3_8 + vRa.d + var1_1 /* !! */ .J.u);
            }
        }
    }

    public String J() {
        Woa_3 woa_3;
        Woa_3 woa_32 = woa_3 = this;
        int n2 = woa_32.d < woa_32.f ? woa_3.d : woa_3.f;
        Woa_3 woa_33 = woa_3;
        int a2 = woa_33.d < woa_33.f ? woa_3.f : woa_3.d;
        return woa_3.k.substring(n2, a2);
    }
}

